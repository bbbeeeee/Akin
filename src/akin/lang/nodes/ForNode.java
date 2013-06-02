package akin.lang.nodes;

import akin.lang.*;


//  Iterate - For Statement

public class ForNode extends Node {
  private int iterations;
  private Node body;
  private ValueObject increment; 
  private String constant = null;
  private ValueObject starting;


  public ForNode(String number, Node body1) {
	    this.iterations=Integer.parseInt(number);
	    this.body = body1;
	  }


  public ForNode(String iterations, String constant, String increment, String start, Node body){
  	    this.iterations = Integer.parseInt(iterations);
  	    this.body       = body;
  	    this.increment  = new ValueObject(Integer.parseInt(increment));
  	    this.starting   = new ValueObject(Integer.parseInt(start));
  	    this.constant   = constant;
  }



/*
  public void add(String name, String increment1){
  		this.constant = name;
  		this.increment = Integer.parseInt(increment1);
  }


  public void add(String start){
  		this.starting = Integer.parseInt(start);
  }

*/
  public AkinObject eval(Context context) throws AkinException {
	  Context forContext = context.makeChildContext();


	  if(constant == null){
	  	for(int x=0; x<this.iterations; x++){
		  body.eval(forContext);
	     }
	  }


	  else if(constant !=null){
	  	 forContext.setLocal(this.constant, this.starting);
	  	 int limiter =  this.iterations * this.increment.asInteger();
	  	 
	  	 /*
	  	 for(forContext.getLocal(this.constant).asInteger(); forContext.getLocal(this.constant).asInteger()< limiter;
	  	 		 forContext.setLocal(this.constant, new ValueObject(this.starting.asInteger() + this.increment.asInteger())) {
	  	 	body.eval(forContext);
	  	 }
		*/
	  	 if(forContext.getLocal(this.constant).asInteger() < limiter)
	  	 {
	  	 	 while(forContext.getLocal(this.constant).asInteger()< limiter){
	  	 	 	 body.eval(forContext);
	  	 	 	 forContext.setLocal(this.constant, new ValueObject(forContext.getLocal(this.constant).asInteger() + this.increment.asInteger()));
	  	 	 }
	  	 }
	  	 else if(forContext.getLocal(this.constant).asInteger() > limiter)
	  	 {
	  	 	 while(forContext.getLocal(this.constant).asInteger() > limiter){
	  	 	 	 body.eval(forContext);
	  	 	 	 forContext.setLocal(this.constant, new ValueObject(forContext.getLocal(this.constant).asInteger() + this.increment.asInteger()));
	  	 	 }
	  	 }
	  	 
	  }
	  return AkinRuntime.getNil();
  }
}
