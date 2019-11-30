/**
 */
package asaproject.model.asa.M2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IConnector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaproject.model.asa.M2.IConnector#getName <em>Name</em>}</li>
 *   <li>{@link asaproject.model.asa.M2.IConnector#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @see asaproject.model.asa.M2.M2Package#getIConnector()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see asaproject.model.asa.M2.M2Package#getIConnector_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link asaproject.model.asa.M2.IConnector#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link asaproject.model.asa.M2.Connector#getIconnectors <em>Iconnectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' container reference.
	 * @see #setConnector(Connector)
	 * @see asaproject.model.asa.M2.M2Package#getIConnector_Connector()
	 * @see asaproject.model.asa.M2.Connector#getIconnectors
	 * @model opposite="iconnectors" transient="false"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link asaproject.model.asa.M2.IConnector#getConnector <em>Connector</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' container reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

} // IConnector
