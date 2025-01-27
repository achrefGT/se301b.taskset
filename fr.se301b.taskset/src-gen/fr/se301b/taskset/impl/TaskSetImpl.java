/**
 */
package fr.se301b.taskset.impl;

import fr.se301b.taskset.Connection;
import fr.se301b.taskset.SchedulingPolicy;
import fr.se301b.taskset.Task;
import fr.se301b.taskset.TaskSet;
import fr.se301b.taskset.TasksetPackage;

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
 * An implementation of the model object '<em><b>Task Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.se301b.taskset.impl.TaskSetImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link fr.se301b.taskset.impl.TaskSetImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link fr.se301b.taskset.impl.TaskSetImpl#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskSetImpl extends NamedElementImpl implements TaskSet {
	/**
	 * The default value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final SchedulingPolicy POLICY_EDEFAULT = SchedulingPolicy.RMS;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected SchedulingPolicy policy = POLICY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TasksetPackage.Literals.TASK_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchedulingPolicy getPolicy() {
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicy(SchedulingPolicy newPolicy) {
		SchedulingPolicy oldPolicy = policy;
		policy = newPolicy == null ? POLICY_EDEFAULT : newPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetPackage.TASK_SET__POLICY, oldPolicy, policy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, TasksetPackage.TASK_SET__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Connection> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentEList<Connection>(Connection.class, this,
					TasksetPackage.TASK_SET__CONNECTION);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TasksetPackage.TASK_SET__TASKS:
			return ((InternalEList<?>) getTasks()).basicRemove(otherEnd, msgs);
		case TasksetPackage.TASK_SET__CONNECTION:
			return ((InternalEList<?>) getConnection()).basicRemove(otherEnd, msgs);
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
		case TasksetPackage.TASK_SET__POLICY:
			return getPolicy();
		case TasksetPackage.TASK_SET__TASKS:
			return getTasks();
		case TasksetPackage.TASK_SET__CONNECTION:
			return getConnection();
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
		case TasksetPackage.TASK_SET__POLICY:
			setPolicy((SchedulingPolicy) newValue);
			return;
		case TasksetPackage.TASK_SET__TASKS:
			getTasks().clear();
			getTasks().addAll((Collection<? extends Task>) newValue);
			return;
		case TasksetPackage.TASK_SET__CONNECTION:
			getConnection().clear();
			getConnection().addAll((Collection<? extends Connection>) newValue);
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
		case TasksetPackage.TASK_SET__POLICY:
			setPolicy(POLICY_EDEFAULT);
			return;
		case TasksetPackage.TASK_SET__TASKS:
			getTasks().clear();
			return;
		case TasksetPackage.TASK_SET__CONNECTION:
			getConnection().clear();
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
		case TasksetPackage.TASK_SET__POLICY:
			return policy != POLICY_EDEFAULT;
		case TasksetPackage.TASK_SET__TASKS:
			return tasks != null && !tasks.isEmpty();
		case TasksetPackage.TASK_SET__CONNECTION:
			return connection != null && !connection.isEmpty();
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
		result.append(" (policy: ");
		result.append(policy);
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

} //TaskSetImpl
