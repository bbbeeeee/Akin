package akin.lang.nodes;

import akin.lang.*;

public class LocalAssignNode extends Node {
  private String name;
  private Node expression;
  
  public LocalAssignNode(String name, Node expression) {
    this.name = name;
    this.expression = expression;
  }
  
  public AkinObject eval(Context context) throws AkinException {
    AkinObject value = expression.eval(context);
    context.setLocal(name, value);
    return value;
  }
}