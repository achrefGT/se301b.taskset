/**
 */
package fr.se301b.taskset;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.se301b.taskset.Task#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.se301b.taskset.Task#getMinimumDelay <em>Minimum Delay</em>}</li>
 *   <li>{@link fr.se301b.taskset.Task#getPeriod <em>Period</em>}</li>
 *   <li>{@link fr.se301b.taskset.Task#getOwnedPorts <em>Owned Ports</em>}</li>
 *   <li>{@link fr.se301b.taskset.Task#getTaskset <em>Taskset</em>}</li>
 *   <li>{@link fr.se301b.taskset.Task#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @see fr.se301b.taskset.TasksetPackage#getTask()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueNames uniquePortNames positifPeriod positifMinimumDelay'"
 * @generated
 */
public interface Task extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.se301b.taskset.ThreadKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see fr.se301b.taskset.ThreadKind
	 * @see #setKind(ThreadKind)
	 * @see fr.se301b.taskset.TasksetPackage#getTask_Kind()
	 * @model unique="false"
	 * @generated
	 */
	ThreadKind getKind();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.Task#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see fr.se301b.taskset.ThreadKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ThreadKind value);

	/**
	 * Returns the value of the '<em><b>Minimum Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Delay</em>' attribute.
	 * @see #setMinimumDelay(int)
	 * @see fr.se301b.taskset.TasksetPackage#getTask_MinimumDelay()
	 * @model unique="false"
	 * @generated
	 */
	int getMinimumDelay();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.Task#getMinimumDelay <em>Minimum Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Delay</em>' attribute.
	 * @see #getMinimumDelay()
	 * @generated
	 */
	void setMinimumDelay(int value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(int)
	 * @see fr.se301b.taskset.TasksetPackage#getTask_Period()
	 * @model unique="false"
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.Task#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

	/**
	 * Returns the value of the '<em><b>Owned Ports</b></em>' containment reference list.
	 * The list contents are of type {@link fr.se301b.taskset.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Ports</em>' containment reference list.
	 * @see fr.se301b.taskset.TasksetPackage#getTask_OwnedPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getOwnedPorts();

	/**
	 * Returns the value of the '<em><b>Taskset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taskset</em>' reference.
	 * @see #setTaskset(TaskSet)
	 * @see fr.se301b.taskset.TasksetPackage#getTask_Taskset()
	 * @model required="true"
	 * @generated
	 */
	TaskSet getTaskset();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.Task#getTaskset <em>Taskset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taskset</em>' reference.
	 * @see #getTaskset()
	 * @generated
	 */
	void setTaskset(TaskSet value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' attribute.
	 * @see #setBehavior(String)
	 * @see fr.se301b.taskset.TasksetPackage#getTask_Behavior()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getBehavior();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.Task#getBehavior <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' attribute.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(String value);

} // Task
