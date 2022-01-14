/**
 * generated by Xtext 2.25.0
 */
package org.xtext.jsonProject.jsonProject.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.jsonProject.jsonProject.Final;
import org.xtext.jsonProject.jsonProject.Initialisation;
import org.xtext.jsonProject.jsonProject.JsonCommand;
import org.xtext.jsonProject.jsonProject.JsonProjectPackage;
import org.xtext.jsonProject.jsonProject.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.jsonProject.jsonProject.impl.JsonCommandImpl#getInit <em>Init</em>}</li>
 *   <li>{@link org.xtext.jsonProject.jsonProject.impl.JsonCommandImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.xtext.jsonProject.jsonProject.impl.JsonCommandImpl#getFinal <em>Final</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JsonCommandImpl extends MinimalEObjectImpl.Container implements JsonCommand
{
  /**
   * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit()
   * @generated
   * @ordered
   */
  protected Initialisation init;

  /**
   * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperations()
   * @generated
   * @ordered
   */
  protected EList<Operation> operations;

  /**
   * The cached value of the '{@link #getFinal() <em>Final</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinal()
   * @generated
   * @ordered
   */
  protected Final final_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JsonCommandImpl()
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
    return JsonProjectPackage.Literals.JSON_COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Initialisation getInit()
  {
    return init;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInit(Initialisation newInit, NotificationChain msgs)
  {
    Initialisation oldInit = init;
    init = newInit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonProjectPackage.JSON_COMMAND__INIT, oldInit, newInit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInit(Initialisation newInit)
  {
    if (newInit != init)
    {
      NotificationChain msgs = null;
      if (init != null)
        msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonProjectPackage.JSON_COMMAND__INIT, null, msgs);
      if (newInit != null)
        msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonProjectPackage.JSON_COMMAND__INIT, null, msgs);
      msgs = basicSetInit(newInit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonProjectPackage.JSON_COMMAND__INIT, newInit, newInit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Operation> getOperations()
  {
    if (operations == null)
    {
      operations = new EObjectContainmentEList<Operation>(Operation.class, this, JsonProjectPackage.JSON_COMMAND__OPERATIONS);
    }
    return operations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Final getFinal()
  {
    return final_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFinal(Final newFinal, NotificationChain msgs)
  {
    Final oldFinal = final_;
    final_ = newFinal;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonProjectPackage.JSON_COMMAND__FINAL, oldFinal, newFinal);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFinal(Final newFinal)
  {
    if (newFinal != final_)
    {
      NotificationChain msgs = null;
      if (final_ != null)
        msgs = ((InternalEObject)final_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonProjectPackage.JSON_COMMAND__FINAL, null, msgs);
      if (newFinal != null)
        msgs = ((InternalEObject)newFinal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonProjectPackage.JSON_COMMAND__FINAL, null, msgs);
      msgs = basicSetFinal(newFinal, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonProjectPackage.JSON_COMMAND__FINAL, newFinal, newFinal));
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
      case JsonProjectPackage.JSON_COMMAND__INIT:
        return basicSetInit(null, msgs);
      case JsonProjectPackage.JSON_COMMAND__OPERATIONS:
        return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
      case JsonProjectPackage.JSON_COMMAND__FINAL:
        return basicSetFinal(null, msgs);
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
      case JsonProjectPackage.JSON_COMMAND__INIT:
        return getInit();
      case JsonProjectPackage.JSON_COMMAND__OPERATIONS:
        return getOperations();
      case JsonProjectPackage.JSON_COMMAND__FINAL:
        return getFinal();
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
      case JsonProjectPackage.JSON_COMMAND__INIT:
        setInit((Initialisation)newValue);
        return;
      case JsonProjectPackage.JSON_COMMAND__OPERATIONS:
        getOperations().clear();
        getOperations().addAll((Collection<? extends Operation>)newValue);
        return;
      case JsonProjectPackage.JSON_COMMAND__FINAL:
        setFinal((Final)newValue);
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
      case JsonProjectPackage.JSON_COMMAND__INIT:
        setInit((Initialisation)null);
        return;
      case JsonProjectPackage.JSON_COMMAND__OPERATIONS:
        getOperations().clear();
        return;
      case JsonProjectPackage.JSON_COMMAND__FINAL:
        setFinal((Final)null);
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
      case JsonProjectPackage.JSON_COMMAND__INIT:
        return init != null;
      case JsonProjectPackage.JSON_COMMAND__OPERATIONS:
        return operations != null && !operations.isEmpty();
      case JsonProjectPackage.JSON_COMMAND__FINAL:
        return final_ != null;
    }
    return super.eIsSet(featureID);
  }

} //JsonCommandImpl
