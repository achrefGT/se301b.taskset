/**
 */
package fr.se301b.taskset.util;

import fr.se301b.taskset.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see fr.se301b.taskset.TasksetPackage
 * @generated
 */
public class TasksetValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TasksetValidator INSTANCE = new TasksetValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fr.se301b.taskset";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TasksetValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return TasksetPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case TasksetPackage.TASK_SET:
			return validateTaskSet((TaskSet) value, diagnostics, context);
		case TasksetPackage.TASK:
			return validateTask((Task) value, diagnostics, context);
		case TasksetPackage.PORT:
			return validatePort((Port) value, diagnostics, context);
		case TasksetPackage.CONNECTION:
			return validateConnection((Connection) value, diagnostics, context);
		case TasksetPackage.NAMED_ELEMENT:
			return validateNamedElement((NamedElement) value, diagnostics, context);
		case TasksetPackage.PORT_DIRECTION:
			return validatePortDirection((PortDirection) value, diagnostics, context);
		case TasksetPackage.THREAD_KIND:
			return validateThreadKind((ThreadKind) value, diagnostics, context);
		case TasksetPackage.SCHEDULING_POLICY:
			return validateSchedulingPolicy((SchedulingPolicy) value, diagnostics, context);
		case TasksetPackage.PREDEFINED_DATA_TYPE:
			return validatePredefinedDataType((PredefinedDataType) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskSet(TaskSet taskSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(taskSet, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(taskSet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(taskSet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(taskSet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(taskSet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(taskSet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(taskSet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(taskSet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(taskSet, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTaskSet_singleRootTaskSet(taskSet, diagnostics, context);
		return result;
	}

	/**
	 * Validates the singleRootTaskSet constraint of '<em>Task Set</em>'.
	 * Ensures that only one root TaskSet exists in the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTaskSet_singleRootTaskSet(TaskSet taskSet, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		// Start with the given TaskSet
		EObject current = taskSet;

		// Traverse up to the root element
		while (current.eContainer() != null) {
			current = current.eContainer();
		}

		// Check if the root element is a TaskSet
		if (!(current instanceof TaskSet)) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "singleRootTaskSet", "The root element must be a TaskSet, not any other type." },
						new Object[] { taskSet }, context));
			}
			return false;
		}

		EObject rootElement = current;
		if (rootElement.eResource() != null) {
			Collection<EObject> allContents = rootElement.eResource().getContents();
			long taskSetCount = allContents.stream().filter(obj -> obj instanceof TaskSet).count();

			if (taskSetCount > 1) {
				if (diagnostics != null) {
					diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
							"_UI_GenericConstraint_diagnostic",
							new Object[] { "singleRootTaskSet", "Only one root TaskSet is allowed in the model." },
							new Object[] { taskSet }, context));
				}
				return false;
			}
		}

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(task, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTask_uniqueNames(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTask_uniquePortNames(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTask_positifPeriod(task, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTask_positifMinimumDelay(task, diagnostics, context);
		return result;
	}

	/**
	 * Validates the uniqueNames constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTask_uniqueNames(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		System.out.println("Validating unique names for task: " + task.getName());

		// Check if all task names are unique within the containing task set
		TaskSet taskSet = (TaskSet) task.eContainer(); // Get the containing TaskSet
		if (taskSet != null) {
			System.out.println("Found containing TaskSet: " + taskSet);
			Set<String> taskNames = new HashSet<>();
			for (Task siblingTask : taskSet.getTasks()) { // Assuming `getTasks()` retrieves all tasks in the task set
				System.out.println("Checking task: " + siblingTask.getName());
				if (!taskNames.add(siblingTask.getName())) { // Duplicate name found
					System.out.println("Duplicate name found: " + siblingTask.getName());
					if (diagnostics != null) {
						diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
								"_UI_GenericConstraint_diagnostic",
								new Object[] { "uniqueNames", "Task names must be unique within the task set." },
								new Object[] { task }, context));
					}
					return false;
				}
			}
		} else {
			System.out.println("Task does not belong to any TaskSet.");
		}
		System.out.println("All task names are unique.");
		return true;
	}

	/**
	 * Validates the uniquePortNames constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTask_uniquePortNames(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		System.out.println("Validating unique port names for task: " + task.getName());

		// Check if all port names are unique within the task
		Set<String> portNames = new HashSet<>();
		for (Port port : task.getOwnedPorts()) {
			System.out.println("Checking port: " + port.getName());
			if (!portNames.add(port.getName())) { // Duplicate name found
				System.out.println("Duplicate port name found: " + port.getName());
				if (diagnostics != null) {
					diagnostics.add(
							createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
									new Object[] { "uniquePortNames", "Port names must be unique within the task." },
									new Object[] { task }, context));
				}
				return false;
			}
		}
		System.out.println("All port names are unique.");
		return true;
	}

	/**
	 * Validates the positifPeriod constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTask_positifPeriod(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// Ensure the period of the task is positive
		if (task.getPeriod() < 0) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "positifPeriod", getObjectLabel(task, context) }, new Object[] { task },
								context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the positifMinimumDelay constraint of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTask_positifMinimumDelay(Task task, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// Ensure the minimum delay of the task is positive
		if (task.getMinimumDelay() < 0) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "positifMinimumDelay", getObjectLabel(task, context) },
								new Object[] { task }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePort(Port port, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(port, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connection, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnection_sameDataType(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnection_positifQueueMaxSize(connection, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnection_portTypes(connection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the sameDataType constraint of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConnection_sameDataType(Connection connection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// Check if the input and output ports have the same data type
		if (connection.getInputPort().getDataType() != connection.getOutputPort().getDataType()) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "sameDataType", getObjectLabel(connection, context) },
								new Object[] { connection }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the positifQueueMaxSize constraint of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConnection_positifQueueMaxSize(Connection connection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// Check if the queue maximum size is negative
		if (connection.getQueueMaxSize() <= 0) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "positifQueueMaxSize", getObjectLabel(connection, context) },
								new Object[] { connection }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the portTypes constraint of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConnection_portTypes(Connection connection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// Check if the input and output ports have the same direction
		if (connection.getInputPort().getDirection() == PortDirection.OUT
				&& connection.getOutputPort().getDirection() == PortDirection.IN) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "portTypes", getObjectLabel(connection, context) },
								new Object[] { connection }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePortDirection(PortDirection portDirection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThreadKind(ThreadKind threadKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedulingPolicy(SchedulingPolicy schedulingPolicy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePredefinedDataType(PredefinedDataType predefinedDataType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TasksetValidator
