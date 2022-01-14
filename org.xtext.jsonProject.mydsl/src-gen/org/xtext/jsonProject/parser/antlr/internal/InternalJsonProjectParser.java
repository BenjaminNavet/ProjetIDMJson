package org.xtext.jsonProject.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.jsonProject.services.JsonProjectGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonProjectParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_GOBACK", "RULE_ROOT", "RULE_NULL", "RULE_INT", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'load'", "'insert'", "'.'", "'modify'", "'sum'", "'remove'", "'mult'", "'select'", "'store'", "'print'", "'['", "','", "']'", "'{'", "'}'", "'\"'", "':'", "'true'", "'false'"
    };
    public static final int RULE_GOBACK=6;
    public static final int RULE_STRING=4;
    public static final int RULE_NULL=8;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=10;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_ROOT=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalJsonProjectParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJsonProjectParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJsonProjectParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJsonProject.g"; }



     	private JsonProjectGrammarAccess grammarAccess;

        public InternalJsonProjectParser(TokenStream input, JsonProjectGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "JsonCommands";
       	}

       	@Override
       	protected JsonProjectGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleJsonCommands"
    // InternalJsonProject.g:65:1: entryRuleJsonCommands returns [EObject current=null] : iv_ruleJsonCommands= ruleJsonCommands EOF ;
    public final EObject entryRuleJsonCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonCommands = null;


        try {
            // InternalJsonProject.g:65:53: (iv_ruleJsonCommands= ruleJsonCommands EOF )
            // InternalJsonProject.g:66:2: iv_ruleJsonCommands= ruleJsonCommands EOF
            {
             newCompositeNode(grammarAccess.getJsonCommandsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonCommands=ruleJsonCommands();

            state._fsp--;

             current =iv_ruleJsonCommands; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonCommands"


    // $ANTLR start "ruleJsonCommands"
    // InternalJsonProject.g:72:1: ruleJsonCommands returns [EObject current=null] : ( (lv_jsonCommands_0_0= ruleJsonCommand ) )* ;
    public final EObject ruleJsonCommands() throws RecognitionException {
        EObject current = null;

        EObject lv_jsonCommands_0_0 = null;



        	enterRule();

        try {
            // InternalJsonProject.g:78:2: ( ( (lv_jsonCommands_0_0= ruleJsonCommand ) )* )
            // InternalJsonProject.g:79:2: ( (lv_jsonCommands_0_0= ruleJsonCommand ) )*
            {
            // InternalJsonProject.g:79:2: ( (lv_jsonCommands_0_0= ruleJsonCommand ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJsonProject.g:80:3: (lv_jsonCommands_0_0= ruleJsonCommand )
            	    {
            	    // InternalJsonProject.g:80:3: (lv_jsonCommands_0_0= ruleJsonCommand )
            	    // InternalJsonProject.g:81:4: lv_jsonCommands_0_0= ruleJsonCommand
            	    {

            	    				newCompositeNode(grammarAccess.getJsonCommandsAccess().getJsonCommandsJsonCommandParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_jsonCommands_0_0=ruleJsonCommand();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getJsonCommandsRule());
            	    				}
            	    				add(
            	    					current,
            	    					"jsonCommands",
            	    					lv_jsonCommands_0_0,
            	    					"org.xtext.jsonProject.JsonProject.JsonCommand");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonCommands"


    // $ANTLR start "entryRuleJsonCommand"
    // InternalJsonProject.g:101:1: entryRuleJsonCommand returns [EObject current=null] : iv_ruleJsonCommand= ruleJsonCommand EOF ;
    public final EObject entryRuleJsonCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonCommand = null;


        try {
            // InternalJsonProject.g:101:52: (iv_ruleJsonCommand= ruleJsonCommand EOF )
            // InternalJsonProject.g:102:2: iv_ruleJsonCommand= ruleJsonCommand EOF
            {
             newCompositeNode(grammarAccess.getJsonCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonCommand=ruleJsonCommand();

            state._fsp--;

             current =iv_ruleJsonCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonCommand"


    // $ANTLR start "ruleJsonCommand"
    // InternalJsonProject.g:108:1: ruleJsonCommand returns [EObject current=null] : ( ( (lv_init_0_0= ruleInitialisation ) ) ( (lv_operations_1_0= ruleOperation ) )* ( (lv_final_2_0= ruleFinal ) ) ) ;
    public final EObject ruleJsonCommand() throws RecognitionException {
        EObject current = null;

        EObject lv_init_0_0 = null;

        EObject lv_operations_1_0 = null;

        EObject lv_final_2_0 = null;



        	enterRule();

        try {
            // InternalJsonProject.g:114:2: ( ( ( (lv_init_0_0= ruleInitialisation ) ) ( (lv_operations_1_0= ruleOperation ) )* ( (lv_final_2_0= ruleFinal ) ) ) )
            // InternalJsonProject.g:115:2: ( ( (lv_init_0_0= ruleInitialisation ) ) ( (lv_operations_1_0= ruleOperation ) )* ( (lv_final_2_0= ruleFinal ) ) )
            {
            // InternalJsonProject.g:115:2: ( ( (lv_init_0_0= ruleInitialisation ) ) ( (lv_operations_1_0= ruleOperation ) )* ( (lv_final_2_0= ruleFinal ) ) )
            // InternalJsonProject.g:116:3: ( (lv_init_0_0= ruleInitialisation ) ) ( (lv_operations_1_0= ruleOperation ) )* ( (lv_final_2_0= ruleFinal ) )
            {
            // InternalJsonProject.g:116:3: ( (lv_init_0_0= ruleInitialisation ) )
            // InternalJsonProject.g:117:4: (lv_init_0_0= ruleInitialisation )
            {
            // InternalJsonProject.g:117:4: (lv_init_0_0= ruleInitialisation )
            // InternalJsonProject.g:118:5: lv_init_0_0= ruleInitialisation
            {

            					newCompositeNode(grammarAccess.getJsonCommandAccess().getInitInitialisationParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_init_0_0=ruleInitialisation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJsonCommandRule());
            					}
            					set(
            						current,
            						"init",
            						lv_init_0_0,
            						"org.xtext.jsonProject.JsonProject.Initialisation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonProject.g:135:3: ( (lv_operations_1_0= ruleOperation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||(LA2_0>=18 && LA2_0<=22)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalJsonProject.g:136:4: (lv_operations_1_0= ruleOperation )
            	    {
            	    // InternalJsonProject.g:136:4: (lv_operations_1_0= ruleOperation )
            	    // InternalJsonProject.g:137:5: lv_operations_1_0= ruleOperation
            	    {

            	    					newCompositeNode(grammarAccess.getJsonCommandAccess().getOperationsOperationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_operations_1_0=ruleOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJsonCommandRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_1_0,
            	    						"org.xtext.jsonProject.JsonProject.Operation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalJsonProject.g:154:3: ( (lv_final_2_0= ruleFinal ) )
            // InternalJsonProject.g:155:4: (lv_final_2_0= ruleFinal )
            {
            // InternalJsonProject.g:155:4: (lv_final_2_0= ruleFinal )
            // InternalJsonProject.g:156:5: lv_final_2_0= ruleFinal
            {

            					newCompositeNode(grammarAccess.getJsonCommandAccess().getFinalFinalParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_final_2_0=ruleFinal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJsonCommandRule());
            					}
            					set(
            						current,
            						"final",
            						lv_final_2_0,
            						"org.xtext.jsonProject.JsonProject.Final");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonCommand"


    // $ANTLR start "entryRuleInitialisation"
    // InternalJsonProject.g:177:1: entryRuleInitialisation returns [EObject current=null] : iv_ruleInitialisation= ruleInitialisation EOF ;
    public final EObject entryRuleInitialisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialisation = null;


        try {
            // InternalJsonProject.g:177:55: (iv_ruleInitialisation= ruleInitialisation EOF )
            // InternalJsonProject.g:178:2: iv_ruleInitialisation= ruleInitialisation EOF
            {
             newCompositeNode(grammarAccess.getInitialisationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialisation=ruleInitialisation();

            state._fsp--;

             current =iv_ruleInitialisation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialisation"


    // $ANTLR start "ruleInitialisation"
    // InternalJsonProject.g:184:1: ruleInitialisation returns [EObject current=null] : (otherlv_0= 'load' ( (lv_filePath_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInitialisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_filePath_1_0=null;


        	enterRule();

        try {
            // InternalJsonProject.g:190:2: ( (otherlv_0= 'load' ( (lv_filePath_1_0= RULE_STRING ) ) ) )
            // InternalJsonProject.g:191:2: (otherlv_0= 'load' ( (lv_filePath_1_0= RULE_STRING ) ) )
            {
            // InternalJsonProject.g:191:2: (otherlv_0= 'load' ( (lv_filePath_1_0= RULE_STRING ) ) )
            // InternalJsonProject.g:192:3: otherlv_0= 'load' ( (lv_filePath_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialisationAccess().getLoadKeyword_0());
            		
            // InternalJsonProject.g:196:3: ( (lv_filePath_1_0= RULE_STRING ) )
            // InternalJsonProject.g:197:4: (lv_filePath_1_0= RULE_STRING )
            {
            // InternalJsonProject.g:197:4: (lv_filePath_1_0= RULE_STRING )
            // InternalJsonProject.g:198:5: lv_filePath_1_0= RULE_STRING
            {
            lv_filePath_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_filePath_1_0, grammarAccess.getInitialisationAccess().getFilePathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialisationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"filePath",
            						lv_filePath_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialisation"


    // $ANTLR start "entryRuleOperation"
    // InternalJsonProject.g:218:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalJsonProject.g:218:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalJsonProject.g:219:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalJsonProject.g:225:1: ruleOperation returns [EObject current=null] : (this_Insert_0= ruleInsert | this_Modify_1= ruleModify | this_Sum_2= ruleSum | this_Remove_3= ruleRemove | this_Mult_4= ruleMult | this_Select_5= ruleSelect ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Insert_0 = null;

        EObject this_Modify_1 = null;

        EObject this_Sum_2 = null;

        EObject this_Remove_3 = null;

        EObject this_Mult_4 = null;

        EObject this_Select_5 = null;



        	enterRule();

        try {
            // InternalJsonProject.g:231:2: ( (this_Insert_0= ruleInsert | this_Modify_1= ruleModify | this_Sum_2= ruleSum | this_Remove_3= ruleRemove | this_Mult_4= ruleMult | this_Select_5= ruleSelect ) )
            // InternalJsonProject.g:232:2: (this_Insert_0= ruleInsert | this_Modify_1= ruleModify | this_Sum_2= ruleSum | this_Remove_3= ruleRemove | this_Mult_4= ruleMult | this_Select_5= ruleSelect )
            {
            // InternalJsonProject.g:232:2: (this_Insert_0= ruleInsert | this_Modify_1= ruleModify | this_Sum_2= ruleSum | this_Remove_3= ruleRemove | this_Mult_4= ruleMult | this_Select_5= ruleSelect )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 19:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            case 21:
                {
                alt3=5;
                }
                break;
            case 22:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalJsonProject.g:233:3: this_Insert_0= ruleInsert
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getInsertParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Insert_0=ruleInsert();

                    state._fsp--;


                    			current = this_Insert_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJsonProject.g:242:3: this_Modify_1= ruleModify
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getModifyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Modify_1=ruleModify();

                    state._fsp--;


                    			current = this_Modify_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJsonProject.g:251:3: this_Sum_2= ruleSum
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getSumParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sum_2=ruleSum();

                    state._fsp--;


                    			current = this_Sum_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJsonProject.g:260:3: this_Remove_3= ruleRemove
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getRemoveParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Remove_3=ruleRemove();

                    state._fsp--;


                    			current = this_Remove_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJsonProject.g:269:3: this_Mult_4= ruleMult
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getMultParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mult_4=ruleMult();

                    state._fsp--;


                    			current = this_Mult_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalJsonProject.g:278:3: this_Select_5= ruleSelect
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getSelectParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Select_5=ruleSelect();

                    state._fsp--;


                    			current = this_Select_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleInsert"
    // InternalJsonProject.g:290:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalJsonProject.g:290:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalJsonProject.g:291:2: iv_ruleInsert= ruleInsert EOF
            {
             newCompositeNode(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsert=ruleInsert();

            state._fsp--;

             current =iv_ruleInsert; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalJsonProject.g:297:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'insert' ( (lv_jsonObject_1_0= ruleJsonObject ) ) ( (lv_path_2_0= rulePath ) )? ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_jsonObject_1_0 = null;

        EObject lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalJsonProject.g:303:2: ( (otherlv_0= 'insert' ( (lv_jsonObject_1_0= ruleJsonObject ) ) ( (lv_path_2_0= rulePath ) )? ) )
            // InternalJsonProject.g:304:2: (otherlv_0= 'insert' ( (lv_jsonObject_1_0= ruleJsonObject ) ) ( (lv_path_2_0= rulePath ) )? )
            {
            // InternalJsonProject.g:304:2: (otherlv_0= 'insert' ( (lv_jsonObject_1_0= ruleJsonObject ) ) ( (lv_path_2_0= rulePath ) )? )
            // InternalJsonProject.g:305:3: otherlv_0= 'insert' ( (lv_jsonObject_1_0= ruleJsonObject ) ) ( (lv_path_2_0= rulePath ) )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getInsertKeyword_0());
            		
            // InternalJsonProject.g:309:3: ( (lv_jsonObject_1_0= ruleJsonObject ) )
            // InternalJsonProject.g:310:4: (lv_jsonObject_1_0= ruleJsonObject )
            {
            // InternalJsonProject.g:310:4: (lv_jsonObject_1_0= ruleJsonObject )
            // InternalJsonProject.g:311:5: lv_jsonObject_1_0= ruleJsonObject
            {

            					newCompositeNode(grammarAccess.getInsertAccess().getJsonObjectJsonObjectParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_jsonObject_1_0=ruleJsonObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertRule());
            					}
            					set(
            						current,
            						"jsonObject",
            						lv_jsonObject_1_0,
            						"org.xtext.jsonProject.JsonProject.JsonObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonProject.g:328:3: ( (lv_path_2_0= rulePath ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_ROOT)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJsonProject.g:329:4: (lv_path_2_0= rulePath )
                    {
                    // InternalJsonProject.g:329:4: (lv_path_2_0= rulePath )
                    // InternalJsonProject.g:330:5: lv_path_2_0= rulePath
                    {

                    					newCompositeNode(grammarAccess.getInsertAccess().getPathPathParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_path_2_0=rulePath();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInsertRule());
                    					}
                    					set(
                    						current,
                    						"path",
                    						lv_path_2_0,
                    						"org.xtext.jsonProject.JsonProject.Path");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRulePath"
    // InternalJsonProject.g:351:1: entryRulePath returns [EObject current=null] : iv_rulePath= rulePath EOF ;
    public final EObject entryRulePath() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePath = null;


        try {
            // InternalJsonProject.g:351:45: (iv_rulePath= rulePath EOF )
            // InternalJsonProject.g:352:2: iv_rulePath= rulePath EOF
            {
             newCompositeNode(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePath=rulePath();

            state._fsp--;

             current =iv_rulePath; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // InternalJsonProject.g:358:1: rulePath returns [EObject current=null] : ( () ( ( (lv_values_1_0= RULE_ID ) ) | this_GOBACK_2= RULE_GOBACK | this_ROOT_3= RULE_ROOT ) (otherlv_4= '.' ( ( (lv_values_5_0= RULE_ID ) ) | this_GOBACK_6= RULE_GOBACK ) )* ) ;
    public final EObject rulePath() throws RecognitionException {
        EObject current = null;

        Token lv_values_1_0=null;
        Token this_GOBACK_2=null;
        Token this_ROOT_3=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token this_GOBACK_6=null;


        	enterRule();

        try {
            // InternalJsonProject.g:364:2: ( ( () ( ( (lv_values_1_0= RULE_ID ) ) | this_GOBACK_2= RULE_GOBACK | this_ROOT_3= RULE_ROOT ) (otherlv_4= '.' ( ( (lv_values_5_0= RULE_ID ) ) | this_GOBACK_6= RULE_GOBACK ) )* ) )
            // InternalJsonProject.g:365:2: ( () ( ( (lv_values_1_0= RULE_ID ) ) | this_GOBACK_2= RULE_GOBACK | this_ROOT_3= RULE_ROOT ) (otherlv_4= '.' ( ( (lv_values_5_0= RULE_ID ) ) | this_GOBACK_6= RULE_GOBACK ) )* )
            {
            // InternalJsonProject.g:365:2: ( () ( ( (lv_values_1_0= RULE_ID ) ) | this_GOBACK_2= RULE_GOBACK | this_ROOT_3= RULE_ROOT ) (otherlv_4= '.' ( ( (lv_values_5_0= RULE_ID ) ) | this_GOBACK_6= RULE_GOBACK ) )* )
            // InternalJsonProject.g:366:3: () ( ( (lv_values_1_0= RULE_ID ) ) | this_GOBACK_2= RULE_GOBACK | this_ROOT_3= RULE_ROOT ) (otherlv_4= '.' ( ( (lv_values_5_0= RULE_ID ) ) | this_GOBACK_6= RULE_GOBACK ) )*
            {
            // InternalJsonProject.g:366:3: ()
            // InternalJsonProject.g:367:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPathAccess().getPathAction_0(),
            					current);
            			

            }

            // InternalJsonProject.g:373:3: ( ( (lv_values_1_0= RULE_ID ) ) | this_GOBACK_2= RULE_GOBACK | this_ROOT_3= RULE_ROOT )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case RULE_GOBACK:
                {
                alt5=2;
                }
                break;
            case RULE_ROOT:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalJsonProject.g:374:4: ( (lv_values_1_0= RULE_ID ) )
                    {
                    // InternalJsonProject.g:374:4: ( (lv_values_1_0= RULE_ID ) )
                    // InternalJsonProject.g:375:5: (lv_values_1_0= RULE_ID )
                    {
                    // InternalJsonProject.g:375:5: (lv_values_1_0= RULE_ID )
                    // InternalJsonProject.g:376:6: lv_values_1_0= RULE_ID
                    {
                    lv_values_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(lv_values_1_0, grammarAccess.getPathAccess().getValuesIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPathRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"values",
                    							lv_values_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJsonProject.g:393:4: this_GOBACK_2= RULE_GOBACK
                    {
                    this_GOBACK_2=(Token)match(input,RULE_GOBACK,FOLLOW_8); 

                    				newLeafNode(this_GOBACK_2, grammarAccess.getPathAccess().getGOBACKTerminalRuleCall_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalJsonProject.g:398:4: this_ROOT_3= RULE_ROOT
                    {
                    this_ROOT_3=(Token)match(input,RULE_ROOT,FOLLOW_8); 

                    				newLeafNode(this_ROOT_3, grammarAccess.getPathAccess().getROOTTerminalRuleCall_1_2());
                    			

                    }
                    break;

            }

            // InternalJsonProject.g:403:3: (otherlv_4= '.' ( ( (lv_values_5_0= RULE_ID ) ) | this_GOBACK_6= RULE_GOBACK ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalJsonProject.g:404:4: otherlv_4= '.' ( ( (lv_values_5_0= RULE_ID ) ) | this_GOBACK_6= RULE_GOBACK )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_9); 

            	    				newLeafNode(otherlv_4, grammarAccess.getPathAccess().getFullStopKeyword_2_0());
            	    			
            	    // InternalJsonProject.g:408:4: ( ( (lv_values_5_0= RULE_ID ) ) | this_GOBACK_6= RULE_GOBACK )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==RULE_ID) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==RULE_GOBACK) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalJsonProject.g:409:5: ( (lv_values_5_0= RULE_ID ) )
            	            {
            	            // InternalJsonProject.g:409:5: ( (lv_values_5_0= RULE_ID ) )
            	            // InternalJsonProject.g:410:6: (lv_values_5_0= RULE_ID )
            	            {
            	            // InternalJsonProject.g:410:6: (lv_values_5_0= RULE_ID )
            	            // InternalJsonProject.g:411:7: lv_values_5_0= RULE_ID
            	            {
            	            lv_values_5_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            	            							newLeafNode(lv_values_5_0, grammarAccess.getPathAccess().getValuesIDTerminalRuleCall_2_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getPathRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"values",
            	            								lv_values_5_0,
            	            								"org.eclipse.xtext.common.Terminals.ID");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalJsonProject.g:428:5: this_GOBACK_6= RULE_GOBACK
            	            {
            	            this_GOBACK_6=(Token)match(input,RULE_GOBACK,FOLLOW_8); 

            	            					newLeafNode(this_GOBACK_6, grammarAccess.getPathAccess().getGOBACKTerminalRuleCall_2_1_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleModify"
    // InternalJsonProject.g:438:1: entryRuleModify returns [EObject current=null] : iv_ruleModify= ruleModify EOF ;
    public final EObject entryRuleModify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModify = null;


        try {
            // InternalJsonProject.g:438:47: (iv_ruleModify= ruleModify EOF )
            // InternalJsonProject.g:439:2: iv_ruleModify= ruleModify EOF
            {
             newCompositeNode(grammarAccess.getModifyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModify=ruleModify();

            state._fsp--;

             current =iv_ruleModify; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModify"


    // $ANTLR start "ruleModify"
    // InternalJsonProject.g:445:1: ruleModify returns [EObject current=null] : (otherlv_0= 'modify' ( (lv_path_1_0= rulePath ) )? ( (lv_jsonObject_2_0= ruleJsonObject ) ) ) ;
    public final EObject ruleModify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_path_1_0 = null;

        EObject lv_jsonObject_2_0 = null;



        	enterRule();

        try {
            // InternalJsonProject.g:451:2: ( (otherlv_0= 'modify' ( (lv_path_1_0= rulePath ) )? ( (lv_jsonObject_2_0= ruleJsonObject ) ) ) )
            // InternalJsonProject.g:452:2: (otherlv_0= 'modify' ( (lv_path_1_0= rulePath ) )? ( (lv_jsonObject_2_0= ruleJsonObject ) ) )
            {
            // InternalJsonProject.g:452:2: (otherlv_0= 'modify' ( (lv_path_1_0= rulePath ) )? ( (lv_jsonObject_2_0= ruleJsonObject ) ) )
            // InternalJsonProject.g:453:3: otherlv_0= 'modify' ( (lv_path_1_0= rulePath ) )? ( (lv_jsonObject_2_0= ruleJsonObject ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getModifyAccess().getModifyKeyword_0());
            		
            // InternalJsonProject.g:457:3: ( (lv_path_1_0= rulePath ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_ROOT)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJsonProject.g:458:4: (lv_path_1_0= rulePath )
                    {
                    // InternalJsonProject.g:458:4: (lv_path_1_0= rulePath )
                    // InternalJsonProject.g:459:5: lv_path_1_0= rulePath
                    {

                    					newCompositeNode(grammarAccess.getModifyAccess().getPathPathParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_path_1_0=rulePath();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModifyRule());
                    					}
                    					set(
                    						current,
                    						"path",
                    						lv_path_1_0,
                    						"org.xtext.jsonProject.JsonProject.Path");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalJsonProject.g:476:3: ( (lv_jsonObject_2_0= ruleJsonObject ) )
            // InternalJsonProject.g:477:4: (lv_jsonObject_2_0= ruleJsonObject )
            {
            // InternalJsonProject.g:477:4: (lv_jsonObject_2_0= ruleJsonObject )
            // InternalJsonProject.g:478:5: lv_jsonObject_2_0= ruleJsonObject
            {

            					newCompositeNode(grammarAccess.getModifyAccess().getJsonObjectJsonObjectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_jsonObject_2_0=ruleJsonObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModifyRule());
            					}
            					set(
            						current,
            						"jsonObject",
            						lv_jsonObject_2_0,
            						"org.xtext.jsonProject.JsonProject.JsonObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModify"


    // $ANTLR start "entryRuleSum"
    // InternalJsonProject.g:499:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalJsonProject.g:499:44: (iv_ruleSum= ruleSum EOF )
            // InternalJsonProject.g:500:2: iv_ruleSum= ruleSum EOF
            {
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalJsonProject.g:506:1: ruleSum returns [EObject current=null] : (otherlv_0= 'sum' ( (lv_pathTOStore_1_0= rulePath ) ) ( (lv_pathToAdd_2_0= rulePath ) ) ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pathTOStore_1_0 = null;

        EObject lv_pathToAdd_2_0 = null;



        	enterRule();

        try {
            // InternalJsonProject.g:512:2: ( (otherlv_0= 'sum' ( (lv_pathTOStore_1_0= rulePath ) ) ( (lv_pathToAdd_2_0= rulePath ) ) ) )
            // InternalJsonProject.g:513:2: (otherlv_0= 'sum' ( (lv_pathTOStore_1_0= rulePath ) ) ( (lv_pathToAdd_2_0= rulePath ) ) )
            {
            // InternalJsonProject.g:513:2: (otherlv_0= 'sum' ( (lv_pathTOStore_1_0= rulePath ) ) ( (lv_pathToAdd_2_0= rulePath ) ) )
            // InternalJsonProject.g:514:3: otherlv_0= 'sum' ( (lv_pathTOStore_1_0= rulePath ) ) ( (lv_pathToAdd_2_0= rulePath ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSumAccess().getSumKeyword_0());
            		
            // InternalJsonProject.g:518:3: ( (lv_pathTOStore_1_0= rulePath ) )
            // InternalJsonProject.g:519:4: (lv_pathTOStore_1_0= rulePath )
            {
            // InternalJsonProject.g:519:4: (lv_pathTOStore_1_0= rulePath )
            // InternalJsonProject.g:520:5: lv_pathTOStore_1_0= rulePath
            {

            					newCompositeNode(grammarAccess.getSumAccess().getPathTOStorePathParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_pathTOStore_1_0=rulePath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumRule());
            					}
            					set(
            						current,
            						"pathTOStore",
            						lv_pathTOStore_1_0,
            						"org.xtext.jsonProject.JsonProject.Path");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonProject.g:537:3: ( (lv_pathToAdd_2_0= rulePath ) )
            // InternalJsonProject.g:538:4: (lv_pathToAdd_2_0= rulePath )
            {
            // InternalJsonProject.g:538:4: (lv_pathToAdd_2_0= rulePath )
            // InternalJsonProject.g:539:5: lv_pathToAdd_2_0= rulePath
            {

            					newCompositeNode(grammarAccess.getSumAccess().getPathToAddPathParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_pathToAdd_2_0=rulePath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSumRule());
            					}
            					set(
            						current,
            						"pathToAdd",
            						lv_pathToAdd_2_0,
            						"org.xtext.jsonProject.JsonProject.Path");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleRemove"
    // InternalJsonProject.g:560:1: entryRuleRemove returns [EObject current=null] : iv_ruleRemove= ruleRemove EOF ;
    public final EObject entryRuleRemove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemove = null;


        try {
            // InternalJsonProject.g:560:47: (iv_ruleRemove= ruleRemove EOF )
            // InternalJsonProject.g:561:2: iv_ruleRemove= ruleRemove EOF
            {
             newCompositeNode(grammarAccess.getRemoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemove=ruleRemove();

            state._fsp--;

             current =iv_ruleRemove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRemove"


    // $ANTLR start "ruleRemove"
    // InternalJsonProject.g:567:1: ruleRemove returns [EObject current=null] : ( () otherlv_1= 'remove' ( (lv_path_2_0= rulePath ) )? ) ;
    public final EObject ruleRemove() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalJsonProject.g:573:2: ( ( () otherlv_1= 'remove' ( (lv_path_2_0= rulePath ) )? ) )
            // InternalJsonProject.g:574:2: ( () otherlv_1= 'remove' ( (lv_path_2_0= rulePath ) )? )
            {
            // InternalJsonProject.g:574:2: ( () otherlv_1= 'remove' ( (lv_path_2_0= rulePath ) )? )
            // InternalJsonProject.g:575:3: () otherlv_1= 'remove' ( (lv_path_2_0= rulePath ) )?
            {
            // InternalJsonProject.g:575:3: ()
            // InternalJsonProject.g:576:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRemoveAccess().getRemoveAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRemoveAccess().getRemoveKeyword_1());
            		
            // InternalJsonProject.g:586:3: ( (lv_path_2_0= rulePath ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_ROOT)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJsonProject.g:587:4: (lv_path_2_0= rulePath )
                    {
                    // InternalJsonProject.g:587:4: (lv_path_2_0= rulePath )
                    // InternalJsonProject.g:588:5: lv_path_2_0= rulePath
                    {

                    					newCompositeNode(grammarAccess.getRemoveAccess().getPathPathParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_path_2_0=rulePath();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRemoveRule());
                    					}
                    					set(
                    						current,
                    						"path",
                    						lv_path_2_0,
                    						"org.xtext.jsonProject.JsonProject.Path");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRemove"


    // $ANTLR start "entryRuleMult"
    // InternalJsonProject.g:609:1: entryRuleMult returns [EObject current=null] : iv_ruleMult= ruleMult EOF ;
    public final EObject entryRuleMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMult = null;


        try {
            // InternalJsonProject.g:609:45: (iv_ruleMult= ruleMult EOF )
            // InternalJsonProject.g:610:2: iv_ruleMult= ruleMult EOF
            {
             newCompositeNode(grammarAccess.getMultRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMult=ruleMult();

            state._fsp--;

             current =iv_ruleMult; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMult"


    // $ANTLR start "ruleMult"
    // InternalJsonProject.g:616:1: ruleMult returns [EObject current=null] : (otherlv_0= 'mult' ( (lv_pathTOStore_1_0= rulePath ) ) ( (lv_pathToMult_2_0= rulePath ) ) ) ;
    public final EObject ruleMult() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_pathTOStore_1_0 = null;

        EObject lv_pathToMult_2_0 = null;



        	enterRule();

        try {
            // InternalJsonProject.g:622:2: ( (otherlv_0= 'mult' ( (lv_pathTOStore_1_0= rulePath ) ) ( (lv_pathToMult_2_0= rulePath ) ) ) )
            // InternalJsonProject.g:623:2: (otherlv_0= 'mult' ( (lv_pathTOStore_1_0= rulePath ) ) ( (lv_pathToMult_2_0= rulePath ) ) )
            {
            // InternalJsonProject.g:623:2: (otherlv_0= 'mult' ( (lv_pathTOStore_1_0= rulePath ) ) ( (lv_pathToMult_2_0= rulePath ) ) )
            // InternalJsonProject.g:624:3: otherlv_0= 'mult' ( (lv_pathTOStore_1_0= rulePath ) ) ( (lv_pathToMult_2_0= rulePath ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getMultAccess().getMultKeyword_0());
            		
            // InternalJsonProject.g:628:3: ( (lv_pathTOStore_1_0= rulePath ) )
            // InternalJsonProject.g:629:4: (lv_pathTOStore_1_0= rulePath )
            {
            // InternalJsonProject.g:629:4: (lv_pathTOStore_1_0= rulePath )
            // InternalJsonProject.g:630:5: lv_pathTOStore_1_0= rulePath
            {

            					newCompositeNode(grammarAccess.getMultAccess().getPathTOStorePathParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_pathTOStore_1_0=rulePath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultRule());
            					}
            					set(
            						current,
            						"pathTOStore",
            						lv_pathTOStore_1_0,
            						"org.xtext.jsonProject.JsonProject.Path");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonProject.g:647:3: ( (lv_pathToMult_2_0= rulePath ) )
            // InternalJsonProject.g:648:4: (lv_pathToMult_2_0= rulePath )
            {
            // InternalJsonProject.g:648:4: (lv_pathToMult_2_0= rulePath )
            // InternalJsonProject.g:649:5: lv_pathToMult_2_0= rulePath
            {

            					newCompositeNode(grammarAccess.getMultAccess().getPathToMultPathParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_pathToMult_2_0=rulePath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultRule());
            					}
            					set(
            						current,
            						"pathToMult",
            						lv_pathToMult_2_0,
            						"org.xtext.jsonProject.JsonProject.Path");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMult"


    // $ANTLR start "entryRuleSelect"
    // InternalJsonProject.g:670:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalJsonProject.g:670:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalJsonProject.g:671:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalJsonProject.g:677:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select' ( (lv_path_1_0= rulePath ) ) ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_path_1_0 = null;



        	enterRule();

        try {
            // InternalJsonProject.g:683:2: ( (otherlv_0= 'select' ( (lv_path_1_0= rulePath ) ) ) )
            // InternalJsonProject.g:684:2: (otherlv_0= 'select' ( (lv_path_1_0= rulePath ) ) )
            {
            // InternalJsonProject.g:684:2: (otherlv_0= 'select' ( (lv_path_1_0= rulePath ) ) )
            // InternalJsonProject.g:685:3: otherlv_0= 'select' ( (lv_path_1_0= rulePath ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
            		
            // InternalJsonProject.g:689:3: ( (lv_path_1_0= rulePath ) )
            // InternalJsonProject.g:690:4: (lv_path_1_0= rulePath )
            {
            // InternalJsonProject.g:690:4: (lv_path_1_0= rulePath )
            // InternalJsonProject.g:691:5: lv_path_1_0= rulePath
            {

            					newCompositeNode(grammarAccess.getSelectAccess().getPathPathParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_path_1_0=rulePath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_1_0,
            						"org.xtext.jsonProject.JsonProject.Path");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleFinal"
    // InternalJsonProject.g:712:1: entryRuleFinal returns [EObject current=null] : iv_ruleFinal= ruleFinal EOF ;
    public final EObject entryRuleFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinal = null;


        try {
            // InternalJsonProject.g:712:46: (iv_ruleFinal= ruleFinal EOF )
            // InternalJsonProject.g:713:2: iv_ruleFinal= ruleFinal EOF
            {
             newCompositeNode(grammarAccess.getFinalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinal=ruleFinal();

            state._fsp--;

             current =iv_ruleFinal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFinal"


    // $ANTLR start "ruleFinal"
    // InternalJsonProject.g:719:1: ruleFinal returns [EObject current=null] : (this_Print_0= rulePrint | this_Store_1= ruleStore ) ;
    public final EObject ruleFinal() throws RecognitionException {
        EObject current = null;

        EObject this_Print_0 = null;

        EObject this_Store_1 = null;



        	enterRule();

        try {
            // InternalJsonProject.g:725:2: ( (this_Print_0= rulePrint | this_Store_1= ruleStore ) )
            // InternalJsonProject.g:726:2: (this_Print_0= rulePrint | this_Store_1= ruleStore )
            {
            // InternalJsonProject.g:726:2: (this_Print_0= rulePrint | this_Store_1= ruleStore )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalJsonProject.g:727:3: this_Print_0= rulePrint
                    {

                    			newCompositeNode(grammarAccess.getFinalAccess().getPrintParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Print_0=rulePrint();

                    state._fsp--;


                    			current = this_Print_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJsonProject.g:736:3: this_Store_1= ruleStore
                    {

                    			newCompositeNode(grammarAccess.getFinalAccess().getStoreParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Store_1=ruleStore();

                    state._fsp--;


                    			current = this_Store_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinal"


    // $ANTLR start "entryRuleStore"
    // InternalJsonProject.g:748:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalJsonProject.g:748:46: (iv_ruleStore= ruleStore EOF )
            // InternalJsonProject.g:749:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalJsonProject.g:755:1: ruleStore returns [EObject current=null] : (otherlv_0= 'store' ( (lv_path_1_0= rulePath ) )? ( (lv_filePath_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_filePath_2_0=null;
        EObject lv_path_1_0 = null;



        	enterRule();

        try {
            // InternalJsonProject.g:761:2: ( (otherlv_0= 'store' ( (lv_path_1_0= rulePath ) )? ( (lv_filePath_2_0= RULE_STRING ) ) ) )
            // InternalJsonProject.g:762:2: (otherlv_0= 'store' ( (lv_path_1_0= rulePath ) )? ( (lv_filePath_2_0= RULE_STRING ) ) )
            {
            // InternalJsonProject.g:762:2: (otherlv_0= 'store' ( (lv_path_1_0= rulePath ) )? ( (lv_filePath_2_0= RULE_STRING ) ) )
            // InternalJsonProject.g:763:3: otherlv_0= 'store' ( (lv_path_1_0= rulePath ) )? ( (lv_filePath_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0());
            		
            // InternalJsonProject.g:767:3: ( (lv_path_1_0= rulePath ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_ROOT)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJsonProject.g:768:4: (lv_path_1_0= rulePath )
                    {
                    // InternalJsonProject.g:768:4: (lv_path_1_0= rulePath )
                    // InternalJsonProject.g:769:5: lv_path_1_0= rulePath
                    {

                    					newCompositeNode(grammarAccess.getStoreAccess().getPathPathParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_path_1_0=rulePath();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStoreRule());
                    					}
                    					set(
                    						current,
                    						"path",
                    						lv_path_1_0,
                    						"org.xtext.jsonProject.JsonProject.Path");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalJsonProject.g:786:3: ( (lv_filePath_2_0= RULE_STRING ) )
            // InternalJsonProject.g:787:4: (lv_filePath_2_0= RULE_STRING )
            {
            // InternalJsonProject.g:787:4: (lv_filePath_2_0= RULE_STRING )
            // InternalJsonProject.g:788:5: lv_filePath_2_0= RULE_STRING
            {
            lv_filePath_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_filePath_2_0, grammarAccess.getStoreAccess().getFilePathSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"filePath",
            						lv_filePath_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRulePrint"
    // InternalJsonProject.g:808:1: entryRulePrint returns [EObject current=null] : iv_rulePrint= rulePrint EOF ;
    public final EObject entryRulePrint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrint = null;


        try {
            // InternalJsonProject.g:808:46: (iv_rulePrint= rulePrint EOF )
            // InternalJsonProject.g:809:2: iv_rulePrint= rulePrint EOF
            {
             newCompositeNode(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrint=rulePrint();

            state._fsp--;

             current =iv_rulePrint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalJsonProject.g:815:1: rulePrint returns [EObject current=null] : ( () otherlv_1= 'print' ( (lv_path_2_0= rulePath ) )? ) ;
    public final EObject rulePrint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalJsonProject.g:821:2: ( ( () otherlv_1= 'print' ( (lv_path_2_0= rulePath ) )? ) )
            // InternalJsonProject.g:822:2: ( () otherlv_1= 'print' ( (lv_path_2_0= rulePath ) )? )
            {
            // InternalJsonProject.g:822:2: ( () otherlv_1= 'print' ( (lv_path_2_0= rulePath ) )? )
            // InternalJsonProject.g:823:3: () otherlv_1= 'print' ( (lv_path_2_0= rulePath ) )?
            {
            // InternalJsonProject.g:823:3: ()
            // InternalJsonProject.g:824:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrintAccess().getPrintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPrintAccess().getPrintKeyword_1());
            		
            // InternalJsonProject.g:834:3: ( (lv_path_2_0= rulePath ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_ROOT)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJsonProject.g:835:4: (lv_path_2_0= rulePath )
                    {
                    // InternalJsonProject.g:835:4: (lv_path_2_0= rulePath )
                    // InternalJsonProject.g:836:5: lv_path_2_0= rulePath
                    {

                    					newCompositeNode(grammarAccess.getPrintAccess().getPathPathParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_path_2_0=rulePath();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrintRule());
                    					}
                    					set(
                    						current,
                    						"path",
                    						lv_path_2_0,
                    						"org.xtext.jsonProject.JsonProject.Path");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleJsonObject"
    // InternalJsonProject.g:857:1: entryRuleJsonObject returns [EObject current=null] : iv_ruleJsonObject= ruleJsonObject EOF ;
    public final EObject entryRuleJsonObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonObject = null;


        try {
            // InternalJsonProject.g:857:51: (iv_ruleJsonObject= ruleJsonObject EOF )
            // InternalJsonProject.g:858:2: iv_ruleJsonObject= ruleJsonObject EOF
            {
             newCompositeNode(grammarAccess.getJsonObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonObject=ruleJsonObject();

            state._fsp--;

             current =iv_ruleJsonObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonObject"


    // $ANTLR start "ruleJsonObject"
    // InternalJsonProject.g:864:1: ruleJsonObject returns [EObject current=null] : (this_JsonEntries_0= ruleJsonEntries | this_JsonPrimitive_1= ruleJsonPrimitive ) ;
    public final EObject ruleJsonObject() throws RecognitionException {
        EObject current = null;

        EObject this_JsonEntries_0 = null;

        EObject this_JsonPrimitive_1 = null;



        	enterRule();

        try {
            // InternalJsonProject.g:870:2: ( (this_JsonEntries_0= ruleJsonEntries | this_JsonPrimitive_1= ruleJsonPrimitive ) )
            // InternalJsonProject.g:871:2: (this_JsonEntries_0= ruleJsonEntries | this_JsonPrimitive_1= ruleJsonPrimitive )
            {
            // InternalJsonProject.g:871:2: (this_JsonEntries_0= ruleJsonEntries | this_JsonPrimitive_1= ruleJsonPrimitive )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_STRING||(LA13_0>=RULE_NULL && LA13_0<=RULE_DOUBLE)||LA13_0==25||(LA13_0>=32 && LA13_0<=33)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalJsonProject.g:872:3: this_JsonEntries_0= ruleJsonEntries
                    {

                    			newCompositeNode(grammarAccess.getJsonObjectAccess().getJsonEntriesParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonEntries_0=ruleJsonEntries();

                    state._fsp--;


                    			current = this_JsonEntries_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJsonProject.g:881:3: this_JsonPrimitive_1= ruleJsonPrimitive
                    {

                    			newCompositeNode(grammarAccess.getJsonObjectAccess().getJsonPrimitiveParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_JsonPrimitive_1=ruleJsonPrimitive();

                    state._fsp--;


                    			current = this_JsonPrimitive_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonObject"


    // $ANTLR start "entryRuleJsonPrimitive"
    // InternalJsonProject.g:893:1: entryRuleJsonPrimitive returns [EObject current=null] : iv_ruleJsonPrimitive= ruleJsonPrimitive EOF ;
    public final EObject entryRuleJsonPrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonPrimitive = null;


        try {
            // InternalJsonProject.g:893:54: (iv_ruleJsonPrimitive= ruleJsonPrimitive EOF )
            // InternalJsonProject.g:894:2: iv_ruleJsonPrimitive= ruleJsonPrimitive EOF
            {
             newCompositeNode(grammarAccess.getJsonPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonPrimitive=ruleJsonPrimitive();

            state._fsp--;

             current =iv_ruleJsonPrimitive; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonPrimitive"


    // $ANTLR start "ruleJsonPrimitive"
    // InternalJsonProject.g:900:1: ruleJsonPrimitive returns [EObject current=null] : (this_StringObject_0= ruleStringObject | this_BooleanObject_1= ruleBooleanObject | ( () this_NULL_3= RULE_NULL ) | this_ArrayObject_4= ruleArrayObject | ( () ruleNumberObject ) ) ;
    public final EObject ruleJsonPrimitive() throws RecognitionException {
        EObject current = null;

        Token this_NULL_3=null;
        EObject this_StringObject_0 = null;

        EObject this_BooleanObject_1 = null;

        EObject this_ArrayObject_4 = null;



        	enterRule();

        try {
            // InternalJsonProject.g:906:2: ( (this_StringObject_0= ruleStringObject | this_BooleanObject_1= ruleBooleanObject | ( () this_NULL_3= RULE_NULL ) | this_ArrayObject_4= ruleArrayObject | ( () ruleNumberObject ) ) )
            // InternalJsonProject.g:907:2: (this_StringObject_0= ruleStringObject | this_BooleanObject_1= ruleBooleanObject | ( () this_NULL_3= RULE_NULL ) | this_ArrayObject_4= ruleArrayObject | ( () ruleNumberObject ) )
            {
            // InternalJsonProject.g:907:2: (this_StringObject_0= ruleStringObject | this_BooleanObject_1= ruleBooleanObject | ( () this_NULL_3= RULE_NULL ) | this_ArrayObject_4= ruleArrayObject | ( () ruleNumberObject ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt14=1;
                }
                break;
            case 32:
            case 33:
                {
                alt14=2;
                }
                break;
            case RULE_NULL:
                {
                alt14=3;
                }
                break;
            case 25:
                {
                alt14=4;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalJsonProject.g:908:3: this_StringObject_0= ruleStringObject
                    {

                    			newCompositeNode(grammarAccess.getJsonPrimitiveAccess().getStringObjectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringObject_0=ruleStringObject();

                    state._fsp--;


                    			current = this_StringObject_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJsonProject.g:917:3: this_BooleanObject_1= ruleBooleanObject
                    {

                    			newCompositeNode(grammarAccess.getJsonPrimitiveAccess().getBooleanObjectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanObject_1=ruleBooleanObject();

                    state._fsp--;


                    			current = this_BooleanObject_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJsonProject.g:926:3: ( () this_NULL_3= RULE_NULL )
                    {
                    // InternalJsonProject.g:926:3: ( () this_NULL_3= RULE_NULL )
                    // InternalJsonProject.g:927:4: () this_NULL_3= RULE_NULL
                    {
                    // InternalJsonProject.g:927:4: ()
                    // InternalJsonProject.g:928:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getJsonPrimitiveAccess().getJsonPrimitiveAction_2_0(),
                    						current);
                    				

                    }

                    this_NULL_3=(Token)match(input,RULE_NULL,FOLLOW_2); 

                    				newLeafNode(this_NULL_3, grammarAccess.getJsonPrimitiveAccess().getNULLTerminalRuleCall_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJsonProject.g:940:3: this_ArrayObject_4= ruleArrayObject
                    {

                    			newCompositeNode(grammarAccess.getJsonPrimitiveAccess().getArrayObjectParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArrayObject_4=ruleArrayObject();

                    state._fsp--;


                    			current = this_ArrayObject_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJsonProject.g:949:3: ( () ruleNumberObject )
                    {
                    // InternalJsonProject.g:949:3: ( () ruleNumberObject )
                    // InternalJsonProject.g:950:4: () ruleNumberObject
                    {
                    // InternalJsonProject.g:950:4: ()
                    // InternalJsonProject.g:951:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getJsonPrimitiveAccess().getJsonPrimitiveAction_4_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getJsonPrimitiveAccess().getNumberObjectParserRuleCall_4_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleNumberObject();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonPrimitive"


    // $ANTLR start "entryRuleNumberObject"
    // InternalJsonProject.g:969:1: entryRuleNumberObject returns [String current=null] : iv_ruleNumberObject= ruleNumberObject EOF ;
    public final String entryRuleNumberObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumberObject = null;


        try {
            // InternalJsonProject.g:969:52: (iv_ruleNumberObject= ruleNumberObject EOF )
            // InternalJsonProject.g:970:2: iv_ruleNumberObject= ruleNumberObject EOF
            {
             newCompositeNode(grammarAccess.getNumberObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberObject=ruleNumberObject();

            state._fsp--;

             current =iv_ruleNumberObject.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberObject"


    // $ANTLR start "ruleNumberObject"
    // InternalJsonProject.g:976:1: ruleNumberObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleNumberObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalJsonProject.g:982:2: ( (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE ) )
            // InternalJsonProject.g:983:2: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE )
            {
            // InternalJsonProject.g:983:2: (this_INT_0= RULE_INT | this_DOUBLE_1= RULE_DOUBLE )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_DOUBLE) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalJsonProject.g:984:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getNumberObjectAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJsonProject.g:992:3: this_DOUBLE_1= RULE_DOUBLE
                    {
                    this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    			current.merge(this_DOUBLE_1);
                    		

                    			newLeafNode(this_DOUBLE_1, grammarAccess.getNumberObjectAccess().getDOUBLETerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberObject"


    // $ANTLR start "entryRuleArrayObject"
    // InternalJsonProject.g:1003:1: entryRuleArrayObject returns [EObject current=null] : iv_ruleArrayObject= ruleArrayObject EOF ;
    public final EObject entryRuleArrayObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayObject = null;


        try {
            // InternalJsonProject.g:1003:52: (iv_ruleArrayObject= ruleArrayObject EOF )
            // InternalJsonProject.g:1004:2: iv_ruleArrayObject= ruleArrayObject EOF
            {
             newCompositeNode(grammarAccess.getArrayObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayObject=ruleArrayObject();

            state._fsp--;

             current =iv_ruleArrayObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayObject"


    // $ANTLR start "ruleArrayObject"
    // InternalJsonProject.g:1010:1: ruleArrayObject returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleJsonObject ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleJsonObject ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleArrayObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalJsonProject.g:1016:2: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleJsonObject ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleJsonObject ) ) )* )? otherlv_5= ']' ) )
            // InternalJsonProject.g:1017:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleJsonObject ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleJsonObject ) ) )* )? otherlv_5= ']' )
            {
            // InternalJsonProject.g:1017:2: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleJsonObject ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleJsonObject ) ) )* )? otherlv_5= ']' )
            // InternalJsonProject.g:1018:3: () otherlv_1= '[' ( ( (lv_values_2_0= ruleJsonObject ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleJsonObject ) ) )* )? otherlv_5= ']'
            {
            // InternalJsonProject.g:1018:3: ()
            // InternalJsonProject.g:1019:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayObjectAccess().getArrayObjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayObjectAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalJsonProject.g:1029:3: ( ( (lv_values_2_0= ruleJsonObject ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleJsonObject ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING||(LA17_0>=RULE_NULL && LA17_0<=RULE_DOUBLE)||LA17_0==25||LA17_0==28||(LA17_0>=32 && LA17_0<=33)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJsonProject.g:1030:4: ( (lv_values_2_0= ruleJsonObject ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleJsonObject ) ) )*
                    {
                    // InternalJsonProject.g:1030:4: ( (lv_values_2_0= ruleJsonObject ) )
                    // InternalJsonProject.g:1031:5: (lv_values_2_0= ruleJsonObject )
                    {
                    // InternalJsonProject.g:1031:5: (lv_values_2_0= ruleJsonObject )
                    // InternalJsonProject.g:1032:6: lv_values_2_0= ruleJsonObject
                    {

                    						newCompositeNode(grammarAccess.getArrayObjectAccess().getValuesJsonObjectParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_values_2_0=ruleJsonObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayObjectRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_2_0,
                    							"org.xtext.jsonProject.JsonProject.JsonObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJsonProject.g:1049:4: (otherlv_3= ',' ( (lv_values_4_0= ruleJsonObject ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==26) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalJsonProject.g:1050:5: otherlv_3= ',' ( (lv_values_4_0= ruleJsonObject ) )
                    	    {
                    	    otherlv_3=(Token)match(input,26,FOLLOW_6); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getArrayObjectAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalJsonProject.g:1054:5: ( (lv_values_4_0= ruleJsonObject ) )
                    	    // InternalJsonProject.g:1055:6: (lv_values_4_0= ruleJsonObject )
                    	    {
                    	    // InternalJsonProject.g:1055:6: (lv_values_4_0= ruleJsonObject )
                    	    // InternalJsonProject.g:1056:7: lv_values_4_0= ruleJsonObject
                    	    {

                    	    							newCompositeNode(grammarAccess.getArrayObjectAccess().getValuesJsonObjectParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_values_4_0=ruleJsonObject();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArrayObjectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_4_0,
                    	    								"org.xtext.jsonProject.JsonProject.JsonObject");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getArrayObjectAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayObject"


    // $ANTLR start "entryRuleBooleanObject"
    // InternalJsonProject.g:1083:1: entryRuleBooleanObject returns [EObject current=null] : iv_ruleBooleanObject= ruleBooleanObject EOF ;
    public final EObject entryRuleBooleanObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanObject = null;


        try {
            // InternalJsonProject.g:1083:54: (iv_ruleBooleanObject= ruleBooleanObject EOF )
            // InternalJsonProject.g:1084:2: iv_ruleBooleanObject= ruleBooleanObject EOF
            {
             newCompositeNode(grammarAccess.getBooleanObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanObject=ruleBooleanObject();

            state._fsp--;

             current =iv_ruleBooleanObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanObject"


    // $ANTLR start "ruleBooleanObject"
    // InternalJsonProject.g:1090:1: ruleBooleanObject returns [EObject current=null] : ( (lv_value_0_0= ruleBoolean ) ) ;
    public final EObject ruleBooleanObject() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJsonProject.g:1096:2: ( ( (lv_value_0_0= ruleBoolean ) ) )
            // InternalJsonProject.g:1097:2: ( (lv_value_0_0= ruleBoolean ) )
            {
            // InternalJsonProject.g:1097:2: ( (lv_value_0_0= ruleBoolean ) )
            // InternalJsonProject.g:1098:3: (lv_value_0_0= ruleBoolean )
            {
            // InternalJsonProject.g:1098:3: (lv_value_0_0= ruleBoolean )
            // InternalJsonProject.g:1099:4: lv_value_0_0= ruleBoolean
            {

            				newCompositeNode(grammarAccess.getBooleanObjectAccess().getValueBooleanEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBoolean();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBooleanObjectRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.jsonProject.JsonProject.Boolean");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanObject"


    // $ANTLR start "entryRuleStringObject"
    // InternalJsonProject.g:1119:1: entryRuleStringObject returns [EObject current=null] : iv_ruleStringObject= ruleStringObject EOF ;
    public final EObject entryRuleStringObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringObject = null;


        try {
            // InternalJsonProject.g:1119:53: (iv_ruleStringObject= ruleStringObject EOF )
            // InternalJsonProject.g:1120:2: iv_ruleStringObject= ruleStringObject EOF
            {
             newCompositeNode(grammarAccess.getStringObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringObject=ruleStringObject();

            state._fsp--;

             current =iv_ruleStringObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringObject"


    // $ANTLR start "ruleStringObject"
    // InternalJsonProject.g:1126:1: ruleStringObject returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringObject() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalJsonProject.g:1132:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalJsonProject.g:1133:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalJsonProject.g:1133:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalJsonProject.g:1134:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalJsonProject.g:1134:3: (lv_value_0_0= RULE_STRING )
            // InternalJsonProject.g:1135:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringObjectAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringObjectRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringObject"


    // $ANTLR start "entryRuleJsonEntries"
    // InternalJsonProject.g:1154:1: entryRuleJsonEntries returns [EObject current=null] : iv_ruleJsonEntries= ruleJsonEntries EOF ;
    public final EObject entryRuleJsonEntries() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonEntries = null;


        try {
            // InternalJsonProject.g:1154:52: (iv_ruleJsonEntries= ruleJsonEntries EOF )
            // InternalJsonProject.g:1155:2: iv_ruleJsonEntries= ruleJsonEntries EOF
            {
             newCompositeNode(grammarAccess.getJsonEntriesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonEntries=ruleJsonEntries();

            state._fsp--;

             current =iv_ruleJsonEntries; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonEntries"


    // $ANTLR start "ruleJsonEntries"
    // InternalJsonProject.g:1161:1: ruleJsonEntries returns [EObject current=null] : (otherlv_0= '{' ( (lv_listEntries_1_0= ruleJsonEntry ) ) (otherlv_2= ',' ( (lv_listEntries_3_0= ruleJsonEntry ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleJsonEntries() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_listEntries_1_0 = null;

        EObject lv_listEntries_3_0 = null;



        	enterRule();

        try {
            // InternalJsonProject.g:1167:2: ( (otherlv_0= '{' ( (lv_listEntries_1_0= ruleJsonEntry ) ) (otherlv_2= ',' ( (lv_listEntries_3_0= ruleJsonEntry ) ) )* otherlv_4= '}' ) )
            // InternalJsonProject.g:1168:2: (otherlv_0= '{' ( (lv_listEntries_1_0= ruleJsonEntry ) ) (otherlv_2= ',' ( (lv_listEntries_3_0= ruleJsonEntry ) ) )* otherlv_4= '}' )
            {
            // InternalJsonProject.g:1168:2: (otherlv_0= '{' ( (lv_listEntries_1_0= ruleJsonEntry ) ) (otherlv_2= ',' ( (lv_listEntries_3_0= ruleJsonEntry ) ) )* otherlv_4= '}' )
            // InternalJsonProject.g:1169:3: otherlv_0= '{' ( (lv_listEntries_1_0= ruleJsonEntry ) ) (otherlv_2= ',' ( (lv_listEntries_3_0= ruleJsonEntry ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getJsonEntriesAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalJsonProject.g:1173:3: ( (lv_listEntries_1_0= ruleJsonEntry ) )
            // InternalJsonProject.g:1174:4: (lv_listEntries_1_0= ruleJsonEntry )
            {
            // InternalJsonProject.g:1174:4: (lv_listEntries_1_0= ruleJsonEntry )
            // InternalJsonProject.g:1175:5: lv_listEntries_1_0= ruleJsonEntry
            {

            					newCompositeNode(grammarAccess.getJsonEntriesAccess().getListEntriesJsonEntryParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_listEntries_1_0=ruleJsonEntry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJsonEntriesRule());
            					}
            					add(
            						current,
            						"listEntries",
            						lv_listEntries_1_0,
            						"org.xtext.jsonProject.JsonProject.JsonEntry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonProject.g:1192:3: (otherlv_2= ',' ( (lv_listEntries_3_0= ruleJsonEntry ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalJsonProject.g:1193:4: otherlv_2= ',' ( (lv_listEntries_3_0= ruleJsonEntry ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getJsonEntriesAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalJsonProject.g:1197:4: ( (lv_listEntries_3_0= ruleJsonEntry ) )
            	    // InternalJsonProject.g:1198:5: (lv_listEntries_3_0= ruleJsonEntry )
            	    {
            	    // InternalJsonProject.g:1198:5: (lv_listEntries_3_0= ruleJsonEntry )
            	    // InternalJsonProject.g:1199:6: lv_listEntries_3_0= ruleJsonEntry
            	    {

            	    						newCompositeNode(grammarAccess.getJsonEntriesAccess().getListEntriesJsonEntryParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_listEntries_3_0=ruleJsonEntry();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJsonEntriesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"listEntries",
            	    							lv_listEntries_3_0,
            	    							"org.xtext.jsonProject.JsonProject.JsonEntry");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getJsonEntriesAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonEntries"


    // $ANTLR start "entryRuleJsonEntry"
    // InternalJsonProject.g:1225:1: entryRuleJsonEntry returns [EObject current=null] : iv_ruleJsonEntry= ruleJsonEntry EOF ;
    public final EObject entryRuleJsonEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJsonEntry = null;


        try {
            // InternalJsonProject.g:1225:50: (iv_ruleJsonEntry= ruleJsonEntry EOF )
            // InternalJsonProject.g:1226:2: iv_ruleJsonEntry= ruleJsonEntry EOF
            {
             newCompositeNode(grammarAccess.getJsonEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJsonEntry=ruleJsonEntry();

            state._fsp--;

             current =iv_ruleJsonEntry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJsonEntry"


    // $ANTLR start "ruleJsonEntry"
    // InternalJsonProject.g:1232:1: ruleJsonEntry returns [EObject current=null] : (otherlv_0= '\"' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '\"' otherlv_3= ':' ( (lv_jsonObject_4_0= ruleJsonObject ) ) ) ;
    public final EObject ruleJsonEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_jsonObject_4_0 = null;



        	enterRule();

        try {
            // InternalJsonProject.g:1238:2: ( (otherlv_0= '\"' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '\"' otherlv_3= ':' ( (lv_jsonObject_4_0= ruleJsonObject ) ) ) )
            // InternalJsonProject.g:1239:2: (otherlv_0= '\"' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '\"' otherlv_3= ':' ( (lv_jsonObject_4_0= ruleJsonObject ) ) )
            {
            // InternalJsonProject.g:1239:2: (otherlv_0= '\"' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '\"' otherlv_3= ':' ( (lv_jsonObject_4_0= ruleJsonObject ) ) )
            // InternalJsonProject.g:1240:3: otherlv_0= '\"' ( (lv_key_1_0= RULE_ID ) ) otherlv_2= '\"' otherlv_3= ':' ( (lv_jsonObject_4_0= ruleJsonObject ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getJsonEntryAccess().getQuotationMarkKeyword_0());
            		
            // InternalJsonProject.g:1244:3: ( (lv_key_1_0= RULE_ID ) )
            // InternalJsonProject.g:1245:4: (lv_key_1_0= RULE_ID )
            {
            // InternalJsonProject.g:1245:4: (lv_key_1_0= RULE_ID )
            // InternalJsonProject.g:1246:5: lv_key_1_0= RULE_ID
            {
            lv_key_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_key_1_0, grammarAccess.getJsonEntryAccess().getKeyIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJsonEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getJsonEntryAccess().getQuotationMarkKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getJsonEntryAccess().getColonKeyword_3());
            		
            // InternalJsonProject.g:1270:3: ( (lv_jsonObject_4_0= ruleJsonObject ) )
            // InternalJsonProject.g:1271:4: (lv_jsonObject_4_0= ruleJsonObject )
            {
            // InternalJsonProject.g:1271:4: (lv_jsonObject_4_0= ruleJsonObject )
            // InternalJsonProject.g:1272:5: lv_jsonObject_4_0= ruleJsonObject
            {

            					newCompositeNode(grammarAccess.getJsonEntryAccess().getJsonObjectJsonObjectParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_jsonObject_4_0=ruleJsonObject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJsonEntryRule());
            					}
            					set(
            						current,
            						"jsonObject",
            						lv_jsonObject_4_0,
            						"org.xtext.jsonProject.JsonProject.JsonObject");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJsonEntry"


    // $ANTLR start "ruleBoolean"
    // InternalJsonProject.g:1293:1: ruleBoolean returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJsonProject.g:1299:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalJsonProject.g:1300:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalJsonProject.g:1300:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            else if ( (LA19_0==33) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalJsonProject.g:1301:3: (enumLiteral_0= 'true' )
                    {
                    // InternalJsonProject.g:1301:3: (enumLiteral_0= 'true' )
                    // InternalJsonProject.g:1302:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonProject.g:1309:3: (enumLiteral_1= 'false' )
                    {
                    // InternalJsonProject.g:1309:3: (enumLiteral_1= 'false' )
                    // InternalJsonProject.g:1310:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanAccess().getFALSEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001FD0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000312000710L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000000E2L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000003120007F0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000031A000710L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});

}