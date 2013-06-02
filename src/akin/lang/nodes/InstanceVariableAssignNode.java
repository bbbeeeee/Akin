package akin.lang.nodes;

import akin.lang.*;

public class InstanceVariableAssignNode extends Node {
  private String name;
  private Node expression;
  
  public InstanceVariableAssignNode(String name, Node expression) {
    this.name = name;
    this.expression = expression;
  }
  
  public AkinObject eval(Context context) throws AkinException {
    AkinObject value = expression.eval(context);
    context.getCurrentSelf().setInstanceVariable(name, value);
    return value;
  }
}