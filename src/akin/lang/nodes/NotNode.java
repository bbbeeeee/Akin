package akin.lang.nodes;

import akin.lang.*;

/**
  Negate a value.
*/
public class NotNode extends Node {
  private Node receiver;
  
  /**
    !receiver
  */
  public NotNode(Node receiver) {
    this.receiver = receiver;
  }
  
  public AkinObject eval(Context context) throws AkinException {
    if (receiver.eval(context).isTrue())
      return AkinRuntime.getFalse();
    return AkinRuntime.getTrue();
  }
}