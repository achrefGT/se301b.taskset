/**
 */
package fr.se301b.taskset.impl;

import fr.se301b.taskset.Connection;
import fr.se301b.taskset.Port;
import fr.se301b.taskset.TasksetPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.se301b.taskset.impl.ConnectionImpl#getQueueMaxSize <em>Queue Max Size</em>}</li>
 *   <li>{@link fr.se301b.taskset.impl.ConnectionImpl#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link fr.se301b.taskset.impl.ConnectionImpl#getOutputPort <em>Output Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends NamedElementImpl implements Connection {
	/**
	 * The default value of the '{@link #getQueueMaxSize() <em>Queue Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueMaxSize()
	 * @generated
	 * @ordered
	 */
	protected static final int QUEUE_MAX_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQueueMaxSize() <em>Queue Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueMaxSize()
	 * @generated
	 * @ordered
	 */
	protected int queueMaxSize = QUEUE_MAX_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputPort() <em>Input Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPort()
	 * @generated
	 * @ordered
	 */
	protected Port inputPort;

	/**
	 * The cached value of the '{@link #getOutputPort() <em>Output Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPort()
	 * @generated
	 * @ordered
	 */
	protected Port outputPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TasksetPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getQueueMaxSize() {
		return queueMaxSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueueMaxSize(int newQueueMaxSize) {
		int oldQueueMaxSize = queueMaxSize;
		queueMaxSize = newQueueMaxSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetPackage.CONNECTION__QUEUE_MAX_SIZE,
					oldQueueMaxSize, queueMaxSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getInputPort() {
		if (inputPort != null && inputPort.eIsProxy()) {
			InternalEObject oldInputPort = (InternalEObject) inputPort;
			inputPort = (Port) eResolveProxy(oldInputPort);
			if (inputPort != oldInputPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasksetPackage.CONNECTION__INPUT_PORT,
							oldInputPort, inputPort));
			}
		}
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetInputPort() {
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputPort(Port newInputPort) {
		Port oldInputPort = inputPort;
		inputPort = newInputPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetPackage.CONNECTION__INPUT_PORT, oldInputPort,
					inputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getOutputPort() {
		if (outputPort != null && outputPort.eIsProxy()) {
			InternalEObject oldOutputPort = (InternalEObject) outputPort;
			outputPort = (Port) eResolveProxy(oldOutputPort);
			if (outputPort != oldOutputPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TasksetPackage.CONNECTION__OUTPUT_PORT,
							oldOutputPort, outputPort));
			}
		}
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetOutputPort() {
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputPort(Port newOutputPort) {
		Port oldOutputPort = outputPort;
		outputPort = newOutputPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TasksetPackage.CONNECTION__OUTPUT_PORT, oldOutputPort,
					outputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TasksetPackage.CONNECTION__QUEUE_MAX_SIZE:
			return getQueueMaxSize();
		case TasksetPackage.CONNECTION__INPUT_PORT:
			if (resolve)
				return getInputPort();
			return basicGetInputPort();
		case TasksetPackage.CONNECTION__OUTPUT_PORT:
			if (resolve)
				return getOutputPort();
			return basicGetOutputPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TasksetPackage.CONNECTION__QUEUE_MAX_SIZE:
			setQueueMaxSize((Integer) newValue);
			return;
		case TasksetPackage.CONNECTION__INPUT_PORT:
			setInputPort((Port) newValue);
			return;
		case TasksetPackage.CONNECTION__OUTPUT_PORT:
			setOutputPort((Port) newValue);
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
		case TasksetPackage.CONNECTION__QUEUE_MAX_SIZE:
			setQueueMaxSize(QUEUE_MAX_SIZE_EDEFAULT);
			return;
		case TasksetPackage.CONNECTION__INPUT_PORT:
			setInputPort((Port) null);
			return;
		case TasksetPackage.CONNECTION__OUTPUT_PORT:
			setOutputPort((Port) null);
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
		case TasksetPackage.CONNECTION__QUEUE_MAX_SIZE:
			return queueMaxSize != QUEUE_MAX_SIZE_EDEFAULT;
		case TasksetPackage.CONNECTION__INPUT_PORT:
			return inputPort != null;
		case TasksetPackage.CONNECTION__OUTPUT_PORT:
			return outputPort != null;
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
		result.append(" (queueMaxSize: ");
		result.append(queueMaxSize);
		result.append(')');
		return result.toString();
	}

	/**
	 * @generated NOT
	 */
	@Override
	public String getQualifiedName() {
		Port input = getInputPort();
		Port output = getOutputPort();

		if (input != null && output != null) {
			return output.getQualifiedName() + "->" + input.getQualifiedName();
		}
		throw new UnsupportedOperationException("Source or Target Port is not set!");
	}

} //ConnectionImpl
