/**
 */
package fr.se301b.taskset.impl;

import fr.se301b.taskset.Port;
import fr.se301b.taskset.Task;
import fr.se301b.taskset.TaskSet;
import fr.se301b.taskset.TasksetPackage;
import fr.se301b.taskset.ThreadKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.se301b.taskset.impl.TaskImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.se301b.taskset.impl.TaskImpl#getMinimumDelay <em>Minimum Delay</em>}</li>
 *   <li>{@link fr.se301b.taskset.impl.TaskImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link fr.se301b.taskset.impl.TaskImpl#getOwnedPorts <em>Owned Ports</em>}</li>
 *   <li>{@link fr.se301b.taskset.impl.TaskImpl#getTaskset <em>Taskset</em>}</li>
 *   <li>{@link fr.se301b.taskset.impl.TaskImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends NamedElementImpl implements Task {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ThreadKind KIND_EDEFAULT = ThreadKind.PERIODIC;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ThreadKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumDelay() <em>Minimum Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumDelay()
	 * @generated
	 * @ordered
	 */
	protected static final int MINIMUM_DELAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinimumDelay() <em>Minimum Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumDelay()
	 * @generated
	 * @ordered
	 */
	protected int minimumDelay = MINIMUM_DELAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected int period = PERIOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedPorts() <em>Owned Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ownedPorts;

	/**
	 * The cached value of the '{@link #getTaskset() <em>Taskset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskset()
	 * @generated
	 * @ordered
	 */
	protected TaskSet taskset;

	/**
	 * The default value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final String BEHAVIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected String behavior = BEHAVIOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TasksetPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThreadKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(ThreadKind newKind) {
		ThreadKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetPackage.TASK__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinimumDelay() {
		return minimumDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimumDelay(int newMinimumDelay) {
		int oldMinimumDelay = minimumDelay;
		minimumDelay = newMinimumDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetPackage.TASK__MINIMUM_DELAY, oldMinimumDelay,
					minimumDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriod(int newPeriod) {
		int oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetPackage.TASK__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Port> getOwnedPorts() {
		if (ownedPorts == null) {
			ownedPorts = new EObjectContainmentEList<Port>(Port.class, this, TasksetPackage.TASK__OWNED_PORTS);
		}
		return ownedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskSet getTaskset() {
		if (taskset != null && taskset.eIsProxy()) {
			InternalEObject oldTaskset = (InternalEObject) taskset;
			taskset = (TaskSet) eResolveProxy(oldTaskset);
			if (taskset != oldTaskset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasksetPackage.TASK__TASKSET, oldTaskset,
							taskset));
			}
		}
		return taskset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSet basicGetTaskset() {
		return taskset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskset(TaskSet newTaskset) {
		TaskSet oldTaskset = taskset;
		taskset = newTaskset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetPackage.TASK__TASKSET, oldTaskset, taskset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBehavior(String newBehavior) {
		String oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetPackage.TASK__BEHAVIOR, oldBehavior,
					behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TasksetPackage.TASK__OWNED_PORTS:
			return ((InternalEList<?>) getOwnedPorts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TasksetPackage.TASK__KIND:
			return getKind();
		case TasksetPackage.TASK__MINIMUM_DELAY:
			return getMinimumDelay();
		case TasksetPackage.TASK__PERIOD:
			return getPeriod();
		case TasksetPackage.TASK__OWNED_PORTS:
			return getOwnedPorts();
		case TasksetPackage.TASK__TASKSET:
			if (resolve)
				return getTaskset();
			return basicGetTaskset();
		case TasksetPackage.TASK__BEHAVIOR:
			return getBehavior();
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
		case TasksetPackage.TASK__KIND:
			setKind((ThreadKind) newValue);
			return;
		case TasksetPackage.TASK__MINIMUM_DELAY:
			setMinimumDelay((Integer) newValue);
			return;
		case TasksetPackage.TASK__PERIOD:
			setPeriod((Integer) newValue);
			return;
		case TasksetPackage.TASK__OWNED_PORTS:
			getOwnedPorts().clear();
			getOwnedPorts().addAll((Collection<? extends Port>) newValue);
			return;
		case TasksetPackage.TASK__TASKSET:
			setTaskset((TaskSet) newValue);
			return;
		case TasksetPackage.TASK__BEHAVIOR:
			setBehavior((String) newValue);
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
		case TasksetPackage.TASK__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case TasksetPackage.TASK__MINIMUM_DELAY:
			setMinimumDelay(MINIMUM_DELAY_EDEFAULT);
			return;
		case TasksetPackage.TASK__PERIOD:
			setPeriod(PERIOD_EDEFAULT);
			return;
		case TasksetPackage.TASK__OWNED_PORTS:
			getOwnedPorts().clear();
			return;
		case TasksetPackage.TASK__TASKSET:
			setTaskset((TaskSet) null);
			return;
		case TasksetPackage.TASK__BEHAVIOR:
			setBehavior(BEHAVIOR_EDEFAULT);
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
		case TasksetPackage.TASK__KIND:
			return kind != KIND_EDEFAULT;
		case TasksetPackage.TASK__MINIMUM_DELAY:
			return minimumDelay != MINIMUM_DELAY_EDEFAULT;
		case TasksetPackage.TASK__PERIOD:
			return period != PERIOD_EDEFAULT;
		case TasksetPackage.TASK__OWNED_PORTS:
			return ownedPorts != null && !ownedPorts.isEmpty();
		case TasksetPackage.TASK__TASKSET:
			return taskset != null;
		case TasksetPackage.TASK__BEHAVIOR:
			return BEHAVIOR_EDEFAULT == null ? behavior != null : !BEHAVIOR_EDEFAULT.equals(behavior);
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", minimumDelay: ");
		result.append(minimumDelay);
		result.append(", period: ");
		result.append(period);
		result.append(", behavior: ");
		result.append(behavior);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getQualifiedName() {
		if (name == null || name.isEmpty()) {
			throw new UnsupportedOperationException();
		}
		return getName();
	}

} //TaskImpl
