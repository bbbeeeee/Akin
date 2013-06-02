package akin.lang.nodes;


import akin.lang.*;

public class CalcNode extends Node {
  
  private ValueObject number;
  private String variable;
  private int x;
  private int y;
  private int a;
  private float z;
  public CalcNode(String number, String variable, int x, int a) {
    this.x = x;
    this.y = Integer.parseInt(number);
    //this.z = Float.parseFloat(number);
    this.number = new ValueObject(y);
    this.a = a;
    this.variable = variable;
  }
  
  public AkinObject eval(Context context) throws AkinException {
	
	
	//forContext.getLocal(this.constant).asInteger() + this.increment.asInteger()
	if(x == 1){
		//y = context.getLocal(this.variable).asInteger() + this.number.asInteger();
		context.setLocal(this.variable, new ValueObject(context.getLocal(this.variable).asInteger() * this.number.asInteger()));
	}
	
	else if(x==2){
		//y = context.getLocal(this.variable).asInteger() - this.number.asInteger();
		context.setLocal(this.variable, new ValueObject(context.getLocal(this.variable).asInteger() - this.number.asInteger()));
	}
	else if(x==3){
		//y = context.getLocal(this.variable).asInteger() / this.number.asInteger();
		context.setLocal(this.variable, new ValueObject(context.getLocal(this.variable).asInteger() / this.number.asInteger()));
	}
	else if(x==4){
		//y = context.getLocal(this.variable).asInteger() * this.number.asInteger();
		context.setLocal(this.variable, new ValueObject(context.getLocal(this.variable).asInteger() * this.number.asInteger()));
	}
	return AkinRuntime.getNil();
  }
}