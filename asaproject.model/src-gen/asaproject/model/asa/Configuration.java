/**
 */
package asaproject.model.asa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaproject.model.asa.Configuration#getComponents <em>Components</em>}</li>
 *   <li>{@link asaproject.model.asa.Configuration#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link asaproject.model.asa.Configuration#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see asaproject.model.asa.AsaPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends ArchitecturalElement {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link asaproject.model.asa.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see asaproject.model.asa.AsaPackage#getConfiguration_Components()
	 * @model required="true"
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' reference list.
	 * The list contents are of type {@link asaproject.model.asa.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' reference list.
	 * @see asaproject.model.asa.AsaPackage#getConfiguration_Connectors()
	 * @model
	 * @generated
	 */
	EList<Connector> getConnectors();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link asaproject.model.asa.Port}.
	 * It is bidirectional and its opposite is '{@link asaproject.model.asa.Port#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see asaproject.model.asa.AsaPackage#getConfiguration_Ports()
	 * @see asaproject.model.asa.Port#getConfiguration
	 * @model opposite="configuration" containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

} // Configuration
