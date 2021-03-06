/**
 */
package org.ros.model.urdf.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ros.model.urdf.Color;
import org.ros.model.urdf.Material;
import org.ros.model.urdf.MaterialGlobal;
import org.ros.model.urdf.Texture;
import org.ros.model.urdf.UrdfPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ros.model.urdf.impl.MaterialImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.MaterialImpl#getTexture <em>Texture</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.MaterialImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ros.model.urdf.impl.MaterialImpl#getMaterialRef <em>Material Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialImpl extends MinimalEObjectImpl.Container implements Material {
	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color;

	/**
	 * The cached value of the '{@link #getTexture() <em>Texture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexture()
	 * @generated
	 * @ordered
	 */
	protected Texture texture;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMaterialRef() <em>Material Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialRef()
	 * @generated
	 * @ordered
	 */
	protected MaterialGlobal materialRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UrdfPackage.Literals.MATERIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColor(Color newColor, NotificationChain msgs) {
		Color oldColor = color;
		color = newColor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.MATERIAL__COLOR, oldColor, newColor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		if (newColor != color) {
			NotificationChain msgs = null;
			if (color != null)
				msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.MATERIAL__COLOR, null, msgs);
			if (newColor != null)
				msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.MATERIAL__COLOR, null, msgs);
			msgs = basicSetColor(newColor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.MATERIAL__COLOR, newColor, newColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Texture getTexture() {
		return texture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTexture(Texture newTexture, NotificationChain msgs) {
		Texture oldTexture = texture;
		texture = newTexture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UrdfPackage.MATERIAL__TEXTURE, oldTexture, newTexture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexture(Texture newTexture) {
		if (newTexture != texture) {
			NotificationChain msgs = null;
			if (texture != null)
				msgs = ((InternalEObject)texture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.MATERIAL__TEXTURE, null, msgs);
			if (newTexture != null)
				msgs = ((InternalEObject)newTexture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UrdfPackage.MATERIAL__TEXTURE, null, msgs);
			msgs = basicSetTexture(newTexture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.MATERIAL__TEXTURE, newTexture, newTexture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.MATERIAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialGlobal getMaterialRef() {
		if (materialRef != null && materialRef.eIsProxy()) {
			InternalEObject oldMaterialRef = (InternalEObject)materialRef;
			materialRef = (MaterialGlobal)eResolveProxy(oldMaterialRef);
			if (materialRef != oldMaterialRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UrdfPackage.MATERIAL__MATERIAL_REF, oldMaterialRef, materialRef));
			}
		}
		return materialRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialGlobal basicGetMaterialRef() {
		return materialRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterialRef(MaterialGlobal newMaterialRef) {
		MaterialGlobal oldMaterialRef = materialRef;
		materialRef = newMaterialRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UrdfPackage.MATERIAL__MATERIAL_REF, oldMaterialRef, materialRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UrdfPackage.MATERIAL__COLOR:
				return basicSetColor(null, msgs);
			case UrdfPackage.MATERIAL__TEXTURE:
				return basicSetTexture(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UrdfPackage.MATERIAL__COLOR:
				return getColor();
			case UrdfPackage.MATERIAL__TEXTURE:
				return getTexture();
			case UrdfPackage.MATERIAL__NAME:
				return getName();
			case UrdfPackage.MATERIAL__MATERIAL_REF:
				if (resolve) return getMaterialRef();
				return basicGetMaterialRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UrdfPackage.MATERIAL__COLOR:
				setColor((Color)newValue);
				return;
			case UrdfPackage.MATERIAL__TEXTURE:
				setTexture((Texture)newValue);
				return;
			case UrdfPackage.MATERIAL__NAME:
				setName((String)newValue);
				return;
			case UrdfPackage.MATERIAL__MATERIAL_REF:
				setMaterialRef((MaterialGlobal)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UrdfPackage.MATERIAL__COLOR:
				setColor((Color)null);
				return;
			case UrdfPackage.MATERIAL__TEXTURE:
				setTexture((Texture)null);
				return;
			case UrdfPackage.MATERIAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UrdfPackage.MATERIAL__MATERIAL_REF:
				setMaterialRef((MaterialGlobal)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UrdfPackage.MATERIAL__COLOR:
				return color != null;
			case UrdfPackage.MATERIAL__TEXTURE:
				return texture != null;
			case UrdfPackage.MATERIAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UrdfPackage.MATERIAL__MATERIAL_REF:
				return materialRef != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MaterialImpl
