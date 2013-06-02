parser grammar AkinParser;

options {
  output = AST; // Produce a tree of node
  tokenVocab = AkinLexer; // Use tokens defined in our lexer.
  backtrack=true; // Resolve ambiguities by looking tokens ahead, slower but simpler.
}

// Stuff added on top of the Parser class.
@header {
  package akin.lang;
  
  import akin.lang.nodes.*;
  import java.util.ArrayList;
}

// Methods added to the Parser class.
@members {
  /**
    Run the parsing process and return the root node of the AST.
  */
  public Node parse() throws RecognitionException {
    root_return result = root();
    if (result == null) return null;
    return result.nodes;
  }
  
  // Override to throw exceptions on parse error.
  @Override
  public void reportError(RecognitionException e) {
    throw new RuntimeException(e);
  }
}

// Rethrow parsing error
@rulecatch {
  catch(RecognitionException recognitionException) {
    throw recognitionException;
  }
}

/*
  Format of a rule:
  
  ruleName returns [TypeOfNode nodeName]:
      // refer to values on the left using $.
      e=reference_to_other_rules      { $nodeName = $e; } // code executed when rule matches
    | other rules
    ;
  
  Value stored in $nodeName will be passed to the parent rule.
*/

// Top-level node of each AST
root returns [Nodes nodes]:
    terminator? expressions? EOF! { $nodes = $expressions.nodes; }
  ;

// Collection of nodes, often refered to as a body (methd body, class body, etc.)
expressions returns [Nodes nodes]:
                      { $nodes = new Nodes(); }
    head=expression   { $nodes.add($head.node); }
    (terminator
     tail=expression  { $nodes.add($tail.node); }
    )*
    terminator?
  ;

// A single expression
expression returns [Node node]:
    assignExpression      { $node = $assignExpression.node; }
  ;

// Anything that can terminate an expression.
terminator: (NEWLINE | SEMICOLON | COLON | COMMA)+;

// To implement operator precedence, we use order of evaluation in the parser.
// First rules defined here are evaluated last.

// Assignation has the lowest precedence, evaluated last.
assignExpression returns [Node node]:
    assign                { $node = $assign.node; }
  | e=orExpression       { $node = $e.node; }
  ;

orExpression returns [Node node]:
    receiver=andExpression
      (OR|ORE) arg=orExpression       { $node = new OrNode($receiver.node, $arg.node); }
  | e=andExpression             { $node = $e.node; }
  ;

andExpression returns [Node node]:
    receiver=relationalExpression
      (AND|ANDE) arg=andExpression     { $node = new AndNode($receiver.node, $arg.node); }
  | e=relationalExpression      { $node = $e.node; }
  ;

relationalExpression returns [Node node]:
    receiver=additiveExpression
       op=(EQ|LE|GE|LT|GT|GTT|LTT|ETT|NE) 
      arg=relationalExpression  { $node = new CallNode($op.text, $receiver.node, $arg.node); }
  | e=additiveExpression        { $node = $e.node; }
  ;

additiveExpression returns [Node node]:
    receiver=multiplicativeExpression
      op=(PLUS|MINUS) arg=additiveExpression  { $node = new CallNode($op.text, $receiver.node, $arg.node); }
  | e=multiplicativeExpression                { $node = $e.node; }
  ;

multiplicativeExpression returns [Node node]:
    receiver=unaryExpression
      op=(MUL|DIV|MOD) arg=multiplicativeExpression  { $node = new CallNode($op.text, $receiver.node, $arg.node); }
  | e=unaryExpression                                { $node = $e.node; }
  ;

unaryExpression returns [Node node]:
    NOT receiver=unaryExpression       { $node = new NotNode($receiver.node); }
  | e=primaryExpression                { $node = $e.node; }
  ;
// Highest precedence, evaluated first.

primaryExpression returns [Node node]:
    literal           { $node = $literal.node; }
  | call              { $node = $call.node; }
  | methodDefinition  { $node = $methodDefinition.node; }
  | classDefinition   { $node = $classDefinition.node; }
  | ifBlock           { $node = $ifBlock.node; }
  | whileBlock        { $node = $whileBlock.node; }
  | doWhileBlock      { $node = $doWhileBlock.node; }
  | forBlock          { $node = $forBlock.node; }
  | calcBlock         { $node = $calcBlock.node; }
  | tryBlock          { $node = $tryBlock.node; }
  | OPEN_PARENT
      expression
    CLOSE_PARENT      { $node = $expression.node; }
  ;

// Any static value
literal returns [Node node]:
    STRING            { $node = new LiteralNode(new ValueObject($STRING.text.substring(1, $STRING.text.length() - 1))); }
  | INTEGER           { $node = new LiteralNode(new ValueObject(new Integer($INTEGER.text))); }
  | FLOAT             { $node = new LiteralNode(new ValueObject(new Float($FLOAT.text))); }
  | NIL               { $node = new LiteralNode(AkinRuntime.getNil()); }
  | TRUE              { $node = new LiteralNode(AkinRuntime.getTrue()); }
  | FALSE             { $node = new LiteralNode(AkinRuntime.getFalse()); }
  | constant          { $node = $constant.node; }
  | instanceVariable  { $node = $instanceVariable.node; }
  | self              { $node = $self.node; }
  ;

// self
self returns [SelfNode node]:
    SELF              { $node = new SelfNode(); }
  ;

// Getting the value of an @instance_variable
instanceVariable returns [InstanceVariableNode node]:
    AT NAME           { $node = new InstanceVariableNode($NAME.text); }
  | THE NAME OF THIS  { $node = new InstanceVariableNode($NAME.text); }
  | THIS HAS A NAME terminator?  { $node = new InstanceVariableNode($NAME.text); }
  ;

// A method call
call returns [Node node]:
    (literal DOT                    { $node = $literal.node; }
      )?
    (head=message DOT               { ((CallNode)$head.node).setReceiver($node); $node = $head.node; }
      )*
    tail=message                    { ((CallNode)$tail.node).setReceiver($node); $node = $tail.node; }
  | (MAKE
     literal)?                     { $node = $literal.node; }
    (head=message)*                 { ((CallNode)$head.node).setReceiver($node); $node = $head.node; }
    tail=message                    { ((CallNode)$tail.node).setReceiver($node); $node = $tail.node; }
  ;

// The tail part of a method call: method name + arguments
message returns [CallNode node]:
    NAME                            { $node = new CallNode($NAME.text); }
  | NAME OPEN_PARENT CLOSE_PARENT   { $node = new CallNode($NAME.text, new ArrayList<Node>()); }
  | NAME OPEN_PARENT
           arguments
         CLOSE_PARENT               { $node = new CallNode($NAME.text, $arguments.nodes); } 
  | MAKETHECOMPUTER NAME END?           { $node = new CallNode($NAME.text); }
  | MAKETHECOMPUTER NAME OPEN_PARENT CLOSE_PARENT END? { $node = new CallNode($NAME.text, new ArrayList<Node>()); }
  | MAKETHECOMPUTER NAME OPEN_PARENT 
                           arguments
                          CLOSE_PARENT END? { $node = new CallNode($NAME.text, $arguments.nodes); }
  ;

// Arguments of a method call.
arguments returns [ArrayList<Node> nodes]:
                                    { $nodes = new ArrayList<Node>(); }
    head=expression                 { $nodes.add($head.node); }
    (COMMA
     tail=expression                { $nodes.add($tail.node); }
    )*
  ;

// Getting the value of a Constant
constant returns [ConstantNode node]:
    CONSTANT                        { $node = new ConstantNode($CONSTANT.text); }
  ;

// Variable of constant assignation
assign returns [Node node]:
    NAME ASSIGN expression          { $node = new LocalAssignNode($NAME.text, $expression.node); }
  | CONSTANT ASSIGN expression      { $node = new ConstantAssignNode($CONSTANT.text, $expression.node); }
  | AT NAME ASSIGN expression       { $node = new InstanceVariableAssignNode($NAME.text, $expression.node); }
  ;

methodDefinition returns [MethodDefinitionNode node]:
    (THIS|TO|IT|YOU) (CAN (ALSO)?)? GET? CALCULATE? NAME WITH? (OPEN_PARENT parameters? CLOSE_PARENT)? BY? (WHICHISTO|ISTO|terminator)* 
      expressions
    THEN? END                     { $node = new MethodDefinitionNode($NAME.text, $parameters.names, $expressions.nodes); }
  | (THIS|TO|IT|YOU) (CAN (ALSO)?)? GET? NAME WITH? OPEN_PARENT? parameters? CLOSE_PARENT? (BY|WHICHISTO|ISTO|terminator)* 
      expressions
    THEN? END?                { $node = new MethodDefinitionNode($NAME.text, $parameters.names, $expressions.nodes); } 
  ;

// Parameters in a method definition.
parameters returns [ArrayList<String> names]:
                                    { $names = new ArrayList<String>(); }
    head=NAME                       { $names.add($head.text); }
    (COMMA (ANDE)?
     tail=NAME                      { $names.add($tail.text); }
    )*
  ;


classDefinition returns [ClassDefinitionNode node]:
    A? name=CONSTANT ISATYPEOF superClass=CONSTANT terminator?
      expressions
    END                             { $node = new ClassDefinitionNode($name.text, $superClass.text, $expressions.nodes); }
  ;

ifBlock returns [IfNode node]:
    IF condition=expression terminator
      ifBody=expressions
    ((ELSE|IF NOTE) terminator
      elseBody=expressions
    )?
    (END|DOT)                             { $node = new IfNode($condition.node, $ifBody.nodes, $elseBody.nodes); }
  ;

forBlock returns [ForNode node]:
    DOTHEFOLLOWING INTEGER TIMES terminator?
      body=expressions
    END                                    { $node = new ForNode($INTEGER.text, $body.nodes); } 
  | DOTHEFOLLOWING iterations=INTEGER TIMES             
    (WITH name=NAME INCREMENTING BY increment=INTEGER   
      COMMA? STARTING? FROM start=INTEGER terminator?)?             
      body=expressions
    END                             { $node = new ForNode($iterations.text, $name.text, $increment.text, $start.text, $body.nodes); }
  | DOTHEFOLLOWING WITH name=NAME INCREMENTING BY increment=INTEGER UNTIL iterations=INTEGER STARTING? FROM start=INTEGER terminator?            
      body=expressions
    END                             { $node = new ForNode($iterations.text, $name.text, $increment.text, $start.text, $body.nodes); }

  ;

whileBlock returns [WhileNode node]:
    (KEEPDOINGTHEFOLLOWINGG|WHILE) condition=expression terminator
      body=expressions
    END                             { $node = new WhileNode($condition.node, $body.nodes); }  
  | KEEPDOINGTHEFOLLOWING condition=expression terminator
      body=expressions
    END                             { $node = new WhileNode($condition.node, $body.nodes, 1); }  
  ;

doWhileBlock returns [DoWhileNode node]:
    DOTHEFOLLOWING WHILE condition=expression terminator
  	  body=expressions
  	END                             { $node = new DoWhileNode($condition.node, $body.nodes); }
  ;
tryBlock returns [TryNode node]:
    TRY terminator
      tryBody=expressions                   { $node = new TryNode($tryBody.nodes); }
    (CATCH CONSTANT COLON NAME terminator
      catchBody=expressions                 { $node.addCatchBlock($CONSTANT.text, $NAME.text, $catchBody.nodes);  }
    )*
    END
  
  ;
calcBlock returns [CalcNode node]:
	EADD num=INTEGER TO name=NAME               { $node = new CalcNode($num.text, $name.text, 1, 1); }
  | ESUBTRACT num=INTEGER FROM name=NAME        { $node = new CalcNode($num.text, $name.text, 2, 1); }
  | EDIVIDE name=NAME BY num=INTEGER            { $node = new CalcNode($num.text, $name.text, 3, 1); }
  | EMULTIPLY name=NAME BY num=INTEGER          { $node = new CalcNode($num.text, $name.text, 4, 1); }
  | EADD num=FLOAT TO name=NAME               { $node = new CalcNode($num.text, $name.text, 1, 2); }
  | ESUBTRACT num=FLOAT FROM name=NAME        { $node = new CalcNode($num.text, $name.text, 2, 2); }
  | EDIVIDE name=NAME BY num=FLOAT            { $node = new CalcNode($num.text, $name.text, 3, 2); }
  | EMULTIPLY name=NAME BY num=FLOAT          { $node = new CalcNode($num.text, $name.text, 4, 2); }
  ;	