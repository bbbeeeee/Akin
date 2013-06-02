package akin.lang.nodes;

import akin.lang.*;

public class SelfNode extends Node {
  public AkinObject eval(Context context) throws AkinException {
    return context.getCurrentSelf();
  }
}