lexer grammar AkinLexer;

// Stuff added on top of the Lexer class.
@header { package akin.lang; }

// Methods added to the Lexer class.
@members {
  boolean methodMode = false; // true if we're waiting for a method name

  public Token nextToken() {
    Token t = super.nextToken();
    // DEBUG Uncomment to output tokens
    // System.out.println("TOKEN> " + t);
    return t;
  }
  
  public boolean isNum(int c) {
    return c>='0' && c<='9';
  }
  
  @Override
  public void reportError(RecognitionException e) {
    throw new RuntimeException(e);
  }
}

// Keywords
                    // {...}?=> to allow keyword as method name

ORE:                {!methodMode}?=> 'or';
ANDE:               {!methodMode}?=> 'and';
CLASS:              {!methodMode}?=> 'class';
DEF:                {!methodMode}?=> 'def';
IF:                 {!methodMode}?=> 'if' | 'If';
NOTE:               {!methodMode}?=> 'not';
ELSE:               {!methodMode}?=> 'else';
WHILE:              {!methodMode}?=> 'while' | 'While';
TRY:                {!methodMode}?=> 'try';
CATCH:              {!methodMode}?=> 'catch';
END:                {!methodMode}?=> 'end' | 'That is all it has and can do.' | 'yolo' | 'end.';
SELF:               {!methodMode}?=> 'self';
NIL:                {!methodMode}?=> 'nil';
TRUE:               {!methodMode}?=> 'true';
FALSE:              {!methodMode}?=> 'false';
IS:                 {!methodMode}?=> 'is';
A:                  {!methodMode}?=> 'a' | 'A';
TYPE:               {!methodMode}?=> 'type';
OF:                 {!methodMode}?=> 'of';
THAN:               {!methodMode}?=> 'than';
GREATER:            {!methodMode}?=> 'greater';
EQUAL:              {!methodMode}?=> 'equal';
TO:                 {!methodMode}?=> 'to' | 'To';
ISTO:               {!methodMode}?=> 'is to';
CAN:                {!methodMode}?=> 'can' | 'Can';
THE:                {!methodMode}?=> 'the' | 'The';
OET:                {!methodMode}?=> 'or equal to';
GTT:                {!methodMode}?=> 'is greater than';
LTT:                {!methodMode}?=> 'is less than';
ETT:                {!methodMode}?=> 'is equal to';
ISATYPEOF:          {!methodMode}?=> 'is a type of';
MAKE:               {!methodMode}?=> 'make';
OFTHIS:             {!methodMode}?=> 'of this';
EPLUS:              {!methodMode}?=> 'plus';
EADD:               {!methodMode}?=> 'add' | 'Add';
EMINUS:             {!methodMode}?=> 'minus';
ESUBTRACT:          {!methodMode}?=> 'subtract' | 'Subtract';
EMULTIPLY:          {!methodMode}?=> 'multiply' | 'Multiply';
EDIVIDE:            {!methodMode}?=> 'divide' | 'Divide';
USING:              {!methodMode}?=> 'using';
THISCAN:            {!methodMode}?=> 'This can';
THIS:               {!methodMode}?=> 'This' | 'this';
WHICHISTO:          {!methodMode}?=> 'which is to';
WHICH:              {!methodMode}?=> 'which';
IT:                 {!methodMode}?=> 'It';
ALSO:               {!methodMode}?=> 'also';
DOTHEFOLLOWING:     {!methodMode}?=> 'Do the following'; 
YOU:                {!methodMode}?=> 'You';
WITH:               {!methodMode}?=> 'with';
THEN:               {!methodMode}?=> 'then';
TRYTO:              {!methodMode}?=> 'Try to';
INCREASING:         {!methodMode}?=> 'increasing';
DECREASING:         {!methodMode}?=> 'decreasing';
TIMES:              {!methodMode}?=> 'times';
INCREMENTING:       {!methodMode}?=> 'incrementing';
BY:                 {!methodMode}?=> 'by';
FROM:               {!methodMode}?=> 'from';
STARTING:           {!methodMode}?=> 'starting';
MAKETHECOMPUTER:    {!methodMode}?=> 'Make the computer';
CALCULATE:          {!methodMode}?=> 'calculate';
UNTIL:              {!methodMode}?=> 'until it reaches';
UNTILL:             {!methodMode}?=> 'until';
ENDMETHODCALL:      {!methodMode}?=> 'endmethodcall';
GET:                {!methodMode}?=> 'get';
KEEPDOINGTHEFOLLOWING:  {!methodMode}?=> 'Keep doing the following until';
KEEPDOINGTHEFOLLOWINGG:  {!methodMode}?=> 'Keep doing the following while';
ENDD:               {!methodMode}?=> 'termin';
// Literals 
fragment INTEGER:;
fragment FLOAT:;
NUMBER:             '-'? DIGIT+
                      // Fix ambiguity with dot for message sending (DOT NAME).
                      ( {isNum(input.LA(2))}?=> '.' DIGIT+  { $type = FLOAT; }
                      |                                     { $type = INTEGER; }
                      );
STRING:             '"' ~('\\' | '"')* '"';
NAME:               (LOWER | '_') ID_CHAR* ('!' | '?')? { methodMode = false; };
CONSTANT:           UPPER ID_CHAR*;
SNAME:              NAME CAN;

// Operators
SEMICOLON:          ';';
COLON:              ':';
DOT:                '.' { methodMode = true; };
COMMA:              ',';
OPEN_PARENT:        '(';
CLOSE_PARENT:       ')';
AT:                 '@';
EQ:                 '==';
LE:                 '<=';
GE:                 '>=';
NE:                 '!=';
LT:                 '<';
GT:                 '>';
PLUS:               '+';
MINUS:              '-';
MUL:                '*';
DIV:                '/';
MOD:                '%';
AND:                '&&';
OR:                 '||';

NOT:                '!';
ASSIGN:             '=' | 'equals';

COMMENT:            '#' ~('\r' | '\n')* (NEWLINE | EOF) { skip(); };

NEWLINE:            '\r'? '\n';
WHITESPACE:         SPACE+ { $channel = HIDDEN; }; // ignore whitespace
DOTSPACE:           DOT WHITESPACE;
fragment LETTER:    LOWER | UPPER;
fragment ID_CHAR:   LETTER | DIGIT | '_';
fragment LOWER:     'a'..'z';
fragment UPPER:     'A'..'Z';
fragment DIGIT:     '0'..'9';
fragment SPACE:     ' ' | '\t';

