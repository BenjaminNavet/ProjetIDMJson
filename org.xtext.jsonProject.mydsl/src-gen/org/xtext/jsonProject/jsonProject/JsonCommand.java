/**
 * generated by Xtext 2.25.0
 */
package org.xtext.jsonProject.jsonProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.jsonProject.jsonProject.JsonCommand#getInit <em>Init</em>}</li>
 *   <li>{@link org.xtext.jsonProject.jsonProject.JsonCommand#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.xtext.jsonProject.jsonProject.JsonCommand#getFinal <em>Final</em>}</li>
 * </ul>
 *
 * @see org.xtext.jsonProject.jsonProject.JsonProjectPackage#getJsonCommand()
 * @model
 * @generated
 */
public interface JsonCommand extends EObject
{
  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference.
   * @see #setInit(Initialisation)
   * @see org.xtext.jsonProject.jsonProject.JsonProjectPackage#getJsonCommand_Init()
   * @model containment="true"
   * @generated
   */
  Initialisation getInit();

  /**
   * Sets the value of the '{@link org.xtext.jsonProject.jsonProject.JsonCommand#getInit <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' containment reference.
   * @see #getInit()
   * @generated
   */
  void setInit(Initialisation value);

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.jsonProject.jsonProject.Operation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference list.
   * @see org.xtext.jsonProject.jsonProject.JsonProjectPackage#getJsonCommand_Operations()
   * @model containment="true"
   * @generated
   */
  EList<Operation> getOperations();

  /**
   * Returns the value of the '<em><b>Final</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Final</em>' containment reference.
   * @see #setFinal(Final)
   * @see org.xtext.jsonProject.jsonProject.JsonProjectPackage#getJsonCommand_Final()
   * @model containment="true"
   * @generated
   */
  Final getFinal();

  /**
   * Sets the value of the '{@link org.xtext.jsonProject.jsonProject.JsonCommand#getFinal <em>Final</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Final</em>' containment reference.
   * @see #getFinal()
   * @generated
   */
  void setFinal(Final value);

} // JsonCommand