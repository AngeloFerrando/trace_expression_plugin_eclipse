package it.unige.dibris.trace_expression_language.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.unige.dibris.trace_expression_language.services.TExpGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTExpParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ATOM", "RULE_OP1200XFX", "RULE_OP1200FX", "RULE_OP1150FX", "RULE_OP1100XFY", "RULE_OP1050XFY", "RULE_OP1000XFY", "RULE_OP954XFY", "RULE_OP900FY", "RULE_OP900FX", "RULE_OP700XFX", "RULE_OP700XFXR", "RULE_OP700XFXL", "RULE_OP600XFY", "RULE_OP500YFX", "RULE_OP500FX", "RULE_OP400YFX", "RULE_OP200XFX", "RULE_OP200XFY", "RULE_INT", "RULE_EXT_INT", "RULE_VARIABLE", "RULE_STRING", "RULE_OP400FX1", "RULE_WHITESPACE", "RULE_SINGLE_LINE_COMMENT", "'.'", "'!'", "'('", "')'", "'['", "'|'", "']'", "'trace_expression'", "'{'", "'id:'", "'body:'", "'modules:'", "'types:'", "'}'", "'interaction_trace_expression'", "'roles:'", "'decentralized:'", "'true'", "'false'", "'partition:'", "'constraints:'", "'gui:'", "'target:'", "'minimal:'", "'threshold:'", "'channels:'", "'derived'", "'<-'", "'\\\\/'", "'/\\\\'", "'*'", "'epsilon'", "'=>'", "'$'", "'-><-'", "'<-->'", "'number_singletons'", "'size_constraints'", "'number_constraints'"
    };
    public static final int RULE_OP700XFXL=16;
    public static final int T__50=50;
    public static final int RULE_OP700XFXR=15;
    public static final int RULE_OP1100XFY=8;
    public static final int T__59=59;
    public static final int RULE_ATOM=4;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_OP1200FX=6;
    public static final int T__58=58;
    public static final int RULE_SINGLE_LINE_COMMENT=29;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_OP400FX1=27;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_OP1150FX=7;
    public static final int RULE_OP500FX=19;
    public static final int RULE_INT=23;
    public static final int RULE_OP1000XFY=10;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int RULE_OP200XFX=21;
    public static final int RULE_OP200XFY=22;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_STRING=26;
    public static final int RULE_OP1050XFY=9;
    public static final int RULE_OP400YFX=20;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_OP954XFY=11;
    public static final int T__33=33;
    public static final int RULE_OP700XFX=14;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_WHITESPACE=28;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_OP600XFY=17;
    public static final int RULE_OP900FY=12;
    public static final int RULE_EXT_INT=24;
    public static final int RULE_OP900FX=13;
    public static final int RULE_VARIABLE=25;
    public static final int RULE_OP1200XFX=5;
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
    public static final int RULE_OP500YFX=18;

    // delegates
    // delegators


        public InternalTExpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTExpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTExpParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTExp.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private TExpGrammarAccess grammarAccess;

        public InternalTExpParser(TokenStream input, TExpGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected TExpGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalTExp.g:70:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalTExp.g:70:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalTExp.g:71:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainmodelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainmodel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalTExp.g:77:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleTraceExpression ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:83:2: ( ( (lv_elements_0_0= ruleTraceExpression ) )* )
            // InternalTExp.g:84:2: ( (lv_elements_0_0= ruleTraceExpression ) )*
            {
            // InternalTExp.g:84:2: ( (lv_elements_0_0= ruleTraceExpression ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==37||LA1_0==44) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTExp.g:85:3: (lv_elements_0_0= ruleTraceExpression )
            	    {
            	    // InternalTExp.g:85:3: (lv_elements_0_0= ruleTraceExpression )
            	    // InternalTExp.g:86:4: lv_elements_0_0= ruleTraceExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsTraceExpressionParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleTraceExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"elements",
            	      					lv_elements_0_0,
            	      					"it.unige.dibris.trace_expression_language.TExp.TraceExpression");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleID"
    // InternalTExp.g:106:1: entryRuleID returns [String current=null] : iv_ruleID= ruleID EOF ;
    public final String entryRuleID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleID = null;


        try {
            // InternalTExp.g:106:42: (iv_ruleID= ruleID EOF )
            // InternalTExp.g:107:2: iv_ruleID= ruleID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleID=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleID"


    // $ANTLR start "ruleID"
    // InternalTExp.g:113:1: ruleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ATOM_0= RULE_ATOM ;
    public final AntlrDatatypeRuleToken ruleID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ATOM_0=null;


        	enterRule();

        try {
            // InternalTExp.g:119:2: (this_ATOM_0= RULE_ATOM )
            // InternalTExp.g:120:2: this_ATOM_0= RULE_ATOM
            {
            this_ATOM_0=(Token)match(input,RULE_ATOM,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ATOM_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ATOM_0, grammarAccess.getIDAccess().getATOMTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleID"


    // $ANTLR start "entryRuleATOMS"
    // InternalTExp.g:130:1: entryRuleATOMS returns [String current=null] : iv_ruleATOMS= ruleATOMS EOF ;
    public final String entryRuleATOMS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleATOMS = null;


        try {
            // InternalTExp.g:130:45: (iv_ruleATOMS= ruleATOMS EOF )
            // InternalTExp.g:131:2: iv_ruleATOMS= ruleATOMS EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getATOMSRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleATOMS=ruleATOMS();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleATOMS.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleATOMS"


    // $ANTLR start "ruleATOMS"
    // InternalTExp.g:137:1: ruleATOMS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '.' | kw= '!' | this_ID_2= ruleID | this_OP1200XFX_3= RULE_OP1200XFX | this_OP1200FX_4= RULE_OP1200FX | this_OP1150FX_5= RULE_OP1150FX | this_OP1100XFY_6= RULE_OP1100XFY | this_OP1050XFY_7= RULE_OP1050XFY | this_OP1000XFY_8= RULE_OP1000XFY | this_OP954XFY_9= RULE_OP954XFY | this_OP900FY_10= RULE_OP900FY | this_OP900FX_11= RULE_OP900FX | this_OP700XFX_12= RULE_OP700XFX | this_OP700XFXR_13= RULE_OP700XFXR | this_OP700XFXL_14= RULE_OP700XFXL | this_OP600XFY_15= RULE_OP600XFY | this_OP500YFX_16= RULE_OP500YFX | this_OP500FX_17= RULE_OP500FX | this_OP400YFX_18= RULE_OP400YFX | this_OP200XFX_19= RULE_OP200XFX | this_OP200XFY_20= RULE_OP200XFY ) ;
    public final AntlrDatatypeRuleToken ruleATOMS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_OP1200XFX_3=null;
        Token this_OP1200FX_4=null;
        Token this_OP1150FX_5=null;
        Token this_OP1100XFY_6=null;
        Token this_OP1050XFY_7=null;
        Token this_OP1000XFY_8=null;
        Token this_OP954XFY_9=null;
        Token this_OP900FY_10=null;
        Token this_OP900FX_11=null;
        Token this_OP700XFX_12=null;
        Token this_OP700XFXR_13=null;
        Token this_OP700XFXL_14=null;
        Token this_OP600XFY_15=null;
        Token this_OP500YFX_16=null;
        Token this_OP500FX_17=null;
        Token this_OP400YFX_18=null;
        Token this_OP200XFX_19=null;
        Token this_OP200XFY_20=null;
        AntlrDatatypeRuleToken this_ID_2 = null;



        	enterRule();

        try {
            // InternalTExp.g:143:2: ( (kw= '.' | kw= '!' | this_ID_2= ruleID | this_OP1200XFX_3= RULE_OP1200XFX | this_OP1200FX_4= RULE_OP1200FX | this_OP1150FX_5= RULE_OP1150FX | this_OP1100XFY_6= RULE_OP1100XFY | this_OP1050XFY_7= RULE_OP1050XFY | this_OP1000XFY_8= RULE_OP1000XFY | this_OP954XFY_9= RULE_OP954XFY | this_OP900FY_10= RULE_OP900FY | this_OP900FX_11= RULE_OP900FX | this_OP700XFX_12= RULE_OP700XFX | this_OP700XFXR_13= RULE_OP700XFXR | this_OP700XFXL_14= RULE_OP700XFXL | this_OP600XFY_15= RULE_OP600XFY | this_OP500YFX_16= RULE_OP500YFX | this_OP500FX_17= RULE_OP500FX | this_OP400YFX_18= RULE_OP400YFX | this_OP200XFX_19= RULE_OP200XFX | this_OP200XFY_20= RULE_OP200XFY ) )
            // InternalTExp.g:144:2: (kw= '.' | kw= '!' | this_ID_2= ruleID | this_OP1200XFX_3= RULE_OP1200XFX | this_OP1200FX_4= RULE_OP1200FX | this_OP1150FX_5= RULE_OP1150FX | this_OP1100XFY_6= RULE_OP1100XFY | this_OP1050XFY_7= RULE_OP1050XFY | this_OP1000XFY_8= RULE_OP1000XFY | this_OP954XFY_9= RULE_OP954XFY | this_OP900FY_10= RULE_OP900FY | this_OP900FX_11= RULE_OP900FX | this_OP700XFX_12= RULE_OP700XFX | this_OP700XFXR_13= RULE_OP700XFXR | this_OP700XFXL_14= RULE_OP700XFXL | this_OP600XFY_15= RULE_OP600XFY | this_OP500YFX_16= RULE_OP500YFX | this_OP500FX_17= RULE_OP500FX | this_OP400YFX_18= RULE_OP400YFX | this_OP200XFX_19= RULE_OP200XFX | this_OP200XFY_20= RULE_OP200XFY )
            {
            // InternalTExp.g:144:2: (kw= '.' | kw= '!' | this_ID_2= ruleID | this_OP1200XFX_3= RULE_OP1200XFX | this_OP1200FX_4= RULE_OP1200FX | this_OP1150FX_5= RULE_OP1150FX | this_OP1100XFY_6= RULE_OP1100XFY | this_OP1050XFY_7= RULE_OP1050XFY | this_OP1000XFY_8= RULE_OP1000XFY | this_OP954XFY_9= RULE_OP954XFY | this_OP900FY_10= RULE_OP900FY | this_OP900FX_11= RULE_OP900FX | this_OP700XFX_12= RULE_OP700XFX | this_OP700XFXR_13= RULE_OP700XFXR | this_OP700XFXL_14= RULE_OP700XFXL | this_OP600XFY_15= RULE_OP600XFY | this_OP500YFX_16= RULE_OP500YFX | this_OP500FX_17= RULE_OP500FX | this_OP400YFX_18= RULE_OP400YFX | this_OP200XFX_19= RULE_OP200XFX | this_OP200XFY_20= RULE_OP200XFY )
            int alt2=21;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case RULE_ATOM:
                {
                alt2=3;
                }
                break;
            case RULE_OP1200XFX:
                {
                alt2=4;
                }
                break;
            case RULE_OP1200FX:
                {
                alt2=5;
                }
                break;
            case RULE_OP1150FX:
                {
                alt2=6;
                }
                break;
            case RULE_OP1100XFY:
                {
                alt2=7;
                }
                break;
            case RULE_OP1050XFY:
                {
                alt2=8;
                }
                break;
            case RULE_OP1000XFY:
                {
                alt2=9;
                }
                break;
            case RULE_OP954XFY:
                {
                alt2=10;
                }
                break;
            case RULE_OP900FY:
                {
                alt2=11;
                }
                break;
            case RULE_OP900FX:
                {
                alt2=12;
                }
                break;
            case RULE_OP700XFX:
                {
                alt2=13;
                }
                break;
            case RULE_OP700XFXR:
                {
                alt2=14;
                }
                break;
            case RULE_OP700XFXL:
                {
                alt2=15;
                }
                break;
            case RULE_OP600XFY:
                {
                alt2=16;
                }
                break;
            case RULE_OP500YFX:
                {
                alt2=17;
                }
                break;
            case RULE_OP500FX:
                {
                alt2=18;
                }
                break;
            case RULE_OP400YFX:
                {
                alt2=19;
                }
                break;
            case RULE_OP200XFX:
                {
                alt2=20;
                }
                break;
            case RULE_OP200XFY:
                {
                alt2=21;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalTExp.g:145:3: kw= '.'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getATOMSAccess().getFullStopKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTExp.g:151:3: kw= '!'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getATOMSAccess().getExclamationMarkKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalTExp.g:157:3: this_ID_2= ruleID
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getATOMSAccess().getIDParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ID_2=ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalTExp.g:168:3: this_OP1200XFX_3= RULE_OP1200XFX
                    {
                    this_OP1200XFX_3=(Token)match(input,RULE_OP1200XFX,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP1200XFX_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP1200XFX_3, grammarAccess.getATOMSAccess().getOP1200XFXTerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalTExp.g:176:3: this_OP1200FX_4= RULE_OP1200FX
                    {
                    this_OP1200FX_4=(Token)match(input,RULE_OP1200FX,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP1200FX_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP1200FX_4, grammarAccess.getATOMSAccess().getOP1200FXTerminalRuleCall_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalTExp.g:184:3: this_OP1150FX_5= RULE_OP1150FX
                    {
                    this_OP1150FX_5=(Token)match(input,RULE_OP1150FX,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP1150FX_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP1150FX_5, grammarAccess.getATOMSAccess().getOP1150FXTerminalRuleCall_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalTExp.g:192:3: this_OP1100XFY_6= RULE_OP1100XFY
                    {
                    this_OP1100XFY_6=(Token)match(input,RULE_OP1100XFY,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP1100XFY_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP1100XFY_6, grammarAccess.getATOMSAccess().getOP1100XFYTerminalRuleCall_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalTExp.g:200:3: this_OP1050XFY_7= RULE_OP1050XFY
                    {
                    this_OP1050XFY_7=(Token)match(input,RULE_OP1050XFY,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP1050XFY_7);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP1050XFY_7, grammarAccess.getATOMSAccess().getOP1050XFYTerminalRuleCall_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalTExp.g:208:3: this_OP1000XFY_8= RULE_OP1000XFY
                    {
                    this_OP1000XFY_8=(Token)match(input,RULE_OP1000XFY,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP1000XFY_8);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP1000XFY_8, grammarAccess.getATOMSAccess().getOP1000XFYTerminalRuleCall_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalTExp.g:216:3: this_OP954XFY_9= RULE_OP954XFY
                    {
                    this_OP954XFY_9=(Token)match(input,RULE_OP954XFY,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP954XFY_9);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP954XFY_9, grammarAccess.getATOMSAccess().getOP954XFYTerminalRuleCall_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalTExp.g:224:3: this_OP900FY_10= RULE_OP900FY
                    {
                    this_OP900FY_10=(Token)match(input,RULE_OP900FY,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP900FY_10);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP900FY_10, grammarAccess.getATOMSAccess().getOP900FYTerminalRuleCall_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalTExp.g:232:3: this_OP900FX_11= RULE_OP900FX
                    {
                    this_OP900FX_11=(Token)match(input,RULE_OP900FX,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP900FX_11);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP900FX_11, grammarAccess.getATOMSAccess().getOP900FXTerminalRuleCall_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalTExp.g:240:3: this_OP700XFX_12= RULE_OP700XFX
                    {
                    this_OP700XFX_12=(Token)match(input,RULE_OP700XFX,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP700XFX_12);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP700XFX_12, grammarAccess.getATOMSAccess().getOP700XFXTerminalRuleCall_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalTExp.g:248:3: this_OP700XFXR_13= RULE_OP700XFXR
                    {
                    this_OP700XFXR_13=(Token)match(input,RULE_OP700XFXR,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP700XFXR_13);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP700XFXR_13, grammarAccess.getATOMSAccess().getOP700XFXRTerminalRuleCall_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalTExp.g:256:3: this_OP700XFXL_14= RULE_OP700XFXL
                    {
                    this_OP700XFXL_14=(Token)match(input,RULE_OP700XFXL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP700XFXL_14);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP700XFXL_14, grammarAccess.getATOMSAccess().getOP700XFXLTerminalRuleCall_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalTExp.g:264:3: this_OP600XFY_15= RULE_OP600XFY
                    {
                    this_OP600XFY_15=(Token)match(input,RULE_OP600XFY,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP600XFY_15);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP600XFY_15, grammarAccess.getATOMSAccess().getOP600XFYTerminalRuleCall_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalTExp.g:272:3: this_OP500YFX_16= RULE_OP500YFX
                    {
                    this_OP500YFX_16=(Token)match(input,RULE_OP500YFX,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP500YFX_16);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP500YFX_16, grammarAccess.getATOMSAccess().getOP500YFXTerminalRuleCall_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalTExp.g:280:3: this_OP500FX_17= RULE_OP500FX
                    {
                    this_OP500FX_17=(Token)match(input,RULE_OP500FX,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP500FX_17);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP500FX_17, grammarAccess.getATOMSAccess().getOP500FXTerminalRuleCall_17());
                      		
                    }

                    }
                    break;
                case 19 :
                    // InternalTExp.g:288:3: this_OP400YFX_18= RULE_OP400YFX
                    {
                    this_OP400YFX_18=(Token)match(input,RULE_OP400YFX,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP400YFX_18);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP400YFX_18, grammarAccess.getATOMSAccess().getOP400YFXTerminalRuleCall_18());
                      		
                    }

                    }
                    break;
                case 20 :
                    // InternalTExp.g:296:3: this_OP200XFX_19= RULE_OP200XFX
                    {
                    this_OP200XFX_19=(Token)match(input,RULE_OP200XFX,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP200XFX_19);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP200XFX_19, grammarAccess.getATOMSAccess().getOP200XFXTerminalRuleCall_19());
                      		
                    }

                    }
                    break;
                case 21 :
                    // InternalTExp.g:304:3: this_OP200XFY_20= RULE_OP200XFY
                    {
                    this_OP200XFY_20=(Token)match(input,RULE_OP200XFY,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_OP200XFY_20);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_OP200XFY_20, grammarAccess.getATOMSAccess().getOP200XFYTerminalRuleCall_20());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleATOMS"


    // $ANTLR start "entryRuleNUMBER"
    // InternalTExp.g:315:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTExp.g:317:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalTExp.g:318:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalTExp.g:327:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_EXT_INT_2=null;
        Token this_INT_3=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTExp.g:334:2: ( (this_INT_0= RULE_INT (kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )? ) )
            // InternalTExp.g:335:2: (this_INT_0= RULE_INT (kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )? )
            {
            // InternalTExp.g:335:2: (this_INT_0= RULE_INT (kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )? )
            // InternalTExp.g:336:3: this_INT_0= RULE_INT (kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0());
              		
            }
            // InternalTExp.g:343:3: (kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTExp.g:344:4: kw= '.' (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT )
                    {
                    kw=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:349:4: (this_EXT_INT_2= RULE_EXT_INT | this_INT_3= RULE_INT )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_EXT_INT) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==RULE_INT) ) {
                        alt3=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalTExp.g:350:5: this_EXT_INT_2= RULE_EXT_INT
                            {
                            this_EXT_INT_2=(Token)match(input,RULE_EXT_INT,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_EXT_INT_2);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_EXT_INT_2, grammarAccess.getNUMBERAccess().getEXT_INTTerminalRuleCall_1_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalTExp.g:358:5: this_INT_3= RULE_INT
                            {
                            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_INT_3);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_INT_3, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleExpressionInfinity"
    // InternalTExp.g:374:1: entryRuleExpressionInfinity returns [EObject current=null] : iv_ruleExpressionInfinity= ruleExpressionInfinity EOF ;
    public final EObject entryRuleExpressionInfinity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionInfinity = null;


        try {
            // InternalTExp.g:374:59: (iv_ruleExpressionInfinity= ruleExpressionInfinity EOF )
            // InternalTExp.g:375:2: iv_ruleExpressionInfinity= ruleExpressionInfinity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionInfinityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionInfinity=ruleExpressionInfinity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionInfinity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpressionInfinity"


    // $ANTLR start "ruleExpressionInfinity"
    // InternalTExp.g:381:1: ruleExpressionInfinity returns [EObject current=null] : this_Expression1100xfy_0= ruleExpression1100xfy ;
    public final EObject ruleExpressionInfinity() throws RecognitionException {
        EObject current = null;

        EObject this_Expression1100xfy_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:387:2: (this_Expression1100xfy_0= ruleExpression1100xfy )
            // InternalTExp.g:388:2: this_Expression1100xfy_0= ruleExpression1100xfy
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionInfinityAccess().getExpression1100xfyParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Expression1100xfy_0=ruleExpression1100xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Expression1100xfy_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpressionInfinity"


    // $ANTLR start "entryRuleExpression1100xfy"
    // InternalTExp.g:402:1: entryRuleExpression1100xfy returns [EObject current=null] : iv_ruleExpression1100xfy= ruleExpression1100xfy EOF ;
    public final EObject entryRuleExpression1100xfy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression1100xfy = null;


        try {
            // InternalTExp.g:402:58: (iv_ruleExpression1100xfy= ruleExpression1100xfy EOF )
            // InternalTExp.g:403:2: iv_ruleExpression1100xfy= ruleExpression1100xfy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression1100xfyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression1100xfy=ruleExpression1100xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression1100xfy; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression1100xfy"


    // $ANTLR start "ruleExpression1100xfy"
    // InternalTExp.g:409:1: ruleExpression1100xfy returns [EObject current=null] : (this_Expression1050xfy_0= ruleExpression1050xfy ( () ( (lv_op_2_0= RULE_OP1100XFY ) ) ( (lv_right_3_0= ruleExpression1100xfy ) ) )? ) ;
    public final EObject ruleExpression1100xfy() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression1050xfy_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:415:2: ( (this_Expression1050xfy_0= ruleExpression1050xfy ( () ( (lv_op_2_0= RULE_OP1100XFY ) ) ( (lv_right_3_0= ruleExpression1100xfy ) ) )? ) )
            // InternalTExp.g:416:2: (this_Expression1050xfy_0= ruleExpression1050xfy ( () ( (lv_op_2_0= RULE_OP1100XFY ) ) ( (lv_right_3_0= ruleExpression1100xfy ) ) )? )
            {
            // InternalTExp.g:416:2: (this_Expression1050xfy_0= ruleExpression1050xfy ( () ( (lv_op_2_0= RULE_OP1100XFY ) ) ( (lv_right_3_0= ruleExpression1100xfy ) ) )? )
            // InternalTExp.g:417:3: this_Expression1050xfy_0= ruleExpression1050xfy ( () ( (lv_op_2_0= RULE_OP1100XFY ) ) ( (lv_right_3_0= ruleExpression1100xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression1100xfyAccess().getExpression1050xfyParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_6);
            this_Expression1050xfy_0=ruleExpression1050xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression1050xfy_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:428:3: ( () ( (lv_op_2_0= RULE_OP1100XFY ) ) ( (lv_right_3_0= ruleExpression1100xfy ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_OP1100XFY) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTExp.g:429:4: () ( (lv_op_2_0= RULE_OP1100XFY ) ) ( (lv_right_3_0= ruleExpression1100xfy ) )
                    {
                    // InternalTExp.g:429:4: ()
                    // InternalTExp.g:430:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getExpression1100xfyAccess().getPrologExpressionLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTExp.g:439:4: ( (lv_op_2_0= RULE_OP1100XFY ) )
                    // InternalTExp.g:440:5: (lv_op_2_0= RULE_OP1100XFY )
                    {
                    // InternalTExp.g:440:5: (lv_op_2_0= RULE_OP1100XFY )
                    // InternalTExp.g:441:6: lv_op_2_0= RULE_OP1100XFY
                    {
                    lv_op_2_0=(Token)match(input,RULE_OP1100XFY,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_2_0, grammarAccess.getExpression1100xfyAccess().getOpOP1100XFYTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExpression1100xfyRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"op",
                      							lv_op_2_0,
                      							"it.unige.dibris.trace_expression_language.TExp.OP1100XFY");
                      					
                    }

                    }


                    }

                    // InternalTExp.g:457:4: ( (lv_right_3_0= ruleExpression1100xfy ) )
                    // InternalTExp.g:458:5: (lv_right_3_0= ruleExpression1100xfy )
                    {
                    // InternalTExp.g:458:5: (lv_right_3_0= ruleExpression1100xfy )
                    // InternalTExp.g:459:6: lv_right_3_0= ruleExpression1100xfy
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpression1100xfyAccess().getRightExpression1100xfyParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExpression1100xfy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpression1100xfyRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"it.unige.dibris.trace_expression_language.TExp.Expression1100xfy");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression1100xfy"


    // $ANTLR start "entryRuleExpression1050xfy"
    // InternalTExp.g:481:1: entryRuleExpression1050xfy returns [EObject current=null] : iv_ruleExpression1050xfy= ruleExpression1050xfy EOF ;
    public final EObject entryRuleExpression1050xfy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression1050xfy = null;


        try {
            // InternalTExp.g:481:58: (iv_ruleExpression1050xfy= ruleExpression1050xfy EOF )
            // InternalTExp.g:482:2: iv_ruleExpression1050xfy= ruleExpression1050xfy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression1050xfyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression1050xfy=ruleExpression1050xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression1050xfy; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression1050xfy"


    // $ANTLR start "ruleExpression1050xfy"
    // InternalTExp.g:488:1: ruleExpression1050xfy returns [EObject current=null] : (this_Expression1000xfy_0= ruleExpression1000xfy ( () ( (lv_op_2_0= RULE_OP1050XFY ) ) ( (lv_right_3_0= ruleExpression1050xfy ) ) )? ) ;
    public final EObject ruleExpression1050xfy() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression1000xfy_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:494:2: ( (this_Expression1000xfy_0= ruleExpression1000xfy ( () ( (lv_op_2_0= RULE_OP1050XFY ) ) ( (lv_right_3_0= ruleExpression1050xfy ) ) )? ) )
            // InternalTExp.g:495:2: (this_Expression1000xfy_0= ruleExpression1000xfy ( () ( (lv_op_2_0= RULE_OP1050XFY ) ) ( (lv_right_3_0= ruleExpression1050xfy ) ) )? )
            {
            // InternalTExp.g:495:2: (this_Expression1000xfy_0= ruleExpression1000xfy ( () ( (lv_op_2_0= RULE_OP1050XFY ) ) ( (lv_right_3_0= ruleExpression1050xfy ) ) )? )
            // InternalTExp.g:496:3: this_Expression1000xfy_0= ruleExpression1000xfy ( () ( (lv_op_2_0= RULE_OP1050XFY ) ) ( (lv_right_3_0= ruleExpression1050xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression1050xfyAccess().getExpression1000xfyParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_8);
            this_Expression1000xfy_0=ruleExpression1000xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression1000xfy_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:507:3: ( () ( (lv_op_2_0= RULE_OP1050XFY ) ) ( (lv_right_3_0= ruleExpression1050xfy ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_OP1050XFY) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTExp.g:508:4: () ( (lv_op_2_0= RULE_OP1050XFY ) ) ( (lv_right_3_0= ruleExpression1050xfy ) )
                    {
                    // InternalTExp.g:508:4: ()
                    // InternalTExp.g:509:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getExpression1050xfyAccess().getPrologExpressionLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTExp.g:518:4: ( (lv_op_2_0= RULE_OP1050XFY ) )
                    // InternalTExp.g:519:5: (lv_op_2_0= RULE_OP1050XFY )
                    {
                    // InternalTExp.g:519:5: (lv_op_2_0= RULE_OP1050XFY )
                    // InternalTExp.g:520:6: lv_op_2_0= RULE_OP1050XFY
                    {
                    lv_op_2_0=(Token)match(input,RULE_OP1050XFY,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_2_0, grammarAccess.getExpression1050xfyAccess().getOpOP1050XFYTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExpression1050xfyRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"op",
                      							lv_op_2_0,
                      							"it.unige.dibris.trace_expression_language.TExp.OP1050XFY");
                      					
                    }

                    }


                    }

                    // InternalTExp.g:536:4: ( (lv_right_3_0= ruleExpression1050xfy ) )
                    // InternalTExp.g:537:5: (lv_right_3_0= ruleExpression1050xfy )
                    {
                    // InternalTExp.g:537:5: (lv_right_3_0= ruleExpression1050xfy )
                    // InternalTExp.g:538:6: lv_right_3_0= ruleExpression1050xfy
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpression1050xfyAccess().getRightExpression1050xfyParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExpression1050xfy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpression1050xfyRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"it.unige.dibris.trace_expression_language.TExp.Expression1050xfy");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression1050xfy"


    // $ANTLR start "entryRuleExpression1000xfy"
    // InternalTExp.g:560:1: entryRuleExpression1000xfy returns [EObject current=null] : iv_ruleExpression1000xfy= ruleExpression1000xfy EOF ;
    public final EObject entryRuleExpression1000xfy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression1000xfy = null;


        try {
            // InternalTExp.g:560:58: (iv_ruleExpression1000xfy= ruleExpression1000xfy EOF )
            // InternalTExp.g:561:2: iv_ruleExpression1000xfy= ruleExpression1000xfy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression1000xfyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression1000xfy=ruleExpression1000xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression1000xfy; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression1000xfy"


    // $ANTLR start "ruleExpression1000xfy"
    // InternalTExp.g:567:1: ruleExpression1000xfy returns [EObject current=null] : (this_Expression954xfy_0= ruleExpression954xfy ( () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) ) )? ) ;
    public final EObject ruleExpression1000xfy() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression954xfy_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:573:2: ( (this_Expression954xfy_0= ruleExpression954xfy ( () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) ) )? ) )
            // InternalTExp.g:574:2: (this_Expression954xfy_0= ruleExpression954xfy ( () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) ) )? )
            {
            // InternalTExp.g:574:2: (this_Expression954xfy_0= ruleExpression954xfy ( () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) ) )? )
            // InternalTExp.g:575:3: this_Expression954xfy_0= ruleExpression954xfy ( () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression1000xfyAccess().getExpression954xfyParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_Expression954xfy_0=ruleExpression954xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression954xfy_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:586:3: ( () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_OP1000XFY) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTExp.g:587:4: () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) )
                    {
                    // InternalTExp.g:587:4: ()
                    // InternalTExp.g:588:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getExpression1000xfyAccess().getPrologExpressionLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTExp.g:597:4: ( (lv_op_2_0= RULE_OP1000XFY ) )
                    // InternalTExp.g:598:5: (lv_op_2_0= RULE_OP1000XFY )
                    {
                    // InternalTExp.g:598:5: (lv_op_2_0= RULE_OP1000XFY )
                    // InternalTExp.g:599:6: lv_op_2_0= RULE_OP1000XFY
                    {
                    lv_op_2_0=(Token)match(input,RULE_OP1000XFY,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_2_0, grammarAccess.getExpression1000xfyAccess().getOpOP1000XFYTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExpression1000xfyRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"op",
                      							lv_op_2_0,
                      							"it.unige.dibris.trace_expression_language.TExp.OP1000XFY");
                      					
                    }

                    }


                    }

                    // InternalTExp.g:615:4: ( (lv_right_3_0= ruleExpression1000xfy ) )
                    // InternalTExp.g:616:5: (lv_right_3_0= ruleExpression1000xfy )
                    {
                    // InternalTExp.g:616:5: (lv_right_3_0= ruleExpression1000xfy )
                    // InternalTExp.g:617:6: lv_right_3_0= ruleExpression1000xfy
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpression1000xfyAccess().getRightExpression1000xfyParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExpression1000xfy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpression1000xfyRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"it.unige.dibris.trace_expression_language.TExp.Expression1000xfy");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression1000xfy"


    // $ANTLR start "entryRuleExpression954xfy"
    // InternalTExp.g:639:1: entryRuleExpression954xfy returns [EObject current=null] : iv_ruleExpression954xfy= ruleExpression954xfy EOF ;
    public final EObject entryRuleExpression954xfy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression954xfy = null;


        try {
            // InternalTExp.g:639:57: (iv_ruleExpression954xfy= ruleExpression954xfy EOF )
            // InternalTExp.g:640:2: iv_ruleExpression954xfy= ruleExpression954xfy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression954xfyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression954xfy=ruleExpression954xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression954xfy; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression954xfy"


    // $ANTLR start "ruleExpression954xfy"
    // InternalTExp.g:646:1: ruleExpression954xfy returns [EObject current=null] : (this_Expression700xfx_0= ruleExpression700xfx ( () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) ) )? ) ;
    public final EObject ruleExpression954xfy() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression700xfx_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:652:2: ( (this_Expression700xfx_0= ruleExpression700xfx ( () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) ) )? ) )
            // InternalTExp.g:653:2: (this_Expression700xfx_0= ruleExpression700xfx ( () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) ) )? )
            {
            // InternalTExp.g:653:2: (this_Expression700xfx_0= ruleExpression700xfx ( () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) ) )? )
            // InternalTExp.g:654:3: this_Expression700xfx_0= ruleExpression700xfx ( () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression954xfyAccess().getExpression700xfxParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_10);
            this_Expression700xfx_0=ruleExpression700xfx();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression700xfx_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:665:3: ( () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_OP954XFY) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTExp.g:666:4: () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) )
                    {
                    // InternalTExp.g:666:4: ()
                    // InternalTExp.g:667:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getExpression954xfyAccess().getPrologExpressionLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTExp.g:676:4: ( (lv_op_2_0= RULE_OP954XFY ) )
                    // InternalTExp.g:677:5: (lv_op_2_0= RULE_OP954XFY )
                    {
                    // InternalTExp.g:677:5: (lv_op_2_0= RULE_OP954XFY )
                    // InternalTExp.g:678:6: lv_op_2_0= RULE_OP954XFY
                    {
                    lv_op_2_0=(Token)match(input,RULE_OP954XFY,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_2_0, grammarAccess.getExpression954xfyAccess().getOpOP954XFYTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExpression954xfyRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"op",
                      							lv_op_2_0,
                      							"it.unige.dibris.trace_expression_language.TExp.OP954XFY");
                      					
                    }

                    }


                    }

                    // InternalTExp.g:694:4: ( (lv_right_3_0= ruleExpression954xfy ) )
                    // InternalTExp.g:695:5: (lv_right_3_0= ruleExpression954xfy )
                    {
                    // InternalTExp.g:695:5: (lv_right_3_0= ruleExpression954xfy )
                    // InternalTExp.g:696:6: lv_right_3_0= ruleExpression954xfy
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpression954xfyAccess().getRightExpression954xfyParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExpression954xfy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpression954xfyRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"it.unige.dibris.trace_expression_language.TExp.Expression954xfy");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression954xfy"


    // $ANTLR start "entryRuleExpression700xfx"
    // InternalTExp.g:718:1: entryRuleExpression700xfx returns [EObject current=null] : iv_ruleExpression700xfx= ruleExpression700xfx EOF ;
    public final EObject entryRuleExpression700xfx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression700xfx = null;


        try {
            // InternalTExp.g:718:57: (iv_ruleExpression700xfx= ruleExpression700xfx EOF )
            // InternalTExp.g:719:2: iv_ruleExpression700xfx= ruleExpression700xfx EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression700xfxRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression700xfx=ruleExpression700xfx();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression700xfx; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression700xfx"


    // $ANTLR start "ruleExpression700xfx"
    // InternalTExp.g:725:1: ruleExpression700xfx returns [EObject current=null] : (this_Expression600xfy_0= ruleExpression600xfy ( () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? ) ;
    public final EObject ruleExpression700xfx() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_Expression600xfy_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:731:2: ( (this_Expression600xfy_0= ruleExpression600xfy ( () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? ) )
            // InternalTExp.g:732:2: (this_Expression600xfy_0= ruleExpression600xfy ( () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? )
            {
            // InternalTExp.g:732:2: (this_Expression600xfy_0= ruleExpression600xfy ( () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? )
            // InternalTExp.g:733:3: this_Expression600xfy_0= ruleExpression600xfy ( () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression700xfxAccess().getExpression600xfyParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_11);
            this_Expression600xfy_0=ruleExpression600xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression600xfy_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:744:3: ( () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_OP700XFX && LA10_0<=RULE_OP700XFXL)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTExp.g:745:4: () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) )
                    {
                    // InternalTExp.g:745:4: ()
                    // InternalTExp.g:746:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getExpression700xfxAccess().getPrologExpressionLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTExp.g:755:4: ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) )
                    // InternalTExp.g:756:5: ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) )
                    {
                    // InternalTExp.g:756:5: ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) )
                    // InternalTExp.g:757:6: (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL )
                    {
                    // InternalTExp.g:757:6: (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL )
                    int alt9=3;
                    switch ( input.LA(1) ) {
                    case RULE_OP700XFX:
                        {
                        alt9=1;
                        }
                        break;
                    case RULE_OP700XFXR:
                        {
                        alt9=2;
                        }
                        break;
                    case RULE_OP700XFXL:
                        {
                        alt9=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }

                    switch (alt9) {
                        case 1 :
                            // InternalTExp.g:758:7: lv_op_2_1= RULE_OP700XFX
                            {
                            lv_op_2_1=(Token)match(input,RULE_OP700XFX,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_2_1, grammarAccess.getExpression700xfxAccess().getOpOP700XFXTerminalRuleCall_1_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getExpression700xfxRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"op",
                              								lv_op_2_1,
                              								"it.unige.dibris.trace_expression_language.TExp.OP700XFX");
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalTExp.g:773:7: lv_op_2_2= RULE_OP700XFXR
                            {
                            lv_op_2_2=(Token)match(input,RULE_OP700XFXR,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_2_2, grammarAccess.getExpression700xfxAccess().getOpOP700XFXRTerminalRuleCall_1_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getExpression700xfxRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"op",
                              								lv_op_2_2,
                              								"it.unige.dibris.trace_expression_language.TExp.OP700XFXR");
                              						
                            }

                            }
                            break;
                        case 3 :
                            // InternalTExp.g:788:7: lv_op_2_3= RULE_OP700XFXL
                            {
                            lv_op_2_3=(Token)match(input,RULE_OP700XFXL,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_2_3, grammarAccess.getExpression700xfxAccess().getOpOP700XFXLTerminalRuleCall_1_1_0_2());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getExpression700xfxRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"op",
                              								lv_op_2_3,
                              								"it.unige.dibris.trace_expression_language.TExp.OP700XFXL");
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalTExp.g:805:4: ( (lv_right_3_0= ruleExpression600xfy ) )
                    // InternalTExp.g:806:5: (lv_right_3_0= ruleExpression600xfy )
                    {
                    // InternalTExp.g:806:5: (lv_right_3_0= ruleExpression600xfy )
                    // InternalTExp.g:807:6: lv_right_3_0= ruleExpression600xfy
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpression700xfxAccess().getRightExpression600xfyParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExpression600xfy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpression700xfxRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"it.unige.dibris.trace_expression_language.TExp.Expression600xfy");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression700xfx"


    // $ANTLR start "entryRuleExpression600xfy"
    // InternalTExp.g:829:1: entryRuleExpression600xfy returns [EObject current=null] : iv_ruleExpression600xfy= ruleExpression600xfy EOF ;
    public final EObject entryRuleExpression600xfy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression600xfy = null;


        try {
            // InternalTExp.g:829:57: (iv_ruleExpression600xfy= ruleExpression600xfy EOF )
            // InternalTExp.g:830:2: iv_ruleExpression600xfy= ruleExpression600xfy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression600xfyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression600xfy=ruleExpression600xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression600xfy; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression600xfy"


    // $ANTLR start "ruleExpression600xfy"
    // InternalTExp.g:836:1: ruleExpression600xfy returns [EObject current=null] : (this_Expression500yfx_0= ruleExpression500yfx ( () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? ) ;
    public final EObject ruleExpression600xfy() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression500yfx_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:842:2: ( (this_Expression500yfx_0= ruleExpression500yfx ( () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? ) )
            // InternalTExp.g:843:2: (this_Expression500yfx_0= ruleExpression500yfx ( () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? )
            {
            // InternalTExp.g:843:2: (this_Expression500yfx_0= ruleExpression500yfx ( () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? )
            // InternalTExp.g:844:3: this_Expression500yfx_0= ruleExpression500yfx ( () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression600xfyAccess().getExpression500yfxParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_12);
            this_Expression500yfx_0=ruleExpression500yfx();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression500yfx_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:855:3: ( () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_OP600XFY) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTExp.g:856:4: () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) )
                    {
                    // InternalTExp.g:856:4: ()
                    // InternalTExp.g:857:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getExpression600xfyAccess().getPrologExpressionLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTExp.g:866:4: ( (lv_op_2_0= RULE_OP600XFY ) )
                    // InternalTExp.g:867:5: (lv_op_2_0= RULE_OP600XFY )
                    {
                    // InternalTExp.g:867:5: (lv_op_2_0= RULE_OP600XFY )
                    // InternalTExp.g:868:6: lv_op_2_0= RULE_OP600XFY
                    {
                    lv_op_2_0=(Token)match(input,RULE_OP600XFY,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_2_0, grammarAccess.getExpression600xfyAccess().getOpOP600XFYTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExpression600xfyRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"op",
                      							lv_op_2_0,
                      							"it.unige.dibris.trace_expression_language.TExp.OP600XFY");
                      					
                    }

                    }


                    }

                    // InternalTExp.g:884:4: ( (lv_right_3_0= ruleExpression600xfy ) )
                    // InternalTExp.g:885:5: (lv_right_3_0= ruleExpression600xfy )
                    {
                    // InternalTExp.g:885:5: (lv_right_3_0= ruleExpression600xfy )
                    // InternalTExp.g:886:6: lv_right_3_0= ruleExpression600xfy
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpression600xfyAccess().getRightExpression600xfyParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExpression600xfy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpression600xfyRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"it.unige.dibris.trace_expression_language.TExp.Expression600xfy");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression600xfy"


    // $ANTLR start "entryRuleExpression500yfx"
    // InternalTExp.g:908:1: entryRuleExpression500yfx returns [EObject current=null] : iv_ruleExpression500yfx= ruleExpression500yfx EOF ;
    public final EObject entryRuleExpression500yfx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression500yfx = null;


        try {
            // InternalTExp.g:908:57: (iv_ruleExpression500yfx= ruleExpression500yfx EOF )
            // InternalTExp.g:909:2: iv_ruleExpression500yfx= ruleExpression500yfx EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression500yfxRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression500yfx=ruleExpression500yfx();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression500yfx; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression500yfx"


    // $ANTLR start "ruleExpression500yfx"
    // InternalTExp.g:915:1: ruleExpression500yfx returns [EObject current=null] : (this_Expression400yfx_0= ruleExpression400yfx ( () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) ) )* ) ;
    public final EObject ruleExpression500yfx() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression400yfx_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:921:2: ( (this_Expression400yfx_0= ruleExpression400yfx ( () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) ) )* ) )
            // InternalTExp.g:922:2: (this_Expression400yfx_0= ruleExpression400yfx ( () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) ) )* )
            {
            // InternalTExp.g:922:2: (this_Expression400yfx_0= ruleExpression400yfx ( () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) ) )* )
            // InternalTExp.g:923:3: this_Expression400yfx_0= ruleExpression400yfx ( () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression500yfxAccess().getExpression400yfxParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_13);
            this_Expression400yfx_0=ruleExpression400yfx();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression400yfx_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:934:3: ( () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_OP500YFX) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTExp.g:935:4: () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) )
            	    {
            	    // InternalTExp.g:935:4: ()
            	    // InternalTExp.g:936:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getExpression500yfxAccess().getPrologExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTExp.g:945:4: ( (lv_op_2_0= RULE_OP500YFX ) )
            	    // InternalTExp.g:946:5: (lv_op_2_0= RULE_OP500YFX )
            	    {
            	    // InternalTExp.g:946:5: (lv_op_2_0= RULE_OP500YFX )
            	    // InternalTExp.g:947:6: lv_op_2_0= RULE_OP500YFX
            	    {
            	    lv_op_2_0=(Token)match(input,RULE_OP500YFX,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getExpression500yfxAccess().getOpOP500YFXTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getExpression500yfxRule());
            	      						}
            	      						setWithLastConsumed(
            	      							current,
            	      							"op",
            	      							lv_op_2_0,
            	      							"it.unige.dibris.trace_expression_language.TExp.OP500YFX");
            	      					
            	    }

            	    }


            	    }

            	    // InternalTExp.g:963:4: ( (lv_right_3_0= ruleExpression400yfx ) )
            	    // InternalTExp.g:964:5: (lv_right_3_0= ruleExpression400yfx )
            	    {
            	    // InternalTExp.g:964:5: (lv_right_3_0= ruleExpression400yfx )
            	    // InternalTExp.g:965:6: lv_right_3_0= ruleExpression400yfx
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpression500yfxAccess().getRightExpression400yfxParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_right_3_0=ruleExpression400yfx();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExpression500yfxRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"it.unige.dibris.trace_expression_language.TExp.Expression400yfx");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression500yfx"


    // $ANTLR start "entryRuleExpression400yfx"
    // InternalTExp.g:987:1: entryRuleExpression400yfx returns [EObject current=null] : iv_ruleExpression400yfx= ruleExpression400yfx EOF ;
    public final EObject entryRuleExpression400yfx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression400yfx = null;


        try {
            // InternalTExp.g:987:57: (iv_ruleExpression400yfx= ruleExpression400yfx EOF )
            // InternalTExp.g:988:2: iv_ruleExpression400yfx= ruleExpression400yfx EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression400yfxRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression400yfx=ruleExpression400yfx();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression400yfx; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression400yfx"


    // $ANTLR start "ruleExpression400yfx"
    // InternalTExp.g:994:1: ruleExpression400yfx returns [EObject current=null] : (this_Expression200xfx_0= ruleExpression200xfx ( () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) ) )* ) ;
    public final EObject ruleExpression400yfx() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression200xfx_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:1000:2: ( (this_Expression200xfx_0= ruleExpression200xfx ( () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) ) )* ) )
            // InternalTExp.g:1001:2: (this_Expression200xfx_0= ruleExpression200xfx ( () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) ) )* )
            {
            // InternalTExp.g:1001:2: (this_Expression200xfx_0= ruleExpression200xfx ( () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) ) )* )
            // InternalTExp.g:1002:3: this_Expression200xfx_0= ruleExpression200xfx ( () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression400yfxAccess().getExpression200xfxParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_14);
            this_Expression200xfx_0=ruleExpression200xfx();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression200xfx_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:1013:3: ( () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_OP400YFX) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTExp.g:1014:4: () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) )
            	    {
            	    // InternalTExp.g:1014:4: ()
            	    // InternalTExp.g:1015:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getExpression400yfxAccess().getPrologExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTExp.g:1024:4: ( (lv_op_2_0= RULE_OP400YFX ) )
            	    // InternalTExp.g:1025:5: (lv_op_2_0= RULE_OP400YFX )
            	    {
            	    // InternalTExp.g:1025:5: (lv_op_2_0= RULE_OP400YFX )
            	    // InternalTExp.g:1026:6: lv_op_2_0= RULE_OP400YFX
            	    {
            	    lv_op_2_0=(Token)match(input,RULE_OP400YFX,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getExpression400yfxAccess().getOpOP400YFXTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getExpression400yfxRule());
            	      						}
            	      						setWithLastConsumed(
            	      							current,
            	      							"op",
            	      							lv_op_2_0,
            	      							"it.unige.dibris.trace_expression_language.TExp.OP400YFX");
            	      					
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1042:4: ( (lv_right_3_0= ruleExpression200xfx ) )
            	    // InternalTExp.g:1043:5: (lv_right_3_0= ruleExpression200xfx )
            	    {
            	    // InternalTExp.g:1043:5: (lv_right_3_0= ruleExpression200xfx )
            	    // InternalTExp.g:1044:6: lv_right_3_0= ruleExpression200xfx
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpression400yfxAccess().getRightExpression200xfxParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_right_3_0=ruleExpression200xfx();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExpression400yfxRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"it.unige.dibris.trace_expression_language.TExp.Expression200xfx");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression400yfx"


    // $ANTLR start "entryRuleExpression200xfx"
    // InternalTExp.g:1066:1: entryRuleExpression200xfx returns [EObject current=null] : iv_ruleExpression200xfx= ruleExpression200xfx EOF ;
    public final EObject entryRuleExpression200xfx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression200xfx = null;


        try {
            // InternalTExp.g:1066:57: (iv_ruleExpression200xfx= ruleExpression200xfx EOF )
            // InternalTExp.g:1067:2: iv_ruleExpression200xfx= ruleExpression200xfx EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression200xfxRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression200xfx=ruleExpression200xfx();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression200xfx; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression200xfx"


    // $ANTLR start "ruleExpression200xfx"
    // InternalTExp.g:1073:1: ruleExpression200xfx returns [EObject current=null] : (this_Expression200xfy_0= ruleExpression200xfy ( () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? ) ;
    public final EObject ruleExpression200xfx() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression200xfy_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:1079:2: ( (this_Expression200xfy_0= ruleExpression200xfy ( () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? ) )
            // InternalTExp.g:1080:2: (this_Expression200xfy_0= ruleExpression200xfy ( () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? )
            {
            // InternalTExp.g:1080:2: (this_Expression200xfy_0= ruleExpression200xfy ( () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? )
            // InternalTExp.g:1081:3: this_Expression200xfy_0= ruleExpression200xfy ( () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression200xfxAccess().getExpression200xfyParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_15);
            this_Expression200xfy_0=ruleExpression200xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression200xfy_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:1092:3: ( () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_OP200XFX) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTExp.g:1093:4: () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) )
                    {
                    // InternalTExp.g:1093:4: ()
                    // InternalTExp.g:1094:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getExpression200xfxAccess().getPrologExpressionLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTExp.g:1103:4: ( (lv_op_2_0= RULE_OP200XFX ) )
                    // InternalTExp.g:1104:5: (lv_op_2_0= RULE_OP200XFX )
                    {
                    // InternalTExp.g:1104:5: (lv_op_2_0= RULE_OP200XFX )
                    // InternalTExp.g:1105:6: lv_op_2_0= RULE_OP200XFX
                    {
                    lv_op_2_0=(Token)match(input,RULE_OP200XFX,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_2_0, grammarAccess.getExpression200xfxAccess().getOpOP200XFXTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExpression200xfxRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"op",
                      							lv_op_2_0,
                      							"it.unige.dibris.trace_expression_language.TExp.OP200XFX");
                      					
                    }

                    }


                    }

                    // InternalTExp.g:1121:4: ( (lv_right_3_0= ruleExpression200xfy ) )
                    // InternalTExp.g:1122:5: (lv_right_3_0= ruleExpression200xfy )
                    {
                    // InternalTExp.g:1122:5: (lv_right_3_0= ruleExpression200xfy )
                    // InternalTExp.g:1123:6: lv_right_3_0= ruleExpression200xfy
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpression200xfxAccess().getRightExpression200xfyParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExpression200xfy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpression200xfxRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"it.unige.dibris.trace_expression_language.TExp.Expression200xfy");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression200xfx"


    // $ANTLR start "entryRuleExpression200xfy"
    // InternalTExp.g:1145:1: entryRuleExpression200xfy returns [EObject current=null] : iv_ruleExpression200xfy= ruleExpression200xfy EOF ;
    public final EObject entryRuleExpression200xfy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression200xfy = null;


        try {
            // InternalTExp.g:1145:57: (iv_ruleExpression200xfy= ruleExpression200xfy EOF )
            // InternalTExp.g:1146:2: iv_ruleExpression200xfy= ruleExpression200xfy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression200xfyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression200xfy=ruleExpression200xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression200xfy; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression200xfy"


    // $ANTLR start "ruleExpression200xfy"
    // InternalTExp.g:1152:1: ruleExpression200xfy returns [EObject current=null] : (this_Expression0_0= ruleExpression0 ( () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? ) ;
    public final EObject ruleExpression200xfy() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression0_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:1158:2: ( (this_Expression0_0= ruleExpression0 ( () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? ) )
            // InternalTExp.g:1159:2: (this_Expression0_0= ruleExpression0 ( () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? )
            {
            // InternalTExp.g:1159:2: (this_Expression0_0= ruleExpression0 ( () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? )
            // InternalTExp.g:1160:3: this_Expression0_0= ruleExpression0 ( () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression200xfyAccess().getExpression0ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            this_Expression0_0=ruleExpression0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression0_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:1171:3: ( () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_OP200XFY) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTExp.g:1172:4: () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) )
                    {
                    // InternalTExp.g:1172:4: ()
                    // InternalTExp.g:1173:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getExpression200xfyAccess().getPrologExpressionLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTExp.g:1182:4: ( (lv_op_2_0= RULE_OP200XFY ) )
                    // InternalTExp.g:1183:5: (lv_op_2_0= RULE_OP200XFY )
                    {
                    // InternalTExp.g:1183:5: (lv_op_2_0= RULE_OP200XFY )
                    // InternalTExp.g:1184:6: lv_op_2_0= RULE_OP200XFY
                    {
                    lv_op_2_0=(Token)match(input,RULE_OP200XFY,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_op_2_0, grammarAccess.getExpression200xfyAccess().getOpOP200XFYTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExpression200xfyRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"op",
                      							lv_op_2_0,
                      							"it.unige.dibris.trace_expression_language.TExp.OP200XFY");
                      					
                    }

                    }


                    }

                    // InternalTExp.g:1200:4: ( (lv_right_3_0= ruleExpression200xfy ) )
                    // InternalTExp.g:1201:5: (lv_right_3_0= ruleExpression200xfy )
                    {
                    // InternalTExp.g:1201:5: (lv_right_3_0= ruleExpression200xfy )
                    // InternalTExp.g:1202:6: lv_right_3_0= ruleExpression200xfy
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpression200xfyAccess().getRightExpression200xfyParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExpression200xfy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpression200xfyRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"it.unige.dibris.trace_expression_language.TExp.Expression200xfy");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression200xfy"


    // $ANTLR start "entryRuleExpression0"
    // InternalTExp.g:1224:1: entryRuleExpression0 returns [EObject current=null] : iv_ruleExpression0= ruleExpression0 EOF ;
    public final EObject entryRuleExpression0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression0 = null;


        try {
            // InternalTExp.g:1224:52: (iv_ruleExpression0= ruleExpression0 EOF )
            // InternalTExp.g:1225:2: iv_ruleExpression0= ruleExpression0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression0Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression0=ruleExpression0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression0; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression0"


    // $ANTLR start "ruleExpression0"
    // InternalTExp.g:1231:1: ruleExpression0 returns [EObject current=null] : ( ( () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )? ) | ( () ( (lv_name_6_0= RULE_VARIABLE ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_value_10_0= ruleNUMBER ) ) ) | ( () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']' ) | (otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')' ) ) ;
    public final EObject ruleExpression0() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_name_6_0=null;
        Token lv_value_8_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_atom_1_0 = null;

        EObject lv_terms_3_0 = null;

        AntlrDatatypeRuleToken lv_value_10_0 = null;

        EObject lv_head_13_0 = null;

        EObject lv_tail_15_0 = null;

        EObject this_ExpressionInfinity_18 = null;



        	enterRule();

        try {
            // InternalTExp.g:1237:2: ( ( ( () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )? ) | ( () ( (lv_name_6_0= RULE_VARIABLE ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_value_10_0= ruleNUMBER ) ) ) | ( () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']' ) | (otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')' ) ) )
            // InternalTExp.g:1238:2: ( ( () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )? ) | ( () ( (lv_name_6_0= RULE_VARIABLE ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_value_10_0= ruleNUMBER ) ) ) | ( () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']' ) | (otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')' ) )
            {
            // InternalTExp.g:1238:2: ( ( () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )? ) | ( () ( (lv_name_6_0= RULE_VARIABLE ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_value_10_0= ruleNUMBER ) ) ) | ( () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']' ) | (otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')' ) )
            int alt19=6;
            switch ( input.LA(1) ) {
            case RULE_ATOM:
            case RULE_OP1200XFX:
            case RULE_OP1200FX:
            case RULE_OP1150FX:
            case RULE_OP1100XFY:
            case RULE_OP1050XFY:
            case RULE_OP1000XFY:
            case RULE_OP954XFY:
            case RULE_OP900FY:
            case RULE_OP900FX:
            case RULE_OP700XFX:
            case RULE_OP700XFXR:
            case RULE_OP700XFXL:
            case RULE_OP600XFY:
            case RULE_OP500YFX:
            case RULE_OP500FX:
            case RULE_OP400YFX:
            case RULE_OP200XFX:
            case RULE_OP200XFY:
            case 30:
            case 31:
                {
                alt19=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt19=2;
                }
                break;
            case RULE_STRING:
                {
                alt19=3;
                }
                break;
            case RULE_INT:
                {
                alt19=4;
                }
                break;
            case 34:
                {
                alt19=5;
                }
                break;
            case 32:
                {
                alt19=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalTExp.g:1239:3: ( () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )? )
                    {
                    // InternalTExp.g:1239:3: ( () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )? )
                    // InternalTExp.g:1240:4: () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )?
                    {
                    // InternalTExp.g:1240:4: ()
                    // InternalTExp.g:1241:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExpression0Access().getAtomExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTExp.g:1250:4: ( (lv_atom_1_0= ruleATOMS ) )
                    // InternalTExp.g:1251:5: (lv_atom_1_0= ruleATOMS )
                    {
                    // InternalTExp.g:1251:5: (lv_atom_1_0= ruleATOMS )
                    // InternalTExp.g:1252:6: lv_atom_1_0= ruleATOMS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpression0Access().getAtomATOMSParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_atom_1_0=ruleATOMS();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpression0Rule());
                      						}
                      						set(
                      							current,
                      							"atom",
                      							lv_atom_1_0,
                      							"it.unige.dibris.trace_expression_language.TExp.ATOMS");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTExp.g:1269:4: (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==32) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalTExp.g:1270:5: otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')'
                            {
                            otherlv_2=(Token)match(input,32,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getExpression0Access().getLeftParenthesisKeyword_0_2_0());
                              				
                            }
                            // InternalTExp.g:1274:5: ( (lv_terms_3_0= ruleExpressionInfinity ) )
                            // InternalTExp.g:1275:6: (lv_terms_3_0= ruleExpressionInfinity )
                            {
                            // InternalTExp.g:1275:6: (lv_terms_3_0= ruleExpressionInfinity )
                            // InternalTExp.g:1276:7: lv_terms_3_0= ruleExpressionInfinity
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpression0Access().getTermsExpressionInfinityParserRuleCall_0_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_18);
                            lv_terms_3_0=ruleExpressionInfinity();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExpression0Rule());
                              							}
                              							set(
                              								current,
                              								"terms",
                              								lv_terms_3_0,
                              								"it.unige.dibris.trace_expression_language.TExp.ExpressionInfinity");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            otherlv_4=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getExpression0Access().getRightParenthesisKeyword_0_2_2());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTExp.g:1300:3: ( () ( (lv_name_6_0= RULE_VARIABLE ) ) )
                    {
                    // InternalTExp.g:1300:3: ( () ( (lv_name_6_0= RULE_VARIABLE ) ) )
                    // InternalTExp.g:1301:4: () ( (lv_name_6_0= RULE_VARIABLE ) )
                    {
                    // InternalTExp.g:1301:4: ()
                    // InternalTExp.g:1302:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExpression0Access().getVariableExpressionAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTExp.g:1311:4: ( (lv_name_6_0= RULE_VARIABLE ) )
                    // InternalTExp.g:1312:5: (lv_name_6_0= RULE_VARIABLE )
                    {
                    // InternalTExp.g:1312:5: (lv_name_6_0= RULE_VARIABLE )
                    // InternalTExp.g:1313:6: lv_name_6_0= RULE_VARIABLE
                    {
                    lv_name_6_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_6_0, grammarAccess.getExpression0Access().getNameVARIABLETerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExpression0Rule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_6_0,
                      							"it.unige.dibris.trace_expression_language.TExp.VARIABLE");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTExp.g:1331:3: ( () ( (lv_value_8_0= RULE_STRING ) ) )
                    {
                    // InternalTExp.g:1331:3: ( () ( (lv_value_8_0= RULE_STRING ) ) )
                    // InternalTExp.g:1332:4: () ( (lv_value_8_0= RULE_STRING ) )
                    {
                    // InternalTExp.g:1332:4: ()
                    // InternalTExp.g:1333:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExpression0Access().getStringExpressionAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTExp.g:1342:4: ( (lv_value_8_0= RULE_STRING ) )
                    // InternalTExp.g:1343:5: (lv_value_8_0= RULE_STRING )
                    {
                    // InternalTExp.g:1343:5: (lv_value_8_0= RULE_STRING )
                    // InternalTExp.g:1344:6: lv_value_8_0= RULE_STRING
                    {
                    lv_value_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_8_0, grammarAccess.getExpression0Access().getValueSTRINGTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getExpression0Rule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_8_0,
                      							"it.unige.dibris.trace_expression_language.TExp.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTExp.g:1362:3: ( () ( (lv_value_10_0= ruleNUMBER ) ) )
                    {
                    // InternalTExp.g:1362:3: ( () ( (lv_value_10_0= ruleNUMBER ) ) )
                    // InternalTExp.g:1363:4: () ( (lv_value_10_0= ruleNUMBER ) )
                    {
                    // InternalTExp.g:1363:4: ()
                    // InternalTExp.g:1364:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExpression0Access().getNumberExpressionAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTExp.g:1373:4: ( (lv_value_10_0= ruleNUMBER ) )
                    // InternalTExp.g:1374:5: (lv_value_10_0= ruleNUMBER )
                    {
                    // InternalTExp.g:1374:5: (lv_value_10_0= ruleNUMBER )
                    // InternalTExp.g:1375:6: lv_value_10_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpression0Access().getValueNUMBERParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_10_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpression0Rule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_10_0,
                      							"it.unige.dibris.trace_expression_language.TExp.NUMBER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalTExp.g:1394:3: ( () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']' )
                    {
                    // InternalTExp.g:1394:3: ( () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']' )
                    // InternalTExp.g:1395:4: () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']'
                    {
                    // InternalTExp.g:1395:4: ()
                    // InternalTExp.g:1396:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getExpression0Access().getListExpressionAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_12=(Token)match(input,34,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getExpression0Access().getLeftSquareBracketKeyword_4_1());
                      			
                    }
                    // InternalTExp.g:1409:4: ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>=RULE_ATOM && LA18_0<=RULE_INT)||(LA18_0>=RULE_VARIABLE && LA18_0<=RULE_STRING)||(LA18_0>=30 && LA18_0<=32)||LA18_0==34) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalTExp.g:1410:5: ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )?
                            {
                            // InternalTExp.g:1410:5: ( (lv_head_13_0= ruleExpressionInfinity ) )
                            // InternalTExp.g:1411:6: (lv_head_13_0= ruleExpressionInfinity )
                            {
                            // InternalTExp.g:1411:6: (lv_head_13_0= ruleExpressionInfinity )
                            // InternalTExp.g:1412:7: lv_head_13_0= ruleExpressionInfinity
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpression0Access().getHeadExpressionInfinityParserRuleCall_4_2_0_0());
                              						
                            }
                            pushFollow(FOLLOW_20);
                            lv_head_13_0=ruleExpressionInfinity();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getExpression0Rule());
                              							}
                              							set(
                              								current,
                              								"head",
                              								lv_head_13_0,
                              								"it.unige.dibris.trace_expression_language.TExp.ExpressionInfinity");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalTExp.g:1429:5: (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0==35) ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // InternalTExp.g:1430:6: otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) )
                                    {
                                    otherlv_14=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(otherlv_14, grammarAccess.getExpression0Access().getVerticalLineKeyword_4_2_1_0());
                                      					
                                    }
                                    // InternalTExp.g:1434:6: ( (lv_tail_15_0= ruleExpressionInfinity ) )
                                    // InternalTExp.g:1435:7: (lv_tail_15_0= ruleExpressionInfinity )
                                    {
                                    // InternalTExp.g:1435:7: (lv_tail_15_0= ruleExpressionInfinity )
                                    // InternalTExp.g:1436:8: lv_tail_15_0= ruleExpressionInfinity
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getExpression0Access().getTailExpressionInfinityParserRuleCall_4_2_1_1_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_21);
                                    lv_tail_15_0=ruleExpressionInfinity();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getExpression0Rule());
                                      								}
                                      								set(
                                      									current,
                                      									"tail",
                                      									lv_tail_15_0,
                                      									"it.unige.dibris.trace_expression_language.TExp.ExpressionInfinity");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getExpression0Access().getRightSquareBracketKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTExp.g:1461:3: (otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')' )
                    {
                    // InternalTExp.g:1461:3: (otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')' )
                    // InternalTExp.g:1462:4: otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')'
                    {
                    otherlv_17=(Token)match(input,32,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getExpression0Access().getLeftParenthesisKeyword_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpression0Access().getExpressionInfinityParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_18);
                    this_ExpressionInfinity_18=ruleExpressionInfinity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ExpressionInfinity_18;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_19=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getExpression0Access().getRightParenthesisKeyword_5_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression0"


    // $ANTLR start "entryRuleTraceExpression"
    // InternalTExp.g:1486:1: entryRuleTraceExpression returns [EObject current=null] : iv_ruleTraceExpression= ruleTraceExpression EOF ;
    public final EObject entryRuleTraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceExpression = null;


        try {
            // InternalTExp.g:1486:56: (iv_ruleTraceExpression= ruleTraceExpression EOF )
            // InternalTExp.g:1487:2: iv_ruleTraceExpression= ruleTraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTraceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTraceExpression=ruleTraceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTraceExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTraceExpression"


    // $ANTLR start "ruleTraceExpression"
    // InternalTExp.g:1493:1: ruleTraceExpression returns [EObject current=null] : (this_GenericTraceExpression_0= ruleGenericTraceExpression | this_InteractionTraceExpression_1= ruleInteractionTraceExpression ) ;
    public final EObject ruleTraceExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GenericTraceExpression_0 = null;

        EObject this_InteractionTraceExpression_1 = null;



        	enterRule();

        try {
            // InternalTExp.g:1499:2: ( (this_GenericTraceExpression_0= ruleGenericTraceExpression | this_InteractionTraceExpression_1= ruleInteractionTraceExpression ) )
            // InternalTExp.g:1500:2: (this_GenericTraceExpression_0= ruleGenericTraceExpression | this_InteractionTraceExpression_1= ruleInteractionTraceExpression )
            {
            // InternalTExp.g:1500:2: (this_GenericTraceExpression_0= ruleGenericTraceExpression | this_InteractionTraceExpression_1= ruleInteractionTraceExpression )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            else if ( (LA20_0==44) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalTExp.g:1501:3: this_GenericTraceExpression_0= ruleGenericTraceExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTraceExpressionAccess().getGenericTraceExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GenericTraceExpression_0=ruleGenericTraceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GenericTraceExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTExp.g:1513:3: this_InteractionTraceExpression_1= ruleInteractionTraceExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTraceExpressionAccess().getInteractionTraceExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InteractionTraceExpression_1=ruleInteractionTraceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InteractionTraceExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTraceExpression"


    // $ANTLR start "entryRuleGenericTraceExpression"
    // InternalTExp.g:1528:1: entryRuleGenericTraceExpression returns [EObject current=null] : iv_ruleGenericTraceExpression= ruleGenericTraceExpression EOF ;
    public final EObject entryRuleGenericTraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericTraceExpression = null;


        try {
            // InternalTExp.g:1528:63: (iv_ruleGenericTraceExpression= ruleGenericTraceExpression EOF )
            // InternalTExp.g:1529:2: iv_ruleGenericTraceExpression= ruleGenericTraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenericTraceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGenericTraceExpression=ruleGenericTraceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGenericTraceExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGenericTraceExpression"


    // $ANTLR start "ruleGenericTraceExpression"
    // InternalTExp.g:1535:1: ruleGenericTraceExpression returns [EObject current=null] : ( () otherlv_1= 'trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_modulesL_7_0= 'modules:' ) ) ( (lv_modules_8_0= ruleModule ) )* ) | ( ( (lv_typesL_9_0= 'types:' ) ) ( (lv_types_10_0= ruleEventType ) )* ) )+ otherlv_11= '}' ) ;
    public final EObject ruleGenericTraceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_bodyL_5_0=null;
        Token lv_modulesL_7_0=null;
        Token lv_typesL_9_0=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_terms_6_0 = null;

        AntlrDatatypeRuleToken lv_modules_8_0 = null;

        EObject lv_types_10_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:1541:2: ( ( () otherlv_1= 'trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_modulesL_7_0= 'modules:' ) ) ( (lv_modules_8_0= ruleModule ) )* ) | ( ( (lv_typesL_9_0= 'types:' ) ) ( (lv_types_10_0= ruleEventType ) )* ) )+ otherlv_11= '}' ) )
            // InternalTExp.g:1542:2: ( () otherlv_1= 'trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_modulesL_7_0= 'modules:' ) ) ( (lv_modules_8_0= ruleModule ) )* ) | ( ( (lv_typesL_9_0= 'types:' ) ) ( (lv_types_10_0= ruleEventType ) )* ) )+ otherlv_11= '}' )
            {
            // InternalTExp.g:1542:2: ( () otherlv_1= 'trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_modulesL_7_0= 'modules:' ) ) ( (lv_modules_8_0= ruleModule ) )* ) | ( ( (lv_typesL_9_0= 'types:' ) ) ( (lv_types_10_0= ruleEventType ) )* ) )+ otherlv_11= '}' )
            // InternalTExp.g:1543:3: () otherlv_1= 'trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_modulesL_7_0= 'modules:' ) ) ( (lv_modules_8_0= ruleModule ) )* ) | ( ( (lv_typesL_9_0= 'types:' ) ) ( (lv_types_10_0= ruleEventType ) )* ) )+ otherlv_11= '}'
            {
            // InternalTExp.g:1543:3: ()
            // InternalTExp.g:1544:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGenericTraceExpressionAccess().getGenericTraceExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGenericTraceExpressionAccess().getTrace_expressionKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,38,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGenericTraceExpressionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,39,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGenericTraceExpressionAccess().getIdKeyword_3());
              		
            }
            // InternalTExp.g:1565:3: ( (lv_name_4_0= ruleID ) )
            // InternalTExp.g:1566:4: (lv_name_4_0= ruleID )
            {
            // InternalTExp.g:1566:4: (lv_name_4_0= ruleID )
            // InternalTExp.g:1567:5: lv_name_4_0= ruleID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGenericTraceExpressionAccess().getNameIDParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_name_4_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getGenericTraceExpressionRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_4_0,
              						"it.unige.dibris.trace_expression_language.TExp.ID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTExp.g:1584:3: ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_modulesL_7_0= 'modules:' ) ) ( (lv_modules_8_0= ruleModule ) )* ) | ( ( (lv_typesL_9_0= 'types:' ) ) ( (lv_types_10_0= ruleEventType ) )* ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=4;
                switch ( input.LA(1) ) {
                case 40:
                    {
                    alt24=1;
                    }
                    break;
                case 41:
                    {
                    alt24=2;
                    }
                    break;
                case 42:
                    {
                    alt24=3;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // InternalTExp.g:1585:4: ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ )
            	    {
            	    // InternalTExp.g:1585:4: ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ )
            	    // InternalTExp.g:1586:5: ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+
            	    {
            	    // InternalTExp.g:1586:5: ( (lv_bodyL_5_0= 'body:' ) )
            	    // InternalTExp.g:1587:6: (lv_bodyL_5_0= 'body:' )
            	    {
            	    // InternalTExp.g:1587:6: (lv_bodyL_5_0= 'body:' )
            	    // InternalTExp.g:1588:7: lv_bodyL_5_0= 'body:'
            	    {
            	    lv_bodyL_5_0=(Token)match(input,40,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_bodyL_5_0, grammarAccess.getGenericTraceExpressionAccess().getBodyLBodyKeyword_5_0_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getGenericTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "bodyL", lv_bodyL_5_0, "body:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1600:5: ( (lv_terms_6_0= ruleTerm ) )+
            	    int cnt21=0;
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==RULE_ATOM) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // InternalTExp.g:1601:6: (lv_terms_6_0= ruleTerm )
            	    	    {
            	    	    // InternalTExp.g:1601:6: (lv_terms_6_0= ruleTerm )
            	    	    // InternalTExp.g:1602:7: lv_terms_6_0= ruleTerm
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getGenericTraceExpressionAccess().getTermsTermParserRuleCall_5_0_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_26);
            	    	    lv_terms_6_0=ruleTerm();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getGenericTraceExpressionRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"terms",
            	    	      								lv_terms_6_0,
            	    	      								"it.unige.dibris.trace_expression_language.TExp.Term");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt21 >= 1 ) break loop21;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(21, input);
            	                throw eee;
            	        }
            	        cnt21++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTExp.g:1621:4: ( ( (lv_modulesL_7_0= 'modules:' ) ) ( (lv_modules_8_0= ruleModule ) )* )
            	    {
            	    // InternalTExp.g:1621:4: ( ( (lv_modulesL_7_0= 'modules:' ) ) ( (lv_modules_8_0= ruleModule ) )* )
            	    // InternalTExp.g:1622:5: ( (lv_modulesL_7_0= 'modules:' ) ) ( (lv_modules_8_0= ruleModule ) )*
            	    {
            	    // InternalTExp.g:1622:5: ( (lv_modulesL_7_0= 'modules:' ) )
            	    // InternalTExp.g:1623:6: (lv_modulesL_7_0= 'modules:' )
            	    {
            	    // InternalTExp.g:1623:6: (lv_modulesL_7_0= 'modules:' )
            	    // InternalTExp.g:1624:7: lv_modulesL_7_0= 'modules:'
            	    {
            	    lv_modulesL_7_0=(Token)match(input,41,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_modulesL_7_0, grammarAccess.getGenericTraceExpressionAccess().getModulesLModulesKeyword_5_1_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getGenericTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "modulesL", lv_modulesL_7_0, "modules:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1636:5: ( (lv_modules_8_0= ruleModule ) )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==RULE_ATOM||LA22_0==RULE_VARIABLE) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // InternalTExp.g:1637:6: (lv_modules_8_0= ruleModule )
            	    	    {
            	    	    // InternalTExp.g:1637:6: (lv_modules_8_0= ruleModule )
            	    	    // InternalTExp.g:1638:7: lv_modules_8_0= ruleModule
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getGenericTraceExpressionAccess().getModulesModuleParserRuleCall_5_1_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_27);
            	    	    lv_modules_8_0=ruleModule();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getGenericTraceExpressionRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"modules",
            	    	      								lv_modules_8_0,
            	    	      								"it.unige.dibris.trace_expression_language.TExp.Module");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop22;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTExp.g:1657:4: ( ( (lv_typesL_9_0= 'types:' ) ) ( (lv_types_10_0= ruleEventType ) )* )
            	    {
            	    // InternalTExp.g:1657:4: ( ( (lv_typesL_9_0= 'types:' ) ) ( (lv_types_10_0= ruleEventType ) )* )
            	    // InternalTExp.g:1658:5: ( (lv_typesL_9_0= 'types:' ) ) ( (lv_types_10_0= ruleEventType ) )*
            	    {
            	    // InternalTExp.g:1658:5: ( (lv_typesL_9_0= 'types:' ) )
            	    // InternalTExp.g:1659:6: (lv_typesL_9_0= 'types:' )
            	    {
            	    // InternalTExp.g:1659:6: (lv_typesL_9_0= 'types:' )
            	    // InternalTExp.g:1660:7: lv_typesL_9_0= 'types:'
            	    {
            	    lv_typesL_9_0=(Token)match(input,42,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_typesL_9_0, grammarAccess.getGenericTraceExpressionAccess().getTypesLTypesKeyword_5_2_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getGenericTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "typesL", lv_typesL_9_0, "types:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1672:5: ( (lv_types_10_0= ruleEventType ) )*
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==RULE_ATOM) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // InternalTExp.g:1673:6: (lv_types_10_0= ruleEventType )
            	    	    {
            	    	    // InternalTExp.g:1673:6: (lv_types_10_0= ruleEventType )
            	    	    // InternalTExp.g:1674:7: lv_types_10_0= ruleEventType
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getGenericTraceExpressionAccess().getTypesEventTypeParserRuleCall_5_2_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_26);
            	    	    lv_types_10_0=ruleEventType();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getGenericTraceExpressionRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"types",
            	    	      								lv_types_10_0,
            	    	      								"it.unige.dibris.trace_expression_language.TExp.EventType");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop23;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_11=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getGenericTraceExpressionAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGenericTraceExpression"


    // $ANTLR start "entryRuleInteractionTraceExpression"
    // InternalTExp.g:1701:1: entryRuleInteractionTraceExpression returns [EObject current=null] : iv_ruleInteractionTraceExpression= ruleInteractionTraceExpression EOF ;
    public final EObject entryRuleInteractionTraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractionTraceExpression = null;


        try {
            // InternalTExp.g:1701:67: (iv_ruleInteractionTraceExpression= ruleInteractionTraceExpression EOF )
            // InternalTExp.g:1702:2: iv_ruleInteractionTraceExpression= ruleInteractionTraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteractionTraceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInteractionTraceExpression=ruleInteractionTraceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteractionTraceExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInteractionTraceExpression"


    // $ANTLR start "ruleInteractionTraceExpression"
    // InternalTExp.g:1708:1: ruleInteractionTraceExpression returns [EObject current=null] : ( () otherlv_1= 'interaction_trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleMsgEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_targetL_22_0= 'target:' ) ) ( (lv_target_23_0= ruleID ) ) ) | ( ( (lv_minimalL_24_0= 'minimal:' ) ) ( ( (lv_minimal_25_1= 'true' | lv_minimal_25_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_26_0= 'threshold:' ) ) ( (lv_threshold_27_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_28_0= 'channels:' ) ) ( (lv_channels_29_0= ruleChannel ) )+ ) )+ otherlv_30= '}' ) ;
    public final EObject ruleInteractionTraceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_bodyL_5_0=null;
        Token lv_rolesL_7_0=null;
        Token this_OP1000XFY_9=null;
        Token lv_typesL_10_0=null;
        Token lv_modulesL_12_0=null;
        Token lv_decentralizedL_14_0=null;
        Token lv_decentralized_15_1=null;
        Token lv_decentralized_15_2=null;
        Token lv_partitionL_16_0=null;
        Token lv_constraintsL_18_0=null;
        Token lv_guiL_20_0=null;
        Token lv_gui_21_1=null;
        Token lv_gui_21_2=null;
        Token lv_targetL_22_0=null;
        Token lv_minimalL_24_0=null;
        Token lv_minimal_25_1=null;
        Token lv_minimal_25_2=null;
        Token lv_thresholdL_26_0=null;
        Token lv_channelsL_28_0=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_terms_6_0 = null;

        EObject lv_roles_8_0 = null;

        EObject lv_types_11_0 = null;

        AntlrDatatypeRuleToken lv_modules_13_0 = null;

        EObject lv_partition_17_0 = null;

        EObject lv_constraints_19_0 = null;

        AntlrDatatypeRuleToken lv_target_23_0 = null;

        AntlrDatatypeRuleToken lv_threshold_27_0 = null;

        EObject lv_channels_29_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:1714:2: ( ( () otherlv_1= 'interaction_trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleMsgEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_targetL_22_0= 'target:' ) ) ( (lv_target_23_0= ruleID ) ) ) | ( ( (lv_minimalL_24_0= 'minimal:' ) ) ( ( (lv_minimal_25_1= 'true' | lv_minimal_25_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_26_0= 'threshold:' ) ) ( (lv_threshold_27_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_28_0= 'channels:' ) ) ( (lv_channels_29_0= ruleChannel ) )+ ) )+ otherlv_30= '}' ) )
            // InternalTExp.g:1715:2: ( () otherlv_1= 'interaction_trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleMsgEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_targetL_22_0= 'target:' ) ) ( (lv_target_23_0= ruleID ) ) ) | ( ( (lv_minimalL_24_0= 'minimal:' ) ) ( ( (lv_minimal_25_1= 'true' | lv_minimal_25_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_26_0= 'threshold:' ) ) ( (lv_threshold_27_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_28_0= 'channels:' ) ) ( (lv_channels_29_0= ruleChannel ) )+ ) )+ otherlv_30= '}' )
            {
            // InternalTExp.g:1715:2: ( () otherlv_1= 'interaction_trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleMsgEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_targetL_22_0= 'target:' ) ) ( (lv_target_23_0= ruleID ) ) ) | ( ( (lv_minimalL_24_0= 'minimal:' ) ) ( ( (lv_minimal_25_1= 'true' | lv_minimal_25_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_26_0= 'threshold:' ) ) ( (lv_threshold_27_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_28_0= 'channels:' ) ) ( (lv_channels_29_0= ruleChannel ) )+ ) )+ otherlv_30= '}' )
            // InternalTExp.g:1716:3: () otherlv_1= 'interaction_trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleMsgEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_targetL_22_0= 'target:' ) ) ( (lv_target_23_0= ruleID ) ) ) | ( ( (lv_minimalL_24_0= 'minimal:' ) ) ( ( (lv_minimal_25_1= 'true' | lv_minimal_25_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_26_0= 'threshold:' ) ) ( (lv_threshold_27_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_28_0= 'channels:' ) ) ( (lv_channels_29_0= ruleChannel ) )+ ) )+ otherlv_30= '}'
            {
            // InternalTExp.g:1716:3: ()
            // InternalTExp.g:1717:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInteractionTraceExpressionAccess().getInteractionTraceExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInteractionTraceExpressionAccess().getInteraction_trace_expressionKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,38,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInteractionTraceExpressionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,39,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getInteractionTraceExpressionAccess().getIdKeyword_3());
              		
            }
            // InternalTExp.g:1738:3: ( (lv_name_4_0= ruleID ) )
            // InternalTExp.g:1739:4: (lv_name_4_0= ruleID )
            {
            // InternalTExp.g:1739:4: (lv_name_4_0= ruleID )
            // InternalTExp.g:1740:5: lv_name_4_0= ruleID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInteractionTraceExpressionAccess().getNameIDParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_name_4_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInteractionTraceExpressionRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_4_0,
              						"it.unige.dibris.trace_expression_language.TExp.ID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTExp.g:1757:3: ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleMsgEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_targetL_22_0= 'target:' ) ) ( (lv_target_23_0= ruleID ) ) ) | ( ( (lv_minimalL_24_0= 'minimal:' ) ) ( ( (lv_minimal_25_1= 'true' | lv_minimal_25_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_26_0= 'threshold:' ) ) ( (lv_threshold_27_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_28_0= 'channels:' ) ) ( (lv_channels_29_0= ruleChannel ) )+ ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=13;
                switch ( input.LA(1) ) {
                case 40:
                    {
                    alt35=1;
                    }
                    break;
                case 45:
                    {
                    alt35=2;
                    }
                    break;
                case 42:
                    {
                    alt35=3;
                    }
                    break;
                case 41:
                    {
                    alt35=4;
                    }
                    break;
                case 46:
                    {
                    alt35=5;
                    }
                    break;
                case 49:
                    {
                    alt35=6;
                    }
                    break;
                case 50:
                    {
                    alt35=7;
                    }
                    break;
                case 51:
                    {
                    alt35=8;
                    }
                    break;
                case 52:
                    {
                    alt35=9;
                    }
                    break;
                case 53:
                    {
                    alt35=10;
                    }
                    break;
                case 54:
                    {
                    alt35=11;
                    }
                    break;
                case 55:
                    {
                    alt35=12;
                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // InternalTExp.g:1758:4: ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ )
            	    {
            	    // InternalTExp.g:1758:4: ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ )
            	    // InternalTExp.g:1759:5: ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+
            	    {
            	    // InternalTExp.g:1759:5: ( (lv_bodyL_5_0= 'body:' ) )
            	    // InternalTExp.g:1760:6: (lv_bodyL_5_0= 'body:' )
            	    {
            	    // InternalTExp.g:1760:6: (lv_bodyL_5_0= 'body:' )
            	    // InternalTExp.g:1761:7: lv_bodyL_5_0= 'body:'
            	    {
            	    lv_bodyL_5_0=(Token)match(input,40,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_bodyL_5_0, grammarAccess.getInteractionTraceExpressionAccess().getBodyLBodyKeyword_5_0_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getInteractionTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "bodyL", lv_bodyL_5_0, "body:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1773:5: ( (lv_terms_6_0= ruleTerm ) )+
            	    int cnt25=0;
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==RULE_ATOM) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalTExp.g:1774:6: (lv_terms_6_0= ruleTerm )
            	    	    {
            	    	    // InternalTExp.g:1774:6: (lv_terms_6_0= ruleTerm )
            	    	    // InternalTExp.g:1775:7: lv_terms_6_0= ruleTerm
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getInteractionTraceExpressionAccess().getTermsTermParserRuleCall_5_0_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_29);
            	    	    lv_terms_6_0=ruleTerm();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getInteractionTraceExpressionRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"terms",
            	    	      								lv_terms_6_0,
            	    	      								"it.unige.dibris.trace_expression_language.TExp.Term");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt25 >= 1 ) break loop25;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(25, input);
            	                throw eee;
            	        }
            	        cnt25++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTExp.g:1794:4: ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* )
            	    {
            	    // InternalTExp.g:1794:4: ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* )
            	    // InternalTExp.g:1795:5: ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )*
            	    {
            	    // InternalTExp.g:1795:5: ( (lv_rolesL_7_0= 'roles:' ) )
            	    // InternalTExp.g:1796:6: (lv_rolesL_7_0= 'roles:' )
            	    {
            	    // InternalTExp.g:1796:6: (lv_rolesL_7_0= 'roles:' )
            	    // InternalTExp.g:1797:7: lv_rolesL_7_0= 'roles:'
            	    {
            	    lv_rolesL_7_0=(Token)match(input,45,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_rolesL_7_0, grammarAccess.getInteractionTraceExpressionAccess().getRolesLRolesKeyword_5_1_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getInteractionTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "rolesL", lv_rolesL_7_0, "roles:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1809:5: ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )*
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==RULE_ATOM) ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // InternalTExp.g:1810:6: ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )?
            	    	    {
            	    	    // InternalTExp.g:1810:6: ( (lv_roles_8_0= ruleRole ) )
            	    	    // InternalTExp.g:1811:7: (lv_roles_8_0= ruleRole )
            	    	    {
            	    	    // InternalTExp.g:1811:7: (lv_roles_8_0= ruleRole )
            	    	    // InternalTExp.g:1812:8: lv_roles_8_0= ruleRole
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getInteractionTraceExpressionAccess().getRolesRoleParserRuleCall_5_1_1_0_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FOLLOW_30);
            	    	    lv_roles_8_0=ruleRole();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      								if (current==null) {
            	    	      									current = createModelElementForParent(grammarAccess.getInteractionTraceExpressionRule());
            	    	      								}
            	    	      								add(
            	    	      									current,
            	    	      									"roles",
            	    	      									lv_roles_8_0,
            	    	      									"it.unige.dibris.trace_expression_language.TExp.Role");
            	    	      								afterParserOrEnumRuleCall();
            	    	      							
            	    	    }

            	    	    }


            	    	    }

            	    	    // InternalTExp.g:1829:6: (this_OP1000XFY_9= RULE_OP1000XFY )?
            	    	    int alt26=2;
            	    	    int LA26_0 = input.LA(1);

            	    	    if ( (LA26_0==RULE_OP1000XFY) ) {
            	    	        alt26=1;
            	    	    }
            	    	    switch (alt26) {
            	    	        case 1 :
            	    	            // InternalTExp.g:1830:7: this_OP1000XFY_9= RULE_OP1000XFY
            	    	            {
            	    	            this_OP1000XFY_9=(Token)match(input,RULE_OP1000XFY,FOLLOW_29); if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              							newLeafNode(this_OP1000XFY_9, grammarAccess.getInteractionTraceExpressionAccess().getOP1000XFYTerminalRuleCall_5_1_1_1());
            	    	              						
            	    	            }

            	    	            }
            	    	            break;

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop27;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTExp.g:1838:4: ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleMsgEventType ) )* )
            	    {
            	    // InternalTExp.g:1838:4: ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleMsgEventType ) )* )
            	    // InternalTExp.g:1839:5: ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleMsgEventType ) )*
            	    {
            	    // InternalTExp.g:1839:5: ( (lv_typesL_10_0= 'types:' ) )
            	    // InternalTExp.g:1840:6: (lv_typesL_10_0= 'types:' )
            	    {
            	    // InternalTExp.g:1840:6: (lv_typesL_10_0= 'types:' )
            	    // InternalTExp.g:1841:7: lv_typesL_10_0= 'types:'
            	    {
            	    lv_typesL_10_0=(Token)match(input,42,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_typesL_10_0, grammarAccess.getInteractionTraceExpressionAccess().getTypesLTypesKeyword_5_2_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getInteractionTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "typesL", lv_typesL_10_0, "types:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1853:5: ( (lv_types_11_0= ruleMsgEventType ) )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==RULE_ATOM) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // InternalTExp.g:1854:6: (lv_types_11_0= ruleMsgEventType )
            	    	    {
            	    	    // InternalTExp.g:1854:6: (lv_types_11_0= ruleMsgEventType )
            	    	    // InternalTExp.g:1855:7: lv_types_11_0= ruleMsgEventType
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getInteractionTraceExpressionAccess().getTypesMsgEventTypeParserRuleCall_5_2_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_29);
            	    	    lv_types_11_0=ruleMsgEventType();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getInteractionTraceExpressionRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"types",
            	    	      								lv_types_11_0,
            	    	      								"it.unige.dibris.trace_expression_language.TExp.MsgEventType");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop28;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalTExp.g:1874:4: ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* )
            	    {
            	    // InternalTExp.g:1874:4: ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* )
            	    // InternalTExp.g:1875:5: ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )*
            	    {
            	    // InternalTExp.g:1875:5: ( (lv_modulesL_12_0= 'modules:' ) )
            	    // InternalTExp.g:1876:6: (lv_modulesL_12_0= 'modules:' )
            	    {
            	    // InternalTExp.g:1876:6: (lv_modulesL_12_0= 'modules:' )
            	    // InternalTExp.g:1877:7: lv_modulesL_12_0= 'modules:'
            	    {
            	    lv_modulesL_12_0=(Token)match(input,41,FOLLOW_31); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_modulesL_12_0, grammarAccess.getInteractionTraceExpressionAccess().getModulesLModulesKeyword_5_3_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getInteractionTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "modulesL", lv_modulesL_12_0, "modules:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1889:5: ( (lv_modules_13_0= ruleModule ) )*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==RULE_ATOM||LA29_0==RULE_VARIABLE) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // InternalTExp.g:1890:6: (lv_modules_13_0= ruleModule )
            	    	    {
            	    	    // InternalTExp.g:1890:6: (lv_modules_13_0= ruleModule )
            	    	    // InternalTExp.g:1891:7: lv_modules_13_0= ruleModule
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getInteractionTraceExpressionAccess().getModulesModuleParserRuleCall_5_3_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_31);
            	    	    lv_modules_13_0=ruleModule();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getInteractionTraceExpressionRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"modules",
            	    	      								lv_modules_13_0,
            	    	      								"it.unige.dibris.trace_expression_language.TExp.Module");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop29;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalTExp.g:1910:4: ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) )
            	    {
            	    // InternalTExp.g:1910:4: ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) )
            	    // InternalTExp.g:1911:5: ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) )
            	    {
            	    // InternalTExp.g:1911:5: ( (lv_decentralizedL_14_0= 'decentralized:' ) )
            	    // InternalTExp.g:1912:6: (lv_decentralizedL_14_0= 'decentralized:' )
            	    {
            	    // InternalTExp.g:1912:6: (lv_decentralizedL_14_0= 'decentralized:' )
            	    // InternalTExp.g:1913:7: lv_decentralizedL_14_0= 'decentralized:'
            	    {
            	    lv_decentralizedL_14_0=(Token)match(input,46,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_decentralizedL_14_0, grammarAccess.getInteractionTraceExpressionAccess().getDecentralizedLDecentralizedKeyword_5_4_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getInteractionTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "decentralizedL", lv_decentralizedL_14_0, "decentralized:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1925:5: ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) )
            	    // InternalTExp.g:1926:6: ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) )
            	    {
            	    // InternalTExp.g:1926:6: ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) )
            	    // InternalTExp.g:1927:7: (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' )
            	    {
            	    // InternalTExp.g:1927:7: (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==47) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==48) ) {
            	        alt30=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // InternalTExp.g:1928:8: lv_decentralized_15_1= 'true'
            	            {
            	            lv_decentralized_15_1=(Token)match(input,47,FOLLOW_33); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_decentralized_15_1, grammarAccess.getInteractionTraceExpressionAccess().getDecentralizedTrueKeyword_5_4_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getInteractionTraceExpressionRule());
            	              								}
            	              								addWithLastConsumed(current, "decentralized", lv_decentralized_15_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTExp.g:1939:8: lv_decentralized_15_2= 'false'
            	            {
            	            lv_decentralized_15_2=(Token)match(input,48,FOLLOW_33); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_decentralized_15_2, grammarAccess.getInteractionTraceExpressionAccess().getDecentralizedFalseKeyword_5_4_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getInteractionTraceExpressionRule());
            	              								}
            	              								addWithLastConsumed(current, "decentralized", lv_decentralized_15_2, null);
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalTExp.g:1954:4: ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) )
            	    {
            	    // InternalTExp.g:1954:4: ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) )
            	    // InternalTExp.g:1955:5: ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) )
            	    {
            	    // InternalTExp.g:1955:5: ( (lv_partitionL_16_0= 'partition:' ) )
            	    // InternalTExp.g:1956:6: (lv_partitionL_16_0= 'partition:' )
            	    {
            	    // InternalTExp.g:1956:6: (lv_partitionL_16_0= 'partition:' )
            	    // InternalTExp.g:1957:7: lv_partitionL_16_0= 'partition:'
            	    {
            	    lv_partitionL_16_0=(Token)match(input,49,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_partitionL_16_0, grammarAccess.getInteractionTraceExpressionAccess().getPartitionLPartitionKeyword_5_5_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getInteractionTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "partitionL", lv_partitionL_16_0, "partition:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1969:5: ( (lv_partition_17_0= rulePartition ) )
            	    // InternalTExp.g:1970:6: (lv_partition_17_0= rulePartition )
            	    {
            	    // InternalTExp.g:1970:6: (lv_partition_17_0= rulePartition )
            	    // InternalTExp.g:1971:7: lv_partition_17_0= rulePartition
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getInteractionTraceExpressionAccess().getPartitionPartitionParserRuleCall_5_5_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_partition_17_0=rulePartition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getInteractionTraceExpressionRule());
            	      							}
            	      							add(
            	      								current,
            	      								"partition",
            	      								lv_partition_17_0,
            	      								"it.unige.dibris.trace_expression_language.TExp.Partition");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalTExp.g:1990:4: ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* )
            	    {
            	    // InternalTExp.g:1990:4: ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* )
            	    // InternalTExp.g:1991:5: ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )*
            	    {
            	    // InternalTExp.g:1991:5: ( (lv_constraintsL_18_0= 'constraints:' ) )
            	    // InternalTExp.g:1992:6: (lv_constraintsL_18_0= 'constraints:' )
            	    {
            	    // InternalTExp.g:1992:6: (lv_constraintsL_18_0= 'constraints:' )
            	    // InternalTExp.g:1993:7: lv_constraintsL_18_0= 'constraints:'
            	    {
            	    lv_constraintsL_18_0=(Token)match(input,50,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_constraintsL_18_0, grammarAccess.getInteractionTraceExpressionAccess().getConstraintsLConstraintsKeyword_5_6_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getInteractionTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "constraintsL", lv_constraintsL_18_0, "constraints:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:2005:5: ( (lv_constraints_19_0= ruleConstraint ) )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==RULE_ATOM||(LA31_0>=66 && LA31_0<=68)) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalTExp.g:2006:6: (lv_constraints_19_0= ruleConstraint )
            	    	    {
            	    	    // InternalTExp.g:2006:6: (lv_constraints_19_0= ruleConstraint )
            	    	    // InternalTExp.g:2007:7: lv_constraints_19_0= ruleConstraint
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getInteractionTraceExpressionAccess().getConstraintsConstraintParserRuleCall_5_6_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_35);
            	    	    lv_constraints_19_0=ruleConstraint();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getInteractionTraceExpressionRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"constraints",
            	    	      								lv_constraints_19_0,
            	    	      								"it.unige.dibris.trace_expression_language.TExp.Constraint");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalTExp.g:2026:4: ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) )
            	    {
            	    // InternalTExp.g:2026:4: ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) )
            	    // InternalTExp.g:2027:5: ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) )
            	    {
            	    // InternalTExp.g:2027:5: ( (lv_guiL_20_0= 'gui:' ) )
            	    // InternalTExp.g:2028:6: (lv_guiL_20_0= 'gui:' )
            	    {
            	    // InternalTExp.g:2028:6: (lv_guiL_20_0= 'gui:' )
            	    // InternalTExp.g:2029:7: lv_guiL_20_0= 'gui:'
            	    {
            	    lv_guiL_20_0=(Token)match(input,51,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_guiL_20_0, grammarAccess.getInteractionTraceExpressionAccess().getGuiLGuiKeyword_5_7_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getInteractionTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "guiL", lv_guiL_20_0, "gui:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:2041:5: ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) )
            	    // InternalTExp.g:2042:6: ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) )
            	    {
            	    // InternalTExp.g:2042:6: ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) )
            	    // InternalTExp.g:2043:7: (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' )
            	    {
            	    // InternalTExp.g:2043:7: (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' )
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==47) ) {
            	        alt32=1;
            	    }
            	    else if ( (LA32_0==48) ) {
            	        alt32=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalTExp.g:2044:8: lv_gui_21_1= 'true'
            	            {
            	            lv_gui_21_1=(Token)match(input,47,FOLLOW_33); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_gui_21_1, grammarAccess.getInteractionTraceExpressionAccess().getGuiTrueKeyword_5_7_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getInteractionTraceExpressionRule());
            	              								}
            	              								addWithLastConsumed(current, "gui", lv_gui_21_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTExp.g:2055:8: lv_gui_21_2= 'false'
            	            {
            	            lv_gui_21_2=(Token)match(input,48,FOLLOW_33); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_gui_21_2, grammarAccess.getInteractionTraceExpressionAccess().getGuiFalseKeyword_5_7_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getInteractionTraceExpressionRule());
            	              								}
            	              								addWithLastConsumed(current, "gui", lv_gui_21_2, null);
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalTExp.g:2070:4: ( ( (lv_targetL_22_0= 'target:' ) ) ( (lv_target_23_0= ruleID ) ) )
            	    {
            	    // InternalTExp.g:2070:4: ( ( (lv_targetL_22_0= 'target:' ) ) ( (lv_target_23_0= ruleID ) ) )
            	    // InternalTExp.g:2071:5: ( (lv_targetL_22_0= 'target:' ) ) ( (lv_target_23_0= ruleID ) )
            	    {
            	    // InternalTExp.g:2071:5: ( (lv_targetL_22_0= 'target:' ) )
            	    // InternalTExp.g:2072:6: (lv_targetL_22_0= 'target:' )
            	    {
            	    // InternalTExp.g:2072:6: (lv_targetL_22_0= 'target:' )
            	    // InternalTExp.g:2073:7: lv_targetL_22_0= 'target:'
            	    {
            	    lv_targetL_22_0=(Token)match(input,52,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_targetL_22_0, grammarAccess.getInteractionTraceExpressionAccess().getTargetLTargetKeyword_5_8_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getInteractionTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "targetL", lv_targetL_22_0, "target:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:2085:5: ( (lv_target_23_0= ruleID ) )
            	    // InternalTExp.g:2086:6: (lv_target_23_0= ruleID )
            	    {
            	    // InternalTExp.g:2086:6: (lv_target_23_0= ruleID )
            	    // InternalTExp.g:2087:7: lv_target_23_0= ruleID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getInteractionTraceExpressionAccess().getTargetIDParserRuleCall_5_8_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_target_23_0=ruleID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getInteractionTraceExpressionRule());
            	      							}
            	      							add(
            	      								current,
            	      								"target",
            	      								lv_target_23_0,
            	      								"it.unige.dibris.trace_expression_language.TExp.ID");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalTExp.g:2106:4: ( ( (lv_minimalL_24_0= 'minimal:' ) ) ( ( (lv_minimal_25_1= 'true' | lv_minimal_25_2= 'false' ) ) ) )
            	    {
            	    // InternalTExp.g:2106:4: ( ( (lv_minimalL_24_0= 'minimal:' ) ) ( ( (lv_minimal_25_1= 'true' | lv_minimal_25_2= 'false' ) ) ) )
            	    // InternalTExp.g:2107:5: ( (lv_minimalL_24_0= 'minimal:' ) ) ( ( (lv_minimal_25_1= 'true' | lv_minimal_25_2= 'false' ) ) )
            	    {
            	    // InternalTExp.g:2107:5: ( (lv_minimalL_24_0= 'minimal:' ) )
            	    // InternalTExp.g:2108:6: (lv_minimalL_24_0= 'minimal:' )
            	    {
            	    // InternalTExp.g:2108:6: (lv_minimalL_24_0= 'minimal:' )
            	    // InternalTExp.g:2109:7: lv_minimalL_24_0= 'minimal:'
            	    {
            	    lv_minimalL_24_0=(Token)match(input,53,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_minimalL_24_0, grammarAccess.getInteractionTraceExpressionAccess().getMinimalLMinimalKeyword_5_9_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getInteractionTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "minimalL", lv_minimalL_24_0, "minimal:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:2121:5: ( ( (lv_minimal_25_1= 'true' | lv_minimal_25_2= 'false' ) ) )
            	    // InternalTExp.g:2122:6: ( (lv_minimal_25_1= 'true' | lv_minimal_25_2= 'false' ) )
            	    {
            	    // InternalTExp.g:2122:6: ( (lv_minimal_25_1= 'true' | lv_minimal_25_2= 'false' ) )
            	    // InternalTExp.g:2123:7: (lv_minimal_25_1= 'true' | lv_minimal_25_2= 'false' )
            	    {
            	    // InternalTExp.g:2123:7: (lv_minimal_25_1= 'true' | lv_minimal_25_2= 'false' )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==47) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==48) ) {
            	        alt33=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalTExp.g:2124:8: lv_minimal_25_1= 'true'
            	            {
            	            lv_minimal_25_1=(Token)match(input,47,FOLLOW_33); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_minimal_25_1, grammarAccess.getInteractionTraceExpressionAccess().getMinimalTrueKeyword_5_9_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getInteractionTraceExpressionRule());
            	              								}
            	              								addWithLastConsumed(current, "minimal", lv_minimal_25_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTExp.g:2135:8: lv_minimal_25_2= 'false'
            	            {
            	            lv_minimal_25_2=(Token)match(input,48,FOLLOW_33); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_minimal_25_2, grammarAccess.getInteractionTraceExpressionAccess().getMinimalFalseKeyword_5_9_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getInteractionTraceExpressionRule());
            	              								}
            	              								addWithLastConsumed(current, "minimal", lv_minimal_25_2, null);
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalTExp.g:2150:4: ( ( (lv_thresholdL_26_0= 'threshold:' ) ) ( (lv_threshold_27_0= ruleNUMBER ) ) )
            	    {
            	    // InternalTExp.g:2150:4: ( ( (lv_thresholdL_26_0= 'threshold:' ) ) ( (lv_threshold_27_0= ruleNUMBER ) ) )
            	    // InternalTExp.g:2151:5: ( (lv_thresholdL_26_0= 'threshold:' ) ) ( (lv_threshold_27_0= ruleNUMBER ) )
            	    {
            	    // InternalTExp.g:2151:5: ( (lv_thresholdL_26_0= 'threshold:' ) )
            	    // InternalTExp.g:2152:6: (lv_thresholdL_26_0= 'threshold:' )
            	    {
            	    // InternalTExp.g:2152:6: (lv_thresholdL_26_0= 'threshold:' )
            	    // InternalTExp.g:2153:7: lv_thresholdL_26_0= 'threshold:'
            	    {
            	    lv_thresholdL_26_0=(Token)match(input,54,FOLLOW_36); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_thresholdL_26_0, grammarAccess.getInteractionTraceExpressionAccess().getThresholdLThresholdKeyword_5_10_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getInteractionTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "thresholdL", lv_thresholdL_26_0, "threshold:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:2165:5: ( (lv_threshold_27_0= ruleNUMBER ) )
            	    // InternalTExp.g:2166:6: (lv_threshold_27_0= ruleNUMBER )
            	    {
            	    // InternalTExp.g:2166:6: (lv_threshold_27_0= ruleNUMBER )
            	    // InternalTExp.g:2167:7: lv_threshold_27_0= ruleNUMBER
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getInteractionTraceExpressionAccess().getThresholdNUMBERParserRuleCall_5_10_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_threshold_27_0=ruleNUMBER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getInteractionTraceExpressionRule());
            	      							}
            	      							add(
            	      								current,
            	      								"threshold",
            	      								lv_threshold_27_0,
            	      								"it.unige.dibris.trace_expression_language.TExp.NUMBER");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalTExp.g:2186:4: ( ( (lv_channelsL_28_0= 'channels:' ) ) ( (lv_channels_29_0= ruleChannel ) )+ )
            	    {
            	    // InternalTExp.g:2186:4: ( ( (lv_channelsL_28_0= 'channels:' ) ) ( (lv_channels_29_0= ruleChannel ) )+ )
            	    // InternalTExp.g:2187:5: ( (lv_channelsL_28_0= 'channels:' ) ) ( (lv_channels_29_0= ruleChannel ) )+
            	    {
            	    // InternalTExp.g:2187:5: ( (lv_channelsL_28_0= 'channels:' ) )
            	    // InternalTExp.g:2188:6: (lv_channelsL_28_0= 'channels:' )
            	    {
            	    // InternalTExp.g:2188:6: (lv_channelsL_28_0= 'channels:' )
            	    // InternalTExp.g:2189:7: lv_channelsL_28_0= 'channels:'
            	    {
            	    lv_channelsL_28_0=(Token)match(input,55,FOLLOW_24); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_channelsL_28_0, grammarAccess.getInteractionTraceExpressionAccess().getChannelsLChannelsKeyword_5_11_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getInteractionTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "channelsL", lv_channelsL_28_0, "channels:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:2201:5: ( (lv_channels_29_0= ruleChannel ) )+
            	    int cnt34=0;
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==RULE_ATOM) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // InternalTExp.g:2202:6: (lv_channels_29_0= ruleChannel )
            	    	    {
            	    	    // InternalTExp.g:2202:6: (lv_channels_29_0= ruleChannel )
            	    	    // InternalTExp.g:2203:7: lv_channels_29_0= ruleChannel
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getInteractionTraceExpressionAccess().getChannelsChannelParserRuleCall_5_11_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_29);
            	    	    lv_channels_29_0=ruleChannel();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getInteractionTraceExpressionRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"channels",
            	    	      								lv_channels_29_0,
            	    	      								"it.unige.dibris.trace_expression_language.TExp.Channel");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt34 >= 1 ) break loop34;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(34, input);
            	                throw eee;
            	        }
            	        cnt34++;
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            otherlv_30=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_30, grammarAccess.getInteractionTraceExpressionAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInteractionTraceExpression"


    // $ANTLR start "entryRuleEventType"
    // InternalTExp.g:2230:1: entryRuleEventType returns [EObject current=null] : iv_ruleEventType= ruleEventType EOF ;
    public final EObject entryRuleEventType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventType = null;


        try {
            // InternalTExp.g:2230:50: (iv_ruleEventType= ruleEventType EOF )
            // InternalTExp.g:2231:2: iv_ruleEventType= ruleEventType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEventType=ruleEventType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEventType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEventType"


    // $ANTLR start "ruleEventType"
    // InternalTExp.g:2237:1: ruleEventType returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleGroundTerm ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleGroundTerm ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_events_8_0= ruleEvent ) )* otherlv_9= '}' ) ;
    public final EObject ruleEventType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_OP1000XFY_3=null;
        Token otherlv_5=null;
        Token this_OP600XFY_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_expr_2_0 = null;

        EObject lv_exprs_4_0 = null;

        EObject lv_events_8_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2243:2: ( ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleGroundTerm ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleGroundTerm ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_events_8_0= ruleEvent ) )* otherlv_9= '}' ) )
            // InternalTExp.g:2244:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleGroundTerm ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleGroundTerm ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_events_8_0= ruleEvent ) )* otherlv_9= '}' )
            {
            // InternalTExp.g:2244:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleGroundTerm ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleGroundTerm ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_events_8_0= ruleEvent ) )* otherlv_9= '}' )
            // InternalTExp.g:2245:3: ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleGroundTerm ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleGroundTerm ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_events_8_0= ruleEvent ) )* otherlv_9= '}'
            {
            // InternalTExp.g:2245:3: ( (lv_name_0_0= ruleID ) )
            // InternalTExp.g:2246:4: (lv_name_0_0= ruleID )
            {
            // InternalTExp.g:2246:4: (lv_name_0_0= ruleID )
            // InternalTExp.g:2247:5: lv_name_0_0= ruleID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEventTypeAccess().getNameIDParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_37);
            lv_name_0_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEventTypeRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"it.unige.dibris.trace_expression_language.TExp.ID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTExp.g:2264:3: (otherlv_1= '(' ( (lv_expr_2_0= ruleGroundTerm ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleGroundTerm ) ) )* otherlv_5= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==32) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalTExp.g:2265:4: otherlv_1= '(' ( (lv_expr_2_0= ruleGroundTerm ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleGroundTerm ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEventTypeAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:2269:4: ( (lv_expr_2_0= ruleGroundTerm ) )
                    // InternalTExp.g:2270:5: (lv_expr_2_0= ruleGroundTerm )
                    {
                    // InternalTExp.g:2270:5: (lv_expr_2_0= ruleGroundTerm )
                    // InternalTExp.g:2271:6: lv_expr_2_0= ruleGroundTerm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEventTypeAccess().getExprGroundTermParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_expr_2_0=ruleGroundTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEventTypeRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_2_0,
                      							"it.unige.dibris.trace_expression_language.TExp.GroundTerm");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTExp.g:2288:4: (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleGroundTerm ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_OP1000XFY) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalTExp.g:2289:5: this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleGroundTerm ) )
                    	    {
                    	    this_OP1000XFY_3=(Token)match(input,RULE_OP1000XFY,FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OP1000XFY_3, grammarAccess.getEventTypeAccess().getOP1000XFYTerminalRuleCall_1_2_0());
                    	      				
                    	    }
                    	    // InternalTExp.g:2293:5: ( (lv_exprs_4_0= ruleGroundTerm ) )
                    	    // InternalTExp.g:2294:6: (lv_exprs_4_0= ruleGroundTerm )
                    	    {
                    	    // InternalTExp.g:2294:6: (lv_exprs_4_0= ruleGroundTerm )
                    	    // InternalTExp.g:2295:7: lv_exprs_4_0= ruleGroundTerm
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEventTypeAccess().getExprsGroundTermParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_39);
                    	    lv_exprs_4_0=ruleGroundTerm();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getEventTypeRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"exprs",
                    	      								lv_exprs_4_0,
                    	      								"it.unige.dibris.trace_expression_language.TExp.GroundTerm");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,33,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getEventTypeAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            this_OP600XFY_6=(Token)match(input,RULE_OP600XFY,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OP600XFY_6, grammarAccess.getEventTypeAccess().getOP600XFYTerminalRuleCall_2());
              		
            }
            otherlv_7=(Token)match(input,38,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getEventTypeAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalTExp.g:2326:3: ( (lv_events_8_0= ruleEvent ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ATOM||LA38_0==56) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalTExp.g:2327:4: (lv_events_8_0= ruleEvent )
            	    {
            	    // InternalTExp.g:2327:4: (lv_events_8_0= ruleEvent )
            	    // InternalTExp.g:2328:5: lv_events_8_0= ruleEvent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEventTypeAccess().getEventsEventParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_events_8_0=ruleEvent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEventTypeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"events",
            	      						lv_events_8_0,
            	      						"it.unige.dibris.trace_expression_language.TExp.Event");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_9=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getEventTypeAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEventType"


    // $ANTLR start "entryRuleMsgEventType"
    // InternalTExp.g:2353:1: entryRuleMsgEventType returns [EObject current=null] : iv_ruleMsgEventType= ruleMsgEventType EOF ;
    public final EObject entryRuleMsgEventType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMsgEventType = null;


        try {
            // InternalTExp.g:2353:53: (iv_ruleMsgEventType= ruleMsgEventType EOF )
            // InternalTExp.g:2354:2: iv_ruleMsgEventType= ruleMsgEventType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMsgEventTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMsgEventType=ruleMsgEventType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMsgEventType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMsgEventType"


    // $ANTLR start "ruleMsgEventType"
    // InternalTExp.g:2360:1: ruleMsgEventType returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_msgs_8_0= ruleMsg ) )* otherlv_9= '}' (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )? ) ;
    public final EObject ruleMsgEventType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_OP1000XFY_3=null;
        Token otherlv_5=null;
        Token this_OP600XFY_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_expr_2_0 = null;

        EObject lv_exprs_4_0 = null;

        EObject lv_msgs_8_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2366:2: ( ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_msgs_8_0= ruleMsg ) )* otherlv_9= '}' (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )? ) )
            // InternalTExp.g:2367:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_msgs_8_0= ruleMsg ) )* otherlv_9= '}' (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )? )
            {
            // InternalTExp.g:2367:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_msgs_8_0= ruleMsg ) )* otherlv_9= '}' (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )? )
            // InternalTExp.g:2368:3: ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_msgs_8_0= ruleMsg ) )* otherlv_9= '}' (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )?
            {
            // InternalTExp.g:2368:3: ( (lv_name_0_0= ruleID ) )
            // InternalTExp.g:2369:4: (lv_name_0_0= ruleID )
            {
            // InternalTExp.g:2369:4: (lv_name_0_0= ruleID )
            // InternalTExp.g:2370:5: lv_name_0_0= ruleID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMsgEventTypeAccess().getNameIDParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_37);
            lv_name_0_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMsgEventTypeRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"it.unige.dibris.trace_expression_language.TExp.ID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTExp.g:2387:3: (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==32) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalTExp.g:2388:4: otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMsgEventTypeAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:2392:4: ( (lv_expr_2_0= ruleExpression0 ) )
                    // InternalTExp.g:2393:5: (lv_expr_2_0= ruleExpression0 )
                    {
                    // InternalTExp.g:2393:5: (lv_expr_2_0= ruleExpression0 )
                    // InternalTExp.g:2394:6: lv_expr_2_0= ruleExpression0
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMsgEventTypeAccess().getExprExpression0ParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_expr_2_0=ruleExpression0();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMsgEventTypeRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_2_0,
                      							"it.unige.dibris.trace_expression_language.TExp.Expression0");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTExp.g:2411:4: (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_OP1000XFY) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalTExp.g:2412:5: this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) )
                    	    {
                    	    this_OP1000XFY_3=(Token)match(input,RULE_OP1000XFY,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OP1000XFY_3, grammarAccess.getMsgEventTypeAccess().getOP1000XFYTerminalRuleCall_1_2_0());
                    	      				
                    	    }
                    	    // InternalTExp.g:2416:5: ( (lv_exprs_4_0= ruleExpression0 ) )
                    	    // InternalTExp.g:2417:6: (lv_exprs_4_0= ruleExpression0 )
                    	    {
                    	    // InternalTExp.g:2417:6: (lv_exprs_4_0= ruleExpression0 )
                    	    // InternalTExp.g:2418:7: lv_exprs_4_0= ruleExpression0
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMsgEventTypeAccess().getExprsExpression0ParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_39);
                    	    lv_exprs_4_0=ruleExpression0();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMsgEventTypeRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"exprs",
                    	      								lv_exprs_4_0,
                    	      								"it.unige.dibris.trace_expression_language.TExp.Expression0");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,33,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getMsgEventTypeAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            this_OP600XFY_6=(Token)match(input,RULE_OP600XFY,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OP600XFY_6, grammarAccess.getMsgEventTypeAccess().getOP600XFYTerminalRuleCall_2());
              		
            }
            otherlv_7=(Token)match(input,38,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMsgEventTypeAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalTExp.g:2449:3: ( (lv_msgs_8_0= ruleMsg ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ATOM||LA41_0==34) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalTExp.g:2450:4: (lv_msgs_8_0= ruleMsg )
            	    {
            	    // InternalTExp.g:2450:4: (lv_msgs_8_0= ruleMsg )
            	    // InternalTExp.g:2451:5: lv_msgs_8_0= ruleMsg
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMsgEventTypeAccess().getMsgsMsgParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_msgs_8_0=ruleMsg();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMsgEventTypeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"msgs",
            	      						lv_msgs_8_0,
            	      						"it.unige.dibris.trace_expression_language.TExp.Msg");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_9=(Token)match(input,43,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getMsgEventTypeAccess().getRightCurlyBracketKeyword_5());
              		
            }
            // InternalTExp.g:2472:3: (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==34) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalTExp.g:2473:4: otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']'
                    {
                    otherlv_10=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getMsgEventTypeAccess().getLeftSquareBracketKeyword_6_0());
                      			
                    }
                    // InternalTExp.g:2477:4: ( ( ruleID ) )
                    // InternalTExp.g:2478:5: ( ruleID )
                    {
                    // InternalTExp.g:2478:5: ( ruleID )
                    // InternalTExp.g:2479:6: ruleID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMsgEventTypeRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMsgEventTypeAccess().getChannelChannelCrossReference_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getMsgEventTypeAccess().getRightSquareBracketKeyword_6_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMsgEventType"


    // $ANTLR start "entryRuleGroundTerm"
    // InternalTExp.g:2505:1: entryRuleGroundTerm returns [EObject current=null] : iv_ruleGroundTerm= ruleGroundTerm EOF ;
    public final EObject entryRuleGroundTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroundTerm = null;


        try {
            // InternalTExp.g:2505:51: (iv_ruleGroundTerm= ruleGroundTerm EOF )
            // InternalTExp.g:2506:2: iv_ruleGroundTerm= ruleGroundTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGroundTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGroundTerm=ruleGroundTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGroundTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGroundTerm"


    // $ANTLR start "ruleGroundTerm"
    // InternalTExp.g:2512:1: ruleGroundTerm returns [EObject current=null] : ( ( (lv_variable_0_0= RULE_VARIABLE ) ) | ( ( (lv_symbol_1_0= ruleID ) ) otherlv_2= '(' ( (lv_arg_3_0= ruleGroundTerm ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_args_5_0= ruleGroundTerm ) ) )* otherlv_6= ')' ) ) ;
    public final EObject ruleGroundTerm() throws RecognitionException {
        EObject current = null;

        Token lv_variable_0_0=null;
        Token otherlv_2=null;
        Token this_OP1000XFY_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_symbol_1_0 = null;

        EObject lv_arg_3_0 = null;

        EObject lv_args_5_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2518:2: ( ( ( (lv_variable_0_0= RULE_VARIABLE ) ) | ( ( (lv_symbol_1_0= ruleID ) ) otherlv_2= '(' ( (lv_arg_3_0= ruleGroundTerm ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_args_5_0= ruleGroundTerm ) ) )* otherlv_6= ')' ) ) )
            // InternalTExp.g:2519:2: ( ( (lv_variable_0_0= RULE_VARIABLE ) ) | ( ( (lv_symbol_1_0= ruleID ) ) otherlv_2= '(' ( (lv_arg_3_0= ruleGroundTerm ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_args_5_0= ruleGroundTerm ) ) )* otherlv_6= ')' ) )
            {
            // InternalTExp.g:2519:2: ( ( (lv_variable_0_0= RULE_VARIABLE ) ) | ( ( (lv_symbol_1_0= ruleID ) ) otherlv_2= '(' ( (lv_arg_3_0= ruleGroundTerm ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_args_5_0= ruleGroundTerm ) ) )* otherlv_6= ')' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_VARIABLE) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ATOM) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalTExp.g:2520:3: ( (lv_variable_0_0= RULE_VARIABLE ) )
                    {
                    // InternalTExp.g:2520:3: ( (lv_variable_0_0= RULE_VARIABLE ) )
                    // InternalTExp.g:2521:4: (lv_variable_0_0= RULE_VARIABLE )
                    {
                    // InternalTExp.g:2521:4: (lv_variable_0_0= RULE_VARIABLE )
                    // InternalTExp.g:2522:5: lv_variable_0_0= RULE_VARIABLE
                    {
                    lv_variable_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_variable_0_0, grammarAccess.getGroundTermAccess().getVariableVARIABLETerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getGroundTermRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"variable",
                      						lv_variable_0_0,
                      						"it.unige.dibris.trace_expression_language.TExp.VARIABLE");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTExp.g:2539:3: ( ( (lv_symbol_1_0= ruleID ) ) otherlv_2= '(' ( (lv_arg_3_0= ruleGroundTerm ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_args_5_0= ruleGroundTerm ) ) )* otherlv_6= ')' )
                    {
                    // InternalTExp.g:2539:3: ( ( (lv_symbol_1_0= ruleID ) ) otherlv_2= '(' ( (lv_arg_3_0= ruleGroundTerm ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_args_5_0= ruleGroundTerm ) ) )* otherlv_6= ')' )
                    // InternalTExp.g:2540:4: ( (lv_symbol_1_0= ruleID ) ) otherlv_2= '(' ( (lv_arg_3_0= ruleGroundTerm ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_args_5_0= ruleGroundTerm ) ) )* otherlv_6= ')'
                    {
                    // InternalTExp.g:2540:4: ( (lv_symbol_1_0= ruleID ) )
                    // InternalTExp.g:2541:5: (lv_symbol_1_0= ruleID )
                    {
                    // InternalTExp.g:2541:5: (lv_symbol_1_0= ruleID )
                    // InternalTExp.g:2542:6: lv_symbol_1_0= ruleID
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGroundTermAccess().getSymbolIDParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_44);
                    lv_symbol_1_0=ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGroundTermRule());
                      						}
                      						set(
                      							current,
                      							"symbol",
                      							lv_symbol_1_0,
                      							"it.unige.dibris.trace_expression_language.TExp.ID");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,32,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getGroundTermAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalTExp.g:2563:4: ( (lv_arg_3_0= ruleGroundTerm ) )
                    // InternalTExp.g:2564:5: (lv_arg_3_0= ruleGroundTerm )
                    {
                    // InternalTExp.g:2564:5: (lv_arg_3_0= ruleGroundTerm )
                    // InternalTExp.g:2565:6: lv_arg_3_0= ruleGroundTerm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGroundTermAccess().getArgGroundTermParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_arg_3_0=ruleGroundTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGroundTermRule());
                      						}
                      						set(
                      							current,
                      							"arg",
                      							lv_arg_3_0,
                      							"it.unige.dibris.trace_expression_language.TExp.GroundTerm");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTExp.g:2582:4: (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_args_5_0= ruleGroundTerm ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==RULE_OP1000XFY) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalTExp.g:2583:5: this_OP1000XFY_4= RULE_OP1000XFY ( (lv_args_5_0= ruleGroundTerm ) )
                    	    {
                    	    this_OP1000XFY_4=(Token)match(input,RULE_OP1000XFY,FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OP1000XFY_4, grammarAccess.getGroundTermAccess().getOP1000XFYTerminalRuleCall_1_3_0());
                    	      				
                    	    }
                    	    // InternalTExp.g:2587:5: ( (lv_args_5_0= ruleGroundTerm ) )
                    	    // InternalTExp.g:2588:6: (lv_args_5_0= ruleGroundTerm )
                    	    {
                    	    // InternalTExp.g:2588:6: (lv_args_5_0= ruleGroundTerm )
                    	    // InternalTExp.g:2589:7: lv_args_5_0= ruleGroundTerm
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getGroundTermAccess().getArgsGroundTermParserRuleCall_1_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_39);
                    	    lv_args_5_0=ruleGroundTerm();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getGroundTermRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"args",
                    	      								lv_args_5_0,
                    	      								"it.unige.dibris.trace_expression_language.TExp.GroundTerm");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getGroundTermAccess().getRightParenthesisKeyword_1_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleGroundTerm"


    // $ANTLR start "entryRuleEvent"
    // InternalTExp.g:2616:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalTExp.g:2616:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalTExp.g:2617:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalTExp.g:2623:1: ruleEvent returns [EObject current=null] : ( ( ( () ( (lv_name_1_0= ruleID ) ) (otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ) | ( () otherlv_8= 'derived' ( ( ruleID ) ) (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')' )? ) ) (otherlv_15= '[' ( (lv_constraints_16_0= ruleExpressionInfinity ) ) otherlv_17= ']' )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_OP1000XFY_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_OP1000XFY_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_exprs_5_0 = null;

        EObject lv_expr_11_0 = null;

        EObject lv_exprs_13_0 = null;

        EObject lv_constraints_16_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2629:2: ( ( ( ( () ( (lv_name_1_0= ruleID ) ) (otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ) | ( () otherlv_8= 'derived' ( ( ruleID ) ) (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')' )? ) ) (otherlv_15= '[' ( (lv_constraints_16_0= ruleExpressionInfinity ) ) otherlv_17= ']' )? ) )
            // InternalTExp.g:2630:2: ( ( ( () ( (lv_name_1_0= ruleID ) ) (otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ) | ( () otherlv_8= 'derived' ( ( ruleID ) ) (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')' )? ) ) (otherlv_15= '[' ( (lv_constraints_16_0= ruleExpressionInfinity ) ) otherlv_17= ']' )? )
            {
            // InternalTExp.g:2630:2: ( ( ( () ( (lv_name_1_0= ruleID ) ) (otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ) | ( () otherlv_8= 'derived' ( ( ruleID ) ) (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')' )? ) ) (otherlv_15= '[' ( (lv_constraints_16_0= ruleExpressionInfinity ) ) otherlv_17= ']' )? )
            // InternalTExp.g:2631:3: ( ( () ( (lv_name_1_0= ruleID ) ) (otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ) | ( () otherlv_8= 'derived' ( ( ruleID ) ) (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')' )? ) ) (otherlv_15= '[' ( (lv_constraints_16_0= ruleExpressionInfinity ) ) otherlv_17= ']' )?
            {
            // InternalTExp.g:2631:3: ( ( () ( (lv_name_1_0= ruleID ) ) (otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ) | ( () otherlv_8= 'derived' ( ( ruleID ) ) (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')' )? ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ATOM) ) {
                alt49=1;
            }
            else if ( (LA49_0==56) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalTExp.g:2632:4: ( () ( (lv_name_1_0= ruleID ) ) (otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? )
                    {
                    // InternalTExp.g:2632:4: ( () ( (lv_name_1_0= ruleID ) ) (otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? )
                    // InternalTExp.g:2633:5: () ( (lv_name_1_0= ruleID ) ) (otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )?
                    {
                    // InternalTExp.g:2633:5: ()
                    // InternalTExp.g:2634:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getEventAccess().getBasicEventAction_0_0_0(),
                      							current);
                      					
                    }

                    }

                    // InternalTExp.g:2643:5: ( (lv_name_1_0= ruleID ) )
                    // InternalTExp.g:2644:6: (lv_name_1_0= ruleID )
                    {
                    // InternalTExp.g:2644:6: (lv_name_1_0= ruleID )
                    // InternalTExp.g:2645:7: lv_name_1_0= ruleID
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getEventAccess().getNameIDParserRuleCall_0_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_45);
                    lv_name_1_0=ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getEventRule());
                      							}
                      							set(
                      								current,
                      								"name",
                      								lv_name_1_0,
                      								"it.unige.dibris.trace_expression_language.TExp.ID");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalTExp.g:2662:5: (otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==32) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalTExp.g:2663:6: otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')'
                            {
                            otherlv_2=(Token)match(input,32,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getEventAccess().getLeftParenthesisKeyword_0_0_2_0());
                              					
                            }
                            // InternalTExp.g:2667:6: ( (lv_expr_3_0= ruleExpression0 ) )
                            // InternalTExp.g:2668:7: (lv_expr_3_0= ruleExpression0 )
                            {
                            // InternalTExp.g:2668:7: (lv_expr_3_0= ruleExpression0 )
                            // InternalTExp.g:2669:8: lv_expr_3_0= ruleExpression0
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getEventAccess().getExprExpression0ParserRuleCall_0_0_2_1_0());
                              							
                            }
                            pushFollow(FOLLOW_39);
                            lv_expr_3_0=ruleExpression0();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getEventRule());
                              								}
                              								set(
                              									current,
                              									"expr",
                              									lv_expr_3_0,
                              									"it.unige.dibris.trace_expression_language.TExp.Expression0");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalTExp.g:2686:6: (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==RULE_OP1000XFY) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // InternalTExp.g:2687:7: this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) )
                            	    {
                            	    this_OP1000XFY_4=(Token)match(input,RULE_OP1000XFY,FOLLOW_7); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(this_OP1000XFY_4, grammarAccess.getEventAccess().getOP1000XFYTerminalRuleCall_0_0_2_2_0());
                            	      						
                            	    }
                            	    // InternalTExp.g:2691:7: ( (lv_exprs_5_0= ruleExpression0 ) )
                            	    // InternalTExp.g:2692:8: (lv_exprs_5_0= ruleExpression0 )
                            	    {
                            	    // InternalTExp.g:2692:8: (lv_exprs_5_0= ruleExpression0 )
                            	    // InternalTExp.g:2693:9: lv_exprs_5_0= ruleExpression0
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getEventAccess().getExprsExpression0ParserRuleCall_0_0_2_2_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_39);
                            	    lv_exprs_5_0=ruleExpression0();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getEventRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"exprs",
                            	      										lv_exprs_5_0,
                            	      										"it.unige.dibris.trace_expression_language.TExp.Expression0");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop45;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,33,FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getEventAccess().getRightParenthesisKeyword_0_0_2_3());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTExp.g:2718:4: ( () otherlv_8= 'derived' ( ( ruleID ) ) (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')' )? )
                    {
                    // InternalTExp.g:2718:4: ( () otherlv_8= 'derived' ( ( ruleID ) ) (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')' )? )
                    // InternalTExp.g:2719:5: () otherlv_8= 'derived' ( ( ruleID ) ) (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')' )?
                    {
                    // InternalTExp.g:2719:5: ()
                    // InternalTExp.g:2720:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElement(
                      							grammarAccess.getEventAccess().getDerivedEventAction_0_1_0(),
                      							current);
                      					
                    }

                    }

                    otherlv_8=(Token)match(input,56,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getEventAccess().getDerivedKeyword_0_1_1());
                      				
                    }
                    // InternalTExp.g:2733:5: ( ( ruleID ) )
                    // InternalTExp.g:2734:6: ( ruleID )
                    {
                    // InternalTExp.g:2734:6: ( ruleID )
                    // InternalTExp.g:2735:7: ruleID
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getEventRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getEventAccess().getBaseEventTypeCrossReference_0_1_2_0());
                      						
                    }
                    pushFollow(FOLLOW_45);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalTExp.g:2752:5: (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==32) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalTExp.g:2753:6: otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')'
                            {
                            otherlv_10=(Token)match(input,32,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_10, grammarAccess.getEventAccess().getLeftParenthesisKeyword_0_1_3_0());
                              					
                            }
                            // InternalTExp.g:2757:6: ( (lv_expr_11_0= ruleExpression0 ) )
                            // InternalTExp.g:2758:7: (lv_expr_11_0= ruleExpression0 )
                            {
                            // InternalTExp.g:2758:7: (lv_expr_11_0= ruleExpression0 )
                            // InternalTExp.g:2759:8: lv_expr_11_0= ruleExpression0
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getEventAccess().getExprExpression0ParserRuleCall_0_1_3_1_0());
                              							
                            }
                            pushFollow(FOLLOW_39);
                            lv_expr_11_0=ruleExpression0();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getEventRule());
                              								}
                              								set(
                              									current,
                              									"expr",
                              									lv_expr_11_0,
                              									"it.unige.dibris.trace_expression_language.TExp.Expression0");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalTExp.g:2776:6: (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )*
                            loop47:
                            do {
                                int alt47=2;
                                int LA47_0 = input.LA(1);

                                if ( (LA47_0==RULE_OP1000XFY) ) {
                                    alt47=1;
                                }


                                switch (alt47) {
                            	case 1 :
                            	    // InternalTExp.g:2777:7: this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) )
                            	    {
                            	    this_OP1000XFY_12=(Token)match(input,RULE_OP1000XFY,FOLLOW_7); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(this_OP1000XFY_12, grammarAccess.getEventAccess().getOP1000XFYTerminalRuleCall_0_1_3_2_0());
                            	      						
                            	    }
                            	    // InternalTExp.g:2781:7: ( (lv_exprs_13_0= ruleExpression0 ) )
                            	    // InternalTExp.g:2782:8: (lv_exprs_13_0= ruleExpression0 )
                            	    {
                            	    // InternalTExp.g:2782:8: (lv_exprs_13_0= ruleExpression0 )
                            	    // InternalTExp.g:2783:9: lv_exprs_13_0= ruleExpression0
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getEventAccess().getExprsExpression0ParserRuleCall_0_1_3_2_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_39);
                            	    lv_exprs_13_0=ruleExpression0();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getEventRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"exprs",
                            	      										lv_exprs_13_0,
                            	      										"it.unige.dibris.trace_expression_language.TExp.Expression0");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop47;
                                }
                            } while (true);

                            otherlv_14=(Token)match(input,33,FOLLOW_43); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_14, grammarAccess.getEventAccess().getRightParenthesisKeyword_0_1_3_3());
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalTExp.g:2808:3: (otherlv_15= '[' ( (lv_constraints_16_0= ruleExpressionInfinity ) ) otherlv_17= ']' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==34) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalTExp.g:2809:4: otherlv_15= '[' ( (lv_constraints_16_0= ruleExpressionInfinity ) ) otherlv_17= ']'
                    {
                    otherlv_15=(Token)match(input,34,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getEventAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:2813:4: ( (lv_constraints_16_0= ruleExpressionInfinity ) )
                    // InternalTExp.g:2814:5: (lv_constraints_16_0= ruleExpressionInfinity )
                    {
                    // InternalTExp.g:2814:5: (lv_constraints_16_0= ruleExpressionInfinity )
                    // InternalTExp.g:2815:6: lv_constraints_16_0= ruleExpressionInfinity
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEventAccess().getConstraintsExpressionInfinityParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_constraints_16_0=ruleExpressionInfinity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEventRule());
                      						}
                      						set(
                      							current,
                      							"constraints",
                      							lv_constraints_16_0,
                      							"it.unige.dibris.trace_expression_language.TExp.ExpressionInfinity");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getEventAccess().getRightSquareBracketKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleTerm"
    // InternalTExp.g:2841:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalTExp.g:2841:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalTExp.g:2842:2: iv_ruleTerm= ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalTExp.g:2848:1: ruleTerm returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleShuffleExpr ) ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2854:2: ( ( ( (lv_name_0_0= ruleID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleShuffleExpr ) ) ) )
            // InternalTExp.g:2855:2: ( ( (lv_name_0_0= ruleID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleShuffleExpr ) ) )
            {
            // InternalTExp.g:2855:2: ( ( (lv_name_0_0= ruleID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleShuffleExpr ) ) )
            // InternalTExp.g:2856:3: ( (lv_name_0_0= ruleID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleShuffleExpr ) )
            {
            // InternalTExp.g:2856:3: ( (lv_name_0_0= ruleID ) )
            // InternalTExp.g:2857:4: (lv_name_0_0= ruleID )
            {
            // InternalTExp.g:2857:4: (lv_name_0_0= ruleID )
            // InternalTExp.g:2858:5: lv_name_0_0= ruleID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTermAccess().getNameIDParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_46);
            lv_name_0_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTermRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"it.unige.dibris.trace_expression_language.TExp.ID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,57,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTermAccess().getLessThanSignHyphenMinusKeyword_1());
              		
            }
            // InternalTExp.g:2879:3: ( (lv_expr_2_0= ruleShuffleExpr ) )
            // InternalTExp.g:2880:4: (lv_expr_2_0= ruleShuffleExpr )
            {
            // InternalTExp.g:2880:4: (lv_expr_2_0= ruleShuffleExpr )
            // InternalTExp.g:2881:5: lv_expr_2_0= ruleShuffleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTermAccess().getExprShuffleExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleShuffleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTermRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_2_0,
              						"it.unige.dibris.trace_expression_language.TExp.ShuffleExpr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleShuffleExpr"
    // InternalTExp.g:2902:1: entryRuleShuffleExpr returns [EObject current=null] : iv_ruleShuffleExpr= ruleShuffleExpr EOF ;
    public final EObject entryRuleShuffleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShuffleExpr = null;


        try {
            // InternalTExp.g:2902:52: (iv_ruleShuffleExpr= ruleShuffleExpr EOF )
            // InternalTExp.g:2903:2: iv_ruleShuffleExpr= ruleShuffleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShuffleExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShuffleExpr=ruleShuffleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShuffleExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShuffleExpr"


    // $ANTLR start "ruleShuffleExpr"
    // InternalTExp.g:2909:1: ruleShuffleExpr returns [EObject current=null] : (this_UnionExpr_0= ruleUnionExpr ( () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) ) )* ) ;
    public final EObject ruleShuffleExpr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_UnionExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2915:2: ( (this_UnionExpr_0= ruleUnionExpr ( () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) ) )* ) )
            // InternalTExp.g:2916:2: (this_UnionExpr_0= ruleUnionExpr ( () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) ) )* )
            {
            // InternalTExp.g:2916:2: (this_UnionExpr_0= ruleUnionExpr ( () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) ) )* )
            // InternalTExp.g:2917:3: this_UnionExpr_0= ruleUnionExpr ( () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShuffleExprAccess().getUnionExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_48);
            this_UnionExpr_0=ruleUnionExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnionExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:2928:3: ( () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==35) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalTExp.g:2929:4: () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) )
            	    {
            	    // InternalTExp.g:2929:4: ()
            	    // InternalTExp.g:2930:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getShuffleExprAccess().getShuffleExprLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTExp.g:2939:4: ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) )
            	    // InternalTExp.g:2940:5: ( ( '|' ) )=> (lv_operator_2_0= '|' )
            	    {
            	    // InternalTExp.g:2944:5: (lv_operator_2_0= '|' )
            	    // InternalTExp.g:2945:6: lv_operator_2_0= '|'
            	    {
            	    lv_operator_2_0=(Token)match(input,35,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_operator_2_0, grammarAccess.getShuffleExprAccess().getOperatorVerticalLineKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getShuffleExprRule());
            	      						}
            	      						setWithLastConsumed(current, "operator", lv_operator_2_0, "|");
            	      					
            	    }

            	    }


            	    }

            	    // InternalTExp.g:2957:4: ( (lv_right_3_0= ruleUnionExpr ) )
            	    // InternalTExp.g:2958:5: (lv_right_3_0= ruleUnionExpr )
            	    {
            	    // InternalTExp.g:2958:5: (lv_right_3_0= ruleUnionExpr )
            	    // InternalTExp.g:2959:6: lv_right_3_0= ruleUnionExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getShuffleExprAccess().getRightUnionExprParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_48);
            	    lv_right_3_0=ruleUnionExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getShuffleExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"it.unige.dibris.trace_expression_language.TExp.UnionExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleShuffleExpr"


    // $ANTLR start "entryRuleUnionExpr"
    // InternalTExp.g:2981:1: entryRuleUnionExpr returns [EObject current=null] : iv_ruleUnionExpr= ruleUnionExpr EOF ;
    public final EObject entryRuleUnionExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionExpr = null;


        try {
            // InternalTExp.g:2981:50: (iv_ruleUnionExpr= ruleUnionExpr EOF )
            // InternalTExp.g:2982:2: iv_ruleUnionExpr= ruleUnionExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnionExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnionExpr=ruleUnionExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnionExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnionExpr"


    // $ANTLR start "ruleUnionExpr"
    // InternalTExp.g:2988:1: ruleUnionExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleUnionExpr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2994:2: ( (this_AndExpr_0= ruleAndExpr ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* ) )
            // InternalTExp.g:2995:2: (this_AndExpr_0= ruleAndExpr ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* )
            {
            // InternalTExp.g:2995:2: (this_AndExpr_0= ruleAndExpr ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* )
            // InternalTExp.g:2996:3: this_AndExpr_0= ruleAndExpr ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getUnionExprAccess().getAndExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_49);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:3007:3: ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==58) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalTExp.g:3008:4: () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) )
            	    {
            	    // InternalTExp.g:3008:4: ()
            	    // InternalTExp.g:3009:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getUnionExprAccess().getUnionExprLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTExp.g:3018:4: ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) )
            	    // InternalTExp.g:3019:5: ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' )
            	    {
            	    // InternalTExp.g:3023:5: (lv_operator_2_0= '\\\\/' )
            	    // InternalTExp.g:3024:6: lv_operator_2_0= '\\\\/'
            	    {
            	    lv_operator_2_0=(Token)match(input,58,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_operator_2_0, grammarAccess.getUnionExprAccess().getOperatorReverseSolidusSolidusKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getUnionExprRule());
            	      						}
            	      						setWithLastConsumed(current, "operator", lv_operator_2_0, "\\/");
            	      					
            	    }

            	    }


            	    }

            	    // InternalTExp.g:3036:4: ( (lv_right_3_0= ruleAndExpr ) )
            	    // InternalTExp.g:3037:5: (lv_right_3_0= ruleAndExpr )
            	    {
            	    // InternalTExp.g:3037:5: (lv_right_3_0= ruleAndExpr )
            	    // InternalTExp.g:3038:6: lv_right_3_0= ruleAndExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUnionExprAccess().getRightAndExprParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_49);
            	    lv_right_3_0=ruleAndExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getUnionExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"it.unige.dibris.trace_expression_language.TExp.AndExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUnionExpr"


    // $ANTLR start "entryRuleAndExpr"
    // InternalTExp.g:3060:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // InternalTExp.g:3060:48: (iv_ruleAndExpr= ruleAndExpr EOF )
            // InternalTExp.g:3061:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // InternalTExp.g:3067:1: ruleAndExpr returns [EObject current=null] : (this_CatExpr_0= ruleCatExpr ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_CatExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:3073:2: ( (this_CatExpr_0= ruleCatExpr ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )* ) )
            // InternalTExp.g:3074:2: (this_CatExpr_0= ruleCatExpr ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )* )
            {
            // InternalTExp.g:3074:2: (this_CatExpr_0= ruleCatExpr ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )* )
            // InternalTExp.g:3075:3: this_CatExpr_0= ruleCatExpr ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExprAccess().getCatExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_50);
            this_CatExpr_0=ruleCatExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CatExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:3086:3: ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==59) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalTExp.g:3087:4: () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) )
            	    {
            	    // InternalTExp.g:3087:4: ()
            	    // InternalTExp.g:3088:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndExprAccess().getAndExprLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTExp.g:3097:4: ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) )
            	    // InternalTExp.g:3098:5: ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' )
            	    {
            	    // InternalTExp.g:3102:5: (lv_operator_2_0= '/\\\\' )
            	    // InternalTExp.g:3103:6: lv_operator_2_0= '/\\\\'
            	    {
            	    lv_operator_2_0=(Token)match(input,59,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_operator_2_0, grammarAccess.getAndExprAccess().getOperatorSolidusReverseSolidusKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getAndExprRule());
            	      						}
            	      						setWithLastConsumed(current, "operator", lv_operator_2_0, "/\\");
            	      					
            	    }

            	    }


            	    }

            	    // InternalTExp.g:3115:4: ( (lv_right_3_0= ruleCatExpr ) )
            	    // InternalTExp.g:3116:5: (lv_right_3_0= ruleCatExpr )
            	    {
            	    // InternalTExp.g:3116:5: (lv_right_3_0= ruleCatExpr )
            	    // InternalTExp.g:3117:6: lv_right_3_0= ruleCatExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExprAccess().getRightCatExprParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_50);
            	    lv_right_3_0=ruleCatExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"it.unige.dibris.trace_expression_language.TExp.CatExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleCatExpr"
    // InternalTExp.g:3139:1: entryRuleCatExpr returns [EObject current=null] : iv_ruleCatExpr= ruleCatExpr EOF ;
    public final EObject entryRuleCatExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatExpr = null;


        try {
            // InternalTExp.g:3139:48: (iv_ruleCatExpr= ruleCatExpr EOF )
            // InternalTExp.g:3140:2: iv_ruleCatExpr= ruleCatExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCatExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCatExpr=ruleCatExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCatExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCatExpr"


    // $ANTLR start "ruleCatExpr"
    // InternalTExp.g:3146:1: ruleCatExpr returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleCatExpr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:3152:2: ( (this_Primary_0= rulePrimary ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalTExp.g:3153:2: (this_Primary_0= rulePrimary ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalTExp.g:3153:2: (this_Primary_0= rulePrimary ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalTExp.g:3154:3: this_Primary_0= rulePrimary ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCatExprAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_51);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:3165:3: ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==60) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalTExp.g:3166:4: () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalTExp.g:3166:4: ()
            	    // InternalTExp.g:3167:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getCatExprAccess().getCatExprLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalTExp.g:3176:4: ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) )
            	    // InternalTExp.g:3177:5: ( ( '*' ) )=> (lv_operator_2_0= '*' )
            	    {
            	    // InternalTExp.g:3181:5: (lv_operator_2_0= '*' )
            	    // InternalTExp.g:3182:6: lv_operator_2_0= '*'
            	    {
            	    lv_operator_2_0=(Token)match(input,60,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_operator_2_0, grammarAccess.getCatExprAccess().getOperatorAsteriskKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getCatExprRule());
            	      						}
            	      						setWithLastConsumed(current, "operator", lv_operator_2_0, "*");
            	      					
            	    }

            	    }


            	    }

            	    // InternalTExp.g:3194:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalTExp.g:3195:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalTExp.g:3195:5: (lv_right_3_0= rulePrimary )
            	    // InternalTExp.g:3196:6: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCatExprAccess().getRightPrimaryParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_51);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getCatExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"it.unige.dibris.trace_expression_language.TExp.Primary");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCatExpr"


    // $ANTLR start "entryRulePrimary"
    // InternalTExp.g:3218:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalTExp.g:3218:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalTExp.g:3219:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalTExp.g:3225:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) ) | ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) ) | ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) ) | ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject lv_seqExpr_1_0 = null;

        EObject lv_filterExpr_3_0 = null;

        EObject lv_varExpr_5_0 = null;

        EObject lv_terminalExpr_7_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:3231:2: ( ( ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) ) | ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) ) | ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) ) | ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) ) ) )
            // InternalTExp.g:3232:2: ( ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) ) | ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) ) | ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) ) | ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) ) )
            {
            // InternalTExp.g:3232:2: ( ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) ) | ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) ) | ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) ) | ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) ) )
            int alt55=4;
            switch ( input.LA(1) ) {
            case RULE_ATOM:
                {
                int LA55_1 = input.LA(2);

                if ( (synpred96_InternalTExp()) ) {
                    alt55=1;
                }
                else if ( (synpred97_InternalTExp()) ) {
                    alt55=2;
                }
                else if ( (true) ) {
                    alt55=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_OP700XFXL:
                {
                alt55=3;
                }
                break;
            case 32:
            case 61:
                {
                alt55=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalTExp.g:3233:3: ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) )
                    {
                    // InternalTExp.g:3233:3: ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) )
                    // InternalTExp.g:3234:4: () ( (lv_seqExpr_1_0= ruleSeqExpr ) )
                    {
                    // InternalTExp.g:3234:4: ()
                    // InternalTExp.g:3235:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getSeqExprAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTExp.g:3244:4: ( (lv_seqExpr_1_0= ruleSeqExpr ) )
                    // InternalTExp.g:3245:5: (lv_seqExpr_1_0= ruleSeqExpr )
                    {
                    // InternalTExp.g:3245:5: (lv_seqExpr_1_0= ruleSeqExpr )
                    // InternalTExp.g:3246:6: lv_seqExpr_1_0= ruleSeqExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getSeqExprSeqExprParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_seqExpr_1_0=ruleSeqExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"seqExpr",
                      							lv_seqExpr_1_0,
                      							"it.unige.dibris.trace_expression_language.TExp.SeqExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTExp.g:3265:3: ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) )
                    {
                    // InternalTExp.g:3265:3: ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) )
                    // InternalTExp.g:3266:4: () ( (lv_filterExpr_3_0= ruleFilterExpr ) )
                    {
                    // InternalTExp.g:3266:4: ()
                    // InternalTExp.g:3267:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getFilterExprAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTExp.g:3276:4: ( (lv_filterExpr_3_0= ruleFilterExpr ) )
                    // InternalTExp.g:3277:5: (lv_filterExpr_3_0= ruleFilterExpr )
                    {
                    // InternalTExp.g:3277:5: (lv_filterExpr_3_0= ruleFilterExpr )
                    // InternalTExp.g:3278:6: lv_filterExpr_3_0= ruleFilterExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getFilterExprFilterExprParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_filterExpr_3_0=ruleFilterExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"filterExpr",
                      							lv_filterExpr_3_0,
                      							"it.unige.dibris.trace_expression_language.TExp.FilterExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTExp.g:3297:3: ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) )
                    {
                    // InternalTExp.g:3297:3: ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) )
                    // InternalTExp.g:3298:4: () ( (lv_varExpr_5_0= ruleVarExpr ) )
                    {
                    // InternalTExp.g:3298:4: ()
                    // InternalTExp.g:3299:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getVarExprAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTExp.g:3308:4: ( (lv_varExpr_5_0= ruleVarExpr ) )
                    // InternalTExp.g:3309:5: (lv_varExpr_5_0= ruleVarExpr )
                    {
                    // InternalTExp.g:3309:5: (lv_varExpr_5_0= ruleVarExpr )
                    // InternalTExp.g:3310:6: lv_varExpr_5_0= ruleVarExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getVarExprVarExprParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_varExpr_5_0=ruleVarExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"varExpr",
                      							lv_varExpr_5_0,
                      							"it.unige.dibris.trace_expression_language.TExp.VarExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTExp.g:3329:3: ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) )
                    {
                    // InternalTExp.g:3329:3: ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) )
                    // InternalTExp.g:3330:4: () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) )
                    {
                    // InternalTExp.g:3330:4: ()
                    // InternalTExp.g:3331:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getTerminalExprAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalTExp.g:3340:4: ( (lv_terminalExpr_7_0= ruleTerminalExpr ) )
                    // InternalTExp.g:3341:5: (lv_terminalExpr_7_0= ruleTerminalExpr )
                    {
                    // InternalTExp.g:3341:5: (lv_terminalExpr_7_0= ruleTerminalExpr )
                    // InternalTExp.g:3342:6: lv_terminalExpr_7_0= ruleTerminalExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getTerminalExprTerminalExprParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_terminalExpr_7_0=ruleTerminalExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"terminalExpr",
                      							lv_terminalExpr_7_0,
                      							"it.unige.dibris.trace_expression_language.TExp.TerminalExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleVarExpr"
    // InternalTExp.g:3364:1: entryRuleVarExpr returns [EObject current=null] : iv_ruleVarExpr= ruleVarExpr EOF ;
    public final EObject entryRuleVarExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarExpr = null;


        try {
            // InternalTExp.g:3364:48: (iv_ruleVarExpr= ruleVarExpr EOF )
            // InternalTExp.g:3365:2: iv_ruleVarExpr= ruleVarExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarExpr=ruleVarExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVarExpr"


    // $ANTLR start "ruleVarExpr"
    // InternalTExp.g:3371:1: ruleVarExpr returns [EObject current=null] : (this_OP700XFXL_0= RULE_OP700XFXL ( (lv_variable_1_0= RULE_VARIABLE ) ) this_OP1000XFY_2= RULE_OP1000XFY ( (lv_bodyVar_3_0= rulePrimary ) ) this_OP700XFXR_4= RULE_OP700XFXR ) ;
    public final EObject ruleVarExpr() throws RecognitionException {
        EObject current = null;

        Token this_OP700XFXL_0=null;
        Token lv_variable_1_0=null;
        Token this_OP1000XFY_2=null;
        Token this_OP700XFXR_4=null;
        EObject lv_bodyVar_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:3377:2: ( (this_OP700XFXL_0= RULE_OP700XFXL ( (lv_variable_1_0= RULE_VARIABLE ) ) this_OP1000XFY_2= RULE_OP1000XFY ( (lv_bodyVar_3_0= rulePrimary ) ) this_OP700XFXR_4= RULE_OP700XFXR ) )
            // InternalTExp.g:3378:2: (this_OP700XFXL_0= RULE_OP700XFXL ( (lv_variable_1_0= RULE_VARIABLE ) ) this_OP1000XFY_2= RULE_OP1000XFY ( (lv_bodyVar_3_0= rulePrimary ) ) this_OP700XFXR_4= RULE_OP700XFXR )
            {
            // InternalTExp.g:3378:2: (this_OP700XFXL_0= RULE_OP700XFXL ( (lv_variable_1_0= RULE_VARIABLE ) ) this_OP1000XFY_2= RULE_OP1000XFY ( (lv_bodyVar_3_0= rulePrimary ) ) this_OP700XFXR_4= RULE_OP700XFXR )
            // InternalTExp.g:3379:3: this_OP700XFXL_0= RULE_OP700XFXL ( (lv_variable_1_0= RULE_VARIABLE ) ) this_OP1000XFY_2= RULE_OP1000XFY ( (lv_bodyVar_3_0= rulePrimary ) ) this_OP700XFXR_4= RULE_OP700XFXR
            {
            this_OP700XFXL_0=(Token)match(input,RULE_OP700XFXL,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OP700XFXL_0, grammarAccess.getVarExprAccess().getOP700XFXLTerminalRuleCall_0());
              		
            }
            // InternalTExp.g:3383:3: ( (lv_variable_1_0= RULE_VARIABLE ) )
            // InternalTExp.g:3384:4: (lv_variable_1_0= RULE_VARIABLE )
            {
            // InternalTExp.g:3384:4: (lv_variable_1_0= RULE_VARIABLE )
            // InternalTExp.g:3385:5: lv_variable_1_0= RULE_VARIABLE
            {
            lv_variable_1_0=(Token)match(input,RULE_VARIABLE,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_variable_1_0, grammarAccess.getVarExprAccess().getVariableVARIABLETerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVarExprRule());
              					}
              					setWithLastConsumed(
              						current,
              						"variable",
              						lv_variable_1_0,
              						"it.unige.dibris.trace_expression_language.TExp.VARIABLE");
              				
            }

            }


            }

            this_OP1000XFY_2=(Token)match(input,RULE_OP1000XFY,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OP1000XFY_2, grammarAccess.getVarExprAccess().getOP1000XFYTerminalRuleCall_2());
              		
            }
            // InternalTExp.g:3405:3: ( (lv_bodyVar_3_0= rulePrimary ) )
            // InternalTExp.g:3406:4: (lv_bodyVar_3_0= rulePrimary )
            {
            // InternalTExp.g:3406:4: (lv_bodyVar_3_0= rulePrimary )
            // InternalTExp.g:3407:5: lv_bodyVar_3_0= rulePrimary
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarExprAccess().getBodyVarPrimaryParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_54);
            lv_bodyVar_3_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarExprRule());
              					}
              					set(
              						current,
              						"bodyVar",
              						lv_bodyVar_3_0,
              						"it.unige.dibris.trace_expression_language.TExp.Primary");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_OP700XFXR_4=(Token)match(input,RULE_OP700XFXR,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OP700XFXR_4, grammarAccess.getVarExprAccess().getOP700XFXRTerminalRuleCall_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleVarExpr"


    // $ANTLR start "entryRuleFilterExpr"
    // InternalTExp.g:3432:1: entryRuleFilterExpr returns [EObject current=null] : iv_ruleFilterExpr= ruleFilterExpr EOF ;
    public final EObject entryRuleFilterExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterExpr = null;


        try {
            // InternalTExp.g:3432:51: (iv_ruleFilterExpr= ruleFilterExpr EOF )
            // InternalTExp.g:3433:2: iv_ruleFilterExpr= ruleFilterExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFilterExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFilterExpr=ruleFilterExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFilterExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFilterExpr"


    // $ANTLR start "ruleFilterExpr"
    // InternalTExp.g:3439:1: ruleFilterExpr returns [EObject current=null] : ( ( ( ( ruleID ) ) | ( ( ruleID ) ) ) (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ( (lv_operator_7_0= RULE_OP400FX1 ) ) ( (lv_bodyFilter_8_0= rulePrimary ) ) ) ;
    public final EObject ruleFilterExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_OP1000XFY_4=null;
        Token otherlv_6=null;
        Token lv_operator_7_0=null;
        EObject lv_first_3_0 = null;

        EObject lv_exprs_5_0 = null;

        EObject lv_bodyFilter_8_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:3445:2: ( ( ( ( ( ruleID ) ) | ( ( ruleID ) ) ) (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ( (lv_operator_7_0= RULE_OP400FX1 ) ) ( (lv_bodyFilter_8_0= rulePrimary ) ) ) )
            // InternalTExp.g:3446:2: ( ( ( ( ruleID ) ) | ( ( ruleID ) ) ) (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ( (lv_operator_7_0= RULE_OP400FX1 ) ) ( (lv_bodyFilter_8_0= rulePrimary ) ) )
            {
            // InternalTExp.g:3446:2: ( ( ( ( ruleID ) ) | ( ( ruleID ) ) ) (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ( (lv_operator_7_0= RULE_OP400FX1 ) ) ( (lv_bodyFilter_8_0= rulePrimary ) ) )
            // InternalTExp.g:3447:3: ( ( ( ruleID ) ) | ( ( ruleID ) ) ) (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ( (lv_operator_7_0= RULE_OP400FX1 ) ) ( (lv_bodyFilter_8_0= rulePrimary ) )
            {
            // InternalTExp.g:3447:3: ( ( ( ruleID ) ) | ( ( ruleID ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ATOM) ) {
                int LA56_1 = input.LA(2);

                if ( (synpred99_InternalTExp()) ) {
                    alt56=1;
                }
                else if ( (true) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalTExp.g:3448:4: ( ( ruleID ) )
                    {
                    // InternalTExp.g:3448:4: ( ( ruleID ) )
                    // InternalTExp.g:3449:5: ( ruleID )
                    {
                    // InternalTExp.g:3449:5: ( ruleID )
                    // InternalTExp.g:3450:6: ruleID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFilterExprRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFilterExprAccess().getTypeFilterEventTypeCrossReference_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_55);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTExp.g:3468:4: ( ( ruleID ) )
                    {
                    // InternalTExp.g:3468:4: ( ( ruleID ) )
                    // InternalTExp.g:3469:5: ( ruleID )
                    {
                    // InternalTExp.g:3469:5: ( ruleID )
                    // InternalTExp.g:3470:6: ruleID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFilterExprRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFilterExprAccess().getTypeFilterMsgEventTypeCrossReference_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_55);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalTExp.g:3488:3: (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==32) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalTExp.g:3489:4: otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getFilterExprAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:3493:4: ( (lv_first_3_0= ruleExpression0 ) )
                    // InternalTExp.g:3494:5: (lv_first_3_0= ruleExpression0 )
                    {
                    // InternalTExp.g:3494:5: (lv_first_3_0= ruleExpression0 )
                    // InternalTExp.g:3495:6: lv_first_3_0= ruleExpression0
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFilterExprAccess().getFirstExpression0ParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_first_3_0=ruleExpression0();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFilterExprRule());
                      						}
                      						set(
                      							current,
                      							"first",
                      							lv_first_3_0,
                      							"it.unige.dibris.trace_expression_language.TExp.Expression0");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTExp.g:3512:4: (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==RULE_OP1000XFY) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalTExp.g:3513:5: this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) )
                    	    {
                    	    this_OP1000XFY_4=(Token)match(input,RULE_OP1000XFY,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OP1000XFY_4, grammarAccess.getFilterExprAccess().getOP1000XFYTerminalRuleCall_1_2_0());
                    	      				
                    	    }
                    	    // InternalTExp.g:3517:5: ( (lv_exprs_5_0= ruleExpression0 ) )
                    	    // InternalTExp.g:3518:6: (lv_exprs_5_0= ruleExpression0 )
                    	    {
                    	    // InternalTExp.g:3518:6: (lv_exprs_5_0= ruleExpression0 )
                    	    // InternalTExp.g:3519:7: lv_exprs_5_0= ruleExpression0
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFilterExprAccess().getExprsExpression0ParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_39);
                    	    lv_exprs_5_0=ruleExpression0();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFilterExprRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"exprs",
                    	      								lv_exprs_5_0,
                    	      								"it.unige.dibris.trace_expression_language.TExp.Expression0");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,33,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFilterExprAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTExp.g:3542:3: ( (lv_operator_7_0= RULE_OP400FX1 ) )
            // InternalTExp.g:3543:4: (lv_operator_7_0= RULE_OP400FX1 )
            {
            // InternalTExp.g:3543:4: (lv_operator_7_0= RULE_OP400FX1 )
            // InternalTExp.g:3544:5: lv_operator_7_0= RULE_OP400FX1
            {
            lv_operator_7_0=(Token)match(input,RULE_OP400FX1,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_operator_7_0, grammarAccess.getFilterExprAccess().getOperatorOP400FX1TerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFilterExprRule());
              					}
              					setWithLastConsumed(
              						current,
              						"operator",
              						lv_operator_7_0,
              						"it.unige.dibris.trace_expression_language.TExp.OP400FX1");
              				
            }

            }


            }

            // InternalTExp.g:3560:3: ( (lv_bodyFilter_8_0= rulePrimary ) )
            // InternalTExp.g:3561:4: (lv_bodyFilter_8_0= rulePrimary )
            {
            // InternalTExp.g:3561:4: (lv_bodyFilter_8_0= rulePrimary )
            // InternalTExp.g:3562:5: lv_bodyFilter_8_0= rulePrimary
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFilterExprAccess().getBodyFilterPrimaryParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_bodyFilter_8_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFilterExprRule());
              					}
              					set(
              						current,
              						"bodyFilter",
              						lv_bodyFilter_8_0,
              						"it.unige.dibris.trace_expression_language.TExp.Primary");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFilterExpr"


    // $ANTLR start "entryRuleSeqExpr"
    // InternalTExp.g:3583:1: entryRuleSeqExpr returns [EObject current=null] : iv_ruleSeqExpr= ruleSeqExpr EOF ;
    public final EObject entryRuleSeqExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeqExpr = null;


        try {
            // InternalTExp.g:3583:48: (iv_ruleSeqExpr= ruleSeqExpr EOF )
            // InternalTExp.g:3584:2: iv_ruleSeqExpr= ruleSeqExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSeqExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSeqExpr=ruleSeqExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSeqExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSeqExpr"


    // $ANTLR start "ruleSeqExpr"
    // InternalTExp.g:3590:1: ruleSeqExpr returns [EObject current=null] : ( ( ( ( ruleID ) ) | ( ( ruleID ) ) ) (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ( (lv_operator_7_0= RULE_OP600XFY ) ) ( (lv_bodySeq_8_0= rulePrimary ) ) ) ;
    public final EObject ruleSeqExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_OP1000XFY_4=null;
        Token otherlv_6=null;
        Token lv_operator_7_0=null;
        EObject lv_first_3_0 = null;

        EObject lv_exprs_5_0 = null;

        EObject lv_bodySeq_8_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:3596:2: ( ( ( ( ( ruleID ) ) | ( ( ruleID ) ) ) (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ( (lv_operator_7_0= RULE_OP600XFY ) ) ( (lv_bodySeq_8_0= rulePrimary ) ) ) )
            // InternalTExp.g:3597:2: ( ( ( ( ruleID ) ) | ( ( ruleID ) ) ) (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ( (lv_operator_7_0= RULE_OP600XFY ) ) ( (lv_bodySeq_8_0= rulePrimary ) ) )
            {
            // InternalTExp.g:3597:2: ( ( ( ( ruleID ) ) | ( ( ruleID ) ) ) (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ( (lv_operator_7_0= RULE_OP600XFY ) ) ( (lv_bodySeq_8_0= rulePrimary ) ) )
            // InternalTExp.g:3598:3: ( ( ( ruleID ) ) | ( ( ruleID ) ) ) (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ( (lv_operator_7_0= RULE_OP600XFY ) ) ( (lv_bodySeq_8_0= rulePrimary ) )
            {
            // InternalTExp.g:3598:3: ( ( ( ruleID ) ) | ( ( ruleID ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ATOM) ) {
                int LA59_1 = input.LA(2);

                if ( (synpred102_InternalTExp()) ) {
                    alt59=1;
                }
                else if ( (true) ) {
                    alt59=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalTExp.g:3599:4: ( ( ruleID ) )
                    {
                    // InternalTExp.g:3599:4: ( ( ruleID ) )
                    // InternalTExp.g:3600:5: ( ruleID )
                    {
                    // InternalTExp.g:3600:5: ( ruleID )
                    // InternalTExp.g:3601:6: ruleID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSeqExprRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSeqExprAccess().getTypeSeqEventTypeCrossReference_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_37);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTExp.g:3619:4: ( ( ruleID ) )
                    {
                    // InternalTExp.g:3619:4: ( ( ruleID ) )
                    // InternalTExp.g:3620:5: ( ruleID )
                    {
                    // InternalTExp.g:3620:5: ( ruleID )
                    // InternalTExp.g:3621:6: ruleID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSeqExprRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSeqExprAccess().getTypeSeqMsgEventTypeCrossReference_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_37);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalTExp.g:3639:3: (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==32) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalTExp.g:3640:4: otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSeqExprAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:3644:4: ( (lv_first_3_0= ruleExpression0 ) )
                    // InternalTExp.g:3645:5: (lv_first_3_0= ruleExpression0 )
                    {
                    // InternalTExp.g:3645:5: (lv_first_3_0= ruleExpression0 )
                    // InternalTExp.g:3646:6: lv_first_3_0= ruleExpression0
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSeqExprAccess().getFirstExpression0ParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_first_3_0=ruleExpression0();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSeqExprRule());
                      						}
                      						set(
                      							current,
                      							"first",
                      							lv_first_3_0,
                      							"it.unige.dibris.trace_expression_language.TExp.Expression0");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTExp.g:3663:4: (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==RULE_OP1000XFY) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalTExp.g:3664:5: this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) )
                    	    {
                    	    this_OP1000XFY_4=(Token)match(input,RULE_OP1000XFY,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OP1000XFY_4, grammarAccess.getSeqExprAccess().getOP1000XFYTerminalRuleCall_1_2_0());
                    	      				
                    	    }
                    	    // InternalTExp.g:3668:5: ( (lv_exprs_5_0= ruleExpression0 ) )
                    	    // InternalTExp.g:3669:6: (lv_exprs_5_0= ruleExpression0 )
                    	    {
                    	    // InternalTExp.g:3669:6: (lv_exprs_5_0= ruleExpression0 )
                    	    // InternalTExp.g:3670:7: lv_exprs_5_0= ruleExpression0
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSeqExprAccess().getExprsExpression0ParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_39);
                    	    lv_exprs_5_0=ruleExpression0();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSeqExprRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"exprs",
                    	      								lv_exprs_5_0,
                    	      								"it.unige.dibris.trace_expression_language.TExp.Expression0");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,33,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getSeqExprAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTExp.g:3693:3: ( (lv_operator_7_0= RULE_OP600XFY ) )
            // InternalTExp.g:3694:4: (lv_operator_7_0= RULE_OP600XFY )
            {
            // InternalTExp.g:3694:4: (lv_operator_7_0= RULE_OP600XFY )
            // InternalTExp.g:3695:5: lv_operator_7_0= RULE_OP600XFY
            {
            lv_operator_7_0=(Token)match(input,RULE_OP600XFY,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_operator_7_0, grammarAccess.getSeqExprAccess().getOperatorOP600XFYTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSeqExprRule());
              					}
              					setWithLastConsumed(
              						current,
              						"operator",
              						lv_operator_7_0,
              						"it.unige.dibris.trace_expression_language.TExp.OP600XFY");
              				
            }

            }


            }

            // InternalTExp.g:3711:3: ( (lv_bodySeq_8_0= rulePrimary ) )
            // InternalTExp.g:3712:4: (lv_bodySeq_8_0= rulePrimary )
            {
            // InternalTExp.g:3712:4: (lv_bodySeq_8_0= rulePrimary )
            // InternalTExp.g:3713:5: lv_bodySeq_8_0= rulePrimary
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSeqExprAccess().getBodySeqPrimaryParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_bodySeq_8_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSeqExprRule());
              					}
              					set(
              						current,
              						"bodySeq",
              						lv_bodySeq_8_0,
              						"it.unige.dibris.trace_expression_language.TExp.Primary");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSeqExpr"


    // $ANTLR start "entryRuleTerminalExpr"
    // InternalTExp.g:3734:1: entryRuleTerminalExpr returns [EObject current=null] : iv_ruleTerminalExpr= ruleTerminalExpr EOF ;
    public final EObject entryRuleTerminalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpr = null;


        try {
            // InternalTExp.g:3734:53: (iv_ruleTerminalExpr= ruleTerminalExpr EOF )
            // InternalTExp.g:3735:2: iv_ruleTerminalExpr= ruleTerminalExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerminalExpr=ruleTerminalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminalExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTerminalExpr"


    // $ANTLR start "ruleTerminalExpr"
    // InternalTExp.g:3741:1: ruleTerminalExpr returns [EObject current=null] : ( ( (lv_eps_0_0= 'epsilon' ) ) | ( ( ruleID ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')' ) ) ;
    public final EObject ruleTerminalExpr() throws RecognitionException {
        EObject current = null;

        Token lv_eps_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:3747:2: ( ( ( (lv_eps_0_0= 'epsilon' ) ) | ( ( ruleID ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')' ) ) )
            // InternalTExp.g:3748:2: ( ( (lv_eps_0_0= 'epsilon' ) ) | ( ( ruleID ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')' ) )
            {
            // InternalTExp.g:3748:2: ( ( (lv_eps_0_0= 'epsilon' ) ) | ( ( ruleID ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')' ) )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt62=1;
                }
                break;
            case RULE_ATOM:
                {
                alt62=2;
                }
                break;
            case 32:
                {
                alt62=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalTExp.g:3749:3: ( (lv_eps_0_0= 'epsilon' ) )
                    {
                    // InternalTExp.g:3749:3: ( (lv_eps_0_0= 'epsilon' ) )
                    // InternalTExp.g:3750:4: (lv_eps_0_0= 'epsilon' )
                    {
                    // InternalTExp.g:3750:4: (lv_eps_0_0= 'epsilon' )
                    // InternalTExp.g:3751:5: lv_eps_0_0= 'epsilon'
                    {
                    lv_eps_0_0=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_eps_0_0, grammarAccess.getTerminalExprAccess().getEpsEpsilonKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTerminalExprRule());
                      					}
                      					setWithLastConsumed(current, "eps", lv_eps_0_0, "epsilon");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTExp.g:3764:3: ( ( ruleID ) )
                    {
                    // InternalTExp.g:3764:3: ( ( ruleID ) )
                    // InternalTExp.g:3765:4: ( ruleID )
                    {
                    // InternalTExp.g:3765:4: ( ruleID )
                    // InternalTExp.g:3766:5: ruleID
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getTerminalExprRule());
                      					}
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTerminalExprAccess().getTermTermCrossReference_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTExp.g:3784:3: (otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')' )
                    {
                    // InternalTExp.g:3784:3: (otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')' )
                    // InternalTExp.g:3785:4: otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTerminalExprAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalTExp.g:3789:4: ( (lv_expr_3_0= ruleShuffleExpr ) )
                    // InternalTExp.g:3790:5: (lv_expr_3_0= ruleShuffleExpr )
                    {
                    // InternalTExp.g:3790:5: (lv_expr_3_0= ruleShuffleExpr )
                    // InternalTExp.g:3791:6: lv_expr_3_0= ruleShuffleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExprAccess().getExprShuffleExprParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_expr_3_0=ruleShuffleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalExprRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_3_0,
                      							"it.unige.dibris.trace_expression_language.TExp.ShuffleExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTerminalExprAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTerminalExpr"


    // $ANTLR start "entryRuleMsg"
    // InternalTExp.g:3817:1: entryRuleMsg returns [EObject current=null] : iv_ruleMsg= ruleMsg EOF ;
    public final EObject entryRuleMsg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMsg = null;


        try {
            // InternalTExp.g:3817:44: (iv_ruleMsg= ruleMsg EOF )
            // InternalTExp.g:3818:2: iv_ruleMsg= ruleMsg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMsgRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMsg=ruleMsg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMsg; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMsg"


    // $ANTLR start "ruleMsg"
    // InternalTExp.g:3824:1: ruleMsg returns [EObject current=null] : ( ( ( (lv_performative_0_0= RULE_ATOM ) ) this_OP600XFY_1= RULE_OP600XFY )? ( (otherlv_2= '[' ( ( ruleID ) ) otherlv_4= '=>' otherlv_5= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_8= '[' otherlv_9= '=>' ( ( ruleID ) ) otherlv_11= ']' ) | ( ( ( ruleID ) ) otherlv_13= '=>' ( ( ruleID ) ) ) ) this_OP600XFY_15= RULE_OP600XFY ( (lv_content_16_0= ruleExpression0 ) ) (otherlv_17= '[' ( (lv_conditions_18_0= ruleExpressionInfinity ) ) otherlv_19= ']' )? ) ;
    public final EObject ruleMsg() throws RecognitionException {
        EObject current = null;

        Token lv_performative_0_0=null;
        Token this_OP600XFY_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token this_OP600XFY_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_content_16_0 = null;

        EObject lv_conditions_18_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:3830:2: ( ( ( ( (lv_performative_0_0= RULE_ATOM ) ) this_OP600XFY_1= RULE_OP600XFY )? ( (otherlv_2= '[' ( ( ruleID ) ) otherlv_4= '=>' otherlv_5= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_8= '[' otherlv_9= '=>' ( ( ruleID ) ) otherlv_11= ']' ) | ( ( ( ruleID ) ) otherlv_13= '=>' ( ( ruleID ) ) ) ) this_OP600XFY_15= RULE_OP600XFY ( (lv_content_16_0= ruleExpression0 ) ) (otherlv_17= '[' ( (lv_conditions_18_0= ruleExpressionInfinity ) ) otherlv_19= ']' )? ) )
            // InternalTExp.g:3831:2: ( ( ( (lv_performative_0_0= RULE_ATOM ) ) this_OP600XFY_1= RULE_OP600XFY )? ( (otherlv_2= '[' ( ( ruleID ) ) otherlv_4= '=>' otherlv_5= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_8= '[' otherlv_9= '=>' ( ( ruleID ) ) otherlv_11= ']' ) | ( ( ( ruleID ) ) otherlv_13= '=>' ( ( ruleID ) ) ) ) this_OP600XFY_15= RULE_OP600XFY ( (lv_content_16_0= ruleExpression0 ) ) (otherlv_17= '[' ( (lv_conditions_18_0= ruleExpressionInfinity ) ) otherlv_19= ']' )? )
            {
            // InternalTExp.g:3831:2: ( ( ( (lv_performative_0_0= RULE_ATOM ) ) this_OP600XFY_1= RULE_OP600XFY )? ( (otherlv_2= '[' ( ( ruleID ) ) otherlv_4= '=>' otherlv_5= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_8= '[' otherlv_9= '=>' ( ( ruleID ) ) otherlv_11= ']' ) | ( ( ( ruleID ) ) otherlv_13= '=>' ( ( ruleID ) ) ) ) this_OP600XFY_15= RULE_OP600XFY ( (lv_content_16_0= ruleExpression0 ) ) (otherlv_17= '[' ( (lv_conditions_18_0= ruleExpressionInfinity ) ) otherlv_19= ']' )? )
            // InternalTExp.g:3832:3: ( ( (lv_performative_0_0= RULE_ATOM ) ) this_OP600XFY_1= RULE_OP600XFY )? ( (otherlv_2= '[' ( ( ruleID ) ) otherlv_4= '=>' otherlv_5= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_8= '[' otherlv_9= '=>' ( ( ruleID ) ) otherlv_11= ']' ) | ( ( ( ruleID ) ) otherlv_13= '=>' ( ( ruleID ) ) ) ) this_OP600XFY_15= RULE_OP600XFY ( (lv_content_16_0= ruleExpression0 ) ) (otherlv_17= '[' ( (lv_conditions_18_0= ruleExpressionInfinity ) ) otherlv_19= ']' )?
            {
            // InternalTExp.g:3832:3: ( ( (lv_performative_0_0= RULE_ATOM ) ) this_OP600XFY_1= RULE_OP600XFY )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ATOM) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==RULE_OP600XFY) ) {
                    alt63=1;
                }
            }
            switch (alt63) {
                case 1 :
                    // InternalTExp.g:3833:4: ( (lv_performative_0_0= RULE_ATOM ) ) this_OP600XFY_1= RULE_OP600XFY
                    {
                    // InternalTExp.g:3833:4: ( (lv_performative_0_0= RULE_ATOM ) )
                    // InternalTExp.g:3834:5: (lv_performative_0_0= RULE_ATOM )
                    {
                    // InternalTExp.g:3834:5: (lv_performative_0_0= RULE_ATOM )
                    // InternalTExp.g:3835:6: lv_performative_0_0= RULE_ATOM
                    {
                    lv_performative_0_0=(Token)match(input,RULE_ATOM,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_performative_0_0, grammarAccess.getMsgAccess().getPerformativeATOMTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMsgRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"performative",
                      							lv_performative_0_0,
                      							"it.unige.dibris.trace_expression_language.TExp.ATOM");
                      					
                    }

                    }


                    }

                    this_OP600XFY_1=(Token)match(input,RULE_OP600XFY,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP600XFY_1, grammarAccess.getMsgAccess().getOP600XFYTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalTExp.g:3856:3: ( (otherlv_2= '[' ( ( ruleID ) ) otherlv_4= '=>' otherlv_5= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_8= '[' otherlv_9= '=>' ( ( ruleID ) ) otherlv_11= ']' ) | ( ( ( ruleID ) ) otherlv_13= '=>' ( ( ruleID ) ) ) )
            int alt64=3;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==34) ) {
                alt64=1;
            }
            else if ( (LA64_0==RULE_ATOM) ) {
                int LA64_2 = input.LA(2);

                if ( (LA64_2==34) ) {
                    alt64=2;
                }
                else if ( (LA64_2==62) ) {
                    alt64=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalTExp.g:3857:4: (otherlv_2= '[' ( ( ruleID ) ) otherlv_4= '=>' otherlv_5= ']' ( ( ruleID ) ) )
                    {
                    // InternalTExp.g:3857:4: (otherlv_2= '[' ( ( ruleID ) ) otherlv_4= '=>' otherlv_5= ']' ( ( ruleID ) ) )
                    // InternalTExp.g:3858:5: otherlv_2= '[' ( ( ruleID ) ) otherlv_4= '=>' otherlv_5= ']' ( ( ruleID ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getMsgAccess().getLeftSquareBracketKeyword_1_0_0());
                      				
                    }
                    // InternalTExp.g:3862:5: ( ( ruleID ) )
                    // InternalTExp.g:3863:6: ( ruleID )
                    {
                    // InternalTExp.g:3863:6: ( ruleID )
                    // InternalTExp.g:3864:7: ruleID
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMsgRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMsgAccess().getAsync_senderRoleCrossReference_1_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_58);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,62,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getMsgAccess().getEqualsSignGreaterThanSignKeyword_1_0_2());
                      				
                    }
                    otherlv_5=(Token)match(input,36,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getMsgAccess().getRightSquareBracketKeyword_1_0_3());
                      				
                    }
                    // InternalTExp.g:3889:5: ( ( ruleID ) )
                    // InternalTExp.g:3890:6: ( ruleID )
                    {
                    // InternalTExp.g:3890:6: ( ruleID )
                    // InternalTExp.g:3891:7: ruleID
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMsgRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMsgAccess().getReceiverRoleCrossReference_1_0_4_0());
                      						
                    }
                    pushFollow(FOLLOW_40);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTExp.g:3910:4: ( ( ( ruleID ) ) otherlv_8= '[' otherlv_9= '=>' ( ( ruleID ) ) otherlv_11= ']' )
                    {
                    // InternalTExp.g:3910:4: ( ( ( ruleID ) ) otherlv_8= '[' otherlv_9= '=>' ( ( ruleID ) ) otherlv_11= ']' )
                    // InternalTExp.g:3911:5: ( ( ruleID ) ) otherlv_8= '[' otherlv_9= '=>' ( ( ruleID ) ) otherlv_11= ']'
                    {
                    // InternalTExp.g:3911:5: ( ( ruleID ) )
                    // InternalTExp.g:3912:6: ( ruleID )
                    {
                    // InternalTExp.g:3912:6: ( ruleID )
                    // InternalTExp.g:3913:7: ruleID
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMsgRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMsgAccess().getSenderRoleCrossReference_1_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_34);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,34,FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getMsgAccess().getLeftSquareBracketKeyword_1_1_1());
                      				
                    }
                    otherlv_9=(Token)match(input,62,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getMsgAccess().getEqualsSignGreaterThanSignKeyword_1_1_2());
                      				
                    }
                    // InternalTExp.g:3938:5: ( ( ruleID ) )
                    // InternalTExp.g:3939:6: ( ruleID )
                    {
                    // InternalTExp.g:3939:6: ( ruleID )
                    // InternalTExp.g:3940:7: ruleID
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMsgRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMsgAccess().getAsync_receiverRoleCrossReference_1_1_3_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,36,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getMsgAccess().getRightSquareBracketKeyword_1_1_4());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTExp.g:3963:4: ( ( ( ruleID ) ) otherlv_13= '=>' ( ( ruleID ) ) )
                    {
                    // InternalTExp.g:3963:4: ( ( ( ruleID ) ) otherlv_13= '=>' ( ( ruleID ) ) )
                    // InternalTExp.g:3964:5: ( ( ruleID ) ) otherlv_13= '=>' ( ( ruleID ) )
                    {
                    // InternalTExp.g:3964:5: ( ( ruleID ) )
                    // InternalTExp.g:3965:6: ( ruleID )
                    {
                    // InternalTExp.g:3965:6: ( ruleID )
                    // InternalTExp.g:3966:7: ruleID
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMsgRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMsgAccess().getSenderRoleCrossReference_1_2_0_0());
                      						
                    }
                    pushFollow(FOLLOW_58);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,62,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_13, grammarAccess.getMsgAccess().getEqualsSignGreaterThanSignKeyword_1_2_1());
                      				
                    }
                    // InternalTExp.g:3987:5: ( ( ruleID ) )
                    // InternalTExp.g:3988:6: ( ruleID )
                    {
                    // InternalTExp.g:3988:6: ( ruleID )
                    // InternalTExp.g:3989:7: ruleID
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMsgRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMsgAccess().getReceiverRoleCrossReference_1_2_2_0());
                      						
                    }
                    pushFollow(FOLLOW_40);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            this_OP600XFY_15=(Token)match(input,RULE_OP600XFY,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OP600XFY_15, grammarAccess.getMsgAccess().getOP600XFYTerminalRuleCall_2());
              		
            }
            // InternalTExp.g:4012:3: ( (lv_content_16_0= ruleExpression0 ) )
            // InternalTExp.g:4013:4: (lv_content_16_0= ruleExpression0 )
            {
            // InternalTExp.g:4013:4: (lv_content_16_0= ruleExpression0 )
            // InternalTExp.g:4014:5: lv_content_16_0= ruleExpression0
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMsgAccess().getContentExpression0ParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_43);
            lv_content_16_0=ruleExpression0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMsgRule());
              					}
              					set(
              						current,
              						"content",
              						lv_content_16_0,
              						"it.unige.dibris.trace_expression_language.TExp.Expression0");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTExp.g:4031:3: (otherlv_17= '[' ( (lv_conditions_18_0= ruleExpressionInfinity ) ) otherlv_19= ']' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==34) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==RULE_ATOM) ) {
                    int LA65_3 = input.LA(3);

                    if ( ((LA65_3>=RULE_OP1100XFY && LA65_3<=RULE_OP954XFY)||(LA65_3>=RULE_OP700XFX && LA65_3<=RULE_OP500YFX)||(LA65_3>=RULE_OP400YFX && LA65_3<=RULE_OP200XFY)||LA65_3==32||LA65_3==36) ) {
                        alt65=1;
                    }
                }
                else if ( ((LA65_1>=RULE_OP1200XFX && LA65_1<=RULE_INT)||(LA65_1>=RULE_VARIABLE && LA65_1<=RULE_STRING)||(LA65_1>=30 && LA65_1<=32)||LA65_1==34) ) {
                    alt65=1;
                }
            }
            switch (alt65) {
                case 1 :
                    // InternalTExp.g:4032:4: otherlv_17= '[' ( (lv_conditions_18_0= ruleExpressionInfinity ) ) otherlv_19= ']'
                    {
                    otherlv_17=(Token)match(input,34,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getMsgAccess().getLeftSquareBracketKeyword_4_0());
                      			
                    }
                    // InternalTExp.g:4036:4: ( (lv_conditions_18_0= ruleExpressionInfinity ) )
                    // InternalTExp.g:4037:5: (lv_conditions_18_0= ruleExpressionInfinity )
                    {
                    // InternalTExp.g:4037:5: (lv_conditions_18_0= ruleExpressionInfinity )
                    // InternalTExp.g:4038:6: lv_conditions_18_0= ruleExpressionInfinity
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMsgAccess().getConditionsExpressionInfinityParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_conditions_18_0=ruleExpressionInfinity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMsgRule());
                      						}
                      						set(
                      							current,
                      							"conditions",
                      							lv_conditions_18_0,
                      							"it.unige.dibris.trace_expression_language.TExp.ExpressionInfinity");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getMsgAccess().getRightSquareBracketKeyword_4_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMsg"


    // $ANTLR start "entryRuleChannel"
    // InternalTExp.g:4064:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalTExp.g:4064:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalTExp.g:4065:2: iv_ruleChannel= ruleChannel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChannelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleChannel=ruleChannel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChannel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleChannel"


    // $ANTLR start "ruleChannel"
    // InternalTExp.g:4071:1: ruleChannel returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_reliability_2_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:4077:2: ( ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' )? ) )
            // InternalTExp.g:4078:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' )? )
            {
            // InternalTExp.g:4078:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' )? )
            // InternalTExp.g:4079:3: ( (lv_name_0_0= ruleID ) ) (otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' )?
            {
            // InternalTExp.g:4079:3: ( (lv_name_0_0= ruleID ) )
            // InternalTExp.g:4080:4: (lv_name_0_0= ruleID )
            {
            // InternalTExp.g:4080:4: (lv_name_0_0= ruleID )
            // InternalTExp.g:4081:5: lv_name_0_0= ruleID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChannelAccess().getNameIDParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_43);
            lv_name_0_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getChannelRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"it.unige.dibris.trace_expression_language.TExp.ID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTExp.g:4098:3: (otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==34) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalTExp.g:4099:4: otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getChannelAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:4103:4: ( (lv_reliability_2_0= ruleNUMBER ) )
                    // InternalTExp.g:4104:5: (lv_reliability_2_0= ruleNUMBER )
                    {
                    // InternalTExp.g:4104:5: (lv_reliability_2_0= ruleNUMBER )
                    // InternalTExp.g:4105:6: lv_reliability_2_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getChannelAccess().getReliabilityNUMBERParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    lv_reliability_2_0=ruleNUMBER();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getChannelRule());
                      						}
                      						set(
                      							current,
                      							"reliability",
                      							lv_reliability_2_0,
                      							"it.unige.dibris.trace_expression_language.TExp.NUMBER");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getChannelAccess().getRightSquareBracketKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleChannel"


    // $ANTLR start "entryRuleRole"
    // InternalTExp.g:4131:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalTExp.g:4131:45: (iv_ruleRole= ruleRole EOF )
            // InternalTExp.g:4132:2: iv_ruleRole= ruleRole EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRoleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRole; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalTExp.g:4138:1: ruleRole returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )? ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_class_2_1=null;
        Token lv_class_2_2=null;
        Token otherlv_3=null;
        Token this_OP1000XFY_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:4144:2: ( ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )? ) )
            // InternalTExp.g:4145:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )? )
            {
            // InternalTExp.g:4145:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )? )
            // InternalTExp.g:4146:3: ( (lv_name_0_0= ruleID ) ) (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )?
            {
            // InternalTExp.g:4146:3: ( (lv_name_0_0= ruleID ) )
            // InternalTExp.g:4147:4: (lv_name_0_0= ruleID )
            {
            // InternalTExp.g:4147:4: (lv_name_0_0= ruleID )
            // InternalTExp.g:4148:5: lv_name_0_0= ruleID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRoleAccess().getNameIDParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_59);
            lv_name_0_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRoleRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"it.unige.dibris.trace_expression_language.TExp.ID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTExp.g:4165:3: (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==63) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalTExp.g:4166:4: otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$'
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getDollarSignKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:4170:4: ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) )
                    // InternalTExp.g:4171:5: ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) )
                    {
                    // InternalTExp.g:4171:5: ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) )
                    // InternalTExp.g:4172:6: (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM )
                    {
                    // InternalTExp.g:4172:6: (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==RULE_VARIABLE) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==RULE_ATOM) ) {
                        alt67=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalTExp.g:4173:7: lv_class_2_1= RULE_VARIABLE
                            {
                            lv_class_2_1=(Token)match(input,RULE_VARIABLE,FOLLOW_60); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_class_2_1, grammarAccess.getRoleAccess().getClassVARIABLETerminalRuleCall_1_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getRoleRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"class",
                              								lv_class_2_1,
                              								"it.unige.dibris.trace_expression_language.TExp.VARIABLE");
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalTExp.g:4188:7: lv_class_2_2= RULE_ATOM
                            {
                            lv_class_2_2=(Token)match(input,RULE_ATOM,FOLLOW_60); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_class_2_2, grammarAccess.getRoleAccess().getClassATOMTerminalRuleCall_1_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getRoleRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"class",
                              								lv_class_2_2,
                              								"it.unige.dibris.trace_expression_language.TExp.ATOM");
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalTExp.g:4205:4: (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==32) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalTExp.g:4206:5: otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')'
                            {
                            otherlv_3=(Token)match(input,32,FOLLOW_61); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getLeftParenthesisKeyword_1_2_0());
                              				
                            }
                            // InternalTExp.g:4210:5: ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )*
                            loop69:
                            do {
                                int alt69=2;
                                int LA69_0 = input.LA(1);

                                if ( (LA69_0==RULE_STRING) ) {
                                    alt69=1;
                                }


                                switch (alt69) {
                            	case 1 :
                            	    // InternalTExp.g:4211:6: ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )?
                            	    {
                            	    // InternalTExp.g:4211:6: ( (lv_args_4_0= ruleArgument ) )
                            	    // InternalTExp.g:4212:7: (lv_args_4_0= ruleArgument )
                            	    {
                            	    // InternalTExp.g:4212:7: (lv_args_4_0= ruleArgument )
                            	    // InternalTExp.g:4213:8: lv_args_4_0= ruleArgument
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getRoleAccess().getArgsArgumentParserRuleCall_1_2_1_0_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_62);
                            	    lv_args_4_0=ruleArgument();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getRoleRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"args",
                            	      									lv_args_4_0,
                            	      									"it.unige.dibris.trace_expression_language.TExp.Argument");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }

                            	    // InternalTExp.g:4230:6: (this_OP1000XFY_5= RULE_OP1000XFY )?
                            	    int alt68=2;
                            	    int LA68_0 = input.LA(1);

                            	    if ( (LA68_0==RULE_OP1000XFY) ) {
                            	        alt68=1;
                            	    }
                            	    switch (alt68) {
                            	        case 1 :
                            	            // InternalTExp.g:4231:7: this_OP1000XFY_5= RULE_OP1000XFY
                            	            {
                            	            this_OP1000XFY_5=(Token)match(input,RULE_OP1000XFY,FOLLOW_61); if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	              							newLeafNode(this_OP1000XFY_5, grammarAccess.getRoleAccess().getOP1000XFYTerminalRuleCall_1_2_1_1());
                            	              						
                            	            }

                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop69;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,33,FOLLOW_63); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getRoleAccess().getRightParenthesisKeyword_1_2_2());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getRoleAccess().getDollarSignKeyword_1_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleArgument"
    // InternalTExp.g:4251:1: entryRuleArgument returns [String current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final String entryRuleArgument() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArgument = null;


        try {
            // InternalTExp.g:4251:48: (iv_ruleArgument= ruleArgument EOF )
            // InternalTExp.g:4252:2: iv_ruleArgument= ruleArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArgument=ruleArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgument.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // InternalTExp.g:4258:1: ruleArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalTExp.g:4264:2: (this_STRING_0= RULE_STRING )
            // InternalTExp.g:4265:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_0, grammarAccess.getArgumentAccess().getSTRINGTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRulePartition"
    // InternalTExp.g:4275:1: entryRulePartition returns [EObject current=null] : iv_rulePartition= rulePartition EOF ;
    public final EObject entryRulePartition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartition = null;


        try {
            // InternalTExp.g:4275:50: (iv_rulePartition= rulePartition EOF )
            // InternalTExp.g:4276:2: iv_rulePartition= rulePartition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPartitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePartition=rulePartition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePartition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePartition"


    // $ANTLR start "rulePartition"
    // InternalTExp.g:4282:1: rulePartition returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )* otherlv_4= ']' ) ;
    public final EObject rulePartition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_OP1000XFY_3=null;
        Token otherlv_4=null;
        EObject lv_constraints_2_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:4288:2: ( ( () otherlv_1= '[' ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )* otherlv_4= ']' ) )
            // InternalTExp.g:4289:2: ( () otherlv_1= '[' ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )* otherlv_4= ']' )
            {
            // InternalTExp.g:4289:2: ( () otherlv_1= '[' ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )* otherlv_4= ']' )
            // InternalTExp.g:4290:3: () otherlv_1= '[' ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )* otherlv_4= ']'
            {
            // InternalTExp.g:4290:3: ()
            // InternalTExp.g:4291:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPartitionAccess().getPartitionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPartitionAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalTExp.g:4304:3: ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==34) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalTExp.g:4305:4: ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )?
            	    {
            	    // InternalTExp.g:4305:4: ( (lv_constraints_2_0= ruleTogether ) )
            	    // InternalTExp.g:4306:5: (lv_constraints_2_0= ruleTogether )
            	    {
            	    // InternalTExp.g:4306:5: (lv_constraints_2_0= ruleTogether )
            	    // InternalTExp.g:4307:6: lv_constraints_2_0= ruleTogether
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPartitionAccess().getConstraintsTogetherParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_65);
            	    lv_constraints_2_0=ruleTogether();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPartitionRule());
            	      						}
            	      						add(
            	      							current,
            	      							"constraints",
            	      							lv_constraints_2_0,
            	      							"it.unige.dibris.trace_expression_language.TExp.Together");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalTExp.g:4324:4: (this_OP1000XFY_3= RULE_OP1000XFY )?
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==RULE_OP1000XFY) ) {
            	        alt72=1;
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // InternalTExp.g:4325:5: this_OP1000XFY_3= RULE_OP1000XFY
            	            {
            	            this_OP1000XFY_3=(Token)match(input,RULE_OP1000XFY,FOLLOW_64); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_OP1000XFY_3, grammarAccess.getPartitionAccess().getOP1000XFYTerminalRuleCall_2_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            otherlv_4=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getPartitionAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePartition"


    // $ANTLR start "entryRuleTogether"
    // InternalTExp.g:4339:1: entryRuleTogether returns [EObject current=null] : iv_ruleTogether= ruleTogether EOF ;
    public final EObject entryRuleTogether() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTogether = null;


        try {
            // InternalTExp.g:4339:49: (iv_ruleTogether= ruleTogether EOF )
            // InternalTExp.g:4340:2: iv_ruleTogether= ruleTogether EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTogetherRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTogether=ruleTogether();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTogether; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTogether"


    // $ANTLR start "ruleTogether"
    // InternalTExp.g:4346:1: ruleTogether returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+ otherlv_4= ']' ) ;
    public final EObject ruleTogether() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_OP1000XFY_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTExp.g:4352:2: ( ( () otherlv_1= '[' ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+ otherlv_4= ']' ) )
            // InternalTExp.g:4353:2: ( () otherlv_1= '[' ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+ otherlv_4= ']' )
            {
            // InternalTExp.g:4353:2: ( () otherlv_1= '[' ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+ otherlv_4= ']' )
            // InternalTExp.g:4354:3: () otherlv_1= '[' ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+ otherlv_4= ']'
            {
            // InternalTExp.g:4354:3: ()
            // InternalTExp.g:4355:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTogetherAccess().getTogetherAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTogetherAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalTExp.g:4368:3: ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+
            int cnt75=0;
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==RULE_ATOM) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalTExp.g:4369:4: ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )?
            	    {
            	    // InternalTExp.g:4369:4: ( ( ruleID ) )
            	    // InternalTExp.g:4370:5: ( ruleID )
            	    {
            	    // InternalTExp.g:4370:5: ( ruleID )
            	    // InternalTExp.g:4371:6: ruleID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getTogetherRule());
            	      						}
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTogetherAccess().getRolesRoleCrossReference_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_66);
            	    ruleID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalTExp.g:4388:4: (this_OP1000XFY_3= RULE_OP1000XFY )?
            	    int alt74=2;
            	    int LA74_0 = input.LA(1);

            	    if ( (LA74_0==RULE_OP1000XFY) ) {
            	        alt74=1;
            	    }
            	    switch (alt74) {
            	        case 1 :
            	            // InternalTExp.g:4389:5: this_OP1000XFY_3= RULE_OP1000XFY
            	            {
            	            this_OP1000XFY_3=(Token)match(input,RULE_OP1000XFY,FOLLOW_67); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_OP1000XFY_3, grammarAccess.getTogetherAccess().getOP1000XFYTerminalRuleCall_2_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt75 >= 1 ) break loop75;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(75, input);
                        throw eee;
                }
                cnt75++;
            } while (true);

            otherlv_4=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTogetherAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTogether"


    // $ANTLR start "entryRuleConstraint"
    // InternalTExp.g:4403:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalTExp.g:4403:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalTExp.g:4404:2: iv_ruleConstraint= ruleConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalTExp.g:4410:1: ruleConstraint returns [EObject current=null] : ( ( ( ( ruleID ) ) ( (lv_together_1_0= '-><-' ) ) ( ( ruleID ) ) ) | ( ( ( ruleID ) ) ( (lv_split_4_0= '<-->' ) ) ( ( ruleID ) ) ) | ( () otherlv_7= 'number_singletons' this_OP600XFY_8= RULE_OP600XFY ( ( (lv_parMin_9_1= '(' | lv_parMin_9_2= '[' ) ) ) ( (lv_minSingletons_10_0= RULE_INT ) ) this_OP1000XFY_11= RULE_OP1000XFY ( (lv_maxSingletons_12_0= RULE_INT ) ) ( ( (lv_parMax_13_1= ')' | lv_parMax_13_2= ']' ) ) ) ) | ( () otherlv_15= 'size_constraints' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSize_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSize_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) ) | ( () otherlv_23= 'number_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minCardinality_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxCardinality_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_together_1_0=null;
        Token lv_split_4_0=null;
        Token otherlv_7=null;
        Token this_OP600XFY_8=null;
        Token lv_parMin_9_1=null;
        Token lv_parMin_9_2=null;
        Token lv_minSingletons_10_0=null;
        Token this_OP1000XFY_11=null;
        Token lv_maxSingletons_12_0=null;
        Token lv_parMax_13_1=null;
        Token lv_parMax_13_2=null;
        Token otherlv_15=null;
        Token this_OP600XFY_16=null;
        Token lv_parMin_17_1=null;
        Token lv_parMin_17_2=null;
        Token lv_minSize_18_0=null;
        Token this_OP1000XFY_19=null;
        Token lv_maxSize_20_0=null;
        Token lv_parMax_21_1=null;
        Token lv_parMax_21_2=null;
        Token otherlv_23=null;
        Token this_OP600XFY_24=null;
        Token lv_parMin_25_1=null;
        Token lv_parMin_25_2=null;
        Token lv_minCardinality_26_0=null;
        Token this_OP1000XFY_27=null;
        Token lv_maxCardinality_28_0=null;
        Token lv_parMax_29_1=null;
        Token lv_parMax_29_2=null;


        	enterRule();

        try {
            // InternalTExp.g:4416:2: ( ( ( ( ( ruleID ) ) ( (lv_together_1_0= '-><-' ) ) ( ( ruleID ) ) ) | ( ( ( ruleID ) ) ( (lv_split_4_0= '<-->' ) ) ( ( ruleID ) ) ) | ( () otherlv_7= 'number_singletons' this_OP600XFY_8= RULE_OP600XFY ( ( (lv_parMin_9_1= '(' | lv_parMin_9_2= '[' ) ) ) ( (lv_minSingletons_10_0= RULE_INT ) ) this_OP1000XFY_11= RULE_OP1000XFY ( (lv_maxSingletons_12_0= RULE_INT ) ) ( ( (lv_parMax_13_1= ')' | lv_parMax_13_2= ']' ) ) ) ) | ( () otherlv_15= 'size_constraints' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSize_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSize_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) ) | ( () otherlv_23= 'number_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minCardinality_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxCardinality_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) ) ) )
            // InternalTExp.g:4417:2: ( ( ( ( ruleID ) ) ( (lv_together_1_0= '-><-' ) ) ( ( ruleID ) ) ) | ( ( ( ruleID ) ) ( (lv_split_4_0= '<-->' ) ) ( ( ruleID ) ) ) | ( () otherlv_7= 'number_singletons' this_OP600XFY_8= RULE_OP600XFY ( ( (lv_parMin_9_1= '(' | lv_parMin_9_2= '[' ) ) ) ( (lv_minSingletons_10_0= RULE_INT ) ) this_OP1000XFY_11= RULE_OP1000XFY ( (lv_maxSingletons_12_0= RULE_INT ) ) ( ( (lv_parMax_13_1= ')' | lv_parMax_13_2= ']' ) ) ) ) | ( () otherlv_15= 'size_constraints' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSize_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSize_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) ) | ( () otherlv_23= 'number_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minCardinality_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxCardinality_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) ) )
            {
            // InternalTExp.g:4417:2: ( ( ( ( ruleID ) ) ( (lv_together_1_0= '-><-' ) ) ( ( ruleID ) ) ) | ( ( ( ruleID ) ) ( (lv_split_4_0= '<-->' ) ) ( ( ruleID ) ) ) | ( () otherlv_7= 'number_singletons' this_OP600XFY_8= RULE_OP600XFY ( ( (lv_parMin_9_1= '(' | lv_parMin_9_2= '[' ) ) ) ( (lv_minSingletons_10_0= RULE_INT ) ) this_OP1000XFY_11= RULE_OP1000XFY ( (lv_maxSingletons_12_0= RULE_INT ) ) ( ( (lv_parMax_13_1= ')' | lv_parMax_13_2= ']' ) ) ) ) | ( () otherlv_15= 'size_constraints' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSize_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSize_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) ) | ( () otherlv_23= 'number_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minCardinality_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxCardinality_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) ) )
            int alt82=5;
            switch ( input.LA(1) ) {
            case RULE_ATOM:
                {
                int LA82_1 = input.LA(2);

                if ( (LA82_1==64) ) {
                    alt82=1;
                }
                else if ( (LA82_1==65) ) {
                    alt82=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 1, input);

                    throw nvae;
                }
                }
                break;
            case 66:
                {
                alt82=3;
                }
                break;
            case 67:
                {
                alt82=4;
                }
                break;
            case 68:
                {
                alt82=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalTExp.g:4418:3: ( ( ( ruleID ) ) ( (lv_together_1_0= '-><-' ) ) ( ( ruleID ) ) )
                    {
                    // InternalTExp.g:4418:3: ( ( ( ruleID ) ) ( (lv_together_1_0= '-><-' ) ) ( ( ruleID ) ) )
                    // InternalTExp.g:4419:4: ( ( ruleID ) ) ( (lv_together_1_0= '-><-' ) ) ( ( ruleID ) )
                    {
                    // InternalTExp.g:4419:4: ( ( ruleID ) )
                    // InternalTExp.g:4420:5: ( ruleID )
                    {
                    // InternalTExp.g:4420:5: ( ruleID )
                    // InternalTExp.g:4421:6: ruleID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConstraintAccess().getLeftRoleCrossReference_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_68);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTExp.g:4438:4: ( (lv_together_1_0= '-><-' ) )
                    // InternalTExp.g:4439:5: (lv_together_1_0= '-><-' )
                    {
                    // InternalTExp.g:4439:5: (lv_together_1_0= '-><-' )
                    // InternalTExp.g:4440:6: lv_together_1_0= '-><-'
                    {
                    lv_together_1_0=(Token)match(input,64,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_together_1_0, grammarAccess.getConstraintAccess().getTogetherHyphenMinusGreaterThanSignLessThanSignHyphenMinusKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      						setWithLastConsumed(current, "together", lv_together_1_0, "-><-");
                      					
                    }

                    }


                    }

                    // InternalTExp.g:4452:4: ( ( ruleID ) )
                    // InternalTExp.g:4453:5: ( ruleID )
                    {
                    // InternalTExp.g:4453:5: ( ruleID )
                    // InternalTExp.g:4454:6: ruleID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConstraintAccess().getRightRoleCrossReference_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTExp.g:4473:3: ( ( ( ruleID ) ) ( (lv_split_4_0= '<-->' ) ) ( ( ruleID ) ) )
                    {
                    // InternalTExp.g:4473:3: ( ( ( ruleID ) ) ( (lv_split_4_0= '<-->' ) ) ( ( ruleID ) ) )
                    // InternalTExp.g:4474:4: ( ( ruleID ) ) ( (lv_split_4_0= '<-->' ) ) ( ( ruleID ) )
                    {
                    // InternalTExp.g:4474:4: ( ( ruleID ) )
                    // InternalTExp.g:4475:5: ( ruleID )
                    {
                    // InternalTExp.g:4475:5: ( ruleID )
                    // InternalTExp.g:4476:6: ruleID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConstraintAccess().getLeftRoleCrossReference_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_69);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTExp.g:4493:4: ( (lv_split_4_0= '<-->' ) )
                    // InternalTExp.g:4494:5: (lv_split_4_0= '<-->' )
                    {
                    // InternalTExp.g:4494:5: (lv_split_4_0= '<-->' )
                    // InternalTExp.g:4495:6: lv_split_4_0= '<-->'
                    {
                    lv_split_4_0=(Token)match(input,65,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_split_4_0, grammarAccess.getConstraintAccess().getSplitLessThanSignHyphenMinusHyphenMinusGreaterThanSignKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      						setWithLastConsumed(current, "split", lv_split_4_0, "<-->");
                      					
                    }

                    }


                    }

                    // InternalTExp.g:4507:4: ( ( ruleID ) )
                    // InternalTExp.g:4508:5: ( ruleID )
                    {
                    // InternalTExp.g:4508:5: ( ruleID )
                    // InternalTExp.g:4509:6: ruleID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getConstraintAccess().getRightRoleCrossReference_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTExp.g:4528:3: ( () otherlv_7= 'number_singletons' this_OP600XFY_8= RULE_OP600XFY ( ( (lv_parMin_9_1= '(' | lv_parMin_9_2= '[' ) ) ) ( (lv_minSingletons_10_0= RULE_INT ) ) this_OP1000XFY_11= RULE_OP1000XFY ( (lv_maxSingletons_12_0= RULE_INT ) ) ( ( (lv_parMax_13_1= ')' | lv_parMax_13_2= ']' ) ) ) )
                    {
                    // InternalTExp.g:4528:3: ( () otherlv_7= 'number_singletons' this_OP600XFY_8= RULE_OP600XFY ( ( (lv_parMin_9_1= '(' | lv_parMin_9_2= '[' ) ) ) ( (lv_minSingletons_10_0= RULE_INT ) ) this_OP1000XFY_11= RULE_OP1000XFY ( (lv_maxSingletons_12_0= RULE_INT ) ) ( ( (lv_parMax_13_1= ')' | lv_parMax_13_2= ']' ) ) ) )
                    // InternalTExp.g:4529:4: () otherlv_7= 'number_singletons' this_OP600XFY_8= RULE_OP600XFY ( ( (lv_parMin_9_1= '(' | lv_parMin_9_2= '[' ) ) ) ( (lv_minSingletons_10_0= RULE_INT ) ) this_OP1000XFY_11= RULE_OP1000XFY ( (lv_maxSingletons_12_0= RULE_INT ) ) ( ( (lv_parMax_13_1= ')' | lv_parMax_13_2= ']' ) ) )
                    {
                    // InternalTExp.g:4529:4: ()
                    // InternalTExp.g:4530:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getConstraintAccess().getSingletonsAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,66,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getNumber_singletonsKeyword_2_1());
                      			
                    }
                    this_OP600XFY_8=(Token)match(input,RULE_OP600XFY,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP600XFY_8, grammarAccess.getConstraintAccess().getOP600XFYTerminalRuleCall_2_2());
                      			
                    }
                    // InternalTExp.g:4547:4: ( ( (lv_parMin_9_1= '(' | lv_parMin_9_2= '[' ) ) )
                    // InternalTExp.g:4548:5: ( (lv_parMin_9_1= '(' | lv_parMin_9_2= '[' ) )
                    {
                    // InternalTExp.g:4548:5: ( (lv_parMin_9_1= '(' | lv_parMin_9_2= '[' ) )
                    // InternalTExp.g:4549:6: (lv_parMin_9_1= '(' | lv_parMin_9_2= '[' )
                    {
                    // InternalTExp.g:4549:6: (lv_parMin_9_1= '(' | lv_parMin_9_2= '[' )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==32) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==34) ) {
                        alt76=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 0, input);

                        throw nvae;
                    }
                    switch (alt76) {
                        case 1 :
                            // InternalTExp.g:4550:7: lv_parMin_9_1= '('
                            {
                            lv_parMin_9_1=(Token)match(input,32,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMin_9_1, grammarAccess.getConstraintAccess().getParMinLeftParenthesisKeyword_2_3_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConstraintRule());
                              							}
                              							setWithLastConsumed(current, "parMin", lv_parMin_9_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalTExp.g:4561:7: lv_parMin_9_2= '['
                            {
                            lv_parMin_9_2=(Token)match(input,34,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMin_9_2, grammarAccess.getConstraintAccess().getParMinLeftSquareBracketKeyword_2_3_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConstraintRule());
                              							}
                              							setWithLastConsumed(current, "parMin", lv_parMin_9_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalTExp.g:4574:4: ( (lv_minSingletons_10_0= RULE_INT ) )
                    // InternalTExp.g:4575:5: (lv_minSingletons_10_0= RULE_INT )
                    {
                    // InternalTExp.g:4575:5: (lv_minSingletons_10_0= RULE_INT )
                    // InternalTExp.g:4576:6: lv_minSingletons_10_0= RULE_INT
                    {
                    lv_minSingletons_10_0=(Token)match(input,RULE_INT,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_minSingletons_10_0, grammarAccess.getConstraintAccess().getMinSingletonsINTTerminalRuleCall_2_4_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"minSingletons",
                      							lv_minSingletons_10_0,
                      							"it.unige.dibris.trace_expression_language.TExp.INT");
                      					
                    }

                    }


                    }

                    this_OP1000XFY_11=(Token)match(input,RULE_OP1000XFY,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP1000XFY_11, grammarAccess.getConstraintAccess().getOP1000XFYTerminalRuleCall_2_5());
                      			
                    }
                    // InternalTExp.g:4596:4: ( (lv_maxSingletons_12_0= RULE_INT ) )
                    // InternalTExp.g:4597:5: (lv_maxSingletons_12_0= RULE_INT )
                    {
                    // InternalTExp.g:4597:5: (lv_maxSingletons_12_0= RULE_INT )
                    // InternalTExp.g:4598:6: lv_maxSingletons_12_0= RULE_INT
                    {
                    lv_maxSingletons_12_0=(Token)match(input,RULE_INT,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_maxSingletons_12_0, grammarAccess.getConstraintAccess().getMaxSingletonsINTTerminalRuleCall_2_6_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"maxSingletons",
                      							lv_maxSingletons_12_0,
                      							"it.unige.dibris.trace_expression_language.TExp.INT");
                      					
                    }

                    }


                    }

                    // InternalTExp.g:4614:4: ( ( (lv_parMax_13_1= ')' | lv_parMax_13_2= ']' ) ) )
                    // InternalTExp.g:4615:5: ( (lv_parMax_13_1= ')' | lv_parMax_13_2= ']' ) )
                    {
                    // InternalTExp.g:4615:5: ( (lv_parMax_13_1= ')' | lv_parMax_13_2= ']' ) )
                    // InternalTExp.g:4616:6: (lv_parMax_13_1= ')' | lv_parMax_13_2= ']' )
                    {
                    // InternalTExp.g:4616:6: (lv_parMax_13_1= ')' | lv_parMax_13_2= ']' )
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==33) ) {
                        alt77=1;
                    }
                    else if ( (LA77_0==36) ) {
                        alt77=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }
                    switch (alt77) {
                        case 1 :
                            // InternalTExp.g:4617:7: lv_parMax_13_1= ')'
                            {
                            lv_parMax_13_1=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMax_13_1, grammarAccess.getConstraintAccess().getParMaxRightParenthesisKeyword_2_7_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConstraintRule());
                              							}
                              							setWithLastConsumed(current, "parMax", lv_parMax_13_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalTExp.g:4628:7: lv_parMax_13_2= ']'
                            {
                            lv_parMax_13_2=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMax_13_2, grammarAccess.getConstraintAccess().getParMaxRightSquareBracketKeyword_2_7_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConstraintRule());
                              							}
                              							setWithLastConsumed(current, "parMax", lv_parMax_13_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTExp.g:4643:3: ( () otherlv_15= 'size_constraints' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSize_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSize_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) )
                    {
                    // InternalTExp.g:4643:3: ( () otherlv_15= 'size_constraints' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSize_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSize_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) )
                    // InternalTExp.g:4644:4: () otherlv_15= 'size_constraints' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSize_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSize_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) )
                    {
                    // InternalTExp.g:4644:4: ()
                    // InternalTExp.g:4645:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getConstraintAccess().getSizeAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_15=(Token)match(input,67,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getConstraintAccess().getSize_constraintsKeyword_3_1());
                      			
                    }
                    this_OP600XFY_16=(Token)match(input,RULE_OP600XFY,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP600XFY_16, grammarAccess.getConstraintAccess().getOP600XFYTerminalRuleCall_3_2());
                      			
                    }
                    // InternalTExp.g:4662:4: ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) )
                    // InternalTExp.g:4663:5: ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) )
                    {
                    // InternalTExp.g:4663:5: ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) )
                    // InternalTExp.g:4664:6: (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' )
                    {
                    // InternalTExp.g:4664:6: (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==32) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==34) ) {
                        alt78=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }
                    switch (alt78) {
                        case 1 :
                            // InternalTExp.g:4665:7: lv_parMin_17_1= '('
                            {
                            lv_parMin_17_1=(Token)match(input,32,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMin_17_1, grammarAccess.getConstraintAccess().getParMinLeftParenthesisKeyword_3_3_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConstraintRule());
                              							}
                              							setWithLastConsumed(current, "parMin", lv_parMin_17_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalTExp.g:4676:7: lv_parMin_17_2= '['
                            {
                            lv_parMin_17_2=(Token)match(input,34,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMin_17_2, grammarAccess.getConstraintAccess().getParMinLeftSquareBracketKeyword_3_3_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConstraintRule());
                              							}
                              							setWithLastConsumed(current, "parMin", lv_parMin_17_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalTExp.g:4689:4: ( (lv_minSize_18_0= RULE_INT ) )
                    // InternalTExp.g:4690:5: (lv_minSize_18_0= RULE_INT )
                    {
                    // InternalTExp.g:4690:5: (lv_minSize_18_0= RULE_INT )
                    // InternalTExp.g:4691:6: lv_minSize_18_0= RULE_INT
                    {
                    lv_minSize_18_0=(Token)match(input,RULE_INT,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_minSize_18_0, grammarAccess.getConstraintAccess().getMinSizeINTTerminalRuleCall_3_4_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"minSize",
                      							lv_minSize_18_0,
                      							"it.unige.dibris.trace_expression_language.TExp.INT");
                      					
                    }

                    }


                    }

                    this_OP1000XFY_19=(Token)match(input,RULE_OP1000XFY,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP1000XFY_19, grammarAccess.getConstraintAccess().getOP1000XFYTerminalRuleCall_3_5());
                      			
                    }
                    // InternalTExp.g:4711:4: ( (lv_maxSize_20_0= RULE_INT ) )
                    // InternalTExp.g:4712:5: (lv_maxSize_20_0= RULE_INT )
                    {
                    // InternalTExp.g:4712:5: (lv_maxSize_20_0= RULE_INT )
                    // InternalTExp.g:4713:6: lv_maxSize_20_0= RULE_INT
                    {
                    lv_maxSize_20_0=(Token)match(input,RULE_INT,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_maxSize_20_0, grammarAccess.getConstraintAccess().getMaxSizeINTTerminalRuleCall_3_6_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"maxSize",
                      							lv_maxSize_20_0,
                      							"it.unige.dibris.trace_expression_language.TExp.INT");
                      					
                    }

                    }


                    }

                    // InternalTExp.g:4729:4: ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) )
                    // InternalTExp.g:4730:5: ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) )
                    {
                    // InternalTExp.g:4730:5: ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) )
                    // InternalTExp.g:4731:6: (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' )
                    {
                    // InternalTExp.g:4731:6: (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' )
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==33) ) {
                        alt79=1;
                    }
                    else if ( (LA79_0==36) ) {
                        alt79=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 0, input);

                        throw nvae;
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalTExp.g:4732:7: lv_parMax_21_1= ')'
                            {
                            lv_parMax_21_1=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMax_21_1, grammarAccess.getConstraintAccess().getParMaxRightParenthesisKeyword_3_7_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConstraintRule());
                              							}
                              							setWithLastConsumed(current, "parMax", lv_parMax_21_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalTExp.g:4743:7: lv_parMax_21_2= ']'
                            {
                            lv_parMax_21_2=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMax_21_2, grammarAccess.getConstraintAccess().getParMaxRightSquareBracketKeyword_3_7_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConstraintRule());
                              							}
                              							setWithLastConsumed(current, "parMax", lv_parMax_21_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalTExp.g:4758:3: ( () otherlv_23= 'number_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minCardinality_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxCardinality_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) )
                    {
                    // InternalTExp.g:4758:3: ( () otherlv_23= 'number_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minCardinality_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxCardinality_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) )
                    // InternalTExp.g:4759:4: () otherlv_23= 'number_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minCardinality_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxCardinality_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) )
                    {
                    // InternalTExp.g:4759:4: ()
                    // InternalTExp.g:4760:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getConstraintAccess().getCardinalityAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_23=(Token)match(input,68,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getConstraintAccess().getNumber_constraintsKeyword_4_1());
                      			
                    }
                    this_OP600XFY_24=(Token)match(input,RULE_OP600XFY,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP600XFY_24, grammarAccess.getConstraintAccess().getOP600XFYTerminalRuleCall_4_2());
                      			
                    }
                    // InternalTExp.g:4777:4: ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) )
                    // InternalTExp.g:4778:5: ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) )
                    {
                    // InternalTExp.g:4778:5: ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) )
                    // InternalTExp.g:4779:6: (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' )
                    {
                    // InternalTExp.g:4779:6: (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' )
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==32) ) {
                        alt80=1;
                    }
                    else if ( (LA80_0==34) ) {
                        alt80=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 80, 0, input);

                        throw nvae;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalTExp.g:4780:7: lv_parMin_25_1= '('
                            {
                            lv_parMin_25_1=(Token)match(input,32,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMin_25_1, grammarAccess.getConstraintAccess().getParMinLeftParenthesisKeyword_4_3_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConstraintRule());
                              							}
                              							setWithLastConsumed(current, "parMin", lv_parMin_25_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalTExp.g:4791:7: lv_parMin_25_2= '['
                            {
                            lv_parMin_25_2=(Token)match(input,34,FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMin_25_2, grammarAccess.getConstraintAccess().getParMinLeftSquareBracketKeyword_4_3_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConstraintRule());
                              							}
                              							setWithLastConsumed(current, "parMin", lv_parMin_25_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalTExp.g:4804:4: ( (lv_minCardinality_26_0= RULE_INT ) )
                    // InternalTExp.g:4805:5: (lv_minCardinality_26_0= RULE_INT )
                    {
                    // InternalTExp.g:4805:5: (lv_minCardinality_26_0= RULE_INT )
                    // InternalTExp.g:4806:6: lv_minCardinality_26_0= RULE_INT
                    {
                    lv_minCardinality_26_0=(Token)match(input,RULE_INT,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_minCardinality_26_0, grammarAccess.getConstraintAccess().getMinCardinalityINTTerminalRuleCall_4_4_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"minCardinality",
                      							lv_minCardinality_26_0,
                      							"it.unige.dibris.trace_expression_language.TExp.INT");
                      					
                    }

                    }


                    }

                    this_OP1000XFY_27=(Token)match(input,RULE_OP1000XFY,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP1000XFY_27, grammarAccess.getConstraintAccess().getOP1000XFYTerminalRuleCall_4_5());
                      			
                    }
                    // InternalTExp.g:4826:4: ( (lv_maxCardinality_28_0= RULE_INT ) )
                    // InternalTExp.g:4827:5: (lv_maxCardinality_28_0= RULE_INT )
                    {
                    // InternalTExp.g:4827:5: (lv_maxCardinality_28_0= RULE_INT )
                    // InternalTExp.g:4828:6: lv_maxCardinality_28_0= RULE_INT
                    {
                    lv_maxCardinality_28_0=(Token)match(input,RULE_INT,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_maxCardinality_28_0, grammarAccess.getConstraintAccess().getMaxCardinalityINTTerminalRuleCall_4_6_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"maxCardinality",
                      							lv_maxCardinality_28_0,
                      							"it.unige.dibris.trace_expression_language.TExp.INT");
                      					
                    }

                    }


                    }

                    // InternalTExp.g:4844:4: ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) )
                    // InternalTExp.g:4845:5: ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) )
                    {
                    // InternalTExp.g:4845:5: ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) )
                    // InternalTExp.g:4846:6: (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' )
                    {
                    // InternalTExp.g:4846:6: (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' )
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==33) ) {
                        alt81=1;
                    }
                    else if ( (LA81_0==36) ) {
                        alt81=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalTExp.g:4847:7: lv_parMax_29_1= ')'
                            {
                            lv_parMax_29_1=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMax_29_1, grammarAccess.getConstraintAccess().getParMaxRightParenthesisKeyword_4_7_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConstraintRule());
                              							}
                              							setWithLastConsumed(current, "parMax", lv_parMax_29_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalTExp.g:4858:7: lv_parMax_29_2= ']'
                            {
                            lv_parMax_29_2=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMax_29_2, grammarAccess.getConstraintAccess().getParMaxRightSquareBracketKeyword_4_7_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConstraintRule());
                              							}
                              							setWithLastConsumed(current, "parMax", lv_parMax_29_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleModule"
    // InternalTExp.g:4876:1: entryRuleModule returns [String current=null] : iv_ruleModule= ruleModule EOF ;
    public final String entryRuleModule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModule = null;


        try {
            // InternalTExp.g:4876:46: (iv_ruleModule= ruleModule EOF )
            // InternalTExp.g:4877:2: iv_ruleModule= ruleModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModule.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalTExp.g:4883:1: ruleModule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VARIABLE_0= RULE_VARIABLE | this_ATOM_1= RULE_ATOM ) ;
    public final AntlrDatatypeRuleToken ruleModule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VARIABLE_0=null;
        Token this_ATOM_1=null;


        	enterRule();

        try {
            // InternalTExp.g:4889:2: ( (this_VARIABLE_0= RULE_VARIABLE | this_ATOM_1= RULE_ATOM ) )
            // InternalTExp.g:4890:2: (this_VARIABLE_0= RULE_VARIABLE | this_ATOM_1= RULE_ATOM )
            {
            // InternalTExp.g:4890:2: (this_VARIABLE_0= RULE_VARIABLE | this_ATOM_1= RULE_ATOM )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_VARIABLE) ) {
                alt83=1;
            }
            else if ( (LA83_0==RULE_ATOM) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalTExp.g:4891:3: this_VARIABLE_0= RULE_VARIABLE
                    {
                    this_VARIABLE_0=(Token)match(input,RULE_VARIABLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_VARIABLE_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_VARIABLE_0, grammarAccess.getModuleAccess().getVARIABLETerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTExp.g:4899:3: this_ATOM_1= RULE_ATOM
                    {
                    this_ATOM_1=(Token)match(input,RULE_ATOM,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ATOM_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ATOM_1, grammarAccess.getModuleAccess().getATOMTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModule"

    // $ANTLR start synpred96_InternalTExp
    public final void synpred96_InternalTExp_fragment() throws RecognitionException {   
        EObject lv_seqExpr_1_0 = null;


        // InternalTExp.g:3233:3: ( ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) ) )
        // InternalTExp.g:3233:3: ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) )
        {
        // InternalTExp.g:3233:3: ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) )
        // InternalTExp.g:3234:4: () ( (lv_seqExpr_1_0= ruleSeqExpr ) )
        {
        // InternalTExp.g:3234:4: ()
        // InternalTExp.g:3235:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalTExp.g:3244:4: ( (lv_seqExpr_1_0= ruleSeqExpr ) )
        // InternalTExp.g:3245:5: (lv_seqExpr_1_0= ruleSeqExpr )
        {
        // InternalTExp.g:3245:5: (lv_seqExpr_1_0= ruleSeqExpr )
        // InternalTExp.g:3246:6: lv_seqExpr_1_0= ruleSeqExpr
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getPrimaryAccess().getSeqExprSeqExprParserRuleCall_0_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_seqExpr_1_0=ruleSeqExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred96_InternalTExp

    // $ANTLR start synpred97_InternalTExp
    public final void synpred97_InternalTExp_fragment() throws RecognitionException {   
        EObject lv_filterExpr_3_0 = null;


        // InternalTExp.g:3265:3: ( ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) ) )
        // InternalTExp.g:3265:3: ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) )
        {
        // InternalTExp.g:3265:3: ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) )
        // InternalTExp.g:3266:4: () ( (lv_filterExpr_3_0= ruleFilterExpr ) )
        {
        // InternalTExp.g:3266:4: ()
        // InternalTExp.g:3267:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalTExp.g:3276:4: ( (lv_filterExpr_3_0= ruleFilterExpr ) )
        // InternalTExp.g:3277:5: (lv_filterExpr_3_0= ruleFilterExpr )
        {
        // InternalTExp.g:3277:5: (lv_filterExpr_3_0= ruleFilterExpr )
        // InternalTExp.g:3278:6: lv_filterExpr_3_0= ruleFilterExpr
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getPrimaryAccess().getFilterExprFilterExprParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_filterExpr_3_0=ruleFilterExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred97_InternalTExp

    // $ANTLR start synpred99_InternalTExp
    public final void synpred99_InternalTExp_fragment() throws RecognitionException {   
        // InternalTExp.g:3448:4: ( ( ( ruleID ) ) )
        // InternalTExp.g:3448:4: ( ( ruleID ) )
        {
        // InternalTExp.g:3448:4: ( ( ruleID ) )
        // InternalTExp.g:3449:5: ( ruleID )
        {
        // InternalTExp.g:3449:5: ( ruleID )
        // InternalTExp.g:3450:6: ruleID
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }
        pushFollow(FOLLOW_2);
        ruleID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred99_InternalTExp

    // $ANTLR start synpred102_InternalTExp
    public final void synpred102_InternalTExp_fragment() throws RecognitionException {   
        // InternalTExp.g:3599:4: ( ( ( ruleID ) ) )
        // InternalTExp.g:3599:4: ( ( ruleID ) )
        {
        // InternalTExp.g:3599:4: ( ( ruleID ) )
        // InternalTExp.g:3600:5: ( ruleID )
        {
        // InternalTExp.g:3600:5: ( ruleID )
        // InternalTExp.g:3601:6: ruleID
        {
        if ( state.backtracking==0 ) {

          						/* */
          					
        }
        pushFollow(FOLLOW_2);
        ruleID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred102_InternalTExp

    // Delegated rules

    public final boolean synpred99_InternalTExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred99_InternalTExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred102_InternalTExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred102_InternalTExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_InternalTExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_InternalTExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_InternalTExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_InternalTExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000102000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000005C6FFFFF0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000015C6FFFFF0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000F0000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000F0002000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00FE670000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00FE6F0000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00FE6F0000000410L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00FE6F0002000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00FE6F0000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00FE6F0000000010L,0x000000000000001CL});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000200000400L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0100080000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080400000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000500000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000000100010010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000108000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x8000000100000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000204000400L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000001400000400L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000001000000410L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000001200000000L});

}