/**
 */
package fr.se301b.taskset;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.se301b.taskset.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link fr.se301b.taskset.NamedElement#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 *
 * @see fr.se301b.taskset.TasksetPackage#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.se301b.taskset.TasksetPackage#getNamedElement_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see fr.se301b.taskset.TasksetPackage#getNamedElement_QualifiedName()
	 * @model id="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated NOT
	 */
	String getQualifiedName();

} // NamedElement
