/**
 */
package asaproject.model.asa.M2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architectural Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link asaproject.model.asa.M2.ArchitecturalElement#getProperties <em>Properties</em>}</li>
 *   <li>{@link asaproject.model.asa.M2.ArchitecturalElement#getElements <em>Elements</em>}</li>
 *   <li>{@link asaproject.model.asa.M2.ArchitecturalElement#getParent <em>Parent</em>}</li>
 *   <li>{@link asaproject.model.asa.M2.ArchitecturalElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see asaproject.model.asa.M2.M2Package#getArchitecturalElement()
 * @model abstract="true"
 * @generated
 */
public interface ArchitecturalElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link asaproject.model.asa.M2.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see asaproject.model.asa.M2.M2Package#getArchitecturalElement_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link asaproject.model.asa.M2.ArchitecturalElement}.
	 * It is bidirectional and its opposite is '{@link asaproject.model.asa.M2.ArchitecturalElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see asaproject.model.asa.M2.M2Package#getArchitecturalElement_Elements()
	 * @see asaproject.model.asa.M2.ArchitecturalElement#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ArchitecturalElement> getElements();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link asaproject.model.asa.M2.ArchitecturalElement#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ArchitecturalElement)
	 * @see asaproject.model.asa.M2.M2Package#getArchitecturalElement_Parent()
	 * @see asaproject.model.asa.M2.ArchitecturalElement#getElements
	 * @model opposite="elements" transient="false"
	 * @generated
	 */
	ArchitecturalElement getParent();

	/**
	 * Sets the value of the '{@link asaproject.model.asa.M2.ArchitecturalElement#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ArchitecturalElement value);

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
	 * @see asaproject.model.asa.M2.M2Package#getArchitecturalElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link asaproject.model.asa.M2.ArchitecturalElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ArchitecturalElement
