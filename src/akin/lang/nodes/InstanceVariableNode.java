package akin.lang.nodes;

import akin.lang.*;

public class InstanceVariableNode extends Node {
  private String name;
  
  public InstanceVariableNode(String name) {
    this.name = name;
  }
  
  public AkinObject eval(Context context) throws AkinException {
    return context.getCurrentSelf().getInstanceVariable(name);
  }
}