/**
 */
package asaproject.model.asa;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see asaproject.model.asa.AsaFactory
 * @model kind="package"
 * @generated
 */
public interface AsaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "asa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/asa";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "asa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AsaPackage eINSTANCE = asaproject.model.asa.impl.AsaPackageImpl.init();

	/**
	 * The meta object id for the '{@link asaproject.model.asa.impl.ArchitecturalElementImpl <em>Architectural Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.impl.ArchitecturalElementImpl
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getArchitecturalElement()
	 * @generated
	 */
	int ARCHITECTURAL_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_ELEMENT__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_ELEMENT__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_ELEMENT__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_ELEMENT__NAME = 3;

	/**
	 * The number of structural features of the '<em>Architectural Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Architectural Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.impl.ConfigurationImpl
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PROPERTIES = ARCHITECTURAL_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ELEMENTS = ARCHITECTURAL_ELEMENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PARENT = ARCHITECTURAL_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = ARCHITECTURAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__COMPONENTS = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONNECTORS = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PORTS = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.impl.ComponentImpl
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROPERTIES = ARCHITECTURAL_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ELEMENTS = ARCHITECTURAL_ELEMENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARENT = ARCHITECTURAL_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = ARCHITECTURAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONFIGURATION = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icomponents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ICOMPONENTS = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.IComponent <em>IComponent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.IComponent
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getIComponent()
	 * @generated
	 */
	int ICOMPONENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMPONENT__COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>IComponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IComponent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.impl.PortImpl
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = ICOMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__COMPONENT = ICOMPONENT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__CONFIGURATION = ICOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = ICOMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = ICOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.impl.RequiredPortImpl <em>Required Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.impl.RequiredPortImpl
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getRequiredPort()
	 * @generated
	 */
	int REQUIRED_PORT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__COMPONENT = PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT__CONFIGURATION = PORT__CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Required Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.impl.ProvidedPortImpl
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getProvidedPort()
	 * @generated
	 */
	int PROVIDED_PORT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__COMPONENT = PORT__COMPONENT;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT__CONFIGURATION = PORT__CONFIGURATION;

	/**
	 * The number of structural features of the '<em>Provided Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.impl.ConnectorImpl
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PROPERTIES = ARCHITECTURAL_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ELEMENTS = ARCHITECTURAL_ELEMENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PARENT = ARCHITECTURAL_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = ARCHITECTURAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Glue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__GLUE = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iconnectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ICONNECTORS = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.impl.ServiceImpl
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = ICOMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__COMPONENT = ICOMPONENT__COMPONENT;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = ICOMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = ICOMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.impl.RequiredServiceImpl <em>Required Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.impl.RequiredServiceImpl
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getRequiredService()
	 * @generated
	 */
	int REQUIRED_SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SERVICE__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SERVICE__COMPONENT = SERVICE__COMPONENT;

	/**
	 * The number of structural features of the '<em>Required Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.impl.ProvidedServiceImpl <em>Provided Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.impl.ProvidedServiceImpl
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getProvidedService()
	 * @generated
	 */
	int PROVIDED_SERVICE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_SERVICE__NAME = SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_SERVICE__COMPONENT = SERVICE__COMPONENT;

	/**
	 * The number of structural features of the '<em>Provided Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.impl.PropertyImpl
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 8;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.IConnector <em>IConnector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.IConnector
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getIConnector()
	 * @generated
	 */
	int ICONNECTOR = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONNECTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONNECTOR__CONNECTOR = 1;

	/**
	 * The number of structural features of the '<em>IConnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONNECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>IConnector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONNECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.impl.RoleImpl
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = ICONNECTOR__NAME;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONNECTOR = ICONNECTOR__CONNECTOR;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = ICONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = ICONNECTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.impl.RequiredRoleImpl <em>Required Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.impl.RequiredRoleImpl
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getRequiredRole()
	 * @generated
	 */
	int REQUIRED_ROLE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE__NAME = ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE__CONNECTOR = ROLE__CONNECTOR;

	/**
	 * The number of structural features of the '<em>Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ROLE_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.impl.ProvidedRoleImpl <em>Provided Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.impl.ProvidedRoleImpl
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getProvidedRole()
	 * @generated
	 */
	int PROVIDED_ROLE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE__NAME = ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE__CONNECTOR = ROLE__CONNECTOR;

	/**
	 * The number of structural features of the '<em>Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE_FEATURE_COUNT = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_ROLE_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.impl.GlueImpl <em>Glue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.impl.GlueImpl
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getGlue()
	 * @generated
	 */
	int GLUE = 16;

	/**
	 * The number of structural features of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Glue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.impl.LinkImpl
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 17;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__PROPERTIES = ARCHITECTURAL_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ELEMENTS = ARCHITECTURAL_ELEMENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__PARENT = ARCHITECTURAL_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = ARCHITECTURAL_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.impl.BindingImpl
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 18;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PROPERTIES = LINK__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__ELEMENTS = LINK__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PARENT = LINK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__PORTS = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.impl.AttachmentImpl <em>Attachment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.impl.AttachmentImpl
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getAttachment()
	 * @generated
	 */
	int ATTACHMENT = 19;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__PROPERTIES = LINK__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__ELEMENTS = LINK__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__PARENT = LINK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__NAME = LINK__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__PORT = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT__ROLE = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attachment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link asaproject.model.asa.impl.ArchitecturalSystemImpl <em>Architectural System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see asaproject.model.asa.impl.ArchitecturalSystemImpl
	 * @see asaproject.model.asa.impl.AsaPackageImpl#getArchitecturalSystem()
	 * @generated
	 */
	int ARCHITECTURAL_SYSTEM = 20;

	/**
	 * The feature id for the '<em><b>Architectural Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_SYSTEM__ARCHITECTURAL_ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Architectural System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Architectural System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see asaproject.model.asa.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link asaproject.model.asa.Configuration#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see asaproject.model.asa.Configuration#getComponents()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Components();

	/**
	 * Returns the meta object for the reference list '{@link asaproject.model.asa.Configuration#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connectors</em>'.
	 * @see asaproject.model.asa.Configuration#getConnectors()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link asaproject.model.asa.Configuration#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see asaproject.model.asa.Configuration#getPorts()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Ports();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see asaproject.model.asa.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference '{@link asaproject.model.asa.Component#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see asaproject.model.asa.Component#getConfiguration()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Configuration();

	/**
	 * Returns the meta object for the containment reference list '{@link asaproject.model.asa.Component#getIcomponents <em>Icomponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icomponents</em>'.
	 * @see asaproject.model.asa.Component#getIcomponents()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Icomponents();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.RequiredPort <em>Required Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Port</em>'.
	 * @see asaproject.model.asa.RequiredPort
	 * @generated
	 */
	EClass getRequiredPort();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.ProvidedPort <em>Provided Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Port</em>'.
	 * @see asaproject.model.asa.ProvidedPort
	 * @generated
	 */
	EClass getProvidedPort();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see asaproject.model.asa.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the containment reference '{@link asaproject.model.asa.Connector#getGlue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Glue</em>'.
	 * @see asaproject.model.asa.Connector#getGlue()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Glue();

	/**
	 * Returns the meta object for the containment reference list '{@link asaproject.model.asa.Connector#getIconnectors <em>Iconnectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iconnectors</em>'.
	 * @see asaproject.model.asa.Connector#getIconnectors()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Iconnectors();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.RequiredService <em>Required Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Service</em>'.
	 * @see asaproject.model.asa.RequiredService
	 * @generated
	 */
	EClass getRequiredService();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.ProvidedService <em>Provided Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Service</em>'.
	 * @see asaproject.model.asa.ProvidedService
	 * @generated
	 */
	EClass getProvidedService();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.ArchitecturalElement <em>Architectural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architectural Element</em>'.
	 * @see asaproject.model.asa.ArchitecturalElement
	 * @generated
	 */
	EClass getArchitecturalElement();

	/**
	 * Returns the meta object for the containment reference list '{@link asaproject.model.asa.ArchitecturalElement#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see asaproject.model.asa.ArchitecturalElement#getProperties()
	 * @see #getArchitecturalElement()
	 * @generated
	 */
	EReference getArchitecturalElement_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link asaproject.model.asa.ArchitecturalElement#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see asaproject.model.asa.ArchitecturalElement#getElements()
	 * @see #getArchitecturalElement()
	 * @generated
	 */
	EReference getArchitecturalElement_Elements();

	/**
	 * Returns the meta object for the container reference '{@link asaproject.model.asa.ArchitecturalElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see asaproject.model.asa.ArchitecturalElement#getParent()
	 * @see #getArchitecturalElement()
	 * @generated
	 */
	EReference getArchitecturalElement_Parent();

	/**
	 * Returns the meta object for the attribute '{@link asaproject.model.asa.ArchitecturalElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see asaproject.model.asa.ArchitecturalElement#getName()
	 * @see #getArchitecturalElement()
	 * @generated
	 */
	EAttribute getArchitecturalElement_Name();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see asaproject.model.asa.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see asaproject.model.asa.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the container reference '{@link asaproject.model.asa.Port#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Configuration</em>'.
	 * @see asaproject.model.asa.Port#getConfiguration()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Configuration();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see asaproject.model.asa.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see asaproject.model.asa.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.RequiredRole <em>Required Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Role</em>'.
	 * @see asaproject.model.asa.RequiredRole
	 * @generated
	 */
	EClass getRequiredRole();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.ProvidedRole <em>Provided Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Role</em>'.
	 * @see asaproject.model.asa.ProvidedRole
	 * @generated
	 */
	EClass getProvidedRole();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.IComponent <em>IComponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IComponent</em>'.
	 * @see asaproject.model.asa.IComponent
	 * @generated
	 */
	EClass getIComponent();

	/**
	 * Returns the meta object for the attribute '{@link asaproject.model.asa.IComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see asaproject.model.asa.IComponent#getName()
	 * @see #getIComponent()
	 * @generated
	 */
	EAttribute getIComponent_Name();

	/**
	 * Returns the meta object for the container reference '{@link asaproject.model.asa.IComponent#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Component</em>'.
	 * @see asaproject.model.asa.IComponent#getComponent()
	 * @see #getIComponent()
	 * @generated
	 */
	EReference getIComponent_Component();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.IConnector <em>IConnector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IConnector</em>'.
	 * @see asaproject.model.asa.IConnector
	 * @generated
	 */
	EClass getIConnector();

	/**
	 * Returns the meta object for the attribute '{@link asaproject.model.asa.IConnector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see asaproject.model.asa.IConnector#getName()
	 * @see #getIConnector()
	 * @generated
	 */
	EAttribute getIConnector_Name();

	/**
	 * Returns the meta object for the container reference '{@link asaproject.model.asa.IConnector#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Connector</em>'.
	 * @see asaproject.model.asa.IConnector#getConnector()
	 * @see #getIConnector()
	 * @generated
	 */
	EReference getIConnector_Connector();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.Glue <em>Glue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glue</em>'.
	 * @see asaproject.model.asa.Glue
	 * @generated
	 */
	EClass getGlue();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see asaproject.model.asa.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see asaproject.model.asa.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the reference list '{@link asaproject.model.asa.Binding#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ports</em>'.
	 * @see asaproject.model.asa.Binding#getPorts()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Ports();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment</em>'.
	 * @see asaproject.model.asa.Attachment
	 * @generated
	 */
	EClass getAttachment();

	/**
	 * Returns the meta object for the reference '{@link asaproject.model.asa.Attachment#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see asaproject.model.asa.Attachment#getPort()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Port();

	/**
	 * Returns the meta object for the reference '{@link asaproject.model.asa.Attachment#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see asaproject.model.asa.Attachment#getRole()
	 * @see #getAttachment()
	 * @generated
	 */
	EReference getAttachment_Role();

	/**
	 * Returns the meta object for class '{@link asaproject.model.asa.ArchitecturalSystem <em>Architectural System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architectural System</em>'.
	 * @see asaproject.model.asa.ArchitecturalSystem
	 * @generated
	 */
	EClass getArchitecturalSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link asaproject.model.asa.ArchitecturalSystem#getArchitecturalElements <em>Architectural Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Architectural Elements</em>'.
	 * @see asaproject.model.asa.ArchitecturalSystem#getArchitecturalElements()
	 * @see #getArchitecturalSystem()
	 * @generated
	 */
	EReference getArchitecturalSystem_ArchitecturalElements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AsaFactory getAsaFactory();

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
		 * The meta object literal for the '{@link asaproject.model.asa.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.impl.ConfigurationImpl
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__COMPONENTS = eINSTANCE.getConfiguration_Components();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONNECTORS = eINSTANCE.getConfiguration_Connectors();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__PORTS = eINSTANCE.getConfiguration_Ports();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.impl.ComponentImpl
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONFIGURATION = eINSTANCE.getComponent_Configuration();

		/**
		 * The meta object literal for the '<em><b>Icomponents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ICOMPONENTS = eINSTANCE.getComponent_Icomponents();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.impl.RequiredPortImpl <em>Required Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.impl.RequiredPortImpl
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getRequiredPort()
		 * @generated
		 */
		EClass REQUIRED_PORT = eINSTANCE.getRequiredPort();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.impl.ProvidedPortImpl
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getProvidedPort()
		 * @generated
		 */
		EClass PROVIDED_PORT = eINSTANCE.getProvidedPort();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.impl.ConnectorImpl
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Glue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__GLUE = eINSTANCE.getConnector_Glue();

		/**
		 * The meta object literal for the '<em><b>Iconnectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__ICONNECTORS = eINSTANCE.getConnector_Iconnectors();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.impl.RequiredServiceImpl <em>Required Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.impl.RequiredServiceImpl
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getRequiredService()
		 * @generated
		 */
		EClass REQUIRED_SERVICE = eINSTANCE.getRequiredService();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.impl.ProvidedServiceImpl <em>Provided Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.impl.ProvidedServiceImpl
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getProvidedService()
		 * @generated
		 */
		EClass PROVIDED_SERVICE = eINSTANCE.getProvidedService();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.impl.ArchitecturalElementImpl <em>Architectural Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.impl.ArchitecturalElementImpl
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getArchitecturalElement()
		 * @generated
		 */
		EClass ARCHITECTURAL_ELEMENT = eINSTANCE.getArchitecturalElement();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_ELEMENT__PROPERTIES = eINSTANCE.getArchitecturalElement_Properties();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_ELEMENT__ELEMENTS = eINSTANCE.getArchitecturalElement_Elements();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_ELEMENT__PARENT = eINSTANCE.getArchitecturalElement_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURAL_ELEMENT__NAME = eINSTANCE.getArchitecturalElement_Name();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.impl.PropertyImpl
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.impl.PortImpl
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__CONFIGURATION = eINSTANCE.getPort_Configuration();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.impl.ServiceImpl
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.impl.RoleImpl
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.impl.RequiredRoleImpl <em>Required Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.impl.RequiredRoleImpl
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getRequiredRole()
		 * @generated
		 */
		EClass REQUIRED_ROLE = eINSTANCE.getRequiredRole();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.impl.ProvidedRoleImpl <em>Provided Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.impl.ProvidedRoleImpl
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getProvidedRole()
		 * @generated
		 */
		EClass PROVIDED_ROLE = eINSTANCE.getProvidedRole();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.IComponent <em>IComponent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.IComponent
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getIComponent()
		 * @generated
		 */
		EClass ICOMPONENT = eINSTANCE.getIComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICOMPONENT__NAME = eINSTANCE.getIComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICOMPONENT__COMPONENT = eINSTANCE.getIComponent_Component();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.IConnector <em>IConnector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.IConnector
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getIConnector()
		 * @generated
		 */
		EClass ICONNECTOR = eINSTANCE.getIConnector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICONNECTOR__NAME = eINSTANCE.getIConnector_Name();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICONNECTOR__CONNECTOR = eINSTANCE.getIConnector_Connector();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.impl.GlueImpl <em>Glue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.impl.GlueImpl
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getGlue()
		 * @generated
		 */
		EClass GLUE = eINSTANCE.getGlue();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.impl.LinkImpl
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.impl.BindingImpl
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__PORTS = eINSTANCE.getBinding_Ports();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.impl.AttachmentImpl <em>Attachment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.impl.AttachmentImpl
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getAttachment()
		 * @generated
		 */
		EClass ATTACHMENT = eINSTANCE.getAttachment();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__PORT = eINSTANCE.getAttachment_Port();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT__ROLE = eINSTANCE.getAttachment_Role();

		/**
		 * The meta object literal for the '{@link asaproject.model.asa.impl.ArchitecturalSystemImpl <em>Architectural System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see asaproject.model.asa.impl.ArchitecturalSystemImpl
		 * @see asaproject.model.asa.impl.AsaPackageImpl#getArchitecturalSystem()
		 * @generated
		 */
		EClass ARCHITECTURAL_SYSTEM = eINSTANCE.getArchitecturalSystem();

		/**
		 * The meta object literal for the '<em><b>Architectural Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURAL_SYSTEM__ARCHITECTURAL_ELEMENTS = eINSTANCE
				.getArchitecturalSystem_ArchitecturalElements();

	}

} //AsaPackage
