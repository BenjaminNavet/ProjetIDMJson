/**
 * generated by Xtext 2.25.0
 */
package org.xtext.jsonProject.jsonProject.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.jsonProject.jsonProject.ArrayObject;
import org.xtext.jsonProject.jsonProject.BooleanObject;
import org.xtext.jsonProject.jsonProject.Final;
import org.xtext.jsonProject.jsonProject.Initialisation;
import org.xtext.jsonProject.jsonProject.Insert;
import org.xtext.jsonProject.jsonProject.JsonCommand;
import org.xtext.jsonProject.jsonProject.JsonCommands;
import org.xtext.jsonProject.jsonProject.JsonEntries;
import org.xtext.jsonProject.jsonProject.JsonEntry;
import org.xtext.jsonProject.jsonProject.JsonObject;
import org.xtext.jsonProject.jsonProject.JsonPrimitive;
import org.xtext.jsonProject.jsonProject.JsonProjectFactory;
import org.xtext.jsonProject.jsonProject.JsonProjectPackage;
import org.xtext.jsonProject.jsonProject.Modify;
import org.xtext.jsonProject.jsonProject.Mult;
import org.xtext.jsonProject.jsonProject.Operation;
import org.xtext.jsonProject.jsonProject.Path;
import org.xtext.jsonProject.jsonProject.Print;
import org.xtext.jsonProject.jsonProject.Remove;
import org.xtext.jsonProject.jsonProject.Select;
import org.xtext.jsonProject.jsonProject.Store;
import org.xtext.jsonProject.jsonProject.StringObject;
import org.xtext.jsonProject.jsonProject.Sum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JsonProjectPackageImpl extends EPackageImpl implements JsonProjectPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonCommandsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initialisationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass insertEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modifyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass removeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass finalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass storeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass printEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonPrimitiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonEntriesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jsonEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum booleanEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.jsonProject.jsonProject.JsonProjectPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private JsonProjectPackageImpl()
  {
    super(eNS_URI, JsonProjectFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link JsonProjectPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static JsonProjectPackage init()
  {
    if (isInited) return (JsonProjectPackage)EPackage.Registry.INSTANCE.getEPackage(JsonProjectPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredJsonProjectPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    JsonProjectPackageImpl theJsonProjectPackage = registeredJsonProjectPackage instanceof JsonProjectPackageImpl ? (JsonProjectPackageImpl)registeredJsonProjectPackage : new JsonProjectPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theJsonProjectPackage.createPackageContents();

    // Initialize created meta-data
    theJsonProjectPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theJsonProjectPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(JsonProjectPackage.eNS_URI, theJsonProjectPackage);
    return theJsonProjectPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getJsonCommands()
  {
    return jsonCommandsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getJsonCommands_JsonCommands()
  {
    return (EReference)jsonCommandsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getJsonCommand()
  {
    return jsonCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getJsonCommand_Init()
  {
    return (EReference)jsonCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getJsonCommand_Operations()
  {
    return (EReference)jsonCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getJsonCommand_Final()
  {
    return (EReference)jsonCommandEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInitialisation()
  {
    return initialisationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getInitialisation_FilePath()
  {
    return (EAttribute)initialisationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInsert()
  {
    return insertEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInsert_JsonObject()
  {
    return (EReference)insertEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getInsert_Path()
  {
    return (EReference)insertEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPath()
  {
    return pathEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getPath_Values()
  {
    return (EAttribute)pathEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModify()
  {
    return modifyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModify_Path()
  {
    return (EReference)modifyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModify_JsonObject()
  {
    return (EReference)modifyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSum()
  {
    return sumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSum_PathTOStore()
  {
    return (EReference)sumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSum_PathToAdd()
  {
    return (EReference)sumEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRemove()
  {
    return removeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRemove_Path()
  {
    return (EReference)removeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMult()
  {
    return multEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMult_PathTOStore()
  {
    return (EReference)multEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMult_PathToMult()
  {
    return (EReference)multEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSelect()
  {
    return selectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSelect_Path()
  {
    return (EReference)selectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFinal()
  {
    return finalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFinal_Path()
  {
    return (EReference)finalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStore()
  {
    return storeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getStore_FilePath()
  {
    return (EAttribute)storeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPrint()
  {
    return printEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getJsonObject()
  {
    return jsonObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getJsonPrimitive()
  {
    return jsonPrimitiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getArrayObject()
  {
    return arrayObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getArrayObject_Values()
  {
    return (EReference)arrayObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBooleanObject()
  {
    return booleanObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getBooleanObject_Value()
  {
    return (EAttribute)booleanObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStringObject()
  {
    return stringObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getStringObject_Value()
  {
    return (EAttribute)stringObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getJsonEntries()
  {
    return jsonEntriesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getJsonEntries_ListEntries()
  {
    return (EReference)jsonEntriesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getJsonEntry()
  {
    return jsonEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getJsonEntry_Key()
  {
    return (EAttribute)jsonEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getJsonEntry_JsonObject()
  {
    return (EReference)jsonEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEnum getBoolean()
  {
    return booleanEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public JsonProjectFactory getJsonProjectFactory()
  {
    return (JsonProjectFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    jsonCommandsEClass = createEClass(JSON_COMMANDS);
    createEReference(jsonCommandsEClass, JSON_COMMANDS__JSON_COMMANDS);

    jsonCommandEClass = createEClass(JSON_COMMAND);
    createEReference(jsonCommandEClass, JSON_COMMAND__INIT);
    createEReference(jsonCommandEClass, JSON_COMMAND__OPERATIONS);
    createEReference(jsonCommandEClass, JSON_COMMAND__FINAL);

    initialisationEClass = createEClass(INITIALISATION);
    createEAttribute(initialisationEClass, INITIALISATION__FILE_PATH);

    operationEClass = createEClass(OPERATION);

    insertEClass = createEClass(INSERT);
    createEReference(insertEClass, INSERT__JSON_OBJECT);
    createEReference(insertEClass, INSERT__PATH);

    pathEClass = createEClass(PATH);
    createEAttribute(pathEClass, PATH__VALUES);

    modifyEClass = createEClass(MODIFY);
    createEReference(modifyEClass, MODIFY__PATH);
    createEReference(modifyEClass, MODIFY__JSON_OBJECT);

    sumEClass = createEClass(SUM);
    createEReference(sumEClass, SUM__PATH_TO_STORE);
    createEReference(sumEClass, SUM__PATH_TO_ADD);

    removeEClass = createEClass(REMOVE);
    createEReference(removeEClass, REMOVE__PATH);

    multEClass = createEClass(MULT);
    createEReference(multEClass, MULT__PATH_TO_STORE);
    createEReference(multEClass, MULT__PATH_TO_MULT);

    selectEClass = createEClass(SELECT);
    createEReference(selectEClass, SELECT__PATH);

    finalEClass = createEClass(FINAL);
    createEReference(finalEClass, FINAL__PATH);

    storeEClass = createEClass(STORE);
    createEAttribute(storeEClass, STORE__FILE_PATH);

    printEClass = createEClass(PRINT);

    jsonObjectEClass = createEClass(JSON_OBJECT);

    jsonPrimitiveEClass = createEClass(JSON_PRIMITIVE);

    arrayObjectEClass = createEClass(ARRAY_OBJECT);
    createEReference(arrayObjectEClass, ARRAY_OBJECT__VALUES);

    booleanObjectEClass = createEClass(BOOLEAN_OBJECT);
    createEAttribute(booleanObjectEClass, BOOLEAN_OBJECT__VALUE);

    stringObjectEClass = createEClass(STRING_OBJECT);
    createEAttribute(stringObjectEClass, STRING_OBJECT__VALUE);

    jsonEntriesEClass = createEClass(JSON_ENTRIES);
    createEReference(jsonEntriesEClass, JSON_ENTRIES__LIST_ENTRIES);

    jsonEntryEClass = createEClass(JSON_ENTRY);
    createEAttribute(jsonEntryEClass, JSON_ENTRY__KEY);
    createEReference(jsonEntryEClass, JSON_ENTRY__JSON_OBJECT);

    // Create enums
    booleanEEnum = createEEnum(BOOLEAN);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    insertEClass.getESuperTypes().add(this.getOperation());
    modifyEClass.getESuperTypes().add(this.getOperation());
    sumEClass.getESuperTypes().add(this.getOperation());
    removeEClass.getESuperTypes().add(this.getOperation());
    multEClass.getESuperTypes().add(this.getOperation());
    selectEClass.getESuperTypes().add(this.getOperation());
    storeEClass.getESuperTypes().add(this.getFinal());
    printEClass.getESuperTypes().add(this.getFinal());
    jsonPrimitiveEClass.getESuperTypes().add(this.getJsonObject());
    arrayObjectEClass.getESuperTypes().add(this.getJsonPrimitive());
    booleanObjectEClass.getESuperTypes().add(this.getJsonPrimitive());
    stringObjectEClass.getESuperTypes().add(this.getJsonPrimitive());
    jsonEntriesEClass.getESuperTypes().add(this.getJsonObject());

    // Initialize classes and features; add operations and parameters
    initEClass(jsonCommandsEClass, JsonCommands.class, "JsonCommands", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJsonCommands_JsonCommands(), this.getJsonCommand(), null, "jsonCommands", null, 0, -1, JsonCommands.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonCommandEClass, JsonCommand.class, "JsonCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJsonCommand_Init(), this.getInitialisation(), null, "init", null, 0, 1, JsonCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJsonCommand_Operations(), this.getOperation(), null, "operations", null, 0, -1, JsonCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJsonCommand_Final(), this.getFinal(), null, "final", null, 0, 1, JsonCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(initialisationEClass, Initialisation.class, "Initialisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInitialisation_FilePath(), ecorePackage.getEString(), "filePath", null, 0, 1, Initialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(insertEClass, Insert.class, "Insert", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInsert_JsonObject(), this.getJsonObject(), null, "jsonObject", null, 0, 1, Insert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInsert_Path(), this.getPath(), null, "path", null, 0, 1, Insert.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPath_Values(), ecorePackage.getEString(), "values", null, 0, -1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modifyEClass, Modify.class, "Modify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModify_Path(), this.getPath(), null, "path", null, 0, 1, Modify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModify_JsonObject(), this.getJsonObject(), null, "jsonObject", null, 0, 1, Modify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sumEClass, Sum.class, "Sum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSum_PathTOStore(), this.getPath(), null, "pathTOStore", null, 0, 1, Sum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSum_PathToAdd(), this.getPath(), null, "pathToAdd", null, 0, 1, Sum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(removeEClass, Remove.class, "Remove", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRemove_Path(), this.getPath(), null, "path", null, 0, 1, Remove.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multEClass, Mult.class, "Mult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMult_PathTOStore(), this.getPath(), null, "pathTOStore", null, 0, 1, Mult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMult_PathToMult(), this.getPath(), null, "pathToMult", null, 0, 1, Mult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectEClass, Select.class, "Select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelect_Path(), this.getPath(), null, "path", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(finalEClass, Final.class, "Final", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFinal_Path(), this.getPath(), null, "path", null, 0, 1, Final.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(storeEClass, Store.class, "Store", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStore_FilePath(), ecorePackage.getEString(), "filePath", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(printEClass, Print.class, "Print", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(jsonObjectEClass, JsonObject.class, "JsonObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(jsonPrimitiveEClass, JsonPrimitive.class, "JsonPrimitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arrayObjectEClass, ArrayObject.class, "ArrayObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayObject_Values(), this.getJsonObject(), null, "values", null, 0, -1, ArrayObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanObjectEClass, BooleanObject.class, "BooleanObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanObject_Value(), this.getBoolean(), "value", null, 0, 1, BooleanObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringObjectEClass, StringObject.class, "StringObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringObject_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonEntriesEClass, JsonEntries.class, "JsonEntries", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJsonEntries_ListEntries(), this.getJsonEntry(), null, "listEntries", null, 0, -1, JsonEntries.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jsonEntryEClass, JsonEntry.class, "JsonEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJsonEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, JsonEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJsonEntry_JsonObject(), this.getJsonObject(), null, "jsonObject", null, 0, 1, JsonEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(booleanEEnum, org.xtext.jsonProject.jsonProject.Boolean.class, "Boolean");
    addEEnumLiteral(booleanEEnum, org.xtext.jsonProject.jsonProject.Boolean.TRUE);
    addEEnumLiteral(booleanEEnum, org.xtext.jsonProject.jsonProject.Boolean.FALSE);

    // Create resource
    createResource(eNS_URI);
  }

} //JsonProjectPackageImpl
