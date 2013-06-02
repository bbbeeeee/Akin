package akin.lang.nodes;

import akin.lang.*;

public class OrNode extends Node {
  private Node receiver;
  private Node argument;
  
  /**
    receiver || argument
  */
  public OrNode(Node receiver, Node argument) {
    this.receiver = receiver;
    this.argument = argument;
  }
  
  public AkinObject eval(Context context) throws AkinException {
    
	AkinObject receiverEvaled = receiver.eval(context);
    if (receiverEvaled.isTrue())
      return receiverEvaled;
    return argument.eval(context);
  }
}