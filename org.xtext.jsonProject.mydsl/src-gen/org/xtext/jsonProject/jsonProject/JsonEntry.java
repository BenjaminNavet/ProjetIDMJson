/**
 * generated by Xtext 2.25.0
 */
package org.xtext.jsonProject.jsonProject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.jsonProject.jsonProject.JsonEntry#getKey <em>Key</em>}</li>
 *   <li>{@link org.xtext.jsonProject.jsonProject.JsonEntry#getJsonObject <em>Json Object</em>}</li>
 * </ul>
 *
 * @see org.xtext.jsonProject.jsonProject.JsonProjectPackage#getJsonEntry()
 * @model
 * @generated
 */
public interface JsonEntry extends EObject
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see org.xtext.jsonProject.jsonProject.JsonProjectPackage#getJsonEntry_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link org.xtext.jsonProject.jsonProject.JsonEntry#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

  /**
   * Returns the value of the '<em><b>Json Object</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Json Object</em>' containment reference.
   * @see #setJsonObject(JsonObject)
   * @see org.xtext.jsonProject.jsonProject.JsonProjectPackage#getJsonEntry_JsonObject()
   * @model containment="true"
   * @generated
   */
  JsonObject getJsonObject();

  /**
   * Sets the value of the '{@link org.xtext.jsonProject.jsonProject.JsonEntry#getJsonObject <em>Json Object</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Json Object</em>' containment reference.
   * @see #getJsonObject()
   * @generated
   */
  void setJsonObject(JsonObject value);

} // JsonEntry
