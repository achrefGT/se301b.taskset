/**
 */
package fr.se301b.taskset;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.se301b.taskset.TasksetFactory
 * @model kind="package"
 * @generated
 */
public interface TasksetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "taskset";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/taskset";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "taskset";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TasksetPackage eINSTANCE = fr.se301b.taskset.impl.TasksetPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.se301b.taskset.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.se301b.taskset.impl.NamedElementImpl
	 * @see fr.se301b.taskset.impl.TasksetPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__QUALIFIED_NAME = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.se301b.taskset.impl.TaskSetImpl <em>Task Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.se301b.taskset.impl.TaskSetImpl
	 * @see fr.se301b.taskset.impl.TasksetPackageImpl#getTaskSet()
	 * @generated
	 */
	int TASK_SET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET__QUALIFIED_NAME = NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET__POLICY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET__TASKS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET__CONNECTION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Task Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_SET_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.se301b.taskset.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.se301b.taskset.impl.TaskImpl
	 * @see fr.se301b.taskset.impl.TasksetPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__QUALIFIED_NAME = NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__KIND = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minimum Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__MINIMUM_DELAY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PERIOD = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OWNED_PORTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Taskset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TASKSET = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__BEHAVIOR = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.se301b.taskset.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.se301b.taskset.impl.PortImpl
	 * @see fr.se301b.taskset.impl.TasksetPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__QUALIFIED_NAME = NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DIRECTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DATA_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TASK = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CONNECTION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.se301b.taskset.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.se301b.taskset.impl.ConnectionImpl
	 * @see fr.se301b.taskset.impl.TasksetPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__QUALIFIED_NAME = NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Queue Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__QUEUE_MAX_SIZE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__INPUT_PORT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__OUTPUT_PORT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.se301b.taskset.PortDirection <em>Port Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.se301b.taskset.PortDirection
	 * @see fr.se301b.taskset.impl.TasksetPackageImpl#getPortDirection()
	 * @generated
	 */
	int PORT_DIRECTION = 5;

	/**
	 * The meta object id for the '{@link fr.se301b.taskset.ThreadKind <em>Thread Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.se301b.taskset.ThreadKind
	 * @see fr.se301b.taskset.impl.TasksetPackageImpl#getThreadKind()
	 * @generated
	 */
	int THREAD_KIND = 6;

	/**
	 * The meta object id for the '{@link fr.se301b.taskset.SchedulingPolicy <em>Scheduling Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.se301b.taskset.SchedulingPolicy
	 * @see fr.se301b.taskset.impl.TasksetPackageImpl#getSchedulingPolicy()
	 * @generated
	 */
	int SCHEDULING_POLICY = 7;

	/**
	 * The meta object id for the '{@link fr.se301b.taskset.PredefinedDataType <em>Predefined Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.se301b.taskset.PredefinedDataType
	 * @see fr.se301b.taskset.impl.TasksetPackageImpl#getPredefinedDataType()
	 * @generated
	 */
	int PREDEFINED_DATA_TYPE = 8;

	/**
	 * Returns the meta object for class '{@link fr.se301b.taskset.TaskSet <em>Task Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Set</em>'.
	 * @see fr.se301b.taskset.TaskSet
	 * @generated
	 */
	EClass getTaskSet();

	/**
	 * Returns the meta object for the attribute '{@link fr.se301b.taskset.TaskSet#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy</em>'.
	 * @see fr.se301b.taskset.TaskSet#getPolicy()
	 * @see #getTaskSet()
	 * @generated
	 */
	EAttribute getTaskSet_Policy();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.se301b.taskset.TaskSet#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see fr.se301b.taskset.TaskSet#getTasks()
	 * @see #getTaskSet()
	 * @generated
	 */
	EReference getTaskSet_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.se301b.taskset.TaskSet#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connection</em>'.
	 * @see fr.se301b.taskset.TaskSet#getConnection()
	 * @see #getTaskSet()
	 * @generated
	 */
	EReference getTaskSet_Connection();

	/**
	 * Returns the meta object for class '{@link fr.se301b.taskset.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see fr.se301b.taskset.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link fr.se301b.taskset.Task#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see fr.se301b.taskset.Task#getKind()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Kind();

	/**
	 * Returns the meta object for the attribute '{@link fr.se301b.taskset.Task#getMinimumDelay <em>Minimum Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Delay</em>'.
	 * @see fr.se301b.taskset.Task#getMinimumDelay()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_MinimumDelay();

	/**
	 * Returns the meta object for the attribute '{@link fr.se301b.taskset.Task#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see fr.se301b.taskset.Task#getPeriod()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Period();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.se301b.taskset.Task#getOwnedPorts <em>Owned Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Ports</em>'.
	 * @see fr.se301b.taskset.Task#getOwnedPorts()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_OwnedPorts();

	/**
	 * Returns the meta object for the reference '{@link fr.se301b.taskset.Task#getTaskset <em>Taskset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Taskset</em>'.
	 * @see fr.se301b.taskset.Task#getTaskset()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Taskset();

	/**
	 * Returns the meta object for the attribute '{@link fr.se301b.taskset.Task#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior</em>'.
	 * @see fr.se301b.taskset.Task#getBehavior()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Behavior();

	/**
	 * Returns the meta object for class '{@link fr.se301b.taskset.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see fr.se301b.taskset.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link fr.se301b.taskset.Port#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see fr.se301b.taskset.Port#getDirection()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Direction();

	/**
	 * Returns the meta object for the attribute '{@link fr.se301b.taskset.Port#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see fr.se301b.taskset.Port#getDataType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_DataType();

	/**
	 * Returns the meta object for the reference '{@link fr.se301b.taskset.Port#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see fr.se301b.taskset.Port#getTask()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Task();

	/**
	 * Returns the meta object for the reference '{@link fr.se301b.taskset.Port#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see fr.se301b.taskset.Port#getConnection()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Connection();

	/**
	 * Returns the meta object for class '{@link fr.se301b.taskset.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see fr.se301b.taskset.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link fr.se301b.taskset.Connection#getQueueMaxSize <em>Queue Max Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Max Size</em>'.
	 * @see fr.se301b.taskset.Connection#getQueueMaxSize()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_QueueMaxSize();

	/**
	 * Returns the meta object for the reference '{@link fr.se301b.taskset.Connection#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Port</em>'.
	 * @see fr.se301b.taskset.Connection#getInputPort()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_InputPort();

	/**
	 * Returns the meta object for the reference '{@link fr.se301b.taskset.Connection#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Port</em>'.
	 * @see fr.se301b.taskset.Connection#getOutputPort()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_OutputPort();

	/**
	 * Returns the meta object for class '{@link fr.se301b.taskset.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.se301b.taskset.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.se301b.taskset.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.se301b.taskset.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.se301b.taskset.NamedElement#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see fr.se301b.taskset.NamedElement#getQualifiedName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_QualifiedName();

	/**
	 * Returns the meta object for enum '{@link fr.se301b.taskset.PortDirection <em>Port Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Direction</em>'.
	 * @see fr.se301b.taskset.PortDirection
	 * @generated
	 */
	EEnum getPortDirection();

	/**
	 * Returns the meta object for enum '{@link fr.se301b.taskset.ThreadKind <em>Thread Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Thread Kind</em>'.
	 * @see fr.se301b.taskset.ThreadKind
	 * @generated
	 */
	EEnum getThreadKind();

	/**
	 * Returns the meta object for enum '{@link fr.se301b.taskset.SchedulingPolicy <em>Scheduling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheduling Policy</em>'.
	 * @see fr.se301b.taskset.SchedulingPolicy
	 * @generated
	 */
	EEnum getSchedulingPolicy();

	/**
	 * Returns the meta object for enum '{@link fr.se301b.taskset.PredefinedDataType <em>Predefined Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Predefined Data Type</em>'.
	 * @see fr.se301b.taskset.PredefinedDataType
	 * @generated
	 */
	EEnum getPredefinedDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TasksetFactory getTasksetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.se301b.taskset.impl.TaskSetImpl <em>Task Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.se301b.taskset.impl.TaskSetImpl
		 * @see fr.se301b.taskset.impl.TasksetPackageImpl#getTaskSet()
		 * @generated
		 */
		EClass TASK_SET = eINSTANCE.getTaskSet();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_SET__POLICY = eINSTANCE.getTaskSet_Policy();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_SET__TASKS = eINSTANCE.getTaskSet_Tasks();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_SET__CONNECTION = eINSTANCE.getTaskSet_Connection();

		/**
		 * The meta object literal for the '{@link fr.se301b.taskset.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.se301b.taskset.impl.TaskImpl
		 * @see fr.se301b.taskset.impl.TasksetPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__KIND = eINSTANCE.getTask_Kind();

		/**
		 * The meta object literal for the '<em><b>Minimum Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__MINIMUM_DELAY = eINSTANCE.getTask_MinimumDelay();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PERIOD = eINSTANCE.getTask_Period();

		/**
		 * The meta object literal for the '<em><b>Owned Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OWNED_PORTS = eINSTANCE.getTask_OwnedPorts();

		/**
		 * The meta object literal for the '<em><b>Taskset</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TASKSET = eINSTANCE.getTask_Taskset();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__BEHAVIOR = eINSTANCE.getTask_Behavior();

		/**
		 * The meta object literal for the '{@link fr.se301b.taskset.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.se301b.taskset.impl.PortImpl
		 * @see fr.se301b.taskset.impl.TasksetPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DIRECTION = eINSTANCE.getPort_Direction();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DATA_TYPE = eINSTANCE.getPort_DataType();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__TASK = eINSTANCE.getPort_Task();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__CONNECTION = eINSTANCE.getPort_Connection();

		/**
		 * The meta object literal for the '{@link fr.se301b.taskset.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.se301b.taskset.impl.ConnectionImpl
		 * @see fr.se301b.taskset.impl.TasksetPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Queue Max Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__QUEUE_MAX_SIZE = eINSTANCE.getConnection_QueueMaxSize();

		/**
		 * The meta object literal for the '<em><b>Input Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__INPUT_PORT = eINSTANCE.getConnection_InputPort();

		/**
		 * The meta object literal for the '<em><b>Output Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__OUTPUT_PORT = eINSTANCE.getConnection_OutputPort();

		/**
		 * The meta object literal for the '{@link fr.se301b.taskset.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.se301b.taskset.impl.NamedElementImpl
		 * @see fr.se301b.taskset.impl.TasksetPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__QUALIFIED_NAME = eINSTANCE.getNamedElement_QualifiedName();

		/**
		 * The meta object literal for the '{@link fr.se301b.taskset.PortDirection <em>Port Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.se301b.taskset.PortDirection
		 * @see fr.se301b.taskset.impl.TasksetPackageImpl#getPortDirection()
		 * @generated
		 */
		EEnum PORT_DIRECTION = eINSTANCE.getPortDirection();

		/**
		 * The meta object literal for the '{@link fr.se301b.taskset.ThreadKind <em>Thread Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.se301b.taskset.ThreadKind
		 * @see fr.se301b.taskset.impl.TasksetPackageImpl#getThreadKind()
		 * @generated
		 */
		EEnum THREAD_KIND = eINSTANCE.getThreadKind();

		/**
		 * The meta object literal for the '{@link fr.se301b.taskset.SchedulingPolicy <em>Scheduling Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.se301b.taskset.SchedulingPolicy
		 * @see fr.se301b.taskset.impl.TasksetPackageImpl#getSchedulingPolicy()
		 * @generated
		 */
		EEnum SCHEDULING_POLICY = eINSTANCE.getSchedulingPolicy();

		/**
		 * The meta object literal for the '{@link fr.se301b.taskset.PredefinedDataType <em>Predefined Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.se301b.taskset.PredefinedDataType
		 * @see fr.se301b.taskset.impl.TasksetPackageImpl#getPredefinedDataType()
		 * @generated
		 */
		EEnum PREDEFINED_DATA_TYPE = eINSTANCE.getPredefinedDataType();

	}

} //TasksetPackage
