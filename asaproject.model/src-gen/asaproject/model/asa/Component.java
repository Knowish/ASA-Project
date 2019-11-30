/**
 */
package asaproject.model.asa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaproject.model.asa.Component#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link asaproject.model.asa.Component#getIcomponents <em>Icomponents</em>}</li>
 * </ul>
 *
 * @see asaproject.model.asa.AsaPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends ArchitecturalElement {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(Configuration)
	 * @see asaproject.model.asa.AsaPackage#getComponent_Configuration()
	 * @model
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link asaproject.model.asa.Component#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Icomponents</b></em>' containment reference list.
	 * The list contents are of type {@link asaproject.model.asa.IComponent}.
	 * It is bidirectional and its opposite is '{@link asaproject.model.asa.IComponent#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icomponents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icomponents</em>' containment reference list.
	 * @see asaproject.model.asa.AsaPackage#getComponent_Icomponents()
	 * @see asaproject.model.asa.IComponent#getComponent
	 * @model opposite="component" containment="true"
	 * @generated
	 */
	EList<IComponent> getIcomponents();

} // Component
