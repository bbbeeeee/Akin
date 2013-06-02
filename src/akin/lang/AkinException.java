package akin.lang;

/**
  Exception that can be catched from inside the runtime.
*/
public class AkinException extends Exception {
  private AkinClass runtimeClass;
  
  /**
    Creates a new exception from a runtime class.
    @param runtimeClass Class of the exception from whitin the language.
  */
  public AkinException(AkinClass runtimeClass, String message) {
    super(message);
    this.runtimeClass = runtimeClass;
  }

  public AkinException(AkinClass runtimeClass) {
    super();
    this.runtimeClass = runtimeClass;
  }
  
  public AkinException(String runtimeClassName, String message) {
    super(message);
    setRuntimeClass(runtimeClassName);
  }
  
  /**
    Creates a new exception from the Exception runtime class.
  */
  public AkinException(String message) {
    super(message);
    this.runtimeClass = AkinRuntime.getExceptionClass();
  }
  
  /**
    Wrap an exception to pass it to the runtime.
  */
  public AkinException(Exception inner) {
    super(inner);
    setRuntimeClass(inner.getClass().getName());
  }
  
  /**
    Returns the runtime instance (the exception inside the language) of this exception.
  */
  public AkinObject getRuntimeObject() {
    AkinObject instance = runtimeClass.newInstance(this);
    instance.setInstanceVariable("message", new ValueObject(getMessage()));
    return instance;
  }

  public AkinClass getRuntimeClass() {
    return runtimeClass;
  }

  protected void setRuntimeClass(String name) {
    runtimeClass = AkinRuntime.getExceptionClass().subclass(name);
  }
}