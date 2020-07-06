/*
 * generated by Xtext 2.21.0
 */
package org.ros.urdf.generator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.ros.model.urdf.RobotType;
import org.ros.model.urdf.util.UrdfResourceFactoryImpl;

/**
 * Generates code from your model files on save.
 * 
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
public class DslGenerator extends AbstractGenerator {

	private final Resource.Factory factory= new UrdfResourceFactoryImpl();

	@Override
	public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {

		EcoreUtil2.getAllContents(resource, true).forEachRemaining(object -> {
			if (object instanceof RobotType) {
				writeRobotAsXML((RobotType) object, fsa);
			}
		});		

	}

	private void writeRobotAsXML(final RobotType robotType, final IFileSystemAccess2 fsa) {
		final Resource resource = factory.createResource(URI.createURI("dummy.xml"));

		final EObject clonedObject = EcoreUtil.copy(robotType);
		resource.getContents().add(clonedObject);

		try {
			final ByteArrayOutputStream out = new ByteArrayOutputStream();
			resource.save(out, null);
			fsa.generateFile(resolveFileName(robotType.eResource().getURI()), new ByteArrayInputStream(out.toByteArray()));
		} catch (final IOException e) {
			throw new IllegalStateException("could not generate model", e);
		}
	}

	private String resolveFileName(final URI uri) {
		return uri.lastSegment().replaceFirst("\\.urdf$", "\\.xml");
	}
}
