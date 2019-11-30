/**
 */
package asaproject.model.asa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaproject.model.asa.Connector#getGlue <em>Glue</em>}</li>
 *   <li>{@link asaproject.model.asa.Connector#getIconnectors <em>Iconnectors</em>}</li>
 * </ul>
 *
 * @see asaproject.model.asa.AsaPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends ArchitecturalElement {
	/**
	 * Returns the value of the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Glue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Glue</em>' containment reference.
	 * @see #setGlue(Glue)
	 * @see asaproject.model.asa.AsaPackage#getConnector_Glue()
	 * @model containment="true"
	 * @generated
	 */
	Glue getGlue();

	/**
	 * Sets the value of the '{@link asaproject.model.asa.Connector#getGlue <em>Glue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glue</em>' containment reference.
	 * @see #getGlue()
	 * @generated
	 */
	void setGlue(Glue value);

	/**
	 * Returns the value of the '<em><b>Iconnectors</b></em>' containment reference list.
	 * The list contents are of type {@link asaproject.model.asa.IConnector}.
	 * It is bidirectional and its opposite is '{@link asaproject.model.asa.IConnector#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iconnectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iconnectors</em>' containment reference list.
	 * @see asaproject.model.asa.AsaPackage#getConnector_Iconnectors()
	 * @see asaproject.model.asa.IConnector#getConnector
	 * @model opposite="connector" containment="true"
	 * @generated
	 */
	EList<IConnector> getIconnectors();

} // Connector
