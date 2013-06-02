package akin.lang;

/**
  Exception thrown when a unknown method is called.
*/
public class MethodNotFound extends AkinException {
  public MethodNotFound(String method) {
    super(method + " not found");
    setRuntimeClass("MethodNotFound");
  }
}