package akin.lang.nodes;

import akin.lang.*;

public class IfNode extends Node {
  private Node condition;
  private Node ifBody;
  private Node elseBody;
  
  public IfNode(Node condition, Node ifBody, Node elseBody) {
    this.condition = condition;
    this.ifBody = ifBody;
    this.elseBody = elseBody;
  }
  
  public AkinObject eval(Context context) throws AkinException {
    if (condition.eval(context).isTrue()) {
      return ifBody.eval(context);
    } else if (elseBody != null) {
      return elseBody.eval(context);
    }
    return AkinRuntime.getNil();
  }
}