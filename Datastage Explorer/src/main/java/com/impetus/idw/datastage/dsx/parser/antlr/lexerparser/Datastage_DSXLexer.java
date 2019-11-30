// $ANTLR 3.4 /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g 2019-08-08 15:01:59

package com.impetus.idw.datastage.dsx.parser.antlr.lexerparser;

import java.util.LinkedList;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.FailedPredicateException;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;

@SuppressWarnings({ "all", "warnings", "unchecked" })
public class Datastage_DSXLexer extends Lexer {
  
  public static final int EOF = -1;
  
  public static final int AND_OP = 4;
  
  public static final int ANYCHAR = 5;
  
  public static final int APPROXIMATE_NUM_LIT = 6;
  
  public static final int BIT_STRING_LIT = 7;
  
  public static final int BODY_DELIMETER = 8;
  
  public static final int CARRET_OPERATOR_PART = 9;
  
  public static final int CHAR_STRING = 10;
  
  public static final int CHAR_STRING_PERL = 11;
  
  public static final int COLON = 12;
  
  public static final int COMMA = 13;
  
  public static final int COMMENT = 14;
  
  public static final int DATASTAGE_BEGIN_DSBPBINARY = 15;
  
  public static final int DATASTAGE_BEGIN_DSBPSOURCE = 16;
  
  public static final int DATASTAGE_BEGIN_DSDATACONNECTIONS = 17;
  
  public static final int DATASTAGE_BEGIN_DSEXECJOB = 18;
  
  public static final int DATASTAGE_BEGIN_DSJOB = 19;
  
  public static final int DATASTAGE_BEGIN_DSPARAMETERSETS = 20;
  
  public static final int DATASTAGE_BEGIN_DSRECORD = 21;
  
  public static final int DATASTAGE_BEGIN_DSROUTINES = 22;
  
  public static final int DATASTAGE_BEGIN_DSSCRIPT = 23;
  
  public static final int DATASTAGE_BEGIN_DSSUBRECORD = 24;
  
  public static final int DATASTAGE_BEGIN_DSTABLEDEFS = 25;
  
  public static final int DATASTAGE_BEGIN_DSUBINARY = 26;
  
  public static final int DATASTAGE_BEGIN_HEADER = 27;
  
  public static final int DATASTAGE_DESCRIPTION_BODY = 28;
  
  public static final int DATASTAGE_DESCRIPTION_WRAPPER = 29;
  
  public static final int DATASTAGE_END_DSBPBINARY = 30;
  
  public static final int DATASTAGE_END_DSBPSOURCE = 31;
  
  public static final int DATASTAGE_END_DSDATACONNECTIONS = 32;
  
  public static final int DATASTAGE_END_DSEXECJOB = 33;
  
  public static final int DATASTAGE_END_DSJOB = 34;
  
  public static final int DATASTAGE_END_DSPARAMETERSETS = 35;
  
  public static final int DATASTAGE_END_DSRECORD = 36;
  
  public static final int DATASTAGE_END_DSROUTINES = 37;
  
  public static final int DATASTAGE_END_DSSCRIPT = 38;
  
  public static final int DATASTAGE_END_DSSUBRECORD = 39;
  
  public static final int DATASTAGE_END_DSTABLEDEFS = 40;
  
  public static final int DATASTAGE_END_DSUBINARY = 41;
  
  public static final int DATASTAGE_END_HEADER = 42;
  
  public static final int DELIMITED_ID = 43;
  
  public static final int DOUBLE_PERIOD = 44;
  
  public static final int EXACT_NUM_LIT = 45;
  
  public static final int EXCLAMATION_OPERATOR_PART = 46;
  
  public static final int FOR_NOTATION = 47;
  
  public static final int GREATER_THAN_OP = 48;
  
  public static final int GREATER_THAN_OR_EQUALS_OP = 49;
  
  public static final int HEX_STRING_LIT = 50;
  
  public static final int INTRODUCER = 51;
  
  public static final int LEFT_BRACKET = 52;
  
  public static final int LEFT_CURLY_BRACKET = 53;
  
  public static final int LEFT_PAREN = 54;
  
  public static final int LESS_THAN_OP = 55;
  
  public static final int LESS_THAN_OR_EQUALS_OP = 56;
  
  public static final int MINUS_SIGN = 57;
  
  public static final int NATIONAL_CHAR_STRING_LIT = 58;
  
  public static final int NEWLINE = 59;
  
  public static final int NOT_EQUAL_OP = 60;
  
  public static final int OR_OP = 61;
  
  public static final int PARAMERTERIZED_VARIABLE = 62;
  
  public static final int PERIOD = 63;
  
  public static final int PROMPT = 64;
  
  public static final int QS_ANGLE = 65;
  
  public static final int QS_BRACE = 66;
  
  public static final int QS_BRACK = 67;
  
  public static final int QS_OTHER = 68;
  
  public static final int QS_OTHER_CH = 69;
  
  public static final int QS_PAREN = 70;
  
  public static final int QUESTION_MARK = 71;
  
  public static final int QUOTE = 72;
  
  public static final int REGULAR_ID = 73;
  
  public static final int REGULAR_ID_2 = 74;
  
  public static final int RIGHT_BRACKET = 75;
  
  public static final int RIGHT_CURLY_BRACKET = 76;
  
  public static final int RIGHT_PAREN = 77;
  
  public static final int SCRIPT_VARIABLE = 78;
  
  public static final int SEMICOLON = 79;
  
  public static final int SEPARATOR = 80;
  
  public static final int SIMPLE_LETTER = 81;
  
  public static final int SOLIDUS = 82;
  
  public static final int SPACE = 83;
  
  public static final int TERNARY_IF_OPERATOR = 84;
  
  public static final int TILDE_OPERATOR_PART = 85;
  
  public static final int UNDERSCORE = 86;
  
  public static final int UNSIGNED_INTEGER = 87;
  
  public static final int VERTICAL_BAR = 88;
  
  public static final int ZV = 89;
  
  // buffer (queue) to hold the emit()'d tokens
  private LinkedList<Token> tokenBuffer = new LinkedList<Token>();
  
  public void emit(Token t) {
    tokenBuffer.add(t);
  }
  
  private void advanceInput() {
    state.tokenStartCharIndex = input.index();
    state.tokenStartCharPositionInLine = input.getCharPositionInLine();
    state.tokenStartLine = input.getLine();
  }
  
  /**
   * Return a token from this source; i.e., match a token on the char stream.
   */
  public Token nextToken() {
    while (true) {
      if (tokenBuffer.size() == 0) {
        state.token = null;
        state.channel = Token.DEFAULT_CHANNEL;
        state.tokenStartCharIndex = input.index();
        state.tokenStartCharPositionInLine = input.getCharPositionInLine();
        state.tokenStartLine = input.getLine();
        state.text = null;
        if (input.LA(1) == CharStream.EOF) {
          return Token.EOF_TOKEN;
        }
        try {
          int m = input.mark();
          state.backtracking = 1;
          state.failed = false;
          mTokens();
          state.backtracking = 0;
          
          if (state.failed) {
            input.rewind(m);
            input.consume();
          }
          else {
            emit();
          }
        } catch (RecognitionException re) {
          // shouldn't happen in backtracking mode, but...
          reportError(re);
          recover(re);
        }
      }
      else {
        Token result = tokenBuffer.poll();
        if (result == Token.SKIP_TOKEN || result.getType() == Token.INVALID_TOKEN_TYPE || result == null) {
          // discard
          // SKIP & INVALID
          // tokens
          continue;
        }
        return result;
      }
    }
  }
  
  // delegates
  // delegators
  public Lexer[] getDelegates() {
    return new Lexer[] {};
  }
  
  public Datastage_DSXLexer() {
  }
  
  public Datastage_DSXLexer(CharStream input) {
    this(input, new RecognizerSharedState());
  }
  
  public Datastage_DSXLexer(CharStream input, RecognizerSharedState state) {
    super(input, state);
  }
  
  public String getGrammarFileName() {
    return "/home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g";
  }
  
  // $ANTLR start "DATASTAGE_DESCRIPTION_WRAPPER"
  public final void mDATASTAGE_DESCRIPTION_WRAPPER() throws RecognitionException {
    try {
      int _type = DATASTAGE_DESCRIPTION_WRAPPER;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:78:3:
      // ( '=+=+=+=' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:78:5:
      // '=+=+=+='
      {
        match("=+=+=+=");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_DESCRIPTION_WRAPPER"
  
  // $ANTLR start "FOR_NOTATION"
  public final void mFOR_NOTATION() throws RecognitionException {
    try {
      int _type = FOR_NOTATION;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:82:3:
      // ( UNSIGNED_INTEGER '..' UNSIGNED_INTEGER )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:83:3:
      // UNSIGNED_INTEGER '..' UNSIGNED_INTEGER
      {
        mUNSIGNED_INTEGER();
        
        state.type = UNSIGNED_INTEGER;
        emit();
        advanceInput();
        
        match("..");
        
        state.type = DOUBLE_PERIOD;
        emit();
        advanceInput();
        
        mUNSIGNED_INTEGER();
        
        state.type = UNSIGNED_INTEGER;
        emit();
        advanceInput();
        _channel = HIDDEN;
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "FOR_NOTATION"
  
  // $ANTLR start "NATIONAL_CHAR_STRING_LIT"
  public final void mNATIONAL_CHAR_STRING_LIT() throws RecognitionException {
    try {
      int _type = NATIONAL_CHAR_STRING_LIT;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:105:3:
      // ( ( 'N' | 'n' ) '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\'' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:106:3:
      // ( 'N' | 'n' ) '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\''
      {
        if (input.LA(1) == 'N' || input.LA(1) == 'n') {
          input.consume();
        }
        else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }
        
        match('\'');
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:111:3:
        // ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )*
        loop1: do {
          int alt1 = 4;
          int LA1_0 = input.LA(1);
          
          if ((LA1_0 == '\'')) {
            int LA1_1 = input.LA(2);
            
            if ((LA1_1 == '\'')) {
              alt1 = 2;
            }
            
          }
          else if (((LA1_0 >= '\u0000' && LA1_0 <= '\t') || (LA1_0 >= '\u000B' && LA1_0 <= '\f')
              || (LA1_0 >= '\u000E' && LA1_0 <= '&') || (LA1_0 >= '(' && LA1_0 <= '\uFFFF'))) {
            alt1 = 1;
          }
          else if ((LA1_0 == '\n' || LA1_0 == '\r')) {
            alt1 = 3;
          }
          
          switch (alt1) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:112:5:
            // ~ ( '\\'' | '\\r' | '\\n' )
            {
              if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t') || (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
                  || (input.LA(1) >= '\u000E' && input.LA(1) <= '&')
                  || (input.LA(1) >= '(' && input.LA(1) <= '\uFFFF')) {
                input.consume();
              }
              else {
                MismatchedSetException mse = new MismatchedSetException(null, input);
                recover(mse);
                throw mse;
              }
              
            }
              break;
            case 2:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:117:7:
            // '\\'' '\\''
            {
              match('\'');
              
              match('\'');
              
            }
              break;
            case 3:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:118:7:
            // NEWLINE
            {
              mNEWLINE();
              
            }
              break;
            
            default:
              break loop1;
          }
        }
        while (true);
        
        match('\'');
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "NATIONAL_CHAR_STRING_LIT"
  
  // $ANTLR start "BIT_STRING_LIT"
  public final void mBIT_STRING_LIT() throws RecognitionException {
    try {
      int _type = BIT_STRING_LIT;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:124:3:
      // ( ( 'B' | 'b' ) ( '\\'' ( '0' | '1' )* '\\'' ( SEPARATOR )? )+ )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:125:3:
      // ( 'B' | 'b' ) ( '\\'' ( '0' | '1' )* '\\'' ( SEPARATOR )? )+
      {
        if (input.LA(1) == 'B' || input.LA(1) == 'b') {
          input.consume();
        }
        else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:129:3:
        // ( '\\'' ( '0' | '1' )* '\\'' ( SEPARATOR )? )+
        int cnt4 = 0;
        loop4: do {
          int alt4 = 2;
          int LA4_0 = input.LA(1);
          
          if ((LA4_0 == '\'')) {
            alt4 = 1;
          }
          
          switch (alt4) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:130:5:
            // '\\'' ( '0' | '1' )* '\\'' ( SEPARATOR )?
            {
              match('\'');
              
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:131:5:
              // ( '0' | '1' )*
              loop2: do {
                int alt2 = 2;
                int LA2_0 = input.LA(1);
                
                if (((LA2_0 >= '0' && LA2_0 <= '1'))) {
                  alt2 = 1;
                }
                
                switch (alt2) {
                  case 1:
                  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:
                  {
                    if ((input.LA(1) >= '0' && input.LA(1) <= '1')) {
                      input.consume();
                    }
                    else {
                      MismatchedSetException mse = new MismatchedSetException(null, input);
                      recover(mse);
                      throw mse;
                    }
                    
                  }
                    break;
                  
                  default:
                    break loop2;
                }
              }
              while (true);
              
              match('\'');
              
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:135:10:
              // ( SEPARATOR )?
              int alt3 = 2;
              int LA3_0 = input.LA(1);
              
              if (((LA3_0 >= '\t' && LA3_0 <= '\n') || LA3_0 == '\r' || LA3_0 == ' ' || LA3_0 == '-' || LA3_0 == '/')) {
                alt3 = 1;
              }
              switch (alt3) {
                case 1:
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:135:10:
                // SEPARATOR
                {
                  mSEPARATOR();
                  
                }
                  break;
                
              }
              
            }
              break;
            
            default:
              if (cnt4 >= 1)
                break loop4;
              EarlyExitException eee = new EarlyExitException(4, input);
              throw eee;
          }
          cnt4++;
        }
        while (true);
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "BIT_STRING_LIT"
  
  // $ANTLR start "HEX_STRING_LIT"
  public final void mHEX_STRING_LIT() throws RecognitionException {
    try {
      int _type = HEX_STRING_LIT;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:140:3:
      // ( ( 'X' | 'x' ) ( '\\'' ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )* '\\'' ( SEPARATOR )? )+ )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:141:3:
      // ( 'X' | 'x' ) ( '\\'' ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )* '\\'' ( SEPARATOR )? )+
      {
        if (input.LA(1) == 'X' || input.LA(1) == 'x') {
          input.consume();
        }
        else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:145:3:
        // ( '\\'' ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )* '\\'' ( SEPARATOR )? )+
        int cnt7 = 0;
        loop7: do {
          int alt7 = 2;
          int LA7_0 = input.LA(1);
          
          if ((LA7_0 == '\'')) {
            alt7 = 1;
          }
          
          switch (alt7) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:146:5:
            // '\\'' ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )* '\\'' ( SEPARATOR )?
            {
              match('\'');
              
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:147:5:
              // ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )*
              loop5: do {
                int alt5 = 2;
                int LA5_0 = input.LA(1);
                
                if (((LA5_0 >= '0' && LA5_0 <= '9') || (LA5_0 >= 'A' && LA5_0 <= 'F')
                    || (LA5_0 >= 'a' && LA5_0 <= 'f'))) {
                  alt5 = 1;
                }
                
                switch (alt5) {
                  case 1:
                  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:
                  {
                    if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'F')
                        || (input.LA(1) >= 'a' && input.LA(1) <= 'f')) {
                      input.consume();
                    }
                    else {
                      MismatchedSetException mse = new MismatchedSetException(null, input);
                      recover(mse);
                      throw mse;
                    }
                    
                  }
                    break;
                  
                  default:
                    break loop5;
                }
              }
              while (true);
              
              match('\'');
              
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:152:10:
              // ( SEPARATOR )?
              int alt6 = 2;
              int LA6_0 = input.LA(1);
              
              if (((LA6_0 >= '\t' && LA6_0 <= '\n') || LA6_0 == '\r' || LA6_0 == ' ' || LA6_0 == '-' || LA6_0 == '/')) {
                alt6 = 1;
              }
              switch (alt6) {
                case 1:
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:152:10:
                // SEPARATOR
                {
                  mSEPARATOR();
                  
                }
                  break;
                
              }
              
            }
              break;
            
            default:
              if (cnt7 >= 1)
                break loop7;
              EarlyExitException eee = new EarlyExitException(7, input);
              throw eee;
          }
          cnt7++;
        }
        while (true);
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "HEX_STRING_LIT"
  
  // $ANTLR start "PERIOD"
  public final void mPERIOD() throws RecognitionException {
    try {
      int _type = PERIOD;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:157:3:
      // ( '.' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:158:3:
      // '.'
      {
        match('.');
        
        if ((char) input.LA(1) == '.') {
          input.consume();
          _type = DOUBLE_PERIOD;
        }
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "PERIOD"
  
  // $ANTLR start "EXACT_NUM_LIT"
  public final void mEXACT_NUM_LIT() throws RecognitionException {
    try {
      int _type = EXACT_NUM_LIT;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:168:3:
      // ( ( UNSIGNED_INTEGER ( '.' ( UNSIGNED_INTEGER )? |) ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? | '.'
      // UNSIGNED_INTEGER ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? ) ( 'D' | 'd' | 'f' | 'F' )? )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:169:3:
      // ( UNSIGNED_INTEGER ( '.' ( UNSIGNED_INTEGER )? |) ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? | '.'
      // UNSIGNED_INTEGER ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? ) ( 'D' | 'd' | 'f' | 'F' )?
      {
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:169:3:
        // ( UNSIGNED_INTEGER ( '.' ( UNSIGNED_INTEGER )? |) ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? | '.'
        // UNSIGNED_INTEGER ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )? )
        int alt14 = 2;
        int LA14_0 = input.LA(1);
        
        if (((LA14_0 >= '0' && LA14_0 <= '9'))) {
          alt14 = 1;
        }
        else if ((LA14_0 == '.')) {
          alt14 = 2;
        }
        else {
          NoViableAltException nvae = new NoViableAltException("", 14, 0, input);
          
          throw nvae;
          
        }
        switch (alt14) {
          case 1:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:170:5:
          // UNSIGNED_INTEGER ( '.' ( UNSIGNED_INTEGER )? |) ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )?
          {
            mUNSIGNED_INTEGER();
            
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:171:5:
            // ( '.' ( UNSIGNED_INTEGER )? |)
            int alt9 = 2;
            int LA9_0 = input.LA(1);
            
            if ((LA9_0 == '.')) {
              alt9 = 1;
            }
            else {
              alt9 = 2;
            }
            switch (alt9) {
              case 1:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:172:7:
              // '.' ( UNSIGNED_INTEGER )?
              {
                match('.');
                
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:172:11:
                // ( UNSIGNED_INTEGER )?
                int alt8 = 2;
                int LA8_0 = input.LA(1);
                
                if (((LA8_0 >= '0' && LA8_0 <= '9'))) {
                  alt8 = 1;
                }
                switch (alt8) {
                  case 1:
                  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:172:11:
                  // UNSIGNED_INTEGER
                  {
                    mUNSIGNED_INTEGER();
                    
                  }
                    break;
                  
                }
                
              }
                break;
              case 2:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:174:9:
              {
                
                _type = UNSIGNED_INTEGER;
                
              }
                break;
              
            }
            
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:178:5:
            // ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )?
            int alt11 = 2;
            int LA11_0 = input.LA(1);
            
            if ((LA11_0 == 'E' || LA11_0 == 'e')) {
              alt11 = 1;
            }
            switch (alt11) {
              case 1:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:179:7:
              // ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER
              {
                if (input.LA(1) == 'E' || input.LA(1) == 'e') {
                  input.consume();
                }
                else {
                  MismatchedSetException mse = new MismatchedSetException(null, input);
                  recover(mse);
                  throw mse;
                }
                
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:183:7:
                // ( '+' | '-' )?
                int alt10 = 2;
                int LA10_0 = input.LA(1);
                
                if ((LA10_0 == '+' || LA10_0 == '-')) {
                  alt10 = 1;
                }
                switch (alt10) {
                  case 1:
                  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:
                  {
                    if (input.LA(1) == '+' || input.LA(1) == '-') {
                      input.consume();
                    }
                    else {
                      MismatchedSetException mse = new MismatchedSetException(null, input);
                      recover(mse);
                      throw mse;
                    }
                    
                  }
                    break;
                  
                }
                
                mUNSIGNED_INTEGER();
                
                _type = APPROXIMATE_NUM_LIT;
                
              }
                break;
              
            }
            
          }
            break;
          case 2:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:192:7:
          // '.' UNSIGNED_INTEGER ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )?
          {
            match('.');
            
            mUNSIGNED_INTEGER();
            
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:193:5:
            // ( ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER )?
            int alt13 = 2;
            int LA13_0 = input.LA(1);
            
            if ((LA13_0 == 'E' || LA13_0 == 'e')) {
              alt13 = 1;
            }
            switch (alt13) {
              case 1:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:194:7:
              // ( 'E' | 'e' ) ( '+' | '-' )? UNSIGNED_INTEGER
              {
                if (input.LA(1) == 'E' || input.LA(1) == 'e') {
                  input.consume();
                }
                else {
                  MismatchedSetException mse = new MismatchedSetException(null, input);
                  recover(mse);
                  throw mse;
                }
                
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:198:7:
                // ( '+' | '-' )?
                int alt12 = 2;
                int LA12_0 = input.LA(1);
                
                if ((LA12_0 == '+' || LA12_0 == '-')) {
                  alt12 = 1;
                }
                switch (alt12) {
                  case 1:
                  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:
                  {
                    if (input.LA(1) == '+' || input.LA(1) == '-') {
                      input.consume();
                    }
                    else {
                      MismatchedSetException mse = new MismatchedSetException(null, input);
                      recover(mse);
                      throw mse;
                    }
                    
                  }
                    break;
                  
                }
                
                mUNSIGNED_INTEGER();
                
                _type = APPROXIMATE_NUM_LIT;
                
              }
                break;
              
            }
            
          }
            break;
          
        }
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:208:3:
        // ( 'D' | 'd' | 'f' | 'F' )?
        int alt15 = 2;
        int LA15_0 = input.LA(1);
        
        if ((LA15_0 == 'D' || LA15_0 == 'F' || LA15_0 == 'd' || LA15_0 == 'f')) {
          alt15 = 1;
        }
        switch (alt15) {
          case 1:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:
          {
            if (input.LA(1) == 'D' || input.LA(1) == 'F' || input.LA(1) == 'd' || input.LA(1) == 'f') {
              input.consume();
            }
            else {
              MismatchedSetException mse = new MismatchedSetException(null, input);
              recover(mse);
              throw mse;
            }
            
          }
            break;
          
        }
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "EXACT_NUM_LIT"
  
  // $ANTLR start "CHAR_STRING"
  public final void mCHAR_STRING() throws RecognitionException {
    try {
      int _type = CHAR_STRING;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:217:3:
      // ( '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\'' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:218:3:
      // '\\'' ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )* '\\''
      {
        match('\'');
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:219:3:
        // ( options {greedy=true; } :~ ( '\\'' | '\\r' | '\\n' ) | '\\'' '\\'' | NEWLINE )*
        loop16: do {
          int alt16 = 4;
          int LA16_0 = input.LA(1);
          
          if ((LA16_0 == '\'')) {
            int LA16_1 = input.LA(2);
            
            if ((LA16_1 == '\'')) {
              alt16 = 2;
            }
            
          }
          else if (((LA16_0 >= '\u0000' && LA16_0 <= '\t') || (LA16_0 >= '\u000B' && LA16_0 <= '\f')
              || (LA16_0 >= '\u000E' && LA16_0 <= '&') || (LA16_0 >= '(' && LA16_0 <= '\uFFFF'))) {
            alt16 = 1;
          }
          else if ((LA16_0 == '\n' || LA16_0 == '\r')) {
            alt16 = 3;
          }
          
          switch (alt16) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:220:5:
            // ~ ( '\\'' | '\\r' | '\\n' )
            {
              if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t') || (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
                  || (input.LA(1) >= '\u000E' && input.LA(1) <= '&')
                  || (input.LA(1) >= '(' && input.LA(1) <= '\uFFFF')) {
                input.consume();
              }
              else {
                MismatchedSetException mse = new MismatchedSetException(null, input);
                recover(mse);
                throw mse;
              }
              
            }
              break;
            case 2:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:225:7:
            // '\\'' '\\''
            {
              match('\'');
              
              match('\'');
              
            }
              break;
            case 3:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:226:7:
            // NEWLINE
            {
              mNEWLINE();
              
            }
              break;
            
            default:
              break loop16;
          }
        }
        while (true);
        
        match('\'');
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "CHAR_STRING"
  
  // $ANTLR start "CHAR_STRING_PERL"
  public final void mCHAR_STRING_PERL() throws RecognitionException {
    try {
      int _type = CHAR_STRING_PERL;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:232:3:
      // ( ( 'q' | 'Q' ) ( QS_ANGLE | QS_BRACE | QS_BRACK | QS_PAREN | QS_OTHER ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:233:3:
      // ( 'q' | 'Q' ) ( QS_ANGLE | QS_BRACE | QS_BRACK | QS_PAREN | QS_OTHER )
      {
        if (input.LA(1) == 'Q' || input.LA(1) == 'q') {
          input.consume();
        }
        else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:237:3:
        // ( QS_ANGLE | QS_BRACE | QS_BRACK | QS_PAREN | QS_OTHER )
        int alt17 = 5;
        int LA17_0 = input.LA(1);
        
        if ((LA17_0 == '\'')) {
          int LA17_1 = input.LA(2);
          
          if ((LA17_1 == '<')) {
            alt17 = 1;
          }
          else if ((LA17_1 == '{')) {
            alt17 = 2;
          }
          else if ((LA17_1 == '[')) {
            alt17 = 3;
          }
          else if ((LA17_1 == '(')) {
            alt17 = 4;
          }
          else if (((LA17_1 >= '\u0000' && LA17_1 <= '\b') || (LA17_1 >= '\u000B' && LA17_1 <= '\f')
              || (LA17_1 >= '\u000E' && LA17_1 <= '\u001F') || (LA17_1 >= '!' && LA17_1 <= '\'')
              || (LA17_1 >= ')' && LA17_1 <= ';') || (LA17_1 >= '=' && LA17_1 <= 'Z')
              || (LA17_1 >= '\\' && LA17_1 <= 'z') || (LA17_1 >= '|' && LA17_1 <= '\uFFFF'))) {
            alt17 = 5;
          }
          else {
            NoViableAltException nvae = new NoViableAltException("", 17, 1, input);
            
            throw nvae;
            
          }
        }
        else {
          NoViableAltException nvae = new NoViableAltException("", 17, 0, input);
          
          throw nvae;
          
        }
        switch (alt17) {
          case 1:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:238:5:
          // QS_ANGLE
          {
            mQS_ANGLE();
            
          }
            break;
          case 2:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:239:7:
          // QS_BRACE
          {
            mQS_BRACE();
            
          }
            break;
          case 3:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:240:7:
          // QS_BRACK
          {
            mQS_BRACK();
            
          }
            break;
          case 4:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:241:7:
          // QS_PAREN
          {
            mQS_PAREN();
            
          }
            break;
          case 5:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:242:7:
          // QS_OTHER
          {
            mQS_OTHER();
            
          }
            break;
          
        }
        
        _type = CHAR_STRING;
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "CHAR_STRING_PERL"
  
  // $ANTLR start "QUOTE"
  public final void mQUOTE() throws RecognitionException {
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:252:3:
      // ( '\\'' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:253:3:
      // '\\''
      {
        match('\'');
        
      }
      
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "QUOTE"
  
  // $ANTLR start "QS_ANGLE"
  public final void mQS_ANGLE() throws RecognitionException {
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:258:3:
      // ( QUOTE '<' ( options {greedy=false; } : . )* '>' QUOTE )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:259:3:
      // QUOTE '<' ( options {greedy=false; } : . )* '>' QUOTE
      {
        mQUOTE();
        
        match('<');
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:259:13:
        // ( options {greedy=false; } : . )*
        loop18: do {
          int alt18 = 2;
          int LA18_0 = input.LA(1);
          
          if ((LA18_0 == '>')) {
            int LA18_1 = input.LA(2);
            
            if ((LA18_1 == '\'')) {
              alt18 = 2;
            }
            else if (((LA18_1 >= '\u0000' && LA18_1 <= '&') || (LA18_1 >= '(' && LA18_1 <= '\uFFFF'))) {
              alt18 = 1;
            }
            
          }
          else if (((LA18_0 >= '\u0000' && LA18_0 <= '=') || (LA18_0 >= '?' && LA18_0 <= '\uFFFF'))) {
            alt18 = 1;
          }
          
          switch (alt18) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:259:39:
            // .
            {
              matchAny();
              
            }
              break;
            
            default:
              break loop18;
          }
        }
        while (true);
        
        match('>');
        
        mQUOTE();
        
      }
      
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "QS_ANGLE"
  
  // $ANTLR start "QS_BRACE"
  public final void mQS_BRACE() throws RecognitionException {
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:264:3:
      // ( QUOTE '{' ( options {greedy=false; } : . )* '}' QUOTE )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:265:3:
      // QUOTE '{' ( options {greedy=false; } : . )* '}' QUOTE
      {
        mQUOTE();
        
        match('{');
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:265:13:
        // ( options {greedy=false; } : . )*
        loop19: do {
          int alt19 = 2;
          int LA19_0 = input.LA(1);
          
          if ((LA19_0 == '}')) {
            int LA19_1 = input.LA(2);
            
            if ((LA19_1 == '\'')) {
              alt19 = 2;
            }
            else if (((LA19_1 >= '\u0000' && LA19_1 <= '&') || (LA19_1 >= '(' && LA19_1 <= '\uFFFF'))) {
              alt19 = 1;
            }
            
          }
          else if (((LA19_0 >= '\u0000' && LA19_0 <= '|') || (LA19_0 >= '~' && LA19_0 <= '\uFFFF'))) {
            alt19 = 1;
          }
          
          switch (alt19) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:265:39:
            // .
            {
              matchAny();
              
            }
              break;
            
            default:
              break loop19;
          }
        }
        while (true);
        
        match('}');
        
        mQUOTE();
        
      }
      
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "QS_BRACE"
  
  // $ANTLR start "QS_BRACK"
  public final void mQS_BRACK() throws RecognitionException {
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:270:3:
      // ( QUOTE '[' ( options {greedy=false; } : . )* ']' QUOTE )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:271:3:
      // QUOTE '[' ( options {greedy=false; } : . )* ']' QUOTE
      {
        mQUOTE();
        
        match('[');
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:271:13:
        // ( options {greedy=false; } : . )*
        loop20: do {
          int alt20 = 2;
          int LA20_0 = input.LA(1);
          
          if ((LA20_0 == ']')) {
            int LA20_1 = input.LA(2);
            
            if ((LA20_1 == '\'')) {
              alt20 = 2;
            }
            else if (((LA20_1 >= '\u0000' && LA20_1 <= '&') || (LA20_1 >= '(' && LA20_1 <= '\uFFFF'))) {
              alt20 = 1;
            }
            
          }
          else if (((LA20_0 >= '\u0000' && LA20_0 <= '\\') || (LA20_0 >= '^' && LA20_0 <= '\uFFFF'))) {
            alt20 = 1;
          }
          
          switch (alt20) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:271:39:
            // .
            {
              matchAny();
              
            }
              break;
            
            default:
              break loop20;
          }
        }
        while (true);
        
        match(']');
        
        mQUOTE();
        
      }
      
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "QS_BRACK"
  
  // $ANTLR start "QS_PAREN"
  public final void mQS_PAREN() throws RecognitionException {
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:276:3:
      // ( QUOTE '(' ( options {greedy=false; } : . )* ')' QUOTE )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:277:3:
      // QUOTE '(' ( options {greedy=false; } : . )* ')' QUOTE
      {
        mQUOTE();
        
        match('(');
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:277:13:
        // ( options {greedy=false; } : . )*
        loop21: do {
          int alt21 = 2;
          int LA21_0 = input.LA(1);
          
          if ((LA21_0 == ')')) {
            int LA21_1 = input.LA(2);
            
            if ((LA21_1 == '\'')) {
              alt21 = 2;
            }
            else if (((LA21_1 >= '\u0000' && LA21_1 <= '&') || (LA21_1 >= '(' && LA21_1 <= '\uFFFF'))) {
              alt21 = 1;
            }
            
          }
          else if (((LA21_0 >= '\u0000' && LA21_0 <= '(') || (LA21_0 >= '*' && LA21_0 <= '\uFFFF'))) {
            alt21 = 1;
          }
          
          switch (alt21) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:277:39:
            // .
            {
              matchAny();
              
            }
              break;
            
            default:
              break loop21;
          }
        }
        while (true);
        
        match(')');
        
        mQUOTE();
        
      }
      
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "QS_PAREN"
  
  // $ANTLR start "QS_OTHER_CH"
  public final void mQS_OTHER_CH() throws RecognitionException {
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:282:3:
      // (~ ( '<' | '{' | '[' | '(' | ' ' | '\\t' | '\\n' | '\\r' ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:
      {
        if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\b') || (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
            || (input.LA(1) >= '\u000E' && input.LA(1) <= '\u001F') || (input.LA(1) >= '!' && input.LA(1) <= '\'')
            || (input.LA(1) >= ')' && input.LA(1) <= ';') || (input.LA(1) >= '=' && input.LA(1) <= 'Z')
            || (input.LA(1) >= '\\' && input.LA(1) <= 'z') || (input.LA(1) >= '|' && input.LA(1) <= '\uFFFF')) {
          input.consume();
        }
        else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }
        
      }
      
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "QS_OTHER_CH"
  
  // $ANTLR start "QS_OTHER"
  public final void mQS_OTHER() throws RecognitionException {
    try {
      CommonToken delimiter = null;
      
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:297:3:
      // ( QUOTE delimiter= QS_OTHER_CH ({...}? => . )* ({...}? => . ) QUOTE )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:298:3:
      // QUOTE delimiter= QS_OTHER_CH ({...}? => . )* ({...}? => . ) QUOTE
      {
        mQUOTE();
        
        int delimiterStart1256 = getCharIndex();
        int delimiterStartLine1256 = getLine();
        int delimiterStartCharPos1256 = getCharPositionInLine();
        mQS_OTHER_CH();
        delimiter = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, delimiterStart1256,
            getCharIndex() - 1);
        delimiter.setLine(delimiterStartLine1256);
        delimiter.setCharPositionInLine(delimiterStartCharPos1256);
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:299:3:
        // ({...}? => . )*
        loop22: do {
          int alt22 = 2;
          int LA22_0 = input.LA(1);
          
          if (((LA22_0 >= '\u0000' && LA22_0 <= '\uFFFF'))
              && (((input.LT(1) == (delimiter != null ? delimiter.getText() : null).charAt(0) && input.LT(2) == '\'')
                  || (input.LT(1) != (delimiter != null ? delimiter.getText() : null).charAt(0)
                      || (input.LT(1) == (delimiter != null ? delimiter.getText() : null).charAt(0)
                          && input.LT(2) != '\''))))) {
            int LA22_1 = input.LA(2);
            
            if ((LA22_1 == '\'')
                && (((input.LT(1) == (delimiter != null ? delimiter.getText() : null).charAt(0) && input.LT(2) == '\'')
                    || (input.LT(1) != (delimiter != null ? delimiter.getText() : null).charAt(0)
                        || (input.LT(1) == (delimiter != null ? delimiter.getText() : null).charAt(0)
                            && input.LT(2) != '\''))))) {
              int LA22_2 = input.LA(3);
              
              if (((LA22_2 >= '\u0000' && LA22_2 <= '\uFFFF'))
                  && ((input.LT(1) != (delimiter != null ? delimiter.getText() : null).charAt(0)
                      || (input.LT(1) == (delimiter != null ? delimiter.getText() : null).charAt(0)
                          && input.LT(2) != '\'')))) {
                alt22 = 1;
              }
              
            }
            else if (((LA22_1 >= '\u0000' && LA22_1 <= '&') || (LA22_1 >= '(' && LA22_1 <= '\uFFFF'))
                && ((input.LT(1) != (delimiter != null ? delimiter.getText() : null).charAt(0)
                    || (input.LT(1) == (delimiter != null ? delimiter.getText() : null).charAt(0)
                        && input.LT(2) != '\'')))) {
              alt22 = 1;
            }
            
          }
          
          switch (alt22) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:299:5:
            // {...}? => .
            {
              if (!((input.LT(1) != (delimiter != null ? delimiter.getText() : null).charAt(0)
                  || (input.LT(1) == (delimiter != null ? delimiter.getText() : null).charAt(0)
                      && input.LT(2) != '\'')))) {
                throw new FailedPredicateException(input, "QS_OTHER",
                    "input.LT(1) != $delimiter.text.charAt(0) || (input.LT(1) == $delimiter.text.charAt(0) && input.LT(2) != '\\'')");
              }
              
              matchAny();
              
            }
              break;
            
            default:
              break loop22;
          }
        }
        while (true);
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:300:3:
        // ({...}? => . )
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:300:5:
        // {...}? => .
        {
          if (!((input.LT(1) == (delimiter != null ? delimiter.getText() : null).charAt(0) && input.LT(2) == '\''))) {
            throw new FailedPredicateException(input, "QS_OTHER",
                "input.LT(1) == $delimiter.text.charAt(0) && input.LT(2) == '\\''");
          }
          
          matchAny();
          
        }
        
        mQUOTE();
        
      }
      
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "QS_OTHER"
  
  // $ANTLR start "DELIMITED_ID"
  public final void mDELIMITED_ID() throws RecognitionException {
    try {
      int _type = DELIMITED_ID;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:304:3:
      // ( '\"' (~ ( '\"' | '\\r' | '\\n' ) | '\\\"' )* '\"' | '`' ( options {greedy=true; } :~ ( '\\`' | '\\r' | '\\n'
      // ) | '\\`' '\\`' | NEWLINE )* '`' )
      int alt25 = 2;
      int LA25_0 = input.LA(1);
      
      if ((LA25_0 == '\"')) {
        alt25 = 1;
      }
      else if ((LA25_0 == '`')) {
        alt25 = 2;
      }
      else {
        NoViableAltException nvae = new NoViableAltException("", 25, 0, input);
        
        throw nvae;
        
      }
      switch (alt25) {
        case 1:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:305:3:
        // '\"' (~ ( '\"' | '\\r' | '\\n' ) | '\\\"' )* '\"'
        {
          match('\"');
          
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:306:3:
          // (~ ( '\"' | '\\r' | '\\n' ) | '\\\"' )*
          loop23: do {
            int alt23 = 2;
            int LA23_0 = input.LA(1);
            
            if ((LA23_0 == '\"')) {
              int LA23_1 = input.LA(2);
              
              if (((LA23_1 >= '\u0000' && LA23_1 <= '\t') || (LA23_1 >= '\u000B' && LA23_1 <= '\f')
                  || (LA23_1 >= '\u000E' && LA23_1 <= '\uFFFF'))) {
                alt23 = 1;
              }
              
            }
            else if (((LA23_0 >= '\u0000' && LA23_0 <= '\t') || (LA23_0 >= '\u000B' && LA23_0 <= '\f')
                || (LA23_0 >= '\u000E' && LA23_0 <= '!') || (LA23_0 >= '#' && LA23_0 <= '\uFFFF'))) {
              alt23 = 1;
            }
            
            switch (alt23) {
              case 1:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:
              {
                if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t') || (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
                    || (input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF')) {
                  input.consume();
                }
                else {
                  MismatchedSetException mse = new MismatchedSetException(null, input);
                  recover(mse);
                  throw mse;
                }
                
              }
                break;
              
              default:
                break loop23;
            }
          }
          while (true);
          
          match('\"');
          
        }
          break;
        case 2:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:315:5:
        // '`' ( options {greedy=true; } :~ ( '\\`' | '\\r' | '\\n' ) | '\\`' '\\`' | NEWLINE )* '`'
        {
          match('`');
          
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:316:3:
          // ( options {greedy=true; } :~ ( '\\`' | '\\r' | '\\n' ) | '\\`' '\\`' | NEWLINE )*
          loop24: do {
            int alt24 = 4;
            int LA24_0 = input.LA(1);
            
            if ((LA24_0 == '`')) {
              int LA24_1 = input.LA(2);
              
              if ((LA24_1 == '`')) {
                alt24 = 2;
              }
              
            }
            else if (((LA24_0 >= '\u0000' && LA24_0 <= '\t') || (LA24_0 >= '\u000B' && LA24_0 <= '\f')
                || (LA24_0 >= '\u000E' && LA24_0 <= '_') || (LA24_0 >= 'a' && LA24_0 <= '\uFFFF'))) {
              alt24 = 1;
            }
            else if ((LA24_0 == '\n' || LA24_0 == '\r')) {
              alt24 = 3;
            }
            
            switch (alt24) {
              case 1:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:317:5:
              // ~ ( '\\`' | '\\r' | '\\n' )
              {
                if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t') || (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
                    || (input.LA(1) >= '\u000E' && input.LA(1) <= '_')
                    || (input.LA(1) >= 'a' && input.LA(1) <= '\uFFFF')) {
                  input.consume();
                }
                else {
                  MismatchedSetException mse = new MismatchedSetException(null, input);
                  recover(mse);
                  throw mse;
                }
                
              }
                break;
              case 2:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:322:7:
              // '\\`' '\\`'
              {
                match('`');
                
                match('`');
                
              }
                break;
              case 3:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:323:7:
              // NEWLINE
              {
                mNEWLINE();
                
              }
                break;
              
              default:
                break loop24;
            }
          }
          while (true);
          
          match('`');
          
        }
          break;
        
      }
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DELIMITED_ID"
  
  // $ANTLR start "TERNARY_IF_OPERATOR"
  public final void mTERNARY_IF_OPERATOR() throws RecognitionException {
    try {
      int _type = TERNARY_IF_OPERATOR;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:329:3:
      // ( QUESTION_MARK )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:
      {
        if (input.LA(1) == '?') {
          input.consume();
        }
        else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "TERNARY_IF_OPERATOR"
  
  // $ANTLR start "LEFT_PAREN"
  public final void mLEFT_PAREN() throws RecognitionException {
    try {
      int _type = LEFT_PAREN;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:333:3:
      // ( '(' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:334:3:
      // '('
      {
        match('(');
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "LEFT_PAREN"
  
  // $ANTLR start "RIGHT_PAREN"
  public final void mRIGHT_PAREN() throws RecognitionException {
    try {
      int _type = RIGHT_PAREN;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:338:3:
      // ( ')' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:339:3:
      // ')'
      {
        match(')');
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "RIGHT_PAREN"
  
  // $ANTLR start "COMMA"
  public final void mCOMMA() throws RecognitionException {
    try {
      int _type = COMMA;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:343:3:
      // ( ',' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:344:3:
      // ','
      {
        match(',');
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "COMMA"
  
  // $ANTLR start "SOLIDUS"
  public final void mSOLIDUS() throws RecognitionException {
    try {
      int _type = SOLIDUS;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:348:3:
      // ( '/' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:349:3:
      // '/'
      {
        match('/');
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "SOLIDUS"
  
  // $ANTLR start "COLON"
  public final void mCOLON() throws RecognitionException {
    try {
      int _type = COLON;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:353:3:
      // ( ':' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:354:3:
      // ':'
      {
        match(':');
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "COLON"
  
  // $ANTLR start "SEMICOLON"
  public final void mSEMICOLON() throws RecognitionException {
    try {
      int _type = SEMICOLON;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:358:3:
      // ( ';' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:359:3:
      // ';'
      {
        match(';');
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "SEMICOLON"
  
  // $ANTLR start "LESS_THAN_OR_EQUALS_OP"
  public final void mLESS_THAN_OR_EQUALS_OP() throws RecognitionException {
    try {
      int _type = LESS_THAN_OR_EQUALS_OP;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:363:3:
      // ( '<=' | 'le' )
      int alt26 = 2;
      int LA26_0 = input.LA(1);
      
      if ((LA26_0 == '<')) {
        alt26 = 1;
      }
      else if ((LA26_0 == 'l')) {
        alt26 = 2;
      }
      else {
        NoViableAltException nvae = new NoViableAltException("", 26, 0, input);
        
        throw nvae;
        
      }
      switch (alt26) {
        case 1:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:364:3:
        // '<='
        {
          match("<=");
          
        }
          break;
        case 2:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:365:5:
        // 'le'
        {
          match("le");
          
        }
          break;
        
      }
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "LESS_THAN_OR_EQUALS_OP"
  
  // $ANTLR start "LESS_THAN_OP"
  public final void mLESS_THAN_OP() throws RecognitionException {
    try {
      int _type = LESS_THAN_OP;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:369:3:
      // ( '<' | 'lt' )
      int alt27 = 2;
      int LA27_0 = input.LA(1);
      
      if ((LA27_0 == '<')) {
        alt27 = 1;
      }
      else if ((LA27_0 == 'l')) {
        alt27 = 2;
      }
      else {
        NoViableAltException nvae = new NoViableAltException("", 27, 0, input);
        
        throw nvae;
        
      }
      switch (alt27) {
        case 1:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:370:3:
        // '<'
        {
          match('<');
          
        }
          break;
        case 2:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:371:5:
        // 'lt'
        {
          match("lt");
          
        }
          break;
        
      }
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "LESS_THAN_OP"
  
  // $ANTLR start "GREATER_THAN_OR_EQUALS_OP"
  public final void mGREATER_THAN_OR_EQUALS_OP() throws RecognitionException {
    try {
      int _type = GREATER_THAN_OR_EQUALS_OP;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:375:3:
      // ( '>=' | 'ge' )
      int alt28 = 2;
      int LA28_0 = input.LA(1);
      
      if ((LA28_0 == '>')) {
        alt28 = 1;
      }
      else if ((LA28_0 == 'g')) {
        alt28 = 2;
      }
      else {
        NoViableAltException nvae = new NoViableAltException("", 28, 0, input);
        
        throw nvae;
        
      }
      switch (alt28) {
        case 1:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:376:3:
        // '>='
        {
          match(">=");
          
        }
          break;
        case 2:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:377:5:
        // 'ge'
        {
          match("ge");
          
        }
          break;
        
      }
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "GREATER_THAN_OR_EQUALS_OP"
  
  // $ANTLR start "NOT_EQUAL_OP"
  public final void mNOT_EQUAL_OP() throws RecognitionException {
    try {
      int _type = NOT_EQUAL_OP;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:381:3:
      // ( 'not=' | '!=' | '<>' | '^=' | '~=' | 'ne' )
      int alt29 = 6;
      switch (input.LA(1)) {
        case 'n': {
          int LA29_1 = input.LA(2);
          
          if ((LA29_1 == 'o')) {
            alt29 = 1;
          }
          else if ((LA29_1 == 'e')) {
            alt29 = 6;
          }
          else {
            NoViableAltException nvae = new NoViableAltException("", 29, 1, input);
            
            throw nvae;
            
          }
        }
          break;
        case '!': {
          alt29 = 2;
        }
          break;
        case '<': {
          alt29 = 3;
        }
          break;
        case '^': {
          alt29 = 4;
        }
          break;
        case '~': {
          alt29 = 5;
        }
          break;
        default:
          NoViableAltException nvae = new NoViableAltException("", 29, 0, input);
          
          throw nvae;
          
      }
      
      switch (alt29) {
        case 1:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:382:3:
        // 'not='
        {
          match("not=");
          
        }
          break;
        case 2:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:383:5:
        // '!='
        {
          match("!=");
          
        }
          break;
        case 3:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:384:5:
        // '<>'
        {
          match("<>");
          
        }
          break;
        case 4:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:385:5:
        // '^='
        {
          match("^=");
          
        }
          break;
        case 5:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:386:5:
        // '~='
        {
          match("~=");
          
        }
          break;
        case 6:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:387:5:
        // 'ne'
        {
          match("ne");
          
        }
          break;
        
      }
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "NOT_EQUAL_OP"
  
  // $ANTLR start "CARRET_OPERATOR_PART"
  public final void mCARRET_OPERATOR_PART() throws RecognitionException {
    try {
      int _type = CARRET_OPERATOR_PART;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:391:3:
      // ( '^' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:392:3:
      // '^'
      {
        match('^');
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "CARRET_OPERATOR_PART"
  
  // $ANTLR start "TILDE_OPERATOR_PART"
  public final void mTILDE_OPERATOR_PART() throws RecognitionException {
    try {
      int _type = TILDE_OPERATOR_PART;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:396:3:
      // ()
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:397:3:
      {
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "TILDE_OPERATOR_PART"
  
  // $ANTLR start "EXCLAMATION_OPERATOR_PART"
  public final void mEXCLAMATION_OPERATOR_PART() throws RecognitionException {
    try {
      int _type = EXCLAMATION_OPERATOR_PART;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:400:3:
      // ( '!' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:401:3:
      // '!'
      {
        match('!');
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "EXCLAMATION_OPERATOR_PART"
  
  // $ANTLR start "GREATER_THAN_OP"
  public final void mGREATER_THAN_OP() throws RecognitionException {
    try {
      int _type = GREATER_THAN_OP;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:405:3:
      // ( '>' | 'gt' )
      int alt30 = 2;
      int LA30_0 = input.LA(1);
      
      if ((LA30_0 == '>')) {
        alt30 = 1;
      }
      else if ((LA30_0 == 'g')) {
        alt30 = 2;
      }
      else {
        NoViableAltException nvae = new NoViableAltException("", 30, 0, input);
        
        throw nvae;
        
      }
      switch (alt30) {
        case 1:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:406:3:
        // '>'
        {
          match('>');
          
        }
          break;
        case 2:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:407:5:
        // 'gt'
        {
          match("gt");
          
        }
          break;
        
      }
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "GREATER_THAN_OP"
  
  // $ANTLR start "QUESTION_MARK"
  public final void mQUESTION_MARK() throws RecognitionException {
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:412:3:
      // ( '?' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:413:3:
      // '?'
      {
        match('?');
        
      }
      
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "QUESTION_MARK"
  
  // $ANTLR start "OR_OP"
  public final void mOR_OP() throws RecognitionException {
    try {
      int _type = OR_OP;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:417:3:
      // ( '||' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:418:3:
      // '||'
      {
        match("||");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "OR_OP"
  
  // $ANTLR start "VERTICAL_BAR"
  public final void mVERTICAL_BAR() throws RecognitionException {
    try {
      int _type = VERTICAL_BAR;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:422:3:
      // ( '|' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:423:3:
      // '|'
      {
        match('|');
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "VERTICAL_BAR"
  
  // $ANTLR start "LEFT_BRACKET"
  public final void mLEFT_BRACKET() throws RecognitionException {
    try {
      int _type = LEFT_BRACKET;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:427:3:
      // ( '[' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:428:3:
      // '['
      {
        match('[');
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "LEFT_BRACKET"
  
  // $ANTLR start "RIGHT_BRACKET"
  public final void mRIGHT_BRACKET() throws RecognitionException {
    try {
      int _type = RIGHT_BRACKET;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:432:3:
      // ( ']' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:433:3:
      // ']'
      {
        match(']');
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "RIGHT_BRACKET"
  
  // $ANTLR start "LEFT_CURLY_BRACKET"
  public final void mLEFT_CURLY_BRACKET() throws RecognitionException {
    try {
      int _type = LEFT_CURLY_BRACKET;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:437:3:
      // ( '{' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:438:3:
      // '{'
      {
        match('{');
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "LEFT_CURLY_BRACKET"
  
  // $ANTLR start "RIGHT_CURLY_BRACKET"
  public final void mRIGHT_CURLY_BRACKET() throws RecognitionException {
    try {
      int _type = RIGHT_CURLY_BRACKET;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:442:3:
      // ( '}' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:443:3:
      // '}'
      {
        match('}');
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "RIGHT_CURLY_BRACKET"
  
  // $ANTLR start "DATASTAGE_DESCRIPTION_BODY"
  public final void mDATASTAGE_DESCRIPTION_BODY() throws RecognitionException {
    try {
      int _type = DATASTAGE_DESCRIPTION_BODY;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:448:3:
      // ( DATASTAGE_DESCRIPTION_WRAPPER ( options {greedy=false; } : . )* DATASTAGE_DESCRIPTION_WRAPPER )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:448:5:
      // DATASTAGE_DESCRIPTION_WRAPPER ( options {greedy=false; } : . )* DATASTAGE_DESCRIPTION_WRAPPER
      {
        mDATASTAGE_DESCRIPTION_WRAPPER();
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:449:5:
        // ( options {greedy=false; } : . )*
        loop31: do {
          int alt31 = 2;
          int LA31_0 = input.LA(1);
          
          if ((LA31_0 == '=')) {
            int LA31_1 = input.LA(2);
            
            if ((LA31_1 == '+')) {
              int LA31_3 = input.LA(3);
              
              if ((LA31_3 == '=')) {
                int LA31_4 = input.LA(4);
                
                if ((LA31_4 == '+')) {
                  int LA31_5 = input.LA(5);
                  
                  if ((LA31_5 == '=')) {
                    int LA31_6 = input.LA(6);
                    
                    if ((LA31_6 == '+')) {
                      int LA31_7 = input.LA(7);
                      
                      if ((LA31_7 == '=')) {
                        alt31 = 2;
                      }
                      else if (((LA31_7 >= '\u0000' && LA31_7 <= '<') || (LA31_7 >= '>' && LA31_7 <= '\uFFFF'))) {
                        alt31 = 1;
                      }
                      
                    }
                    else if (((LA31_6 >= '\u0000' && LA31_6 <= '*') || (LA31_6 >= ',' && LA31_6 <= '\uFFFF'))) {
                      alt31 = 1;
                    }
                    
                  }
                  else if (((LA31_5 >= '\u0000' && LA31_5 <= '<') || (LA31_5 >= '>' && LA31_5 <= '\uFFFF'))) {
                    alt31 = 1;
                  }
                  
                }
                else if (((LA31_4 >= '\u0000' && LA31_4 <= '*') || (LA31_4 >= ',' && LA31_4 <= '\uFFFF'))) {
                  alt31 = 1;
                }
                
              }
              else if (((LA31_3 >= '\u0000' && LA31_3 <= '<') || (LA31_3 >= '>' && LA31_3 <= '\uFFFF'))) {
                alt31 = 1;
              }
              
            }
            else if (((LA31_1 >= '\u0000' && LA31_1 <= '*') || (LA31_1 >= ',' && LA31_1 <= '\uFFFF'))) {
              alt31 = 1;
            }
            
          }
          else if (((LA31_0 >= '\u0000' && LA31_0 <= '<') || (LA31_0 >= '>' && LA31_0 <= '\uFFFF'))) {
            alt31 = 1;
          }
          
          switch (alt31) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:449:31:
            // .
            {
              matchAny();
              
            }
              break;
            
            default:
              break loop31;
          }
        }
        while (true);
        
        mDATASTAGE_DESCRIPTION_WRAPPER();
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_DESCRIPTION_BODY"
  
  // $ANTLR start "DATASTAGE_BEGIN_HEADER"
  public final void mDATASTAGE_BEGIN_HEADER() throws RecognitionException {
    try {
      int _type = DATASTAGE_BEGIN_HEADER;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:454:3:
      // ( 'BEGIN HEADER' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:454:5:
      // 'BEGIN HEADER'
      {
        match("BEGIN HEADER");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_BEGIN_HEADER"
  
  // $ANTLR start "DATASTAGE_END_HEADER"
  public final void mDATASTAGE_END_HEADER() throws RecognitionException {
    try {
      int _type = DATASTAGE_END_HEADER;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:458:3:
      // ( 'END HEADER' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:458:5:
      // 'END HEADER'
      {
        match("END HEADER");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_END_HEADER"
  
  // $ANTLR start "DATASTAGE_BEGIN_DSJOB"
  public final void mDATASTAGE_BEGIN_DSJOB() throws RecognitionException {
    try {
      int _type = DATASTAGE_BEGIN_DSJOB;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:462:3:
      // ( 'BEGIN DSJOB' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:462:5:
      // 'BEGIN DSJOB'
      {
        match("BEGIN DSJOB");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_BEGIN_DSJOB"
  
  // $ANTLR start "DATASTAGE_END_DSJOB"
  public final void mDATASTAGE_END_DSJOB() throws RecognitionException {
    try {
      int _type = DATASTAGE_END_DSJOB;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:466:3:
      // ( 'END DSJOB' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:466:5:
      // 'END DSJOB'
      {
        match("END DSJOB");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_END_DSJOB"
  
  // $ANTLR start "DATASTAGE_BEGIN_DSRECORD"
  public final void mDATASTAGE_BEGIN_DSRECORD() throws RecognitionException {
    try {
      int _type = DATASTAGE_BEGIN_DSRECORD;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:470:3:
      // ( 'BEGIN DSRECORD' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:470:5:
      // 'BEGIN DSRECORD'
      {
        match("BEGIN DSRECORD");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_BEGIN_DSRECORD"
  
  // $ANTLR start "DATASTAGE_END_DSRECORD"
  public final void mDATASTAGE_END_DSRECORD() throws RecognitionException {
    try {
      int _type = DATASTAGE_END_DSRECORD;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:474:3:
      // ( 'END DSRECORD' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:474:5:
      // 'END DSRECORD'
      {
        match("END DSRECORD");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_END_DSRECORD"
  
  // $ANTLR start "DATASTAGE_BEGIN_DSSUBRECORD"
  public final void mDATASTAGE_BEGIN_DSSUBRECORD() throws RecognitionException {
    try {
      int _type = DATASTAGE_BEGIN_DSSUBRECORD;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:478:3:
      // ( 'BEGIN DSSUBRECORD' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:478:5:
      // 'BEGIN DSSUBRECORD'
      {
        match("BEGIN DSSUBRECORD");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_BEGIN_DSSUBRECORD"
  
  // $ANTLR start "DATASTAGE_END_DSSUBRECORD"
  public final void mDATASTAGE_END_DSSUBRECORD() throws RecognitionException {
    try {
      int _type = DATASTAGE_END_DSSUBRECORD;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:482:3:
      // ( 'END DSSUBRECORD' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:482:5:
      // 'END DSSUBRECORD'
      {
        match("END DSSUBRECORD");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_END_DSSUBRECORD"
  
  // $ANTLR start "DATASTAGE_BEGIN_DSTABLEDEFS"
  public final void mDATASTAGE_BEGIN_DSTABLEDEFS() throws RecognitionException {
    try {
      int _type = DATASTAGE_BEGIN_DSTABLEDEFS;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:486:3:
      // ( 'BEGIN DSTABLEDEFS' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:486:5:
      // 'BEGIN DSTABLEDEFS'
      {
        match("BEGIN DSTABLEDEFS");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_BEGIN_DSTABLEDEFS"
  
  // $ANTLR start "DATASTAGE_END_DSTABLEDEFS"
  public final void mDATASTAGE_END_DSTABLEDEFS() throws RecognitionException {
    try {
      int _type = DATASTAGE_END_DSTABLEDEFS;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:490:3:
      // ( 'END DSTABLEDEFS' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:490:5:
      // 'END DSTABLEDEFS'
      {
        match("END DSTABLEDEFS");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_END_DSTABLEDEFS"
  
  // $ANTLR start "DATASTAGE_BEGIN_DSEXECJOB"
  public final void mDATASTAGE_BEGIN_DSEXECJOB() throws RecognitionException {
    try {
      int _type = DATASTAGE_BEGIN_DSEXECJOB;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:493:3:
      // ( 'BEGIN DSEXECJOB' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:493:5:
      // 'BEGIN DSEXECJOB'
      {
        match("BEGIN DSEXECJOB");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_BEGIN_DSEXECJOB"
  
  // $ANTLR start "DATASTAGE_END_DSEXECJOB"
  public final void mDATASTAGE_END_DSEXECJOB() throws RecognitionException {
    try {
      int _type = DATASTAGE_END_DSEXECJOB;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:497:3:
      // ( 'END DSEXECJOB' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:497:5:
      // 'END DSEXECJOB'
      {
        match("END DSEXECJOB");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_END_DSEXECJOB"
  
  // $ANTLR start "DATASTAGE_BEGIN_DSBPSOURCE"
  public final void mDATASTAGE_BEGIN_DSBPSOURCE() throws RecognitionException {
    try {
      int _type = DATASTAGE_BEGIN_DSBPSOURCE;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:501:3:
      // ( 'BEGIN DSBPSOURCE' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:501:5:
      // 'BEGIN DSBPSOURCE'
      {
        match("BEGIN DSBPSOURCE");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_BEGIN_DSBPSOURCE"
  
  // $ANTLR start "DATASTAGE_END_DSBPSOURCE"
  public final void mDATASTAGE_END_DSBPSOURCE() throws RecognitionException {
    try {
      int _type = DATASTAGE_END_DSBPSOURCE;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:505:3:
      // ( 'END DSBPSOURCE' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:505:5:
      // 'END DSBPSOURCE'
      {
        match("END DSBPSOURCE");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_END_DSBPSOURCE"
  
  // $ANTLR start "DATASTAGE_BEGIN_DSBPBINARY"
  public final void mDATASTAGE_BEGIN_DSBPBINARY() throws RecognitionException {
    try {
      int _type = DATASTAGE_BEGIN_DSBPBINARY;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:509:3:
      // ( 'BEGIN DSBPBINARY' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:509:5:
      // 'BEGIN DSBPBINARY'
      {
        match("BEGIN DSBPBINARY");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_BEGIN_DSBPBINARY"
  
  // $ANTLR start "DATASTAGE_END_DSBPBINARY"
  public final void mDATASTAGE_END_DSBPBINARY() throws RecognitionException {
    try {
      int _type = DATASTAGE_END_DSBPBINARY;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:513:3:
      // ( 'END DSBPBINARY' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:513:5:
      // 'END DSBPBINARY'
      {
        match("END DSBPBINARY");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_END_DSBPBINARY"
  
  // $ANTLR start "DATASTAGE_BEGIN_DSROUTINES"
  public final void mDATASTAGE_BEGIN_DSROUTINES() throws RecognitionException {
    try {
      int _type = DATASTAGE_BEGIN_DSROUTINES;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:517:3:
      // ( 'BEGIN DSROUTINES' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:517:5:
      // 'BEGIN DSROUTINES'
      {
        match("BEGIN DSROUTINES");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_BEGIN_DSROUTINES"
  
  // $ANTLR start "DATASTAGE_END_DSROUTINES"
  public final void mDATASTAGE_END_DSROUTINES() throws RecognitionException {
    try {
      int _type = DATASTAGE_END_DSROUTINES;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:521:3:
      // ( 'END DSROUTINES' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:521:5:
      // 'END DSROUTINES'
      {
        match("END DSROUTINES");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_END_DSROUTINES"
  
  // $ANTLR start "DATASTAGE_BEGIN_DSDATACONNECTIONS"
  public final void mDATASTAGE_BEGIN_DSDATACONNECTIONS() throws RecognitionException {
    try {
      int _type = DATASTAGE_BEGIN_DSDATACONNECTIONS;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:525:3:
      // ( 'BEGIN DSDATACONNECTIONS' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:525:5:
      // 'BEGIN DSDATACONNECTIONS'
      {
        match("BEGIN DSDATACONNECTIONS");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_BEGIN_DSDATACONNECTIONS"
  
  // $ANTLR start "DATASTAGE_END_DSDATACONNECTIONS"
  public final void mDATASTAGE_END_DSDATACONNECTIONS() throws RecognitionException {
    try {
      int _type = DATASTAGE_END_DSDATACONNECTIONS;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:529:3:
      // ( 'END DSDATACONNECTIONS' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:529:5:
      // 'END DSDATACONNECTIONS'
      {
        match("END DSDATACONNECTIONS");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_END_DSDATACONNECTIONS"
  
  // $ANTLR start "DATASTAGE_BEGIN_DSUBINARY"
  public final void mDATASTAGE_BEGIN_DSUBINARY() throws RecognitionException {
    try {
      int _type = DATASTAGE_BEGIN_DSUBINARY;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:533:3:
      // ( 'BEGIN DSUBINARY' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:533:5:
      // 'BEGIN DSUBINARY'
      {
        match("BEGIN DSUBINARY");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_BEGIN_DSUBINARY"
  
  // $ANTLR start "DATASTAGE_END_DSUBINARY"
  public final void mDATASTAGE_END_DSUBINARY() throws RecognitionException {
    try {
      int _type = DATASTAGE_END_DSUBINARY;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:537:3:
      // ( 'END DSUBINARY' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:537:5:
      // 'END DSUBINARY'
      {
        match("END DSUBINARY");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_END_DSUBINARY"
  
  // $ANTLR start "DATASTAGE_BEGIN_DSPARAMETERSETS"
  public final void mDATASTAGE_BEGIN_DSPARAMETERSETS() throws RecognitionException {
    try {
      int _type = DATASTAGE_BEGIN_DSPARAMETERSETS;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:541:3:
      // ( 'BEGIN DSPARAMETERSETS' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:541:5:
      // 'BEGIN DSPARAMETERSETS'
      {
        match("BEGIN DSPARAMETERSETS");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_BEGIN_DSPARAMETERSETS"
  
  // $ANTLR start "DATASTAGE_END_DSPARAMETERSETS"
  public final void mDATASTAGE_END_DSPARAMETERSETS() throws RecognitionException {
    try {
      int _type = DATASTAGE_END_DSPARAMETERSETS;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:545:3:
      // ( 'END DSPARAMETERSETS' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:545:5:
      // 'END DSPARAMETERSETS'
      {
        match("END DSPARAMETERSETS");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_END_DSPARAMETERSETS"
  
  // $ANTLR start "DATASTAGE_BEGIN_DSSCRIPT"
  public final void mDATASTAGE_BEGIN_DSSCRIPT() throws RecognitionException {
    try {
      int _type = DATASTAGE_BEGIN_DSSCRIPT;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:549:3:
      // ( 'BEGIN DSSCRIPT' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:549:5:
      // 'BEGIN DSSCRIPT'
      {
        match("BEGIN DSSCRIPT");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_BEGIN_DSSCRIPT"
  
  // $ANTLR start "DATASTAGE_END_DSSCRIPT"
  public final void mDATASTAGE_END_DSSCRIPT() throws RecognitionException {
    try {
      int _type = DATASTAGE_END_DSSCRIPT;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:553:3:
      // ( 'END DSSCRIPT' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:553:5:
      // 'END DSSCRIPT'
      {
        match("END DSSCRIPT");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DATASTAGE_END_DSSCRIPT"
  
  // $ANTLR start "AND_OP"
  public final void mAND_OP() throws RecognitionException {
    try {
      int _type = AND_OP;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:557:2:
      // ( '&&' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:557:4:
      // '&&'
      {
        match("&&");
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "AND_OP"
  
  // $ANTLR start "INTRODUCER"
  public final void mINTRODUCER() throws RecognitionException {
    try {
      int _type = INTRODUCER;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:561:3:
      // ( '_' ( SEPARATOR )? )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:562:3:
      // '_' ( SEPARATOR )?
      {
        match('_');
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:562:7:
        // ( SEPARATOR )?
        int alt32 = 2;
        int LA32_0 = input.LA(1);
        
        if (((LA32_0 >= '\t' && LA32_0 <= '\n') || LA32_0 == '\r' || LA32_0 == ' ' || LA32_0 == '-' || LA32_0 == '/')) {
          alt32 = 1;
        }
        switch (alt32) {
          case 1:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:562:8:
          // SEPARATOR
          {
            mSEPARATOR();
            
            _type = UNDERSCORE;
            
          }
            break;
          
        }
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "INTRODUCER"
  
  // $ANTLR start "SEPARATOR"
  public final void mSEPARATOR() throws RecognitionException {
    try {
      int _type = SEPARATOR;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:569:3:
      // ( COMMENT | ( SPACE | NEWLINE )+ )
      int alt34 = 2;
      int LA34_0 = input.LA(1);
      
      if ((LA34_0 == '-' || LA34_0 == '/')) {
        alt34 = 1;
      }
      else if (((LA34_0 >= '\t' && LA34_0 <= '\n') || LA34_0 == '\r' || LA34_0 == ' ')) {
        alt34 = 2;
      }
      else {
        NoViableAltException nvae = new NoViableAltException("", 34, 0, input);
        
        throw nvae;
        
      }
      switch (alt34) {
        case 1:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:570:3:
        // COMMENT
        {
          mCOMMENT();
          
          _channel = HIDDEN;
          
        }
          break;
        case 2:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:575:3:
        // ( SPACE | NEWLINE )+
        {
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:575:3:
          // ( SPACE | NEWLINE )+
          int cnt33 = 0;
          loop33: do {
            int alt33 = 3;
            int LA33_0 = input.LA(1);
            
            if ((LA33_0 == '\t' || LA33_0 == ' ')) {
              alt33 = 1;
            }
            else if ((LA33_0 == '\n' || LA33_0 == '\r')) {
              alt33 = 2;
            }
            
            switch (alt33) {
              case 1:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:576:5:
              // SPACE
              {
                mSPACE();
                
              }
                break;
              case 2:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:577:7:
              // NEWLINE
              {
                mNEWLINE();
                
              }
                break;
              
              default:
                if (cnt33 >= 1)
                  break loop33;
                EarlyExitException eee = new EarlyExitException(33, input);
                throw eee;
            }
            cnt33++;
          }
          while (true);
          
          _channel = HIDDEN;
          
        }
          break;
        
      }
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "SEPARATOR"
  
  // $ANTLR start "SIMPLE_LETTER"
  public final void mSIMPLE_LETTER() throws RecognitionException {
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:587:3:
      // ( 'a' .. 'z' | 'A' .. 'Z' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:
      {
        if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z') || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
          input.consume();
        }
        else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }
        
      }
      
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "SIMPLE_LETTER"
  
  // $ANTLR start "UNSIGNED_INTEGER"
  public final void mUNSIGNED_INTEGER() throws RecognitionException {
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:594:3:
      // ( ( '0' .. '9' )+ )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:595:3:
      // ( '0' .. '9' )+
      {
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:595:3:
        // ( '0' .. '9' )+
        int cnt35 = 0;
        loop35: do {
          int alt35 = 2;
          int LA35_0 = input.LA(1);
          
          if (((LA35_0 >= '0' && LA35_0 <= '9'))) {
            alt35 = 1;
          }
          
          switch (alt35) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:
            {
              if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                input.consume();
              }
              else {
                MismatchedSetException mse = new MismatchedSetException(null, input);
                recover(mse);
                throw mse;
              }
              
            }
              break;
            
            default:
              if (cnt35 >= 1)
                break loop35;
              EarlyExitException eee = new EarlyExitException(35, input);
              throw eee;
          }
          cnt35++;
        }
        while (true);
        
      }
      
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "UNSIGNED_INTEGER"
  
  // $ANTLR start "COMMENT"
  public final void mCOMMENT() throws RecognitionException {
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:600:3:
      // ( '--' | '//' (~ ( '\\r' | '\\n' ) )* ( NEWLINE | EOF ) | '/*' ( options {greedy=false; } : . )* '*/' )
      int alt39 = 3;
      int LA39_0 = input.LA(1);
      
      if ((LA39_0 == '-')) {
        alt39 = 1;
      }
      else if ((LA39_0 == '/')) {
        int LA39_2 = input.LA(2);
        
        if ((LA39_2 == '/')) {
          alt39 = 2;
        }
        else if ((LA39_2 == '*')) {
          alt39 = 3;
        }
        else {
          NoViableAltException nvae = new NoViableAltException("", 39, 2, input);
          
          throw nvae;
          
        }
      }
      else {
        NoViableAltException nvae = new NoViableAltException("", 39, 0, input);
        
        throw nvae;
        
      }
      switch (alt39) {
        case 1:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:601:3:
        // '--'
        {
          match("--");
          
        }
          break;
        case 2:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:602:5:
        // '//' (~ ( '\\r' | '\\n' ) )* ( NEWLINE | EOF )
        {
          match("//");
          
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:603:3:
          // (~ ( '\\r' | '\\n' ) )*
          loop36: do {
            int alt36 = 2;
            int LA36_0 = input.LA(1);
            
            if (((LA36_0 >= '\u0000' && LA36_0 <= '\t') || (LA36_0 >= '\u000B' && LA36_0 <= '\f')
                || (LA36_0 >= '\u000E' && LA36_0 <= '\uFFFF'))) {
              alt36 = 1;
            }
            
            switch (alt36) {
              case 1:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:
              {
                if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t') || (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
                    || (input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF')) {
                  input.consume();
                }
                else {
                  MismatchedSetException mse = new MismatchedSetException(null, input);
                  recover(mse);
                  throw mse;
                }
                
              }
                break;
              
              default:
                break loop36;
            }
          }
          while (true);
          
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:609:3:
          // ( NEWLINE | EOF )
          int alt37 = 2;
          int LA37_0 = input.LA(1);
          
          if ((LA37_0 == '\n' || LA37_0 == '\r')) {
            alt37 = 1;
          }
          else {
            alt37 = 2;
          }
          switch (alt37) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:610:5:
            // NEWLINE
            {
              mNEWLINE();
              
            }
              break;
            case 2:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:611:7:
            // EOF
            {
              match(EOF);
              
            }
              break;
            
          }
          
        }
          break;
        case 3:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:613:5:
        // '/*' ( options {greedy=false; } : . )* '*/'
        {
          match("/*");
          
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:613:10:
          // ( options {greedy=false; } : . )*
          loop38: do {
            int alt38 = 2;
            int LA38_0 = input.LA(1);
            
            if ((LA38_0 == '*')) {
              int LA38_1 = input.LA(2);
              
              if ((LA38_1 == '/')) {
                alt38 = 2;
              }
              else if (((LA38_1 >= '\u0000' && LA38_1 <= '.') || (LA38_1 >= '0' && LA38_1 <= '\uFFFF'))) {
                alt38 = 1;
              }
              
            }
            else if (((LA38_0 >= '\u0000' && LA38_0 <= ')') || (LA38_0 >= '+' && LA38_0 <= '\uFFFF'))) {
              alt38 = 1;
            }
            
            switch (alt38) {
              case 1:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:613:36:
              // .
              {
                matchAny();
                
              }
                break;
              
              default:
                break loop38;
            }
          }
          while (true);
          
          match("*/");
          
        }
          break;
        
      }
      
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "COMMENT"
  
  // $ANTLR start "PROMPT"
  public final void mPROMPT() throws RecognitionException {
    try {
      int _type = PROMPT;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:617:3:
      // ( 'prompt' SPACE (~ ( '\\r' | '\\n' ) )* ( NEWLINE | EOF ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:618:3:
      // 'prompt' SPACE (~ ( '\\r' | '\\n' ) )* ( NEWLINE | EOF )
      {
        match("prompt");
        
        mSPACE();
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:619:3:
        // (~ ( '\\r' | '\\n' ) )*
        loop40: do {
          int alt40 = 2;
          int LA40_0 = input.LA(1);
          
          if (((LA40_0 >= '\u0000' && LA40_0 <= '\t') || (LA40_0 >= '\u000B' && LA40_0 <= '\f')
              || (LA40_0 >= '\u000E' && LA40_0 <= '\uFFFF'))) {
            alt40 = 1;
          }
          
          switch (alt40) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:
            {
              if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t') || (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
                  || (input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF')) {
                input.consume();
              }
              else {
                MismatchedSetException mse = new MismatchedSetException(null, input);
                recover(mse);
                throw mse;
              }
              
            }
              break;
            
            default:
              break loop40;
          }
        }
        while (true);
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:625:3:
        // ( NEWLINE | EOF )
        int alt41 = 2;
        int LA41_0 = input.LA(1);
        
        if ((LA41_0 == '\n' || LA41_0 == '\r')) {
          alt41 = 1;
        }
        else {
          alt41 = 2;
        }
        switch (alt41) {
          case 1:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:626:5:
          // NEWLINE
          {
            mNEWLINE();
            
          }
            break;
          case 2:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:627:7:
          // EOF
          {
            match(EOF);
            
          }
            break;
          
        }
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "PROMPT"
  
  // $ANTLR start "NEWLINE"
  public final void mNEWLINE() throws RecognitionException {
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:633:3:
      // ( '\\r' ( options {greedy=true; } : '\\n' )? | '\\n' )
      int alt43 = 2;
      int LA43_0 = input.LA(1);
      
      if ((LA43_0 == '\r')) {
        alt43 = 1;
      }
      else if ((LA43_0 == '\n')) {
        alt43 = 2;
      }
      else {
        NoViableAltException nvae = new NoViableAltException("", 43, 0, input);
        
        throw nvae;
        
      }
      switch (alt43) {
        case 1:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:634:3:
        // '\\r' ( options {greedy=true; } : '\\n' )?
        {
          match('\r');
          
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:634:8:
          // ( options {greedy=true; } : '\\n' )?
          int alt42 = 2;
          int LA42_0 = input.LA(1);
          
          if ((LA42_0 == '\n')) {
            alt42 = 1;
          }
          switch (alt42) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:634:33:
            // '\\n'
            {
              match('\n');
              
            }
              break;
            
          }
          
        }
          break;
        case 2:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:635:5:
        // '\\n'
        {
          match('\n');
          
        }
          break;
        
      }
      
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "NEWLINE"
  
  // $ANTLR start "SPACE"
  public final void mSPACE() throws RecognitionException {
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:640:3:
      // ( ' ' | '\\t' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:
      {
        if (input.LA(1) == '\t' || input.LA(1) == ' ') {
          input.consume();
        }
        else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }
        
      }
      
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "SPACE"
  
  // $ANTLR start "APPROXIMATE_NUM_LIT"
  public final void mAPPROXIMATE_NUM_LIT() throws RecognitionException {
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:646:20:
      // ()
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:646:22:
      {
      }
      
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "APPROXIMATE_NUM_LIT"
  
  // $ANTLR start "MINUS_SIGN"
  public final void mMINUS_SIGN() throws RecognitionException {
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:649:11:
      // ()
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:649:13:
      {
      }
      
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "MINUS_SIGN"
  
  // $ANTLR start "UNDERSCORE"
  public final void mUNDERSCORE() throws RecognitionException {
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:652:11:
      // ()
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:652:13:
      {
      }
      
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "UNDERSCORE"
  
  // $ANTLR start "DOUBLE_PERIOD"
  public final void mDOUBLE_PERIOD() throws RecognitionException {
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:655:14:
      // ()
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:655:16:
      {
      }
      
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "DOUBLE_PERIOD"
  
  // $ANTLR start "REGULAR_ID"
  public final void mREGULAR_ID() throws RecognitionException {
    try {
      int _type = REGULAR_ID;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:658:3:
      // ( ( SIMPLE_LETTER | '_' | '#' | '0' .. '9' ) ( SIMPLE_LETTER | '$' | '_' | '#' | '0' .. '9' | '-' )* )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:659:3:
      // ( SIMPLE_LETTER | '_' | '#' | '0' .. '9' ) ( SIMPLE_LETTER | '$' | '_' | '#' | '0' .. '9' | '-' )*
      {
        if (input.LA(1) == '#' || (input.LA(1) >= '0' && input.LA(1) <= '9')
            || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_'
            || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
          input.consume();
        }
        else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          recover(mse);
          throw mse;
        }
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:665:3:
        // ( SIMPLE_LETTER | '$' | '_' | '#' | '0' .. '9' | '-' )*
        loop44: do {
          int alt44 = 2;
          int LA44_0 = input.LA(1);
          
          if (((LA44_0 >= '#' && LA44_0 <= '$') || LA44_0 == '-' || (LA44_0 >= '0' && LA44_0 <= '9')
              || (LA44_0 >= 'A' && LA44_0 <= 'Z') || LA44_0 == '_' || (LA44_0 >= 'a' && LA44_0 <= 'z'))) {
            alt44 = 1;
          }
          
          switch (alt44) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:
            {
              if ((input.LA(1) >= '#' && input.LA(1) <= '$') || input.LA(1) == '-'
                  || (input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'Z')
                  || input.LA(1) == '_' || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                input.consume();
              }
              else {
                MismatchedSetException mse = new MismatchedSetException(null, input);
                recover(mse);
                throw mse;
              }
              
            }
              break;
            
            default:
              break loop44;
          }
        }
        while (true);
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "REGULAR_ID"
  
  // $ANTLR start "BODY_DELIMETER"
  public final void mBODY_DELIMETER() throws RecognitionException {
    try {
      int _type = BODY_DELIMETER;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:676:3:
      // ( '$' ( ( SIMPLE_LETTER ) ( SIMPLE_LETTER | '$' | '_' | '#' | '0' .. '9' )* )? '$' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:677:3:
      // '$' ( ( SIMPLE_LETTER ) ( SIMPLE_LETTER | '$' | '_' | '#' | '0' .. '9' )* )? '$'
      {
        match('$');
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:678:3:
        // ( ( SIMPLE_LETTER ) ( SIMPLE_LETTER | '$' | '_' | '#' | '0' .. '9' )* )?
        int alt46 = 2;
        int LA46_0 = input.LA(1);
        
        if (((LA46_0 >= 'A' && LA46_0 <= 'Z') || (LA46_0 >= 'a' && LA46_0 <= 'z'))) {
          alt46 = 1;
        }
        switch (alt46) {
          case 1:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:679:5:
          // ( SIMPLE_LETTER ) ( SIMPLE_LETTER | '$' | '_' | '#' | '0' .. '9' )*
          {
            if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z') || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
              input.consume();
            }
            else {
              MismatchedSetException mse = new MismatchedSetException(null, input);
              recover(mse);
              throw mse;
            }
            
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:680:5:
            // ( SIMPLE_LETTER | '$' | '_' | '#' | '0' .. '9' )*
            loop45: do {
              int alt45 = 2;
              int LA45_0 = input.LA(1);
              
              if ((LA45_0 == '$')) {
                int LA45_1 = input.LA(2);
                
                if (((LA45_1 >= '#' && LA45_1 <= '$') || (LA45_1 >= '0' && LA45_1 <= '9')
                    || (LA45_1 >= 'A' && LA45_1 <= 'Z') || LA45_1 == '_' || (LA45_1 >= 'a' && LA45_1 <= 'z'))) {
                  alt45 = 1;
                }
                
              }
              else if ((LA45_0 == '#' || (LA45_0 >= '0' && LA45_0 <= '9') || (LA45_0 >= 'A' && LA45_0 <= 'Z')
                  || LA45_0 == '_' || (LA45_0 >= 'a' && LA45_0 <= 'z'))) {
                alt45 = 1;
              }
              
              switch (alt45) {
                case 1:
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:
                {
                  if ((input.LA(1) >= '#' && input.LA(1) <= '$') || (input.LA(1) >= '0' && input.LA(1) <= '9')
                      || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_'
                      || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                    input.consume();
                  }
                  else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                  }
                  
                }
                  break;
                
                default:
                  break loop45;
              }
            }
            while (true);
            
          }
            break;
          
        }
        
        match('$');
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "BODY_DELIMETER"
  
  // $ANTLR start "REGULAR_ID_2"
  public final void mREGULAR_ID_2() throws RecognitionException {
    try {
      int _type = REGULAR_ID_2;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:692:3:
      // ( ( SIMPLE_LETTER | SCRIPT_VARIABLE ) ( SIMPLE_LETTER | '$' | '_' | '#' | '0' .. '9' | SCRIPT_VARIABLE |
      // PARAMERTERIZED_VARIABLE )* )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:693:3:
      // ( SIMPLE_LETTER | SCRIPT_VARIABLE ) ( SIMPLE_LETTER | '$' | '_' | '#' | '0' .. '9' | SCRIPT_VARIABLE |
      // PARAMERTERIZED_VARIABLE )*
      {
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:693:3:
        // ( SIMPLE_LETTER | SCRIPT_VARIABLE )
        int alt47 = 2;
        int LA47_0 = input.LA(1);
        
        if (((LA47_0 >= 'A' && LA47_0 <= 'Z') || (LA47_0 >= 'a' && LA47_0 <= 'z'))) {
          alt47 = 1;
        }
        else if ((LA47_0 == '$' || LA47_0 == '&')) {
          alt47 = 2;
        }
        else {
          NoViableAltException nvae = new NoViableAltException("", 47, 0, input);
          
          throw nvae;
          
        }
        switch (alt47) {
          case 1:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:694:5:
          // SIMPLE_LETTER
          {
            mSIMPLE_LETTER();
            
          }
            break;
          case 2:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:695:7:
          // SCRIPT_VARIABLE
          {
            mSCRIPT_VARIABLE();
            
          }
            break;
          
        }
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:697:3:
        // ( SIMPLE_LETTER | '$' | '_' | '#' | '0' .. '9' | SCRIPT_VARIABLE | PARAMERTERIZED_VARIABLE )*
        loop48: do {
          int alt48 = 8;
          switch (input.LA(1)) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z': {
              alt48 = 1;
            }
              break;
            case '$': {
              switch (input.LA(2)) {
                case '{': {
                  alt48 = 6;
                }
                  break;
                case '$':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z': {
                  alt48 = 2;
                }
                  break;
                case '_': {
                  alt48 = 2;
                }
                  break;
                case '#': {
                  alt48 = 2;
                }
                  break;
                case '&':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case ':': {
                  alt48 = 2;
                }
                  break;
                
                default:
                  alt48 = 2;
                  break;
                
              }
              
            }
              break;
            case '_': {
              alt48 = 3;
            }
              break;
            case '#': {
              alt48 = 4;
            }
              break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9': {
              alt48 = 5;
            }
              break;
            case '&': {
              alt48 = 6;
            }
              break;
            case ':': {
              alt48 = 7;
            }
              break;
            
          }
          
          switch (alt48) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:698:5:
            // SIMPLE_LETTER
            {
              mSIMPLE_LETTER();
              
            }
              break;
            case 2:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:699:7:
            // '$'
            {
              match('$');
              
            }
              break;
            case 3:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:700:7:
            // '_'
            {
              match('_');
              
            }
              break;
            case 4:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:701:7:
            // '#'
            {
              match('#');
              
            }
              break;
            case 5:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:702:7:
            // '0' .. '9'
            {
              matchRange('0', '9');
              
            }
              break;
            case 6:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:703:7:
            // SCRIPT_VARIABLE
            {
              mSCRIPT_VARIABLE();
              
            }
              break;
            case 7:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:704:7:
            // PARAMERTERIZED_VARIABLE
            {
              mPARAMERTERIZED_VARIABLE();
              
            }
              break;
            
            default:
              break loop48;
          }
        }
        while (true);
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "REGULAR_ID_2"
  
  // $ANTLR start "ZV"
  public final void mZV() throws RecognitionException {
    try {
      int _type = ZV;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:709:3:
      // ( '@!' )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:710:3:
      // '@!'
      {
        match("@!");
        
        _channel = HIDDEN;
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "ZV"
  
  // $ANTLR start "SCRIPT_VARIABLE"
  public final void mSCRIPT_VARIABLE() throws RecognitionException {
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:718:3:
      // ( ( '${' REGULAR_ID '}' ) | ( '$' REGULAR_ID ) | ( '&' REGULAR_ID ) )
      int alt49 = 3;
      int LA49_0 = input.LA(1);
      
      if ((LA49_0 == '$')) {
        int LA49_1 = input.LA(2);
        
        if ((LA49_1 == '{')) {
          alt49 = 1;
        }
        else if ((LA49_1 == '#' || (LA49_1 >= '0' && LA49_1 <= '9') || (LA49_1 >= 'A' && LA49_1 <= 'Z') || LA49_1 == '_'
            || (LA49_1 >= 'a' && LA49_1 <= 'z'))) {
          alt49 = 2;
        }
        else {
          NoViableAltException nvae = new NoViableAltException("", 49, 1, input);
          
          throw nvae;
          
        }
      }
      else if ((LA49_0 == '&')) {
        alt49 = 3;
      }
      else {
        NoViableAltException nvae = new NoViableAltException("", 49, 0, input);
        
        throw nvae;
        
      }
      switch (alt49) {
        case 1:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:719:3:
        // ( '${' REGULAR_ID '}' )
        {
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:719:3:
          // ( '${' REGULAR_ID '}' )
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:719:4:
          // '${' REGULAR_ID '}'
          {
            match("${");
            
            mREGULAR_ID();
            
            match('}');
            
          }
          
        }
          break;
        case 2:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:720:5:
        // ( '$' REGULAR_ID )
        {
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:720:5:
          // ( '$' REGULAR_ID )
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:720:6:
          // '$' REGULAR_ID
          {
            match('$');
            
            mREGULAR_ID();
            
          }
          
        }
          break;
        case 3:
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:721:5:
        // ( '&' REGULAR_ID )
        {
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:721:5:
          // ( '&' REGULAR_ID )
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:721:6:
          // '&' REGULAR_ID
          {
            match('&');
            
            mREGULAR_ID();
            
          }
          
        }
          break;
        
      }
      
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "SCRIPT_VARIABLE"
  
  // $ANTLR start "PARAMERTERIZED_VARIABLE"
  public final void mPARAMERTERIZED_VARIABLE() throws RecognitionException {
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:726:3:
      // ( ( ':' REGULAR_ID ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:727:3:
      // ( ':' REGULAR_ID )
      {
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:727:3:
        // ( ':' REGULAR_ID )
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:727:4:
        // ':' REGULAR_ID
        {
          match(':');
          
          mREGULAR_ID();
          
        }
        
      }
      
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "PARAMERTERIZED_VARIABLE"
  
  // $ANTLR start "ANYCHAR"
  public final void mANYCHAR() throws RecognitionException {
    try {
      int _type = ANYCHAR;
      int _channel = DEFAULT_TOKEN_CHANNEL;
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:731:3:
      // ( . )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:732:3:
      // .
      {
        matchAny();
        
      }
      
      state.type = _type;
      state.channel = _channel;
    } finally {
      // do for sure before leaving
    }
  }
  // $ANTLR end "ANYCHAR"
  
  public void mTokens() throws RecognitionException {
    // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:8:
    // ( DATASTAGE_DESCRIPTION_WRAPPER | FOR_NOTATION | NATIONAL_CHAR_STRING_LIT | BIT_STRING_LIT | HEX_STRING_LIT |
    // PERIOD | EXACT_NUM_LIT | CHAR_STRING | CHAR_STRING_PERL | DELIMITED_ID | TERNARY_IF_OPERATOR | LEFT_PAREN |
    // RIGHT_PAREN | COMMA | SOLIDUS | COLON | SEMICOLON | LESS_THAN_OR_EQUALS_OP | LESS_THAN_OP |
    // GREATER_THAN_OR_EQUALS_OP | NOT_EQUAL_OP | CARRET_OPERATOR_PART | TILDE_OPERATOR_PART | EXCLAMATION_OPERATOR_PART
    // | GREATER_THAN_OP | OR_OP | VERTICAL_BAR | LEFT_BRACKET | RIGHT_BRACKET | LEFT_CURLY_BRACKET |
    // RIGHT_CURLY_BRACKET | DATASTAGE_DESCRIPTION_BODY | DATASTAGE_BEGIN_HEADER | DATASTAGE_END_HEADER |
    // DATASTAGE_BEGIN_DSJOB | DATASTAGE_END_DSJOB | DATASTAGE_BEGIN_DSRECORD | DATASTAGE_END_DSRECORD |
    // DATASTAGE_BEGIN_DSSUBRECORD | DATASTAGE_END_DSSUBRECORD | DATASTAGE_BEGIN_DSTABLEDEFS | DATASTAGE_END_DSTABLEDEFS
    // | DATASTAGE_BEGIN_DSEXECJOB | DATASTAGE_END_DSEXECJOB | DATASTAGE_BEGIN_DSBPSOURCE | DATASTAGE_END_DSBPSOURCE |
    // DATASTAGE_BEGIN_DSBPBINARY | DATASTAGE_END_DSBPBINARY | DATASTAGE_BEGIN_DSROUTINES | DATASTAGE_END_DSROUTINES |
    // DATASTAGE_BEGIN_DSDATACONNECTIONS | DATASTAGE_END_DSDATACONNECTIONS | DATASTAGE_BEGIN_DSUBINARY |
    // DATASTAGE_END_DSUBINARY | DATASTAGE_BEGIN_DSPARAMETERSETS | DATASTAGE_END_DSPARAMETERSETS |
    // DATASTAGE_BEGIN_DSSCRIPT | DATASTAGE_END_DSSCRIPT | AND_OP | INTRODUCER | SEPARATOR | PROMPT | REGULAR_ID |
    // BODY_DELIMETER | REGULAR_ID_2 | ZV | ANYCHAR )
    int alt50 = 67;
    alt50 = dfa50.predict(input);
    switch (alt50) {
      case 1:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:10:
      // DATASTAGE_DESCRIPTION_WRAPPER
      {
        mDATASTAGE_DESCRIPTION_WRAPPER();
        
      }
        break;
      case 2:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:40:
      // FOR_NOTATION
      {
        mFOR_NOTATION();
        
      }
        break;
      case 3:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:53:
      // NATIONAL_CHAR_STRING_LIT
      {
        mNATIONAL_CHAR_STRING_LIT();
        
      }
        break;
      case 4:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:78:
      // BIT_STRING_LIT
      {
        mBIT_STRING_LIT();
        
      }
        break;
      case 5:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:93:
      // HEX_STRING_LIT
      {
        mHEX_STRING_LIT();
        
      }
        break;
      case 6:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:108:
      // PERIOD
      {
        mPERIOD();
        
      }
        break;
      case 7:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:115:
      // EXACT_NUM_LIT
      {
        mEXACT_NUM_LIT();
        
      }
        break;
      case 8:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:129:
      // CHAR_STRING
      {
        mCHAR_STRING();
        
      }
        break;
      case 9:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:141:
      // CHAR_STRING_PERL
      {
        mCHAR_STRING_PERL();
        
      }
        break;
      case 10:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:158:
      // DELIMITED_ID
      {
        mDELIMITED_ID();
        
      }
        break;
      case 11:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:171:
      // TERNARY_IF_OPERATOR
      {
        mTERNARY_IF_OPERATOR();
        
      }
        break;
      case 12:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:191:
      // LEFT_PAREN
      {
        mLEFT_PAREN();
        
      }
        break;
      case 13:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:202:
      // RIGHT_PAREN
      {
        mRIGHT_PAREN();
        
      }
        break;
      case 14:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:214:
      // COMMA
      {
        mCOMMA();
        
      }
        break;
      case 15:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:220:
      // SOLIDUS
      {
        mSOLIDUS();
        
      }
        break;
      case 16:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:228:
      // COLON
      {
        mCOLON();
        
      }
        break;
      case 17:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:234:
      // SEMICOLON
      {
        mSEMICOLON();
        
      }
        break;
      case 18:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:244:
      // LESS_THAN_OR_EQUALS_OP
      {
        mLESS_THAN_OR_EQUALS_OP();
        
      }
        break;
      case 19:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:267:
      // LESS_THAN_OP
      {
        mLESS_THAN_OP();
        
      }
        break;
      case 20:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:280:
      // GREATER_THAN_OR_EQUALS_OP
      {
        mGREATER_THAN_OR_EQUALS_OP();
        
      }
        break;
      case 21:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:306:
      // NOT_EQUAL_OP
      {
        mNOT_EQUAL_OP();
        
      }
        break;
      case 22:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:319:
      // CARRET_OPERATOR_PART
      {
        mCARRET_OPERATOR_PART();
        
      }
        break;
      case 23:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:340:
      // TILDE_OPERATOR_PART
      {
        mTILDE_OPERATOR_PART();
        
      }
        break;
      case 24:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:360:
      // EXCLAMATION_OPERATOR_PART
      {
        mEXCLAMATION_OPERATOR_PART();
        
      }
        break;
      case 25:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:386:
      // GREATER_THAN_OP
      {
        mGREATER_THAN_OP();
        
      }
        break;
      case 26:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:402:
      // OR_OP
      {
        mOR_OP();
        
      }
        break;
      case 27:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:408:
      // VERTICAL_BAR
      {
        mVERTICAL_BAR();
        
      }
        break;
      case 28:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:421:
      // LEFT_BRACKET
      {
        mLEFT_BRACKET();
        
      }
        break;
      case 29:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:434:
      // RIGHT_BRACKET
      {
        mRIGHT_BRACKET();
        
      }
        break;
      case 30:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:448:
      // LEFT_CURLY_BRACKET
      {
        mLEFT_CURLY_BRACKET();
        
      }
        break;
      case 31:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:467:
      // RIGHT_CURLY_BRACKET
      {
        mRIGHT_CURLY_BRACKET();
        
      }
        break;
      case 32:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:487:
      // DATASTAGE_DESCRIPTION_BODY
      {
        mDATASTAGE_DESCRIPTION_BODY();
        
      }
        break;
      case 33:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:514:
      // DATASTAGE_BEGIN_HEADER
      {
        mDATASTAGE_BEGIN_HEADER();
        
      }
        break;
      case 34:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:537:
      // DATASTAGE_END_HEADER
      {
        mDATASTAGE_END_HEADER();
        
      }
        break;
      case 35:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:558:
      // DATASTAGE_BEGIN_DSJOB
      {
        mDATASTAGE_BEGIN_DSJOB();
        
      }
        break;
      case 36:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:580:
      // DATASTAGE_END_DSJOB
      {
        mDATASTAGE_END_DSJOB();
        
      }
        break;
      case 37:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:600:
      // DATASTAGE_BEGIN_DSRECORD
      {
        mDATASTAGE_BEGIN_DSRECORD();
        
      }
        break;
      case 38:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:625:
      // DATASTAGE_END_DSRECORD
      {
        mDATASTAGE_END_DSRECORD();
        
      }
        break;
      case 39:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:648:
      // DATASTAGE_BEGIN_DSSUBRECORD
      {
        mDATASTAGE_BEGIN_DSSUBRECORD();
        
      }
        break;
      case 40:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:676:
      // DATASTAGE_END_DSSUBRECORD
      {
        mDATASTAGE_END_DSSUBRECORD();
        
      }
        break;
      case 41:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:702:
      // DATASTAGE_BEGIN_DSTABLEDEFS
      {
        mDATASTAGE_BEGIN_DSTABLEDEFS();
        
      }
        break;
      case 42:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:730:
      // DATASTAGE_END_DSTABLEDEFS
      {
        mDATASTAGE_END_DSTABLEDEFS();
        
      }
        break;
      case 43:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:756:
      // DATASTAGE_BEGIN_DSEXECJOB
      {
        mDATASTAGE_BEGIN_DSEXECJOB();
        
      }
        break;
      case 44:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:782:
      // DATASTAGE_END_DSEXECJOB
      {
        mDATASTAGE_END_DSEXECJOB();
        
      }
        break;
      case 45:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:806:
      // DATASTAGE_BEGIN_DSBPSOURCE
      {
        mDATASTAGE_BEGIN_DSBPSOURCE();
        
      }
        break;
      case 46:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:833:
      // DATASTAGE_END_DSBPSOURCE
      {
        mDATASTAGE_END_DSBPSOURCE();
        
      }
        break;
      case 47:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:858:
      // DATASTAGE_BEGIN_DSBPBINARY
      {
        mDATASTAGE_BEGIN_DSBPBINARY();
        
      }
        break;
      case 48:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:885:
      // DATASTAGE_END_DSBPBINARY
      {
        mDATASTAGE_END_DSBPBINARY();
        
      }
        break;
      case 49:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:910:
      // DATASTAGE_BEGIN_DSROUTINES
      {
        mDATASTAGE_BEGIN_DSROUTINES();
        
      }
        break;
      case 50:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:937:
      // DATASTAGE_END_DSROUTINES
      {
        mDATASTAGE_END_DSROUTINES();
        
      }
        break;
      case 51:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:962:
      // DATASTAGE_BEGIN_DSDATACONNECTIONS
      {
        mDATASTAGE_BEGIN_DSDATACONNECTIONS();
        
      }
        break;
      case 52:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:996:
      // DATASTAGE_END_DSDATACONNECTIONS
      {
        mDATASTAGE_END_DSDATACONNECTIONS();
        
      }
        break;
      case 53:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:1028:
      // DATASTAGE_BEGIN_DSUBINARY
      {
        mDATASTAGE_BEGIN_DSUBINARY();
        
      }
        break;
      case 54:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:1054:
      // DATASTAGE_END_DSUBINARY
      {
        mDATASTAGE_END_DSUBINARY();
        
      }
        break;
      case 55:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:1078:
      // DATASTAGE_BEGIN_DSPARAMETERSETS
      {
        mDATASTAGE_BEGIN_DSPARAMETERSETS();
        
      }
        break;
      case 56:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:1110:
      // DATASTAGE_END_DSPARAMETERSETS
      {
        mDATASTAGE_END_DSPARAMETERSETS();
        
      }
        break;
      case 57:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:1140:
      // DATASTAGE_BEGIN_DSSCRIPT
      {
        mDATASTAGE_BEGIN_DSSCRIPT();
        
      }
        break;
      case 58:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:1165:
      // DATASTAGE_END_DSSCRIPT
      {
        mDATASTAGE_END_DSSCRIPT();
        
      }
        break;
      case 59:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:1188:
      // AND_OP
      {
        mAND_OP();
        
      }
        break;
      case 60:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:1195:
      // INTRODUCER
      {
        mINTRODUCER();
        
      }
        break;
      case 61:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:1206:
      // SEPARATOR
      {
        mSEPARATOR();
        
      }
        break;
      case 62:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:1216:
      // PROMPT
      {
        mPROMPT();
        
      }
        break;
      case 63:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:1223:
      // REGULAR_ID
      {
        mREGULAR_ID();
        
      }
        break;
      case 64:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:1234:
      // BODY_DELIMETER
      {
        mBODY_DELIMETER();
        
      }
        break;
      case 65:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:1249:
      // REGULAR_ID_2
      {
        mREGULAR_ID_2();
        
      }
        break;
      case 66:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:1262:
      // ZV
      {
        mZV();
        
      }
        break;
      case 67:
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXLexer.g:1:1265:
      // ANYCHAR
      {
        mANYCHAR();
        
      }
        break;
      
    }
    
  }
  
  protected DFA50 dfa50 = new DFA50(this);
  
  static final String DFA50_eotS = "\1\32\1\55\1\57\3\64\1\101\1\55\1\64\2\55\4\uffff\1\112\2\uffff"
      + "\1\117\1\64\1\123\2\64\1\126\1\127\1\55\1\uffff\1\131\4\uffff\2"
      + "\64\1\55\1\141\1\55\3\uffff\2\64\1\55\1\uffff\1\55\3\uffff\2\57"
      + "\1\64\1\57\2\uffff\1\64\1\116\5\64\1\uffff\1\64\21\uffff\1\115\1"
      + "\117\2\uffff\1\122\1\123\10\uffff\1\64\1\uffff\1\64\1\uffff\1\64"
      + "\1\75\4\uffff\1\64\1\57\7\64\1\141\1\64\1\144\4\75\1\uffff\7\64"
      + "\1\uffff\1\64\4\75\1\uffff\5\64\2\uffff\1\64\1\144\4\75\3\uffff" + "\1\64\4\75\1\u00a9\46\uffff";
  
  static final String DFA50_eofS = "\u00c3\uffff";
  
  static final String DFA50_minS = "\1\0\1\53\4\43\1\60\1\0\1\43\2\0\4\uffff\1\52\2\uffff\1\75\1\43"
      + "\1\75\2\43\3\75\1\uffff\1\174\4\uffff\4\43\1\55\3\uffff\3\43\1\uffff"
      + "\1\41\1\uffff\1\75\1\uffff\1\56\1\43\1\53\1\43\2\uffff\7\43\1\uffff"
      + "\1\43\21\uffff\2\43\2\uffff\2\43\10\uffff\1\43\1\uffff\1\55\1\uffff"
      + "\2\43\2\uffff\1\53\1\uffff\1\60\7\43\1\40\7\43\1\75\7\43\1\104\5"
      + "\43\1\53\4\43\1\40\1\uffff\1\123\6\43\1\75\1\104\1\102\1\11\4\43"
      + "\1\0\1\uffff\1\123\1\uffff\1\105\1\103\2\uffff\1\120\6\uffff\1\102"
      + "\4\uffff\1\102\1\uffff\1\105\1\103\2\uffff\1\120\11\uffff\1\102" + "\2\uffff";
  
  static final String DFA50_maxS = "\1\uffff\1\53\4\172\1\71\1\uffff\1\172\2\uffff\4\uffff\1\57\2\uffff"
      + "\1\76\1\172\1\75\2\172\3\75\1\uffff\1\174\4\uffff\4\172\1\55\3\uffff"
      + "\2\172\1\173\1\uffff\1\41\1\uffff\1\75\1\uffff\1\56\1\172\1\71\1"
      + "\172\2\uffff\3\172\1\173\3\172\1\uffff\1\172\21\uffff\2\172\2\uffff"
      + "\2\172\10\uffff\1\172\1\uffff\1\55\1\uffff\2\172\2\uffff\1\53\1"
      + "\uffff\1\71\12\172\1\173\4\172\1\75\1\172\1\173\5\172\1\110\5\172"
      + "\1\53\5\172\1\uffff\1\123\1\172\1\173\4\172\1\75\1\110\1\125\5\172"
      + "\1\uffff\1\uffff\1\123\1\uffff\1\117\1\125\2\uffff\1\120\6\uffff"
      + "\1\125\4\uffff\1\123\1\uffff\1\117\1\125\2\uffff\1\120\11\uffff" + "\1\123\2\uffff";
  
  static final String DFA50_acceptS = "\13\uffff\1\13\1\14\1\15\1\16\1\uffff\1\20\1\21\10\uffff\1\27\1"
      + "\uffff\1\34\1\35\1\36\1\37\5\uffff\3\75\3\uffff\1\77\1\uffff\1\103"
      + "\1\uffff\1\7\4\uffff\1\77\1\3\7\uffff\1\101\1\uffff\1\4\1\5\1\6"
      + "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\75\1\17\1\20\1\21\1\22\1\25"
      + "\1\23\2\uffff\1\24\1\31\2\uffff\1\30\1\26\1\32\1\33\1\34\1\35\1"
      + "\36\1\37\1\uffff\1\73\1\uffff\1\74\2\uffff\1\100\1\102\1\uffff\1"
      + "\2\44\uffff\1\42\20\uffff\1\41\1\uffff\1\44\2\uffff\1\52\1\54\1"
      + "\uffff\1\64\1\66\1\70\1\76\1\1\1\40\1\uffff\1\46\1\62\1\50\1\72"
      + "\1\uffff\1\43\2\uffff\1\51\1\53\1\uffff\1\63\1\65\1\67\1\56\1\60" + "\1\45\1\61\1\47\1\71\1\uffff\1\55\1\57";
  
  static final String DFA50_specialS = "\1\0\6\uffff\1\2\1\uffff\1\4\1\1\u0091\uffff\1\3\46\uffff}>";
  
  static final String[] DFA50_transitionS = {
      "\11\55\1\45\1\47\2\55\1\46\22\55\1\45\1\27\1\11\1\53\1\52\1"
          + "\55\1\42\1\7\1\14\1\15\2\55\1\16\1\44\1\6\1\17\12\2\1\20\1\21"
          + "\1\22\1\1\1\24\1\13\1\54\1\51\1\4\2\51\1\41\10\51\1\26\2\51"
          + "\1\10\6\51\1\5\2\51\1\34\1\55\1\35\1\30\1\43\1\12\1\51\1\40"
          + "\4\51\1\25\4\51\1\23\1\51\1\3\1\51\1\50\1\10\6\51\1\5\2\51\1" + "\36\1\33\1\37\1\31\uff81\55",
      "\1\56",
      "\2\64\10\uffff\1\64\1\60\1\uffff\12\61\7\uffff\3\64\1\63\1"
          + "\62\1\63\24\64\4\uffff\1\64\1\uffff\3\64\1\63\1\62\1\63\24\64",
      "\1\73\1\71\1\uffff\1\75\1\65\10\uffff\12\74\1\75\6\uffff\32"
          + "\70\4\uffff\1\72\1\uffff\4\70\1\67\11\70\1\66\13\70",
      "\1\73\1\71\1\uffff\1\75\1\77\10\uffff\12\74\1\75\6\uffff\4" + "\70\1\76\25\70\4\uffff\1\72\1\uffff\32\70",
      "\1\73\1\71\1\uffff\1\75\1\100\10\uffff\12\74\1\75\6\uffff\32" + "\70\4\uffff\1\72\1\uffff\32\70", "\12\57",
      "\0\102", "\1\73\1\71\1\uffff\1\75\1\103\10\uffff\12\74\1\75\6\uffff\32" + "\70\4\uffff\1\72\1\uffff\32\70",
      "\12\104\1\uffff\2\104\1\uffff\ufff2\104", "\0\104", "", "", "", "", "\1\111\4\uffff\1\111", "", "",
      "\1\115\1\116",
      "\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75\6\uffff\32\70\4" + "\uffff\1\72\1\uffff\4\70\1\120\16\70\1\121\6\70",
      "\1\122",
      "\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75\6\uffff\32\70\4" + "\uffff\1\72\1\uffff\4\70\1\124\16\70\1\125\6\70",
      "\1\73\1\71\1\uffff\1\75\1\65\10\uffff\12\74\1\75\6\uffff\32" + "\70\4\uffff\1\72\1\uffff\32\70", "\1\116",
      "\1\116", "\1\116", "", "\1\130", "", "", "", "",
      "\1\73\1\71\1\uffff\1\75\1\77\10\uffff\12\74\1\75\6\uffff\32" + "\70\4\uffff\1\72\1\uffff\32\70",
      "\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75\6\uffff\15\70\1" + "\136\14\70\4\uffff\1\72\1\uffff\32\70",
      "\1\75\2\uffff\1\137\11\uffff\12\75\7\uffff\32\75\4\uffff\1" + "\75\1\uffff\32\75",
      "\2\64\10\uffff\1\140\2\uffff\12\64\7\uffff\32\64\4\uffff\1" + "\64\1\uffff\32\64", "\1\111", "", "", "",
      "\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75\6\uffff\32\70\4" + "\uffff\1\72\1\uffff\21\70\1\142\10\70",
      "\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75\6\uffff\32\70\4" + "\uffff\1\72\1\uffff\32\70",
      "\1\75\1\144\13\uffff\12\75\7\uffff\32\143\4\uffff\1\75\1\uffff" + "\32\143\1\75", "", "\1\145", "", "\1\146", "",
      "\1\147",
      "\2\64\10\uffff\1\64\1\60\1\uffff\12\61\7\uffff\3\64\1\63\1"
          + "\62\1\63\24\64\4\uffff\1\64\1\uffff\3\64\1\63\1\62\1\63\24\64",
      "\1\57\1\uffff\1\150\2\uffff\12\151",
      "\2\64\10\uffff\1\64\2\uffff\12\64\7\uffff\32\64\4\uffff\1\64" + "\1\uffff\32\64", "", "",
      "\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75\6\uffff\32\70\4" + "\uffff\1\72\1\uffff\23\70\1\152\6\70",
      "\1\73\1\71\1\uffff\1\75\6\uffff\1\64\2\uffff\12\74\1\75\6\uffff" + "\32\70\4\uffff\1\72\1\uffff\32\70",
      "\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75\6\uffff\32\70\4" + "\uffff\1\72\1\uffff\32\70",
      "\1\155\1\71\1\uffff\1\75\11\uffff\12\156\1\75\6\uffff\32\153" + "\4\uffff\1\154\1\uffff\32\153\1\75",
      "\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75\6\uffff\32\70\4" + "\uffff\1\72\1\uffff\32\70",
      "\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75\6\uffff\32\70\4" + "\uffff\1\72\1\uffff\32\70",
      "\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75\6\uffff\32\70\4" + "\uffff\1\72\1\uffff\32\70", "",
      "\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75\6\uffff\6\70\1" + "\157\23\70\4\uffff\1\72\1\uffff\32\70", "", "",
      "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
      "\1\73\1\71\1\uffff\1\75\6\uffff\1\64\2\uffff\12\74\1\75\6\uffff" + "\32\70\4\uffff\1\72\1\uffff\32\70",
      "\1\73\1\71\1\uffff\1\75\6\uffff\1\64\2\uffff\12\74\1\75\6\uffff" + "\32\70\4\uffff\1\72\1\uffff\32\70", "", "",
      "\1\73\1\71\1\uffff\1\75\6\uffff\1\64\2\uffff\12\74\1\75\6\uffff" + "\32\70\4\uffff\1\72\1\uffff\32\70",
      "\1\73\1\71\1\uffff\1\75\6\uffff\1\64\2\uffff\12\74\1\75\6\uffff" + "\32\70\4\uffff\1\72\1\uffff\32\70", "", "",
      "", "", "", "", "", "",
      "\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75\6\uffff\3\70\1" + "\160\26\70\4\uffff\1\72\1\uffff\32\70", "",
      "\1\161", "",
      "\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75\6\uffff\32\70\4" + "\uffff\1\72\1\uffff\16\70\1\162\13\70",
      "\1\166\1\163\13\uffff\12\167\7\uffff\32\164\4\uffff\1\165\1" + "\uffff\32\164", "", "", "\1\170", "", "\12\151",
      "\2\64\10\uffff\1\64\2\uffff\12\151\7\uffff\3\64\1\63\1\64\1"
          + "\63\24\64\4\uffff\1\64\1\uffff\3\64\1\63\1\64\1\63\24\64",
      "\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75\2\uffff\1\116\3" + "\uffff\32\70\4\uffff\1\72\1\uffff\32\70",
      "\1\174\1\172\1\uffff\1\75\6\uffff\1\176\2\uffff\12\175\1\75" + "\6\uffff\32\171\4\uffff\1\173\1\uffff\32\171",
      "\1\174\1\172\1\uffff\1\75\6\uffff\1\176\2\uffff\12\175\1\75" + "\6\uffff\32\171\4\uffff\1\173\1\uffff\32\171",
      "\1\174\1\172\1\uffff\1\75\6\uffff\1\176\2\uffff\12\175\1\75" + "\6\uffff\32\171\4\uffff\1\173\1\uffff\32\171",
      "\1\174\1\172\1\uffff\1\75\6\uffff\1\176\2\uffff\12\175\1\75" + "\6\uffff\32\171\4\uffff\1\173\1\uffff\32\171",
      "\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75\6\uffff\10\70\1" + "\177\21\70\4\uffff\1\72\1\uffff\32\70",
      "\1\u0080\2\uffff\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75" + "\6\uffff\32\70\4\uffff\1\72\1\uffff\32\70",
      "\2\64\10\uffff\1\64\2\uffff\12\64\7\uffff\32\64\4\uffff\1\64" + "\1\uffff\32\64",
      "\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75\6\uffff\32\70\4" + "\uffff\1\72\1\uffff\14\70\1\u0081\15\70",
      "\1\u0084\1\163\1\uffff\1\75\6\uffff\1\75\2\uffff\12\u0085\1"
          + "\75\6\uffff\32\u0082\4\uffff\1\u0083\1\uffff\32\u0082\1\75",
      "\1\166\1\163\13\uffff\12\167\7\uffff\32\164\4\uffff\1\165\1" + "\uffff\32\164",
      "\1\166\1\163\13\uffff\12\167\7\uffff\32\164\4\uffff\1\165\1" + "\uffff\32\164",
      "\1\166\1\163\13\uffff\12\167\7\uffff\32\164\4\uffff\1\165\1" + "\uffff\32\164",
      "\1\166\1\163\13\uffff\12\167\7\uffff\32\164\4\uffff\1\165\1" + "\uffff\32\164", "\1\u0086",
      "\1\174\1\172\1\uffff\1\75\6\uffff\1\176\2\uffff\12\175\1\75" + "\6\uffff\32\171\4\uffff\1\173\1\uffff\32\171",
      "\1\u0089\1\172\1\uffff\1\75\6\uffff\1\176\2\uffff\12\u008a"
          + "\1\75\6\uffff\32\u0087\4\uffff\1\u0088\1\uffff\32\u0087\1\75",
      "\1\174\1\172\1\uffff\1\75\6\uffff\1\176\2\uffff\12\175\1\75" + "\6\uffff\32\171\4\uffff\1\173\1\uffff\32\171",
      "\1\174\1\172\1\uffff\1\75\6\uffff\1\176\2\uffff\12\175\1\75" + "\6\uffff\32\171\4\uffff\1\173\1\uffff\32\171",
      "\1\174\1\172\1\uffff\1\75\6\uffff\1\176\2\uffff\12\175\1\75" + "\6\uffff\32\171\4\uffff\1\173\1\uffff\32\171",
      "\1\174\1\172\1\uffff\1\75\6\uffff\1\176\2\uffff\12\175\1\75" + "\6\uffff\32\171\4\uffff\1\173\1\uffff\32\171",
      "\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75\6\uffff\15\70\1" + "\u008b\14\70\4\uffff\1\72\1\uffff\32\70",
      "\1\u008d\3\uffff\1\u008c",
      "\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75\6\uffff\32\70\4" + "\uffff\1\72\1\uffff\17\70\1\u008e\12\70",
      "\1\u0092\1\u008f\13\uffff\12\u0093\7\uffff\32\u0090\4\uffff" + "\1\u0091\1\uffff\32\u0090",
      "\1\u0092\1\u008f\13\uffff\12\u0093\7\uffff\32\u0090\4\uffff" + "\1\u0091\1\uffff\32\u0090",
      "\1\u0092\1\u008f\13\uffff\12\u0093\7\uffff\32\u0090\4\uffff" + "\1\u0091\1\uffff\32\u0090",
      "\1\u0092\1\u008f\13\uffff\12\u0093\7\uffff\32\u0090\4\uffff" + "\1\u0091\1\uffff\32\u0090", "\1\u0094",
      "\1\174\1\172\1\uffff\1\75\6\uffff\1\176\2\uffff\12\175\1\75" + "\6\uffff\32\171\4\uffff\1\173\1\uffff\32\171",
      "\1\174\1\172\1\uffff\1\75\6\uffff\1\176\2\uffff\12\175\1\75" + "\6\uffff\32\171\4\uffff\1\173\1\uffff\32\171",
      "\1\174\1\172\1\uffff\1\75\6\uffff\1\176\2\uffff\12\175\1\75" + "\6\uffff\32\171\4\uffff\1\173\1\uffff\32\171",
      "\1\174\1\172\1\uffff\1\75\6\uffff\1\176\2\uffff\12\175\1\75" + "\6\uffff\32\171\4\uffff\1\173\1\uffff\32\171",
      "\1\u0095\2\uffff\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75" + "\6\uffff\32\70\4\uffff\1\72\1\uffff\32\70", "",
      "\1\u0096",
      "\1\73\1\71\1\uffff\1\75\11\uffff\12\74\1\75\6\uffff\32\70\4" + "\uffff\1\72\1\uffff\23\70\1\u0097\6\70",
      "\1\u009a\1\u008f\1\uffff\1\75\6\uffff\1\75\2\uffff\12\u009b"
          + "\1\75\6\uffff\32\u0098\4\uffff\1\u0099\1\uffff\32\u0098\1\75",
      "\1\u0092\1\u008f\13\uffff\12\u0093\7\uffff\32\u0090\4\uffff" + "\1\u0091\1\uffff\32\u0090",
      "\1\u0092\1\u008f\13\uffff\12\u0093\7\uffff\32\u0090\4\uffff" + "\1\u0091\1\uffff\32\u0090",
      "\1\u0092\1\u008f\13\uffff\12\u0093\7\uffff\32\u0090\4\uffff" + "\1\u0091\1\uffff\32\u0090",
      "\1\u0092\1\u008f\13\uffff\12\u0093\7\uffff\32\u0090\4\uffff" + "\1\u0091\1\uffff\32\u0090", "\1\u009c",
      "\1\u009e\3\uffff\1\u009d",
      "\1\u00a4\1\uffff\1\u00a5\1\u00a3\4\uffff\1\u009f\5\uffff\1" + "\u00a7\1\uffff\1\u00a0\1\u00a1\1\u00a2\1\u00a6",
      "\1\u00a8\26\uffff\1\u00a8\2\uffff\1\73\1\71\1\uffff\1\75\11"
          + "\uffff\12\74\1\75\6\uffff\32\70\4\uffff\1\72\1\uffff\32\70",
      "\1\u0092\1\u008f\13\uffff\12\u0093\7\uffff\32\u0090\4\uffff" + "\1\u0091\1\uffff\32\u0090",
      "\1\u0092\1\u008f\13\uffff\12\u0093\7\uffff\32\u0090\4\uffff" + "\1\u0091\1\uffff\32\u0090",
      "\1\u0092\1\u008f\13\uffff\12\u0093\7\uffff\32\u0090\4\uffff" + "\1\u0091\1\uffff\32\u0090",
      "\1\u0092\1\u008f\13\uffff\12\u0093\7\uffff\32\u0090\4\uffff" + "\1\u0091\1\uffff\32\u0090", "\0\u00aa", "",
      "\1\u00ab", "", "\1\u00ac\11\uffff\1\u00ad", "\1\u00af\21\uffff\1\u00ae", "", "", "\1\u00b0", "", "", "", "", "",
      "",
      "\1\u00b6\1\uffff\1\u00b7\1\u00b5\4\uffff\1\u00b1\5\uffff\1" + "\u00b9\1\uffff\1\u00b2\1\u00b3\1\u00b4\1\u00b8",
      "", "", "", "", "\1\u00bb\20\uffff\1\u00ba", "", "\1\u00bc\11\uffff\1\u00bd", "\1\u00bf\21\uffff\1\u00be", "", "",
      "\1\u00c0", "", "", "", "", "", "", "", "", "", "\1\u00c2\20\uffff\1\u00c1", "", "" };
  
  static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
  
  static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
  
  static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
  
  static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
  
  static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
  
  static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
  
  static final short[][] DFA50_transition;
  
  static {
    int numStates = DFA50_transitionS.length;
    DFA50_transition = new short[numStates][];
    for (int i = 0; i < numStates; i++) {
      DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
    }
  }
  
  class DFA50 extends DFA {
    
    
    public DFA50(BaseRecognizer recognizer) {
      this.recognizer = recognizer;
      this.decisionNumber = 50;
      this.eot = DFA50_eot;
      this.eof = DFA50_eof;
      this.min = DFA50_min;
      this.max = DFA50_max;
      this.accept = DFA50_accept;
      this.special = DFA50_special;
      this.transition = DFA50_transition;
    }
    
    public String getDescription() {
      return "1:1: Tokens : ( DATASTAGE_DESCRIPTION_WRAPPER | FOR_NOTATION | NATIONAL_CHAR_STRING_LIT | BIT_STRING_LIT | HEX_STRING_LIT | PERIOD | EXACT_NUM_LIT | CHAR_STRING | CHAR_STRING_PERL | DELIMITED_ID | TERNARY_IF_OPERATOR | LEFT_PAREN | RIGHT_PAREN | COMMA | SOLIDUS | COLON | SEMICOLON | LESS_THAN_OR_EQUALS_OP | LESS_THAN_OP | GREATER_THAN_OR_EQUALS_OP | NOT_EQUAL_OP | CARRET_OPERATOR_PART | TILDE_OPERATOR_PART | EXCLAMATION_OPERATOR_PART | GREATER_THAN_OP | OR_OP | VERTICAL_BAR | LEFT_BRACKET | RIGHT_BRACKET | LEFT_CURLY_BRACKET | RIGHT_CURLY_BRACKET | DATASTAGE_DESCRIPTION_BODY | DATASTAGE_BEGIN_HEADER | DATASTAGE_END_HEADER | DATASTAGE_BEGIN_DSJOB | DATASTAGE_END_DSJOB | DATASTAGE_BEGIN_DSRECORD | DATASTAGE_END_DSRECORD | DATASTAGE_BEGIN_DSSUBRECORD | DATASTAGE_END_DSSUBRECORD | DATASTAGE_BEGIN_DSTABLEDEFS | DATASTAGE_END_DSTABLEDEFS | DATASTAGE_BEGIN_DSEXECJOB | DATASTAGE_END_DSEXECJOB | DATASTAGE_BEGIN_DSBPSOURCE | DATASTAGE_END_DSBPSOURCE | DATASTAGE_BEGIN_DSBPBINARY | DATASTAGE_END_DSBPBINARY | DATASTAGE_BEGIN_DSROUTINES | DATASTAGE_END_DSROUTINES | DATASTAGE_BEGIN_DSDATACONNECTIONS | DATASTAGE_END_DSDATACONNECTIONS | DATASTAGE_BEGIN_DSUBINARY | DATASTAGE_END_DSUBINARY | DATASTAGE_BEGIN_DSPARAMETERSETS | DATASTAGE_END_DSPARAMETERSETS | DATASTAGE_BEGIN_DSSCRIPT | DATASTAGE_END_DSSCRIPT | AND_OP | INTRODUCER | SEPARATOR | PROMPT | REGULAR_ID | BODY_DELIMETER | REGULAR_ID_2 | ZV | ANYCHAR );";
    }
    
    public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
      IntStream input = _input;
      int _s = s;
      switch (s) {
        case 0:
          int LA50_0 = input.LA(1);
          
          s = -1;
          if ((LA50_0 == '=')) {
            s = 1;
          }
          
          else if (((LA50_0 >= '0' && LA50_0 <= '9'))) {
            s = 2;
          }
          
          else if ((LA50_0 == 'n')) {
            s = 3;
          }
          
          else if ((LA50_0 == 'B')) {
            s = 4;
          }
          
          else if ((LA50_0 == 'X' || LA50_0 == 'x')) {
            s = 5;
          }
          
          else if ((LA50_0 == '.')) {
            s = 6;
          }
          
          else if ((LA50_0 == '\'')) {
            s = 7;
          }
          
          else if ((LA50_0 == 'Q' || LA50_0 == 'q')) {
            s = 8;
          }
          
          else if ((LA50_0 == '\"')) {
            s = 9;
          }
          
          else if ((LA50_0 == '`')) {
            s = 10;
          }
          
          else if ((LA50_0 == '?')) {
            s = 11;
          }
          
          else if ((LA50_0 == '(')) {
            s = 12;
          }
          
          else if ((LA50_0 == ')')) {
            s = 13;
          }
          
          else if ((LA50_0 == ',')) {
            s = 14;
          }
          
          else if ((LA50_0 == '/')) {
            s = 15;
          }
          
          else if ((LA50_0 == ':')) {
            s = 16;
          }
          
          else if ((LA50_0 == ';')) {
            s = 17;
          }
          
          else if ((LA50_0 == '<')) {
            s = 18;
          }
          
          else if ((LA50_0 == 'l')) {
            s = 19;
          }
          
          else if ((LA50_0 == '>')) {
            s = 20;
          }
          
          else if ((LA50_0 == 'g')) {
            s = 21;
          }
          
          else if ((LA50_0 == 'N')) {
            s = 22;
          }
          
          else if ((LA50_0 == '!')) {
            s = 23;
          }
          
          else if ((LA50_0 == '^')) {
            s = 24;
          }
          
          else if ((LA50_0 == '~')) {
            s = 25;
          }
          
          else if ((LA50_0 == '|')) {
            s = 27;
          }
          
          else if ((LA50_0 == '[')) {
            s = 28;
          }
          
          else if ((LA50_0 == ']')) {
            s = 29;
          }
          
          else if ((LA50_0 == '{')) {
            s = 30;
          }
          
          else if ((LA50_0 == '}')) {
            s = 31;
          }
          
          else if ((LA50_0 == 'b')) {
            s = 32;
          }
          
          else if ((LA50_0 == 'E')) {
            s = 33;
          }
          
          else if ((LA50_0 == '&')) {
            s = 34;
          }
          
          else if ((LA50_0 == '_')) {
            s = 35;
          }
          
          else if ((LA50_0 == '-')) {
            s = 36;
          }
          
          else if ((LA50_0 == '\t' || LA50_0 == ' ')) {
            s = 37;
          }
          
          else if ((LA50_0 == '\r')) {
            s = 38;
          }
          
          else if ((LA50_0 == '\n')) {
            s = 39;
          }
          
          else if ((LA50_0 == 'p')) {
            s = 40;
          }
          
          else if ((LA50_0 == 'A' || (LA50_0 >= 'C' && LA50_0 <= 'D') || (LA50_0 >= 'F' && LA50_0 <= 'M')
              || (LA50_0 >= 'O' && LA50_0 <= 'P') || (LA50_0 >= 'R' && LA50_0 <= 'W')
              || (LA50_0 >= 'Y' && LA50_0 <= 'Z') || LA50_0 == 'a' || (LA50_0 >= 'c' && LA50_0 <= 'f')
              || (LA50_0 >= 'h' && LA50_0 <= 'k') || LA50_0 == 'm' || LA50_0 == 'o' || (LA50_0 >= 'r' && LA50_0 <= 'w')
              || (LA50_0 >= 'y' && LA50_0 <= 'z'))) {
            s = 41;
          }
          
          else if ((LA50_0 == '$')) {
            s = 42;
          }
          
          else if ((LA50_0 == '#')) {
            s = 43;
          }
          
          else if ((LA50_0 == '@')) {
            s = 44;
          }
          
          else if (((LA50_0 >= '\u0000' && LA50_0 <= '\b') || (LA50_0 >= '\u000B' && LA50_0 <= '\f')
              || (LA50_0 >= '\u000E' && LA50_0 <= '\u001F') || LA50_0 == '%' || (LA50_0 >= '*' && LA50_0 <= '+')
              || LA50_0 == '\\' || (LA50_0 >= '\u007F' && LA50_0 <= '\uFFFF'))) {
            s = 45;
          }
          
          else s = 26;
          
          if (s >= 0)
            return s;
          break;
        
        case 1:
          int LA50_10 = input.LA(1);
          
          s = -1;
          if (((LA50_10 >= '\u0000' && LA50_10 <= '\uFFFF'))) {
            s = 68;
          }
          
          else s = 45;
          
          if (s >= 0)
            return s;
          break;
        
        case 2:
          int LA50_7 = input.LA(1);
          
          s = -1;
          if (((LA50_7 >= '\u0000' && LA50_7 <= '\uFFFF'))) {
            s = 66;
          }
          
          else s = 45;
          
          if (s >= 0)
            return s;
          break;
        
        case 3:
          int LA50_156 = input.LA(1);
          
          s = -1;
          if (((LA50_156 >= '\u0000' && LA50_156 <= '\uFFFF'))) {
            s = 170;
          }
          
          else s = 169;
          
          if (s >= 0)
            return s;
          break;
        
        case 4:
          int LA50_9 = input.LA(1);
          
          s = -1;
          if (((LA50_9 >= '\u0000' && LA50_9 <= '\t') || (LA50_9 >= '\u000B' && LA50_9 <= '\f')
              || (LA50_9 >= '\u000E' && LA50_9 <= '\uFFFF'))) {
            s = 68;
          }
          
          else s = 45;
          
          if (s >= 0)
            return s;
          break;
      }
      NoViableAltException nvae = new NoViableAltException(getDescription(), 50, _s, input);
      error(nvae);
      throw nvae;
    }
    
  }
  
}
