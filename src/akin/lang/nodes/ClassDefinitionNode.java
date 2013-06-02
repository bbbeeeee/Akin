package akin.lang.nodes;

import java.util.List;

import akin.lang.*;

public class ClassDefinitionNode extends Node {
  private String name;
  private String superName;
  private Node body;
  
  public ClassDefinitionNode(String name, String superName, Node body) {
    this.name = name;
    this.superName = superName;
    this.body = body;
  }
  
  public AkinObject eval(Context context) throws AkinException {
    AkinClass klass;
    // Default superclass to Object.
    if (superName == null) {
      klass = new AkinClass(name);
    } else {
      AkinClass superClass = (AkinClass) context.getCurrentClass().getConstant(superName);
      klass = new AkinClass(name, superClass);
    }
    
    // Evaluated the body of the class with self=class and class=class.
    body.eval(new Context(klass, klass));
    // Add the class as a constant
    context.getCurrentClass().setConstant(name, klass);
    
    return klass;
  }
}