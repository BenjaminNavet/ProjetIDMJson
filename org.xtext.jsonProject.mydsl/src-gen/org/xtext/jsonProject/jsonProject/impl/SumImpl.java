/**
 * generated by Xtext 2.25.0
 */
package org.xtext.jsonProject.jsonProject.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.jsonProject.jsonProject.JsonProjectPackage;
import org.xtext.jsonProject.jsonProject.Path;
import org.xtext.jsonProject.jsonProject.Sum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.jsonProject.jsonProject.impl.SumImpl#getPathTOStore <em>Path TO Store</em>}</li>
 *   <li>{@link org.xtext.jsonProject.jsonProject.impl.SumImpl#getPathToAdd <em>Path To Add</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SumImpl extends OperationImpl implements Sum
{
  /**
   * The cached value of the '{@link #getPathTOStore() <em>Path TO Store</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPathTOStore()
   * @generated
   * @ordered
   */
  protected Path pathTOStore;

  /**
   * The cached value of the '{@link #getPathToAdd() <em>Path To Add</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPathToAdd()
   * @generated
   * @ordered
   */
  protected Path pathToAdd;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SumImpl()
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
    return JsonProjectPackage.Literals.SUM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Path getPathTOStore()
  {
    return pathTOStore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPathTOStore(Path newPathTOStore, NotificationChain msgs)
  {
    Path oldPathTOStore = pathTOStore;
    pathTOStore = newPathTOStore;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonProjectPackage.SUM__PATH_TO_STORE, oldPathTOStore, newPathTOStore);
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
  public void setPathTOStore(Path newPathTOStore)
  {
    if (newPathTOStore != pathTOStore)
    {
      NotificationChain msgs = null;
      if (pathTOStore != null)
        msgs = ((InternalEObject)pathTOStore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonProjectPackage.SUM__PATH_TO_STORE, null, msgs);
      if (newPathTOStore != null)
        msgs = ((InternalEObject)newPathTOStore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonProjectPackage.SUM__PATH_TO_STORE, null, msgs);
      msgs = basicSetPathTOStore(newPathTOStore, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonProjectPackage.SUM__PATH_TO_STORE, newPathTOStore, newPathTOStore));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Path getPathToAdd()
  {
    return pathToAdd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPathToAdd(Path newPathToAdd, NotificationChain msgs)
  {
    Path oldPathToAdd = pathToAdd;
    pathToAdd = newPathToAdd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonProjectPackage.SUM__PATH_TO_ADD, oldPathToAdd, newPathToAdd);
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
  public void setPathToAdd(Path newPathToAdd)
  {
    if (newPathToAdd != pathToAdd)
    {
      NotificationChain msgs = null;
      if (pathToAdd != null)
        msgs = ((InternalEObject)pathToAdd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonProjectPackage.SUM__PATH_TO_ADD, null, msgs);
      if (newPathToAdd != null)
        msgs = ((InternalEObject)newPathToAdd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonProjectPackage.SUM__PATH_TO_ADD, null, msgs);
      msgs = basicSetPathToAdd(newPathToAdd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JsonProjectPackage.SUM__PATH_TO_ADD, newPathToAdd, newPathToAdd));
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
      case JsonProjectPackage.SUM__PATH_TO_STORE:
        return basicSetPathTOStore(null, msgs);
      case JsonProjectPackage.SUM__PATH_TO_ADD:
        return basicSetPathToAdd(null, msgs);
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
      case JsonProjectPackage.SUM__PATH_TO_STORE:
        return getPathTOStore();
      case JsonProjectPackage.SUM__PATH_TO_ADD:
        return getPathToAdd();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JsonProjectPackage.SUM__PATH_TO_STORE:
        setPathTOStore((Path)newValue);
        return;
      case JsonProjectPackage.SUM__PATH_TO_ADD:
        setPathToAdd((Path)newValue);
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
      case JsonProjectPackage.SUM__PATH_TO_STORE:
        setPathTOStore((Path)null);
        return;
      case JsonProjectPackage.SUM__PATH_TO_ADD:
        setPathToAdd((Path)null);
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
      case JsonProjectPackage.SUM__PATH_TO_STORE:
        return pathTOStore != null;
      case JsonProjectPackage.SUM__PATH_TO_ADD:
        return pathToAdd != null;
    }
    return super.eIsSet(featureID);
  }

} //SumImpl