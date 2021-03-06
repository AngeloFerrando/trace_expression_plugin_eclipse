/**
 * generated by Xtext 2.12.0
 */
package it.unige.dibris.trace_expression_language.tExp.impl;

import it.unige.dibris.trace_expression_language.tExp.Channel;
import it.unige.dibris.trace_expression_language.tExp.Constraint;
import it.unige.dibris.trace_expression_language.tExp.EventType;
import it.unige.dibris.trace_expression_language.tExp.Partition;
import it.unige.dibris.trace_expression_language.tExp.Role;
import it.unige.dibris.trace_expression_language.tExp.TExpPackage;
import it.unige.dibris.trace_expression_language.tExp.Term;
import it.unige.dibris.trace_expression_language.tExp.TraceExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getBodyL <em>Body L</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getTerms <em>Terms</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getRolesL <em>Roles L</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getTypesL <em>Types L</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getModulesL <em>Modules L</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getDecentralizedL <em>Decentralized L</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getDecentralized <em>Decentralized</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getPartitionL <em>Partition L</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getPartition <em>Partition</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getConstraintsL <em>Constraints L</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getGuiL <em>Gui L</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getGui <em>Gui</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getMinimalL <em>Minimal L</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getMinimal <em>Minimal</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getThresholdL <em>Threshold L</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getChannelsL <em>Channels L</em>}</li>
 *   <li>{@link it.unige.dibris.trace_expression_language.tExp.impl.TraceExpressionImpl#getChannels <em>Channels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceExpressionImpl extends MinimalEObjectImpl.Container implements TraceExpression
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getBodyL() <em>Body L</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodyL()
   * @generated
   * @ordered
   */
  protected EList<String> bodyL;

  /**
   * The cached value of the '{@link #getTerms() <em>Terms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerms()
   * @generated
   * @ordered
   */
  protected EList<Term> terms;

  /**
   * The cached value of the '{@link #getRolesL() <em>Roles L</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRolesL()
   * @generated
   * @ordered
   */
  protected EList<String> rolesL;

  /**
   * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoles()
   * @generated
   * @ordered
   */
  protected EList<Role> roles;

  /**
   * The cached value of the '{@link #getTypesL() <em>Types L</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypesL()
   * @generated
   * @ordered
   */
  protected EList<String> typesL;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<EventType> types;

  /**
   * The cached value of the '{@link #getModulesL() <em>Modules L</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModulesL()
   * @generated
   * @ordered
   */
  protected EList<String> modulesL;

  /**
   * The cached value of the '{@link #getModules() <em>Modules</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModules()
   * @generated
   * @ordered
   */
  protected EList<String> modules;

  /**
   * The cached value of the '{@link #getDecentralizedL() <em>Decentralized L</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecentralizedL()
   * @generated
   * @ordered
   */
  protected EList<String> decentralizedL;

  /**
   * The cached value of the '{@link #getDecentralized() <em>Decentralized</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecentralized()
   * @generated
   * @ordered
   */
  protected EList<String> decentralized;

  /**
   * The cached value of the '{@link #getPartitionL() <em>Partition L</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartitionL()
   * @generated
   * @ordered
   */
  protected EList<String> partitionL;

  /**
   * The cached value of the '{@link #getPartition() <em>Partition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartition()
   * @generated
   * @ordered
   */
  protected EList<Partition> partition;

  /**
   * The cached value of the '{@link #getConstraintsL() <em>Constraints L</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraintsL()
   * @generated
   * @ordered
   */
  protected EList<String> constraintsL;

  /**
   * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraints()
   * @generated
   * @ordered
   */
  protected EList<Constraint> constraints;

  /**
   * The cached value of the '{@link #getGuiL() <em>Gui L</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuiL()
   * @generated
   * @ordered
   */
  protected EList<String> guiL;

  /**
   * The cached value of the '{@link #getGui() <em>Gui</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGui()
   * @generated
   * @ordered
   */
  protected EList<String> gui;

  /**
   * The cached value of the '{@link #getMinimalL() <em>Minimal L</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinimalL()
   * @generated
   * @ordered
   */
  protected EList<String> minimalL;

  /**
   * The cached value of the '{@link #getMinimal() <em>Minimal</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinimal()
   * @generated
   * @ordered
   */
  protected EList<String> minimal;

  /**
   * The cached value of the '{@link #getThresholdL() <em>Threshold L</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThresholdL()
   * @generated
   * @ordered
   */
  protected EList<String> thresholdL;

  /**
   * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThreshold()
   * @generated
   * @ordered
   */
  protected EList<String> threshold;

  /**
   * The cached value of the '{@link #getChannelsL() <em>Channels L</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannelsL()
   * @generated
   * @ordered
   */
  protected EList<String> channelsL;

  /**
   * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannels()
   * @generated
   * @ordered
   */
  protected EList<Channel> channels;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TraceExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TExpPackage.Literals.TRACE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TExpPackage.TRACE_EXPRESSION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getBodyL()
  {
    if (bodyL == null)
    {
      bodyL = new EDataTypeEList<String>(String.class, this, TExpPackage.TRACE_EXPRESSION__BODY_L);
    }
    return bodyL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Term> getTerms()
  {
    if (terms == null)
    {
      terms = new EObjectContainmentEList<Term>(Term.class, this, TExpPackage.TRACE_EXPRESSION__TERMS);
    }
    return terms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getRolesL()
  {
    if (rolesL == null)
    {
      rolesL = new EDataTypeEList<String>(String.class, this, TExpPackage.TRACE_EXPRESSION__ROLES_L);
    }
    return rolesL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Role> getRoles()
  {
    if (roles == null)
    {
      roles = new EObjectContainmentEList<Role>(Role.class, this, TExpPackage.TRACE_EXPRESSION__ROLES);
    }
    return roles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTypesL()
  {
    if (typesL == null)
    {
      typesL = new EDataTypeEList<String>(String.class, this, TExpPackage.TRACE_EXPRESSION__TYPES_L);
    }
    return typesL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EventType> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<EventType>(EventType.class, this, TExpPackage.TRACE_EXPRESSION__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getModulesL()
  {
    if (modulesL == null)
    {
      modulesL = new EDataTypeEList<String>(String.class, this, TExpPackage.TRACE_EXPRESSION__MODULES_L);
    }
    return modulesL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getModules()
  {
    if (modules == null)
    {
      modules = new EDataTypeEList<String>(String.class, this, TExpPackage.TRACE_EXPRESSION__MODULES);
    }
    return modules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDecentralizedL()
  {
    if (decentralizedL == null)
    {
      decentralizedL = new EDataTypeEList<String>(String.class, this, TExpPackage.TRACE_EXPRESSION__DECENTRALIZED_L);
    }
    return decentralizedL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDecentralized()
  {
    if (decentralized == null)
    {
      decentralized = new EDataTypeEList<String>(String.class, this, TExpPackage.TRACE_EXPRESSION__DECENTRALIZED);
    }
    return decentralized;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getPartitionL()
  {
    if (partitionL == null)
    {
      partitionL = new EDataTypeEList<String>(String.class, this, TExpPackage.TRACE_EXPRESSION__PARTITION_L);
    }
    return partitionL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Partition> getPartition()
  {
    if (partition == null)
    {
      partition = new EObjectContainmentEList<Partition>(Partition.class, this, TExpPackage.TRACE_EXPRESSION__PARTITION);
    }
    return partition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getConstraintsL()
  {
    if (constraintsL == null)
    {
      constraintsL = new EDataTypeEList<String>(String.class, this, TExpPackage.TRACE_EXPRESSION__CONSTRAINTS_L);
    }
    return constraintsL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getConstraints()
  {
    if (constraints == null)
    {
      constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, TExpPackage.TRACE_EXPRESSION__CONSTRAINTS);
    }
    return constraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getGuiL()
  {
    if (guiL == null)
    {
      guiL = new EDataTypeEList<String>(String.class, this, TExpPackage.TRACE_EXPRESSION__GUI_L);
    }
    return guiL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getGui()
  {
    if (gui == null)
    {
      gui = new EDataTypeEList<String>(String.class, this, TExpPackage.TRACE_EXPRESSION__GUI);
    }
    return gui;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getMinimalL()
  {
    if (minimalL == null)
    {
      minimalL = new EDataTypeEList<String>(String.class, this, TExpPackage.TRACE_EXPRESSION__MINIMAL_L);
    }
    return minimalL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getMinimal()
  {
    if (minimal == null)
    {
      minimal = new EDataTypeEList<String>(String.class, this, TExpPackage.TRACE_EXPRESSION__MINIMAL);
    }
    return minimal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getThresholdL()
  {
    if (thresholdL == null)
    {
      thresholdL = new EDataTypeEList<String>(String.class, this, TExpPackage.TRACE_EXPRESSION__THRESHOLD_L);
    }
    return thresholdL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getThreshold()
  {
    if (threshold == null)
    {
      threshold = new EDataTypeEList<String>(String.class, this, TExpPackage.TRACE_EXPRESSION__THRESHOLD);
    }
    return threshold;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getChannelsL()
  {
    if (channelsL == null)
    {
      channelsL = new EDataTypeEList<String>(String.class, this, TExpPackage.TRACE_EXPRESSION__CHANNELS_L);
    }
    return channelsL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Channel> getChannels()
  {
    if (channels == null)
    {
      channels = new EObjectContainmentEList<Channel>(Channel.class, this, TExpPackage.TRACE_EXPRESSION__CHANNELS);
    }
    return channels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TExpPackage.TRACE_EXPRESSION__TERMS:
        return ((InternalEList<?>)getTerms()).basicRemove(otherEnd, msgs);
      case TExpPackage.TRACE_EXPRESSION__ROLES:
        return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
      case TExpPackage.TRACE_EXPRESSION__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case TExpPackage.TRACE_EXPRESSION__PARTITION:
        return ((InternalEList<?>)getPartition()).basicRemove(otherEnd, msgs);
      case TExpPackage.TRACE_EXPRESSION__CONSTRAINTS:
        return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
      case TExpPackage.TRACE_EXPRESSION__CHANNELS:
        return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TExpPackage.TRACE_EXPRESSION__NAME:
        return getName();
      case TExpPackage.TRACE_EXPRESSION__BODY_L:
        return getBodyL();
      case TExpPackage.TRACE_EXPRESSION__TERMS:
        return getTerms();
      case TExpPackage.TRACE_EXPRESSION__ROLES_L:
        return getRolesL();
      case TExpPackage.TRACE_EXPRESSION__ROLES:
        return getRoles();
      case TExpPackage.TRACE_EXPRESSION__TYPES_L:
        return getTypesL();
      case TExpPackage.TRACE_EXPRESSION__TYPES:
        return getTypes();
      case TExpPackage.TRACE_EXPRESSION__MODULES_L:
        return getModulesL();
      case TExpPackage.TRACE_EXPRESSION__MODULES:
        return getModules();
      case TExpPackage.TRACE_EXPRESSION__DECENTRALIZED_L:
        return getDecentralizedL();
      case TExpPackage.TRACE_EXPRESSION__DECENTRALIZED:
        return getDecentralized();
      case TExpPackage.TRACE_EXPRESSION__PARTITION_L:
        return getPartitionL();
      case TExpPackage.TRACE_EXPRESSION__PARTITION:
        return getPartition();
      case TExpPackage.TRACE_EXPRESSION__CONSTRAINTS_L:
        return getConstraintsL();
      case TExpPackage.TRACE_EXPRESSION__CONSTRAINTS:
        return getConstraints();
      case TExpPackage.TRACE_EXPRESSION__GUI_L:
        return getGuiL();
      case TExpPackage.TRACE_EXPRESSION__GUI:
        return getGui();
      case TExpPackage.TRACE_EXPRESSION__MINIMAL_L:
        return getMinimalL();
      case TExpPackage.TRACE_EXPRESSION__MINIMAL:
        return getMinimal();
      case TExpPackage.TRACE_EXPRESSION__THRESHOLD_L:
        return getThresholdL();
      case TExpPackage.TRACE_EXPRESSION__THRESHOLD:
        return getThreshold();
      case TExpPackage.TRACE_EXPRESSION__CHANNELS_L:
        return getChannelsL();
      case TExpPackage.TRACE_EXPRESSION__CHANNELS:
        return getChannels();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TExpPackage.TRACE_EXPRESSION__NAME:
        setName((String)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__BODY_L:
        getBodyL().clear();
        getBodyL().addAll((Collection<? extends String>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__TERMS:
        getTerms().clear();
        getTerms().addAll((Collection<? extends Term>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__ROLES_L:
        getRolesL().clear();
        getRolesL().addAll((Collection<? extends String>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__ROLES:
        getRoles().clear();
        getRoles().addAll((Collection<? extends Role>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__TYPES_L:
        getTypesL().clear();
        getTypesL().addAll((Collection<? extends String>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends EventType>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__MODULES_L:
        getModulesL().clear();
        getModulesL().addAll((Collection<? extends String>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__MODULES:
        getModules().clear();
        getModules().addAll((Collection<? extends String>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__DECENTRALIZED_L:
        getDecentralizedL().clear();
        getDecentralizedL().addAll((Collection<? extends String>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__DECENTRALIZED:
        getDecentralized().clear();
        getDecentralized().addAll((Collection<? extends String>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__PARTITION_L:
        getPartitionL().clear();
        getPartitionL().addAll((Collection<? extends String>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__PARTITION:
        getPartition().clear();
        getPartition().addAll((Collection<? extends Partition>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__CONSTRAINTS_L:
        getConstraintsL().clear();
        getConstraintsL().addAll((Collection<? extends String>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__CONSTRAINTS:
        getConstraints().clear();
        getConstraints().addAll((Collection<? extends Constraint>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__GUI_L:
        getGuiL().clear();
        getGuiL().addAll((Collection<? extends String>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__GUI:
        getGui().clear();
        getGui().addAll((Collection<? extends String>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__MINIMAL_L:
        getMinimalL().clear();
        getMinimalL().addAll((Collection<? extends String>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__MINIMAL:
        getMinimal().clear();
        getMinimal().addAll((Collection<? extends String>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__THRESHOLD_L:
        getThresholdL().clear();
        getThresholdL().addAll((Collection<? extends String>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__THRESHOLD:
        getThreshold().clear();
        getThreshold().addAll((Collection<? extends String>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__CHANNELS_L:
        getChannelsL().clear();
        getChannelsL().addAll((Collection<? extends String>)newValue);
        return;
      case TExpPackage.TRACE_EXPRESSION__CHANNELS:
        getChannels().clear();
        getChannels().addAll((Collection<? extends Channel>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TExpPackage.TRACE_EXPRESSION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TExpPackage.TRACE_EXPRESSION__BODY_L:
        getBodyL().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__TERMS:
        getTerms().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__ROLES_L:
        getRolesL().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__ROLES:
        getRoles().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__TYPES_L:
        getTypesL().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__TYPES:
        getTypes().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__MODULES_L:
        getModulesL().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__MODULES:
        getModules().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__DECENTRALIZED_L:
        getDecentralizedL().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__DECENTRALIZED:
        getDecentralized().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__PARTITION_L:
        getPartitionL().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__PARTITION:
        getPartition().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__CONSTRAINTS_L:
        getConstraintsL().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__CONSTRAINTS:
        getConstraints().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__GUI_L:
        getGuiL().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__GUI:
        getGui().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__MINIMAL_L:
        getMinimalL().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__MINIMAL:
        getMinimal().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__THRESHOLD_L:
        getThresholdL().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__THRESHOLD:
        getThreshold().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__CHANNELS_L:
        getChannelsL().clear();
        return;
      case TExpPackage.TRACE_EXPRESSION__CHANNELS:
        getChannels().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TExpPackage.TRACE_EXPRESSION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TExpPackage.TRACE_EXPRESSION__BODY_L:
        return bodyL != null && !bodyL.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__TERMS:
        return terms != null && !terms.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__ROLES_L:
        return rolesL != null && !rolesL.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__ROLES:
        return roles != null && !roles.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__TYPES_L:
        return typesL != null && !typesL.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__TYPES:
        return types != null && !types.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__MODULES_L:
        return modulesL != null && !modulesL.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__MODULES:
        return modules != null && !modules.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__DECENTRALIZED_L:
        return decentralizedL != null && !decentralizedL.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__DECENTRALIZED:
        return decentralized != null && !decentralized.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__PARTITION_L:
        return partitionL != null && !partitionL.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__PARTITION:
        return partition != null && !partition.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__CONSTRAINTS_L:
        return constraintsL != null && !constraintsL.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__CONSTRAINTS:
        return constraints != null && !constraints.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__GUI_L:
        return guiL != null && !guiL.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__GUI:
        return gui != null && !gui.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__MINIMAL_L:
        return minimalL != null && !minimalL.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__MINIMAL:
        return minimal != null && !minimal.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__THRESHOLD_L:
        return thresholdL != null && !thresholdL.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__THRESHOLD:
        return threshold != null && !threshold.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__CHANNELS_L:
        return channelsL != null && !channelsL.isEmpty();
      case TExpPackage.TRACE_EXPRESSION__CHANNELS:
        return channels != null && !channels.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", bodyL: ");
    result.append(bodyL);
    result.append(", rolesL: ");
    result.append(rolesL);
    result.append(", typesL: ");
    result.append(typesL);
    result.append(", modulesL: ");
    result.append(modulesL);
    result.append(", modules: ");
    result.append(modules);
    result.append(", decentralizedL: ");
    result.append(decentralizedL);
    result.append(", decentralized: ");
    result.append(decentralized);
    result.append(", partitionL: ");
    result.append(partitionL);
    result.append(", constraintsL: ");
    result.append(constraintsL);
    result.append(", guiL: ");
    result.append(guiL);
    result.append(", gui: ");
    result.append(gui);
    result.append(", minimalL: ");
    result.append(minimalL);
    result.append(", minimal: ");
    result.append(minimal);
    result.append(", thresholdL: ");
    result.append(thresholdL);
    result.append(", threshold: ");
    result.append(threshold);
    result.append(", channelsL: ");
    result.append(channelsL);
    result.append(')');
    return result.toString();
  }

} //TraceExpressionImpl
