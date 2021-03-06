///<reference types='@typefox/monaco-editor-core/monaco'/>
import { injectable, inject } from 'inversify';
import { Workspace, Languages, LanguageClientFactory, BaseLanguageClientContribution } from '@theia/languages/lib/browser';

@injectable()
export class DslClientContribution extends BaseLanguageClientContribution {

    readonly id = "urdf";
    readonly name = "URDF";

    constructor(
        @inject(Workspace) protected readonly workspace: Workspace,
        @inject(Languages) protected readonly languages: Languages,
        @inject(LanguageClientFactory) protected readonly languageClientFactory: LanguageClientFactory
    ) {
        super(workspace, languages, languageClientFactory);
    }

    protected get globPatterns() {
        return [
            '**/*.urdf'
        ];
    }
}

// register language with monaco on first load
registerDSL();

export function registerDSL() {

    monaco.languages.register({
        id: 'urdf',
        aliases: ['URDF', 'urdfl'],
        extensions: ['.urdf'],
        mimetypes: ['text/dsl']
    })
       
    monaco.languages.setMonarchTokensProvider('urdf', <any>{        
        keywords: [
            'xyz','rpy','lower-limit',"upper-limit",' axis-xyz','file-name','material','parent-name','child-name','scale-xyz','length',
            'width','height','radius','rgba','version'
        ],

        typeKeywords: [
            'robot', 'materials', 'joints','links','link','color','texture','box','cylinder','sphere','mesh','revolute','fixed','prismatic'
        ],

        operators: [
            '='
        ],

        symbols:  /[=><!~?:&|+\-*\/\^%]+/,
        escapes: /\\(?:[abfnrtv\\"']|x[0-9A-Fa-f]{1,4}|u[0-9A-Fa-f]{4}|U[0-9A-Fa-f]{8})/,

        tokenizer: {
            root: [
            // identifiers and keywords
            [/[a-z_$][\-\w$]*/, { cases: { '@typeKeywords': 'keyword',
                                        '@keywords': 'keyword',
                                        '@default': 'type.identifier' } }],            

            // whitespace
            { include: '@whitespace' },

            // delimiters and operators
            [/[{}()\[\]]/, '@brackets'],
            [/[<>](?!@symbols)/, '@brackets'],
            [/@symbols/, { cases: { '@operators': 'operator',
                                    '@default'  : '' } } ],


            // numbers
            [/\d*\.\d+([eE][\-+]?\d+)?/, 'number.float'],
            [/0[xX][0-9a-fA-F]+/, 'number.hex'],
            [/\d+/, 'number'],

            // delimiter: after number because of .\d floats
            [/[;,.]/, 'delimiter'],

            // strings
            [/"([^"\\]|\\.)*$/, 'string.invalid' ],  // non-teminated string
            [/"/,  { token: 'string.quote', bracket: '@open', next: '@string' } ],

            // characters
            [/'[^\\']'/, 'string'],
            [/(')(@escapes)(')/, ['string','string.escape','string']],
            [/'/, 'string.invalid']
            ],

            comment: [
            [/[^\/*]+/, 'comment' ],
            [/\/\*/,    'comment', '@push' ],    // nested comment
            ["\\*/",    'comment', '@pop'  ],
            [/[\/*]/,   'comment' ]
            ],

            string: [
            [/[^\\"]+/,  'string'],
            [/@escapes/, 'string.escape'],
            [/\\./,      'string.escape.invalid'],
            [/"/,        { token: 'string.quote', bracket: '@close', next: '@pop' } ]
            ],

            whitespace: [
            [/[ \t\r\n]+/, 'white'],
            [/\/\*/,       'comment', '@comment' ],
            [/\/\/.*$/,    'comment'],
            ],
        },        
    })
   
    monaco.languages.setLanguageConfiguration('urdf', {
        comments: {
            lineComment: "//",
            blockComment: ['/*', '*/']
        },
        brackets: [['{', '}'], ['(', ')']],
        autoClosingPairs: [
            {
                open: '{',
                close: '}'
            },
            {
                open: '(',
                close: ')'
            }]
    })
    
}