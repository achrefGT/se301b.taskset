/**
 */
package fr.se301b.taskset;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.se301b.taskset.Connection#getQueueMaxSize <em>Queue Max Size</em>}</li>
 *   <li>{@link fr.se301b.taskset.Connection#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link fr.se301b.taskset.Connection#getOutputPort <em>Output Port</em>}</li>
 * </ul>
 *
 * @see fr.se301b.taskset.TasksetPackage#getConnection()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sameDataType positifQueueMaxSize portTypes'"
 * @generated
 */
public interface Connection extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Queue Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Max Size</em>' attribute.
	 * @see #setQueueMaxSize(int)
	 * @see fr.se301b.taskset.TasksetPackage#getConnection_QueueMaxSize()
	 * @model unique="false"
	 * @generated
	 */
	int getQueueMaxSize();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.Connection#getQueueMaxSize <em>Queue Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Max Size</em>' attribute.
	 * @see #getQueueMaxSize()
	 * @generated
	 */
	void setQueueMaxSize(int value);

	/**
	 * Returns the value of the '<em><b>Input Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Port</em>' reference.
	 * @see #setInputPort(Port)
	 * @see fr.se301b.taskset.TasksetPackage#getConnection_InputPort()
	 * @model required="true"
	 * @generated
	 */
	Port getInputPort();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.Connection#getInputPort <em>Input Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Port</em>' reference.
	 * @see #getInputPort()
	 * @generated
	 */
	void setInputPort(Port value);

	/**
	 * Returns the value of the '<em><b>Output Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Port</em>' reference.
	 * @see #setOutputPort(Port)
	 * @see fr.se301b.taskset.TasksetPackage#getConnection_OutputPort()
	 * @model required="true"
	 * @generated
	 */
	Port getOutputPort();

	/**
	 * Sets the value of the '{@link fr.se301b.taskset.Connection#getOutputPort <em>Output Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Port</em>' reference.
	 * @see #getOutputPort()
	 * @generated
	 */
	void setOutputPort(Port value);

	/**
	 * @generated NOT
	 */
	String getQualifiedName();

} // Connection
