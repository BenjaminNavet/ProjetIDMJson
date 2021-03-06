/**
 * generated by Xtext 2.25.0
 */
package org.xtext.jsonProject.jsonProject;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.jsonProject.jsonProject.JsonProjectPackage
 * @generated
 */
public interface JsonProjectFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JsonProjectFactory eINSTANCE = org.xtext.jsonProject.jsonProject.impl.JsonProjectFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Json Commands</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Commands</em>'.
   * @generated
   */
  JsonCommands createJsonCommands();

  /**
   * Returns a new object of class '<em>Json Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Command</em>'.
   * @generated
   */
  JsonCommand createJsonCommand();

  /**
   * Returns a new object of class '<em>Initialisation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Initialisation</em>'.
   * @generated
   */
  Initialisation createInitialisation();

  /**
   * Returns a new object of class '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Operation</em>'.
   * @generated
   */
  Operation createOperation();

  /**
   * Returns a new object of class '<em>Insert</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Insert</em>'.
   * @generated
   */
  Insert createInsert();

  /**
   * Returns a new object of class '<em>Path</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path</em>'.
   * @generated
   */
  Path createPath();

  /**
   * Returns a new object of class '<em>Modify</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Modify</em>'.
   * @generated
   */
  Modify createModify();

  /**
   * Returns a new object of class '<em>Sum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sum</em>'.
   * @generated
   */
  Sum createSum();

  /**
   * Returns a new object of class '<em>Remove</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remove</em>'.
   * @generated
   */
  Remove createRemove();

  /**
   * Returns a new object of class '<em>Mult</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mult</em>'.
   * @generated
   */
  Mult createMult();

  /**
   * Returns a new object of class '<em>Select</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select</em>'.
   * @generated
   */
  Select createSelect();

  /**
   * Returns a new object of class '<em>Final</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Final</em>'.
   * @generated
   */
  Final createFinal();

  /**
   * Returns a new object of class '<em>Store</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Store</em>'.
   * @generated
   */
  Store createStore();

  /**
   * Returns a new object of class '<em>Print</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Print</em>'.
   * @generated
   */
  Print createPrint();

  /**
   * Returns a new object of class '<em>Json Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Object</em>'.
   * @generated
   */
  JsonObject createJsonObject();

  /**
   * Returns a new object of class '<em>Json Primitive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Primitive</em>'.
   * @generated
   */
  JsonPrimitive createJsonPrimitive();

  /**
   * Returns a new object of class '<em>Array Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Object</em>'.
   * @generated
   */
  ArrayObject createArrayObject();

  /**
   * Returns a new object of class '<em>Boolean Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Object</em>'.
   * @generated
   */
  BooleanObject createBooleanObject();

  /**
   * Returns a new object of class '<em>String Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Object</em>'.
   * @generated
   */
  StringObject createStringObject();

  /**
   * Returns a new object of class '<em>Json Entries</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Entries</em>'.
   * @generated
   */
  JsonEntries createJsonEntries();

  /**
   * Returns a new object of class '<em>Json Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Json Entry</em>'.
   * @generated
   */
  JsonEntry createJsonEntry();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  JsonProjectPackage getJsonProjectPackage();

} //JsonProjectFactory
