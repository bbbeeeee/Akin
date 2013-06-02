package akin.lang.nodes;

import akin.lang.*;

public class AndNode extends Node {
  private Node receiver;
  private Node argument;
  
  /**
    receiver && argument
  */
  public AndNode(Node receiver, Node argument) {
    this.receiver = receiver;
    this.argument = argument;
  }
  
  public AkinObject eval(Context context) throws AkinException {
    AkinObject receiverEvaled = receiver.eval(context);
    if (receiverEvaled.isTrue())
      return argument.eval(context);
    return receiverEvaled;
  }
}