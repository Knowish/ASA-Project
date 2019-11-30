/**
 */
package asaproject.model.asa.M1;

import asaproject.model.asa.AsaPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see asaproject.model.asa.M1.M1Factory
 * @model kind="package"
 * @generated
 */
public interface M1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "M1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/M1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "M1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	M1Package eINSTANCE = asaproject.model.asa.M1.impl.M1PackageImpl.init();

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.Client_Server_SystemImpl <em>Client Server System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.Client_Server_SystemImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getClient_Server_System()
	 * @generated
	 */
	int CLIENT_SERVER_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_SYSTEM__PROPERTIES = AsaPackage.CONFIGURATION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_SYSTEM__ELEMENTS = AsaPackage.CONFIGURATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_SYSTEM__PARENT = AsaPackage.CONFIGURATION__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_SYSTEM__NAME = AsaPackage.CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_SYSTEM__COMPONENTS = AsaPackage.CONFIGURATION__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_SYSTEM__CONNECTORS = AsaPackage.CONFIGURATION__CONNECTORS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_SYSTEM__PORTS = AsaPackage.CONFIGURATION__PORTS;

	/**
	 * The number of structural features of the '<em>Client Server System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_SYSTEM_FEATURE_COUNT = AsaPackage.CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Client Server System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_SERVER_SYSTEM_OPERATION_COUNT = AsaPackage.CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.ClientImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PROPERTIES = AsaPackage.COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__ELEMENTS = AsaPackage.COMPONENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__PARENT = AsaPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAME = AsaPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__CONFIGURATION = AsaPackage.COMPONENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Icomponents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__ICOMPONENTS = AsaPackage.COMPONENT__ICOMPONENTS;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = AsaPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = AsaPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.ServerImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__PROPERTIES = AsaPackage.COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__ELEMENTS = AsaPackage.COMPONENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__PARENT = AsaPackage.COMPONENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__NAME = AsaPackage.COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__CONFIGURATION = AsaPackage.COMPONENT__CONFIGURATION;

	/**
	 * The feature id for the '<em><b>Icomponents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__ICOMPONENTS = AsaPackage.COMPONENT__ICOMPONENTS;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = AsaPackage.COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = AsaPackage.COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.M1.impl.rpcImpl <em>rpc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.M1.impl.rpcImpl
	 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getrpc()
	 * @generated
	 */
	int RPC = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__PROPERTIES = AsaPackage.CONNECTOR__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__ELEMENTS = AsaPackage.CONNECTOR__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__PARENT = AsaPackage.CONNECTOR__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__NAME = AsaPackage.CONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__GLUE = AsaPackage.CONNECTOR__GLUE;

	/**
	 * The feature id for the '<em><b>Iconnectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC__ICONNECTORS = AsaPackage.CONNECTOR__ICONNECTORS;

	/**
	 * The number of structural features of the '<em>rpc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_FEATURE_COUNT = AsaPackage.CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>rpc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPC_OPERATION_COUNT = AsaPackage.CONNECTOR_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Client_Server_System <em>Client Server System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client Server System</em>'.
	 * @see asaproject.model.asa.M1.Client_Server_System
	 * @generated
	 */
	EClass getClient_Server_System();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see asaproject.model.asa.M1.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see asaproject.model.asa.M1.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.M1.rpc <em>rpc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>rpc</em>'.
	 * @see asaproject.model.asa.M1.rpc
	 * @generated
	 */
	EClass getrpc();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	M1Factory getM1Factory();

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
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.Client_Server_SystemImpl <em>Client Server System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.Client_Server_SystemImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getClient_Server_System()
		 * @generated
		 */
		EClass CLIENT_SERVER_SYSTEM = eINSTANCE.getClient_Server_System();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.ClientImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.ServerImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.M1.impl.rpcImpl <em>rpc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.M1.impl.rpcImpl
		 * @see asaproject.model.asa.M1.impl.M1PackageImpl#getrpc()
		 * @generated
		 */
		EClass RPC = eINSTANCE.getrpc();

	}

} //M1Package
