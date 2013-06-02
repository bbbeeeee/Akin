package akin.lang.nodes;

import akin.lang.*;

public class WhileNode extends Node {
  private Node condition;
  private Node body;
  private int x;
  public WhileNode(Node condition, Node body) {
    this.condition = condition;
    this.body = body;
    this.x = 0;
  }
  
  //keep doing the following needs to negate condition
  public WhileNode(Node condition, Node body, int y) {
	    this.condition = condition;
	    this.body = body;
	    this.x = 1;
	  }
  
  public AkinObject eval(Context context) throws AkinException {
    if(x==0){
    	while (condition.eval(context).isTrue()) {
    		body.eval(context);
    	}
    	return AkinRuntime.getNil();
    }
    else if(x==1){
    	while (!condition.eval(context).isTrue()) {
    		body.eval(context);
    	}
    	return AkinRuntime.getNil();
    }
    
    return AkinRuntime.getNil();
  }
}