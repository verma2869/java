// $ANTLR 3.4 /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g 2019-08-08 15:01:59

package com.impetus.idw.datastage.dsx.parser.antlr.lexerparser;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.RewriteEarlyExitException;
import org.antlr.runtime.tree.RewriteRuleSubtreeStream;
import org.antlr.runtime.tree.TreeAdaptor;

@SuppressWarnings({ "all", "warnings", "unchecked" })
public class Datastage_DSXParser extends Parser {
  
  public static final String[] tokenNames = new String[] { "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND_OP", "ANYCHAR",
      "APPROXIMATE_NUM_LIT", "BIT_STRING_LIT", "BODY_DELIMETER", "CARRET_OPERATOR_PART", "CHAR_STRING",
      "CHAR_STRING_PERL", "COLON", "COMMA", "COMMENT", "DATASTAGE_BEGIN_DSBPBINARY", "DATASTAGE_BEGIN_DSBPSOURCE",
      "DATASTAGE_BEGIN_DSDATACONNECTIONS", "DATASTAGE_BEGIN_DSEXECJOB", "DATASTAGE_BEGIN_DSJOB",
      "DATASTAGE_BEGIN_DSPARAMETERSETS", "DATASTAGE_BEGIN_DSRECORD", "DATASTAGE_BEGIN_DSROUTINES",
      "DATASTAGE_BEGIN_DSSCRIPT", "DATASTAGE_BEGIN_DSSUBRECORD", "DATASTAGE_BEGIN_DSTABLEDEFS",
      "DATASTAGE_BEGIN_DSUBINARY", "DATASTAGE_BEGIN_HEADER", "DATASTAGE_DESCRIPTION_BODY",
      "DATASTAGE_DESCRIPTION_WRAPPER", "DATASTAGE_END_DSBPBINARY", "DATASTAGE_END_DSBPSOURCE",
      "DATASTAGE_END_DSDATACONNECTIONS", "DATASTAGE_END_DSEXECJOB", "DATASTAGE_END_DSJOB",
      "DATASTAGE_END_DSPARAMETERSETS", "DATASTAGE_END_DSRECORD", "DATASTAGE_END_DSROUTINES", "DATASTAGE_END_DSSCRIPT",
      "DATASTAGE_END_DSSUBRECORD", "DATASTAGE_END_DSTABLEDEFS", "DATASTAGE_END_DSUBINARY", "DATASTAGE_END_HEADER",
      "DELIMITED_ID", "DOUBLE_PERIOD", "EXACT_NUM_LIT", "EXCLAMATION_OPERATOR_PART", "FOR_NOTATION", "GREATER_THAN_OP",
      "GREATER_THAN_OR_EQUALS_OP", "HEX_STRING_LIT", "INTRODUCER", "LEFT_BRACKET", "LEFT_CURLY_BRACKET", "LEFT_PAREN",
      "LESS_THAN_OP", "LESS_THAN_OR_EQUALS_OP", "MINUS_SIGN", "NATIONAL_CHAR_STRING_LIT", "NEWLINE", "NOT_EQUAL_OP",
      "OR_OP", "PARAMERTERIZED_VARIABLE", "PERIOD", "PROMPT", "QS_ANGLE", "QS_BRACE", "QS_BRACK", "QS_OTHER",
      "QS_OTHER_CH", "QS_PAREN", "QUESTION_MARK", "QUOTE", "REGULAR_ID", "REGULAR_ID_2", "RIGHT_BRACKET",
      "RIGHT_CURLY_BRACKET", "RIGHT_PAREN", "SCRIPT_VARIABLE", "SEMICOLON", "SEPARATOR", "SIMPLE_LETTER", "SOLIDUS",
      "SPACE", "TERNARY_IF_OPERATOR", "TILDE_OPERATOR_PART", "UNDERSCORE", "UNSIGNED_INTEGER", "VERTICAL_BAR", "ZV",
      "DATASTAGE_BINARY", "DATASTAGE_DSX_SCRIPT", "DATASTAGE_HEADER", "DATASTAGE_JOB", "DATASTAGE_RECORD",
      "DATASTAGE_SOURCE", "DATASTAGE_SUBINARY", "DATASTAGE_SUBRECORD" };
  
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
  
  public static final int DATASTAGE_BINARY = 90;
  
  public static final int DATASTAGE_DSX_SCRIPT = 91;
  
  public static final int DATASTAGE_HEADER = 92;
  
  public static final int DATASTAGE_JOB = 93;
  
  public static final int DATASTAGE_RECORD = 94;
  
  public static final int DATASTAGE_SOURCE = 95;
  
  public static final int DATASTAGE_SUBINARY = 96;
  
  public static final int DATASTAGE_SUBRECORD = 97;
  
  // delegates
  public Parser[] getDelegates() {
    return new Parser[] {};
  }
  
  // delegators
  
  public Datastage_DSXParser(TokenStream input) {
    this(input, new RecognizerSharedState());
  }
  
  public Datastage_DSXParser(TokenStream input, RecognizerSharedState state) {
    super(input, state);
  }
  
  protected TreeAdaptor adaptor = new CommonTreeAdaptor();
  
  public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
  }
  
  public TreeAdaptor getTreeAdaptor() {
    return adaptor;
  }
  
  public String[] getTokenNames() {
    return Datastage_DSXParser.tokenNames;
  }
  
  public String getGrammarFileName() {
    return "/home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g";
  }
  
  public static class datastage_dsx_script_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "datastage_dsx_script"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:31:1:
  // datastage_dsx_script : dsx_script ;
  public final Datastage_DSXParser.datastage_dsx_script_return datastage_dsx_script() throws RecognitionException {
    Datastage_DSXParser.datastage_dsx_script_return retval = new Datastage_DSXParser.datastage_dsx_script_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Datastage_DSXParser.dsx_script_return dsx_script1 = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:32:3:
      // ( dsx_script )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:32:5:
      // dsx_script
      {
        root_0 = (Object) adaptor.nil();
        
        pushFollow(FOLLOW_dsx_script_in_datastage_dsx_script81);
        dsx_script1 = dsx_script();
        
        state._fsp--;
        
        adaptor.addChild(root_0, dsx_script1.getTree());
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "datastage_dsx_script"
  
  public static class dsx_script_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "dsx_script"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:35:1:
  // dsx_script : header ( ds_job )+ ( ds_tabledef )? ( ds_execjob )* ( ds_parametersets )? ( ds_routines )? (
  // ds_dataconnections )? -> ^( DATASTAGE_DSX_SCRIPT header ( ds_job )+ ( ds_tabledef )? ( ds_execjob )* (
  // ds_parametersets )? ( ds_routines )? ( ds_dataconnections )? ) ;
  public final Datastage_DSXParser.dsx_script_return dsx_script() throws RecognitionException {
    Datastage_DSXParser.dsx_script_return retval = new Datastage_DSXParser.dsx_script_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Datastage_DSXParser.header_return header2 = null;
    
    Datastage_DSXParser.ds_job_return ds_job3 = null;
    
    Datastage_DSXParser.ds_tabledef_return ds_tabledef4 = null;
    
    Datastage_DSXParser.ds_execjob_return ds_execjob5 = null;
    
    Datastage_DSXParser.ds_parametersets_return ds_parametersets6 = null;
    
    Datastage_DSXParser.ds_routines_return ds_routines7 = null;
    
    Datastage_DSXParser.ds_dataconnections_return ds_dataconnections8 = null;
    
    RewriteRuleSubtreeStream stream_ds_routines = new RewriteRuleSubtreeStream(adaptor, "rule ds_routines");
    RewriteRuleSubtreeStream stream_ds_parametersets = new RewriteRuleSubtreeStream(adaptor, "rule ds_parametersets");
    RewriteRuleSubtreeStream stream_ds_job = new RewriteRuleSubtreeStream(adaptor, "rule ds_job");
    RewriteRuleSubtreeStream stream_header = new RewriteRuleSubtreeStream(adaptor, "rule header");
    RewriteRuleSubtreeStream stream_ds_execjob = new RewriteRuleSubtreeStream(adaptor, "rule ds_execjob");
    RewriteRuleSubtreeStream stream_ds_tabledef = new RewriteRuleSubtreeStream(adaptor, "rule ds_tabledef");
    RewriteRuleSubtreeStream stream_ds_dataconnections =
        new RewriteRuleSubtreeStream(adaptor, "rule ds_dataconnections");
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:36:3:
      // ( header ( ds_job )+ ( ds_tabledef )? ( ds_execjob )* ( ds_parametersets )? ( ds_routines )? (
      // ds_dataconnections )? -> ^( DATASTAGE_DSX_SCRIPT header ( ds_job )+ ( ds_tabledef )? ( ds_execjob )* (
      // ds_parametersets )? ( ds_routines )? ( ds_dataconnections )? ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:36:5:
      // header ( ds_job )+ ( ds_tabledef )? ( ds_execjob )* ( ds_parametersets )? ( ds_routines )? ( ds_dataconnections
      // )?
      {
        pushFollow(FOLLOW_header_in_dsx_script94);
        header2 = header();
        
        state._fsp--;
        
        stream_header.add(header2.getTree());
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:36:12:
        // ( ds_job )+
        int cnt1 = 0;
        loop1: do {
          int alt1 = 2;
          int LA1_0 = input.LA(1);
          
          if ((LA1_0 == DATASTAGE_BEGIN_DSJOB)) {
            alt1 = 1;
          }
          
          switch (alt1) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:36:12:
            // ds_job
            {
              pushFollow(FOLLOW_ds_job_in_dsx_script96);
              ds_job3 = ds_job();
              
              state._fsp--;
              
              stream_ds_job.add(ds_job3.getTree());
              
            }
              break;
            
            default:
              if (cnt1 >= 1)
                break loop1;
              EarlyExitException eee = new EarlyExitException(1, input);
              throw eee;
          }
          cnt1++;
        }
        while (true);
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:36:20:
        // ( ds_tabledef )?
        int alt2 = 2;
        int LA2_0 = input.LA(1);
        
        if ((LA2_0 == DATASTAGE_BEGIN_DSTABLEDEFS)) {
          alt2 = 1;
        }
        switch (alt2) {
          case 1:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:36:20:
          // ds_tabledef
          {
            pushFollow(FOLLOW_ds_tabledef_in_dsx_script99);
            ds_tabledef4 = ds_tabledef();
            
            state._fsp--;
            
            stream_ds_tabledef.add(ds_tabledef4.getTree());
            
          }
            break;
          
        }
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:36:33:
        // ( ds_execjob )*
        loop3: do {
          int alt3 = 2;
          int LA3_0 = input.LA(1);
          
          if ((LA3_0 == DATASTAGE_BEGIN_DSEXECJOB)) {
            alt3 = 1;
          }
          
          switch (alt3) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:36:33:
            // ds_execjob
            {
              pushFollow(FOLLOW_ds_execjob_in_dsx_script102);
              ds_execjob5 = ds_execjob();
              
              state._fsp--;
              
              stream_ds_execjob.add(ds_execjob5.getTree());
              
            }
              break;
            
            default:
              break loop3;
          }
        }
        while (true);
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:36:45:
        // ( ds_parametersets )?
        int alt4 = 2;
        int LA4_0 = input.LA(1);
        
        if ((LA4_0 == DATASTAGE_BEGIN_DSPARAMETERSETS)) {
          alt4 = 1;
        }
        switch (alt4) {
          case 1:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:36:45:
          // ds_parametersets
          {
            pushFollow(FOLLOW_ds_parametersets_in_dsx_script105);
            ds_parametersets6 = ds_parametersets();
            
            state._fsp--;
            
            stream_ds_parametersets.add(ds_parametersets6.getTree());
            
          }
            break;
          
        }
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:36:63:
        // ( ds_routines )?
        int alt5 = 2;
        int LA5_0 = input.LA(1);
        
        if ((LA5_0 == DATASTAGE_BEGIN_DSROUTINES)) {
          alt5 = 1;
        }
        switch (alt5) {
          case 1:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:36:63:
          // ds_routines
          {
            pushFollow(FOLLOW_ds_routines_in_dsx_script108);
            ds_routines7 = ds_routines();
            
            state._fsp--;
            
            stream_ds_routines.add(ds_routines7.getTree());
            
          }
            break;
          
        }
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:36:76:
        // ( ds_dataconnections )?
        int alt6 = 2;
        int LA6_0 = input.LA(1);
        
        if ((LA6_0 == DATASTAGE_BEGIN_DSDATACONNECTIONS)) {
          alt6 = 1;
        }
        switch (alt6) {
          case 1:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:36:76:
          // ds_dataconnections
          {
            pushFollow(FOLLOW_ds_dataconnections_in_dsx_script111);
            ds_dataconnections8 = ds_dataconnections();
            
            state._fsp--;
            
            stream_ds_dataconnections.add(ds_dataconnections8.getTree());
            
          }
            break;
          
        }
        
        // AST REWRITE
        // elements: ds_execjob, header, ds_job, ds_parametersets, ds_tabledef, ds_routines, ds_dataconnections
        // token labels:
        // rule labels: retval
        // token list labels:
        // rule list labels:
        // wildcard labels:
        retval.tree = root_0;
        RewriteRuleSubtreeStream stream_retval =
            new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.tree : null);
        
        root_0 = (Object) adaptor.nil();
        // 37:5: -> ^( DATASTAGE_DSX_SCRIPT header ( ds_job )+ ( ds_tabledef )? ( ds_execjob )* ( ds_parametersets )? (
        // ds_routines )? ( ds_dataconnections )? )
        {
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:37:8:
          // ^( DATASTAGE_DSX_SCRIPT header ( ds_job )+ ( ds_tabledef )? ( ds_execjob )* ( ds_parametersets )? (
          // ds_routines )? ( ds_dataconnections )? )
          {
            Object root_1 = (Object) adaptor.nil();
            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(DATASTAGE_DSX_SCRIPT, "DATASTAGE_DSX_SCRIPT"),
                root_1);
            
            adaptor.addChild(root_1, stream_header.nextTree());
            
            if (!(stream_ds_job.hasNext())) {
              throw new RewriteEarlyExitException();
            }
            while (stream_ds_job.hasNext()) {
              adaptor.addChild(root_1, stream_ds_job.nextTree());
              
            }
            stream_ds_job.reset();
            
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:37:46:
            // ( ds_tabledef )?
            if (stream_ds_tabledef.hasNext()) {
              adaptor.addChild(root_1, stream_ds_tabledef.nextTree());
              
            }
            stream_ds_tabledef.reset();
            
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:37:59:
            // ( ds_execjob )*
            while (stream_ds_execjob.hasNext()) {
              adaptor.addChild(root_1, stream_ds_execjob.nextTree());
              
            }
            stream_ds_execjob.reset();
            
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:37:71:
            // ( ds_parametersets )?
            if (stream_ds_parametersets.hasNext()) {
              adaptor.addChild(root_1, stream_ds_parametersets.nextTree());
              
            }
            stream_ds_parametersets.reset();
            
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:37:90:
            // ( ds_routines )?
            if (stream_ds_routines.hasNext()) {
              adaptor.addChild(root_1, stream_ds_routines.nextTree());
              
            }
            stream_ds_routines.reset();
            
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:37:103:
            // ( ds_dataconnections )?
            if (stream_ds_dataconnections.hasNext()) {
              adaptor.addChild(root_1, stream_ds_dataconnections.nextTree());
              
            }
            stream_ds_dataconnections.reset();
            
            adaptor.addChild(root_0, root_1);
          }
          
        }
        
        retval.tree = root_0;
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "dsx_script"
  
  public static class ds_tabledef_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "ds_tabledef"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:40:1:
  // ds_tabledef : begin_dstabledef_key ^ ( property | ds_record )* end_dstabledef_key !;
  public final Datastage_DSXParser.ds_tabledef_return ds_tabledef() throws RecognitionException {
    Datastage_DSXParser.ds_tabledef_return retval = new Datastage_DSXParser.ds_tabledef_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Datastage_DSXParser.begin_dstabledef_key_return begin_dstabledef_key9 = null;
    
    Datastage_DSXParser.property_return property10 = null;
    
    Datastage_DSXParser.ds_record_return ds_record11 = null;
    
    Datastage_DSXParser.end_dstabledef_key_return end_dstabledef_key12 = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:41:3:
      // ( begin_dstabledef_key ^ ( property | ds_record )* end_dstabledef_key !)
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:41:5:
      // begin_dstabledef_key ^ ( property | ds_record )* end_dstabledef_key !
      {
        root_0 = (Object) adaptor.nil();
        
        pushFollow(FOLLOW_begin_dstabledef_key_in_ds_tabledef156);
        begin_dstabledef_key9 = begin_dstabledef_key();
        
        state._fsp--;
        
        root_0 = (Object) adaptor.becomeRoot(begin_dstabledef_key9.getTree(), root_0);
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:41:27:
        // ( property | ds_record )*
        loop7: do {
          int alt7 = 3;
          int LA7_0 = input.LA(1);
          
          if ((LA7_0 == REGULAR_ID)) {
            alt7 = 1;
          }
          else if ((LA7_0 == DATASTAGE_BEGIN_DSRECORD)) {
            alt7 = 2;
          }
          
          switch (alt7) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:41:28:
            // property
            {
              pushFollow(FOLLOW_property_in_ds_tabledef160);
              property10 = property();
              
              state._fsp--;
              
              adaptor.addChild(root_0, property10.getTree());
              
            }
              break;
            case 2:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:41:37:
            // ds_record
            {
              pushFollow(FOLLOW_ds_record_in_ds_tabledef162);
              ds_record11 = ds_record();
              
              state._fsp--;
              
              adaptor.addChild(root_0, ds_record11.getTree());
              
            }
              break;
            
            default:
              break loop7;
          }
        }
        while (true);
        
        pushFollow(FOLLOW_end_dstabledef_key_in_ds_tabledef166);
        end_dstabledef_key12 = end_dstabledef_key();
        
        state._fsp--;
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "ds_tabledef"
  
  public static class ds_execjob_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "ds_execjob"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:44:1:
  // ds_execjob : begin_dsexecjob_key ^ ( property | ds_record | ds_bpsource | ds_bpbinary | ds_script | comment )*
  // end_dsexecjob_key !;
  public final Datastage_DSXParser.ds_execjob_return ds_execjob() throws RecognitionException {
    Datastage_DSXParser.ds_execjob_return retval = new Datastage_DSXParser.ds_execjob_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Datastage_DSXParser.begin_dsexecjob_key_return begin_dsexecjob_key13 = null;
    
    Datastage_DSXParser.property_return property14 = null;
    
    Datastage_DSXParser.ds_record_return ds_record15 = null;
    
    Datastage_DSXParser.ds_bpsource_return ds_bpsource16 = null;
    
    Datastage_DSXParser.ds_bpbinary_return ds_bpbinary17 = null;
    
    Datastage_DSXParser.ds_script_return ds_script18 = null;
    
    Datastage_DSXParser.comment_return comment19 = null;
    
    Datastage_DSXParser.end_dsexecjob_key_return end_dsexecjob_key20 = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:45:3:
      // ( begin_dsexecjob_key ^ ( property | ds_record | ds_bpsource | ds_bpbinary | ds_script | comment )*
      // end_dsexecjob_key !)
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:45:5:
      // begin_dsexecjob_key ^ ( property | ds_record | ds_bpsource | ds_bpbinary | ds_script | comment )*
      // end_dsexecjob_key !
      {
        root_0 = (Object) adaptor.nil();
        
        pushFollow(FOLLOW_begin_dsexecjob_key_in_ds_execjob180);
        begin_dsexecjob_key13 = begin_dsexecjob_key();
        
        state._fsp--;
        
        root_0 = (Object) adaptor.becomeRoot(begin_dsexecjob_key13.getTree(), root_0);
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:45:26:
        // ( property | ds_record | ds_bpsource | ds_bpbinary | ds_script | comment )*
        loop8: do {
          int alt8 = 7;
          switch (input.LA(1)) {
            case REGULAR_ID: {
              int LA8_2 = input.LA(2);
              
              if ((LA8_2 == DATASTAGE_DESCRIPTION_BODY || LA8_2 == DELIMITED_ID)) {
                alt8 = 1;
              }
              else if (((LA8_2 >= DATASTAGE_BEGIN_DSBPBINARY && LA8_2 <= DATASTAGE_BEGIN_DSBPSOURCE)
                  || LA8_2 == DATASTAGE_BEGIN_DSRECORD || LA8_2 == DATASTAGE_BEGIN_DSSCRIPT
                  || LA8_2 == DATASTAGE_END_DSEXECJOB || LA8_2 == REGULAR_ID)) {
                alt8 = 6;
              }
              
            }
              break;
            case DATASTAGE_BEGIN_DSRECORD: {
              alt8 = 2;
            }
              break;
            case DATASTAGE_BEGIN_DSBPSOURCE: {
              alt8 = 3;
            }
              break;
            case DATASTAGE_BEGIN_DSBPBINARY: {
              alt8 = 4;
            }
              break;
            case DATASTAGE_BEGIN_DSSCRIPT: {
              alt8 = 5;
            }
              break;
            
          }
          
          switch (alt8) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:45:27:
            // property
            {
              pushFollow(FOLLOW_property_in_ds_execjob184);
              property14 = property();
              
              state._fsp--;
              
              adaptor.addChild(root_0, property14.getTree());
              
            }
              break;
            case 2:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:45:36:
            // ds_record
            {
              pushFollow(FOLLOW_ds_record_in_ds_execjob186);
              ds_record15 = ds_record();
              
              state._fsp--;
              
              adaptor.addChild(root_0, ds_record15.getTree());
              
            }
              break;
            case 3:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:45:46:
            // ds_bpsource
            {
              pushFollow(FOLLOW_ds_bpsource_in_ds_execjob188);
              ds_bpsource16 = ds_bpsource();
              
              state._fsp--;
              
              adaptor.addChild(root_0, ds_bpsource16.getTree());
              
            }
              break;
            case 4:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:45:58:
            // ds_bpbinary
            {
              pushFollow(FOLLOW_ds_bpbinary_in_ds_execjob190);
              ds_bpbinary17 = ds_bpbinary();
              
              state._fsp--;
              
              adaptor.addChild(root_0, ds_bpbinary17.getTree());
              
            }
              break;
            case 5:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:45:70:
            // ds_script
            {
              pushFollow(FOLLOW_ds_script_in_ds_execjob192);
              ds_script18 = ds_script();
              
              state._fsp--;
              
              adaptor.addChild(root_0, ds_script18.getTree());
              
            }
              break;
            case 6:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:45:80:
            // comment
            {
              pushFollow(FOLLOW_comment_in_ds_execjob194);
              comment19 = comment();
              
              state._fsp--;
              
              adaptor.addChild(root_0, comment19.getTree());
              
            }
              break;
            
            default:
              break loop8;
          }
        }
        while (true);
        
        pushFollow(FOLLOW_end_dsexecjob_key_in_ds_execjob198);
        end_dsexecjob_key20 = end_dsexecjob_key();
        
        state._fsp--;
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "ds_execjob"
  
  public static class ds_bpsource_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "ds_bpsource"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:48:1:
  // ds_bpsource : begin_dsbpsource_key ( property )* end_dsbpsource_key -> ^( DATASTAGE_SOURCE ( property )* ) ;
  public final Datastage_DSXParser.ds_bpsource_return ds_bpsource() throws RecognitionException {
    Datastage_DSXParser.ds_bpsource_return retval = new Datastage_DSXParser.ds_bpsource_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Datastage_DSXParser.begin_dsbpsource_key_return begin_dsbpsource_key21 = null;
    
    Datastage_DSXParser.property_return property22 = null;
    
    Datastage_DSXParser.end_dsbpsource_key_return end_dsbpsource_key23 = null;
    
    RewriteRuleSubtreeStream stream_begin_dsbpsource_key =
        new RewriteRuleSubtreeStream(adaptor, "rule begin_dsbpsource_key");
    RewriteRuleSubtreeStream stream_property = new RewriteRuleSubtreeStream(adaptor, "rule property");
    RewriteRuleSubtreeStream stream_end_dsbpsource_key =
        new RewriteRuleSubtreeStream(adaptor, "rule end_dsbpsource_key");
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:49:3:
      // ( begin_dsbpsource_key ( property )* end_dsbpsource_key -> ^( DATASTAGE_SOURCE ( property )* ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:49:5:
      // begin_dsbpsource_key ( property )* end_dsbpsource_key
      {
        pushFollow(FOLLOW_begin_dsbpsource_key_in_ds_bpsource212);
        begin_dsbpsource_key21 = begin_dsbpsource_key();
        
        state._fsp--;
        
        stream_begin_dsbpsource_key.add(begin_dsbpsource_key21.getTree());
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:49:26:
        // ( property )*
        loop9: do {
          int alt9 = 2;
          int LA9_0 = input.LA(1);
          
          if ((LA9_0 == REGULAR_ID)) {
            alt9 = 1;
          }
          
          switch (alt9) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:49:26:
            // property
            {
              pushFollow(FOLLOW_property_in_ds_bpsource214);
              property22 = property();
              
              state._fsp--;
              
              stream_property.add(property22.getTree());
              
            }
              break;
            
            default:
              break loop9;
          }
        }
        while (true);
        
        pushFollow(FOLLOW_end_dsbpsource_key_in_ds_bpsource217);
        end_dsbpsource_key23 = end_dsbpsource_key();
        
        state._fsp--;
        
        stream_end_dsbpsource_key.add(end_dsbpsource_key23.getTree());
        
        // AST REWRITE
        // elements: property
        // token labels:
        // rule labels: retval
        // token list labels:
        // rule list labels:
        // wildcard labels:
        retval.tree = root_0;
        RewriteRuleSubtreeStream stream_retval =
            new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.tree : null);
        
        root_0 = (Object) adaptor.nil();
        // 49:55: -> ^( DATASTAGE_SOURCE ( property )* )
        {
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:49:58:
          // ^( DATASTAGE_SOURCE ( property )* )
          {
            Object root_1 = (Object) adaptor.nil();
            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(DATASTAGE_SOURCE, "DATASTAGE_SOURCE"), root_1);
            
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:49:77:
            // ( property )*
            while (stream_property.hasNext()) {
              adaptor.addChild(root_1, stream_property.nextTree());
              
            }
            stream_property.reset();
            
            adaptor.addChild(root_0, root_1);
          }
          
        }
        
        retval.tree = root_0;
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "ds_bpsource"
  
  public static class ds_bpbinary_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "ds_bpbinary"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:52:1:
  // ds_bpbinary : begin_dsbpbinary_key ( property )* end_dsbpbinary_key -> ^( DATASTAGE_BINARY ( property )* ) ;
  public final Datastage_DSXParser.ds_bpbinary_return ds_bpbinary() throws RecognitionException {
    Datastage_DSXParser.ds_bpbinary_return retval = new Datastage_DSXParser.ds_bpbinary_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Datastage_DSXParser.begin_dsbpbinary_key_return begin_dsbpbinary_key24 = null;
    
    Datastage_DSXParser.property_return property25 = null;
    
    Datastage_DSXParser.end_dsbpbinary_key_return end_dsbpbinary_key26 = null;
    
    RewriteRuleSubtreeStream stream_property = new RewriteRuleSubtreeStream(adaptor, "rule property");
    RewriteRuleSubtreeStream stream_begin_dsbpbinary_key =
        new RewriteRuleSubtreeStream(adaptor, "rule begin_dsbpbinary_key");
    RewriteRuleSubtreeStream stream_end_dsbpbinary_key =
        new RewriteRuleSubtreeStream(adaptor, "rule end_dsbpbinary_key");
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:53:3:
      // ( begin_dsbpbinary_key ( property )* end_dsbpbinary_key -> ^( DATASTAGE_BINARY ( property )* ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:53:5:
      // begin_dsbpbinary_key ( property )* end_dsbpbinary_key
      {
        pushFollow(FOLLOW_begin_dsbpbinary_key_in_ds_bpbinary239);
        begin_dsbpbinary_key24 = begin_dsbpbinary_key();
        
        state._fsp--;
        
        stream_begin_dsbpbinary_key.add(begin_dsbpbinary_key24.getTree());
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:53:26:
        // ( property )*
        loop10: do {
          int alt10 = 2;
          int LA10_0 = input.LA(1);
          
          if ((LA10_0 == REGULAR_ID)) {
            alt10 = 1;
          }
          
          switch (alt10) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:53:26:
            // property
            {
              pushFollow(FOLLOW_property_in_ds_bpbinary241);
              property25 = property();
              
              state._fsp--;
              
              stream_property.add(property25.getTree());
              
            }
              break;
            
            default:
              break loop10;
          }
        }
        while (true);
        
        pushFollow(FOLLOW_end_dsbpbinary_key_in_ds_bpbinary244);
        end_dsbpbinary_key26 = end_dsbpbinary_key();
        
        state._fsp--;
        
        stream_end_dsbpbinary_key.add(end_dsbpbinary_key26.getTree());
        
        // AST REWRITE
        // elements: property
        // token labels:
        // rule labels: retval
        // token list labels:
        // rule list labels:
        // wildcard labels:
        retval.tree = root_0;
        RewriteRuleSubtreeStream stream_retval =
            new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.tree : null);
        
        root_0 = (Object) adaptor.nil();
        // 53:55: -> ^( DATASTAGE_BINARY ( property )* )
        {
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:53:58:
          // ^( DATASTAGE_BINARY ( property )* )
          {
            Object root_1 = (Object) adaptor.nil();
            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(DATASTAGE_BINARY, "DATASTAGE_BINARY"), root_1);
            
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:53:77:
            // ( property )*
            while (stream_property.hasNext()) {
              adaptor.addChild(root_1, stream_property.nextTree());
              
            }
            stream_property.reset();
            
            adaptor.addChild(root_0, root_1);
          }
          
        }
        
        retval.tree = root_0;
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "ds_bpbinary"
  
  public static class ds_script_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "ds_script"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:56:1:
  // ds_script : begin_dsscript_key ^ ( property | ds_record | comment )* end_dsscript_key !;
  public final Datastage_DSXParser.ds_script_return ds_script() throws RecognitionException {
    Datastage_DSXParser.ds_script_return retval = new Datastage_DSXParser.ds_script_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Datastage_DSXParser.begin_dsscript_key_return begin_dsscript_key27 = null;
    
    Datastage_DSXParser.property_return property28 = null;
    
    Datastage_DSXParser.ds_record_return ds_record29 = null;
    
    Datastage_DSXParser.comment_return comment30 = null;
    
    Datastage_DSXParser.end_dsscript_key_return end_dsscript_key31 = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:57:3:
      // ( begin_dsscript_key ^ ( property | ds_record | comment )* end_dsscript_key !)
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:57:5:
      // begin_dsscript_key ^ ( property | ds_record | comment )* end_dsscript_key !
      {
        root_0 = (Object) adaptor.nil();
        
        pushFollow(FOLLOW_begin_dsscript_key_in_ds_script266);
        begin_dsscript_key27 = begin_dsscript_key();
        
        state._fsp--;
        
        root_0 = (Object) adaptor.becomeRoot(begin_dsscript_key27.getTree(), root_0);
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:57:25:
        // ( property | ds_record | comment )*
        loop11: do {
          int alt11 = 4;
          int LA11_0 = input.LA(1);
          
          if ((LA11_0 == REGULAR_ID)) {
            int LA11_2 = input.LA(2);
            
            if ((LA11_2 == DATASTAGE_DESCRIPTION_BODY || LA11_2 == DELIMITED_ID)) {
              alt11 = 1;
            }
            else if ((LA11_2 == DATASTAGE_BEGIN_DSRECORD || LA11_2 == DATASTAGE_END_DSSCRIPT || LA11_2 == REGULAR_ID)) {
              alt11 = 3;
            }
            
          }
          else if ((LA11_0 == DATASTAGE_BEGIN_DSRECORD)) {
            alt11 = 2;
          }
          
          switch (alt11) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:57:26:
            // property
            {
              pushFollow(FOLLOW_property_in_ds_script270);
              property28 = property();
              
              state._fsp--;
              
              adaptor.addChild(root_0, property28.getTree());
              
            }
              break;
            case 2:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:57:35:
            // ds_record
            {
              pushFollow(FOLLOW_ds_record_in_ds_script272);
              ds_record29 = ds_record();
              
              state._fsp--;
              
              adaptor.addChild(root_0, ds_record29.getTree());
              
            }
              break;
            case 3:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:57:46:
            // comment
            {
              pushFollow(FOLLOW_comment_in_ds_script275);
              comment30 = comment();
              
              state._fsp--;
              
              adaptor.addChild(root_0, comment30.getTree());
              
            }
              break;
            
            default:
              break loop11;
          }
        }
        while (true);
        
        pushFollow(FOLLOW_end_dsscript_key_in_ds_script279);
        end_dsscript_key31 = end_dsscript_key();
        
        state._fsp--;
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "ds_script"
  
  public static class ds_routines_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "ds_routines"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:60:1:
  // ds_routines : begin_dsroutines_key ^ ( property | ds_record | ds_subinary )* end_dsroutines_key !;
  public final Datastage_DSXParser.ds_routines_return ds_routines() throws RecognitionException {
    Datastage_DSXParser.ds_routines_return retval = new Datastage_DSXParser.ds_routines_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Datastage_DSXParser.begin_dsroutines_key_return begin_dsroutines_key32 = null;
    
    Datastage_DSXParser.property_return property33 = null;
    
    Datastage_DSXParser.ds_record_return ds_record34 = null;
    
    Datastage_DSXParser.ds_subinary_return ds_subinary35 = null;
    
    Datastage_DSXParser.end_dsroutines_key_return end_dsroutines_key36 = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:61:3:
      // ( begin_dsroutines_key ^ ( property | ds_record | ds_subinary )* end_dsroutines_key !)
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:61:5:
      // begin_dsroutines_key ^ ( property | ds_record | ds_subinary )* end_dsroutines_key !
      {
        root_0 = (Object) adaptor.nil();
        
        pushFollow(FOLLOW_begin_dsroutines_key_in_ds_routines293);
        begin_dsroutines_key32 = begin_dsroutines_key();
        
        state._fsp--;
        
        root_0 = (Object) adaptor.becomeRoot(begin_dsroutines_key32.getTree(), root_0);
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:61:27:
        // ( property | ds_record | ds_subinary )*
        loop12: do {
          int alt12 = 4;
          switch (input.LA(1)) {
            case REGULAR_ID: {
              alt12 = 1;
            }
              break;
            case DATASTAGE_BEGIN_DSRECORD: {
              alt12 = 2;
            }
              break;
            case DATASTAGE_BEGIN_DSUBINARY: {
              alt12 = 3;
            }
              break;
            
          }
          
          switch (alt12) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:61:28:
            // property
            {
              pushFollow(FOLLOW_property_in_ds_routines297);
              property33 = property();
              
              state._fsp--;
              
              adaptor.addChild(root_0, property33.getTree());
              
            }
              break;
            case 2:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:61:37:
            // ds_record
            {
              pushFollow(FOLLOW_ds_record_in_ds_routines299);
              ds_record34 = ds_record();
              
              state._fsp--;
              
              adaptor.addChild(root_0, ds_record34.getTree());
              
            }
              break;
            case 3:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:61:47:
            // ds_subinary
            {
              pushFollow(FOLLOW_ds_subinary_in_ds_routines301);
              ds_subinary35 = ds_subinary();
              
              state._fsp--;
              
              adaptor.addChild(root_0, ds_subinary35.getTree());
              
            }
              break;
            
            default:
              break loop12;
          }
        }
        while (true);
        
        pushFollow(FOLLOW_end_dsroutines_key_in_ds_routines305);
        end_dsroutines_key36 = end_dsroutines_key();
        
        state._fsp--;
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "ds_routines"
  
  public static class ds_subinary_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "ds_subinary"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:64:1:
  // ds_subinary : begin_dsubinary_key ( property )* end_dsubinary_key -> ^( DATASTAGE_SUBINARY ( property )* ) ;
  public final Datastage_DSXParser.ds_subinary_return ds_subinary() throws RecognitionException {
    Datastage_DSXParser.ds_subinary_return retval = new Datastage_DSXParser.ds_subinary_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Datastage_DSXParser.begin_dsubinary_key_return begin_dsubinary_key37 = null;
    
    Datastage_DSXParser.property_return property38 = null;
    
    Datastage_DSXParser.end_dsubinary_key_return end_dsubinary_key39 = null;
    
    RewriteRuleSubtreeStream stream_end_dsubinary_key = new RewriteRuleSubtreeStream(adaptor, "rule end_dsubinary_key");
    RewriteRuleSubtreeStream stream_begin_dsubinary_key =
        new RewriteRuleSubtreeStream(adaptor, "rule begin_dsubinary_key");
    RewriteRuleSubtreeStream stream_property = new RewriteRuleSubtreeStream(adaptor, "rule property");
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:65:3:
      // ( begin_dsubinary_key ( property )* end_dsubinary_key -> ^( DATASTAGE_SUBINARY ( property )* ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:65:5:
      // begin_dsubinary_key ( property )* end_dsubinary_key
      {
        pushFollow(FOLLOW_begin_dsubinary_key_in_ds_subinary319);
        begin_dsubinary_key37 = begin_dsubinary_key();
        
        state._fsp--;
        
        stream_begin_dsubinary_key.add(begin_dsubinary_key37.getTree());
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:65:25:
        // ( property )*
        loop13: do {
          int alt13 = 2;
          int LA13_0 = input.LA(1);
          
          if ((LA13_0 == REGULAR_ID)) {
            alt13 = 1;
          }
          
          switch (alt13) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:65:25:
            // property
            {
              pushFollow(FOLLOW_property_in_ds_subinary321);
              property38 = property();
              
              state._fsp--;
              
              stream_property.add(property38.getTree());
              
            }
              break;
            
            default:
              break loop13;
          }
        }
        while (true);
        
        pushFollow(FOLLOW_end_dsubinary_key_in_ds_subinary324);
        end_dsubinary_key39 = end_dsubinary_key();
        
        state._fsp--;
        
        stream_end_dsubinary_key.add(end_dsubinary_key39.getTree());
        
        // AST REWRITE
        // elements: property
        // token labels:
        // rule labels: retval
        // token list labels:
        // rule list labels:
        // wildcard labels:
        retval.tree = root_0;
        RewriteRuleSubtreeStream stream_retval =
            new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.tree : null);
        
        root_0 = (Object) adaptor.nil();
        // 65:53: -> ^( DATASTAGE_SUBINARY ( property )* )
        {
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:65:56:
          // ^( DATASTAGE_SUBINARY ( property )* )
          {
            Object root_1 = (Object) adaptor.nil();
            root_1 =
                (Object) adaptor.becomeRoot((Object) adaptor.create(DATASTAGE_SUBINARY, "DATASTAGE_SUBINARY"), root_1);
            
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:65:77:
            // ( property )*
            while (stream_property.hasNext()) {
              adaptor.addChild(root_1, stream_property.nextTree());
              
            }
            stream_property.reset();
            
            adaptor.addChild(root_0, root_1);
          }
          
        }
        
        retval.tree = root_0;
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "ds_subinary"
  
  public static class ds_dataconnections_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "ds_dataconnections"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:68:1:
  // ds_dataconnections : begin_dsdataconnections_key ^ ( property | ds_record )* end_dsdataconnections_key !;
  public final Datastage_DSXParser.ds_dataconnections_return ds_dataconnections() throws RecognitionException {
    Datastage_DSXParser.ds_dataconnections_return retval = new Datastage_DSXParser.ds_dataconnections_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Datastage_DSXParser.begin_dsdataconnections_key_return begin_dsdataconnections_key40 = null;
    
    Datastage_DSXParser.property_return property41 = null;
    
    Datastage_DSXParser.ds_record_return ds_record42 = null;
    
    Datastage_DSXParser.end_dsdataconnections_key_return end_dsdataconnections_key43 = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:69:3:
      // ( begin_dsdataconnections_key ^ ( property | ds_record )* end_dsdataconnections_key !)
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:69:5:
      // begin_dsdataconnections_key ^ ( property | ds_record )* end_dsdataconnections_key !
      {
        root_0 = (Object) adaptor.nil();
        
        pushFollow(FOLLOW_begin_dsdataconnections_key_in_ds_dataconnections346);
        begin_dsdataconnections_key40 = begin_dsdataconnections_key();
        
        state._fsp--;
        
        root_0 = (Object) adaptor.becomeRoot(begin_dsdataconnections_key40.getTree(), root_0);
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:69:34:
        // ( property | ds_record )*
        loop14: do {
          int alt14 = 3;
          int LA14_0 = input.LA(1);
          
          if ((LA14_0 == REGULAR_ID)) {
            alt14 = 1;
          }
          else if ((LA14_0 == DATASTAGE_BEGIN_DSRECORD)) {
            alt14 = 2;
          }
          
          switch (alt14) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:69:35:
            // property
            {
              pushFollow(FOLLOW_property_in_ds_dataconnections350);
              property41 = property();
              
              state._fsp--;
              
              adaptor.addChild(root_0, property41.getTree());
              
            }
              break;
            case 2:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:69:44:
            // ds_record
            {
              pushFollow(FOLLOW_ds_record_in_ds_dataconnections352);
              ds_record42 = ds_record();
              
              state._fsp--;
              
              adaptor.addChild(root_0, ds_record42.getTree());
              
            }
              break;
            
            default:
              break loop14;
          }
        }
        while (true);
        
        pushFollow(FOLLOW_end_dsdataconnections_key_in_ds_dataconnections356);
        end_dsdataconnections_key43 = end_dsdataconnections_key();
        
        state._fsp--;
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "ds_dataconnections"
  
  public static class ds_parametersets_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "ds_parametersets"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:72:1:
  // ds_parametersets : begin_dsparametersets_key ^ ( property | ds_record )* end_dsparametersets_key !;
  public final Datastage_DSXParser.ds_parametersets_return ds_parametersets() throws RecognitionException {
    Datastage_DSXParser.ds_parametersets_return retval = new Datastage_DSXParser.ds_parametersets_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Datastage_DSXParser.begin_dsparametersets_key_return begin_dsparametersets_key44 = null;
    
    Datastage_DSXParser.property_return property45 = null;
    
    Datastage_DSXParser.ds_record_return ds_record46 = null;
    
    Datastage_DSXParser.end_dsparametersets_key_return end_dsparametersets_key47 = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:73:3:
      // ( begin_dsparametersets_key ^ ( property | ds_record )* end_dsparametersets_key !)
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:73:5:
      // begin_dsparametersets_key ^ ( property | ds_record )* end_dsparametersets_key !
      {
        root_0 = (Object) adaptor.nil();
        
        pushFollow(FOLLOW_begin_dsparametersets_key_in_ds_parametersets370);
        begin_dsparametersets_key44 = begin_dsparametersets_key();
        
        state._fsp--;
        
        root_0 = (Object) adaptor.becomeRoot(begin_dsparametersets_key44.getTree(), root_0);
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:73:32:
        // ( property | ds_record )*
        loop15: do {
          int alt15 = 3;
          int LA15_0 = input.LA(1);
          
          if ((LA15_0 == REGULAR_ID)) {
            alt15 = 1;
          }
          else if ((LA15_0 == DATASTAGE_BEGIN_DSRECORD)) {
            alt15 = 2;
          }
          
          switch (alt15) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:73:33:
            // property
            {
              pushFollow(FOLLOW_property_in_ds_parametersets374);
              property45 = property();
              
              state._fsp--;
              
              adaptor.addChild(root_0, property45.getTree());
              
            }
              break;
            case 2:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:73:42:
            // ds_record
            {
              pushFollow(FOLLOW_ds_record_in_ds_parametersets376);
              ds_record46 = ds_record();
              
              state._fsp--;
              
              adaptor.addChild(root_0, ds_record46.getTree());
              
            }
              break;
            
            default:
              break loop15;
          }
        }
        while (true);
        
        pushFollow(FOLLOW_end_dsparametersets_key_in_ds_parametersets380);
        end_dsparametersets_key47 = end_dsparametersets_key();
        
        state._fsp--;
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "ds_parametersets"
  
  public static class header_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "header"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:76:1:
  // header : begin_header_key ( property )* end_header_key -> ^( DATASTAGE_HEADER ( property )* ) ;
  public final Datastage_DSXParser.header_return header() throws RecognitionException {
    Datastage_DSXParser.header_return retval = new Datastage_DSXParser.header_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Datastage_DSXParser.begin_header_key_return begin_header_key48 = null;
    
    Datastage_DSXParser.property_return property49 = null;
    
    Datastage_DSXParser.end_header_key_return end_header_key50 = null;
    
    RewriteRuleSubtreeStream stream_end_header_key = new RewriteRuleSubtreeStream(adaptor, "rule end_header_key");
    RewriteRuleSubtreeStream stream_property = new RewriteRuleSubtreeStream(adaptor, "rule property");
    RewriteRuleSubtreeStream stream_begin_header_key = new RewriteRuleSubtreeStream(adaptor, "rule begin_header_key");
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:77:3:
      // ( begin_header_key ( property )* end_header_key -> ^( DATASTAGE_HEADER ( property )* ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:77:5:
      // begin_header_key ( property )* end_header_key
      {
        pushFollow(FOLLOW_begin_header_key_in_header396);
        begin_header_key48 = begin_header_key();
        
        state._fsp--;
        
        stream_begin_header_key.add(begin_header_key48.getTree());
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:77:22:
        // ( property )*
        loop16: do {
          int alt16 = 2;
          int LA16_0 = input.LA(1);
          
          if ((LA16_0 == REGULAR_ID)) {
            alt16 = 1;
          }
          
          switch (alt16) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:77:22:
            // property
            {
              pushFollow(FOLLOW_property_in_header398);
              property49 = property();
              
              state._fsp--;
              
              stream_property.add(property49.getTree());
              
            }
              break;
            
            default:
              break loop16;
          }
        }
        while (true);
        
        pushFollow(FOLLOW_end_header_key_in_header401);
        end_header_key50 = end_header_key();
        
        state._fsp--;
        
        stream_end_header_key.add(end_header_key50.getTree());
        
        // AST REWRITE
        // elements: property
        // token labels:
        // rule labels: retval
        // token list labels:
        // rule list labels:
        // wildcard labels:
        retval.tree = root_0;
        RewriteRuleSubtreeStream stream_retval =
            new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.tree : null);
        
        root_0 = (Object) adaptor.nil();
        // 77:47: -> ^( DATASTAGE_HEADER ( property )* )
        {
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:77:50:
          // ^( DATASTAGE_HEADER ( property )* )
          {
            Object root_1 = (Object) adaptor.nil();
            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(DATASTAGE_HEADER, "DATASTAGE_HEADER"), root_1);
            
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:77:69:
            // ( property )*
            while (stream_property.hasNext()) {
              adaptor.addChild(root_1, stream_property.nextTree());
              
            }
            stream_property.reset();
            
            adaptor.addChild(root_0, root_1);
          }
          
        }
        
        retval.tree = root_0;
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "header"
  
  public static class ds_job_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "ds_job"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:80:1:
  // ds_job : begin_dsjob_key ^ ( property | ds_record )* end_dsjob_key !;
  public final Datastage_DSXParser.ds_job_return ds_job() throws RecognitionException {
    Datastage_DSXParser.ds_job_return retval = new Datastage_DSXParser.ds_job_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Datastage_DSXParser.begin_dsjob_key_return begin_dsjob_key51 = null;
    
    Datastage_DSXParser.property_return property52 = null;
    
    Datastage_DSXParser.ds_record_return ds_record53 = null;
    
    Datastage_DSXParser.end_dsjob_key_return end_dsjob_key54 = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:81:3:
      // ( begin_dsjob_key ^ ( property | ds_record )* end_dsjob_key !)
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:81:5:
      // begin_dsjob_key ^ ( property | ds_record )* end_dsjob_key !
      {
        root_0 = (Object) adaptor.nil();
        
        pushFollow(FOLLOW_begin_dsjob_key_in_ds_job423);
        begin_dsjob_key51 = begin_dsjob_key();
        
        state._fsp--;
        
        root_0 = (Object) adaptor.becomeRoot(begin_dsjob_key51.getTree(), root_0);
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:81:22:
        // ( property | ds_record )*
        loop17: do {
          int alt17 = 3;
          int LA17_0 = input.LA(1);
          
          if ((LA17_0 == REGULAR_ID)) {
            alt17 = 1;
          }
          else if ((LA17_0 == DATASTAGE_BEGIN_DSRECORD)) {
            alt17 = 2;
          }
          
          switch (alt17) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:81:23:
            // property
            {
              pushFollow(FOLLOW_property_in_ds_job427);
              property52 = property();
              
              state._fsp--;
              
              adaptor.addChild(root_0, property52.getTree());
              
            }
              break;
            case 2:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:81:32:
            // ds_record
            {
              pushFollow(FOLLOW_ds_record_in_ds_job429);
              ds_record53 = ds_record();
              
              state._fsp--;
              
              adaptor.addChild(root_0, ds_record53.getTree());
              
            }
              break;
            
            default:
              break loop17;
          }
        }
        while (true);
        
        pushFollow(FOLLOW_end_dsjob_key_in_ds_job433);
        end_dsjob_key54 = end_dsjob_key();
        
        state._fsp--;
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "ds_job"
  
  public static class ds_record_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "ds_record"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:84:1:
  // ds_record : begin_dsrecord_key ^ ( property | ds_subrecord )* end_dsrecord_key !;
  public final Datastage_DSXParser.ds_record_return ds_record() throws RecognitionException {
    Datastage_DSXParser.ds_record_return retval = new Datastage_DSXParser.ds_record_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Datastage_DSXParser.begin_dsrecord_key_return begin_dsrecord_key55 = null;
    
    Datastage_DSXParser.property_return property56 = null;
    
    Datastage_DSXParser.ds_subrecord_return ds_subrecord57 = null;
    
    Datastage_DSXParser.end_dsrecord_key_return end_dsrecord_key58 = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:85:3:
      // ( begin_dsrecord_key ^ ( property | ds_subrecord )* end_dsrecord_key !)
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:85:5:
      // begin_dsrecord_key ^ ( property | ds_subrecord )* end_dsrecord_key !
      {
        root_0 = (Object) adaptor.nil();
        
        pushFollow(FOLLOW_begin_dsrecord_key_in_ds_record447);
        begin_dsrecord_key55 = begin_dsrecord_key();
        
        state._fsp--;
        
        root_0 = (Object) adaptor.becomeRoot(begin_dsrecord_key55.getTree(), root_0);
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:85:25:
        // ( property | ds_subrecord )*
        loop18: do {
          int alt18 = 3;
          int LA18_0 = input.LA(1);
          
          if ((LA18_0 == REGULAR_ID)) {
            alt18 = 1;
          }
          else if ((LA18_0 == DATASTAGE_BEGIN_DSSUBRECORD)) {
            alt18 = 2;
          }
          
          switch (alt18) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:85:26:
            // property
            {
              pushFollow(FOLLOW_property_in_ds_record451);
              property56 = property();
              
              state._fsp--;
              
              adaptor.addChild(root_0, property56.getTree());
              
            }
              break;
            case 2:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:85:35:
            // ds_subrecord
            {
              pushFollow(FOLLOW_ds_subrecord_in_ds_record453);
              ds_subrecord57 = ds_subrecord();
              
              state._fsp--;
              
              adaptor.addChild(root_0, ds_subrecord57.getTree());
              
            }
              break;
            
            default:
              break loop18;
          }
        }
        while (true);
        
        pushFollow(FOLLOW_end_dsrecord_key_in_ds_record457);
        end_dsrecord_key58 = end_dsrecord_key();
        
        state._fsp--;
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "ds_record"
  
  public static class ds_subrecord_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "ds_subrecord"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:88:1:
  // ds_subrecord : begin_dssubrecord_key ( property )* end_dssubrecord_key -> ^( DATASTAGE_SUBRECORD ( property )* ) ;
  public final Datastage_DSXParser.ds_subrecord_return ds_subrecord() throws RecognitionException {
    Datastage_DSXParser.ds_subrecord_return retval = new Datastage_DSXParser.ds_subrecord_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Datastage_DSXParser.begin_dssubrecord_key_return begin_dssubrecord_key59 = null;
    
    Datastage_DSXParser.property_return property60 = null;
    
    Datastage_DSXParser.end_dssubrecord_key_return end_dssubrecord_key61 = null;
    
    RewriteRuleSubtreeStream stream_begin_dssubrecord_key =
        new RewriteRuleSubtreeStream(adaptor, "rule begin_dssubrecord_key");
    RewriteRuleSubtreeStream stream_property = new RewriteRuleSubtreeStream(adaptor, "rule property");
    RewriteRuleSubtreeStream stream_end_dssubrecord_key =
        new RewriteRuleSubtreeStream(adaptor, "rule end_dssubrecord_key");
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:89:3:
      // ( begin_dssubrecord_key ( property )* end_dssubrecord_key -> ^( DATASTAGE_SUBRECORD ( property )* ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:89:5:
      // begin_dssubrecord_key ( property )* end_dssubrecord_key
      {
        pushFollow(FOLLOW_begin_dssubrecord_key_in_ds_subrecord471);
        begin_dssubrecord_key59 = begin_dssubrecord_key();
        
        state._fsp--;
        
        stream_begin_dssubrecord_key.add(begin_dssubrecord_key59.getTree());
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:89:27:
        // ( property )*
        loop19: do {
          int alt19 = 2;
          int LA19_0 = input.LA(1);
          
          if ((LA19_0 == REGULAR_ID)) {
            alt19 = 1;
          }
          
          switch (alt19) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:89:27:
            // property
            {
              pushFollow(FOLLOW_property_in_ds_subrecord473);
              property60 = property();
              
              state._fsp--;
              
              stream_property.add(property60.getTree());
              
            }
              break;
            
            default:
              break loop19;
          }
        }
        while (true);
        
        pushFollow(FOLLOW_end_dssubrecord_key_in_ds_subrecord476);
        end_dssubrecord_key61 = end_dssubrecord_key();
        
        state._fsp--;
        
        stream_end_dssubrecord_key.add(end_dssubrecord_key61.getTree());
        
        // AST REWRITE
        // elements: property
        // token labels:
        // rule labels: retval
        // token list labels:
        // rule list labels:
        // wildcard labels:
        retval.tree = root_0;
        RewriteRuleSubtreeStream stream_retval =
            new RewriteRuleSubtreeStream(adaptor, "rule retval", retval != null ? retval.tree : null);
        
        root_0 = (Object) adaptor.nil();
        // 89:57: -> ^( DATASTAGE_SUBRECORD ( property )* )
        {
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:89:60:
          // ^( DATASTAGE_SUBRECORD ( property )* )
          {
            Object root_1 = (Object) adaptor.nil();
            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(DATASTAGE_SUBRECORD, "DATASTAGE_SUBRECORD"),
                root_1);
            
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:89:82:
            // ( property )*
            while (stream_property.hasNext()) {
              adaptor.addChild(root_1, stream_property.nextTree());
              
            }
            stream_property.reset();
            
            adaptor.addChild(root_0, root_1);
          }
          
        }
        
        retval.tree = root_0;
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "ds_subrecord"
  
  public static class property_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "property"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:92:1:
  // property : REGULAR_ID ( DELIMITED_ID | DATASTAGE_DESCRIPTION_BODY ) ;
  public final Datastage_DSXParser.property_return property() throws RecognitionException {
    Datastage_DSXParser.property_return retval = new Datastage_DSXParser.property_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token REGULAR_ID62 = null;
    Token set63 = null;
    
    Object REGULAR_ID62_tree = null;
    Object set63_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:93:3:
      // ( REGULAR_ID ( DELIMITED_ID | DATASTAGE_DESCRIPTION_BODY ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:93:5:
      // REGULAR_ID ( DELIMITED_ID | DATASTAGE_DESCRIPTION_BODY )
      {
        root_0 = (Object) adaptor.nil();
        
        REGULAR_ID62 = (Token) match(input, REGULAR_ID, FOLLOW_REGULAR_ID_in_property498);
        REGULAR_ID62_tree = (Object) adaptor.create(REGULAR_ID62);
        adaptor.addChild(root_0, REGULAR_ID62_tree);
        
        set63 = (Token) input.LT(1);
        
        if (input.LA(1) == DATASTAGE_DESCRIPTION_BODY || input.LA(1) == DELIMITED_ID) {
          input.consume();
          adaptor.addChild(root_0, (Object) adaptor.create(set63));
          state.errorRecovery = false;
        }
        else {
          MismatchedSetException mse = new MismatchedSetException(null, input);
          throw mse;
        }
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "property"
  
  public static class comment_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "comment"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:96:1:
  // comment : REGULAR_ID ;
  public final Datastage_DSXParser.comment_return comment() throws RecognitionException {
    Datastage_DSXParser.comment_return retval = new Datastage_DSXParser.comment_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token REGULAR_ID64 = null;
    
    Object REGULAR_ID64_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:97:3:
      // ( REGULAR_ID )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:97:5:
      // REGULAR_ID
      {
        root_0 = (Object) adaptor.nil();
        
        REGULAR_ID64 = (Token) match(input, REGULAR_ID, FOLLOW_REGULAR_ID_in_comment521);
        REGULAR_ID64_tree = (Object) adaptor.create(REGULAR_ID64);
        adaptor.addChild(root_0, REGULAR_ID64_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "comment"
  
  public static class begin_header_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "begin_header_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:100:1:
  // begin_header_key : DATASTAGE_BEGIN_HEADER ;
  public final Datastage_DSXParser.begin_header_key_return begin_header_key() throws RecognitionException {
    Datastage_DSXParser.begin_header_key_return retval = new Datastage_DSXParser.begin_header_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_BEGIN_HEADER65 = null;
    
    Object DATASTAGE_BEGIN_HEADER65_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:101:3:
      // ( DATASTAGE_BEGIN_HEADER )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:101:5:
      // DATASTAGE_BEGIN_HEADER
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_BEGIN_HEADER65 =
            (Token) match(input, DATASTAGE_BEGIN_HEADER, FOLLOW_DATASTAGE_BEGIN_HEADER_in_begin_header_key534);
        DATASTAGE_BEGIN_HEADER65_tree = (Object) adaptor.create(DATASTAGE_BEGIN_HEADER65);
        adaptor.addChild(root_0, DATASTAGE_BEGIN_HEADER65_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "begin_header_key"
  
  public static class end_header_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "end_header_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:104:1:
  // end_header_key : DATASTAGE_END_HEADER ;
  public final Datastage_DSXParser.end_header_key_return end_header_key() throws RecognitionException {
    Datastage_DSXParser.end_header_key_return retval = new Datastage_DSXParser.end_header_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_END_HEADER66 = null;
    
    Object DATASTAGE_END_HEADER66_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:105:3:
      // ( DATASTAGE_END_HEADER )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:105:5:
      // DATASTAGE_END_HEADER
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_END_HEADER66 =
            (Token) match(input, DATASTAGE_END_HEADER, FOLLOW_DATASTAGE_END_HEADER_in_end_header_key549);
        DATASTAGE_END_HEADER66_tree = (Object) adaptor.create(DATASTAGE_END_HEADER66);
        adaptor.addChild(root_0, DATASTAGE_END_HEADER66_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "end_header_key"
  
  public static class begin_dsjob_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "begin_dsjob_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:108:1:
  // begin_dsjob_key : DATASTAGE_BEGIN_DSJOB ;
  public final Datastage_DSXParser.begin_dsjob_key_return begin_dsjob_key() throws RecognitionException {
    Datastage_DSXParser.begin_dsjob_key_return retval = new Datastage_DSXParser.begin_dsjob_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_BEGIN_DSJOB67 = null;
    
    Object DATASTAGE_BEGIN_DSJOB67_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:109:3:
      // ( DATASTAGE_BEGIN_DSJOB )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:109:5:
      // DATASTAGE_BEGIN_DSJOB
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_BEGIN_DSJOB67 =
            (Token) match(input, DATASTAGE_BEGIN_DSJOB, FOLLOW_DATASTAGE_BEGIN_DSJOB_in_begin_dsjob_key562);
        DATASTAGE_BEGIN_DSJOB67_tree = (Object) adaptor.create(DATASTAGE_BEGIN_DSJOB67);
        adaptor.addChild(root_0, DATASTAGE_BEGIN_DSJOB67_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "begin_dsjob_key"
  
  public static class end_dsjob_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "end_dsjob_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:112:1:
  // end_dsjob_key : DATASTAGE_END_DSJOB ;
  public final Datastage_DSXParser.end_dsjob_key_return end_dsjob_key() throws RecognitionException {
    Datastage_DSXParser.end_dsjob_key_return retval = new Datastage_DSXParser.end_dsjob_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_END_DSJOB68 = null;
    
    Object DATASTAGE_END_DSJOB68_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:113:3:
      // ( DATASTAGE_END_DSJOB )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:113:5:
      // DATASTAGE_END_DSJOB
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_END_DSJOB68 =
            (Token) match(input, DATASTAGE_END_DSJOB, FOLLOW_DATASTAGE_END_DSJOB_in_end_dsjob_key575);
        DATASTAGE_END_DSJOB68_tree = (Object) adaptor.create(DATASTAGE_END_DSJOB68);
        adaptor.addChild(root_0, DATASTAGE_END_DSJOB68_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "end_dsjob_key"
  
  public static class begin_dsrecord_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "begin_dsrecord_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:116:1:
  // begin_dsrecord_key : DATASTAGE_BEGIN_DSRECORD ;
  public final Datastage_DSXParser.begin_dsrecord_key_return begin_dsrecord_key() throws RecognitionException {
    Datastage_DSXParser.begin_dsrecord_key_return retval = new Datastage_DSXParser.begin_dsrecord_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_BEGIN_DSRECORD69 = null;
    
    Object DATASTAGE_BEGIN_DSRECORD69_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:117:3:
      // ( DATASTAGE_BEGIN_DSRECORD )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:117:5:
      // DATASTAGE_BEGIN_DSRECORD
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_BEGIN_DSRECORD69 =
            (Token) match(input, DATASTAGE_BEGIN_DSRECORD, FOLLOW_DATASTAGE_BEGIN_DSRECORD_in_begin_dsrecord_key588);
        DATASTAGE_BEGIN_DSRECORD69_tree = (Object) adaptor.create(DATASTAGE_BEGIN_DSRECORD69);
        adaptor.addChild(root_0, DATASTAGE_BEGIN_DSRECORD69_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "begin_dsrecord_key"
  
  public static class end_dsrecord_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "end_dsrecord_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:120:1:
  // end_dsrecord_key : DATASTAGE_END_DSRECORD ;
  public final Datastage_DSXParser.end_dsrecord_key_return end_dsrecord_key() throws RecognitionException {
    Datastage_DSXParser.end_dsrecord_key_return retval = new Datastage_DSXParser.end_dsrecord_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_END_DSRECORD70 = null;
    
    Object DATASTAGE_END_DSRECORD70_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:121:3:
      // ( DATASTAGE_END_DSRECORD )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:121:5:
      // DATASTAGE_END_DSRECORD
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_END_DSRECORD70 =
            (Token) match(input, DATASTAGE_END_DSRECORD, FOLLOW_DATASTAGE_END_DSRECORD_in_end_dsrecord_key601);
        DATASTAGE_END_DSRECORD70_tree = (Object) adaptor.create(DATASTAGE_END_DSRECORD70);
        adaptor.addChild(root_0, DATASTAGE_END_DSRECORD70_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "end_dsrecord_key"
  
  public static class begin_dssubrecord_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "begin_dssubrecord_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:124:1:
  // begin_dssubrecord_key : DATASTAGE_BEGIN_DSSUBRECORD ;
  public final Datastage_DSXParser.begin_dssubrecord_key_return begin_dssubrecord_key() throws RecognitionException {
    Datastage_DSXParser.begin_dssubrecord_key_return retval = new Datastage_DSXParser.begin_dssubrecord_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_BEGIN_DSSUBRECORD71 = null;
    
    Object DATASTAGE_BEGIN_DSSUBRECORD71_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:125:3:
      // ( DATASTAGE_BEGIN_DSSUBRECORD )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:125:5:
      // DATASTAGE_BEGIN_DSSUBRECORD
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_BEGIN_DSSUBRECORD71 = (Token) match(input, DATASTAGE_BEGIN_DSSUBRECORD,
            FOLLOW_DATASTAGE_BEGIN_DSSUBRECORD_in_begin_dssubrecord_key616);
        DATASTAGE_BEGIN_DSSUBRECORD71_tree = (Object) adaptor.create(DATASTAGE_BEGIN_DSSUBRECORD71);
        adaptor.addChild(root_0, DATASTAGE_BEGIN_DSSUBRECORD71_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "begin_dssubrecord_key"
  
  public static class end_dssubrecord_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "end_dssubrecord_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:128:1:
  // end_dssubrecord_key : DATASTAGE_END_DSSUBRECORD ;
  public final Datastage_DSXParser.end_dssubrecord_key_return end_dssubrecord_key() throws RecognitionException {
    Datastage_DSXParser.end_dssubrecord_key_return retval = new Datastage_DSXParser.end_dssubrecord_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_END_DSSUBRECORD72 = null;
    
    Object DATASTAGE_END_DSSUBRECORD72_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:129:3:
      // ( DATASTAGE_END_DSSUBRECORD )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:129:5:
      // DATASTAGE_END_DSSUBRECORD
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_END_DSSUBRECORD72 =
            (Token) match(input, DATASTAGE_END_DSSUBRECORD, FOLLOW_DATASTAGE_END_DSSUBRECORD_in_end_dssubrecord_key629);
        DATASTAGE_END_DSSUBRECORD72_tree = (Object) adaptor.create(DATASTAGE_END_DSSUBRECORD72);
        adaptor.addChild(root_0, DATASTAGE_END_DSSUBRECORD72_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "end_dssubrecord_key"
  
  public static class begin_dstabledef_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "begin_dstabledef_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:132:1:
  // begin_dstabledef_key : DATASTAGE_BEGIN_DSTABLEDEFS ;
  public final Datastage_DSXParser.begin_dstabledef_key_return begin_dstabledef_key() throws RecognitionException {
    Datastage_DSXParser.begin_dstabledef_key_return retval = new Datastage_DSXParser.begin_dstabledef_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_BEGIN_DSTABLEDEFS73 = null;
    
    Object DATASTAGE_BEGIN_DSTABLEDEFS73_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:133:3:
      // ( DATASTAGE_BEGIN_DSTABLEDEFS )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:133:4:
      // DATASTAGE_BEGIN_DSTABLEDEFS
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_BEGIN_DSTABLEDEFS73 = (Token) match(input, DATASTAGE_BEGIN_DSTABLEDEFS,
            FOLLOW_DATASTAGE_BEGIN_DSTABLEDEFS_in_begin_dstabledef_key643);
        DATASTAGE_BEGIN_DSTABLEDEFS73_tree = (Object) adaptor.create(DATASTAGE_BEGIN_DSTABLEDEFS73);
        adaptor.addChild(root_0, DATASTAGE_BEGIN_DSTABLEDEFS73_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "begin_dstabledef_key"
  
  public static class end_dstabledef_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "end_dstabledef_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:136:1:
  // end_dstabledef_key : DATASTAGE_END_DSTABLEDEFS ;
  public final Datastage_DSXParser.end_dstabledef_key_return end_dstabledef_key() throws RecognitionException {
    Datastage_DSXParser.end_dstabledef_key_return retval = new Datastage_DSXParser.end_dstabledef_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_END_DSTABLEDEFS74 = null;
    
    Object DATASTAGE_END_DSTABLEDEFS74_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:137:3:
      // ( DATASTAGE_END_DSTABLEDEFS )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:137:4:
      // DATASTAGE_END_DSTABLEDEFS
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_END_DSTABLEDEFS74 =
            (Token) match(input, DATASTAGE_END_DSTABLEDEFS, FOLLOW_DATASTAGE_END_DSTABLEDEFS_in_end_dstabledef_key655);
        DATASTAGE_END_DSTABLEDEFS74_tree = (Object) adaptor.create(DATASTAGE_END_DSTABLEDEFS74);
        adaptor.addChild(root_0, DATASTAGE_END_DSTABLEDEFS74_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "end_dstabledef_key"
  
  public static class begin_dsexecjob_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "begin_dsexecjob_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:140:1:
  // begin_dsexecjob_key : DATASTAGE_BEGIN_DSEXECJOB ;
  public final Datastage_DSXParser.begin_dsexecjob_key_return begin_dsexecjob_key() throws RecognitionException {
    Datastage_DSXParser.begin_dsexecjob_key_return retval = new Datastage_DSXParser.begin_dsexecjob_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_BEGIN_DSEXECJOB75 = null;
    
    Object DATASTAGE_BEGIN_DSEXECJOB75_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:141:3:
      // ( DATASTAGE_BEGIN_DSEXECJOB )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:141:4:
      // DATASTAGE_BEGIN_DSEXECJOB
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_BEGIN_DSEXECJOB75 =
            (Token) match(input, DATASTAGE_BEGIN_DSEXECJOB, FOLLOW_DATASTAGE_BEGIN_DSEXECJOB_in_begin_dsexecjob_key669);
        DATASTAGE_BEGIN_DSEXECJOB75_tree = (Object) adaptor.create(DATASTAGE_BEGIN_DSEXECJOB75);
        adaptor.addChild(root_0, DATASTAGE_BEGIN_DSEXECJOB75_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "begin_dsexecjob_key"
  
  public static class end_dsexecjob_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "end_dsexecjob_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:144:1:
  // end_dsexecjob_key : DATASTAGE_END_DSEXECJOB ;
  public final Datastage_DSXParser.end_dsexecjob_key_return end_dsexecjob_key() throws RecognitionException {
    Datastage_DSXParser.end_dsexecjob_key_return retval = new Datastage_DSXParser.end_dsexecjob_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_END_DSEXECJOB76 = null;
    
    Object DATASTAGE_END_DSEXECJOB76_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:145:3:
      // ( DATASTAGE_END_DSEXECJOB )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:145:4:
      // DATASTAGE_END_DSEXECJOB
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_END_DSEXECJOB76 =
            (Token) match(input, DATASTAGE_END_DSEXECJOB, FOLLOW_DATASTAGE_END_DSEXECJOB_in_end_dsexecjob_key681);
        DATASTAGE_END_DSEXECJOB76_tree = (Object) adaptor.create(DATASTAGE_END_DSEXECJOB76);
        adaptor.addChild(root_0, DATASTAGE_END_DSEXECJOB76_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "end_dsexecjob_key"
  
  public static class begin_dsbpsource_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "begin_dsbpsource_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:149:1:
  // begin_dsbpsource_key : DATASTAGE_BEGIN_DSBPSOURCE ;
  public final Datastage_DSXParser.begin_dsbpsource_key_return begin_dsbpsource_key() throws RecognitionException {
    Datastage_DSXParser.begin_dsbpsource_key_return retval = new Datastage_DSXParser.begin_dsbpsource_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_BEGIN_DSBPSOURCE77 = null;
    
    Object DATASTAGE_BEGIN_DSBPSOURCE77_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:150:3:
      // ( DATASTAGE_BEGIN_DSBPSOURCE )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:150:5:
      // DATASTAGE_BEGIN_DSBPSOURCE
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_BEGIN_DSBPSOURCE77 = (Token) match(input, DATASTAGE_BEGIN_DSBPSOURCE,
            FOLLOW_DATASTAGE_BEGIN_DSBPSOURCE_in_begin_dsbpsource_key697);
        DATASTAGE_BEGIN_DSBPSOURCE77_tree = (Object) adaptor.create(DATASTAGE_BEGIN_DSBPSOURCE77);
        adaptor.addChild(root_0, DATASTAGE_BEGIN_DSBPSOURCE77_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "begin_dsbpsource_key"
  
  public static class end_dsbpsource_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "end_dsbpsource_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:153:1:
  // end_dsbpsource_key : DATASTAGE_END_DSBPSOURCE ;
  public final Datastage_DSXParser.end_dsbpsource_key_return end_dsbpsource_key() throws RecognitionException {
    Datastage_DSXParser.end_dsbpsource_key_return retval = new Datastage_DSXParser.end_dsbpsource_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_END_DSBPSOURCE78 = null;
    
    Object DATASTAGE_END_DSBPSOURCE78_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:154:3:
      // ( DATASTAGE_END_DSBPSOURCE )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:154:5:
      // DATASTAGE_END_DSBPSOURCE
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_END_DSBPSOURCE78 =
            (Token) match(input, DATASTAGE_END_DSBPSOURCE, FOLLOW_DATASTAGE_END_DSBPSOURCE_in_end_dsbpsource_key712);
        DATASTAGE_END_DSBPSOURCE78_tree = (Object) adaptor.create(DATASTAGE_END_DSBPSOURCE78);
        adaptor.addChild(root_0, DATASTAGE_END_DSBPSOURCE78_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "end_dsbpsource_key"
  
  public static class begin_dsbpbinary_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "begin_dsbpbinary_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:157:1:
  // begin_dsbpbinary_key : DATASTAGE_BEGIN_DSBPBINARY ;
  public final Datastage_DSXParser.begin_dsbpbinary_key_return begin_dsbpbinary_key() throws RecognitionException {
    Datastage_DSXParser.begin_dsbpbinary_key_return retval = new Datastage_DSXParser.begin_dsbpbinary_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_BEGIN_DSBPBINARY79 = null;
    
    Object DATASTAGE_BEGIN_DSBPBINARY79_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:158:3:
      // ( DATASTAGE_BEGIN_DSBPBINARY )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:158:5:
      // DATASTAGE_BEGIN_DSBPBINARY
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_BEGIN_DSBPBINARY79 = (Token) match(input, DATASTAGE_BEGIN_DSBPBINARY,
            FOLLOW_DATASTAGE_BEGIN_DSBPBINARY_in_begin_dsbpbinary_key725);
        DATASTAGE_BEGIN_DSBPBINARY79_tree = (Object) adaptor.create(DATASTAGE_BEGIN_DSBPBINARY79);
        adaptor.addChild(root_0, DATASTAGE_BEGIN_DSBPBINARY79_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "begin_dsbpbinary_key"
  
  public static class end_dsbpbinary_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "end_dsbpbinary_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:161:1:
  // end_dsbpbinary_key : DATASTAGE_END_DSBPBINARY ;
  public final Datastage_DSXParser.end_dsbpbinary_key_return end_dsbpbinary_key() throws RecognitionException {
    Datastage_DSXParser.end_dsbpbinary_key_return retval = new Datastage_DSXParser.end_dsbpbinary_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_END_DSBPBINARY80 = null;
    
    Object DATASTAGE_END_DSBPBINARY80_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:162:3:
      // ( DATASTAGE_END_DSBPBINARY )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:162:5:
      // DATASTAGE_END_DSBPBINARY
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_END_DSBPBINARY80 =
            (Token) match(input, DATASTAGE_END_DSBPBINARY, FOLLOW_DATASTAGE_END_DSBPBINARY_in_end_dsbpbinary_key738);
        DATASTAGE_END_DSBPBINARY80_tree = (Object) adaptor.create(DATASTAGE_END_DSBPBINARY80);
        adaptor.addChild(root_0, DATASTAGE_END_DSBPBINARY80_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "end_dsbpbinary_key"
  
  public static class begin_dsroutines_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "begin_dsroutines_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:165:1:
  // begin_dsroutines_key : DATASTAGE_BEGIN_DSROUTINES ;
  public final Datastage_DSXParser.begin_dsroutines_key_return begin_dsroutines_key() throws RecognitionException {
    Datastage_DSXParser.begin_dsroutines_key_return retval = new Datastage_DSXParser.begin_dsroutines_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_BEGIN_DSROUTINES81 = null;
    
    Object DATASTAGE_BEGIN_DSROUTINES81_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:166:3:
      // ( DATASTAGE_BEGIN_DSROUTINES )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:166:5:
      // DATASTAGE_BEGIN_DSROUTINES
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_BEGIN_DSROUTINES81 = (Token) match(input, DATASTAGE_BEGIN_DSROUTINES,
            FOLLOW_DATASTAGE_BEGIN_DSROUTINES_in_begin_dsroutines_key751);
        DATASTAGE_BEGIN_DSROUTINES81_tree = (Object) adaptor.create(DATASTAGE_BEGIN_DSROUTINES81);
        adaptor.addChild(root_0, DATASTAGE_BEGIN_DSROUTINES81_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "begin_dsroutines_key"
  
  public static class end_dsroutines_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "end_dsroutines_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:169:1:
  // end_dsroutines_key : DATASTAGE_END_DSROUTINES ;
  public final Datastage_DSXParser.end_dsroutines_key_return end_dsroutines_key() throws RecognitionException {
    Datastage_DSXParser.end_dsroutines_key_return retval = new Datastage_DSXParser.end_dsroutines_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_END_DSROUTINES82 = null;
    
    Object DATASTAGE_END_DSROUTINES82_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:170:3:
      // ( DATASTAGE_END_DSROUTINES )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:170:5:
      // DATASTAGE_END_DSROUTINES
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_END_DSROUTINES82 =
            (Token) match(input, DATASTAGE_END_DSROUTINES, FOLLOW_DATASTAGE_END_DSROUTINES_in_end_dsroutines_key766);
        DATASTAGE_END_DSROUTINES82_tree = (Object) adaptor.create(DATASTAGE_END_DSROUTINES82);
        adaptor.addChild(root_0, DATASTAGE_END_DSROUTINES82_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "end_dsroutines_key"
  
  public static class begin_dsdataconnections_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "begin_dsdataconnections_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:173:1:
  // begin_dsdataconnections_key : DATASTAGE_BEGIN_DSDATACONNECTIONS ;
  public final Datastage_DSXParser.begin_dsdataconnections_key_return begin_dsdataconnections_key()
      throws RecognitionException {
    Datastage_DSXParser.begin_dsdataconnections_key_return retval =
        new Datastage_DSXParser.begin_dsdataconnections_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_BEGIN_DSDATACONNECTIONS83 = null;
    
    Object DATASTAGE_BEGIN_DSDATACONNECTIONS83_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:174:3:
      // ( DATASTAGE_BEGIN_DSDATACONNECTIONS )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:174:5:
      // DATASTAGE_BEGIN_DSDATACONNECTIONS
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_BEGIN_DSDATACONNECTIONS83 = (Token) match(input, DATASTAGE_BEGIN_DSDATACONNECTIONS,
            FOLLOW_DATASTAGE_BEGIN_DSDATACONNECTIONS_in_begin_dsdataconnections_key783);
        DATASTAGE_BEGIN_DSDATACONNECTIONS83_tree = (Object) adaptor.create(DATASTAGE_BEGIN_DSDATACONNECTIONS83);
        adaptor.addChild(root_0, DATASTAGE_BEGIN_DSDATACONNECTIONS83_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "begin_dsdataconnections_key"
  
  public static class end_dsdataconnections_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "end_dsdataconnections_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:177:1:
  // end_dsdataconnections_key : DATASTAGE_END_DSDATACONNECTIONS ;
  public final Datastage_DSXParser.end_dsdataconnections_key_return end_dsdataconnections_key()
      throws RecognitionException {
    Datastage_DSXParser.end_dsdataconnections_key_return retval =
        new Datastage_DSXParser.end_dsdataconnections_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_END_DSDATACONNECTIONS84 = null;
    
    Object DATASTAGE_END_DSDATACONNECTIONS84_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:178:3:
      // ( DATASTAGE_END_DSDATACONNECTIONS )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:178:5:
      // DATASTAGE_END_DSDATACONNECTIONS
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_END_DSDATACONNECTIONS84 = (Token) match(input, DATASTAGE_END_DSDATACONNECTIONS,
            FOLLOW_DATASTAGE_END_DSDATACONNECTIONS_in_end_dsdataconnections_key796);
        DATASTAGE_END_DSDATACONNECTIONS84_tree = (Object) adaptor.create(DATASTAGE_END_DSDATACONNECTIONS84);
        adaptor.addChild(root_0, DATASTAGE_END_DSDATACONNECTIONS84_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "end_dsdataconnections_key"
  
  public static class begin_dsubinary_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "begin_dsubinary_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:181:1:
  // begin_dsubinary_key : DATASTAGE_BEGIN_DSUBINARY ;
  public final Datastage_DSXParser.begin_dsubinary_key_return begin_dsubinary_key() throws RecognitionException {
    Datastage_DSXParser.begin_dsubinary_key_return retval = new Datastage_DSXParser.begin_dsubinary_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_BEGIN_DSUBINARY85 = null;
    
    Object DATASTAGE_BEGIN_DSUBINARY85_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:182:3:
      // ( DATASTAGE_BEGIN_DSUBINARY )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:182:5:
      // DATASTAGE_BEGIN_DSUBINARY
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_BEGIN_DSUBINARY85 =
            (Token) match(input, DATASTAGE_BEGIN_DSUBINARY, FOLLOW_DATASTAGE_BEGIN_DSUBINARY_in_begin_dsubinary_key813);
        DATASTAGE_BEGIN_DSUBINARY85_tree = (Object) adaptor.create(DATASTAGE_BEGIN_DSUBINARY85);
        adaptor.addChild(root_0, DATASTAGE_BEGIN_DSUBINARY85_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "begin_dsubinary_key"
  
  public static class end_dsubinary_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "end_dsubinary_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:185:1:
  // end_dsubinary_key : DATASTAGE_END_DSUBINARY ;
  public final Datastage_DSXParser.end_dsubinary_key_return end_dsubinary_key() throws RecognitionException {
    Datastage_DSXParser.end_dsubinary_key_return retval = new Datastage_DSXParser.end_dsubinary_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_END_DSUBINARY86 = null;
    
    Object DATASTAGE_END_DSUBINARY86_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:186:3:
      // ( DATASTAGE_END_DSUBINARY )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:186:5:
      // DATASTAGE_END_DSUBINARY
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_END_DSUBINARY86 =
            (Token) match(input, DATASTAGE_END_DSUBINARY, FOLLOW_DATASTAGE_END_DSUBINARY_in_end_dsubinary_key828);
        DATASTAGE_END_DSUBINARY86_tree = (Object) adaptor.create(DATASTAGE_END_DSUBINARY86);
        adaptor.addChild(root_0, DATASTAGE_END_DSUBINARY86_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "end_dsubinary_key"
  
  public static class begin_dsparametersets_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "begin_dsparametersets_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:189:1:
  // begin_dsparametersets_key : DATASTAGE_BEGIN_DSPARAMETERSETS ;
  public final Datastage_DSXParser.begin_dsparametersets_key_return begin_dsparametersets_key()
      throws RecognitionException {
    Datastage_DSXParser.begin_dsparametersets_key_return retval =
        new Datastage_DSXParser.begin_dsparametersets_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_BEGIN_DSPARAMETERSETS87 = null;
    
    Object DATASTAGE_BEGIN_DSPARAMETERSETS87_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:190:3:
      // ( DATASTAGE_BEGIN_DSPARAMETERSETS )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:190:5:
      // DATASTAGE_BEGIN_DSPARAMETERSETS
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_BEGIN_DSPARAMETERSETS87 = (Token) match(input, DATASTAGE_BEGIN_DSPARAMETERSETS,
            FOLLOW_DATASTAGE_BEGIN_DSPARAMETERSETS_in_begin_dsparametersets_key845);
        DATASTAGE_BEGIN_DSPARAMETERSETS87_tree = (Object) adaptor.create(DATASTAGE_BEGIN_DSPARAMETERSETS87);
        adaptor.addChild(root_0, DATASTAGE_BEGIN_DSPARAMETERSETS87_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "begin_dsparametersets_key"
  
  public static class end_dsparametersets_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "end_dsparametersets_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:193:1:
  // end_dsparametersets_key : DATASTAGE_END_DSPARAMETERSETS ;
  public final Datastage_DSXParser.end_dsparametersets_key_return end_dsparametersets_key()
      throws RecognitionException {
    Datastage_DSXParser.end_dsparametersets_key_return retval =
        new Datastage_DSXParser.end_dsparametersets_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_END_DSPARAMETERSETS88 = null;
    
    Object DATASTAGE_END_DSPARAMETERSETS88_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:194:3:
      // ( DATASTAGE_END_DSPARAMETERSETS )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:194:4:
      // DATASTAGE_END_DSPARAMETERSETS
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_END_DSPARAMETERSETS88 = (Token) match(input, DATASTAGE_END_DSPARAMETERSETS,
            FOLLOW_DATASTAGE_END_DSPARAMETERSETS_in_end_dsparametersets_key857);
        DATASTAGE_END_DSPARAMETERSETS88_tree = (Object) adaptor.create(DATASTAGE_END_DSPARAMETERSETS88);
        adaptor.addChild(root_0, DATASTAGE_END_DSPARAMETERSETS88_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "end_dsparametersets_key"
  
  public static class begin_dsscript_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "begin_dsscript_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:197:1:
  // begin_dsscript_key : DATASTAGE_BEGIN_DSSCRIPT ;
  public final Datastage_DSXParser.begin_dsscript_key_return begin_dsscript_key() throws RecognitionException {
    Datastage_DSXParser.begin_dsscript_key_return retval = new Datastage_DSXParser.begin_dsscript_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_BEGIN_DSSCRIPT89 = null;
    
    Object DATASTAGE_BEGIN_DSSCRIPT89_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:198:3:
      // ( DATASTAGE_BEGIN_DSSCRIPT )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:198:5:
      // DATASTAGE_BEGIN_DSSCRIPT
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_BEGIN_DSSCRIPT89 =
            (Token) match(input, DATASTAGE_BEGIN_DSSCRIPT, FOLLOW_DATASTAGE_BEGIN_DSSCRIPT_in_begin_dsscript_key874);
        DATASTAGE_BEGIN_DSSCRIPT89_tree = (Object) adaptor.create(DATASTAGE_BEGIN_DSSCRIPT89);
        adaptor.addChild(root_0, DATASTAGE_BEGIN_DSSCRIPT89_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "begin_dsscript_key"
  
  public static class end_dsscript_key_return extends ParserRuleReturnScope {
    
    Object tree;
    
    public Object getTree() {
      return tree;
    }
  };
  
  // $ANTLR start "end_dsscript_key"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:201:1:
  // end_dsscript_key : DATASTAGE_END_DSSCRIPT ;
  public final Datastage_DSXParser.end_dsscript_key_return end_dsscript_key() throws RecognitionException {
    Datastage_DSXParser.end_dsscript_key_return retval = new Datastage_DSXParser.end_dsscript_key_return();
    retval.start = input.LT(1);
    
    Object root_0 = null;
    
    Token DATASTAGE_END_DSSCRIPT90 = null;
    
    Object DATASTAGE_END_DSSCRIPT90_tree = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:202:3:
      // ( DATASTAGE_END_DSSCRIPT )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXParser.g:202:5:
      // DATASTAGE_END_DSSCRIPT
      {
        root_0 = (Object) adaptor.nil();
        
        DATASTAGE_END_DSSCRIPT90 =
            (Token) match(input, DATASTAGE_END_DSSCRIPT, FOLLOW_DATASTAGE_END_DSSCRIPT_in_end_dsscript_key887);
        DATASTAGE_END_DSSCRIPT90_tree = (Object) adaptor.create(DATASTAGE_END_DSSCRIPT90);
        adaptor.addChild(root_0, DATASTAGE_END_DSSCRIPT90_tree);
        
      }
      
      retval.stop = input.LT(-1);
      
      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
      
    }
    
    finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "end_dsscript_key"
  
  // Delegated rules
  
  public static final BitSet FOLLOW_dsx_script_in_datastage_dsx_script81 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_header_in_dsx_script94 = new BitSet(new long[] { 0x0000000000080000L });
  
  public static final BitSet FOLLOW_ds_job_in_dsx_script96 = new BitSet(new long[] { 0x00000000025E0002L });
  
  public static final BitSet FOLLOW_ds_tabledef_in_dsx_script99 = new BitSet(new long[] { 0x0000000000560002L });
  
  public static final BitSet FOLLOW_ds_execjob_in_dsx_script102 = new BitSet(new long[] { 0x0000000000560002L });
  
  public static final BitSet FOLLOW_ds_parametersets_in_dsx_script105 = new BitSet(new long[] { 0x0000000000420002L });
  
  public static final BitSet FOLLOW_ds_routines_in_dsx_script108 = new BitSet(new long[] { 0x0000000000020002L });
  
  public static final BitSet FOLLOW_ds_dataconnections_in_dsx_script111 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_begin_dstabledef_key_in_ds_tabledef156 =
      new BitSet(new long[] { 0x0000010000200000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_property_in_ds_tabledef160 =
      new BitSet(new long[] { 0x0000010000200000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_ds_record_in_ds_tabledef162 =
      new BitSet(new long[] { 0x0000010000200000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_end_dstabledef_key_in_ds_tabledef166 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_begin_dsexecjob_key_in_ds_execjob180 =
      new BitSet(new long[] { 0x0000000200A18000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_property_in_ds_execjob184 =
      new BitSet(new long[] { 0x0000000200A18000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_ds_record_in_ds_execjob186 =
      new BitSet(new long[] { 0x0000000200A18000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_ds_bpsource_in_ds_execjob188 =
      new BitSet(new long[] { 0x0000000200A18000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_ds_bpbinary_in_ds_execjob190 =
      new BitSet(new long[] { 0x0000000200A18000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_ds_script_in_ds_execjob192 =
      new BitSet(new long[] { 0x0000000200A18000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_comment_in_ds_execjob194 =
      new BitSet(new long[] { 0x0000000200A18000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_end_dsexecjob_key_in_ds_execjob198 = new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_begin_dsbpsource_key_in_ds_bpsource212 =
      new BitSet(new long[] { 0x0000000080000000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_property_in_ds_bpsource214 =
      new BitSet(new long[] { 0x0000000080000000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_end_dsbpsource_key_in_ds_bpsource217 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_begin_dsbpbinary_key_in_ds_bpbinary239 =
      new BitSet(new long[] { 0x0000000040000000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_property_in_ds_bpbinary241 =
      new BitSet(new long[] { 0x0000000040000000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_end_dsbpbinary_key_in_ds_bpbinary244 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_begin_dsscript_key_in_ds_script266 =
      new BitSet(new long[] { 0x0000004000200000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_property_in_ds_script270 =
      new BitSet(new long[] { 0x0000004000200000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_ds_record_in_ds_script272 =
      new BitSet(new long[] { 0x0000004000200000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_comment_in_ds_script275 =
      new BitSet(new long[] { 0x0000004000200000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_end_dsscript_key_in_ds_script279 = new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_begin_dsroutines_key_in_ds_routines293 =
      new BitSet(new long[] { 0x0000002004200000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_property_in_ds_routines297 =
      new BitSet(new long[] { 0x0000002004200000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_ds_record_in_ds_routines299 =
      new BitSet(new long[] { 0x0000002004200000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_ds_subinary_in_ds_routines301 =
      new BitSet(new long[] { 0x0000002004200000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_end_dsroutines_key_in_ds_routines305 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_begin_dsubinary_key_in_ds_subinary319 =
      new BitSet(new long[] { 0x0000020000000000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_property_in_ds_subinary321 =
      new BitSet(new long[] { 0x0000020000000000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_end_dsubinary_key_in_ds_subinary324 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_begin_dsdataconnections_key_in_ds_dataconnections346 =
      new BitSet(new long[] { 0x0000000100200000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_property_in_ds_dataconnections350 =
      new BitSet(new long[] { 0x0000000100200000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_ds_record_in_ds_dataconnections352 =
      new BitSet(new long[] { 0x0000000100200000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_end_dsdataconnections_key_in_ds_dataconnections356 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_begin_dsparametersets_key_in_ds_parametersets370 =
      new BitSet(new long[] { 0x0000000800200000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_property_in_ds_parametersets374 =
      new BitSet(new long[] { 0x0000000800200000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_ds_record_in_ds_parametersets376 =
      new BitSet(new long[] { 0x0000000800200000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_end_dsparametersets_key_in_ds_parametersets380 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_begin_header_key_in_header396 =
      new BitSet(new long[] { 0x0000040000000000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_property_in_header398 =
      new BitSet(new long[] { 0x0000040000000000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_end_header_key_in_header401 = new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_begin_dsjob_key_in_ds_job423 =
      new BitSet(new long[] { 0x0000000400200000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_property_in_ds_job427 =
      new BitSet(new long[] { 0x0000000400200000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_ds_record_in_ds_job429 =
      new BitSet(new long[] { 0x0000000400200000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_end_dsjob_key_in_ds_job433 = new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_begin_dsrecord_key_in_ds_record447 =
      new BitSet(new long[] { 0x0000001001000000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_property_in_ds_record451 =
      new BitSet(new long[] { 0x0000001001000000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_ds_subrecord_in_ds_record453 =
      new BitSet(new long[] { 0x0000001001000000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_end_dsrecord_key_in_ds_record457 = new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_begin_dssubrecord_key_in_ds_subrecord471 =
      new BitSet(new long[] { 0x0000008000000000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_property_in_ds_subrecord473 =
      new BitSet(new long[] { 0x0000008000000000L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_end_dssubrecord_key_in_ds_subrecord476 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_REGULAR_ID_in_property498 = new BitSet(new long[] { 0x0000080010000000L });
  
  public static final BitSet FOLLOW_set_in_property500 = new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_REGULAR_ID_in_comment521 = new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_HEADER_in_begin_header_key534 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_END_HEADER_in_end_header_key549 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_DSJOB_in_begin_dsjob_key562 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_END_DSJOB_in_end_dsjob_key575 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_DSRECORD_in_begin_dsrecord_key588 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_END_DSRECORD_in_end_dsrecord_key601 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_DSSUBRECORD_in_begin_dssubrecord_key616 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_END_DSSUBRECORD_in_end_dssubrecord_key629 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_DSTABLEDEFS_in_begin_dstabledef_key643 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_END_DSTABLEDEFS_in_end_dstabledef_key655 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_DSEXECJOB_in_begin_dsexecjob_key669 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_END_DSEXECJOB_in_end_dsexecjob_key681 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_DSBPSOURCE_in_begin_dsbpsource_key697 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_END_DSBPSOURCE_in_end_dsbpsource_key712 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_DSBPBINARY_in_begin_dsbpbinary_key725 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_END_DSBPBINARY_in_end_dsbpbinary_key738 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_DSROUTINES_in_begin_dsroutines_key751 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_END_DSROUTINES_in_end_dsroutines_key766 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_DSDATACONNECTIONS_in_begin_dsdataconnections_key783 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_END_DSDATACONNECTIONS_in_end_dsdataconnections_key796 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_DSUBINARY_in_begin_dsubinary_key813 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_END_DSUBINARY_in_end_dsubinary_key828 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_DSPARAMETERSETS_in_begin_dsparametersets_key845 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_END_DSPARAMETERSETS_in_end_dsparametersets_key857 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_DSSCRIPT_in_begin_dsscript_key874 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_END_DSSCRIPT_in_end_dsscript_key887 =
      new BitSet(new long[] { 0x0000000000000002L });
  
}
