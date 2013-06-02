package akin.lang.nodes;

import akin.lang.*;
import java.util.ArrayList;

/**
  Collection of nodes.
*/
public class Nodes extends Node {
  private ArrayList<Node> nodes;
  
  public Nodes() {
    nodes = new ArrayList<Node>();
  }
  
  public void add(Node n) {
    nodes.add(n);
  }
  
  /**
    Eval all the nodes and return the last returned value.
  */
  public AkinObject eval(Context context) throws AkinException {
    AkinObject lastEval = AkinRuntime.getNil();
    for (Node n : nodes) {
      lastEval = n.eval(context);
    }
    return lastEval;
  }
}