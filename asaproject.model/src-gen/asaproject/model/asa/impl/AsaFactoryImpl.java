/**
 */
package asaproject.model.asa.impl;

import asaproject.model.asa.*;

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
public class AsaFactoryImpl extends EFactoryImpl implements AsaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AsaFactory init() {
		try {
			AsaFactory theAsaFactory = (AsaFactory) EPackage.Registry.INSTANCE.getEFactory(AsaPackage.eNS_URI);
			if (theAsaFactory != null) {
				return theAsaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AsaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsaFactoryImpl() {
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
		case AsaPackage.CONFIGURATION:
			return createConfiguration();
		case AsaPackage.COMPONENT:
			return createComponent();
		case AsaPackage.REQUIRED_PORT:
			return createRequiredPort();
		case AsaPackage.PROVIDED_PORT:
			return createProvidedPort();
		case AsaPackage.CONNECTOR:
			return createConnector();
		case AsaPackage.REQUIRED_SERVICE:
			return createRequiredService();
		case AsaPackage.PROVIDED_SERVICE:
			return createProvidedService();
		case AsaPackage.PROPERTY:
			return createProperty();
		case AsaPackage.REQUIRED_ROLE:
			return createRequiredRole();
		case AsaPackage.PROVIDED_ROLE:
			return createProvidedRole();
		case AsaPackage.GLUE:
			return createGlue();
		case AsaPackage.BINDING:
			return createBinding();
		case AsaPackage.ATTACHMENT:
			return createAttachment();
		case AsaPackage.ARCHITECTURAL_SYSTEM:
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
	public AsaPackage getAsaPackage() {
		return (AsaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AsaPackage getPackage() {
		return AsaPackage.eINSTANCE;
	}

} //AsaFactoryImpl
