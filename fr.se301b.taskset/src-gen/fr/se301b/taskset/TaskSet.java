/**
 */
package fr.se301b.taskset;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.se301b.taskset.TaskSet#getPolicy <em>Policy</em>}</li>
 *   <li>{@link fr.se301b.taskset.TaskSet#getTasks <em>Tasks</em>}</li>
 *   <li>{@link fr.se301b.taskset.TaskSet#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @see fr.se301b.taskset.TasksetPackage#getTaskSet()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='singleRootTaskSet'"
 * @generated
 */
public interface TaskSet extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.se301b.taskset.SchedulingPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' attribute.
	 * @see fr.se301b.taskset.SchedulingPolicy
	 * @see #setPolicy(SchedulingPolicy)
	 * @see fr.se301b.taskset.TasksetPackage#getTaskSet_Policy()
	 * @model unique="false"
	 * @generated
	 */
	SchedulingPolicy getPolicy();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.TaskSet#getPolicy <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' attribute.
	 * @see fr.se301b.taskset.SchedulingPolicy
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(SchedulingPolicy value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link fr.se301b.taskset.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see fr.se301b.taskset.TasksetPackage#getTaskSet_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference list.
	 * The list contents are of type {@link fr.se301b.taskset.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference list.
	 * @see fr.se301b.taskset.TasksetPackage#getTaskSet_Connection()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnection();

} // TaskSet
