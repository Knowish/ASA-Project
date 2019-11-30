/**
 */
package asaproject.model.asa.M2.impl;

import asaproject.model.asa.M2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class M2FactoryImpl extends EFactoryImpl implements M2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static M2Factory init() {
		try {
			M2Factory theM2Factory = (M2Factory) EPackage.Registry.INSTANCE.getEFactory(M2Package.eNS_URI);
			if (theM2Factory != null) {
				return theM2Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new M2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case M2Package.CONFIGURATION:
			return createConfiguration();
		case M2Package.COMPONENT:
			return createComponent();
		case M2Package.REQUIRED_PORT:
			return createRequiredPort();
		case M2Package.PROVIDED_PORT:
			return createProvidedPort();
		case M2Package.CONNECTOR:
			return createConnector();
		case M2Package.REQUIRED_SERVICE:
			return createRequiredService();
		case M2Package.PROVIDED_SERVICE:
			return createProvidedService();
		case M2Package.PROPERTY:
			return createProperty();
		case M2Package.REQUIRED_ROLE:
			return createRequiredRole();
		case M2Package.PROVIDED_ROLE:
			return createProvidedRole();
		case M2Package.GLUE:
			return createGlue();
		case M2Package.BINDING:
			return createBinding();
		case M2Package.ATTACHMENT:
			return createAttachment();
		case M2Package.ARCHITECTURAL_SYSTEM:
			return createArchitecturalSystem();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPort createRequiredPort() {
		RequiredPortImpl requiredPort = new RequiredPortImpl();
		return requiredPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedPort createProvidedPort() {
		ProvidedPortImpl providedPort = new ProvidedPortImpl();
		return providedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredService createRequiredService() {
		RequiredServiceImpl requiredService = new RequiredServiceImpl();
		return requiredService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedService createProvidedService() {
		ProvidedServiceImpl providedService = new ProvidedServiceImpl();
		return providedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredRole createRequiredRole() {
		RequiredRoleImpl requiredRole = new RequiredRoleImpl();
		return requiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedRole createProvidedRole() {
		ProvidedRoleImpl providedRole = new ProvidedRoleImpl();
		return providedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glue createGlue() {
		GlueImpl glue = new GlueImpl();
		return glue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturalSystem createArchitecturalSystem() {
		ArchitecturalSystemImpl architecturalSystem = new ArchitecturalSystemImpl();
		return architecturalSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M2Package getM2Package() {
		return (M2Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static M2Package getPackage() {
		return M2Package.eINSTANCE;
	}

} //M2FactoryImpl
