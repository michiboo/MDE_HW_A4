package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EDate'", "'E'", "'e'", "'Spot'", "'Future'", "'Margin'", "'Saving'", "'IntraExchange'", "'ExtraExchange'", "'_1x'", "'_2x'", "'_5x'", "'_10x'", "'buy'", "'sell'", "'leverageLong'", "'leverageShort'", "'cryptoExchange'", "'{'", "'SubSystem'", "'}'", "'Tokens'", "'TokenNetworks'", "'IP'", "'DomainName'", "','", "'accounts'", "'TokenPairs'", "'Orders'", "'SavingOrders'", "'Token'", "'decimal'", "'TokenNetwork'", "'address'", "'chainID'", "'RPC'", "'Account'", "'TokensBalance'", "'transferRequest'", "'TokenPair'", "'price'", "'TokenA'", "'TokenB'", "'Order'", "'Price'", "'Amount'", "'account'", "'leverage'", "'Type'", "'SavingOrder'", "'Interest'", "'MatureDate'", "'TokenBalance'", "'balance'", "'TransferRequest'", "'amount'", "'Destination'", "'type'", "'-'", "'.'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRulecryptoExchange"
    // InternalMyDsl.g:53:1: entryRulecryptoExchange : rulecryptoExchange EOF ;
    public final void entryRulecryptoExchange() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( rulecryptoExchange EOF )
            // InternalMyDsl.g:55:1: rulecryptoExchange EOF
            {
             before(grammarAccess.getCryptoExchangeRule()); 
            pushFollow(FOLLOW_1);
            rulecryptoExchange();

            state._fsp--;

             after(grammarAccess.getCryptoExchangeRule()); 
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
    // $ANTLR end "entryRulecryptoExchange"


    // $ANTLR start "rulecryptoExchange"
    // InternalMyDsl.g:62:1: rulecryptoExchange : ( ( rule__CryptoExchange__Group__0 ) ) ;
    public final void rulecryptoExchange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__CryptoExchange__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__CryptoExchange__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__CryptoExchange__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__CryptoExchange__Group__0 )
            {
             before(grammarAccess.getCryptoExchangeAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__CryptoExchange__Group__0 )
            // InternalMyDsl.g:69:4: rule__CryptoExchange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCryptoExchangeAccess().getGroup()); 

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
    // $ANTLR end "rulecryptoExchange"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEString EOF )
            // InternalMyDsl.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSubSystem"
    // InternalMyDsl.g:103:1: entryRuleSubSystem : ruleSubSystem EOF ;
    public final void entryRuleSubSystem() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleSubSystem EOF )
            // InternalMyDsl.g:105:1: ruleSubSystem EOF
            {
             before(grammarAccess.getSubSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleSubSystem();

            state._fsp--;

             after(grammarAccess.getSubSystemRule()); 
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
    // $ANTLR end "entryRuleSubSystem"


    // $ANTLR start "ruleSubSystem"
    // InternalMyDsl.g:112:1: ruleSubSystem : ( ( rule__SubSystem__Group__0 ) ) ;
    public final void ruleSubSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__SubSystem__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__SubSystem__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__SubSystem__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__SubSystem__Group__0 )
            {
             before(grammarAccess.getSubSystemAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__SubSystem__Group__0 )
            // InternalMyDsl.g:119:4: rule__SubSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleSubSystem"


    // $ANTLR start "entryRuleToken"
    // InternalMyDsl.g:128:1: entryRuleToken : ruleToken EOF ;
    public final void entryRuleToken() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleToken EOF )
            // InternalMyDsl.g:130:1: ruleToken EOF
            {
             before(grammarAccess.getTokenRule()); 
            pushFollow(FOLLOW_1);
            ruleToken();

            state._fsp--;

             after(grammarAccess.getTokenRule()); 
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
    // $ANTLR end "entryRuleToken"


    // $ANTLR start "ruleToken"
    // InternalMyDsl.g:137:1: ruleToken : ( ( rule__Token__Group__0 ) ) ;
    public final void ruleToken() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Token__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Token__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Token__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Token__Group__0 )
            {
             before(grammarAccess.getTokenAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Token__Group__0 )
            // InternalMyDsl.g:144:4: rule__Token__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Token__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTokenAccess().getGroup()); 

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
    // $ANTLR end "ruleToken"


    // $ANTLR start "entryRuleTokenNetwork"
    // InternalMyDsl.g:153:1: entryRuleTokenNetwork : ruleTokenNetwork EOF ;
    public final void entryRuleTokenNetwork() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleTokenNetwork EOF )
            // InternalMyDsl.g:155:1: ruleTokenNetwork EOF
            {
             before(grammarAccess.getTokenNetworkRule()); 
            pushFollow(FOLLOW_1);
            ruleTokenNetwork();

            state._fsp--;

             after(grammarAccess.getTokenNetworkRule()); 
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
    // $ANTLR end "entryRuleTokenNetwork"


    // $ANTLR start "ruleTokenNetwork"
    // InternalMyDsl.g:162:1: ruleTokenNetwork : ( ( rule__TokenNetwork__Group__0 ) ) ;
    public final void ruleTokenNetwork() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__TokenNetwork__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__TokenNetwork__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__TokenNetwork__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__TokenNetwork__Group__0 )
            {
             before(grammarAccess.getTokenNetworkAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__TokenNetwork__Group__0 )
            // InternalMyDsl.g:169:4: rule__TokenNetwork__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TokenNetwork__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTokenNetworkAccess().getGroup()); 

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
    // $ANTLR end "ruleTokenNetwork"


    // $ANTLR start "entryRuleAccount"
    // InternalMyDsl.g:178:1: entryRuleAccount : ruleAccount EOF ;
    public final void entryRuleAccount() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAccount EOF )
            // InternalMyDsl.g:180:1: ruleAccount EOF
            {
             before(grammarAccess.getAccountRule()); 
            pushFollow(FOLLOW_1);
            ruleAccount();

            state._fsp--;

             after(grammarAccess.getAccountRule()); 
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
    // $ANTLR end "entryRuleAccount"


    // $ANTLR start "ruleAccount"
    // InternalMyDsl.g:187:1: ruleAccount : ( ( rule__Account__Group__0 ) ) ;
    public final void ruleAccount() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Account__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Account__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Account__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Account__Group__0 )
            {
             before(grammarAccess.getAccountAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Account__Group__0 )
            // InternalMyDsl.g:194:4: rule__Account__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Account__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAccountAccess().getGroup()); 

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
    // $ANTLR end "ruleAccount"


    // $ANTLR start "entryRuleTokenPair"
    // InternalMyDsl.g:203:1: entryRuleTokenPair : ruleTokenPair EOF ;
    public final void entryRuleTokenPair() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleTokenPair EOF )
            // InternalMyDsl.g:205:1: ruleTokenPair EOF
            {
             before(grammarAccess.getTokenPairRule()); 
            pushFollow(FOLLOW_1);
            ruleTokenPair();

            state._fsp--;

             after(grammarAccess.getTokenPairRule()); 
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
    // $ANTLR end "entryRuleTokenPair"


    // $ANTLR start "ruleTokenPair"
    // InternalMyDsl.g:212:1: ruleTokenPair : ( ( rule__TokenPair__Group__0 ) ) ;
    public final void ruleTokenPair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__TokenPair__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__TokenPair__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__TokenPair__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__TokenPair__Group__0 )
            {
             before(grammarAccess.getTokenPairAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__TokenPair__Group__0 )
            // InternalMyDsl.g:219:4: rule__TokenPair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TokenPair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTokenPairAccess().getGroup()); 

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
    // $ANTLR end "ruleTokenPair"


    // $ANTLR start "entryRuleOrder"
    // InternalMyDsl.g:228:1: entryRuleOrder : ruleOrder EOF ;
    public final void entryRuleOrder() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleOrder EOF )
            // InternalMyDsl.g:230:1: ruleOrder EOF
            {
             before(grammarAccess.getOrderRule()); 
            pushFollow(FOLLOW_1);
            ruleOrder();

            state._fsp--;

             after(grammarAccess.getOrderRule()); 
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
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // InternalMyDsl.g:237:1: ruleOrder : ( ( rule__Order__Group__0 ) ) ;
    public final void ruleOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Order__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Order__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Order__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Order__Group__0 )
            {
             before(grammarAccess.getOrderAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Order__Group__0 )
            // InternalMyDsl.g:244:4: rule__Order__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Order__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getGroup()); 

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
    // $ANTLR end "ruleOrder"


    // $ANTLR start "entryRuleSavingOrder"
    // InternalMyDsl.g:253:1: entryRuleSavingOrder : ruleSavingOrder EOF ;
    public final void entryRuleSavingOrder() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleSavingOrder EOF )
            // InternalMyDsl.g:255:1: ruleSavingOrder EOF
            {
             before(grammarAccess.getSavingOrderRule()); 
            pushFollow(FOLLOW_1);
            ruleSavingOrder();

            state._fsp--;

             after(grammarAccess.getSavingOrderRule()); 
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
    // $ANTLR end "entryRuleSavingOrder"


    // $ANTLR start "ruleSavingOrder"
    // InternalMyDsl.g:262:1: ruleSavingOrder : ( ( rule__SavingOrder__Group__0 ) ) ;
    public final void ruleSavingOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__SavingOrder__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__SavingOrder__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__SavingOrder__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__SavingOrder__Group__0 )
            {
             before(grammarAccess.getSavingOrderAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__SavingOrder__Group__0 )
            // InternalMyDsl.g:269:4: rule__SavingOrder__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SavingOrder__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSavingOrderAccess().getGroup()); 

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
    // $ANTLR end "ruleSavingOrder"


    // $ANTLR start "entryRuleTokenBalance"
    // InternalMyDsl.g:278:1: entryRuleTokenBalance : ruleTokenBalance EOF ;
    public final void entryRuleTokenBalance() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleTokenBalance EOF )
            // InternalMyDsl.g:280:1: ruleTokenBalance EOF
            {
             before(grammarAccess.getTokenBalanceRule()); 
            pushFollow(FOLLOW_1);
            ruleTokenBalance();

            state._fsp--;

             after(grammarAccess.getTokenBalanceRule()); 
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
    // $ANTLR end "entryRuleTokenBalance"


    // $ANTLR start "ruleTokenBalance"
    // InternalMyDsl.g:287:1: ruleTokenBalance : ( ( rule__TokenBalance__Group__0 ) ) ;
    public final void ruleTokenBalance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__TokenBalance__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__TokenBalance__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__TokenBalance__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__TokenBalance__Group__0 )
            {
             before(grammarAccess.getTokenBalanceAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__TokenBalance__Group__0 )
            // InternalMyDsl.g:294:4: rule__TokenBalance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TokenBalance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTokenBalanceAccess().getGroup()); 

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
    // $ANTLR end "ruleTokenBalance"


    // $ANTLR start "entryRuleTransferRequest"
    // InternalMyDsl.g:303:1: entryRuleTransferRequest : ruleTransferRequest EOF ;
    public final void entryRuleTransferRequest() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleTransferRequest EOF )
            // InternalMyDsl.g:305:1: ruleTransferRequest EOF
            {
             before(grammarAccess.getTransferRequestRule()); 
            pushFollow(FOLLOW_1);
            ruleTransferRequest();

            state._fsp--;

             after(grammarAccess.getTransferRequestRule()); 
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
    // $ANTLR end "entryRuleTransferRequest"


    // $ANTLR start "ruleTransferRequest"
    // InternalMyDsl.g:312:1: ruleTransferRequest : ( ( rule__TransferRequest__Group__0 ) ) ;
    public final void ruleTransferRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__TransferRequest__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__TransferRequest__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__TransferRequest__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__TransferRequest__Group__0 )
            {
             before(grammarAccess.getTransferRequestAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__TransferRequest__Group__0 )
            // InternalMyDsl.g:319:4: rule__TransferRequest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TransferRequest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransferRequestAccess().getGroup()); 

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
    // $ANTLR end "ruleTransferRequest"


    // $ANTLR start "entryRuleEFloat"
    // InternalMyDsl.g:328:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleEFloat EOF )
            // InternalMyDsl.g:330:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalMyDsl.g:337:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__EFloat__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__EFloat__Group__0 )
            // InternalMyDsl.g:344:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleEDate"
    // InternalMyDsl.g:353:1: entryRuleEDate : ruleEDate EOF ;
    public final void entryRuleEDate() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleEDate EOF )
            // InternalMyDsl.g:355:1: ruleEDate EOF
            {
             before(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getEDateRule()); 
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
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalMyDsl.g:362:1: ruleEDate : ( 'EDate' ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( 'EDate' ) )
            // InternalMyDsl.g:367:2: ( 'EDate' )
            {
            // InternalMyDsl.g:367:2: ( 'EDate' )
            // InternalMyDsl.g:368:3: 'EDate'
            {
             before(grammarAccess.getEDateAccess().getEDateKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEDateAccess().getEDateKeyword()); 

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
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleEDouble"
    // InternalMyDsl.g:378:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleEDouble EOF )
            // InternalMyDsl.g:380:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalMyDsl.g:387:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__EDouble__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__EDouble__Group__0 )
            // InternalMyDsl.g:394:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:403:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleEInt EOF )
            // InternalMyDsl.g:405:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:412:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:419:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleSubSystemName"
    // InternalMyDsl.g:428:1: ruleSubSystemName : ( ( rule__SubSystemName__Alternatives ) ) ;
    public final void ruleSubSystemName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:432:1: ( ( ( rule__SubSystemName__Alternatives ) ) )
            // InternalMyDsl.g:433:2: ( ( rule__SubSystemName__Alternatives ) )
            {
            // InternalMyDsl.g:433:2: ( ( rule__SubSystemName__Alternatives ) )
            // InternalMyDsl.g:434:3: ( rule__SubSystemName__Alternatives )
            {
             before(grammarAccess.getSubSystemNameAccess().getAlternatives()); 
            // InternalMyDsl.g:435:3: ( rule__SubSystemName__Alternatives )
            // InternalMyDsl.g:435:4: rule__SubSystemName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SubSystemName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSubSystemNameAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSubSystemName"


    // $ANTLR start "ruleTransferType"
    // InternalMyDsl.g:444:1: ruleTransferType : ( ( rule__TransferType__Alternatives ) ) ;
    public final void ruleTransferType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:448:1: ( ( ( rule__TransferType__Alternatives ) ) )
            // InternalMyDsl.g:449:2: ( ( rule__TransferType__Alternatives ) )
            {
            // InternalMyDsl.g:449:2: ( ( rule__TransferType__Alternatives ) )
            // InternalMyDsl.g:450:3: ( rule__TransferType__Alternatives )
            {
             before(grammarAccess.getTransferTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:451:3: ( rule__TransferType__Alternatives )
            // InternalMyDsl.g:451:4: rule__TransferType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TransferType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransferTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTransferType"


    // $ANTLR start "ruleLeverageType"
    // InternalMyDsl.g:460:1: ruleLeverageType : ( ( rule__LeverageType__Alternatives ) ) ;
    public final void ruleLeverageType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:464:1: ( ( ( rule__LeverageType__Alternatives ) ) )
            // InternalMyDsl.g:465:2: ( ( rule__LeverageType__Alternatives ) )
            {
            // InternalMyDsl.g:465:2: ( ( rule__LeverageType__Alternatives ) )
            // InternalMyDsl.g:466:3: ( rule__LeverageType__Alternatives )
            {
             before(grammarAccess.getLeverageTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:467:3: ( rule__LeverageType__Alternatives )
            // InternalMyDsl.g:467:4: rule__LeverageType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LeverageType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLeverageTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLeverageType"


    // $ANTLR start "ruleOrderType"
    // InternalMyDsl.g:476:1: ruleOrderType : ( ( rule__OrderType__Alternatives ) ) ;
    public final void ruleOrderType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:480:1: ( ( ( rule__OrderType__Alternatives ) ) )
            // InternalMyDsl.g:481:2: ( ( rule__OrderType__Alternatives ) )
            {
            // InternalMyDsl.g:481:2: ( ( rule__OrderType__Alternatives ) )
            // InternalMyDsl.g:482:3: ( rule__OrderType__Alternatives )
            {
             before(grammarAccess.getOrderTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:483:3: ( rule__OrderType__Alternatives )
            // InternalMyDsl.g:483:4: rule__OrderType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OrderType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrderTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOrderType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:491:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:495:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:496:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:496:2: ( RULE_STRING )
                    // InternalMyDsl.g:497:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:502:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:502:2: ( RULE_ID )
                    // InternalMyDsl.g:503:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalMyDsl.g:512:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:517:2: ( 'E' )
                    {
                    // InternalMyDsl.g:517:2: ( 'E' )
                    // InternalMyDsl.g:518:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:523:2: ( 'e' )
                    {
                    // InternalMyDsl.g:523:2: ( 'e' )
                    // InternalMyDsl.g:524:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalMyDsl.g:533:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:537:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:538:2: ( 'E' )
                    {
                    // InternalMyDsl.g:538:2: ( 'E' )
                    // InternalMyDsl.g:539:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:544:2: ( 'e' )
                    {
                    // InternalMyDsl.g:544:2: ( 'e' )
                    // InternalMyDsl.g:545:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__SubSystemName__Alternatives"
    // InternalMyDsl.g:554:1: rule__SubSystemName__Alternatives : ( ( ( 'Spot' ) ) | ( ( 'Future' ) ) | ( ( 'Margin' ) ) | ( ( 'Saving' ) ) );
    public final void rule__SubSystemName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:558:1: ( ( ( 'Spot' ) ) | ( ( 'Future' ) ) | ( ( 'Margin' ) ) | ( ( 'Saving' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:559:2: ( ( 'Spot' ) )
                    {
                    // InternalMyDsl.g:559:2: ( ( 'Spot' ) )
                    // InternalMyDsl.g:560:3: ( 'Spot' )
                    {
                     before(grammarAccess.getSubSystemNameAccess().getSpotEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:561:3: ( 'Spot' )
                    // InternalMyDsl.g:561:4: 'Spot'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSubSystemNameAccess().getSpotEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:565:2: ( ( 'Future' ) )
                    {
                    // InternalMyDsl.g:565:2: ( ( 'Future' ) )
                    // InternalMyDsl.g:566:3: ( 'Future' )
                    {
                     before(grammarAccess.getSubSystemNameAccess().getFutureEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:567:3: ( 'Future' )
                    // InternalMyDsl.g:567:4: 'Future'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSubSystemNameAccess().getFutureEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:571:2: ( ( 'Margin' ) )
                    {
                    // InternalMyDsl.g:571:2: ( ( 'Margin' ) )
                    // InternalMyDsl.g:572:3: ( 'Margin' )
                    {
                     before(grammarAccess.getSubSystemNameAccess().getMarginEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:573:3: ( 'Margin' )
                    // InternalMyDsl.g:573:4: 'Margin'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSubSystemNameAccess().getMarginEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:577:2: ( ( 'Saving' ) )
                    {
                    // InternalMyDsl.g:577:2: ( ( 'Saving' ) )
                    // InternalMyDsl.g:578:3: ( 'Saving' )
                    {
                     before(grammarAccess.getSubSystemNameAccess().getSavingEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:579:3: ( 'Saving' )
                    // InternalMyDsl.g:579:4: 'Saving'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getSubSystemNameAccess().getSavingEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__SubSystemName__Alternatives"


    // $ANTLR start "rule__TransferType__Alternatives"
    // InternalMyDsl.g:587:1: rule__TransferType__Alternatives : ( ( ( 'IntraExchange' ) ) | ( ( 'ExtraExchange' ) ) );
    public final void rule__TransferType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:1: ( ( ( 'IntraExchange' ) ) | ( ( 'ExtraExchange' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:592:2: ( ( 'IntraExchange' ) )
                    {
                    // InternalMyDsl.g:592:2: ( ( 'IntraExchange' ) )
                    // InternalMyDsl.g:593:3: ( 'IntraExchange' )
                    {
                     before(grammarAccess.getTransferTypeAccess().getIntraExchangeEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:594:3: ( 'IntraExchange' )
                    // InternalMyDsl.g:594:4: 'IntraExchange'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransferTypeAccess().getIntraExchangeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:598:2: ( ( 'ExtraExchange' ) )
                    {
                    // InternalMyDsl.g:598:2: ( ( 'ExtraExchange' ) )
                    // InternalMyDsl.g:599:3: ( 'ExtraExchange' )
                    {
                     before(grammarAccess.getTransferTypeAccess().getExtraExchangeEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:600:3: ( 'ExtraExchange' )
                    // InternalMyDsl.g:600:4: 'ExtraExchange'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTransferTypeAccess().getExtraExchangeEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__TransferType__Alternatives"


    // $ANTLR start "rule__LeverageType__Alternatives"
    // InternalMyDsl.g:608:1: rule__LeverageType__Alternatives : ( ( ( '_1x' ) ) | ( ( '_2x' ) ) | ( ( '_5x' ) ) | ( ( '_10x' ) ) );
    public final void rule__LeverageType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:612:1: ( ( ( '_1x' ) ) | ( ( '_2x' ) ) | ( ( '_5x' ) ) | ( ( '_10x' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            case 23:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:613:2: ( ( '_1x' ) )
                    {
                    // InternalMyDsl.g:613:2: ( ( '_1x' ) )
                    // InternalMyDsl.g:614:3: ( '_1x' )
                    {
                     before(grammarAccess.getLeverageTypeAccess().get_1xEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:615:3: ( '_1x' )
                    // InternalMyDsl.g:615:4: '_1x'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getLeverageTypeAccess().get_1xEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:619:2: ( ( '_2x' ) )
                    {
                    // InternalMyDsl.g:619:2: ( ( '_2x' ) )
                    // InternalMyDsl.g:620:3: ( '_2x' )
                    {
                     before(grammarAccess.getLeverageTypeAccess().get_2xEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:621:3: ( '_2x' )
                    // InternalMyDsl.g:621:4: '_2x'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getLeverageTypeAccess().get_2xEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:625:2: ( ( '_5x' ) )
                    {
                    // InternalMyDsl.g:625:2: ( ( '_5x' ) )
                    // InternalMyDsl.g:626:3: ( '_5x' )
                    {
                     before(grammarAccess.getLeverageTypeAccess().get_5xEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:627:3: ( '_5x' )
                    // InternalMyDsl.g:627:4: '_5x'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getLeverageTypeAccess().get_5xEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:631:2: ( ( '_10x' ) )
                    {
                    // InternalMyDsl.g:631:2: ( ( '_10x' ) )
                    // InternalMyDsl.g:632:3: ( '_10x' )
                    {
                     before(grammarAccess.getLeverageTypeAccess().get_10xEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:633:3: ( '_10x' )
                    // InternalMyDsl.g:633:4: '_10x'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getLeverageTypeAccess().get_10xEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__LeverageType__Alternatives"


    // $ANTLR start "rule__OrderType__Alternatives"
    // InternalMyDsl.g:641:1: rule__OrderType__Alternatives : ( ( ( 'buy' ) ) | ( ( 'sell' ) ) | ( ( 'leverageLong' ) ) | ( ( 'leverageShort' ) ) );
    public final void rule__OrderType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:645:1: ( ( ( 'buy' ) ) | ( ( 'sell' ) ) | ( ( 'leverageLong' ) ) | ( ( 'leverageShort' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            case 27:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:646:2: ( ( 'buy' ) )
                    {
                    // InternalMyDsl.g:646:2: ( ( 'buy' ) )
                    // InternalMyDsl.g:647:3: ( 'buy' )
                    {
                     before(grammarAccess.getOrderTypeAccess().getBuyEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:648:3: ( 'buy' )
                    // InternalMyDsl.g:648:4: 'buy'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrderTypeAccess().getBuyEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:652:2: ( ( 'sell' ) )
                    {
                    // InternalMyDsl.g:652:2: ( ( 'sell' ) )
                    // InternalMyDsl.g:653:3: ( 'sell' )
                    {
                     before(grammarAccess.getOrderTypeAccess().getSellEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:654:3: ( 'sell' )
                    // InternalMyDsl.g:654:4: 'sell'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrderTypeAccess().getSellEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:658:2: ( ( 'leverageLong' ) )
                    {
                    // InternalMyDsl.g:658:2: ( ( 'leverageLong' ) )
                    // InternalMyDsl.g:659:3: ( 'leverageLong' )
                    {
                     before(grammarAccess.getOrderTypeAccess().getLeverageLongEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:660:3: ( 'leverageLong' )
                    // InternalMyDsl.g:660:4: 'leverageLong'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrderTypeAccess().getLeverageLongEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:664:2: ( ( 'leverageShort' ) )
                    {
                    // InternalMyDsl.g:664:2: ( ( 'leverageShort' ) )
                    // InternalMyDsl.g:665:3: ( 'leverageShort' )
                    {
                     before(grammarAccess.getOrderTypeAccess().getLeverageShortEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:666:3: ( 'leverageShort' )
                    // InternalMyDsl.g:666:4: 'leverageShort'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrderTypeAccess().getLeverageShortEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__OrderType__Alternatives"


    // $ANTLR start "rule__CryptoExchange__Group__0"
    // InternalMyDsl.g:674:1: rule__CryptoExchange__Group__0 : rule__CryptoExchange__Group__0__Impl rule__CryptoExchange__Group__1 ;
    public final void rule__CryptoExchange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:678:1: ( rule__CryptoExchange__Group__0__Impl rule__CryptoExchange__Group__1 )
            // InternalMyDsl.g:679:2: rule__CryptoExchange__Group__0__Impl rule__CryptoExchange__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CryptoExchange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__1();

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
    // $ANTLR end "rule__CryptoExchange__Group__0"


    // $ANTLR start "rule__CryptoExchange__Group__0__Impl"
    // InternalMyDsl.g:686:1: rule__CryptoExchange__Group__0__Impl : ( 'cryptoExchange' ) ;
    public final void rule__CryptoExchange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:690:1: ( ( 'cryptoExchange' ) )
            // InternalMyDsl.g:691:1: ( 'cryptoExchange' )
            {
            // InternalMyDsl.g:691:1: ( 'cryptoExchange' )
            // InternalMyDsl.g:692:2: 'cryptoExchange'
            {
             before(grammarAccess.getCryptoExchangeAccess().getCryptoExchangeKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCryptoExchangeAccess().getCryptoExchangeKeyword_0()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__0__Impl"


    // $ANTLR start "rule__CryptoExchange__Group__1"
    // InternalMyDsl.g:701:1: rule__CryptoExchange__Group__1 : rule__CryptoExchange__Group__1__Impl rule__CryptoExchange__Group__2 ;
    public final void rule__CryptoExchange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:705:1: ( rule__CryptoExchange__Group__1__Impl rule__CryptoExchange__Group__2 )
            // InternalMyDsl.g:706:2: rule__CryptoExchange__Group__1__Impl rule__CryptoExchange__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CryptoExchange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__2();

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
    // $ANTLR end "rule__CryptoExchange__Group__1"


    // $ANTLR start "rule__CryptoExchange__Group__1__Impl"
    // InternalMyDsl.g:713:1: rule__CryptoExchange__Group__1__Impl : ( ( rule__CryptoExchange__NameAssignment_1 ) ) ;
    public final void rule__CryptoExchange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:717:1: ( ( ( rule__CryptoExchange__NameAssignment_1 ) ) )
            // InternalMyDsl.g:718:1: ( ( rule__CryptoExchange__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:718:1: ( ( rule__CryptoExchange__NameAssignment_1 ) )
            // InternalMyDsl.g:719:2: ( rule__CryptoExchange__NameAssignment_1 )
            {
             before(grammarAccess.getCryptoExchangeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:720:2: ( rule__CryptoExchange__NameAssignment_1 )
            // InternalMyDsl.g:720:3: rule__CryptoExchange__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CryptoExchange__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCryptoExchangeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__1__Impl"


    // $ANTLR start "rule__CryptoExchange__Group__2"
    // InternalMyDsl.g:728:1: rule__CryptoExchange__Group__2 : rule__CryptoExchange__Group__2__Impl rule__CryptoExchange__Group__3 ;
    public final void rule__CryptoExchange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:732:1: ( rule__CryptoExchange__Group__2__Impl rule__CryptoExchange__Group__3 )
            // InternalMyDsl.g:733:2: rule__CryptoExchange__Group__2__Impl rule__CryptoExchange__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__CryptoExchange__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__3();

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
    // $ANTLR end "rule__CryptoExchange__Group__2"


    // $ANTLR start "rule__CryptoExchange__Group__2__Impl"
    // InternalMyDsl.g:740:1: rule__CryptoExchange__Group__2__Impl : ( '{' ) ;
    public final void rule__CryptoExchange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:744:1: ( ( '{' ) )
            // InternalMyDsl.g:745:1: ( '{' )
            {
            // InternalMyDsl.g:745:1: ( '{' )
            // InternalMyDsl.g:746:2: '{'
            {
             before(grammarAccess.getCryptoExchangeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCryptoExchangeAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__2__Impl"


    // $ANTLR start "rule__CryptoExchange__Group__3"
    // InternalMyDsl.g:755:1: rule__CryptoExchange__Group__3 : rule__CryptoExchange__Group__3__Impl rule__CryptoExchange__Group__4 ;
    public final void rule__CryptoExchange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:759:1: ( rule__CryptoExchange__Group__3__Impl rule__CryptoExchange__Group__4 )
            // InternalMyDsl.g:760:2: rule__CryptoExchange__Group__3__Impl rule__CryptoExchange__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__CryptoExchange__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__4();

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
    // $ANTLR end "rule__CryptoExchange__Group__3"


    // $ANTLR start "rule__CryptoExchange__Group__3__Impl"
    // InternalMyDsl.g:767:1: rule__CryptoExchange__Group__3__Impl : ( ( rule__CryptoExchange__Group_3__0 )? ) ;
    public final void rule__CryptoExchange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:771:1: ( ( ( rule__CryptoExchange__Group_3__0 )? ) )
            // InternalMyDsl.g:772:1: ( ( rule__CryptoExchange__Group_3__0 )? )
            {
            // InternalMyDsl.g:772:1: ( ( rule__CryptoExchange__Group_3__0 )? )
            // InternalMyDsl.g:773:2: ( rule__CryptoExchange__Group_3__0 )?
            {
             before(grammarAccess.getCryptoExchangeAccess().getGroup_3()); 
            // InternalMyDsl.g:774:2: ( rule__CryptoExchange__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==34) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:774:3: rule__CryptoExchange__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CryptoExchange__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCryptoExchangeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__3__Impl"


    // $ANTLR start "rule__CryptoExchange__Group__4"
    // InternalMyDsl.g:782:1: rule__CryptoExchange__Group__4 : rule__CryptoExchange__Group__4__Impl rule__CryptoExchange__Group__5 ;
    public final void rule__CryptoExchange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:786:1: ( rule__CryptoExchange__Group__4__Impl rule__CryptoExchange__Group__5 )
            // InternalMyDsl.g:787:2: rule__CryptoExchange__Group__4__Impl rule__CryptoExchange__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__CryptoExchange__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__5();

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
    // $ANTLR end "rule__CryptoExchange__Group__4"


    // $ANTLR start "rule__CryptoExchange__Group__4__Impl"
    // InternalMyDsl.g:794:1: rule__CryptoExchange__Group__4__Impl : ( ( rule__CryptoExchange__Group_4__0 )? ) ;
    public final void rule__CryptoExchange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:798:1: ( ( ( rule__CryptoExchange__Group_4__0 )? ) )
            // InternalMyDsl.g:799:1: ( ( rule__CryptoExchange__Group_4__0 )? )
            {
            // InternalMyDsl.g:799:1: ( ( rule__CryptoExchange__Group_4__0 )? )
            // InternalMyDsl.g:800:2: ( rule__CryptoExchange__Group_4__0 )?
            {
             before(grammarAccess.getCryptoExchangeAccess().getGroup_4()); 
            // InternalMyDsl.g:801:2: ( rule__CryptoExchange__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:801:3: rule__CryptoExchange__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CryptoExchange__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCryptoExchangeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__4__Impl"


    // $ANTLR start "rule__CryptoExchange__Group__5"
    // InternalMyDsl.g:809:1: rule__CryptoExchange__Group__5 : rule__CryptoExchange__Group__5__Impl rule__CryptoExchange__Group__6 ;
    public final void rule__CryptoExchange__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:813:1: ( rule__CryptoExchange__Group__5__Impl rule__CryptoExchange__Group__6 )
            // InternalMyDsl.g:814:2: rule__CryptoExchange__Group__5__Impl rule__CryptoExchange__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__CryptoExchange__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__6();

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
    // $ANTLR end "rule__CryptoExchange__Group__5"


    // $ANTLR start "rule__CryptoExchange__Group__5__Impl"
    // InternalMyDsl.g:821:1: rule__CryptoExchange__Group__5__Impl : ( 'SubSystem' ) ;
    public final void rule__CryptoExchange__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:825:1: ( ( 'SubSystem' ) )
            // InternalMyDsl.g:826:1: ( 'SubSystem' )
            {
            // InternalMyDsl.g:826:1: ( 'SubSystem' )
            // InternalMyDsl.g:827:2: 'SubSystem'
            {
             before(grammarAccess.getCryptoExchangeAccess().getSubSystemKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCryptoExchangeAccess().getSubSystemKeyword_5()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__5__Impl"


    // $ANTLR start "rule__CryptoExchange__Group__6"
    // InternalMyDsl.g:836:1: rule__CryptoExchange__Group__6 : rule__CryptoExchange__Group__6__Impl rule__CryptoExchange__Group__7 ;
    public final void rule__CryptoExchange__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:840:1: ( rule__CryptoExchange__Group__6__Impl rule__CryptoExchange__Group__7 )
            // InternalMyDsl.g:841:2: rule__CryptoExchange__Group__6__Impl rule__CryptoExchange__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__CryptoExchange__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__7();

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
    // $ANTLR end "rule__CryptoExchange__Group__6"


    // $ANTLR start "rule__CryptoExchange__Group__6__Impl"
    // InternalMyDsl.g:848:1: rule__CryptoExchange__Group__6__Impl : ( '{' ) ;
    public final void rule__CryptoExchange__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:852:1: ( ( '{' ) )
            // InternalMyDsl.g:853:1: ( '{' )
            {
            // InternalMyDsl.g:853:1: ( '{' )
            // InternalMyDsl.g:854:2: '{'
            {
             before(grammarAccess.getCryptoExchangeAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCryptoExchangeAccess().getLeftCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__6__Impl"


    // $ANTLR start "rule__CryptoExchange__Group__7"
    // InternalMyDsl.g:863:1: rule__CryptoExchange__Group__7 : rule__CryptoExchange__Group__7__Impl rule__CryptoExchange__Group__8 ;
    public final void rule__CryptoExchange__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:867:1: ( rule__CryptoExchange__Group__7__Impl rule__CryptoExchange__Group__8 )
            // InternalMyDsl.g:868:2: rule__CryptoExchange__Group__7__Impl rule__CryptoExchange__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__CryptoExchange__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__8();

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
    // $ANTLR end "rule__CryptoExchange__Group__7"


    // $ANTLR start "rule__CryptoExchange__Group__7__Impl"
    // InternalMyDsl.g:875:1: rule__CryptoExchange__Group__7__Impl : ( ( rule__CryptoExchange__SubSystemAssignment_7 ) ) ;
    public final void rule__CryptoExchange__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:879:1: ( ( ( rule__CryptoExchange__SubSystemAssignment_7 ) ) )
            // InternalMyDsl.g:880:1: ( ( rule__CryptoExchange__SubSystemAssignment_7 ) )
            {
            // InternalMyDsl.g:880:1: ( ( rule__CryptoExchange__SubSystemAssignment_7 ) )
            // InternalMyDsl.g:881:2: ( rule__CryptoExchange__SubSystemAssignment_7 )
            {
             before(grammarAccess.getCryptoExchangeAccess().getSubSystemAssignment_7()); 
            // InternalMyDsl.g:882:2: ( rule__CryptoExchange__SubSystemAssignment_7 )
            // InternalMyDsl.g:882:3: rule__CryptoExchange__SubSystemAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__CryptoExchange__SubSystemAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCryptoExchangeAccess().getSubSystemAssignment_7()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__7__Impl"


    // $ANTLR start "rule__CryptoExchange__Group__8"
    // InternalMyDsl.g:890:1: rule__CryptoExchange__Group__8 : rule__CryptoExchange__Group__8__Impl rule__CryptoExchange__Group__9 ;
    public final void rule__CryptoExchange__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:894:1: ( rule__CryptoExchange__Group__8__Impl rule__CryptoExchange__Group__9 )
            // InternalMyDsl.g:895:2: rule__CryptoExchange__Group__8__Impl rule__CryptoExchange__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__CryptoExchange__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__9();

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
    // $ANTLR end "rule__CryptoExchange__Group__8"


    // $ANTLR start "rule__CryptoExchange__Group__8__Impl"
    // InternalMyDsl.g:902:1: rule__CryptoExchange__Group__8__Impl : ( ( rule__CryptoExchange__Group_8__0 )* ) ;
    public final void rule__CryptoExchange__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:906:1: ( ( ( rule__CryptoExchange__Group_8__0 )* ) )
            // InternalMyDsl.g:907:1: ( ( rule__CryptoExchange__Group_8__0 )* )
            {
            // InternalMyDsl.g:907:1: ( ( rule__CryptoExchange__Group_8__0 )* )
            // InternalMyDsl.g:908:2: ( rule__CryptoExchange__Group_8__0 )*
            {
             before(grammarAccess.getCryptoExchangeAccess().getGroup_8()); 
            // InternalMyDsl.g:909:2: ( rule__CryptoExchange__Group_8__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:909:3: rule__CryptoExchange__Group_8__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CryptoExchange__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getCryptoExchangeAccess().getGroup_8()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__8__Impl"


    // $ANTLR start "rule__CryptoExchange__Group__9"
    // InternalMyDsl.g:917:1: rule__CryptoExchange__Group__9 : rule__CryptoExchange__Group__9__Impl rule__CryptoExchange__Group__10 ;
    public final void rule__CryptoExchange__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:921:1: ( rule__CryptoExchange__Group__9__Impl rule__CryptoExchange__Group__10 )
            // InternalMyDsl.g:922:2: rule__CryptoExchange__Group__9__Impl rule__CryptoExchange__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__CryptoExchange__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__10();

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
    // $ANTLR end "rule__CryptoExchange__Group__9"


    // $ANTLR start "rule__CryptoExchange__Group__9__Impl"
    // InternalMyDsl.g:929:1: rule__CryptoExchange__Group__9__Impl : ( '}' ) ;
    public final void rule__CryptoExchange__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:933:1: ( ( '}' ) )
            // InternalMyDsl.g:934:1: ( '}' )
            {
            // InternalMyDsl.g:934:1: ( '}' )
            // InternalMyDsl.g:935:2: '}'
            {
             before(grammarAccess.getCryptoExchangeAccess().getRightCurlyBracketKeyword_9()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCryptoExchangeAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__9__Impl"


    // $ANTLR start "rule__CryptoExchange__Group__10"
    // InternalMyDsl.g:944:1: rule__CryptoExchange__Group__10 : rule__CryptoExchange__Group__10__Impl rule__CryptoExchange__Group__11 ;
    public final void rule__CryptoExchange__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:948:1: ( rule__CryptoExchange__Group__10__Impl rule__CryptoExchange__Group__11 )
            // InternalMyDsl.g:949:2: rule__CryptoExchange__Group__10__Impl rule__CryptoExchange__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__CryptoExchange__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__11();

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
    // $ANTLR end "rule__CryptoExchange__Group__10"


    // $ANTLR start "rule__CryptoExchange__Group__10__Impl"
    // InternalMyDsl.g:956:1: rule__CryptoExchange__Group__10__Impl : ( 'Tokens' ) ;
    public final void rule__CryptoExchange__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:960:1: ( ( 'Tokens' ) )
            // InternalMyDsl.g:961:1: ( 'Tokens' )
            {
            // InternalMyDsl.g:961:1: ( 'Tokens' )
            // InternalMyDsl.g:962:2: 'Tokens'
            {
             before(grammarAccess.getCryptoExchangeAccess().getTokensKeyword_10()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCryptoExchangeAccess().getTokensKeyword_10()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__10__Impl"


    // $ANTLR start "rule__CryptoExchange__Group__11"
    // InternalMyDsl.g:971:1: rule__CryptoExchange__Group__11 : rule__CryptoExchange__Group__11__Impl rule__CryptoExchange__Group__12 ;
    public final void rule__CryptoExchange__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:975:1: ( rule__CryptoExchange__Group__11__Impl rule__CryptoExchange__Group__12 )
            // InternalMyDsl.g:976:2: rule__CryptoExchange__Group__11__Impl rule__CryptoExchange__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__CryptoExchange__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__12();

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
    // $ANTLR end "rule__CryptoExchange__Group__11"


    // $ANTLR start "rule__CryptoExchange__Group__11__Impl"
    // InternalMyDsl.g:983:1: rule__CryptoExchange__Group__11__Impl : ( '{' ) ;
    public final void rule__CryptoExchange__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:987:1: ( ( '{' ) )
            // InternalMyDsl.g:988:1: ( '{' )
            {
            // InternalMyDsl.g:988:1: ( '{' )
            // InternalMyDsl.g:989:2: '{'
            {
             before(grammarAccess.getCryptoExchangeAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCryptoExchangeAccess().getLeftCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__11__Impl"


    // $ANTLR start "rule__CryptoExchange__Group__12"
    // InternalMyDsl.g:998:1: rule__CryptoExchange__Group__12 : rule__CryptoExchange__Group__12__Impl rule__CryptoExchange__Group__13 ;
    public final void rule__CryptoExchange__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1002:1: ( rule__CryptoExchange__Group__12__Impl rule__CryptoExchange__Group__13 )
            // InternalMyDsl.g:1003:2: rule__CryptoExchange__Group__12__Impl rule__CryptoExchange__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__CryptoExchange__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__13();

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
    // $ANTLR end "rule__CryptoExchange__Group__12"


    // $ANTLR start "rule__CryptoExchange__Group__12__Impl"
    // InternalMyDsl.g:1010:1: rule__CryptoExchange__Group__12__Impl : ( ( rule__CryptoExchange__TokensAssignment_12 ) ) ;
    public final void rule__CryptoExchange__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1014:1: ( ( ( rule__CryptoExchange__TokensAssignment_12 ) ) )
            // InternalMyDsl.g:1015:1: ( ( rule__CryptoExchange__TokensAssignment_12 ) )
            {
            // InternalMyDsl.g:1015:1: ( ( rule__CryptoExchange__TokensAssignment_12 ) )
            // InternalMyDsl.g:1016:2: ( rule__CryptoExchange__TokensAssignment_12 )
            {
             before(grammarAccess.getCryptoExchangeAccess().getTokensAssignment_12()); 
            // InternalMyDsl.g:1017:2: ( rule__CryptoExchange__TokensAssignment_12 )
            // InternalMyDsl.g:1017:3: rule__CryptoExchange__TokensAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__CryptoExchange__TokensAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getCryptoExchangeAccess().getTokensAssignment_12()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__12__Impl"


    // $ANTLR start "rule__CryptoExchange__Group__13"
    // InternalMyDsl.g:1025:1: rule__CryptoExchange__Group__13 : rule__CryptoExchange__Group__13__Impl rule__CryptoExchange__Group__14 ;
    public final void rule__CryptoExchange__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1029:1: ( rule__CryptoExchange__Group__13__Impl rule__CryptoExchange__Group__14 )
            // InternalMyDsl.g:1030:2: rule__CryptoExchange__Group__13__Impl rule__CryptoExchange__Group__14
            {
            pushFollow(FOLLOW_7);
            rule__CryptoExchange__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__14();

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
    // $ANTLR end "rule__CryptoExchange__Group__13"


    // $ANTLR start "rule__CryptoExchange__Group__13__Impl"
    // InternalMyDsl.g:1037:1: rule__CryptoExchange__Group__13__Impl : ( ( rule__CryptoExchange__Group_13__0 )* ) ;
    public final void rule__CryptoExchange__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:1: ( ( ( rule__CryptoExchange__Group_13__0 )* ) )
            // InternalMyDsl.g:1042:1: ( ( rule__CryptoExchange__Group_13__0 )* )
            {
            // InternalMyDsl.g:1042:1: ( ( rule__CryptoExchange__Group_13__0 )* )
            // InternalMyDsl.g:1043:2: ( rule__CryptoExchange__Group_13__0 )*
            {
             before(grammarAccess.getCryptoExchangeAccess().getGroup_13()); 
            // InternalMyDsl.g:1044:2: ( rule__CryptoExchange__Group_13__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==36) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1044:3: rule__CryptoExchange__Group_13__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CryptoExchange__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getCryptoExchangeAccess().getGroup_13()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__13__Impl"


    // $ANTLR start "rule__CryptoExchange__Group__14"
    // InternalMyDsl.g:1052:1: rule__CryptoExchange__Group__14 : rule__CryptoExchange__Group__14__Impl rule__CryptoExchange__Group__15 ;
    public final void rule__CryptoExchange__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1056:1: ( rule__CryptoExchange__Group__14__Impl rule__CryptoExchange__Group__15 )
            // InternalMyDsl.g:1057:2: rule__CryptoExchange__Group__14__Impl rule__CryptoExchange__Group__15
            {
            pushFollow(FOLLOW_11);
            rule__CryptoExchange__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__15();

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
    // $ANTLR end "rule__CryptoExchange__Group__14"


    // $ANTLR start "rule__CryptoExchange__Group__14__Impl"
    // InternalMyDsl.g:1064:1: rule__CryptoExchange__Group__14__Impl : ( '}' ) ;
    public final void rule__CryptoExchange__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1068:1: ( ( '}' ) )
            // InternalMyDsl.g:1069:1: ( '}' )
            {
            // InternalMyDsl.g:1069:1: ( '}' )
            // InternalMyDsl.g:1070:2: '}'
            {
             before(grammarAccess.getCryptoExchangeAccess().getRightCurlyBracketKeyword_14()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCryptoExchangeAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__14__Impl"


    // $ANTLR start "rule__CryptoExchange__Group__15"
    // InternalMyDsl.g:1079:1: rule__CryptoExchange__Group__15 : rule__CryptoExchange__Group__15__Impl rule__CryptoExchange__Group__16 ;
    public final void rule__CryptoExchange__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1083:1: ( rule__CryptoExchange__Group__15__Impl rule__CryptoExchange__Group__16 )
            // InternalMyDsl.g:1084:2: rule__CryptoExchange__Group__15__Impl rule__CryptoExchange__Group__16
            {
            pushFollow(FOLLOW_4);
            rule__CryptoExchange__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__16();

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
    // $ANTLR end "rule__CryptoExchange__Group__15"


    // $ANTLR start "rule__CryptoExchange__Group__15__Impl"
    // InternalMyDsl.g:1091:1: rule__CryptoExchange__Group__15__Impl : ( 'TokenNetworks' ) ;
    public final void rule__CryptoExchange__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1095:1: ( ( 'TokenNetworks' ) )
            // InternalMyDsl.g:1096:1: ( 'TokenNetworks' )
            {
            // InternalMyDsl.g:1096:1: ( 'TokenNetworks' )
            // InternalMyDsl.g:1097:2: 'TokenNetworks'
            {
             before(grammarAccess.getCryptoExchangeAccess().getTokenNetworksKeyword_15()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCryptoExchangeAccess().getTokenNetworksKeyword_15()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__15__Impl"


    // $ANTLR start "rule__CryptoExchange__Group__16"
    // InternalMyDsl.g:1106:1: rule__CryptoExchange__Group__16 : rule__CryptoExchange__Group__16__Impl rule__CryptoExchange__Group__17 ;
    public final void rule__CryptoExchange__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1110:1: ( rule__CryptoExchange__Group__16__Impl rule__CryptoExchange__Group__17 )
            // InternalMyDsl.g:1111:2: rule__CryptoExchange__Group__16__Impl rule__CryptoExchange__Group__17
            {
            pushFollow(FOLLOW_12);
            rule__CryptoExchange__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__17();

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
    // $ANTLR end "rule__CryptoExchange__Group__16"


    // $ANTLR start "rule__CryptoExchange__Group__16__Impl"
    // InternalMyDsl.g:1118:1: rule__CryptoExchange__Group__16__Impl : ( '{' ) ;
    public final void rule__CryptoExchange__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1122:1: ( ( '{' ) )
            // InternalMyDsl.g:1123:1: ( '{' )
            {
            // InternalMyDsl.g:1123:1: ( '{' )
            // InternalMyDsl.g:1124:2: '{'
            {
             before(grammarAccess.getCryptoExchangeAccess().getLeftCurlyBracketKeyword_16()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCryptoExchangeAccess().getLeftCurlyBracketKeyword_16()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__16__Impl"


    // $ANTLR start "rule__CryptoExchange__Group__17"
    // InternalMyDsl.g:1133:1: rule__CryptoExchange__Group__17 : rule__CryptoExchange__Group__17__Impl rule__CryptoExchange__Group__18 ;
    public final void rule__CryptoExchange__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1137:1: ( rule__CryptoExchange__Group__17__Impl rule__CryptoExchange__Group__18 )
            // InternalMyDsl.g:1138:2: rule__CryptoExchange__Group__17__Impl rule__CryptoExchange__Group__18
            {
            pushFollow(FOLLOW_7);
            rule__CryptoExchange__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__18();

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
    // $ANTLR end "rule__CryptoExchange__Group__17"


    // $ANTLR start "rule__CryptoExchange__Group__17__Impl"
    // InternalMyDsl.g:1145:1: rule__CryptoExchange__Group__17__Impl : ( ( rule__CryptoExchange__TokenNetworksAssignment_17 ) ) ;
    public final void rule__CryptoExchange__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1149:1: ( ( ( rule__CryptoExchange__TokenNetworksAssignment_17 ) ) )
            // InternalMyDsl.g:1150:1: ( ( rule__CryptoExchange__TokenNetworksAssignment_17 ) )
            {
            // InternalMyDsl.g:1150:1: ( ( rule__CryptoExchange__TokenNetworksAssignment_17 ) )
            // InternalMyDsl.g:1151:2: ( rule__CryptoExchange__TokenNetworksAssignment_17 )
            {
             before(grammarAccess.getCryptoExchangeAccess().getTokenNetworksAssignment_17()); 
            // InternalMyDsl.g:1152:2: ( rule__CryptoExchange__TokenNetworksAssignment_17 )
            // InternalMyDsl.g:1152:3: rule__CryptoExchange__TokenNetworksAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__CryptoExchange__TokenNetworksAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getCryptoExchangeAccess().getTokenNetworksAssignment_17()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__17__Impl"


    // $ANTLR start "rule__CryptoExchange__Group__18"
    // InternalMyDsl.g:1160:1: rule__CryptoExchange__Group__18 : rule__CryptoExchange__Group__18__Impl rule__CryptoExchange__Group__19 ;
    public final void rule__CryptoExchange__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1164:1: ( rule__CryptoExchange__Group__18__Impl rule__CryptoExchange__Group__19 )
            // InternalMyDsl.g:1165:2: rule__CryptoExchange__Group__18__Impl rule__CryptoExchange__Group__19
            {
            pushFollow(FOLLOW_7);
            rule__CryptoExchange__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__19();

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
    // $ANTLR end "rule__CryptoExchange__Group__18"


    // $ANTLR start "rule__CryptoExchange__Group__18__Impl"
    // InternalMyDsl.g:1172:1: rule__CryptoExchange__Group__18__Impl : ( ( rule__CryptoExchange__Group_18__0 )* ) ;
    public final void rule__CryptoExchange__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1176:1: ( ( ( rule__CryptoExchange__Group_18__0 )* ) )
            // InternalMyDsl.g:1177:1: ( ( rule__CryptoExchange__Group_18__0 )* )
            {
            // InternalMyDsl.g:1177:1: ( ( rule__CryptoExchange__Group_18__0 )* )
            // InternalMyDsl.g:1178:2: ( rule__CryptoExchange__Group_18__0 )*
            {
             before(grammarAccess.getCryptoExchangeAccess().getGroup_18()); 
            // InternalMyDsl.g:1179:2: ( rule__CryptoExchange__Group_18__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1179:3: rule__CryptoExchange__Group_18__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__CryptoExchange__Group_18__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getCryptoExchangeAccess().getGroup_18()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__18__Impl"


    // $ANTLR start "rule__CryptoExchange__Group__19"
    // InternalMyDsl.g:1187:1: rule__CryptoExchange__Group__19 : rule__CryptoExchange__Group__19__Impl rule__CryptoExchange__Group__20 ;
    public final void rule__CryptoExchange__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1191:1: ( rule__CryptoExchange__Group__19__Impl rule__CryptoExchange__Group__20 )
            // InternalMyDsl.g:1192:2: rule__CryptoExchange__Group__19__Impl rule__CryptoExchange__Group__20
            {
            pushFollow(FOLLOW_13);
            rule__CryptoExchange__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__20();

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
    // $ANTLR end "rule__CryptoExchange__Group__19"


    // $ANTLR start "rule__CryptoExchange__Group__19__Impl"
    // InternalMyDsl.g:1199:1: rule__CryptoExchange__Group__19__Impl : ( '}' ) ;
    public final void rule__CryptoExchange__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1203:1: ( ( '}' ) )
            // InternalMyDsl.g:1204:1: ( '}' )
            {
            // InternalMyDsl.g:1204:1: ( '}' )
            // InternalMyDsl.g:1205:2: '}'
            {
             before(grammarAccess.getCryptoExchangeAccess().getRightCurlyBracketKeyword_19()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCryptoExchangeAccess().getRightCurlyBracketKeyword_19()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__19__Impl"


    // $ANTLR start "rule__CryptoExchange__Group__20"
    // InternalMyDsl.g:1214:1: rule__CryptoExchange__Group__20 : rule__CryptoExchange__Group__20__Impl ;
    public final void rule__CryptoExchange__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1218:1: ( rule__CryptoExchange__Group__20__Impl )
            // InternalMyDsl.g:1219:2: rule__CryptoExchange__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group__20__Impl();

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
    // $ANTLR end "rule__CryptoExchange__Group__20"


    // $ANTLR start "rule__CryptoExchange__Group__20__Impl"
    // InternalMyDsl.g:1225:1: rule__CryptoExchange__Group__20__Impl : ( '}' ) ;
    public final void rule__CryptoExchange__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1229:1: ( ( '}' ) )
            // InternalMyDsl.g:1230:1: ( '}' )
            {
            // InternalMyDsl.g:1230:1: ( '}' )
            // InternalMyDsl.g:1231:2: '}'
            {
             before(grammarAccess.getCryptoExchangeAccess().getRightCurlyBracketKeyword_20()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCryptoExchangeAccess().getRightCurlyBracketKeyword_20()); 

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
    // $ANTLR end "rule__CryptoExchange__Group__20__Impl"


    // $ANTLR start "rule__CryptoExchange__Group_3__0"
    // InternalMyDsl.g:1241:1: rule__CryptoExchange__Group_3__0 : rule__CryptoExchange__Group_3__0__Impl rule__CryptoExchange__Group_3__1 ;
    public final void rule__CryptoExchange__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1245:1: ( rule__CryptoExchange__Group_3__0__Impl rule__CryptoExchange__Group_3__1 )
            // InternalMyDsl.g:1246:2: rule__CryptoExchange__Group_3__0__Impl rule__CryptoExchange__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__CryptoExchange__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group_3__1();

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
    // $ANTLR end "rule__CryptoExchange__Group_3__0"


    // $ANTLR start "rule__CryptoExchange__Group_3__0__Impl"
    // InternalMyDsl.g:1253:1: rule__CryptoExchange__Group_3__0__Impl : ( 'IP' ) ;
    public final void rule__CryptoExchange__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1257:1: ( ( 'IP' ) )
            // InternalMyDsl.g:1258:1: ( 'IP' )
            {
            // InternalMyDsl.g:1258:1: ( 'IP' )
            // InternalMyDsl.g:1259:2: 'IP'
            {
             before(grammarAccess.getCryptoExchangeAccess().getIPKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCryptoExchangeAccess().getIPKeyword_3_0()); 

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
    // $ANTLR end "rule__CryptoExchange__Group_3__0__Impl"


    // $ANTLR start "rule__CryptoExchange__Group_3__1"
    // InternalMyDsl.g:1268:1: rule__CryptoExchange__Group_3__1 : rule__CryptoExchange__Group_3__1__Impl ;
    public final void rule__CryptoExchange__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1272:1: ( rule__CryptoExchange__Group_3__1__Impl )
            // InternalMyDsl.g:1273:2: rule__CryptoExchange__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group_3__1__Impl();

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
    // $ANTLR end "rule__CryptoExchange__Group_3__1"


    // $ANTLR start "rule__CryptoExchange__Group_3__1__Impl"
    // InternalMyDsl.g:1279:1: rule__CryptoExchange__Group_3__1__Impl : ( ( rule__CryptoExchange__IPAssignment_3_1 ) ) ;
    public final void rule__CryptoExchange__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1283:1: ( ( ( rule__CryptoExchange__IPAssignment_3_1 ) ) )
            // InternalMyDsl.g:1284:1: ( ( rule__CryptoExchange__IPAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1284:1: ( ( rule__CryptoExchange__IPAssignment_3_1 ) )
            // InternalMyDsl.g:1285:2: ( rule__CryptoExchange__IPAssignment_3_1 )
            {
             before(grammarAccess.getCryptoExchangeAccess().getIPAssignment_3_1()); 
            // InternalMyDsl.g:1286:2: ( rule__CryptoExchange__IPAssignment_3_1 )
            // InternalMyDsl.g:1286:3: rule__CryptoExchange__IPAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CryptoExchange__IPAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCryptoExchangeAccess().getIPAssignment_3_1()); 

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
    // $ANTLR end "rule__CryptoExchange__Group_3__1__Impl"


    // $ANTLR start "rule__CryptoExchange__Group_4__0"
    // InternalMyDsl.g:1295:1: rule__CryptoExchange__Group_4__0 : rule__CryptoExchange__Group_4__0__Impl rule__CryptoExchange__Group_4__1 ;
    public final void rule__CryptoExchange__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1299:1: ( rule__CryptoExchange__Group_4__0__Impl rule__CryptoExchange__Group_4__1 )
            // InternalMyDsl.g:1300:2: rule__CryptoExchange__Group_4__0__Impl rule__CryptoExchange__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__CryptoExchange__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group_4__1();

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
    // $ANTLR end "rule__CryptoExchange__Group_4__0"


    // $ANTLR start "rule__CryptoExchange__Group_4__0__Impl"
    // InternalMyDsl.g:1307:1: rule__CryptoExchange__Group_4__0__Impl : ( 'DomainName' ) ;
    public final void rule__CryptoExchange__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1311:1: ( ( 'DomainName' ) )
            // InternalMyDsl.g:1312:1: ( 'DomainName' )
            {
            // InternalMyDsl.g:1312:1: ( 'DomainName' )
            // InternalMyDsl.g:1313:2: 'DomainName'
            {
             before(grammarAccess.getCryptoExchangeAccess().getDomainNameKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCryptoExchangeAccess().getDomainNameKeyword_4_0()); 

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
    // $ANTLR end "rule__CryptoExchange__Group_4__0__Impl"


    // $ANTLR start "rule__CryptoExchange__Group_4__1"
    // InternalMyDsl.g:1322:1: rule__CryptoExchange__Group_4__1 : rule__CryptoExchange__Group_4__1__Impl ;
    public final void rule__CryptoExchange__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1326:1: ( rule__CryptoExchange__Group_4__1__Impl )
            // InternalMyDsl.g:1327:2: rule__CryptoExchange__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group_4__1__Impl();

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
    // $ANTLR end "rule__CryptoExchange__Group_4__1"


    // $ANTLR start "rule__CryptoExchange__Group_4__1__Impl"
    // InternalMyDsl.g:1333:1: rule__CryptoExchange__Group_4__1__Impl : ( ( rule__CryptoExchange__DomainNameAssignment_4_1 ) ) ;
    public final void rule__CryptoExchange__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1337:1: ( ( ( rule__CryptoExchange__DomainNameAssignment_4_1 ) ) )
            // InternalMyDsl.g:1338:1: ( ( rule__CryptoExchange__DomainNameAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1338:1: ( ( rule__CryptoExchange__DomainNameAssignment_4_1 ) )
            // InternalMyDsl.g:1339:2: ( rule__CryptoExchange__DomainNameAssignment_4_1 )
            {
             before(grammarAccess.getCryptoExchangeAccess().getDomainNameAssignment_4_1()); 
            // InternalMyDsl.g:1340:2: ( rule__CryptoExchange__DomainNameAssignment_4_1 )
            // InternalMyDsl.g:1340:3: rule__CryptoExchange__DomainNameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CryptoExchange__DomainNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCryptoExchangeAccess().getDomainNameAssignment_4_1()); 

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
    // $ANTLR end "rule__CryptoExchange__Group_4__1__Impl"


    // $ANTLR start "rule__CryptoExchange__Group_8__0"
    // InternalMyDsl.g:1349:1: rule__CryptoExchange__Group_8__0 : rule__CryptoExchange__Group_8__0__Impl rule__CryptoExchange__Group_8__1 ;
    public final void rule__CryptoExchange__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1353:1: ( rule__CryptoExchange__Group_8__0__Impl rule__CryptoExchange__Group_8__1 )
            // InternalMyDsl.g:1354:2: rule__CryptoExchange__Group_8__0__Impl rule__CryptoExchange__Group_8__1
            {
            pushFollow(FOLLOW_6);
            rule__CryptoExchange__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group_8__1();

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
    // $ANTLR end "rule__CryptoExchange__Group_8__0"


    // $ANTLR start "rule__CryptoExchange__Group_8__0__Impl"
    // InternalMyDsl.g:1361:1: rule__CryptoExchange__Group_8__0__Impl : ( ',' ) ;
    public final void rule__CryptoExchange__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1365:1: ( ( ',' ) )
            // InternalMyDsl.g:1366:1: ( ',' )
            {
            // InternalMyDsl.g:1366:1: ( ',' )
            // InternalMyDsl.g:1367:2: ','
            {
             before(grammarAccess.getCryptoExchangeAccess().getCommaKeyword_8_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCryptoExchangeAccess().getCommaKeyword_8_0()); 

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
    // $ANTLR end "rule__CryptoExchange__Group_8__0__Impl"


    // $ANTLR start "rule__CryptoExchange__Group_8__1"
    // InternalMyDsl.g:1376:1: rule__CryptoExchange__Group_8__1 : rule__CryptoExchange__Group_8__1__Impl ;
    public final void rule__CryptoExchange__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1380:1: ( rule__CryptoExchange__Group_8__1__Impl )
            // InternalMyDsl.g:1381:2: rule__CryptoExchange__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group_8__1__Impl();

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
    // $ANTLR end "rule__CryptoExchange__Group_8__1"


    // $ANTLR start "rule__CryptoExchange__Group_8__1__Impl"
    // InternalMyDsl.g:1387:1: rule__CryptoExchange__Group_8__1__Impl : ( ( rule__CryptoExchange__SubSystemAssignment_8_1 ) ) ;
    public final void rule__CryptoExchange__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1391:1: ( ( ( rule__CryptoExchange__SubSystemAssignment_8_1 ) ) )
            // InternalMyDsl.g:1392:1: ( ( rule__CryptoExchange__SubSystemAssignment_8_1 ) )
            {
            // InternalMyDsl.g:1392:1: ( ( rule__CryptoExchange__SubSystemAssignment_8_1 ) )
            // InternalMyDsl.g:1393:2: ( rule__CryptoExchange__SubSystemAssignment_8_1 )
            {
             before(grammarAccess.getCryptoExchangeAccess().getSubSystemAssignment_8_1()); 
            // InternalMyDsl.g:1394:2: ( rule__CryptoExchange__SubSystemAssignment_8_1 )
            // InternalMyDsl.g:1394:3: rule__CryptoExchange__SubSystemAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__CryptoExchange__SubSystemAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getCryptoExchangeAccess().getSubSystemAssignment_8_1()); 

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
    // $ANTLR end "rule__CryptoExchange__Group_8__1__Impl"


    // $ANTLR start "rule__CryptoExchange__Group_13__0"
    // InternalMyDsl.g:1403:1: rule__CryptoExchange__Group_13__0 : rule__CryptoExchange__Group_13__0__Impl rule__CryptoExchange__Group_13__1 ;
    public final void rule__CryptoExchange__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1407:1: ( rule__CryptoExchange__Group_13__0__Impl rule__CryptoExchange__Group_13__1 )
            // InternalMyDsl.g:1408:2: rule__CryptoExchange__Group_13__0__Impl rule__CryptoExchange__Group_13__1
            {
            pushFollow(FOLLOW_10);
            rule__CryptoExchange__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group_13__1();

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
    // $ANTLR end "rule__CryptoExchange__Group_13__0"


    // $ANTLR start "rule__CryptoExchange__Group_13__0__Impl"
    // InternalMyDsl.g:1415:1: rule__CryptoExchange__Group_13__0__Impl : ( ',' ) ;
    public final void rule__CryptoExchange__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1419:1: ( ( ',' ) )
            // InternalMyDsl.g:1420:1: ( ',' )
            {
            // InternalMyDsl.g:1420:1: ( ',' )
            // InternalMyDsl.g:1421:2: ','
            {
             before(grammarAccess.getCryptoExchangeAccess().getCommaKeyword_13_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCryptoExchangeAccess().getCommaKeyword_13_0()); 

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
    // $ANTLR end "rule__CryptoExchange__Group_13__0__Impl"


    // $ANTLR start "rule__CryptoExchange__Group_13__1"
    // InternalMyDsl.g:1430:1: rule__CryptoExchange__Group_13__1 : rule__CryptoExchange__Group_13__1__Impl ;
    public final void rule__CryptoExchange__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1434:1: ( rule__CryptoExchange__Group_13__1__Impl )
            // InternalMyDsl.g:1435:2: rule__CryptoExchange__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group_13__1__Impl();

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
    // $ANTLR end "rule__CryptoExchange__Group_13__1"


    // $ANTLR start "rule__CryptoExchange__Group_13__1__Impl"
    // InternalMyDsl.g:1441:1: rule__CryptoExchange__Group_13__1__Impl : ( ( rule__CryptoExchange__TokensAssignment_13_1 ) ) ;
    public final void rule__CryptoExchange__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1445:1: ( ( ( rule__CryptoExchange__TokensAssignment_13_1 ) ) )
            // InternalMyDsl.g:1446:1: ( ( rule__CryptoExchange__TokensAssignment_13_1 ) )
            {
            // InternalMyDsl.g:1446:1: ( ( rule__CryptoExchange__TokensAssignment_13_1 ) )
            // InternalMyDsl.g:1447:2: ( rule__CryptoExchange__TokensAssignment_13_1 )
            {
             before(grammarAccess.getCryptoExchangeAccess().getTokensAssignment_13_1()); 
            // InternalMyDsl.g:1448:2: ( rule__CryptoExchange__TokensAssignment_13_1 )
            // InternalMyDsl.g:1448:3: rule__CryptoExchange__TokensAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__CryptoExchange__TokensAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getCryptoExchangeAccess().getTokensAssignment_13_1()); 

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
    // $ANTLR end "rule__CryptoExchange__Group_13__1__Impl"


    // $ANTLR start "rule__CryptoExchange__Group_18__0"
    // InternalMyDsl.g:1457:1: rule__CryptoExchange__Group_18__0 : rule__CryptoExchange__Group_18__0__Impl rule__CryptoExchange__Group_18__1 ;
    public final void rule__CryptoExchange__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1461:1: ( rule__CryptoExchange__Group_18__0__Impl rule__CryptoExchange__Group_18__1 )
            // InternalMyDsl.g:1462:2: rule__CryptoExchange__Group_18__0__Impl rule__CryptoExchange__Group_18__1
            {
            pushFollow(FOLLOW_12);
            rule__CryptoExchange__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group_18__1();

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
    // $ANTLR end "rule__CryptoExchange__Group_18__0"


    // $ANTLR start "rule__CryptoExchange__Group_18__0__Impl"
    // InternalMyDsl.g:1469:1: rule__CryptoExchange__Group_18__0__Impl : ( ',' ) ;
    public final void rule__CryptoExchange__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1473:1: ( ( ',' ) )
            // InternalMyDsl.g:1474:1: ( ',' )
            {
            // InternalMyDsl.g:1474:1: ( ',' )
            // InternalMyDsl.g:1475:2: ','
            {
             before(grammarAccess.getCryptoExchangeAccess().getCommaKeyword_18_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCryptoExchangeAccess().getCommaKeyword_18_0()); 

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
    // $ANTLR end "rule__CryptoExchange__Group_18__0__Impl"


    // $ANTLR start "rule__CryptoExchange__Group_18__1"
    // InternalMyDsl.g:1484:1: rule__CryptoExchange__Group_18__1 : rule__CryptoExchange__Group_18__1__Impl ;
    public final void rule__CryptoExchange__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1488:1: ( rule__CryptoExchange__Group_18__1__Impl )
            // InternalMyDsl.g:1489:2: rule__CryptoExchange__Group_18__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CryptoExchange__Group_18__1__Impl();

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
    // $ANTLR end "rule__CryptoExchange__Group_18__1"


    // $ANTLR start "rule__CryptoExchange__Group_18__1__Impl"
    // InternalMyDsl.g:1495:1: rule__CryptoExchange__Group_18__1__Impl : ( ( rule__CryptoExchange__TokenNetworksAssignment_18_1 ) ) ;
    public final void rule__CryptoExchange__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1499:1: ( ( ( rule__CryptoExchange__TokenNetworksAssignment_18_1 ) ) )
            // InternalMyDsl.g:1500:1: ( ( rule__CryptoExchange__TokenNetworksAssignment_18_1 ) )
            {
            // InternalMyDsl.g:1500:1: ( ( rule__CryptoExchange__TokenNetworksAssignment_18_1 ) )
            // InternalMyDsl.g:1501:2: ( rule__CryptoExchange__TokenNetworksAssignment_18_1 )
            {
             before(grammarAccess.getCryptoExchangeAccess().getTokenNetworksAssignment_18_1()); 
            // InternalMyDsl.g:1502:2: ( rule__CryptoExchange__TokenNetworksAssignment_18_1 )
            // InternalMyDsl.g:1502:3: rule__CryptoExchange__TokenNetworksAssignment_18_1
            {
            pushFollow(FOLLOW_2);
            rule__CryptoExchange__TokenNetworksAssignment_18_1();

            state._fsp--;


            }

             after(grammarAccess.getCryptoExchangeAccess().getTokenNetworksAssignment_18_1()); 

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
    // $ANTLR end "rule__CryptoExchange__Group_18__1__Impl"


    // $ANTLR start "rule__SubSystem__Group__0"
    // InternalMyDsl.g:1511:1: rule__SubSystem__Group__0 : rule__SubSystem__Group__0__Impl rule__SubSystem__Group__1 ;
    public final void rule__SubSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1515:1: ( rule__SubSystem__Group__0__Impl rule__SubSystem__Group__1 )
            // InternalMyDsl.g:1516:2: rule__SubSystem__Group__0__Impl rule__SubSystem__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SubSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group__1();

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
    // $ANTLR end "rule__SubSystem__Group__0"


    // $ANTLR start "rule__SubSystem__Group__0__Impl"
    // InternalMyDsl.g:1523:1: rule__SubSystem__Group__0__Impl : ( () ) ;
    public final void rule__SubSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1527:1: ( ( () ) )
            // InternalMyDsl.g:1528:1: ( () )
            {
            // InternalMyDsl.g:1528:1: ( () )
            // InternalMyDsl.g:1529:2: ()
            {
             before(grammarAccess.getSubSystemAccess().getSubSystemAction_0()); 
            // InternalMyDsl.g:1530:2: ()
            // InternalMyDsl.g:1530:3: 
            {
            }

             after(grammarAccess.getSubSystemAccess().getSubSystemAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubSystem__Group__0__Impl"


    // $ANTLR start "rule__SubSystem__Group__1"
    // InternalMyDsl.g:1538:1: rule__SubSystem__Group__1 : rule__SubSystem__Group__1__Impl rule__SubSystem__Group__2 ;
    public final void rule__SubSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1542:1: ( rule__SubSystem__Group__1__Impl rule__SubSystem__Group__2 )
            // InternalMyDsl.g:1543:2: rule__SubSystem__Group__1__Impl rule__SubSystem__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__SubSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group__2();

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
    // $ANTLR end "rule__SubSystem__Group__1"


    // $ANTLR start "rule__SubSystem__Group__1__Impl"
    // InternalMyDsl.g:1550:1: rule__SubSystem__Group__1__Impl : ( 'SubSystem' ) ;
    public final void rule__SubSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1554:1: ( ( 'SubSystem' ) )
            // InternalMyDsl.g:1555:1: ( 'SubSystem' )
            {
            // InternalMyDsl.g:1555:1: ( 'SubSystem' )
            // InternalMyDsl.g:1556:2: 'SubSystem'
            {
             before(grammarAccess.getSubSystemAccess().getSubSystemKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSubSystemAccess().getSubSystemKeyword_1()); 

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
    // $ANTLR end "rule__SubSystem__Group__1__Impl"


    // $ANTLR start "rule__SubSystem__Group__2"
    // InternalMyDsl.g:1565:1: rule__SubSystem__Group__2 : rule__SubSystem__Group__2__Impl rule__SubSystem__Group__3 ;
    public final void rule__SubSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1569:1: ( rule__SubSystem__Group__2__Impl rule__SubSystem__Group__3 )
            // InternalMyDsl.g:1570:2: rule__SubSystem__Group__2__Impl rule__SubSystem__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__SubSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group__3();

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
    // $ANTLR end "rule__SubSystem__Group__2"


    // $ANTLR start "rule__SubSystem__Group__2__Impl"
    // InternalMyDsl.g:1577:1: rule__SubSystem__Group__2__Impl : ( ( rule__SubSystem__NameAssignment_2 ) ) ;
    public final void rule__SubSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1581:1: ( ( ( rule__SubSystem__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1582:1: ( ( rule__SubSystem__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1582:1: ( ( rule__SubSystem__NameAssignment_2 ) )
            // InternalMyDsl.g:1583:2: ( rule__SubSystem__NameAssignment_2 )
            {
             before(grammarAccess.getSubSystemAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1584:2: ( rule__SubSystem__NameAssignment_2 )
            // InternalMyDsl.g:1584:3: rule__SubSystem__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubSystem__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubSystemAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__SubSystem__Group__2__Impl"


    // $ANTLR start "rule__SubSystem__Group__3"
    // InternalMyDsl.g:1592:1: rule__SubSystem__Group__3 : rule__SubSystem__Group__3__Impl rule__SubSystem__Group__4 ;
    public final void rule__SubSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1596:1: ( rule__SubSystem__Group__3__Impl rule__SubSystem__Group__4 )
            // InternalMyDsl.g:1597:2: rule__SubSystem__Group__3__Impl rule__SubSystem__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__SubSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group__4();

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
    // $ANTLR end "rule__SubSystem__Group__3"


    // $ANTLR start "rule__SubSystem__Group__3__Impl"
    // InternalMyDsl.g:1604:1: rule__SubSystem__Group__3__Impl : ( '{' ) ;
    public final void rule__SubSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1608:1: ( ( '{' ) )
            // InternalMyDsl.g:1609:1: ( '{' )
            {
            // InternalMyDsl.g:1609:1: ( '{' )
            // InternalMyDsl.g:1610:2: '{'
            {
             before(grammarAccess.getSubSystemAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSubSystemAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__SubSystem__Group__3__Impl"


    // $ANTLR start "rule__SubSystem__Group__4"
    // InternalMyDsl.g:1619:1: rule__SubSystem__Group__4 : rule__SubSystem__Group__4__Impl rule__SubSystem__Group__5 ;
    public final void rule__SubSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1623:1: ( rule__SubSystem__Group__4__Impl rule__SubSystem__Group__5 )
            // InternalMyDsl.g:1624:2: rule__SubSystem__Group__4__Impl rule__SubSystem__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__SubSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group__5();

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
    // $ANTLR end "rule__SubSystem__Group__4"


    // $ANTLR start "rule__SubSystem__Group__4__Impl"
    // InternalMyDsl.g:1631:1: rule__SubSystem__Group__4__Impl : ( ( rule__SubSystem__Group_4__0 )? ) ;
    public final void rule__SubSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1635:1: ( ( ( rule__SubSystem__Group_4__0 )? ) )
            // InternalMyDsl.g:1636:1: ( ( rule__SubSystem__Group_4__0 )? )
            {
            // InternalMyDsl.g:1636:1: ( ( rule__SubSystem__Group_4__0 )? )
            // InternalMyDsl.g:1637:2: ( rule__SubSystem__Group_4__0 )?
            {
             before(grammarAccess.getSubSystemAccess().getGroup_4()); 
            // InternalMyDsl.g:1638:2: ( rule__SubSystem__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1638:3: rule__SubSystem__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubSystem__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubSystemAccess().getGroup_4()); 

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
    // $ANTLR end "rule__SubSystem__Group__4__Impl"


    // $ANTLR start "rule__SubSystem__Group__5"
    // InternalMyDsl.g:1646:1: rule__SubSystem__Group__5 : rule__SubSystem__Group__5__Impl rule__SubSystem__Group__6 ;
    public final void rule__SubSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1650:1: ( rule__SubSystem__Group__5__Impl rule__SubSystem__Group__6 )
            // InternalMyDsl.g:1651:2: rule__SubSystem__Group__5__Impl rule__SubSystem__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__SubSystem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group__6();

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
    // $ANTLR end "rule__SubSystem__Group__5"


    // $ANTLR start "rule__SubSystem__Group__5__Impl"
    // InternalMyDsl.g:1658:1: rule__SubSystem__Group__5__Impl : ( ( rule__SubSystem__Group_5__0 )? ) ;
    public final void rule__SubSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1662:1: ( ( ( rule__SubSystem__Group_5__0 )? ) )
            // InternalMyDsl.g:1663:1: ( ( rule__SubSystem__Group_5__0 )? )
            {
            // InternalMyDsl.g:1663:1: ( ( rule__SubSystem__Group_5__0 )? )
            // InternalMyDsl.g:1664:2: ( rule__SubSystem__Group_5__0 )?
            {
             before(grammarAccess.getSubSystemAccess().getGroup_5()); 
            // InternalMyDsl.g:1665:2: ( rule__SubSystem__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1665:3: rule__SubSystem__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubSystem__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubSystemAccess().getGroup_5()); 

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
    // $ANTLR end "rule__SubSystem__Group__5__Impl"


    // $ANTLR start "rule__SubSystem__Group__6"
    // InternalMyDsl.g:1673:1: rule__SubSystem__Group__6 : rule__SubSystem__Group__6__Impl rule__SubSystem__Group__7 ;
    public final void rule__SubSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1677:1: ( rule__SubSystem__Group__6__Impl rule__SubSystem__Group__7 )
            // InternalMyDsl.g:1678:2: rule__SubSystem__Group__6__Impl rule__SubSystem__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__SubSystem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group__7();

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
    // $ANTLR end "rule__SubSystem__Group__6"


    // $ANTLR start "rule__SubSystem__Group__6__Impl"
    // InternalMyDsl.g:1685:1: rule__SubSystem__Group__6__Impl : ( ( rule__SubSystem__Group_6__0 )? ) ;
    public final void rule__SubSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1689:1: ( ( ( rule__SubSystem__Group_6__0 )? ) )
            // InternalMyDsl.g:1690:1: ( ( rule__SubSystem__Group_6__0 )? )
            {
            // InternalMyDsl.g:1690:1: ( ( rule__SubSystem__Group_6__0 )? )
            // InternalMyDsl.g:1691:2: ( rule__SubSystem__Group_6__0 )?
            {
             before(grammarAccess.getSubSystemAccess().getGroup_6()); 
            // InternalMyDsl.g:1692:2: ( rule__SubSystem__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1692:3: rule__SubSystem__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubSystem__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubSystemAccess().getGroup_6()); 

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
    // $ANTLR end "rule__SubSystem__Group__6__Impl"


    // $ANTLR start "rule__SubSystem__Group__7"
    // InternalMyDsl.g:1700:1: rule__SubSystem__Group__7 : rule__SubSystem__Group__7__Impl rule__SubSystem__Group__8 ;
    public final void rule__SubSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1704:1: ( rule__SubSystem__Group__7__Impl rule__SubSystem__Group__8 )
            // InternalMyDsl.g:1705:2: rule__SubSystem__Group__7__Impl rule__SubSystem__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__SubSystem__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group__8();

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
    // $ANTLR end "rule__SubSystem__Group__7"


    // $ANTLR start "rule__SubSystem__Group__7__Impl"
    // InternalMyDsl.g:1712:1: rule__SubSystem__Group__7__Impl : ( ( rule__SubSystem__Group_7__0 )? ) ;
    public final void rule__SubSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1716:1: ( ( ( rule__SubSystem__Group_7__0 )? ) )
            // InternalMyDsl.g:1717:1: ( ( rule__SubSystem__Group_7__0 )? )
            {
            // InternalMyDsl.g:1717:1: ( ( rule__SubSystem__Group_7__0 )? )
            // InternalMyDsl.g:1718:2: ( rule__SubSystem__Group_7__0 )?
            {
             before(grammarAccess.getSubSystemAccess().getGroup_7()); 
            // InternalMyDsl.g:1719:2: ( rule__SubSystem__Group_7__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1719:3: rule__SubSystem__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubSystem__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubSystemAccess().getGroup_7()); 

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
    // $ANTLR end "rule__SubSystem__Group__7__Impl"


    // $ANTLR start "rule__SubSystem__Group__8"
    // InternalMyDsl.g:1727:1: rule__SubSystem__Group__8 : rule__SubSystem__Group__8__Impl ;
    public final void rule__SubSystem__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1731:1: ( rule__SubSystem__Group__8__Impl )
            // InternalMyDsl.g:1732:2: rule__SubSystem__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubSystem__Group__8__Impl();

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
    // $ANTLR end "rule__SubSystem__Group__8"


    // $ANTLR start "rule__SubSystem__Group__8__Impl"
    // InternalMyDsl.g:1738:1: rule__SubSystem__Group__8__Impl : ( '}' ) ;
    public final void rule__SubSystem__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1742:1: ( ( '}' ) )
            // InternalMyDsl.g:1743:1: ( '}' )
            {
            // InternalMyDsl.g:1743:1: ( '}' )
            // InternalMyDsl.g:1744:2: '}'
            {
             before(grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__SubSystem__Group__8__Impl"


    // $ANTLR start "rule__SubSystem__Group_4__0"
    // InternalMyDsl.g:1754:1: rule__SubSystem__Group_4__0 : rule__SubSystem__Group_4__0__Impl rule__SubSystem__Group_4__1 ;
    public final void rule__SubSystem__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1758:1: ( rule__SubSystem__Group_4__0__Impl rule__SubSystem__Group_4__1 )
            // InternalMyDsl.g:1759:2: rule__SubSystem__Group_4__0__Impl rule__SubSystem__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__SubSystem__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_4__1();

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
    // $ANTLR end "rule__SubSystem__Group_4__0"


    // $ANTLR start "rule__SubSystem__Group_4__0__Impl"
    // InternalMyDsl.g:1766:1: rule__SubSystem__Group_4__0__Impl : ( 'accounts' ) ;
    public final void rule__SubSystem__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1770:1: ( ( 'accounts' ) )
            // InternalMyDsl.g:1771:1: ( 'accounts' )
            {
            // InternalMyDsl.g:1771:1: ( 'accounts' )
            // InternalMyDsl.g:1772:2: 'accounts'
            {
             before(grammarAccess.getSubSystemAccess().getAccountsKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSubSystemAccess().getAccountsKeyword_4_0()); 

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
    // $ANTLR end "rule__SubSystem__Group_4__0__Impl"


    // $ANTLR start "rule__SubSystem__Group_4__1"
    // InternalMyDsl.g:1781:1: rule__SubSystem__Group_4__1 : rule__SubSystem__Group_4__1__Impl rule__SubSystem__Group_4__2 ;
    public final void rule__SubSystem__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1785:1: ( rule__SubSystem__Group_4__1__Impl rule__SubSystem__Group_4__2 )
            // InternalMyDsl.g:1786:2: rule__SubSystem__Group_4__1__Impl rule__SubSystem__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__SubSystem__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_4__2();

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
    // $ANTLR end "rule__SubSystem__Group_4__1"


    // $ANTLR start "rule__SubSystem__Group_4__1__Impl"
    // InternalMyDsl.g:1793:1: rule__SubSystem__Group_4__1__Impl : ( '{' ) ;
    public final void rule__SubSystem__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1797:1: ( ( '{' ) )
            // InternalMyDsl.g:1798:1: ( '{' )
            {
            // InternalMyDsl.g:1798:1: ( '{' )
            // InternalMyDsl.g:1799:2: '{'
            {
             before(grammarAccess.getSubSystemAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSubSystemAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__SubSystem__Group_4__1__Impl"


    // $ANTLR start "rule__SubSystem__Group_4__2"
    // InternalMyDsl.g:1808:1: rule__SubSystem__Group_4__2 : rule__SubSystem__Group_4__2__Impl rule__SubSystem__Group_4__3 ;
    public final void rule__SubSystem__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1812:1: ( rule__SubSystem__Group_4__2__Impl rule__SubSystem__Group_4__3 )
            // InternalMyDsl.g:1813:2: rule__SubSystem__Group_4__2__Impl rule__SubSystem__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__SubSystem__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_4__3();

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
    // $ANTLR end "rule__SubSystem__Group_4__2"


    // $ANTLR start "rule__SubSystem__Group_4__2__Impl"
    // InternalMyDsl.g:1820:1: rule__SubSystem__Group_4__2__Impl : ( ( rule__SubSystem__AccountsAssignment_4_2 ) ) ;
    public final void rule__SubSystem__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1824:1: ( ( ( rule__SubSystem__AccountsAssignment_4_2 ) ) )
            // InternalMyDsl.g:1825:1: ( ( rule__SubSystem__AccountsAssignment_4_2 ) )
            {
            // InternalMyDsl.g:1825:1: ( ( rule__SubSystem__AccountsAssignment_4_2 ) )
            // InternalMyDsl.g:1826:2: ( rule__SubSystem__AccountsAssignment_4_2 )
            {
             before(grammarAccess.getSubSystemAccess().getAccountsAssignment_4_2()); 
            // InternalMyDsl.g:1827:2: ( rule__SubSystem__AccountsAssignment_4_2 )
            // InternalMyDsl.g:1827:3: rule__SubSystem__AccountsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__SubSystem__AccountsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSubSystemAccess().getAccountsAssignment_4_2()); 

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
    // $ANTLR end "rule__SubSystem__Group_4__2__Impl"


    // $ANTLR start "rule__SubSystem__Group_4__3"
    // InternalMyDsl.g:1835:1: rule__SubSystem__Group_4__3 : rule__SubSystem__Group_4__3__Impl rule__SubSystem__Group_4__4 ;
    public final void rule__SubSystem__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1839:1: ( rule__SubSystem__Group_4__3__Impl rule__SubSystem__Group_4__4 )
            // InternalMyDsl.g:1840:2: rule__SubSystem__Group_4__3__Impl rule__SubSystem__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__SubSystem__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_4__4();

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
    // $ANTLR end "rule__SubSystem__Group_4__3"


    // $ANTLR start "rule__SubSystem__Group_4__3__Impl"
    // InternalMyDsl.g:1847:1: rule__SubSystem__Group_4__3__Impl : ( ( rule__SubSystem__Group_4_3__0 )* ) ;
    public final void rule__SubSystem__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1851:1: ( ( ( rule__SubSystem__Group_4_3__0 )* ) )
            // InternalMyDsl.g:1852:1: ( ( rule__SubSystem__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:1852:1: ( ( rule__SubSystem__Group_4_3__0 )* )
            // InternalMyDsl.g:1853:2: ( rule__SubSystem__Group_4_3__0 )*
            {
             before(grammarAccess.getSubSystemAccess().getGroup_4_3()); 
            // InternalMyDsl.g:1854:2: ( rule__SubSystem__Group_4_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1854:3: rule__SubSystem__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SubSystem__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSubSystemAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__SubSystem__Group_4__3__Impl"


    // $ANTLR start "rule__SubSystem__Group_4__4"
    // InternalMyDsl.g:1862:1: rule__SubSystem__Group_4__4 : rule__SubSystem__Group_4__4__Impl ;
    public final void rule__SubSystem__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1866:1: ( rule__SubSystem__Group_4__4__Impl )
            // InternalMyDsl.g:1867:2: rule__SubSystem__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_4__4__Impl();

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
    // $ANTLR end "rule__SubSystem__Group_4__4"


    // $ANTLR start "rule__SubSystem__Group_4__4__Impl"
    // InternalMyDsl.g:1873:1: rule__SubSystem__Group_4__4__Impl : ( '}' ) ;
    public final void rule__SubSystem__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1877:1: ( ( '}' ) )
            // InternalMyDsl.g:1878:1: ( '}' )
            {
            // InternalMyDsl.g:1878:1: ( '}' )
            // InternalMyDsl.g:1879:2: '}'
            {
             before(grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__SubSystem__Group_4__4__Impl"


    // $ANTLR start "rule__SubSystem__Group_4_3__0"
    // InternalMyDsl.g:1889:1: rule__SubSystem__Group_4_3__0 : rule__SubSystem__Group_4_3__0__Impl rule__SubSystem__Group_4_3__1 ;
    public final void rule__SubSystem__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1893:1: ( rule__SubSystem__Group_4_3__0__Impl rule__SubSystem__Group_4_3__1 )
            // InternalMyDsl.g:1894:2: rule__SubSystem__Group_4_3__0__Impl rule__SubSystem__Group_4_3__1
            {
            pushFollow(FOLLOW_16);
            rule__SubSystem__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_4_3__1();

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
    // $ANTLR end "rule__SubSystem__Group_4_3__0"


    // $ANTLR start "rule__SubSystem__Group_4_3__0__Impl"
    // InternalMyDsl.g:1901:1: rule__SubSystem__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__SubSystem__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1905:1: ( ( ',' ) )
            // InternalMyDsl.g:1906:1: ( ',' )
            {
            // InternalMyDsl.g:1906:1: ( ',' )
            // InternalMyDsl.g:1907:2: ','
            {
             before(grammarAccess.getSubSystemAccess().getCommaKeyword_4_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSubSystemAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__SubSystem__Group_4_3__0__Impl"


    // $ANTLR start "rule__SubSystem__Group_4_3__1"
    // InternalMyDsl.g:1916:1: rule__SubSystem__Group_4_3__1 : rule__SubSystem__Group_4_3__1__Impl ;
    public final void rule__SubSystem__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1920:1: ( rule__SubSystem__Group_4_3__1__Impl )
            // InternalMyDsl.g:1921:2: rule__SubSystem__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__SubSystem__Group_4_3__1"


    // $ANTLR start "rule__SubSystem__Group_4_3__1__Impl"
    // InternalMyDsl.g:1927:1: rule__SubSystem__Group_4_3__1__Impl : ( ( rule__SubSystem__AccountsAssignment_4_3_1 ) ) ;
    public final void rule__SubSystem__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1931:1: ( ( ( rule__SubSystem__AccountsAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:1932:1: ( ( rule__SubSystem__AccountsAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:1932:1: ( ( rule__SubSystem__AccountsAssignment_4_3_1 ) )
            // InternalMyDsl.g:1933:2: ( rule__SubSystem__AccountsAssignment_4_3_1 )
            {
             before(grammarAccess.getSubSystemAccess().getAccountsAssignment_4_3_1()); 
            // InternalMyDsl.g:1934:2: ( rule__SubSystem__AccountsAssignment_4_3_1 )
            // InternalMyDsl.g:1934:3: rule__SubSystem__AccountsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SubSystem__AccountsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSubSystemAccess().getAccountsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__SubSystem__Group_4_3__1__Impl"


    // $ANTLR start "rule__SubSystem__Group_5__0"
    // InternalMyDsl.g:1943:1: rule__SubSystem__Group_5__0 : rule__SubSystem__Group_5__0__Impl rule__SubSystem__Group_5__1 ;
    public final void rule__SubSystem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1947:1: ( rule__SubSystem__Group_5__0__Impl rule__SubSystem__Group_5__1 )
            // InternalMyDsl.g:1948:2: rule__SubSystem__Group_5__0__Impl rule__SubSystem__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__SubSystem__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_5__1();

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
    // $ANTLR end "rule__SubSystem__Group_5__0"


    // $ANTLR start "rule__SubSystem__Group_5__0__Impl"
    // InternalMyDsl.g:1955:1: rule__SubSystem__Group_5__0__Impl : ( 'TokenPairs' ) ;
    public final void rule__SubSystem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1959:1: ( ( 'TokenPairs' ) )
            // InternalMyDsl.g:1960:1: ( 'TokenPairs' )
            {
            // InternalMyDsl.g:1960:1: ( 'TokenPairs' )
            // InternalMyDsl.g:1961:2: 'TokenPairs'
            {
             before(grammarAccess.getSubSystemAccess().getTokenPairsKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSubSystemAccess().getTokenPairsKeyword_5_0()); 

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
    // $ANTLR end "rule__SubSystem__Group_5__0__Impl"


    // $ANTLR start "rule__SubSystem__Group_5__1"
    // InternalMyDsl.g:1970:1: rule__SubSystem__Group_5__1 : rule__SubSystem__Group_5__1__Impl rule__SubSystem__Group_5__2 ;
    public final void rule__SubSystem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1974:1: ( rule__SubSystem__Group_5__1__Impl rule__SubSystem__Group_5__2 )
            // InternalMyDsl.g:1975:2: rule__SubSystem__Group_5__1__Impl rule__SubSystem__Group_5__2
            {
            pushFollow(FOLLOW_17);
            rule__SubSystem__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_5__2();

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
    // $ANTLR end "rule__SubSystem__Group_5__1"


    // $ANTLR start "rule__SubSystem__Group_5__1__Impl"
    // InternalMyDsl.g:1982:1: rule__SubSystem__Group_5__1__Impl : ( '{' ) ;
    public final void rule__SubSystem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1986:1: ( ( '{' ) )
            // InternalMyDsl.g:1987:1: ( '{' )
            {
            // InternalMyDsl.g:1987:1: ( '{' )
            // InternalMyDsl.g:1988:2: '{'
            {
             before(grammarAccess.getSubSystemAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSubSystemAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__SubSystem__Group_5__1__Impl"


    // $ANTLR start "rule__SubSystem__Group_5__2"
    // InternalMyDsl.g:1997:1: rule__SubSystem__Group_5__2 : rule__SubSystem__Group_5__2__Impl rule__SubSystem__Group_5__3 ;
    public final void rule__SubSystem__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2001:1: ( rule__SubSystem__Group_5__2__Impl rule__SubSystem__Group_5__3 )
            // InternalMyDsl.g:2002:2: rule__SubSystem__Group_5__2__Impl rule__SubSystem__Group_5__3
            {
            pushFollow(FOLLOW_7);
            rule__SubSystem__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_5__3();

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
    // $ANTLR end "rule__SubSystem__Group_5__2"


    // $ANTLR start "rule__SubSystem__Group_5__2__Impl"
    // InternalMyDsl.g:2009:1: rule__SubSystem__Group_5__2__Impl : ( ( rule__SubSystem__TokenPairsAssignment_5_2 ) ) ;
    public final void rule__SubSystem__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2013:1: ( ( ( rule__SubSystem__TokenPairsAssignment_5_2 ) ) )
            // InternalMyDsl.g:2014:1: ( ( rule__SubSystem__TokenPairsAssignment_5_2 ) )
            {
            // InternalMyDsl.g:2014:1: ( ( rule__SubSystem__TokenPairsAssignment_5_2 ) )
            // InternalMyDsl.g:2015:2: ( rule__SubSystem__TokenPairsAssignment_5_2 )
            {
             before(grammarAccess.getSubSystemAccess().getTokenPairsAssignment_5_2()); 
            // InternalMyDsl.g:2016:2: ( rule__SubSystem__TokenPairsAssignment_5_2 )
            // InternalMyDsl.g:2016:3: rule__SubSystem__TokenPairsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__SubSystem__TokenPairsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSubSystemAccess().getTokenPairsAssignment_5_2()); 

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
    // $ANTLR end "rule__SubSystem__Group_5__2__Impl"


    // $ANTLR start "rule__SubSystem__Group_5__3"
    // InternalMyDsl.g:2024:1: rule__SubSystem__Group_5__3 : rule__SubSystem__Group_5__3__Impl rule__SubSystem__Group_5__4 ;
    public final void rule__SubSystem__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2028:1: ( rule__SubSystem__Group_5__3__Impl rule__SubSystem__Group_5__4 )
            // InternalMyDsl.g:2029:2: rule__SubSystem__Group_5__3__Impl rule__SubSystem__Group_5__4
            {
            pushFollow(FOLLOW_7);
            rule__SubSystem__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_5__4();

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
    // $ANTLR end "rule__SubSystem__Group_5__3"


    // $ANTLR start "rule__SubSystem__Group_5__3__Impl"
    // InternalMyDsl.g:2036:1: rule__SubSystem__Group_5__3__Impl : ( ( rule__SubSystem__Group_5_3__0 )* ) ;
    public final void rule__SubSystem__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2040:1: ( ( ( rule__SubSystem__Group_5_3__0 )* ) )
            // InternalMyDsl.g:2041:1: ( ( rule__SubSystem__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:2041:1: ( ( rule__SubSystem__Group_5_3__0 )* )
            // InternalMyDsl.g:2042:2: ( rule__SubSystem__Group_5_3__0 )*
            {
             before(grammarAccess.getSubSystemAccess().getGroup_5_3()); 
            // InternalMyDsl.g:2043:2: ( rule__SubSystem__Group_5_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==36) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:2043:3: rule__SubSystem__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SubSystem__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSubSystemAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__SubSystem__Group_5__3__Impl"


    // $ANTLR start "rule__SubSystem__Group_5__4"
    // InternalMyDsl.g:2051:1: rule__SubSystem__Group_5__4 : rule__SubSystem__Group_5__4__Impl ;
    public final void rule__SubSystem__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2055:1: ( rule__SubSystem__Group_5__4__Impl )
            // InternalMyDsl.g:2056:2: rule__SubSystem__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_5__4__Impl();

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
    // $ANTLR end "rule__SubSystem__Group_5__4"


    // $ANTLR start "rule__SubSystem__Group_5__4__Impl"
    // InternalMyDsl.g:2062:1: rule__SubSystem__Group_5__4__Impl : ( '}' ) ;
    public final void rule__SubSystem__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2066:1: ( ( '}' ) )
            // InternalMyDsl.g:2067:1: ( '}' )
            {
            // InternalMyDsl.g:2067:1: ( '}' )
            // InternalMyDsl.g:2068:2: '}'
            {
             before(grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__SubSystem__Group_5__4__Impl"


    // $ANTLR start "rule__SubSystem__Group_5_3__0"
    // InternalMyDsl.g:2078:1: rule__SubSystem__Group_5_3__0 : rule__SubSystem__Group_5_3__0__Impl rule__SubSystem__Group_5_3__1 ;
    public final void rule__SubSystem__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2082:1: ( rule__SubSystem__Group_5_3__0__Impl rule__SubSystem__Group_5_3__1 )
            // InternalMyDsl.g:2083:2: rule__SubSystem__Group_5_3__0__Impl rule__SubSystem__Group_5_3__1
            {
            pushFollow(FOLLOW_17);
            rule__SubSystem__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_5_3__1();

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
    // $ANTLR end "rule__SubSystem__Group_5_3__0"


    // $ANTLR start "rule__SubSystem__Group_5_3__0__Impl"
    // InternalMyDsl.g:2090:1: rule__SubSystem__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__SubSystem__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2094:1: ( ( ',' ) )
            // InternalMyDsl.g:2095:1: ( ',' )
            {
            // InternalMyDsl.g:2095:1: ( ',' )
            // InternalMyDsl.g:2096:2: ','
            {
             before(grammarAccess.getSubSystemAccess().getCommaKeyword_5_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSubSystemAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__SubSystem__Group_5_3__0__Impl"


    // $ANTLR start "rule__SubSystem__Group_5_3__1"
    // InternalMyDsl.g:2105:1: rule__SubSystem__Group_5_3__1 : rule__SubSystem__Group_5_3__1__Impl ;
    public final void rule__SubSystem__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2109:1: ( rule__SubSystem__Group_5_3__1__Impl )
            // InternalMyDsl.g:2110:2: rule__SubSystem__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__SubSystem__Group_5_3__1"


    // $ANTLR start "rule__SubSystem__Group_5_3__1__Impl"
    // InternalMyDsl.g:2116:1: rule__SubSystem__Group_5_3__1__Impl : ( ( rule__SubSystem__TokenPairsAssignment_5_3_1 ) ) ;
    public final void rule__SubSystem__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2120:1: ( ( ( rule__SubSystem__TokenPairsAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:2121:1: ( ( rule__SubSystem__TokenPairsAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:2121:1: ( ( rule__SubSystem__TokenPairsAssignment_5_3_1 ) )
            // InternalMyDsl.g:2122:2: ( rule__SubSystem__TokenPairsAssignment_5_3_1 )
            {
             before(grammarAccess.getSubSystemAccess().getTokenPairsAssignment_5_3_1()); 
            // InternalMyDsl.g:2123:2: ( rule__SubSystem__TokenPairsAssignment_5_3_1 )
            // InternalMyDsl.g:2123:3: rule__SubSystem__TokenPairsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SubSystem__TokenPairsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSubSystemAccess().getTokenPairsAssignment_5_3_1()); 

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
    // $ANTLR end "rule__SubSystem__Group_5_3__1__Impl"


    // $ANTLR start "rule__SubSystem__Group_6__0"
    // InternalMyDsl.g:2132:1: rule__SubSystem__Group_6__0 : rule__SubSystem__Group_6__0__Impl rule__SubSystem__Group_6__1 ;
    public final void rule__SubSystem__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2136:1: ( rule__SubSystem__Group_6__0__Impl rule__SubSystem__Group_6__1 )
            // InternalMyDsl.g:2137:2: rule__SubSystem__Group_6__0__Impl rule__SubSystem__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__SubSystem__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_6__1();

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
    // $ANTLR end "rule__SubSystem__Group_6__0"


    // $ANTLR start "rule__SubSystem__Group_6__0__Impl"
    // InternalMyDsl.g:2144:1: rule__SubSystem__Group_6__0__Impl : ( 'Orders' ) ;
    public final void rule__SubSystem__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2148:1: ( ( 'Orders' ) )
            // InternalMyDsl.g:2149:1: ( 'Orders' )
            {
            // InternalMyDsl.g:2149:1: ( 'Orders' )
            // InternalMyDsl.g:2150:2: 'Orders'
            {
             before(grammarAccess.getSubSystemAccess().getOrdersKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSubSystemAccess().getOrdersKeyword_6_0()); 

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
    // $ANTLR end "rule__SubSystem__Group_6__0__Impl"


    // $ANTLR start "rule__SubSystem__Group_6__1"
    // InternalMyDsl.g:2159:1: rule__SubSystem__Group_6__1 : rule__SubSystem__Group_6__1__Impl rule__SubSystem__Group_6__2 ;
    public final void rule__SubSystem__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2163:1: ( rule__SubSystem__Group_6__1__Impl rule__SubSystem__Group_6__2 )
            // InternalMyDsl.g:2164:2: rule__SubSystem__Group_6__1__Impl rule__SubSystem__Group_6__2
            {
            pushFollow(FOLLOW_18);
            rule__SubSystem__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_6__2();

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
    // $ANTLR end "rule__SubSystem__Group_6__1"


    // $ANTLR start "rule__SubSystem__Group_6__1__Impl"
    // InternalMyDsl.g:2171:1: rule__SubSystem__Group_6__1__Impl : ( '{' ) ;
    public final void rule__SubSystem__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2175:1: ( ( '{' ) )
            // InternalMyDsl.g:2176:1: ( '{' )
            {
            // InternalMyDsl.g:2176:1: ( '{' )
            // InternalMyDsl.g:2177:2: '{'
            {
             before(grammarAccess.getSubSystemAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSubSystemAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__SubSystem__Group_6__1__Impl"


    // $ANTLR start "rule__SubSystem__Group_6__2"
    // InternalMyDsl.g:2186:1: rule__SubSystem__Group_6__2 : rule__SubSystem__Group_6__2__Impl rule__SubSystem__Group_6__3 ;
    public final void rule__SubSystem__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2190:1: ( rule__SubSystem__Group_6__2__Impl rule__SubSystem__Group_6__3 )
            // InternalMyDsl.g:2191:2: rule__SubSystem__Group_6__2__Impl rule__SubSystem__Group_6__3
            {
            pushFollow(FOLLOW_7);
            rule__SubSystem__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_6__3();

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
    // $ANTLR end "rule__SubSystem__Group_6__2"


    // $ANTLR start "rule__SubSystem__Group_6__2__Impl"
    // InternalMyDsl.g:2198:1: rule__SubSystem__Group_6__2__Impl : ( ( rule__SubSystem__OrdersAssignment_6_2 ) ) ;
    public final void rule__SubSystem__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2202:1: ( ( ( rule__SubSystem__OrdersAssignment_6_2 ) ) )
            // InternalMyDsl.g:2203:1: ( ( rule__SubSystem__OrdersAssignment_6_2 ) )
            {
            // InternalMyDsl.g:2203:1: ( ( rule__SubSystem__OrdersAssignment_6_2 ) )
            // InternalMyDsl.g:2204:2: ( rule__SubSystem__OrdersAssignment_6_2 )
            {
             before(grammarAccess.getSubSystemAccess().getOrdersAssignment_6_2()); 
            // InternalMyDsl.g:2205:2: ( rule__SubSystem__OrdersAssignment_6_2 )
            // InternalMyDsl.g:2205:3: rule__SubSystem__OrdersAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__SubSystem__OrdersAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getSubSystemAccess().getOrdersAssignment_6_2()); 

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
    // $ANTLR end "rule__SubSystem__Group_6__2__Impl"


    // $ANTLR start "rule__SubSystem__Group_6__3"
    // InternalMyDsl.g:2213:1: rule__SubSystem__Group_6__3 : rule__SubSystem__Group_6__3__Impl rule__SubSystem__Group_6__4 ;
    public final void rule__SubSystem__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2217:1: ( rule__SubSystem__Group_6__3__Impl rule__SubSystem__Group_6__4 )
            // InternalMyDsl.g:2218:2: rule__SubSystem__Group_6__3__Impl rule__SubSystem__Group_6__4
            {
            pushFollow(FOLLOW_7);
            rule__SubSystem__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_6__4();

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
    // $ANTLR end "rule__SubSystem__Group_6__3"


    // $ANTLR start "rule__SubSystem__Group_6__3__Impl"
    // InternalMyDsl.g:2225:1: rule__SubSystem__Group_6__3__Impl : ( ( rule__SubSystem__Group_6_3__0 )* ) ;
    public final void rule__SubSystem__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2229:1: ( ( ( rule__SubSystem__Group_6_3__0 )* ) )
            // InternalMyDsl.g:2230:1: ( ( rule__SubSystem__Group_6_3__0 )* )
            {
            // InternalMyDsl.g:2230:1: ( ( rule__SubSystem__Group_6_3__0 )* )
            // InternalMyDsl.g:2231:2: ( rule__SubSystem__Group_6_3__0 )*
            {
             before(grammarAccess.getSubSystemAccess().getGroup_6_3()); 
            // InternalMyDsl.g:2232:2: ( rule__SubSystem__Group_6_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==36) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:2232:3: rule__SubSystem__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SubSystem__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getSubSystemAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__SubSystem__Group_6__3__Impl"


    // $ANTLR start "rule__SubSystem__Group_6__4"
    // InternalMyDsl.g:2240:1: rule__SubSystem__Group_6__4 : rule__SubSystem__Group_6__4__Impl ;
    public final void rule__SubSystem__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2244:1: ( rule__SubSystem__Group_6__4__Impl )
            // InternalMyDsl.g:2245:2: rule__SubSystem__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_6__4__Impl();

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
    // $ANTLR end "rule__SubSystem__Group_6__4"


    // $ANTLR start "rule__SubSystem__Group_6__4__Impl"
    // InternalMyDsl.g:2251:1: rule__SubSystem__Group_6__4__Impl : ( '}' ) ;
    public final void rule__SubSystem__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2255:1: ( ( '}' ) )
            // InternalMyDsl.g:2256:1: ( '}' )
            {
            // InternalMyDsl.g:2256:1: ( '}' )
            // InternalMyDsl.g:2257:2: '}'
            {
             before(grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__SubSystem__Group_6__4__Impl"


    // $ANTLR start "rule__SubSystem__Group_6_3__0"
    // InternalMyDsl.g:2267:1: rule__SubSystem__Group_6_3__0 : rule__SubSystem__Group_6_3__0__Impl rule__SubSystem__Group_6_3__1 ;
    public final void rule__SubSystem__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2271:1: ( rule__SubSystem__Group_6_3__0__Impl rule__SubSystem__Group_6_3__1 )
            // InternalMyDsl.g:2272:2: rule__SubSystem__Group_6_3__0__Impl rule__SubSystem__Group_6_3__1
            {
            pushFollow(FOLLOW_18);
            rule__SubSystem__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_6_3__1();

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
    // $ANTLR end "rule__SubSystem__Group_6_3__0"


    // $ANTLR start "rule__SubSystem__Group_6_3__0__Impl"
    // InternalMyDsl.g:2279:1: rule__SubSystem__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__SubSystem__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2283:1: ( ( ',' ) )
            // InternalMyDsl.g:2284:1: ( ',' )
            {
            // InternalMyDsl.g:2284:1: ( ',' )
            // InternalMyDsl.g:2285:2: ','
            {
             before(grammarAccess.getSubSystemAccess().getCommaKeyword_6_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSubSystemAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__SubSystem__Group_6_3__0__Impl"


    // $ANTLR start "rule__SubSystem__Group_6_3__1"
    // InternalMyDsl.g:2294:1: rule__SubSystem__Group_6_3__1 : rule__SubSystem__Group_6_3__1__Impl ;
    public final void rule__SubSystem__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2298:1: ( rule__SubSystem__Group_6_3__1__Impl )
            // InternalMyDsl.g:2299:2: rule__SubSystem__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__SubSystem__Group_6_3__1"


    // $ANTLR start "rule__SubSystem__Group_6_3__1__Impl"
    // InternalMyDsl.g:2305:1: rule__SubSystem__Group_6_3__1__Impl : ( ( rule__SubSystem__OrdersAssignment_6_3_1 ) ) ;
    public final void rule__SubSystem__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2309:1: ( ( ( rule__SubSystem__OrdersAssignment_6_3_1 ) ) )
            // InternalMyDsl.g:2310:1: ( ( rule__SubSystem__OrdersAssignment_6_3_1 ) )
            {
            // InternalMyDsl.g:2310:1: ( ( rule__SubSystem__OrdersAssignment_6_3_1 ) )
            // InternalMyDsl.g:2311:2: ( rule__SubSystem__OrdersAssignment_6_3_1 )
            {
             before(grammarAccess.getSubSystemAccess().getOrdersAssignment_6_3_1()); 
            // InternalMyDsl.g:2312:2: ( rule__SubSystem__OrdersAssignment_6_3_1 )
            // InternalMyDsl.g:2312:3: rule__SubSystem__OrdersAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SubSystem__OrdersAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSubSystemAccess().getOrdersAssignment_6_3_1()); 

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
    // $ANTLR end "rule__SubSystem__Group_6_3__1__Impl"


    // $ANTLR start "rule__SubSystem__Group_7__0"
    // InternalMyDsl.g:2321:1: rule__SubSystem__Group_7__0 : rule__SubSystem__Group_7__0__Impl rule__SubSystem__Group_7__1 ;
    public final void rule__SubSystem__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2325:1: ( rule__SubSystem__Group_7__0__Impl rule__SubSystem__Group_7__1 )
            // InternalMyDsl.g:2326:2: rule__SubSystem__Group_7__0__Impl rule__SubSystem__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__SubSystem__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_7__1();

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
    // $ANTLR end "rule__SubSystem__Group_7__0"


    // $ANTLR start "rule__SubSystem__Group_7__0__Impl"
    // InternalMyDsl.g:2333:1: rule__SubSystem__Group_7__0__Impl : ( 'SavingOrders' ) ;
    public final void rule__SubSystem__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2337:1: ( ( 'SavingOrders' ) )
            // InternalMyDsl.g:2338:1: ( 'SavingOrders' )
            {
            // InternalMyDsl.g:2338:1: ( 'SavingOrders' )
            // InternalMyDsl.g:2339:2: 'SavingOrders'
            {
             before(grammarAccess.getSubSystemAccess().getSavingOrdersKeyword_7_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSubSystemAccess().getSavingOrdersKeyword_7_0()); 

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
    // $ANTLR end "rule__SubSystem__Group_7__0__Impl"


    // $ANTLR start "rule__SubSystem__Group_7__1"
    // InternalMyDsl.g:2348:1: rule__SubSystem__Group_7__1 : rule__SubSystem__Group_7__1__Impl rule__SubSystem__Group_7__2 ;
    public final void rule__SubSystem__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2352:1: ( rule__SubSystem__Group_7__1__Impl rule__SubSystem__Group_7__2 )
            // InternalMyDsl.g:2353:2: rule__SubSystem__Group_7__1__Impl rule__SubSystem__Group_7__2
            {
            pushFollow(FOLLOW_19);
            rule__SubSystem__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_7__2();

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
    // $ANTLR end "rule__SubSystem__Group_7__1"


    // $ANTLR start "rule__SubSystem__Group_7__1__Impl"
    // InternalMyDsl.g:2360:1: rule__SubSystem__Group_7__1__Impl : ( '{' ) ;
    public final void rule__SubSystem__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2364:1: ( ( '{' ) )
            // InternalMyDsl.g:2365:1: ( '{' )
            {
            // InternalMyDsl.g:2365:1: ( '{' )
            // InternalMyDsl.g:2366:2: '{'
            {
             before(grammarAccess.getSubSystemAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSubSystemAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__SubSystem__Group_7__1__Impl"


    // $ANTLR start "rule__SubSystem__Group_7__2"
    // InternalMyDsl.g:2375:1: rule__SubSystem__Group_7__2 : rule__SubSystem__Group_7__2__Impl rule__SubSystem__Group_7__3 ;
    public final void rule__SubSystem__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2379:1: ( rule__SubSystem__Group_7__2__Impl rule__SubSystem__Group_7__3 )
            // InternalMyDsl.g:2380:2: rule__SubSystem__Group_7__2__Impl rule__SubSystem__Group_7__3
            {
            pushFollow(FOLLOW_7);
            rule__SubSystem__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_7__3();

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
    // $ANTLR end "rule__SubSystem__Group_7__2"


    // $ANTLR start "rule__SubSystem__Group_7__2__Impl"
    // InternalMyDsl.g:2387:1: rule__SubSystem__Group_7__2__Impl : ( ( rule__SubSystem__SavingOrdersAssignment_7_2 ) ) ;
    public final void rule__SubSystem__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2391:1: ( ( ( rule__SubSystem__SavingOrdersAssignment_7_2 ) ) )
            // InternalMyDsl.g:2392:1: ( ( rule__SubSystem__SavingOrdersAssignment_7_2 ) )
            {
            // InternalMyDsl.g:2392:1: ( ( rule__SubSystem__SavingOrdersAssignment_7_2 ) )
            // InternalMyDsl.g:2393:2: ( rule__SubSystem__SavingOrdersAssignment_7_2 )
            {
             before(grammarAccess.getSubSystemAccess().getSavingOrdersAssignment_7_2()); 
            // InternalMyDsl.g:2394:2: ( rule__SubSystem__SavingOrdersAssignment_7_2 )
            // InternalMyDsl.g:2394:3: rule__SubSystem__SavingOrdersAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__SubSystem__SavingOrdersAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getSubSystemAccess().getSavingOrdersAssignment_7_2()); 

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
    // $ANTLR end "rule__SubSystem__Group_7__2__Impl"


    // $ANTLR start "rule__SubSystem__Group_7__3"
    // InternalMyDsl.g:2402:1: rule__SubSystem__Group_7__3 : rule__SubSystem__Group_7__3__Impl rule__SubSystem__Group_7__4 ;
    public final void rule__SubSystem__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2406:1: ( rule__SubSystem__Group_7__3__Impl rule__SubSystem__Group_7__4 )
            // InternalMyDsl.g:2407:2: rule__SubSystem__Group_7__3__Impl rule__SubSystem__Group_7__4
            {
            pushFollow(FOLLOW_7);
            rule__SubSystem__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_7__4();

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
    // $ANTLR end "rule__SubSystem__Group_7__3"


    // $ANTLR start "rule__SubSystem__Group_7__3__Impl"
    // InternalMyDsl.g:2414:1: rule__SubSystem__Group_7__3__Impl : ( ( rule__SubSystem__Group_7_3__0 )* ) ;
    public final void rule__SubSystem__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2418:1: ( ( ( rule__SubSystem__Group_7_3__0 )* ) )
            // InternalMyDsl.g:2419:1: ( ( rule__SubSystem__Group_7_3__0 )* )
            {
            // InternalMyDsl.g:2419:1: ( ( rule__SubSystem__Group_7_3__0 )* )
            // InternalMyDsl.g:2420:2: ( rule__SubSystem__Group_7_3__0 )*
            {
             before(grammarAccess.getSubSystemAccess().getGroup_7_3()); 
            // InternalMyDsl.g:2421:2: ( rule__SubSystem__Group_7_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==36) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2421:3: rule__SubSystem__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SubSystem__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getSubSystemAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__SubSystem__Group_7__3__Impl"


    // $ANTLR start "rule__SubSystem__Group_7__4"
    // InternalMyDsl.g:2429:1: rule__SubSystem__Group_7__4 : rule__SubSystem__Group_7__4__Impl ;
    public final void rule__SubSystem__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2433:1: ( rule__SubSystem__Group_7__4__Impl )
            // InternalMyDsl.g:2434:2: rule__SubSystem__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_7__4__Impl();

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
    // $ANTLR end "rule__SubSystem__Group_7__4"


    // $ANTLR start "rule__SubSystem__Group_7__4__Impl"
    // InternalMyDsl.g:2440:1: rule__SubSystem__Group_7__4__Impl : ( '}' ) ;
    public final void rule__SubSystem__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2444:1: ( ( '}' ) )
            // InternalMyDsl.g:2445:1: ( '}' )
            {
            // InternalMyDsl.g:2445:1: ( '}' )
            // InternalMyDsl.g:2446:2: '}'
            {
             before(grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__SubSystem__Group_7__4__Impl"


    // $ANTLR start "rule__SubSystem__Group_7_3__0"
    // InternalMyDsl.g:2456:1: rule__SubSystem__Group_7_3__0 : rule__SubSystem__Group_7_3__0__Impl rule__SubSystem__Group_7_3__1 ;
    public final void rule__SubSystem__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2460:1: ( rule__SubSystem__Group_7_3__0__Impl rule__SubSystem__Group_7_3__1 )
            // InternalMyDsl.g:2461:2: rule__SubSystem__Group_7_3__0__Impl rule__SubSystem__Group_7_3__1
            {
            pushFollow(FOLLOW_19);
            rule__SubSystem__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_7_3__1();

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
    // $ANTLR end "rule__SubSystem__Group_7_3__0"


    // $ANTLR start "rule__SubSystem__Group_7_3__0__Impl"
    // InternalMyDsl.g:2468:1: rule__SubSystem__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__SubSystem__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2472:1: ( ( ',' ) )
            // InternalMyDsl.g:2473:1: ( ',' )
            {
            // InternalMyDsl.g:2473:1: ( ',' )
            // InternalMyDsl.g:2474:2: ','
            {
             before(grammarAccess.getSubSystemAccess().getCommaKeyword_7_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSubSystemAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__SubSystem__Group_7_3__0__Impl"


    // $ANTLR start "rule__SubSystem__Group_7_3__1"
    // InternalMyDsl.g:2483:1: rule__SubSystem__Group_7_3__1 : rule__SubSystem__Group_7_3__1__Impl ;
    public final void rule__SubSystem__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2487:1: ( rule__SubSystem__Group_7_3__1__Impl )
            // InternalMyDsl.g:2488:2: rule__SubSystem__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubSystem__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__SubSystem__Group_7_3__1"


    // $ANTLR start "rule__SubSystem__Group_7_3__1__Impl"
    // InternalMyDsl.g:2494:1: rule__SubSystem__Group_7_3__1__Impl : ( ( rule__SubSystem__SavingOrdersAssignment_7_3_1 ) ) ;
    public final void rule__SubSystem__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2498:1: ( ( ( rule__SubSystem__SavingOrdersAssignment_7_3_1 ) ) )
            // InternalMyDsl.g:2499:1: ( ( rule__SubSystem__SavingOrdersAssignment_7_3_1 ) )
            {
            // InternalMyDsl.g:2499:1: ( ( rule__SubSystem__SavingOrdersAssignment_7_3_1 ) )
            // InternalMyDsl.g:2500:2: ( rule__SubSystem__SavingOrdersAssignment_7_3_1 )
            {
             before(grammarAccess.getSubSystemAccess().getSavingOrdersAssignment_7_3_1()); 
            // InternalMyDsl.g:2501:2: ( rule__SubSystem__SavingOrdersAssignment_7_3_1 )
            // InternalMyDsl.g:2501:3: rule__SubSystem__SavingOrdersAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SubSystem__SavingOrdersAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSubSystemAccess().getSavingOrdersAssignment_7_3_1()); 

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
    // $ANTLR end "rule__SubSystem__Group_7_3__1__Impl"


    // $ANTLR start "rule__Token__Group__0"
    // InternalMyDsl.g:2510:1: rule__Token__Group__0 : rule__Token__Group__0__Impl rule__Token__Group__1 ;
    public final void rule__Token__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2514:1: ( rule__Token__Group__0__Impl rule__Token__Group__1 )
            // InternalMyDsl.g:2515:2: rule__Token__Group__0__Impl rule__Token__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Token__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Token__Group__1();

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
    // $ANTLR end "rule__Token__Group__0"


    // $ANTLR start "rule__Token__Group__0__Impl"
    // InternalMyDsl.g:2522:1: rule__Token__Group__0__Impl : ( 'Token' ) ;
    public final void rule__Token__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2526:1: ( ( 'Token' ) )
            // InternalMyDsl.g:2527:1: ( 'Token' )
            {
            // InternalMyDsl.g:2527:1: ( 'Token' )
            // InternalMyDsl.g:2528:2: 'Token'
            {
             before(grammarAccess.getTokenAccess().getTokenKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTokenAccess().getTokenKeyword_0()); 

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
    // $ANTLR end "rule__Token__Group__0__Impl"


    // $ANTLR start "rule__Token__Group__1"
    // InternalMyDsl.g:2537:1: rule__Token__Group__1 : rule__Token__Group__1__Impl rule__Token__Group__2 ;
    public final void rule__Token__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2541:1: ( rule__Token__Group__1__Impl rule__Token__Group__2 )
            // InternalMyDsl.g:2542:2: rule__Token__Group__1__Impl rule__Token__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Token__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Token__Group__2();

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
    // $ANTLR end "rule__Token__Group__1"


    // $ANTLR start "rule__Token__Group__1__Impl"
    // InternalMyDsl.g:2549:1: rule__Token__Group__1__Impl : ( ( rule__Token__NameAssignment_1 ) ) ;
    public final void rule__Token__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2553:1: ( ( ( rule__Token__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2554:1: ( ( rule__Token__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2554:1: ( ( rule__Token__NameAssignment_1 ) )
            // InternalMyDsl.g:2555:2: ( rule__Token__NameAssignment_1 )
            {
             before(grammarAccess.getTokenAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2556:2: ( rule__Token__NameAssignment_1 )
            // InternalMyDsl.g:2556:3: rule__Token__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Token__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTokenAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Token__Group__1__Impl"


    // $ANTLR start "rule__Token__Group__2"
    // InternalMyDsl.g:2564:1: rule__Token__Group__2 : rule__Token__Group__2__Impl rule__Token__Group__3 ;
    public final void rule__Token__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2568:1: ( rule__Token__Group__2__Impl rule__Token__Group__3 )
            // InternalMyDsl.g:2569:2: rule__Token__Group__2__Impl rule__Token__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Token__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Token__Group__3();

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
    // $ANTLR end "rule__Token__Group__2"


    // $ANTLR start "rule__Token__Group__2__Impl"
    // InternalMyDsl.g:2576:1: rule__Token__Group__2__Impl : ( '{' ) ;
    public final void rule__Token__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2580:1: ( ( '{' ) )
            // InternalMyDsl.g:2581:1: ( '{' )
            {
            // InternalMyDsl.g:2581:1: ( '{' )
            // InternalMyDsl.g:2582:2: '{'
            {
             before(grammarAccess.getTokenAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTokenAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Token__Group__2__Impl"


    // $ANTLR start "rule__Token__Group__3"
    // InternalMyDsl.g:2591:1: rule__Token__Group__3 : rule__Token__Group__3__Impl rule__Token__Group__4 ;
    public final void rule__Token__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2595:1: ( rule__Token__Group__3__Impl rule__Token__Group__4 )
            // InternalMyDsl.g:2596:2: rule__Token__Group__3__Impl rule__Token__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Token__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Token__Group__4();

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
    // $ANTLR end "rule__Token__Group__3"


    // $ANTLR start "rule__Token__Group__3__Impl"
    // InternalMyDsl.g:2603:1: rule__Token__Group__3__Impl : ( ( rule__Token__Group_3__0 )? ) ;
    public final void rule__Token__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2607:1: ( ( ( rule__Token__Group_3__0 )? ) )
            // InternalMyDsl.g:2608:1: ( ( rule__Token__Group_3__0 )? )
            {
            // InternalMyDsl.g:2608:1: ( ( rule__Token__Group_3__0 )? )
            // InternalMyDsl.g:2609:2: ( rule__Token__Group_3__0 )?
            {
             before(grammarAccess.getTokenAccess().getGroup_3()); 
            // InternalMyDsl.g:2610:2: ( rule__Token__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==44) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:2610:3: rule__Token__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Token__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTokenAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Token__Group__3__Impl"


    // $ANTLR start "rule__Token__Group__4"
    // InternalMyDsl.g:2618:1: rule__Token__Group__4 : rule__Token__Group__4__Impl rule__Token__Group__5 ;
    public final void rule__Token__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2622:1: ( rule__Token__Group__4__Impl rule__Token__Group__5 )
            // InternalMyDsl.g:2623:2: rule__Token__Group__4__Impl rule__Token__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Token__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Token__Group__5();

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
    // $ANTLR end "rule__Token__Group__4"


    // $ANTLR start "rule__Token__Group__4__Impl"
    // InternalMyDsl.g:2630:1: rule__Token__Group__4__Impl : ( 'decimal' ) ;
    public final void rule__Token__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2634:1: ( ( 'decimal' ) )
            // InternalMyDsl.g:2635:1: ( 'decimal' )
            {
            // InternalMyDsl.g:2635:1: ( 'decimal' )
            // InternalMyDsl.g:2636:2: 'decimal'
            {
             before(grammarAccess.getTokenAccess().getDecimalKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTokenAccess().getDecimalKeyword_4()); 

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
    // $ANTLR end "rule__Token__Group__4__Impl"


    // $ANTLR start "rule__Token__Group__5"
    // InternalMyDsl.g:2645:1: rule__Token__Group__5 : rule__Token__Group__5__Impl rule__Token__Group__6 ;
    public final void rule__Token__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2649:1: ( rule__Token__Group__5__Impl rule__Token__Group__6 )
            // InternalMyDsl.g:2650:2: rule__Token__Group__5__Impl rule__Token__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Token__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Token__Group__6();

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
    // $ANTLR end "rule__Token__Group__5"


    // $ANTLR start "rule__Token__Group__5__Impl"
    // InternalMyDsl.g:2657:1: rule__Token__Group__5__Impl : ( ( rule__Token__DecimalAssignment_5 ) ) ;
    public final void rule__Token__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2661:1: ( ( ( rule__Token__DecimalAssignment_5 ) ) )
            // InternalMyDsl.g:2662:1: ( ( rule__Token__DecimalAssignment_5 ) )
            {
            // InternalMyDsl.g:2662:1: ( ( rule__Token__DecimalAssignment_5 ) )
            // InternalMyDsl.g:2663:2: ( rule__Token__DecimalAssignment_5 )
            {
             before(grammarAccess.getTokenAccess().getDecimalAssignment_5()); 
            // InternalMyDsl.g:2664:2: ( rule__Token__DecimalAssignment_5 )
            // InternalMyDsl.g:2664:3: rule__Token__DecimalAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Token__DecimalAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTokenAccess().getDecimalAssignment_5()); 

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
    // $ANTLR end "rule__Token__Group__5__Impl"


    // $ANTLR start "rule__Token__Group__6"
    // InternalMyDsl.g:2672:1: rule__Token__Group__6 : rule__Token__Group__6__Impl rule__Token__Group__7 ;
    public final void rule__Token__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2676:1: ( rule__Token__Group__6__Impl rule__Token__Group__7 )
            // InternalMyDsl.g:2677:2: rule__Token__Group__6__Impl rule__Token__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Token__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Token__Group__7();

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
    // $ANTLR end "rule__Token__Group__6"


    // $ANTLR start "rule__Token__Group__6__Impl"
    // InternalMyDsl.g:2684:1: rule__Token__Group__6__Impl : ( 'TokenNetwork' ) ;
    public final void rule__Token__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2688:1: ( ( 'TokenNetwork' ) )
            // InternalMyDsl.g:2689:1: ( 'TokenNetwork' )
            {
            // InternalMyDsl.g:2689:1: ( 'TokenNetwork' )
            // InternalMyDsl.g:2690:2: 'TokenNetwork'
            {
             before(grammarAccess.getTokenAccess().getTokenNetworkKeyword_6()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTokenAccess().getTokenNetworkKeyword_6()); 

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
    // $ANTLR end "rule__Token__Group__6__Impl"


    // $ANTLR start "rule__Token__Group__7"
    // InternalMyDsl.g:2699:1: rule__Token__Group__7 : rule__Token__Group__7__Impl rule__Token__Group__8 ;
    public final void rule__Token__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2703:1: ( rule__Token__Group__7__Impl rule__Token__Group__8 )
            // InternalMyDsl.g:2704:2: rule__Token__Group__7__Impl rule__Token__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Token__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Token__Group__8();

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
    // $ANTLR end "rule__Token__Group__7"


    // $ANTLR start "rule__Token__Group__7__Impl"
    // InternalMyDsl.g:2711:1: rule__Token__Group__7__Impl : ( ( rule__Token__TokenNetworkAssignment_7 ) ) ;
    public final void rule__Token__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2715:1: ( ( ( rule__Token__TokenNetworkAssignment_7 ) ) )
            // InternalMyDsl.g:2716:1: ( ( rule__Token__TokenNetworkAssignment_7 ) )
            {
            // InternalMyDsl.g:2716:1: ( ( rule__Token__TokenNetworkAssignment_7 ) )
            // InternalMyDsl.g:2717:2: ( rule__Token__TokenNetworkAssignment_7 )
            {
             before(grammarAccess.getTokenAccess().getTokenNetworkAssignment_7()); 
            // InternalMyDsl.g:2718:2: ( rule__Token__TokenNetworkAssignment_7 )
            // InternalMyDsl.g:2718:3: rule__Token__TokenNetworkAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Token__TokenNetworkAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTokenAccess().getTokenNetworkAssignment_7()); 

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
    // $ANTLR end "rule__Token__Group__7__Impl"


    // $ANTLR start "rule__Token__Group__8"
    // InternalMyDsl.g:2726:1: rule__Token__Group__8 : rule__Token__Group__8__Impl ;
    public final void rule__Token__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2730:1: ( rule__Token__Group__8__Impl )
            // InternalMyDsl.g:2731:2: rule__Token__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Token__Group__8__Impl();

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
    // $ANTLR end "rule__Token__Group__8"


    // $ANTLR start "rule__Token__Group__8__Impl"
    // InternalMyDsl.g:2737:1: rule__Token__Group__8__Impl : ( '}' ) ;
    public final void rule__Token__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2741:1: ( ( '}' ) )
            // InternalMyDsl.g:2742:1: ( '}' )
            {
            // InternalMyDsl.g:2742:1: ( '}' )
            // InternalMyDsl.g:2743:2: '}'
            {
             before(grammarAccess.getTokenAccess().getRightCurlyBracketKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTokenAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Token__Group__8__Impl"


    // $ANTLR start "rule__Token__Group_3__0"
    // InternalMyDsl.g:2753:1: rule__Token__Group_3__0 : rule__Token__Group_3__0__Impl rule__Token__Group_3__1 ;
    public final void rule__Token__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2757:1: ( rule__Token__Group_3__0__Impl rule__Token__Group_3__1 )
            // InternalMyDsl.g:2758:2: rule__Token__Group_3__0__Impl rule__Token__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Token__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Token__Group_3__1();

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
    // $ANTLR end "rule__Token__Group_3__0"


    // $ANTLR start "rule__Token__Group_3__0__Impl"
    // InternalMyDsl.g:2765:1: rule__Token__Group_3__0__Impl : ( 'address' ) ;
    public final void rule__Token__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2769:1: ( ( 'address' ) )
            // InternalMyDsl.g:2770:1: ( 'address' )
            {
            // InternalMyDsl.g:2770:1: ( 'address' )
            // InternalMyDsl.g:2771:2: 'address'
            {
             before(grammarAccess.getTokenAccess().getAddressKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTokenAccess().getAddressKeyword_3_0()); 

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
    // $ANTLR end "rule__Token__Group_3__0__Impl"


    // $ANTLR start "rule__Token__Group_3__1"
    // InternalMyDsl.g:2780:1: rule__Token__Group_3__1 : rule__Token__Group_3__1__Impl ;
    public final void rule__Token__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2784:1: ( rule__Token__Group_3__1__Impl )
            // InternalMyDsl.g:2785:2: rule__Token__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Token__Group_3__1__Impl();

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
    // $ANTLR end "rule__Token__Group_3__1"


    // $ANTLR start "rule__Token__Group_3__1__Impl"
    // InternalMyDsl.g:2791:1: rule__Token__Group_3__1__Impl : ( ( rule__Token__AddressAssignment_3_1 ) ) ;
    public final void rule__Token__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2795:1: ( ( ( rule__Token__AddressAssignment_3_1 ) ) )
            // InternalMyDsl.g:2796:1: ( ( rule__Token__AddressAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2796:1: ( ( rule__Token__AddressAssignment_3_1 ) )
            // InternalMyDsl.g:2797:2: ( rule__Token__AddressAssignment_3_1 )
            {
             before(grammarAccess.getTokenAccess().getAddressAssignment_3_1()); 
            // InternalMyDsl.g:2798:2: ( rule__Token__AddressAssignment_3_1 )
            // InternalMyDsl.g:2798:3: rule__Token__AddressAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Token__AddressAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTokenAccess().getAddressAssignment_3_1()); 

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
    // $ANTLR end "rule__Token__Group_3__1__Impl"


    // $ANTLR start "rule__TokenNetwork__Group__0"
    // InternalMyDsl.g:2807:1: rule__TokenNetwork__Group__0 : rule__TokenNetwork__Group__0__Impl rule__TokenNetwork__Group__1 ;
    public final void rule__TokenNetwork__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2811:1: ( rule__TokenNetwork__Group__0__Impl rule__TokenNetwork__Group__1 )
            // InternalMyDsl.g:2812:2: rule__TokenNetwork__Group__0__Impl rule__TokenNetwork__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TokenNetwork__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenNetwork__Group__1();

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
    // $ANTLR end "rule__TokenNetwork__Group__0"


    // $ANTLR start "rule__TokenNetwork__Group__0__Impl"
    // InternalMyDsl.g:2819:1: rule__TokenNetwork__Group__0__Impl : ( 'TokenNetwork' ) ;
    public final void rule__TokenNetwork__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2823:1: ( ( 'TokenNetwork' ) )
            // InternalMyDsl.g:2824:1: ( 'TokenNetwork' )
            {
            // InternalMyDsl.g:2824:1: ( 'TokenNetwork' )
            // InternalMyDsl.g:2825:2: 'TokenNetwork'
            {
             before(grammarAccess.getTokenNetworkAccess().getTokenNetworkKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTokenNetworkAccess().getTokenNetworkKeyword_0()); 

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
    // $ANTLR end "rule__TokenNetwork__Group__0__Impl"


    // $ANTLR start "rule__TokenNetwork__Group__1"
    // InternalMyDsl.g:2834:1: rule__TokenNetwork__Group__1 : rule__TokenNetwork__Group__1__Impl rule__TokenNetwork__Group__2 ;
    public final void rule__TokenNetwork__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2838:1: ( rule__TokenNetwork__Group__1__Impl rule__TokenNetwork__Group__2 )
            // InternalMyDsl.g:2839:2: rule__TokenNetwork__Group__1__Impl rule__TokenNetwork__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TokenNetwork__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenNetwork__Group__2();

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
    // $ANTLR end "rule__TokenNetwork__Group__1"


    // $ANTLR start "rule__TokenNetwork__Group__1__Impl"
    // InternalMyDsl.g:2846:1: rule__TokenNetwork__Group__1__Impl : ( ( rule__TokenNetwork__NameAssignment_1 ) ) ;
    public final void rule__TokenNetwork__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2850:1: ( ( ( rule__TokenNetwork__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2851:1: ( ( rule__TokenNetwork__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2851:1: ( ( rule__TokenNetwork__NameAssignment_1 ) )
            // InternalMyDsl.g:2852:2: ( rule__TokenNetwork__NameAssignment_1 )
            {
             before(grammarAccess.getTokenNetworkAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2853:2: ( rule__TokenNetwork__NameAssignment_1 )
            // InternalMyDsl.g:2853:3: rule__TokenNetwork__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TokenNetwork__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTokenNetworkAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__TokenNetwork__Group__1__Impl"


    // $ANTLR start "rule__TokenNetwork__Group__2"
    // InternalMyDsl.g:2861:1: rule__TokenNetwork__Group__2 : rule__TokenNetwork__Group__2__Impl rule__TokenNetwork__Group__3 ;
    public final void rule__TokenNetwork__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2865:1: ( rule__TokenNetwork__Group__2__Impl rule__TokenNetwork__Group__3 )
            // InternalMyDsl.g:2866:2: rule__TokenNetwork__Group__2__Impl rule__TokenNetwork__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__TokenNetwork__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenNetwork__Group__3();

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
    // $ANTLR end "rule__TokenNetwork__Group__2"


    // $ANTLR start "rule__TokenNetwork__Group__2__Impl"
    // InternalMyDsl.g:2873:1: rule__TokenNetwork__Group__2__Impl : ( '{' ) ;
    public final void rule__TokenNetwork__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2877:1: ( ( '{' ) )
            // InternalMyDsl.g:2878:1: ( '{' )
            {
            // InternalMyDsl.g:2878:1: ( '{' )
            // InternalMyDsl.g:2879:2: '{'
            {
             before(grammarAccess.getTokenNetworkAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTokenNetworkAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__TokenNetwork__Group__2__Impl"


    // $ANTLR start "rule__TokenNetwork__Group__3"
    // InternalMyDsl.g:2888:1: rule__TokenNetwork__Group__3 : rule__TokenNetwork__Group__3__Impl rule__TokenNetwork__Group__4 ;
    public final void rule__TokenNetwork__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2892:1: ( rule__TokenNetwork__Group__3__Impl rule__TokenNetwork__Group__4 )
            // InternalMyDsl.g:2893:2: rule__TokenNetwork__Group__3__Impl rule__TokenNetwork__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__TokenNetwork__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenNetwork__Group__4();

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
    // $ANTLR end "rule__TokenNetwork__Group__3"


    // $ANTLR start "rule__TokenNetwork__Group__3__Impl"
    // InternalMyDsl.g:2900:1: rule__TokenNetwork__Group__3__Impl : ( 'chainID' ) ;
    public final void rule__TokenNetwork__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2904:1: ( ( 'chainID' ) )
            // InternalMyDsl.g:2905:1: ( 'chainID' )
            {
            // InternalMyDsl.g:2905:1: ( 'chainID' )
            // InternalMyDsl.g:2906:2: 'chainID'
            {
             before(grammarAccess.getTokenNetworkAccess().getChainIDKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTokenNetworkAccess().getChainIDKeyword_3()); 

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
    // $ANTLR end "rule__TokenNetwork__Group__3__Impl"


    // $ANTLR start "rule__TokenNetwork__Group__4"
    // InternalMyDsl.g:2915:1: rule__TokenNetwork__Group__4 : rule__TokenNetwork__Group__4__Impl rule__TokenNetwork__Group__5 ;
    public final void rule__TokenNetwork__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2919:1: ( rule__TokenNetwork__Group__4__Impl rule__TokenNetwork__Group__5 )
            // InternalMyDsl.g:2920:2: rule__TokenNetwork__Group__4__Impl rule__TokenNetwork__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__TokenNetwork__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenNetwork__Group__5();

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
    // $ANTLR end "rule__TokenNetwork__Group__4"


    // $ANTLR start "rule__TokenNetwork__Group__4__Impl"
    // InternalMyDsl.g:2927:1: rule__TokenNetwork__Group__4__Impl : ( ( rule__TokenNetwork__ChainIDAssignment_4 ) ) ;
    public final void rule__TokenNetwork__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2931:1: ( ( ( rule__TokenNetwork__ChainIDAssignment_4 ) ) )
            // InternalMyDsl.g:2932:1: ( ( rule__TokenNetwork__ChainIDAssignment_4 ) )
            {
            // InternalMyDsl.g:2932:1: ( ( rule__TokenNetwork__ChainIDAssignment_4 ) )
            // InternalMyDsl.g:2933:2: ( rule__TokenNetwork__ChainIDAssignment_4 )
            {
             before(grammarAccess.getTokenNetworkAccess().getChainIDAssignment_4()); 
            // InternalMyDsl.g:2934:2: ( rule__TokenNetwork__ChainIDAssignment_4 )
            // InternalMyDsl.g:2934:3: rule__TokenNetwork__ChainIDAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TokenNetwork__ChainIDAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTokenNetworkAccess().getChainIDAssignment_4()); 

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
    // $ANTLR end "rule__TokenNetwork__Group__4__Impl"


    // $ANTLR start "rule__TokenNetwork__Group__5"
    // InternalMyDsl.g:2942:1: rule__TokenNetwork__Group__5 : rule__TokenNetwork__Group__5__Impl rule__TokenNetwork__Group__6 ;
    public final void rule__TokenNetwork__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2946:1: ( rule__TokenNetwork__Group__5__Impl rule__TokenNetwork__Group__6 )
            // InternalMyDsl.g:2947:2: rule__TokenNetwork__Group__5__Impl rule__TokenNetwork__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__TokenNetwork__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenNetwork__Group__6();

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
    // $ANTLR end "rule__TokenNetwork__Group__5"


    // $ANTLR start "rule__TokenNetwork__Group__5__Impl"
    // InternalMyDsl.g:2954:1: rule__TokenNetwork__Group__5__Impl : ( ( rule__TokenNetwork__Group_5__0 )? ) ;
    public final void rule__TokenNetwork__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2958:1: ( ( ( rule__TokenNetwork__Group_5__0 )? ) )
            // InternalMyDsl.g:2959:1: ( ( rule__TokenNetwork__Group_5__0 )? )
            {
            // InternalMyDsl.g:2959:1: ( ( rule__TokenNetwork__Group_5__0 )? )
            // InternalMyDsl.g:2960:2: ( rule__TokenNetwork__Group_5__0 )?
            {
             before(grammarAccess.getTokenNetworkAccess().getGroup_5()); 
            // InternalMyDsl.g:2961:2: ( rule__TokenNetwork__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2961:3: rule__TokenNetwork__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TokenNetwork__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTokenNetworkAccess().getGroup_5()); 

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
    // $ANTLR end "rule__TokenNetwork__Group__5__Impl"


    // $ANTLR start "rule__TokenNetwork__Group__6"
    // InternalMyDsl.g:2969:1: rule__TokenNetwork__Group__6 : rule__TokenNetwork__Group__6__Impl ;
    public final void rule__TokenNetwork__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2973:1: ( rule__TokenNetwork__Group__6__Impl )
            // InternalMyDsl.g:2974:2: rule__TokenNetwork__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TokenNetwork__Group__6__Impl();

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
    // $ANTLR end "rule__TokenNetwork__Group__6"


    // $ANTLR start "rule__TokenNetwork__Group__6__Impl"
    // InternalMyDsl.g:2980:1: rule__TokenNetwork__Group__6__Impl : ( '}' ) ;
    public final void rule__TokenNetwork__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2984:1: ( ( '}' ) )
            // InternalMyDsl.g:2985:1: ( '}' )
            {
            // InternalMyDsl.g:2985:1: ( '}' )
            // InternalMyDsl.g:2986:2: '}'
            {
             before(grammarAccess.getTokenNetworkAccess().getRightCurlyBracketKeyword_6()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTokenNetworkAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__TokenNetwork__Group__6__Impl"


    // $ANTLR start "rule__TokenNetwork__Group_5__0"
    // InternalMyDsl.g:2996:1: rule__TokenNetwork__Group_5__0 : rule__TokenNetwork__Group_5__0__Impl rule__TokenNetwork__Group_5__1 ;
    public final void rule__TokenNetwork__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3000:1: ( rule__TokenNetwork__Group_5__0__Impl rule__TokenNetwork__Group_5__1 )
            // InternalMyDsl.g:3001:2: rule__TokenNetwork__Group_5__0__Impl rule__TokenNetwork__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__TokenNetwork__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenNetwork__Group_5__1();

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
    // $ANTLR end "rule__TokenNetwork__Group_5__0"


    // $ANTLR start "rule__TokenNetwork__Group_5__0__Impl"
    // InternalMyDsl.g:3008:1: rule__TokenNetwork__Group_5__0__Impl : ( 'RPC' ) ;
    public final void rule__TokenNetwork__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3012:1: ( ( 'RPC' ) )
            // InternalMyDsl.g:3013:1: ( 'RPC' )
            {
            // InternalMyDsl.g:3013:1: ( 'RPC' )
            // InternalMyDsl.g:3014:2: 'RPC'
            {
             before(grammarAccess.getTokenNetworkAccess().getRPCKeyword_5_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTokenNetworkAccess().getRPCKeyword_5_0()); 

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
    // $ANTLR end "rule__TokenNetwork__Group_5__0__Impl"


    // $ANTLR start "rule__TokenNetwork__Group_5__1"
    // InternalMyDsl.g:3023:1: rule__TokenNetwork__Group_5__1 : rule__TokenNetwork__Group_5__1__Impl ;
    public final void rule__TokenNetwork__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3027:1: ( rule__TokenNetwork__Group_5__1__Impl )
            // InternalMyDsl.g:3028:2: rule__TokenNetwork__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TokenNetwork__Group_5__1__Impl();

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
    // $ANTLR end "rule__TokenNetwork__Group_5__1"


    // $ANTLR start "rule__TokenNetwork__Group_5__1__Impl"
    // InternalMyDsl.g:3034:1: rule__TokenNetwork__Group_5__1__Impl : ( ( rule__TokenNetwork__RPCAssignment_5_1 ) ) ;
    public final void rule__TokenNetwork__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3038:1: ( ( ( rule__TokenNetwork__RPCAssignment_5_1 ) ) )
            // InternalMyDsl.g:3039:1: ( ( rule__TokenNetwork__RPCAssignment_5_1 ) )
            {
            // InternalMyDsl.g:3039:1: ( ( rule__TokenNetwork__RPCAssignment_5_1 ) )
            // InternalMyDsl.g:3040:2: ( rule__TokenNetwork__RPCAssignment_5_1 )
            {
             before(grammarAccess.getTokenNetworkAccess().getRPCAssignment_5_1()); 
            // InternalMyDsl.g:3041:2: ( rule__TokenNetwork__RPCAssignment_5_1 )
            // InternalMyDsl.g:3041:3: rule__TokenNetwork__RPCAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TokenNetwork__RPCAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTokenNetworkAccess().getRPCAssignment_5_1()); 

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
    // $ANTLR end "rule__TokenNetwork__Group_5__1__Impl"


    // $ANTLR start "rule__Account__Group__0"
    // InternalMyDsl.g:3050:1: rule__Account__Group__0 : rule__Account__Group__0__Impl rule__Account__Group__1 ;
    public final void rule__Account__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3054:1: ( rule__Account__Group__0__Impl rule__Account__Group__1 )
            // InternalMyDsl.g:3055:2: rule__Account__Group__0__Impl rule__Account__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Account__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group__1();

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
    // $ANTLR end "rule__Account__Group__0"


    // $ANTLR start "rule__Account__Group__0__Impl"
    // InternalMyDsl.g:3062:1: rule__Account__Group__0__Impl : ( () ) ;
    public final void rule__Account__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3066:1: ( ( () ) )
            // InternalMyDsl.g:3067:1: ( () )
            {
            // InternalMyDsl.g:3067:1: ( () )
            // InternalMyDsl.g:3068:2: ()
            {
             before(grammarAccess.getAccountAccess().getAccountAction_0()); 
            // InternalMyDsl.g:3069:2: ()
            // InternalMyDsl.g:3069:3: 
            {
            }

             after(grammarAccess.getAccountAccess().getAccountAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Account__Group__0__Impl"


    // $ANTLR start "rule__Account__Group__1"
    // InternalMyDsl.g:3077:1: rule__Account__Group__1 : rule__Account__Group__1__Impl rule__Account__Group__2 ;
    public final void rule__Account__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3081:1: ( rule__Account__Group__1__Impl rule__Account__Group__2 )
            // InternalMyDsl.g:3082:2: rule__Account__Group__1__Impl rule__Account__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Account__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group__2();

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
    // $ANTLR end "rule__Account__Group__1"


    // $ANTLR start "rule__Account__Group__1__Impl"
    // InternalMyDsl.g:3089:1: rule__Account__Group__1__Impl : ( 'Account' ) ;
    public final void rule__Account__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3093:1: ( ( 'Account' ) )
            // InternalMyDsl.g:3094:1: ( 'Account' )
            {
            // InternalMyDsl.g:3094:1: ( 'Account' )
            // InternalMyDsl.g:3095:2: 'Account'
            {
             before(grammarAccess.getAccountAccess().getAccountKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getAccountKeyword_1()); 

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
    // $ANTLR end "rule__Account__Group__1__Impl"


    // $ANTLR start "rule__Account__Group__2"
    // InternalMyDsl.g:3104:1: rule__Account__Group__2 : rule__Account__Group__2__Impl rule__Account__Group__3 ;
    public final void rule__Account__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3108:1: ( rule__Account__Group__2__Impl rule__Account__Group__3 )
            // InternalMyDsl.g:3109:2: rule__Account__Group__2__Impl rule__Account__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Account__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group__3();

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
    // $ANTLR end "rule__Account__Group__2"


    // $ANTLR start "rule__Account__Group__2__Impl"
    // InternalMyDsl.g:3116:1: rule__Account__Group__2__Impl : ( '{' ) ;
    public final void rule__Account__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3120:1: ( ( '{' ) )
            // InternalMyDsl.g:3121:1: ( '{' )
            {
            // InternalMyDsl.g:3121:1: ( '{' )
            // InternalMyDsl.g:3122:2: '{'
            {
             before(grammarAccess.getAccountAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Account__Group__2__Impl"


    // $ANTLR start "rule__Account__Group__3"
    // InternalMyDsl.g:3131:1: rule__Account__Group__3 : rule__Account__Group__3__Impl rule__Account__Group__4 ;
    public final void rule__Account__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3135:1: ( rule__Account__Group__3__Impl rule__Account__Group__4 )
            // InternalMyDsl.g:3136:2: rule__Account__Group__3__Impl rule__Account__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Account__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group__4();

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
    // $ANTLR end "rule__Account__Group__3"


    // $ANTLR start "rule__Account__Group__3__Impl"
    // InternalMyDsl.g:3143:1: rule__Account__Group__3__Impl : ( ( rule__Account__Group_3__0 )? ) ;
    public final void rule__Account__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3147:1: ( ( ( rule__Account__Group_3__0 )? ) )
            // InternalMyDsl.g:3148:1: ( ( rule__Account__Group_3__0 )? )
            {
            // InternalMyDsl.g:3148:1: ( ( rule__Account__Group_3__0 )? )
            // InternalMyDsl.g:3149:2: ( rule__Account__Group_3__0 )?
            {
             before(grammarAccess.getAccountAccess().getGroup_3()); 
            // InternalMyDsl.g:3150:2: ( rule__Account__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==48) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:3150:3: rule__Account__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Account__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAccountAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Account__Group__3__Impl"


    // $ANTLR start "rule__Account__Group__4"
    // InternalMyDsl.g:3158:1: rule__Account__Group__4 : rule__Account__Group__4__Impl rule__Account__Group__5 ;
    public final void rule__Account__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3162:1: ( rule__Account__Group__4__Impl rule__Account__Group__5 )
            // InternalMyDsl.g:3163:2: rule__Account__Group__4__Impl rule__Account__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Account__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group__5();

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
    // $ANTLR end "rule__Account__Group__4"


    // $ANTLR start "rule__Account__Group__4__Impl"
    // InternalMyDsl.g:3170:1: rule__Account__Group__4__Impl : ( ( rule__Account__Group_4__0 )? ) ;
    public final void rule__Account__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3174:1: ( ( ( rule__Account__Group_4__0 )? ) )
            // InternalMyDsl.g:3175:1: ( ( rule__Account__Group_4__0 )? )
            {
            // InternalMyDsl.g:3175:1: ( ( rule__Account__Group_4__0 )? )
            // InternalMyDsl.g:3176:2: ( rule__Account__Group_4__0 )?
            {
             before(grammarAccess.getAccountAccess().getGroup_4()); 
            // InternalMyDsl.g:3177:2: ( rule__Account__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==49) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:3177:3: rule__Account__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Account__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAccountAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Account__Group__4__Impl"


    // $ANTLR start "rule__Account__Group__5"
    // InternalMyDsl.g:3185:1: rule__Account__Group__5 : rule__Account__Group__5__Impl ;
    public final void rule__Account__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3189:1: ( rule__Account__Group__5__Impl )
            // InternalMyDsl.g:3190:2: rule__Account__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Account__Group__5__Impl();

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
    // $ANTLR end "rule__Account__Group__5"


    // $ANTLR start "rule__Account__Group__5__Impl"
    // InternalMyDsl.g:3196:1: rule__Account__Group__5__Impl : ( '}' ) ;
    public final void rule__Account__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3200:1: ( ( '}' ) )
            // InternalMyDsl.g:3201:1: ( '}' )
            {
            // InternalMyDsl.g:3201:1: ( '}' )
            // InternalMyDsl.g:3202:2: '}'
            {
             before(grammarAccess.getAccountAccess().getRightCurlyBracketKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Account__Group__5__Impl"


    // $ANTLR start "rule__Account__Group_3__0"
    // InternalMyDsl.g:3212:1: rule__Account__Group_3__0 : rule__Account__Group_3__0__Impl rule__Account__Group_3__1 ;
    public final void rule__Account__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3216:1: ( rule__Account__Group_3__0__Impl rule__Account__Group_3__1 )
            // InternalMyDsl.g:3217:2: rule__Account__Group_3__0__Impl rule__Account__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Account__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group_3__1();

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
    // $ANTLR end "rule__Account__Group_3__0"


    // $ANTLR start "rule__Account__Group_3__0__Impl"
    // InternalMyDsl.g:3224:1: rule__Account__Group_3__0__Impl : ( 'TokensBalance' ) ;
    public final void rule__Account__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3228:1: ( ( 'TokensBalance' ) )
            // InternalMyDsl.g:3229:1: ( 'TokensBalance' )
            {
            // InternalMyDsl.g:3229:1: ( 'TokensBalance' )
            // InternalMyDsl.g:3230:2: 'TokensBalance'
            {
             before(grammarAccess.getAccountAccess().getTokensBalanceKeyword_3_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getTokensBalanceKeyword_3_0()); 

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
    // $ANTLR end "rule__Account__Group_3__0__Impl"


    // $ANTLR start "rule__Account__Group_3__1"
    // InternalMyDsl.g:3239:1: rule__Account__Group_3__1 : rule__Account__Group_3__1__Impl rule__Account__Group_3__2 ;
    public final void rule__Account__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3243:1: ( rule__Account__Group_3__1__Impl rule__Account__Group_3__2 )
            // InternalMyDsl.g:3244:2: rule__Account__Group_3__1__Impl rule__Account__Group_3__2
            {
            pushFollow(FOLLOW_25);
            rule__Account__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group_3__2();

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
    // $ANTLR end "rule__Account__Group_3__1"


    // $ANTLR start "rule__Account__Group_3__1__Impl"
    // InternalMyDsl.g:3251:1: rule__Account__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Account__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3255:1: ( ( '{' ) )
            // InternalMyDsl.g:3256:1: ( '{' )
            {
            // InternalMyDsl.g:3256:1: ( '{' )
            // InternalMyDsl.g:3257:2: '{'
            {
             before(grammarAccess.getAccountAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__Account__Group_3__1__Impl"


    // $ANTLR start "rule__Account__Group_3__2"
    // InternalMyDsl.g:3266:1: rule__Account__Group_3__2 : rule__Account__Group_3__2__Impl rule__Account__Group_3__3 ;
    public final void rule__Account__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3270:1: ( rule__Account__Group_3__2__Impl rule__Account__Group_3__3 )
            // InternalMyDsl.g:3271:2: rule__Account__Group_3__2__Impl rule__Account__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__Account__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group_3__3();

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
    // $ANTLR end "rule__Account__Group_3__2"


    // $ANTLR start "rule__Account__Group_3__2__Impl"
    // InternalMyDsl.g:3278:1: rule__Account__Group_3__2__Impl : ( ( rule__Account__TokensBalanceAssignment_3_2 ) ) ;
    public final void rule__Account__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3282:1: ( ( ( rule__Account__TokensBalanceAssignment_3_2 ) ) )
            // InternalMyDsl.g:3283:1: ( ( rule__Account__TokensBalanceAssignment_3_2 ) )
            {
            // InternalMyDsl.g:3283:1: ( ( rule__Account__TokensBalanceAssignment_3_2 ) )
            // InternalMyDsl.g:3284:2: ( rule__Account__TokensBalanceAssignment_3_2 )
            {
             before(grammarAccess.getAccountAccess().getTokensBalanceAssignment_3_2()); 
            // InternalMyDsl.g:3285:2: ( rule__Account__TokensBalanceAssignment_3_2 )
            // InternalMyDsl.g:3285:3: rule__Account__TokensBalanceAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Account__TokensBalanceAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getAccountAccess().getTokensBalanceAssignment_3_2()); 

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
    // $ANTLR end "rule__Account__Group_3__2__Impl"


    // $ANTLR start "rule__Account__Group_3__3"
    // InternalMyDsl.g:3293:1: rule__Account__Group_3__3 : rule__Account__Group_3__3__Impl rule__Account__Group_3__4 ;
    public final void rule__Account__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3297:1: ( rule__Account__Group_3__3__Impl rule__Account__Group_3__4 )
            // InternalMyDsl.g:3298:2: rule__Account__Group_3__3__Impl rule__Account__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__Account__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group_3__4();

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
    // $ANTLR end "rule__Account__Group_3__3"


    // $ANTLR start "rule__Account__Group_3__3__Impl"
    // InternalMyDsl.g:3305:1: rule__Account__Group_3__3__Impl : ( ( rule__Account__Group_3_3__0 )* ) ;
    public final void rule__Account__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3309:1: ( ( ( rule__Account__Group_3_3__0 )* ) )
            // InternalMyDsl.g:3310:1: ( ( rule__Account__Group_3_3__0 )* )
            {
            // InternalMyDsl.g:3310:1: ( ( rule__Account__Group_3_3__0 )* )
            // InternalMyDsl.g:3311:2: ( rule__Account__Group_3_3__0 )*
            {
             before(grammarAccess.getAccountAccess().getGroup_3_3()); 
            // InternalMyDsl.g:3312:2: ( rule__Account__Group_3_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==36) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:3312:3: rule__Account__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Account__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getAccountAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__Account__Group_3__3__Impl"


    // $ANTLR start "rule__Account__Group_3__4"
    // InternalMyDsl.g:3320:1: rule__Account__Group_3__4 : rule__Account__Group_3__4__Impl ;
    public final void rule__Account__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3324:1: ( rule__Account__Group_3__4__Impl )
            // InternalMyDsl.g:3325:2: rule__Account__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Account__Group_3__4__Impl();

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
    // $ANTLR end "rule__Account__Group_3__4"


    // $ANTLR start "rule__Account__Group_3__4__Impl"
    // InternalMyDsl.g:3331:1: rule__Account__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Account__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3335:1: ( ( '}' ) )
            // InternalMyDsl.g:3336:1: ( '}' )
            {
            // InternalMyDsl.g:3336:1: ( '}' )
            // InternalMyDsl.g:3337:2: '}'
            {
             before(grammarAccess.getAccountAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__Account__Group_3__4__Impl"


    // $ANTLR start "rule__Account__Group_3_3__0"
    // InternalMyDsl.g:3347:1: rule__Account__Group_3_3__0 : rule__Account__Group_3_3__0__Impl rule__Account__Group_3_3__1 ;
    public final void rule__Account__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3351:1: ( rule__Account__Group_3_3__0__Impl rule__Account__Group_3_3__1 )
            // InternalMyDsl.g:3352:2: rule__Account__Group_3_3__0__Impl rule__Account__Group_3_3__1
            {
            pushFollow(FOLLOW_25);
            rule__Account__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group_3_3__1();

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
    // $ANTLR end "rule__Account__Group_3_3__0"


    // $ANTLR start "rule__Account__Group_3_3__0__Impl"
    // InternalMyDsl.g:3359:1: rule__Account__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Account__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3363:1: ( ( ',' ) )
            // InternalMyDsl.g:3364:1: ( ',' )
            {
            // InternalMyDsl.g:3364:1: ( ',' )
            // InternalMyDsl.g:3365:2: ','
            {
             before(grammarAccess.getAccountAccess().getCommaKeyword_3_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Account__Group_3_3__0__Impl"


    // $ANTLR start "rule__Account__Group_3_3__1"
    // InternalMyDsl.g:3374:1: rule__Account__Group_3_3__1 : rule__Account__Group_3_3__1__Impl ;
    public final void rule__Account__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3378:1: ( rule__Account__Group_3_3__1__Impl )
            // InternalMyDsl.g:3379:2: rule__Account__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Account__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Account__Group_3_3__1"


    // $ANTLR start "rule__Account__Group_3_3__1__Impl"
    // InternalMyDsl.g:3385:1: rule__Account__Group_3_3__1__Impl : ( ( rule__Account__TokensBalanceAssignment_3_3_1 ) ) ;
    public final void rule__Account__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3389:1: ( ( ( rule__Account__TokensBalanceAssignment_3_3_1 ) ) )
            // InternalMyDsl.g:3390:1: ( ( rule__Account__TokensBalanceAssignment_3_3_1 ) )
            {
            // InternalMyDsl.g:3390:1: ( ( rule__Account__TokensBalanceAssignment_3_3_1 ) )
            // InternalMyDsl.g:3391:2: ( rule__Account__TokensBalanceAssignment_3_3_1 )
            {
             before(grammarAccess.getAccountAccess().getTokensBalanceAssignment_3_3_1()); 
            // InternalMyDsl.g:3392:2: ( rule__Account__TokensBalanceAssignment_3_3_1 )
            // InternalMyDsl.g:3392:3: rule__Account__TokensBalanceAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Account__TokensBalanceAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAccountAccess().getTokensBalanceAssignment_3_3_1()); 

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
    // $ANTLR end "rule__Account__Group_3_3__1__Impl"


    // $ANTLR start "rule__Account__Group_4__0"
    // InternalMyDsl.g:3401:1: rule__Account__Group_4__0 : rule__Account__Group_4__0__Impl rule__Account__Group_4__1 ;
    public final void rule__Account__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3405:1: ( rule__Account__Group_4__0__Impl rule__Account__Group_4__1 )
            // InternalMyDsl.g:3406:2: rule__Account__Group_4__0__Impl rule__Account__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Account__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group_4__1();

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
    // $ANTLR end "rule__Account__Group_4__0"


    // $ANTLR start "rule__Account__Group_4__0__Impl"
    // InternalMyDsl.g:3413:1: rule__Account__Group_4__0__Impl : ( 'transferRequest' ) ;
    public final void rule__Account__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3417:1: ( ( 'transferRequest' ) )
            // InternalMyDsl.g:3418:1: ( 'transferRequest' )
            {
            // InternalMyDsl.g:3418:1: ( 'transferRequest' )
            // InternalMyDsl.g:3419:2: 'transferRequest'
            {
             before(grammarAccess.getAccountAccess().getTransferRequestKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getTransferRequestKeyword_4_0()); 

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
    // $ANTLR end "rule__Account__Group_4__0__Impl"


    // $ANTLR start "rule__Account__Group_4__1"
    // InternalMyDsl.g:3428:1: rule__Account__Group_4__1 : rule__Account__Group_4__1__Impl rule__Account__Group_4__2 ;
    public final void rule__Account__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3432:1: ( rule__Account__Group_4__1__Impl rule__Account__Group_4__2 )
            // InternalMyDsl.g:3433:2: rule__Account__Group_4__1__Impl rule__Account__Group_4__2
            {
            pushFollow(FOLLOW_26);
            rule__Account__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group_4__2();

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
    // $ANTLR end "rule__Account__Group_4__1"


    // $ANTLR start "rule__Account__Group_4__1__Impl"
    // InternalMyDsl.g:3440:1: rule__Account__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Account__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3444:1: ( ( '{' ) )
            // InternalMyDsl.g:3445:1: ( '{' )
            {
            // InternalMyDsl.g:3445:1: ( '{' )
            // InternalMyDsl.g:3446:2: '{'
            {
             before(grammarAccess.getAccountAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Account__Group_4__1__Impl"


    // $ANTLR start "rule__Account__Group_4__2"
    // InternalMyDsl.g:3455:1: rule__Account__Group_4__2 : rule__Account__Group_4__2__Impl rule__Account__Group_4__3 ;
    public final void rule__Account__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3459:1: ( rule__Account__Group_4__2__Impl rule__Account__Group_4__3 )
            // InternalMyDsl.g:3460:2: rule__Account__Group_4__2__Impl rule__Account__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__Account__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group_4__3();

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
    // $ANTLR end "rule__Account__Group_4__2"


    // $ANTLR start "rule__Account__Group_4__2__Impl"
    // InternalMyDsl.g:3467:1: rule__Account__Group_4__2__Impl : ( ( rule__Account__TransferRequestAssignment_4_2 ) ) ;
    public final void rule__Account__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3471:1: ( ( ( rule__Account__TransferRequestAssignment_4_2 ) ) )
            // InternalMyDsl.g:3472:1: ( ( rule__Account__TransferRequestAssignment_4_2 ) )
            {
            // InternalMyDsl.g:3472:1: ( ( rule__Account__TransferRequestAssignment_4_2 ) )
            // InternalMyDsl.g:3473:2: ( rule__Account__TransferRequestAssignment_4_2 )
            {
             before(grammarAccess.getAccountAccess().getTransferRequestAssignment_4_2()); 
            // InternalMyDsl.g:3474:2: ( rule__Account__TransferRequestAssignment_4_2 )
            // InternalMyDsl.g:3474:3: rule__Account__TransferRequestAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Account__TransferRequestAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getAccountAccess().getTransferRequestAssignment_4_2()); 

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
    // $ANTLR end "rule__Account__Group_4__2__Impl"


    // $ANTLR start "rule__Account__Group_4__3"
    // InternalMyDsl.g:3482:1: rule__Account__Group_4__3 : rule__Account__Group_4__3__Impl rule__Account__Group_4__4 ;
    public final void rule__Account__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3486:1: ( rule__Account__Group_4__3__Impl rule__Account__Group_4__4 )
            // InternalMyDsl.g:3487:2: rule__Account__Group_4__3__Impl rule__Account__Group_4__4
            {
            pushFollow(FOLLOW_7);
            rule__Account__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group_4__4();

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
    // $ANTLR end "rule__Account__Group_4__3"


    // $ANTLR start "rule__Account__Group_4__3__Impl"
    // InternalMyDsl.g:3494:1: rule__Account__Group_4__3__Impl : ( ( rule__Account__Group_4_3__0 )* ) ;
    public final void rule__Account__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3498:1: ( ( ( rule__Account__Group_4_3__0 )* ) )
            // InternalMyDsl.g:3499:1: ( ( rule__Account__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:3499:1: ( ( rule__Account__Group_4_3__0 )* )
            // InternalMyDsl.g:3500:2: ( rule__Account__Group_4_3__0 )*
            {
             before(grammarAccess.getAccountAccess().getGroup_4_3()); 
            // InternalMyDsl.g:3501:2: ( rule__Account__Group_4_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==36) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMyDsl.g:3501:3: rule__Account__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Account__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getAccountAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Account__Group_4__3__Impl"


    // $ANTLR start "rule__Account__Group_4__4"
    // InternalMyDsl.g:3509:1: rule__Account__Group_4__4 : rule__Account__Group_4__4__Impl ;
    public final void rule__Account__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3513:1: ( rule__Account__Group_4__4__Impl )
            // InternalMyDsl.g:3514:2: rule__Account__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Account__Group_4__4__Impl();

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
    // $ANTLR end "rule__Account__Group_4__4"


    // $ANTLR start "rule__Account__Group_4__4__Impl"
    // InternalMyDsl.g:3520:1: rule__Account__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Account__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3524:1: ( ( '}' ) )
            // InternalMyDsl.g:3525:1: ( '}' )
            {
            // InternalMyDsl.g:3525:1: ( '}' )
            // InternalMyDsl.g:3526:2: '}'
            {
             before(grammarAccess.getAccountAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Account__Group_4__4__Impl"


    // $ANTLR start "rule__Account__Group_4_3__0"
    // InternalMyDsl.g:3536:1: rule__Account__Group_4_3__0 : rule__Account__Group_4_3__0__Impl rule__Account__Group_4_3__1 ;
    public final void rule__Account__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3540:1: ( rule__Account__Group_4_3__0__Impl rule__Account__Group_4_3__1 )
            // InternalMyDsl.g:3541:2: rule__Account__Group_4_3__0__Impl rule__Account__Group_4_3__1
            {
            pushFollow(FOLLOW_26);
            rule__Account__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Account__Group_4_3__1();

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
    // $ANTLR end "rule__Account__Group_4_3__0"


    // $ANTLR start "rule__Account__Group_4_3__0__Impl"
    // InternalMyDsl.g:3548:1: rule__Account__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Account__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3552:1: ( ( ',' ) )
            // InternalMyDsl.g:3553:1: ( ',' )
            {
            // InternalMyDsl.g:3553:1: ( ',' )
            // InternalMyDsl.g:3554:2: ','
            {
             before(grammarAccess.getAccountAccess().getCommaKeyword_4_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAccountAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Account__Group_4_3__0__Impl"


    // $ANTLR start "rule__Account__Group_4_3__1"
    // InternalMyDsl.g:3563:1: rule__Account__Group_4_3__1 : rule__Account__Group_4_3__1__Impl ;
    public final void rule__Account__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3567:1: ( rule__Account__Group_4_3__1__Impl )
            // InternalMyDsl.g:3568:2: rule__Account__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Account__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Account__Group_4_3__1"


    // $ANTLR start "rule__Account__Group_4_3__1__Impl"
    // InternalMyDsl.g:3574:1: rule__Account__Group_4_3__1__Impl : ( ( rule__Account__TransferRequestAssignment_4_3_1 ) ) ;
    public final void rule__Account__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3578:1: ( ( ( rule__Account__TransferRequestAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:3579:1: ( ( rule__Account__TransferRequestAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:3579:1: ( ( rule__Account__TransferRequestAssignment_4_3_1 ) )
            // InternalMyDsl.g:3580:2: ( rule__Account__TransferRequestAssignment_4_3_1 )
            {
             before(grammarAccess.getAccountAccess().getTransferRequestAssignment_4_3_1()); 
            // InternalMyDsl.g:3581:2: ( rule__Account__TransferRequestAssignment_4_3_1 )
            // InternalMyDsl.g:3581:3: rule__Account__TransferRequestAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Account__TransferRequestAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAccountAccess().getTransferRequestAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Account__Group_4_3__1__Impl"


    // $ANTLR start "rule__TokenPair__Group__0"
    // InternalMyDsl.g:3590:1: rule__TokenPair__Group__0 : rule__TokenPair__Group__0__Impl rule__TokenPair__Group__1 ;
    public final void rule__TokenPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3594:1: ( rule__TokenPair__Group__0__Impl rule__TokenPair__Group__1 )
            // InternalMyDsl.g:3595:2: rule__TokenPair__Group__0__Impl rule__TokenPair__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TokenPair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenPair__Group__1();

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
    // $ANTLR end "rule__TokenPair__Group__0"


    // $ANTLR start "rule__TokenPair__Group__0__Impl"
    // InternalMyDsl.g:3602:1: rule__TokenPair__Group__0__Impl : ( 'TokenPair' ) ;
    public final void rule__TokenPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3606:1: ( ( 'TokenPair' ) )
            // InternalMyDsl.g:3607:1: ( 'TokenPair' )
            {
            // InternalMyDsl.g:3607:1: ( 'TokenPair' )
            // InternalMyDsl.g:3608:2: 'TokenPair'
            {
             before(grammarAccess.getTokenPairAccess().getTokenPairKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTokenPairAccess().getTokenPairKeyword_0()); 

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
    // $ANTLR end "rule__TokenPair__Group__0__Impl"


    // $ANTLR start "rule__TokenPair__Group__1"
    // InternalMyDsl.g:3617:1: rule__TokenPair__Group__1 : rule__TokenPair__Group__1__Impl rule__TokenPair__Group__2 ;
    public final void rule__TokenPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3621:1: ( rule__TokenPair__Group__1__Impl rule__TokenPair__Group__2 )
            // InternalMyDsl.g:3622:2: rule__TokenPair__Group__1__Impl rule__TokenPair__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__TokenPair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenPair__Group__2();

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
    // $ANTLR end "rule__TokenPair__Group__1"


    // $ANTLR start "rule__TokenPair__Group__1__Impl"
    // InternalMyDsl.g:3629:1: rule__TokenPair__Group__1__Impl : ( '{' ) ;
    public final void rule__TokenPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3633:1: ( ( '{' ) )
            // InternalMyDsl.g:3634:1: ( '{' )
            {
            // InternalMyDsl.g:3634:1: ( '{' )
            // InternalMyDsl.g:3635:2: '{'
            {
             before(grammarAccess.getTokenPairAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTokenPairAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__TokenPair__Group__1__Impl"


    // $ANTLR start "rule__TokenPair__Group__2"
    // InternalMyDsl.g:3644:1: rule__TokenPair__Group__2 : rule__TokenPair__Group__2__Impl rule__TokenPair__Group__3 ;
    public final void rule__TokenPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3648:1: ( rule__TokenPair__Group__2__Impl rule__TokenPair__Group__3 )
            // InternalMyDsl.g:3649:2: rule__TokenPair__Group__2__Impl rule__TokenPair__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__TokenPair__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenPair__Group__3();

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
    // $ANTLR end "rule__TokenPair__Group__2"


    // $ANTLR start "rule__TokenPair__Group__2__Impl"
    // InternalMyDsl.g:3656:1: rule__TokenPair__Group__2__Impl : ( 'price' ) ;
    public final void rule__TokenPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3660:1: ( ( 'price' ) )
            // InternalMyDsl.g:3661:1: ( 'price' )
            {
            // InternalMyDsl.g:3661:1: ( 'price' )
            // InternalMyDsl.g:3662:2: 'price'
            {
             before(grammarAccess.getTokenPairAccess().getPriceKeyword_2()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTokenPairAccess().getPriceKeyword_2()); 

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
    // $ANTLR end "rule__TokenPair__Group__2__Impl"


    // $ANTLR start "rule__TokenPair__Group__3"
    // InternalMyDsl.g:3671:1: rule__TokenPair__Group__3 : rule__TokenPair__Group__3__Impl rule__TokenPair__Group__4 ;
    public final void rule__TokenPair__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3675:1: ( rule__TokenPair__Group__3__Impl rule__TokenPair__Group__4 )
            // InternalMyDsl.g:3676:2: rule__TokenPair__Group__3__Impl rule__TokenPair__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__TokenPair__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenPair__Group__4();

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
    // $ANTLR end "rule__TokenPair__Group__3"


    // $ANTLR start "rule__TokenPair__Group__3__Impl"
    // InternalMyDsl.g:3683:1: rule__TokenPair__Group__3__Impl : ( ( rule__TokenPair__PriceAssignment_3 ) ) ;
    public final void rule__TokenPair__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3687:1: ( ( ( rule__TokenPair__PriceAssignment_3 ) ) )
            // InternalMyDsl.g:3688:1: ( ( rule__TokenPair__PriceAssignment_3 ) )
            {
            // InternalMyDsl.g:3688:1: ( ( rule__TokenPair__PriceAssignment_3 ) )
            // InternalMyDsl.g:3689:2: ( rule__TokenPair__PriceAssignment_3 )
            {
             before(grammarAccess.getTokenPairAccess().getPriceAssignment_3()); 
            // InternalMyDsl.g:3690:2: ( rule__TokenPair__PriceAssignment_3 )
            // InternalMyDsl.g:3690:3: rule__TokenPair__PriceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TokenPair__PriceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTokenPairAccess().getPriceAssignment_3()); 

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
    // $ANTLR end "rule__TokenPair__Group__3__Impl"


    // $ANTLR start "rule__TokenPair__Group__4"
    // InternalMyDsl.g:3698:1: rule__TokenPair__Group__4 : rule__TokenPair__Group__4__Impl rule__TokenPair__Group__5 ;
    public final void rule__TokenPair__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3702:1: ( rule__TokenPair__Group__4__Impl rule__TokenPair__Group__5 )
            // InternalMyDsl.g:3703:2: rule__TokenPair__Group__4__Impl rule__TokenPair__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__TokenPair__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenPair__Group__5();

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
    // $ANTLR end "rule__TokenPair__Group__4"


    // $ANTLR start "rule__TokenPair__Group__4__Impl"
    // InternalMyDsl.g:3710:1: rule__TokenPair__Group__4__Impl : ( 'TokenA' ) ;
    public final void rule__TokenPair__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3714:1: ( ( 'TokenA' ) )
            // InternalMyDsl.g:3715:1: ( 'TokenA' )
            {
            // InternalMyDsl.g:3715:1: ( 'TokenA' )
            // InternalMyDsl.g:3716:2: 'TokenA'
            {
             before(grammarAccess.getTokenPairAccess().getTokenAKeyword_4()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTokenPairAccess().getTokenAKeyword_4()); 

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
    // $ANTLR end "rule__TokenPair__Group__4__Impl"


    // $ANTLR start "rule__TokenPair__Group__5"
    // InternalMyDsl.g:3725:1: rule__TokenPair__Group__5 : rule__TokenPair__Group__5__Impl rule__TokenPair__Group__6 ;
    public final void rule__TokenPair__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3729:1: ( rule__TokenPair__Group__5__Impl rule__TokenPair__Group__6 )
            // InternalMyDsl.g:3730:2: rule__TokenPair__Group__5__Impl rule__TokenPair__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__TokenPair__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenPair__Group__6();

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
    // $ANTLR end "rule__TokenPair__Group__5"


    // $ANTLR start "rule__TokenPair__Group__5__Impl"
    // InternalMyDsl.g:3737:1: rule__TokenPair__Group__5__Impl : ( ( rule__TokenPair__TokenAAssignment_5 ) ) ;
    public final void rule__TokenPair__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3741:1: ( ( ( rule__TokenPair__TokenAAssignment_5 ) ) )
            // InternalMyDsl.g:3742:1: ( ( rule__TokenPair__TokenAAssignment_5 ) )
            {
            // InternalMyDsl.g:3742:1: ( ( rule__TokenPair__TokenAAssignment_5 ) )
            // InternalMyDsl.g:3743:2: ( rule__TokenPair__TokenAAssignment_5 )
            {
             before(grammarAccess.getTokenPairAccess().getTokenAAssignment_5()); 
            // InternalMyDsl.g:3744:2: ( rule__TokenPair__TokenAAssignment_5 )
            // InternalMyDsl.g:3744:3: rule__TokenPair__TokenAAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TokenPair__TokenAAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTokenPairAccess().getTokenAAssignment_5()); 

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
    // $ANTLR end "rule__TokenPair__Group__5__Impl"


    // $ANTLR start "rule__TokenPair__Group__6"
    // InternalMyDsl.g:3752:1: rule__TokenPair__Group__6 : rule__TokenPair__Group__6__Impl rule__TokenPair__Group__7 ;
    public final void rule__TokenPair__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3756:1: ( rule__TokenPair__Group__6__Impl rule__TokenPair__Group__7 )
            // InternalMyDsl.g:3757:2: rule__TokenPair__Group__6__Impl rule__TokenPair__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__TokenPair__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenPair__Group__7();

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
    // $ANTLR end "rule__TokenPair__Group__6"


    // $ANTLR start "rule__TokenPair__Group__6__Impl"
    // InternalMyDsl.g:3764:1: rule__TokenPair__Group__6__Impl : ( 'TokenB' ) ;
    public final void rule__TokenPair__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3768:1: ( ( 'TokenB' ) )
            // InternalMyDsl.g:3769:1: ( 'TokenB' )
            {
            // InternalMyDsl.g:3769:1: ( 'TokenB' )
            // InternalMyDsl.g:3770:2: 'TokenB'
            {
             before(grammarAccess.getTokenPairAccess().getTokenBKeyword_6()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getTokenPairAccess().getTokenBKeyword_6()); 

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
    // $ANTLR end "rule__TokenPair__Group__6__Impl"


    // $ANTLR start "rule__TokenPair__Group__7"
    // InternalMyDsl.g:3779:1: rule__TokenPair__Group__7 : rule__TokenPair__Group__7__Impl rule__TokenPair__Group__8 ;
    public final void rule__TokenPair__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3783:1: ( rule__TokenPair__Group__7__Impl rule__TokenPair__Group__8 )
            // InternalMyDsl.g:3784:2: rule__TokenPair__Group__7__Impl rule__TokenPair__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__TokenPair__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenPair__Group__8();

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
    // $ANTLR end "rule__TokenPair__Group__7"


    // $ANTLR start "rule__TokenPair__Group__7__Impl"
    // InternalMyDsl.g:3791:1: rule__TokenPair__Group__7__Impl : ( ( rule__TokenPair__TokenBAssignment_7 ) ) ;
    public final void rule__TokenPair__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3795:1: ( ( ( rule__TokenPair__TokenBAssignment_7 ) ) )
            // InternalMyDsl.g:3796:1: ( ( rule__TokenPair__TokenBAssignment_7 ) )
            {
            // InternalMyDsl.g:3796:1: ( ( rule__TokenPair__TokenBAssignment_7 ) )
            // InternalMyDsl.g:3797:2: ( rule__TokenPair__TokenBAssignment_7 )
            {
             before(grammarAccess.getTokenPairAccess().getTokenBAssignment_7()); 
            // InternalMyDsl.g:3798:2: ( rule__TokenPair__TokenBAssignment_7 )
            // InternalMyDsl.g:3798:3: rule__TokenPair__TokenBAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__TokenPair__TokenBAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTokenPairAccess().getTokenBAssignment_7()); 

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
    // $ANTLR end "rule__TokenPair__Group__7__Impl"


    // $ANTLR start "rule__TokenPair__Group__8"
    // InternalMyDsl.g:3806:1: rule__TokenPair__Group__8 : rule__TokenPair__Group__8__Impl ;
    public final void rule__TokenPair__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3810:1: ( rule__TokenPair__Group__8__Impl )
            // InternalMyDsl.g:3811:2: rule__TokenPair__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TokenPair__Group__8__Impl();

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
    // $ANTLR end "rule__TokenPair__Group__8"


    // $ANTLR start "rule__TokenPair__Group__8__Impl"
    // InternalMyDsl.g:3817:1: rule__TokenPair__Group__8__Impl : ( '}' ) ;
    public final void rule__TokenPair__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3821:1: ( ( '}' ) )
            // InternalMyDsl.g:3822:1: ( '}' )
            {
            // InternalMyDsl.g:3822:1: ( '}' )
            // InternalMyDsl.g:3823:2: '}'
            {
             before(grammarAccess.getTokenPairAccess().getRightCurlyBracketKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTokenPairAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__TokenPair__Group__8__Impl"


    // $ANTLR start "rule__Order__Group__0"
    // InternalMyDsl.g:3833:1: rule__Order__Group__0 : rule__Order__Group__0__Impl rule__Order__Group__1 ;
    public final void rule__Order__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3837:1: ( rule__Order__Group__0__Impl rule__Order__Group__1 )
            // InternalMyDsl.g:3838:2: rule__Order__Group__0__Impl rule__Order__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Order__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__1();

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
    // $ANTLR end "rule__Order__Group__0"


    // $ANTLR start "rule__Order__Group__0__Impl"
    // InternalMyDsl.g:3845:1: rule__Order__Group__0__Impl : ( 'Order' ) ;
    public final void rule__Order__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3849:1: ( ( 'Order' ) )
            // InternalMyDsl.g:3850:1: ( 'Order' )
            {
            // InternalMyDsl.g:3850:1: ( 'Order' )
            // InternalMyDsl.g:3851:2: 'Order'
            {
             before(grammarAccess.getOrderAccess().getOrderKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getOrderKeyword_0()); 

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
    // $ANTLR end "rule__Order__Group__0__Impl"


    // $ANTLR start "rule__Order__Group__1"
    // InternalMyDsl.g:3860:1: rule__Order__Group__1 : rule__Order__Group__1__Impl rule__Order__Group__2 ;
    public final void rule__Order__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3864:1: ( rule__Order__Group__1__Impl rule__Order__Group__2 )
            // InternalMyDsl.g:3865:2: rule__Order__Group__1__Impl rule__Order__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Order__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__2();

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
    // $ANTLR end "rule__Order__Group__1"


    // $ANTLR start "rule__Order__Group__1__Impl"
    // InternalMyDsl.g:3872:1: rule__Order__Group__1__Impl : ( '{' ) ;
    public final void rule__Order__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3876:1: ( ( '{' ) )
            // InternalMyDsl.g:3877:1: ( '{' )
            {
            // InternalMyDsl.g:3877:1: ( '{' )
            // InternalMyDsl.g:3878:2: '{'
            {
             before(grammarAccess.getOrderAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Order__Group__1__Impl"


    // $ANTLR start "rule__Order__Group__2"
    // InternalMyDsl.g:3887:1: rule__Order__Group__2 : rule__Order__Group__2__Impl rule__Order__Group__3 ;
    public final void rule__Order__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3891:1: ( rule__Order__Group__2__Impl rule__Order__Group__3 )
            // InternalMyDsl.g:3892:2: rule__Order__Group__2__Impl rule__Order__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Order__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__3();

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
    // $ANTLR end "rule__Order__Group__2"


    // $ANTLR start "rule__Order__Group__2__Impl"
    // InternalMyDsl.g:3899:1: rule__Order__Group__2__Impl : ( 'Price' ) ;
    public final void rule__Order__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3903:1: ( ( 'Price' ) )
            // InternalMyDsl.g:3904:1: ( 'Price' )
            {
            // InternalMyDsl.g:3904:1: ( 'Price' )
            // InternalMyDsl.g:3905:2: 'Price'
            {
             before(grammarAccess.getOrderAccess().getPriceKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getPriceKeyword_2()); 

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
    // $ANTLR end "rule__Order__Group__2__Impl"


    // $ANTLR start "rule__Order__Group__3"
    // InternalMyDsl.g:3914:1: rule__Order__Group__3 : rule__Order__Group__3__Impl rule__Order__Group__4 ;
    public final void rule__Order__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3918:1: ( rule__Order__Group__3__Impl rule__Order__Group__4 )
            // InternalMyDsl.g:3919:2: rule__Order__Group__3__Impl rule__Order__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Order__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__4();

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
    // $ANTLR end "rule__Order__Group__3"


    // $ANTLR start "rule__Order__Group__3__Impl"
    // InternalMyDsl.g:3926:1: rule__Order__Group__3__Impl : ( ( rule__Order__PriceAssignment_3 ) ) ;
    public final void rule__Order__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3930:1: ( ( ( rule__Order__PriceAssignment_3 ) ) )
            // InternalMyDsl.g:3931:1: ( ( rule__Order__PriceAssignment_3 ) )
            {
            // InternalMyDsl.g:3931:1: ( ( rule__Order__PriceAssignment_3 ) )
            // InternalMyDsl.g:3932:2: ( rule__Order__PriceAssignment_3 )
            {
             before(grammarAccess.getOrderAccess().getPriceAssignment_3()); 
            // InternalMyDsl.g:3933:2: ( rule__Order__PriceAssignment_3 )
            // InternalMyDsl.g:3933:3: rule__Order__PriceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Order__PriceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getPriceAssignment_3()); 

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
    // $ANTLR end "rule__Order__Group__3__Impl"


    // $ANTLR start "rule__Order__Group__4"
    // InternalMyDsl.g:3941:1: rule__Order__Group__4 : rule__Order__Group__4__Impl rule__Order__Group__5 ;
    public final void rule__Order__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3945:1: ( rule__Order__Group__4__Impl rule__Order__Group__5 )
            // InternalMyDsl.g:3946:2: rule__Order__Group__4__Impl rule__Order__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Order__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__5();

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
    // $ANTLR end "rule__Order__Group__4"


    // $ANTLR start "rule__Order__Group__4__Impl"
    // InternalMyDsl.g:3953:1: rule__Order__Group__4__Impl : ( 'Amount' ) ;
    public final void rule__Order__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3957:1: ( ( 'Amount' ) )
            // InternalMyDsl.g:3958:1: ( 'Amount' )
            {
            // InternalMyDsl.g:3958:1: ( 'Amount' )
            // InternalMyDsl.g:3959:2: 'Amount'
            {
             before(grammarAccess.getOrderAccess().getAmountKeyword_4()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getAmountKeyword_4()); 

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
    // $ANTLR end "rule__Order__Group__4__Impl"


    // $ANTLR start "rule__Order__Group__5"
    // InternalMyDsl.g:3968:1: rule__Order__Group__5 : rule__Order__Group__5__Impl rule__Order__Group__6 ;
    public final void rule__Order__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3972:1: ( rule__Order__Group__5__Impl rule__Order__Group__6 )
            // InternalMyDsl.g:3973:2: rule__Order__Group__5__Impl rule__Order__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__Order__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__6();

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
    // $ANTLR end "rule__Order__Group__5"


    // $ANTLR start "rule__Order__Group__5__Impl"
    // InternalMyDsl.g:3980:1: rule__Order__Group__5__Impl : ( ( rule__Order__AmountAssignment_5 ) ) ;
    public final void rule__Order__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3984:1: ( ( ( rule__Order__AmountAssignment_5 ) ) )
            // InternalMyDsl.g:3985:1: ( ( rule__Order__AmountAssignment_5 ) )
            {
            // InternalMyDsl.g:3985:1: ( ( rule__Order__AmountAssignment_5 ) )
            // InternalMyDsl.g:3986:2: ( rule__Order__AmountAssignment_5 )
            {
             before(grammarAccess.getOrderAccess().getAmountAssignment_5()); 
            // InternalMyDsl.g:3987:2: ( rule__Order__AmountAssignment_5 )
            // InternalMyDsl.g:3987:3: rule__Order__AmountAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Order__AmountAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getAmountAssignment_5()); 

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
    // $ANTLR end "rule__Order__Group__5__Impl"


    // $ANTLR start "rule__Order__Group__6"
    // InternalMyDsl.g:3995:1: rule__Order__Group__6 : rule__Order__Group__6__Impl rule__Order__Group__7 ;
    public final void rule__Order__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3999:1: ( rule__Order__Group__6__Impl rule__Order__Group__7 )
            // InternalMyDsl.g:4000:2: rule__Order__Group__6__Impl rule__Order__Group__7
            {
            pushFollow(FOLLOW_33);
            rule__Order__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__7();

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
    // $ANTLR end "rule__Order__Group__6"


    // $ANTLR start "rule__Order__Group__6__Impl"
    // InternalMyDsl.g:4007:1: rule__Order__Group__6__Impl : ( ( rule__Order__Group_6__0 )? ) ;
    public final void rule__Order__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4011:1: ( ( ( rule__Order__Group_6__0 )? ) )
            // InternalMyDsl.g:4012:1: ( ( rule__Order__Group_6__0 )? )
            {
            // InternalMyDsl.g:4012:1: ( ( rule__Order__Group_6__0 )? )
            // InternalMyDsl.g:4013:2: ( rule__Order__Group_6__0 )?
            {
             before(grammarAccess.getOrderAccess().getGroup_6()); 
            // InternalMyDsl.g:4014:2: ( rule__Order__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==58) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:4014:3: rule__Order__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Order__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Order__Group__6__Impl"


    // $ANTLR start "rule__Order__Group__7"
    // InternalMyDsl.g:4022:1: rule__Order__Group__7 : rule__Order__Group__7__Impl rule__Order__Group__8 ;
    public final void rule__Order__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4026:1: ( rule__Order__Group__7__Impl rule__Order__Group__8 )
            // InternalMyDsl.g:4027:2: rule__Order__Group__7__Impl rule__Order__Group__8
            {
            pushFollow(FOLLOW_33);
            rule__Order__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__8();

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
    // $ANTLR end "rule__Order__Group__7"


    // $ANTLR start "rule__Order__Group__7__Impl"
    // InternalMyDsl.g:4034:1: rule__Order__Group__7__Impl : ( ( rule__Order__Group_7__0 )? ) ;
    public final void rule__Order__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4038:1: ( ( ( rule__Order__Group_7__0 )? ) )
            // InternalMyDsl.g:4039:1: ( ( rule__Order__Group_7__0 )? )
            {
            // InternalMyDsl.g:4039:1: ( ( rule__Order__Group_7__0 )? )
            // InternalMyDsl.g:4040:2: ( rule__Order__Group_7__0 )?
            {
             before(grammarAccess.getOrderAccess().getGroup_7()); 
            // InternalMyDsl.g:4041:2: ( rule__Order__Group_7__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==59) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:4041:3: rule__Order__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Order__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Order__Group__7__Impl"


    // $ANTLR start "rule__Order__Group__8"
    // InternalMyDsl.g:4049:1: rule__Order__Group__8 : rule__Order__Group__8__Impl rule__Order__Group__9 ;
    public final void rule__Order__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4053:1: ( rule__Order__Group__8__Impl rule__Order__Group__9 )
            // InternalMyDsl.g:4054:2: rule__Order__Group__8__Impl rule__Order__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Order__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__9();

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
    // $ANTLR end "rule__Order__Group__8"


    // $ANTLR start "rule__Order__Group__8__Impl"
    // InternalMyDsl.g:4061:1: rule__Order__Group__8__Impl : ( 'account' ) ;
    public final void rule__Order__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4065:1: ( ( 'account' ) )
            // InternalMyDsl.g:4066:1: ( 'account' )
            {
            // InternalMyDsl.g:4066:1: ( 'account' )
            // InternalMyDsl.g:4067:2: 'account'
            {
             before(grammarAccess.getOrderAccess().getAccountKeyword_8()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getAccountKeyword_8()); 

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
    // $ANTLR end "rule__Order__Group__8__Impl"


    // $ANTLR start "rule__Order__Group__9"
    // InternalMyDsl.g:4076:1: rule__Order__Group__9 : rule__Order__Group__9__Impl rule__Order__Group__10 ;
    public final void rule__Order__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4080:1: ( rule__Order__Group__9__Impl rule__Order__Group__10 )
            // InternalMyDsl.g:4081:2: rule__Order__Group__9__Impl rule__Order__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__Order__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__10();

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
    // $ANTLR end "rule__Order__Group__9"


    // $ANTLR start "rule__Order__Group__9__Impl"
    // InternalMyDsl.g:4088:1: rule__Order__Group__9__Impl : ( ( rule__Order__AccountAssignment_9 ) ) ;
    public final void rule__Order__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4092:1: ( ( ( rule__Order__AccountAssignment_9 ) ) )
            // InternalMyDsl.g:4093:1: ( ( rule__Order__AccountAssignment_9 ) )
            {
            // InternalMyDsl.g:4093:1: ( ( rule__Order__AccountAssignment_9 ) )
            // InternalMyDsl.g:4094:2: ( rule__Order__AccountAssignment_9 )
            {
             before(grammarAccess.getOrderAccess().getAccountAssignment_9()); 
            // InternalMyDsl.g:4095:2: ( rule__Order__AccountAssignment_9 )
            // InternalMyDsl.g:4095:3: rule__Order__AccountAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Order__AccountAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getAccountAssignment_9()); 

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
    // $ANTLR end "rule__Order__Group__9__Impl"


    // $ANTLR start "rule__Order__Group__10"
    // InternalMyDsl.g:4103:1: rule__Order__Group__10 : rule__Order__Group__10__Impl rule__Order__Group__11 ;
    public final void rule__Order__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4107:1: ( rule__Order__Group__10__Impl rule__Order__Group__11 )
            // InternalMyDsl.g:4108:2: rule__Order__Group__10__Impl rule__Order__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__Order__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__11();

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
    // $ANTLR end "rule__Order__Group__10"


    // $ANTLR start "rule__Order__Group__10__Impl"
    // InternalMyDsl.g:4115:1: rule__Order__Group__10__Impl : ( 'TokenPair' ) ;
    public final void rule__Order__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4119:1: ( ( 'TokenPair' ) )
            // InternalMyDsl.g:4120:1: ( 'TokenPair' )
            {
            // InternalMyDsl.g:4120:1: ( 'TokenPair' )
            // InternalMyDsl.g:4121:2: 'TokenPair'
            {
             before(grammarAccess.getOrderAccess().getTokenPairKeyword_10()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getTokenPairKeyword_10()); 

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
    // $ANTLR end "rule__Order__Group__10__Impl"


    // $ANTLR start "rule__Order__Group__11"
    // InternalMyDsl.g:4130:1: rule__Order__Group__11 : rule__Order__Group__11__Impl rule__Order__Group__12 ;
    public final void rule__Order__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4134:1: ( rule__Order__Group__11__Impl rule__Order__Group__12 )
            // InternalMyDsl.g:4135:2: rule__Order__Group__11__Impl rule__Order__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__Order__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group__12();

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
    // $ANTLR end "rule__Order__Group__11"


    // $ANTLR start "rule__Order__Group__11__Impl"
    // InternalMyDsl.g:4142:1: rule__Order__Group__11__Impl : ( ( rule__Order__TokenPairAssignment_11 ) ) ;
    public final void rule__Order__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4146:1: ( ( ( rule__Order__TokenPairAssignment_11 ) ) )
            // InternalMyDsl.g:4147:1: ( ( rule__Order__TokenPairAssignment_11 ) )
            {
            // InternalMyDsl.g:4147:1: ( ( rule__Order__TokenPairAssignment_11 ) )
            // InternalMyDsl.g:4148:2: ( rule__Order__TokenPairAssignment_11 )
            {
             before(grammarAccess.getOrderAccess().getTokenPairAssignment_11()); 
            // InternalMyDsl.g:4149:2: ( rule__Order__TokenPairAssignment_11 )
            // InternalMyDsl.g:4149:3: rule__Order__TokenPairAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Order__TokenPairAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getTokenPairAssignment_11()); 

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
    // $ANTLR end "rule__Order__Group__11__Impl"


    // $ANTLR start "rule__Order__Group__12"
    // InternalMyDsl.g:4157:1: rule__Order__Group__12 : rule__Order__Group__12__Impl ;
    public final void rule__Order__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4161:1: ( rule__Order__Group__12__Impl )
            // InternalMyDsl.g:4162:2: rule__Order__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Order__Group__12__Impl();

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
    // $ANTLR end "rule__Order__Group__12"


    // $ANTLR start "rule__Order__Group__12__Impl"
    // InternalMyDsl.g:4168:1: rule__Order__Group__12__Impl : ( '}' ) ;
    public final void rule__Order__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4172:1: ( ( '}' ) )
            // InternalMyDsl.g:4173:1: ( '}' )
            {
            // InternalMyDsl.g:4173:1: ( '}' )
            // InternalMyDsl.g:4174:2: '}'
            {
             before(grammarAccess.getOrderAccess().getRightCurlyBracketKeyword_12()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Order__Group__12__Impl"


    // $ANTLR start "rule__Order__Group_6__0"
    // InternalMyDsl.g:4184:1: rule__Order__Group_6__0 : rule__Order__Group_6__0__Impl rule__Order__Group_6__1 ;
    public final void rule__Order__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4188:1: ( rule__Order__Group_6__0__Impl rule__Order__Group_6__1 )
            // InternalMyDsl.g:4189:2: rule__Order__Group_6__0__Impl rule__Order__Group_6__1
            {
            pushFollow(FOLLOW_34);
            rule__Order__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group_6__1();

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
    // $ANTLR end "rule__Order__Group_6__0"


    // $ANTLR start "rule__Order__Group_6__0__Impl"
    // InternalMyDsl.g:4196:1: rule__Order__Group_6__0__Impl : ( 'leverage' ) ;
    public final void rule__Order__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4200:1: ( ( 'leverage' ) )
            // InternalMyDsl.g:4201:1: ( 'leverage' )
            {
            // InternalMyDsl.g:4201:1: ( 'leverage' )
            // InternalMyDsl.g:4202:2: 'leverage'
            {
             before(grammarAccess.getOrderAccess().getLeverageKeyword_6_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getLeverageKeyword_6_0()); 

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
    // $ANTLR end "rule__Order__Group_6__0__Impl"


    // $ANTLR start "rule__Order__Group_6__1"
    // InternalMyDsl.g:4211:1: rule__Order__Group_6__1 : rule__Order__Group_6__1__Impl ;
    public final void rule__Order__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4215:1: ( rule__Order__Group_6__1__Impl )
            // InternalMyDsl.g:4216:2: rule__Order__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Order__Group_6__1__Impl();

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
    // $ANTLR end "rule__Order__Group_6__1"


    // $ANTLR start "rule__Order__Group_6__1__Impl"
    // InternalMyDsl.g:4222:1: rule__Order__Group_6__1__Impl : ( ( rule__Order__LeverageAssignment_6_1 ) ) ;
    public final void rule__Order__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4226:1: ( ( ( rule__Order__LeverageAssignment_6_1 ) ) )
            // InternalMyDsl.g:4227:1: ( ( rule__Order__LeverageAssignment_6_1 ) )
            {
            // InternalMyDsl.g:4227:1: ( ( rule__Order__LeverageAssignment_6_1 ) )
            // InternalMyDsl.g:4228:2: ( rule__Order__LeverageAssignment_6_1 )
            {
             before(grammarAccess.getOrderAccess().getLeverageAssignment_6_1()); 
            // InternalMyDsl.g:4229:2: ( rule__Order__LeverageAssignment_6_1 )
            // InternalMyDsl.g:4229:3: rule__Order__LeverageAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Order__LeverageAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getLeverageAssignment_6_1()); 

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
    // $ANTLR end "rule__Order__Group_6__1__Impl"


    // $ANTLR start "rule__Order__Group_7__0"
    // InternalMyDsl.g:4238:1: rule__Order__Group_7__0 : rule__Order__Group_7__0__Impl rule__Order__Group_7__1 ;
    public final void rule__Order__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4242:1: ( rule__Order__Group_7__0__Impl rule__Order__Group_7__1 )
            // InternalMyDsl.g:4243:2: rule__Order__Group_7__0__Impl rule__Order__Group_7__1
            {
            pushFollow(FOLLOW_35);
            rule__Order__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Order__Group_7__1();

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
    // $ANTLR end "rule__Order__Group_7__0"


    // $ANTLR start "rule__Order__Group_7__0__Impl"
    // InternalMyDsl.g:4250:1: rule__Order__Group_7__0__Impl : ( 'Type' ) ;
    public final void rule__Order__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4254:1: ( ( 'Type' ) )
            // InternalMyDsl.g:4255:1: ( 'Type' )
            {
            // InternalMyDsl.g:4255:1: ( 'Type' )
            // InternalMyDsl.g:4256:2: 'Type'
            {
             before(grammarAccess.getOrderAccess().getTypeKeyword_7_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getOrderAccess().getTypeKeyword_7_0()); 

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
    // $ANTLR end "rule__Order__Group_7__0__Impl"


    // $ANTLR start "rule__Order__Group_7__1"
    // InternalMyDsl.g:4265:1: rule__Order__Group_7__1 : rule__Order__Group_7__1__Impl ;
    public final void rule__Order__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4269:1: ( rule__Order__Group_7__1__Impl )
            // InternalMyDsl.g:4270:2: rule__Order__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Order__Group_7__1__Impl();

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
    // $ANTLR end "rule__Order__Group_7__1"


    // $ANTLR start "rule__Order__Group_7__1__Impl"
    // InternalMyDsl.g:4276:1: rule__Order__Group_7__1__Impl : ( ( rule__Order__TypeAssignment_7_1 ) ) ;
    public final void rule__Order__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4280:1: ( ( ( rule__Order__TypeAssignment_7_1 ) ) )
            // InternalMyDsl.g:4281:1: ( ( rule__Order__TypeAssignment_7_1 ) )
            {
            // InternalMyDsl.g:4281:1: ( ( rule__Order__TypeAssignment_7_1 ) )
            // InternalMyDsl.g:4282:2: ( rule__Order__TypeAssignment_7_1 )
            {
             before(grammarAccess.getOrderAccess().getTypeAssignment_7_1()); 
            // InternalMyDsl.g:4283:2: ( rule__Order__TypeAssignment_7_1 )
            // InternalMyDsl.g:4283:3: rule__Order__TypeAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Order__TypeAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getTypeAssignment_7_1()); 

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
    // $ANTLR end "rule__Order__Group_7__1__Impl"


    // $ANTLR start "rule__SavingOrder__Group__0"
    // InternalMyDsl.g:4292:1: rule__SavingOrder__Group__0 : rule__SavingOrder__Group__0__Impl rule__SavingOrder__Group__1 ;
    public final void rule__SavingOrder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4296:1: ( rule__SavingOrder__Group__0__Impl rule__SavingOrder__Group__1 )
            // InternalMyDsl.g:4297:2: rule__SavingOrder__Group__0__Impl rule__SavingOrder__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SavingOrder__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SavingOrder__Group__1();

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
    // $ANTLR end "rule__SavingOrder__Group__0"


    // $ANTLR start "rule__SavingOrder__Group__0__Impl"
    // InternalMyDsl.g:4304:1: rule__SavingOrder__Group__0__Impl : ( 'SavingOrder' ) ;
    public final void rule__SavingOrder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4308:1: ( ( 'SavingOrder' ) )
            // InternalMyDsl.g:4309:1: ( 'SavingOrder' )
            {
            // InternalMyDsl.g:4309:1: ( 'SavingOrder' )
            // InternalMyDsl.g:4310:2: 'SavingOrder'
            {
             before(grammarAccess.getSavingOrderAccess().getSavingOrderKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getSavingOrderAccess().getSavingOrderKeyword_0()); 

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
    // $ANTLR end "rule__SavingOrder__Group__0__Impl"


    // $ANTLR start "rule__SavingOrder__Group__1"
    // InternalMyDsl.g:4319:1: rule__SavingOrder__Group__1 : rule__SavingOrder__Group__1__Impl rule__SavingOrder__Group__2 ;
    public final void rule__SavingOrder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4323:1: ( rule__SavingOrder__Group__1__Impl rule__SavingOrder__Group__2 )
            // InternalMyDsl.g:4324:2: rule__SavingOrder__Group__1__Impl rule__SavingOrder__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SavingOrder__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SavingOrder__Group__2();

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
    // $ANTLR end "rule__SavingOrder__Group__1"


    // $ANTLR start "rule__SavingOrder__Group__1__Impl"
    // InternalMyDsl.g:4331:1: rule__SavingOrder__Group__1__Impl : ( ( rule__SavingOrder__NameAssignment_1 ) ) ;
    public final void rule__SavingOrder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4335:1: ( ( ( rule__SavingOrder__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4336:1: ( ( rule__SavingOrder__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4336:1: ( ( rule__SavingOrder__NameAssignment_1 ) )
            // InternalMyDsl.g:4337:2: ( rule__SavingOrder__NameAssignment_1 )
            {
             before(grammarAccess.getSavingOrderAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4338:2: ( rule__SavingOrder__NameAssignment_1 )
            // InternalMyDsl.g:4338:3: rule__SavingOrder__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SavingOrder__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSavingOrderAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__SavingOrder__Group__1__Impl"


    // $ANTLR start "rule__SavingOrder__Group__2"
    // InternalMyDsl.g:4346:1: rule__SavingOrder__Group__2 : rule__SavingOrder__Group__2__Impl rule__SavingOrder__Group__3 ;
    public final void rule__SavingOrder__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4350:1: ( rule__SavingOrder__Group__2__Impl rule__SavingOrder__Group__3 )
            // InternalMyDsl.g:4351:2: rule__SavingOrder__Group__2__Impl rule__SavingOrder__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__SavingOrder__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SavingOrder__Group__3();

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
    // $ANTLR end "rule__SavingOrder__Group__2"


    // $ANTLR start "rule__SavingOrder__Group__2__Impl"
    // InternalMyDsl.g:4358:1: rule__SavingOrder__Group__2__Impl : ( '{' ) ;
    public final void rule__SavingOrder__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4362:1: ( ( '{' ) )
            // InternalMyDsl.g:4363:1: ( '{' )
            {
            // InternalMyDsl.g:4363:1: ( '{' )
            // InternalMyDsl.g:4364:2: '{'
            {
             before(grammarAccess.getSavingOrderAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSavingOrderAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__SavingOrder__Group__2__Impl"


    // $ANTLR start "rule__SavingOrder__Group__3"
    // InternalMyDsl.g:4373:1: rule__SavingOrder__Group__3 : rule__SavingOrder__Group__3__Impl rule__SavingOrder__Group__4 ;
    public final void rule__SavingOrder__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4377:1: ( rule__SavingOrder__Group__3__Impl rule__SavingOrder__Group__4 )
            // InternalMyDsl.g:4378:2: rule__SavingOrder__Group__3__Impl rule__SavingOrder__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__SavingOrder__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SavingOrder__Group__4();

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
    // $ANTLR end "rule__SavingOrder__Group__3"


    // $ANTLR start "rule__SavingOrder__Group__3__Impl"
    // InternalMyDsl.g:4385:1: rule__SavingOrder__Group__3__Impl : ( 'Amount' ) ;
    public final void rule__SavingOrder__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4389:1: ( ( 'Amount' ) )
            // InternalMyDsl.g:4390:1: ( 'Amount' )
            {
            // InternalMyDsl.g:4390:1: ( 'Amount' )
            // InternalMyDsl.g:4391:2: 'Amount'
            {
             before(grammarAccess.getSavingOrderAccess().getAmountKeyword_3()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getSavingOrderAccess().getAmountKeyword_3()); 

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
    // $ANTLR end "rule__SavingOrder__Group__3__Impl"


    // $ANTLR start "rule__SavingOrder__Group__4"
    // InternalMyDsl.g:4400:1: rule__SavingOrder__Group__4 : rule__SavingOrder__Group__4__Impl rule__SavingOrder__Group__5 ;
    public final void rule__SavingOrder__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4404:1: ( rule__SavingOrder__Group__4__Impl rule__SavingOrder__Group__5 )
            // InternalMyDsl.g:4405:2: rule__SavingOrder__Group__4__Impl rule__SavingOrder__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__SavingOrder__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SavingOrder__Group__5();

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
    // $ANTLR end "rule__SavingOrder__Group__4"


    // $ANTLR start "rule__SavingOrder__Group__4__Impl"
    // InternalMyDsl.g:4412:1: rule__SavingOrder__Group__4__Impl : ( ( rule__SavingOrder__AmountAssignment_4 ) ) ;
    public final void rule__SavingOrder__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4416:1: ( ( ( rule__SavingOrder__AmountAssignment_4 ) ) )
            // InternalMyDsl.g:4417:1: ( ( rule__SavingOrder__AmountAssignment_4 ) )
            {
            // InternalMyDsl.g:4417:1: ( ( rule__SavingOrder__AmountAssignment_4 ) )
            // InternalMyDsl.g:4418:2: ( rule__SavingOrder__AmountAssignment_4 )
            {
             before(grammarAccess.getSavingOrderAccess().getAmountAssignment_4()); 
            // InternalMyDsl.g:4419:2: ( rule__SavingOrder__AmountAssignment_4 )
            // InternalMyDsl.g:4419:3: rule__SavingOrder__AmountAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SavingOrder__AmountAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSavingOrderAccess().getAmountAssignment_4()); 

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
    // $ANTLR end "rule__SavingOrder__Group__4__Impl"


    // $ANTLR start "rule__SavingOrder__Group__5"
    // InternalMyDsl.g:4427:1: rule__SavingOrder__Group__5 : rule__SavingOrder__Group__5__Impl rule__SavingOrder__Group__6 ;
    public final void rule__SavingOrder__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4431:1: ( rule__SavingOrder__Group__5__Impl rule__SavingOrder__Group__6 )
            // InternalMyDsl.g:4432:2: rule__SavingOrder__Group__5__Impl rule__SavingOrder__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__SavingOrder__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SavingOrder__Group__6();

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
    // $ANTLR end "rule__SavingOrder__Group__5"


    // $ANTLR start "rule__SavingOrder__Group__5__Impl"
    // InternalMyDsl.g:4439:1: rule__SavingOrder__Group__5__Impl : ( ( rule__SavingOrder__Group_5__0 )? ) ;
    public final void rule__SavingOrder__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4443:1: ( ( ( rule__SavingOrder__Group_5__0 )? ) )
            // InternalMyDsl.g:4444:1: ( ( rule__SavingOrder__Group_5__0 )? )
            {
            // InternalMyDsl.g:4444:1: ( ( rule__SavingOrder__Group_5__0 )? )
            // InternalMyDsl.g:4445:2: ( rule__SavingOrder__Group_5__0 )?
            {
             before(grammarAccess.getSavingOrderAccess().getGroup_5()); 
            // InternalMyDsl.g:4446:2: ( rule__SavingOrder__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==62) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:4446:3: rule__SavingOrder__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SavingOrder__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSavingOrderAccess().getGroup_5()); 

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
    // $ANTLR end "rule__SavingOrder__Group__5__Impl"


    // $ANTLR start "rule__SavingOrder__Group__6"
    // InternalMyDsl.g:4454:1: rule__SavingOrder__Group__6 : rule__SavingOrder__Group__6__Impl rule__SavingOrder__Group__7 ;
    public final void rule__SavingOrder__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4458:1: ( rule__SavingOrder__Group__6__Impl rule__SavingOrder__Group__7 )
            // InternalMyDsl.g:4459:2: rule__SavingOrder__Group__6__Impl rule__SavingOrder__Group__7
            {
            pushFollow(FOLLOW_28);
            rule__SavingOrder__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SavingOrder__Group__7();

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
    // $ANTLR end "rule__SavingOrder__Group__6"


    // $ANTLR start "rule__SavingOrder__Group__6__Impl"
    // InternalMyDsl.g:4466:1: rule__SavingOrder__Group__6__Impl : ( 'Interest' ) ;
    public final void rule__SavingOrder__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4470:1: ( ( 'Interest' ) )
            // InternalMyDsl.g:4471:1: ( 'Interest' )
            {
            // InternalMyDsl.g:4471:1: ( 'Interest' )
            // InternalMyDsl.g:4472:2: 'Interest'
            {
             before(grammarAccess.getSavingOrderAccess().getInterestKeyword_6()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getSavingOrderAccess().getInterestKeyword_6()); 

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
    // $ANTLR end "rule__SavingOrder__Group__6__Impl"


    // $ANTLR start "rule__SavingOrder__Group__7"
    // InternalMyDsl.g:4481:1: rule__SavingOrder__Group__7 : rule__SavingOrder__Group__7__Impl rule__SavingOrder__Group__8 ;
    public final void rule__SavingOrder__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4485:1: ( rule__SavingOrder__Group__7__Impl rule__SavingOrder__Group__8 )
            // InternalMyDsl.g:4486:2: rule__SavingOrder__Group__7__Impl rule__SavingOrder__Group__8
            {
            pushFollow(FOLLOW_37);
            rule__SavingOrder__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SavingOrder__Group__8();

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
    // $ANTLR end "rule__SavingOrder__Group__7"


    // $ANTLR start "rule__SavingOrder__Group__7__Impl"
    // InternalMyDsl.g:4493:1: rule__SavingOrder__Group__7__Impl : ( ( rule__SavingOrder__InterestAssignment_7 ) ) ;
    public final void rule__SavingOrder__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4497:1: ( ( ( rule__SavingOrder__InterestAssignment_7 ) ) )
            // InternalMyDsl.g:4498:1: ( ( rule__SavingOrder__InterestAssignment_7 ) )
            {
            // InternalMyDsl.g:4498:1: ( ( rule__SavingOrder__InterestAssignment_7 ) )
            // InternalMyDsl.g:4499:2: ( rule__SavingOrder__InterestAssignment_7 )
            {
             before(grammarAccess.getSavingOrderAccess().getInterestAssignment_7()); 
            // InternalMyDsl.g:4500:2: ( rule__SavingOrder__InterestAssignment_7 )
            // InternalMyDsl.g:4500:3: rule__SavingOrder__InterestAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__SavingOrder__InterestAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSavingOrderAccess().getInterestAssignment_7()); 

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
    // $ANTLR end "rule__SavingOrder__Group__7__Impl"


    // $ANTLR start "rule__SavingOrder__Group__8"
    // InternalMyDsl.g:4508:1: rule__SavingOrder__Group__8 : rule__SavingOrder__Group__8__Impl rule__SavingOrder__Group__9 ;
    public final void rule__SavingOrder__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4512:1: ( rule__SavingOrder__Group__8__Impl rule__SavingOrder__Group__9 )
            // InternalMyDsl.g:4513:2: rule__SavingOrder__Group__8__Impl rule__SavingOrder__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__SavingOrder__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SavingOrder__Group__9();

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
    // $ANTLR end "rule__SavingOrder__Group__8"


    // $ANTLR start "rule__SavingOrder__Group__8__Impl"
    // InternalMyDsl.g:4520:1: rule__SavingOrder__Group__8__Impl : ( 'account' ) ;
    public final void rule__SavingOrder__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4524:1: ( ( 'account' ) )
            // InternalMyDsl.g:4525:1: ( 'account' )
            {
            // InternalMyDsl.g:4525:1: ( 'account' )
            // InternalMyDsl.g:4526:2: 'account'
            {
             before(grammarAccess.getSavingOrderAccess().getAccountKeyword_8()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getSavingOrderAccess().getAccountKeyword_8()); 

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
    // $ANTLR end "rule__SavingOrder__Group__8__Impl"


    // $ANTLR start "rule__SavingOrder__Group__9"
    // InternalMyDsl.g:4535:1: rule__SavingOrder__Group__9 : rule__SavingOrder__Group__9__Impl rule__SavingOrder__Group__10 ;
    public final void rule__SavingOrder__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4539:1: ( rule__SavingOrder__Group__9__Impl rule__SavingOrder__Group__10 )
            // InternalMyDsl.g:4540:2: rule__SavingOrder__Group__9__Impl rule__SavingOrder__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__SavingOrder__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SavingOrder__Group__10();

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
    // $ANTLR end "rule__SavingOrder__Group__9"


    // $ANTLR start "rule__SavingOrder__Group__9__Impl"
    // InternalMyDsl.g:4547:1: rule__SavingOrder__Group__9__Impl : ( ( rule__SavingOrder__AccountAssignment_9 ) ) ;
    public final void rule__SavingOrder__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4551:1: ( ( ( rule__SavingOrder__AccountAssignment_9 ) ) )
            // InternalMyDsl.g:4552:1: ( ( rule__SavingOrder__AccountAssignment_9 ) )
            {
            // InternalMyDsl.g:4552:1: ( ( rule__SavingOrder__AccountAssignment_9 ) )
            // InternalMyDsl.g:4553:2: ( rule__SavingOrder__AccountAssignment_9 )
            {
             before(grammarAccess.getSavingOrderAccess().getAccountAssignment_9()); 
            // InternalMyDsl.g:4554:2: ( rule__SavingOrder__AccountAssignment_9 )
            // InternalMyDsl.g:4554:3: rule__SavingOrder__AccountAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__SavingOrder__AccountAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSavingOrderAccess().getAccountAssignment_9()); 

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
    // $ANTLR end "rule__SavingOrder__Group__9__Impl"


    // $ANTLR start "rule__SavingOrder__Group__10"
    // InternalMyDsl.g:4562:1: rule__SavingOrder__Group__10 : rule__SavingOrder__Group__10__Impl rule__SavingOrder__Group__11 ;
    public final void rule__SavingOrder__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4566:1: ( rule__SavingOrder__Group__10__Impl rule__SavingOrder__Group__11 )
            // InternalMyDsl.g:4567:2: rule__SavingOrder__Group__10__Impl rule__SavingOrder__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__SavingOrder__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SavingOrder__Group__11();

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
    // $ANTLR end "rule__SavingOrder__Group__10"


    // $ANTLR start "rule__SavingOrder__Group__10__Impl"
    // InternalMyDsl.g:4574:1: rule__SavingOrder__Group__10__Impl : ( 'Token' ) ;
    public final void rule__SavingOrder__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4578:1: ( ( 'Token' ) )
            // InternalMyDsl.g:4579:1: ( 'Token' )
            {
            // InternalMyDsl.g:4579:1: ( 'Token' )
            // InternalMyDsl.g:4580:2: 'Token'
            {
             before(grammarAccess.getSavingOrderAccess().getTokenKeyword_10()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSavingOrderAccess().getTokenKeyword_10()); 

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
    // $ANTLR end "rule__SavingOrder__Group__10__Impl"


    // $ANTLR start "rule__SavingOrder__Group__11"
    // InternalMyDsl.g:4589:1: rule__SavingOrder__Group__11 : rule__SavingOrder__Group__11__Impl rule__SavingOrder__Group__12 ;
    public final void rule__SavingOrder__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4593:1: ( rule__SavingOrder__Group__11__Impl rule__SavingOrder__Group__12 )
            // InternalMyDsl.g:4594:2: rule__SavingOrder__Group__11__Impl rule__SavingOrder__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__SavingOrder__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SavingOrder__Group__12();

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
    // $ANTLR end "rule__SavingOrder__Group__11"


    // $ANTLR start "rule__SavingOrder__Group__11__Impl"
    // InternalMyDsl.g:4601:1: rule__SavingOrder__Group__11__Impl : ( ( rule__SavingOrder__TokenAssignment_11 ) ) ;
    public final void rule__SavingOrder__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4605:1: ( ( ( rule__SavingOrder__TokenAssignment_11 ) ) )
            // InternalMyDsl.g:4606:1: ( ( rule__SavingOrder__TokenAssignment_11 ) )
            {
            // InternalMyDsl.g:4606:1: ( ( rule__SavingOrder__TokenAssignment_11 ) )
            // InternalMyDsl.g:4607:2: ( rule__SavingOrder__TokenAssignment_11 )
            {
             before(grammarAccess.getSavingOrderAccess().getTokenAssignment_11()); 
            // InternalMyDsl.g:4608:2: ( rule__SavingOrder__TokenAssignment_11 )
            // InternalMyDsl.g:4608:3: rule__SavingOrder__TokenAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__SavingOrder__TokenAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getSavingOrderAccess().getTokenAssignment_11()); 

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
    // $ANTLR end "rule__SavingOrder__Group__11__Impl"


    // $ANTLR start "rule__SavingOrder__Group__12"
    // InternalMyDsl.g:4616:1: rule__SavingOrder__Group__12 : rule__SavingOrder__Group__12__Impl ;
    public final void rule__SavingOrder__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4620:1: ( rule__SavingOrder__Group__12__Impl )
            // InternalMyDsl.g:4621:2: rule__SavingOrder__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SavingOrder__Group__12__Impl();

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
    // $ANTLR end "rule__SavingOrder__Group__12"


    // $ANTLR start "rule__SavingOrder__Group__12__Impl"
    // InternalMyDsl.g:4627:1: rule__SavingOrder__Group__12__Impl : ( '}' ) ;
    public final void rule__SavingOrder__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4631:1: ( ( '}' ) )
            // InternalMyDsl.g:4632:1: ( '}' )
            {
            // InternalMyDsl.g:4632:1: ( '}' )
            // InternalMyDsl.g:4633:2: '}'
            {
             before(grammarAccess.getSavingOrderAccess().getRightCurlyBracketKeyword_12()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSavingOrderAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__SavingOrder__Group__12__Impl"


    // $ANTLR start "rule__SavingOrder__Group_5__0"
    // InternalMyDsl.g:4643:1: rule__SavingOrder__Group_5__0 : rule__SavingOrder__Group_5__0__Impl rule__SavingOrder__Group_5__1 ;
    public final void rule__SavingOrder__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4647:1: ( rule__SavingOrder__Group_5__0__Impl rule__SavingOrder__Group_5__1 )
            // InternalMyDsl.g:4648:2: rule__SavingOrder__Group_5__0__Impl rule__SavingOrder__Group_5__1
            {
            pushFollow(FOLLOW_38);
            rule__SavingOrder__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SavingOrder__Group_5__1();

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
    // $ANTLR end "rule__SavingOrder__Group_5__0"


    // $ANTLR start "rule__SavingOrder__Group_5__0__Impl"
    // InternalMyDsl.g:4655:1: rule__SavingOrder__Group_5__0__Impl : ( 'MatureDate' ) ;
    public final void rule__SavingOrder__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4659:1: ( ( 'MatureDate' ) )
            // InternalMyDsl.g:4660:1: ( 'MatureDate' )
            {
            // InternalMyDsl.g:4660:1: ( 'MatureDate' )
            // InternalMyDsl.g:4661:2: 'MatureDate'
            {
             before(grammarAccess.getSavingOrderAccess().getMatureDateKeyword_5_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getSavingOrderAccess().getMatureDateKeyword_5_0()); 

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
    // $ANTLR end "rule__SavingOrder__Group_5__0__Impl"


    // $ANTLR start "rule__SavingOrder__Group_5__1"
    // InternalMyDsl.g:4670:1: rule__SavingOrder__Group_5__1 : rule__SavingOrder__Group_5__1__Impl ;
    public final void rule__SavingOrder__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4674:1: ( rule__SavingOrder__Group_5__1__Impl )
            // InternalMyDsl.g:4675:2: rule__SavingOrder__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SavingOrder__Group_5__1__Impl();

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
    // $ANTLR end "rule__SavingOrder__Group_5__1"


    // $ANTLR start "rule__SavingOrder__Group_5__1__Impl"
    // InternalMyDsl.g:4681:1: rule__SavingOrder__Group_5__1__Impl : ( ( rule__SavingOrder__MatureDateAssignment_5_1 ) ) ;
    public final void rule__SavingOrder__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4685:1: ( ( ( rule__SavingOrder__MatureDateAssignment_5_1 ) ) )
            // InternalMyDsl.g:4686:1: ( ( rule__SavingOrder__MatureDateAssignment_5_1 ) )
            {
            // InternalMyDsl.g:4686:1: ( ( rule__SavingOrder__MatureDateAssignment_5_1 ) )
            // InternalMyDsl.g:4687:2: ( rule__SavingOrder__MatureDateAssignment_5_1 )
            {
             before(grammarAccess.getSavingOrderAccess().getMatureDateAssignment_5_1()); 
            // InternalMyDsl.g:4688:2: ( rule__SavingOrder__MatureDateAssignment_5_1 )
            // InternalMyDsl.g:4688:3: rule__SavingOrder__MatureDateAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SavingOrder__MatureDateAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSavingOrderAccess().getMatureDateAssignment_5_1()); 

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
    // $ANTLR end "rule__SavingOrder__Group_5__1__Impl"


    // $ANTLR start "rule__TokenBalance__Group__0"
    // InternalMyDsl.g:4697:1: rule__TokenBalance__Group__0 : rule__TokenBalance__Group__0__Impl rule__TokenBalance__Group__1 ;
    public final void rule__TokenBalance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4701:1: ( rule__TokenBalance__Group__0__Impl rule__TokenBalance__Group__1 )
            // InternalMyDsl.g:4702:2: rule__TokenBalance__Group__0__Impl rule__TokenBalance__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TokenBalance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenBalance__Group__1();

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
    // $ANTLR end "rule__TokenBalance__Group__0"


    // $ANTLR start "rule__TokenBalance__Group__0__Impl"
    // InternalMyDsl.g:4709:1: rule__TokenBalance__Group__0__Impl : ( 'TokenBalance' ) ;
    public final void rule__TokenBalance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4713:1: ( ( 'TokenBalance' ) )
            // InternalMyDsl.g:4714:1: ( 'TokenBalance' )
            {
            // InternalMyDsl.g:4714:1: ( 'TokenBalance' )
            // InternalMyDsl.g:4715:2: 'TokenBalance'
            {
             before(grammarAccess.getTokenBalanceAccess().getTokenBalanceKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getTokenBalanceAccess().getTokenBalanceKeyword_0()); 

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
    // $ANTLR end "rule__TokenBalance__Group__0__Impl"


    // $ANTLR start "rule__TokenBalance__Group__1"
    // InternalMyDsl.g:4724:1: rule__TokenBalance__Group__1 : rule__TokenBalance__Group__1__Impl rule__TokenBalance__Group__2 ;
    public final void rule__TokenBalance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4728:1: ( rule__TokenBalance__Group__1__Impl rule__TokenBalance__Group__2 )
            // InternalMyDsl.g:4729:2: rule__TokenBalance__Group__1__Impl rule__TokenBalance__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TokenBalance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenBalance__Group__2();

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
    // $ANTLR end "rule__TokenBalance__Group__1"


    // $ANTLR start "rule__TokenBalance__Group__1__Impl"
    // InternalMyDsl.g:4736:1: rule__TokenBalance__Group__1__Impl : ( ( rule__TokenBalance__NameAssignment_1 ) ) ;
    public final void rule__TokenBalance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4740:1: ( ( ( rule__TokenBalance__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4741:1: ( ( rule__TokenBalance__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4741:1: ( ( rule__TokenBalance__NameAssignment_1 ) )
            // InternalMyDsl.g:4742:2: ( rule__TokenBalance__NameAssignment_1 )
            {
             before(grammarAccess.getTokenBalanceAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4743:2: ( rule__TokenBalance__NameAssignment_1 )
            // InternalMyDsl.g:4743:3: rule__TokenBalance__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TokenBalance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTokenBalanceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__TokenBalance__Group__1__Impl"


    // $ANTLR start "rule__TokenBalance__Group__2"
    // InternalMyDsl.g:4751:1: rule__TokenBalance__Group__2 : rule__TokenBalance__Group__2__Impl rule__TokenBalance__Group__3 ;
    public final void rule__TokenBalance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4755:1: ( rule__TokenBalance__Group__2__Impl rule__TokenBalance__Group__3 )
            // InternalMyDsl.g:4756:2: rule__TokenBalance__Group__2__Impl rule__TokenBalance__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__TokenBalance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenBalance__Group__3();

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
    // $ANTLR end "rule__TokenBalance__Group__2"


    // $ANTLR start "rule__TokenBalance__Group__2__Impl"
    // InternalMyDsl.g:4763:1: rule__TokenBalance__Group__2__Impl : ( '{' ) ;
    public final void rule__TokenBalance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4767:1: ( ( '{' ) )
            // InternalMyDsl.g:4768:1: ( '{' )
            {
            // InternalMyDsl.g:4768:1: ( '{' )
            // InternalMyDsl.g:4769:2: '{'
            {
             before(grammarAccess.getTokenBalanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTokenBalanceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__TokenBalance__Group__2__Impl"


    // $ANTLR start "rule__TokenBalance__Group__3"
    // InternalMyDsl.g:4778:1: rule__TokenBalance__Group__3 : rule__TokenBalance__Group__3__Impl rule__TokenBalance__Group__4 ;
    public final void rule__TokenBalance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4782:1: ( rule__TokenBalance__Group__3__Impl rule__TokenBalance__Group__4 )
            // InternalMyDsl.g:4783:2: rule__TokenBalance__Group__3__Impl rule__TokenBalance__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__TokenBalance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenBalance__Group__4();

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
    // $ANTLR end "rule__TokenBalance__Group__3"


    // $ANTLR start "rule__TokenBalance__Group__3__Impl"
    // InternalMyDsl.g:4790:1: rule__TokenBalance__Group__3__Impl : ( 'balance' ) ;
    public final void rule__TokenBalance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4794:1: ( ( 'balance' ) )
            // InternalMyDsl.g:4795:1: ( 'balance' )
            {
            // InternalMyDsl.g:4795:1: ( 'balance' )
            // InternalMyDsl.g:4796:2: 'balance'
            {
             before(grammarAccess.getTokenBalanceAccess().getBalanceKeyword_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getTokenBalanceAccess().getBalanceKeyword_3()); 

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
    // $ANTLR end "rule__TokenBalance__Group__3__Impl"


    // $ANTLR start "rule__TokenBalance__Group__4"
    // InternalMyDsl.g:4805:1: rule__TokenBalance__Group__4 : rule__TokenBalance__Group__4__Impl rule__TokenBalance__Group__5 ;
    public final void rule__TokenBalance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4809:1: ( rule__TokenBalance__Group__4__Impl rule__TokenBalance__Group__5 )
            // InternalMyDsl.g:4810:2: rule__TokenBalance__Group__4__Impl rule__TokenBalance__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__TokenBalance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenBalance__Group__5();

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
    // $ANTLR end "rule__TokenBalance__Group__4"


    // $ANTLR start "rule__TokenBalance__Group__4__Impl"
    // InternalMyDsl.g:4817:1: rule__TokenBalance__Group__4__Impl : ( ( rule__TokenBalance__BalanceAssignment_4 ) ) ;
    public final void rule__TokenBalance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4821:1: ( ( ( rule__TokenBalance__BalanceAssignment_4 ) ) )
            // InternalMyDsl.g:4822:1: ( ( rule__TokenBalance__BalanceAssignment_4 ) )
            {
            // InternalMyDsl.g:4822:1: ( ( rule__TokenBalance__BalanceAssignment_4 ) )
            // InternalMyDsl.g:4823:2: ( rule__TokenBalance__BalanceAssignment_4 )
            {
             before(grammarAccess.getTokenBalanceAccess().getBalanceAssignment_4()); 
            // InternalMyDsl.g:4824:2: ( rule__TokenBalance__BalanceAssignment_4 )
            // InternalMyDsl.g:4824:3: rule__TokenBalance__BalanceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TokenBalance__BalanceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTokenBalanceAccess().getBalanceAssignment_4()); 

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
    // $ANTLR end "rule__TokenBalance__Group__4__Impl"


    // $ANTLR start "rule__TokenBalance__Group__5"
    // InternalMyDsl.g:4832:1: rule__TokenBalance__Group__5 : rule__TokenBalance__Group__5__Impl rule__TokenBalance__Group__6 ;
    public final void rule__TokenBalance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4836:1: ( rule__TokenBalance__Group__5__Impl rule__TokenBalance__Group__6 )
            // InternalMyDsl.g:4837:2: rule__TokenBalance__Group__5__Impl rule__TokenBalance__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__TokenBalance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenBalance__Group__6();

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
    // $ANTLR end "rule__TokenBalance__Group__5"


    // $ANTLR start "rule__TokenBalance__Group__5__Impl"
    // InternalMyDsl.g:4844:1: rule__TokenBalance__Group__5__Impl : ( 'Token' ) ;
    public final void rule__TokenBalance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4848:1: ( ( 'Token' ) )
            // InternalMyDsl.g:4849:1: ( 'Token' )
            {
            // InternalMyDsl.g:4849:1: ( 'Token' )
            // InternalMyDsl.g:4850:2: 'Token'
            {
             before(grammarAccess.getTokenBalanceAccess().getTokenKeyword_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTokenBalanceAccess().getTokenKeyword_5()); 

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
    // $ANTLR end "rule__TokenBalance__Group__5__Impl"


    // $ANTLR start "rule__TokenBalance__Group__6"
    // InternalMyDsl.g:4859:1: rule__TokenBalance__Group__6 : rule__TokenBalance__Group__6__Impl rule__TokenBalance__Group__7 ;
    public final void rule__TokenBalance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4863:1: ( rule__TokenBalance__Group__6__Impl rule__TokenBalance__Group__7 )
            // InternalMyDsl.g:4864:2: rule__TokenBalance__Group__6__Impl rule__TokenBalance__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__TokenBalance__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TokenBalance__Group__7();

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
    // $ANTLR end "rule__TokenBalance__Group__6"


    // $ANTLR start "rule__TokenBalance__Group__6__Impl"
    // InternalMyDsl.g:4871:1: rule__TokenBalance__Group__6__Impl : ( ( rule__TokenBalance__TokenAssignment_6 ) ) ;
    public final void rule__TokenBalance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4875:1: ( ( ( rule__TokenBalance__TokenAssignment_6 ) ) )
            // InternalMyDsl.g:4876:1: ( ( rule__TokenBalance__TokenAssignment_6 ) )
            {
            // InternalMyDsl.g:4876:1: ( ( rule__TokenBalance__TokenAssignment_6 ) )
            // InternalMyDsl.g:4877:2: ( rule__TokenBalance__TokenAssignment_6 )
            {
             before(grammarAccess.getTokenBalanceAccess().getTokenAssignment_6()); 
            // InternalMyDsl.g:4878:2: ( rule__TokenBalance__TokenAssignment_6 )
            // InternalMyDsl.g:4878:3: rule__TokenBalance__TokenAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__TokenBalance__TokenAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTokenBalanceAccess().getTokenAssignment_6()); 

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
    // $ANTLR end "rule__TokenBalance__Group__6__Impl"


    // $ANTLR start "rule__TokenBalance__Group__7"
    // InternalMyDsl.g:4886:1: rule__TokenBalance__Group__7 : rule__TokenBalance__Group__7__Impl ;
    public final void rule__TokenBalance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4890:1: ( rule__TokenBalance__Group__7__Impl )
            // InternalMyDsl.g:4891:2: rule__TokenBalance__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TokenBalance__Group__7__Impl();

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
    // $ANTLR end "rule__TokenBalance__Group__7"


    // $ANTLR start "rule__TokenBalance__Group__7__Impl"
    // InternalMyDsl.g:4897:1: rule__TokenBalance__Group__7__Impl : ( '}' ) ;
    public final void rule__TokenBalance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4901:1: ( ( '}' ) )
            // InternalMyDsl.g:4902:1: ( '}' )
            {
            // InternalMyDsl.g:4902:1: ( '}' )
            // InternalMyDsl.g:4903:2: '}'
            {
             before(grammarAccess.getTokenBalanceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTokenBalanceAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__TokenBalance__Group__7__Impl"


    // $ANTLR start "rule__TransferRequest__Group__0"
    // InternalMyDsl.g:4913:1: rule__TransferRequest__Group__0 : rule__TransferRequest__Group__0__Impl rule__TransferRequest__Group__1 ;
    public final void rule__TransferRequest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4917:1: ( rule__TransferRequest__Group__0__Impl rule__TransferRequest__Group__1 )
            // InternalMyDsl.g:4918:2: rule__TransferRequest__Group__0__Impl rule__TransferRequest__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TransferRequest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferRequest__Group__1();

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
    // $ANTLR end "rule__TransferRequest__Group__0"


    // $ANTLR start "rule__TransferRequest__Group__0__Impl"
    // InternalMyDsl.g:4925:1: rule__TransferRequest__Group__0__Impl : ( 'TransferRequest' ) ;
    public final void rule__TransferRequest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4929:1: ( ( 'TransferRequest' ) )
            // InternalMyDsl.g:4930:1: ( 'TransferRequest' )
            {
            // InternalMyDsl.g:4930:1: ( 'TransferRequest' )
            // InternalMyDsl.g:4931:2: 'TransferRequest'
            {
             before(grammarAccess.getTransferRequestAccess().getTransferRequestKeyword_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getTransferRequestAccess().getTransferRequestKeyword_0()); 

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
    // $ANTLR end "rule__TransferRequest__Group__0__Impl"


    // $ANTLR start "rule__TransferRequest__Group__1"
    // InternalMyDsl.g:4940:1: rule__TransferRequest__Group__1 : rule__TransferRequest__Group__1__Impl rule__TransferRequest__Group__2 ;
    public final void rule__TransferRequest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4944:1: ( rule__TransferRequest__Group__1__Impl rule__TransferRequest__Group__2 )
            // InternalMyDsl.g:4945:2: rule__TransferRequest__Group__1__Impl rule__TransferRequest__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TransferRequest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferRequest__Group__2();

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
    // $ANTLR end "rule__TransferRequest__Group__1"


    // $ANTLR start "rule__TransferRequest__Group__1__Impl"
    // InternalMyDsl.g:4952:1: rule__TransferRequest__Group__1__Impl : ( ( rule__TransferRequest__IDAssignment_1 ) ) ;
    public final void rule__TransferRequest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4956:1: ( ( ( rule__TransferRequest__IDAssignment_1 ) ) )
            // InternalMyDsl.g:4957:1: ( ( rule__TransferRequest__IDAssignment_1 ) )
            {
            // InternalMyDsl.g:4957:1: ( ( rule__TransferRequest__IDAssignment_1 ) )
            // InternalMyDsl.g:4958:2: ( rule__TransferRequest__IDAssignment_1 )
            {
             before(grammarAccess.getTransferRequestAccess().getIDAssignment_1()); 
            // InternalMyDsl.g:4959:2: ( rule__TransferRequest__IDAssignment_1 )
            // InternalMyDsl.g:4959:3: rule__TransferRequest__IDAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TransferRequest__IDAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransferRequestAccess().getIDAssignment_1()); 

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
    // $ANTLR end "rule__TransferRequest__Group__1__Impl"


    // $ANTLR start "rule__TransferRequest__Group__2"
    // InternalMyDsl.g:4967:1: rule__TransferRequest__Group__2 : rule__TransferRequest__Group__2__Impl rule__TransferRequest__Group__3 ;
    public final void rule__TransferRequest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4971:1: ( rule__TransferRequest__Group__2__Impl rule__TransferRequest__Group__3 )
            // InternalMyDsl.g:4972:2: rule__TransferRequest__Group__2__Impl rule__TransferRequest__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__TransferRequest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferRequest__Group__3();

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
    // $ANTLR end "rule__TransferRequest__Group__2"


    // $ANTLR start "rule__TransferRequest__Group__2__Impl"
    // InternalMyDsl.g:4979:1: rule__TransferRequest__Group__2__Impl : ( '{' ) ;
    public final void rule__TransferRequest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4983:1: ( ( '{' ) )
            // InternalMyDsl.g:4984:1: ( '{' )
            {
            // InternalMyDsl.g:4984:1: ( '{' )
            // InternalMyDsl.g:4985:2: '{'
            {
             before(grammarAccess.getTransferRequestAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTransferRequestAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__TransferRequest__Group__2__Impl"


    // $ANTLR start "rule__TransferRequest__Group__3"
    // InternalMyDsl.g:4994:1: rule__TransferRequest__Group__3 : rule__TransferRequest__Group__3__Impl rule__TransferRequest__Group__4 ;
    public final void rule__TransferRequest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4998:1: ( rule__TransferRequest__Group__3__Impl rule__TransferRequest__Group__4 )
            // InternalMyDsl.g:4999:2: rule__TransferRequest__Group__3__Impl rule__TransferRequest__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__TransferRequest__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferRequest__Group__4();

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
    // $ANTLR end "rule__TransferRequest__Group__3"


    // $ANTLR start "rule__TransferRequest__Group__3__Impl"
    // InternalMyDsl.g:5006:1: rule__TransferRequest__Group__3__Impl : ( ( rule__TransferRequest__Group_3__0 )? ) ;
    public final void rule__TransferRequest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5010:1: ( ( ( rule__TransferRequest__Group_3__0 )? ) )
            // InternalMyDsl.g:5011:1: ( ( rule__TransferRequest__Group_3__0 )? )
            {
            // InternalMyDsl.g:5011:1: ( ( rule__TransferRequest__Group_3__0 )? )
            // InternalMyDsl.g:5012:2: ( rule__TransferRequest__Group_3__0 )?
            {
             before(grammarAccess.getTransferRequestAccess().getGroup_3()); 
            // InternalMyDsl.g:5013:2: ( rule__TransferRequest__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==68) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:5013:3: rule__TransferRequest__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransferRequest__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransferRequestAccess().getGroup_3()); 

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
    // $ANTLR end "rule__TransferRequest__Group__3__Impl"


    // $ANTLR start "rule__TransferRequest__Group__4"
    // InternalMyDsl.g:5021:1: rule__TransferRequest__Group__4 : rule__TransferRequest__Group__4__Impl rule__TransferRequest__Group__5 ;
    public final void rule__TransferRequest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5025:1: ( rule__TransferRequest__Group__4__Impl rule__TransferRequest__Group__5 )
            // InternalMyDsl.g:5026:2: rule__TransferRequest__Group__4__Impl rule__TransferRequest__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__TransferRequest__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferRequest__Group__5();

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
    // $ANTLR end "rule__TransferRequest__Group__4"


    // $ANTLR start "rule__TransferRequest__Group__4__Impl"
    // InternalMyDsl.g:5033:1: rule__TransferRequest__Group__4__Impl : ( 'amount' ) ;
    public final void rule__TransferRequest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5037:1: ( ( 'amount' ) )
            // InternalMyDsl.g:5038:1: ( 'amount' )
            {
            // InternalMyDsl.g:5038:1: ( 'amount' )
            // InternalMyDsl.g:5039:2: 'amount'
            {
             before(grammarAccess.getTransferRequestAccess().getAmountKeyword_4()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getTransferRequestAccess().getAmountKeyword_4()); 

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
    // $ANTLR end "rule__TransferRequest__Group__4__Impl"


    // $ANTLR start "rule__TransferRequest__Group__5"
    // InternalMyDsl.g:5048:1: rule__TransferRequest__Group__5 : rule__TransferRequest__Group__5__Impl rule__TransferRequest__Group__6 ;
    public final void rule__TransferRequest__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5052:1: ( rule__TransferRequest__Group__5__Impl rule__TransferRequest__Group__6 )
            // InternalMyDsl.g:5053:2: rule__TransferRequest__Group__5__Impl rule__TransferRequest__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__TransferRequest__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferRequest__Group__6();

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
    // $ANTLR end "rule__TransferRequest__Group__5"


    // $ANTLR start "rule__TransferRequest__Group__5__Impl"
    // InternalMyDsl.g:5060:1: rule__TransferRequest__Group__5__Impl : ( ( rule__TransferRequest__AmountAssignment_5 ) ) ;
    public final void rule__TransferRequest__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5064:1: ( ( ( rule__TransferRequest__AmountAssignment_5 ) ) )
            // InternalMyDsl.g:5065:1: ( ( rule__TransferRequest__AmountAssignment_5 ) )
            {
            // InternalMyDsl.g:5065:1: ( ( rule__TransferRequest__AmountAssignment_5 ) )
            // InternalMyDsl.g:5066:2: ( rule__TransferRequest__AmountAssignment_5 )
            {
             before(grammarAccess.getTransferRequestAccess().getAmountAssignment_5()); 
            // InternalMyDsl.g:5067:2: ( rule__TransferRequest__AmountAssignment_5 )
            // InternalMyDsl.g:5067:3: rule__TransferRequest__AmountAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TransferRequest__AmountAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTransferRequestAccess().getAmountAssignment_5()); 

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
    // $ANTLR end "rule__TransferRequest__Group__5__Impl"


    // $ANTLR start "rule__TransferRequest__Group__6"
    // InternalMyDsl.g:5075:1: rule__TransferRequest__Group__6 : rule__TransferRequest__Group__6__Impl rule__TransferRequest__Group__7 ;
    public final void rule__TransferRequest__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5079:1: ( rule__TransferRequest__Group__6__Impl rule__TransferRequest__Group__7 )
            // InternalMyDsl.g:5080:2: rule__TransferRequest__Group__6__Impl rule__TransferRequest__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__TransferRequest__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferRequest__Group__7();

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
    // $ANTLR end "rule__TransferRequest__Group__6"


    // $ANTLR start "rule__TransferRequest__Group__6__Impl"
    // InternalMyDsl.g:5087:1: rule__TransferRequest__Group__6__Impl : ( 'Token' ) ;
    public final void rule__TransferRequest__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5091:1: ( ( 'Token' ) )
            // InternalMyDsl.g:5092:1: ( 'Token' )
            {
            // InternalMyDsl.g:5092:1: ( 'Token' )
            // InternalMyDsl.g:5093:2: 'Token'
            {
             before(grammarAccess.getTransferRequestAccess().getTokenKeyword_6()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTransferRequestAccess().getTokenKeyword_6()); 

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
    // $ANTLR end "rule__TransferRequest__Group__6__Impl"


    // $ANTLR start "rule__TransferRequest__Group__7"
    // InternalMyDsl.g:5102:1: rule__TransferRequest__Group__7 : rule__TransferRequest__Group__7__Impl rule__TransferRequest__Group__8 ;
    public final void rule__TransferRequest__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5106:1: ( rule__TransferRequest__Group__7__Impl rule__TransferRequest__Group__8 )
            // InternalMyDsl.g:5107:2: rule__TransferRequest__Group__7__Impl rule__TransferRequest__Group__8
            {
            pushFollow(FOLLOW_41);
            rule__TransferRequest__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferRequest__Group__8();

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
    // $ANTLR end "rule__TransferRequest__Group__7"


    // $ANTLR start "rule__TransferRequest__Group__7__Impl"
    // InternalMyDsl.g:5114:1: rule__TransferRequest__Group__7__Impl : ( ( rule__TransferRequest__TokenAssignment_7 ) ) ;
    public final void rule__TransferRequest__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5118:1: ( ( ( rule__TransferRequest__TokenAssignment_7 ) ) )
            // InternalMyDsl.g:5119:1: ( ( rule__TransferRequest__TokenAssignment_7 ) )
            {
            // InternalMyDsl.g:5119:1: ( ( rule__TransferRequest__TokenAssignment_7 ) )
            // InternalMyDsl.g:5120:2: ( rule__TransferRequest__TokenAssignment_7 )
            {
             before(grammarAccess.getTransferRequestAccess().getTokenAssignment_7()); 
            // InternalMyDsl.g:5121:2: ( rule__TransferRequest__TokenAssignment_7 )
            // InternalMyDsl.g:5121:3: rule__TransferRequest__TokenAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__TransferRequest__TokenAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTransferRequestAccess().getTokenAssignment_7()); 

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
    // $ANTLR end "rule__TransferRequest__Group__7__Impl"


    // $ANTLR start "rule__TransferRequest__Group__8"
    // InternalMyDsl.g:5129:1: rule__TransferRequest__Group__8 : rule__TransferRequest__Group__8__Impl rule__TransferRequest__Group__9 ;
    public final void rule__TransferRequest__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5133:1: ( rule__TransferRequest__Group__8__Impl rule__TransferRequest__Group__9 )
            // InternalMyDsl.g:5134:2: rule__TransferRequest__Group__8__Impl rule__TransferRequest__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__TransferRequest__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferRequest__Group__9();

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
    // $ANTLR end "rule__TransferRequest__Group__8"


    // $ANTLR start "rule__TransferRequest__Group__8__Impl"
    // InternalMyDsl.g:5141:1: rule__TransferRequest__Group__8__Impl : ( 'Destination' ) ;
    public final void rule__TransferRequest__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5145:1: ( ( 'Destination' ) )
            // InternalMyDsl.g:5146:1: ( 'Destination' )
            {
            // InternalMyDsl.g:5146:1: ( 'Destination' )
            // InternalMyDsl.g:5147:2: 'Destination'
            {
             before(grammarAccess.getTransferRequestAccess().getDestinationKeyword_8()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getTransferRequestAccess().getDestinationKeyword_8()); 

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
    // $ANTLR end "rule__TransferRequest__Group__8__Impl"


    // $ANTLR start "rule__TransferRequest__Group__9"
    // InternalMyDsl.g:5156:1: rule__TransferRequest__Group__9 : rule__TransferRequest__Group__9__Impl rule__TransferRequest__Group__10 ;
    public final void rule__TransferRequest__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5160:1: ( rule__TransferRequest__Group__9__Impl rule__TransferRequest__Group__10 )
            // InternalMyDsl.g:5161:2: rule__TransferRequest__Group__9__Impl rule__TransferRequest__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__TransferRequest__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferRequest__Group__10();

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
    // $ANTLR end "rule__TransferRequest__Group__9"


    // $ANTLR start "rule__TransferRequest__Group__9__Impl"
    // InternalMyDsl.g:5168:1: rule__TransferRequest__Group__9__Impl : ( ( rule__TransferRequest__DestinationAssignment_9 ) ) ;
    public final void rule__TransferRequest__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5172:1: ( ( ( rule__TransferRequest__DestinationAssignment_9 ) ) )
            // InternalMyDsl.g:5173:1: ( ( rule__TransferRequest__DestinationAssignment_9 ) )
            {
            // InternalMyDsl.g:5173:1: ( ( rule__TransferRequest__DestinationAssignment_9 ) )
            // InternalMyDsl.g:5174:2: ( rule__TransferRequest__DestinationAssignment_9 )
            {
             before(grammarAccess.getTransferRequestAccess().getDestinationAssignment_9()); 
            // InternalMyDsl.g:5175:2: ( rule__TransferRequest__DestinationAssignment_9 )
            // InternalMyDsl.g:5175:3: rule__TransferRequest__DestinationAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__TransferRequest__DestinationAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTransferRequestAccess().getDestinationAssignment_9()); 

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
    // $ANTLR end "rule__TransferRequest__Group__9__Impl"


    // $ANTLR start "rule__TransferRequest__Group__10"
    // InternalMyDsl.g:5183:1: rule__TransferRequest__Group__10 : rule__TransferRequest__Group__10__Impl ;
    public final void rule__TransferRequest__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5187:1: ( rule__TransferRequest__Group__10__Impl )
            // InternalMyDsl.g:5188:2: rule__TransferRequest__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransferRequest__Group__10__Impl();

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
    // $ANTLR end "rule__TransferRequest__Group__10"


    // $ANTLR start "rule__TransferRequest__Group__10__Impl"
    // InternalMyDsl.g:5194:1: rule__TransferRequest__Group__10__Impl : ( '}' ) ;
    public final void rule__TransferRequest__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5198:1: ( ( '}' ) )
            // InternalMyDsl.g:5199:1: ( '}' )
            {
            // InternalMyDsl.g:5199:1: ( '}' )
            // InternalMyDsl.g:5200:2: '}'
            {
             before(grammarAccess.getTransferRequestAccess().getRightCurlyBracketKeyword_10()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getTransferRequestAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__TransferRequest__Group__10__Impl"


    // $ANTLR start "rule__TransferRequest__Group_3__0"
    // InternalMyDsl.g:5210:1: rule__TransferRequest__Group_3__0 : rule__TransferRequest__Group_3__0__Impl rule__TransferRequest__Group_3__1 ;
    public final void rule__TransferRequest__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5214:1: ( rule__TransferRequest__Group_3__0__Impl rule__TransferRequest__Group_3__1 )
            // InternalMyDsl.g:5215:2: rule__TransferRequest__Group_3__0__Impl rule__TransferRequest__Group_3__1
            {
            pushFollow(FOLLOW_42);
            rule__TransferRequest__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferRequest__Group_3__1();

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
    // $ANTLR end "rule__TransferRequest__Group_3__0"


    // $ANTLR start "rule__TransferRequest__Group_3__0__Impl"
    // InternalMyDsl.g:5222:1: rule__TransferRequest__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__TransferRequest__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5226:1: ( ( 'type' ) )
            // InternalMyDsl.g:5227:1: ( 'type' )
            {
            // InternalMyDsl.g:5227:1: ( 'type' )
            // InternalMyDsl.g:5228:2: 'type'
            {
             before(grammarAccess.getTransferRequestAccess().getTypeKeyword_3_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getTransferRequestAccess().getTypeKeyword_3_0()); 

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
    // $ANTLR end "rule__TransferRequest__Group_3__0__Impl"


    // $ANTLR start "rule__TransferRequest__Group_3__1"
    // InternalMyDsl.g:5237:1: rule__TransferRequest__Group_3__1 : rule__TransferRequest__Group_3__1__Impl ;
    public final void rule__TransferRequest__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5241:1: ( rule__TransferRequest__Group_3__1__Impl )
            // InternalMyDsl.g:5242:2: rule__TransferRequest__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransferRequest__Group_3__1__Impl();

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
    // $ANTLR end "rule__TransferRequest__Group_3__1"


    // $ANTLR start "rule__TransferRequest__Group_3__1__Impl"
    // InternalMyDsl.g:5248:1: rule__TransferRequest__Group_3__1__Impl : ( ( rule__TransferRequest__TypeAssignment_3_1 ) ) ;
    public final void rule__TransferRequest__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5252:1: ( ( ( rule__TransferRequest__TypeAssignment_3_1 ) ) )
            // InternalMyDsl.g:5253:1: ( ( rule__TransferRequest__TypeAssignment_3_1 ) )
            {
            // InternalMyDsl.g:5253:1: ( ( rule__TransferRequest__TypeAssignment_3_1 ) )
            // InternalMyDsl.g:5254:2: ( rule__TransferRequest__TypeAssignment_3_1 )
            {
             before(grammarAccess.getTransferRequestAccess().getTypeAssignment_3_1()); 
            // InternalMyDsl.g:5255:2: ( rule__TransferRequest__TypeAssignment_3_1 )
            // InternalMyDsl.g:5255:3: rule__TransferRequest__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TransferRequest__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransferRequestAccess().getTypeAssignment_3_1()); 

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
    // $ANTLR end "rule__TransferRequest__Group_3__1__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalMyDsl.g:5264:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5268:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalMyDsl.g:5269:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

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
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalMyDsl.g:5276:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5280:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:5281:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:5281:1: ( ( '-' )? )
            // InternalMyDsl.g:5282:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:5283:2: ( '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==69) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:5283:3: '-'
                    {
                    match(input,69,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalMyDsl.g:5291:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5295:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalMyDsl.g:5296:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

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
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalMyDsl.g:5303:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5307:1: ( ( ( RULE_INT )? ) )
            // InternalMyDsl.g:5308:1: ( ( RULE_INT )? )
            {
            // InternalMyDsl.g:5308:1: ( ( RULE_INT )? )
            // InternalMyDsl.g:5309:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalMyDsl.g:5310:2: ( RULE_INT )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_INT) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:5310:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalMyDsl.g:5318:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5322:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalMyDsl.g:5323:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3();

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
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalMyDsl.g:5330:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5334:1: ( ( '.' ) )
            // InternalMyDsl.g:5335:1: ( '.' )
            {
            // InternalMyDsl.g:5335:1: ( '.' )
            // InternalMyDsl.g:5336:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalMyDsl.g:5345:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5349:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalMyDsl.g:5350:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4();

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
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalMyDsl.g:5357:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5361:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:5362:1: ( RULE_INT )
            {
            // InternalMyDsl.g:5362:1: ( RULE_INT )
            // InternalMyDsl.g:5363:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalMyDsl.g:5372:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5376:1: ( rule__EFloat__Group__4__Impl )
            // InternalMyDsl.g:5377:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4__Impl();

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
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalMyDsl.g:5383:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5387:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalMyDsl.g:5388:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalMyDsl.g:5388:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalMyDsl.g:5389:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalMyDsl.g:5390:2: ( rule__EFloat__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=12 && LA33_0<=13)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:5390:3: rule__EFloat__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalMyDsl.g:5399:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5403:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalMyDsl.g:5404:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__1();

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
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalMyDsl.g:5411:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5415:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalMyDsl.g:5416:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalMyDsl.g:5416:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalMyDsl.g:5417:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalMyDsl.g:5418:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalMyDsl.g:5418:3: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalMyDsl.g:5426:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5430:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalMyDsl.g:5431:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_21);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2();

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
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalMyDsl.g:5438:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5442:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:5443:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:5443:1: ( ( '-' )? )
            // InternalMyDsl.g:5444:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalMyDsl.g:5445:2: ( '-' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==69) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:5445:3: '-'
                    {
                    match(input,69,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalMyDsl.g:5453:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5457:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalMyDsl.g:5458:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

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
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalMyDsl.g:5464:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5468:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:5469:1: ( RULE_INT )
            {
            // InternalMyDsl.g:5469:1: ( RULE_INT )
            // InternalMyDsl.g:5470:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalMyDsl.g:5480:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5484:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalMyDsl.g:5485:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

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
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalMyDsl.g:5492:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5496:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:5497:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:5497:1: ( ( '-' )? )
            // InternalMyDsl.g:5498:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:5499:2: ( '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==69) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:5499:3: '-'
                    {
                    match(input,69,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalMyDsl.g:5507:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5511:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalMyDsl.g:5512:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

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
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalMyDsl.g:5519:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5523:1: ( ( ( RULE_INT )? ) )
            // InternalMyDsl.g:5524:1: ( ( RULE_INT )? )
            {
            // InternalMyDsl.g:5524:1: ( ( RULE_INT )? )
            // InternalMyDsl.g:5525:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalMyDsl.g:5526:2: ( RULE_INT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:5526:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalMyDsl.g:5534:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5538:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalMyDsl.g:5539:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

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
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalMyDsl.g:5546:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5550:1: ( ( '.' ) )
            // InternalMyDsl.g:5551:1: ( '.' )
            {
            // InternalMyDsl.g:5551:1: ( '.' )
            // InternalMyDsl.g:5552:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalMyDsl.g:5561:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5565:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalMyDsl.g:5566:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

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
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalMyDsl.g:5573:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5577:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:5578:1: ( RULE_INT )
            {
            // InternalMyDsl.g:5578:1: ( RULE_INT )
            // InternalMyDsl.g:5579:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalMyDsl.g:5588:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5592:1: ( rule__EDouble__Group__4__Impl )
            // InternalMyDsl.g:5593:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

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
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalMyDsl.g:5599:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5603:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalMyDsl.g:5604:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalMyDsl.g:5604:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalMyDsl.g:5605:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalMyDsl.g:5606:2: ( rule__EDouble__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=12 && LA37_0<=13)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:5606:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalMyDsl.g:5615:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5619:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalMyDsl.g:5620:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

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
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalMyDsl.g:5627:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5631:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalMyDsl.g:5632:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalMyDsl.g:5632:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalMyDsl.g:5633:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalMyDsl.g:5634:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalMyDsl.g:5634:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalMyDsl.g:5642:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5646:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalMyDsl.g:5647:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_21);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

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
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalMyDsl.g:5654:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5658:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:5659:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:5659:1: ( ( '-' )? )
            // InternalMyDsl.g:5660:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalMyDsl.g:5661:2: ( '-' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==69) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:5661:3: '-'
                    {
                    match(input,69,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalMyDsl.g:5669:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5673:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalMyDsl.g:5674:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

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
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalMyDsl.g:5680:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5684:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:5685:1: ( RULE_INT )
            {
            // InternalMyDsl.g:5685:1: ( RULE_INT )
            // InternalMyDsl.g:5686:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:5696:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5700:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:5701:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:5708:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5712:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:5713:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:5713:1: ( ( '-' )? )
            // InternalMyDsl.g:5714:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:5715:2: ( '-' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==69) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:5715:3: '-'
                    {
                    match(input,69,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:5723:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5727:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:5728:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:5734:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5738:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:5739:1: ( RULE_INT )
            {
            // InternalMyDsl.g:5739:1: ( RULE_INT )
            // InternalMyDsl.g:5740:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__CryptoExchange__NameAssignment_1"
    // InternalMyDsl.g:5750:1: rule__CryptoExchange__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CryptoExchange__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5754:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5755:2: ( ruleEString )
            {
            // InternalMyDsl.g:5755:2: ( ruleEString )
            // InternalMyDsl.g:5756:3: ruleEString
            {
             before(grammarAccess.getCryptoExchangeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCryptoExchangeAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CryptoExchange__NameAssignment_1"


    // $ANTLR start "rule__CryptoExchange__IPAssignment_3_1"
    // InternalMyDsl.g:5765:1: rule__CryptoExchange__IPAssignment_3_1 : ( ruleEString ) ;
    public final void rule__CryptoExchange__IPAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5769:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5770:2: ( ruleEString )
            {
            // InternalMyDsl.g:5770:2: ( ruleEString )
            // InternalMyDsl.g:5771:3: ruleEString
            {
             before(grammarAccess.getCryptoExchangeAccess().getIPEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCryptoExchangeAccess().getIPEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__CryptoExchange__IPAssignment_3_1"


    // $ANTLR start "rule__CryptoExchange__DomainNameAssignment_4_1"
    // InternalMyDsl.g:5780:1: rule__CryptoExchange__DomainNameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__CryptoExchange__DomainNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5784:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5785:2: ( ruleEString )
            {
            // InternalMyDsl.g:5785:2: ( ruleEString )
            // InternalMyDsl.g:5786:3: ruleEString
            {
             before(grammarAccess.getCryptoExchangeAccess().getDomainNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCryptoExchangeAccess().getDomainNameEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__CryptoExchange__DomainNameAssignment_4_1"


    // $ANTLR start "rule__CryptoExchange__SubSystemAssignment_7"
    // InternalMyDsl.g:5795:1: rule__CryptoExchange__SubSystemAssignment_7 : ( ruleSubSystem ) ;
    public final void rule__CryptoExchange__SubSystemAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5799:1: ( ( ruleSubSystem ) )
            // InternalMyDsl.g:5800:2: ( ruleSubSystem )
            {
            // InternalMyDsl.g:5800:2: ( ruleSubSystem )
            // InternalMyDsl.g:5801:3: ruleSubSystem
            {
             before(grammarAccess.getCryptoExchangeAccess().getSubSystemSubSystemParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSubSystem();

            state._fsp--;

             after(grammarAccess.getCryptoExchangeAccess().getSubSystemSubSystemParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__CryptoExchange__SubSystemAssignment_7"


    // $ANTLR start "rule__CryptoExchange__SubSystemAssignment_8_1"
    // InternalMyDsl.g:5810:1: rule__CryptoExchange__SubSystemAssignment_8_1 : ( ruleSubSystem ) ;
    public final void rule__CryptoExchange__SubSystemAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5814:1: ( ( ruleSubSystem ) )
            // InternalMyDsl.g:5815:2: ( ruleSubSystem )
            {
            // InternalMyDsl.g:5815:2: ( ruleSubSystem )
            // InternalMyDsl.g:5816:3: ruleSubSystem
            {
             before(grammarAccess.getCryptoExchangeAccess().getSubSystemSubSystemParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSubSystem();

            state._fsp--;

             after(grammarAccess.getCryptoExchangeAccess().getSubSystemSubSystemParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__CryptoExchange__SubSystemAssignment_8_1"


    // $ANTLR start "rule__CryptoExchange__TokensAssignment_12"
    // InternalMyDsl.g:5825:1: rule__CryptoExchange__TokensAssignment_12 : ( ruleToken ) ;
    public final void rule__CryptoExchange__TokensAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5829:1: ( ( ruleToken ) )
            // InternalMyDsl.g:5830:2: ( ruleToken )
            {
            // InternalMyDsl.g:5830:2: ( ruleToken )
            // InternalMyDsl.g:5831:3: ruleToken
            {
             before(grammarAccess.getCryptoExchangeAccess().getTokensTokenParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleToken();

            state._fsp--;

             after(grammarAccess.getCryptoExchangeAccess().getTokensTokenParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__CryptoExchange__TokensAssignment_12"


    // $ANTLR start "rule__CryptoExchange__TokensAssignment_13_1"
    // InternalMyDsl.g:5840:1: rule__CryptoExchange__TokensAssignment_13_1 : ( ruleToken ) ;
    public final void rule__CryptoExchange__TokensAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5844:1: ( ( ruleToken ) )
            // InternalMyDsl.g:5845:2: ( ruleToken )
            {
            // InternalMyDsl.g:5845:2: ( ruleToken )
            // InternalMyDsl.g:5846:3: ruleToken
            {
             before(grammarAccess.getCryptoExchangeAccess().getTokensTokenParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleToken();

            state._fsp--;

             after(grammarAccess.getCryptoExchangeAccess().getTokensTokenParserRuleCall_13_1_0()); 

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
    // $ANTLR end "rule__CryptoExchange__TokensAssignment_13_1"


    // $ANTLR start "rule__CryptoExchange__TokenNetworksAssignment_17"
    // InternalMyDsl.g:5855:1: rule__CryptoExchange__TokenNetworksAssignment_17 : ( ruleTokenNetwork ) ;
    public final void rule__CryptoExchange__TokenNetworksAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5859:1: ( ( ruleTokenNetwork ) )
            // InternalMyDsl.g:5860:2: ( ruleTokenNetwork )
            {
            // InternalMyDsl.g:5860:2: ( ruleTokenNetwork )
            // InternalMyDsl.g:5861:3: ruleTokenNetwork
            {
             before(grammarAccess.getCryptoExchangeAccess().getTokenNetworksTokenNetworkParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleTokenNetwork();

            state._fsp--;

             after(grammarAccess.getCryptoExchangeAccess().getTokenNetworksTokenNetworkParserRuleCall_17_0()); 

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
    // $ANTLR end "rule__CryptoExchange__TokenNetworksAssignment_17"


    // $ANTLR start "rule__CryptoExchange__TokenNetworksAssignment_18_1"
    // InternalMyDsl.g:5870:1: rule__CryptoExchange__TokenNetworksAssignment_18_1 : ( ruleTokenNetwork ) ;
    public final void rule__CryptoExchange__TokenNetworksAssignment_18_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5874:1: ( ( ruleTokenNetwork ) )
            // InternalMyDsl.g:5875:2: ( ruleTokenNetwork )
            {
            // InternalMyDsl.g:5875:2: ( ruleTokenNetwork )
            // InternalMyDsl.g:5876:3: ruleTokenNetwork
            {
             before(grammarAccess.getCryptoExchangeAccess().getTokenNetworksTokenNetworkParserRuleCall_18_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTokenNetwork();

            state._fsp--;

             after(grammarAccess.getCryptoExchangeAccess().getTokenNetworksTokenNetworkParserRuleCall_18_1_0()); 

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
    // $ANTLR end "rule__CryptoExchange__TokenNetworksAssignment_18_1"


    // $ANTLR start "rule__SubSystem__NameAssignment_2"
    // InternalMyDsl.g:5885:1: rule__SubSystem__NameAssignment_2 : ( ruleSubSystemName ) ;
    public final void rule__SubSystem__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5889:1: ( ( ruleSubSystemName ) )
            // InternalMyDsl.g:5890:2: ( ruleSubSystemName )
            {
            // InternalMyDsl.g:5890:2: ( ruleSubSystemName )
            // InternalMyDsl.g:5891:3: ruleSubSystemName
            {
             before(grammarAccess.getSubSystemAccess().getNameSubSystemNameEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSubSystemName();

            state._fsp--;

             after(grammarAccess.getSubSystemAccess().getNameSubSystemNameEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__SubSystem__NameAssignment_2"


    // $ANTLR start "rule__SubSystem__AccountsAssignment_4_2"
    // InternalMyDsl.g:5900:1: rule__SubSystem__AccountsAssignment_4_2 : ( ruleAccount ) ;
    public final void rule__SubSystem__AccountsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5904:1: ( ( ruleAccount ) )
            // InternalMyDsl.g:5905:2: ( ruleAccount )
            {
            // InternalMyDsl.g:5905:2: ( ruleAccount )
            // InternalMyDsl.g:5906:3: ruleAccount
            {
             before(grammarAccess.getSubSystemAccess().getAccountsAccountParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAccount();

            state._fsp--;

             after(grammarAccess.getSubSystemAccess().getAccountsAccountParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__SubSystem__AccountsAssignment_4_2"


    // $ANTLR start "rule__SubSystem__AccountsAssignment_4_3_1"
    // InternalMyDsl.g:5915:1: rule__SubSystem__AccountsAssignment_4_3_1 : ( ruleAccount ) ;
    public final void rule__SubSystem__AccountsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5919:1: ( ( ruleAccount ) )
            // InternalMyDsl.g:5920:2: ( ruleAccount )
            {
            // InternalMyDsl.g:5920:2: ( ruleAccount )
            // InternalMyDsl.g:5921:3: ruleAccount
            {
             before(grammarAccess.getSubSystemAccess().getAccountsAccountParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAccount();

            state._fsp--;

             after(grammarAccess.getSubSystemAccess().getAccountsAccountParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__SubSystem__AccountsAssignment_4_3_1"


    // $ANTLR start "rule__SubSystem__TokenPairsAssignment_5_2"
    // InternalMyDsl.g:5930:1: rule__SubSystem__TokenPairsAssignment_5_2 : ( ruleTokenPair ) ;
    public final void rule__SubSystem__TokenPairsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5934:1: ( ( ruleTokenPair ) )
            // InternalMyDsl.g:5935:2: ( ruleTokenPair )
            {
            // InternalMyDsl.g:5935:2: ( ruleTokenPair )
            // InternalMyDsl.g:5936:3: ruleTokenPair
            {
             before(grammarAccess.getSubSystemAccess().getTokenPairsTokenPairParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTokenPair();

            state._fsp--;

             after(grammarAccess.getSubSystemAccess().getTokenPairsTokenPairParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__SubSystem__TokenPairsAssignment_5_2"


    // $ANTLR start "rule__SubSystem__TokenPairsAssignment_5_3_1"
    // InternalMyDsl.g:5945:1: rule__SubSystem__TokenPairsAssignment_5_3_1 : ( ruleTokenPair ) ;
    public final void rule__SubSystem__TokenPairsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5949:1: ( ( ruleTokenPair ) )
            // InternalMyDsl.g:5950:2: ( ruleTokenPair )
            {
            // InternalMyDsl.g:5950:2: ( ruleTokenPair )
            // InternalMyDsl.g:5951:3: ruleTokenPair
            {
             before(grammarAccess.getSubSystemAccess().getTokenPairsTokenPairParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTokenPair();

            state._fsp--;

             after(grammarAccess.getSubSystemAccess().getTokenPairsTokenPairParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__SubSystem__TokenPairsAssignment_5_3_1"


    // $ANTLR start "rule__SubSystem__OrdersAssignment_6_2"
    // InternalMyDsl.g:5960:1: rule__SubSystem__OrdersAssignment_6_2 : ( ruleOrder ) ;
    public final void rule__SubSystem__OrdersAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5964:1: ( ( ruleOrder ) )
            // InternalMyDsl.g:5965:2: ( ruleOrder )
            {
            // InternalMyDsl.g:5965:2: ( ruleOrder )
            // InternalMyDsl.g:5966:3: ruleOrder
            {
             before(grammarAccess.getSubSystemAccess().getOrdersOrderParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrder();

            state._fsp--;

             after(grammarAccess.getSubSystemAccess().getOrdersOrderParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__SubSystem__OrdersAssignment_6_2"


    // $ANTLR start "rule__SubSystem__OrdersAssignment_6_3_1"
    // InternalMyDsl.g:5975:1: rule__SubSystem__OrdersAssignment_6_3_1 : ( ruleOrder ) ;
    public final void rule__SubSystem__OrdersAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5979:1: ( ( ruleOrder ) )
            // InternalMyDsl.g:5980:2: ( ruleOrder )
            {
            // InternalMyDsl.g:5980:2: ( ruleOrder )
            // InternalMyDsl.g:5981:3: ruleOrder
            {
             before(grammarAccess.getSubSystemAccess().getOrdersOrderParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrder();

            state._fsp--;

             after(grammarAccess.getSubSystemAccess().getOrdersOrderParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__SubSystem__OrdersAssignment_6_3_1"


    // $ANTLR start "rule__SubSystem__SavingOrdersAssignment_7_2"
    // InternalMyDsl.g:5990:1: rule__SubSystem__SavingOrdersAssignment_7_2 : ( ruleSavingOrder ) ;
    public final void rule__SubSystem__SavingOrdersAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5994:1: ( ( ruleSavingOrder ) )
            // InternalMyDsl.g:5995:2: ( ruleSavingOrder )
            {
            // InternalMyDsl.g:5995:2: ( ruleSavingOrder )
            // InternalMyDsl.g:5996:3: ruleSavingOrder
            {
             before(grammarAccess.getSubSystemAccess().getSavingOrdersSavingOrderParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSavingOrder();

            state._fsp--;

             after(grammarAccess.getSubSystemAccess().getSavingOrdersSavingOrderParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__SubSystem__SavingOrdersAssignment_7_2"


    // $ANTLR start "rule__SubSystem__SavingOrdersAssignment_7_3_1"
    // InternalMyDsl.g:6005:1: rule__SubSystem__SavingOrdersAssignment_7_3_1 : ( ruleSavingOrder ) ;
    public final void rule__SubSystem__SavingOrdersAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6009:1: ( ( ruleSavingOrder ) )
            // InternalMyDsl.g:6010:2: ( ruleSavingOrder )
            {
            // InternalMyDsl.g:6010:2: ( ruleSavingOrder )
            // InternalMyDsl.g:6011:3: ruleSavingOrder
            {
             before(grammarAccess.getSubSystemAccess().getSavingOrdersSavingOrderParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSavingOrder();

            state._fsp--;

             after(grammarAccess.getSubSystemAccess().getSavingOrdersSavingOrderParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__SubSystem__SavingOrdersAssignment_7_3_1"


    // $ANTLR start "rule__Token__NameAssignment_1"
    // InternalMyDsl.g:6020:1: rule__Token__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Token__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6024:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6025:2: ( ruleEString )
            {
            // InternalMyDsl.g:6025:2: ( ruleEString )
            // InternalMyDsl.g:6026:3: ruleEString
            {
             before(grammarAccess.getTokenAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTokenAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Token__NameAssignment_1"


    // $ANTLR start "rule__Token__AddressAssignment_3_1"
    // InternalMyDsl.g:6035:1: rule__Token__AddressAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Token__AddressAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6039:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6040:2: ( ruleEString )
            {
            // InternalMyDsl.g:6040:2: ( ruleEString )
            // InternalMyDsl.g:6041:3: ruleEString
            {
             before(grammarAccess.getTokenAccess().getAddressEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTokenAccess().getAddressEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Token__AddressAssignment_3_1"


    // $ANTLR start "rule__Token__DecimalAssignment_5"
    // InternalMyDsl.g:6050:1: rule__Token__DecimalAssignment_5 : ( ruleEInt ) ;
    public final void rule__Token__DecimalAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6054:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:6055:2: ( ruleEInt )
            {
            // InternalMyDsl.g:6055:2: ( ruleEInt )
            // InternalMyDsl.g:6056:3: ruleEInt
            {
             before(grammarAccess.getTokenAccess().getDecimalEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTokenAccess().getDecimalEIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Token__DecimalAssignment_5"


    // $ANTLR start "rule__Token__TokenNetworkAssignment_7"
    // InternalMyDsl.g:6065:1: rule__Token__TokenNetworkAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Token__TokenNetworkAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6069:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:6070:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:6070:2: ( ( ruleEString ) )
            // InternalMyDsl.g:6071:3: ( ruleEString )
            {
             before(grammarAccess.getTokenAccess().getTokenNetworkTokenNetworkCrossReference_7_0()); 
            // InternalMyDsl.g:6072:3: ( ruleEString )
            // InternalMyDsl.g:6073:4: ruleEString
            {
             before(grammarAccess.getTokenAccess().getTokenNetworkTokenNetworkEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTokenAccess().getTokenNetworkTokenNetworkEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getTokenAccess().getTokenNetworkTokenNetworkCrossReference_7_0()); 

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
    // $ANTLR end "rule__Token__TokenNetworkAssignment_7"


    // $ANTLR start "rule__TokenNetwork__NameAssignment_1"
    // InternalMyDsl.g:6084:1: rule__TokenNetwork__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TokenNetwork__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6088:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6089:2: ( ruleEString )
            {
            // InternalMyDsl.g:6089:2: ( ruleEString )
            // InternalMyDsl.g:6090:3: ruleEString
            {
             before(grammarAccess.getTokenNetworkAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTokenNetworkAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TokenNetwork__NameAssignment_1"


    // $ANTLR start "rule__TokenNetwork__ChainIDAssignment_4"
    // InternalMyDsl.g:6099:1: rule__TokenNetwork__ChainIDAssignment_4 : ( ruleEInt ) ;
    public final void rule__TokenNetwork__ChainIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6103:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:6104:2: ( ruleEInt )
            {
            // InternalMyDsl.g:6104:2: ( ruleEInt )
            // InternalMyDsl.g:6105:3: ruleEInt
            {
             before(grammarAccess.getTokenNetworkAccess().getChainIDEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTokenNetworkAccess().getChainIDEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__TokenNetwork__ChainIDAssignment_4"


    // $ANTLR start "rule__TokenNetwork__RPCAssignment_5_1"
    // InternalMyDsl.g:6114:1: rule__TokenNetwork__RPCAssignment_5_1 : ( ruleEString ) ;
    public final void rule__TokenNetwork__RPCAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6118:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6119:2: ( ruleEString )
            {
            // InternalMyDsl.g:6119:2: ( ruleEString )
            // InternalMyDsl.g:6120:3: ruleEString
            {
             before(grammarAccess.getTokenNetworkAccess().getRPCEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTokenNetworkAccess().getRPCEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__TokenNetwork__RPCAssignment_5_1"


    // $ANTLR start "rule__Account__TokensBalanceAssignment_3_2"
    // InternalMyDsl.g:6129:1: rule__Account__TokensBalanceAssignment_3_2 : ( ruleTokenBalance ) ;
    public final void rule__Account__TokensBalanceAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6133:1: ( ( ruleTokenBalance ) )
            // InternalMyDsl.g:6134:2: ( ruleTokenBalance )
            {
            // InternalMyDsl.g:6134:2: ( ruleTokenBalance )
            // InternalMyDsl.g:6135:3: ruleTokenBalance
            {
             before(grammarAccess.getAccountAccess().getTokensBalanceTokenBalanceParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTokenBalance();

            state._fsp--;

             after(grammarAccess.getAccountAccess().getTokensBalanceTokenBalanceParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Account__TokensBalanceAssignment_3_2"


    // $ANTLR start "rule__Account__TokensBalanceAssignment_3_3_1"
    // InternalMyDsl.g:6144:1: rule__Account__TokensBalanceAssignment_3_3_1 : ( ruleTokenBalance ) ;
    public final void rule__Account__TokensBalanceAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6148:1: ( ( ruleTokenBalance ) )
            // InternalMyDsl.g:6149:2: ( ruleTokenBalance )
            {
            // InternalMyDsl.g:6149:2: ( ruleTokenBalance )
            // InternalMyDsl.g:6150:3: ruleTokenBalance
            {
             before(grammarAccess.getAccountAccess().getTokensBalanceTokenBalanceParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTokenBalance();

            state._fsp--;

             after(grammarAccess.getAccountAccess().getTokensBalanceTokenBalanceParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__Account__TokensBalanceAssignment_3_3_1"


    // $ANTLR start "rule__Account__TransferRequestAssignment_4_2"
    // InternalMyDsl.g:6159:1: rule__Account__TransferRequestAssignment_4_2 : ( ruleTransferRequest ) ;
    public final void rule__Account__TransferRequestAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6163:1: ( ( ruleTransferRequest ) )
            // InternalMyDsl.g:6164:2: ( ruleTransferRequest )
            {
            // InternalMyDsl.g:6164:2: ( ruleTransferRequest )
            // InternalMyDsl.g:6165:3: ruleTransferRequest
            {
             before(grammarAccess.getAccountAccess().getTransferRequestTransferRequestParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransferRequest();

            state._fsp--;

             after(grammarAccess.getAccountAccess().getTransferRequestTransferRequestParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Account__TransferRequestAssignment_4_2"


    // $ANTLR start "rule__Account__TransferRequestAssignment_4_3_1"
    // InternalMyDsl.g:6174:1: rule__Account__TransferRequestAssignment_4_3_1 : ( ruleTransferRequest ) ;
    public final void rule__Account__TransferRequestAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6178:1: ( ( ruleTransferRequest ) )
            // InternalMyDsl.g:6179:2: ( ruleTransferRequest )
            {
            // InternalMyDsl.g:6179:2: ( ruleTransferRequest )
            // InternalMyDsl.g:6180:3: ruleTransferRequest
            {
             before(grammarAccess.getAccountAccess().getTransferRequestTransferRequestParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransferRequest();

            state._fsp--;

             after(grammarAccess.getAccountAccess().getTransferRequestTransferRequestParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Account__TransferRequestAssignment_4_3_1"


    // $ANTLR start "rule__TokenPair__PriceAssignment_3"
    // InternalMyDsl.g:6189:1: rule__TokenPair__PriceAssignment_3 : ( ruleEFloat ) ;
    public final void rule__TokenPair__PriceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6193:1: ( ( ruleEFloat ) )
            // InternalMyDsl.g:6194:2: ( ruleEFloat )
            {
            // InternalMyDsl.g:6194:2: ( ruleEFloat )
            // InternalMyDsl.g:6195:3: ruleEFloat
            {
             before(grammarAccess.getTokenPairAccess().getPriceEFloatParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getTokenPairAccess().getPriceEFloatParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__TokenPair__PriceAssignment_3"


    // $ANTLR start "rule__TokenPair__TokenAAssignment_5"
    // InternalMyDsl.g:6204:1: rule__TokenPair__TokenAAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__TokenPair__TokenAAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6208:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:6209:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:6209:2: ( ( ruleEString ) )
            // InternalMyDsl.g:6210:3: ( ruleEString )
            {
             before(grammarAccess.getTokenPairAccess().getTokenATokenCrossReference_5_0()); 
            // InternalMyDsl.g:6211:3: ( ruleEString )
            // InternalMyDsl.g:6212:4: ruleEString
            {
             before(grammarAccess.getTokenPairAccess().getTokenATokenEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTokenPairAccess().getTokenATokenEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTokenPairAccess().getTokenATokenCrossReference_5_0()); 

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
    // $ANTLR end "rule__TokenPair__TokenAAssignment_5"


    // $ANTLR start "rule__TokenPair__TokenBAssignment_7"
    // InternalMyDsl.g:6223:1: rule__TokenPair__TokenBAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__TokenPair__TokenBAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6227:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:6228:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:6228:2: ( ( ruleEString ) )
            // InternalMyDsl.g:6229:3: ( ruleEString )
            {
             before(grammarAccess.getTokenPairAccess().getTokenBTokenCrossReference_7_0()); 
            // InternalMyDsl.g:6230:3: ( ruleEString )
            // InternalMyDsl.g:6231:4: ruleEString
            {
             before(grammarAccess.getTokenPairAccess().getTokenBTokenEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTokenPairAccess().getTokenBTokenEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getTokenPairAccess().getTokenBTokenCrossReference_7_0()); 

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
    // $ANTLR end "rule__TokenPair__TokenBAssignment_7"


    // $ANTLR start "rule__Order__PriceAssignment_3"
    // InternalMyDsl.g:6242:1: rule__Order__PriceAssignment_3 : ( ruleEFloat ) ;
    public final void rule__Order__PriceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6246:1: ( ( ruleEFloat ) )
            // InternalMyDsl.g:6247:2: ( ruleEFloat )
            {
            // InternalMyDsl.g:6247:2: ( ruleEFloat )
            // InternalMyDsl.g:6248:3: ruleEFloat
            {
             before(grammarAccess.getOrderAccess().getPriceEFloatParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getOrderAccess().getPriceEFloatParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Order__PriceAssignment_3"


    // $ANTLR start "rule__Order__AmountAssignment_5"
    // InternalMyDsl.g:6257:1: rule__Order__AmountAssignment_5 : ( ruleEFloat ) ;
    public final void rule__Order__AmountAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6261:1: ( ( ruleEFloat ) )
            // InternalMyDsl.g:6262:2: ( ruleEFloat )
            {
            // InternalMyDsl.g:6262:2: ( ruleEFloat )
            // InternalMyDsl.g:6263:3: ruleEFloat
            {
             before(grammarAccess.getOrderAccess().getAmountEFloatParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getOrderAccess().getAmountEFloatParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Order__AmountAssignment_5"


    // $ANTLR start "rule__Order__LeverageAssignment_6_1"
    // InternalMyDsl.g:6272:1: rule__Order__LeverageAssignment_6_1 : ( ruleLeverageType ) ;
    public final void rule__Order__LeverageAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6276:1: ( ( ruleLeverageType ) )
            // InternalMyDsl.g:6277:2: ( ruleLeverageType )
            {
            // InternalMyDsl.g:6277:2: ( ruleLeverageType )
            // InternalMyDsl.g:6278:3: ruleLeverageType
            {
             before(grammarAccess.getOrderAccess().getLeverageLeverageTypeEnumRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLeverageType();

            state._fsp--;

             after(grammarAccess.getOrderAccess().getLeverageLeverageTypeEnumRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Order__LeverageAssignment_6_1"


    // $ANTLR start "rule__Order__TypeAssignment_7_1"
    // InternalMyDsl.g:6287:1: rule__Order__TypeAssignment_7_1 : ( ruleOrderType ) ;
    public final void rule__Order__TypeAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6291:1: ( ( ruleOrderType ) )
            // InternalMyDsl.g:6292:2: ( ruleOrderType )
            {
            // InternalMyDsl.g:6292:2: ( ruleOrderType )
            // InternalMyDsl.g:6293:3: ruleOrderType
            {
             before(grammarAccess.getOrderAccess().getTypeOrderTypeEnumRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderType();

            state._fsp--;

             after(grammarAccess.getOrderAccess().getTypeOrderTypeEnumRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Order__TypeAssignment_7_1"


    // $ANTLR start "rule__Order__AccountAssignment_9"
    // InternalMyDsl.g:6302:1: rule__Order__AccountAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__Order__AccountAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6306:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:6307:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:6307:2: ( ( ruleEString ) )
            // InternalMyDsl.g:6308:3: ( ruleEString )
            {
             before(grammarAccess.getOrderAccess().getAccountAccountCrossReference_9_0()); 
            // InternalMyDsl.g:6309:3: ( ruleEString )
            // InternalMyDsl.g:6310:4: ruleEString
            {
             before(grammarAccess.getOrderAccess().getAccountAccountEStringParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOrderAccess().getAccountAccountEStringParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getOrderAccess().getAccountAccountCrossReference_9_0()); 

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
    // $ANTLR end "rule__Order__AccountAssignment_9"


    // $ANTLR start "rule__Order__TokenPairAssignment_11"
    // InternalMyDsl.g:6321:1: rule__Order__TokenPairAssignment_11 : ( ( ruleEString ) ) ;
    public final void rule__Order__TokenPairAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6325:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:6326:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:6326:2: ( ( ruleEString ) )
            // InternalMyDsl.g:6327:3: ( ruleEString )
            {
             before(grammarAccess.getOrderAccess().getTokenPairTokenPairCrossReference_11_0()); 
            // InternalMyDsl.g:6328:3: ( ruleEString )
            // InternalMyDsl.g:6329:4: ruleEString
            {
             before(grammarAccess.getOrderAccess().getTokenPairTokenPairEStringParserRuleCall_11_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOrderAccess().getTokenPairTokenPairEStringParserRuleCall_11_0_1()); 

            }

             after(grammarAccess.getOrderAccess().getTokenPairTokenPairCrossReference_11_0()); 

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
    // $ANTLR end "rule__Order__TokenPairAssignment_11"


    // $ANTLR start "rule__SavingOrder__NameAssignment_1"
    // InternalMyDsl.g:6340:1: rule__SavingOrder__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SavingOrder__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6344:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6345:2: ( ruleEString )
            {
            // InternalMyDsl.g:6345:2: ( ruleEString )
            // InternalMyDsl.g:6346:3: ruleEString
            {
             before(grammarAccess.getSavingOrderAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSavingOrderAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SavingOrder__NameAssignment_1"


    // $ANTLR start "rule__SavingOrder__AmountAssignment_4"
    // InternalMyDsl.g:6355:1: rule__SavingOrder__AmountAssignment_4 : ( ruleEFloat ) ;
    public final void rule__SavingOrder__AmountAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6359:1: ( ( ruleEFloat ) )
            // InternalMyDsl.g:6360:2: ( ruleEFloat )
            {
            // InternalMyDsl.g:6360:2: ( ruleEFloat )
            // InternalMyDsl.g:6361:3: ruleEFloat
            {
             before(grammarAccess.getSavingOrderAccess().getAmountEFloatParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getSavingOrderAccess().getAmountEFloatParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__SavingOrder__AmountAssignment_4"


    // $ANTLR start "rule__SavingOrder__MatureDateAssignment_5_1"
    // InternalMyDsl.g:6370:1: rule__SavingOrder__MatureDateAssignment_5_1 : ( ruleEDate ) ;
    public final void rule__SavingOrder__MatureDateAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6374:1: ( ( ruleEDate ) )
            // InternalMyDsl.g:6375:2: ( ruleEDate )
            {
            // InternalMyDsl.g:6375:2: ( ruleEDate )
            // InternalMyDsl.g:6376:3: ruleEDate
            {
             before(grammarAccess.getSavingOrderAccess().getMatureDateEDateParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getSavingOrderAccess().getMatureDateEDateParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__SavingOrder__MatureDateAssignment_5_1"


    // $ANTLR start "rule__SavingOrder__InterestAssignment_7"
    // InternalMyDsl.g:6385:1: rule__SavingOrder__InterestAssignment_7 : ( ruleEDouble ) ;
    public final void rule__SavingOrder__InterestAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6389:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:6390:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:6390:2: ( ruleEDouble )
            // InternalMyDsl.g:6391:3: ruleEDouble
            {
             before(grammarAccess.getSavingOrderAccess().getInterestEDoubleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getSavingOrderAccess().getInterestEDoubleParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__SavingOrder__InterestAssignment_7"


    // $ANTLR start "rule__SavingOrder__AccountAssignment_9"
    // InternalMyDsl.g:6400:1: rule__SavingOrder__AccountAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__SavingOrder__AccountAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6404:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:6405:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:6405:2: ( ( ruleEString ) )
            // InternalMyDsl.g:6406:3: ( ruleEString )
            {
             before(grammarAccess.getSavingOrderAccess().getAccountAccountCrossReference_9_0()); 
            // InternalMyDsl.g:6407:3: ( ruleEString )
            // InternalMyDsl.g:6408:4: ruleEString
            {
             before(grammarAccess.getSavingOrderAccess().getAccountAccountEStringParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSavingOrderAccess().getAccountAccountEStringParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getSavingOrderAccess().getAccountAccountCrossReference_9_0()); 

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
    // $ANTLR end "rule__SavingOrder__AccountAssignment_9"


    // $ANTLR start "rule__SavingOrder__TokenAssignment_11"
    // InternalMyDsl.g:6419:1: rule__SavingOrder__TokenAssignment_11 : ( ( ruleEString ) ) ;
    public final void rule__SavingOrder__TokenAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6423:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:6424:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:6424:2: ( ( ruleEString ) )
            // InternalMyDsl.g:6425:3: ( ruleEString )
            {
             before(grammarAccess.getSavingOrderAccess().getTokenTokenCrossReference_11_0()); 
            // InternalMyDsl.g:6426:3: ( ruleEString )
            // InternalMyDsl.g:6427:4: ruleEString
            {
             before(grammarAccess.getSavingOrderAccess().getTokenTokenEStringParserRuleCall_11_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSavingOrderAccess().getTokenTokenEStringParserRuleCall_11_0_1()); 

            }

             after(grammarAccess.getSavingOrderAccess().getTokenTokenCrossReference_11_0()); 

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
    // $ANTLR end "rule__SavingOrder__TokenAssignment_11"


    // $ANTLR start "rule__TokenBalance__NameAssignment_1"
    // InternalMyDsl.g:6438:1: rule__TokenBalance__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TokenBalance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6442:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6443:2: ( ruleEString )
            {
            // InternalMyDsl.g:6443:2: ( ruleEString )
            // InternalMyDsl.g:6444:3: ruleEString
            {
             before(grammarAccess.getTokenBalanceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTokenBalanceAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TokenBalance__NameAssignment_1"


    // $ANTLR start "rule__TokenBalance__BalanceAssignment_4"
    // InternalMyDsl.g:6453:1: rule__TokenBalance__BalanceAssignment_4 : ( ruleEFloat ) ;
    public final void rule__TokenBalance__BalanceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6457:1: ( ( ruleEFloat ) )
            // InternalMyDsl.g:6458:2: ( ruleEFloat )
            {
            // InternalMyDsl.g:6458:2: ( ruleEFloat )
            // InternalMyDsl.g:6459:3: ruleEFloat
            {
             before(grammarAccess.getTokenBalanceAccess().getBalanceEFloatParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getTokenBalanceAccess().getBalanceEFloatParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__TokenBalance__BalanceAssignment_4"


    // $ANTLR start "rule__TokenBalance__TokenAssignment_6"
    // InternalMyDsl.g:6468:1: rule__TokenBalance__TokenAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__TokenBalance__TokenAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6472:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:6473:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:6473:2: ( ( ruleEString ) )
            // InternalMyDsl.g:6474:3: ( ruleEString )
            {
             before(grammarAccess.getTokenBalanceAccess().getTokenTokenCrossReference_6_0()); 
            // InternalMyDsl.g:6475:3: ( ruleEString )
            // InternalMyDsl.g:6476:4: ruleEString
            {
             before(grammarAccess.getTokenBalanceAccess().getTokenTokenEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTokenBalanceAccess().getTokenTokenEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getTokenBalanceAccess().getTokenTokenCrossReference_6_0()); 

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
    // $ANTLR end "rule__TokenBalance__TokenAssignment_6"


    // $ANTLR start "rule__TransferRequest__IDAssignment_1"
    // InternalMyDsl.g:6487:1: rule__TransferRequest__IDAssignment_1 : ( ruleEString ) ;
    public final void rule__TransferRequest__IDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6491:1: ( ( ruleEString ) )
            // InternalMyDsl.g:6492:2: ( ruleEString )
            {
            // InternalMyDsl.g:6492:2: ( ruleEString )
            // InternalMyDsl.g:6493:3: ruleEString
            {
             before(grammarAccess.getTransferRequestAccess().getIDEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransferRequestAccess().getIDEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TransferRequest__IDAssignment_1"


    // $ANTLR start "rule__TransferRequest__TypeAssignment_3_1"
    // InternalMyDsl.g:6502:1: rule__TransferRequest__TypeAssignment_3_1 : ( ruleTransferType ) ;
    public final void rule__TransferRequest__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6506:1: ( ( ruleTransferType ) )
            // InternalMyDsl.g:6507:2: ( ruleTransferType )
            {
            // InternalMyDsl.g:6507:2: ( ruleTransferType )
            // InternalMyDsl.g:6508:3: ruleTransferType
            {
             before(grammarAccess.getTransferRequestAccess().getTypeTransferTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransferType();

            state._fsp--;

             after(grammarAccess.getTransferRequestAccess().getTypeTransferTypeEnumRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__TransferRequest__TypeAssignment_3_1"


    // $ANTLR start "rule__TransferRequest__AmountAssignment_5"
    // InternalMyDsl.g:6517:1: rule__TransferRequest__AmountAssignment_5 : ( ruleEFloat ) ;
    public final void rule__TransferRequest__AmountAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6521:1: ( ( ruleEFloat ) )
            // InternalMyDsl.g:6522:2: ( ruleEFloat )
            {
            // InternalMyDsl.g:6522:2: ( ruleEFloat )
            // InternalMyDsl.g:6523:3: ruleEFloat
            {
             before(grammarAccess.getTransferRequestAccess().getAmountEFloatParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getTransferRequestAccess().getAmountEFloatParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__TransferRequest__AmountAssignment_5"


    // $ANTLR start "rule__TransferRequest__TokenAssignment_7"
    // InternalMyDsl.g:6532:1: rule__TransferRequest__TokenAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__TransferRequest__TokenAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6536:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:6537:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:6537:2: ( ( ruleEString ) )
            // InternalMyDsl.g:6538:3: ( ruleEString )
            {
             before(grammarAccess.getTransferRequestAccess().getTokenTokenCrossReference_7_0()); 
            // InternalMyDsl.g:6539:3: ( ruleEString )
            // InternalMyDsl.g:6540:4: ruleEString
            {
             before(grammarAccess.getTransferRequestAccess().getTokenTokenEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransferRequestAccess().getTokenTokenEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getTransferRequestAccess().getTokenTokenCrossReference_7_0()); 

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
    // $ANTLR end "rule__TransferRequest__TokenAssignment_7"


    // $ANTLR start "rule__TransferRequest__DestinationAssignment_9"
    // InternalMyDsl.g:6551:1: rule__TransferRequest__DestinationAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__TransferRequest__DestinationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:6555:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:6556:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:6556:2: ( ( ruleEString ) )
            // InternalMyDsl.g:6557:3: ( ruleEString )
            {
             before(grammarAccess.getTransferRequestAccess().getDestinationAccountCrossReference_9_0()); 
            // InternalMyDsl.g:6558:3: ( ruleEString )
            // InternalMyDsl.g:6559:4: ruleEString
            {
             before(grammarAccess.getTransferRequestAccess().getDestinationAccountEStringParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransferRequestAccess().getDestinationAccountEStringParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getTransferRequestAccess().getDestinationAccountCrossReference_9_0()); 

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
    // $ANTLR end "rule__TransferRequest__DestinationAssignment_9"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000C40000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000001E080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000140000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0003000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000060L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0E00000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000003000L});

}