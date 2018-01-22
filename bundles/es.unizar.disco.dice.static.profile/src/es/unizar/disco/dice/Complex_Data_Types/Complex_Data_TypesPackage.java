/**
 */
package es.unizar.disco.dice.Complex_Data_Types;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Data_Types'"
 * @generated
 */
public interface Complex_Data_TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Complex_Data_Types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://es.unizar.disco.dice/libraries/Complex_Data_Types/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Complex_Data_Types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Complex_Data_TypesPackage eINSTANCE = es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.DiceDataVolumeImpl <em>Dice Data Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.DiceDataVolumeImpl
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDiceDataVolume()
	 * @generated
	 */
	int DICE_DATA_VOLUME = 0;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_DATA_VOLUME__VOLUME = 0;

	/**
	 * The number of structural features of the '<em>Dice Data Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_DATA_VOLUME_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.DiceDataSpecificationImpl <em>Dice Data Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.DiceDataSpecificationImpl
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDiceDataSpecification()
	 * @generated
	 */
	int DICE_DATA_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_DATA_SPECIFICATION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_DATA_SPECIFICATION__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Ref Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_DATA_SPECIFICATION__REF_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Ref Data Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_DATA_SPECIFICATION__REF_DATA_FORMAT = 3;

	/**
	 * The number of structural features of the '<em>Dice Data Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_DATA_SPECIFICATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.DiceChannelSpecificationImpl <em>Dice Channel Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.DiceChannelSpecificationImpl
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDiceChannelSpecification()
	 * @generated
	 */
	int DICE_CHANNEL_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL_SPECIFICATION__RATE = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL_SPECIFICATION__SIZE = 1;

	/**
	 * The number of structural features of the '<em>Dice Channel Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.RequiredAttributeImpl <em>Required Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.RequiredAttributeImpl
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getRequiredAttribute()
	 * @generated
	 */
	int REQUIRED_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Reference Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ATTRIBUTE__REFERENCE_NODE = 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ATTRIBUTE__ATTRIBUTE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Required Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.FirewallRuleImpl <em>Firewall Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.FirewallRuleImpl
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getFirewallRule()
	 * @generated
	 */
	int FIREWALL_RULE = 4;

	/**
	 * The feature id for the '<em><b>Allowed Ip Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE__ALLOWED_IP_PREFIX = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE__PORT = 1;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE__PROTOCOL = 2;

	/**
	 * The number of structural features of the '<em>Firewall Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_RULE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.MongoDBShardImpl <em>Mongo DB Shard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.MongoDBShardImpl
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getMongoDBShard()
	 * @generated
	 */
	int MONGO_DB_SHARD = 5;

	/**
	 * The feature id for the '<em><b>NInstances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB_SHARD__NINSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Host Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB_SHARD__HOST_SIZE = 1;

	/**
	 * The number of structural features of the '<em>Mongo DB Shard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONGO_DB_SHARD_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.PortMappingImpl <em>Port Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.PortMappingImpl
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getPortMapping()
	 * @generated
	 */
	int PORT_MAPPING = 6;

	/**
	 * The feature id for the '<em><b>In Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_MAPPING__IN_PORT = 0;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_MAPPING__OUT_PORT = 1;

	/**
	 * The number of structural features of the '<em>Port Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.EnvironmentVariableImpl <em>Environment Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.EnvironmentVariableImpl
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getEnvironmentVariable()
	 * @generated
	 */
	int ENVIRONMENT_VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARIABLE__VARIABLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Variable Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARIABLE__VARIABLE_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARIABLE__DEFAULT_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Environment Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_VARIABLE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataVolume <em>Dice Data Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Data Volume</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.DiceDataVolume
	 * @generated
	 */
	EClass getDiceDataVolume();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataVolume#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.DiceDataVolume#getVolume()
	 * @see #getDiceDataVolume()
	 * @generated
	 */
	EAttribute getDiceDataVolume_Volume();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification <em>Dice Data Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Data Specification</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification
	 * @generated
	 */
	EClass getDiceDataSpecification();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getDescription()
	 * @see #getDiceDataSpecification()
	 * @generated
	 */
	EAttribute getDiceDataSpecification_Description();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getSize()
	 * @see #getDiceDataSpecification()
	 * @generated
	 */
	EAttribute getDiceDataSpecification_Size();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getRefModel <em>Ref Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Model</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getRefModel()
	 * @see #getDiceDataSpecification()
	 * @generated
	 */
	EAttribute getDiceDataSpecification_RefModel();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getRefDataFormat <em>Ref Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Data Format</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getRefDataFormat()
	 * @see #getDiceDataSpecification()
	 * @generated
	 */
	EAttribute getDiceDataSpecification_RefDataFormat();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.Complex_Data_Types.DiceChannelSpecification <em>Dice Channel Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Channel Specification</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.DiceChannelSpecification
	 * @generated
	 */
	EClass getDiceChannelSpecification();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.DiceChannelSpecification#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.DiceChannelSpecification#getRate()
	 * @see #getDiceChannelSpecification()
	 * @generated
	 */
	EAttribute getDiceChannelSpecification_Rate();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.DiceChannelSpecification#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.DiceChannelSpecification#getSize()
	 * @see #getDiceChannelSpecification()
	 * @generated
	 */
	EAttribute getDiceChannelSpecification_Size();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.Complex_Data_Types.RequiredAttribute <em>Required Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Attribute</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.RequiredAttribute
	 * @generated
	 */
	EClass getRequiredAttribute();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.RequiredAttribute#getReferenceNode <em>Reference Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Node</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.RequiredAttribute#getReferenceNode()
	 * @see #getRequiredAttribute()
	 * @generated
	 */
	EAttribute getRequiredAttribute_ReferenceNode();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.RequiredAttribute#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.RequiredAttribute#getAttributeName()
	 * @see #getRequiredAttribute()
	 * @generated
	 */
	EAttribute getRequiredAttribute_AttributeName();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.Complex_Data_Types.FirewallRule <em>Firewall Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firewall Rule</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.FirewallRule
	 * @generated
	 */
	EClass getFirewallRule();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.FirewallRule#getAllowedIpPrefix <em>Allowed Ip Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allowed Ip Prefix</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.FirewallRule#getAllowedIpPrefix()
	 * @see #getFirewallRule()
	 * @generated
	 */
	EAttribute getFirewallRule_AllowedIpPrefix();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.FirewallRule#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.FirewallRule#getPort()
	 * @see #getFirewallRule()
	 * @generated
	 */
	EAttribute getFirewallRule_Port();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.FirewallRule#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.FirewallRule#getProtocol()
	 * @see #getFirewallRule()
	 * @generated
	 */
	EAttribute getFirewallRule_Protocol();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.Complex_Data_Types.MongoDBShard <em>Mongo DB Shard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mongo DB Shard</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.MongoDBShard
	 * @generated
	 */
	EClass getMongoDBShard();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.MongoDBShard#getNInstances <em>NInstances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NInstances</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.MongoDBShard#getNInstances()
	 * @see #getMongoDBShard()
	 * @generated
	 */
	EAttribute getMongoDBShard_NInstances();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.MongoDBShard#getHostSize <em>Host Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Size</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.MongoDBShard#getHostSize()
	 * @see #getMongoDBShard()
	 * @generated
	 */
	EAttribute getMongoDBShard_HostSize();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.Complex_Data_Types.PortMapping <em>Port Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Mapping</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.PortMapping
	 * @generated
	 */
	EClass getPortMapping();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.PortMapping#getInPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Port</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.PortMapping#getInPort()
	 * @see #getPortMapping()
	 * @generated
	 */
	EAttribute getPortMapping_InPort();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.PortMapping#getOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Port</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.PortMapping#getOutPort()
	 * @see #getPortMapping()
	 * @generated
	 */
	EAttribute getPortMapping_OutPort();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.Complex_Data_Types.EnvironmentVariable <em>Environment Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Variable</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.EnvironmentVariable
	 * @generated
	 */
	EClass getEnvironmentVariable();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.EnvironmentVariable#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.EnvironmentVariable#getVariableName()
	 * @see #getEnvironmentVariable()
	 * @generated
	 */
	EAttribute getEnvironmentVariable_VariableName();

	/**
	 * Returns the meta object for the containment reference '{@link es.unizar.disco.dice.Complex_Data_Types.EnvironmentVariable#getVariableDefinition <em>Variable Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Definition</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.EnvironmentVariable#getVariableDefinition()
	 * @see #getEnvironmentVariable()
	 * @generated
	 */
	EReference getEnvironmentVariable_VariableDefinition();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.EnvironmentVariable#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.EnvironmentVariable#getDefaultValue()
	 * @see #getEnvironmentVariable()
	 * @generated
	 */
	EAttribute getEnvironmentVariable_DefaultValue();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Complex_Data_TypesFactory getComplex_Data_TypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.DiceDataVolumeImpl <em>Dice Data Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.DiceDataVolumeImpl
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDiceDataVolume()
		 * @generated
		 */
		EClass DICE_DATA_VOLUME = eINSTANCE.getDiceDataVolume();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_DATA_VOLUME__VOLUME = eINSTANCE.getDiceDataVolume_Volume();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.DiceDataSpecificationImpl <em>Dice Data Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.DiceDataSpecificationImpl
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDiceDataSpecification()
		 * @generated
		 */
		EClass DICE_DATA_SPECIFICATION = eINSTANCE.getDiceDataSpecification();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_DATA_SPECIFICATION__DESCRIPTION = eINSTANCE.getDiceDataSpecification_Description();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_DATA_SPECIFICATION__SIZE = eINSTANCE.getDiceDataSpecification_Size();

		/**
		 * The meta object literal for the '<em><b>Ref Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_DATA_SPECIFICATION__REF_MODEL = eINSTANCE.getDiceDataSpecification_RefModel();

		/**
		 * The meta object literal for the '<em><b>Ref Data Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_DATA_SPECIFICATION__REF_DATA_FORMAT = eINSTANCE.getDiceDataSpecification_RefDataFormat();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.DiceChannelSpecificationImpl <em>Dice Channel Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.DiceChannelSpecificationImpl
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDiceChannelSpecification()
		 * @generated
		 */
		EClass DICE_CHANNEL_SPECIFICATION = eINSTANCE.getDiceChannelSpecification();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_CHANNEL_SPECIFICATION__RATE = eINSTANCE.getDiceChannelSpecification_Rate();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_CHANNEL_SPECIFICATION__SIZE = eINSTANCE.getDiceChannelSpecification_Size();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.RequiredAttributeImpl <em>Required Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.RequiredAttributeImpl
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getRequiredAttribute()
		 * @generated
		 */
		EClass REQUIRED_ATTRIBUTE = eINSTANCE.getRequiredAttribute();

		/**
		 * The meta object literal for the '<em><b>Reference Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_ATTRIBUTE__REFERENCE_NODE = eINSTANCE.getRequiredAttribute_ReferenceNode();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRED_ATTRIBUTE__ATTRIBUTE_NAME = eINSTANCE.getRequiredAttribute_AttributeName();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.FirewallRuleImpl <em>Firewall Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.FirewallRuleImpl
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getFirewallRule()
		 * @generated
		 */
		EClass FIREWALL_RULE = eINSTANCE.getFirewallRule();

		/**
		 * The meta object literal for the '<em><b>Allowed Ip Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREWALL_RULE__ALLOWED_IP_PREFIX = eINSTANCE.getFirewallRule_AllowedIpPrefix();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREWALL_RULE__PORT = eINSTANCE.getFirewallRule_Port();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIREWALL_RULE__PROTOCOL = eINSTANCE.getFirewallRule_Protocol();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.MongoDBShardImpl <em>Mongo DB Shard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.MongoDBShardImpl
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getMongoDBShard()
		 * @generated
		 */
		EClass MONGO_DB_SHARD = eINSTANCE.getMongoDBShard();

		/**
		 * The meta object literal for the '<em><b>NInstances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_DB_SHARD__NINSTANCES = eINSTANCE.getMongoDBShard_NInstances();

		/**
		 * The meta object literal for the '<em><b>Host Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONGO_DB_SHARD__HOST_SIZE = eINSTANCE.getMongoDBShard_HostSize();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.PortMappingImpl <em>Port Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.PortMappingImpl
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getPortMapping()
		 * @generated
		 */
		EClass PORT_MAPPING = eINSTANCE.getPortMapping();

		/**
		 * The meta object literal for the '<em><b>In Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_MAPPING__IN_PORT = eINSTANCE.getPortMapping_InPort();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_MAPPING__OUT_PORT = eINSTANCE.getPortMapping_OutPort();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.EnvironmentVariableImpl <em>Environment Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.EnvironmentVariableImpl
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getEnvironmentVariable()
		 * @generated
		 */
		EClass ENVIRONMENT_VARIABLE = eINSTANCE.getEnvironmentVariable();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_VARIABLE__VARIABLE_NAME = eINSTANCE.getEnvironmentVariable_VariableName();

		/**
		 * The meta object literal for the '<em><b>Variable Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_VARIABLE__VARIABLE_DEFINITION = eINSTANCE.getEnvironmentVariable_VariableDefinition();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_VARIABLE__DEFAULT_VALUE = eINSTANCE.getEnvironmentVariable_DefaultValue();

	}

} //Complex_Data_TypesPackage
