/**
 * generated by Xtext 2.25.0
 */
package org.xtext.jsonProject.jsonProject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Entries</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.jsonProject.jsonProject.JsonEntries#getListEntries <em>List Entries</em>}</li>
 * </ul>
 *
 * @see org.xtext.jsonProject.jsonProject.JsonProjectPackage#getJsonEntries()
 * @model
 * @generated
 */
public interface JsonEntries extends JsonObject
{
  /**
   * Returns the value of the '<em><b>List Entries</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.jsonProject.jsonProject.JsonEntry}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Entries</em>' containment reference list.
   * @see org.xtext.jsonProject.jsonProject.JsonProjectPackage#getJsonEntries_ListEntries()
   * @model containment="true"
   * @generated
   */
  EList<JsonEntry> getListEntries();

} // JsonEntries
