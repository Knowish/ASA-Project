/**
 */
package asaproject.model.asa.impl;

import asaproject.model.asa.AsaPackage;
import asaproject.model.asa.Connector;
import asaproject.model.asa.Glue;
import asaproject.model.asa.IConnector;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asaproject.model.asa.impl.ConnectorImpl#getGlue <em>Glue</em>}</li>
 *   <li>{@link asaproject.model.asa.impl.ConnectorImpl#getIconnectors <em>Iconnectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends ArchitecturalElementImpl implements Connector {
	/**
	 * The cached value of the '{@link #getGlue() <em>Glue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlue()
	 * @generated
	 * @ordered
	 */
	protected Glue glue;

	/**
	 * The cached value of the '{@link #getIconnectors() <em>Iconnectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<IConnector> iconnectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AsaPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue getGlue() {
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlue(Glue newGlue, NotificationChain msgs) {
		Glue oldGlue = glue;
		glue = newGlue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsaPackage.CONNECTOR__GLUE,
					oldGlue, newGlue);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlue(Glue newGlue) {
		if (newGlue != glue) {
			NotificationChain msgs = null;
			if (glue != null)
				msgs = ((InternalEObject) glue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AsaPackage.CONNECTOR__GLUE, null, msgs);
			if (newGlue != null)
				msgs = ((InternalEObject) newGlue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AsaPackage.CONNECTOR__GLUE, null, msgs);
			msgs = basicSetGlue(newGlue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsaPackage.CONNECTOR__GLUE, newGlue, newGlue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IConnector> getIconnectors() {
		if (iconnectors == null) {
			iconnectors = new EObjectContainmentWithInverseEList<IConnector>(IConnector.class, this,
					AsaPackage.CONNECTOR__ICONNECTORS, AsaPackage.ICONNECTOR__CONNECTOR);
		}
		return iconnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AsaPackage.CONNECTOR__ICONNECTORS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIconnectors()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AsaPackage.CONNECTOR__GLUE:
			return basicSetGlue(null, msgs);
		case AsaPackage.CONNECTOR__ICONNECTORS:
			return ((InternalEList<?>) getIconnectors()).basicRemove(otherEnd, msgs);
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
		case AsaPackage.CONNECTOR__GLUE:
			return getGlue();
		case AsaPackage.CONNECTOR__ICONNECTORS:
			return getIconnectors();
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
		case AsaPackage.CONNECTOR__GLUE:
			setGlue((Glue) newValue);
			return;
		case AsaPackage.CONNECTOR__ICONNECTORS:
			getIconnectors().clear();
			getIconnectors().addAll((Collection<? extends IConnector>) newValue);
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
		case AsaPackage.CONNECTOR__GLUE:
			setGlue((Glue) null);
			return;
		case AsaPackage.CONNECTOR__ICONNECTORS:
			getIconnectors().clear();
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
		case AsaPackage.CONNECTOR__GLUE:
			return glue != null;
		case AsaPackage.CONNECTOR__ICONNECTORS:
			return iconnectors != null && !iconnectors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
