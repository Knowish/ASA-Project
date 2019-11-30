/**
 */
package asaproject.model.asa.M2;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaproject.model.asa.M2.Port#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @see asaproject.model.asa.M2.M2Package#getPort()
 * @model abstract="true"
 * @generated
 */
public interface Port extends IComponent {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link asaproject.model.asa.M2.Configuration#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' container reference.
	 * @see #setConfiguration(Configuration)
	 * @see asaproject.model.asa.M2.M2Package#getPort_Configuration()
	 * @see asaproject.model.asa.M2.Configuration#getPorts
	 * @model opposite="ports" transient="false"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link asaproject.model.asa.M2.Port#getConfiguration <em>Configuration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' container reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

} // Port
