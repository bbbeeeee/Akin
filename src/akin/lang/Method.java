package akin.lang;

/**
  A method attached to a AkinClass.
*/
public abstract class Method {
  /**
    Calls the method.
    @param receiver  Instance on which to call the method (self).
    @param arguments Arguments passed to the method.
  */
  public abstract AkinObject call(AkinObject receiver, AkinObject arguments[]) throws AkinException;
}
