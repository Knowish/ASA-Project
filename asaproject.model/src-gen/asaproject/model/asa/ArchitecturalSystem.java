/**
 */
package asaproject.model.asa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architectural System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaproject.model.asa.ArchitecturalSystem#getArchitecturalElements <em>Architectural Elements</em>}</li>
 * </ul>
 *
 * @see asaproject.model.asa.AsaPackage#getArchitecturalSystem()
 * @model
 * @generated
 */
public interface ArchitecturalSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Architectural Elements</b></em>' containment reference list.
	 * The list contents are of type {@link asaproject.model.asa.ArchitecturalElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architectural Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architectural Elements</em>' containment reference list.
	 * @see asaproject.model.asa.AsaPackage#getArchitecturalSystem_ArchitecturalElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArchitecturalElement> getArchitecturalElements();

} // ArchitecturalSystem
