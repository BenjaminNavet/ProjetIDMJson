/**
 * generated by Xtext 2.25.0
 */
package org.xtext.jsonProject.jsonProject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mult</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.jsonProject.jsonProject.Mult#getPathTOStore <em>Path TO Store</em>}</li>
 *   <li>{@link org.xtext.jsonProject.jsonProject.Mult#getPathToMult <em>Path To Mult</em>}</li>
 * </ul>
 *
 * @see org.xtext.jsonProject.jsonProject.JsonProjectPackage#getMult()
 * @model
 * @generated
 */
public interface Mult extends Operation
{
  /**
   * Returns the value of the '<em><b>Path TO Store</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path TO Store</em>' containment reference.
   * @see #setPathTOStore(Path)
   * @see org.xtext.jsonProject.jsonProject.JsonProjectPackage#getMult_PathTOStore()
   * @model containment="true"
   * @generated
   */
  Path getPathTOStore();

  /**
   * Sets the value of the '{@link org.xtext.jsonProject.jsonProject.Mult#getPathTOStore <em>Path TO Store</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path TO Store</em>' containment reference.
   * @see #getPathTOStore()
   * @generated
   */
  void setPathTOStore(Path value);

  /**
   * Returns the value of the '<em><b>Path To Mult</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path To Mult</em>' containment reference.
   * @see #setPathToMult(Path)
   * @see org.xtext.jsonProject.jsonProject.JsonProjectPackage#getMult_PathToMult()
   * @model containment="true"
   * @generated
   */
  Path getPathToMult();

  /**
   * Sets the value of the '{@link org.xtext.jsonProject.jsonProject.Mult#getPathToMult <em>Path To Mult</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path To Mult</em>' containment reference.
   * @see #getPathToMult()
   * @generated
   */
  void setPathToMult(Path value);

} // Mult
