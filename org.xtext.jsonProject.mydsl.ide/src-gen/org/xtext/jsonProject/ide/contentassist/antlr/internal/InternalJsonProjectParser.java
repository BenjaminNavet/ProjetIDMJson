package org.xtext.jsonProject.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.jsonProject.services.JsonProjectGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonProjectParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_GOBACK", "RULE_ROOT", "RULE_INT", "RULE_DOUBLE", "RULE_NULL", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'load'", "'insert'", "'.'", "'modify'", "'sum'", "'remove'", "'mult'", "'select'", "'store'", "'print'", "'['", "']'", "','", "'{'", "'}'", "'\"'", "':'"
    };
    public static final int RULE_GOBACK=4;
    public static final int RULE_STRING=9;
    public static final int RULE_NULL=8;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=7;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=10;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_ROOT=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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

    	public void setGrammarAccess(JsonProjectGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleJsonCommands"
    // InternalJsonProject.g:53:1: entryRuleJsonCommands : ruleJsonCommands EOF ;
    public final void entryRuleJsonCommands() throws RecognitionException {
        try {
            // InternalJsonProject.g:54:1: ( ruleJsonCommands EOF )
            // InternalJsonProject.g:55:1: ruleJsonCommands EOF
            {
             before(grammarAccess.getJsonCommandsRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonCommands();

            state._fsp--;

             after(grammarAccess.getJsonCommandsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonCommands"


    // $ANTLR start "ruleJsonCommands"
    // InternalJsonProject.g:62:1: ruleJsonCommands : ( ( rule__JsonCommands__JsonCommandsAssignment )* ) ;
    public final void ruleJsonCommands() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:66:2: ( ( ( rule__JsonCommands__JsonCommandsAssignment )* ) )
            // InternalJsonProject.g:67:2: ( ( rule__JsonCommands__JsonCommandsAssignment )* )
            {
            // InternalJsonProject.g:67:2: ( ( rule__JsonCommands__JsonCommandsAssignment )* )
            // InternalJsonProject.g:68:3: ( rule__JsonCommands__JsonCommandsAssignment )*
            {
             before(grammarAccess.getJsonCommandsAccess().getJsonCommandsAssignment()); 
            // InternalJsonProject.g:69:3: ( rule__JsonCommands__JsonCommandsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJsonProject.g:69:4: rule__JsonCommands__JsonCommandsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__JsonCommands__JsonCommandsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getJsonCommandsAccess().getJsonCommandsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonCommands"


    // $ANTLR start "entryRuleJsonCommand"
    // InternalJsonProject.g:78:1: entryRuleJsonCommand : ruleJsonCommand EOF ;
    public final void entryRuleJsonCommand() throws RecognitionException {
        try {
            // InternalJsonProject.g:79:1: ( ruleJsonCommand EOF )
            // InternalJsonProject.g:80:1: ruleJsonCommand EOF
            {
             before(grammarAccess.getJsonCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonCommand();

            state._fsp--;

             after(grammarAccess.getJsonCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonCommand"


    // $ANTLR start "ruleJsonCommand"
    // InternalJsonProject.g:87:1: ruleJsonCommand : ( ( rule__JsonCommand__Group__0 ) ) ;
    public final void ruleJsonCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:91:2: ( ( ( rule__JsonCommand__Group__0 ) ) )
            // InternalJsonProject.g:92:2: ( ( rule__JsonCommand__Group__0 ) )
            {
            // InternalJsonProject.g:92:2: ( ( rule__JsonCommand__Group__0 ) )
            // InternalJsonProject.g:93:3: ( rule__JsonCommand__Group__0 )
            {
             before(grammarAccess.getJsonCommandAccess().getGroup()); 
            // InternalJsonProject.g:94:3: ( rule__JsonCommand__Group__0 )
            // InternalJsonProject.g:94:4: rule__JsonCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JsonCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonCommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonCommand"


    // $ANTLR start "entryRuleInitialisation"
    // InternalJsonProject.g:103:1: entryRuleInitialisation : ruleInitialisation EOF ;
    public final void entryRuleInitialisation() throws RecognitionException {
        try {
            // InternalJsonProject.g:104:1: ( ruleInitialisation EOF )
            // InternalJsonProject.g:105:1: ruleInitialisation EOF
            {
             before(grammarAccess.getInitialisationRule()); 
            pushFollow(FOLLOW_1);
            ruleInitialisation();

            state._fsp--;

             after(grammarAccess.getInitialisationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitialisation"


    // $ANTLR start "ruleInitialisation"
    // InternalJsonProject.g:112:1: ruleInitialisation : ( ( rule__Initialisation__Group__0 ) ) ;
    public final void ruleInitialisation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:116:2: ( ( ( rule__Initialisation__Group__0 ) ) )
            // InternalJsonProject.g:117:2: ( ( rule__Initialisation__Group__0 ) )
            {
            // InternalJsonProject.g:117:2: ( ( rule__Initialisation__Group__0 ) )
            // InternalJsonProject.g:118:3: ( rule__Initialisation__Group__0 )
            {
             before(grammarAccess.getInitialisationAccess().getGroup()); 
            // InternalJsonProject.g:119:3: ( rule__Initialisation__Group__0 )
            // InternalJsonProject.g:119:4: rule__Initialisation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Initialisation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialisationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitialisation"


    // $ANTLR start "entryRuleOperation"
    // InternalJsonProject.g:128:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalJsonProject.g:129:1: ( ruleOperation EOF )
            // InternalJsonProject.g:130:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalJsonProject.g:137:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:141:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalJsonProject.g:142:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalJsonProject.g:142:2: ( ( rule__Operation__Alternatives ) )
            // InternalJsonProject.g:143:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalJsonProject.g:144:3: ( rule__Operation__Alternatives )
            // InternalJsonProject.g:144:4: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleInsert"
    // InternalJsonProject.g:153:1: entryRuleInsert : ruleInsert EOF ;
    public final void entryRuleInsert() throws RecognitionException {
        try {
            // InternalJsonProject.g:154:1: ( ruleInsert EOF )
            // InternalJsonProject.g:155:1: ruleInsert EOF
            {
             before(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            ruleInsert();

            state._fsp--;

             after(grammarAccess.getInsertRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalJsonProject.g:162:1: ruleInsert : ( ( rule__Insert__Group__0 ) ) ;
    public final void ruleInsert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:166:2: ( ( ( rule__Insert__Group__0 ) ) )
            // InternalJsonProject.g:167:2: ( ( rule__Insert__Group__0 ) )
            {
            // InternalJsonProject.g:167:2: ( ( rule__Insert__Group__0 ) )
            // InternalJsonProject.g:168:3: ( rule__Insert__Group__0 )
            {
             before(grammarAccess.getInsertAccess().getGroup()); 
            // InternalJsonProject.g:169:3: ( rule__Insert__Group__0 )
            // InternalJsonProject.g:169:4: rule__Insert__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRulePath"
    // InternalJsonProject.g:178:1: entryRulePath : rulePath EOF ;
    public final void entryRulePath() throws RecognitionException {
        try {
            // InternalJsonProject.g:179:1: ( rulePath EOF )
            // InternalJsonProject.g:180:1: rulePath EOF
            {
             before(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_1);
            rulePath();

            state._fsp--;

             after(grammarAccess.getPathRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // InternalJsonProject.g:187:1: rulePath : ( ( rule__Path__Group__0 ) ) ;
    public final void rulePath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:191:2: ( ( ( rule__Path__Group__0 ) ) )
            // InternalJsonProject.g:192:2: ( ( rule__Path__Group__0 ) )
            {
            // InternalJsonProject.g:192:2: ( ( rule__Path__Group__0 ) )
            // InternalJsonProject.g:193:3: ( rule__Path__Group__0 )
            {
             before(grammarAccess.getPathAccess().getGroup()); 
            // InternalJsonProject.g:194:3: ( rule__Path__Group__0 )
            // InternalJsonProject.g:194:4: rule__Path__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Path__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleModify"
    // InternalJsonProject.g:203:1: entryRuleModify : ruleModify EOF ;
    public final void entryRuleModify() throws RecognitionException {
        try {
            // InternalJsonProject.g:204:1: ( ruleModify EOF )
            // InternalJsonProject.g:205:1: ruleModify EOF
            {
             before(grammarAccess.getModifyRule()); 
            pushFollow(FOLLOW_1);
            ruleModify();

            state._fsp--;

             after(grammarAccess.getModifyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModify"


    // $ANTLR start "ruleModify"
    // InternalJsonProject.g:212:1: ruleModify : ( ( rule__Modify__Group__0 ) ) ;
    public final void ruleModify() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:216:2: ( ( ( rule__Modify__Group__0 ) ) )
            // InternalJsonProject.g:217:2: ( ( rule__Modify__Group__0 ) )
            {
            // InternalJsonProject.g:217:2: ( ( rule__Modify__Group__0 ) )
            // InternalJsonProject.g:218:3: ( rule__Modify__Group__0 )
            {
             before(grammarAccess.getModifyAccess().getGroup()); 
            // InternalJsonProject.g:219:3: ( rule__Modify__Group__0 )
            // InternalJsonProject.g:219:4: rule__Modify__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Modify__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModifyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModify"


    // $ANTLR start "entryRuleSum"
    // InternalJsonProject.g:228:1: entryRuleSum : ruleSum EOF ;
    public final void entryRuleSum() throws RecognitionException {
        try {
            // InternalJsonProject.g:229:1: ( ruleSum EOF )
            // InternalJsonProject.g:230:1: ruleSum EOF
            {
             before(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getSumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalJsonProject.g:237:1: ruleSum : ( ( rule__Sum__Group__0 ) ) ;
    public final void ruleSum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:241:2: ( ( ( rule__Sum__Group__0 ) ) )
            // InternalJsonProject.g:242:2: ( ( rule__Sum__Group__0 ) )
            {
            // InternalJsonProject.g:242:2: ( ( rule__Sum__Group__0 ) )
            // InternalJsonProject.g:243:3: ( rule__Sum__Group__0 )
            {
             before(grammarAccess.getSumAccess().getGroup()); 
            // InternalJsonProject.g:244:3: ( rule__Sum__Group__0 )
            // InternalJsonProject.g:244:4: rule__Sum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleRemove"
    // InternalJsonProject.g:253:1: entryRuleRemove : ruleRemove EOF ;
    public final void entryRuleRemove() throws RecognitionException {
        try {
            // InternalJsonProject.g:254:1: ( ruleRemove EOF )
            // InternalJsonProject.g:255:1: ruleRemove EOF
            {
             before(grammarAccess.getRemoveRule()); 
            pushFollow(FOLLOW_1);
            ruleRemove();

            state._fsp--;

             after(grammarAccess.getRemoveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRemove"


    // $ANTLR start "ruleRemove"
    // InternalJsonProject.g:262:1: ruleRemove : ( ( rule__Remove__Group__0 ) ) ;
    public final void ruleRemove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:266:2: ( ( ( rule__Remove__Group__0 ) ) )
            // InternalJsonProject.g:267:2: ( ( rule__Remove__Group__0 ) )
            {
            // InternalJsonProject.g:267:2: ( ( rule__Remove__Group__0 ) )
            // InternalJsonProject.g:268:3: ( rule__Remove__Group__0 )
            {
             before(grammarAccess.getRemoveAccess().getGroup()); 
            // InternalJsonProject.g:269:3: ( rule__Remove__Group__0 )
            // InternalJsonProject.g:269:4: rule__Remove__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Remove__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRemoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRemove"


    // $ANTLR start "entryRuleMult"
    // InternalJsonProject.g:278:1: entryRuleMult : ruleMult EOF ;
    public final void entryRuleMult() throws RecognitionException {
        try {
            // InternalJsonProject.g:279:1: ( ruleMult EOF )
            // InternalJsonProject.g:280:1: ruleMult EOF
            {
             before(grammarAccess.getMultRule()); 
            pushFollow(FOLLOW_1);
            ruleMult();

            state._fsp--;

             after(grammarAccess.getMultRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMult"


    // $ANTLR start "ruleMult"
    // InternalJsonProject.g:287:1: ruleMult : ( ( rule__Mult__Group__0 ) ) ;
    public final void ruleMult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:291:2: ( ( ( rule__Mult__Group__0 ) ) )
            // InternalJsonProject.g:292:2: ( ( rule__Mult__Group__0 ) )
            {
            // InternalJsonProject.g:292:2: ( ( rule__Mult__Group__0 ) )
            // InternalJsonProject.g:293:3: ( rule__Mult__Group__0 )
            {
             before(grammarAccess.getMultAccess().getGroup()); 
            // InternalJsonProject.g:294:3: ( rule__Mult__Group__0 )
            // InternalJsonProject.g:294:4: rule__Mult__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mult__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMult"


    // $ANTLR start "entryRuleSelect"
    // InternalJsonProject.g:303:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalJsonProject.g:304:1: ( ruleSelect EOF )
            // InternalJsonProject.g:305:1: ruleSelect EOF
            {
             before(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getSelectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalJsonProject.g:312:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:316:2: ( ( ( rule__Select__Group__0 ) ) )
            // InternalJsonProject.g:317:2: ( ( rule__Select__Group__0 ) )
            {
            // InternalJsonProject.g:317:2: ( ( rule__Select__Group__0 ) )
            // InternalJsonProject.g:318:3: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // InternalJsonProject.g:319:3: ( rule__Select__Group__0 )
            // InternalJsonProject.g:319:4: rule__Select__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleFinal"
    // InternalJsonProject.g:328:1: entryRuleFinal : ruleFinal EOF ;
    public final void entryRuleFinal() throws RecognitionException {
        try {
            // InternalJsonProject.g:329:1: ( ruleFinal EOF )
            // InternalJsonProject.g:330:1: ruleFinal EOF
            {
             before(grammarAccess.getFinalRule()); 
            pushFollow(FOLLOW_1);
            ruleFinal();

            state._fsp--;

             after(grammarAccess.getFinalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFinal"


    // $ANTLR start "ruleFinal"
    // InternalJsonProject.g:337:1: ruleFinal : ( ( rule__Final__Alternatives ) ) ;
    public final void ruleFinal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:341:2: ( ( ( rule__Final__Alternatives ) ) )
            // InternalJsonProject.g:342:2: ( ( rule__Final__Alternatives ) )
            {
            // InternalJsonProject.g:342:2: ( ( rule__Final__Alternatives ) )
            // InternalJsonProject.g:343:3: ( rule__Final__Alternatives )
            {
             before(grammarAccess.getFinalAccess().getAlternatives()); 
            // InternalJsonProject.g:344:3: ( rule__Final__Alternatives )
            // InternalJsonProject.g:344:4: rule__Final__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Final__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFinal"


    // $ANTLR start "entryRuleStore"
    // InternalJsonProject.g:353:1: entryRuleStore : ruleStore EOF ;
    public final void entryRuleStore() throws RecognitionException {
        try {
            // InternalJsonProject.g:354:1: ( ruleStore EOF )
            // InternalJsonProject.g:355:1: ruleStore EOF
            {
             before(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            ruleStore();

            state._fsp--;

             after(grammarAccess.getStoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalJsonProject.g:362:1: ruleStore : ( ( rule__Store__Group__0 ) ) ;
    public final void ruleStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:366:2: ( ( ( rule__Store__Group__0 ) ) )
            // InternalJsonProject.g:367:2: ( ( rule__Store__Group__0 ) )
            {
            // InternalJsonProject.g:367:2: ( ( rule__Store__Group__0 ) )
            // InternalJsonProject.g:368:3: ( rule__Store__Group__0 )
            {
             before(grammarAccess.getStoreAccess().getGroup()); 
            // InternalJsonProject.g:369:3: ( rule__Store__Group__0 )
            // InternalJsonProject.g:369:4: rule__Store__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRulePrint"
    // InternalJsonProject.g:378:1: entryRulePrint : rulePrint EOF ;
    public final void entryRulePrint() throws RecognitionException {
        try {
            // InternalJsonProject.g:379:1: ( rulePrint EOF )
            // InternalJsonProject.g:380:1: rulePrint EOF
            {
             before(grammarAccess.getPrintRule()); 
            pushFollow(FOLLOW_1);
            rulePrint();

            state._fsp--;

             after(grammarAccess.getPrintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrint"


    // $ANTLR start "rulePrint"
    // InternalJsonProject.g:387:1: rulePrint : ( ( rule__Print__Group__0 ) ) ;
    public final void rulePrint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:391:2: ( ( ( rule__Print__Group__0 ) ) )
            // InternalJsonProject.g:392:2: ( ( rule__Print__Group__0 ) )
            {
            // InternalJsonProject.g:392:2: ( ( rule__Print__Group__0 ) )
            // InternalJsonProject.g:393:3: ( rule__Print__Group__0 )
            {
             before(grammarAccess.getPrintAccess().getGroup()); 
            // InternalJsonProject.g:394:3: ( rule__Print__Group__0 )
            // InternalJsonProject.g:394:4: rule__Print__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrint"


    // $ANTLR start "entryRuleJsonObject"
    // InternalJsonProject.g:403:1: entryRuleJsonObject : ruleJsonObject EOF ;
    public final void entryRuleJsonObject() throws RecognitionException {
        try {
            // InternalJsonProject.g:404:1: ( ruleJsonObject EOF )
            // InternalJsonProject.g:405:1: ruleJsonObject EOF
            {
             before(grammarAccess.getJsonObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonObject();

            state._fsp--;

             after(grammarAccess.getJsonObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonObject"


    // $ANTLR start "ruleJsonObject"
    // InternalJsonProject.g:412:1: ruleJsonObject : ( ( rule__JsonObject__Alternatives ) ) ;
    public final void ruleJsonObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:416:2: ( ( ( rule__JsonObject__Alternatives ) ) )
            // InternalJsonProject.g:417:2: ( ( rule__JsonObject__Alternatives ) )
            {
            // InternalJsonProject.g:417:2: ( ( rule__JsonObject__Alternatives ) )
            // InternalJsonProject.g:418:3: ( rule__JsonObject__Alternatives )
            {
             before(grammarAccess.getJsonObjectAccess().getAlternatives()); 
            // InternalJsonProject.g:419:3: ( rule__JsonObject__Alternatives )
            // InternalJsonProject.g:419:4: rule__JsonObject__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JsonObject__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJsonObjectAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonObject"


    // $ANTLR start "entryRuleJsonPrimitive"
    // InternalJsonProject.g:428:1: entryRuleJsonPrimitive : ruleJsonPrimitive EOF ;
    public final void entryRuleJsonPrimitive() throws RecognitionException {
        try {
            // InternalJsonProject.g:429:1: ( ruleJsonPrimitive EOF )
            // InternalJsonProject.g:430:1: ruleJsonPrimitive EOF
            {
             before(grammarAccess.getJsonPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonPrimitive();

            state._fsp--;

             after(grammarAccess.getJsonPrimitiveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonPrimitive"


    // $ANTLR start "ruleJsonPrimitive"
    // InternalJsonProject.g:437:1: ruleJsonPrimitive : ( ( rule__JsonPrimitive__Alternatives ) ) ;
    public final void ruleJsonPrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:441:2: ( ( ( rule__JsonPrimitive__Alternatives ) ) )
            // InternalJsonProject.g:442:2: ( ( rule__JsonPrimitive__Alternatives ) )
            {
            // InternalJsonProject.g:442:2: ( ( rule__JsonPrimitive__Alternatives ) )
            // InternalJsonProject.g:443:3: ( rule__JsonPrimitive__Alternatives )
            {
             before(grammarAccess.getJsonPrimitiveAccess().getAlternatives()); 
            // InternalJsonProject.g:444:3: ( rule__JsonPrimitive__Alternatives )
            // InternalJsonProject.g:444:4: rule__JsonPrimitive__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JsonPrimitive__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJsonPrimitiveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonPrimitive"


    // $ANTLR start "entryRuleNumberObject"
    // InternalJsonProject.g:453:1: entryRuleNumberObject : ruleNumberObject EOF ;
    public final void entryRuleNumberObject() throws RecognitionException {
        try {
            // InternalJsonProject.g:454:1: ( ruleNumberObject EOF )
            // InternalJsonProject.g:455:1: ruleNumberObject EOF
            {
             before(grammarAccess.getNumberObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberObject();

            state._fsp--;

             after(grammarAccess.getNumberObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberObject"


    // $ANTLR start "ruleNumberObject"
    // InternalJsonProject.g:462:1: ruleNumberObject : ( ( rule__NumberObject__Alternatives ) ) ;
    public final void ruleNumberObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:466:2: ( ( ( rule__NumberObject__Alternatives ) ) )
            // InternalJsonProject.g:467:2: ( ( rule__NumberObject__Alternatives ) )
            {
            // InternalJsonProject.g:467:2: ( ( rule__NumberObject__Alternatives ) )
            // InternalJsonProject.g:468:3: ( rule__NumberObject__Alternatives )
            {
             before(grammarAccess.getNumberObjectAccess().getAlternatives()); 
            // InternalJsonProject.g:469:3: ( rule__NumberObject__Alternatives )
            // InternalJsonProject.g:469:4: rule__NumberObject__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumberObject__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberObjectAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberObject"


    // $ANTLR start "entryRuleArrayObject"
    // InternalJsonProject.g:478:1: entryRuleArrayObject : ruleArrayObject EOF ;
    public final void entryRuleArrayObject() throws RecognitionException {
        try {
            // InternalJsonProject.g:479:1: ( ruleArrayObject EOF )
            // InternalJsonProject.g:480:1: ruleArrayObject EOF
            {
             before(grammarAccess.getArrayObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleArrayObject();

            state._fsp--;

             after(grammarAccess.getArrayObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayObject"


    // $ANTLR start "ruleArrayObject"
    // InternalJsonProject.g:487:1: ruleArrayObject : ( ( rule__ArrayObject__Group__0 ) ) ;
    public final void ruleArrayObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:491:2: ( ( ( rule__ArrayObject__Group__0 ) ) )
            // InternalJsonProject.g:492:2: ( ( rule__ArrayObject__Group__0 ) )
            {
            // InternalJsonProject.g:492:2: ( ( rule__ArrayObject__Group__0 ) )
            // InternalJsonProject.g:493:3: ( rule__ArrayObject__Group__0 )
            {
             before(grammarAccess.getArrayObjectAccess().getGroup()); 
            // InternalJsonProject.g:494:3: ( rule__ArrayObject__Group__0 )
            // InternalJsonProject.g:494:4: rule__ArrayObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayObject"


    // $ANTLR start "entryRuleBooleanObject"
    // InternalJsonProject.g:503:1: entryRuleBooleanObject : ruleBooleanObject EOF ;
    public final void entryRuleBooleanObject() throws RecognitionException {
        try {
            // InternalJsonProject.g:504:1: ( ruleBooleanObject EOF )
            // InternalJsonProject.g:505:1: ruleBooleanObject EOF
            {
             before(grammarAccess.getBooleanObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanObject();

            state._fsp--;

             after(grammarAccess.getBooleanObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanObject"


    // $ANTLR start "ruleBooleanObject"
    // InternalJsonProject.g:512:1: ruleBooleanObject : ( ( rule__BooleanObject__ValueAssignment ) ) ;
    public final void ruleBooleanObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:516:2: ( ( ( rule__BooleanObject__ValueAssignment ) ) )
            // InternalJsonProject.g:517:2: ( ( rule__BooleanObject__ValueAssignment ) )
            {
            // InternalJsonProject.g:517:2: ( ( rule__BooleanObject__ValueAssignment ) )
            // InternalJsonProject.g:518:3: ( rule__BooleanObject__ValueAssignment )
            {
             before(grammarAccess.getBooleanObjectAccess().getValueAssignment()); 
            // InternalJsonProject.g:519:3: ( rule__BooleanObject__ValueAssignment )
            // InternalJsonProject.g:519:4: rule__BooleanObject__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanObject__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanObjectAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanObject"


    // $ANTLR start "entryRuleStringObject"
    // InternalJsonProject.g:528:1: entryRuleStringObject : ruleStringObject EOF ;
    public final void entryRuleStringObject() throws RecognitionException {
        try {
            // InternalJsonProject.g:529:1: ( ruleStringObject EOF )
            // InternalJsonProject.g:530:1: ruleStringObject EOF
            {
             before(grammarAccess.getStringObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleStringObject();

            state._fsp--;

             after(grammarAccess.getStringObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringObject"


    // $ANTLR start "ruleStringObject"
    // InternalJsonProject.g:537:1: ruleStringObject : ( ( rule__StringObject__ValueAssignment ) ) ;
    public final void ruleStringObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:541:2: ( ( ( rule__StringObject__ValueAssignment ) ) )
            // InternalJsonProject.g:542:2: ( ( rule__StringObject__ValueAssignment ) )
            {
            // InternalJsonProject.g:542:2: ( ( rule__StringObject__ValueAssignment ) )
            // InternalJsonProject.g:543:3: ( rule__StringObject__ValueAssignment )
            {
             before(grammarAccess.getStringObjectAccess().getValueAssignment()); 
            // InternalJsonProject.g:544:3: ( rule__StringObject__ValueAssignment )
            // InternalJsonProject.g:544:4: rule__StringObject__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringObject__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringObjectAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringObject"


    // $ANTLR start "entryRuleJsonEntries"
    // InternalJsonProject.g:553:1: entryRuleJsonEntries : ruleJsonEntries EOF ;
    public final void entryRuleJsonEntries() throws RecognitionException {
        try {
            // InternalJsonProject.g:554:1: ( ruleJsonEntries EOF )
            // InternalJsonProject.g:555:1: ruleJsonEntries EOF
            {
             before(grammarAccess.getJsonEntriesRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonEntries();

            state._fsp--;

             after(grammarAccess.getJsonEntriesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonEntries"


    // $ANTLR start "ruleJsonEntries"
    // InternalJsonProject.g:562:1: ruleJsonEntries : ( ( rule__JsonEntries__Group__0 ) ) ;
    public final void ruleJsonEntries() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:566:2: ( ( ( rule__JsonEntries__Group__0 ) ) )
            // InternalJsonProject.g:567:2: ( ( rule__JsonEntries__Group__0 ) )
            {
            // InternalJsonProject.g:567:2: ( ( rule__JsonEntries__Group__0 ) )
            // InternalJsonProject.g:568:3: ( rule__JsonEntries__Group__0 )
            {
             before(grammarAccess.getJsonEntriesAccess().getGroup()); 
            // InternalJsonProject.g:569:3: ( rule__JsonEntries__Group__0 )
            // InternalJsonProject.g:569:4: rule__JsonEntries__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JsonEntries__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonEntriesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonEntries"


    // $ANTLR start "entryRuleJsonEntry"
    // InternalJsonProject.g:578:1: entryRuleJsonEntry : ruleJsonEntry EOF ;
    public final void entryRuleJsonEntry() throws RecognitionException {
        try {
            // InternalJsonProject.g:579:1: ( ruleJsonEntry EOF )
            // InternalJsonProject.g:580:1: ruleJsonEntry EOF
            {
             before(grammarAccess.getJsonEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleJsonEntry();

            state._fsp--;

             after(grammarAccess.getJsonEntryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJsonEntry"


    // $ANTLR start "ruleJsonEntry"
    // InternalJsonProject.g:587:1: ruleJsonEntry : ( ( rule__JsonEntry__Group__0 ) ) ;
    public final void ruleJsonEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:591:2: ( ( ( rule__JsonEntry__Group__0 ) ) )
            // InternalJsonProject.g:592:2: ( ( rule__JsonEntry__Group__0 ) )
            {
            // InternalJsonProject.g:592:2: ( ( rule__JsonEntry__Group__0 ) )
            // InternalJsonProject.g:593:3: ( rule__JsonEntry__Group__0 )
            {
             before(grammarAccess.getJsonEntryAccess().getGroup()); 
            // InternalJsonProject.g:594:3: ( rule__JsonEntry__Group__0 )
            // InternalJsonProject.g:594:4: rule__JsonEntry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JsonEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJsonEntryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJsonEntry"


    // $ANTLR start "ruleBoolean"
    // InternalJsonProject.g:603:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:607:1: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalJsonProject.g:608:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalJsonProject.g:608:2: ( ( rule__Boolean__Alternatives ) )
            // InternalJsonProject.g:609:3: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalJsonProject.g:610:3: ( rule__Boolean__Alternatives )
            // InternalJsonProject.g:610:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalJsonProject.g:618:1: rule__Operation__Alternatives : ( ( ruleInsert ) | ( ruleModify ) | ( ruleSum ) | ( ruleRemove ) | ( ruleMult ) | ( ruleSelect ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:622:1: ( ( ruleInsert ) | ( ruleModify ) | ( ruleSum ) | ( ruleRemove ) | ( ruleMult ) | ( ruleSelect ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case 22:
                {
                alt2=4;
                }
                break;
            case 23:
                {
                alt2=5;
                }
                break;
            case 24:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalJsonProject.g:623:2: ( ruleInsert )
                    {
                    // InternalJsonProject.g:623:2: ( ruleInsert )
                    // InternalJsonProject.g:624:3: ruleInsert
                    {
                     before(grammarAccess.getOperationAccess().getInsertParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInsert();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getInsertParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonProject.g:629:2: ( ruleModify )
                    {
                    // InternalJsonProject.g:629:2: ( ruleModify )
                    // InternalJsonProject.g:630:3: ruleModify
                    {
                     before(grammarAccess.getOperationAccess().getModifyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleModify();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getModifyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonProject.g:635:2: ( ruleSum )
                    {
                    // InternalJsonProject.g:635:2: ( ruleSum )
                    // InternalJsonProject.g:636:3: ruleSum
                    {
                     before(grammarAccess.getOperationAccess().getSumParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSum();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getSumParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJsonProject.g:641:2: ( ruleRemove )
                    {
                    // InternalJsonProject.g:641:2: ( ruleRemove )
                    // InternalJsonProject.g:642:3: ruleRemove
                    {
                     before(grammarAccess.getOperationAccess().getRemoveParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRemove();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getRemoveParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJsonProject.g:647:2: ( ruleMult )
                    {
                    // InternalJsonProject.g:647:2: ( ruleMult )
                    // InternalJsonProject.g:648:3: ruleMult
                    {
                     before(grammarAccess.getOperationAccess().getMultParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMult();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getMultParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalJsonProject.g:653:2: ( ruleSelect )
                    {
                    // InternalJsonProject.g:653:2: ( ruleSelect )
                    // InternalJsonProject.g:654:3: ruleSelect
                    {
                     before(grammarAccess.getOperationAccess().getSelectParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleSelect();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getSelectParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__Path__Alternatives_1"
    // InternalJsonProject.g:663:1: rule__Path__Alternatives_1 : ( ( ( rule__Path__ValuesAssignment_1_0 ) ) | ( RULE_GOBACK ) | ( RULE_ROOT ) );
    public final void rule__Path__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:667:1: ( ( ( rule__Path__ValuesAssignment_1_0 ) ) | ( RULE_GOBACK ) | ( RULE_ROOT ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case RULE_GOBACK:
                {
                alt3=2;
                }
                break;
            case RULE_ROOT:
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
                    // InternalJsonProject.g:668:2: ( ( rule__Path__ValuesAssignment_1_0 ) )
                    {
                    // InternalJsonProject.g:668:2: ( ( rule__Path__ValuesAssignment_1_0 ) )
                    // InternalJsonProject.g:669:3: ( rule__Path__ValuesAssignment_1_0 )
                    {
                     before(grammarAccess.getPathAccess().getValuesAssignment_1_0()); 
                    // InternalJsonProject.g:670:3: ( rule__Path__ValuesAssignment_1_0 )
                    // InternalJsonProject.g:670:4: rule__Path__ValuesAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Path__ValuesAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPathAccess().getValuesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonProject.g:674:2: ( RULE_GOBACK )
                    {
                    // InternalJsonProject.g:674:2: ( RULE_GOBACK )
                    // InternalJsonProject.g:675:3: RULE_GOBACK
                    {
                     before(grammarAccess.getPathAccess().getGOBACKTerminalRuleCall_1_1()); 
                    match(input,RULE_GOBACK,FOLLOW_2); 
                     after(grammarAccess.getPathAccess().getGOBACKTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonProject.g:680:2: ( RULE_ROOT )
                    {
                    // InternalJsonProject.g:680:2: ( RULE_ROOT )
                    // InternalJsonProject.g:681:3: RULE_ROOT
                    {
                     before(grammarAccess.getPathAccess().getROOTTerminalRuleCall_1_2()); 
                    match(input,RULE_ROOT,FOLLOW_2); 
                     after(grammarAccess.getPathAccess().getROOTTerminalRuleCall_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Alternatives_1"


    // $ANTLR start "rule__Path__Alternatives_2_1"
    // InternalJsonProject.g:690:1: rule__Path__Alternatives_2_1 : ( ( ( rule__Path__ValuesAssignment_2_1_0 ) ) | ( RULE_GOBACK ) );
    public final void rule__Path__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:694:1: ( ( ( rule__Path__ValuesAssignment_2_1_0 ) ) | ( RULE_GOBACK ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_GOBACK) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJsonProject.g:695:2: ( ( rule__Path__ValuesAssignment_2_1_0 ) )
                    {
                    // InternalJsonProject.g:695:2: ( ( rule__Path__ValuesAssignment_2_1_0 ) )
                    // InternalJsonProject.g:696:3: ( rule__Path__ValuesAssignment_2_1_0 )
                    {
                     before(grammarAccess.getPathAccess().getValuesAssignment_2_1_0()); 
                    // InternalJsonProject.g:697:3: ( rule__Path__ValuesAssignment_2_1_0 )
                    // InternalJsonProject.g:697:4: rule__Path__ValuesAssignment_2_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Path__ValuesAssignment_2_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPathAccess().getValuesAssignment_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonProject.g:701:2: ( RULE_GOBACK )
                    {
                    // InternalJsonProject.g:701:2: ( RULE_GOBACK )
                    // InternalJsonProject.g:702:3: RULE_GOBACK
                    {
                     before(grammarAccess.getPathAccess().getGOBACKTerminalRuleCall_2_1_1()); 
                    match(input,RULE_GOBACK,FOLLOW_2); 
                     after(grammarAccess.getPathAccess().getGOBACKTerminalRuleCall_2_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Alternatives_2_1"


    // $ANTLR start "rule__Final__Alternatives"
    // InternalJsonProject.g:711:1: rule__Final__Alternatives : ( ( rulePrint ) | ( ruleStore ) );
    public final void rule__Final__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:715:1: ( ( rulePrint ) | ( ruleStore ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalJsonProject.g:716:2: ( rulePrint )
                    {
                    // InternalJsonProject.g:716:2: ( rulePrint )
                    // InternalJsonProject.g:717:3: rulePrint
                    {
                     before(grammarAccess.getFinalAccess().getPrintParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrint();

                    state._fsp--;

                     after(grammarAccess.getFinalAccess().getPrintParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonProject.g:722:2: ( ruleStore )
                    {
                    // InternalJsonProject.g:722:2: ( ruleStore )
                    // InternalJsonProject.g:723:3: ruleStore
                    {
                     before(grammarAccess.getFinalAccess().getStoreParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStore();

                    state._fsp--;

                     after(grammarAccess.getFinalAccess().getStoreParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Alternatives"


    // $ANTLR start "rule__JsonObject__Alternatives"
    // InternalJsonProject.g:732:1: rule__JsonObject__Alternatives : ( ( ruleJsonEntries ) | ( ruleJsonPrimitive ) );
    public final void rule__JsonObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:736:1: ( ( ruleJsonEntries ) | ( ruleJsonPrimitive ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_INT && LA6_0<=RULE_STRING)||(LA6_0>=15 && LA6_0<=16)||LA6_0==27) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalJsonProject.g:737:2: ( ruleJsonEntries )
                    {
                    // InternalJsonProject.g:737:2: ( ruleJsonEntries )
                    // InternalJsonProject.g:738:3: ruleJsonEntries
                    {
                     before(grammarAccess.getJsonObjectAccess().getJsonEntriesParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleJsonEntries();

                    state._fsp--;

                     after(grammarAccess.getJsonObjectAccess().getJsonEntriesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonProject.g:743:2: ( ruleJsonPrimitive )
                    {
                    // InternalJsonProject.g:743:2: ( ruleJsonPrimitive )
                    // InternalJsonProject.g:744:3: ruleJsonPrimitive
                    {
                     before(grammarAccess.getJsonObjectAccess().getJsonPrimitiveParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJsonPrimitive();

                    state._fsp--;

                     after(grammarAccess.getJsonObjectAccess().getJsonPrimitiveParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonObject__Alternatives"


    // $ANTLR start "rule__JsonPrimitive__Alternatives"
    // InternalJsonProject.g:753:1: rule__JsonPrimitive__Alternatives : ( ( ruleStringObject ) | ( ruleBooleanObject ) | ( ( rule__JsonPrimitive__Group_2__0 ) ) | ( ruleArrayObject ) | ( ( rule__JsonPrimitive__Group_4__0 ) ) );
    public final void rule__JsonPrimitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:757:1: ( ( ruleStringObject ) | ( ruleBooleanObject ) | ( ( rule__JsonPrimitive__Group_2__0 ) ) | ( ruleArrayObject ) | ( ( rule__JsonPrimitive__Group_4__0 ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case 15:
            case 16:
                {
                alt7=2;
                }
                break;
            case RULE_NULL:
                {
                alt7=3;
                }
                break;
            case 27:
                {
                alt7=4;
                }
                break;
            case RULE_INT:
            case RULE_DOUBLE:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalJsonProject.g:758:2: ( ruleStringObject )
                    {
                    // InternalJsonProject.g:758:2: ( ruleStringObject )
                    // InternalJsonProject.g:759:3: ruleStringObject
                    {
                     before(grammarAccess.getJsonPrimitiveAccess().getStringObjectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringObject();

                    state._fsp--;

                     after(grammarAccess.getJsonPrimitiveAccess().getStringObjectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonProject.g:764:2: ( ruleBooleanObject )
                    {
                    // InternalJsonProject.g:764:2: ( ruleBooleanObject )
                    // InternalJsonProject.g:765:3: ruleBooleanObject
                    {
                     before(grammarAccess.getJsonPrimitiveAccess().getBooleanObjectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanObject();

                    state._fsp--;

                     after(grammarAccess.getJsonPrimitiveAccess().getBooleanObjectParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonProject.g:770:2: ( ( rule__JsonPrimitive__Group_2__0 ) )
                    {
                    // InternalJsonProject.g:770:2: ( ( rule__JsonPrimitive__Group_2__0 ) )
                    // InternalJsonProject.g:771:3: ( rule__JsonPrimitive__Group_2__0 )
                    {
                     before(grammarAccess.getJsonPrimitiveAccess().getGroup_2()); 
                    // InternalJsonProject.g:772:3: ( rule__JsonPrimitive__Group_2__0 )
                    // InternalJsonProject.g:772:4: rule__JsonPrimitive__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JsonPrimitive__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonPrimitiveAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJsonProject.g:776:2: ( ruleArrayObject )
                    {
                    // InternalJsonProject.g:776:2: ( ruleArrayObject )
                    // InternalJsonProject.g:777:3: ruleArrayObject
                    {
                     before(grammarAccess.getJsonPrimitiveAccess().getArrayObjectParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleArrayObject();

                    state._fsp--;

                     after(grammarAccess.getJsonPrimitiveAccess().getArrayObjectParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJsonProject.g:782:2: ( ( rule__JsonPrimitive__Group_4__0 ) )
                    {
                    // InternalJsonProject.g:782:2: ( ( rule__JsonPrimitive__Group_4__0 ) )
                    // InternalJsonProject.g:783:3: ( rule__JsonPrimitive__Group_4__0 )
                    {
                     before(grammarAccess.getJsonPrimitiveAccess().getGroup_4()); 
                    // InternalJsonProject.g:784:3: ( rule__JsonPrimitive__Group_4__0 )
                    // InternalJsonProject.g:784:4: rule__JsonPrimitive__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JsonPrimitive__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getJsonPrimitiveAccess().getGroup_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPrimitive__Alternatives"


    // $ANTLR start "rule__NumberObject__Alternatives"
    // InternalJsonProject.g:792:1: rule__NumberObject__Alternatives : ( ( RULE_INT ) | ( RULE_DOUBLE ) );
    public final void rule__NumberObject__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:796:1: ( ( RULE_INT ) | ( RULE_DOUBLE ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_DOUBLE) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalJsonProject.g:797:2: ( RULE_INT )
                    {
                    // InternalJsonProject.g:797:2: ( RULE_INT )
                    // InternalJsonProject.g:798:3: RULE_INT
                    {
                     before(grammarAccess.getNumberObjectAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getNumberObjectAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonProject.g:803:2: ( RULE_DOUBLE )
                    {
                    // InternalJsonProject.g:803:2: ( RULE_DOUBLE )
                    // InternalJsonProject.g:804:3: RULE_DOUBLE
                    {
                     before(grammarAccess.getNumberObjectAccess().getDOUBLETerminalRuleCall_1()); 
                    match(input,RULE_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getNumberObjectAccess().getDOUBLETerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberObject__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalJsonProject.g:813:1: rule__Boolean__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:817:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            else if ( (LA9_0==16) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalJsonProject.g:818:2: ( ( 'true' ) )
                    {
                    // InternalJsonProject.g:818:2: ( ( 'true' ) )
                    // InternalJsonProject.g:819:3: ( 'true' )
                    {
                     before(grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // InternalJsonProject.g:820:3: ( 'true' )
                    // InternalJsonProject.g:820:4: 'true'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonProject.g:824:2: ( ( 'false' ) )
                    {
                    // InternalJsonProject.g:824:2: ( ( 'false' ) )
                    // InternalJsonProject.g:825:3: ( 'false' )
                    {
                     before(grammarAccess.getBooleanAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // InternalJsonProject.g:826:3: ( 'false' )
                    // InternalJsonProject.g:826:4: 'false'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanAccess().getFALSEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__JsonCommand__Group__0"
    // InternalJsonProject.g:834:1: rule__JsonCommand__Group__0 : rule__JsonCommand__Group__0__Impl rule__JsonCommand__Group__1 ;
    public final void rule__JsonCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:838:1: ( rule__JsonCommand__Group__0__Impl rule__JsonCommand__Group__1 )
            // InternalJsonProject.g:839:2: rule__JsonCommand__Group__0__Impl rule__JsonCommand__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__JsonCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonCommand__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonCommand__Group__0"


    // $ANTLR start "rule__JsonCommand__Group__0__Impl"
    // InternalJsonProject.g:846:1: rule__JsonCommand__Group__0__Impl : ( ( rule__JsonCommand__InitAssignment_0 ) ) ;
    public final void rule__JsonCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:850:1: ( ( ( rule__JsonCommand__InitAssignment_0 ) ) )
            // InternalJsonProject.g:851:1: ( ( rule__JsonCommand__InitAssignment_0 ) )
            {
            // InternalJsonProject.g:851:1: ( ( rule__JsonCommand__InitAssignment_0 ) )
            // InternalJsonProject.g:852:2: ( rule__JsonCommand__InitAssignment_0 )
            {
             before(grammarAccess.getJsonCommandAccess().getInitAssignment_0()); 
            // InternalJsonProject.g:853:2: ( rule__JsonCommand__InitAssignment_0 )
            // InternalJsonProject.g:853:3: rule__JsonCommand__InitAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__JsonCommand__InitAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJsonCommandAccess().getInitAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonCommand__Group__0__Impl"


    // $ANTLR start "rule__JsonCommand__Group__1"
    // InternalJsonProject.g:861:1: rule__JsonCommand__Group__1 : rule__JsonCommand__Group__1__Impl rule__JsonCommand__Group__2 ;
    public final void rule__JsonCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:865:1: ( rule__JsonCommand__Group__1__Impl rule__JsonCommand__Group__2 )
            // InternalJsonProject.g:866:2: rule__JsonCommand__Group__1__Impl rule__JsonCommand__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__JsonCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonCommand__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonCommand__Group__1"


    // $ANTLR start "rule__JsonCommand__Group__1__Impl"
    // InternalJsonProject.g:873:1: rule__JsonCommand__Group__1__Impl : ( ( rule__JsonCommand__OperationsAssignment_1 )* ) ;
    public final void rule__JsonCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:877:1: ( ( ( rule__JsonCommand__OperationsAssignment_1 )* ) )
            // InternalJsonProject.g:878:1: ( ( rule__JsonCommand__OperationsAssignment_1 )* )
            {
            // InternalJsonProject.g:878:1: ( ( rule__JsonCommand__OperationsAssignment_1 )* )
            // InternalJsonProject.g:879:2: ( rule__JsonCommand__OperationsAssignment_1 )*
            {
             before(grammarAccess.getJsonCommandAccess().getOperationsAssignment_1()); 
            // InternalJsonProject.g:880:2: ( rule__JsonCommand__OperationsAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18||(LA10_0>=20 && LA10_0<=24)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalJsonProject.g:880:3: rule__JsonCommand__OperationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__JsonCommand__OperationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getJsonCommandAccess().getOperationsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonCommand__Group__1__Impl"


    // $ANTLR start "rule__JsonCommand__Group__2"
    // InternalJsonProject.g:888:1: rule__JsonCommand__Group__2 : rule__JsonCommand__Group__2__Impl ;
    public final void rule__JsonCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:892:1: ( rule__JsonCommand__Group__2__Impl )
            // InternalJsonProject.g:893:2: rule__JsonCommand__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonCommand__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonCommand__Group__2"


    // $ANTLR start "rule__JsonCommand__Group__2__Impl"
    // InternalJsonProject.g:899:1: rule__JsonCommand__Group__2__Impl : ( ( rule__JsonCommand__FinalAssignment_2 ) ) ;
    public final void rule__JsonCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:903:1: ( ( ( rule__JsonCommand__FinalAssignment_2 ) ) )
            // InternalJsonProject.g:904:1: ( ( rule__JsonCommand__FinalAssignment_2 ) )
            {
            // InternalJsonProject.g:904:1: ( ( rule__JsonCommand__FinalAssignment_2 ) )
            // InternalJsonProject.g:905:2: ( rule__JsonCommand__FinalAssignment_2 )
            {
             before(grammarAccess.getJsonCommandAccess().getFinalAssignment_2()); 
            // InternalJsonProject.g:906:2: ( rule__JsonCommand__FinalAssignment_2 )
            // InternalJsonProject.g:906:3: rule__JsonCommand__FinalAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__JsonCommand__FinalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJsonCommandAccess().getFinalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonCommand__Group__2__Impl"


    // $ANTLR start "rule__Initialisation__Group__0"
    // InternalJsonProject.g:915:1: rule__Initialisation__Group__0 : rule__Initialisation__Group__0__Impl rule__Initialisation__Group__1 ;
    public final void rule__Initialisation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:919:1: ( rule__Initialisation__Group__0__Impl rule__Initialisation__Group__1 )
            // InternalJsonProject.g:920:2: rule__Initialisation__Group__0__Impl rule__Initialisation__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Initialisation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initialisation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initialisation__Group__0"


    // $ANTLR start "rule__Initialisation__Group__0__Impl"
    // InternalJsonProject.g:927:1: rule__Initialisation__Group__0__Impl : ( 'load' ) ;
    public final void rule__Initialisation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:931:1: ( ( 'load' ) )
            // InternalJsonProject.g:932:1: ( 'load' )
            {
            // InternalJsonProject.g:932:1: ( 'load' )
            // InternalJsonProject.g:933:2: 'load'
            {
             before(grammarAccess.getInitialisationAccess().getLoadKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInitialisationAccess().getLoadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initialisation__Group__0__Impl"


    // $ANTLR start "rule__Initialisation__Group__1"
    // InternalJsonProject.g:942:1: rule__Initialisation__Group__1 : rule__Initialisation__Group__1__Impl ;
    public final void rule__Initialisation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:946:1: ( rule__Initialisation__Group__1__Impl )
            // InternalJsonProject.g:947:2: rule__Initialisation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Initialisation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initialisation__Group__1"


    // $ANTLR start "rule__Initialisation__Group__1__Impl"
    // InternalJsonProject.g:953:1: rule__Initialisation__Group__1__Impl : ( ( rule__Initialisation__FilePathAssignment_1 ) ) ;
    public final void rule__Initialisation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:957:1: ( ( ( rule__Initialisation__FilePathAssignment_1 ) ) )
            // InternalJsonProject.g:958:1: ( ( rule__Initialisation__FilePathAssignment_1 ) )
            {
            // InternalJsonProject.g:958:1: ( ( rule__Initialisation__FilePathAssignment_1 ) )
            // InternalJsonProject.g:959:2: ( rule__Initialisation__FilePathAssignment_1 )
            {
             before(grammarAccess.getInitialisationAccess().getFilePathAssignment_1()); 
            // InternalJsonProject.g:960:2: ( rule__Initialisation__FilePathAssignment_1 )
            // InternalJsonProject.g:960:3: rule__Initialisation__FilePathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Initialisation__FilePathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialisationAccess().getFilePathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initialisation__Group__1__Impl"


    // $ANTLR start "rule__Insert__Group__0"
    // InternalJsonProject.g:969:1: rule__Insert__Group__0 : rule__Insert__Group__0__Impl rule__Insert__Group__1 ;
    public final void rule__Insert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:973:1: ( rule__Insert__Group__0__Impl rule__Insert__Group__1 )
            // InternalJsonProject.g:974:2: rule__Insert__Group__0__Impl rule__Insert__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Insert__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__0"


    // $ANTLR start "rule__Insert__Group__0__Impl"
    // InternalJsonProject.g:981:1: rule__Insert__Group__0__Impl : ( 'insert' ) ;
    public final void rule__Insert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:985:1: ( ( 'insert' ) )
            // InternalJsonProject.g:986:1: ( 'insert' )
            {
            // InternalJsonProject.g:986:1: ( 'insert' )
            // InternalJsonProject.g:987:2: 'insert'
            {
             before(grammarAccess.getInsertAccess().getInsertKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getInsertKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__0__Impl"


    // $ANTLR start "rule__Insert__Group__1"
    // InternalJsonProject.g:996:1: rule__Insert__Group__1 : rule__Insert__Group__1__Impl rule__Insert__Group__2 ;
    public final void rule__Insert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1000:1: ( rule__Insert__Group__1__Impl rule__Insert__Group__2 )
            // InternalJsonProject.g:1001:2: rule__Insert__Group__1__Impl rule__Insert__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Insert__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__1"


    // $ANTLR start "rule__Insert__Group__1__Impl"
    // InternalJsonProject.g:1008:1: rule__Insert__Group__1__Impl : ( ( rule__Insert__JsonObjectAssignment_1 ) ) ;
    public final void rule__Insert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1012:1: ( ( ( rule__Insert__JsonObjectAssignment_1 ) ) )
            // InternalJsonProject.g:1013:1: ( ( rule__Insert__JsonObjectAssignment_1 ) )
            {
            // InternalJsonProject.g:1013:1: ( ( rule__Insert__JsonObjectAssignment_1 ) )
            // InternalJsonProject.g:1014:2: ( rule__Insert__JsonObjectAssignment_1 )
            {
             before(grammarAccess.getInsertAccess().getJsonObjectAssignment_1()); 
            // InternalJsonProject.g:1015:2: ( rule__Insert__JsonObjectAssignment_1 )
            // InternalJsonProject.g:1015:3: rule__Insert__JsonObjectAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Insert__JsonObjectAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getJsonObjectAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__1__Impl"


    // $ANTLR start "rule__Insert__Group__2"
    // InternalJsonProject.g:1023:1: rule__Insert__Group__2 : rule__Insert__Group__2__Impl ;
    public final void rule__Insert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1027:1: ( rule__Insert__Group__2__Impl )
            // InternalJsonProject.g:1028:2: rule__Insert__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__2"


    // $ANTLR start "rule__Insert__Group__2__Impl"
    // InternalJsonProject.g:1034:1: rule__Insert__Group__2__Impl : ( ( rule__Insert__PathAssignment_2 )? ) ;
    public final void rule__Insert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1038:1: ( ( ( rule__Insert__PathAssignment_2 )? ) )
            // InternalJsonProject.g:1039:1: ( ( rule__Insert__PathAssignment_2 )? )
            {
            // InternalJsonProject.g:1039:1: ( ( rule__Insert__PathAssignment_2 )? )
            // InternalJsonProject.g:1040:2: ( rule__Insert__PathAssignment_2 )?
            {
             before(grammarAccess.getInsertAccess().getPathAssignment_2()); 
            // InternalJsonProject.g:1041:2: ( rule__Insert__PathAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_GOBACK && LA11_0<=RULE_ROOT)||LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJsonProject.g:1041:3: rule__Insert__PathAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Insert__PathAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInsertAccess().getPathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__Group__2__Impl"


    // $ANTLR start "rule__Path__Group__0"
    // InternalJsonProject.g:1050:1: rule__Path__Group__0 : rule__Path__Group__0__Impl rule__Path__Group__1 ;
    public final void rule__Path__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1054:1: ( rule__Path__Group__0__Impl rule__Path__Group__1 )
            // InternalJsonProject.g:1055:2: rule__Path__Group__0__Impl rule__Path__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Path__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Path__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__0"


    // $ANTLR start "rule__Path__Group__0__Impl"
    // InternalJsonProject.g:1062:1: rule__Path__Group__0__Impl : ( () ) ;
    public final void rule__Path__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1066:1: ( ( () ) )
            // InternalJsonProject.g:1067:1: ( () )
            {
            // InternalJsonProject.g:1067:1: ( () )
            // InternalJsonProject.g:1068:2: ()
            {
             before(grammarAccess.getPathAccess().getPathAction_0()); 
            // InternalJsonProject.g:1069:2: ()
            // InternalJsonProject.g:1069:3: 
            {
            }

             after(grammarAccess.getPathAccess().getPathAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__0__Impl"


    // $ANTLR start "rule__Path__Group__1"
    // InternalJsonProject.g:1077:1: rule__Path__Group__1 : rule__Path__Group__1__Impl rule__Path__Group__2 ;
    public final void rule__Path__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1081:1: ( rule__Path__Group__1__Impl rule__Path__Group__2 )
            // InternalJsonProject.g:1082:2: rule__Path__Group__1__Impl rule__Path__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Path__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Path__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__1"


    // $ANTLR start "rule__Path__Group__1__Impl"
    // InternalJsonProject.g:1089:1: rule__Path__Group__1__Impl : ( ( rule__Path__Alternatives_1 ) ) ;
    public final void rule__Path__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1093:1: ( ( ( rule__Path__Alternatives_1 ) ) )
            // InternalJsonProject.g:1094:1: ( ( rule__Path__Alternatives_1 ) )
            {
            // InternalJsonProject.g:1094:1: ( ( rule__Path__Alternatives_1 ) )
            // InternalJsonProject.g:1095:2: ( rule__Path__Alternatives_1 )
            {
             before(grammarAccess.getPathAccess().getAlternatives_1()); 
            // InternalJsonProject.g:1096:2: ( rule__Path__Alternatives_1 )
            // InternalJsonProject.g:1096:3: rule__Path__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Path__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__1__Impl"


    // $ANTLR start "rule__Path__Group__2"
    // InternalJsonProject.g:1104:1: rule__Path__Group__2 : rule__Path__Group__2__Impl ;
    public final void rule__Path__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1108:1: ( rule__Path__Group__2__Impl )
            // InternalJsonProject.g:1109:2: rule__Path__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Path__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__2"


    // $ANTLR start "rule__Path__Group__2__Impl"
    // InternalJsonProject.g:1115:1: rule__Path__Group__2__Impl : ( ( rule__Path__Group_2__0 )* ) ;
    public final void rule__Path__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1119:1: ( ( ( rule__Path__Group_2__0 )* ) )
            // InternalJsonProject.g:1120:1: ( ( rule__Path__Group_2__0 )* )
            {
            // InternalJsonProject.g:1120:1: ( ( rule__Path__Group_2__0 )* )
            // InternalJsonProject.g:1121:2: ( rule__Path__Group_2__0 )*
            {
             before(grammarAccess.getPathAccess().getGroup_2()); 
            // InternalJsonProject.g:1122:2: ( rule__Path__Group_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalJsonProject.g:1122:3: rule__Path__Group_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Path__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPathAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group__2__Impl"


    // $ANTLR start "rule__Path__Group_2__0"
    // InternalJsonProject.g:1131:1: rule__Path__Group_2__0 : rule__Path__Group_2__0__Impl rule__Path__Group_2__1 ;
    public final void rule__Path__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1135:1: ( rule__Path__Group_2__0__Impl rule__Path__Group_2__1 )
            // InternalJsonProject.g:1136:2: rule__Path__Group_2__0__Impl rule__Path__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Path__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Path__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_2__0"


    // $ANTLR start "rule__Path__Group_2__0__Impl"
    // InternalJsonProject.g:1143:1: rule__Path__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Path__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1147:1: ( ( '.' ) )
            // InternalJsonProject.g:1148:1: ( '.' )
            {
            // InternalJsonProject.g:1148:1: ( '.' )
            // InternalJsonProject.g:1149:2: '.'
            {
             before(grammarAccess.getPathAccess().getFullStopKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPathAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_2__0__Impl"


    // $ANTLR start "rule__Path__Group_2__1"
    // InternalJsonProject.g:1158:1: rule__Path__Group_2__1 : rule__Path__Group_2__1__Impl ;
    public final void rule__Path__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1162:1: ( rule__Path__Group_2__1__Impl )
            // InternalJsonProject.g:1163:2: rule__Path__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Path__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_2__1"


    // $ANTLR start "rule__Path__Group_2__1__Impl"
    // InternalJsonProject.g:1169:1: rule__Path__Group_2__1__Impl : ( ( rule__Path__Alternatives_2_1 ) ) ;
    public final void rule__Path__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1173:1: ( ( ( rule__Path__Alternatives_2_1 ) ) )
            // InternalJsonProject.g:1174:1: ( ( rule__Path__Alternatives_2_1 ) )
            {
            // InternalJsonProject.g:1174:1: ( ( rule__Path__Alternatives_2_1 ) )
            // InternalJsonProject.g:1175:2: ( rule__Path__Alternatives_2_1 )
            {
             before(grammarAccess.getPathAccess().getAlternatives_2_1()); 
            // InternalJsonProject.g:1176:2: ( rule__Path__Alternatives_2_1 )
            // InternalJsonProject.g:1176:3: rule__Path__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Path__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPathAccess().getAlternatives_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__Group_2__1__Impl"


    // $ANTLR start "rule__Modify__Group__0"
    // InternalJsonProject.g:1185:1: rule__Modify__Group__0 : rule__Modify__Group__0__Impl rule__Modify__Group__1 ;
    public final void rule__Modify__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1189:1: ( rule__Modify__Group__0__Impl rule__Modify__Group__1 )
            // InternalJsonProject.g:1190:2: rule__Modify__Group__0__Impl rule__Modify__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Modify__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modify__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modify__Group__0"


    // $ANTLR start "rule__Modify__Group__0__Impl"
    // InternalJsonProject.g:1197:1: rule__Modify__Group__0__Impl : ( 'modify' ) ;
    public final void rule__Modify__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1201:1: ( ( 'modify' ) )
            // InternalJsonProject.g:1202:1: ( 'modify' )
            {
            // InternalJsonProject.g:1202:1: ( 'modify' )
            // InternalJsonProject.g:1203:2: 'modify'
            {
             before(grammarAccess.getModifyAccess().getModifyKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getModifyAccess().getModifyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modify__Group__0__Impl"


    // $ANTLR start "rule__Modify__Group__1"
    // InternalJsonProject.g:1212:1: rule__Modify__Group__1 : rule__Modify__Group__1__Impl rule__Modify__Group__2 ;
    public final void rule__Modify__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1216:1: ( rule__Modify__Group__1__Impl rule__Modify__Group__2 )
            // InternalJsonProject.g:1217:2: rule__Modify__Group__1__Impl rule__Modify__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Modify__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modify__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modify__Group__1"


    // $ANTLR start "rule__Modify__Group__1__Impl"
    // InternalJsonProject.g:1224:1: rule__Modify__Group__1__Impl : ( ( rule__Modify__PathAssignment_1 )? ) ;
    public final void rule__Modify__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1228:1: ( ( ( rule__Modify__PathAssignment_1 )? ) )
            // InternalJsonProject.g:1229:1: ( ( rule__Modify__PathAssignment_1 )? )
            {
            // InternalJsonProject.g:1229:1: ( ( rule__Modify__PathAssignment_1 )? )
            // InternalJsonProject.g:1230:2: ( rule__Modify__PathAssignment_1 )?
            {
             before(grammarAccess.getModifyAccess().getPathAssignment_1()); 
            // InternalJsonProject.g:1231:2: ( rule__Modify__PathAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_GOBACK && LA13_0<=RULE_ROOT)||LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalJsonProject.g:1231:3: rule__Modify__PathAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Modify__PathAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModifyAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modify__Group__1__Impl"


    // $ANTLR start "rule__Modify__Group__2"
    // InternalJsonProject.g:1239:1: rule__Modify__Group__2 : rule__Modify__Group__2__Impl ;
    public final void rule__Modify__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1243:1: ( rule__Modify__Group__2__Impl )
            // InternalJsonProject.g:1244:2: rule__Modify__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modify__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modify__Group__2"


    // $ANTLR start "rule__Modify__Group__2__Impl"
    // InternalJsonProject.g:1250:1: rule__Modify__Group__2__Impl : ( ( rule__Modify__JsonObjectAssignment_2 ) ) ;
    public final void rule__Modify__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1254:1: ( ( ( rule__Modify__JsonObjectAssignment_2 ) ) )
            // InternalJsonProject.g:1255:1: ( ( rule__Modify__JsonObjectAssignment_2 ) )
            {
            // InternalJsonProject.g:1255:1: ( ( rule__Modify__JsonObjectAssignment_2 ) )
            // InternalJsonProject.g:1256:2: ( rule__Modify__JsonObjectAssignment_2 )
            {
             before(grammarAccess.getModifyAccess().getJsonObjectAssignment_2()); 
            // InternalJsonProject.g:1257:2: ( rule__Modify__JsonObjectAssignment_2 )
            // InternalJsonProject.g:1257:3: rule__Modify__JsonObjectAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Modify__JsonObjectAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModifyAccess().getJsonObjectAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modify__Group__2__Impl"


    // $ANTLR start "rule__Sum__Group__0"
    // InternalJsonProject.g:1266:1: rule__Sum__Group__0 : rule__Sum__Group__0__Impl rule__Sum__Group__1 ;
    public final void rule__Sum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1270:1: ( rule__Sum__Group__0__Impl rule__Sum__Group__1 )
            // InternalJsonProject.g:1271:2: rule__Sum__Group__0__Impl rule__Sum__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Sum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__0"


    // $ANTLR start "rule__Sum__Group__0__Impl"
    // InternalJsonProject.g:1278:1: rule__Sum__Group__0__Impl : ( 'sum' ) ;
    public final void rule__Sum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1282:1: ( ( 'sum' ) )
            // InternalJsonProject.g:1283:1: ( 'sum' )
            {
            // InternalJsonProject.g:1283:1: ( 'sum' )
            // InternalJsonProject.g:1284:2: 'sum'
            {
             before(grammarAccess.getSumAccess().getSumKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSumAccess().getSumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__0__Impl"


    // $ANTLR start "rule__Sum__Group__1"
    // InternalJsonProject.g:1293:1: rule__Sum__Group__1 : rule__Sum__Group__1__Impl rule__Sum__Group__2 ;
    public final void rule__Sum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1297:1: ( rule__Sum__Group__1__Impl rule__Sum__Group__2 )
            // InternalJsonProject.g:1298:2: rule__Sum__Group__1__Impl rule__Sum__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Sum__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__1"


    // $ANTLR start "rule__Sum__Group__1__Impl"
    // InternalJsonProject.g:1305:1: rule__Sum__Group__1__Impl : ( ( rule__Sum__PathTOStoreAssignment_1 ) ) ;
    public final void rule__Sum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1309:1: ( ( ( rule__Sum__PathTOStoreAssignment_1 ) ) )
            // InternalJsonProject.g:1310:1: ( ( rule__Sum__PathTOStoreAssignment_1 ) )
            {
            // InternalJsonProject.g:1310:1: ( ( rule__Sum__PathTOStoreAssignment_1 ) )
            // InternalJsonProject.g:1311:2: ( rule__Sum__PathTOStoreAssignment_1 )
            {
             before(grammarAccess.getSumAccess().getPathTOStoreAssignment_1()); 
            // InternalJsonProject.g:1312:2: ( rule__Sum__PathTOStoreAssignment_1 )
            // InternalJsonProject.g:1312:3: rule__Sum__PathTOStoreAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sum__PathTOStoreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getPathTOStoreAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__1__Impl"


    // $ANTLR start "rule__Sum__Group__2"
    // InternalJsonProject.g:1320:1: rule__Sum__Group__2 : rule__Sum__Group__2__Impl ;
    public final void rule__Sum__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1324:1: ( rule__Sum__Group__2__Impl )
            // InternalJsonProject.g:1325:2: rule__Sum__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__2"


    // $ANTLR start "rule__Sum__Group__2__Impl"
    // InternalJsonProject.g:1331:1: rule__Sum__Group__2__Impl : ( ( rule__Sum__PathToAddAssignment_2 ) ) ;
    public final void rule__Sum__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1335:1: ( ( ( rule__Sum__PathToAddAssignment_2 ) ) )
            // InternalJsonProject.g:1336:1: ( ( rule__Sum__PathToAddAssignment_2 ) )
            {
            // InternalJsonProject.g:1336:1: ( ( rule__Sum__PathToAddAssignment_2 ) )
            // InternalJsonProject.g:1337:2: ( rule__Sum__PathToAddAssignment_2 )
            {
             before(grammarAccess.getSumAccess().getPathToAddAssignment_2()); 
            // InternalJsonProject.g:1338:2: ( rule__Sum__PathToAddAssignment_2 )
            // InternalJsonProject.g:1338:3: rule__Sum__PathToAddAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sum__PathToAddAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getPathToAddAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__2__Impl"


    // $ANTLR start "rule__Remove__Group__0"
    // InternalJsonProject.g:1347:1: rule__Remove__Group__0 : rule__Remove__Group__0__Impl rule__Remove__Group__1 ;
    public final void rule__Remove__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1351:1: ( rule__Remove__Group__0__Impl rule__Remove__Group__1 )
            // InternalJsonProject.g:1352:2: rule__Remove__Group__0__Impl rule__Remove__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Remove__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Remove__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__0"


    // $ANTLR start "rule__Remove__Group__0__Impl"
    // InternalJsonProject.g:1359:1: rule__Remove__Group__0__Impl : ( () ) ;
    public final void rule__Remove__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1363:1: ( ( () ) )
            // InternalJsonProject.g:1364:1: ( () )
            {
            // InternalJsonProject.g:1364:1: ( () )
            // InternalJsonProject.g:1365:2: ()
            {
             before(grammarAccess.getRemoveAccess().getRemoveAction_0()); 
            // InternalJsonProject.g:1366:2: ()
            // InternalJsonProject.g:1366:3: 
            {
            }

             after(grammarAccess.getRemoveAccess().getRemoveAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__0__Impl"


    // $ANTLR start "rule__Remove__Group__1"
    // InternalJsonProject.g:1374:1: rule__Remove__Group__1 : rule__Remove__Group__1__Impl rule__Remove__Group__2 ;
    public final void rule__Remove__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1378:1: ( rule__Remove__Group__1__Impl rule__Remove__Group__2 )
            // InternalJsonProject.g:1379:2: rule__Remove__Group__1__Impl rule__Remove__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Remove__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Remove__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__1"


    // $ANTLR start "rule__Remove__Group__1__Impl"
    // InternalJsonProject.g:1386:1: rule__Remove__Group__1__Impl : ( 'remove' ) ;
    public final void rule__Remove__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1390:1: ( ( 'remove' ) )
            // InternalJsonProject.g:1391:1: ( 'remove' )
            {
            // InternalJsonProject.g:1391:1: ( 'remove' )
            // InternalJsonProject.g:1392:2: 'remove'
            {
             before(grammarAccess.getRemoveAccess().getRemoveKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRemoveAccess().getRemoveKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__1__Impl"


    // $ANTLR start "rule__Remove__Group__2"
    // InternalJsonProject.g:1401:1: rule__Remove__Group__2 : rule__Remove__Group__2__Impl ;
    public final void rule__Remove__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1405:1: ( rule__Remove__Group__2__Impl )
            // InternalJsonProject.g:1406:2: rule__Remove__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Remove__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__2"


    // $ANTLR start "rule__Remove__Group__2__Impl"
    // InternalJsonProject.g:1412:1: rule__Remove__Group__2__Impl : ( ( rule__Remove__PathAssignment_2 )? ) ;
    public final void rule__Remove__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1416:1: ( ( ( rule__Remove__PathAssignment_2 )? ) )
            // InternalJsonProject.g:1417:1: ( ( rule__Remove__PathAssignment_2 )? )
            {
            // InternalJsonProject.g:1417:1: ( ( rule__Remove__PathAssignment_2 )? )
            // InternalJsonProject.g:1418:2: ( rule__Remove__PathAssignment_2 )?
            {
             before(grammarAccess.getRemoveAccess().getPathAssignment_2()); 
            // InternalJsonProject.g:1419:2: ( rule__Remove__PathAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_GOBACK && LA14_0<=RULE_ROOT)||LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalJsonProject.g:1419:3: rule__Remove__PathAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Remove__PathAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRemoveAccess().getPathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__2__Impl"


    // $ANTLR start "rule__Mult__Group__0"
    // InternalJsonProject.g:1428:1: rule__Mult__Group__0 : rule__Mult__Group__0__Impl rule__Mult__Group__1 ;
    public final void rule__Mult__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1432:1: ( rule__Mult__Group__0__Impl rule__Mult__Group__1 )
            // InternalJsonProject.g:1433:2: rule__Mult__Group__0__Impl rule__Mult__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Mult__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mult__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mult__Group__0"


    // $ANTLR start "rule__Mult__Group__0__Impl"
    // InternalJsonProject.g:1440:1: rule__Mult__Group__0__Impl : ( 'mult' ) ;
    public final void rule__Mult__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1444:1: ( ( 'mult' ) )
            // InternalJsonProject.g:1445:1: ( 'mult' )
            {
            // InternalJsonProject.g:1445:1: ( 'mult' )
            // InternalJsonProject.g:1446:2: 'mult'
            {
             before(grammarAccess.getMultAccess().getMultKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMultAccess().getMultKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mult__Group__0__Impl"


    // $ANTLR start "rule__Mult__Group__1"
    // InternalJsonProject.g:1455:1: rule__Mult__Group__1 : rule__Mult__Group__1__Impl rule__Mult__Group__2 ;
    public final void rule__Mult__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1459:1: ( rule__Mult__Group__1__Impl rule__Mult__Group__2 )
            // InternalJsonProject.g:1460:2: rule__Mult__Group__1__Impl rule__Mult__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Mult__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mult__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mult__Group__1"


    // $ANTLR start "rule__Mult__Group__1__Impl"
    // InternalJsonProject.g:1467:1: rule__Mult__Group__1__Impl : ( ( rule__Mult__PathTOStoreAssignment_1 ) ) ;
    public final void rule__Mult__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1471:1: ( ( ( rule__Mult__PathTOStoreAssignment_1 ) ) )
            // InternalJsonProject.g:1472:1: ( ( rule__Mult__PathTOStoreAssignment_1 ) )
            {
            // InternalJsonProject.g:1472:1: ( ( rule__Mult__PathTOStoreAssignment_1 ) )
            // InternalJsonProject.g:1473:2: ( rule__Mult__PathTOStoreAssignment_1 )
            {
             before(grammarAccess.getMultAccess().getPathTOStoreAssignment_1()); 
            // InternalJsonProject.g:1474:2: ( rule__Mult__PathTOStoreAssignment_1 )
            // InternalJsonProject.g:1474:3: rule__Mult__PathTOStoreAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mult__PathTOStoreAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultAccess().getPathTOStoreAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mult__Group__1__Impl"


    // $ANTLR start "rule__Mult__Group__2"
    // InternalJsonProject.g:1482:1: rule__Mult__Group__2 : rule__Mult__Group__2__Impl ;
    public final void rule__Mult__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1486:1: ( rule__Mult__Group__2__Impl )
            // InternalJsonProject.g:1487:2: rule__Mult__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mult__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mult__Group__2"


    // $ANTLR start "rule__Mult__Group__2__Impl"
    // InternalJsonProject.g:1493:1: rule__Mult__Group__2__Impl : ( ( rule__Mult__PathToMultAssignment_2 ) ) ;
    public final void rule__Mult__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1497:1: ( ( ( rule__Mult__PathToMultAssignment_2 ) ) )
            // InternalJsonProject.g:1498:1: ( ( rule__Mult__PathToMultAssignment_2 ) )
            {
            // InternalJsonProject.g:1498:1: ( ( rule__Mult__PathToMultAssignment_2 ) )
            // InternalJsonProject.g:1499:2: ( rule__Mult__PathToMultAssignment_2 )
            {
             before(grammarAccess.getMultAccess().getPathToMultAssignment_2()); 
            // InternalJsonProject.g:1500:2: ( rule__Mult__PathToMultAssignment_2 )
            // InternalJsonProject.g:1500:3: rule__Mult__PathToMultAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mult__PathToMultAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultAccess().getPathToMultAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mult__Group__2__Impl"


    // $ANTLR start "rule__Select__Group__0"
    // InternalJsonProject.g:1509:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1513:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalJsonProject.g:1514:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Select__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0"


    // $ANTLR start "rule__Select__Group__0__Impl"
    // InternalJsonProject.g:1521:1: rule__Select__Group__0__Impl : ( 'select' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1525:1: ( ( 'select' ) )
            // InternalJsonProject.g:1526:1: ( 'select' )
            {
            // InternalJsonProject.g:1526:1: ( 'select' )
            // InternalJsonProject.g:1527:2: 'select'
            {
             before(grammarAccess.getSelectAccess().getSelectKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0__Impl"


    // $ANTLR start "rule__Select__Group__1"
    // InternalJsonProject.g:1536:1: rule__Select__Group__1 : rule__Select__Group__1__Impl ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1540:1: ( rule__Select__Group__1__Impl )
            // InternalJsonProject.g:1541:2: rule__Select__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1"


    // $ANTLR start "rule__Select__Group__1__Impl"
    // InternalJsonProject.g:1547:1: rule__Select__Group__1__Impl : ( ( rule__Select__PathAssignment_1 ) ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1551:1: ( ( ( rule__Select__PathAssignment_1 ) ) )
            // InternalJsonProject.g:1552:1: ( ( rule__Select__PathAssignment_1 ) )
            {
            // InternalJsonProject.g:1552:1: ( ( rule__Select__PathAssignment_1 ) )
            // InternalJsonProject.g:1553:2: ( rule__Select__PathAssignment_1 )
            {
             before(grammarAccess.getSelectAccess().getPathAssignment_1()); 
            // InternalJsonProject.g:1554:2: ( rule__Select__PathAssignment_1 )
            // InternalJsonProject.g:1554:3: rule__Select__PathAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__PathAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1__Impl"


    // $ANTLR start "rule__Store__Group__0"
    // InternalJsonProject.g:1563:1: rule__Store__Group__0 : rule__Store__Group__0__Impl rule__Store__Group__1 ;
    public final void rule__Store__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1567:1: ( rule__Store__Group__0__Impl rule__Store__Group__1 )
            // InternalJsonProject.g:1568:2: rule__Store__Group__0__Impl rule__Store__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Store__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__0"


    // $ANTLR start "rule__Store__Group__0__Impl"
    // InternalJsonProject.g:1575:1: rule__Store__Group__0__Impl : ( 'store' ) ;
    public final void rule__Store__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1579:1: ( ( 'store' ) )
            // InternalJsonProject.g:1580:1: ( 'store' )
            {
            // InternalJsonProject.g:1580:1: ( 'store' )
            // InternalJsonProject.g:1581:2: 'store'
            {
             before(grammarAccess.getStoreAccess().getStoreKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getStoreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__0__Impl"


    // $ANTLR start "rule__Store__Group__1"
    // InternalJsonProject.g:1590:1: rule__Store__Group__1 : rule__Store__Group__1__Impl rule__Store__Group__2 ;
    public final void rule__Store__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1594:1: ( rule__Store__Group__1__Impl rule__Store__Group__2 )
            // InternalJsonProject.g:1595:2: rule__Store__Group__1__Impl rule__Store__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Store__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__1"


    // $ANTLR start "rule__Store__Group__1__Impl"
    // InternalJsonProject.g:1602:1: rule__Store__Group__1__Impl : ( ( rule__Store__PathAssignment_1 )? ) ;
    public final void rule__Store__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1606:1: ( ( ( rule__Store__PathAssignment_1 )? ) )
            // InternalJsonProject.g:1607:1: ( ( rule__Store__PathAssignment_1 )? )
            {
            // InternalJsonProject.g:1607:1: ( ( rule__Store__PathAssignment_1 )? )
            // InternalJsonProject.g:1608:2: ( rule__Store__PathAssignment_1 )?
            {
             before(grammarAccess.getStoreAccess().getPathAssignment_1()); 
            // InternalJsonProject.g:1609:2: ( rule__Store__PathAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_GOBACK && LA15_0<=RULE_ROOT)||LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalJsonProject.g:1609:3: rule__Store__PathAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Store__PathAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStoreAccess().getPathAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__1__Impl"


    // $ANTLR start "rule__Store__Group__2"
    // InternalJsonProject.g:1617:1: rule__Store__Group__2 : rule__Store__Group__2__Impl ;
    public final void rule__Store__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1621:1: ( rule__Store__Group__2__Impl )
            // InternalJsonProject.g:1622:2: rule__Store__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__2"


    // $ANTLR start "rule__Store__Group__2__Impl"
    // InternalJsonProject.g:1628:1: rule__Store__Group__2__Impl : ( ( rule__Store__FilePathAssignment_2 ) ) ;
    public final void rule__Store__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1632:1: ( ( ( rule__Store__FilePathAssignment_2 ) ) )
            // InternalJsonProject.g:1633:1: ( ( rule__Store__FilePathAssignment_2 ) )
            {
            // InternalJsonProject.g:1633:1: ( ( rule__Store__FilePathAssignment_2 ) )
            // InternalJsonProject.g:1634:2: ( rule__Store__FilePathAssignment_2 )
            {
             before(grammarAccess.getStoreAccess().getFilePathAssignment_2()); 
            // InternalJsonProject.g:1635:2: ( rule__Store__FilePathAssignment_2 )
            // InternalJsonProject.g:1635:3: rule__Store__FilePathAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Store__FilePathAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getFilePathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__2__Impl"


    // $ANTLR start "rule__Print__Group__0"
    // InternalJsonProject.g:1644:1: rule__Print__Group__0 : rule__Print__Group__0__Impl rule__Print__Group__1 ;
    public final void rule__Print__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1648:1: ( rule__Print__Group__0__Impl rule__Print__Group__1 )
            // InternalJsonProject.g:1649:2: rule__Print__Group__0__Impl rule__Print__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Print__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Print__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__0"


    // $ANTLR start "rule__Print__Group__0__Impl"
    // InternalJsonProject.g:1656:1: rule__Print__Group__0__Impl : ( () ) ;
    public final void rule__Print__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1660:1: ( ( () ) )
            // InternalJsonProject.g:1661:1: ( () )
            {
            // InternalJsonProject.g:1661:1: ( () )
            // InternalJsonProject.g:1662:2: ()
            {
             before(grammarAccess.getPrintAccess().getPrintAction_0()); 
            // InternalJsonProject.g:1663:2: ()
            // InternalJsonProject.g:1663:3: 
            {
            }

             after(grammarAccess.getPrintAccess().getPrintAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__0__Impl"


    // $ANTLR start "rule__Print__Group__1"
    // InternalJsonProject.g:1671:1: rule__Print__Group__1 : rule__Print__Group__1__Impl rule__Print__Group__2 ;
    public final void rule__Print__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1675:1: ( rule__Print__Group__1__Impl rule__Print__Group__2 )
            // InternalJsonProject.g:1676:2: rule__Print__Group__1__Impl rule__Print__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Print__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Print__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__1"


    // $ANTLR start "rule__Print__Group__1__Impl"
    // InternalJsonProject.g:1683:1: rule__Print__Group__1__Impl : ( 'print' ) ;
    public final void rule__Print__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1687:1: ( ( 'print' ) )
            // InternalJsonProject.g:1688:1: ( 'print' )
            {
            // InternalJsonProject.g:1688:1: ( 'print' )
            // InternalJsonProject.g:1689:2: 'print'
            {
             before(grammarAccess.getPrintAccess().getPrintKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPrintAccess().getPrintKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__1__Impl"


    // $ANTLR start "rule__Print__Group__2"
    // InternalJsonProject.g:1698:1: rule__Print__Group__2 : rule__Print__Group__2__Impl ;
    public final void rule__Print__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1702:1: ( rule__Print__Group__2__Impl )
            // InternalJsonProject.g:1703:2: rule__Print__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Print__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__2"


    // $ANTLR start "rule__Print__Group__2__Impl"
    // InternalJsonProject.g:1709:1: rule__Print__Group__2__Impl : ( ( rule__Print__PathAssignment_2 )? ) ;
    public final void rule__Print__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1713:1: ( ( ( rule__Print__PathAssignment_2 )? ) )
            // InternalJsonProject.g:1714:1: ( ( rule__Print__PathAssignment_2 )? )
            {
            // InternalJsonProject.g:1714:1: ( ( rule__Print__PathAssignment_2 )? )
            // InternalJsonProject.g:1715:2: ( rule__Print__PathAssignment_2 )?
            {
             before(grammarAccess.getPrintAccess().getPathAssignment_2()); 
            // InternalJsonProject.g:1716:2: ( rule__Print__PathAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_GOBACK && LA16_0<=RULE_ROOT)||LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJsonProject.g:1716:3: rule__Print__PathAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Print__PathAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrintAccess().getPathAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__Group__2__Impl"


    // $ANTLR start "rule__JsonPrimitive__Group_2__0"
    // InternalJsonProject.g:1725:1: rule__JsonPrimitive__Group_2__0 : rule__JsonPrimitive__Group_2__0__Impl rule__JsonPrimitive__Group_2__1 ;
    public final void rule__JsonPrimitive__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1729:1: ( rule__JsonPrimitive__Group_2__0__Impl rule__JsonPrimitive__Group_2__1 )
            // InternalJsonProject.g:1730:2: rule__JsonPrimitive__Group_2__0__Impl rule__JsonPrimitive__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__JsonPrimitive__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonPrimitive__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPrimitive__Group_2__0"


    // $ANTLR start "rule__JsonPrimitive__Group_2__0__Impl"
    // InternalJsonProject.g:1737:1: rule__JsonPrimitive__Group_2__0__Impl : ( () ) ;
    public final void rule__JsonPrimitive__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1741:1: ( ( () ) )
            // InternalJsonProject.g:1742:1: ( () )
            {
            // InternalJsonProject.g:1742:1: ( () )
            // InternalJsonProject.g:1743:2: ()
            {
             before(grammarAccess.getJsonPrimitiveAccess().getJsonPrimitiveAction_2_0()); 
            // InternalJsonProject.g:1744:2: ()
            // InternalJsonProject.g:1744:3: 
            {
            }

             after(grammarAccess.getJsonPrimitiveAccess().getJsonPrimitiveAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPrimitive__Group_2__0__Impl"


    // $ANTLR start "rule__JsonPrimitive__Group_2__1"
    // InternalJsonProject.g:1752:1: rule__JsonPrimitive__Group_2__1 : rule__JsonPrimitive__Group_2__1__Impl ;
    public final void rule__JsonPrimitive__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1756:1: ( rule__JsonPrimitive__Group_2__1__Impl )
            // InternalJsonProject.g:1757:2: rule__JsonPrimitive__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonPrimitive__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPrimitive__Group_2__1"


    // $ANTLR start "rule__JsonPrimitive__Group_2__1__Impl"
    // InternalJsonProject.g:1763:1: rule__JsonPrimitive__Group_2__1__Impl : ( RULE_NULL ) ;
    public final void rule__JsonPrimitive__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1767:1: ( ( RULE_NULL ) )
            // InternalJsonProject.g:1768:1: ( RULE_NULL )
            {
            // InternalJsonProject.g:1768:1: ( RULE_NULL )
            // InternalJsonProject.g:1769:2: RULE_NULL
            {
             before(grammarAccess.getJsonPrimitiveAccess().getNULLTerminalRuleCall_2_1()); 
            match(input,RULE_NULL,FOLLOW_2); 
             after(grammarAccess.getJsonPrimitiveAccess().getNULLTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPrimitive__Group_2__1__Impl"


    // $ANTLR start "rule__JsonPrimitive__Group_4__0"
    // InternalJsonProject.g:1779:1: rule__JsonPrimitive__Group_4__0 : rule__JsonPrimitive__Group_4__0__Impl rule__JsonPrimitive__Group_4__1 ;
    public final void rule__JsonPrimitive__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1783:1: ( rule__JsonPrimitive__Group_4__0__Impl rule__JsonPrimitive__Group_4__1 )
            // InternalJsonProject.g:1784:2: rule__JsonPrimitive__Group_4__0__Impl rule__JsonPrimitive__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__JsonPrimitive__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonPrimitive__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPrimitive__Group_4__0"


    // $ANTLR start "rule__JsonPrimitive__Group_4__0__Impl"
    // InternalJsonProject.g:1791:1: rule__JsonPrimitive__Group_4__0__Impl : ( () ) ;
    public final void rule__JsonPrimitive__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1795:1: ( ( () ) )
            // InternalJsonProject.g:1796:1: ( () )
            {
            // InternalJsonProject.g:1796:1: ( () )
            // InternalJsonProject.g:1797:2: ()
            {
             before(grammarAccess.getJsonPrimitiveAccess().getJsonPrimitiveAction_4_0()); 
            // InternalJsonProject.g:1798:2: ()
            // InternalJsonProject.g:1798:3: 
            {
            }

             after(grammarAccess.getJsonPrimitiveAccess().getJsonPrimitiveAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPrimitive__Group_4__0__Impl"


    // $ANTLR start "rule__JsonPrimitive__Group_4__1"
    // InternalJsonProject.g:1806:1: rule__JsonPrimitive__Group_4__1 : rule__JsonPrimitive__Group_4__1__Impl ;
    public final void rule__JsonPrimitive__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1810:1: ( rule__JsonPrimitive__Group_4__1__Impl )
            // InternalJsonProject.g:1811:2: rule__JsonPrimitive__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonPrimitive__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPrimitive__Group_4__1"


    // $ANTLR start "rule__JsonPrimitive__Group_4__1__Impl"
    // InternalJsonProject.g:1817:1: rule__JsonPrimitive__Group_4__1__Impl : ( ruleNumberObject ) ;
    public final void rule__JsonPrimitive__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1821:1: ( ( ruleNumberObject ) )
            // InternalJsonProject.g:1822:1: ( ruleNumberObject )
            {
            // InternalJsonProject.g:1822:1: ( ruleNumberObject )
            // InternalJsonProject.g:1823:2: ruleNumberObject
            {
             before(grammarAccess.getJsonPrimitiveAccess().getNumberObjectParserRuleCall_4_1()); 
            pushFollow(FOLLOW_2);
            ruleNumberObject();

            state._fsp--;

             after(grammarAccess.getJsonPrimitiveAccess().getNumberObjectParserRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonPrimitive__Group_4__1__Impl"


    // $ANTLR start "rule__ArrayObject__Group__0"
    // InternalJsonProject.g:1833:1: rule__ArrayObject__Group__0 : rule__ArrayObject__Group__0__Impl rule__ArrayObject__Group__1 ;
    public final void rule__ArrayObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1837:1: ( rule__ArrayObject__Group__0__Impl rule__ArrayObject__Group__1 )
            // InternalJsonProject.g:1838:2: rule__ArrayObject__Group__0__Impl rule__ArrayObject__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__ArrayObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayObject__Group__0"


    // $ANTLR start "rule__ArrayObject__Group__0__Impl"
    // InternalJsonProject.g:1845:1: rule__ArrayObject__Group__0__Impl : ( () ) ;
    public final void rule__ArrayObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1849:1: ( ( () ) )
            // InternalJsonProject.g:1850:1: ( () )
            {
            // InternalJsonProject.g:1850:1: ( () )
            // InternalJsonProject.g:1851:2: ()
            {
             before(grammarAccess.getArrayObjectAccess().getArrayObjectAction_0()); 
            // InternalJsonProject.g:1852:2: ()
            // InternalJsonProject.g:1852:3: 
            {
            }

             after(grammarAccess.getArrayObjectAccess().getArrayObjectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayObject__Group__0__Impl"


    // $ANTLR start "rule__ArrayObject__Group__1"
    // InternalJsonProject.g:1860:1: rule__ArrayObject__Group__1 : rule__ArrayObject__Group__1__Impl rule__ArrayObject__Group__2 ;
    public final void rule__ArrayObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1864:1: ( rule__ArrayObject__Group__1__Impl rule__ArrayObject__Group__2 )
            // InternalJsonProject.g:1865:2: rule__ArrayObject__Group__1__Impl rule__ArrayObject__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ArrayObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayObject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayObject__Group__1"


    // $ANTLR start "rule__ArrayObject__Group__1__Impl"
    // InternalJsonProject.g:1872:1: rule__ArrayObject__Group__1__Impl : ( '[' ) ;
    public final void rule__ArrayObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1876:1: ( ( '[' ) )
            // InternalJsonProject.g:1877:1: ( '[' )
            {
            // InternalJsonProject.g:1877:1: ( '[' )
            // InternalJsonProject.g:1878:2: '['
            {
             before(grammarAccess.getArrayObjectAccess().getLeftSquareBracketKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getArrayObjectAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayObject__Group__1__Impl"


    // $ANTLR start "rule__ArrayObject__Group__2"
    // InternalJsonProject.g:1887:1: rule__ArrayObject__Group__2 : rule__ArrayObject__Group__2__Impl rule__ArrayObject__Group__3 ;
    public final void rule__ArrayObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1891:1: ( rule__ArrayObject__Group__2__Impl rule__ArrayObject__Group__3 )
            // InternalJsonProject.g:1892:2: rule__ArrayObject__Group__2__Impl rule__ArrayObject__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__ArrayObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayObject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayObject__Group__2"


    // $ANTLR start "rule__ArrayObject__Group__2__Impl"
    // InternalJsonProject.g:1899:1: rule__ArrayObject__Group__2__Impl : ( ( rule__ArrayObject__Group_2__0 )? ) ;
    public final void rule__ArrayObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1903:1: ( ( ( rule__ArrayObject__Group_2__0 )? ) )
            // InternalJsonProject.g:1904:1: ( ( rule__ArrayObject__Group_2__0 )? )
            {
            // InternalJsonProject.g:1904:1: ( ( rule__ArrayObject__Group_2__0 )? )
            // InternalJsonProject.g:1905:2: ( rule__ArrayObject__Group_2__0 )?
            {
             before(grammarAccess.getArrayObjectAccess().getGroup_2()); 
            // InternalJsonProject.g:1906:2: ( rule__ArrayObject__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_INT && LA17_0<=RULE_STRING)||(LA17_0>=15 && LA17_0<=16)||LA17_0==27||LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJsonProject.g:1906:3: rule__ArrayObject__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayObject__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayObjectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayObject__Group__2__Impl"


    // $ANTLR start "rule__ArrayObject__Group__3"
    // InternalJsonProject.g:1914:1: rule__ArrayObject__Group__3 : rule__ArrayObject__Group__3__Impl ;
    public final void rule__ArrayObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1918:1: ( rule__ArrayObject__Group__3__Impl )
            // InternalJsonProject.g:1919:2: rule__ArrayObject__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayObject__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayObject__Group__3"


    // $ANTLR start "rule__ArrayObject__Group__3__Impl"
    // InternalJsonProject.g:1925:1: rule__ArrayObject__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1929:1: ( ( ']' ) )
            // InternalJsonProject.g:1930:1: ( ']' )
            {
            // InternalJsonProject.g:1930:1: ( ']' )
            // InternalJsonProject.g:1931:2: ']'
            {
             before(grammarAccess.getArrayObjectAccess().getRightSquareBracketKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getArrayObjectAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayObject__Group__3__Impl"


    // $ANTLR start "rule__ArrayObject__Group_2__0"
    // InternalJsonProject.g:1941:1: rule__ArrayObject__Group_2__0 : rule__ArrayObject__Group_2__0__Impl rule__ArrayObject__Group_2__1 ;
    public final void rule__ArrayObject__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1945:1: ( rule__ArrayObject__Group_2__0__Impl rule__ArrayObject__Group_2__1 )
            // InternalJsonProject.g:1946:2: rule__ArrayObject__Group_2__0__Impl rule__ArrayObject__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__ArrayObject__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayObject__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayObject__Group_2__0"


    // $ANTLR start "rule__ArrayObject__Group_2__0__Impl"
    // InternalJsonProject.g:1953:1: rule__ArrayObject__Group_2__0__Impl : ( ( rule__ArrayObject__ValuesAssignment_2_0 ) ) ;
    public final void rule__ArrayObject__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1957:1: ( ( ( rule__ArrayObject__ValuesAssignment_2_0 ) ) )
            // InternalJsonProject.g:1958:1: ( ( rule__ArrayObject__ValuesAssignment_2_0 ) )
            {
            // InternalJsonProject.g:1958:1: ( ( rule__ArrayObject__ValuesAssignment_2_0 ) )
            // InternalJsonProject.g:1959:2: ( rule__ArrayObject__ValuesAssignment_2_0 )
            {
             before(grammarAccess.getArrayObjectAccess().getValuesAssignment_2_0()); 
            // InternalJsonProject.g:1960:2: ( rule__ArrayObject__ValuesAssignment_2_0 )
            // InternalJsonProject.g:1960:3: rule__ArrayObject__ValuesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayObject__ValuesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getArrayObjectAccess().getValuesAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayObject__Group_2__0__Impl"


    // $ANTLR start "rule__ArrayObject__Group_2__1"
    // InternalJsonProject.g:1968:1: rule__ArrayObject__Group_2__1 : rule__ArrayObject__Group_2__1__Impl ;
    public final void rule__ArrayObject__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1972:1: ( rule__ArrayObject__Group_2__1__Impl )
            // InternalJsonProject.g:1973:2: rule__ArrayObject__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayObject__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayObject__Group_2__1"


    // $ANTLR start "rule__ArrayObject__Group_2__1__Impl"
    // InternalJsonProject.g:1979:1: rule__ArrayObject__Group_2__1__Impl : ( ( rule__ArrayObject__Group_2_1__0 )* ) ;
    public final void rule__ArrayObject__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1983:1: ( ( ( rule__ArrayObject__Group_2_1__0 )* ) )
            // InternalJsonProject.g:1984:1: ( ( rule__ArrayObject__Group_2_1__0 )* )
            {
            // InternalJsonProject.g:1984:1: ( ( rule__ArrayObject__Group_2_1__0 )* )
            // InternalJsonProject.g:1985:2: ( rule__ArrayObject__Group_2_1__0 )*
            {
             before(grammarAccess.getArrayObjectAccess().getGroup_2_1()); 
            // InternalJsonProject.g:1986:2: ( rule__ArrayObject__Group_2_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalJsonProject.g:1986:3: rule__ArrayObject__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ArrayObject__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getArrayObjectAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayObject__Group_2__1__Impl"


    // $ANTLR start "rule__ArrayObject__Group_2_1__0"
    // InternalJsonProject.g:1995:1: rule__ArrayObject__Group_2_1__0 : rule__ArrayObject__Group_2_1__0__Impl rule__ArrayObject__Group_2_1__1 ;
    public final void rule__ArrayObject__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:1999:1: ( rule__ArrayObject__Group_2_1__0__Impl rule__ArrayObject__Group_2_1__1 )
            // InternalJsonProject.g:2000:2: rule__ArrayObject__Group_2_1__0__Impl rule__ArrayObject__Group_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__ArrayObject__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayObject__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayObject__Group_2_1__0"


    // $ANTLR start "rule__ArrayObject__Group_2_1__0__Impl"
    // InternalJsonProject.g:2007:1: rule__ArrayObject__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__ArrayObject__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2011:1: ( ( ',' ) )
            // InternalJsonProject.g:2012:1: ( ',' )
            {
            // InternalJsonProject.g:2012:1: ( ',' )
            // InternalJsonProject.g:2013:2: ','
            {
             before(grammarAccess.getArrayObjectAccess().getCommaKeyword_2_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getArrayObjectAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayObject__Group_2_1__0__Impl"


    // $ANTLR start "rule__ArrayObject__Group_2_1__1"
    // InternalJsonProject.g:2022:1: rule__ArrayObject__Group_2_1__1 : rule__ArrayObject__Group_2_1__1__Impl ;
    public final void rule__ArrayObject__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2026:1: ( rule__ArrayObject__Group_2_1__1__Impl )
            // InternalJsonProject.g:2027:2: rule__ArrayObject__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayObject__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayObject__Group_2_1__1"


    // $ANTLR start "rule__ArrayObject__Group_2_1__1__Impl"
    // InternalJsonProject.g:2033:1: rule__ArrayObject__Group_2_1__1__Impl : ( ( rule__ArrayObject__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__ArrayObject__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2037:1: ( ( ( rule__ArrayObject__ValuesAssignment_2_1_1 ) ) )
            // InternalJsonProject.g:2038:1: ( ( rule__ArrayObject__ValuesAssignment_2_1_1 ) )
            {
            // InternalJsonProject.g:2038:1: ( ( rule__ArrayObject__ValuesAssignment_2_1_1 ) )
            // InternalJsonProject.g:2039:2: ( rule__ArrayObject__ValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getArrayObjectAccess().getValuesAssignment_2_1_1()); 
            // InternalJsonProject.g:2040:2: ( rule__ArrayObject__ValuesAssignment_2_1_1 )
            // InternalJsonProject.g:2040:3: rule__ArrayObject__ValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayObject__ValuesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayObjectAccess().getValuesAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayObject__Group_2_1__1__Impl"


    // $ANTLR start "rule__JsonEntries__Group__0"
    // InternalJsonProject.g:2049:1: rule__JsonEntries__Group__0 : rule__JsonEntries__Group__0__Impl rule__JsonEntries__Group__1 ;
    public final void rule__JsonEntries__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2053:1: ( rule__JsonEntries__Group__0__Impl rule__JsonEntries__Group__1 )
            // InternalJsonProject.g:2054:2: rule__JsonEntries__Group__0__Impl rule__JsonEntries__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__JsonEntries__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonEntries__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntries__Group__0"


    // $ANTLR start "rule__JsonEntries__Group__0__Impl"
    // InternalJsonProject.g:2061:1: rule__JsonEntries__Group__0__Impl : ( '{' ) ;
    public final void rule__JsonEntries__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2065:1: ( ( '{' ) )
            // InternalJsonProject.g:2066:1: ( '{' )
            {
            // InternalJsonProject.g:2066:1: ( '{' )
            // InternalJsonProject.g:2067:2: '{'
            {
             before(grammarAccess.getJsonEntriesAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getJsonEntriesAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntries__Group__0__Impl"


    // $ANTLR start "rule__JsonEntries__Group__1"
    // InternalJsonProject.g:2076:1: rule__JsonEntries__Group__1 : rule__JsonEntries__Group__1__Impl rule__JsonEntries__Group__2 ;
    public final void rule__JsonEntries__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2080:1: ( rule__JsonEntries__Group__1__Impl rule__JsonEntries__Group__2 )
            // InternalJsonProject.g:2081:2: rule__JsonEntries__Group__1__Impl rule__JsonEntries__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__JsonEntries__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonEntries__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntries__Group__1"


    // $ANTLR start "rule__JsonEntries__Group__1__Impl"
    // InternalJsonProject.g:2088:1: rule__JsonEntries__Group__1__Impl : ( ( rule__JsonEntries__ListEntriesAssignment_1 ) ) ;
    public final void rule__JsonEntries__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2092:1: ( ( ( rule__JsonEntries__ListEntriesAssignment_1 ) ) )
            // InternalJsonProject.g:2093:1: ( ( rule__JsonEntries__ListEntriesAssignment_1 ) )
            {
            // InternalJsonProject.g:2093:1: ( ( rule__JsonEntries__ListEntriesAssignment_1 ) )
            // InternalJsonProject.g:2094:2: ( rule__JsonEntries__ListEntriesAssignment_1 )
            {
             before(grammarAccess.getJsonEntriesAccess().getListEntriesAssignment_1()); 
            // InternalJsonProject.g:2095:2: ( rule__JsonEntries__ListEntriesAssignment_1 )
            // InternalJsonProject.g:2095:3: rule__JsonEntries__ListEntriesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JsonEntries__ListEntriesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonEntriesAccess().getListEntriesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntries__Group__1__Impl"


    // $ANTLR start "rule__JsonEntries__Group__2"
    // InternalJsonProject.g:2103:1: rule__JsonEntries__Group__2 : rule__JsonEntries__Group__2__Impl rule__JsonEntries__Group__3 ;
    public final void rule__JsonEntries__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2107:1: ( rule__JsonEntries__Group__2__Impl rule__JsonEntries__Group__3 )
            // InternalJsonProject.g:2108:2: rule__JsonEntries__Group__2__Impl rule__JsonEntries__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__JsonEntries__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonEntries__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntries__Group__2"


    // $ANTLR start "rule__JsonEntries__Group__2__Impl"
    // InternalJsonProject.g:2115:1: rule__JsonEntries__Group__2__Impl : ( ( rule__JsonEntries__Group_2__0 )* ) ;
    public final void rule__JsonEntries__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2119:1: ( ( ( rule__JsonEntries__Group_2__0 )* ) )
            // InternalJsonProject.g:2120:1: ( ( rule__JsonEntries__Group_2__0 )* )
            {
            // InternalJsonProject.g:2120:1: ( ( rule__JsonEntries__Group_2__0 )* )
            // InternalJsonProject.g:2121:2: ( rule__JsonEntries__Group_2__0 )*
            {
             before(grammarAccess.getJsonEntriesAccess().getGroup_2()); 
            // InternalJsonProject.g:2122:2: ( rule__JsonEntries__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==29) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalJsonProject.g:2122:3: rule__JsonEntries__Group_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__JsonEntries__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getJsonEntriesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntries__Group__2__Impl"


    // $ANTLR start "rule__JsonEntries__Group__3"
    // InternalJsonProject.g:2130:1: rule__JsonEntries__Group__3 : rule__JsonEntries__Group__3__Impl ;
    public final void rule__JsonEntries__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2134:1: ( rule__JsonEntries__Group__3__Impl )
            // InternalJsonProject.g:2135:2: rule__JsonEntries__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonEntries__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntries__Group__3"


    // $ANTLR start "rule__JsonEntries__Group__3__Impl"
    // InternalJsonProject.g:2141:1: rule__JsonEntries__Group__3__Impl : ( '}' ) ;
    public final void rule__JsonEntries__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2145:1: ( ( '}' ) )
            // InternalJsonProject.g:2146:1: ( '}' )
            {
            // InternalJsonProject.g:2146:1: ( '}' )
            // InternalJsonProject.g:2147:2: '}'
            {
             before(grammarAccess.getJsonEntriesAccess().getRightCurlyBracketKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getJsonEntriesAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntries__Group__3__Impl"


    // $ANTLR start "rule__JsonEntries__Group_2__0"
    // InternalJsonProject.g:2157:1: rule__JsonEntries__Group_2__0 : rule__JsonEntries__Group_2__0__Impl rule__JsonEntries__Group_2__1 ;
    public final void rule__JsonEntries__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2161:1: ( rule__JsonEntries__Group_2__0__Impl rule__JsonEntries__Group_2__1 )
            // InternalJsonProject.g:2162:2: rule__JsonEntries__Group_2__0__Impl rule__JsonEntries__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__JsonEntries__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonEntries__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntries__Group_2__0"


    // $ANTLR start "rule__JsonEntries__Group_2__0__Impl"
    // InternalJsonProject.g:2169:1: rule__JsonEntries__Group_2__0__Impl : ( ',' ) ;
    public final void rule__JsonEntries__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2173:1: ( ( ',' ) )
            // InternalJsonProject.g:2174:1: ( ',' )
            {
            // InternalJsonProject.g:2174:1: ( ',' )
            // InternalJsonProject.g:2175:2: ','
            {
             before(grammarAccess.getJsonEntriesAccess().getCommaKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getJsonEntriesAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntries__Group_2__0__Impl"


    // $ANTLR start "rule__JsonEntries__Group_2__1"
    // InternalJsonProject.g:2184:1: rule__JsonEntries__Group_2__1 : rule__JsonEntries__Group_2__1__Impl ;
    public final void rule__JsonEntries__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2188:1: ( rule__JsonEntries__Group_2__1__Impl )
            // InternalJsonProject.g:2189:2: rule__JsonEntries__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonEntries__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntries__Group_2__1"


    // $ANTLR start "rule__JsonEntries__Group_2__1__Impl"
    // InternalJsonProject.g:2195:1: rule__JsonEntries__Group_2__1__Impl : ( ( rule__JsonEntries__ListEntriesAssignment_2_1 ) ) ;
    public final void rule__JsonEntries__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2199:1: ( ( ( rule__JsonEntries__ListEntriesAssignment_2_1 ) ) )
            // InternalJsonProject.g:2200:1: ( ( rule__JsonEntries__ListEntriesAssignment_2_1 ) )
            {
            // InternalJsonProject.g:2200:1: ( ( rule__JsonEntries__ListEntriesAssignment_2_1 ) )
            // InternalJsonProject.g:2201:2: ( rule__JsonEntries__ListEntriesAssignment_2_1 )
            {
             before(grammarAccess.getJsonEntriesAccess().getListEntriesAssignment_2_1()); 
            // InternalJsonProject.g:2202:2: ( rule__JsonEntries__ListEntriesAssignment_2_1 )
            // InternalJsonProject.g:2202:3: rule__JsonEntries__ListEntriesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__JsonEntries__ListEntriesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonEntriesAccess().getListEntriesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntries__Group_2__1__Impl"


    // $ANTLR start "rule__JsonEntry__Group__0"
    // InternalJsonProject.g:2211:1: rule__JsonEntry__Group__0 : rule__JsonEntry__Group__0__Impl rule__JsonEntry__Group__1 ;
    public final void rule__JsonEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2215:1: ( rule__JsonEntry__Group__0__Impl rule__JsonEntry__Group__1 )
            // InternalJsonProject.g:2216:2: rule__JsonEntry__Group__0__Impl rule__JsonEntry__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__JsonEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonEntry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntry__Group__0"


    // $ANTLR start "rule__JsonEntry__Group__0__Impl"
    // InternalJsonProject.g:2223:1: rule__JsonEntry__Group__0__Impl : ( '\"' ) ;
    public final void rule__JsonEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2227:1: ( ( '\"' ) )
            // InternalJsonProject.g:2228:1: ( '\"' )
            {
            // InternalJsonProject.g:2228:1: ( '\"' )
            // InternalJsonProject.g:2229:2: '\"'
            {
             before(grammarAccess.getJsonEntryAccess().getQuotationMarkKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getJsonEntryAccess().getQuotationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntry__Group__0__Impl"


    // $ANTLR start "rule__JsonEntry__Group__1"
    // InternalJsonProject.g:2238:1: rule__JsonEntry__Group__1 : rule__JsonEntry__Group__1__Impl rule__JsonEntry__Group__2 ;
    public final void rule__JsonEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2242:1: ( rule__JsonEntry__Group__1__Impl rule__JsonEntry__Group__2 )
            // InternalJsonProject.g:2243:2: rule__JsonEntry__Group__1__Impl rule__JsonEntry__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__JsonEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonEntry__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntry__Group__1"


    // $ANTLR start "rule__JsonEntry__Group__1__Impl"
    // InternalJsonProject.g:2250:1: rule__JsonEntry__Group__1__Impl : ( ( rule__JsonEntry__KeyAssignment_1 ) ) ;
    public final void rule__JsonEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2254:1: ( ( ( rule__JsonEntry__KeyAssignment_1 ) ) )
            // InternalJsonProject.g:2255:1: ( ( rule__JsonEntry__KeyAssignment_1 ) )
            {
            // InternalJsonProject.g:2255:1: ( ( rule__JsonEntry__KeyAssignment_1 ) )
            // InternalJsonProject.g:2256:2: ( rule__JsonEntry__KeyAssignment_1 )
            {
             before(grammarAccess.getJsonEntryAccess().getKeyAssignment_1()); 
            // InternalJsonProject.g:2257:2: ( rule__JsonEntry__KeyAssignment_1 )
            // InternalJsonProject.g:2257:3: rule__JsonEntry__KeyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JsonEntry__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJsonEntryAccess().getKeyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntry__Group__1__Impl"


    // $ANTLR start "rule__JsonEntry__Group__2"
    // InternalJsonProject.g:2265:1: rule__JsonEntry__Group__2 : rule__JsonEntry__Group__2__Impl rule__JsonEntry__Group__3 ;
    public final void rule__JsonEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2269:1: ( rule__JsonEntry__Group__2__Impl rule__JsonEntry__Group__3 )
            // InternalJsonProject.g:2270:2: rule__JsonEntry__Group__2__Impl rule__JsonEntry__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__JsonEntry__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonEntry__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntry__Group__2"


    // $ANTLR start "rule__JsonEntry__Group__2__Impl"
    // InternalJsonProject.g:2277:1: rule__JsonEntry__Group__2__Impl : ( '\"' ) ;
    public final void rule__JsonEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2281:1: ( ( '\"' ) )
            // InternalJsonProject.g:2282:1: ( '\"' )
            {
            // InternalJsonProject.g:2282:1: ( '\"' )
            // InternalJsonProject.g:2283:2: '\"'
            {
             before(grammarAccess.getJsonEntryAccess().getQuotationMarkKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getJsonEntryAccess().getQuotationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntry__Group__2__Impl"


    // $ANTLR start "rule__JsonEntry__Group__3"
    // InternalJsonProject.g:2292:1: rule__JsonEntry__Group__3 : rule__JsonEntry__Group__3__Impl rule__JsonEntry__Group__4 ;
    public final void rule__JsonEntry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2296:1: ( rule__JsonEntry__Group__3__Impl rule__JsonEntry__Group__4 )
            // InternalJsonProject.g:2297:2: rule__JsonEntry__Group__3__Impl rule__JsonEntry__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__JsonEntry__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JsonEntry__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntry__Group__3"


    // $ANTLR start "rule__JsonEntry__Group__3__Impl"
    // InternalJsonProject.g:2304:1: rule__JsonEntry__Group__3__Impl : ( ':' ) ;
    public final void rule__JsonEntry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2308:1: ( ( ':' ) )
            // InternalJsonProject.g:2309:1: ( ':' )
            {
            // InternalJsonProject.g:2309:1: ( ':' )
            // InternalJsonProject.g:2310:2: ':'
            {
             before(grammarAccess.getJsonEntryAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getJsonEntryAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntry__Group__3__Impl"


    // $ANTLR start "rule__JsonEntry__Group__4"
    // InternalJsonProject.g:2319:1: rule__JsonEntry__Group__4 : rule__JsonEntry__Group__4__Impl ;
    public final void rule__JsonEntry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2323:1: ( rule__JsonEntry__Group__4__Impl )
            // InternalJsonProject.g:2324:2: rule__JsonEntry__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JsonEntry__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntry__Group__4"


    // $ANTLR start "rule__JsonEntry__Group__4__Impl"
    // InternalJsonProject.g:2330:1: rule__JsonEntry__Group__4__Impl : ( ( rule__JsonEntry__JsonObjectAssignment_4 ) ) ;
    public final void rule__JsonEntry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2334:1: ( ( ( rule__JsonEntry__JsonObjectAssignment_4 ) ) )
            // InternalJsonProject.g:2335:1: ( ( rule__JsonEntry__JsonObjectAssignment_4 ) )
            {
            // InternalJsonProject.g:2335:1: ( ( rule__JsonEntry__JsonObjectAssignment_4 ) )
            // InternalJsonProject.g:2336:2: ( rule__JsonEntry__JsonObjectAssignment_4 )
            {
             before(grammarAccess.getJsonEntryAccess().getJsonObjectAssignment_4()); 
            // InternalJsonProject.g:2337:2: ( rule__JsonEntry__JsonObjectAssignment_4 )
            // InternalJsonProject.g:2337:3: rule__JsonEntry__JsonObjectAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__JsonEntry__JsonObjectAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getJsonEntryAccess().getJsonObjectAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntry__Group__4__Impl"


    // $ANTLR start "rule__JsonCommands__JsonCommandsAssignment"
    // InternalJsonProject.g:2346:1: rule__JsonCommands__JsonCommandsAssignment : ( ruleJsonCommand ) ;
    public final void rule__JsonCommands__JsonCommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2350:1: ( ( ruleJsonCommand ) )
            // InternalJsonProject.g:2351:2: ( ruleJsonCommand )
            {
            // InternalJsonProject.g:2351:2: ( ruleJsonCommand )
            // InternalJsonProject.g:2352:3: ruleJsonCommand
            {
             before(grammarAccess.getJsonCommandsAccess().getJsonCommandsJsonCommandParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonCommand();

            state._fsp--;

             after(grammarAccess.getJsonCommandsAccess().getJsonCommandsJsonCommandParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonCommands__JsonCommandsAssignment"


    // $ANTLR start "rule__JsonCommand__InitAssignment_0"
    // InternalJsonProject.g:2361:1: rule__JsonCommand__InitAssignment_0 : ( ruleInitialisation ) ;
    public final void rule__JsonCommand__InitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2365:1: ( ( ruleInitialisation ) )
            // InternalJsonProject.g:2366:2: ( ruleInitialisation )
            {
            // InternalJsonProject.g:2366:2: ( ruleInitialisation )
            // InternalJsonProject.g:2367:3: ruleInitialisation
            {
             before(grammarAccess.getJsonCommandAccess().getInitInitialisationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInitialisation();

            state._fsp--;

             after(grammarAccess.getJsonCommandAccess().getInitInitialisationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonCommand__InitAssignment_0"


    // $ANTLR start "rule__JsonCommand__OperationsAssignment_1"
    // InternalJsonProject.g:2376:1: rule__JsonCommand__OperationsAssignment_1 : ( ruleOperation ) ;
    public final void rule__JsonCommand__OperationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2380:1: ( ( ruleOperation ) )
            // InternalJsonProject.g:2381:2: ( ruleOperation )
            {
            // InternalJsonProject.g:2381:2: ( ruleOperation )
            // InternalJsonProject.g:2382:3: ruleOperation
            {
             before(grammarAccess.getJsonCommandAccess().getOperationsOperationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getJsonCommandAccess().getOperationsOperationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonCommand__OperationsAssignment_1"


    // $ANTLR start "rule__JsonCommand__FinalAssignment_2"
    // InternalJsonProject.g:2391:1: rule__JsonCommand__FinalAssignment_2 : ( ruleFinal ) ;
    public final void rule__JsonCommand__FinalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2395:1: ( ( ruleFinal ) )
            // InternalJsonProject.g:2396:2: ( ruleFinal )
            {
            // InternalJsonProject.g:2396:2: ( ruleFinal )
            // InternalJsonProject.g:2397:3: ruleFinal
            {
             before(grammarAccess.getJsonCommandAccess().getFinalFinalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFinal();

            state._fsp--;

             after(grammarAccess.getJsonCommandAccess().getFinalFinalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonCommand__FinalAssignment_2"


    // $ANTLR start "rule__Initialisation__FilePathAssignment_1"
    // InternalJsonProject.g:2406:1: rule__Initialisation__FilePathAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Initialisation__FilePathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2410:1: ( ( RULE_STRING ) )
            // InternalJsonProject.g:2411:2: ( RULE_STRING )
            {
            // InternalJsonProject.g:2411:2: ( RULE_STRING )
            // InternalJsonProject.g:2412:3: RULE_STRING
            {
             before(grammarAccess.getInitialisationAccess().getFilePathSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInitialisationAccess().getFilePathSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initialisation__FilePathAssignment_1"


    // $ANTLR start "rule__Insert__JsonObjectAssignment_1"
    // InternalJsonProject.g:2421:1: rule__Insert__JsonObjectAssignment_1 : ( ruleJsonObject ) ;
    public final void rule__Insert__JsonObjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2425:1: ( ( ruleJsonObject ) )
            // InternalJsonProject.g:2426:2: ( ruleJsonObject )
            {
            // InternalJsonProject.g:2426:2: ( ruleJsonObject )
            // InternalJsonProject.g:2427:3: ruleJsonObject
            {
             before(grammarAccess.getInsertAccess().getJsonObjectJsonObjectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonObject();

            state._fsp--;

             after(grammarAccess.getInsertAccess().getJsonObjectJsonObjectParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__JsonObjectAssignment_1"


    // $ANTLR start "rule__Insert__PathAssignment_2"
    // InternalJsonProject.g:2436:1: rule__Insert__PathAssignment_2 : ( rulePath ) ;
    public final void rule__Insert__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2440:1: ( ( rulePath ) )
            // InternalJsonProject.g:2441:2: ( rulePath )
            {
            // InternalJsonProject.g:2441:2: ( rulePath )
            // InternalJsonProject.g:2442:3: rulePath
            {
             before(grammarAccess.getInsertAccess().getPathPathParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;

             after(grammarAccess.getInsertAccess().getPathPathParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Insert__PathAssignment_2"


    // $ANTLR start "rule__Path__ValuesAssignment_1_0"
    // InternalJsonProject.g:2451:1: rule__Path__ValuesAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Path__ValuesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2455:1: ( ( RULE_ID ) )
            // InternalJsonProject.g:2456:2: ( RULE_ID )
            {
            // InternalJsonProject.g:2456:2: ( RULE_ID )
            // InternalJsonProject.g:2457:3: RULE_ID
            {
             before(grammarAccess.getPathAccess().getValuesIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPathAccess().getValuesIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__ValuesAssignment_1_0"


    // $ANTLR start "rule__Path__ValuesAssignment_2_1_0"
    // InternalJsonProject.g:2466:1: rule__Path__ValuesAssignment_2_1_0 : ( RULE_ID ) ;
    public final void rule__Path__ValuesAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2470:1: ( ( RULE_ID ) )
            // InternalJsonProject.g:2471:2: ( RULE_ID )
            {
            // InternalJsonProject.g:2471:2: ( RULE_ID )
            // InternalJsonProject.g:2472:3: RULE_ID
            {
             before(grammarAccess.getPathAccess().getValuesIDTerminalRuleCall_2_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPathAccess().getValuesIDTerminalRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Path__ValuesAssignment_2_1_0"


    // $ANTLR start "rule__Modify__PathAssignment_1"
    // InternalJsonProject.g:2481:1: rule__Modify__PathAssignment_1 : ( rulePath ) ;
    public final void rule__Modify__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2485:1: ( ( rulePath ) )
            // InternalJsonProject.g:2486:2: ( rulePath )
            {
            // InternalJsonProject.g:2486:2: ( rulePath )
            // InternalJsonProject.g:2487:3: rulePath
            {
             before(grammarAccess.getModifyAccess().getPathPathParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;

             after(grammarAccess.getModifyAccess().getPathPathParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modify__PathAssignment_1"


    // $ANTLR start "rule__Modify__JsonObjectAssignment_2"
    // InternalJsonProject.g:2496:1: rule__Modify__JsonObjectAssignment_2 : ( ruleJsonObject ) ;
    public final void rule__Modify__JsonObjectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2500:1: ( ( ruleJsonObject ) )
            // InternalJsonProject.g:2501:2: ( ruleJsonObject )
            {
            // InternalJsonProject.g:2501:2: ( ruleJsonObject )
            // InternalJsonProject.g:2502:3: ruleJsonObject
            {
             before(grammarAccess.getModifyAccess().getJsonObjectJsonObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonObject();

            state._fsp--;

             after(grammarAccess.getModifyAccess().getJsonObjectJsonObjectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modify__JsonObjectAssignment_2"


    // $ANTLR start "rule__Sum__PathTOStoreAssignment_1"
    // InternalJsonProject.g:2511:1: rule__Sum__PathTOStoreAssignment_1 : ( rulePath ) ;
    public final void rule__Sum__PathTOStoreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2515:1: ( ( rulePath ) )
            // InternalJsonProject.g:2516:2: ( rulePath )
            {
            // InternalJsonProject.g:2516:2: ( rulePath )
            // InternalJsonProject.g:2517:3: rulePath
            {
             before(grammarAccess.getSumAccess().getPathTOStorePathParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;

             after(grammarAccess.getSumAccess().getPathTOStorePathParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__PathTOStoreAssignment_1"


    // $ANTLR start "rule__Sum__PathToAddAssignment_2"
    // InternalJsonProject.g:2526:1: rule__Sum__PathToAddAssignment_2 : ( rulePath ) ;
    public final void rule__Sum__PathToAddAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2530:1: ( ( rulePath ) )
            // InternalJsonProject.g:2531:2: ( rulePath )
            {
            // InternalJsonProject.g:2531:2: ( rulePath )
            // InternalJsonProject.g:2532:3: rulePath
            {
             before(grammarAccess.getSumAccess().getPathToAddPathParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;

             after(grammarAccess.getSumAccess().getPathToAddPathParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__PathToAddAssignment_2"


    // $ANTLR start "rule__Remove__PathAssignment_2"
    // InternalJsonProject.g:2541:1: rule__Remove__PathAssignment_2 : ( rulePath ) ;
    public final void rule__Remove__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2545:1: ( ( rulePath ) )
            // InternalJsonProject.g:2546:2: ( rulePath )
            {
            // InternalJsonProject.g:2546:2: ( rulePath )
            // InternalJsonProject.g:2547:3: rulePath
            {
             before(grammarAccess.getRemoveAccess().getPathPathParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;

             after(grammarAccess.getRemoveAccess().getPathPathParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__PathAssignment_2"


    // $ANTLR start "rule__Mult__PathTOStoreAssignment_1"
    // InternalJsonProject.g:2556:1: rule__Mult__PathTOStoreAssignment_1 : ( rulePath ) ;
    public final void rule__Mult__PathTOStoreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2560:1: ( ( rulePath ) )
            // InternalJsonProject.g:2561:2: ( rulePath )
            {
            // InternalJsonProject.g:2561:2: ( rulePath )
            // InternalJsonProject.g:2562:3: rulePath
            {
             before(grammarAccess.getMultAccess().getPathTOStorePathParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;

             after(grammarAccess.getMultAccess().getPathTOStorePathParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mult__PathTOStoreAssignment_1"


    // $ANTLR start "rule__Mult__PathToMultAssignment_2"
    // InternalJsonProject.g:2571:1: rule__Mult__PathToMultAssignment_2 : ( rulePath ) ;
    public final void rule__Mult__PathToMultAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2575:1: ( ( rulePath ) )
            // InternalJsonProject.g:2576:2: ( rulePath )
            {
            // InternalJsonProject.g:2576:2: ( rulePath )
            // InternalJsonProject.g:2577:3: rulePath
            {
             before(grammarAccess.getMultAccess().getPathToMultPathParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;

             after(grammarAccess.getMultAccess().getPathToMultPathParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mult__PathToMultAssignment_2"


    // $ANTLR start "rule__Select__PathAssignment_1"
    // InternalJsonProject.g:2586:1: rule__Select__PathAssignment_1 : ( rulePath ) ;
    public final void rule__Select__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2590:1: ( ( rulePath ) )
            // InternalJsonProject.g:2591:2: ( rulePath )
            {
            // InternalJsonProject.g:2591:2: ( rulePath )
            // InternalJsonProject.g:2592:3: rulePath
            {
             before(grammarAccess.getSelectAccess().getPathPathParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getPathPathParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__PathAssignment_1"


    // $ANTLR start "rule__Store__PathAssignment_1"
    // InternalJsonProject.g:2601:1: rule__Store__PathAssignment_1 : ( rulePath ) ;
    public final void rule__Store__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2605:1: ( ( rulePath ) )
            // InternalJsonProject.g:2606:2: ( rulePath )
            {
            // InternalJsonProject.g:2606:2: ( rulePath )
            // InternalJsonProject.g:2607:3: rulePath
            {
             before(grammarAccess.getStoreAccess().getPathPathParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;

             after(grammarAccess.getStoreAccess().getPathPathParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__PathAssignment_1"


    // $ANTLR start "rule__Store__FilePathAssignment_2"
    // InternalJsonProject.g:2616:1: rule__Store__FilePathAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Store__FilePathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2620:1: ( ( RULE_STRING ) )
            // InternalJsonProject.g:2621:2: ( RULE_STRING )
            {
            // InternalJsonProject.g:2621:2: ( RULE_STRING )
            // InternalJsonProject.g:2622:3: RULE_STRING
            {
             before(grammarAccess.getStoreAccess().getFilePathSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getFilePathSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__FilePathAssignment_2"


    // $ANTLR start "rule__Print__PathAssignment_2"
    // InternalJsonProject.g:2631:1: rule__Print__PathAssignment_2 : ( rulePath ) ;
    public final void rule__Print__PathAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2635:1: ( ( rulePath ) )
            // InternalJsonProject.g:2636:2: ( rulePath )
            {
            // InternalJsonProject.g:2636:2: ( rulePath )
            // InternalJsonProject.g:2637:3: rulePath
            {
             before(grammarAccess.getPrintAccess().getPathPathParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePath();

            state._fsp--;

             after(grammarAccess.getPrintAccess().getPathPathParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Print__PathAssignment_2"


    // $ANTLR start "rule__ArrayObject__ValuesAssignment_2_0"
    // InternalJsonProject.g:2646:1: rule__ArrayObject__ValuesAssignment_2_0 : ( ruleJsonObject ) ;
    public final void rule__ArrayObject__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2650:1: ( ( ruleJsonObject ) )
            // InternalJsonProject.g:2651:2: ( ruleJsonObject )
            {
            // InternalJsonProject.g:2651:2: ( ruleJsonObject )
            // InternalJsonProject.g:2652:3: ruleJsonObject
            {
             before(grammarAccess.getArrayObjectAccess().getValuesJsonObjectParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonObject();

            state._fsp--;

             after(grammarAccess.getArrayObjectAccess().getValuesJsonObjectParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayObject__ValuesAssignment_2_0"


    // $ANTLR start "rule__ArrayObject__ValuesAssignment_2_1_1"
    // InternalJsonProject.g:2661:1: rule__ArrayObject__ValuesAssignment_2_1_1 : ( ruleJsonObject ) ;
    public final void rule__ArrayObject__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2665:1: ( ( ruleJsonObject ) )
            // InternalJsonProject.g:2666:2: ( ruleJsonObject )
            {
            // InternalJsonProject.g:2666:2: ( ruleJsonObject )
            // InternalJsonProject.g:2667:3: ruleJsonObject
            {
             before(grammarAccess.getArrayObjectAccess().getValuesJsonObjectParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonObject();

            state._fsp--;

             after(grammarAccess.getArrayObjectAccess().getValuesJsonObjectParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayObject__ValuesAssignment_2_1_1"


    // $ANTLR start "rule__BooleanObject__ValueAssignment"
    // InternalJsonProject.g:2676:1: rule__BooleanObject__ValueAssignment : ( ruleBoolean ) ;
    public final void rule__BooleanObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2680:1: ( ( ruleBoolean ) )
            // InternalJsonProject.g:2681:2: ( ruleBoolean )
            {
            // InternalJsonProject.g:2681:2: ( ruleBoolean )
            // InternalJsonProject.g:2682:3: ruleBoolean
            {
             before(grammarAccess.getBooleanObjectAccess().getValueBooleanEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanObjectAccess().getValueBooleanEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanObject__ValueAssignment"


    // $ANTLR start "rule__StringObject__ValueAssignment"
    // InternalJsonProject.g:2691:1: rule__StringObject__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringObject__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2695:1: ( ( RULE_STRING ) )
            // InternalJsonProject.g:2696:2: ( RULE_STRING )
            {
            // InternalJsonProject.g:2696:2: ( RULE_STRING )
            // InternalJsonProject.g:2697:3: RULE_STRING
            {
             before(grammarAccess.getStringObjectAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringObjectAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringObject__ValueAssignment"


    // $ANTLR start "rule__JsonEntries__ListEntriesAssignment_1"
    // InternalJsonProject.g:2706:1: rule__JsonEntries__ListEntriesAssignment_1 : ( ruleJsonEntry ) ;
    public final void rule__JsonEntries__ListEntriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2710:1: ( ( ruleJsonEntry ) )
            // InternalJsonProject.g:2711:2: ( ruleJsonEntry )
            {
            // InternalJsonProject.g:2711:2: ( ruleJsonEntry )
            // InternalJsonProject.g:2712:3: ruleJsonEntry
            {
             before(grammarAccess.getJsonEntriesAccess().getListEntriesJsonEntryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonEntry();

            state._fsp--;

             after(grammarAccess.getJsonEntriesAccess().getListEntriesJsonEntryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntries__ListEntriesAssignment_1"


    // $ANTLR start "rule__JsonEntries__ListEntriesAssignment_2_1"
    // InternalJsonProject.g:2721:1: rule__JsonEntries__ListEntriesAssignment_2_1 : ( ruleJsonEntry ) ;
    public final void rule__JsonEntries__ListEntriesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2725:1: ( ( ruleJsonEntry ) )
            // InternalJsonProject.g:2726:2: ( ruleJsonEntry )
            {
            // InternalJsonProject.g:2726:2: ( ruleJsonEntry )
            // InternalJsonProject.g:2727:3: ruleJsonEntry
            {
             before(grammarAccess.getJsonEntriesAccess().getListEntriesJsonEntryParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonEntry();

            state._fsp--;

             after(grammarAccess.getJsonEntriesAccess().getListEntriesJsonEntryParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntries__ListEntriesAssignment_2_1"


    // $ANTLR start "rule__JsonEntry__KeyAssignment_1"
    // InternalJsonProject.g:2736:1: rule__JsonEntry__KeyAssignment_1 : ( RULE_ID ) ;
    public final void rule__JsonEntry__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2740:1: ( ( RULE_ID ) )
            // InternalJsonProject.g:2741:2: ( RULE_ID )
            {
            // InternalJsonProject.g:2741:2: ( RULE_ID )
            // InternalJsonProject.g:2742:3: RULE_ID
            {
             before(grammarAccess.getJsonEntryAccess().getKeyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJsonEntryAccess().getKeyIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntry__KeyAssignment_1"


    // $ANTLR start "rule__JsonEntry__JsonObjectAssignment_4"
    // InternalJsonProject.g:2751:1: rule__JsonEntry__JsonObjectAssignment_4 : ( ruleJsonObject ) ;
    public final void rule__JsonEntry__JsonObjectAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonProject.g:2755:1: ( ( ruleJsonObject ) )
            // InternalJsonProject.g:2756:2: ( ruleJsonObject )
            {
            // InternalJsonProject.g:2756:2: ( ruleJsonObject )
            // InternalJsonProject.g:2757:3: ruleJsonObject
            {
             before(grammarAccess.getJsonEntryAccess().getJsonObjectJsonObjectParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleJsonObject();

            state._fsp--;

             after(grammarAccess.getJsonEntryAccess().getJsonObjectJsonObjectParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JsonEntry__JsonObjectAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000007F40000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001F40002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000480183C0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000430L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000480187F0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000630L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000580183C0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});

}