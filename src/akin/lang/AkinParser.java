// $ANTLR 3.1.1 AkinParser.g 2013-02-21 00:37:27

  package akin.lang;
  
  import akin.lang.nodes.*;
  import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class AkinParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ORE", "ANDE", "CLASS", "DEF", "IF", "NOTE", "ELSE", "WHILE", "TRY", "CATCH", "END", "SELF", "NIL", "TRUE", "FALSE", "IS", "A", "TYPE", "OF", "THAN", "GREATER", "EQUAL", "TO", "ISTO", "CAN", "THE", "OET", "GTT", "LTT", "ETT", "ISATYPEOF", "MAKE", "OFTHIS", "EPLUS", "EADD", "EMINUS", "ESUBTRACT", "EMULTIPLY", "EDIVIDE", "USING", "THISCAN", "THIS", "WHICHISTO", "WHICH", "IT", "ALSO", "DOTHEFOLLOWING", "YOU", "WITH", "THEN", "TRYTO", "INCREASING", "DECREASING", "TIMES", "INCREMENTING", "BY", "FROM", "STARTING", "MAKETHECOMPUTER", "CALCULATE", "UNTIL", "UNTILL", "ENDMETHODCALL", "GET", "KEEPDOINGTHEFOLLOWING", "KEEPDOINGTHEFOLLOWINGG", "ENDD", "INTEGER", "FLOAT", "DIGIT", "NUMBER", "STRING", "LOWER", "ID_CHAR", "NAME", "UPPER", "CONSTANT", "SNAME", "SEMICOLON", "COLON", "DOT", "COMMA", "OPEN_PARENT", "CLOSE_PARENT", "AT", "EQ", "LE", "GE", "NE", "LT", "GT", "PLUS", "MINUS", "MUL", "DIV", "MOD", "AND", "OR", "NOT", "ASSIGN", "NEWLINE", "COMMENT", "SPACE", "WHITESPACE", "DOTSPACE", "LETTER", "HAS"
    };
    public static final int LT=93;
    public static final int WHILE=11;
    public static final int WHICHISTO=46;
    public static final int LETTER=109;
    public static final int MOD=99;
    public static final int DOTHEFOLLOWING=50;
    public static final int NOT=102;
    public static final int EOF=-1;
    public static final int ISATYPEOF=34;
    public static final int TYPE=21;
    public static final int HAS=110;
    public static final int ENDMETHODCALL=66;
    public static final int NAME=78;
    public static final int GREATER=24;
    public static final int THAN=23;
    public static final int USING=43;
    public static final int EADD=38;
    public static final int THIS=45;
    public static final int GET=67;
    public static final int EQ=89;
    public static final int DECREASING=56;
    public static final int COMMENT=105;
    public static final int YOU=51;
    public static final int NE=92;
    public static final int GE=91;
    public static final int A=20;
    public static final int ELSE=10;
    public static final int NUMBER=74;
    public static final int WHITESPACE=107;
    public static final int SEMICOLON=82;
    public static final int ETT=33;
    public static final int OF=22;
    public static final int MUL=97;
    public static final int TRY=12;
    public static final int OET=30;
    public static final int THISCAN=44;
    public static final int EMULTIPLY=41;
    public static final int NIL=16;
    public static final int SNAME=81;
    public static final int ESUBTRACT=40;
    public static final int CALCULATE=63;
    public static final int UNTIL=64;
    public static final int ALSO=49;
    public static final int GTT=31;
    public static final int OR=101;
    public static final int CLOSE_PARENT=87;
    public static final int CONSTANT=80;
    public static final int GT=94;
    public static final int LOWER=76;
    public static final int CATCH=13;
    public static final int END=14;
    public static final int FROM=60;
    public static final int FALSE=18;
    public static final int ENDD=70;
    public static final int ANDE=5;
    public static final int UPPER=79;
    public static final int CLASS=6;
    public static final int DEF=7;
    public static final int KEEPDOINGTHEFOLLOWING=68;
    public static final int THE=29;
    public static final int ID_CHAR=77;
    public static final int MAKETHECOMPUTER=62;
    public static final int FLOAT=72;
    public static final int OFTHIS=36;
    public static final int AND=100;
    public static final int SPACE=106;
    public static final int ORE=4;
    public static final int CAN=28;
    public static final int IF=8;
    public static final int AT=88;
    public static final int THEN=53;
    public static final int COMMA=85;
    public static final int IS=19;
    public static final int NOTE=9;
    public static final int IT=48;
    public static final int INCREMENTING=58;
    public static final int EQUAL=25;
    public static final int PLUS=95;
    public static final int DIGIT=73;
    public static final int DOT=84;
    public static final int WITH=52;
    public static final int WHICH=47;
    public static final int INTEGER=71;
    public static final int BY=59;
    public static final int DOTSPACE=108;
    public static final int TO=26;
    public static final int MAKE=35;
    public static final int ISTO=27;
    public static final int KEEPDOINGTHEFOLLOWINGG=69;
    public static final int MINUS=96;
    public static final int TRYTO=54;
    public static final int TRUE=17;
    public static final int COLON=83;
    public static final int EDIVIDE=42;
    public static final int UNTILL=65;
    public static final int INCREASING=55;
    public static final int NEWLINE=104;
    public static final int EMINUS=39;
    public static final int LTT=32;
    public static final int OPEN_PARENT=86;
    public static final int STARTING=61;
    public static final int ASSIGN=103;
    public static final int EPLUS=37;
    public static final int DIV=98;
    public static final int TIMES=57;
    public static final int SELF=15;
    public static final int LE=90;
    public static final int STRING=75;

    // delegates
    // delegators


        public AkinParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public AkinParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return AkinParser.tokenNames; }
    public String getGrammarFileName() { return "AkinParser.g"; }


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


    public static class root_return extends ParserRuleReturnScope {
        public Nodes nodes;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "root"
    // AkinParser.g:55:1: root returns [Nodes nodes] : ( terminator )? ( expressions )? EOF ;
    public final AkinParser.root_return root() throws RecognitionException {
        AkinParser.root_return retval = new AkinParser.root_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF3=null;
        AkinParser.terminator_return terminator1 = null;

        AkinParser.expressions_return expressions2 = null;


        Object EOF3_tree=null;

        try {
            // AkinParser.g:55:27: ( ( terminator )? ( expressions )? EOF )
            // AkinParser.g:56:5: ( terminator )? ( expressions )? EOF
            {
            root_0 = (Object)adaptor.nil();

            // AkinParser.g:56:5: ( terminator )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=SEMICOLON && LA1_0<=COLON)||LA1_0==COMMA||LA1_0==NEWLINE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // AkinParser.g:0:0: terminator
                    {
                    pushFollow(FOLLOW_terminator_in_root77);
                    terminator1=terminator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator1.getTree());

                    }
                    break;

            }

            // AkinParser.g:56:17: ( expressions )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==IF||(LA2_0>=WHILE && LA2_0<=TRY)||(LA2_0>=SELF && LA2_0<=FALSE)||LA2_0==A||LA2_0==TO||LA2_0==THE||LA2_0==MAKE||LA2_0==EADD||(LA2_0>=ESUBTRACT && LA2_0<=EDIVIDE)||LA2_0==THIS||LA2_0==IT||(LA2_0>=DOTHEFOLLOWING && LA2_0<=YOU)||LA2_0==MAKETHECOMPUTER||(LA2_0>=KEEPDOINGTHEFOLLOWING && LA2_0<=KEEPDOINGTHEFOLLOWINGG)||(LA2_0>=INTEGER && LA2_0<=FLOAT)||LA2_0==STRING||LA2_0==NAME||LA2_0==CONSTANT||LA2_0==OPEN_PARENT||LA2_0==AT||LA2_0==NOT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // AkinParser.g:0:0: expressions
                    {
                    pushFollow(FOLLOW_expressions_in_root80);
                    expressions2=expressions();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressions2.getTree());

                    }
                    break;

            }

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_root83); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.nodes = (expressions2!=null?expressions2.nodes:null); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "root"

    public static class expressions_return extends ParserRuleReturnScope {
        public Nodes nodes;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressions"
    // AkinParser.g:60:1: expressions returns [Nodes nodes] : head= expression ( terminator tail= expression )* ( terminator )? ;
    public final AkinParser.expressions_return expressions() throws RecognitionException {
        AkinParser.expressions_return retval = new AkinParser.expressions_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        AkinParser.expression_return head = null;

        AkinParser.expression_return tail = null;

        AkinParser.terminator_return terminator4 = null;

        AkinParser.terminator_return terminator5 = null;



        try {
            // AkinParser.g:60:34: (head= expression ( terminator tail= expression )* ( terminator )? )
            // AkinParser.g:61:23: head= expression ( terminator tail= expression )* ( terminator )?
            {
            root_0 = (Object)adaptor.nil();

            if ( state.backtracking==0 ) {
               retval.nodes = new Nodes(); 
            }
            pushFollow(FOLLOW_expression_in_expressions131);
            head=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, head.getTree());
            if ( state.backtracking==0 ) {
               retval.nodes.add((head!=null?head.node:null)); 
            }
            // AkinParser.g:63:5: ( terminator tail= expression )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==COMMA) ) {
                    int LA3_1 = input.LA(2);

                    if ( (synpred3_AkinParser()) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>=SEMICOLON && LA3_0<=COLON)||LA3_0==NEWLINE) ) {
                    int LA3_3 = input.LA(2);

                    if ( (synpred3_AkinParser()) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // AkinParser.g:63:6: terminator tail= expression
            	    {
            	    pushFollow(FOLLOW_terminator_in_expressions142);
            	    terminator4=terminator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator4.getTree());
            	    pushFollow(FOLLOW_expression_in_expressions151);
            	    tail=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, tail.getTree());
            	    if ( state.backtracking==0 ) {
            	       retval.nodes.add((tail!=null?tail.node:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // AkinParser.g:66:5: ( terminator )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==COMMA) ) {
                int LA4_1 = input.LA(2);

                if ( (synpred4_AkinParser()) ) {
                    alt4=1;
                }
            }
            else if ( ((LA4_0>=SEMICOLON && LA4_0<=COLON)||LA4_0==NEWLINE) ) {
                int LA4_3 = input.LA(2);

                if ( (synpred4_AkinParser()) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // AkinParser.g:0:0: terminator
                    {
                    pushFollow(FOLLOW_terminator_in_expressions167);
                    terminator5=terminator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator5.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressions"

    public static class expression_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // AkinParser.g:70:1: expression returns [Node node] : assignExpression ;
    public final AkinParser.expression_return expression() throws RecognitionException {
        AkinParser.expression_return retval = new AkinParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        AkinParser.assignExpression_return assignExpression6 = null;



        try {
            // AkinParser.g:70:31: ( assignExpression )
            // AkinParser.g:71:5: assignExpression
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_assignExpression_in_expression187);
            assignExpression6=assignExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignExpression6.getTree());
            if ( state.backtracking==0 ) {
               retval.node = (assignExpression6!=null?assignExpression6.node:null); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class terminator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "terminator"
    // AkinParser.g:75:1: terminator : ( NEWLINE | SEMICOLON | COLON | COMMA )+ ;
    public final AkinParser.terminator_return terminator() throws RecognitionException {
        AkinParser.terminator_return retval = new AkinParser.terminator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set7=null;

        Object set7_tree=null;

        try {
            // AkinParser.g:75:11: ( ( NEWLINE | SEMICOLON | COLON | COMMA )+ )
            // AkinParser.g:75:13: ( NEWLINE | SEMICOLON | COLON | COMMA )+
            {
            root_0 = (Object)adaptor.nil();

            // AkinParser.g:75:13: ( NEWLINE | SEMICOLON | COLON | COMMA )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }
                else if ( ((LA5_0>=SEMICOLON && LA5_0<=COLON)||LA5_0==NEWLINE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // AkinParser.g:
            	    {
            	    set7=(Token)input.LT(1);
            	    if ( (input.LA(1)>=SEMICOLON && input.LA(1)<=COLON)||input.LA(1)==COMMA||input.LA(1)==NEWLINE ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set7));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "terminator"

    public static class assignExpression_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignExpression"
    // AkinParser.g:81:1: assignExpression returns [Node node] : ( assign | e= orExpression );
    public final AkinParser.assignExpression_return assignExpression() throws RecognitionException {
        AkinParser.assignExpression_return retval = new AkinParser.assignExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        AkinParser.orExpression_return e = null;

        AkinParser.assign_return assign8 = null;



        try {
            // AkinParser.g:81:37: ( assign | e= orExpression )
            int alt6=2;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==ASSIGN) ) {
                    alt6=1;
                }
                else if ( (LA6_1==EOF||(LA6_1>=ORE && LA6_1<=ANDE)||LA6_1==IF||LA6_1==ELSE||(LA6_1>=CATCH && LA6_1<=END)||(LA6_1>=GTT && LA6_1<=ETT)||LA6_1==THEN||LA6_1==MAKETHECOMPUTER||LA6_1==NAME||(LA6_1>=SEMICOLON && LA6_1<=CLOSE_PARENT)||(LA6_1>=EQ && LA6_1<=OR)||LA6_1==NEWLINE) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case CONSTANT:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==ASSIGN) ) {
                    alt6=1;
                }
                else if ( (LA6_2==EOF||(LA6_2>=ORE && LA6_2<=ANDE)||LA6_2==IF||LA6_2==ELSE||(LA6_2>=CATCH && LA6_2<=END)||(LA6_2>=GTT && LA6_2<=ISATYPEOF)||LA6_2==THEN||(LA6_2>=SEMICOLON && LA6_2<=COMMA)||LA6_2==CLOSE_PARENT||(LA6_2>=EQ && LA6_2<=OR)||LA6_2==NEWLINE) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case AT:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==NAME) ) {
                    int LA6_6 = input.LA(3);

                    if ( (LA6_6==ASSIGN) ) {
                        alt6=1;
                    }
                    else if ( (LA6_6==EOF||(LA6_6>=ORE && LA6_6<=ANDE)||LA6_6==IF||LA6_6==ELSE||(LA6_6>=CATCH && LA6_6<=END)||(LA6_6>=GTT && LA6_6<=ETT)||LA6_6==THEN||(LA6_6>=SEMICOLON && LA6_6<=COMMA)||LA6_6==CLOSE_PARENT||(LA6_6>=EQ && LA6_6<=OR)||LA6_6==NEWLINE) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case IF:
            case WHILE:
            case TRY:
            case SELF:
            case NIL:
            case TRUE:
            case FALSE:
            case A:
            case TO:
            case THE:
            case MAKE:
            case EADD:
            case ESUBTRACT:
            case EMULTIPLY:
            case EDIVIDE:
            case THIS:
            case IT:
            case DOTHEFOLLOWING:
            case YOU:
            case MAKETHECOMPUTER:
            case KEEPDOINGTHEFOLLOWING:
            case KEEPDOINGTHEFOLLOWINGG:
            case INTEGER:
            case FLOAT:
            case STRING:
            case OPEN_PARENT:
            case NOT:
                {
                alt6=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // AkinParser.g:82:5: assign
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assign_in_assignExpression239);
                    assign8=assign();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assign8.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (assign8!=null?assign8.node:null); 
                    }

                    }
                    break;
                case 2 :
                    // AkinParser.g:83:5: e= orExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_orExpression_in_assignExpression264);
                    e=orExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (e!=null?e.node:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignExpression"

    public static class orExpression_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orExpression"
    // AkinParser.g:86:1: orExpression returns [Node node] : (receiver= andExpression ( OR | ORE ) arg= orExpression | e= andExpression );
    public final AkinParser.orExpression_return orExpression() throws RecognitionException {
        AkinParser.orExpression_return retval = new AkinParser.orExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set9=null;
        AkinParser.andExpression_return receiver = null;

        AkinParser.orExpression_return arg = null;

        AkinParser.andExpression_return e = null;


        Object set9_tree=null;

        try {
            // AkinParser.g:86:33: (receiver= andExpression ( OR | ORE ) arg= orExpression | e= andExpression )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // AkinParser.g:87:5: receiver= andExpression ( OR | ORE ) arg= orExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_andExpression_in_orExpression292);
                    receiver=andExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, receiver.getTree());
                    set9=(Token)input.LT(1);
                    if ( input.LA(1)==ORE||input.LA(1)==OR ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set9));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_orExpression_in_orExpression308);
                    arg=orExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arg.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new OrNode((receiver!=null?receiver.node:null), (arg!=null?arg.node:null)); 
                    }

                    }
                    break;
                case 2 :
                    // AkinParser.g:89:5: e= andExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_andExpression_in_orExpression324);
                    e=andExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (e!=null?e.node:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orExpression"

    public static class andExpression_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andExpression"
    // AkinParser.g:92:1: andExpression returns [Node node] : (receiver= relationalExpression ( AND | ANDE ) arg= andExpression | e= relationalExpression );
    public final AkinParser.andExpression_return andExpression() throws RecognitionException {
        AkinParser.andExpression_return retval = new AkinParser.andExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set10=null;
        AkinParser.relationalExpression_return receiver = null;

        AkinParser.andExpression_return arg = null;

        AkinParser.relationalExpression_return e = null;


        Object set10_tree=null;

        try {
            // AkinParser.g:92:34: (receiver= relationalExpression ( AND | ANDE ) arg= andExpression | e= relationalExpression )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // AkinParser.g:93:5: receiver= relationalExpression ( AND | ANDE ) arg= andExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relationalExpression_in_andExpression358);
                    receiver=relationalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, receiver.getTree());
                    set10=(Token)input.LT(1);
                    if ( input.LA(1)==ANDE||input.LA(1)==AND ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set10));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_andExpression_in_andExpression374);
                    arg=andExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arg.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new AndNode((receiver!=null?receiver.node:null), (arg!=null?arg.node:null)); 
                    }

                    }
                    break;
                case 2 :
                    // AkinParser.g:95:5: e= relationalExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relationalExpression_in_andExpression388);
                    e=relationalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (e!=null?e.node:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "andExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
    // AkinParser.g:98:1: relationalExpression returns [Node node] : (receiver= additiveExpression op= ( EQ | LE | GE | LT | GT | GTT | LTT | ETT | NE ) arg= relationalExpression | e= additiveExpression );
    public final AkinParser.relationalExpression_return relationalExpression() throws RecognitionException {
        AkinParser.relationalExpression_return retval = new AkinParser.relationalExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        AkinParser.additiveExpression_return receiver = null;

        AkinParser.relationalExpression_return arg = null;

        AkinParser.additiveExpression_return e = null;


        Object op_tree=null;

        try {
            // AkinParser.g:98:41: (receiver= additiveExpression op= ( EQ | LE | GE | LT | GT | GTT | LTT | ETT | NE ) arg= relationalExpression | e= additiveExpression )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // AkinParser.g:99:5: receiver= additiveExpression op= ( EQ | LE | GE | LT | GT | GTT | LTT | ETT | NE ) arg= relationalExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_additiveExpression_in_relationalExpression415);
                    receiver=additiveExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, receiver.getTree());
                    op=(Token)input.LT(1);
                    if ( (input.LA(1)>=GTT && input.LA(1)<=ETT)||(input.LA(1)>=EQ && input.LA(1)<=GT) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(op));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_relationalExpression_in_relationalExpression455);
                    arg=relationalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arg.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new CallNode((op!=null?op.getText():null), (receiver!=null?receiver.node:null), (arg!=null?arg.node:null)); 
                    }

                    }
                    break;
                case 2 :
                    // AkinParser.g:102:5: e= additiveExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_additiveExpression_in_relationalExpression466);
                    e=additiveExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (e!=null?e.node:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // AkinParser.g:105:1: additiveExpression returns [Node node] : (receiver= multiplicativeExpression op= ( PLUS | MINUS ) arg= additiveExpression | e= multiplicativeExpression );
    public final AkinParser.additiveExpression_return additiveExpression() throws RecognitionException {
        AkinParser.additiveExpression_return retval = new AkinParser.additiveExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        AkinParser.multiplicativeExpression_return receiver = null;

        AkinParser.additiveExpression_return arg = null;

        AkinParser.multiplicativeExpression_return e = null;


        Object op_tree=null;

        try {
            // AkinParser.g:105:39: (receiver= multiplicativeExpression op= ( PLUS | MINUS ) arg= additiveExpression | e= multiplicativeExpression )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // AkinParser.g:106:5: receiver= multiplicativeExpression op= ( PLUS | MINUS ) arg= additiveExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression495);
                    receiver=multiplicativeExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, receiver.getTree());
                    op=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(op));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_additiveExpression_in_additiveExpression513);
                    arg=additiveExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arg.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new CallNode((op!=null?op.getText():null), (receiver!=null?receiver.node:null), (arg!=null?arg.node:null)); 
                    }

                    }
                    break;
                case 2 :
                    // AkinParser.g:108:5: e= multiplicativeExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression524);
                    e=multiplicativeExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (e!=null?e.node:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // AkinParser.g:111:1: multiplicativeExpression returns [Node node] : (receiver= unaryExpression op= ( MUL | DIV | MOD ) arg= multiplicativeExpression | e= unaryExpression );
    public final AkinParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        AkinParser.multiplicativeExpression_return retval = new AkinParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token op=null;
        AkinParser.unaryExpression_return receiver = null;

        AkinParser.multiplicativeExpression_return arg = null;

        AkinParser.unaryExpression_return e = null;


        Object op_tree=null;

        try {
            // AkinParser.g:111:45: (receiver= unaryExpression op= ( MUL | DIV | MOD ) arg= multiplicativeExpression | e= unaryExpression )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // AkinParser.g:112:5: receiver= unaryExpression op= ( MUL | DIV | MOD ) arg= multiplicativeExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression561);
                    receiver=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, receiver.getTree());
                    op=(Token)input.LT(1);
                    if ( (input.LA(1)>=MUL && input.LA(1)<=MOD) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(op));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_multiplicativeExpression_in_multiplicativeExpression581);
                    arg=multiplicativeExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arg.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new CallNode((op!=null?op.getText():null), (receiver!=null?receiver.node:null), (arg!=null?arg.node:null)); 
                    }

                    }
                    break;
                case 2 :
                    // AkinParser.g:114:5: e= unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression592);
                    e=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (e!=null?e.node:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // AkinParser.g:117:1: unaryExpression returns [Node node] : ( NOT receiver= unaryExpression | e= primaryExpression );
    public final AkinParser.unaryExpression_return unaryExpression() throws RecognitionException {
        AkinParser.unaryExpression_return retval = new AkinParser.unaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT11=null;
        AkinParser.unaryExpression_return receiver = null;

        AkinParser.primaryExpression_return e = null;


        Object NOT11_tree=null;

        try {
            // AkinParser.g:117:36: ( NOT receiver= unaryExpression | e= primaryExpression )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NOT) ) {
                alt12=1;
            }
            else if ( (LA12_0==IF||(LA12_0>=WHILE && LA12_0<=TRY)||(LA12_0>=SELF && LA12_0<=FALSE)||LA12_0==A||LA12_0==TO||LA12_0==THE||LA12_0==MAKE||LA12_0==EADD||(LA12_0>=ESUBTRACT && LA12_0<=EDIVIDE)||LA12_0==THIS||LA12_0==IT||(LA12_0>=DOTHEFOLLOWING && LA12_0<=YOU)||LA12_0==MAKETHECOMPUTER||(LA12_0>=KEEPDOINGTHEFOLLOWING && LA12_0<=KEEPDOINGTHEFOLLOWINGG)||(LA12_0>=INTEGER && LA12_0<=FLOAT)||LA12_0==STRING||LA12_0==NAME||LA12_0==CONSTANT||LA12_0==OPEN_PARENT||LA12_0==AT) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // AkinParser.g:118:5: NOT receiver= unaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT11=(Token)match(input,NOT,FOLLOW_NOT_in_unaryExpression643); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT11_tree = (Object)adaptor.create(NOT11);
                    adaptor.addChild(root_0, NOT11_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression647);
                    receiver=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, receiver.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new NotNode((receiver!=null?receiver.node:null)); 
                    }

                    }
                    break;
                case 2 :
                    // AkinParser.g:119:5: e= primaryExpression
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_unaryExpression663);
                    e=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (e!=null?e.node:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class primaryExpression_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primaryExpression"
    // AkinParser.g:123:1: primaryExpression returns [Node node] : ( literal | call | methodDefinition | classDefinition | ifBlock | whileBlock | doWhileBlock | forBlock | calcBlock | tryBlock | OPEN_PARENT expression CLOSE_PARENT );
    public final AkinParser.primaryExpression_return primaryExpression() throws RecognitionException {
        AkinParser.primaryExpression_return retval = new AkinParser.primaryExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN_PARENT22=null;
        Token CLOSE_PARENT24=null;
        AkinParser.literal_return literal12 = null;

        AkinParser.call_return call13 = null;

        AkinParser.methodDefinition_return methodDefinition14 = null;

        AkinParser.classDefinition_return classDefinition15 = null;

        AkinParser.ifBlock_return ifBlock16 = null;

        AkinParser.whileBlock_return whileBlock17 = null;

        AkinParser.doWhileBlock_return doWhileBlock18 = null;

        AkinParser.forBlock_return forBlock19 = null;

        AkinParser.calcBlock_return calcBlock20 = null;

        AkinParser.tryBlock_return tryBlock21 = null;

        AkinParser.expression_return expression23 = null;


        Object OPEN_PARENT22_tree=null;
        Object CLOSE_PARENT24_tree=null;

        try {
            // AkinParser.g:123:38: ( literal | call | methodDefinition | classDefinition | ifBlock | whileBlock | doWhileBlock | forBlock | calcBlock | tryBlock | OPEN_PARENT expression CLOSE_PARENT )
            int alt13=11;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // AkinParser.g:124:5: literal
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpression699);
                    literal12=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal12.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (literal12!=null?literal12.node:null); 
                    }

                    }
                    break;
                case 2 :
                    // AkinParser.g:125:5: call
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_in_primaryExpression717);
                    call13=call();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, call13.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (call13!=null?call13.node:null); 
                    }

                    }
                    break;
                case 3 :
                    // AkinParser.g:126:5: methodDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_methodDefinition_in_primaryExpression738);
                    methodDefinition14=methodDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, methodDefinition14.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (methodDefinition14!=null?methodDefinition14.node:null); 
                    }

                    }
                    break;
                case 4 :
                    // AkinParser.g:127:5: classDefinition
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_classDefinition_in_primaryExpression747);
                    classDefinition15=classDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classDefinition15.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (classDefinition15!=null?classDefinition15.node:null); 
                    }

                    }
                    break;
                case 5 :
                    // AkinParser.g:128:5: ifBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifBlock_in_primaryExpression757);
                    ifBlock16=ifBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ifBlock16.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (ifBlock16!=null?ifBlock16.node:null); 
                    }

                    }
                    break;
                case 6 :
                    // AkinParser.g:129:5: whileBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileBlock_in_primaryExpression775);
                    whileBlock17=whileBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whileBlock17.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (whileBlock17!=null?whileBlock17.node:null); 
                    }

                    }
                    break;
                case 7 :
                    // AkinParser.g:130:5: doWhileBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_doWhileBlock_in_primaryExpression790);
                    doWhileBlock18=doWhileBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, doWhileBlock18.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (doWhileBlock18!=null?doWhileBlock18.node:null); 
                    }

                    }
                    break;
                case 8 :
                    // AkinParser.g:131:5: forBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forBlock_in_primaryExpression803);
                    forBlock19=forBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, forBlock19.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (forBlock19!=null?forBlock19.node:null); 
                    }

                    }
                    break;
                case 9 :
                    // AkinParser.g:132:5: calcBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_calcBlock_in_primaryExpression820);
                    calcBlock20=calcBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, calcBlock20.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (calcBlock20!=null?calcBlock20.node:null); 
                    }

                    }
                    break;
                case 10 :
                    // AkinParser.g:133:5: tryBlock
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tryBlock_in_primaryExpression836);
                    tryBlock21=tryBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tryBlock21.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (tryBlock21!=null?tryBlock21.node:null); 
                    }

                    }
                    break;
                case 11 :
                    // AkinParser.g:134:5: OPEN_PARENT expression CLOSE_PARENT
                    {
                    root_0 = (Object)adaptor.nil();

                    OPEN_PARENT22=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_primaryExpression853); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OPEN_PARENT22_tree = (Object)adaptor.create(OPEN_PARENT22);
                    adaptor.addChild(root_0, OPEN_PARENT22_tree);
                    }
                    pushFollow(FOLLOW_expression_in_primaryExpression861);
                    expression23=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression23.getTree());
                    CLOSE_PARENT24=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_primaryExpression867); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLOSE_PARENT24_tree = (Object)adaptor.create(CLOSE_PARENT24);
                    adaptor.addChild(root_0, CLOSE_PARENT24_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = (expression23!=null?expression23.node:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primaryExpression"

    public static class literal_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // AkinParser.g:140:1: literal returns [Node node] : ( STRING | INTEGER | FLOAT | NIL | TRUE | FALSE | constant | instanceVariable | self );
    public final AkinParser.literal_return literal() throws RecognitionException {
        AkinParser.literal_return retval = new AkinParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING25=null;
        Token INTEGER26=null;
        Token FLOAT27=null;
        Token NIL28=null;
        Token TRUE29=null;
        Token FALSE30=null;
        AkinParser.constant_return constant31 = null;

        AkinParser.instanceVariable_return instanceVariable32 = null;

        AkinParser.self_return self33 = null;


        Object STRING25_tree=null;
        Object INTEGER26_tree=null;
        Object FLOAT27_tree=null;
        Object NIL28_tree=null;
        Object TRUE29_tree=null;
        Object FALSE30_tree=null;

        try {
            // AkinParser.g:140:28: ( STRING | INTEGER | FLOAT | NIL | TRUE | FALSE | constant | instanceVariable | self )
            int alt14=9;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt14=1;
                }
                break;
            case INTEGER:
                {
                alt14=2;
                }
                break;
            case FLOAT:
                {
                alt14=3;
                }
                break;
            case NIL:
                {
                alt14=4;
                }
                break;
            case TRUE:
                {
                alt14=5;
                }
                break;
            case FALSE:
                {
                alt14=6;
                }
                break;
            case CONSTANT:
                {
                alt14=7;
                }
                break;
            case THE:
            case THIS:
            case AT:
                {
                alt14=8;
                }
                break;
            case SELF:
                {
                alt14=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // AkinParser.g:141:5: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING25=(Token)match(input,STRING,FOLLOW_STRING_in_literal893); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING25_tree = (Object)adaptor.create(STRING25);
                    adaptor.addChild(root_0, STRING25_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new LiteralNode(new ValueObject((STRING25!=null?STRING25.getText():null).substring(1, (STRING25!=null?STRING25.getText():null).length() - 1))); 
                    }

                    }
                    break;
                case 2 :
                    // AkinParser.g:142:5: INTEGER
                    {
                    root_0 = (Object)adaptor.nil();

                    INTEGER26=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_literal912); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER26_tree = (Object)adaptor.create(INTEGER26);
                    adaptor.addChild(root_0, INTEGER26_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new LiteralNode(new ValueObject(new Integer((INTEGER26!=null?INTEGER26.getText():null)))); 
                    }

                    }
                    break;
                case 3 :
                    // AkinParser.g:143:5: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT27=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_literal930); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOAT27_tree = (Object)adaptor.create(FLOAT27);
                    adaptor.addChild(root_0, FLOAT27_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new LiteralNode(new ValueObject(new Float((FLOAT27!=null?FLOAT27.getText():null)))); 
                    }

                    }
                    break;
                case 4 :
                    // AkinParser.g:144:5: NIL
                    {
                    root_0 = (Object)adaptor.nil();

                    NIL28=(Token)match(input,NIL,FOLLOW_NIL_in_literal950); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NIL28_tree = (Object)adaptor.create(NIL28);
                    adaptor.addChild(root_0, NIL28_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new LiteralNode(AkinRuntime.getNil()); 
                    }

                    }
                    break;
                case 5 :
                    // AkinParser.g:145:5: TRUE
                    {
                    root_0 = (Object)adaptor.nil();

                    TRUE29=(Token)match(input,TRUE,FOLLOW_TRUE_in_literal972); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE29_tree = (Object)adaptor.create(TRUE29);
                    adaptor.addChild(root_0, TRUE29_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new LiteralNode(AkinRuntime.getTrue()); 
                    }

                    }
                    break;
                case 6 :
                    // AkinParser.g:146:5: FALSE
                    {
                    root_0 = (Object)adaptor.nil();

                    FALSE30=(Token)match(input,FALSE,FOLLOW_FALSE_in_literal993); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE30_tree = (Object)adaptor.create(FALSE30);
                    adaptor.addChild(root_0, FALSE30_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new LiteralNode(AkinRuntime.getFalse()); 
                    }

                    }
                    break;
                case 7 :
                    // AkinParser.g:147:5: constant
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_constant_in_literal1013);
                    constant31=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constant31.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (constant31!=null?constant31.node:null); 
                    }

                    }
                    break;
                case 8 :
                    // AkinParser.g:148:5: instanceVariable
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_instanceVariable_in_literal1030);
                    instanceVariable32=instanceVariable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceVariable32.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (instanceVariable32!=null?instanceVariable32.node:null); 
                    }

                    }
                    break;
                case 9 :
                    // AkinParser.g:149:5: self
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_self_in_literal1039);
                    self33=self();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, self33.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = (self33!=null?self33.node:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class self_return extends ParserRuleReturnScope {
        public SelfNode node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "self"
    // AkinParser.g:153:1: self returns [SelfNode node] : SELF ;
    public final AkinParser.self_return self() throws RecognitionException {
        AkinParser.self_return retval = new AkinParser.self_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SELF34=null;

        Object SELF34_tree=null;

        try {
            // AkinParser.g:153:29: ( SELF )
            // AkinParser.g:154:5: SELF
            {
            root_0 = (Object)adaptor.nil();

            SELF34=(Token)match(input,SELF,FOLLOW_SELF_in_self1073); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SELF34_tree = (Object)adaptor.create(SELF34);
            adaptor.addChild(root_0, SELF34_tree);
            }
            if ( state.backtracking==0 ) {
               retval.node = new SelfNode(); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "self"

    public static class instanceVariable_return extends ParserRuleReturnScope {
        public InstanceVariableNode node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instanceVariable"
    // AkinParser.g:158:1: instanceVariable returns [InstanceVariableNode node] : ( AT NAME | THE NAME OF THIS | THIS HAS A NAME ( terminator )? );
    public final AkinParser.instanceVariable_return instanceVariable() throws RecognitionException {
        AkinParser.instanceVariable_return retval = new AkinParser.instanceVariable_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AT35=null;
        Token NAME36=null;
        Token THE37=null;
        Token NAME38=null;
        Token OF39=null;
        Token THIS40=null;
        Token THIS41=null;
        Token HAS42=null;
        Token A43=null;
        Token NAME44=null;
        AkinParser.terminator_return terminator45 = null;


        Object AT35_tree=null;
        Object NAME36_tree=null;
        Object THE37_tree=null;
        Object NAME38_tree=null;
        Object OF39_tree=null;
        Object THIS40_tree=null;
        Object THIS41_tree=null;
        Object HAS42_tree=null;
        Object A43_tree=null;
        Object NAME44_tree=null;

        try {
            // AkinParser.g:158:53: ( AT NAME | THE NAME OF THIS | THIS HAS A NAME ( terminator )? )
            int alt16=3;
            switch ( input.LA(1) ) {
            case AT:
                {
                alt16=1;
                }
                break;
            case THE:
                {
                alt16=2;
                }
                break;
            case THIS:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // AkinParser.g:159:5: AT NAME
                    {
                    root_0 = (Object)adaptor.nil();

                    AT35=(Token)match(input,AT,FOLLOW_AT_in_instanceVariable1107); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AT35_tree = (Object)adaptor.create(AT35);
                    adaptor.addChild(root_0, AT35_tree);
                    }
                    NAME36=(Token)match(input,NAME,FOLLOW_NAME_in_instanceVariable1109); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME36_tree = (Object)adaptor.create(NAME36);
                    adaptor.addChild(root_0, NAME36_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new InstanceVariableNode((NAME36!=null?NAME36.getText():null)); 
                    }

                    }
                    break;
                case 2 :
                    // AkinParser.g:160:5: THE NAME OF THIS
                    {
                    root_0 = (Object)adaptor.nil();

                    THE37=(Token)match(input,THE,FOLLOW_THE_in_instanceVariable1127); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THE37_tree = (Object)adaptor.create(THE37);
                    adaptor.addChild(root_0, THE37_tree);
                    }
                    NAME38=(Token)match(input,NAME,FOLLOW_NAME_in_instanceVariable1129); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME38_tree = (Object)adaptor.create(NAME38);
                    adaptor.addChild(root_0, NAME38_tree);
                    }
                    OF39=(Token)match(input,OF,FOLLOW_OF_in_instanceVariable1131); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OF39_tree = (Object)adaptor.create(OF39);
                    adaptor.addChild(root_0, OF39_tree);
                    }
                    THIS40=(Token)match(input,THIS,FOLLOW_THIS_in_instanceVariable1133); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THIS40_tree = (Object)adaptor.create(THIS40);
                    adaptor.addChild(root_0, THIS40_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new InstanceVariableNode((NAME38!=null?NAME38.getText():null)); 
                    }

                    }
                    break;
                case 3 :
                    // AkinParser.g:161:5: THIS HAS A NAME ( terminator )?
                    {
                    root_0 = (Object)adaptor.nil();

                    THIS41=(Token)match(input,THIS,FOLLOW_THIS_in_instanceVariable1142); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THIS41_tree = (Object)adaptor.create(THIS41);
                    adaptor.addChild(root_0, THIS41_tree);
                    }
                    HAS42=(Token)match(input,HAS,FOLLOW_HAS_in_instanceVariable1144); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HAS42_tree = (Object)adaptor.create(HAS42);
                    adaptor.addChild(root_0, HAS42_tree);
                    }
                    A43=(Token)match(input,A,FOLLOW_A_in_instanceVariable1146); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    A43_tree = (Object)adaptor.create(A43);
                    adaptor.addChild(root_0, A43_tree);
                    }
                    NAME44=(Token)match(input,NAME,FOLLOW_NAME_in_instanceVariable1148); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME44_tree = (Object)adaptor.create(NAME44);
                    adaptor.addChild(root_0, NAME44_tree);
                    }
                    // AkinParser.g:161:21: ( terminator )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==COMMA) ) {
                        int LA15_1 = input.LA(2);

                        if ( (synpred49_AkinParser()) ) {
                            alt15=1;
                        }
                    }
                    else if ( ((LA15_0>=SEMICOLON && LA15_0<=COLON)||LA15_0==NEWLINE) ) {
                        int LA15_3 = input.LA(2);

                        if ( (synpred49_AkinParser()) ) {
                            alt15=1;
                        }
                    }
                    switch (alt15) {
                        case 1 :
                            // AkinParser.g:0:0: terminator
                            {
                            pushFollow(FOLLOW_terminator_in_instanceVariable1150);
                            terminator45=terminator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator45.getTree());

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       retval.node = new InstanceVariableNode((NAME44!=null?NAME44.getText():null)); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instanceVariable"

    public static class call_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call"
    // AkinParser.g:165:1: call returns [Node node] : ( ( literal DOT )? (head= message DOT )* tail= message | ( MAKE literal )? (head= message )* tail= message );
    public final AkinParser.call_return call() throws RecognitionException {
        AkinParser.call_return retval = new AkinParser.call_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOT47=null;
        Token DOT48=null;
        Token MAKE49=null;
        AkinParser.message_return head = null;

        AkinParser.message_return tail = null;

        AkinParser.literal_return literal46 = null;

        AkinParser.literal_return literal50 = null;


        Object DOT47_tree=null;
        Object DOT48_tree=null;
        Object MAKE49_tree=null;

        try {
            // AkinParser.g:165:25: ( ( literal DOT )? (head= message DOT )* tail= message | ( MAKE literal )? (head= message )* tail= message )
            int alt21=2;
            switch ( input.LA(1) ) {
            case SELF:
            case NIL:
            case TRUE:
            case FALSE:
            case THE:
            case THIS:
            case INTEGER:
            case FLOAT:
            case STRING:
            case CONSTANT:
            case AT:
                {
                alt21=1;
                }
                break;
            case NAME:
                {
                int LA21_2 = input.LA(2);

                if ( (synpred52_AkinParser()) ) {
                    alt21=1;
                }
                else if ( (true) ) {
                    alt21=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
                }
                break;
            case MAKETHECOMPUTER:
                {
                int LA21_3 = input.LA(2);

                if ( (LA21_3==NAME) ) {
                    int LA21_5 = input.LA(3);

                    if ( (synpred52_AkinParser()) ) {
                        alt21=1;
                    }
                    else if ( (true) ) {
                        alt21=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 3, input);

                    throw nvae;
                }
                }
                break;
            case MAKE:
                {
                alt21=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // AkinParser.g:166:5: ( literal DOT )? (head= message DOT )* tail= message
                    {
                    root_0 = (Object)adaptor.nil();

                    // AkinParser.g:166:5: ( literal DOT )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=SELF && LA17_0<=FALSE)||LA17_0==THE||LA17_0==THIS||(LA17_0>=INTEGER && LA17_0<=FLOAT)||LA17_0==STRING||LA17_0==CONSTANT||LA17_0==AT) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // AkinParser.g:166:6: literal DOT
                            {
                            pushFollow(FOLLOW_literal_in_call1174);
                            literal46=literal();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, literal46.getTree());
                            DOT47=(Token)match(input,DOT,FOLLOW_DOT_in_call1176); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            DOT47_tree = (Object)adaptor.create(DOT47);
                            adaptor.addChild(root_0, DOT47_tree);
                            }
                            if ( state.backtracking==0 ) {
                               retval.node = (literal46!=null?literal46.node:null); 
                            }

                            }
                            break;

                    }

                    // AkinParser.g:168:5: (head= message DOT )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==NAME) ) {
                            int LA18_1 = input.LA(2);

                            if ( (synpred51_AkinParser()) ) {
                                alt18=1;
                            }


                        }
                        else if ( (LA18_0==MAKETHECOMPUTER) ) {
                            int LA18_2 = input.LA(2);

                            if ( (synpred51_AkinParser()) ) {
                                alt18=1;
                            }


                        }


                        switch (alt18) {
                    	case 1 :
                    	    // AkinParser.g:168:6: head= message DOT
                    	    {
                    	    pushFollow(FOLLOW_message_in_call1215);
                    	    head=message();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, head.getTree());
                    	    DOT48=(Token)match(input,DOT,FOLLOW_DOT_in_call1217); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    DOT48_tree = (Object)adaptor.create(DOT48);
                    	    adaptor.addChild(root_0, DOT48_tree);
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       ((CallNode)(head!=null?head.node:null)).setReceiver(retval.node); retval.node = (head!=null?head.node:null); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    pushFollow(FOLLOW_message_in_call1250);
                    tail=message();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tail.getTree());
                    if ( state.backtracking==0 ) {
                       ((CallNode)(tail!=null?tail.node:null)).setReceiver(retval.node); retval.node = (tail!=null?tail.node:null); 
                    }

                    }
                    break;
                case 2 :
                    // AkinParser.g:171:5: ( MAKE literal )? (head= message )* tail= message
                    {
                    root_0 = (Object)adaptor.nil();

                    // AkinParser.g:171:5: ( MAKE literal )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==MAKE) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // AkinParser.g:171:6: MAKE literal
                            {
                            MAKE49=(Token)match(input,MAKE,FOLLOW_MAKE_in_call1278); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            MAKE49_tree = (Object)adaptor.create(MAKE49);
                            adaptor.addChild(root_0, MAKE49_tree);
                            }
                            pushFollow(FOLLOW_literal_in_call1285);
                            literal50=literal();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, literal50.getTree());

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       retval.node = (literal50!=null?literal50.node:null); 
                    }
                    // AkinParser.g:173:5: (head= message )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==NAME) ) {
                            int LA20_1 = input.LA(2);

                            if ( (synpred54_AkinParser()) ) {
                                alt20=1;
                            }


                        }
                        else if ( (LA20_0==MAKETHECOMPUTER) ) {
                            int LA20_2 = input.LA(2);

                            if ( (synpred54_AkinParser()) ) {
                                alt20=1;
                            }


                        }


                        switch (alt20) {
                    	case 1 :
                    	    // AkinParser.g:173:6: head= message
                    	    {
                    	    pushFollow(FOLLOW_message_in_call1318);
                    	    head=message();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, head.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       ((CallNode)(head!=null?head.node:null)).setReceiver(retval.node); retval.node = (head!=null?head.node:null); 
                    }
                    pushFollow(FOLLOW_message_in_call1346);
                    tail=message();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tail.getTree());
                    if ( state.backtracking==0 ) {
                       ((CallNode)(tail!=null?tail.node:null)).setReceiver(retval.node); retval.node = (tail!=null?tail.node:null); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "call"

    public static class message_return extends ParserRuleReturnScope {
        public CallNode node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "message"
    // AkinParser.g:178:1: message returns [CallNode node] : ( NAME | NAME OPEN_PARENT CLOSE_PARENT | NAME OPEN_PARENT arguments CLOSE_PARENT | MAKETHECOMPUTER NAME ( END )? | MAKETHECOMPUTER NAME OPEN_PARENT CLOSE_PARENT ( END )? | MAKETHECOMPUTER NAME OPEN_PARENT arguments CLOSE_PARENT ( END )? );
    public final AkinParser.message_return message() throws RecognitionException {
        AkinParser.message_return retval = new AkinParser.message_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME51=null;
        Token NAME52=null;
        Token OPEN_PARENT53=null;
        Token CLOSE_PARENT54=null;
        Token NAME55=null;
        Token OPEN_PARENT56=null;
        Token CLOSE_PARENT58=null;
        Token MAKETHECOMPUTER59=null;
        Token NAME60=null;
        Token END61=null;
        Token MAKETHECOMPUTER62=null;
        Token NAME63=null;
        Token OPEN_PARENT64=null;
        Token CLOSE_PARENT65=null;
        Token END66=null;
        Token MAKETHECOMPUTER67=null;
        Token NAME68=null;
        Token OPEN_PARENT69=null;
        Token CLOSE_PARENT71=null;
        Token END72=null;
        AkinParser.arguments_return arguments57 = null;

        AkinParser.arguments_return arguments70 = null;


        Object NAME51_tree=null;
        Object NAME52_tree=null;
        Object OPEN_PARENT53_tree=null;
        Object CLOSE_PARENT54_tree=null;
        Object NAME55_tree=null;
        Object OPEN_PARENT56_tree=null;
        Object CLOSE_PARENT58_tree=null;
        Object MAKETHECOMPUTER59_tree=null;
        Object NAME60_tree=null;
        Object END61_tree=null;
        Object MAKETHECOMPUTER62_tree=null;
        Object NAME63_tree=null;
        Object OPEN_PARENT64_tree=null;
        Object CLOSE_PARENT65_tree=null;
        Object END66_tree=null;
        Object MAKETHECOMPUTER67_tree=null;
        Object NAME68_tree=null;
        Object OPEN_PARENT69_tree=null;
        Object CLOSE_PARENT71_tree=null;
        Object END72_tree=null;

        try {
            // AkinParser.g:178:32: ( NAME | NAME OPEN_PARENT CLOSE_PARENT | NAME OPEN_PARENT arguments CLOSE_PARENT | MAKETHECOMPUTER NAME ( END )? | MAKETHECOMPUTER NAME OPEN_PARENT CLOSE_PARENT ( END )? | MAKETHECOMPUTER NAME OPEN_PARENT arguments CLOSE_PARENT ( END )? )
            int alt25=6;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // AkinParser.g:179:5: NAME
                    {
                    root_0 = (Object)adaptor.nil();

                    NAME51=(Token)match(input,NAME,FOLLOW_NAME_in_message1386); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME51_tree = (Object)adaptor.create(NAME51);
                    adaptor.addChild(root_0, NAME51_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new CallNode((NAME51!=null?NAME51.getText():null)); 
                    }

                    }
                    break;
                case 2 :
                    // AkinParser.g:180:5: NAME OPEN_PARENT CLOSE_PARENT
                    {
                    root_0 = (Object)adaptor.nil();

                    NAME52=(Token)match(input,NAME,FOLLOW_NAME_in_message1421); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME52_tree = (Object)adaptor.create(NAME52);
                    adaptor.addChild(root_0, NAME52_tree);
                    }
                    OPEN_PARENT53=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_message1423); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OPEN_PARENT53_tree = (Object)adaptor.create(OPEN_PARENT53);
                    adaptor.addChild(root_0, OPEN_PARENT53_tree);
                    }
                    CLOSE_PARENT54=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_message1425); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLOSE_PARENT54_tree = (Object)adaptor.create(CLOSE_PARENT54);
                    adaptor.addChild(root_0, CLOSE_PARENT54_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new CallNode((NAME52!=null?NAME52.getText():null), new ArrayList<Node>()); 
                    }

                    }
                    break;
                case 3 :
                    // AkinParser.g:181:5: NAME OPEN_PARENT arguments CLOSE_PARENT
                    {
                    root_0 = (Object)adaptor.nil();

                    NAME55=(Token)match(input,NAME,FOLLOW_NAME_in_message1435); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME55_tree = (Object)adaptor.create(NAME55);
                    adaptor.addChild(root_0, NAME55_tree);
                    }
                    OPEN_PARENT56=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_message1437); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OPEN_PARENT56_tree = (Object)adaptor.create(OPEN_PARENT56);
                    adaptor.addChild(root_0, OPEN_PARENT56_tree);
                    }
                    pushFollow(FOLLOW_arguments_in_message1450);
                    arguments57=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments57.getTree());
                    CLOSE_PARENT58=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_message1461); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLOSE_PARENT58_tree = (Object)adaptor.create(CLOSE_PARENT58);
                    adaptor.addChild(root_0, CLOSE_PARENT58_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new CallNode((NAME55!=null?NAME55.getText():null), (arguments57!=null?arguments57.nodes:null)); 
                    }

                    }
                    break;
                case 4 :
                    // AkinParser.g:184:5: MAKETHECOMPUTER NAME ( END )?
                    {
                    root_0 = (Object)adaptor.nil();

                    MAKETHECOMPUTER59=(Token)match(input,MAKETHECOMPUTER,FOLLOW_MAKETHECOMPUTER_in_message1484); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MAKETHECOMPUTER59_tree = (Object)adaptor.create(MAKETHECOMPUTER59);
                    adaptor.addChild(root_0, MAKETHECOMPUTER59_tree);
                    }
                    NAME60=(Token)match(input,NAME,FOLLOW_NAME_in_message1486); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME60_tree = (Object)adaptor.create(NAME60);
                    adaptor.addChild(root_0, NAME60_tree);
                    }
                    // AkinParser.g:184:26: ( END )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==END) ) {
                        int LA22_1 = input.LA(2);

                        if ( (synpred58_AkinParser()) ) {
                            alt22=1;
                        }
                    }
                    switch (alt22) {
                        case 1 :
                            // AkinParser.g:0:0: END
                            {
                            END61=(Token)match(input,END,FOLLOW_END_in_message1488); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            END61_tree = (Object)adaptor.create(END61);
                            adaptor.addChild(root_0, END61_tree);
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       retval.node = new CallNode((NAME60!=null?NAME60.getText():null)); 
                    }

                    }
                    break;
                case 5 :
                    // AkinParser.g:185:5: MAKETHECOMPUTER NAME OPEN_PARENT CLOSE_PARENT ( END )?
                    {
                    root_0 = (Object)adaptor.nil();

                    MAKETHECOMPUTER62=(Token)match(input,MAKETHECOMPUTER,FOLLOW_MAKETHECOMPUTER_in_message1507); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MAKETHECOMPUTER62_tree = (Object)adaptor.create(MAKETHECOMPUTER62);
                    adaptor.addChild(root_0, MAKETHECOMPUTER62_tree);
                    }
                    NAME63=(Token)match(input,NAME,FOLLOW_NAME_in_message1509); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME63_tree = (Object)adaptor.create(NAME63);
                    adaptor.addChild(root_0, NAME63_tree);
                    }
                    OPEN_PARENT64=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_message1511); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OPEN_PARENT64_tree = (Object)adaptor.create(OPEN_PARENT64);
                    adaptor.addChild(root_0, OPEN_PARENT64_tree);
                    }
                    CLOSE_PARENT65=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_message1513); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLOSE_PARENT65_tree = (Object)adaptor.create(CLOSE_PARENT65);
                    adaptor.addChild(root_0, CLOSE_PARENT65_tree);
                    }
                    // AkinParser.g:185:51: ( END )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==END) ) {
                        int LA23_1 = input.LA(2);

                        if ( (synpred60_AkinParser()) ) {
                            alt23=1;
                        }
                    }
                    switch (alt23) {
                        case 1 :
                            // AkinParser.g:0:0: END
                            {
                            END66=(Token)match(input,END,FOLLOW_END_in_message1515); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            END66_tree = (Object)adaptor.create(END66);
                            adaptor.addChild(root_0, END66_tree);
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       retval.node = new CallNode((NAME63!=null?NAME63.getText():null), new ArrayList<Node>()); 
                    }

                    }
                    break;
                case 6 :
                    // AkinParser.g:186:5: MAKETHECOMPUTER NAME OPEN_PARENT arguments CLOSE_PARENT ( END )?
                    {
                    root_0 = (Object)adaptor.nil();

                    MAKETHECOMPUTER67=(Token)match(input,MAKETHECOMPUTER,FOLLOW_MAKETHECOMPUTER_in_message1524); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MAKETHECOMPUTER67_tree = (Object)adaptor.create(MAKETHECOMPUTER67);
                    adaptor.addChild(root_0, MAKETHECOMPUTER67_tree);
                    }
                    NAME68=(Token)match(input,NAME,FOLLOW_NAME_in_message1526); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME68_tree = (Object)adaptor.create(NAME68);
                    adaptor.addChild(root_0, NAME68_tree);
                    }
                    OPEN_PARENT69=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_message1528); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OPEN_PARENT69_tree = (Object)adaptor.create(OPEN_PARENT69);
                    adaptor.addChild(root_0, OPEN_PARENT69_tree);
                    }
                    pushFollow(FOLLOW_arguments_in_message1558);
                    arguments70=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments70.getTree());
                    CLOSE_PARENT71=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_message1586); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLOSE_PARENT71_tree = (Object)adaptor.create(CLOSE_PARENT71);
                    adaptor.addChild(root_0, CLOSE_PARENT71_tree);
                    }
                    // AkinParser.g:188:40: ( END )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==END) ) {
                        int LA24_1 = input.LA(2);

                        if ( (synpred62_AkinParser()) ) {
                            alt24=1;
                        }
                    }
                    switch (alt24) {
                        case 1 :
                            // AkinParser.g:0:0: END
                            {
                            END72=(Token)match(input,END,FOLLOW_END_in_message1588); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            END72_tree = (Object)adaptor.create(END72);
                            adaptor.addChild(root_0, END72_tree);
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       retval.node = new CallNode((NAME68!=null?NAME68.getText():null), (arguments70!=null?arguments70.nodes:null)); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "message"

    public static class arguments_return extends ParserRuleReturnScope {
        public ArrayList<Node> nodes;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // AkinParser.g:192:1: arguments returns [ArrayList<Node> nodes] : head= expression ( COMMA tail= expression )* ;
    public final AkinParser.arguments_return arguments() throws RecognitionException {
        AkinParser.arguments_return retval = new AkinParser.arguments_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA73=null;
        AkinParser.expression_return head = null;

        AkinParser.expression_return tail = null;


        Object COMMA73_tree=null;

        try {
            // AkinParser.g:192:42: (head= expression ( COMMA tail= expression )* )
            // AkinParser.g:193:37: head= expression ( COMMA tail= expression )*
            {
            root_0 = (Object)adaptor.nil();

            if ( state.backtracking==0 ) {
               retval.nodes = new ArrayList<Node>(); 
            }
            pushFollow(FOLLOW_expression_in_arguments1650);
            head=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, head.getTree());
            if ( state.backtracking==0 ) {
               retval.nodes.add((head!=null?head.node:null)); 
            }
            // AkinParser.g:195:5: ( COMMA tail= expression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==COMMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // AkinParser.g:195:6: COMMA tail= expression
            	    {
            	    COMMA73=(Token)match(input,COMMA,FOLLOW_COMMA_in_arguments1675); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA73_tree = (Object)adaptor.create(COMMA73);
            	    adaptor.addChild(root_0, COMMA73_tree);
            	    }
            	    pushFollow(FOLLOW_expression_in_arguments1684);
            	    tail=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, tail.getTree());
            	    if ( state.backtracking==0 ) {
            	       retval.nodes.add((tail!=null?tail.node:null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class constant_return extends ParserRuleReturnScope {
        public ConstantNode node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant"
    // AkinParser.g:201:1: constant returns [ConstantNode node] : CONSTANT ;
    public final AkinParser.constant_return constant() throws RecognitionException {
        AkinParser.constant_return retval = new AkinParser.constant_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONSTANT74=null;

        Object CONSTANT74_tree=null;

        try {
            // AkinParser.g:201:37: ( CONSTANT )
            // AkinParser.g:202:5: CONSTANT
            {
            root_0 = (Object)adaptor.nil();

            CONSTANT74=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_constant1727); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CONSTANT74_tree = (Object)adaptor.create(CONSTANT74);
            adaptor.addChild(root_0, CONSTANT74_tree);
            }
            if ( state.backtracking==0 ) {
               retval.node = new ConstantNode((CONSTANT74!=null?CONSTANT74.getText():null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constant"

    public static class assign_return extends ParserRuleReturnScope {
        public Node node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assign"
    // AkinParser.g:206:1: assign returns [Node node] : ( NAME ASSIGN expression | CONSTANT ASSIGN expression | AT NAME ASSIGN expression );
    public final AkinParser.assign_return assign() throws RecognitionException {
        AkinParser.assign_return retval = new AkinParser.assign_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NAME75=null;
        Token ASSIGN76=null;
        Token CONSTANT78=null;
        Token ASSIGN79=null;
        Token AT81=null;
        Token NAME82=null;
        Token ASSIGN83=null;
        AkinParser.expression_return expression77 = null;

        AkinParser.expression_return expression80 = null;

        AkinParser.expression_return expression84 = null;


        Object NAME75_tree=null;
        Object ASSIGN76_tree=null;
        Object CONSTANT78_tree=null;
        Object ASSIGN79_tree=null;
        Object AT81_tree=null;
        Object NAME82_tree=null;
        Object ASSIGN83_tree=null;

        try {
            // AkinParser.g:206:27: ( NAME ASSIGN expression | CONSTANT ASSIGN expression | AT NAME ASSIGN expression )
            int alt27=3;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt27=1;
                }
                break;
            case CONSTANT:
                {
                alt27=2;
                }
                break;
            case AT:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // AkinParser.g:207:5: NAME ASSIGN expression
                    {
                    root_0 = (Object)adaptor.nil();

                    NAME75=(Token)match(input,NAME,FOLLOW_NAME_in_assign1771); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME75_tree = (Object)adaptor.create(NAME75);
                    adaptor.addChild(root_0, NAME75_tree);
                    }
                    ASSIGN76=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1773); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN76_tree = (Object)adaptor.create(ASSIGN76);
                    adaptor.addChild(root_0, ASSIGN76_tree);
                    }
                    pushFollow(FOLLOW_expression_in_assign1775);
                    expression77=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression77.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new LocalAssignNode((NAME75!=null?NAME75.getText():null), (expression77!=null?expression77.node:null)); 
                    }

                    }
                    break;
                case 2 :
                    // AkinParser.g:208:5: CONSTANT ASSIGN expression
                    {
                    root_0 = (Object)adaptor.nil();

                    CONSTANT78=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_assign1792); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONSTANT78_tree = (Object)adaptor.create(CONSTANT78);
                    adaptor.addChild(root_0, CONSTANT78_tree);
                    }
                    ASSIGN79=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1794); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN79_tree = (Object)adaptor.create(ASSIGN79);
                    adaptor.addChild(root_0, ASSIGN79_tree);
                    }
                    pushFollow(FOLLOW_expression_in_assign1796);
                    expression80=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression80.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new ConstantAssignNode((CONSTANT78!=null?CONSTANT78.getText():null), (expression80!=null?expression80.node:null)); 
                    }

                    }
                    break;
                case 3 :
                    // AkinParser.g:209:5: AT NAME ASSIGN expression
                    {
                    root_0 = (Object)adaptor.nil();

                    AT81=(Token)match(input,AT,FOLLOW_AT_in_assign1809); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AT81_tree = (Object)adaptor.create(AT81);
                    adaptor.addChild(root_0, AT81_tree);
                    }
                    NAME82=(Token)match(input,NAME,FOLLOW_NAME_in_assign1811); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME82_tree = (Object)adaptor.create(NAME82);
                    adaptor.addChild(root_0, NAME82_tree);
                    }
                    ASSIGN83=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assign1813); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN83_tree = (Object)adaptor.create(ASSIGN83);
                    adaptor.addChild(root_0, ASSIGN83_tree);
                    }
                    pushFollow(FOLLOW_expression_in_assign1815);
                    expression84=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression84.getTree());
                    if ( state.backtracking==0 ) {
                       retval.node = new InstanceVariableAssignNode((NAME82!=null?NAME82.getText():null), (expression84!=null?expression84.node:null)); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assign"

    public static class methodDefinition_return extends ParserRuleReturnScope {
        public MethodDefinitionNode node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "methodDefinition"
    // AkinParser.g:212:1: methodDefinition returns [MethodDefinitionNode node] : ( ( THIS | TO | IT | YOU ) ( CAN ( ALSO )? )? ( GET )? ( CALCULATE )? NAME ( WITH )? ( OPEN_PARENT ( parameters )? CLOSE_PARENT )? ( BY )? ( WHICHISTO | ISTO | terminator )* expressions ( THEN )? END | ( THIS | TO | IT | YOU ) ( CAN ( ALSO )? )? ( GET )? NAME ( WITH )? ( OPEN_PARENT )? ( parameters )? ( CLOSE_PARENT )? ( BY | WHICHISTO | ISTO | terminator )* expressions ( THEN )? ( END )? );
    public final AkinParser.methodDefinition_return methodDefinition() throws RecognitionException {
        AkinParser.methodDefinition_return retval = new AkinParser.methodDefinition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set85=null;
        Token CAN86=null;
        Token ALSO87=null;
        Token GET88=null;
        Token CALCULATE89=null;
        Token NAME90=null;
        Token WITH91=null;
        Token OPEN_PARENT92=null;
        Token CLOSE_PARENT94=null;
        Token BY95=null;
        Token WHICHISTO96=null;
        Token ISTO97=null;
        Token THEN100=null;
        Token END101=null;
        Token set102=null;
        Token CAN103=null;
        Token ALSO104=null;
        Token GET105=null;
        Token NAME106=null;
        Token WITH107=null;
        Token OPEN_PARENT108=null;
        Token CLOSE_PARENT110=null;
        Token BY111=null;
        Token WHICHISTO112=null;
        Token ISTO113=null;
        Token THEN116=null;
        Token END117=null;
        AkinParser.parameters_return parameters93 = null;

        AkinParser.terminator_return terminator98 = null;

        AkinParser.expressions_return expressions99 = null;

        AkinParser.parameters_return parameters109 = null;

        AkinParser.terminator_return terminator114 = null;

        AkinParser.expressions_return expressions115 = null;


        Object set85_tree=null;
        Object CAN86_tree=null;
        Object ALSO87_tree=null;
        Object GET88_tree=null;
        Object CALCULATE89_tree=null;
        Object NAME90_tree=null;
        Object WITH91_tree=null;
        Object OPEN_PARENT92_tree=null;
        Object CLOSE_PARENT94_tree=null;
        Object BY95_tree=null;
        Object WHICHISTO96_tree=null;
        Object ISTO97_tree=null;
        Object THEN100_tree=null;
        Object END101_tree=null;
        Object set102_tree=null;
        Object CAN103_tree=null;
        Object ALSO104_tree=null;
        Object GET105_tree=null;
        Object NAME106_tree=null;
        Object WITH107_tree=null;
        Object OPEN_PARENT108_tree=null;
        Object CLOSE_PARENT110_tree=null;
        Object BY111_tree=null;
        Object WHICHISTO112_tree=null;
        Object ISTO113_tree=null;
        Object THEN116_tree=null;
        Object END117_tree=null;

        try {
            // AkinParser.g:212:53: ( ( THIS | TO | IT | YOU ) ( CAN ( ALSO )? )? ( GET )? ( CALCULATE )? NAME ( WITH )? ( OPEN_PARENT ( parameters )? CLOSE_PARENT )? ( BY )? ( WHICHISTO | ISTO | terminator )* expressions ( THEN )? END | ( THIS | TO | IT | YOU ) ( CAN ( ALSO )? )? ( GET )? NAME ( WITH )? ( OPEN_PARENT )? ( parameters )? ( CLOSE_PARENT )? ( BY | WHICHISTO | ISTO | terminator )* expressions ( THEN )? ( END )? )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==TO||LA48_0==THIS||LA48_0==IT||LA48_0==YOU) ) {
                int LA48_1 = input.LA(2);

                if ( (synpred81_AkinParser()) ) {
                    alt48=1;
                }
                else if ( (true) ) {
                    alt48=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // AkinParser.g:213:5: ( THIS | TO | IT | YOU ) ( CAN ( ALSO )? )? ( GET )? ( CALCULATE )? NAME ( WITH )? ( OPEN_PARENT ( parameters )? CLOSE_PARENT )? ( BY )? ( WHICHISTO | ISTO | terminator )* expressions ( THEN )? END
                    {
                    root_0 = (Object)adaptor.nil();

                    set85=(Token)input.LT(1);
                    if ( input.LA(1)==TO||input.LA(1)==THIS||input.LA(1)==IT||input.LA(1)==YOU ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set85));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // AkinParser.g:213:22: ( CAN ( ALSO )? )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==CAN) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // AkinParser.g:213:23: CAN ( ALSO )?
                            {
                            CAN86=(Token)match(input,CAN,FOLLOW_CAN_in_methodDefinition1852); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            CAN86_tree = (Object)adaptor.create(CAN86);
                            adaptor.addChild(root_0, CAN86_tree);
                            }
                            // AkinParser.g:213:27: ( ALSO )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==ALSO) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // AkinParser.g:213:28: ALSO
                                    {
                                    ALSO87=(Token)match(input,ALSO,FOLLOW_ALSO_in_methodDefinition1855); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    ALSO87_tree = (Object)adaptor.create(ALSO87);
                                    adaptor.addChild(root_0, ALSO87_tree);
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // AkinParser.g:213:37: ( GET )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==GET) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // AkinParser.g:0:0: GET
                            {
                            GET88=(Token)match(input,GET,FOLLOW_GET_in_methodDefinition1861); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            GET88_tree = (Object)adaptor.create(GET88);
                            adaptor.addChild(root_0, GET88_tree);
                            }

                            }
                            break;

                    }

                    // AkinParser.g:213:42: ( CALCULATE )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==CALCULATE) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // AkinParser.g:0:0: CALCULATE
                            {
                            CALCULATE89=(Token)match(input,CALCULATE,FOLLOW_CALCULATE_in_methodDefinition1864); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            CALCULATE89_tree = (Object)adaptor.create(CALCULATE89);
                            adaptor.addChild(root_0, CALCULATE89_tree);
                            }

                            }
                            break;

                    }

                    NAME90=(Token)match(input,NAME,FOLLOW_NAME_in_methodDefinition1867); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME90_tree = (Object)adaptor.create(NAME90);
                    adaptor.addChild(root_0, NAME90_tree);
                    }
                    // AkinParser.g:213:58: ( WITH )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==WITH) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // AkinParser.g:0:0: WITH
                            {
                            WITH91=(Token)match(input,WITH,FOLLOW_WITH_in_methodDefinition1869); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WITH91_tree = (Object)adaptor.create(WITH91);
                            adaptor.addChild(root_0, WITH91_tree);
                            }

                            }
                            break;

                    }

                    // AkinParser.g:213:64: ( OPEN_PARENT ( parameters )? CLOSE_PARENT )?
                    int alt34=2;
                    alt34 = dfa34.predict(input);
                    switch (alt34) {
                        case 1 :
                            // AkinParser.g:213:65: OPEN_PARENT ( parameters )? CLOSE_PARENT
                            {
                            OPEN_PARENT92=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_methodDefinition1873); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            OPEN_PARENT92_tree = (Object)adaptor.create(OPEN_PARENT92);
                            adaptor.addChild(root_0, OPEN_PARENT92_tree);
                            }
                            // AkinParser.g:213:77: ( parameters )?
                            int alt33=2;
                            int LA33_0 = input.LA(1);

                            if ( (LA33_0==NAME) ) {
                                alt33=1;
                            }
                            switch (alt33) {
                                case 1 :
                                    // AkinParser.g:0:0: parameters
                                    {
                                    pushFollow(FOLLOW_parameters_in_methodDefinition1875);
                                    parameters93=parameters();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters93.getTree());

                                    }
                                    break;

                            }

                            CLOSE_PARENT94=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_methodDefinition1878); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            CLOSE_PARENT94_tree = (Object)adaptor.create(CLOSE_PARENT94);
                            adaptor.addChild(root_0, CLOSE_PARENT94_tree);
                            }

                            }
                            break;

                    }

                    // AkinParser.g:213:104: ( BY )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==BY) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // AkinParser.g:0:0: BY
                            {
                            BY95=(Token)match(input,BY,FOLLOW_BY_in_methodDefinition1882); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BY95_tree = (Object)adaptor.create(BY95);
                            adaptor.addChild(root_0, BY95_tree);
                            }

                            }
                            break;

                    }

                    // AkinParser.g:213:108: ( WHICHISTO | ISTO | terminator )*
                    loop36:
                    do {
                        int alt36=4;
                        switch ( input.LA(1) ) {
                        case WHICHISTO:
                            {
                            alt36=1;
                            }
                            break;
                        case ISTO:
                            {
                            alt36=2;
                            }
                            break;
                        case SEMICOLON:
                        case COLON:
                        case COMMA:
                        case NEWLINE:
                            {
                            alt36=3;
                            }
                            break;

                        }

                        switch (alt36) {
                    	case 1 :
                    	    // AkinParser.g:213:109: WHICHISTO
                    	    {
                    	    WHICHISTO96=(Token)match(input,WHICHISTO,FOLLOW_WHICHISTO_in_methodDefinition1886); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    WHICHISTO96_tree = (Object)adaptor.create(WHICHISTO96);
                    	    adaptor.addChild(root_0, WHICHISTO96_tree);
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // AkinParser.g:213:119: ISTO
                    	    {
                    	    ISTO97=(Token)match(input,ISTO,FOLLOW_ISTO_in_methodDefinition1888); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    ISTO97_tree = (Object)adaptor.create(ISTO97);
                    	    adaptor.addChild(root_0, ISTO97_tree);
                    	    }

                    	    }
                    	    break;
                    	case 3 :
                    	    // AkinParser.g:213:124: terminator
                    	    {
                    	    pushFollow(FOLLOW_terminator_in_methodDefinition1890);
                    	    terminator98=terminator();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator98.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    pushFollow(FOLLOW_expressions_in_methodDefinition1901);
                    expressions99=expressions();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressions99.getTree());
                    // AkinParser.g:215:5: ( THEN )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==THEN) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // AkinParser.g:0:0: THEN
                            {
                            THEN100=(Token)match(input,THEN,FOLLOW_THEN_in_methodDefinition1907); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            THEN100_tree = (Object)adaptor.create(THEN100);
                            adaptor.addChild(root_0, THEN100_tree);
                            }

                            }
                            break;

                    }

                    END101=(Token)match(input,END,FOLLOW_END_in_methodDefinition1910); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    END101_tree = (Object)adaptor.create(END101);
                    adaptor.addChild(root_0, END101_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new MethodDefinitionNode((NAME90!=null?NAME90.getText():null), (parameters93!=null?parameters93.names:null), (expressions99!=null?expressions99.nodes:null)); 
                    }

                    }
                    break;
                case 2 :
                    // AkinParser.g:216:5: ( THIS | TO | IT | YOU ) ( CAN ( ALSO )? )? ( GET )? NAME ( WITH )? ( OPEN_PARENT )? ( parameters )? ( CLOSE_PARENT )? ( BY | WHICHISTO | ISTO | terminator )* expressions ( THEN )? ( END )?
                    {
                    root_0 = (Object)adaptor.nil();

                    set102=(Token)input.LT(1);
                    if ( input.LA(1)==TO||input.LA(1)==THIS||input.LA(1)==IT||input.LA(1)==YOU ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set102));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // AkinParser.g:216:22: ( CAN ( ALSO )? )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==CAN) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // AkinParser.g:216:23: CAN ( ALSO )?
                            {
                            CAN103=(Token)match(input,CAN,FOLLOW_CAN_in_methodDefinition1949); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            CAN103_tree = (Object)adaptor.create(CAN103);
                            adaptor.addChild(root_0, CAN103_tree);
                            }
                            // AkinParser.g:216:27: ( ALSO )?
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==ALSO) ) {
                                alt38=1;
                            }
                            switch (alt38) {
                                case 1 :
                                    // AkinParser.g:216:28: ALSO
                                    {
                                    ALSO104=(Token)match(input,ALSO,FOLLOW_ALSO_in_methodDefinition1952); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    ALSO104_tree = (Object)adaptor.create(ALSO104);
                                    adaptor.addChild(root_0, ALSO104_tree);
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // AkinParser.g:216:37: ( GET )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==GET) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // AkinParser.g:0:0: GET
                            {
                            GET105=(Token)match(input,GET,FOLLOW_GET_in_methodDefinition1958); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            GET105_tree = (Object)adaptor.create(GET105);
                            adaptor.addChild(root_0, GET105_tree);
                            }

                            }
                            break;

                    }

                    NAME106=(Token)match(input,NAME,FOLLOW_NAME_in_methodDefinition1961); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NAME106_tree = (Object)adaptor.create(NAME106);
                    adaptor.addChild(root_0, NAME106_tree);
                    }
                    // AkinParser.g:216:47: ( WITH )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==WITH) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // AkinParser.g:0:0: WITH
                            {
                            WITH107=(Token)match(input,WITH,FOLLOW_WITH_in_methodDefinition1963); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WITH107_tree = (Object)adaptor.create(WITH107);
                            adaptor.addChild(root_0, WITH107_tree);
                            }

                            }
                            break;

                    }

                    // AkinParser.g:216:53: ( OPEN_PARENT )?
                    int alt42=2;
                    alt42 = dfa42.predict(input);
                    switch (alt42) {
                        case 1 :
                            // AkinParser.g:0:0: OPEN_PARENT
                            {
                            OPEN_PARENT108=(Token)match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_methodDefinition1966); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            OPEN_PARENT108_tree = (Object)adaptor.create(OPEN_PARENT108);
                            adaptor.addChild(root_0, OPEN_PARENT108_tree);
                            }

                            }
                            break;

                    }

                    // AkinParser.g:216:66: ( parameters )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==NAME) ) {
                        int LA43_1 = input.LA(2);

                        if ( (synpred90_AkinParser()) ) {
                            alt43=1;
                        }
                    }
                    switch (alt43) {
                        case 1 :
                            // AkinParser.g:0:0: parameters
                            {
                            pushFollow(FOLLOW_parameters_in_methodDefinition1969);
                            parameters109=parameters();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters109.getTree());

                            }
                            break;

                    }

                    // AkinParser.g:216:78: ( CLOSE_PARENT )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==CLOSE_PARENT) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // AkinParser.g:0:0: CLOSE_PARENT
                            {
                            CLOSE_PARENT110=(Token)match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_methodDefinition1972); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            CLOSE_PARENT110_tree = (Object)adaptor.create(CLOSE_PARENT110);
                            adaptor.addChild(root_0, CLOSE_PARENT110_tree);
                            }

                            }
                            break;

                    }

                    // AkinParser.g:216:92: ( BY | WHICHISTO | ISTO | terminator )*
                    loop45:
                    do {
                        int alt45=5;
                        switch ( input.LA(1) ) {
                        case BY:
                            {
                            alt45=1;
                            }
                            break;
                        case WHICHISTO:
                            {
                            alt45=2;
                            }
                            break;
                        case ISTO:
                            {
                            alt45=3;
                            }
                            break;
                        case SEMICOLON:
                        case COLON:
                        case COMMA:
                        case NEWLINE:
                            {
                            alt45=4;
                            }
                            break;

                        }

                        switch (alt45) {
                    	case 1 :
                    	    // AkinParser.g:216:93: BY
                    	    {
                    	    BY111=(Token)match(input,BY,FOLLOW_BY_in_methodDefinition1976); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    BY111_tree = (Object)adaptor.create(BY111);
                    	    adaptor.addChild(root_0, BY111_tree);
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // AkinParser.g:216:96: WHICHISTO
                    	    {
                    	    WHICHISTO112=(Token)match(input,WHICHISTO,FOLLOW_WHICHISTO_in_methodDefinition1978); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    WHICHISTO112_tree = (Object)adaptor.create(WHICHISTO112);
                    	    adaptor.addChild(root_0, WHICHISTO112_tree);
                    	    }

                    	    }
                    	    break;
                    	case 3 :
                    	    // AkinParser.g:216:106: ISTO
                    	    {
                    	    ISTO113=(Token)match(input,ISTO,FOLLOW_ISTO_in_methodDefinition1980); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    ISTO113_tree = (Object)adaptor.create(ISTO113);
                    	    adaptor.addChild(root_0, ISTO113_tree);
                    	    }

                    	    }
                    	    break;
                    	case 4 :
                    	    // AkinParser.g:216:111: terminator
                    	    {
                    	    pushFollow(FOLLOW_terminator_in_methodDefinition1982);
                    	    terminator114=terminator();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator114.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    pushFollow(FOLLOW_expressions_in_methodDefinition1993);
                    expressions115=expressions();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressions115.getTree());
                    // AkinParser.g:218:5: ( THEN )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==THEN) ) {
                        int LA46_1 = input.LA(2);

                        if ( (synpred96_AkinParser()) ) {
                            alt46=1;
                        }
                    }
                    switch (alt46) {
                        case 1 :
                            // AkinParser.g:0:0: THEN
                            {
                            THEN116=(Token)match(input,THEN,FOLLOW_THEN_in_methodDefinition1999); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            THEN116_tree = (Object)adaptor.create(THEN116);
                            adaptor.addChild(root_0, THEN116_tree);
                            }

                            }
                            break;

                    }

                    // AkinParser.g:218:11: ( END )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==END) ) {
                        int LA47_1 = input.LA(2);

                        if ( (synpred97_AkinParser()) ) {
                            alt47=1;
                        }
                    }
                    switch (alt47) {
                        case 1 :
                            // AkinParser.g:0:0: END
                            {
                            END117=(Token)match(input,END,FOLLOW_END_in_methodDefinition2002); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            END117_tree = (Object)adaptor.create(END117);
                            adaptor.addChild(root_0, END117_tree);
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       retval.node = new MethodDefinitionNode((NAME106!=null?NAME106.getText():null), (parameters109!=null?parameters109.names:null), (expressions115!=null?expressions115.nodes:null)); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "methodDefinition"

    public static class parameters_return extends ParserRuleReturnScope {
        public ArrayList<String> names;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameters"
    // AkinParser.g:222:1: parameters returns [ArrayList<String> names] : head= NAME ( COMMA ( ANDE )? tail= NAME )* ;
    public final AkinParser.parameters_return parameters() throws RecognitionException {
        AkinParser.parameters_return retval = new AkinParser.parameters_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token head=null;
        Token tail=null;
        Token COMMA118=null;
        Token ANDE119=null;

        Object head_tree=null;
        Object tail_tree=null;
        Object COMMA118_tree=null;
        Object ANDE119_tree=null;

        try {
            // AkinParser.g:222:45: (head= NAME ( COMMA ( ANDE )? tail= NAME )* )
            // AkinParser.g:223:37: head= NAME ( COMMA ( ANDE )? tail= NAME )*
            {
            root_0 = (Object)adaptor.nil();

            if ( state.backtracking==0 ) {
               retval.names = new ArrayList<String>(); 
            }
            head=(Token)match(input,NAME,FOLLOW_NAME_in_parameters2080); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            head_tree = (Object)adaptor.create(head);
            adaptor.addChild(root_0, head_tree);
            }
            if ( state.backtracking==0 ) {
               retval.names.add((head!=null?head.getText():null)); 
            }
            // AkinParser.g:225:5: ( COMMA ( ANDE )? tail= NAME )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMA) ) {
                    int LA50_2 = input.LA(2);

                    if ( (LA50_2==ANDE) ) {
                        alt50=1;
                    }
                    else if ( (LA50_2==NAME) ) {
                        int LA50_4 = input.LA(3);

                        if ( (synpred99_AkinParser()) ) {
                            alt50=1;
                        }


                    }


                }


                switch (alt50) {
            	case 1 :
            	    // AkinParser.g:225:6: COMMA ( ANDE )? tail= NAME
            	    {
            	    COMMA118=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameters2111); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA118_tree = (Object)adaptor.create(COMMA118);
            	    adaptor.addChild(root_0, COMMA118_tree);
            	    }
            	    // AkinParser.g:225:12: ( ANDE )?
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==ANDE) ) {
            	        alt49=1;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // AkinParser.g:225:13: ANDE
            	            {
            	            ANDE119=(Token)match(input,ANDE,FOLLOW_ANDE_in_parameters2114); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            ANDE119_tree = (Object)adaptor.create(ANDE119);
            	            adaptor.addChild(root_0, ANDE119_tree);
            	            }

            	            }
            	            break;

            	    }

            	    tail=(Token)match(input,NAME,FOLLOW_NAME_in_parameters2125); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    tail_tree = (Object)adaptor.create(tail);
            	    adaptor.addChild(root_0, tail_tree);
            	    }
            	    if ( state.backtracking==0 ) {
            	       retval.names.add((tail!=null?tail.getText():null)); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameters"

    public static class classDefinition_return extends ParserRuleReturnScope {
        public ClassDefinitionNode node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classDefinition"
    // AkinParser.g:231:1: classDefinition returns [ClassDefinitionNode node] : ( A )? name= CONSTANT ISATYPEOF superClass= CONSTANT ( terminator )? expressions END ;
    public final AkinParser.classDefinition_return classDefinition() throws RecognitionException {
        AkinParser.classDefinition_return retval = new AkinParser.classDefinition_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token name=null;
        Token superClass=null;
        Token A120=null;
        Token ISATYPEOF121=null;
        Token END124=null;
        AkinParser.terminator_return terminator122 = null;

        AkinParser.expressions_return expressions123 = null;


        Object name_tree=null;
        Object superClass_tree=null;
        Object A120_tree=null;
        Object ISATYPEOF121_tree=null;
        Object END124_tree=null;

        try {
            // AkinParser.g:231:51: ( ( A )? name= CONSTANT ISATYPEOF superClass= CONSTANT ( terminator )? expressions END )
            // AkinParser.g:232:5: ( A )? name= CONSTANT ISATYPEOF superClass= CONSTANT ( terminator )? expressions END
            {
            root_0 = (Object)adaptor.nil();

            // AkinParser.g:232:5: ( A )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==A) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // AkinParser.g:0:0: A
                    {
                    A120=(Token)match(input,A,FOLLOW_A_in_classDefinition2174); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    A120_tree = (Object)adaptor.create(A120);
                    adaptor.addChild(root_0, A120_tree);
                    }

                    }
                    break;

            }

            name=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_classDefinition2179); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            name_tree = (Object)adaptor.create(name);
            adaptor.addChild(root_0, name_tree);
            }
            ISATYPEOF121=(Token)match(input,ISATYPEOF,FOLLOW_ISATYPEOF_in_classDefinition2181); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ISATYPEOF121_tree = (Object)adaptor.create(ISATYPEOF121);
            adaptor.addChild(root_0, ISATYPEOF121_tree);
            }
            superClass=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_classDefinition2185); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            superClass_tree = (Object)adaptor.create(superClass);
            adaptor.addChild(root_0, superClass_tree);
            }
            // AkinParser.g:232:52: ( terminator )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=SEMICOLON && LA52_0<=COLON)||LA52_0==COMMA||LA52_0==NEWLINE) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // AkinParser.g:0:0: terminator
                    {
                    pushFollow(FOLLOW_terminator_in_classDefinition2187);
                    terminator122=terminator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator122.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_expressions_in_classDefinition2196);
            expressions123=expressions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressions123.getTree());
            END124=(Token)match(input,END,FOLLOW_END_in_classDefinition2202); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END124_tree = (Object)adaptor.create(END124);
            adaptor.addChild(root_0, END124_tree);
            }
            if ( state.backtracking==0 ) {
               retval.node = new ClassDefinitionNode((name!=null?name.getText():null), (superClass!=null?superClass.getText():null), (expressions123!=null?expressions123.nodes:null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "classDefinition"

    public static class ifBlock_return extends ParserRuleReturnScope {
        public IfNode node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifBlock"
    // AkinParser.g:237:1: ifBlock returns [IfNode node] : IF condition= expression terminator ifBody= expressions ( ( ELSE | IF NOTE ) terminator elseBody= expressions )? ( END | DOT ) ;
    public final AkinParser.ifBlock_return ifBlock() throws RecognitionException {
        AkinParser.ifBlock_return retval = new AkinParser.ifBlock_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IF125=null;
        Token ELSE127=null;
        Token IF128=null;
        Token NOTE129=null;
        Token set131=null;
        AkinParser.expression_return condition = null;

        AkinParser.expressions_return ifBody = null;

        AkinParser.expressions_return elseBody = null;

        AkinParser.terminator_return terminator126 = null;

        AkinParser.terminator_return terminator130 = null;


        Object IF125_tree=null;
        Object ELSE127_tree=null;
        Object IF128_tree=null;
        Object NOTE129_tree=null;
        Object set131_tree=null;

        try {
            // AkinParser.g:237:30: ( IF condition= expression terminator ifBody= expressions ( ( ELSE | IF NOTE ) terminator elseBody= expressions )? ( END | DOT ) )
            // AkinParser.g:238:5: IF condition= expression terminator ifBody= expressions ( ( ELSE | IF NOTE ) terminator elseBody= expressions )? ( END | DOT )
            {
            root_0 = (Object)adaptor.nil();

            IF125=(Token)match(input,IF,FOLLOW_IF_in_ifBlock2250); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IF125_tree = (Object)adaptor.create(IF125);
            adaptor.addChild(root_0, IF125_tree);
            }
            pushFollow(FOLLOW_expression_in_ifBlock2254);
            condition=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition.getTree());
            pushFollow(FOLLOW_terminator_in_ifBlock2256);
            terminator126=terminator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator126.getTree());
            pushFollow(FOLLOW_expressions_in_ifBlock2266);
            ifBody=expressions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ifBody.getTree());
            // AkinParser.g:240:5: ( ( ELSE | IF NOTE ) terminator elseBody= expressions )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==IF||LA54_0==ELSE) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // AkinParser.g:240:6: ( ELSE | IF NOTE ) terminator elseBody= expressions
                    {
                    // AkinParser.g:240:6: ( ELSE | IF NOTE )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==ELSE) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==IF) ) {
                        alt53=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // AkinParser.g:240:7: ELSE
                            {
                            ELSE127=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifBlock2274); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ELSE127_tree = (Object)adaptor.create(ELSE127);
                            adaptor.addChild(root_0, ELSE127_tree);
                            }

                            }
                            break;
                        case 2 :
                            // AkinParser.g:240:12: IF NOTE
                            {
                            IF128=(Token)match(input,IF,FOLLOW_IF_in_ifBlock2276); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            IF128_tree = (Object)adaptor.create(IF128);
                            adaptor.addChild(root_0, IF128_tree);
                            }
                            NOTE129=(Token)match(input,NOTE,FOLLOW_NOTE_in_ifBlock2278); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NOTE129_tree = (Object)adaptor.create(NOTE129);
                            adaptor.addChild(root_0, NOTE129_tree);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_terminator_in_ifBlock2281);
                    terminator130=terminator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator130.getTree());
                    pushFollow(FOLLOW_expressions_in_ifBlock2291);
                    elseBody=expressions();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elseBody.getTree());

                    }
                    break;

            }

            set131=(Token)input.LT(1);
            if ( input.LA(1)==END||input.LA(1)==DOT ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set131));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            if ( state.backtracking==0 ) {
               retval.node = new IfNode((condition!=null?condition.node:null), (ifBody!=null?ifBody.nodes:null), (elseBody!=null?elseBody.nodes:null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifBlock"

    public static class forBlock_return extends ParserRuleReturnScope {
        public ForNode node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forBlock"
    // AkinParser.g:246:1: forBlock returns [ForNode node] : ( DOTHEFOLLOWING INTEGER TIMES ( terminator )? body= expressions END | DOTHEFOLLOWING iterations= INTEGER TIMES ( WITH name= NAME INCREMENTING BY increment= INTEGER ( COMMA )? ( STARTING )? FROM start= INTEGER ( terminator )? )? body= expressions END | DOTHEFOLLOWING WITH name= NAME INCREMENTING BY increment= INTEGER UNTIL iterations= INTEGER ( STARTING )? FROM start= INTEGER ( terminator )? body= expressions END );
    public final AkinParser.forBlock_return forBlock() throws RecognitionException {
        AkinParser.forBlock_return retval = new AkinParser.forBlock_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token iterations=null;
        Token name=null;
        Token increment=null;
        Token start=null;
        Token DOTHEFOLLOWING132=null;
        Token INTEGER133=null;
        Token TIMES134=null;
        Token END136=null;
        Token DOTHEFOLLOWING137=null;
        Token TIMES138=null;
        Token WITH139=null;
        Token INCREMENTING140=null;
        Token BY141=null;
        Token COMMA142=null;
        Token STARTING143=null;
        Token FROM144=null;
        Token END146=null;
        Token DOTHEFOLLOWING147=null;
        Token WITH148=null;
        Token INCREMENTING149=null;
        Token BY150=null;
        Token UNTIL151=null;
        Token STARTING152=null;
        Token FROM153=null;
        Token END155=null;
        AkinParser.expressions_return body = null;

        AkinParser.terminator_return terminator135 = null;

        AkinParser.terminator_return terminator145 = null;

        AkinParser.terminator_return terminator154 = null;


        Object iterations_tree=null;
        Object name_tree=null;
        Object increment_tree=null;
        Object start_tree=null;
        Object DOTHEFOLLOWING132_tree=null;
        Object INTEGER133_tree=null;
        Object TIMES134_tree=null;
        Object END136_tree=null;
        Object DOTHEFOLLOWING137_tree=null;
        Object TIMES138_tree=null;
        Object WITH139_tree=null;
        Object INCREMENTING140_tree=null;
        Object BY141_tree=null;
        Object COMMA142_tree=null;
        Object STARTING143_tree=null;
        Object FROM144_tree=null;
        Object END146_tree=null;
        Object DOTHEFOLLOWING147_tree=null;
        Object WITH148_tree=null;
        Object INCREMENTING149_tree=null;
        Object BY150_tree=null;
        Object UNTIL151_tree=null;
        Object STARTING152_tree=null;
        Object FROM153_tree=null;
        Object END155_tree=null;

        try {
            // AkinParser.g:246:32: ( DOTHEFOLLOWING INTEGER TIMES ( terminator )? body= expressions END | DOTHEFOLLOWING iterations= INTEGER TIMES ( WITH name= NAME INCREMENTING BY increment= INTEGER ( COMMA )? ( STARTING )? FROM start= INTEGER ( terminator )? )? body= expressions END | DOTHEFOLLOWING WITH name= NAME INCREMENTING BY increment= INTEGER UNTIL iterations= INTEGER ( STARTING )? FROM start= INTEGER ( terminator )? body= expressions END )
            int alt62=3;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==DOTHEFOLLOWING) ) {
                int LA62_1 = input.LA(2);

                if ( (synpred106_AkinParser()) ) {
                    alt62=1;
                }
                else if ( (synpred111_AkinParser()) ) {
                    alt62=2;
                }
                else if ( (true) ) {
                    alt62=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // AkinParser.g:247:5: DOTHEFOLLOWING INTEGER TIMES ( terminator )? body= expressions END
                    {
                    root_0 = (Object)adaptor.nil();

                    DOTHEFOLLOWING132=(Token)match(input,DOTHEFOLLOWING,FOLLOW_DOTHEFOLLOWING_in_forBlock2356); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOTHEFOLLOWING132_tree = (Object)adaptor.create(DOTHEFOLLOWING132);
                    adaptor.addChild(root_0, DOTHEFOLLOWING132_tree);
                    }
                    INTEGER133=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_forBlock2358); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTEGER133_tree = (Object)adaptor.create(INTEGER133);
                    adaptor.addChild(root_0, INTEGER133_tree);
                    }
                    TIMES134=(Token)match(input,TIMES,FOLLOW_TIMES_in_forBlock2360); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIMES134_tree = (Object)adaptor.create(TIMES134);
                    adaptor.addChild(root_0, TIMES134_tree);
                    }
                    // AkinParser.g:247:34: ( terminator )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( ((LA55_0>=SEMICOLON && LA55_0<=COLON)||LA55_0==COMMA||LA55_0==NEWLINE) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // AkinParser.g:0:0: terminator
                            {
                            pushFollow(FOLLOW_terminator_in_forBlock2362);
                            terminator135=terminator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator135.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expressions_in_forBlock2373);
                    body=expressions();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, body.getTree());
                    END136=(Token)match(input,END,FOLLOW_END_in_forBlock2379); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    END136_tree = (Object)adaptor.create(END136);
                    adaptor.addChild(root_0, END136_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new ForNode((INTEGER133!=null?INTEGER133.getText():null), (body!=null?body.nodes:null)); 
                    }

                    }
                    break;
                case 2 :
                    // AkinParser.g:250:5: DOTHEFOLLOWING iterations= INTEGER TIMES ( WITH name= NAME INCREMENTING BY increment= INTEGER ( COMMA )? ( STARTING )? FROM start= INTEGER ( terminator )? )? body= expressions END
                    {
                    root_0 = (Object)adaptor.nil();

                    DOTHEFOLLOWING137=(Token)match(input,DOTHEFOLLOWING,FOLLOW_DOTHEFOLLOWING_in_forBlock2423); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOTHEFOLLOWING137_tree = (Object)adaptor.create(DOTHEFOLLOWING137);
                    adaptor.addChild(root_0, DOTHEFOLLOWING137_tree);
                    }
                    iterations=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_forBlock2427); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    iterations_tree = (Object)adaptor.create(iterations);
                    adaptor.addChild(root_0, iterations_tree);
                    }
                    TIMES138=(Token)match(input,TIMES,FOLLOW_TIMES_in_forBlock2429); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TIMES138_tree = (Object)adaptor.create(TIMES138);
                    adaptor.addChild(root_0, TIMES138_tree);
                    }
                    // AkinParser.g:251:5: ( WITH name= NAME INCREMENTING BY increment= INTEGER ( COMMA )? ( STARTING )? FROM start= INTEGER ( terminator )? )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==WITH) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // AkinParser.g:251:6: WITH name= NAME INCREMENTING BY increment= INTEGER ( COMMA )? ( STARTING )? FROM start= INTEGER ( terminator )?
                            {
                            WITH139=(Token)match(input,WITH,FOLLOW_WITH_in_forBlock2449); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            WITH139_tree = (Object)adaptor.create(WITH139);
                            adaptor.addChild(root_0, WITH139_tree);
                            }
                            name=(Token)match(input,NAME,FOLLOW_NAME_in_forBlock2453); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            name_tree = (Object)adaptor.create(name);
                            adaptor.addChild(root_0, name_tree);
                            }
                            INCREMENTING140=(Token)match(input,INCREMENTING,FOLLOW_INCREMENTING_in_forBlock2455); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            INCREMENTING140_tree = (Object)adaptor.create(INCREMENTING140);
                            adaptor.addChild(root_0, INCREMENTING140_tree);
                            }
                            BY141=(Token)match(input,BY,FOLLOW_BY_in_forBlock2457); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            BY141_tree = (Object)adaptor.create(BY141);
                            adaptor.addChild(root_0, BY141_tree);
                            }
                            increment=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_forBlock2461); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            increment_tree = (Object)adaptor.create(increment);
                            adaptor.addChild(root_0, increment_tree);
                            }
                            // AkinParser.g:252:7: ( COMMA )?
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==COMMA) ) {
                                alt56=1;
                            }
                            switch (alt56) {
                                case 1 :
                                    // AkinParser.g:0:0: COMMA
                                    {
                                    COMMA142=(Token)match(input,COMMA,FOLLOW_COMMA_in_forBlock2472); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    COMMA142_tree = (Object)adaptor.create(COMMA142);
                                    adaptor.addChild(root_0, COMMA142_tree);
                                    }

                                    }
                                    break;

                            }

                            // AkinParser.g:252:14: ( STARTING )?
                            int alt57=2;
                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==STARTING) ) {
                                alt57=1;
                            }
                            switch (alt57) {
                                case 1 :
                                    // AkinParser.g:0:0: STARTING
                                    {
                                    STARTING143=(Token)match(input,STARTING,FOLLOW_STARTING_in_forBlock2475); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    STARTING143_tree = (Object)adaptor.create(STARTING143);
                                    adaptor.addChild(root_0, STARTING143_tree);
                                    }

                                    }
                                    break;

                            }

                            FROM144=(Token)match(input,FROM,FOLLOW_FROM_in_forBlock2478); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            FROM144_tree = (Object)adaptor.create(FROM144);
                            adaptor.addChild(root_0, FROM144_tree);
                            }
                            start=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_forBlock2482); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            start_tree = (Object)adaptor.create(start);
                            adaptor.addChild(root_0, start_tree);
                            }
                            // AkinParser.g:252:43: ( terminator )?
                            int alt58=2;
                            int LA58_0 = input.LA(1);

                            if ( ((LA58_0>=SEMICOLON && LA58_0<=COLON)||LA58_0==COMMA||LA58_0==NEWLINE) ) {
                                alt58=1;
                            }
                            switch (alt58) {
                                case 1 :
                                    // AkinParser.g:0:0: terminator
                                    {
                                    pushFollow(FOLLOW_terminator_in_forBlock2484);
                                    terminator145=terminator();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator145.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_expressions_in_forBlock2510);
                    body=expressions();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, body.getTree());
                    END146=(Token)match(input,END,FOLLOW_END_in_forBlock2516); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    END146_tree = (Object)adaptor.create(END146);
                    adaptor.addChild(root_0, END146_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new ForNode((iterations!=null?iterations.getText():null), (name!=null?name.getText():null), (increment!=null?increment.getText():null), (start!=null?start.getText():null), (body!=null?body.nodes:null)); 
                    }

                    }
                    break;
                case 3 :
                    // AkinParser.g:255:5: DOTHEFOLLOWING WITH name= NAME INCREMENTING BY increment= INTEGER UNTIL iterations= INTEGER ( STARTING )? FROM start= INTEGER ( terminator )? body= expressions END
                    {
                    root_0 = (Object)adaptor.nil();

                    DOTHEFOLLOWING147=(Token)match(input,DOTHEFOLLOWING,FOLLOW_DOTHEFOLLOWING_in_forBlock2552); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOTHEFOLLOWING147_tree = (Object)adaptor.create(DOTHEFOLLOWING147);
                    adaptor.addChild(root_0, DOTHEFOLLOWING147_tree);
                    }
                    WITH148=(Token)match(input,WITH,FOLLOW_WITH_in_forBlock2554); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WITH148_tree = (Object)adaptor.create(WITH148);
                    adaptor.addChild(root_0, WITH148_tree);
                    }
                    name=(Token)match(input,NAME,FOLLOW_NAME_in_forBlock2558); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);
                    }
                    INCREMENTING149=(Token)match(input,INCREMENTING,FOLLOW_INCREMENTING_in_forBlock2560); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INCREMENTING149_tree = (Object)adaptor.create(INCREMENTING149);
                    adaptor.addChild(root_0, INCREMENTING149_tree);
                    }
                    BY150=(Token)match(input,BY,FOLLOW_BY_in_forBlock2562); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BY150_tree = (Object)adaptor.create(BY150);
                    adaptor.addChild(root_0, BY150_tree);
                    }
                    increment=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_forBlock2566); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    increment_tree = (Object)adaptor.create(increment);
                    adaptor.addChild(root_0, increment_tree);
                    }
                    UNTIL151=(Token)match(input,UNTIL,FOLLOW_UNTIL_in_forBlock2568); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNTIL151_tree = (Object)adaptor.create(UNTIL151);
                    adaptor.addChild(root_0, UNTIL151_tree);
                    }
                    iterations=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_forBlock2572); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    iterations_tree = (Object)adaptor.create(iterations);
                    adaptor.addChild(root_0, iterations_tree);
                    }
                    // AkinParser.g:255:94: ( STARTING )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==STARTING) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // AkinParser.g:0:0: STARTING
                            {
                            STARTING152=(Token)match(input,STARTING,FOLLOW_STARTING_in_forBlock2574); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            STARTING152_tree = (Object)adaptor.create(STARTING152);
                            adaptor.addChild(root_0, STARTING152_tree);
                            }

                            }
                            break;

                    }

                    FROM153=(Token)match(input,FROM,FOLLOW_FROM_in_forBlock2577); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FROM153_tree = (Object)adaptor.create(FROM153);
                    adaptor.addChild(root_0, FROM153_tree);
                    }
                    start=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_forBlock2581); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    start_tree = (Object)adaptor.create(start);
                    adaptor.addChild(root_0, start_tree);
                    }
                    // AkinParser.g:255:123: ( terminator )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( ((LA61_0>=SEMICOLON && LA61_0<=COLON)||LA61_0==COMMA||LA61_0==NEWLINE) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // AkinParser.g:0:0: terminator
                            {
                            pushFollow(FOLLOW_terminator_in_forBlock2583);
                            terminator154=terminator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator154.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_expressions_in_forBlock2606);
                    body=expressions();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, body.getTree());
                    END155=(Token)match(input,END,FOLLOW_END_in_forBlock2612); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    END155_tree = (Object)adaptor.create(END155);
                    adaptor.addChild(root_0, END155_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new ForNode((iterations!=null?iterations.getText():null), (name!=null?name.getText():null), (increment!=null?increment.getText():null), (start!=null?start.getText():null), (body!=null?body.nodes:null)); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forBlock"

    public static class whileBlock_return extends ParserRuleReturnScope {
        public WhileNode node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileBlock"
    // AkinParser.g:261:1: whileBlock returns [WhileNode node] : ( ( KEEPDOINGTHEFOLLOWINGG | WHILE ) condition= expression terminator body= expressions END | KEEPDOINGTHEFOLLOWING condition= expression terminator body= expressions END );
    public final AkinParser.whileBlock_return whileBlock() throws RecognitionException {
        AkinParser.whileBlock_return retval = new AkinParser.whileBlock_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set156=null;
        Token END158=null;
        Token KEEPDOINGTHEFOLLOWING159=null;
        Token END161=null;
        AkinParser.expression_return condition = null;

        AkinParser.expressions_return body = null;

        AkinParser.terminator_return terminator157 = null;

        AkinParser.terminator_return terminator160 = null;


        Object set156_tree=null;
        Object END158_tree=null;
        Object KEEPDOINGTHEFOLLOWING159_tree=null;
        Object END161_tree=null;

        try {
            // AkinParser.g:261:36: ( ( KEEPDOINGTHEFOLLOWINGG | WHILE ) condition= expression terminator body= expressions END | KEEPDOINGTHEFOLLOWING condition= expression terminator body= expressions END )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==WHILE||LA63_0==KEEPDOINGTHEFOLLOWINGG) ) {
                alt63=1;
            }
            else if ( (LA63_0==KEEPDOINGTHEFOLLOWING) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // AkinParser.g:262:5: ( KEEPDOINGTHEFOLLOWINGG | WHILE ) condition= expression terminator body= expressions END
                    {
                    root_0 = (Object)adaptor.nil();

                    set156=(Token)input.LT(1);
                    if ( input.LA(1)==WHILE||input.LA(1)==KEEPDOINGTHEFOLLOWINGG ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set156));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expression_in_whileBlock2669);
                    condition=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, condition.getTree());
                    pushFollow(FOLLOW_terminator_in_whileBlock2671);
                    terminator157=terminator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator157.getTree());
                    pushFollow(FOLLOW_expressions_in_whileBlock2681);
                    body=expressions();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, body.getTree());
                    END158=(Token)match(input,END,FOLLOW_END_in_whileBlock2687); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    END158_tree = (Object)adaptor.create(END158);
                    adaptor.addChild(root_0, END158_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new WhileNode((condition!=null?condition.node:null), (body!=null?body.nodes:null)); 
                    }

                    }
                    break;
                case 2 :
                    // AkinParser.g:265:5: KEEPDOINGTHEFOLLOWING condition= expression terminator body= expressions END
                    {
                    root_0 = (Object)adaptor.nil();

                    KEEPDOINGTHEFOLLOWING159=(Token)match(input,KEEPDOINGTHEFOLLOWING,FOLLOW_KEEPDOINGTHEFOLLOWING_in_whileBlock2725); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KEEPDOINGTHEFOLLOWING159_tree = (Object)adaptor.create(KEEPDOINGTHEFOLLOWING159);
                    adaptor.addChild(root_0, KEEPDOINGTHEFOLLOWING159_tree);
                    }
                    pushFollow(FOLLOW_expression_in_whileBlock2729);
                    condition=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, condition.getTree());
                    pushFollow(FOLLOW_terminator_in_whileBlock2731);
                    terminator160=terminator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator160.getTree());
                    pushFollow(FOLLOW_expressions_in_whileBlock2741);
                    body=expressions();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, body.getTree());
                    END161=(Token)match(input,END,FOLLOW_END_in_whileBlock2747); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    END161_tree = (Object)adaptor.create(END161);
                    adaptor.addChild(root_0, END161_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new WhileNode((condition!=null?condition.node:null), (body!=null?body.nodes:null), 1); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whileBlock"

    public static class doWhileBlock_return extends ParserRuleReturnScope {
        public DoWhileNode node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "doWhileBlock"
    // AkinParser.g:270:1: doWhileBlock returns [DoWhileNode node] : DOTHEFOLLOWING WHILE condition= expression terminator body= expressions END ;
    public final AkinParser.doWhileBlock_return doWhileBlock() throws RecognitionException {
        AkinParser.doWhileBlock_return retval = new AkinParser.doWhileBlock_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOTHEFOLLOWING162=null;
        Token WHILE163=null;
        Token END165=null;
        AkinParser.expression_return condition = null;

        AkinParser.expressions_return body = null;

        AkinParser.terminator_return terminator164 = null;


        Object DOTHEFOLLOWING162_tree=null;
        Object WHILE163_tree=null;
        Object END165_tree=null;

        try {
            // AkinParser.g:270:40: ( DOTHEFOLLOWING WHILE condition= expression terminator body= expressions END )
            // AkinParser.g:271:5: DOTHEFOLLOWING WHILE condition= expression terminator body= expressions END
            {
            root_0 = (Object)adaptor.nil();

            DOTHEFOLLOWING162=(Token)match(input,DOTHEFOLLOWING,FOLLOW_DOTHEFOLLOWING_in_doWhileBlock2797); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOTHEFOLLOWING162_tree = (Object)adaptor.create(DOTHEFOLLOWING162);
            adaptor.addChild(root_0, DOTHEFOLLOWING162_tree);
            }
            WHILE163=(Token)match(input,WHILE,FOLLOW_WHILE_in_doWhileBlock2799); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            WHILE163_tree = (Object)adaptor.create(WHILE163);
            adaptor.addChild(root_0, WHILE163_tree);
            }
            pushFollow(FOLLOW_expression_in_doWhileBlock2803);
            condition=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition.getTree());
            pushFollow(FOLLOW_terminator_in_doWhileBlock2805);
            terminator164=terminator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator164.getTree());
            pushFollow(FOLLOW_expressions_in_doWhileBlock2814);
            body=expressions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, body.getTree());
            END165=(Token)match(input,END,FOLLOW_END_in_doWhileBlock2819); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END165_tree = (Object)adaptor.create(END165);
            adaptor.addChild(root_0, END165_tree);
            }
            if ( state.backtracking==0 ) {
               retval.node = new DoWhileNode((condition!=null?condition.node:null), (body!=null?body.nodes:null)); 
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "doWhileBlock"

    public static class tryBlock_return extends ParserRuleReturnScope {
        public TryNode node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tryBlock"
    // AkinParser.g:275:1: tryBlock returns [TryNode node] : TRY terminator tryBody= expressions ( CATCH CONSTANT COLON NAME terminator catchBody= expressions )* END ;
    public final AkinParser.tryBlock_return tryBlock() throws RecognitionException {
        AkinParser.tryBlock_return retval = new AkinParser.tryBlock_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token TRY166=null;
        Token CATCH168=null;
        Token CONSTANT169=null;
        Token COLON170=null;
        Token NAME171=null;
        Token END173=null;
        AkinParser.expressions_return tryBody = null;

        AkinParser.expressions_return catchBody = null;

        AkinParser.terminator_return terminator167 = null;

        AkinParser.terminator_return terminator172 = null;


        Object TRY166_tree=null;
        Object CATCH168_tree=null;
        Object CONSTANT169_tree=null;
        Object COLON170_tree=null;
        Object NAME171_tree=null;
        Object END173_tree=null;

        try {
            // AkinParser.g:275:32: ( TRY terminator tryBody= expressions ( CATCH CONSTANT COLON NAME terminator catchBody= expressions )* END )
            // AkinParser.g:276:5: TRY terminator tryBody= expressions ( CATCH CONSTANT COLON NAME terminator catchBody= expressions )* END
            {
            root_0 = (Object)adaptor.nil();

            TRY166=(Token)match(input,TRY,FOLLOW_TRY_in_tryBlock2866); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TRY166_tree = (Object)adaptor.create(TRY166);
            adaptor.addChild(root_0, TRY166_tree);
            }
            pushFollow(FOLLOW_terminator_in_tryBlock2868);
            terminator167=terminator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator167.getTree());
            pushFollow(FOLLOW_expressions_in_tryBlock2878);
            tryBody=expressions();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, tryBody.getTree());
            if ( state.backtracking==0 ) {
               retval.node = new TryNode((tryBody!=null?tryBody.nodes:null)); 
            }
            // AkinParser.g:278:5: ( CATCH CONSTANT COLON NAME terminator catchBody= expressions )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==CATCH) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // AkinParser.g:278:6: CATCH CONSTANT COLON NAME terminator catchBody= expressions
            	    {
            	    CATCH168=(Token)match(input,CATCH,FOLLOW_CATCH_in_tryBlock2905); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CATCH168_tree = (Object)adaptor.create(CATCH168);
            	    adaptor.addChild(root_0, CATCH168_tree);
            	    }
            	    CONSTANT169=(Token)match(input,CONSTANT,FOLLOW_CONSTANT_in_tryBlock2907); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    CONSTANT169_tree = (Object)adaptor.create(CONSTANT169);
            	    adaptor.addChild(root_0, CONSTANT169_tree);
            	    }
            	    COLON170=(Token)match(input,COLON,FOLLOW_COLON_in_tryBlock2909); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COLON170_tree = (Object)adaptor.create(COLON170);
            	    adaptor.addChild(root_0, COLON170_tree);
            	    }
            	    NAME171=(Token)match(input,NAME,FOLLOW_NAME_in_tryBlock2911); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NAME171_tree = (Object)adaptor.create(NAME171);
            	    adaptor.addChild(root_0, NAME171_tree);
            	    }
            	    pushFollow(FOLLOW_terminator_in_tryBlock2913);
            	    terminator172=terminator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, terminator172.getTree());
            	    pushFollow(FOLLOW_expressions_in_tryBlock2923);
            	    catchBody=expressions();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, catchBody.getTree());
            	    if ( state.backtracking==0 ) {
            	       retval.node.addCatchBlock((CONSTANT169!=null?CONSTANT169.getText():null), (NAME171!=null?NAME171.getText():null), (catchBody!=null?catchBody.nodes:null));  
            	    }

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            END173=(Token)match(input,END,FOLLOW_END_in_tryBlock2954); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END173_tree = (Object)adaptor.create(END173);
            adaptor.addChild(root_0, END173_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tryBlock"

    public static class calcBlock_return extends ParserRuleReturnScope {
        public CalcNode node;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "calcBlock"
    // AkinParser.g:284:1: calcBlock returns [CalcNode node] : ( EADD num= INTEGER TO name= NAME | ESUBTRACT num= INTEGER FROM name= NAME | EDIVIDE name= NAME BY num= INTEGER | EMULTIPLY name= NAME BY num= INTEGER | EADD num= FLOAT TO name= NAME | ESUBTRACT num= FLOAT FROM name= NAME | EDIVIDE name= NAME BY num= FLOAT | EMULTIPLY name= NAME BY num= FLOAT );
    public final AkinParser.calcBlock_return calcBlock() throws RecognitionException {
        AkinParser.calcBlock_return retval = new AkinParser.calcBlock_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token num=null;
        Token name=null;
        Token EADD174=null;
        Token TO175=null;
        Token ESUBTRACT176=null;
        Token FROM177=null;
        Token EDIVIDE178=null;
        Token BY179=null;
        Token EMULTIPLY180=null;
        Token BY181=null;
        Token EADD182=null;
        Token TO183=null;
        Token ESUBTRACT184=null;
        Token FROM185=null;
        Token EDIVIDE186=null;
        Token BY187=null;
        Token EMULTIPLY188=null;
        Token BY189=null;

        Object num_tree=null;
        Object name_tree=null;
        Object EADD174_tree=null;
        Object TO175_tree=null;
        Object ESUBTRACT176_tree=null;
        Object FROM177_tree=null;
        Object EDIVIDE178_tree=null;
        Object BY179_tree=null;
        Object EMULTIPLY180_tree=null;
        Object BY181_tree=null;
        Object EADD182_tree=null;
        Object TO183_tree=null;
        Object ESUBTRACT184_tree=null;
        Object FROM185_tree=null;
        Object EDIVIDE186_tree=null;
        Object BY187_tree=null;
        Object EMULTIPLY188_tree=null;
        Object BY189_tree=null;

        try {
            // AkinParser.g:284:34: ( EADD num= INTEGER TO name= NAME | ESUBTRACT num= INTEGER FROM name= NAME | EDIVIDE name= NAME BY num= INTEGER | EMULTIPLY name= NAME BY num= INTEGER | EADD num= FLOAT TO name= NAME | ESUBTRACT num= FLOAT FROM name= NAME | EDIVIDE name= NAME BY num= FLOAT | EMULTIPLY name= NAME BY num= FLOAT )
            int alt65=8;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // AkinParser.g:285:2: EADD num= INTEGER TO name= NAME
                    {
                    root_0 = (Object)adaptor.nil();

                    EADD174=(Token)match(input,EADD,FOLLOW_EADD_in_calcBlock2971); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EADD174_tree = (Object)adaptor.create(EADD174);
                    adaptor.addChild(root_0, EADD174_tree);
                    }
                    num=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_calcBlock2975); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    num_tree = (Object)adaptor.create(num);
                    adaptor.addChild(root_0, num_tree);
                    }
                    TO175=(Token)match(input,TO,FOLLOW_TO_in_calcBlock2977); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TO175_tree = (Object)adaptor.create(TO175);
                    adaptor.addChild(root_0, TO175_tree);
                    }
                    name=(Token)match(input,NAME,FOLLOW_NAME_in_calcBlock2981); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new CalcNode((num!=null?num.getText():null), (name!=null?name.getText():null), 1, 1); 
                    }

                    }
                    break;
                case 2 :
                    // AkinParser.g:286:5: ESUBTRACT num= INTEGER FROM name= NAME
                    {
                    root_0 = (Object)adaptor.nil();

                    ESUBTRACT176=(Token)match(input,ESUBTRACT,FOLLOW_ESUBTRACT_in_calcBlock3003); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ESUBTRACT176_tree = (Object)adaptor.create(ESUBTRACT176);
                    adaptor.addChild(root_0, ESUBTRACT176_tree);
                    }
                    num=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_calcBlock3007); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    num_tree = (Object)adaptor.create(num);
                    adaptor.addChild(root_0, num_tree);
                    }
                    FROM177=(Token)match(input,FROM,FOLLOW_FROM_in_calcBlock3009); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FROM177_tree = (Object)adaptor.create(FROM177);
                    adaptor.addChild(root_0, FROM177_tree);
                    }
                    name=(Token)match(input,NAME,FOLLOW_NAME_in_calcBlock3013); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new CalcNode((num!=null?num.getText():null), (name!=null?name.getText():null), 2, 1); 
                    }

                    }
                    break;
                case 3 :
                    // AkinParser.g:287:5: EDIVIDE name= NAME BY num= INTEGER
                    {
                    root_0 = (Object)adaptor.nil();

                    EDIVIDE178=(Token)match(input,EDIVIDE,FOLLOW_EDIVIDE_in_calcBlock3028); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EDIVIDE178_tree = (Object)adaptor.create(EDIVIDE178);
                    adaptor.addChild(root_0, EDIVIDE178_tree);
                    }
                    name=(Token)match(input,NAME,FOLLOW_NAME_in_calcBlock3032); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);
                    }
                    BY179=(Token)match(input,BY,FOLLOW_BY_in_calcBlock3034); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BY179_tree = (Object)adaptor.create(BY179);
                    adaptor.addChild(root_0, BY179_tree);
                    }
                    num=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_calcBlock3038); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    num_tree = (Object)adaptor.create(num);
                    adaptor.addChild(root_0, num_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new CalcNode((num!=null?num.getText():null), (name!=null?name.getText():null), 3, 1); 
                    }

                    }
                    break;
                case 4 :
                    // AkinParser.g:288:5: EMULTIPLY name= NAME BY num= INTEGER
                    {
                    root_0 = (Object)adaptor.nil();

                    EMULTIPLY180=(Token)match(input,EMULTIPLY,FOLLOW_EMULTIPLY_in_calcBlock3057); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EMULTIPLY180_tree = (Object)adaptor.create(EMULTIPLY180);
                    adaptor.addChild(root_0, EMULTIPLY180_tree);
                    }
                    name=(Token)match(input,NAME,FOLLOW_NAME_in_calcBlock3061); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);
                    }
                    BY181=(Token)match(input,BY,FOLLOW_BY_in_calcBlock3063); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BY181_tree = (Object)adaptor.create(BY181);
                    adaptor.addChild(root_0, BY181_tree);
                    }
                    num=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_calcBlock3067); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    num_tree = (Object)adaptor.create(num);
                    adaptor.addChild(root_0, num_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new CalcNode((num!=null?num.getText():null), (name!=null?name.getText():null), 4, 1); 
                    }

                    }
                    break;
                case 5 :
                    // AkinParser.g:289:5: EADD num= FLOAT TO name= NAME
                    {
                    root_0 = (Object)adaptor.nil();

                    EADD182=(Token)match(input,EADD,FOLLOW_EADD_in_calcBlock3084); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EADD182_tree = (Object)adaptor.create(EADD182);
                    adaptor.addChild(root_0, EADD182_tree);
                    }
                    num=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_calcBlock3088); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    num_tree = (Object)adaptor.create(num);
                    adaptor.addChild(root_0, num_tree);
                    }
                    TO183=(Token)match(input,TO,FOLLOW_TO_in_calcBlock3090); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TO183_tree = (Object)adaptor.create(TO183);
                    adaptor.addChild(root_0, TO183_tree);
                    }
                    name=(Token)match(input,NAME,FOLLOW_NAME_in_calcBlock3094); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new CalcNode((num!=null?num.getText():null), (name!=null?name.getText():null), 1, 2); 
                    }

                    }
                    break;
                case 6 :
                    // AkinParser.g:290:5: ESUBTRACT num= FLOAT FROM name= NAME
                    {
                    root_0 = (Object)adaptor.nil();

                    ESUBTRACT184=(Token)match(input,ESUBTRACT,FOLLOW_ESUBTRACT_in_calcBlock3116); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ESUBTRACT184_tree = (Object)adaptor.create(ESUBTRACT184);
                    adaptor.addChild(root_0, ESUBTRACT184_tree);
                    }
                    num=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_calcBlock3120); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    num_tree = (Object)adaptor.create(num);
                    adaptor.addChild(root_0, num_tree);
                    }
                    FROM185=(Token)match(input,FROM,FOLLOW_FROM_in_calcBlock3122); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FROM185_tree = (Object)adaptor.create(FROM185);
                    adaptor.addChild(root_0, FROM185_tree);
                    }
                    name=(Token)match(input,NAME,FOLLOW_NAME_in_calcBlock3126); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new CalcNode((num!=null?num.getText():null), (name!=null?name.getText():null), 2, 2); 
                    }

                    }
                    break;
                case 7 :
                    // AkinParser.g:291:5: EDIVIDE name= NAME BY num= FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    EDIVIDE186=(Token)match(input,EDIVIDE,FOLLOW_EDIVIDE_in_calcBlock3141); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EDIVIDE186_tree = (Object)adaptor.create(EDIVIDE186);
                    adaptor.addChild(root_0, EDIVIDE186_tree);
                    }
                    name=(Token)match(input,NAME,FOLLOW_NAME_in_calcBlock3145); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);
                    }
                    BY187=(Token)match(input,BY,FOLLOW_BY_in_calcBlock3147); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BY187_tree = (Object)adaptor.create(BY187);
                    adaptor.addChild(root_0, BY187_tree);
                    }
                    num=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_calcBlock3151); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    num_tree = (Object)adaptor.create(num);
                    adaptor.addChild(root_0, num_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new CalcNode((num!=null?num.getText():null), (name!=null?name.getText():null), 3, 2); 
                    }

                    }
                    break;
                case 8 :
                    // AkinParser.g:292:5: EMULTIPLY name= NAME BY num= FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    EMULTIPLY188=(Token)match(input,EMULTIPLY,FOLLOW_EMULTIPLY_in_calcBlock3170); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EMULTIPLY188_tree = (Object)adaptor.create(EMULTIPLY188);
                    adaptor.addChild(root_0, EMULTIPLY188_tree);
                    }
                    name=(Token)match(input,NAME,FOLLOW_NAME_in_calcBlock3174); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    name_tree = (Object)adaptor.create(name);
                    adaptor.addChild(root_0, name_tree);
                    }
                    BY189=(Token)match(input,BY,FOLLOW_BY_in_calcBlock3176); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BY189_tree = (Object)adaptor.create(BY189);
                    adaptor.addChild(root_0, BY189_tree);
                    }
                    num=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_calcBlock3180); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    num_tree = (Object)adaptor.create(num);
                    adaptor.addChild(root_0, num_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.node = new CalcNode((num!=null?num.getText():null), (name!=null?name.getText():null), 4, 2); 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

          catch(RecognitionException recognitionException) {
            throw recognitionException;
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "calcBlock"

    // $ANTLR start synpred3_AkinParser
    public final void synpred3_AkinParser_fragment() throws RecognitionException {   
        AkinParser.expression_return tail = null;


        // AkinParser.g:63:6: ( terminator tail= expression )
        // AkinParser.g:63:6: terminator tail= expression
        {
        pushFollow(FOLLOW_terminator_in_synpred3_AkinParser142);
        terminator();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred3_AkinParser151);
        tail=expression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_AkinParser

    // $ANTLR start synpred4_AkinParser
    public final void synpred4_AkinParser_fragment() throws RecognitionException {   
        // AkinParser.g:66:5: ( terminator )
        // AkinParser.g:66:5: terminator
        {
        pushFollow(FOLLOW_terminator_in_synpred4_AkinParser167);
        terminator();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_AkinParser

    // $ANTLR start synpred11_AkinParser
    public final void synpred11_AkinParser_fragment() throws RecognitionException {   
        AkinParser.andExpression_return receiver = null;

        AkinParser.orExpression_return arg = null;


        // AkinParser.g:87:5: (receiver= andExpression ( OR | ORE ) arg= orExpression )
        // AkinParser.g:87:5: receiver= andExpression ( OR | ORE ) arg= orExpression
        {
        pushFollow(FOLLOW_andExpression_in_synpred11_AkinParser292);
        receiver=andExpression();

        state._fsp--;
        if (state.failed) return ;
        if ( input.LA(1)==ORE||input.LA(1)==OR ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_orExpression_in_synpred11_AkinParser308);
        arg=orExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_AkinParser

    // $ANTLR start synpred13_AkinParser
    public final void synpred13_AkinParser_fragment() throws RecognitionException {   
        AkinParser.relationalExpression_return receiver = null;

        AkinParser.andExpression_return arg = null;


        // AkinParser.g:93:5: (receiver= relationalExpression ( AND | ANDE ) arg= andExpression )
        // AkinParser.g:93:5: receiver= relationalExpression ( AND | ANDE ) arg= andExpression
        {
        pushFollow(FOLLOW_relationalExpression_in_synpred13_AkinParser358);
        receiver=relationalExpression();

        state._fsp--;
        if (state.failed) return ;
        if ( input.LA(1)==ANDE||input.LA(1)==AND ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_andExpression_in_synpred13_AkinParser374);
        arg=andExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_AkinParser

    // $ANTLR start synpred22_AkinParser
    public final void synpred22_AkinParser_fragment() throws RecognitionException {   
        Token op=null;
        AkinParser.additiveExpression_return receiver = null;

        AkinParser.relationalExpression_return arg = null;


        // AkinParser.g:99:5: (receiver= additiveExpression op= ( EQ | LE | GE | LT | GT | GTT | LTT | ETT | NE ) arg= relationalExpression )
        // AkinParser.g:99:5: receiver= additiveExpression op= ( EQ | LE | GE | LT | GT | GTT | LTT | ETT | NE ) arg= relationalExpression
        {
        pushFollow(FOLLOW_additiveExpression_in_synpred22_AkinParser415);
        receiver=additiveExpression();

        state._fsp--;
        if (state.failed) return ;
        op=(Token)input.LT(1);
        if ( (input.LA(1)>=GTT && input.LA(1)<=ETT)||(input.LA(1)>=EQ && input.LA(1)<=GT) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_relationalExpression_in_synpred22_AkinParser455);
        arg=relationalExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_AkinParser

    // $ANTLR start synpred24_AkinParser
    public final void synpred24_AkinParser_fragment() throws RecognitionException {   
        Token op=null;
        AkinParser.multiplicativeExpression_return receiver = null;

        AkinParser.additiveExpression_return arg = null;


        // AkinParser.g:106:5: (receiver= multiplicativeExpression op= ( PLUS | MINUS ) arg= additiveExpression )
        // AkinParser.g:106:5: receiver= multiplicativeExpression op= ( PLUS | MINUS ) arg= additiveExpression
        {
        pushFollow(FOLLOW_multiplicativeExpression_in_synpred24_AkinParser495);
        receiver=multiplicativeExpression();

        state._fsp--;
        if (state.failed) return ;
        op=(Token)input.LT(1);
        if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_additiveExpression_in_synpred24_AkinParser513);
        arg=additiveExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_AkinParser

    // $ANTLR start synpred27_AkinParser
    public final void synpred27_AkinParser_fragment() throws RecognitionException {   
        Token op=null;
        AkinParser.unaryExpression_return receiver = null;

        AkinParser.multiplicativeExpression_return arg = null;


        // AkinParser.g:112:5: (receiver= unaryExpression op= ( MUL | DIV | MOD ) arg= multiplicativeExpression )
        // AkinParser.g:112:5: receiver= unaryExpression op= ( MUL | DIV | MOD ) arg= multiplicativeExpression
        {
        pushFollow(FOLLOW_unaryExpression_in_synpred27_AkinParser561);
        receiver=unaryExpression();

        state._fsp--;
        if (state.failed) return ;
        op=(Token)input.LT(1);
        if ( (input.LA(1)>=MUL && input.LA(1)<=MOD) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        pushFollow(FOLLOW_multiplicativeExpression_in_synpred27_AkinParser581);
        arg=multiplicativeExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_AkinParser

    // $ANTLR start synpred49_AkinParser
    public final void synpred49_AkinParser_fragment() throws RecognitionException {   
        // AkinParser.g:161:21: ( terminator )
        // AkinParser.g:161:21: terminator
        {
        pushFollow(FOLLOW_terminator_in_synpred49_AkinParser1150);
        terminator();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_AkinParser

    // $ANTLR start synpred51_AkinParser
    public final void synpred51_AkinParser_fragment() throws RecognitionException {   
        AkinParser.message_return head = null;


        // AkinParser.g:168:6: (head= message DOT )
        // AkinParser.g:168:6: head= message DOT
        {
        pushFollow(FOLLOW_message_in_synpred51_AkinParser1215);
        head=message();

        state._fsp--;
        if (state.failed) return ;
        match(input,DOT,FOLLOW_DOT_in_synpred51_AkinParser1217); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_AkinParser

    // $ANTLR start synpred52_AkinParser
    public final void synpred52_AkinParser_fragment() throws RecognitionException {   
        AkinParser.message_return head = null;

        AkinParser.message_return tail = null;


        // AkinParser.g:166:5: ( ( literal DOT )? (head= message DOT )* tail= message )
        // AkinParser.g:166:5: ( literal DOT )? (head= message DOT )* tail= message
        {
        // AkinParser.g:166:5: ( literal DOT )?
        int alt66=2;
        int LA66_0 = input.LA(1);

        if ( ((LA66_0>=SELF && LA66_0<=FALSE)||LA66_0==THE||LA66_0==THIS||(LA66_0>=INTEGER && LA66_0<=FLOAT)||LA66_0==STRING||LA66_0==CONSTANT||LA66_0==AT) ) {
            alt66=1;
        }
        switch (alt66) {
            case 1 :
                // AkinParser.g:166:6: literal DOT
                {
                pushFollow(FOLLOW_literal_in_synpred52_AkinParser1174);
                literal();

                state._fsp--;
                if (state.failed) return ;
                match(input,DOT,FOLLOW_DOT_in_synpred52_AkinParser1176); if (state.failed) return ;

                }
                break;

        }

        // AkinParser.g:168:5: (head= message DOT )*
        loop67:
        do {
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==NAME) ) {
                int LA67_1 = input.LA(2);

                if ( (synpred51_AkinParser()) ) {
                    alt67=1;
                }


            }
            else if ( (LA67_0==MAKETHECOMPUTER) ) {
                int LA67_2 = input.LA(2);

                if ( (synpred51_AkinParser()) ) {
                    alt67=1;
                }


            }


            switch (alt67) {
        	case 1 :
        	    // AkinParser.g:168:6: head= message DOT
        	    {
        	    pushFollow(FOLLOW_message_in_synpred52_AkinParser1215);
        	    head=message();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    match(input,DOT,FOLLOW_DOT_in_synpred52_AkinParser1217); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop67;
            }
        } while (true);

        pushFollow(FOLLOW_message_in_synpred52_AkinParser1250);
        tail=message();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_AkinParser

    // $ANTLR start synpred54_AkinParser
    public final void synpred54_AkinParser_fragment() throws RecognitionException {   
        AkinParser.message_return head = null;


        // AkinParser.g:173:6: (head= message )
        // AkinParser.g:173:6: head= message
        {
        pushFollow(FOLLOW_message_in_synpred54_AkinParser1318);
        head=message();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_AkinParser

    // $ANTLR start synpred58_AkinParser
    public final void synpred58_AkinParser_fragment() throws RecognitionException {   
        // AkinParser.g:184:26: ( END )
        // AkinParser.g:184:26: END
        {
        match(input,END,FOLLOW_END_in_synpred58_AkinParser1488); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_AkinParser

    // $ANTLR start synpred60_AkinParser
    public final void synpred60_AkinParser_fragment() throws RecognitionException {   
        // AkinParser.g:185:51: ( END )
        // AkinParser.g:185:51: END
        {
        match(input,END,FOLLOW_END_in_synpred60_AkinParser1515); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_AkinParser

    // $ANTLR start synpred62_AkinParser
    public final void synpred62_AkinParser_fragment() throws RecognitionException {   
        // AkinParser.g:188:40: ( END )
        // AkinParser.g:188:40: END
        {
        match(input,END,FOLLOW_END_in_synpred62_AkinParser1588); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_AkinParser

    // $ANTLR start synpred75_AkinParser
    public final void synpred75_AkinParser_fragment() throws RecognitionException {   
        // AkinParser.g:213:65: ( OPEN_PARENT ( parameters )? CLOSE_PARENT )
        // AkinParser.g:213:65: OPEN_PARENT ( parameters )? CLOSE_PARENT
        {
        match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_synpred75_AkinParser1873); if (state.failed) return ;
        // AkinParser.g:213:77: ( parameters )?
        int alt71=2;
        int LA71_0 = input.LA(1);

        if ( (LA71_0==NAME) ) {
            alt71=1;
        }
        switch (alt71) {
            case 1 :
                // AkinParser.g:0:0: parameters
                {
                pushFollow(FOLLOW_parameters_in_synpred75_AkinParser1875);
                parameters();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_synpred75_AkinParser1878); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_AkinParser

    // $ANTLR start synpred81_AkinParser
    public final void synpred81_AkinParser_fragment() throws RecognitionException {   
        // AkinParser.g:213:5: ( ( THIS | TO | IT | YOU ) ( CAN ( ALSO )? )? ( GET )? ( CALCULATE )? NAME ( WITH )? ( OPEN_PARENT ( parameters )? CLOSE_PARENT )? ( BY )? ( WHICHISTO | ISTO | terminator )* expressions ( THEN )? END )
        // AkinParser.g:213:5: ( THIS | TO | IT | YOU ) ( CAN ( ALSO )? )? ( GET )? ( CALCULATE )? NAME ( WITH )? ( OPEN_PARENT ( parameters )? CLOSE_PARENT )? ( BY )? ( WHICHISTO | ISTO | terminator )* expressions ( THEN )? END
        {
        if ( input.LA(1)==TO||input.LA(1)==THIS||input.LA(1)==IT||input.LA(1)==YOU ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }

        // AkinParser.g:213:22: ( CAN ( ALSO )? )?
        int alt73=2;
        int LA73_0 = input.LA(1);

        if ( (LA73_0==CAN) ) {
            alt73=1;
        }
        switch (alt73) {
            case 1 :
                // AkinParser.g:213:23: CAN ( ALSO )?
                {
                match(input,CAN,FOLLOW_CAN_in_synpred81_AkinParser1852); if (state.failed) return ;
                // AkinParser.g:213:27: ( ALSO )?
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==ALSO) ) {
                    alt72=1;
                }
                switch (alt72) {
                    case 1 :
                        // AkinParser.g:213:28: ALSO
                        {
                        match(input,ALSO,FOLLOW_ALSO_in_synpred81_AkinParser1855); if (state.failed) return ;

                        }
                        break;

                }


                }
                break;

        }

        // AkinParser.g:213:37: ( GET )?
        int alt74=2;
        int LA74_0 = input.LA(1);

        if ( (LA74_0==GET) ) {
            alt74=1;
        }
        switch (alt74) {
            case 1 :
                // AkinParser.g:0:0: GET
                {
                match(input,GET,FOLLOW_GET_in_synpred81_AkinParser1861); if (state.failed) return ;

                }
                break;

        }

        // AkinParser.g:213:42: ( CALCULATE )?
        int alt75=2;
        int LA75_0 = input.LA(1);

        if ( (LA75_0==CALCULATE) ) {
            alt75=1;
        }
        switch (alt75) {
            case 1 :
                // AkinParser.g:0:0: CALCULATE
                {
                match(input,CALCULATE,FOLLOW_CALCULATE_in_synpred81_AkinParser1864); if (state.failed) return ;

                }
                break;

        }

        match(input,NAME,FOLLOW_NAME_in_synpred81_AkinParser1867); if (state.failed) return ;
        // AkinParser.g:213:58: ( WITH )?
        int alt76=2;
        int LA76_0 = input.LA(1);

        if ( (LA76_0==WITH) ) {
            alt76=1;
        }
        switch (alt76) {
            case 1 :
                // AkinParser.g:0:0: WITH
                {
                match(input,WITH,FOLLOW_WITH_in_synpred81_AkinParser1869); if (state.failed) return ;

                }
                break;

        }

        // AkinParser.g:213:64: ( OPEN_PARENT ( parameters )? CLOSE_PARENT )?
        int alt78=2;
        alt78 = dfa78.predict(input);
        switch (alt78) {
            case 1 :
                // AkinParser.g:213:65: OPEN_PARENT ( parameters )? CLOSE_PARENT
                {
                match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_synpred81_AkinParser1873); if (state.failed) return ;
                // AkinParser.g:213:77: ( parameters )?
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==NAME) ) {
                    alt77=1;
                }
                switch (alt77) {
                    case 1 :
                        // AkinParser.g:0:0: parameters
                        {
                        pushFollow(FOLLOW_parameters_in_synpred81_AkinParser1875);
                        parameters();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }

                match(input,CLOSE_PARENT,FOLLOW_CLOSE_PARENT_in_synpred81_AkinParser1878); if (state.failed) return ;

                }
                break;

        }

        // AkinParser.g:213:104: ( BY )?
        int alt79=2;
        int LA79_0 = input.LA(1);

        if ( (LA79_0==BY) ) {
            alt79=1;
        }
        switch (alt79) {
            case 1 :
                // AkinParser.g:0:0: BY
                {
                match(input,BY,FOLLOW_BY_in_synpred81_AkinParser1882); if (state.failed) return ;

                }
                break;

        }

        // AkinParser.g:213:108: ( WHICHISTO | ISTO | terminator )*
        loop80:
        do {
            int alt80=4;
            switch ( input.LA(1) ) {
            case WHICHISTO:
                {
                alt80=1;
                }
                break;
            case ISTO:
                {
                alt80=2;
                }
                break;
            case SEMICOLON:
            case COLON:
            case COMMA:
            case NEWLINE:
                {
                alt80=3;
                }
                break;

            }

            switch (alt80) {
        	case 1 :
        	    // AkinParser.g:213:109: WHICHISTO
        	    {
        	    match(input,WHICHISTO,FOLLOW_WHICHISTO_in_synpred81_AkinParser1886); if (state.failed) return ;

        	    }
        	    break;
        	case 2 :
        	    // AkinParser.g:213:119: ISTO
        	    {
        	    match(input,ISTO,FOLLOW_ISTO_in_synpred81_AkinParser1888); if (state.failed) return ;

        	    }
        	    break;
        	case 3 :
        	    // AkinParser.g:213:124: terminator
        	    {
        	    pushFollow(FOLLOW_terminator_in_synpred81_AkinParser1890);
        	    terminator();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop80;
            }
        } while (true);

        pushFollow(FOLLOW_expressions_in_synpred81_AkinParser1901);
        expressions();

        state._fsp--;
        if (state.failed) return ;
        // AkinParser.g:215:5: ( THEN )?
        int alt81=2;
        int LA81_0 = input.LA(1);

        if ( (LA81_0==THEN) ) {
            alt81=1;
        }
        switch (alt81) {
            case 1 :
                // AkinParser.g:0:0: THEN
                {
                match(input,THEN,FOLLOW_THEN_in_synpred81_AkinParser1907); if (state.failed) return ;

                }
                break;

        }

        match(input,END,FOLLOW_END_in_synpred81_AkinParser1910); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred81_AkinParser

    // $ANTLR start synpred89_AkinParser
    public final void synpred89_AkinParser_fragment() throws RecognitionException {   
        // AkinParser.g:216:53: ( OPEN_PARENT )
        // AkinParser.g:216:53: OPEN_PARENT
        {
        match(input,OPEN_PARENT,FOLLOW_OPEN_PARENT_in_synpred89_AkinParser1966); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred89_AkinParser

    // $ANTLR start synpred90_AkinParser
    public final void synpred90_AkinParser_fragment() throws RecognitionException {   
        // AkinParser.g:216:66: ( parameters )
        // AkinParser.g:216:66: parameters
        {
        pushFollow(FOLLOW_parameters_in_synpred90_AkinParser1969);
        parameters();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred90_AkinParser

    // $ANTLR start synpred96_AkinParser
    public final void synpred96_AkinParser_fragment() throws RecognitionException {   
        // AkinParser.g:218:5: ( THEN )
        // AkinParser.g:218:5: THEN
        {
        match(input,THEN,FOLLOW_THEN_in_synpred96_AkinParser1999); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred96_AkinParser

    // $ANTLR start synpred97_AkinParser
    public final void synpred97_AkinParser_fragment() throws RecognitionException {   
        // AkinParser.g:218:11: ( END )
        // AkinParser.g:218:11: END
        {
        match(input,END,FOLLOW_END_in_synpred97_AkinParser2002); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred97_AkinParser

    // $ANTLR start synpred99_AkinParser
    public final void synpred99_AkinParser_fragment() throws RecognitionException {   
        Token tail=null;

        // AkinParser.g:225:6: ( COMMA ( ANDE )? tail= NAME )
        // AkinParser.g:225:6: COMMA ( ANDE )? tail= NAME
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred99_AkinParser2111); if (state.failed) return ;
        // AkinParser.g:225:12: ( ANDE )?
        int alt83=2;
        int LA83_0 = input.LA(1);

        if ( (LA83_0==ANDE) ) {
            alt83=1;
        }
        switch (alt83) {
            case 1 :
                // AkinParser.g:225:13: ANDE
                {
                match(input,ANDE,FOLLOW_ANDE_in_synpred99_AkinParser2114); if (state.failed) return ;

                }
                break;

        }

        tail=(Token)match(input,NAME,FOLLOW_NAME_in_synpred99_AkinParser2125); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred99_AkinParser

    // $ANTLR start synpred106_AkinParser
    public final void synpred106_AkinParser_fragment() throws RecognitionException {   
        AkinParser.expressions_return body = null;


        // AkinParser.g:247:5: ( DOTHEFOLLOWING INTEGER TIMES ( terminator )? body= expressions END )
        // AkinParser.g:247:5: DOTHEFOLLOWING INTEGER TIMES ( terminator )? body= expressions END
        {
        match(input,DOTHEFOLLOWING,FOLLOW_DOTHEFOLLOWING_in_synpred106_AkinParser2356); if (state.failed) return ;
        match(input,INTEGER,FOLLOW_INTEGER_in_synpred106_AkinParser2358); if (state.failed) return ;
        match(input,TIMES,FOLLOW_TIMES_in_synpred106_AkinParser2360); if (state.failed) return ;
        // AkinParser.g:247:34: ( terminator )?
        int alt85=2;
        int LA85_0 = input.LA(1);

        if ( ((LA85_0>=SEMICOLON && LA85_0<=COLON)||LA85_0==COMMA||LA85_0==NEWLINE) ) {
            alt85=1;
        }
        switch (alt85) {
            case 1 :
                // AkinParser.g:0:0: terminator
                {
                pushFollow(FOLLOW_terminator_in_synpred106_AkinParser2362);
                terminator();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_expressions_in_synpred106_AkinParser2373);
        body=expressions();

        state._fsp--;
        if (state.failed) return ;
        match(input,END,FOLLOW_END_in_synpred106_AkinParser2379); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred106_AkinParser

    // $ANTLR start synpred111_AkinParser
    public final void synpred111_AkinParser_fragment() throws RecognitionException {   
        Token iterations=null;
        Token name=null;
        Token increment=null;
        Token start=null;
        AkinParser.expressions_return body = null;


        // AkinParser.g:250:5: ( DOTHEFOLLOWING iterations= INTEGER TIMES ( WITH name= NAME INCREMENTING BY increment= INTEGER ( COMMA )? ( STARTING )? FROM start= INTEGER ( terminator )? )? body= expressions END )
        // AkinParser.g:250:5: DOTHEFOLLOWING iterations= INTEGER TIMES ( WITH name= NAME INCREMENTING BY increment= INTEGER ( COMMA )? ( STARTING )? FROM start= INTEGER ( terminator )? )? body= expressions END
        {
        match(input,DOTHEFOLLOWING,FOLLOW_DOTHEFOLLOWING_in_synpred111_AkinParser2423); if (state.failed) return ;
        iterations=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_synpred111_AkinParser2427); if (state.failed) return ;
        match(input,TIMES,FOLLOW_TIMES_in_synpred111_AkinParser2429); if (state.failed) return ;
        // AkinParser.g:251:5: ( WITH name= NAME INCREMENTING BY increment= INTEGER ( COMMA )? ( STARTING )? FROM start= INTEGER ( terminator )? )?
        int alt92=2;
        int LA92_0 = input.LA(1);

        if ( (LA92_0==WITH) ) {
            alt92=1;
        }
        switch (alt92) {
            case 1 :
                // AkinParser.g:251:6: WITH name= NAME INCREMENTING BY increment= INTEGER ( COMMA )? ( STARTING )? FROM start= INTEGER ( terminator )?
                {
                match(input,WITH,FOLLOW_WITH_in_synpred111_AkinParser2449); if (state.failed) return ;
                name=(Token)match(input,NAME,FOLLOW_NAME_in_synpred111_AkinParser2453); if (state.failed) return ;
                match(input,INCREMENTING,FOLLOW_INCREMENTING_in_synpred111_AkinParser2455); if (state.failed) return ;
                match(input,BY,FOLLOW_BY_in_synpred111_AkinParser2457); if (state.failed) return ;
                increment=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_synpred111_AkinParser2461); if (state.failed) return ;
                // AkinParser.g:252:7: ( COMMA )?
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==COMMA) ) {
                    alt89=1;
                }
                switch (alt89) {
                    case 1 :
                        // AkinParser.g:0:0: COMMA
                        {
                        match(input,COMMA,FOLLOW_COMMA_in_synpred111_AkinParser2472); if (state.failed) return ;

                        }
                        break;

                }

                // AkinParser.g:252:14: ( STARTING )?
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==STARTING) ) {
                    alt90=1;
                }
                switch (alt90) {
                    case 1 :
                        // AkinParser.g:0:0: STARTING
                        {
                        match(input,STARTING,FOLLOW_STARTING_in_synpred111_AkinParser2475); if (state.failed) return ;

                        }
                        break;

                }

                match(input,FROM,FOLLOW_FROM_in_synpred111_AkinParser2478); if (state.failed) return ;
                start=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_synpred111_AkinParser2482); if (state.failed) return ;
                // AkinParser.g:252:43: ( terminator )?
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( ((LA91_0>=SEMICOLON && LA91_0<=COLON)||LA91_0==COMMA||LA91_0==NEWLINE) ) {
                    alt91=1;
                }
                switch (alt91) {
                    case 1 :
                        // AkinParser.g:0:0: terminator
                        {
                        pushFollow(FOLLOW_terminator_in_synpred111_AkinParser2484);
                        terminator();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                }
                break;

        }

        pushFollow(FOLLOW_expressions_in_synpred111_AkinParser2510);
        body=expressions();

        state._fsp--;
        if (state.failed) return ;
        match(input,END,FOLLOW_END_in_synpred111_AkinParser2516); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred111_AkinParser

    // Delegated rules

    public final boolean synpred3_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred111_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred111_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred81_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred106_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred99_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred99_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred90_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred90_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_AkinParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_AkinParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA65 dfa65 = new DFA65(this);
    protected DFA78 dfa78 = new DFA78(this);
    static final String DFA7_eotS =
        "\36\uffff";
    static final String DFA7_eofS =
        "\36\uffff";
    static final String DFA7_minS =
        "\1\10\33\0\2\uffff";
    static final String DFA7_maxS =
        "\1\146\33\0\2\uffff";
    static final String DFA7_acceptS =
        "\34\uffff\1\1\1\2";
    static final String DFA7_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\2\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\22\2\uffff\1\23\1\32\2\uffff\1\14\1\5\1\6\1\7\1\uffff\1\21"+
            "\5\uffff\1\20\2\uffff\1\12\5\uffff\1\17\2\uffff\1\26\1\uffff"+
            "\1\27\1\31\1\30\2\uffff\1\13\2\uffff\1\20\1\uffff\1\25\1\20"+
            "\12\uffff\1\16\5\uffff\1\24\1\23\1\uffff\1\3\1\4\2\uffff\1\2"+
            "\2\uffff\1\15\1\uffff\1\10\5\uffff\1\33\1\uffff\1\11\15\uffff"+
            "\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "86:1: orExpression returns [Node node] : (receiver= andExpression ( OR | ORE ) arg= orExpression | e= andExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_1 = input.LA(1);

                         
                        int index7_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_3 = input.LA(1);

                         
                        int index7_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_4 = input.LA(1);

                         
                        int index7_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA7_6 = input.LA(1);

                         
                        int index7_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA7_7 = input.LA(1);

                         
                        int index7_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA7_8 = input.LA(1);

                         
                        int index7_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA7_9 = input.LA(1);

                         
                        int index7_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA7_10 = input.LA(1);

                         
                        int index7_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA7_11 = input.LA(1);

                         
                        int index7_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA7_12 = input.LA(1);

                         
                        int index7_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA7_13 = input.LA(1);

                         
                        int index7_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA7_14 = input.LA(1);

                         
                        int index7_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA7_15 = input.LA(1);

                         
                        int index7_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA7_16 = input.LA(1);

                         
                        int index7_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA7_17 = input.LA(1);

                         
                        int index7_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA7_18 = input.LA(1);

                         
                        int index7_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA7_19 = input.LA(1);

                         
                        int index7_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA7_20 = input.LA(1);

                         
                        int index7_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA7_21 = input.LA(1);

                         
                        int index7_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA7_22 = input.LA(1);

                         
                        int index7_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA7_23 = input.LA(1);

                         
                        int index7_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA7_24 = input.LA(1);

                         
                        int index7_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA7_25 = input.LA(1);

                         
                        int index7_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA7_26 = input.LA(1);

                         
                        int index7_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA7_27 = input.LA(1);

                         
                        int index7_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred11_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index7_27);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA8_eotS =
        "\36\uffff";
    static final String DFA8_eofS =
        "\36\uffff";
    static final String DFA8_minS =
        "\1\10\33\0\2\uffff";
    static final String DFA8_maxS =
        "\1\146\33\0\2\uffff";
    static final String DFA8_acceptS =
        "\34\uffff\1\1\1\2";
    static final String DFA8_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\2\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\22\2\uffff\1\23\1\32\2\uffff\1\14\1\5\1\6\1\7\1\uffff\1\21"+
            "\5\uffff\1\20\2\uffff\1\12\5\uffff\1\17\2\uffff\1\26\1\uffff"+
            "\1\27\1\31\1\30\2\uffff\1\13\2\uffff\1\20\1\uffff\1\25\1\20"+
            "\12\uffff\1\16\5\uffff\1\24\1\23\1\uffff\1\3\1\4\2\uffff\1\2"+
            "\2\uffff\1\15\1\uffff\1\10\5\uffff\1\33\1\uffff\1\11\15\uffff"+
            "\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "92:1: andExpression returns [Node node] : (receiver= relationalExpression ( AND | ANDE ) arg= andExpression | e= relationalExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_1 = input.LA(1);

                         
                        int index8_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_5 = input.LA(1);

                         
                        int index8_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA8_8 = input.LA(1);

                         
                        int index8_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA8_9 = input.LA(1);

                         
                        int index8_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA8_10 = input.LA(1);

                         
                        int index8_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA8_11 = input.LA(1);

                         
                        int index8_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA8_12 = input.LA(1);

                         
                        int index8_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA8_13 = input.LA(1);

                         
                        int index8_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA8_14 = input.LA(1);

                         
                        int index8_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA8_15 = input.LA(1);

                         
                        int index8_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA8_16 = input.LA(1);

                         
                        int index8_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA8_17 = input.LA(1);

                         
                        int index8_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA8_18 = input.LA(1);

                         
                        int index8_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA8_19 = input.LA(1);

                         
                        int index8_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA8_20 = input.LA(1);

                         
                        int index8_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA8_21 = input.LA(1);

                         
                        int index8_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA8_22 = input.LA(1);

                         
                        int index8_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA8_23 = input.LA(1);

                         
                        int index8_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA8_24 = input.LA(1);

                         
                        int index8_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA8_25 = input.LA(1);

                         
                        int index8_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA8_26 = input.LA(1);

                         
                        int index8_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA8_27 = input.LA(1);

                         
                        int index8_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index8_27);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA9_eotS =
        "\36\uffff";
    static final String DFA9_eofS =
        "\36\uffff";
    static final String DFA9_minS =
        "\1\10\33\0\2\uffff";
    static final String DFA9_maxS =
        "\1\146\33\0\2\uffff";
    static final String DFA9_acceptS =
        "\34\uffff\1\1\1\2";
    static final String DFA9_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\2\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\22\2\uffff\1\23\1\32\2\uffff\1\14\1\5\1\6\1\7\1\uffff\1\21"+
            "\5\uffff\1\20\2\uffff\1\12\5\uffff\1\17\2\uffff\1\26\1\uffff"+
            "\1\27\1\31\1\30\2\uffff\1\13\2\uffff\1\20\1\uffff\1\25\1\20"+
            "\12\uffff\1\16\5\uffff\1\24\1\23\1\uffff\1\3\1\4\2\uffff\1\2"+
            "\2\uffff\1\15\1\uffff\1\10\5\uffff\1\33\1\uffff\1\11\15\uffff"+
            "\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "98:1: relationalExpression returns [Node node] : (receiver= additiveExpression op= ( EQ | LE | GE | LT | GT | GTT | LTT | ETT | NE ) arg= relationalExpression | e= additiveExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA9_9 = input.LA(1);

                         
                        int index9_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA9_10 = input.LA(1);

                         
                        int index9_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA9_11 = input.LA(1);

                         
                        int index9_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA9_12 = input.LA(1);

                         
                        int index9_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA9_13 = input.LA(1);

                         
                        int index9_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA9_14 = input.LA(1);

                         
                        int index9_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA9_15 = input.LA(1);

                         
                        int index9_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA9_16 = input.LA(1);

                         
                        int index9_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA9_17 = input.LA(1);

                         
                        int index9_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA9_18 = input.LA(1);

                         
                        int index9_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA9_19 = input.LA(1);

                         
                        int index9_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA9_20 = input.LA(1);

                         
                        int index9_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA9_21 = input.LA(1);

                         
                        int index9_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA9_22 = input.LA(1);

                         
                        int index9_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA9_23 = input.LA(1);

                         
                        int index9_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA9_24 = input.LA(1);

                         
                        int index9_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA9_25 = input.LA(1);

                         
                        int index9_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA9_26 = input.LA(1);

                         
                        int index9_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA9_27 = input.LA(1);

                         
                        int index9_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index9_27);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA10_eotS =
        "\36\uffff";
    static final String DFA10_eofS =
        "\36\uffff";
    static final String DFA10_minS =
        "\1\10\33\0\2\uffff";
    static final String DFA10_maxS =
        "\1\146\33\0\2\uffff";
    static final String DFA10_acceptS =
        "\34\uffff\1\1\1\2";
    static final String DFA10_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\2\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\22\2\uffff\1\23\1\32\2\uffff\1\14\1\5\1\6\1\7\1\uffff\1\21"+
            "\5\uffff\1\20\2\uffff\1\12\5\uffff\1\17\2\uffff\1\26\1\uffff"+
            "\1\27\1\31\1\30\2\uffff\1\13\2\uffff\1\20\1\uffff\1\25\1\20"+
            "\12\uffff\1\16\5\uffff\1\24\1\23\1\uffff\1\3\1\4\2\uffff\1\2"+
            "\2\uffff\1\15\1\uffff\1\10\5\uffff\1\33\1\uffff\1\11\15\uffff"+
            "\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "105:1: additiveExpression returns [Node node] : (receiver= multiplicativeExpression op= ( PLUS | MINUS ) arg= additiveExpression | e= multiplicativeExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_1 = input.LA(1);

                         
                        int index10_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_7 = input.LA(1);

                         
                        int index10_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA10_8 = input.LA(1);

                         
                        int index10_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA10_9 = input.LA(1);

                         
                        int index10_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA10_10 = input.LA(1);

                         
                        int index10_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA10_11 = input.LA(1);

                         
                        int index10_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA10_12 = input.LA(1);

                         
                        int index10_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA10_13 = input.LA(1);

                         
                        int index10_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA10_14 = input.LA(1);

                         
                        int index10_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA10_15 = input.LA(1);

                         
                        int index10_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA10_16 = input.LA(1);

                         
                        int index10_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA10_17 = input.LA(1);

                         
                        int index10_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA10_18 = input.LA(1);

                         
                        int index10_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA10_19 = input.LA(1);

                         
                        int index10_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA10_20 = input.LA(1);

                         
                        int index10_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA10_21 = input.LA(1);

                         
                        int index10_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA10_22 = input.LA(1);

                         
                        int index10_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA10_23 = input.LA(1);

                         
                        int index10_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA10_24 = input.LA(1);

                         
                        int index10_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA10_25 = input.LA(1);

                         
                        int index10_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA10_26 = input.LA(1);

                         
                        int index10_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA10_27 = input.LA(1);

                         
                        int index10_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index10_27);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA11_eotS =
        "\36\uffff";
    static final String DFA11_eofS =
        "\36\uffff";
    static final String DFA11_minS =
        "\1\10\33\0\2\uffff";
    static final String DFA11_maxS =
        "\1\146\33\0\2\uffff";
    static final String DFA11_acceptS =
        "\34\uffff\1\1\1\2";
    static final String DFA11_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\2\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\22\2\uffff\1\23\1\32\2\uffff\1\14\1\5\1\6\1\7\1\uffff\1\21"+
            "\5\uffff\1\20\2\uffff\1\12\5\uffff\1\17\2\uffff\1\26\1\uffff"+
            "\1\27\1\31\1\30\2\uffff\1\13\2\uffff\1\20\1\uffff\1\25\1\20"+
            "\12\uffff\1\16\5\uffff\1\24\1\23\1\uffff\1\3\1\4\2\uffff\1\2"+
            "\2\uffff\1\15\1\uffff\1\10\5\uffff\1\33\1\uffff\1\11\15\uffff"+
            "\1\1",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "111:1: multiplicativeExpression returns [Node node] : (receiver= unaryExpression op= ( MUL | DIV | MOD ) arg= multiplicativeExpression | e= unaryExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA11_10 = input.LA(1);

                         
                        int index11_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA11_11 = input.LA(1);

                         
                        int index11_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA11_12 = input.LA(1);

                         
                        int index11_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA11_13 = input.LA(1);

                         
                        int index11_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA11_14 = input.LA(1);

                         
                        int index11_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA11_15 = input.LA(1);

                         
                        int index11_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA11_16 = input.LA(1);

                         
                        int index11_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA11_17 = input.LA(1);

                         
                        int index11_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA11_18 = input.LA(1);

                         
                        int index11_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA11_19 = input.LA(1);

                         
                        int index11_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA11_20 = input.LA(1);

                         
                        int index11_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA11_21 = input.LA(1);

                         
                        int index11_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA11_22 = input.LA(1);

                         
                        int index11_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA11_23 = input.LA(1);

                         
                        int index11_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA11_24 = input.LA(1);

                         
                        int index11_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA11_25 = input.LA(1);

                         
                        int index11_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA11_26 = input.LA(1);

                         
                        int index11_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA11_27 = input.LA(1);

                         
                        int index11_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_AkinParser()) ) {s = 28;}

                        else if ( (true) ) {s = 29;}

                         
                        input.seek(index11_27);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA13_eotS =
        "\42\uffff";
    static final String DFA13_eofS =
        "\1\uffff\7\26\3\uffff\1\26\11\uffff\1\26\1\uffff\1\26\6\uffff\4"+
        "\26";
    static final String DFA13_minS =
        "\1\10\7\4\2\116\1\34\1\4\5\uffff\1\13\3\uffff\1\4\1\uffff\1\4\1"+
        "\26\1\24\2\uffff\1\55\1\116\4\4";
    static final String DFA13_maxS =
        "\1\130\7\150\2\116\1\156\1\150\5\uffff\1\107\3\uffff\1\150\1\uffff"+
        "\1\150\1\26\1\24\2\uffff\1\55\1\116\4\150";
    static final String DFA13_acceptS =
        "\14\uffff\1\2\1\3\1\4\1\5\1\6\1\uffff\1\11\1\12\1\13\1\uffff\1\1"+
        "\3\uffff\1\7\1\10\6\uffff";
    static final String DFA13_specialS =
        "\42\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\17\2\uffff\1\20\1\23\2\uffff\1\13\1\4\1\5\1\6\1\uffff\1\16"+
            "\5\uffff\1\15\2\uffff\1\11\5\uffff\1\14\2\uffff\1\22\1\uffff"+
            "\3\22\2\uffff\1\12\2\uffff\1\15\1\uffff\1\21\1\15\12\uffff\1"+
            "\14\5\uffff\2\20\1\uffff\1\2\1\3\2\uffff\1\1\2\uffff\1\14\1"+
            "\uffff\1\7\5\uffff\1\24\1\uffff\1\10",
            "\2\26\2\uffff\1\26\1\uffff\1\26\2\uffff\2\26\20\uffff\3\26"+
            "\23\uffff\1\26\34\uffff\2\26\1\25\1\26\1\uffff\1\26\1\uffff"+
            "\15\26\2\uffff\1\26",
            "\2\26\2\uffff\1\26\1\uffff\1\26\2\uffff\2\26\20\uffff\3\26"+
            "\23\uffff\1\26\34\uffff\2\26\1\25\1\26\1\uffff\1\26\1\uffff"+
            "\15\26\2\uffff\1\26",
            "\2\26\2\uffff\1\26\1\uffff\1\26\2\uffff\2\26\20\uffff\3\26"+
            "\23\uffff\1\26\34\uffff\2\26\1\25\1\26\1\uffff\1\26\1\uffff"+
            "\15\26\2\uffff\1\26",
            "\2\26\2\uffff\1\26\1\uffff\1\26\2\uffff\2\26\20\uffff\3\26"+
            "\23\uffff\1\26\34\uffff\2\26\1\25\1\26\1\uffff\1\26\1\uffff"+
            "\15\26\2\uffff\1\26",
            "\2\26\2\uffff\1\26\1\uffff\1\26\2\uffff\2\26\20\uffff\3\26"+
            "\23\uffff\1\26\34\uffff\2\26\1\25\1\26\1\uffff\1\26\1\uffff"+
            "\15\26\2\uffff\1\26",
            "\2\26\2\uffff\1\26\1\uffff\1\26\2\uffff\2\26\20\uffff\3\26"+
            "\23\uffff\1\26\34\uffff\2\26\1\25\1\26\1\uffff\1\26\1\uffff"+
            "\15\26\2\uffff\1\26",
            "\2\26\2\uffff\1\26\1\uffff\1\26\2\uffff\2\26\20\uffff\3\26"+
            "\1\16\22\uffff\1\26\34\uffff\2\26\1\25\1\26\1\uffff\1\26\1\uffff"+
            "\15\26\2\uffff\1\26",
            "\1\27",
            "\1\30",
            "\1\15\42\uffff\1\15\3\uffff\1\15\12\uffff\1\15\37\uffff\1\31",
            "\2\26\2\uffff\1\26\1\uffff\1\26\2\uffff\2\26\20\uffff\3\26"+
            "\23\uffff\1\26\34\uffff\2\26\1\25\1\26\1\uffff\1\26\1\uffff"+
            "\15\26\2\uffff\1\26",
            "",
            "",
            "",
            "",
            "",
            "\1\32\50\uffff\1\33\22\uffff\1\33",
            "",
            "",
            "",
            "\2\26\2\uffff\1\26\1\uffff\1\26\2\uffff\2\26\20\uffff\3\26"+
            "\23\uffff\1\26\10\uffff\1\14\17\uffff\1\14\3\uffff\4\26\1\uffff"+
            "\1\26\1\uffff\15\26\2\uffff\1\26",
            "",
            "\2\26\2\uffff\1\26\1\uffff\1\26\2\uffff\2\26\20\uffff\3\26"+
            "\23\uffff\1\26\34\uffff\2\26\1\25\1\26\1\uffff\1\26\1\uffff"+
            "\15\26\2\uffff\1\26",
            "\1\34",
            "\1\35",
            "",
            "",
            "\1\36",
            "\1\37",
            "\2\26\2\uffff\1\26\1\uffff\1\26\2\uffff\2\26\20\uffff\3\26"+
            "\23\uffff\1\26\34\uffff\2\26\1\25\1\26\1\uffff\1\26\1\uffff"+
            "\15\26\2\uffff\1\26",
            "\2\26\2\uffff\1\26\1\uffff\1\26\2\uffff\2\26\20\uffff\3\26"+
            "\23\uffff\1\26\34\uffff\2\41\1\25\1\40\1\uffff\1\26\1\uffff"+
            "\15\26\2\uffff\1\41",
            "\2\26\2\uffff\1\26\1\uffff\11\26\1\uffff\1\26\5\uffff\1\26"+
            "\2\uffff\1\26\1\uffff\3\26\1\uffff\1\26\2\uffff\1\26\1\uffff"+
            "\3\26\2\uffff\1\26\2\uffff\1\26\1\uffff\2\26\1\uffff\1\26\10"+
            "\uffff\1\26\5\uffff\2\26\1\uffff\2\26\2\uffff\1\26\2\uffff\1"+
            "\26\1\uffff\1\26\1\uffff\2\41\1\25\1\40\21\26\1\uffff\1\41",
            "\2\26\2\uffff\1\26\1\uffff\11\26\1\uffff\1\26\5\uffff\1\26"+
            "\2\uffff\1\26\1\uffff\3\26\1\uffff\1\26\2\uffff\1\26\1\uffff"+
            "\3\26\2\uffff\1\26\2\uffff\1\26\1\uffff\2\26\1\uffff\1\26\10"+
            "\uffff\1\26\5\uffff\2\26\1\uffff\2\26\2\uffff\1\26\2\uffff\1"+
            "\26\1\uffff\1\26\1\uffff\2\41\1\25\1\40\21\26\1\uffff\1\41"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "123:1: primaryExpression returns [Node node] : ( literal | call | methodDefinition | classDefinition | ifBlock | whileBlock | doWhileBlock | forBlock | calcBlock | tryBlock | OPEN_PARENT expression CLOSE_PARENT );";
        }
    }
    static final String DFA25_eotS =
        "\14\uffff";
    static final String DFA25_eofS =
        "\1\uffff\1\4\3\uffff\1\11\6\uffff";
    static final String DFA25_minS =
        "\1\76\1\4\1\116\1\10\1\uffff\1\4\2\uffff\1\10\3\uffff";
    static final String DFA25_maxS =
        "\1\116\1\150\1\116\1\146\1\uffff\1\150\2\uffff\1\146\3\uffff";
    static final String DFA25_acceptS =
        "\4\uffff\1\1\1\uffff\1\2\1\3\1\uffff\1\4\1\5\1\6";
    static final String DFA25_specialS =
        "\14\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\2\17\uffff\1\1",
            "\2\4\2\uffff\1\4\1\uffff\1\4\2\uffff\2\4\20\uffff\3\4\23\uffff"+
            "\1\4\10\uffff\1\4\17\uffff\1\4\3\uffff\4\4\1\3\1\4\1\uffff\15"+
            "\4\2\uffff\1\4",
            "\1\5",
            "\1\7\2\uffff\2\7\2\uffff\4\7\1\uffff\1\7\5\uffff\1\7\2\uffff"+
            "\1\7\5\uffff\1\7\2\uffff\1\7\1\uffff\3\7\2\uffff\1\7\2\uffff"+
            "\1\7\1\uffff\2\7\12\uffff\1\7\5\uffff\2\7\1\uffff\2\7\2\uffff"+
            "\1\7\2\uffff\1\7\1\uffff\1\7\5\uffff\1\7\1\6\1\7\15\uffff\1"+
            "\7",
            "",
            "\2\11\2\uffff\1\11\1\uffff\1\11\2\uffff\2\11\20\uffff\3\11"+
            "\23\uffff\1\11\10\uffff\1\11\17\uffff\1\11\3\uffff\4\11\1\10"+
            "\1\11\1\uffff\15\11\2\uffff\1\11",
            "",
            "",
            "\1\13\2\uffff\2\13\2\uffff\4\13\1\uffff\1\13\5\uffff\1\13\2"+
            "\uffff\1\13\5\uffff\1\13\2\uffff\1\13\1\uffff\3\13\2\uffff\1"+
            "\13\2\uffff\1\13\1\uffff\2\13\12\uffff\1\13\5\uffff\2\13\1\uffff"+
            "\2\13\2\uffff\1\13\2\uffff\1\13\1\uffff\1\13\5\uffff\1\13\1"+
            "\12\1\13\15\uffff\1\13",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "178:1: message returns [CallNode node] : ( NAME | NAME OPEN_PARENT CLOSE_PARENT | NAME OPEN_PARENT arguments CLOSE_PARENT | MAKETHECOMPUTER NAME ( END )? | MAKETHECOMPUTER NAME OPEN_PARENT CLOSE_PARENT ( END )? | MAKETHECOMPUTER NAME OPEN_PARENT arguments CLOSE_PARENT ( END )? );";
        }
    }
    static final String DFA34_eotS =
        "\41\uffff";
    static final String DFA34_eofS =
        "\41\uffff";
    static final String DFA34_minS =
        "\1\10\1\0\37\uffff";
    static final String DFA34_maxS =
        "\1\150\1\0\37\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\35\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\37\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\2\2\uffff\2\2\2\uffff\4\2\1\uffff\1\2\5\uffff\2\2\1\uffff"+
            "\1\2\5\uffff\1\2\2\uffff\1\2\1\uffff\3\2\2\uffff\2\2\1\uffff"+
            "\1\2\1\uffff\2\2\7\uffff\1\2\2\uffff\1\2\5\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\1\2\1\1\1\uffff\1\2\15\uffff\1\2\1\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "213:64: ( OPEN_PARENT ( parameters )? CLOSE_PARENT )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_AkinParser()) ) {s = 32;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA42_eotS =
        "\42\uffff";
    static final String DFA42_eofS =
        "\42\uffff";
    static final String DFA42_minS =
        "\1\10\1\0\40\uffff";
    static final String DFA42_maxS =
        "\1\150\1\0\40\uffff";
    static final String DFA42_acceptS =
        "\2\uffff\1\2\36\uffff\1\1";
    static final String DFA42_specialS =
        "\1\uffff\1\0\40\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\2\2\uffff\2\2\2\uffff\4\2\1\uffff\1\2\5\uffff\2\2\1\uffff"+
            "\1\2\5\uffff\1\2\2\uffff\1\2\1\uffff\3\2\2\uffff\2\2\1\uffff"+
            "\1\2\1\uffff\2\2\7\uffff\1\2\2\uffff\1\2\5\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\1\2\1\1\2\2\15\uffff\1\2\1\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "216:53: ( OPEN_PARENT )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_1 = input.LA(1);

                         
                        int index42_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_AkinParser()) ) {s = 33;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index42_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\21\uffff";
    static final String DFA65_eofS =
        "\21\uffff";
    static final String DFA65_minS =
        "\1\46\2\107\2\116\4\uffff\2\73\2\107\4\uffff";
    static final String DFA65_maxS =
        "\1\52\2\110\2\116\4\uffff\2\73\2\110\4\uffff";
    static final String DFA65_acceptS =
        "\5\uffff\1\1\1\5\1\2\1\6\4\uffff\1\3\1\7\1\4\1\10";
    static final String DFA65_specialS =
        "\21\uffff}>";
    static final String[] DFA65_transitionS = {
            "\1\1\1\uffff\1\2\1\4\1\3",
            "\1\5\1\6",
            "\1\7\1\10",
            "\1\11",
            "\1\12",
            "",
            "",
            "",
            "",
            "\1\13",
            "\1\14",
            "\1\15\1\16",
            "\1\17\1\20",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "284:1: calcBlock returns [CalcNode node] : ( EADD num= INTEGER TO name= NAME | ESUBTRACT num= INTEGER FROM name= NAME | EDIVIDE name= NAME BY num= INTEGER | EMULTIPLY name= NAME BY num= INTEGER | EADD num= FLOAT TO name= NAME | ESUBTRACT num= FLOAT FROM name= NAME | EDIVIDE name= NAME BY num= FLOAT | EMULTIPLY name= NAME BY num= FLOAT );";
        }
    }
    static final String DFA78_eotS =
        "\41\uffff";
    static final String DFA78_eofS =
        "\41\uffff";
    static final String DFA78_minS =
        "\1\10\1\0\37\uffff";
    static final String DFA78_maxS =
        "\1\150\1\0\37\uffff";
    static final String DFA78_acceptS =
        "\2\uffff\1\2\35\uffff\1\1";
    static final String DFA78_specialS =
        "\1\uffff\1\0\37\uffff}>";
    static final String[] DFA78_transitionS = {
            "\1\2\2\uffff\2\2\2\uffff\4\2\1\uffff\1\2\5\uffff\2\2\1\uffff"+
            "\1\2\5\uffff\1\2\2\uffff\1\2\1\uffff\3\2\2\uffff\2\2\1\uffff"+
            "\1\2\1\uffff\2\2\7\uffff\1\2\2\uffff\1\2\5\uffff\2\2\1\uffff"+
            "\2\2\2\uffff\1\2\2\uffff\1\2\1\uffff\1\2\1\uffff\2\2\1\uffff"+
            "\1\2\1\1\1\uffff\1\2\15\uffff\1\2\1\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
    static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
    static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
    static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
    static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
    static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
    static final short[][] DFA78_transition;

    static {
        int numStates = DFA78_transitionS.length;
        DFA78_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
        }
    }

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = DFA78_eot;
            this.eof = DFA78_eof;
            this.min = DFA78_min;
            this.max = DFA78_max;
            this.accept = DFA78_accept;
            this.special = DFA78_special;
            this.transition = DFA78_transition;
        }
        public String getDescription() {
            return "213:64: ( OPEN_PARENT ( parameters )? CLOSE_PARENT )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA78_1 = input.LA(1);

                         
                        int index78_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_AkinParser()) ) {s = 32;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index78_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 78, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_terminator_in_root77 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expressions_in_root80 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_root83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressions131 = new BitSet(new long[]{0x0000000000000002L,0x00000100002C0000L});
    public static final BitSet FOLLOW_terminator_in_expressions142 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expression_in_expressions151 = new BitSet(new long[]{0x0000000000000002L,0x00000100002C0000L});
    public static final BitSet FOLLOW_terminator_in_expressions167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignExpression_in_expression187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_terminator205 = new BitSet(new long[]{0x0000000000000002L,0x00000100002C0000L});
    public static final BitSet FOLLOW_assign_in_assignExpression239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpression_in_assignExpression264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression292 = new BitSet(new long[]{0x0000000000000010L,0x0000002000000000L});
    public static final BitSet FOLLOW_set_in_orExpression300 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_orExpression_in_orExpression308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_andExpression358 = new BitSet(new long[]{0x0000000000000020L,0x0000001000000000L});
    public static final BitSet FOLLOW_set_in_andExpression366 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_andExpression_in_andExpression374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_andExpression388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression415 = new BitSet(new long[]{0x0000000380000000L,0x000000007E000000L});
    public static final BitSet FOLLOW_set_in_relationalExpression426 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_relationalExpression_in_relationalExpression455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression495 = new BitSet(new long[]{0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_set_in_additiveExpression505 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_additiveExpression_in_additiveExpression513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression561 = new BitSet(new long[]{0x0000000000000000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression571 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_multiplicativeExpression581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryExpression643 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_unaryExpression663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_in_primaryExpression717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodDefinition_in_primaryExpression738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classDefinition_in_primaryExpression747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifBlock_in_primaryExpression757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileBlock_in_primaryExpression775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doWhileBlock_in_primaryExpression790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forBlock_in_primaryExpression803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_calcBlock_in_primaryExpression820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryBlock_in_primaryExpression836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_primaryExpression853 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expression_in_primaryExpression861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_primaryExpression867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_literal912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NIL_in_literal950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_literal972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_literal993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_literal1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceVariable_in_literal1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_self_in_literal1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELF_in_self1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_instanceVariable1107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_instanceVariable1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THE_in_instanceVariable1127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_instanceVariable1129 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_OF_in_instanceVariable1131 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_THIS_in_instanceVariable1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_instanceVariable1142 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_HAS_in_instanceVariable1144 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_A_in_instanceVariable1146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_instanceVariable1148 = new BitSet(new long[]{0x0000000000000002L,0x00000100002C0000L});
    public static final BitSet FOLLOW_terminator_in_instanceVariable1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_call1174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_call1176 = new BitSet(new long[]{0x4000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_message_in_call1215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_call1217 = new BitSet(new long[]{0x4000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_message_in_call1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAKE_in_call1278 = new BitSet(new long[]{0x0000200020078000L,0x0000000001010980L});
    public static final BitSet FOLLOW_literal_in_call1285 = new BitSet(new long[]{0x4000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_message_in_call1318 = new BitSet(new long[]{0x4000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_message_in_call1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_message1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_message1421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_message1423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_message1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_message1435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_message1437 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_arguments_in_message1450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_message1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAKETHECOMPUTER_in_message1484 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_message1486 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_END_in_message1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAKETHECOMPUTER_in_message1507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_message1509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_message1511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_message1513 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_END_in_message1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAKETHECOMPUTER_in_message1524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_message1526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_message1528 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_arguments_in_message1558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_message1586 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_END_in_message1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_arguments1650 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_arguments1675 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expression_in_arguments1684 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_CONSTANT_in_constant1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_assign1771 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assign1773 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expression_in_assign1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTANT_in_assign1792 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assign1794 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expression_in_assign1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_assign1809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_assign1811 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ASSIGN_in_assign1813 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expression_in_assign1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_methodDefinition1841 = new BitSet(new long[]{0x8000000010000000L,0x0000000000004008L});
    public static final BitSet FOLLOW_CAN_in_methodDefinition1852 = new BitSet(new long[]{0x8002000000000000L,0x0000000000004008L});
    public static final BitSet FOLLOW_ALSO_in_methodDefinition1855 = new BitSet(new long[]{0x8000000000000000L,0x0000000000004008L});
    public static final BitSet FOLLOW_GET_in_methodDefinition1861 = new BitSet(new long[]{0x8000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_CALCULATE_in_methodDefinition1864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_methodDefinition1867 = new BitSet(new long[]{0x481D67482C179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_WITH_in_methodDefinition1869 = new BitSet(new long[]{0x480D67482C179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_methodDefinition1873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000804000L});
    public static final BitSet FOLLOW_parameters_in_methodDefinition1875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_methodDefinition1878 = new BitSet(new long[]{0x480D67482C179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_BY_in_methodDefinition1882 = new BitSet(new long[]{0x400D67482C179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_WHICHISTO_in_methodDefinition1886 = new BitSet(new long[]{0x400D67482C179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_ISTO_in_methodDefinition1888 = new BitSet(new long[]{0x400D67482C179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_terminator_in_methodDefinition1890 = new BitSet(new long[]{0x400D67482C179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_expressions_in_methodDefinition1901 = new BitSet(new long[]{0x0020000000004000L});
    public static final BitSet FOLLOW_THEN_in_methodDefinition1907 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_END_in_methodDefinition1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_methodDefinition1938 = new BitSet(new long[]{0x0000000010000000L,0x0000000000004008L});
    public static final BitSet FOLLOW_CAN_in_methodDefinition1949 = new BitSet(new long[]{0x0002000000000000L,0x0000000000004008L});
    public static final BitSet FOLLOW_ALSO_in_methodDefinition1952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004008L});
    public static final BitSet FOLLOW_GET_in_methodDefinition1958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_methodDefinition1961 = new BitSet(new long[]{0x481D67482C179900L,0x0000014001ED49B0L});
    public static final BitSet FOLLOW_WITH_in_methodDefinition1963 = new BitSet(new long[]{0x480D67482C179900L,0x0000014001ED49B0L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_methodDefinition1966 = new BitSet(new long[]{0x480D67482C179900L,0x0000014001ED49B0L});
    public static final BitSet FOLLOW_parameters_in_methodDefinition1969 = new BitSet(new long[]{0x480D67482C179900L,0x0000014001ED49B0L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_methodDefinition1972 = new BitSet(new long[]{0x480D67482C179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_BY_in_methodDefinition1976 = new BitSet(new long[]{0x480D67482C179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_WHICHISTO_in_methodDefinition1978 = new BitSet(new long[]{0x480D67482C179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_ISTO_in_methodDefinition1980 = new BitSet(new long[]{0x480D67482C179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_terminator_in_methodDefinition1982 = new BitSet(new long[]{0x480D67482C179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_expressions_in_methodDefinition1993 = new BitSet(new long[]{0x0020000000004002L});
    public static final BitSet FOLLOW_THEN_in_methodDefinition1999 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_END_in_methodDefinition2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_parameters2080 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_parameters2111 = new BitSet(new long[]{0x0000000000000020L,0x0000000000004000L});
    public static final BitSet FOLLOW_ANDE_in_parameters2114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_parameters2125 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_A_in_classDefinition2174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_CONSTANT_in_classDefinition2179 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ISATYPEOF_in_classDefinition2181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_CONSTANT_in_classDefinition2185 = new BitSet(new long[]{0x400D274824179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_terminator_in_classDefinition2187 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expressions_in_classDefinition2196 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_END_in_classDefinition2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifBlock2250 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expression_in_ifBlock2254 = new BitSet(new long[]{0x0000000000000000L,0x00000100002C0000L});
    public static final BitSet FOLLOW_terminator_in_ifBlock2256 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expressions_in_ifBlock2266 = new BitSet(new long[]{0x0000000000004500L,0x0000000000100000L});
    public static final BitSet FOLLOW_ELSE_in_ifBlock2274 = new BitSet(new long[]{0x0000000000000000L,0x00000100002C0000L});
    public static final BitSet FOLLOW_IF_in_ifBlock2276 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NOTE_in_ifBlock2278 = new BitSet(new long[]{0x0000000000000000L,0x00000100002C0000L});
    public static final BitSet FOLLOW_terminator_in_ifBlock2281 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expressions_in_ifBlock2291 = new BitSet(new long[]{0x0000000000004000L,0x0000000000100000L});
    public static final BitSet FOLLOW_set_in_ifBlock2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTHEFOLLOWING_in_forBlock2356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INTEGER_in_forBlock2358 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_TIMES_in_forBlock2360 = new BitSet(new long[]{0x400D274824179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_terminator_in_forBlock2362 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expressions_in_forBlock2373 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_END_in_forBlock2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTHEFOLLOWING_in_forBlock2423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INTEGER_in_forBlock2427 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_TIMES_in_forBlock2429 = new BitSet(new long[]{0x401D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_WITH_in_forBlock2449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_forBlock2453 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_INCREMENTING_in_forBlock2455 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_BY_in_forBlock2457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INTEGER_in_forBlock2461 = new BitSet(new long[]{0x3000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_forBlock2472 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_STARTING_in_forBlock2475 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_FROM_in_forBlock2478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INTEGER_in_forBlock2482 = new BitSet(new long[]{0x400D274824179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_terminator_in_forBlock2484 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expressions_in_forBlock2510 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_END_in_forBlock2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTHEFOLLOWING_in_forBlock2552 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_WITH_in_forBlock2554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_forBlock2558 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_INCREMENTING_in_forBlock2560 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_BY_in_forBlock2562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INTEGER_in_forBlock2566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_UNTIL_in_forBlock2568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INTEGER_in_forBlock2572 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_STARTING_in_forBlock2574 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_FROM_in_forBlock2577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INTEGER_in_forBlock2581 = new BitSet(new long[]{0x400D274824179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_terminator_in_forBlock2583 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expressions_in_forBlock2606 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_END_in_forBlock2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_whileBlock2661 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expression_in_whileBlock2669 = new BitSet(new long[]{0x0000000000000000L,0x00000100002C0000L});
    public static final BitSet FOLLOW_terminator_in_whileBlock2671 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expressions_in_whileBlock2681 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_END_in_whileBlock2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEEPDOINGTHEFOLLOWING_in_whileBlock2725 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expression_in_whileBlock2729 = new BitSet(new long[]{0x0000000000000000L,0x00000100002C0000L});
    public static final BitSet FOLLOW_terminator_in_whileBlock2731 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expressions_in_whileBlock2741 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_END_in_whileBlock2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTHEFOLLOWING_in_doWhileBlock2797 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_WHILE_in_doWhileBlock2799 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expression_in_doWhileBlock2803 = new BitSet(new long[]{0x0000000000000000L,0x00000100002C0000L});
    public static final BitSet FOLLOW_terminator_in_doWhileBlock2805 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expressions_in_doWhileBlock2814 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_END_in_doWhileBlock2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryBlock2866 = new BitSet(new long[]{0x0000000000000000L,0x00000100002C0000L});
    public static final BitSet FOLLOW_terminator_in_tryBlock2868 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expressions_in_tryBlock2878 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_CATCH_in_tryBlock2905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_CONSTANT_in_tryBlock2907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_COLON_in_tryBlock2909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_tryBlock2911 = new BitSet(new long[]{0x0000000000000000L,0x00000100002C0000L});
    public static final BitSet FOLLOW_terminator_in_tryBlock2913 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expressions_in_tryBlock2923 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_END_in_tryBlock2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EADD_in_calcBlock2971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INTEGER_in_calcBlock2975 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_TO_in_calcBlock2977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_calcBlock2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ESUBTRACT_in_calcBlock3003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INTEGER_in_calcBlock3007 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_FROM_in_calcBlock3009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_calcBlock3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EDIVIDE_in_calcBlock3028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_calcBlock3032 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_BY_in_calcBlock3034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INTEGER_in_calcBlock3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMULTIPLY_in_calcBlock3057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_calcBlock3061 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_BY_in_calcBlock3063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INTEGER_in_calcBlock3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EADD_in_calcBlock3084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_FLOAT_in_calcBlock3088 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_TO_in_calcBlock3090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_calcBlock3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ESUBTRACT_in_calcBlock3116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_FLOAT_in_calcBlock3120 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_FROM_in_calcBlock3122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_calcBlock3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EDIVIDE_in_calcBlock3141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_calcBlock3145 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_BY_in_calcBlock3147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_FLOAT_in_calcBlock3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMULTIPLY_in_calcBlock3170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_calcBlock3174 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_BY_in_calcBlock3176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_FLOAT_in_calcBlock3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminator_in_synpred3_AkinParser142 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expression_in_synpred3_AkinParser151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminator_in_synpred4_AkinParser167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_synpred11_AkinParser292 = new BitSet(new long[]{0x0000000000000010L,0x0000002000000000L});
    public static final BitSet FOLLOW_set_in_synpred11_AkinParser300 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_orExpression_in_synpred11_AkinParser308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_synpred13_AkinParser358 = new BitSet(new long[]{0x0000000000000020L,0x0000001000000000L});
    public static final BitSet FOLLOW_set_in_synpred13_AkinParser366 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_andExpression_in_synpred13_AkinParser374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_synpred22_AkinParser415 = new BitSet(new long[]{0x0000000380000000L,0x000000007E000000L});
    public static final BitSet FOLLOW_set_in_synpred22_AkinParser426 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_relationalExpression_in_synpred22_AkinParser455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_synpred24_AkinParser495 = new BitSet(new long[]{0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_set_in_synpred24_AkinParser505 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_additiveExpression_in_synpred24_AkinParser513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_synpred27_AkinParser561 = new BitSet(new long[]{0x0000000000000000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_set_in_synpred27_AkinParser571 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_synpred27_AkinParser581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminator_in_synpred49_AkinParser1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_in_synpred51_AkinParser1215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_synpred51_AkinParser1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_synpred52_AkinParser1174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_synpred52_AkinParser1176 = new BitSet(new long[]{0x4000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_message_in_synpred52_AkinParser1215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_synpred52_AkinParser1217 = new BitSet(new long[]{0x4000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_message_in_synpred52_AkinParser1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_message_in_synpred54_AkinParser1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_synpred58_AkinParser1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_synpred60_AkinParser1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_synpred62_AkinParser1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_synpred75_AkinParser1873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000804000L});
    public static final BitSet FOLLOW_parameters_in_synpred75_AkinParser1875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_synpred75_AkinParser1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred81_AkinParser1841 = new BitSet(new long[]{0x8000000010000000L,0x0000000000004008L});
    public static final BitSet FOLLOW_CAN_in_synpred81_AkinParser1852 = new BitSet(new long[]{0x8002000000000000L,0x0000000000004008L});
    public static final BitSet FOLLOW_ALSO_in_synpred81_AkinParser1855 = new BitSet(new long[]{0x8000000000000000L,0x0000000000004008L});
    public static final BitSet FOLLOW_GET_in_synpred81_AkinParser1861 = new BitSet(new long[]{0x8000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_CALCULATE_in_synpred81_AkinParser1864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_synpred81_AkinParser1867 = new BitSet(new long[]{0x481D67482C179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_WITH_in_synpred81_AkinParser1869 = new BitSet(new long[]{0x480D67482C179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_synpred81_AkinParser1873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000804000L});
    public static final BitSet FOLLOW_parameters_in_synpred81_AkinParser1875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_CLOSE_PARENT_in_synpred81_AkinParser1878 = new BitSet(new long[]{0x480D67482C179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_BY_in_synpred81_AkinParser1882 = new BitSet(new long[]{0x400D67482C179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_WHICHISTO_in_synpred81_AkinParser1886 = new BitSet(new long[]{0x400D67482C179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_ISTO_in_synpred81_AkinParser1888 = new BitSet(new long[]{0x400D67482C179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_terminator_in_synpred81_AkinParser1890 = new BitSet(new long[]{0x400D67482C179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_expressions_in_synpred81_AkinParser1901 = new BitSet(new long[]{0x0020000000004000L});
    public static final BitSet FOLLOW_THEN_in_synpred81_AkinParser1907 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_END_in_synpred81_AkinParser1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PARENT_in_synpred89_AkinParser1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameters_in_synpred90_AkinParser1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THEN_in_synpred96_AkinParser1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_in_synpred97_AkinParser2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred99_AkinParser2111 = new BitSet(new long[]{0x0000000000000020L,0x0000000000004000L});
    public static final BitSet FOLLOW_ANDE_in_synpred99_AkinParser2114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_synpred99_AkinParser2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTHEFOLLOWING_in_synpred106_AkinParser2356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INTEGER_in_synpred106_AkinParser2358 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_TIMES_in_synpred106_AkinParser2360 = new BitSet(new long[]{0x400D274824179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_terminator_in_synpred106_AkinParser2362 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expressions_in_synpred106_AkinParser2373 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_END_in_synpred106_AkinParser2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTHEFOLLOWING_in_synpred111_AkinParser2423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INTEGER_in_synpred111_AkinParser2427 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_TIMES_in_synpred111_AkinParser2429 = new BitSet(new long[]{0x401D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_WITH_in_synpred111_AkinParser2449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_NAME_in_synpred111_AkinParser2453 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_INCREMENTING_in_synpred111_AkinParser2455 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_BY_in_synpred111_AkinParser2457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INTEGER_in_synpred111_AkinParser2461 = new BitSet(new long[]{0x3000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_in_synpred111_AkinParser2472 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_STARTING_in_synpred111_AkinParser2475 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_FROM_in_synpred111_AkinParser2478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_INTEGER_in_synpred111_AkinParser2482 = new BitSet(new long[]{0x400D274824179900L,0x00000140016D49B0L});
    public static final BitSet FOLLOW_terminator_in_synpred111_AkinParser2484 = new BitSet(new long[]{0x400D274824179900L,0x00000040014149B0L});
    public static final BitSet FOLLOW_expressions_in_synpred111_AkinParser2510 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_END_in_synpred111_AkinParser2516 = new BitSet(new long[]{0x0000000000000002L});

}