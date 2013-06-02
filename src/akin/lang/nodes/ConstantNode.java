package akin.lang.nodes;

import akin.lang.*;

/**
  Get the value of a constant.
*/
public class ConstantNode extends Node {
  private String name;
  
  public ConstantNode(String name) {
    this.name = name;
  }
  
  public AkinObject eval(Context context) throws AkinException {
    return context.getCurrentClass().getConstant(name);
  }
}