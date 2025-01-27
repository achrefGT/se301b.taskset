/**
 */
package fr.se301b.taskset;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.se301b.taskset.Port#getDirection <em>Direction</em>}</li>
 *   <li>{@link fr.se301b.taskset.Port#getDataType <em>Data Type</em>}</li>
 *   <li>{@link fr.se301b.taskset.Port#getTask <em>Task</em>}</li>
 *   <li>{@link fr.se301b.taskset.Port#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @see fr.se301b.taskset.TasksetPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.se301b.taskset.PortDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see fr.se301b.taskset.PortDirection
	 * @see #setDirection(PortDirection)
	 * @see fr.se301b.taskset.TasksetPackage#getPort_Direction()
	 * @model unique="false"
	 * @generated
	 */
	PortDirection getDirection();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.Port#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see fr.se301b.taskset.PortDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(PortDirection value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.se301b.taskset.PredefinedDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see fr.se301b.taskset.PredefinedDataType
	 * @see #setDataType(PredefinedDataType)
	 * @see fr.se301b.taskset.TasksetPackage#getPort_DataType()
	 * @model unique="false"
	 * @generated
	 */
	PredefinedDataType getDataType();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.Port#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see fr.se301b.taskset.PredefinedDataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(PredefinedDataType value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see fr.se301b.taskset.TasksetPackage#getPort_Task()
	 * @model required="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.Port#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' reference.
	 * @see #setConnection(Connection)
	 * @see fr.se301b.taskset.TasksetPackage#getPort_Connection()
	 * @model
	 * @generated
	 */
	Connection getConnection();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.Port#getConnection <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(Connection value);

	/**
	 * @generated NOT
	 */
	String getQualifiedName();

} // Port
