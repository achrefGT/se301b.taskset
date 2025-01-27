/**
 */
package fr.se301b.taskset.impl;

import fr.se301b.taskset.Connection;
import fr.se301b.taskset.Port;
import fr.se301b.taskset.PortDirection;
import fr.se301b.taskset.PredefinedDataType;
import fr.se301b.taskset.Task;
import fr.se301b.taskset.TasksetPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.se301b.taskset.impl.PortImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link fr.se301b.taskset.impl.PortImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link fr.se301b.taskset.impl.PortImpl#getTask <em>Task</em>}</li>
 *   <li>{@link fr.se301b.taskset.impl.PortImpl#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends NamedElementImpl implements Port {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final PortDirection DIRECTION_EDEFAULT = PortDirection.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected PortDirection direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final PredefinedDataType DATA_TYPE_EDEFAULT = PredefinedDataType.FLOAT;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected PredefinedDataType dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Task task;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected Connection connection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TasksetPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(PortDirection newDirection) {
		PortDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetPackage.PORT__DIRECTION, oldDirection,
					direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PredefinedDataType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(PredefinedDataType newDataType) {
		PredefinedDataType oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetPackage.PORT__DATA_TYPE, oldDataType,
					dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject) task;
			task = (Task) eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasksetPackage.PORT__TASK, oldTask,
							task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTask(Task newTask) {
		Task oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetPackage.PORT__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection getConnection() {
		if (connection != null && connection.eIsProxy()) {
			InternalEObject oldConnection = (InternalEObject) connection;
			connection = (Connection) eResolveProxy(oldConnection);
			if (connection != oldConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasksetPackage.PORT__CONNECTION,
							oldConnection, connection));
			}
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection basicGetConnection() {
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnection(Connection newConnection) {
		Connection oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetPackage.PORT__CONNECTION, oldConnection,
					connection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TasksetPackage.PORT__DIRECTION:
			return getDirection();
		case TasksetPackage.PORT__DATA_TYPE:
			return getDataType();
		case TasksetPackage.PORT__TASK:
			if (resolve)
				return getTask();
			return basicGetTask();
		case TasksetPackage.PORT__CONNECTION:
			if (resolve)
				return getConnection();
			return basicGetConnection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TasksetPackage.PORT__DIRECTION:
			setDirection((PortDirection) newValue);
			return;
		case TasksetPackage.PORT__DATA_TYPE:
			setDataType((PredefinedDataType) newValue);
			return;
		case TasksetPackage.PORT__TASK:
			setTask((Task) newValue);
			return;
		case TasksetPackage.PORT__CONNECTION:
			setConnection((Connection) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TasksetPackage.PORT__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
			return;
		case TasksetPackage.PORT__DATA_TYPE:
			setDataType(DATA_TYPE_EDEFAULT);
			return;
		case TasksetPackage.PORT__TASK:
			setTask((Task) null);
			return;
		case TasksetPackage.PORT__CONNECTION:
			setConnection((Connection) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TasksetPackage.PORT__DIRECTION:
			return direction != DIRECTION_EDEFAULT;
		case TasksetPackage.PORT__DATA_TYPE:
			return dataType != DATA_TYPE_EDEFAULT;
		case TasksetPackage.PORT__TASK:
			return task != null;
		case TasksetPackage.PORT__CONNECTION:
			return connection != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (direction: ");
		result.append(direction);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(')');
		return result.toString();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String getQualifiedName() {
		Task task = getTask();
		if (task != null) {
			return task.getQualifiedName() + "." + getName();
		}
		throw new UnsupportedOperationException("Task is not set!");
	}

} //PortImpl
