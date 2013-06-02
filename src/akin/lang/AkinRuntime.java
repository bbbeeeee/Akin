package akin.lang;

/**
  Language runtime. Mostly helper methods for retrieving global values.
*/
public class AkinRuntime {
  static AkinClass objectClass;
  static AkinObject mainObject;
  static AkinObject nilObject;
  static AkinObject trueObject;
  static AkinObject falseObject;
  
  public static AkinClass getObjectClass() {
    return objectClass;
  }

  public static AkinObject getMainObject() {
    return mainObject;
  }

  public static AkinClass getRootClass(String name) {
    // objectClass is null when boostrapping
    return objectClass == null ? null : (AkinClass) objectClass.getConstant(name);
  }

  public static AkinClass getExceptionClass() {
    return getRootClass("Exception");
  }
  
  public static AkinObject getNil() {
    return nilObject;
  }
  
  public static AkinObject getTrue() {
    return trueObject;
  }

  public static AkinObject getFalse() {
    return falseObject;
  }
  
  public static AkinObject toBoolean(boolean value) {
    return value ? AkinRuntime.getTrue() : AkinRuntime.getFalse();
  }
}
