// $ANTLR 3.1.1 AkinLexer.g 2013-02-21 00:34:32
 package akin.lang; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class AkinLexer extends Lexer {
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
    public static final int ENDMETHODCALL=66;
    public static final int NAME=78;
    public static final int GREATER=24;
    public static final int THAN=23;
    public static final int USING=43;
    public static final int EADD=38;
    public static final int THIS=45;
    public static final int GET=67;
    public static final int EQ=89;
    public static final int COMMENT=105;
    public static final int DECREASING=56;
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
    public static final int EMULTIPLY=41;
    public static final int THISCAN=44;
    public static final int NIL=16;
    public static final int ESUBTRACT=40;
    public static final int SNAME=81;
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
    public static final int MINUS=96;
    public static final int KEEPDOINGTHEFOLLOWINGG=69;
    public static final int TRUE=17;
    public static final int TRYTO=54;
    public static final int COLON=83;
    public static final int EDIVIDE=42;
    public static final int UNTILL=65;
    public static final int INCREASING=55;
    public static final int NEWLINE=104;
    public static final int EMINUS=39;
    public static final int LTT=32;
    public static final int OPEN_PARENT=86;
    public static final int ASSIGN=103;
    public static final int STARTING=61;
    public static final int EPLUS=37;
    public static final int DIV=98;
    public static final int TIMES=57;
    public static final int SELF=15;
    public static final int LE=90;
    public static final int STRING=75;

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


    // delegates
    // delegators

    public AkinLexer() {;} 
    public AkinLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AkinLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "AkinLexer.g"; }

    // $ANTLR start "ORE"
    public final void mORE() throws RecognitionException {
        try {
            int _type = ORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:30:4: ({...}? => 'or' )
            // AkinLexer.g:30:21: {...}? => 'or'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "ORE", "!methodMode");
            }
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORE"

    // $ANTLR start "ANDE"
    public final void mANDE() throws RecognitionException {
        try {
            int _type = ANDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:31:5: ({...}? => 'and' )
            // AkinLexer.g:31:21: {...}? => 'and'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "ANDE", "!methodMode");
            }
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANDE"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:32:6: ({...}? => 'class' )
            // AkinLexer.g:32:21: {...}? => 'class'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "CLASS", "!methodMode");
            }
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "DEF"
    public final void mDEF() throws RecognitionException {
        try {
            int _type = DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:33:4: ({...}? => 'def' )
            // AkinLexer.g:33:21: {...}? => 'def'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "DEF", "!methodMode");
            }
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEF"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:34:3: ({...}? => 'if' | 'If' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='i') && ((!methodMode))) {
                alt1=1;
            }
            else if ( (LA1_0=='I') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // AkinLexer.g:34:21: {...}? => 'if'
                    {
                    if ( !((!methodMode)) ) {
                        throw new FailedPredicateException(input, "IF", "!methodMode");
                    }
                    match("if"); 


                    }
                    break;
                case 2 :
                    // AkinLexer.g:34:45: 'If'
                    {
                    match("If"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "NOTE"
    public final void mNOTE() throws RecognitionException {
        try {
            int _type = NOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:35:5: ({...}? => 'not' )
            // AkinLexer.g:35:21: {...}? => 'not'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "NOTE", "!methodMode");
            }
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTE"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:36:5: ({...}? => 'else' )
            // AkinLexer.g:36:21: {...}? => 'else'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "ELSE", "!methodMode");
            }
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:37:6: ({...}? => 'while' | 'While' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='w') && ((!methodMode))) {
                alt2=1;
            }
            else if ( (LA2_0=='W') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // AkinLexer.g:37:21: {...}? => 'while'
                    {
                    if ( !((!methodMode)) ) {
                        throw new FailedPredicateException(input, "WHILE", "!methodMode");
                    }
                    match("while"); 


                    }
                    break;
                case 2 :
                    // AkinLexer.g:37:48: 'While'
                    {
                    match("While"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "TRY"
    public final void mTRY() throws RecognitionException {
        try {
            int _type = TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:38:4: ({...}? => 'try' )
            // AkinLexer.g:38:21: {...}? => 'try'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "TRY", "!methodMode");
            }
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRY"

    // $ANTLR start "CATCH"
    public final void mCATCH() throws RecognitionException {
        try {
            int _type = CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:39:6: ({...}? => 'catch' )
            // AkinLexer.g:39:21: {...}? => 'catch'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "CATCH", "!methodMode");
            }
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CATCH"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:40:4: ({...}? => 'end' | 'That is all it has and can do.' | 'yolo' | 'end.' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 'e':
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='n') ) {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4=='d') ) {
                        int LA3_5 = input.LA(4);

                        if ( (LA3_5=='.') ) {
                            alt3=4;
                        }
                        else {
                            alt3=1;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 'T':
                {
                alt3=2;
                }
                break;
            case 'y':
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // AkinLexer.g:40:21: {...}? => 'end'
                    {
                    if ( !((!methodMode)) ) {
                        throw new FailedPredicateException(input, "END", "!methodMode");
                    }
                    match("end"); 


                    }
                    break;
                case 2 :
                    // AkinLexer.g:40:46: 'That is all it has and can do.'
                    {
                    match("That is all it has and can do."); 


                    }
                    break;
                case 3 :
                    // AkinLexer.g:40:81: 'yolo'
                    {
                    match("yolo"); 


                    }
                    break;
                case 4 :
                    // AkinLexer.g:40:90: 'end.'
                    {
                    match("end."); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "SELF"
    public final void mSELF() throws RecognitionException {
        try {
            int _type = SELF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:41:5: ({...}? => 'self' )
            // AkinLexer.g:41:21: {...}? => 'self'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "SELF", "!methodMode");
            }
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELF"

    // $ANTLR start "NIL"
    public final void mNIL() throws RecognitionException {
        try {
            int _type = NIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:42:4: ({...}? => 'nil' )
            // AkinLexer.g:42:21: {...}? => 'nil'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "NIL", "!methodMode");
            }
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NIL"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:43:5: ({...}? => 'true' )
            // AkinLexer.g:43:21: {...}? => 'true'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "TRUE", "!methodMode");
            }
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:44:6: ({...}? => 'false' )
            // AkinLexer.g:44:21: {...}? => 'false'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "FALSE", "!methodMode");
            }
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:45:3: ({...}? => 'is' )
            // AkinLexer.g:45:21: {...}? => 'is'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "IS", "!methodMode");
            }
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            int _type = A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:46:2: ({...}? => 'a' | 'A' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='a') && ((!methodMode))) {
                alt4=1;
            }
            else if ( (LA4_0=='A') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // AkinLexer.g:46:21: {...}? => 'a'
                    {
                    if ( !((!methodMode)) ) {
                        throw new FailedPredicateException(input, "A", "!methodMode");
                    }
                    match('a'); 

                    }
                    break;
                case 2 :
                    // AkinLexer.g:46:44: 'A'
                    {
                    match('A'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:47:5: ({...}? => 'type' )
            // AkinLexer.g:47:21: {...}? => 'type'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "TYPE", "!methodMode");
            }
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "OF"
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:48:3: ({...}? => 'of' )
            // AkinLexer.g:48:21: {...}? => 'of'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "OF", "!methodMode");
            }
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OF"

    // $ANTLR start "THAN"
    public final void mTHAN() throws RecognitionException {
        try {
            int _type = THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:49:5: ({...}? => 'than' )
            // AkinLexer.g:49:21: {...}? => 'than'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "THAN", "!methodMode");
            }
            match("than"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THAN"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:50:8: ({...}? => 'greater' )
            // AkinLexer.g:50:21: {...}? => 'greater'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "GREATER", "!methodMode");
            }
            match("greater"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:51:6: ({...}? => 'equal' )
            // AkinLexer.g:51:21: {...}? => 'equal'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "EQUAL", "!methodMode");
            }
            match("equal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:52:3: ({...}? => 'to' | 'To' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='t') && ((!methodMode))) {
                alt5=1;
            }
            else if ( (LA5_0=='T') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // AkinLexer.g:52:21: {...}? => 'to'
                    {
                    if ( !((!methodMode)) ) {
                        throw new FailedPredicateException(input, "TO", "!methodMode");
                    }
                    match("to"); 


                    }
                    break;
                case 2 :
                    // AkinLexer.g:52:45: 'To'
                    {
                    match("To"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "ISTO"
    public final void mISTO() throws RecognitionException {
        try {
            int _type = ISTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:53:5: ({...}? => 'is to' )
            // AkinLexer.g:53:21: {...}? => 'is to'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "ISTO", "!methodMode");
            }
            match("is to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISTO"

    // $ANTLR start "CAN"
    public final void mCAN() throws RecognitionException {
        try {
            int _type = CAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:54:4: ({...}? => 'can' | 'Can' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='c') && ((!methodMode))) {
                alt6=1;
            }
            else if ( (LA6_0=='C') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // AkinLexer.g:54:21: {...}? => 'can'
                    {
                    if ( !((!methodMode)) ) {
                        throw new FailedPredicateException(input, "CAN", "!methodMode");
                    }
                    match("can"); 


                    }
                    break;
                case 2 :
                    // AkinLexer.g:54:46: 'Can'
                    {
                    match("Can"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CAN"

    // $ANTLR start "THE"
    public final void mTHE() throws RecognitionException {
        try {
            int _type = THE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:55:4: ({...}? => 'the' | 'The' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='t') && ((!methodMode))) {
                alt7=1;
            }
            else if ( (LA7_0=='T') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // AkinLexer.g:55:21: {...}? => 'the'
                    {
                    if ( !((!methodMode)) ) {
                        throw new FailedPredicateException(input, "THE", "!methodMode");
                    }
                    match("the"); 


                    }
                    break;
                case 2 :
                    // AkinLexer.g:55:46: 'The'
                    {
                    match("The"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THE"

    // $ANTLR start "OET"
    public final void mOET() throws RecognitionException {
        try {
            int _type = OET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:56:4: ({...}? => 'or equal to' )
            // AkinLexer.g:56:21: {...}? => 'or equal to'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "OET", "!methodMode");
            }
            match("or equal to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OET"

    // $ANTLR start "GTT"
    public final void mGTT() throws RecognitionException {
        try {
            int _type = GTT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:57:4: ({...}? => 'is greater than' )
            // AkinLexer.g:57:21: {...}? => 'is greater than'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "GTT", "!methodMode");
            }
            match("is greater than"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTT"

    // $ANTLR start "LTT"
    public final void mLTT() throws RecognitionException {
        try {
            int _type = LTT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:58:4: ({...}? => 'is less than' )
            // AkinLexer.g:58:21: {...}? => 'is less than'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "LTT", "!methodMode");
            }
            match("is less than"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTT"

    // $ANTLR start "ETT"
    public final void mETT() throws RecognitionException {
        try {
            int _type = ETT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:59:4: ({...}? => 'is equal to' )
            // AkinLexer.g:59:21: {...}? => 'is equal to'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "ETT", "!methodMode");
            }
            match("is equal to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ETT"

    // $ANTLR start "ISATYPEOF"
    public final void mISATYPEOF() throws RecognitionException {
        try {
            int _type = ISATYPEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:60:10: ({...}? => 'is a type of' )
            // AkinLexer.g:60:21: {...}? => 'is a type of'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "ISATYPEOF", "!methodMode");
            }
            match("is a type of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISATYPEOF"

    // $ANTLR start "MAKE"
    public final void mMAKE() throws RecognitionException {
        try {
            int _type = MAKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:61:5: ({...}? => 'make' )
            // AkinLexer.g:61:21: {...}? => 'make'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "MAKE", "!methodMode");
            }
            match("make"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAKE"

    // $ANTLR start "OFTHIS"
    public final void mOFTHIS() throws RecognitionException {
        try {
            int _type = OFTHIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:62:7: ({...}? => 'of this' )
            // AkinLexer.g:62:21: {...}? => 'of this'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "OFTHIS", "!methodMode");
            }
            match("of this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OFTHIS"

    // $ANTLR start "EPLUS"
    public final void mEPLUS() throws RecognitionException {
        try {
            int _type = EPLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:63:6: ({...}? => 'plus' )
            // AkinLexer.g:63:21: {...}? => 'plus'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "EPLUS", "!methodMode");
            }
            match("plus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EPLUS"

    // $ANTLR start "EADD"
    public final void mEADD() throws RecognitionException {
        try {
            int _type = EADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:64:5: ({...}? => 'add' | 'Add' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='a') && ((!methodMode))) {
                alt8=1;
            }
            else if ( (LA8_0=='A') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // AkinLexer.g:64:21: {...}? => 'add'
                    {
                    if ( !((!methodMode)) ) {
                        throw new FailedPredicateException(input, "EADD", "!methodMode");
                    }
                    match("add"); 


                    }
                    break;
                case 2 :
                    // AkinLexer.g:64:46: 'Add'
                    {
                    match("Add"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EADD"

    // $ANTLR start "EMINUS"
    public final void mEMINUS() throws RecognitionException {
        try {
            int _type = EMINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:65:7: ({...}? => 'minus' )
            // AkinLexer.g:65:21: {...}? => 'minus'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "EMINUS", "!methodMode");
            }
            match("minus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EMINUS"

    // $ANTLR start "ESUBTRACT"
    public final void mESUBTRACT() throws RecognitionException {
        try {
            int _type = ESUBTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:66:10: ({...}? => 'subtract' | 'Subtract' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='s') && ((!methodMode))) {
                alt9=1;
            }
            else if ( (LA9_0=='S') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // AkinLexer.g:66:21: {...}? => 'subtract'
                    {
                    if ( !((!methodMode)) ) {
                        throw new FailedPredicateException(input, "ESUBTRACT", "!methodMode");
                    }
                    match("subtract"); 


                    }
                    break;
                case 2 :
                    // AkinLexer.g:66:51: 'Subtract'
                    {
                    match("Subtract"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ESUBTRACT"

    // $ANTLR start "EMULTIPLY"
    public final void mEMULTIPLY() throws RecognitionException {
        try {
            int _type = EMULTIPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:67:10: ({...}? => 'multiply' | 'Multiply' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='m') && ((!methodMode))) {
                alt10=1;
            }
            else if ( (LA10_0=='M') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // AkinLexer.g:67:21: {...}? => 'multiply'
                    {
                    if ( !((!methodMode)) ) {
                        throw new FailedPredicateException(input, "EMULTIPLY", "!methodMode");
                    }
                    match("multiply"); 


                    }
                    break;
                case 2 :
                    // AkinLexer.g:67:51: 'Multiply'
                    {
                    match("Multiply"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EMULTIPLY"

    // $ANTLR start "EDIVIDE"
    public final void mEDIVIDE() throws RecognitionException {
        try {
            int _type = EDIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:68:8: ({...}? => 'divide' | 'Divide' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='d') && ((!methodMode))) {
                alt11=1;
            }
            else if ( (LA11_0=='D') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // AkinLexer.g:68:21: {...}? => 'divide'
                    {
                    if ( !((!methodMode)) ) {
                        throw new FailedPredicateException(input, "EDIVIDE", "!methodMode");
                    }
                    match("divide"); 


                    }
                    break;
                case 2 :
                    // AkinLexer.g:68:49: 'Divide'
                    {
                    match("Divide"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EDIVIDE"

    // $ANTLR start "USING"
    public final void mUSING() throws RecognitionException {
        try {
            int _type = USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:69:6: ({...}? => 'using' )
            // AkinLexer.g:69:21: {...}? => 'using'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "USING", "!methodMode");
            }
            match("using"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USING"

    // $ANTLR start "THISCAN"
    public final void mTHISCAN() throws RecognitionException {
        try {
            int _type = THISCAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:70:8: ({...}? => 'This can' )
            // AkinLexer.g:70:21: {...}? => 'This can'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "THISCAN", "!methodMode");
            }
            match("This can"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THISCAN"

    // $ANTLR start "THIS"
    public final void mTHIS() throws RecognitionException {
        try {
            int _type = THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:71:5: ({...}? => 'This' | 'this' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='T') && ((!methodMode))) {
                alt12=1;
            }
            else if ( (LA12_0=='t') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // AkinLexer.g:71:21: {...}? => 'This'
                    {
                    if ( !((!methodMode)) ) {
                        throw new FailedPredicateException(input, "THIS", "!methodMode");
                    }
                    match("This"); 


                    }
                    break;
                case 2 :
                    // AkinLexer.g:71:47: 'this'
                    {
                    match("this"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THIS"

    // $ANTLR start "WHICHISTO"
    public final void mWHICHISTO() throws RecognitionException {
        try {
            int _type = WHICHISTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:72:10: ({...}? => 'which is to' )
            // AkinLexer.g:72:21: {...}? => 'which is to'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "WHICHISTO", "!methodMode");
            }
            match("which is to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHICHISTO"

    // $ANTLR start "WHICH"
    public final void mWHICH() throws RecognitionException {
        try {
            int _type = WHICH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:73:6: ({...}? => 'which' )
            // AkinLexer.g:73:21: {...}? => 'which'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "WHICH", "!methodMode");
            }
            match("which"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHICH"

    // $ANTLR start "IT"
    public final void mIT() throws RecognitionException {
        try {
            int _type = IT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:74:3: ({...}? => 'It' )
            // AkinLexer.g:74:21: {...}? => 'It'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "IT", "!methodMode");
            }
            match("It"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IT"

    // $ANTLR start "ALSO"
    public final void mALSO() throws RecognitionException {
        try {
            int _type = ALSO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:75:5: ({...}? => 'also' )
            // AkinLexer.g:75:21: {...}? => 'also'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "ALSO", "!methodMode");
            }
            match("also"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALSO"

    // $ANTLR start "DOTHEFOLLOWING"
    public final void mDOTHEFOLLOWING() throws RecognitionException {
        try {
            int _type = DOTHEFOLLOWING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:76:15: ({...}? => 'Do the following' )
            // AkinLexer.g:76:21: {...}? => 'Do the following'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "DOTHEFOLLOWING", "!methodMode");
            }
            match("Do the following"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOTHEFOLLOWING"

    // $ANTLR start "YOU"
    public final void mYOU() throws RecognitionException {
        try {
            int _type = YOU;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:77:4: ({...}? => 'You' )
            // AkinLexer.g:77:21: {...}? => 'You'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "YOU", "!methodMode");
            }
            match("You"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "YOU"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:78:5: ({...}? => 'with' )
            // AkinLexer.g:78:21: {...}? => 'with'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "WITH", "!methodMode");
            }
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:79:5: ({...}? => 'then' )
            // AkinLexer.g:79:21: {...}? => 'then'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "THEN", "!methodMode");
            }
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "TRYTO"
    public final void mTRYTO() throws RecognitionException {
        try {
            int _type = TRYTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:80:6: ({...}? => 'Try to' )
            // AkinLexer.g:80:21: {...}? => 'Try to'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "TRYTO", "!methodMode");
            }
            match("Try to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRYTO"

    // $ANTLR start "INCREASING"
    public final void mINCREASING() throws RecognitionException {
        try {
            int _type = INCREASING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:81:11: ({...}? => 'increasing' )
            // AkinLexer.g:81:21: {...}? => 'increasing'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "INCREASING", "!methodMode");
            }
            match("increasing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCREASING"

    // $ANTLR start "DECREASING"
    public final void mDECREASING() throws RecognitionException {
        try {
            int _type = DECREASING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:82:11: ({...}? => 'decreasing' )
            // AkinLexer.g:82:21: {...}? => 'decreasing'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "DECREASING", "!methodMode");
            }
            match("decreasing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECREASING"

    // $ANTLR start "TIMES"
    public final void mTIMES() throws RecognitionException {
        try {
            int _type = TIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:83:6: ({...}? => 'times' )
            // AkinLexer.g:83:21: {...}? => 'times'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "TIMES", "!methodMode");
            }
            match("times"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMES"

    // $ANTLR start "INCREMENTING"
    public final void mINCREMENTING() throws RecognitionException {
        try {
            int _type = INCREMENTING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:84:13: ({...}? => 'incrementing' )
            // AkinLexer.g:84:21: {...}? => 'incrementing'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "INCREMENTING", "!methodMode");
            }
            match("incrementing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCREMENTING"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:85:3: ({...}? => 'by' )
            // AkinLexer.g:85:21: {...}? => 'by'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "BY", "!methodMode");
            }
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:86:5: ({...}? => 'from' )
            // AkinLexer.g:86:21: {...}? => 'from'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "FROM", "!methodMode");
            }
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "STARTING"
    public final void mSTARTING() throws RecognitionException {
        try {
            int _type = STARTING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:87:9: ({...}? => 'starting' )
            // AkinLexer.g:87:21: {...}? => 'starting'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "STARTING", "!methodMode");
            }
            match("starting"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STARTING"

    // $ANTLR start "MAKETHECOMPUTER"
    public final void mMAKETHECOMPUTER() throws RecognitionException {
        try {
            int _type = MAKETHECOMPUTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:88:16: ({...}? => 'Make the computer' )
            // AkinLexer.g:88:21: {...}? => 'Make the computer'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "MAKETHECOMPUTER", "!methodMode");
            }
            match("Make the computer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAKETHECOMPUTER"

    // $ANTLR start "CALCULATE"
    public final void mCALCULATE() throws RecognitionException {
        try {
            int _type = CALCULATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:89:10: ({...}? => 'calculate' )
            // AkinLexer.g:89:21: {...}? => 'calculate'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "CALCULATE", "!methodMode");
            }
            match("calculate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CALCULATE"

    // $ANTLR start "UNTIL"
    public final void mUNTIL() throws RecognitionException {
        try {
            int _type = UNTIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:90:6: ({...}? => 'until it reaches' )
            // AkinLexer.g:90:21: {...}? => 'until it reaches'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "UNTIL", "!methodMode");
            }
            match("until it reaches"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNTIL"

    // $ANTLR start "UNTILL"
    public final void mUNTILL() throws RecognitionException {
        try {
            int _type = UNTILL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:91:7: ({...}? => 'until' )
            // AkinLexer.g:91:21: {...}? => 'until'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "UNTILL", "!methodMode");
            }
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNTILL"

    // $ANTLR start "ENDMETHODCALL"
    public final void mENDMETHODCALL() throws RecognitionException {
        try {
            int _type = ENDMETHODCALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:92:14: ({...}? => 'endmethodcall' )
            // AkinLexer.g:92:21: {...}? => 'endmethodcall'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "ENDMETHODCALL", "!methodMode");
            }
            match("endmethodcall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDMETHODCALL"

    // $ANTLR start "GET"
    public final void mGET() throws RecognitionException {
        try {
            int _type = GET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:93:4: ({...}? => 'get' )
            // AkinLexer.g:93:21: {...}? => 'get'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "GET", "!methodMode");
            }
            match("get"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GET"

    // $ANTLR start "KEEPDOINGTHEFOLLOWING"
    public final void mKEEPDOINGTHEFOLLOWING() throws RecognitionException {
        try {
            int _type = KEEPDOINGTHEFOLLOWING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:94:22: ({...}? => 'Keep doing the following until' )
            // AkinLexer.g:94:25: {...}? => 'Keep doing the following until'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "KEEPDOINGTHEFOLLOWING", "!methodMode");
            }
            match("Keep doing the following until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEEPDOINGTHEFOLLOWING"

    // $ANTLR start "KEEPDOINGTHEFOLLOWINGG"
    public final void mKEEPDOINGTHEFOLLOWINGG() throws RecognitionException {
        try {
            int _type = KEEPDOINGTHEFOLLOWINGG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:95:23: ({...}? => 'Keep doing the following while' )
            // AkinLexer.g:95:26: {...}? => 'Keep doing the following while'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "KEEPDOINGTHEFOLLOWINGG", "!methodMode");
            }
            match("Keep doing the following while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEEPDOINGTHEFOLLOWINGG"

    // $ANTLR start "ENDD"
    public final void mENDD() throws RecognitionException {
        try {
            int _type = ENDD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:96:5: ({...}? => 'termin' )
            // AkinLexer.g:96:21: {...}? => 'termin'
            {
            if ( !((!methodMode)) ) {
                throw new FailedPredicateException(input, "ENDD", "!methodMode");
            }
            match("termin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDD"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            // AkinLexer.g:98:17: ()
            // AkinLexer.g:98:18: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            // AkinLexer.g:99:15: ()
            // AkinLexer.g:99:16: 
            {
            }

        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:100:7: ( ( '-' )? ( DIGIT )+ ({...}? => '.' ( DIGIT )+ | ) )
            // AkinLexer.g:100:21: ( '-' )? ( DIGIT )+ ({...}? => '.' ( DIGIT )+ | )
            {
            // AkinLexer.g:100:21: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='-') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // AkinLexer.g:100:21: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // AkinLexer.g:100:26: ( DIGIT )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // AkinLexer.g:100:26: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            // AkinLexer.g:102:23: ({...}? => '.' ( DIGIT )+ | )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='.') && ((isNum(input.LA(2))))) {
                alt16=1;
            }
            else {
                alt16=2;}
            switch (alt16) {
                case 1 :
                    // AkinLexer.g:102:25: {...}? => '.' ( DIGIT )+
                    {
                    if ( !((isNum(input.LA(2)))) ) {
                        throw new FailedPredicateException(input, "NUMBER", "isNum(input.LA(2))");
                    }
                    match('.'); 
                    // AkinLexer.g:102:53: ( DIGIT )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // AkinLexer.g:102:53: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                     _type = FLOAT; 

                    }
                    break;
                case 2 :
                    // AkinLexer.g:103:61: 
                    {
                     _type = INTEGER; 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:105:7: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' )
            // AkinLexer.g:105:21: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // AkinLexer.g:105:25: (~ ( '\\\\' | '\"' ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // AkinLexer.g:105:25: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:106:5: ( ( LOWER | '_' ) ( ID_CHAR )* ( '!' | '?' )? )
            // AkinLexer.g:106:21: ( LOWER | '_' ) ( ID_CHAR )* ( '!' | '?' )?
            {
            if ( input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // AkinLexer.g:106:35: ( ID_CHAR )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // AkinLexer.g:106:35: ID_CHAR
            	    {
            	    mID_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // AkinLexer.g:106:44: ( '!' | '?' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='!'||LA19_0=='?') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // AkinLexer.g:
                    {
                    if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

             methodMode = false; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "CONSTANT"
    public final void mCONSTANT() throws RecognitionException {
        try {
            int _type = CONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:107:9: ( UPPER ( ID_CHAR )* )
            // AkinLexer.g:107:21: UPPER ( ID_CHAR )*
            {
            mUPPER(); 
            // AkinLexer.g:107:27: ( ID_CHAR )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='9')||(LA20_0>='A' && LA20_0<='Z')||LA20_0=='_'||(LA20_0>='a' && LA20_0<='z')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // AkinLexer.g:107:27: ID_CHAR
            	    {
            	    mID_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSTANT"

    // $ANTLR start "SNAME"
    public final void mSNAME() throws RecognitionException {
        try {
            int _type = SNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:108:6: ( NAME CAN )
            // AkinLexer.g:108:21: NAME CAN
            {
            mNAME(); 
            mCAN(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SNAME"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:111:10: ( ';' )
            // AkinLexer.g:111:21: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:112:6: ( ':' )
            // AkinLexer.g:112:21: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:113:4: ( '.' )
            // AkinLexer.g:113:21: '.'
            {
            match('.'); 
             methodMode = true; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:114:6: ( ',' )
            // AkinLexer.g:114:21: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "OPEN_PARENT"
    public final void mOPEN_PARENT() throws RecognitionException {
        try {
            int _type = OPEN_PARENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:115:12: ( '(' )
            // AkinLexer.g:115:21: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN_PARENT"

    // $ANTLR start "CLOSE_PARENT"
    public final void mCLOSE_PARENT() throws RecognitionException {
        try {
            int _type = CLOSE_PARENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:116:13: ( ')' )
            // AkinLexer.g:116:21: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE_PARENT"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:117:3: ( '@' )
            // AkinLexer.g:117:21: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:118:3: ( '==' )
            // AkinLexer.g:118:21: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:119:3: ( '<=' )
            // AkinLexer.g:119:21: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:120:3: ( '>=' )
            // AkinLexer.g:120:21: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "NE"
    public final void mNE() throws RecognitionException {
        try {
            int _type = NE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:121:3: ( '!=' )
            // AkinLexer.g:121:21: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NE"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:122:3: ( '<' )
            // AkinLexer.g:122:21: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:123:3: ( '>' )
            // AkinLexer.g:123:21: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:124:5: ( '+' )
            // AkinLexer.g:124:21: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:125:6: ( '-' )
            // AkinLexer.g:125:21: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:126:4: ( '*' )
            // AkinLexer.g:126:21: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:127:4: ( '/' )
            // AkinLexer.g:127:21: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:128:4: ( '%' )
            // AkinLexer.g:128:21: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:129:4: ( '&&' )
            // AkinLexer.g:129:21: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:130:3: ( '||' )
            // AkinLexer.g:130:21: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:132:4: ( '!' )
            // AkinLexer.g:132:21: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:133:7: ( '=' | 'equals' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='=') ) {
                alt21=1;
            }
            else if ( (LA21_0=='e') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // AkinLexer.g:133:21: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // AkinLexer.g:133:27: 'equals'
                    {
                    match("equals"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:135:8: ( '#' (~ ( '\\r' | '\\n' ) )* ( NEWLINE | EOF ) )
            // AkinLexer.g:135:21: '#' (~ ( '\\r' | '\\n' ) )* ( NEWLINE | EOF )
            {
            match('#'); 
            // AkinLexer.g:135:25: (~ ( '\\r' | '\\n' ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // AkinLexer.g:135:25: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // AkinLexer.g:135:41: ( NEWLINE | EOF )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\n'||LA23_0=='\r') ) {
                alt23=1;
            }
            else {
                alt23=2;}
            switch (alt23) {
                case 1 :
                    // AkinLexer.g:135:42: NEWLINE
                    {
                    mNEWLINE(); 

                    }
                    break;
                case 2 :
                    // AkinLexer.g:135:52: EOF
                    {
                    match(EOF); 

                    }
                    break;

            }

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:137:8: ( ( '\\r' )? '\\n' )
            // AkinLexer.g:137:21: ( '\\r' )? '\\n'
            {
            // AkinLexer.g:137:21: ( '\\r' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\r') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // AkinLexer.g:137:21: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:138:11: ( ( SPACE )+ )
            // AkinLexer.g:138:21: ( SPACE )+
            {
            // AkinLexer.g:138:21: ( SPACE )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='\t'||LA25_0==' ') ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // AkinLexer.g:138:21: SPACE
            	    {
            	    mSPACE(); 

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "DOTSPACE"
    public final void mDOTSPACE() throws RecognitionException {
        try {
            int _type = DOTSPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // AkinLexer.g:139:9: ( DOT WHITESPACE )
            // AkinLexer.g:139:21: DOT WHITESPACE
            {
            mDOT(); 
            mWHITESPACE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOTSPACE"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // AkinLexer.g:140:16: ( LOWER | UPPER )
            // AkinLexer.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "ID_CHAR"
    public final void mID_CHAR() throws RecognitionException {
        try {
            // AkinLexer.g:141:17: ( LETTER | DIGIT | '_' )
            // AkinLexer.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "ID_CHAR"

    // $ANTLR start "LOWER"
    public final void mLOWER() throws RecognitionException {
        try {
            // AkinLexer.g:142:15: ( 'a' .. 'z' )
            // AkinLexer.g:142:21: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "LOWER"

    // $ANTLR start "UPPER"
    public final void mUPPER() throws RecognitionException {
        try {
            // AkinLexer.g:143:15: ( 'A' .. 'Z' )
            // AkinLexer.g:143:21: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UPPER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // AkinLexer.g:144:15: ( '0' .. '9' )
            // AkinLexer.g:144:21: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            // AkinLexer.g:145:15: ( ' ' | '\\t' )
            // AkinLexer.g:
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SPACE"

    public void mTokens() throws RecognitionException {
        // AkinLexer.g:1:8: ( ORE | ANDE | CLASS | DEF | IF | NOTE | ELSE | WHILE | TRY | CATCH | END | SELF | NIL | TRUE | FALSE | IS | A | TYPE | OF | THAN | GREATER | EQUAL | TO | ISTO | CAN | THE | OET | GTT | LTT | ETT | ISATYPEOF | MAKE | OFTHIS | EPLUS | EADD | EMINUS | ESUBTRACT | EMULTIPLY | EDIVIDE | USING | THISCAN | THIS | WHICHISTO | WHICH | IT | ALSO | DOTHEFOLLOWING | YOU | WITH | THEN | TRYTO | INCREASING | DECREASING | TIMES | INCREMENTING | BY | FROM | STARTING | MAKETHECOMPUTER | CALCULATE | UNTIL | UNTILL | ENDMETHODCALL | GET | KEEPDOINGTHEFOLLOWING | KEEPDOINGTHEFOLLOWINGG | ENDD | NUMBER | STRING | NAME | CONSTANT | SNAME | SEMICOLON | COLON | DOT | COMMA | OPEN_PARENT | CLOSE_PARENT | AT | EQ | LE | GE | NE | LT | GT | PLUS | MINUS | MUL | DIV | MOD | AND | OR | NOT | ASSIGN | COMMENT | NEWLINE | WHITESPACE | DOTSPACE )
        int alt26=98;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // AkinLexer.g:1:10: ORE
                {
                mORE(); 

                }
                break;
            case 2 :
                // AkinLexer.g:1:14: ANDE
                {
                mANDE(); 

                }
                break;
            case 3 :
                // AkinLexer.g:1:19: CLASS
                {
                mCLASS(); 

                }
                break;
            case 4 :
                // AkinLexer.g:1:25: DEF
                {
                mDEF(); 

                }
                break;
            case 5 :
                // AkinLexer.g:1:29: IF
                {
                mIF(); 

                }
                break;
            case 6 :
                // AkinLexer.g:1:32: NOTE
                {
                mNOTE(); 

                }
                break;
            case 7 :
                // AkinLexer.g:1:37: ELSE
                {
                mELSE(); 

                }
                break;
            case 8 :
                // AkinLexer.g:1:42: WHILE
                {
                mWHILE(); 

                }
                break;
            case 9 :
                // AkinLexer.g:1:48: TRY
                {
                mTRY(); 

                }
                break;
            case 10 :
                // AkinLexer.g:1:52: CATCH
                {
                mCATCH(); 

                }
                break;
            case 11 :
                // AkinLexer.g:1:58: END
                {
                mEND(); 

                }
                break;
            case 12 :
                // AkinLexer.g:1:62: SELF
                {
                mSELF(); 

                }
                break;
            case 13 :
                // AkinLexer.g:1:67: NIL
                {
                mNIL(); 

                }
                break;
            case 14 :
                // AkinLexer.g:1:71: TRUE
                {
                mTRUE(); 

                }
                break;
            case 15 :
                // AkinLexer.g:1:76: FALSE
                {
                mFALSE(); 

                }
                break;
            case 16 :
                // AkinLexer.g:1:82: IS
                {
                mIS(); 

                }
                break;
            case 17 :
                // AkinLexer.g:1:85: A
                {
                mA(); 

                }
                break;
            case 18 :
                // AkinLexer.g:1:87: TYPE
                {
                mTYPE(); 

                }
                break;
            case 19 :
                // AkinLexer.g:1:92: OF
                {
                mOF(); 

                }
                break;
            case 20 :
                // AkinLexer.g:1:95: THAN
                {
                mTHAN(); 

                }
                break;
            case 21 :
                // AkinLexer.g:1:100: GREATER
                {
                mGREATER(); 

                }
                break;
            case 22 :
                // AkinLexer.g:1:108: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 23 :
                // AkinLexer.g:1:114: TO
                {
                mTO(); 

                }
                break;
            case 24 :
                // AkinLexer.g:1:117: ISTO
                {
                mISTO(); 

                }
                break;
            case 25 :
                // AkinLexer.g:1:122: CAN
                {
                mCAN(); 

                }
                break;
            case 26 :
                // AkinLexer.g:1:126: THE
                {
                mTHE(); 

                }
                break;
            case 27 :
                // AkinLexer.g:1:130: OET
                {
                mOET(); 

                }
                break;
            case 28 :
                // AkinLexer.g:1:134: GTT
                {
                mGTT(); 

                }
                break;
            case 29 :
                // AkinLexer.g:1:138: LTT
                {
                mLTT(); 

                }
                break;
            case 30 :
                // AkinLexer.g:1:142: ETT
                {
                mETT(); 

                }
                break;
            case 31 :
                // AkinLexer.g:1:146: ISATYPEOF
                {
                mISATYPEOF(); 

                }
                break;
            case 32 :
                // AkinLexer.g:1:156: MAKE
                {
                mMAKE(); 

                }
                break;
            case 33 :
                // AkinLexer.g:1:161: OFTHIS
                {
                mOFTHIS(); 

                }
                break;
            case 34 :
                // AkinLexer.g:1:168: EPLUS
                {
                mEPLUS(); 

                }
                break;
            case 35 :
                // AkinLexer.g:1:174: EADD
                {
                mEADD(); 

                }
                break;
            case 36 :
                // AkinLexer.g:1:179: EMINUS
                {
                mEMINUS(); 

                }
                break;
            case 37 :
                // AkinLexer.g:1:186: ESUBTRACT
                {
                mESUBTRACT(); 

                }
                break;
            case 38 :
                // AkinLexer.g:1:196: EMULTIPLY
                {
                mEMULTIPLY(); 

                }
                break;
            case 39 :
                // AkinLexer.g:1:206: EDIVIDE
                {
                mEDIVIDE(); 

                }
                break;
            case 40 :
                // AkinLexer.g:1:214: USING
                {
                mUSING(); 

                }
                break;
            case 41 :
                // AkinLexer.g:1:220: THISCAN
                {
                mTHISCAN(); 

                }
                break;
            case 42 :
                // AkinLexer.g:1:228: THIS
                {
                mTHIS(); 

                }
                break;
            case 43 :
                // AkinLexer.g:1:233: WHICHISTO
                {
                mWHICHISTO(); 

                }
                break;
            case 44 :
                // AkinLexer.g:1:243: WHICH
                {
                mWHICH(); 

                }
                break;
            case 45 :
                // AkinLexer.g:1:249: IT
                {
                mIT(); 

                }
                break;
            case 46 :
                // AkinLexer.g:1:252: ALSO
                {
                mALSO(); 

                }
                break;
            case 47 :
                // AkinLexer.g:1:257: DOTHEFOLLOWING
                {
                mDOTHEFOLLOWING(); 

                }
                break;
            case 48 :
                // AkinLexer.g:1:272: YOU
                {
                mYOU(); 

                }
                break;
            case 49 :
                // AkinLexer.g:1:276: WITH
                {
                mWITH(); 

                }
                break;
            case 50 :
                // AkinLexer.g:1:281: THEN
                {
                mTHEN(); 

                }
                break;
            case 51 :
                // AkinLexer.g:1:286: TRYTO
                {
                mTRYTO(); 

                }
                break;
            case 52 :
                // AkinLexer.g:1:292: INCREASING
                {
                mINCREASING(); 

                }
                break;
            case 53 :
                // AkinLexer.g:1:303: DECREASING
                {
                mDECREASING(); 

                }
                break;
            case 54 :
                // AkinLexer.g:1:314: TIMES
                {
                mTIMES(); 

                }
                break;
            case 55 :
                // AkinLexer.g:1:320: INCREMENTING
                {
                mINCREMENTING(); 

                }
                break;
            case 56 :
                // AkinLexer.g:1:333: BY
                {
                mBY(); 

                }
                break;
            case 57 :
                // AkinLexer.g:1:336: FROM
                {
                mFROM(); 

                }
                break;
            case 58 :
                // AkinLexer.g:1:341: STARTING
                {
                mSTARTING(); 

                }
                break;
            case 59 :
                // AkinLexer.g:1:350: MAKETHECOMPUTER
                {
                mMAKETHECOMPUTER(); 

                }
                break;
            case 60 :
                // AkinLexer.g:1:366: CALCULATE
                {
                mCALCULATE(); 

                }
                break;
            case 61 :
                // AkinLexer.g:1:376: UNTIL
                {
                mUNTIL(); 

                }
                break;
            case 62 :
                // AkinLexer.g:1:382: UNTILL
                {
                mUNTILL(); 

                }
                break;
            case 63 :
                // AkinLexer.g:1:389: ENDMETHODCALL
                {
                mENDMETHODCALL(); 

                }
                break;
            case 64 :
                // AkinLexer.g:1:403: GET
                {
                mGET(); 

                }
                break;
            case 65 :
                // AkinLexer.g:1:407: KEEPDOINGTHEFOLLOWING
                {
                mKEEPDOINGTHEFOLLOWING(); 

                }
                break;
            case 66 :
                // AkinLexer.g:1:429: KEEPDOINGTHEFOLLOWINGG
                {
                mKEEPDOINGTHEFOLLOWINGG(); 

                }
                break;
            case 67 :
                // AkinLexer.g:1:452: ENDD
                {
                mENDD(); 

                }
                break;
            case 68 :
                // AkinLexer.g:1:457: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 69 :
                // AkinLexer.g:1:464: STRING
                {
                mSTRING(); 

                }
                break;
            case 70 :
                // AkinLexer.g:1:471: NAME
                {
                mNAME(); 

                }
                break;
            case 71 :
                // AkinLexer.g:1:476: CONSTANT
                {
                mCONSTANT(); 

                }
                break;
            case 72 :
                // AkinLexer.g:1:485: SNAME
                {
                mSNAME(); 

                }
                break;
            case 73 :
                // AkinLexer.g:1:491: SEMICOLON
                {
                mSEMICOLON(); 

                }
                break;
            case 74 :
                // AkinLexer.g:1:501: COLON
                {
                mCOLON(); 

                }
                break;
            case 75 :
                // AkinLexer.g:1:507: DOT
                {
                mDOT(); 

                }
                break;
            case 76 :
                // AkinLexer.g:1:511: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 77 :
                // AkinLexer.g:1:517: OPEN_PARENT
                {
                mOPEN_PARENT(); 

                }
                break;
            case 78 :
                // AkinLexer.g:1:529: CLOSE_PARENT
                {
                mCLOSE_PARENT(); 

                }
                break;
            case 79 :
                // AkinLexer.g:1:542: AT
                {
                mAT(); 

                }
                break;
            case 80 :
                // AkinLexer.g:1:545: EQ
                {
                mEQ(); 

                }
                break;
            case 81 :
                // AkinLexer.g:1:548: LE
                {
                mLE(); 

                }
                break;
            case 82 :
                // AkinLexer.g:1:551: GE
                {
                mGE(); 

                }
                break;
            case 83 :
                // AkinLexer.g:1:554: NE
                {
                mNE(); 

                }
                break;
            case 84 :
                // AkinLexer.g:1:557: LT
                {
                mLT(); 

                }
                break;
            case 85 :
                // AkinLexer.g:1:560: GT
                {
                mGT(); 

                }
                break;
            case 86 :
                // AkinLexer.g:1:563: PLUS
                {
                mPLUS(); 

                }
                break;
            case 87 :
                // AkinLexer.g:1:568: MINUS
                {
                mMINUS(); 

                }
                break;
            case 88 :
                // AkinLexer.g:1:574: MUL
                {
                mMUL(); 

                }
                break;
            case 89 :
                // AkinLexer.g:1:578: DIV
                {
                mDIV(); 

                }
                break;
            case 90 :
                // AkinLexer.g:1:582: MOD
                {
                mMOD(); 

                }
                break;
            case 91 :
                // AkinLexer.g:1:586: AND
                {
                mAND(); 

                }
                break;
            case 92 :
                // AkinLexer.g:1:590: OR
                {
                mOR(); 

                }
                break;
            case 93 :
                // AkinLexer.g:1:593: NOT
                {
                mNOT(); 

                }
                break;
            case 94 :
                // AkinLexer.g:1:597: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 95 :
                // AkinLexer.g:1:604: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 96 :
                // AkinLexer.g:1:612: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 97 :
                // AkinLexer.g:1:620: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 98 :
                // AkinLexer.g:1:631: DOTSPACE
                {
                mDOTSPACE(); 

                }
                break;

        }

    }


    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA26_eotS =
        "\1\uffff\1\71\1\77\3\71\1\40\3\71\1\40\1\71\1\40\3\71\1\141\1\71"+
        "\1\40\2\71\3\40\1\71\1\40\1\71\1\40\1\163\2\uffff\1\71\3\uffff\1"+
        "\164\4\uffff\1\167\1\171\1\173\1\175\11\uffff\1\177\1\u0081\2\71"+
        "\1\uffff\5\71\1\uffff\4\71\1\u008f\1\u0091\1\71\1\u0093\1\u0094"+
        "\7\71\1\40\3\71\1\u00a3\2\71\1\40\1\u00a9\1\40\6\71\1\40\1\uffff"+
        "\2\71\1\40\4\71\5\40\2\71\1\40\1\u00c1\1\40\17\uffff\1\71\1\uffff"+
        "\1\71\1\u00c7\1\u00c8\3\71\1\u00cc\1\71\1\u00ce\2\71\3\uffff\1\71"+
        "\2\uffff\1\u00d9\1\u00da\1\71\1\u00de\3\71\1\40\1\u00e4\3\71\1\u00e9"+
        "\1\71\1\uffff\2\71\1\40\1\u00ee\1\40\1\uffff\1\40\6\71\1\u00f7\1"+
        "\71\1\u00f9\1\u00fa\4\71\4\40\1\uffff\2\71\1\u0105\1\uffff\1\40"+
        "\2\uffff\2\71\2\uffff\1\u0109\2\71\1\uffff\1\71\1\uffff\2\71\6\uffff"+
        "\1\71\3\uffff\1\u0113\1\uffff\1\71\1\uffff\3\71\1\u0118\1\40\1\uffff"+
        "\1\u011b\1\u011c\1\u011d\1\u011e\1\uffff\1\u011f\2\71\1\40\1\uffff"+
        "\1\u0123\1\uffff\1\u00dc\1\u0124\3\71\1\u0128\1\uffff\1\71\2\uffff"+
        "\1\u012b\2\71\1\u012e\4\40\2\71\2\uffff\1\40\2\uffff\1\u0138\1\u0139"+
        "\1\71\1\uffff\3\71\3\uffff\1\71\1\u0142\1\u0143\1\u0145\1\uffff"+
        "\1\u0147\6\uffff\1\u014c\1\71\3\uffff\2\71\1\u0151\1\uffff\1\71"+
        "\2\uffff\1\u0155\1\71\1\uffff\2\40\1\uffff\1\40\1\u015b\1\u015d"+
        "\5\uffff\2\71\1\u0163\2\71\1\uffff\2\71\13\uffff\1\u016a\1\uffff"+
        "\2\71\2\uffff\1\71\2\uffff\1\71\1\uffff\2\40\1\u0173\6\uffff\2\71"+
        "\1\uffff\3\71\4\uffff\2\71\1\uffff\1\u017f\1\uffff\1\71\2\40\4\uffff"+
        "\5\71\1\uffff\1\u0189\1\u018a\1\uffff\1\u018c\1\u018d\1\u018e\1"+
        "\uffff\1\u0190\4\71\10\uffff\1\u0198\1\u0199\2\71\5\uffff\2\71\3"+
        "\uffff\1\u01a2\1\71\2\uffff\1\u01a6\22\uffff";
    static final String DFA26_eofS =
        "\u01b6\uffff";
    static final String DFA26_minS =
        "\1\11\5\41\1\146\3\41\1\150\1\41\1\150\3\41\1\60\1\41\1\141\2\41"+
        "\1\165\1\141\1\151\1\41\1\157\1\41\1\145\1\60\2\uffff\1\41\3\uffff"+
        "\1\11\4\uffff\4\75\11\uffff\2\40\1\41\1\103\1\uffff\5\41\1\0\5\41"+
        "\1\40\1\41\2\60\7\41\1\151\6\41\1\141\1\60\1\171\6\41\1\144\1\uffff"+
        "\2\41\1\156\4\41\1\142\1\154\1\153\1\166\1\40\2\41\1\165\1\41\1"+
        "\145\14\uffff\1\0\1\uffff\1\0\1\41\1\uffff\13\41\1\0\1\141\1\0\1"+
        "\41\1\uffff\1\0\7\41\1\154\6\41\1\0\2\41\1\164\1\60\1\163\1\uffff"+
        "\1\40\6\41\1\60\2\41\1\60\4\41\2\164\1\145\1\151\1\uffff\2\41\1"+
        "\60\1\0\1\160\2\uffff\2\41\2\0\3\41\1\0\1\41\1\0\2\41\6\uffff\1"+
        "\41\1\uffff\2\0\1\41\1\uffff\1\41\1\0\4\41\1\145\1\0\4\41\1\0\3"+
        "\41\1\40\1\uffff\1\40\1\uffff\6\41\1\uffff\1\41\1\0\1\uffff\4\41"+
        "\1\162\1\151\1\40\1\144\2\41\1\0\1\uffff\1\40\1\uffff\1\0\3\41\1"+
        "\uffff\3\41\2\uffff\1\0\3\41\1\40\1\0\1\60\1\uffff\4\0\1\uffff\2"+
        "\41\1\uffff\2\0\3\41\1\0\1\41\1\uffff\1\0\2\41\1\0\1\141\1\160\1"+
        "\uffff\1\145\1\41\1\40\1\uffff\1\144\1\uffff\2\0\5\41\1\uffff\2"+
        "\41\2\0\1\uffff\1\0\6\uffff\1\0\1\41\1\uffff\2\41\1\0\1\uffff\1"+
        "\41\1\uffff\1\0\1\41\1\uffff\1\143\1\154\1\60\1\0\1\uffff\1\0\1"+
        "\157\2\uffff\2\41\1\0\3\41\3\uffff\1\0\2\41\1\uffff\1\41\1\uffff"+
        "\1\41\1\164\1\171\3\uffff\1\151\5\41\1\uffff\2\41\1\0\1\41\2\60"+
        "\1\156\5\41\2\0\1\uffff\1\0\2\uffff\1\147\1\0\4\41\1\uffff\1\40"+
        "\1\uffff\2\0\2\41\1\164\2\uffff\2\41\1\150\1\0\1\41\1\145\1\uffff"+
        "\1\0\1\40\1\uffff\1\146\1\157\2\154\1\157\1\167\1\151\1\156\1\147"+
        "\1\40\1\165\2\uffff";
    static final String DFA26_maxS =
        "\1\174\5\172\1\164\3\172\1\150\1\172\1\162\5\172\1\141\2\172\2\165"+
        "\1\157\1\172\1\157\1\172\1\145\1\71\2\uffff\1\172\3\uffff\1\40\4"+
        "\uffff\4\75\11\uffff\3\172\1\143\1\uffff\5\172\1\0\20\172\1\151"+
        "\6\172\1\151\1\172\1\171\6\172\1\144\1\uffff\2\172\1\156\4\172\1"+
        "\142\1\154\1\153\1\166\1\40\2\172\1\165\1\172\1\145\14\uffff\1\0"+
        "\1\uffff\1\0\1\172\1\uffff\13\172\1\0\1\164\1\0\1\172\1\uffff\1"+
        "\0\7\172\1\154\6\172\1\0\2\172\1\164\1\172\1\163\1\uffff\1\40\16"+
        "\172\2\164\1\145\1\151\1\uffff\3\172\1\0\1\160\2\uffff\2\172\2\0"+
        "\3\172\1\0\1\172\1\0\2\172\6\uffff\1\172\1\uffff\2\0\1\172\1\uffff"+
        "\1\172\1\0\4\172\1\145\1\0\4\172\1\0\3\172\1\40\1\uffff\1\172\1"+
        "\uffff\6\172\1\uffff\1\172\1\0\1\uffff\4\172\1\162\1\151\1\40\1"+
        "\144\2\172\1\0\1\uffff\1\40\1\uffff\1\0\3\172\1\uffff\3\172\2\uffff"+
        "\1\0\4\172\1\0\1\172\1\uffff\4\0\1\uffff\2\172\1\uffff\2\0\3\172"+
        "\1\0\1\172\1\uffff\1\0\2\172\1\0\1\141\1\160\1\uffff\1\145\2\172"+
        "\1\uffff\1\144\1\uffff\2\0\5\172\1\uffff\2\172\2\0\1\uffff\1\0\6"+
        "\uffff\1\0\1\172\1\uffff\2\172\1\0\1\uffff\1\172\1\uffff\1\0\1\172"+
        "\1\uffff\1\143\1\154\1\172\1\0\1\uffff\1\0\1\157\2\uffff\2\172\1"+
        "\0\3\172\3\uffff\1\0\2\172\1\uffff\1\172\1\uffff\1\172\1\164\1\171"+
        "\3\uffff\1\151\5\172\1\uffff\2\172\1\0\3\172\1\156\5\172\2\0\1\uffff"+
        "\1\0\2\uffff\1\147\1\0\4\172\1\uffff\1\40\1\uffff\2\0\2\172\1\164"+
        "\2\uffff\2\172\1\150\1\0\1\172\1\145\1\uffff\1\0\1\40\1\uffff\1"+
        "\146\1\157\2\154\1\157\1\167\1\151\1\156\1\147\1\40\1\167\2\uffff";
    static final String DFA26_acceptS =
        "\35\uffff\1\104\1\105\1\uffff\1\107\1\111\1\112\1\uffff\1\114\1"+
        "\115\1\116\1\117\4\uffff\1\126\1\130\1\131\1\132\1\133\1\134\1\137"+
        "\1\140\1\141\4\uffff\1\106\47\uffff\1\21\21\uffff\1\127\1\113\1"+
        "\142\1\120\1\136\1\121\1\124\1\122\1\125\1\123\1\135\1\33\1\uffff"+
        "\1\41\2\uffff\1\110\17\uffff\1\5\25\uffff\1\27\23\uffff\1\57\5\uffff"+
        "\1\1\1\23\14\uffff\1\30\1\34\1\35\1\36\1\37\1\20\1\uffff\1\55\3"+
        "\uffff\1\13\21\uffff\1\32\1\uffff\1\63\6\uffff\1\43\2\uffff\1\31"+
        "\13\uffff\1\70\1\uffff\1\2\4\uffff\1\4\3\uffff\1\6\1\15\7\uffff"+
        "\1\11\4\uffff\1\52\2\uffff\1\51\7\uffff\1\100\6\uffff\1\73\3\uffff"+
        "\1\60\1\uffff\1\56\7\uffff\1\7\4\uffff\1\53\1\uffff\1\61\1\10\1"+
        "\16\1\22\1\24\1\62\2\uffff\1\14\3\uffff\1\71\1\uffff\1\40\2\uffff"+
        "\1\42\4\uffff\1\75\2\uffff\1\3\1\12\6\uffff\1\26\1\54\1\66\3\uffff"+
        "\1\17\1\uffff\1\44\3\uffff\1\47\1\50\1\76\6\uffff\1\103\16\uffff"+
        "\1\25\1\uffff\1\45\1\46\6\uffff\1\72\1\uffff\1\74\5\uffff\1\65\1"+
        "\64\6\uffff\1\67\2\uffff\1\77\13\uffff\1\101\1\102";
    static final String DFA26_specialS =
        "\65\uffff\1\0\1\123\10\uffff\1\72\5\uffff\1\120\47\uffff\1\117\21"+
        "\uffff\1\61\1\uffff\1\63\15\uffff\1\55\1\115\1\71\2\uffff\1\36\16"+
        "\uffff\1\111\6\uffff\1\116\26\uffff\1\43\5\uffff\1\60\1\103\3\uffff"+
        "\1\113\1\uffff\1\56\12\uffff\1\77\1\76\3\uffff\1\74\5\uffff\1\102"+
        "\4\uffff\1\110\5\uffff\1\122\11\uffff\1\51\7\uffff\1\121\3\uffff"+
        "\1\34\1\uffff\1\64\1\uffff\1\37\11\uffff\1\100\3\uffff\1\1\1\35"+
        "\2\uffff\1\67\1\62\1\65\1\42\4\uffff\1\33\1\75\3\uffff\1\44\2\uffff"+
        "\1\107\2\uffff\1\104\5\uffff\1\114\1\uffff\1\2\1\uffff\1\57\1\73"+
        "\10\uffff\1\112\1\101\1\uffff\1\32\6\uffff\1\45\4\uffff\1\70\3\uffff"+
        "\1\106\5\uffff\1\27\1\uffff\1\52\1\3\4\uffff\1\30\6\uffff\1\54\13"+
        "\uffff\1\6\10\uffff\1\66\3\uffff\1\7\5\uffff\1\105\1\50\1\uffff"+
        "\1\31\2\uffff\1\4\1\47\5\uffff\1\5\1\uffff\1\40\1\41\2\uffff\1\22"+
        "\4\uffff\1\21\1\46\1\uffff\1\20\1\uffff\1\53\1\17\1\uffff\1\26\1"+
        "\25\1\24\1\23\1\13\1\12\1\11\1\10\1\16\1\15\1\14\2\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\64\1\63\2\uffff\1\63\22\uffff\1\64\1\53\1\36\1\62\1\uffff"+
            "\1\57\1\60\1\uffff\1\45\1\46\1\55\1\54\1\44\1\34\1\43\1\56\12"+
            "\35\1\42\1\41\1\51\1\50\1\52\1\uffff\1\47\1\20\1\40\1\22\1\27"+
            "\4\40\1\6\1\40\1\33\1\40\1\26\5\40\1\25\1\14\2\40\1\12\1\40"+
            "\1\31\1\40\4\uffff\1\37\1\uffff\1\2\1\32\1\3\1\4\1\10\1\17\1"+
            "\21\1\37\1\5\3\37\1\23\1\7\1\1\1\24\2\37\1\16\1\13\1\30\1\37"+
            "\1\11\1\37\1\15\1\37\1\uffff\1\61",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\2\73\1\66\13\73\1\65\10\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\75\7\73\1\76\1\73\1\74\14\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\101\1\73\1\67\10\73\1\100\16\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\73\1\102\3\73\1\103\21\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\2\73\1\104\7\73\1\106\4\73\1\105"+
            "\7\73",
            "\1\107\15\uffff\1\110",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\5\73\1\112\5\73\1\111\13\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\10\73\1\113\1\73\1\114\2\73\1"+
            "\115\11\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\4\73\1\116\1\117\21\73",
            "\1\120",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\73\1\126\2\73\1\123\1\125\5"+
            "\73\1\124\2\73\1\121\6\73\1\122\1\73",
            "\1\127\6\uffff\1\130\2\uffff\1\131",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\13\73\1\132\13\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\73\1\133\16\73\1\135\1\134\5"+
            "\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\136\1\73\1\67\16\73\1\137\10\73",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\3\40\1\140\26\40",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\73\1\143\14\73\1\142\10\73",
            "\1\144",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\145\1\73\1\67\5\73\1\146\13\73\1\147\5"+
            "\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\10\73\1\150\16\73",
            "\1\151",
            "\1\153\23\uffff\1\152",
            "\1\154\5\uffff\1\155",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\12\73\1\157\4\73\1\156\7\73",
            "\1\160",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\25\73\1\161\1\73",
            "\1\162",
            "\12\35",
            "",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "",
            "",
            "",
            "\1\165\26\uffff\1\165",
            "",
            "",
            "",
            "",
            "\1\166",
            "\1\170",
            "\1\172",
            "\1\174",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\176\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27"+
            "\73\4\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\u0080\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72"+
            "\27\73\4\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\u0082\1\73\1\67\27\73",
            "\1\u0083\37\uffff\1\u0083",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\u0084\1\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\u0085\26\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\u0086\26\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\17\73\1\u0087\7\73",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\u0088\1\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\10\73\1\u008b\1\73\1\u008a\5\73"+
            "\1\u0089\6\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\u008d\2\73\1\u008c\24\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\22\73\1\u008e\4\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\u0090\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72"+
            "\27\73\4\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\u0092\27\73",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\20\73\1\u0095\6\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\10\73\1\u0096\16\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\17\73\1\u0097\7\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\u0098\26\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\21\73\1\u0099\5\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\5\73\1\u009a\21\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\20\73\1\u009b\6\73",
            "\1\u009c",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\21\73\1\u009e\3\73\1\u009d\1\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\14\73\1\u009f\12\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\u00a0\1\73\1\67\1\73\1\u00a1\3\73\1\u00a2"+
            "\21\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\11\73\1\u00a4\15\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\16\73\1\u00a5\10\73",
            "\1\u00a6\3\uffff\1\u00a7\3\uffff\1\u00a8",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00aa",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\10\73\1\u00ab\16\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\10\73\1\u00ac\16\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\73\1\u00ad\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\u00ae\1\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\10\73\1\u00af\16\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\13\73\1\u00b0\13\73",
            "\1\u00b1",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\73\1\u00b2\25\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\20\73\1\u00b3\6\73",
            "\1\u00b4",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\7\73\1\u00b5\17\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\12\73\1\u00b6\14\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\10\73\1\u00b7\16\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\21\73\1\u00b8\5\73",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\5\73\1\u00be\21\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\20\73\1\u00bf\6\73",
            "\1\u00c0",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\u00c2",
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
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\12\73\1\u00c5\14\73",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\12\73\1\u00c6\14\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\13\73\1\u00c9\13\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\17\73\1\u00ca\7\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\u00cb\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\u00cd\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\u0082\1\73\1\67\16\73\1\u00cf\10\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\5\73\1\u00d0\21\73",
            "\1\uffff",
            "\1\u00d5\3\uffff\1\u00d4\1\uffff\1\u00d2\4\uffff\1\u00d3\7"+
            "\uffff\1\u00d1",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\u0082\1\73\1\67\16\73\1\u00d7\10\73",
            "",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\73\1\u00db\25\73",
            "\1\70\14\uffff\1\u00dc\1\uffff\12\73\5\uffff\1\70\1\uffff\2"+
            "\73\1\72\27\73\4\uffff\1\73\1\uffff\2\73\1\67\11\73\1\u00dd"+
            "\15\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\u00df\1\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\u00e1\10\73\1\u00e0\16\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\4\73\1\u00e2\22\73",
            "\1\u00e3",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\73\1\u00e5\25\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\73\1\u00e6\25\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\12\73\1\u00e7\14\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\12\73\1\u00e8\14\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\17\73\1\u00ea\7\73",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\73\1\u00eb\25\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\11\73\1\u00ec\15\73",
            "\1\u00ed",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\13\73\1\u00f1\13\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\2\73\1\u00f2\24\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\20\73\1\u00f3\6\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\16\73\1\u00f4\10\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\17\73\1\u00f5\7\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\11\73\1\u00f6\15\73",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\u00f8\1\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\73\1\u00fb\25\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\21\73\1\u00fc\5\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\20\73\1\u00fd\6\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\17\73\1\u00fe\7\73",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\12\73\1\u0103\14\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\5\73\1\u0104\21\73",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\uffff",
            "\1\u0107",
            "",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\uffff",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\17\73\1\u010a\7\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\u0082\1\73\1\67\4\73\1\u010b\22\73",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\u0082\1\73\1\67\21\73\1\u010c\5\73",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\73\1\u010e\25\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\u010f\26\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\73\1\u0110\25\73",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\73\1\u0114\25\73",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\10\73\1\u0115\16\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\73\1\u0116\25\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\u0082\1\73\1\67\4\73\1\u0117\22\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\u0119",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\17\73\1\u0120\7\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\5\73\1\u0121\21\73",
            "\1\u00dc",
            "",
            "\1\u0122\17\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff"+
            "\32\40",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\16\73\1\u0125\10\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\20\73\1\u0126\6\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\73\1\u0127\25\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\20\73\1\u0129\6\73",
            "\1\uffff",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\17\73\1\u012c\7\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\5\73\1\u012d\21\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\3\73\1\u0133\23\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\10\73\1\u0134\16\73",
            "\1\uffff",
            "",
            "\1\u0136",
            "",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\10\73\1\u013a\16\73",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\u013b\1\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\73\1\u013c\25\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\u013d\1\73\1\67\11\73\1\u013e\15\73",
            "",
            "",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\20\73\1\u0140\6\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\17\73\1\u0141\7\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\u0144\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72"+
            "\27\73\4\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\uffff",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\12\73\1\u014d\14\73",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\u014f\1\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\5\73\1\u0150\21\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\73\1\u0153\25\73",
            "",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\14\73\1\u0156\12\73",
            "\1\uffff",
            "\1\u0158",
            "\1\u0159",
            "",
            "\1\u015a",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\u015c\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72"+
            "\27\73\4\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "",
            "\1\u015e",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\u0161\1\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\17\73\1\u0162\7\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\17\73\1\u0164\7\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\73\1\u0165\25\73",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\4\73\1\u0166\22\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\u016b\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\12\73\1\u016c\14\73",
            "\1\uffff",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\16\73\1\u016e\10\73",
            "",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\10\73\1\u0170\16\73",
            "",
            "\1\u0171",
            "\1\u0172",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\u0176",
            "",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\20\73\1\u0177\6\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\5\73\1\u0178\21\73",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\5\73\1\u0179\21\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\12\73\1\u017a\14\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\13\73\1\u017b\13\73",
            "",
            "",
            "",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\u0082\1\73\1\67\20\73\1\u017d\6\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\3\73\1\u017e\23\73",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\25\73\1\u0180\1\73",
            "\1\u0181",
            "\1\u0182",
            "",
            "",
            "",
            "\1\u0183",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\73\1\u0184\25\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\12\73\1\u0185\14\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\12\73\1\u0186\14\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\20\73\1\u0187\6\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\1\u0188\26\73",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u018f",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\3\73\1\u0191\23\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\3\73\1\u0192\23\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\5\73\1\u0193\21\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\u0194\27\73",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "\1\u0196",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\12\73\1\u019a\14\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\1\u019b\1\73\1\67\27\73",
            "",
            "\1\u019c",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\3\73\1\u019f\23\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\10\73\1\u01a0\1\73\1\u00c5\14"+
            "\73",
            "\1\u01a1",
            "",
            "",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\10\73\1\u01a3\16\73",
            "\1\u01a4",
            "\1\uffff",
            "\1\70\16\uffff\12\73\5\uffff\1\70\1\uffff\2\73\1\72\27\73\4"+
            "\uffff\1\73\1\uffff\2\73\1\67\27\73",
            "\1\u01a7",
            "",
            "\1\uffff",
            "\1\u01a9",
            "",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4\1\uffff\1\u01b5",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( ORE | ANDE | CLASS | DEF | IF | NOTE | ELSE | WHILE | TRY | CATCH | END | SELF | NIL | TRUE | FALSE | IS | A | TYPE | OF | THAN | GREATER | EQUAL | TO | ISTO | CAN | THE | OET | GTT | LTT | ETT | ISATYPEOF | MAKE | OFTHIS | EPLUS | EADD | EMINUS | ESUBTRACT | EMULTIPLY | EDIVIDE | USING | THISCAN | THIS | WHICHISTO | WHICH | IT | ALSO | DOTHEFOLLOWING | YOU | WITH | THEN | TRYTO | INCREASING | DECREASING | TIMES | INCREMENTING | BY | FROM | STARTING | MAKETHECOMPUTER | CALCULATE | UNTIL | UNTILL | ENDMETHODCALL | GET | KEEPDOINGTHEFOLLOWING | KEEPDOINGTHEFOLLOWINGG | ENDD | NUMBER | STRING | NAME | CONSTANT | SNAME | SEMICOLON | COLON | DOT | COMMA | OPEN_PARENT | CLOSE_PARENT | AT | EQ | LE | GE | NE | LT | GT | PLUS | MINUS | MUL | DIV | MOD | AND | OR | NOT | ASSIGN | COMMENT | NEWLINE | WHITESPACE | DOTSPACE );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_53 = input.LA(1);

                         
                        int index26_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_53==' ') && ((!methodMode))) {s = 126;}

                        else if ( (LA26_53=='!'||LA26_53=='?') ) {s = 56;}

                        else if ( (LA26_53=='c') ) {s = 55;}

                        else if ( (LA26_53=='C') ) {s = 58;}

                        else if ( ((LA26_53>='0' && LA26_53<='9')||(LA26_53>='A' && LA26_53<='B')||(LA26_53>='D' && LA26_53<='Z')||LA26_53=='_'||(LA26_53>='a' && LA26_53<='b')||(LA26_53>='d' && LA26_53<='z')) ) {s = 59;}

                        else s = 127;

                         
                        input.seek(index26_53);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_279 = input.LA(1);

                         
                        int index26_279 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_279==' ') && ((!methodMode))) {s = 324;}

                        else if ( (LA26_279=='!'||LA26_279=='?') ) {s = 56;}

                        else if ( (LA26_279=='c') ) {s = 55;}

                        else if ( (LA26_279=='C') ) {s = 58;}

                        else if ( ((LA26_279>='0' && LA26_279<='9')||(LA26_279>='A' && LA26_279<='B')||(LA26_279>='D' && LA26_279<='Z')||LA26_279=='_'||(LA26_279>='a' && LA26_279<='b')||(LA26_279>='d' && LA26_279<='z')) ) {s = 59;}

                        else s = 325;

                         
                        input.seek(index26_279);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_310 = input.LA(1);

                         
                        int index26_310 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_310=='d') && ((!methodMode))) {s = 350;}

                         
                        input.seek(index26_310);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_350 = input.LA(1);

                         
                        int index26_350 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_350=='o') && ((!methodMode))) {s = 374;}

                         
                        input.seek(index26_350);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA26_399 = input.LA(1);

                         
                        int index26_399 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_399=='g') && ((!methodMode))) {s = 406;}

                         
                        input.seek(index26_399);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA26_406 = input.LA(1);

                         
                        int index26_406 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_406==' ') && ((!methodMode))) {s = 412;}

                         
                        input.seek(index26_406);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA26_374 = input.LA(1);

                         
                        int index26_374 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_374=='i') && ((!methodMode))) {s = 387;}

                         
                        input.seek(index26_374);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA26_387 = input.LA(1);

                         
                        int index26_387 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_387=='n') && ((!methodMode))) {s = 399;}

                         
                        input.seek(index26_387);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA26_432 = input.LA(1);

                         
                        int index26_432 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_432=='n') && ((!methodMode))) {s = 433;}

                         
                        input.seek(index26_432);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA26_431 = input.LA(1);

                         
                        int index26_431 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_431=='i') && ((!methodMode))) {s = 432;}

                         
                        input.seek(index26_431);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA26_430 = input.LA(1);

                         
                        int index26_430 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_430=='w') && ((!methodMode))) {s = 431;}

                         
                        input.seek(index26_430);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA26_429 = input.LA(1);

                         
                        int index26_429 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_429=='o') && ((!methodMode))) {s = 430;}

                         
                        input.seek(index26_429);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA26_435 = input.LA(1);

                         
                        int index26_435 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_435=='u') && ((!methodMode))) {s = 436;}

                        else if ( (LA26_435=='w') && ((!methodMode))) {s = 437;}

                         
                        input.seek(index26_435);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA26_434 = input.LA(1);

                         
                        int index26_434 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_434==' ') && ((!methodMode))) {s = 435;}

                         
                        input.seek(index26_434);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA26_433 = input.LA(1);

                         
                        int index26_433 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_433=='g') && ((!methodMode))) {s = 434;}

                         
                        input.seek(index26_433);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA26_423 = input.LA(1);

                         
                        int index26_423 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_423==' ') && ((!methodMode))) {s = 425;}

                         
                        input.seek(index26_423);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA26_420 = input.LA(1);

                         
                        int index26_420 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_420=='e') && ((!methodMode))) {s = 423;}

                         
                        input.seek(index26_420);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA26_417 = input.LA(1);

                         
                        int index26_417 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_417=='h') && ((!methodMode))) {s = 420;}

                         
                        input.seek(index26_417);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA26_412 = input.LA(1);

                         
                        int index26_412 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_412=='t') && ((!methodMode))) {s = 417;}

                         
                        input.seek(index26_412);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA26_428 = input.LA(1);

                         
                        int index26_428 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_428=='l') && ((!methodMode))) {s = 429;}

                         
                        input.seek(index26_428);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA26_427 = input.LA(1);

                         
                        int index26_427 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_427=='l') && ((!methodMode))) {s = 428;}

                         
                        input.seek(index26_427);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA26_426 = input.LA(1);

                         
                        int index26_426 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_426=='o') && ((!methodMode))) {s = 427;}

                         
                        input.seek(index26_426);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA26_425 = input.LA(1);

                         
                        int index26_425 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_425=='f') && ((!methodMode))) {s = 426;}

                         
                        input.seek(index26_425);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA26_347 = input.LA(1);

                         
                        int index26_347 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 372;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_347);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA26_355 = input.LA(1);

                         
                        int index26_355 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 371;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_355);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA26_396 = input.LA(1);

                         
                        int index26_396 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 398;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_396);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA26_325 = input.LA(1);

                         
                        int index26_325 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 360;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_325);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA26_291 = input.LA(1);

                         
                        int index26_291 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 287;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index26_291);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA26_261 = input.LA(1);

                         
                        int index26_261 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 309;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index26_261);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA26_280 = input.LA(1);

                         
                        int index26_280 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 326;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_280);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA26_148 = input.LA(1);

                         
                        int index26_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 216;}

                        else if ( (true) ) {s = 32;}

                         
                        input.seek(index26_148);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA26_265 = input.LA(1);

                         
                        int index26_265 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 311;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_265);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA26_408 = input.LA(1);

                         
                        int index26_408 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 413;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_408);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA26_409 = input.LA(1);

                         
                        int index26_409 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 414;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_409);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA26_286 = input.LA(1);

                         
                        int index26_286 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 331;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_286);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA26_193 = input.LA(1);

                         
                        int index26_193 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 262;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_193);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA26_296 = input.LA(1);

                         
                        int index26_296 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 338;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_296);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA26_332 = input.LA(1);

                         
                        int index26_332 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 361;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_332);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA26_418 = input.LA(1);

                         
                        int index26_418 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 421;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_418);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA26_400 = input.LA(1);

                         
                        int index26_400 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 407;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_400);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA26_394 = input.LA(1);

                         
                        int index26_394 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 405;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_394);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA26_249 = input.LA(1);

                         
                        int index26_249 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 298;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_249);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA26_349 = input.LA(1);

                         
                        int index26_349 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 373;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_349);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA26_422 = input.LA(1);

                         
                        int index26_422 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 424;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_422);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA26_362 = input.LA(1);

                         
                        int index26_362 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 380;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_362);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA26_143 = input.LA(1);

                         
                        int index26_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 147;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_143);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA26_206 = input.LA(1);

                         
                        int index26_206 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 269;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_206);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA26_312 = input.LA(1);

                         
                        int index26_312 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 351;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_312);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA26_199 = input.LA(1);

                         
                        int index26_199 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 264;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_199);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA26_127 = input.LA(1);

                         
                        int index26_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 195;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_127);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA26_284 = input.LA(1);

                         
                        int index26_284 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 329;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_284);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA26_129 = input.LA(1);

                         
                        int index26_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 196;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_129);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA26_263 = input.LA(1);

                         
                        int index26_263 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_263==' ') && ((!methodMode))) {s = 310;}

                        else s = 32;

                         
                        input.seek(index26_263);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA26_285 = input.LA(1);

                         
                        int index26_285 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 330;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_285);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA26_383 = input.LA(1);

                         
                        int index26_383 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 395;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_383);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA26_283 = input.LA(1);

                         
                        int index26_283 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 328;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_283);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA26_337 = input.LA(1);

                         
                        int index26_337 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 365;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_337);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA26_145 = input.LA(1);

                         
                        int index26_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 214;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_145);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA26_63 = input.LA(1);

                         
                        int index26_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 97;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_63);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA26_313 = input.LA(1);

                         
                        int index26_313 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 352;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_313);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA26_222 = input.LA(1);

                         
                        int index26_222 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 220;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_222);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA26_292 = input.LA(1);

                         
                        int index26_292 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 334;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_292);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA26_218 = input.LA(1);

                         
                        int index26_218 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 274;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_218);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA26_217 = input.LA(1);

                         
                        int index26_217 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 273;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_217);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA26_275 = input.LA(1);

                         
                        int index26_275 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 319;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_275);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA26_323 = input.LA(1);

                         
                        int index26_323 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 327;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_323);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA26_228 = input.LA(1);

                         
                        int index26_228 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 282;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_228);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA26_200 = input.LA(1);

                         
                        int index26_200 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 247;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_200);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA26_302 = input.LA(1);

                         
                        int index26_302 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 343;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_302);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA26_393 = input.LA(1);

                         
                        int index26_393 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 397;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_393);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA26_341 = input.LA(1);

                         
                        int index26_341 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 367;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_341);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA26_299 = input.LA(1);

                         
                        int index26_299 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 340;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_299);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA26_233 = input.LA(1);

                         
                        int index26_233 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 238;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_233);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA26_163 = input.LA(1);

                         
                        int index26_163 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 169;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_163);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA26_322 = input.LA(1);

                         
                        int index26_322 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 359;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_322);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA26_204 = input.LA(1);

                         
                        int index26_204 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((!methodMode)) ) {s = 250;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index26_204);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA26_308 = input.LA(1);

                         
                        int index26_308 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_308==' ') && ((!methodMode))) {s = 348;}

                        else if ( (LA26_308=='!'||LA26_308=='?') ) {s = 56;}

                        else if ( (LA26_308=='c') ) {s = 55;}

                        else if ( (LA26_308=='C') ) {s = 58;}

                        else if ( ((LA26_308>='0' && LA26_308<='9')||(LA26_308>='A' && LA26_308<='B')||(LA26_308>='D' && LA26_308<='Z')||LA26_308=='_'||(LA26_308>='a' && LA26_308<='b')||(LA26_308>='d' && LA26_308<='z')) ) {s = 59;}

                        else s = 349;

                         
                        input.seek(index26_308);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA26_144 = input.LA(1);

                         
                        int index26_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_144=='t') && ((!methodMode))) {s = 209;}

                        else if ( (LA26_144=='g') && ((!methodMode))) {s = 210;}

                        else if ( (LA26_144=='l') && ((!methodMode))) {s = 211;}

                        else if ( (LA26_144=='e') && ((!methodMode))) {s = 212;}

                        else if ( (LA26_144=='a') && ((!methodMode))) {s = 213;}

                         
                        input.seek(index26_144);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA26_170 = input.LA(1);

                         
                        int index26_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_170==' ') && ((!methodMode))) {s = 240;}

                        else s = 32;

                         
                        input.seek(index26_170);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA26_109 = input.LA(1);

                         
                        int index26_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_109==' ') && ((!methodMode))) {s = 189;}

                        else s = 32;

                         
                        input.seek(index26_109);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA26_69 = input.LA(1);

                         
                        int index26_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_69==' ') && ((!methodMode))) {s = 144;}

                        else if ( (LA26_69=='!'||LA26_69=='?') ) {s = 56;}

                        else if ( (LA26_69=='c') ) {s = 55;}

                        else if ( (LA26_69=='C') ) {s = 58;}

                        else if ( ((LA26_69>='0' && LA26_69<='9')||(LA26_69>='A' && LA26_69<='B')||(LA26_69>='D' && LA26_69<='Z')||LA26_69=='_'||(LA26_69>='a' && LA26_69<='b')||(LA26_69>='d' && LA26_69<='z')) ) {s = 59;}

                        else s = 145;

                         
                        input.seek(index26_69);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA26_257 = input.LA(1);

                         
                        int index26_257 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_257==' ') && ((!methodMode))) {s = 305;}

                        else s = 32;

                         
                        input.seek(index26_257);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA26_239 = input.LA(1);

                         
                        int index26_239 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_239==' ') && ((!methodMode))) {s = 290;}

                        else if ( ((LA26_239>='0' && LA26_239<='9')||(LA26_239>='A' && LA26_239<='Z')||LA26_239=='_'||(LA26_239>='a' && LA26_239<='z')) ) {s = 32;}

                        else s = 291;

                         
                        input.seek(index26_239);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA26_54 = input.LA(1);

                         
                        int index26_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_54==' ') && ((!methodMode))) {s = 128;}

                        else if ( (LA26_54=='!'||LA26_54=='?') ) {s = 56;}

                        else if ( (LA26_54=='c') ) {s = 55;}

                        else if ( (LA26_54=='C') ) {s = 58;}

                        else if ( ((LA26_54>='0' && LA26_54<='9')||(LA26_54>='A' && LA26_54<='B')||(LA26_54>='D' && LA26_54<='Z')||LA26_54=='_'||(LA26_54>='a' && LA26_54<='b')||(LA26_54>='d' && LA26_54<='z')) ) {s = 59;}

                        else s = 129;

                         
                        input.seek(index26_54);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}