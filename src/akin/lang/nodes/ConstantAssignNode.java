package akin.lang.nodes;

import akin.lang.*;

public class ConstantAssignNode extends Node {
  private String name;
  private Node expression;
  
  public ConstantAssignNode(String name, Node expression) {
    this.name = name;
    this.expression = expression;
  }
  
  public AkinObject eval(Context context) throws AkinException {
    AkinObject value = expression.eval(context);
    context.getCurrentClass().setConstant(name, value);
    return value;
  }
}