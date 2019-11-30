// $ANTLR 3.4 /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g 2019-08-08 15:01:59

package com.impetus.idw.datastage.dsx.parser.antlr.walker;

import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.runtime.tree.TreeParser;

import com.impetus.idw.datastage.dsx.parser.node.DatastageAbstractNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageBPBinaryNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageBPSourceNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageCollectionNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageDSScriptNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageDataConnectionsNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageExecJobNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageHeaderNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageJobNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageParameterSet;
import com.impetus.idw.datastage.dsx.parser.node.DatastageRecordNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageRoutinesNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageScriptNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageSubRecordNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageSubinaryNode;
import com.impetus.idw.datastage.dsx.parser.node.DatastageTableDefNode;

@SuppressWarnings({ "all", "warnings", "unchecked" })
public class Datastage_DSXWalker extends TreeParser {
  
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
  public TreeParser[] getDelegates() {
    return new TreeParser[] {};
  }
  
  // delegators
  
  public Datastage_DSXWalker(TreeNodeStream input) {
    this(input, new RecognizerSharedState());
  }
  
  public Datastage_DSXWalker(TreeNodeStream input, RecognizerSharedState state) {
    super(input, state);
  }
  
  public String[] getTokenNames() {
    return Datastage_DSXWalker.tokenNames;
  }
  
  public String getGrammarFileName() {
    return "/home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g";
  }
  
  public String getKey(Map<String, String> property) {
    return property.keySet().iterator().next();
  }
  
  // $ANTLR start "datastage_dsx_script"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:29:1:
  // datastage_dsx_script returns [DatastageAbstractNode node] : ( dsx_script ) ;
  public final DatastageAbstractNode datastage_dsx_script() throws RecognitionException {
    DatastageAbstractNode node = null;
    
    DatastageScriptNode dsx_script1 = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:30:3:
      // ( ( dsx_script ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:30:5:
      // ( dsx_script )
      {
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:30:5:
        // ( dsx_script )
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:30:6:
        // dsx_script
        {
          pushFollow(FOLLOW_dsx_script_in_datastage_dsx_script63);
          dsx_script1 = dsx_script();
          
          state._fsp--;
          
          node = dsx_script1;
          
        }
        
      }
      
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
    }
    
    finally {
      // do for sure before leaving
    }
    return node;
  }
  // $ANTLR end "datastage_dsx_script"
  
  // $ANTLR start "dsx_script"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:33:1:
  // dsx_script returns [DatastageScriptNode node] : ^( DATASTAGE_DSX_SCRIPT ( header ) ( ds_job )+ ( ds_tabledef )? (
  // ds_execjob )* ( ds_parametersets )? ( ds_routines )? ( ds_dataconnections )? ) ;
  public final DatastageScriptNode dsx_script() throws RecognitionException {
    DatastageScriptNode node = null;
    
    DatastageHeaderNode header2 = null;
    
    DatastageJobNode ds_job3 = null;
    
    DatastageTableDefNode ds_tabledef4 = null;
    
    DatastageExecJobNode ds_execjob5 = null;
    
    DatastageParameterSet ds_parametersets6 = null;
    
    DatastageRoutinesNode ds_routines7 = null;
    
    DatastageDataConnectionsNode ds_dataconnections8 = null;
    
    DatastageScriptNode dssn = new DatastageScriptNode();
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:36:3:
      // ( ^( DATASTAGE_DSX_SCRIPT ( header ) ( ds_job )+ ( ds_tabledef )? ( ds_execjob )* ( ds_parametersets )? (
      // ds_routines )? ( ds_dataconnections )? ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:36:5:
      // ^( DATASTAGE_DSX_SCRIPT ( header ) ( ds_job )+ ( ds_tabledef )? ( ds_execjob )* ( ds_parametersets )? (
      // ds_routines )? ( ds_dataconnections )? )
      {
        match(input, DATASTAGE_DSX_SCRIPT, FOLLOW_DATASTAGE_DSX_SCRIPT_in_dsx_script94);
        
        match(input, Token.DOWN, null);
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:37:7:
        // ( header )
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:37:8:
        // header
        {
          pushFollow(FOLLOW_header_in_dsx_script103);
          header2 = header();
          
          state._fsp--;
          
          dssn.addHeader(header2);
          
        }
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:38:7:
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
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:38:8:
            // ds_job
            {
              pushFollow(FOLLOW_ds_job_in_dsx_script116);
              ds_job3 = ds_job();
              
              state._fsp--;
              
              dssn.addJob(ds_job3);
              
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
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:39:7:
        // ( ds_tabledef )?
        int alt2 = 2;
        int LA2_0 = input.LA(1);
        
        if ((LA2_0 == DATASTAGE_BEGIN_DSTABLEDEFS)) {
          alt2 = 1;
        }
        switch (alt2) {
          case 1:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:39:8:
          // ds_tabledef
          {
            pushFollow(FOLLOW_ds_tabledef_in_dsx_script129);
            ds_tabledef4 = ds_tabledef();
            
            state._fsp--;
            
            dssn.addTableDef(ds_tabledef4);
            
          }
            break;
          
        }
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:40:7:
        // ( ds_execjob )*
        loop3: do {
          int alt3 = 2;
          int LA3_0 = input.LA(1);
          
          if ((LA3_0 == DATASTAGE_BEGIN_DSEXECJOB)) {
            alt3 = 1;
          }
          
          switch (alt3) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:40:8:
            // ds_execjob
            {
              pushFollow(FOLLOW_ds_execjob_in_dsx_script142);
              ds_execjob5 = ds_execjob();
              
              state._fsp--;
              
              dssn.addExecJob(ds_execjob5);
              
            }
              break;
            
            default:
              break loop3;
          }
        }
        while (true);
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:41:7:
        // ( ds_parametersets )?
        int alt4 = 2;
        int LA4_0 = input.LA(1);
        
        if ((LA4_0 == DATASTAGE_BEGIN_DSPARAMETERSETS)) {
          alt4 = 1;
        }
        switch (alt4) {
          case 1:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:41:8:
          // ds_parametersets
          {
            pushFollow(FOLLOW_ds_parametersets_in_dsx_script155);
            ds_parametersets6 = ds_parametersets();
            
            state._fsp--;
            
            dssn.addParameterSets(ds_parametersets6);
            
          }
            break;
          
        }
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:42:7:
        // ( ds_routines )?
        int alt5 = 2;
        int LA5_0 = input.LA(1);
        
        if ((LA5_0 == DATASTAGE_BEGIN_DSROUTINES)) {
          alt5 = 1;
        }
        switch (alt5) {
          case 1:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:42:8:
          // ds_routines
          {
            pushFollow(FOLLOW_ds_routines_in_dsx_script168);
            ds_routines7 = ds_routines();
            
            state._fsp--;
            
            dssn.addRoutines(ds_routines7);
            
          }
            break;
          
        }
        
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:43:7:
        // ( ds_dataconnections )?
        int alt6 = 2;
        int LA6_0 = input.LA(1);
        
        if ((LA6_0 == DATASTAGE_BEGIN_DSDATACONNECTIONS)) {
          alt6 = 1;
        }
        switch (alt6) {
          case 1:
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:43:8:
          // ds_dataconnections
          {
            pushFollow(FOLLOW_ds_dataconnections_in_dsx_script182);
            ds_dataconnections8 = ds_dataconnections();
            
            state._fsp--;
            
            dssn.addDataConnections(ds_dataconnections8);
            
          }
            break;
          
        }
        
        match(input, Token.UP, null);
        
      }
      
      node = dssn;
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
    }
    
    finally {
      // do for sure before leaving
    }
    return node;
  }
  // $ANTLR end "dsx_script"
  
  // $ANTLR start "ds_tabledef"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:46:1:
  // ds_tabledef returns [DatastageTableDefNode node] : ^( DATASTAGE_BEGIN_DSTABLEDEFS ( ( property ) | ( ds_record ) )*
  // ) ;
  public final DatastageTableDefNode ds_tabledef() throws RecognitionException {
    DatastageTableDefNode node = null;
    
    Map<String, String> property9 = null;
    
    DatastageRecordNode ds_record10 = null;
    
    DatastageTableDefNode dstdn = new DatastageTableDefNode();
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:49:3:
      // ( ^( DATASTAGE_BEGIN_DSTABLEDEFS ( ( property ) | ( ds_record ) )* ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:49:5:
      // ^( DATASTAGE_BEGIN_DSTABLEDEFS ( ( property ) | ( ds_record ) )* )
      {
        match(input, DATASTAGE_BEGIN_DSTABLEDEFS, FOLLOW_DATASTAGE_BEGIN_DSTABLEDEFS_in_ds_tabledef215);
        
        if (input.LA(1) == Token.DOWN) {
          match(input, Token.DOWN, null);
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:50:5:
          // ( ( property ) | ( ds_record ) )*
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
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:50:6:
              // ( property )
              {
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:50:6:
                // ( property )
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:50:7:
                // property
                {
                  pushFollow(FOLLOW_property_in_ds_tabledef224);
                  property9 = property();
                  
                  state._fsp--;
                  
                  String key = this.getKey(property9);
                  dstdn.addProperty(key, property9.get(key));
                  
                }
                
              }
                break;
              case 2:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:51:6:
              // ( ds_record )
              {
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:51:6:
                // ( ds_record )
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:51:7:
                // ds_record
                {
                  pushFollow(FOLLOW_ds_record_in_ds_tabledef235);
                  ds_record10 = ds_record();
                  
                  state._fsp--;
                  
                  dstdn.addRecord(ds_record10);
                  
                }
                
              }
                break;
              
              default:
                break loop7;
            }
          }
          while (true);
          
          match(input, Token.UP, null);
        }
        
      }
      
      node = dstdn;
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
    }
    
    finally {
      // do for sure before leaving
    }
    return node;
  }
  // $ANTLR end "ds_tabledef"
  
  // $ANTLR start "ds_execjob"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:54:1:
  // ds_execjob returns [DatastageExecJobNode node] : ^( DATASTAGE_BEGIN_DSEXECJOB ( ( property ) | ( ds_record ) | (
  // ds_bpsource ) | ( ds_bpbinary ) | ( ds_script ) | REGULAR_ID )* ) ;
  public final DatastageExecJobNode ds_execjob() throws RecognitionException {
    DatastageExecJobNode node = null;
    
    Map<String, String> property11 = null;
    
    DatastageRecordNode ds_record12 = null;
    
    DatastageBPSourceNode ds_bpsource13 = null;
    
    DatastageBPBinaryNode ds_bpbinary14 = null;
    
    DatastageDSScriptNode ds_script15 = null;
    
    DatastageExecJobNode dsejn = new DatastageExecJobNode();
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:57:3:
      // ( ^( DATASTAGE_BEGIN_DSEXECJOB ( ( property ) | ( ds_record ) | ( ds_bpsource ) | ( ds_bpbinary ) | ( ds_script
      // ) | REGULAR_ID )* ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:57:5:
      // ^( DATASTAGE_BEGIN_DSEXECJOB ( ( property ) | ( ds_record ) | ( ds_bpsource ) | ( ds_bpbinary ) | ( ds_script )
      // | REGULAR_ID )* )
      {
        match(input, DATASTAGE_BEGIN_DSEXECJOB, FOLLOW_DATASTAGE_BEGIN_DSEXECJOB_in_ds_execjob269);
        
        if (input.LA(1) == Token.DOWN) {
          match(input, Token.DOWN, null);
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:58:5:
          // ( ( property ) | ( ds_record ) | ( ds_bpsource ) | ( ds_bpbinary ) | ( ds_script ) | REGULAR_ID )*
          loop8: do {
            int alt8 = 7;
            switch (input.LA(1)) {
              case REGULAR_ID: {
                int LA8_2 = input.LA(2);
                
                if ((LA8_2 == DATASTAGE_DESCRIPTION_BODY || LA8_2 == DELIMITED_ID)) {
                  alt8 = 1;
                }
                else if ((LA8_2 == UP || LA8_2 == DATASTAGE_BEGIN_DSRECORD || LA8_2 == DATASTAGE_BEGIN_DSSCRIPT
                    || LA8_2 == REGULAR_ID || LA8_2 == DATASTAGE_BINARY || LA8_2 == DATASTAGE_SOURCE)) {
                  alt8 = 6;
                }
                
              }
                break;
              case DATASTAGE_BEGIN_DSRECORD: {
                alt8 = 2;
              }
                break;
              case DATASTAGE_SOURCE: {
                alt8 = 3;
              }
                break;
              case DATASTAGE_BINARY: {
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
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:58:6:
              // ( property )
              {
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:58:6:
                // ( property )
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:58:7:
                // property
                {
                  pushFollow(FOLLOW_property_in_ds_execjob278);
                  property11 = property();
                  
                  state._fsp--;
                  
                  String key = this.getKey(property11);
                  dsejn.addProperty(key, property11.get(key));
                  
                }
                
              }
                break;
              case 2:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:59:6:
              // ( ds_record )
              {
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:59:6:
                // ( ds_record )
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:59:7:
                // ds_record
                {
                  pushFollow(FOLLOW_ds_record_in_ds_execjob289);
                  ds_record12 = ds_record();
                  
                  state._fsp--;
                  
                  dsejn.addRecord(ds_record12);
                  
                }
                
              }
                break;
              case 3:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:60:6:
              // ( ds_bpsource )
              {
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:60:6:
                // ( ds_bpsource )
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:60:7:
                // ds_bpsource
                {
                  pushFollow(FOLLOW_ds_bpsource_in_ds_execjob300);
                  ds_bpsource13 = ds_bpsource();
                  
                  state._fsp--;
                  
                  dsejn.addSource(ds_bpsource13);
                  
                }
                
              }
                break;
              case 4:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:61:6:
              // ( ds_bpbinary )
              {
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:61:6:
                // ( ds_bpbinary )
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:61:7:
                // ds_bpbinary
                {
                  pushFollow(FOLLOW_ds_bpbinary_in_ds_execjob311);
                  ds_bpbinary14 = ds_bpbinary();
                  
                  state._fsp--;
                  
                  dsejn.addBinary(ds_bpbinary14);
                  
                }
                
              }
                break;
              case 5:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:62:6:
              // ( ds_script )
              {
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:62:6:
                // ( ds_script )
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:62:7:
                // ds_script
                {
                  pushFollow(FOLLOW_ds_script_in_ds_execjob322);
                  ds_script15 = ds_script();
                  
                  state._fsp--;
                  
                  dsejn.addScript(ds_script15);
                  
                }
                
              }
                break;
              case 6:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:63:6:
              // REGULAR_ID
              {
                match(input, REGULAR_ID, FOLLOW_REGULAR_ID_in_ds_execjob332);
                
              }
                break;
              
              default:
                break loop8;
            }
          }
          while (true);
          
          match(input, Token.UP, null);
        }
        
      }
      
      node = dsejn;
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
    }
    
    finally {
      // do for sure before leaving
    }
    return node;
  }
  // $ANTLR end "ds_execjob"
  
  // $ANTLR start "ds_parametersets"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:66:1:
  // ds_parametersets returns [DatastageParameterSet node] : ^( DATASTAGE_BEGIN_DSPARAMETERSETS ( ( property ) | (
  // ds_record ) )* ) ;
  public final DatastageParameterSet ds_parametersets() throws RecognitionException {
    DatastageParameterSet node = null;
    
    Map<String, String> property16 = null;
    
    DatastageRecordNode ds_record17 = null;
    
    DatastageParameterSet dsps = new DatastageParameterSet();
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:69:3:
      // ( ^( DATASTAGE_BEGIN_DSPARAMETERSETS ( ( property ) | ( ds_record ) )* ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:69:5:
      // ^( DATASTAGE_BEGIN_DSPARAMETERSETS ( ( property ) | ( ds_record ) )* )
      {
        match(input, DATASTAGE_BEGIN_DSPARAMETERSETS, FOLLOW_DATASTAGE_BEGIN_DSPARAMETERSETS_in_ds_parametersets363);
        
        if (input.LA(1) == Token.DOWN) {
          match(input, Token.DOWN, null);
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:70:6:
          // ( ( property ) | ( ds_record ) )*
          loop9: do {
            int alt9 = 3;
            int LA9_0 = input.LA(1);
            
            if ((LA9_0 == REGULAR_ID)) {
              alt9 = 1;
            }
            else if ((LA9_0 == DATASTAGE_BEGIN_DSRECORD)) {
              alt9 = 2;
            }
            
            switch (alt9) {
              case 1:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:70:7:
              // ( property )
              {
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:70:7:
                // ( property )
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:70:8:
                // property
                {
                  pushFollow(FOLLOW_property_in_ds_parametersets373);
                  property16 = property();
                  
                  state._fsp--;
                  
                  String key = this.getKey(property16);
                  dsps.addProperty(key, property16.get(key));
                  
                }
                
              }
                break;
              case 2:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:71:7:
              // ( ds_record )
              {
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:71:7:
                // ( ds_record )
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:71:8:
                // ds_record
                {
                  pushFollow(FOLLOW_ds_record_in_ds_parametersets385);
                  ds_record17 = ds_record();
                  
                  state._fsp--;
                  
                  dsps.addRecord(ds_record17);
                  
                }
                
              }
                break;
              
              default:
                break loop9;
            }
          }
          while (true);
          
          match(input, Token.UP, null);
        }
        
      }
      
      node = dsps;
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
    }
    
    finally {
      // do for sure before leaving
    }
    return node;
  }
  // $ANTLR end "ds_parametersets"
  
  // $ANTLR start "ds_bpsource"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:74:1:
  // ds_bpsource returns [DatastageBPSourceNode node] : ^( DATASTAGE_SOURCE ( property )* ) ;
  public final DatastageBPSourceNode ds_bpsource() throws RecognitionException {
    DatastageBPSourceNode node = null;
    
    Map<String, String> property18 = null;
    
    DatastageBPSourceNode dsbps = new DatastageBPSourceNode();
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:77:3:
      // ( ^( DATASTAGE_SOURCE ( property )* ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:77:5:
      // ^( DATASTAGE_SOURCE ( property )* )
      {
        match(input, DATASTAGE_SOURCE, FOLLOW_DATASTAGE_SOURCE_in_ds_bpsource420);
        
        if (input.LA(1) == Token.DOWN) {
          match(input, Token.DOWN, null);
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:77:24:
          // ( property )*
          loop10: do {
            int alt10 = 2;
            int LA10_0 = input.LA(1);
            
            if ((LA10_0 == REGULAR_ID)) {
              alt10 = 1;
            }
            
            switch (alt10) {
              case 1:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:77:25:
              // property
              {
                pushFollow(FOLLOW_property_in_ds_bpsource423);
                property18 = property();
                
                state._fsp--;
                
                String key = this.getKey(property18);
                dsbps.addProperty(key, property18.get(key));
                
              }
                break;
              
              default:
                break loop10;
            }
          }
          while (true);
          
          match(input, Token.UP, null);
        }
        
      }
      
      node = dsbps;
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
    }
    
    finally {
      // do for sure before leaving
    }
    return node;
  }
  // $ANTLR end "ds_bpsource"
  
  // $ANTLR start "ds_bpbinary"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:80:1:
  // ds_bpbinary returns [DatastageBPBinaryNode node] : ^( DATASTAGE_BINARY ( property )* ) ;
  public final DatastageBPBinaryNode ds_bpbinary() throws RecognitionException {
    DatastageBPBinaryNode node = null;
    
    Map<String, String> property19 = null;
    
    DatastageBPBinaryNode dsbpbn = new DatastageBPBinaryNode();
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:83:3:
      // ( ^( DATASTAGE_BINARY ( property )* ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:83:5:
      // ^( DATASTAGE_BINARY ( property )* )
      {
        match(input, DATASTAGE_BINARY, FOLLOW_DATASTAGE_BINARY_in_ds_bpbinary456);
        
        if (input.LA(1) == Token.DOWN) {
          match(input, Token.DOWN, null);
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:83:24:
          // ( property )*
          loop11: do {
            int alt11 = 2;
            int LA11_0 = input.LA(1);
            
            if ((LA11_0 == REGULAR_ID)) {
              alt11 = 1;
            }
            
            switch (alt11) {
              case 1:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:83:25:
              // property
              {
                pushFollow(FOLLOW_property_in_ds_bpbinary459);
                property19 = property();
                
                state._fsp--;
                
                String key = this.getKey(property19);
                dsbpbn.addProperty(key, property19.get(key));
                
              }
                break;
              
              default:
                break loop11;
            }
          }
          while (true);
          
          match(input, Token.UP, null);
        }
        
      }
      
      node = dsbpbn;
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
    }
    
    finally {
      // do for sure before leaving
    }
    return node;
  }
  // $ANTLR end "ds_bpbinary"
  
  // $ANTLR start "ds_script"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:86:1:
  // ds_script returns [DatastageDSScriptNode node] : ^( DATASTAGE_BEGIN_DSSCRIPT ( ( property ) | ( ds_record ) |
  // REGULAR_ID )* ) ;
  public final DatastageDSScriptNode ds_script() throws RecognitionException {
    DatastageDSScriptNode node = null;
    
    Map<String, String> property20 = null;
    
    DatastageRecordNode ds_record21 = null;
    
    DatastageDSScriptNode dssn = new DatastageDSScriptNode();
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:89:3:
      // ( ^( DATASTAGE_BEGIN_DSSCRIPT ( ( property ) | ( ds_record ) | REGULAR_ID )* ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:89:5:
      // ^( DATASTAGE_BEGIN_DSSCRIPT ( ( property ) | ( ds_record ) | REGULAR_ID )* )
      {
        match(input, DATASTAGE_BEGIN_DSSCRIPT, FOLLOW_DATASTAGE_BEGIN_DSSCRIPT_in_ds_script492);
        
        if (input.LA(1) == Token.DOWN) {
          match(input, Token.DOWN, null);
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:90:6:
          // ( ( property ) | ( ds_record ) | REGULAR_ID )*
          loop12: do {
            int alt12 = 4;
            int LA12_0 = input.LA(1);
            
            if ((LA12_0 == REGULAR_ID)) {
              int LA12_2 = input.LA(2);
              
              if ((LA12_2 == DATASTAGE_DESCRIPTION_BODY || LA12_2 == DELIMITED_ID)) {
                alt12 = 1;
              }
              else if ((LA12_2 == UP || LA12_2 == DATASTAGE_BEGIN_DSRECORD || LA12_2 == REGULAR_ID)) {
                alt12 = 3;
              }
              
            }
            else if ((LA12_0 == DATASTAGE_BEGIN_DSRECORD)) {
              alt12 = 2;
            }
            
            switch (alt12) {
              case 1:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:90:7:
              // ( property )
              {
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:90:7:
                // ( property )
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:90:8:
                // property
                {
                  pushFollow(FOLLOW_property_in_ds_script502);
                  property20 = property();
                  
                  state._fsp--;
                  
                  String key = this.getKey(property20);
                  dssn.addProperty(key, property20.get(key));
                  
                }
                
              }
                break;
              case 2:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:91:7:
              // ( ds_record )
              {
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:91:7:
                // ( ds_record )
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:91:8:
                // ds_record
                {
                  pushFollow(FOLLOW_ds_record_in_ds_script514);
                  ds_record21 = ds_record();
                  
                  state._fsp--;
                  
                  dssn.addRecord(ds_record21);
                  
                }
                
              }
                break;
              case 3:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:92:8:
              // REGULAR_ID
              {
                match(input, REGULAR_ID, FOLLOW_REGULAR_ID_in_ds_script526);
                
              }
                break;
              
              default:
                break loop12;
            }
          }
          while (true);
          
          match(input, Token.UP, null);
        }
        
      }
      
      node = dssn;
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
    }
    
    finally {
      // do for sure before leaving
    }
    return node;
  }
  // $ANTLR end "ds_script"
  
  // $ANTLR start "ds_routines"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:95:1:
  // ds_routines returns [DatastageRoutinesNode node] : ^( DATASTAGE_BEGIN_DSROUTINES ( ( property ) | ( ds_record ) | (
  // ds_subinary ) )* ) ;
  public final DatastageRoutinesNode ds_routines() throws RecognitionException {
    DatastageRoutinesNode node = null;
    
    Map<String, String> property22 = null;
    
    DatastageRecordNode ds_record23 = null;
    
    DatastageSubinaryNode ds_subinary24 = null;
    
    DatastageRoutinesNode dsrn = new DatastageRoutinesNode();
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:98:3:
      // ( ^( DATASTAGE_BEGIN_DSROUTINES ( ( property ) | ( ds_record ) | ( ds_subinary ) )* ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:98:5:
      // ^( DATASTAGE_BEGIN_DSROUTINES ( ( property ) | ( ds_record ) | ( ds_subinary ) )* )
      {
        match(input, DATASTAGE_BEGIN_DSROUTINES, FOLLOW_DATASTAGE_BEGIN_DSROUTINES_in_ds_routines557);
        
        if (input.LA(1) == Token.DOWN) {
          match(input, Token.DOWN, null);
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:99:6:
          // ( ( property ) | ( ds_record ) | ( ds_subinary ) )*
          loop13: do {
            int alt13 = 4;
            switch (input.LA(1)) {
              case REGULAR_ID: {
                alt13 = 1;
              }
                break;
              case DATASTAGE_BEGIN_DSRECORD: {
                alt13 = 2;
              }
                break;
              case DATASTAGE_SUBINARY: {
                alt13 = 3;
              }
                break;
              
            }
            
            switch (alt13) {
              case 1:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:99:7:
              // ( property )
              {
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:99:7:
                // ( property )
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:99:8:
                // property
                {
                  pushFollow(FOLLOW_property_in_ds_routines567);
                  property22 = property();
                  
                  state._fsp--;
                  
                  String key = this.getKey(property22);
                  dsrn.addProperty(key, property22.get(key));
                  
                }
                
              }
                break;
              case 2:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:100:7:
              // ( ds_record )
              {
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:100:7:
                // ( ds_record )
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:100:8:
                // ds_record
                {
                  pushFollow(FOLLOW_ds_record_in_ds_routines579);
                  ds_record23 = ds_record();
                  
                  state._fsp--;
                  
                  dsrn.addRecord(ds_record23);
                  
                }
                
              }
                break;
              case 3:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:101:7:
              // ( ds_subinary )
              {
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:101:7:
                // ( ds_subinary )
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:101:8:
                // ds_subinary
                {
                  pushFollow(FOLLOW_ds_subinary_in_ds_routines591);
                  ds_subinary24 = ds_subinary();
                  
                  state._fsp--;
                  
                  dsrn.addSubinary(ds_subinary24);
                  
                }
                
              }
                break;
              
              default:
                break loop13;
            }
          }
          while (true);
          
          match(input, Token.UP, null);
        }
        
      }
      
      node = dsrn;
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
    }
    
    finally {
      // do for sure before leaving
    }
    return node;
  }
  // $ANTLR end "ds_routines"
  
  // $ANTLR start "ds_subinary"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:104:1:
  // ds_subinary returns [DatastageSubinaryNode node] : ^( DATASTAGE_SUBINARY ( property )* ) ;
  public final DatastageSubinaryNode ds_subinary() throws RecognitionException {
    DatastageSubinaryNode node = null;
    
    Map<String, String> property25 = null;
    
    DatastageSubinaryNode dssn = new DatastageSubinaryNode();
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:107:3:
      // ( ^( DATASTAGE_SUBINARY ( property )* ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:107:5:
      // ^( DATASTAGE_SUBINARY ( property )* )
      {
        match(input, DATASTAGE_SUBINARY, FOLLOW_DATASTAGE_SUBINARY_in_ds_subinary625);
        
        if (input.LA(1) == Token.DOWN) {
          match(input, Token.DOWN, null);
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:107:26:
          // ( property )*
          loop14: do {
            int alt14 = 2;
            int LA14_0 = input.LA(1);
            
            if ((LA14_0 == REGULAR_ID)) {
              alt14 = 1;
            }
            
            switch (alt14) {
              case 1:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:107:27:
              // property
              {
                pushFollow(FOLLOW_property_in_ds_subinary628);
                property25 = property();
                
                state._fsp--;
                
                String key = this.getKey(property25);
                dssn.addProperty(key, property25.get(key));
                
              }
                break;
              
              default:
                break loop14;
            }
          }
          while (true);
          
          match(input, Token.UP, null);
        }
        
      }
      
      node = dssn;
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
    }
    
    finally {
      // do for sure before leaving
    }
    return node;
  }
  // $ANTLR end "ds_subinary"
  
  // $ANTLR start "ds_dataconnections"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:110:1:
  // ds_dataconnections returns [DatastageDataConnectionsNode node] : ^( DATASTAGE_BEGIN_DSDATACONNECTIONS ( ( property
  // ) | ( ds_record ) )* ) ;
  public final DatastageDataConnectionsNode ds_dataconnections() throws RecognitionException {
    DatastageDataConnectionsNode node = null;
    
    Map<String, String> property26 = null;
    
    DatastageRecordNode ds_record27 = null;
    
    DatastageDataConnectionsNode dsdcn = new DatastageDataConnectionsNode();
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:113:3:
      // ( ^( DATASTAGE_BEGIN_DSDATACONNECTIONS ( ( property ) | ( ds_record ) )* ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:113:5:
      // ^( DATASTAGE_BEGIN_DSDATACONNECTIONS ( ( property ) | ( ds_record ) )* )
      {
        match(input, DATASTAGE_BEGIN_DSDATACONNECTIONS,
            FOLLOW_DATASTAGE_BEGIN_DSDATACONNECTIONS_in_ds_dataconnections661);
        
        if (input.LA(1) == Token.DOWN) {
          match(input, Token.DOWN, null);
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:114:6:
          // ( ( property ) | ( ds_record ) )*
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
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:114:7:
              // ( property )
              {
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:114:7:
                // ( property )
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:114:8:
                // property
                {
                  pushFollow(FOLLOW_property_in_ds_dataconnections670);
                  property26 = property();
                  
                  state._fsp--;
                  
                  String key = this.getKey(property26);
                  dsdcn.addProperty(key, property26.get(key));
                  
                }
                
              }
                break;
              case 2:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:115:6:
              // ( ds_record )
              {
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:115:6:
                // ( ds_record )
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:115:7:
                // ds_record
                {
                  pushFollow(FOLLOW_ds_record_in_ds_dataconnections681);
                  ds_record27 = ds_record();
                  
                  state._fsp--;
                  
                  dsdcn.addRecord(ds_record27);
                  
                }
                
              }
                break;
              
              default:
                break loop15;
            }
          }
          while (true);
          
          match(input, Token.UP, null);
        }
        
      }
      
      node = dsdcn;
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
    }
    
    finally {
      // do for sure before leaving
    }
    return node;
  }
  // $ANTLR end "ds_dataconnections"
  
  // $ANTLR start "header"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:118:1:
  // header returns [DatastageHeaderNode node] : ^( DATASTAGE_HEADER ( property )* ) ;
  public final DatastageHeaderNode header() throws RecognitionException {
    DatastageHeaderNode node = null;
    
    Map<String, String> property28 = null;
    
    DatastageHeaderNode dshn = new DatastageHeaderNode();
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:121:3:
      // ( ^( DATASTAGE_HEADER ( property )* ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:121:5:
      // ^( DATASTAGE_HEADER ( property )* )
      {
        match(input, DATASTAGE_HEADER, FOLLOW_DATASTAGE_HEADER_in_header715);
        
        if (input.LA(1) == Token.DOWN) {
          match(input, Token.DOWN, null);
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:121:24:
          // ( property )*
          loop16: do {
            int alt16 = 2;
            int LA16_0 = input.LA(1);
            
            if ((LA16_0 == REGULAR_ID)) {
              alt16 = 1;
            }
            
            switch (alt16) {
              case 1:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:121:25:
              // property
              {
                pushFollow(FOLLOW_property_in_header718);
                property28 = property();
                
                state._fsp--;
                
                String key = this.getKey(property28);
                dshn.addProperty(key, property28.get(key));
                
              }
                break;
              
              default:
                break loop16;
            }
          }
          while (true);
          
          match(input, Token.UP, null);
        }
        
      }
      
      node = dshn;
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
    }
    
    finally {
      // do for sure before leaving
    }
    return node;
  }
  // $ANTLR end "header"
  
  // $ANTLR start "ds_job"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:124:1:
  // ds_job returns [DatastageJobNode node] : ^( DATASTAGE_BEGIN_DSJOB ( ( property ) | ( ds_record ) )* ) ;
  public final DatastageJobNode ds_job() throws RecognitionException {
    DatastageJobNode node = null;
    
    Map<String, String> property29 = null;
    
    DatastageRecordNode ds_record30 = null;
    
    DatastageJobNode dsjn = new DatastageJobNode();
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:127:3:
      // ( ^( DATASTAGE_BEGIN_DSJOB ( ( property ) | ( ds_record ) )* ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:127:6:
      // ^( DATASTAGE_BEGIN_DSJOB ( ( property ) | ( ds_record ) )* )
      {
        match(input, DATASTAGE_BEGIN_DSJOB, FOLLOW_DATASTAGE_BEGIN_DSJOB_in_ds_job752);
        
        if (input.LA(1) == Token.DOWN) {
          match(input, Token.DOWN, null);
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:127:30:
          // ( ( property ) | ( ds_record ) )*
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
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:127:31:
              // ( property )
              {
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:127:31:
                // ( property )
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:127:32:
                // property
                {
                  pushFollow(FOLLOW_property_in_ds_job756);
                  property29 = property();
                  
                  state._fsp--;
                  
                  String key = this.getKey(property29);
                  dsjn.addProperty(key, property29.get(key));
                  
                }
                
              }
                break;
              case 2:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:128:5:
              // ( ds_record )
              {
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:128:5:
                // ( ds_record )
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:128:6:
                // ds_record
                {
                  pushFollow(FOLLOW_ds_record_in_ds_job766);
                  ds_record30 = ds_record();
                  
                  state._fsp--;
                  
                  dsjn.addRecord(ds_record30);
                  
                }
                
              }
                break;
              
              default:
                break loop17;
            }
          }
          while (true);
          
          match(input, Token.UP, null);
        }
        
      }
      
      node = dsjn;
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
    }
    
    finally {
      // do for sure before leaving
    }
    return node;
  }
  // $ANTLR end "ds_job"
  
  // $ANTLR start "ds_record"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:131:1:
  // ds_record returns [DatastageRecordNode node] : ^( DATASTAGE_BEGIN_DSRECORD ( ( property ) | ( ds_subrecord ) )* ) ;
  public final DatastageRecordNode ds_record() throws RecognitionException {
    DatastageRecordNode node = null;
    
    Map<String, String> property31 = null;
    
    DatastageSubRecordNode ds_subrecord32 = null;
    
    DatastageRecordNode dsrn = new DatastageRecordNode();
    String key = null;
    String value = null;
		DatastageCollectionNode dscn = null;
    int i = 0;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:139:2:
      // ( ^( DATASTAGE_BEGIN_DSRECORD ( ( property ) | ( ds_subrecord ) )* ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:139:5:
      // ^( DATASTAGE_BEGIN_DSRECORD ( ( property ) | ( ds_subrecord ) )* )
      {
        match(input, DATASTAGE_BEGIN_DSRECORD, FOLLOW_DATASTAGE_BEGIN_DSRECORD_in_ds_record800);
        
        if (input.LA(1) == Token.DOWN) {
          match(input, Token.DOWN, null);
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:140:3:
          // ( ( property ) | ( ds_subrecord ) )*
          loop18: do {
            int alt18 = 3;
            int LA18_0 = input.LA(1);
            
            if ((LA18_0 == REGULAR_ID)) {
              alt18 = 1;
            }
            else if ((LA18_0 == DATASTAGE_SUBRECORD)) {
              alt18 = 2;
            }
            
            switch (alt18) {
              case 1:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:140:4:
              // ( property )
              {
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:140:4:
                // ( property )
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:140:5:
                // property
                {
                  pushFollow(FOLLOW_property_in_ds_record806);
                  property31 = property();
                  
                  state._fsp--;
                  
                  key = this.getKey(property31);
                  value = property31.get(key);
                  dsrn.addProperty(key, value);
                  i = 0;
                  
                }
                
              }
                break;
              case 2:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:141:5:
              // ( ds_subrecord )
              {
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:141:5:
                // ( ds_subrecord )
                // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:141:6:
                // ds_subrecord
                {
                  pushFollow(FOLLOW_ds_subrecord_in_ds_record816);
                  ds_subrecord32 = ds_subrecord();
                  
                  state._fsp--;
                  
                  if (i == 0) {
                    dscn = new DatastageCollectionNode();
                    dscn.setCollectionName(key);
                    dscn.setCollectionType(value);
                    dsrn.addCollection(dscn);
                  }
                  dscn.addSubRecord(ds_subrecord32);
                  i++;
                  
                }
                
              }
                break;
              
              default:
                break loop18;
            }
          }
          while (true);
          
          match(input, Token.UP, null);
        }
        
      }
      
      node = dsrn;
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
    }
    
    finally {
      // do for sure before leaving
    }
    return node;
  }
  // $ANTLR end "ds_record"
  
  // $ANTLR start "ds_subrecord"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:152:1:
  // ds_subrecord returns [DatastageSubRecordNode node] : ^( DATASTAGE_SUBRECORD ( property )* ) ;
  public final DatastageSubRecordNode ds_subrecord() throws RecognitionException {
    DatastageSubRecordNode node = null;
    
    Map<String, String> property33 = null;
    
    DatastageSubRecordNode dssrn = new DatastageSubRecordNode();
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:155:3:
      // ( ^( DATASTAGE_SUBRECORD ( property )* ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:155:5:
      // ^( DATASTAGE_SUBRECORD ( property )* )
      {
        match(input, DATASTAGE_SUBRECORD, FOLLOW_DATASTAGE_SUBRECORD_in_ds_subrecord853);
        
        if (input.LA(1) == Token.DOWN) {
          match(input, Token.DOWN, null);
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:155:27:
          // ( property )*
          loop19: do {
            int alt19 = 2;
            int LA19_0 = input.LA(1);
            
            if ((LA19_0 == REGULAR_ID)) {
              alt19 = 1;
            }
            
            switch (alt19) {
              case 1:
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:155:28:
              // property
              {
                pushFollow(FOLLOW_property_in_ds_subrecord856);
                property33 = property();
                
                state._fsp--;
                
                String key = this.getKey(property33);
                dssrn.addProperty(key, property33.get(key));
                
              }
                break;
              
              default:
                break loop19;
            }
          }
          while (true);
          
          match(input, Token.UP, null);
        }
        
      }
      
      node = dssrn;
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
    }
    
    finally {
      // do for sure before leaving
    }
    return node;
  }
  // $ANTLR end "ds_subrecord"
  
  // $ANTLR start "property"
  // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:158:1:
  // property returns [Map<String, String> node] : ( ( REGULAR_ID ) ( ( DELIMITED_ID ) | ( DATASTAGE_DESCRIPTION_BODY )
  // ) ) ;
  public final Map<String, String> property() throws RecognitionException {
    Map<String, String> node = null;
    
    CommonTree REGULAR_ID34 = null;
    CommonTree DELIMITED_ID35 = null;
    CommonTree DATASTAGE_DESCRIPTION_BODY36 = null;
    
    Map<String, String> property = new HashMap<>();
    String key = null;
    String value = null;
    
    try {
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:164:3:
      // ( ( ( REGULAR_ID ) ( ( DELIMITED_ID ) | ( DATASTAGE_DESCRIPTION_BODY ) ) ) )
      // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:164:5:
      // ( ( REGULAR_ID ) ( ( DELIMITED_ID ) | ( DATASTAGE_DESCRIPTION_BODY ) ) )
      {
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:164:5:
        // ( ( REGULAR_ID ) ( ( DELIMITED_ID ) | ( DATASTAGE_DESCRIPTION_BODY ) ) )
        // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:164:6:
        // ( REGULAR_ID ) ( ( DELIMITED_ID ) | ( DATASTAGE_DESCRIPTION_BODY ) )
        {
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:164:6:
          // ( REGULAR_ID )
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:164:7:
          // REGULAR_ID
          {
            REGULAR_ID34 = (CommonTree) match(input, REGULAR_ID, FOLLOW_REGULAR_ID_in_property890);
            
            key = (REGULAR_ID34 != null ? REGULAR_ID34.getText() : null);
            
          }
          
          // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:165:5:
          // ( ( DELIMITED_ID ) | ( DATASTAGE_DESCRIPTION_BODY ) )
          int alt20 = 2;
          int LA20_0 = input.LA(1);
          
          if ((LA20_0 == DELIMITED_ID)) {
            alt20 = 1;
          }
          else if ((LA20_0 == DATASTAGE_DESCRIPTION_BODY)) {
            alt20 = 2;
          }
          else {
            NoViableAltException nvae = new NoViableAltException("", 20, 0, input);
            
            throw nvae;
            
          }
          switch (alt20) {
            case 1:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:165:6:
            // ( DELIMITED_ID )
            {
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:165:6:
              // ( DELIMITED_ID )
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:165:7:
              // DELIMITED_ID
              {
                DELIMITED_ID35 = (CommonTree) match(input, DELIMITED_ID, FOLLOW_DELIMITED_ID_in_property901);
                
                value = (DELIMITED_ID35 != null ? DELIMITED_ID35.getText() : null);
                
              }
              
            }
              break;
            case 2:
            // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:166:7:
            // ( DATASTAGE_DESCRIPTION_BODY )
            {
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:166:7:
              // ( DATASTAGE_DESCRIPTION_BODY )
              // /home/impadmin/idw-2.2.3_05June/application/workload-migration/temp/grammar1565256718792/Datastage_DSXWalker.g:166:8:
              // DATASTAGE_DESCRIPTION_BODY
              {
                DATASTAGE_DESCRIPTION_BODY36 = (CommonTree) match(input, DATASTAGE_DESCRIPTION_BODY,
                    FOLLOW_DATASTAGE_DESCRIPTION_BODY_in_property913);
                
                value = (DATASTAGE_DESCRIPTION_BODY36 != null ? DATASTAGE_DESCRIPTION_BODY36.getText() : null);
                
              }
              
            }
              break;
            
          }
          
          property.put(key, value.replace("\"", "").replace("=+=+=+=", ""));
          
        }
        
      }
      
      node = property;
    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
    }
    
    finally {
      // do for sure before leaving
    }
    return node;
  }
  // $ANTLR end "property"
  
  // Delegated rules
  
  public static final BitSet FOLLOW_dsx_script_in_datastage_dsx_script63 =
      new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_DSX_SCRIPT_in_dsx_script94 =
      new BitSet(new long[] { 0x0000000000000004L });
  
  public static final BitSet FOLLOW_header_in_dsx_script103 = new BitSet(new long[] { 0x0000000000080000L });
  
  public static final BitSet FOLLOW_ds_job_in_dsx_script116 = new BitSet(new long[] { 0x00000000025E0008L });
  
  public static final BitSet FOLLOW_ds_tabledef_in_dsx_script129 = new BitSet(new long[] { 0x0000000000560008L });
  
  public static final BitSet FOLLOW_ds_execjob_in_dsx_script142 = new BitSet(new long[] { 0x0000000000560008L });
  
  public static final BitSet FOLLOW_ds_parametersets_in_dsx_script155 = new BitSet(new long[] { 0x0000000000420008L });
  
  public static final BitSet FOLLOW_ds_routines_in_dsx_script168 = new BitSet(new long[] { 0x0000000000020008L });
  
  public static final BitSet FOLLOW_ds_dataconnections_in_dsx_script182 =
      new BitSet(new long[] { 0x0000000000000008L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_DSTABLEDEFS_in_ds_tabledef215 =
      new BitSet(new long[] { 0x0000000000000004L });
  
  public static final BitSet FOLLOW_property_in_ds_tabledef224 =
      new BitSet(new long[] { 0x0000000000200008L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_ds_record_in_ds_tabledef235 =
      new BitSet(new long[] { 0x0000000000200008L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_DSEXECJOB_in_ds_execjob269 =
      new BitSet(new long[] { 0x0000000000000004L });
  
  public static final BitSet FOLLOW_property_in_ds_execjob278 =
      new BitSet(new long[] { 0x0000000000A00008L, 0x0000000084000200L });
  
  public static final BitSet FOLLOW_ds_record_in_ds_execjob289 =
      new BitSet(new long[] { 0x0000000000A00008L, 0x0000000084000200L });
  
  public static final BitSet FOLLOW_ds_bpsource_in_ds_execjob300 =
      new BitSet(new long[] { 0x0000000000A00008L, 0x0000000084000200L });
  
  public static final BitSet FOLLOW_ds_bpbinary_in_ds_execjob311 =
      new BitSet(new long[] { 0x0000000000A00008L, 0x0000000084000200L });
  
  public static final BitSet FOLLOW_ds_script_in_ds_execjob322 =
      new BitSet(new long[] { 0x0000000000A00008L, 0x0000000084000200L });
  
  public static final BitSet FOLLOW_REGULAR_ID_in_ds_execjob332 =
      new BitSet(new long[] { 0x0000000000A00008L, 0x0000000084000200L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_DSPARAMETERSETS_in_ds_parametersets363 =
      new BitSet(new long[] { 0x0000000000000004L });
  
  public static final BitSet FOLLOW_property_in_ds_parametersets373 =
      new BitSet(new long[] { 0x0000000000200008L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_ds_record_in_ds_parametersets385 =
      new BitSet(new long[] { 0x0000000000200008L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_DATASTAGE_SOURCE_in_ds_bpsource420 = new BitSet(new long[] { 0x0000000000000004L });
  
  public static final BitSet FOLLOW_property_in_ds_bpsource423 =
      new BitSet(new long[] { 0x0000000000000008L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_DATASTAGE_BINARY_in_ds_bpbinary456 = new BitSet(new long[] { 0x0000000000000004L });
  
  public static final BitSet FOLLOW_property_in_ds_bpbinary459 =
      new BitSet(new long[] { 0x0000000000000008L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_DSSCRIPT_in_ds_script492 =
      new BitSet(new long[] { 0x0000000000000004L });
  
  public static final BitSet FOLLOW_property_in_ds_script502 =
      new BitSet(new long[] { 0x0000000000200008L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_ds_record_in_ds_script514 =
      new BitSet(new long[] { 0x0000000000200008L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_REGULAR_ID_in_ds_script526 =
      new BitSet(new long[] { 0x0000000000200008L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_DSROUTINES_in_ds_routines557 =
      new BitSet(new long[] { 0x0000000000000004L });
  
  public static final BitSet FOLLOW_property_in_ds_routines567 =
      new BitSet(new long[] { 0x0000000000200008L, 0x0000000100000200L });
  
  public static final BitSet FOLLOW_ds_record_in_ds_routines579 =
      new BitSet(new long[] { 0x0000000000200008L, 0x0000000100000200L });
  
  public static final BitSet FOLLOW_ds_subinary_in_ds_routines591 =
      new BitSet(new long[] { 0x0000000000200008L, 0x0000000100000200L });
  
  public static final BitSet FOLLOW_DATASTAGE_SUBINARY_in_ds_subinary625 =
      new BitSet(new long[] { 0x0000000000000004L });
  
  public static final BitSet FOLLOW_property_in_ds_subinary628 =
      new BitSet(new long[] { 0x0000000000000008L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_DSDATACONNECTIONS_in_ds_dataconnections661 =
      new BitSet(new long[] { 0x0000000000000004L });
  
  public static final BitSet FOLLOW_property_in_ds_dataconnections670 =
      new BitSet(new long[] { 0x0000000000200008L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_ds_record_in_ds_dataconnections681 =
      new BitSet(new long[] { 0x0000000000200008L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_DATASTAGE_HEADER_in_header715 = new BitSet(new long[] { 0x0000000000000004L });
  
  public static final BitSet FOLLOW_property_in_header718 =
      new BitSet(new long[] { 0x0000000000000008L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_DSJOB_in_ds_job752 = new BitSet(new long[] { 0x0000000000000004L });
  
  public static final BitSet FOLLOW_property_in_ds_job756 =
      new BitSet(new long[] { 0x0000000000200008L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_ds_record_in_ds_job766 =
      new BitSet(new long[] { 0x0000000000200008L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_DATASTAGE_BEGIN_DSRECORD_in_ds_record800 =
      new BitSet(new long[] { 0x0000000000000004L });
  
  public static final BitSet FOLLOW_property_in_ds_record806 =
      new BitSet(new long[] { 0x0000000000000008L, 0x0000000200000200L });
  
  public static final BitSet FOLLOW_ds_subrecord_in_ds_record816 =
      new BitSet(new long[] { 0x0000000000000008L, 0x0000000200000200L });
  
  public static final BitSet FOLLOW_DATASTAGE_SUBRECORD_in_ds_subrecord853 =
      new BitSet(new long[] { 0x0000000000000004L });
  
  public static final BitSet FOLLOW_property_in_ds_subrecord856 =
      new BitSet(new long[] { 0x0000000000000008L, 0x0000000000000200L });
  
  public static final BitSet FOLLOW_REGULAR_ID_in_property890 = new BitSet(new long[] { 0x0000080010000000L });
  
  public static final BitSet FOLLOW_DELIMITED_ID_in_property901 = new BitSet(new long[] { 0x0000000000000002L });
  
  public static final BitSet FOLLOW_DATASTAGE_DESCRIPTION_BODY_in_property913 =
      new BitSet(new long[] { 0x0000000000000002L });
  
}
