package akin.lang;

import java.util.HashMap;
import java.util.ArrayList;

import java.io.Reader;
import java.io.StringReader;
import java.io.IOException;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import akin.lang.nodes.Node;


/**
  Evaluation context. Determines how a node will be evaluated.
  A context tracks local variables, self, and the current class under which
  methods and constants will be added.
  
  There are three different types of context:
  1) In the root of the script, self = main object, class = Object
  2) Inside a method body, self = instance of the class, class = method class
  3) Inside a class definition self = the class, class = the class
*/
public class Context {
  private AkinObject currentSelf;
  private AkinClass currentClass;
  private HashMap<String, AkinObject> locals;
  // A context can share local variables with a parent. For example, in the
  // try block.
  private Context parent;
  
  public Context(AkinObject currentSelf, AkinClass currentClass, Context parent) {
    this.currentSelf = currentSelf;
    this.currentClass = currentClass;
    this.parent = parent;
    if (parent == null) {
      locals = new HashMap<String, AkinObject>();
    } else {
      locals = parent.locals;
    }
  }
  
  public Context(AkinObject currentSelf, AkinClass currentClass) {
    this(currentSelf, currentClass, null);
  }
  
  public Context(AkinObject currentSelf) {
    this(currentSelf, currentSelf.getAkinClass());
  }
  
  public Context() {
    this(AkinRuntime.getMainObject());
  }
  
  public AkinObject getCurrentSelf() {
    return currentSelf;
  }

  public AkinClass getCurrentClass() {
    return currentClass;
  }
  
  public AkinObject getLocal(String name) {
    return locals.get(name);
  }
    
  public boolean hasLocal(String name) {
    return locals.containsKey(name);
  }
    
  public void setLocal(String name, AkinObject value) {
    locals.put(name, value);
  }

  /**
    Creates a context that will share the same attributes (locals, self, class)
    as the current one.
  */
  public Context makeChildContext() {
    return new Context(currentSelf, currentClass, this);
  }
  
  /**
    Parse and evaluate the content red from the reader (eg.: FileReader, StringReader).
  */
  public AkinObject eval(Reader reader) throws AkinException {
    try {
      AkinLexer lexer = new AkinLexer(new ANTLRReaderStream(reader));
      AkinParser parser = new AkinParser(new CommonTokenStream(lexer));
      Node node = parser.parse();
      if (node == null) return AkinRuntime.getNil();
      return node.eval(this);
    } catch (AkinException e) {
      throw e;
    } catch (Exception e) {
      throw new AkinException(e);
    }
  }
  
  public AkinObject eval(String code) throws AkinException {
    return eval(new StringReader(code));
  }
}
