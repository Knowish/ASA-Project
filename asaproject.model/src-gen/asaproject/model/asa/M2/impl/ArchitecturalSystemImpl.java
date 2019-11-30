/**
 */
package asaproject.model.asa.M2.impl;

import asaproject.model.asa.M2.ArchitecturalElement;
import asaproject.model.asa.M2.ArchitecturalSystem;
import asaproject.model.asa.M2.M2Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architectural System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaproject.model.asa.M2.impl.ArchitecturalSystemImpl#getArchitecturalElements <em>Architectural Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitecturalSystemImpl extends MinimalEObjectImpl.Container implements ArchitecturalSystem {
	/**
	 * The cached value of the '{@link #getArchitecturalElements() <em>Architectural Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecturalElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ArchitecturalElement> architecturalElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitecturalSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.ARCHITECTURAL_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchitecturalElement> getArchitecturalElements() {
		if (architecturalElements == null) {
			architecturalElements = new EObjectContainmentEList<ArchitecturalElement>(ArchitecturalElement.class, this,
					M2Package.ARCHITECTURAL_SYSTEM__ARCHITECTURAL_ELEMENTS);
		}
		return architecturalElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case M2Package.ARCHITECTURAL_SYSTEM__ARCHITECTURAL_ELEMENTS:
			return ((InternalEList<?>) getArchitecturalElements()).basicRemove(otherEnd, msgs);
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
		case M2Package.ARCHITECTURAL_SYSTEM__ARCHITECTURAL_ELEMENTS:
			return getArchitecturalElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case M2Package.ARCHITECTURAL_SYSTEM__ARCHITECTURAL_ELEMENTS:
			getArchitecturalElements().clear();
			getArchitecturalElements().addAll((Collection<? extends ArchitecturalElement>) newValue);
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
		case M2Package.ARCHITECTURAL_SYSTEM__ARCHITECTURAL_ELEMENTS:
			getArchitecturalElements().clear();
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
		case M2Package.ARCHITECTURAL_SYSTEM__ARCHITECTURAL_ELEMENTS:
			return architecturalElements != null && !architecturalElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArchitecturalSystemImpl
