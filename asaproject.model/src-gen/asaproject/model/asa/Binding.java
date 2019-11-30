/**
 */
package asaproject.model.asa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaproject.model.asa.Binding#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see asaproject.model.asa.AsaPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends Link {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link asaproject.model.asa.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see asaproject.model.asa.AsaPackage#getBinding_Ports()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Port> getPorts();

} // Binding
