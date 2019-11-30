/**
 */
package asaproject.model.asa.M1.impl;

import asaproject.model.asa.AsaPackage;

import asaproject.model.asa.M1.Client;
import asaproject.model.asa.M1.Client_Server_System;
import asaproject.model.asa.M1.M1Factory;
import asaproject.model.asa.M1.M1Package;
import asaproject.model.asa.M1.Server;
import asaproject.model.asa.M1.rpc;

import asaproject.model.asa.impl.AsaPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class M1PackageImpl extends EPackageImpl implements M1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass client_Server_SystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpcEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see asaproject.model.asa.M1.M1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private M1PackageImpl() {
		super(eNS_URI, M1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link M1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static M1Package init() {
		if (isInited)
			return (M1Package) EPackage.Registry.INSTANCE.getEPackage(M1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredM1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		M1PackageImpl theM1Package = registeredM1Package instanceof M1PackageImpl ? (M1PackageImpl) registeredM1Package
				: new M1PackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AsaPackage.eNS_URI);
		AsaPackageImpl theAsaPackage = (AsaPackageImpl) (registeredPackage instanceof AsaPackageImpl ? registeredPackage
				: AsaPackage.eINSTANCE);

		// Create package meta-data objects
		theM1Package.createPackageContents();
		theAsaPackage.createPackageContents();

		// Initialize created meta-data
		theM1Package.initializePackageContents();
		theAsaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theM1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(M1Package.eNS_URI, theM1Package);
		return theM1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClient_Server_System() {
		return client_Server_SystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getrpc() {
		return rpcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public M1Factory getM1Factory() {
		return (M1Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		client_Server_SystemEClass = createEClass(CLIENT_SERVER_SYSTEM);

		clientEClass = createEClass(CLIENT);

		serverEClass = createEClass(SERVER);

		rpcEClass = createEClass(RPC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AsaPackage theAsaPackage = (AsaPackage) EPackage.Registry.INSTANCE.getEPackage(AsaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		client_Server_SystemEClass.getESuperTypes().add(theAsaPackage.getConfiguration());
		clientEClass.getESuperTypes().add(theAsaPackage.getComponent());
		serverEClass.getESuperTypes().add(theAsaPackage.getComponent());
		rpcEClass.getESuperTypes().add(theAsaPackage.getConnector());

		// Initialize classes, features, and operations; add parameters
		initEClass(client_Server_SystemEClass, Client_Server_System.class, "Client_Server_System", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rpcEClass, rpc.class, "rpc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //M1PackageImpl
