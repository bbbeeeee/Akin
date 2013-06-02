package akin.lang;

import java.util.HashMap;

/**
  Class in the runtime.
  Classes store methods and constants. Each object in the runtime has a class.
*/
public class AkinClass extends AkinObject {
  private String name;
  private AkinClass superClass;
  private HashMap<String, Method> methods;
  HashMap<String, AkinObject> constants;
  
  /**
    Creates a class inheriting from superClass.
  */
  public AkinClass(String name, AkinClass superClass) {
    super("Class");
    this.name = name;
    this.superClass = superClass;
    methods = new HashMap<String, Method>();
    constants = new HashMap<String, AkinObject>();
  }
  
  /**
    Creates a class inheriting from Object.
  */
  public AkinClass(String name) {
    this(name, AkinRuntime.getObjectClass());
  }
  
  public String getName() {
    return name;
  }
  
  public AkinClass getSuperClass() {
    return superClass;
  }
  
  public void setConstant(String name, AkinObject value) {
    constants.put(name, value);
  }

  public AkinObject getConstant(String name) {
    if (constants.containsKey(name)) return constants.get(name);
    if (superClass != null) return superClass.getConstant(name);
    return AkinRuntime.getNil();
  }
  
  public boolean hasConstant(String name) {
    if (constants.containsKey(name)) return true;
    if (superClass != null) return superClass.hasConstant(name);
    return false;
  }
  
  public Method lookup(String name) throws MethodNotFound {
    if (methods.containsKey(name)) return methods.get(name);
    if (superClass != null) return superClass.lookup(name);
    throw new MethodNotFound(name);
  }

  public boolean hasMethod(String name) {
    if (methods.containsKey(name)) return true;
    if (superClass != null) return superClass.hasMethod(name);
    return false;
  }
  
  public void addMethod(String name, Method method) {
    methods.put(name, method);
  }
  
  /**
    Creates a new instance of the class.
  */
  public AkinObject newInstance() {
    return new AkinObject(this);
  }
  
  /**
    Creates a new instance of the class, storing the value inside a ValueObject.
  */
  public AkinObject newInstance(Object value) {
    return new ValueObject(this, value);
  }
  
  /**
    Creates a new subclass of this class.
  */
  public AkinClass newSubclass(String name) {
    AkinClass klass = new AkinClass(name, this);
    AkinRuntime.getObjectClass().setConstant(name, klass);
    return klass;
  }
  
  /**
    Creates or returns a subclass if it already exists.
  */
  public AkinClass subclass(String name) {
    AkinClass objectClass = AkinRuntime.getObjectClass();
    if (objectClass.hasConstant(name)) return (AkinClass) objectClass.getConstant(name);
    return newSubclass(name);
  }
  
  /**
    Returns true if klass is a subclass of this class.
  */
  public boolean isSubclass(AkinClass klass) {
    if (klass == this) return true;
    if (klass.getSuperClass() == null) return false;
    if (klass.getSuperClass() == this) return true;
    return isSubclass(klass.getSuperClass());
  }
  
  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if ( !(other instanceof AkinClass) ) return false;
    return name == ((AkinClass)other).getName();
  }
}
