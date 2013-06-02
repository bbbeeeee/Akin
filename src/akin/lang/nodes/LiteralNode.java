package akin.lang.nodes;

import akin.lang.*;

public class LiteralNode extends Node {
  AkinObject value;
  
  public LiteralNode(AkinObject value) {
    this.value = value;
  }
  
  public AkinObject eval(Context context) throws AkinException {
    return value;
  }
}