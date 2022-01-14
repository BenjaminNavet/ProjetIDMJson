/**
 * generated by Xtext 2.25.0
 */
package org.xtext.jsonProject.jsonProject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.jsonProject.jsonProject.Final#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see org.xtext.jsonProject.jsonProject.JsonProjectPackage#getFinal()
 * @model
 * @generated
 */
public interface Final extends EObject
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' containment reference.
   * @see #setPath(Path)
   * @see org.xtext.jsonProject.jsonProject.JsonProjectPackage#getFinal_Path()
   * @model containment="true"
   * @generated
   */
  Path getPath();

  /**
   * Sets the value of the '{@link org.xtext.jsonProject.jsonProject.Final#getPath <em>Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' containment reference.
   * @see #getPath()
   * @generated
   */
  void setPath(Path value);

} // Final
