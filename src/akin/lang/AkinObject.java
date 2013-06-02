package akin.lang;

import java.util.HashMap;

/**
  Any object, instance of a class, inside the runtime.
  Objects store a class and instance variables.
*/
public class AkinObject {
  private AkinClass yourLangClass;
  private HashMap<String, AkinObject> instanceVariables;
  
  /**
    Creates an instance of class yourLangClass.
  */
  public AkinObject(AkinClass yourLangClass) {
    this.yourLangClass = yourLangClass;
    this.instanceVariables = new HashMap<String, AkinObject>();
  }
  
  public AkinObject(String className) {
    this(AkinRuntime.getRootClass(className));
  }
  
  public AkinObject() {
    this(AkinRuntime.getObjectClass());
  }
  
  public AkinClass getAkinClass() {
    return yourLangClass;
  }
  
  public void setAkinClass(AkinClass klass) {
    yourLangClass = klass;
  }
  
  public AkinObject getInstanceVariable(String name) {
    if (hasInstanceVariable(name))
      return instanceVariables.get(name);
    return AkinRuntime.getNil();
  }

  public boolean hasInstanceVariable(String name) {
    return instanceVariables.containsKey(name);
  }
  
  public void setInstanceVariable(String name, AkinObject value) {
    instanceVariables.put(name, value);
  }
  
  /**
    Call a method on the object.
  */
  public AkinObject call(String method, AkinObject arguments[]) throws AkinException {
    return yourLangClass.lookup(method).call(this, arguments);
  }

  public AkinObject call(String method) throws AkinException {
    return call(method, new AkinObject[0]);
  }
  
  /**
    Only false and nil are not true.
  */
  public boolean isTrue() {
    return !isFalse();
  }
  
  /**
    Only false and nil are false. This is overridden in ValueObject.
  */
  public boolean isFalse() {
    return false;
  }

  /**
    Only nil is nil. This is overridden in ValueObject.
  */
  public boolean isNil() {
    return false;
  }
  
  /**
    Convert to a Java object. This is overridden in ValueObject.
  */
  public Object toJavaObject() {
    return this;
  }
  
  public <T> T as(Class<T> clazz) throws TypeError {
    if (clazz.isInstance(this)){
      return clazz.cast(this);
    }
    throw new TypeError(clazz.getName(), this);
  }
  
  public String asString() throws TypeError {
    return as(ValueObject.class).getValueAs(String.class);
  }

  public Integer asInteger() throws TypeError {
    return as(ValueObject.class).getValueAs(Integer.class);
  }

  public Float asFloat() throws TypeError {
    return as(ValueObject.class).getValueAs(Float.class);
  }
}
