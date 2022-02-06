package org.xtext.example.mydsl.parser.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'cryptoExchange'", "'{'", "'IP'", "'DomainName'", "'SubSystem'", "','", "'}'", "'Tokens'", "'TokenNetworks'", "'accounts'", "'TokenPairs'", "'Orders'", "'SavingOrders'", "'Token'", "'address'", "'decimal'", "'TokenNetwork'", "'chainID'", "'RPC'", "'Account'", "'TokensBalance'", "'transferRequest'", "'TokenPair'", "'price'", "'TokenA'", "'TokenB'", "'Order'", "'Price'", "'Amount'", "'leverage'", "'Type'", "'account'", "'SavingOrder'", "'MatureDate'", "'Interest'", "'TokenBalance'", "'balance'", "'TransferRequest'", "'type'", "'amount'", "'Destination'", "'-'", "'.'", "'E'", "'e'", "'EDate'", "'Spot'", "'Future'", "'Margin'", "'Saving'", "'IntraExchange'", "'ExtraExchange'", "'_1x'", "'_2x'", "'_5x'", "'_10x'", "'buy'", "'sell'", "'leverageLong'", "'leverageShort'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "cryptoExchange";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulecryptoExchange"
    // InternalMyDsl.g:65:1: entryRulecryptoExchange returns [EObject current=null] : iv_rulecryptoExchange= rulecryptoExchange EOF ;
    public final EObject entryRulecryptoExchange() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecryptoExchange = null;


        try {
            // InternalMyDsl.g:65:55: (iv_rulecryptoExchange= rulecryptoExchange EOF )
            // InternalMyDsl.g:66:2: iv_rulecryptoExchange= rulecryptoExchange EOF
            {
             newCompositeNode(grammarAccess.getCryptoExchangeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecryptoExchange=rulecryptoExchange();

            state._fsp--;

             current =iv_rulecryptoExchange; 
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
    // $ANTLR end "entryRulecryptoExchange"


    // $ANTLR start "rulecryptoExchange"
    // InternalMyDsl.g:72:1: rulecryptoExchange returns [EObject current=null] : (otherlv_0= 'cryptoExchange' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'IP' ( (lv_IP_4_0= ruleEString ) ) )? (otherlv_5= 'DomainName' ( (lv_DomainName_6_0= ruleEString ) ) )? otherlv_7= 'SubSystem' otherlv_8= '{' ( (lv_SubSystem_9_0= ruleSubSystem ) ) (otherlv_10= ',' ( (lv_SubSystem_11_0= ruleSubSystem ) ) )* otherlv_12= '}' otherlv_13= 'Tokens' otherlv_14= '{' ( (lv_Tokens_15_0= ruleToken ) ) (otherlv_16= ',' ( (lv_Tokens_17_0= ruleToken ) ) )* otherlv_18= '}' otherlv_19= 'TokenNetworks' otherlv_20= '{' ( (lv_TokenNetworks_21_0= ruleTokenNetwork ) ) (otherlv_22= ',' ( (lv_TokenNetworks_23_0= ruleTokenNetwork ) ) )* otherlv_24= '}' otherlv_25= '}' ) ;
    public final EObject rulecryptoExchange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_IP_4_0 = null;

        AntlrDatatypeRuleToken lv_DomainName_6_0 = null;

        EObject lv_SubSystem_9_0 = null;

        EObject lv_SubSystem_11_0 = null;

        EObject lv_Tokens_15_0 = null;

        EObject lv_Tokens_17_0 = null;

        EObject lv_TokenNetworks_21_0 = null;

        EObject lv_TokenNetworks_23_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (otherlv_0= 'cryptoExchange' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'IP' ( (lv_IP_4_0= ruleEString ) ) )? (otherlv_5= 'DomainName' ( (lv_DomainName_6_0= ruleEString ) ) )? otherlv_7= 'SubSystem' otherlv_8= '{' ( (lv_SubSystem_9_0= ruleSubSystem ) ) (otherlv_10= ',' ( (lv_SubSystem_11_0= ruleSubSystem ) ) )* otherlv_12= '}' otherlv_13= 'Tokens' otherlv_14= '{' ( (lv_Tokens_15_0= ruleToken ) ) (otherlv_16= ',' ( (lv_Tokens_17_0= ruleToken ) ) )* otherlv_18= '}' otherlv_19= 'TokenNetworks' otherlv_20= '{' ( (lv_TokenNetworks_21_0= ruleTokenNetwork ) ) (otherlv_22= ',' ( (lv_TokenNetworks_23_0= ruleTokenNetwork ) ) )* otherlv_24= '}' otherlv_25= '}' ) )
            // InternalMyDsl.g:79:2: (otherlv_0= 'cryptoExchange' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'IP' ( (lv_IP_4_0= ruleEString ) ) )? (otherlv_5= 'DomainName' ( (lv_DomainName_6_0= ruleEString ) ) )? otherlv_7= 'SubSystem' otherlv_8= '{' ( (lv_SubSystem_9_0= ruleSubSystem ) ) (otherlv_10= ',' ( (lv_SubSystem_11_0= ruleSubSystem ) ) )* otherlv_12= '}' otherlv_13= 'Tokens' otherlv_14= '{' ( (lv_Tokens_15_0= ruleToken ) ) (otherlv_16= ',' ( (lv_Tokens_17_0= ruleToken ) ) )* otherlv_18= '}' otherlv_19= 'TokenNetworks' otherlv_20= '{' ( (lv_TokenNetworks_21_0= ruleTokenNetwork ) ) (otherlv_22= ',' ( (lv_TokenNetworks_23_0= ruleTokenNetwork ) ) )* otherlv_24= '}' otherlv_25= '}' )
            {
            // InternalMyDsl.g:79:2: (otherlv_0= 'cryptoExchange' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'IP' ( (lv_IP_4_0= ruleEString ) ) )? (otherlv_5= 'DomainName' ( (lv_DomainName_6_0= ruleEString ) ) )? otherlv_7= 'SubSystem' otherlv_8= '{' ( (lv_SubSystem_9_0= ruleSubSystem ) ) (otherlv_10= ',' ( (lv_SubSystem_11_0= ruleSubSystem ) ) )* otherlv_12= '}' otherlv_13= 'Tokens' otherlv_14= '{' ( (lv_Tokens_15_0= ruleToken ) ) (otherlv_16= ',' ( (lv_Tokens_17_0= ruleToken ) ) )* otherlv_18= '}' otherlv_19= 'TokenNetworks' otherlv_20= '{' ( (lv_TokenNetworks_21_0= ruleTokenNetwork ) ) (otherlv_22= ',' ( (lv_TokenNetworks_23_0= ruleTokenNetwork ) ) )* otherlv_24= '}' otherlv_25= '}' )
            // InternalMyDsl.g:80:3: otherlv_0= 'cryptoExchange' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'IP' ( (lv_IP_4_0= ruleEString ) ) )? (otherlv_5= 'DomainName' ( (lv_DomainName_6_0= ruleEString ) ) )? otherlv_7= 'SubSystem' otherlv_8= '{' ( (lv_SubSystem_9_0= ruleSubSystem ) ) (otherlv_10= ',' ( (lv_SubSystem_11_0= ruleSubSystem ) ) )* otherlv_12= '}' otherlv_13= 'Tokens' otherlv_14= '{' ( (lv_Tokens_15_0= ruleToken ) ) (otherlv_16= ',' ( (lv_Tokens_17_0= ruleToken ) ) )* otherlv_18= '}' otherlv_19= 'TokenNetworks' otherlv_20= '{' ( (lv_TokenNetworks_21_0= ruleTokenNetwork ) ) (otherlv_22= ',' ( (lv_TokenNetworks_23_0= ruleTokenNetwork ) ) )* otherlv_24= '}' otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCryptoExchangeAccess().getCryptoExchangeKeyword_0());
            		
            // InternalMyDsl.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:85:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCryptoExchangeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCryptoExchangeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCryptoExchangeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:107:3: (otherlv_3= 'IP' ( (lv_IP_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:108:4: otherlv_3= 'IP' ( (lv_IP_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCryptoExchangeAccess().getIPKeyword_3_0());
                    			
                    // InternalMyDsl.g:112:4: ( (lv_IP_4_0= ruleEString ) )
                    // InternalMyDsl.g:113:5: (lv_IP_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:113:5: (lv_IP_4_0= ruleEString )
                    // InternalMyDsl.g:114:6: lv_IP_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCryptoExchangeAccess().getIPEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_IP_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCryptoExchangeRule());
                    						}
                    						set(
                    							current,
                    							"IP",
                    							lv_IP_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:132:3: (otherlv_5= 'DomainName' ( (lv_DomainName_6_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:133:4: otherlv_5= 'DomainName' ( (lv_DomainName_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getCryptoExchangeAccess().getDomainNameKeyword_4_0());
                    			
                    // InternalMyDsl.g:137:4: ( (lv_DomainName_6_0= ruleEString ) )
                    // InternalMyDsl.g:138:5: (lv_DomainName_6_0= ruleEString )
                    {
                    // InternalMyDsl.g:138:5: (lv_DomainName_6_0= ruleEString )
                    // InternalMyDsl.g:139:6: lv_DomainName_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCryptoExchangeAccess().getDomainNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_DomainName_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCryptoExchangeRule());
                    						}
                    						set(
                    							current,
                    							"DomainName",
                    							lv_DomainName_6_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getCryptoExchangeAccess().getSubSystemKeyword_5());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getCryptoExchangeAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMyDsl.g:165:3: ( (lv_SubSystem_9_0= ruleSubSystem ) )
            // InternalMyDsl.g:166:4: (lv_SubSystem_9_0= ruleSubSystem )
            {
            // InternalMyDsl.g:166:4: (lv_SubSystem_9_0= ruleSubSystem )
            // InternalMyDsl.g:167:5: lv_SubSystem_9_0= ruleSubSystem
            {

            					newCompositeNode(grammarAccess.getCryptoExchangeAccess().getSubSystemSubSystemParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_SubSystem_9_0=ruleSubSystem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCryptoExchangeRule());
            					}
            					add(
            						current,
            						"SubSystem",
            						lv_SubSystem_9_0,
            						"org.xtext.example.mydsl.MyDsl.SubSystem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:184:3: (otherlv_10= ',' ( (lv_SubSystem_11_0= ruleSubSystem ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:185:4: otherlv_10= ',' ( (lv_SubSystem_11_0= ruleSubSystem ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_7); 

            	    				newLeafNode(otherlv_10, grammarAccess.getCryptoExchangeAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalMyDsl.g:189:4: ( (lv_SubSystem_11_0= ruleSubSystem ) )
            	    // InternalMyDsl.g:190:5: (lv_SubSystem_11_0= ruleSubSystem )
            	    {
            	    // InternalMyDsl.g:190:5: (lv_SubSystem_11_0= ruleSubSystem )
            	    // InternalMyDsl.g:191:6: lv_SubSystem_11_0= ruleSubSystem
            	    {

            	    						newCompositeNode(grammarAccess.getCryptoExchangeAccess().getSubSystemSubSystemParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_SubSystem_11_0=ruleSubSystem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCryptoExchangeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"SubSystem",
            	    							lv_SubSystem_11_0,
            	    							"org.xtext.example.mydsl.MyDsl.SubSystem");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_12=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_12, grammarAccess.getCryptoExchangeAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_13=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getCryptoExchangeAccess().getTokensKeyword_10());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_14, grammarAccess.getCryptoExchangeAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalMyDsl.g:221:3: ( (lv_Tokens_15_0= ruleToken ) )
            // InternalMyDsl.g:222:4: (lv_Tokens_15_0= ruleToken )
            {
            // InternalMyDsl.g:222:4: (lv_Tokens_15_0= ruleToken )
            // InternalMyDsl.g:223:5: lv_Tokens_15_0= ruleToken
            {

            					newCompositeNode(grammarAccess.getCryptoExchangeAccess().getTokensTokenParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_8);
            lv_Tokens_15_0=ruleToken();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCryptoExchangeRule());
            					}
            					add(
            						current,
            						"Tokens",
            						lv_Tokens_15_0,
            						"org.xtext.example.mydsl.MyDsl.Token");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:240:3: (otherlv_16= ',' ( (lv_Tokens_17_0= ruleToken ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:241:4: otherlv_16= ',' ( (lv_Tokens_17_0= ruleToken ) )
            	    {
            	    otherlv_16=(Token)match(input,16,FOLLOW_10); 

            	    				newLeafNode(otherlv_16, grammarAccess.getCryptoExchangeAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalMyDsl.g:245:4: ( (lv_Tokens_17_0= ruleToken ) )
            	    // InternalMyDsl.g:246:5: (lv_Tokens_17_0= ruleToken )
            	    {
            	    // InternalMyDsl.g:246:5: (lv_Tokens_17_0= ruleToken )
            	    // InternalMyDsl.g:247:6: lv_Tokens_17_0= ruleToken
            	    {

            	    						newCompositeNode(grammarAccess.getCryptoExchangeAccess().getTokensTokenParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_Tokens_17_0=ruleToken();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCryptoExchangeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"Tokens",
            	    							lv_Tokens_17_0,
            	    							"org.xtext.example.mydsl.MyDsl.Token");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_18=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_18, grammarAccess.getCryptoExchangeAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_19=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_19, grammarAccess.getCryptoExchangeAccess().getTokenNetworksKeyword_15());
            		
            otherlv_20=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_20, grammarAccess.getCryptoExchangeAccess().getLeftCurlyBracketKeyword_16());
            		
            // InternalMyDsl.g:277:3: ( (lv_TokenNetworks_21_0= ruleTokenNetwork ) )
            // InternalMyDsl.g:278:4: (lv_TokenNetworks_21_0= ruleTokenNetwork )
            {
            // InternalMyDsl.g:278:4: (lv_TokenNetworks_21_0= ruleTokenNetwork )
            // InternalMyDsl.g:279:5: lv_TokenNetworks_21_0= ruleTokenNetwork
            {

            					newCompositeNode(grammarAccess.getCryptoExchangeAccess().getTokenNetworksTokenNetworkParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_8);
            lv_TokenNetworks_21_0=ruleTokenNetwork();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCryptoExchangeRule());
            					}
            					add(
            						current,
            						"TokenNetworks",
            						lv_TokenNetworks_21_0,
            						"org.xtext.example.mydsl.MyDsl.TokenNetwork");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:296:3: (otherlv_22= ',' ( (lv_TokenNetworks_23_0= ruleTokenNetwork ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:297:4: otherlv_22= ',' ( (lv_TokenNetworks_23_0= ruleTokenNetwork ) )
            	    {
            	    otherlv_22=(Token)match(input,16,FOLLOW_12); 

            	    				newLeafNode(otherlv_22, grammarAccess.getCryptoExchangeAccess().getCommaKeyword_18_0());
            	    			
            	    // InternalMyDsl.g:301:4: ( (lv_TokenNetworks_23_0= ruleTokenNetwork ) )
            	    // InternalMyDsl.g:302:5: (lv_TokenNetworks_23_0= ruleTokenNetwork )
            	    {
            	    // InternalMyDsl.g:302:5: (lv_TokenNetworks_23_0= ruleTokenNetwork )
            	    // InternalMyDsl.g:303:6: lv_TokenNetworks_23_0= ruleTokenNetwork
            	    {

            	    						newCompositeNode(grammarAccess.getCryptoExchangeAccess().getTokenNetworksTokenNetworkParserRuleCall_18_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_TokenNetworks_23_0=ruleTokenNetwork();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCryptoExchangeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"TokenNetworks",
            	    							lv_TokenNetworks_23_0,
            	    							"org.xtext.example.mydsl.MyDsl.TokenNetwork");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_24=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_24, grammarAccess.getCryptoExchangeAccess().getRightCurlyBracketKeyword_19());
            		
            otherlv_25=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getCryptoExchangeAccess().getRightCurlyBracketKeyword_20());
            		

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
    // $ANTLR end "rulecryptoExchange"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:333:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:333:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:334:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:340:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:346:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:347:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:347:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:348:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:356:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSubSystem"
    // InternalMyDsl.g:367:1: entryRuleSubSystem returns [EObject current=null] : iv_ruleSubSystem= ruleSubSystem EOF ;
    public final EObject entryRuleSubSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubSystem = null;


        try {
            // InternalMyDsl.g:367:50: (iv_ruleSubSystem= ruleSubSystem EOF )
            // InternalMyDsl.g:368:2: iv_ruleSubSystem= ruleSubSystem EOF
            {
             newCompositeNode(grammarAccess.getSubSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubSystem=ruleSubSystem();

            state._fsp--;

             current =iv_ruleSubSystem; 
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
    // $ANTLR end "entryRuleSubSystem"


    // $ANTLR start "ruleSubSystem"
    // InternalMyDsl.g:374:1: ruleSubSystem returns [EObject current=null] : ( () otherlv_1= 'SubSystem' ( (lv_name_2_0= ruleSubSystemName ) ) otherlv_3= '{' (otherlv_4= 'accounts' otherlv_5= '{' ( (lv_accounts_6_0= ruleAccount ) ) (otherlv_7= ',' ( (lv_accounts_8_0= ruleAccount ) ) )* otherlv_9= '}' )? (otherlv_10= 'TokenPairs' otherlv_11= '{' ( (lv_TokenPairs_12_0= ruleTokenPair ) ) (otherlv_13= ',' ( (lv_TokenPairs_14_0= ruleTokenPair ) ) )* otherlv_15= '}' )? (otherlv_16= 'Orders' otherlv_17= '{' ( (lv_Orders_18_0= ruleOrder ) ) (otherlv_19= ',' ( (lv_Orders_20_0= ruleOrder ) ) )* otherlv_21= '}' )? (otherlv_22= 'SavingOrders' otherlv_23= '{' ( (lv_SavingOrders_24_0= ruleSavingOrder ) ) (otherlv_25= ',' ( (lv_SavingOrders_26_0= ruleSavingOrder ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) ;
    public final EObject ruleSubSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Enumerator lv_name_2_0 = null;

        EObject lv_accounts_6_0 = null;

        EObject lv_accounts_8_0 = null;

        EObject lv_TokenPairs_12_0 = null;

        EObject lv_TokenPairs_14_0 = null;

        EObject lv_Orders_18_0 = null;

        EObject lv_Orders_20_0 = null;

        EObject lv_SavingOrders_24_0 = null;

        EObject lv_SavingOrders_26_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:380:2: ( ( () otherlv_1= 'SubSystem' ( (lv_name_2_0= ruleSubSystemName ) ) otherlv_3= '{' (otherlv_4= 'accounts' otherlv_5= '{' ( (lv_accounts_6_0= ruleAccount ) ) (otherlv_7= ',' ( (lv_accounts_8_0= ruleAccount ) ) )* otherlv_9= '}' )? (otherlv_10= 'TokenPairs' otherlv_11= '{' ( (lv_TokenPairs_12_0= ruleTokenPair ) ) (otherlv_13= ',' ( (lv_TokenPairs_14_0= ruleTokenPair ) ) )* otherlv_15= '}' )? (otherlv_16= 'Orders' otherlv_17= '{' ( (lv_Orders_18_0= ruleOrder ) ) (otherlv_19= ',' ( (lv_Orders_20_0= ruleOrder ) ) )* otherlv_21= '}' )? (otherlv_22= 'SavingOrders' otherlv_23= '{' ( (lv_SavingOrders_24_0= ruleSavingOrder ) ) (otherlv_25= ',' ( (lv_SavingOrders_26_0= ruleSavingOrder ) ) )* otherlv_27= '}' )? otherlv_28= '}' ) )
            // InternalMyDsl.g:381:2: ( () otherlv_1= 'SubSystem' ( (lv_name_2_0= ruleSubSystemName ) ) otherlv_3= '{' (otherlv_4= 'accounts' otherlv_5= '{' ( (lv_accounts_6_0= ruleAccount ) ) (otherlv_7= ',' ( (lv_accounts_8_0= ruleAccount ) ) )* otherlv_9= '}' )? (otherlv_10= 'TokenPairs' otherlv_11= '{' ( (lv_TokenPairs_12_0= ruleTokenPair ) ) (otherlv_13= ',' ( (lv_TokenPairs_14_0= ruleTokenPair ) ) )* otherlv_15= '}' )? (otherlv_16= 'Orders' otherlv_17= '{' ( (lv_Orders_18_0= ruleOrder ) ) (otherlv_19= ',' ( (lv_Orders_20_0= ruleOrder ) ) )* otherlv_21= '}' )? (otherlv_22= 'SavingOrders' otherlv_23= '{' ( (lv_SavingOrders_24_0= ruleSavingOrder ) ) (otherlv_25= ',' ( (lv_SavingOrders_26_0= ruleSavingOrder ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            {
            // InternalMyDsl.g:381:2: ( () otherlv_1= 'SubSystem' ( (lv_name_2_0= ruleSubSystemName ) ) otherlv_3= '{' (otherlv_4= 'accounts' otherlv_5= '{' ( (lv_accounts_6_0= ruleAccount ) ) (otherlv_7= ',' ( (lv_accounts_8_0= ruleAccount ) ) )* otherlv_9= '}' )? (otherlv_10= 'TokenPairs' otherlv_11= '{' ( (lv_TokenPairs_12_0= ruleTokenPair ) ) (otherlv_13= ',' ( (lv_TokenPairs_14_0= ruleTokenPair ) ) )* otherlv_15= '}' )? (otherlv_16= 'Orders' otherlv_17= '{' ( (lv_Orders_18_0= ruleOrder ) ) (otherlv_19= ',' ( (lv_Orders_20_0= ruleOrder ) ) )* otherlv_21= '}' )? (otherlv_22= 'SavingOrders' otherlv_23= '{' ( (lv_SavingOrders_24_0= ruleSavingOrder ) ) (otherlv_25= ',' ( (lv_SavingOrders_26_0= ruleSavingOrder ) ) )* otherlv_27= '}' )? otherlv_28= '}' )
            // InternalMyDsl.g:382:3: () otherlv_1= 'SubSystem' ( (lv_name_2_0= ruleSubSystemName ) ) otherlv_3= '{' (otherlv_4= 'accounts' otherlv_5= '{' ( (lv_accounts_6_0= ruleAccount ) ) (otherlv_7= ',' ( (lv_accounts_8_0= ruleAccount ) ) )* otherlv_9= '}' )? (otherlv_10= 'TokenPairs' otherlv_11= '{' ( (lv_TokenPairs_12_0= ruleTokenPair ) ) (otherlv_13= ',' ( (lv_TokenPairs_14_0= ruleTokenPair ) ) )* otherlv_15= '}' )? (otherlv_16= 'Orders' otherlv_17= '{' ( (lv_Orders_18_0= ruleOrder ) ) (otherlv_19= ',' ( (lv_Orders_20_0= ruleOrder ) ) )* otherlv_21= '}' )? (otherlv_22= 'SavingOrders' otherlv_23= '{' ( (lv_SavingOrders_24_0= ruleSavingOrder ) ) (otherlv_25= ',' ( (lv_SavingOrders_26_0= ruleSavingOrder ) ) )* otherlv_27= '}' )? otherlv_28= '}'
            {
            // InternalMyDsl.g:382:3: ()
            // InternalMyDsl.g:383:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubSystemAccess().getSubSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getSubSystemAccess().getSubSystemKeyword_1());
            		
            // InternalMyDsl.g:393:3: ( (lv_name_2_0= ruleSubSystemName ) )
            // InternalMyDsl.g:394:4: (lv_name_2_0= ruleSubSystemName )
            {
            // InternalMyDsl.g:394:4: (lv_name_2_0= ruleSubSystemName )
            // InternalMyDsl.g:395:5: lv_name_2_0= ruleSubSystemName
            {

            					newCompositeNode(grammarAccess.getSubSystemAccess().getNameSubSystemNameEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleSubSystemName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.SubSystemName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getSubSystemAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:416:3: (otherlv_4= 'accounts' otherlv_5= '{' ( (lv_accounts_6_0= ruleAccount ) ) (otherlv_7= ',' ( (lv_accounts_8_0= ruleAccount ) ) )* otherlv_9= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:417:4: otherlv_4= 'accounts' otherlv_5= '{' ( (lv_accounts_6_0= ruleAccount ) ) (otherlv_7= ',' ( (lv_accounts_8_0= ruleAccount ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getSubSystemAccess().getAccountsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getSubSystemAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:425:4: ( (lv_accounts_6_0= ruleAccount ) )
                    // InternalMyDsl.g:426:5: (lv_accounts_6_0= ruleAccount )
                    {
                    // InternalMyDsl.g:426:5: (lv_accounts_6_0= ruleAccount )
                    // InternalMyDsl.g:427:6: lv_accounts_6_0= ruleAccount
                    {

                    						newCompositeNode(grammarAccess.getSubSystemAccess().getAccountsAccountParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_accounts_6_0=ruleAccount();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubSystemRule());
                    						}
                    						add(
                    							current,
                    							"accounts",
                    							lv_accounts_6_0,
                    							"org.xtext.example.mydsl.MyDsl.Account");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:444:4: (otherlv_7= ',' ( (lv_accounts_8_0= ruleAccount ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:445:5: otherlv_7= ',' ( (lv_accounts_8_0= ruleAccount ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_16); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSubSystemAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:449:5: ( (lv_accounts_8_0= ruleAccount ) )
                    	    // InternalMyDsl.g:450:6: (lv_accounts_8_0= ruleAccount )
                    	    {
                    	    // InternalMyDsl.g:450:6: (lv_accounts_8_0= ruleAccount )
                    	    // InternalMyDsl.g:451:7: lv_accounts_8_0= ruleAccount
                    	    {

                    	    							newCompositeNode(grammarAccess.getSubSystemAccess().getAccountsAccountParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_accounts_8_0=ruleAccount();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSubSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"accounts",
                    	    								lv_accounts_8_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Account");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:474:3: (otherlv_10= 'TokenPairs' otherlv_11= '{' ( (lv_TokenPairs_12_0= ruleTokenPair ) ) (otherlv_13= ',' ( (lv_TokenPairs_14_0= ruleTokenPair ) ) )* otherlv_15= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:475:4: otherlv_10= 'TokenPairs' otherlv_11= '{' ( (lv_TokenPairs_12_0= ruleTokenPair ) ) (otherlv_13= ',' ( (lv_TokenPairs_14_0= ruleTokenPair ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getSubSystemAccess().getTokenPairsKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_11, grammarAccess.getSubSystemAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:483:4: ( (lv_TokenPairs_12_0= ruleTokenPair ) )
                    // InternalMyDsl.g:484:5: (lv_TokenPairs_12_0= ruleTokenPair )
                    {
                    // InternalMyDsl.g:484:5: (lv_TokenPairs_12_0= ruleTokenPair )
                    // InternalMyDsl.g:485:6: lv_TokenPairs_12_0= ruleTokenPair
                    {

                    						newCompositeNode(grammarAccess.getSubSystemAccess().getTokenPairsTokenPairParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_TokenPairs_12_0=ruleTokenPair();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubSystemRule());
                    						}
                    						add(
                    							current,
                    							"TokenPairs",
                    							lv_TokenPairs_12_0,
                    							"org.xtext.example.mydsl.MyDsl.TokenPair");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:502:4: (otherlv_13= ',' ( (lv_TokenPairs_14_0= ruleTokenPair ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:503:5: otherlv_13= ',' ( (lv_TokenPairs_14_0= ruleTokenPair ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FOLLOW_18); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getSubSystemAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:507:5: ( (lv_TokenPairs_14_0= ruleTokenPair ) )
                    	    // InternalMyDsl.g:508:6: (lv_TokenPairs_14_0= ruleTokenPair )
                    	    {
                    	    // InternalMyDsl.g:508:6: (lv_TokenPairs_14_0= ruleTokenPair )
                    	    // InternalMyDsl.g:509:7: lv_TokenPairs_14_0= ruleTokenPair
                    	    {

                    	    							newCompositeNode(grammarAccess.getSubSystemAccess().getTokenPairsTokenPairParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_TokenPairs_14_0=ruleTokenPair();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSubSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"TokenPairs",
                    	    								lv_TokenPairs_14_0,
                    	    								"org.xtext.example.mydsl.MyDsl.TokenPair");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,17,FOLLOW_19); 

                    				newLeafNode(otherlv_15, grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:532:3: (otherlv_16= 'Orders' otherlv_17= '{' ( (lv_Orders_18_0= ruleOrder ) ) (otherlv_19= ',' ( (lv_Orders_20_0= ruleOrder ) ) )* otherlv_21= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:533:4: otherlv_16= 'Orders' otherlv_17= '{' ( (lv_Orders_18_0= ruleOrder ) ) (otherlv_19= ',' ( (lv_Orders_20_0= ruleOrder ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getSubSystemAccess().getOrdersKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_17, grammarAccess.getSubSystemAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalMyDsl.g:541:4: ( (lv_Orders_18_0= ruleOrder ) )
                    // InternalMyDsl.g:542:5: (lv_Orders_18_0= ruleOrder )
                    {
                    // InternalMyDsl.g:542:5: (lv_Orders_18_0= ruleOrder )
                    // InternalMyDsl.g:543:6: lv_Orders_18_0= ruleOrder
                    {

                    						newCompositeNode(grammarAccess.getSubSystemAccess().getOrdersOrderParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_Orders_18_0=ruleOrder();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubSystemRule());
                    						}
                    						add(
                    							current,
                    							"Orders",
                    							lv_Orders_18_0,
                    							"org.xtext.example.mydsl.MyDsl.Order");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:560:4: (otherlv_19= ',' ( (lv_Orders_20_0= ruleOrder ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDsl.g:561:5: otherlv_19= ',' ( (lv_Orders_20_0= ruleOrder ) )
                    	    {
                    	    otherlv_19=(Token)match(input,16,FOLLOW_20); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getSubSystemAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalMyDsl.g:565:5: ( (lv_Orders_20_0= ruleOrder ) )
                    	    // InternalMyDsl.g:566:6: (lv_Orders_20_0= ruleOrder )
                    	    {
                    	    // InternalMyDsl.g:566:6: (lv_Orders_20_0= ruleOrder )
                    	    // InternalMyDsl.g:567:7: lv_Orders_20_0= ruleOrder
                    	    {

                    	    							newCompositeNode(grammarAccess.getSubSystemAccess().getOrdersOrderParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_Orders_20_0=ruleOrder();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSubSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"Orders",
                    	    								lv_Orders_20_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Order");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,17,FOLLOW_21); 

                    				newLeafNode(otherlv_21, grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:590:3: (otherlv_22= 'SavingOrders' otherlv_23= '{' ( (lv_SavingOrders_24_0= ruleSavingOrder ) ) (otherlv_25= ',' ( (lv_SavingOrders_26_0= ruleSavingOrder ) ) )* otherlv_27= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:591:4: otherlv_22= 'SavingOrders' otherlv_23= '{' ( (lv_SavingOrders_24_0= ruleSavingOrder ) ) (otherlv_25= ',' ( (lv_SavingOrders_26_0= ruleSavingOrder ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_22, grammarAccess.getSubSystemAccess().getSavingOrdersKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_22); 

                    				newLeafNode(otherlv_23, grammarAccess.getSubSystemAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalMyDsl.g:599:4: ( (lv_SavingOrders_24_0= ruleSavingOrder ) )
                    // InternalMyDsl.g:600:5: (lv_SavingOrders_24_0= ruleSavingOrder )
                    {
                    // InternalMyDsl.g:600:5: (lv_SavingOrders_24_0= ruleSavingOrder )
                    // InternalMyDsl.g:601:6: lv_SavingOrders_24_0= ruleSavingOrder
                    {

                    						newCompositeNode(grammarAccess.getSubSystemAccess().getSavingOrdersSavingOrderParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_SavingOrders_24_0=ruleSavingOrder();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubSystemRule());
                    						}
                    						add(
                    							current,
                    							"SavingOrders",
                    							lv_SavingOrders_24_0,
                    							"org.xtext.example.mydsl.MyDsl.SavingOrder");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:618:4: (otherlv_25= ',' ( (lv_SavingOrders_26_0= ruleSavingOrder ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==16) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMyDsl.g:619:5: otherlv_25= ',' ( (lv_SavingOrders_26_0= ruleSavingOrder ) )
                    	    {
                    	    otherlv_25=(Token)match(input,16,FOLLOW_22); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getSubSystemAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalMyDsl.g:623:5: ( (lv_SavingOrders_26_0= ruleSavingOrder ) )
                    	    // InternalMyDsl.g:624:6: (lv_SavingOrders_26_0= ruleSavingOrder )
                    	    {
                    	    // InternalMyDsl.g:624:6: (lv_SavingOrders_26_0= ruleSavingOrder )
                    	    // InternalMyDsl.g:625:7: lv_SavingOrders_26_0= ruleSavingOrder
                    	    {

                    	    							newCompositeNode(grammarAccess.getSubSystemAccess().getSavingOrdersSavingOrderParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_SavingOrders_26_0=ruleSavingOrder();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSubSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"SavingOrders",
                    	    								lv_SavingOrders_26_0,
                    	    								"org.xtext.example.mydsl.MyDsl.SavingOrder");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_27, grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_28=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_28, grammarAccess.getSubSystemAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleSubSystem"


    // $ANTLR start "entryRuleToken"
    // InternalMyDsl.g:656:1: entryRuleToken returns [EObject current=null] : iv_ruleToken= ruleToken EOF ;
    public final EObject entryRuleToken() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToken = null;


        try {
            // InternalMyDsl.g:656:46: (iv_ruleToken= ruleToken EOF )
            // InternalMyDsl.g:657:2: iv_ruleToken= ruleToken EOF
            {
             newCompositeNode(grammarAccess.getTokenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToken=ruleToken();

            state._fsp--;

             current =iv_ruleToken; 
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
    // $ANTLR end "entryRuleToken"


    // $ANTLR start "ruleToken"
    // InternalMyDsl.g:663:1: ruleToken returns [EObject current=null] : (otherlv_0= 'Token' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) ) )? otherlv_5= 'decimal' ( (lv_decimal_6_0= ruleEInt ) ) otherlv_7= 'TokenNetwork' ( ( ruleEString ) ) otherlv_9= '}' ) ;
    public final EObject ruleToken() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_address_4_0 = null;

        AntlrDatatypeRuleToken lv_decimal_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:669:2: ( (otherlv_0= 'Token' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) ) )? otherlv_5= 'decimal' ( (lv_decimal_6_0= ruleEInt ) ) otherlv_7= 'TokenNetwork' ( ( ruleEString ) ) otherlv_9= '}' ) )
            // InternalMyDsl.g:670:2: (otherlv_0= 'Token' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) ) )? otherlv_5= 'decimal' ( (lv_decimal_6_0= ruleEInt ) ) otherlv_7= 'TokenNetwork' ( ( ruleEString ) ) otherlv_9= '}' )
            {
            // InternalMyDsl.g:670:2: (otherlv_0= 'Token' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) ) )? otherlv_5= 'decimal' ( (lv_decimal_6_0= ruleEInt ) ) otherlv_7= 'TokenNetwork' ( ( ruleEString ) ) otherlv_9= '}' )
            // InternalMyDsl.g:671:3: otherlv_0= 'Token' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) ) )? otherlv_5= 'decimal' ( (lv_decimal_6_0= ruleEInt ) ) otherlv_7= 'TokenNetwork' ( ( ruleEString ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTokenAccess().getTokenKeyword_0());
            		
            // InternalMyDsl.g:675:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:676:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:676:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:677:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTokenAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTokenRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getTokenAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:698:3: (otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:699:4: otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getTokenAccess().getAddressKeyword_3_0());
                    			
                    // InternalMyDsl.g:703:4: ( (lv_address_4_0= ruleEString ) )
                    // InternalMyDsl.g:704:5: (lv_address_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:704:5: (lv_address_4_0= ruleEString )
                    // InternalMyDsl.g:705:6: lv_address_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTokenAccess().getAddressEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_address_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTokenRule());
                    						}
                    						set(
                    							current,
                    							"address",
                    							lv_address_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getTokenAccess().getDecimalKeyword_4());
            		
            // InternalMyDsl.g:727:3: ( (lv_decimal_6_0= ruleEInt ) )
            // InternalMyDsl.g:728:4: (lv_decimal_6_0= ruleEInt )
            {
            // InternalMyDsl.g:728:4: (lv_decimal_6_0= ruleEInt )
            // InternalMyDsl.g:729:5: lv_decimal_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTokenAccess().getDecimalEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_decimal_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTokenRule());
            					}
            					set(
            						current,
            						"decimal",
            						lv_decimal_6_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getTokenAccess().getTokenNetworkKeyword_6());
            		
            // InternalMyDsl.g:750:3: ( ( ruleEString ) )
            // InternalMyDsl.g:751:4: ( ruleEString )
            {
            // InternalMyDsl.g:751:4: ( ruleEString )
            // InternalMyDsl.g:752:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTokenAccess().getTokenNetworkTokenNetworkCrossReference_7_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTokenAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleToken"


    // $ANTLR start "entryRuleTokenNetwork"
    // InternalMyDsl.g:774:1: entryRuleTokenNetwork returns [EObject current=null] : iv_ruleTokenNetwork= ruleTokenNetwork EOF ;
    public final EObject entryRuleTokenNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTokenNetwork = null;


        try {
            // InternalMyDsl.g:774:53: (iv_ruleTokenNetwork= ruleTokenNetwork EOF )
            // InternalMyDsl.g:775:2: iv_ruleTokenNetwork= ruleTokenNetwork EOF
            {
             newCompositeNode(grammarAccess.getTokenNetworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTokenNetwork=ruleTokenNetwork();

            state._fsp--;

             current =iv_ruleTokenNetwork; 
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
    // $ANTLR end "entryRuleTokenNetwork"


    // $ANTLR start "ruleTokenNetwork"
    // InternalMyDsl.g:781:1: ruleTokenNetwork returns [EObject current=null] : (otherlv_0= 'TokenNetwork' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'chainID' ( (lv_chainID_4_0= ruleEInt ) ) (otherlv_5= 'RPC' ( (lv_RPC_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleTokenNetwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_chainID_4_0 = null;

        AntlrDatatypeRuleToken lv_RPC_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:787:2: ( (otherlv_0= 'TokenNetwork' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'chainID' ( (lv_chainID_4_0= ruleEInt ) ) (otherlv_5= 'RPC' ( (lv_RPC_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalMyDsl.g:788:2: (otherlv_0= 'TokenNetwork' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'chainID' ( (lv_chainID_4_0= ruleEInt ) ) (otherlv_5= 'RPC' ( (lv_RPC_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:788:2: (otherlv_0= 'TokenNetwork' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'chainID' ( (lv_chainID_4_0= ruleEInt ) ) (otherlv_5= 'RPC' ( (lv_RPC_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalMyDsl.g:789:3: otherlv_0= 'TokenNetwork' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'chainID' ( (lv_chainID_4_0= ruleEInt ) ) (otherlv_5= 'RPC' ( (lv_RPC_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTokenNetworkAccess().getTokenNetworkKeyword_0());
            		
            // InternalMyDsl.g:793:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:794:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:794:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:795:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTokenNetworkAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTokenNetworkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getTokenNetworkAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getTokenNetworkAccess().getChainIDKeyword_3());
            		
            // InternalMyDsl.g:820:3: ( (lv_chainID_4_0= ruleEInt ) )
            // InternalMyDsl.g:821:4: (lv_chainID_4_0= ruleEInt )
            {
            // InternalMyDsl.g:821:4: (lv_chainID_4_0= ruleEInt )
            // InternalMyDsl.g:822:5: lv_chainID_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTokenNetworkAccess().getChainIDEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
            lv_chainID_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTokenNetworkRule());
            					}
            					set(
            						current,
            						"chainID",
            						lv_chainID_4_0,
            						"org.xtext.example.mydsl.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:839:3: (otherlv_5= 'RPC' ( (lv_RPC_6_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:840:4: otherlv_5= 'RPC' ( (lv_RPC_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getTokenNetworkAccess().getRPCKeyword_5_0());
                    			
                    // InternalMyDsl.g:844:4: ( (lv_RPC_6_0= ruleEString ) )
                    // InternalMyDsl.g:845:5: (lv_RPC_6_0= ruleEString )
                    {
                    // InternalMyDsl.g:845:5: (lv_RPC_6_0= ruleEString )
                    // InternalMyDsl.g:846:6: lv_RPC_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTokenNetworkAccess().getRPCEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_RPC_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTokenNetworkRule());
                    						}
                    						set(
                    							current,
                    							"RPC",
                    							lv_RPC_6_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTokenNetworkAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTokenNetwork"


    // $ANTLR start "entryRuleAccount"
    // InternalMyDsl.g:872:1: entryRuleAccount returns [EObject current=null] : iv_ruleAccount= ruleAccount EOF ;
    public final EObject entryRuleAccount() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccount = null;


        try {
            // InternalMyDsl.g:872:48: (iv_ruleAccount= ruleAccount EOF )
            // InternalMyDsl.g:873:2: iv_ruleAccount= ruleAccount EOF
            {
             newCompositeNode(grammarAccess.getAccountRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccount=ruleAccount();

            state._fsp--;

             current =iv_ruleAccount; 
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
    // $ANTLR end "entryRuleAccount"


    // $ANTLR start "ruleAccount"
    // InternalMyDsl.g:879:1: ruleAccount returns [EObject current=null] : ( () otherlv_1= 'Account' otherlv_2= '{' (otherlv_3= 'TokensBalance' otherlv_4= '{' ( (lv_TokensBalance_5_0= ruleTokenBalance ) ) (otherlv_6= ',' ( (lv_TokensBalance_7_0= ruleTokenBalance ) ) )* otherlv_8= '}' )? (otherlv_9= 'transferRequest' otherlv_10= '{' ( (lv_transferRequest_11_0= ruleTransferRequest ) ) (otherlv_12= ',' ( (lv_transferRequest_13_0= ruleTransferRequest ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) ;
    public final EObject ruleAccount() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_TokensBalance_5_0 = null;

        EObject lv_TokensBalance_7_0 = null;

        EObject lv_transferRequest_11_0 = null;

        EObject lv_transferRequest_13_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:885:2: ( ( () otherlv_1= 'Account' otherlv_2= '{' (otherlv_3= 'TokensBalance' otherlv_4= '{' ( (lv_TokensBalance_5_0= ruleTokenBalance ) ) (otherlv_6= ',' ( (lv_TokensBalance_7_0= ruleTokenBalance ) ) )* otherlv_8= '}' )? (otherlv_9= 'transferRequest' otherlv_10= '{' ( (lv_transferRequest_11_0= ruleTransferRequest ) ) (otherlv_12= ',' ( (lv_transferRequest_13_0= ruleTransferRequest ) ) )* otherlv_14= '}' )? otherlv_15= '}' ) )
            // InternalMyDsl.g:886:2: ( () otherlv_1= 'Account' otherlv_2= '{' (otherlv_3= 'TokensBalance' otherlv_4= '{' ( (lv_TokensBalance_5_0= ruleTokenBalance ) ) (otherlv_6= ',' ( (lv_TokensBalance_7_0= ruleTokenBalance ) ) )* otherlv_8= '}' )? (otherlv_9= 'transferRequest' otherlv_10= '{' ( (lv_transferRequest_11_0= ruleTransferRequest ) ) (otherlv_12= ',' ( (lv_transferRequest_13_0= ruleTransferRequest ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            {
            // InternalMyDsl.g:886:2: ( () otherlv_1= 'Account' otherlv_2= '{' (otherlv_3= 'TokensBalance' otherlv_4= '{' ( (lv_TokensBalance_5_0= ruleTokenBalance ) ) (otherlv_6= ',' ( (lv_TokensBalance_7_0= ruleTokenBalance ) ) )* otherlv_8= '}' )? (otherlv_9= 'transferRequest' otherlv_10= '{' ( (lv_transferRequest_11_0= ruleTransferRequest ) ) (otherlv_12= ',' ( (lv_transferRequest_13_0= ruleTransferRequest ) ) )* otherlv_14= '}' )? otherlv_15= '}' )
            // InternalMyDsl.g:887:3: () otherlv_1= 'Account' otherlv_2= '{' (otherlv_3= 'TokensBalance' otherlv_4= '{' ( (lv_TokensBalance_5_0= ruleTokenBalance ) ) (otherlv_6= ',' ( (lv_TokensBalance_7_0= ruleTokenBalance ) ) )* otherlv_8= '}' )? (otherlv_9= 'transferRequest' otherlv_10= '{' ( (lv_transferRequest_11_0= ruleTransferRequest ) ) (otherlv_12= ',' ( (lv_transferRequest_13_0= ruleTransferRequest ) ) )* otherlv_14= '}' )? otherlv_15= '}'
            {
            // InternalMyDsl.g:887:3: ()
            // InternalMyDsl.g:888:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAccountAccess().getAccountAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAccountAccess().getAccountKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getAccountAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:902:3: (otherlv_3= 'TokensBalance' otherlv_4= '{' ( (lv_TokensBalance_5_0= ruleTokenBalance ) ) (otherlv_6= ',' ( (lv_TokensBalance_7_0= ruleTokenBalance ) ) )* otherlv_8= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:903:4: otherlv_3= 'TokensBalance' otherlv_4= '{' ( (lv_TokensBalance_5_0= ruleTokenBalance ) ) (otherlv_6= ',' ( (lv_TokensBalance_7_0= ruleTokenBalance ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getAccountAccess().getTokensBalanceKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getAccountAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyDsl.g:911:4: ( (lv_TokensBalance_5_0= ruleTokenBalance ) )
                    // InternalMyDsl.g:912:5: (lv_TokensBalance_5_0= ruleTokenBalance )
                    {
                    // InternalMyDsl.g:912:5: (lv_TokensBalance_5_0= ruleTokenBalance )
                    // InternalMyDsl.g:913:6: lv_TokensBalance_5_0= ruleTokenBalance
                    {

                    						newCompositeNode(grammarAccess.getAccountAccess().getTokensBalanceTokenBalanceParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_TokensBalance_5_0=ruleTokenBalance();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAccountRule());
                    						}
                    						add(
                    							current,
                    							"TokensBalance",
                    							lv_TokensBalance_5_0,
                    							"org.xtext.example.mydsl.MyDsl.TokenBalance");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:930:4: (otherlv_6= ',' ( (lv_TokensBalance_7_0= ruleTokenBalance ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==16) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalMyDsl.g:931:5: otherlv_6= ',' ( (lv_TokensBalance_7_0= ruleTokenBalance ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_29); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAccountAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:935:5: ( (lv_TokensBalance_7_0= ruleTokenBalance ) )
                    	    // InternalMyDsl.g:936:6: (lv_TokensBalance_7_0= ruleTokenBalance )
                    	    {
                    	    // InternalMyDsl.g:936:6: (lv_TokensBalance_7_0= ruleTokenBalance )
                    	    // InternalMyDsl.g:937:7: lv_TokensBalance_7_0= ruleTokenBalance
                    	    {

                    	    							newCompositeNode(grammarAccess.getAccountAccess().getTokensBalanceTokenBalanceParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_TokensBalance_7_0=ruleTokenBalance();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAccountRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"TokensBalance",
                    	    								lv_TokensBalance_7_0,
                    	    								"org.xtext.example.mydsl.MyDsl.TokenBalance");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,17,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getAccountAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:960:3: (otherlv_9= 'transferRequest' otherlv_10= '{' ( (lv_transferRequest_11_0= ruleTransferRequest ) ) (otherlv_12= ',' ( (lv_transferRequest_13_0= ruleTransferRequest ) ) )* otherlv_14= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:961:4: otherlv_9= 'transferRequest' otherlv_10= '{' ( (lv_transferRequest_11_0= ruleTransferRequest ) ) (otherlv_12= ',' ( (lv_transferRequest_13_0= ruleTransferRequest ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getAccountAccess().getTransferRequestKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_10, grammarAccess.getAccountAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:969:4: ( (lv_transferRequest_11_0= ruleTransferRequest ) )
                    // InternalMyDsl.g:970:5: (lv_transferRequest_11_0= ruleTransferRequest )
                    {
                    // InternalMyDsl.g:970:5: (lv_transferRequest_11_0= ruleTransferRequest )
                    // InternalMyDsl.g:971:6: lv_transferRequest_11_0= ruleTransferRequest
                    {

                    						newCompositeNode(grammarAccess.getAccountAccess().getTransferRequestTransferRequestParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_transferRequest_11_0=ruleTransferRequest();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAccountRule());
                    						}
                    						add(
                    							current,
                    							"transferRequest",
                    							lv_transferRequest_11_0,
                    							"org.xtext.example.mydsl.MyDsl.TransferRequest");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:988:4: (otherlv_12= ',' ( (lv_transferRequest_13_0= ruleTransferRequest ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==16) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalMyDsl.g:989:5: otherlv_12= ',' ( (lv_transferRequest_13_0= ruleTransferRequest ) )
                    	    {
                    	    otherlv_12=(Token)match(input,16,FOLLOW_31); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getAccountAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:993:5: ( (lv_transferRequest_13_0= ruleTransferRequest ) )
                    	    // InternalMyDsl.g:994:6: (lv_transferRequest_13_0= ruleTransferRequest )
                    	    {
                    	    // InternalMyDsl.g:994:6: (lv_transferRequest_13_0= ruleTransferRequest )
                    	    // InternalMyDsl.g:995:7: lv_transferRequest_13_0= ruleTransferRequest
                    	    {

                    	    							newCompositeNode(grammarAccess.getAccountAccess().getTransferRequestTransferRequestParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_transferRequest_13_0=ruleTransferRequest();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAccountRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"transferRequest",
                    	    								lv_transferRequest_13_0,
                    	    								"org.xtext.example.mydsl.MyDsl.TransferRequest");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getAccountAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getAccountAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAccount"


    // $ANTLR start "entryRuleTokenPair"
    // InternalMyDsl.g:1026:1: entryRuleTokenPair returns [EObject current=null] : iv_ruleTokenPair= ruleTokenPair EOF ;
    public final EObject entryRuleTokenPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTokenPair = null;


        try {
            // InternalMyDsl.g:1026:50: (iv_ruleTokenPair= ruleTokenPair EOF )
            // InternalMyDsl.g:1027:2: iv_ruleTokenPair= ruleTokenPair EOF
            {
             newCompositeNode(grammarAccess.getTokenPairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTokenPair=ruleTokenPair();

            state._fsp--;

             current =iv_ruleTokenPair; 
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
    // $ANTLR end "entryRuleTokenPair"


    // $ANTLR start "ruleTokenPair"
    // InternalMyDsl.g:1033:1: ruleTokenPair returns [EObject current=null] : (otherlv_0= 'TokenPair' otherlv_1= '{' otherlv_2= 'price' ( (lv_price_3_0= ruleEFloat ) ) otherlv_4= 'TokenA' ( ( ruleEString ) ) otherlv_6= 'TokenB' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleTokenPair() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_price_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1039:2: ( (otherlv_0= 'TokenPair' otherlv_1= '{' otherlv_2= 'price' ( (lv_price_3_0= ruleEFloat ) ) otherlv_4= 'TokenA' ( ( ruleEString ) ) otherlv_6= 'TokenB' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalMyDsl.g:1040:2: (otherlv_0= 'TokenPair' otherlv_1= '{' otherlv_2= 'price' ( (lv_price_3_0= ruleEFloat ) ) otherlv_4= 'TokenA' ( ( ruleEString ) ) otherlv_6= 'TokenB' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalMyDsl.g:1040:2: (otherlv_0= 'TokenPair' otherlv_1= '{' otherlv_2= 'price' ( (lv_price_3_0= ruleEFloat ) ) otherlv_4= 'TokenA' ( ( ruleEString ) ) otherlv_6= 'TokenB' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalMyDsl.g:1041:3: otherlv_0= 'TokenPair' otherlv_1= '{' otherlv_2= 'price' ( (lv_price_3_0= ruleEFloat ) ) otherlv_4= 'TokenA' ( ( ruleEString ) ) otherlv_6= 'TokenB' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTokenPairAccess().getTokenPairKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getTokenPairAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getTokenPairAccess().getPriceKeyword_2());
            		
            // InternalMyDsl.g:1053:3: ( (lv_price_3_0= ruleEFloat ) )
            // InternalMyDsl.g:1054:4: (lv_price_3_0= ruleEFloat )
            {
            // InternalMyDsl.g:1054:4: (lv_price_3_0= ruleEFloat )
            // InternalMyDsl.g:1055:5: lv_price_3_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getTokenPairAccess().getPriceEFloatParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_34);
            lv_price_3_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTokenPairRule());
            					}
            					set(
            						current,
            						"price",
            						lv_price_3_0,
            						"org.xtext.example.mydsl.MyDsl.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTokenPairAccess().getTokenAKeyword_4());
            		
            // InternalMyDsl.g:1076:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1077:4: ( ruleEString )
            {
            // InternalMyDsl.g:1077:4: ( ruleEString )
            // InternalMyDsl.g:1078:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenPairRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTokenPairAccess().getTokenATokenCrossReference_5_0());
            				
            pushFollow(FOLLOW_35);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTokenPairAccess().getTokenBKeyword_6());
            		
            // InternalMyDsl.g:1096:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1097:4: ( ruleEString )
            {
            // InternalMyDsl.g:1097:4: ( ruleEString )
            // InternalMyDsl.g:1098:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenPairRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTokenPairAccess().getTokenBTokenCrossReference_7_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTokenPairAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleTokenPair"


    // $ANTLR start "entryRuleOrder"
    // InternalMyDsl.g:1120:1: entryRuleOrder returns [EObject current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final EObject entryRuleOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrder = null;


        try {
            // InternalMyDsl.g:1120:46: (iv_ruleOrder= ruleOrder EOF )
            // InternalMyDsl.g:1121:2: iv_ruleOrder= ruleOrder EOF
            {
             newCompositeNode(grammarAccess.getOrderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrder=ruleOrder();

            state._fsp--;

             current =iv_ruleOrder; 
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
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // InternalMyDsl.g:1127:1: ruleOrder returns [EObject current=null] : (otherlv_0= 'Order' otherlv_1= '{' otherlv_2= 'Price' ( (lv_Price_3_0= ruleEFloat ) ) otherlv_4= 'Amount' ( (lv_Amount_5_0= ruleEFloat ) ) (otherlv_6= 'leverage' ( (lv_leverage_7_0= ruleLeverageType ) ) )? (otherlv_8= 'Type' ( (lv_Type_9_0= ruleOrderType ) ) )? otherlv_10= 'account' ( ( ruleEString ) ) otherlv_12= 'TokenPair' ( ( ruleEString ) ) otherlv_14= '}' ) ;
    public final EObject ruleOrder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_Price_3_0 = null;

        AntlrDatatypeRuleToken lv_Amount_5_0 = null;

        Enumerator lv_leverage_7_0 = null;

        Enumerator lv_Type_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1133:2: ( (otherlv_0= 'Order' otherlv_1= '{' otherlv_2= 'Price' ( (lv_Price_3_0= ruleEFloat ) ) otherlv_4= 'Amount' ( (lv_Amount_5_0= ruleEFloat ) ) (otherlv_6= 'leverage' ( (lv_leverage_7_0= ruleLeverageType ) ) )? (otherlv_8= 'Type' ( (lv_Type_9_0= ruleOrderType ) ) )? otherlv_10= 'account' ( ( ruleEString ) ) otherlv_12= 'TokenPair' ( ( ruleEString ) ) otherlv_14= '}' ) )
            // InternalMyDsl.g:1134:2: (otherlv_0= 'Order' otherlv_1= '{' otherlv_2= 'Price' ( (lv_Price_3_0= ruleEFloat ) ) otherlv_4= 'Amount' ( (lv_Amount_5_0= ruleEFloat ) ) (otherlv_6= 'leverage' ( (lv_leverage_7_0= ruleLeverageType ) ) )? (otherlv_8= 'Type' ( (lv_Type_9_0= ruleOrderType ) ) )? otherlv_10= 'account' ( ( ruleEString ) ) otherlv_12= 'TokenPair' ( ( ruleEString ) ) otherlv_14= '}' )
            {
            // InternalMyDsl.g:1134:2: (otherlv_0= 'Order' otherlv_1= '{' otherlv_2= 'Price' ( (lv_Price_3_0= ruleEFloat ) ) otherlv_4= 'Amount' ( (lv_Amount_5_0= ruleEFloat ) ) (otherlv_6= 'leverage' ( (lv_leverage_7_0= ruleLeverageType ) ) )? (otherlv_8= 'Type' ( (lv_Type_9_0= ruleOrderType ) ) )? otherlv_10= 'account' ( ( ruleEString ) ) otherlv_12= 'TokenPair' ( ( ruleEString ) ) otherlv_14= '}' )
            // InternalMyDsl.g:1135:3: otherlv_0= 'Order' otherlv_1= '{' otherlv_2= 'Price' ( (lv_Price_3_0= ruleEFloat ) ) otherlv_4= 'Amount' ( (lv_Amount_5_0= ruleEFloat ) ) (otherlv_6= 'leverage' ( (lv_leverage_7_0= ruleLeverageType ) ) )? (otherlv_8= 'Type' ( (lv_Type_9_0= ruleOrderType ) ) )? otherlv_10= 'account' ( ( ruleEString ) ) otherlv_12= 'TokenPair' ( ( ruleEString ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOrderAccess().getOrderKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getOrderAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,38,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getOrderAccess().getPriceKeyword_2());
            		
            // InternalMyDsl.g:1147:3: ( (lv_Price_3_0= ruleEFloat ) )
            // InternalMyDsl.g:1148:4: (lv_Price_3_0= ruleEFloat )
            {
            // InternalMyDsl.g:1148:4: (lv_Price_3_0= ruleEFloat )
            // InternalMyDsl.g:1149:5: lv_Price_3_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getOrderAccess().getPriceEFloatParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_37);
            lv_Price_3_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderRule());
            					}
            					set(
            						current,
            						"Price",
            						lv_Price_3_0,
            						"org.xtext.example.mydsl.MyDsl.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,39,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getOrderAccess().getAmountKeyword_4());
            		
            // InternalMyDsl.g:1170:3: ( (lv_Amount_5_0= ruleEFloat ) )
            // InternalMyDsl.g:1171:4: (lv_Amount_5_0= ruleEFloat )
            {
            // InternalMyDsl.g:1171:4: (lv_Amount_5_0= ruleEFloat )
            // InternalMyDsl.g:1172:5: lv_Amount_5_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getOrderAccess().getAmountEFloatParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_38);
            lv_Amount_5_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrderRule());
            					}
            					set(
            						current,
            						"Amount",
            						lv_Amount_5_0,
            						"org.xtext.example.mydsl.MyDsl.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1189:3: (otherlv_6= 'leverage' ( (lv_leverage_7_0= ruleLeverageType ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1190:4: otherlv_6= 'leverage' ( (lv_leverage_7_0= ruleLeverageType ) )
                    {
                    otherlv_6=(Token)match(input,40,FOLLOW_39); 

                    				newLeafNode(otherlv_6, grammarAccess.getOrderAccess().getLeverageKeyword_6_0());
                    			
                    // InternalMyDsl.g:1194:4: ( (lv_leverage_7_0= ruleLeverageType ) )
                    // InternalMyDsl.g:1195:5: (lv_leverage_7_0= ruleLeverageType )
                    {
                    // InternalMyDsl.g:1195:5: (lv_leverage_7_0= ruleLeverageType )
                    // InternalMyDsl.g:1196:6: lv_leverage_7_0= ruleLeverageType
                    {

                    						newCompositeNode(grammarAccess.getOrderAccess().getLeverageLeverageTypeEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_leverage_7_0=ruleLeverageType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrderRule());
                    						}
                    						set(
                    							current,
                    							"leverage",
                    							lv_leverage_7_0,
                    							"org.xtext.example.mydsl.MyDsl.LeverageType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1214:3: (otherlv_8= 'Type' ( (lv_Type_9_0= ruleOrderType ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1215:4: otherlv_8= 'Type' ( (lv_Type_9_0= ruleOrderType ) )
                    {
                    otherlv_8=(Token)match(input,41,FOLLOW_41); 

                    				newLeafNode(otherlv_8, grammarAccess.getOrderAccess().getTypeKeyword_7_0());
                    			
                    // InternalMyDsl.g:1219:4: ( (lv_Type_9_0= ruleOrderType ) )
                    // InternalMyDsl.g:1220:5: (lv_Type_9_0= ruleOrderType )
                    {
                    // InternalMyDsl.g:1220:5: (lv_Type_9_0= ruleOrderType )
                    // InternalMyDsl.g:1221:6: lv_Type_9_0= ruleOrderType
                    {

                    						newCompositeNode(grammarAccess.getOrderAccess().getTypeOrderTypeEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_Type_9_0=ruleOrderType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrderRule());
                    						}
                    						set(
                    							current,
                    							"Type",
                    							lv_Type_9_0,
                    							"org.xtext.example.mydsl.MyDsl.OrderType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getOrderAccess().getAccountKeyword_8());
            		
            // InternalMyDsl.g:1243:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1244:4: ( ruleEString )
            {
            // InternalMyDsl.g:1244:4: ( ruleEString )
            // InternalMyDsl.g:1245:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOrderAccess().getAccountAccountCrossReference_9_0());
            				
            pushFollow(FOLLOW_18);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getOrderAccess().getTokenPairKeyword_10());
            		
            // InternalMyDsl.g:1263:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1264:4: ( ruleEString )
            {
            // InternalMyDsl.g:1264:4: ( ruleEString )
            // InternalMyDsl.g:1265:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrderRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOrderAccess().getTokenPairTokenPairCrossReference_11_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getOrderAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleOrder"


    // $ANTLR start "entryRuleSavingOrder"
    // InternalMyDsl.g:1287:1: entryRuleSavingOrder returns [EObject current=null] : iv_ruleSavingOrder= ruleSavingOrder EOF ;
    public final EObject entryRuleSavingOrder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSavingOrder = null;


        try {
            // InternalMyDsl.g:1287:52: (iv_ruleSavingOrder= ruleSavingOrder EOF )
            // InternalMyDsl.g:1288:2: iv_ruleSavingOrder= ruleSavingOrder EOF
            {
             newCompositeNode(grammarAccess.getSavingOrderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSavingOrder=ruleSavingOrder();

            state._fsp--;

             current =iv_ruleSavingOrder; 
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
    // $ANTLR end "entryRuleSavingOrder"


    // $ANTLR start "ruleSavingOrder"
    // InternalMyDsl.g:1294:1: ruleSavingOrder returns [EObject current=null] : (otherlv_0= 'SavingOrder' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Amount' ( (lv_Amount_4_0= ruleEFloat ) ) (otherlv_5= 'MatureDate' ( (lv_MatureDate_6_0= ruleEDate ) ) )? otherlv_7= 'Interest' ( (lv_Interest_8_0= ruleEDouble ) ) otherlv_9= 'account' ( ( ruleEString ) ) otherlv_11= 'Token' ( ( ruleEString ) ) otherlv_13= '}' ) ;
    public final EObject ruleSavingOrder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_Amount_4_0 = null;

        AntlrDatatypeRuleToken lv_MatureDate_6_0 = null;

        AntlrDatatypeRuleToken lv_Interest_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1300:2: ( (otherlv_0= 'SavingOrder' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Amount' ( (lv_Amount_4_0= ruleEFloat ) ) (otherlv_5= 'MatureDate' ( (lv_MatureDate_6_0= ruleEDate ) ) )? otherlv_7= 'Interest' ( (lv_Interest_8_0= ruleEDouble ) ) otherlv_9= 'account' ( ( ruleEString ) ) otherlv_11= 'Token' ( ( ruleEString ) ) otherlv_13= '}' ) )
            // InternalMyDsl.g:1301:2: (otherlv_0= 'SavingOrder' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Amount' ( (lv_Amount_4_0= ruleEFloat ) ) (otherlv_5= 'MatureDate' ( (lv_MatureDate_6_0= ruleEDate ) ) )? otherlv_7= 'Interest' ( (lv_Interest_8_0= ruleEDouble ) ) otherlv_9= 'account' ( ( ruleEString ) ) otherlv_11= 'Token' ( ( ruleEString ) ) otherlv_13= '}' )
            {
            // InternalMyDsl.g:1301:2: (otherlv_0= 'SavingOrder' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Amount' ( (lv_Amount_4_0= ruleEFloat ) ) (otherlv_5= 'MatureDate' ( (lv_MatureDate_6_0= ruleEDate ) ) )? otherlv_7= 'Interest' ( (lv_Interest_8_0= ruleEDouble ) ) otherlv_9= 'account' ( ( ruleEString ) ) otherlv_11= 'Token' ( ( ruleEString ) ) otherlv_13= '}' )
            // InternalMyDsl.g:1302:3: otherlv_0= 'SavingOrder' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Amount' ( (lv_Amount_4_0= ruleEFloat ) ) (otherlv_5= 'MatureDate' ( (lv_MatureDate_6_0= ruleEDate ) ) )? otherlv_7= 'Interest' ( (lv_Interest_8_0= ruleEDouble ) ) otherlv_9= 'account' ( ( ruleEString ) ) otherlv_11= 'Token' ( ( ruleEString ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSavingOrderAccess().getSavingOrderKeyword_0());
            		
            // InternalMyDsl.g:1306:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1307:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1307:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1308:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSavingOrderAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSavingOrderRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getSavingOrderAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,39,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getSavingOrderAccess().getAmountKeyword_3());
            		
            // InternalMyDsl.g:1333:3: ( (lv_Amount_4_0= ruleEFloat ) )
            // InternalMyDsl.g:1334:4: (lv_Amount_4_0= ruleEFloat )
            {
            // InternalMyDsl.g:1334:4: (lv_Amount_4_0= ruleEFloat )
            // InternalMyDsl.g:1335:5: lv_Amount_4_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getSavingOrderAccess().getAmountEFloatParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_43);
            lv_Amount_4_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSavingOrderRule());
            					}
            					set(
            						current,
            						"Amount",
            						lv_Amount_4_0,
            						"org.xtext.example.mydsl.MyDsl.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1352:3: (otherlv_5= 'MatureDate' ( (lv_MatureDate_6_0= ruleEDate ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1353:4: otherlv_5= 'MatureDate' ( (lv_MatureDate_6_0= ruleEDate ) )
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_44); 

                    				newLeafNode(otherlv_5, grammarAccess.getSavingOrderAccess().getMatureDateKeyword_5_0());
                    			
                    // InternalMyDsl.g:1357:4: ( (lv_MatureDate_6_0= ruleEDate ) )
                    // InternalMyDsl.g:1358:5: (lv_MatureDate_6_0= ruleEDate )
                    {
                    // InternalMyDsl.g:1358:5: (lv_MatureDate_6_0= ruleEDate )
                    // InternalMyDsl.g:1359:6: lv_MatureDate_6_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getSavingOrderAccess().getMatureDateEDateParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_MatureDate_6_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSavingOrderRule());
                    						}
                    						set(
                    							current,
                    							"MatureDate",
                    							lv_MatureDate_6_0,
                    							"org.xtext.example.mydsl.MyDsl.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,45,FOLLOW_33); 

            			newLeafNode(otherlv_7, grammarAccess.getSavingOrderAccess().getInterestKeyword_6());
            		
            // InternalMyDsl.g:1381:3: ( (lv_Interest_8_0= ruleEDouble ) )
            // InternalMyDsl.g:1382:4: (lv_Interest_8_0= ruleEDouble )
            {
            // InternalMyDsl.g:1382:4: (lv_Interest_8_0= ruleEDouble )
            // InternalMyDsl.g:1383:5: lv_Interest_8_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getSavingOrderAccess().getInterestEDoubleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_42);
            lv_Interest_8_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSavingOrderRule());
            					}
            					set(
            						current,
            						"Interest",
            						lv_Interest_8_0,
            						"org.xtext.example.mydsl.MyDsl.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getSavingOrderAccess().getAccountKeyword_8());
            		
            // InternalMyDsl.g:1404:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1405:4: ( ruleEString )
            {
            // InternalMyDsl.g:1405:4: ( ruleEString )
            // InternalMyDsl.g:1406:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSavingOrderRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSavingOrderAccess().getAccountAccountCrossReference_9_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getSavingOrderAccess().getTokenKeyword_10());
            		
            // InternalMyDsl.g:1424:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1425:4: ( ruleEString )
            {
            // InternalMyDsl.g:1425:4: ( ruleEString )
            // InternalMyDsl.g:1426:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSavingOrderRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSavingOrderAccess().getTokenTokenCrossReference_11_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getSavingOrderAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleSavingOrder"


    // $ANTLR start "entryRuleTokenBalance"
    // InternalMyDsl.g:1448:1: entryRuleTokenBalance returns [EObject current=null] : iv_ruleTokenBalance= ruleTokenBalance EOF ;
    public final EObject entryRuleTokenBalance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTokenBalance = null;


        try {
            // InternalMyDsl.g:1448:53: (iv_ruleTokenBalance= ruleTokenBalance EOF )
            // InternalMyDsl.g:1449:2: iv_ruleTokenBalance= ruleTokenBalance EOF
            {
             newCompositeNode(grammarAccess.getTokenBalanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTokenBalance=ruleTokenBalance();

            state._fsp--;

             current =iv_ruleTokenBalance; 
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
    // $ANTLR end "entryRuleTokenBalance"


    // $ANTLR start "ruleTokenBalance"
    // InternalMyDsl.g:1455:1: ruleTokenBalance returns [EObject current=null] : (otherlv_0= 'TokenBalance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'balance' ( (lv_balance_4_0= ruleEFloat ) ) otherlv_5= 'Token' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleTokenBalance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_balance_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1461:2: ( (otherlv_0= 'TokenBalance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'balance' ( (lv_balance_4_0= ruleEFloat ) ) otherlv_5= 'Token' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalMyDsl.g:1462:2: (otherlv_0= 'TokenBalance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'balance' ( (lv_balance_4_0= ruleEFloat ) ) otherlv_5= 'Token' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalMyDsl.g:1462:2: (otherlv_0= 'TokenBalance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'balance' ( (lv_balance_4_0= ruleEFloat ) ) otherlv_5= 'Token' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalMyDsl.g:1463:3: otherlv_0= 'TokenBalance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'balance' ( (lv_balance_4_0= ruleEFloat ) ) otherlv_5= 'Token' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTokenBalanceAccess().getTokenBalanceKeyword_0());
            		
            // InternalMyDsl.g:1467:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:1468:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:1468:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:1469:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTokenBalanceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTokenBalanceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getTokenBalanceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,47,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getTokenBalanceAccess().getBalanceKeyword_3());
            		
            // InternalMyDsl.g:1494:3: ( (lv_balance_4_0= ruleEFloat ) )
            // InternalMyDsl.g:1495:4: (lv_balance_4_0= ruleEFloat )
            {
            // InternalMyDsl.g:1495:4: (lv_balance_4_0= ruleEFloat )
            // InternalMyDsl.g:1496:5: lv_balance_4_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getTokenBalanceAccess().getBalanceEFloatParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_balance_4_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTokenBalanceRule());
            					}
            					set(
            						current,
            						"balance",
            						lv_balance_4_0,
            						"org.xtext.example.mydsl.MyDsl.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTokenBalanceAccess().getTokenKeyword_5());
            		
            // InternalMyDsl.g:1517:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1518:4: ( ruleEString )
            {
            // InternalMyDsl.g:1518:4: ( ruleEString )
            // InternalMyDsl.g:1519:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTokenBalanceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTokenBalanceAccess().getTokenTokenCrossReference_6_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTokenBalanceAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleTokenBalance"


    // $ANTLR start "entryRuleTransferRequest"
    // InternalMyDsl.g:1541:1: entryRuleTransferRequest returns [EObject current=null] : iv_ruleTransferRequest= ruleTransferRequest EOF ;
    public final EObject entryRuleTransferRequest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransferRequest = null;


        try {
            // InternalMyDsl.g:1541:56: (iv_ruleTransferRequest= ruleTransferRequest EOF )
            // InternalMyDsl.g:1542:2: iv_ruleTransferRequest= ruleTransferRequest EOF
            {
             newCompositeNode(grammarAccess.getTransferRequestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransferRequest=ruleTransferRequest();

            state._fsp--;

             current =iv_ruleTransferRequest; 
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
    // $ANTLR end "entryRuleTransferRequest"


    // $ANTLR start "ruleTransferRequest"
    // InternalMyDsl.g:1548:1: ruleTransferRequest returns [EObject current=null] : (otherlv_0= 'TransferRequest' ( (lv_ID_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTransferType ) ) )? otherlv_5= 'amount' ( (lv_amount_6_0= ruleEFloat ) ) otherlv_7= 'Token' ( ( ruleEString ) ) otherlv_9= 'Destination' ( ( ruleEString ) ) otherlv_11= '}' ) ;
    public final EObject ruleTransferRequest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_ID_1_0 = null;

        Enumerator lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_amount_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1554:2: ( (otherlv_0= 'TransferRequest' ( (lv_ID_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTransferType ) ) )? otherlv_5= 'amount' ( (lv_amount_6_0= ruleEFloat ) ) otherlv_7= 'Token' ( ( ruleEString ) ) otherlv_9= 'Destination' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalMyDsl.g:1555:2: (otherlv_0= 'TransferRequest' ( (lv_ID_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTransferType ) ) )? otherlv_5= 'amount' ( (lv_amount_6_0= ruleEFloat ) ) otherlv_7= 'Token' ( ( ruleEString ) ) otherlv_9= 'Destination' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalMyDsl.g:1555:2: (otherlv_0= 'TransferRequest' ( (lv_ID_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTransferType ) ) )? otherlv_5= 'amount' ( (lv_amount_6_0= ruleEFloat ) ) otherlv_7= 'Token' ( ( ruleEString ) ) otherlv_9= 'Destination' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalMyDsl.g:1556:3: otherlv_0= 'TransferRequest' ( (lv_ID_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleTransferType ) ) )? otherlv_5= 'amount' ( (lv_amount_6_0= ruleEFloat ) ) otherlv_7= 'Token' ( ( ruleEString ) ) otherlv_9= 'Destination' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransferRequestAccess().getTransferRequestKeyword_0());
            		
            // InternalMyDsl.g:1560:3: ( (lv_ID_1_0= ruleEString ) )
            // InternalMyDsl.g:1561:4: (lv_ID_1_0= ruleEString )
            {
            // InternalMyDsl.g:1561:4: (lv_ID_1_0= ruleEString )
            // InternalMyDsl.g:1562:5: lv_ID_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransferRequestAccess().getIDEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_ID_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransferRequestRule());
            					}
            					set(
            						current,
            						"ID",
            						lv_ID_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getTransferRequestAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1583:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleTransferType ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==49) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1584:4: otherlv_3= 'type' ( (lv_type_4_0= ruleTransferType ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_48); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransferRequestAccess().getTypeKeyword_3_0());
                    			
                    // InternalMyDsl.g:1588:4: ( (lv_type_4_0= ruleTransferType ) )
                    // InternalMyDsl.g:1589:5: (lv_type_4_0= ruleTransferType )
                    {
                    // InternalMyDsl.g:1589:5: (lv_type_4_0= ruleTransferType )
                    // InternalMyDsl.g:1590:6: lv_type_4_0= ruleTransferType
                    {

                    						newCompositeNode(grammarAccess.getTransferRequestAccess().getTypeTransferTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_type_4_0=ruleTransferType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransferRequestRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.xtext.example.mydsl.MyDsl.TransferType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,50,FOLLOW_33); 

            			newLeafNode(otherlv_5, grammarAccess.getTransferRequestAccess().getAmountKeyword_4());
            		
            // InternalMyDsl.g:1612:3: ( (lv_amount_6_0= ruleEFloat ) )
            // InternalMyDsl.g:1613:4: (lv_amount_6_0= ruleEFloat )
            {
            // InternalMyDsl.g:1613:4: (lv_amount_6_0= ruleEFloat )
            // InternalMyDsl.g:1614:5: lv_amount_6_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getTransferRequestAccess().getAmountEFloatParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_amount_6_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransferRequestRule());
            					}
            					set(
            						current,
            						"amount",
            						lv_amount_6_0,
            						"org.xtext.example.mydsl.MyDsl.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getTransferRequestAccess().getTokenKeyword_6());
            		
            // InternalMyDsl.g:1635:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1636:4: ( ruleEString )
            {
            // InternalMyDsl.g:1636:4: ( ruleEString )
            // InternalMyDsl.g:1637:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransferRequestRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransferRequestAccess().getTokenTokenCrossReference_7_0());
            				
            pushFollow(FOLLOW_50);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getTransferRequestAccess().getDestinationKeyword_8());
            		
            // InternalMyDsl.g:1655:3: ( ( ruleEString ) )
            // InternalMyDsl.g:1656:4: ( ruleEString )
            {
            // InternalMyDsl.g:1656:4: ( ruleEString )
            // InternalMyDsl.g:1657:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransferRequestRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransferRequestAccess().getDestinationAccountCrossReference_9_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTransferRequestAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleTransferRequest"


    // $ANTLR start "entryRuleEFloat"
    // InternalMyDsl.g:1679:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalMyDsl.g:1679:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalMyDsl.g:1680:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalMyDsl.g:1686:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1692:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalMyDsl.g:1693:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalMyDsl.g:1693:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalMyDsl.g:1694:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalMyDsl.g:1694:3: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==52) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1695:4: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_51); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1701:3: (this_INT_1= RULE_INT )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1702:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_52); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,53,FOLLOW_53); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_54); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalMyDsl.g:1722:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=54 && LA29_0<=55)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1723:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalMyDsl.g:1723:4: (kw= 'E' | kw= 'e' )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==54) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==55) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalMyDsl.g:1724:5: kw= 'E'
                            {
                            kw=(Token)match(input,54,FOLLOW_25); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1730:5: kw= 'e'
                            {
                            kw=(Token)match(input,55,FOLLOW_25); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:1736:4: (kw= '-' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==52) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalMyDsl.g:1737:5: kw= '-'
                            {
                            kw=(Token)match(input,52,FOLLOW_53); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleEDate"
    // InternalMyDsl.g:1755:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalMyDsl.g:1755:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalMyDsl.g:1756:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
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
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalMyDsl.g:1762:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1768:2: (kw= 'EDate' )
            // InternalMyDsl.g:1769:2: kw= 'EDate'
            {
            kw=(Token)match(input,56,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEDateAccess().getEDateKeyword());
            	

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
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleEDouble"
    // InternalMyDsl.g:1777:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalMyDsl.g:1777:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalMyDsl.g:1778:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalMyDsl.g:1784:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1790:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalMyDsl.g:1791:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalMyDsl.g:1791:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalMyDsl.g:1792:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalMyDsl.g:1792:3: (kw= '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==52) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1793:4: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_51); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1799:3: (this_INT_1= RULE_INT )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1800:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_52); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,53,FOLLOW_53); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_54); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalMyDsl.g:1820:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=54 && LA34_0<=55)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:1821:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalMyDsl.g:1821:4: (kw= 'E' | kw= 'e' )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==54) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==55) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalMyDsl.g:1822:5: kw= 'E'
                            {
                            kw=(Token)match(input,54,FOLLOW_25); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1828:5: kw= 'e'
                            {
                            kw=(Token)match(input,55,FOLLOW_25); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:1834:4: (kw= '-' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==52) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalMyDsl.g:1835:5: kw= '-'
                            {
                            kw=(Token)match(input,52,FOLLOW_53); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:1853:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:1853:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:1854:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:1860:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1866:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:1867:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:1867:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:1868:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:1868:3: (kw= '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==52) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:1869:4: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_53); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleSubSystemName"
    // InternalMyDsl.g:1886:1: ruleSubSystemName returns [Enumerator current=null] : ( (enumLiteral_0= 'Spot' ) | (enumLiteral_1= 'Future' ) | (enumLiteral_2= 'Margin' ) | (enumLiteral_3= 'Saving' ) ) ;
    public final Enumerator ruleSubSystemName() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1892:2: ( ( (enumLiteral_0= 'Spot' ) | (enumLiteral_1= 'Future' ) | (enumLiteral_2= 'Margin' ) | (enumLiteral_3= 'Saving' ) ) )
            // InternalMyDsl.g:1893:2: ( (enumLiteral_0= 'Spot' ) | (enumLiteral_1= 'Future' ) | (enumLiteral_2= 'Margin' ) | (enumLiteral_3= 'Saving' ) )
            {
            // InternalMyDsl.g:1893:2: ( (enumLiteral_0= 'Spot' ) | (enumLiteral_1= 'Future' ) | (enumLiteral_2= 'Margin' ) | (enumLiteral_3= 'Saving' ) )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt36=1;
                }
                break;
            case 58:
                {
                alt36=2;
                }
                break;
            case 59:
                {
                alt36=3;
                }
                break;
            case 60:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:1894:3: (enumLiteral_0= 'Spot' )
                    {
                    // InternalMyDsl.g:1894:3: (enumLiteral_0= 'Spot' )
                    // InternalMyDsl.g:1895:4: enumLiteral_0= 'Spot'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getSubSystemNameAccess().getSpotEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSubSystemNameAccess().getSpotEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1902:3: (enumLiteral_1= 'Future' )
                    {
                    // InternalMyDsl.g:1902:3: (enumLiteral_1= 'Future' )
                    // InternalMyDsl.g:1903:4: enumLiteral_1= 'Future'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getSubSystemNameAccess().getFutureEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSubSystemNameAccess().getFutureEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1910:3: (enumLiteral_2= 'Margin' )
                    {
                    // InternalMyDsl.g:1910:3: (enumLiteral_2= 'Margin' )
                    // InternalMyDsl.g:1911:4: enumLiteral_2= 'Margin'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getSubSystemNameAccess().getMarginEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSubSystemNameAccess().getMarginEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1918:3: (enumLiteral_3= 'Saving' )
                    {
                    // InternalMyDsl.g:1918:3: (enumLiteral_3= 'Saving' )
                    // InternalMyDsl.g:1919:4: enumLiteral_3= 'Saving'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getSubSystemNameAccess().getSavingEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSubSystemNameAccess().getSavingEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleSubSystemName"


    // $ANTLR start "ruleTransferType"
    // InternalMyDsl.g:1929:1: ruleTransferType returns [Enumerator current=null] : ( (enumLiteral_0= 'IntraExchange' ) | (enumLiteral_1= 'ExtraExchange' ) ) ;
    public final Enumerator ruleTransferType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1935:2: ( ( (enumLiteral_0= 'IntraExchange' ) | (enumLiteral_1= 'ExtraExchange' ) ) )
            // InternalMyDsl.g:1936:2: ( (enumLiteral_0= 'IntraExchange' ) | (enumLiteral_1= 'ExtraExchange' ) )
            {
            // InternalMyDsl.g:1936:2: ( (enumLiteral_0= 'IntraExchange' ) | (enumLiteral_1= 'ExtraExchange' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==61) ) {
                alt37=1;
            }
            else if ( (LA37_0==62) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1937:3: (enumLiteral_0= 'IntraExchange' )
                    {
                    // InternalMyDsl.g:1937:3: (enumLiteral_0= 'IntraExchange' )
                    // InternalMyDsl.g:1938:4: enumLiteral_0= 'IntraExchange'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getTransferTypeAccess().getIntraExchangeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTransferTypeAccess().getIntraExchangeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1945:3: (enumLiteral_1= 'ExtraExchange' )
                    {
                    // InternalMyDsl.g:1945:3: (enumLiteral_1= 'ExtraExchange' )
                    // InternalMyDsl.g:1946:4: enumLiteral_1= 'ExtraExchange'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getTransferTypeAccess().getExtraExchangeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTransferTypeAccess().getExtraExchangeEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleTransferType"


    // $ANTLR start "ruleLeverageType"
    // InternalMyDsl.g:1956:1: ruleLeverageType returns [Enumerator current=null] : ( (enumLiteral_0= '_1x' ) | (enumLiteral_1= '_2x' ) | (enumLiteral_2= '_5x' ) | (enumLiteral_3= '_10x' ) ) ;
    public final Enumerator ruleLeverageType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1962:2: ( ( (enumLiteral_0= '_1x' ) | (enumLiteral_1= '_2x' ) | (enumLiteral_2= '_5x' ) | (enumLiteral_3= '_10x' ) ) )
            // InternalMyDsl.g:1963:2: ( (enumLiteral_0= '_1x' ) | (enumLiteral_1= '_2x' ) | (enumLiteral_2= '_5x' ) | (enumLiteral_3= '_10x' ) )
            {
            // InternalMyDsl.g:1963:2: ( (enumLiteral_0= '_1x' ) | (enumLiteral_1= '_2x' ) | (enumLiteral_2= '_5x' ) | (enumLiteral_3= '_10x' ) )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt38=1;
                }
                break;
            case 64:
                {
                alt38=2;
                }
                break;
            case 65:
                {
                alt38=3;
                }
                break;
            case 66:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:1964:3: (enumLiteral_0= '_1x' )
                    {
                    // InternalMyDsl.g:1964:3: (enumLiteral_0= '_1x' )
                    // InternalMyDsl.g:1965:4: enumLiteral_0= '_1x'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getLeverageTypeAccess().get_1xEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLeverageTypeAccess().get_1xEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1972:3: (enumLiteral_1= '_2x' )
                    {
                    // InternalMyDsl.g:1972:3: (enumLiteral_1= '_2x' )
                    // InternalMyDsl.g:1973:4: enumLiteral_1= '_2x'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getLeverageTypeAccess().get_2xEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLeverageTypeAccess().get_2xEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1980:3: (enumLiteral_2= '_5x' )
                    {
                    // InternalMyDsl.g:1980:3: (enumLiteral_2= '_5x' )
                    // InternalMyDsl.g:1981:4: enumLiteral_2= '_5x'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getLeverageTypeAccess().get_5xEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLeverageTypeAccess().get_5xEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1988:3: (enumLiteral_3= '_10x' )
                    {
                    // InternalMyDsl.g:1988:3: (enumLiteral_3= '_10x' )
                    // InternalMyDsl.g:1989:4: enumLiteral_3= '_10x'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getLeverageTypeAccess().get_10xEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLeverageTypeAccess().get_10xEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleLeverageType"


    // $ANTLR start "ruleOrderType"
    // InternalMyDsl.g:1999:1: ruleOrderType returns [Enumerator current=null] : ( (enumLiteral_0= 'buy' ) | (enumLiteral_1= 'sell' ) | (enumLiteral_2= 'leverageLong' ) | (enumLiteral_3= 'leverageShort' ) ) ;
    public final Enumerator ruleOrderType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2005:2: ( ( (enumLiteral_0= 'buy' ) | (enumLiteral_1= 'sell' ) | (enumLiteral_2= 'leverageLong' ) | (enumLiteral_3= 'leverageShort' ) ) )
            // InternalMyDsl.g:2006:2: ( (enumLiteral_0= 'buy' ) | (enumLiteral_1= 'sell' ) | (enumLiteral_2= 'leverageLong' ) | (enumLiteral_3= 'leverageShort' ) )
            {
            // InternalMyDsl.g:2006:2: ( (enumLiteral_0= 'buy' ) | (enumLiteral_1= 'sell' ) | (enumLiteral_2= 'leverageLong' ) | (enumLiteral_3= 'leverageShort' ) )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt39=1;
                }
                break;
            case 68:
                {
                alt39=2;
                }
                break;
            case 69:
                {
                alt39=3;
                }
                break;
            case 70:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:2007:3: (enumLiteral_0= 'buy' )
                    {
                    // InternalMyDsl.g:2007:3: (enumLiteral_0= 'buy' )
                    // InternalMyDsl.g:2008:4: enumLiteral_0= 'buy'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getOrderTypeAccess().getBuyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOrderTypeAccess().getBuyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2015:3: (enumLiteral_1= 'sell' )
                    {
                    // InternalMyDsl.g:2015:3: (enumLiteral_1= 'sell' )
                    // InternalMyDsl.g:2016:4: enumLiteral_1= 'sell'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getOrderTypeAccess().getSellEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOrderTypeAccess().getSellEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2023:3: (enumLiteral_2= 'leverageLong' )
                    {
                    // InternalMyDsl.g:2023:3: (enumLiteral_2= 'leverageLong' )
                    // InternalMyDsl.g:2024:4: enumLiteral_2= 'leverageLong'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getOrderTypeAccess().getLeverageLongEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOrderTypeAccess().getLeverageLongEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2031:3: (enumLiteral_3= 'leverageShort' )
                    {
                    // InternalMyDsl.g:2031:3: (enumLiteral_3= 'leverageShort' )
                    // InternalMyDsl.g:2032:4: enumLiteral_3= 'leverageShort'
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getOrderTypeAccess().getLeverageShortEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOrderTypeAccess().getLeverageShortEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleOrderType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x1E00000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000F20000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000E20000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000C20000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0010000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000180020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0030000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0020000000000040L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x00C0000000000002L});

}