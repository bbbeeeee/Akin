package akin.lang.nodes;

import akin.lang.*;

public class DoWhileNode extends Node {
  private Node condition;
  private Node body;
  
  public DoWhileNode(Node condition, Node body) {
    this.condition = condition;
    this.body = body;
  }
  
  public AkinObject eval(Context context) throws AkinException {
    do {
      body.eval(context);
    } while (condition.eval(context).isTrue());
    return AkinRuntime.getNil();
  }
}