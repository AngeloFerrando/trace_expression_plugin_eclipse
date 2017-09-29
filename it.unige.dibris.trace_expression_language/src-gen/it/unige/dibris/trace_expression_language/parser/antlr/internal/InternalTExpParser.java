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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ATOM", "RULE_OP1200XFX", "RULE_OP1200FX", "RULE_OP1150FX", "RULE_OP1100XFY", "RULE_OP1050XFY", "RULE_OP1000XFY", "RULE_OP954XFY", "RULE_OP900FY", "RULE_OP900FX", "RULE_OP700XFX", "RULE_OP700XFXR", "RULE_OP700XFXL", "RULE_OP600XFY", "RULE_OP500YFX", "RULE_OP500FX", "RULE_OP400YFX", "RULE_OP200XFX", "RULE_OP200XFY", "RULE_INT", "RULE_EXT_INT", "RULE_VARIABLE", "RULE_STRING", "RULE_OP400FX1", "RULE_WHITESPACE", "RULE_SINGLE_LINE_COMMENT", "'.'", "'!'", "'-'", "'('", "')'", "'['", "'|'", "']'", "'trace_expression'", "'{'", "'id:'", "'body:'", "'types:'", "'}'", "'agent_trace_expression'", "'roles:'", "'modules:'", "'decentralized:'", "'true'", "'false'", "'partition:'", "'constraints:'", "'gui:'", "'minimal:'", "'threshold:'", "'channels:'", "'derived'", "'<-'", "'\\\\/'", "'/\\\\'", "'*'", "'epsilon'", "'=>'", "'$'", "'-><-'", "'<-->'", "'number_singletons'", "'size_constraints'", "'number_constraints'"
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

                if ( (LA1_0==38||LA1_0==44) ) {
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
    // InternalTExp.g:327:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' (this_EXT_INT_3= RULE_EXT_INT | this_INT_4= RULE_INT ) )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_EXT_INT_3=null;
        Token this_INT_4=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalTExp.g:334:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' (this_EXT_INT_3= RULE_EXT_INT | this_INT_4= RULE_INT ) )? ) )
            // InternalTExp.g:335:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' (this_EXT_INT_3= RULE_EXT_INT | this_INT_4= RULE_INT ) )? )
            {
            // InternalTExp.g:335:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' (this_EXT_INT_3= RULE_EXT_INT | this_INT_4= RULE_INT ) )? )
            // InternalTExp.g:336:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' (this_EXT_INT_3= RULE_EXT_INT | this_INT_4= RULE_INT ) )?
            {
            // InternalTExp.g:336:3: (kw= '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==32) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTExp.g:337:4: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_1, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1());
              		
            }
            // InternalTExp.g:350:3: (kw= '.' (this_EXT_INT_3= RULE_EXT_INT | this_INT_4= RULE_INT ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTExp.g:351:4: kw= '.' (this_EXT_INT_3= RULE_EXT_INT | this_INT_4= RULE_INT )
                    {
                    kw=(Token)match(input,30,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_2_0());
                      			
                    }
                    // InternalTExp.g:356:4: (this_EXT_INT_3= RULE_EXT_INT | this_INT_4= RULE_INT )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_EXT_INT) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==RULE_INT) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalTExp.g:357:5: this_EXT_INT_3= RULE_EXT_INT
                            {
                            this_EXT_INT_3=(Token)match(input,RULE_EXT_INT,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_EXT_INT_3);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_EXT_INT_3, grammarAccess.getNUMBERAccess().getEXT_INTTerminalRuleCall_2_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalTExp.g:365:5: this_INT_4= RULE_INT
                            {
                            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(this_INT_4);
                              				
                            }
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_INT_4, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_2_1_1());
                              				
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
    // InternalTExp.g:381:1: entryRuleExpressionInfinity returns [EObject current=null] : iv_ruleExpressionInfinity= ruleExpressionInfinity EOF ;
    public final EObject entryRuleExpressionInfinity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionInfinity = null;


        try {
            // InternalTExp.g:381:59: (iv_ruleExpressionInfinity= ruleExpressionInfinity EOF )
            // InternalTExp.g:382:2: iv_ruleExpressionInfinity= ruleExpressionInfinity EOF
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
    // InternalTExp.g:388:1: ruleExpressionInfinity returns [EObject current=null] : this_Expression1100xfy_0= ruleExpression1100xfy ;
    public final EObject ruleExpressionInfinity() throws RecognitionException {
        EObject current = null;

        EObject this_Expression1100xfy_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:394:2: (this_Expression1100xfy_0= ruleExpression1100xfy )
            // InternalTExp.g:395:2: this_Expression1100xfy_0= ruleExpression1100xfy
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
    // InternalTExp.g:409:1: entryRuleExpression1100xfy returns [EObject current=null] : iv_ruleExpression1100xfy= ruleExpression1100xfy EOF ;
    public final EObject entryRuleExpression1100xfy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression1100xfy = null;


        try {
            // InternalTExp.g:409:58: (iv_ruleExpression1100xfy= ruleExpression1100xfy EOF )
            // InternalTExp.g:410:2: iv_ruleExpression1100xfy= ruleExpression1100xfy EOF
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
    // InternalTExp.g:416:1: ruleExpression1100xfy returns [EObject current=null] : (this_Expression1050xfy_0= ruleExpression1050xfy ( () ( (lv_op_2_0= RULE_OP1100XFY ) ) ( (lv_right_3_0= ruleExpression1100xfy ) ) )? ) ;
    public final EObject ruleExpression1100xfy() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression1050xfy_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:422:2: ( (this_Expression1050xfy_0= ruleExpression1050xfy ( () ( (lv_op_2_0= RULE_OP1100XFY ) ) ( (lv_right_3_0= ruleExpression1100xfy ) ) )? ) )
            // InternalTExp.g:423:2: (this_Expression1050xfy_0= ruleExpression1050xfy ( () ( (lv_op_2_0= RULE_OP1100XFY ) ) ( (lv_right_3_0= ruleExpression1100xfy ) ) )? )
            {
            // InternalTExp.g:423:2: (this_Expression1050xfy_0= ruleExpression1050xfy ( () ( (lv_op_2_0= RULE_OP1100XFY ) ) ( (lv_right_3_0= ruleExpression1100xfy ) ) )? )
            // InternalTExp.g:424:3: this_Expression1050xfy_0= ruleExpression1050xfy ( () ( (lv_op_2_0= RULE_OP1100XFY ) ) ( (lv_right_3_0= ruleExpression1100xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression1100xfyAccess().getExpression1050xfyParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_7);
            this_Expression1050xfy_0=ruleExpression1050xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression1050xfy_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:435:3: ( () ( (lv_op_2_0= RULE_OP1100XFY ) ) ( (lv_right_3_0= ruleExpression1100xfy ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_OP1100XFY) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTExp.g:436:4: () ( (lv_op_2_0= RULE_OP1100XFY ) ) ( (lv_right_3_0= ruleExpression1100xfy ) )
                    {
                    // InternalTExp.g:436:4: ()
                    // InternalTExp.g:437:5: 
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

                    // InternalTExp.g:446:4: ( (lv_op_2_0= RULE_OP1100XFY ) )
                    // InternalTExp.g:447:5: (lv_op_2_0= RULE_OP1100XFY )
                    {
                    // InternalTExp.g:447:5: (lv_op_2_0= RULE_OP1100XFY )
                    // InternalTExp.g:448:6: lv_op_2_0= RULE_OP1100XFY
                    {
                    lv_op_2_0=(Token)match(input,RULE_OP1100XFY,FOLLOW_8); if (state.failed) return current;
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

                    // InternalTExp.g:464:4: ( (lv_right_3_0= ruleExpression1100xfy ) )
                    // InternalTExp.g:465:5: (lv_right_3_0= ruleExpression1100xfy )
                    {
                    // InternalTExp.g:465:5: (lv_right_3_0= ruleExpression1100xfy )
                    // InternalTExp.g:466:6: lv_right_3_0= ruleExpression1100xfy
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
    // InternalTExp.g:488:1: entryRuleExpression1050xfy returns [EObject current=null] : iv_ruleExpression1050xfy= ruleExpression1050xfy EOF ;
    public final EObject entryRuleExpression1050xfy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression1050xfy = null;


        try {
            // InternalTExp.g:488:58: (iv_ruleExpression1050xfy= ruleExpression1050xfy EOF )
            // InternalTExp.g:489:2: iv_ruleExpression1050xfy= ruleExpression1050xfy EOF
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
    // InternalTExp.g:495:1: ruleExpression1050xfy returns [EObject current=null] : (this_Expression1000xfy_0= ruleExpression1000xfy ( () ( (lv_op_2_0= RULE_OP1050XFY ) ) ( (lv_right_3_0= ruleExpression1050xfy ) ) )? ) ;
    public final EObject ruleExpression1050xfy() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression1000xfy_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:501:2: ( (this_Expression1000xfy_0= ruleExpression1000xfy ( () ( (lv_op_2_0= RULE_OP1050XFY ) ) ( (lv_right_3_0= ruleExpression1050xfy ) ) )? ) )
            // InternalTExp.g:502:2: (this_Expression1000xfy_0= ruleExpression1000xfy ( () ( (lv_op_2_0= RULE_OP1050XFY ) ) ( (lv_right_3_0= ruleExpression1050xfy ) ) )? )
            {
            // InternalTExp.g:502:2: (this_Expression1000xfy_0= ruleExpression1000xfy ( () ( (lv_op_2_0= RULE_OP1050XFY ) ) ( (lv_right_3_0= ruleExpression1050xfy ) ) )? )
            // InternalTExp.g:503:3: this_Expression1000xfy_0= ruleExpression1000xfy ( () ( (lv_op_2_0= RULE_OP1050XFY ) ) ( (lv_right_3_0= ruleExpression1050xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression1050xfyAccess().getExpression1000xfyParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_Expression1000xfy_0=ruleExpression1000xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression1000xfy_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:514:3: ( () ( (lv_op_2_0= RULE_OP1050XFY ) ) ( (lv_right_3_0= ruleExpression1050xfy ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_OP1050XFY) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTExp.g:515:4: () ( (lv_op_2_0= RULE_OP1050XFY ) ) ( (lv_right_3_0= ruleExpression1050xfy ) )
                    {
                    // InternalTExp.g:515:4: ()
                    // InternalTExp.g:516:5: 
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

                    // InternalTExp.g:525:4: ( (lv_op_2_0= RULE_OP1050XFY ) )
                    // InternalTExp.g:526:5: (lv_op_2_0= RULE_OP1050XFY )
                    {
                    // InternalTExp.g:526:5: (lv_op_2_0= RULE_OP1050XFY )
                    // InternalTExp.g:527:6: lv_op_2_0= RULE_OP1050XFY
                    {
                    lv_op_2_0=(Token)match(input,RULE_OP1050XFY,FOLLOW_8); if (state.failed) return current;
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

                    // InternalTExp.g:543:4: ( (lv_right_3_0= ruleExpression1050xfy ) )
                    // InternalTExp.g:544:5: (lv_right_3_0= ruleExpression1050xfy )
                    {
                    // InternalTExp.g:544:5: (lv_right_3_0= ruleExpression1050xfy )
                    // InternalTExp.g:545:6: lv_right_3_0= ruleExpression1050xfy
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
    // InternalTExp.g:567:1: entryRuleExpression1000xfy returns [EObject current=null] : iv_ruleExpression1000xfy= ruleExpression1000xfy EOF ;
    public final EObject entryRuleExpression1000xfy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression1000xfy = null;


        try {
            // InternalTExp.g:567:58: (iv_ruleExpression1000xfy= ruleExpression1000xfy EOF )
            // InternalTExp.g:568:2: iv_ruleExpression1000xfy= ruleExpression1000xfy EOF
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
    // InternalTExp.g:574:1: ruleExpression1000xfy returns [EObject current=null] : (this_Expression954xfy_0= ruleExpression954xfy ( () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) ) )? ) ;
    public final EObject ruleExpression1000xfy() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression954xfy_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:580:2: ( (this_Expression954xfy_0= ruleExpression954xfy ( () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) ) )? ) )
            // InternalTExp.g:581:2: (this_Expression954xfy_0= ruleExpression954xfy ( () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) ) )? )
            {
            // InternalTExp.g:581:2: (this_Expression954xfy_0= ruleExpression954xfy ( () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) ) )? )
            // InternalTExp.g:582:3: this_Expression954xfy_0= ruleExpression954xfy ( () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression1000xfyAccess().getExpression954xfyParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_10);
            this_Expression954xfy_0=ruleExpression954xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression954xfy_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:593:3: ( () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_OP1000XFY) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTExp.g:594:4: () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) )
                    {
                    // InternalTExp.g:594:4: ()
                    // InternalTExp.g:595:5: 
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

                    // InternalTExp.g:604:4: ( (lv_op_2_0= RULE_OP1000XFY ) )
                    // InternalTExp.g:605:5: (lv_op_2_0= RULE_OP1000XFY )
                    {
                    // InternalTExp.g:605:5: (lv_op_2_0= RULE_OP1000XFY )
                    // InternalTExp.g:606:6: lv_op_2_0= RULE_OP1000XFY
                    {
                    lv_op_2_0=(Token)match(input,RULE_OP1000XFY,FOLLOW_8); if (state.failed) return current;
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

                    // InternalTExp.g:622:4: ( (lv_right_3_0= ruleExpression1000xfy ) )
                    // InternalTExp.g:623:5: (lv_right_3_0= ruleExpression1000xfy )
                    {
                    // InternalTExp.g:623:5: (lv_right_3_0= ruleExpression1000xfy )
                    // InternalTExp.g:624:6: lv_right_3_0= ruleExpression1000xfy
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
    // InternalTExp.g:646:1: entryRuleExpression954xfy returns [EObject current=null] : iv_ruleExpression954xfy= ruleExpression954xfy EOF ;
    public final EObject entryRuleExpression954xfy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression954xfy = null;


        try {
            // InternalTExp.g:646:57: (iv_ruleExpression954xfy= ruleExpression954xfy EOF )
            // InternalTExp.g:647:2: iv_ruleExpression954xfy= ruleExpression954xfy EOF
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
    // InternalTExp.g:653:1: ruleExpression954xfy returns [EObject current=null] : (this_Expression700xfx_0= ruleExpression700xfx ( () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) ) )? ) ;
    public final EObject ruleExpression954xfy() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression700xfx_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:659:2: ( (this_Expression700xfx_0= ruleExpression700xfx ( () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) ) )? ) )
            // InternalTExp.g:660:2: (this_Expression700xfx_0= ruleExpression700xfx ( () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) ) )? )
            {
            // InternalTExp.g:660:2: (this_Expression700xfx_0= ruleExpression700xfx ( () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) ) )? )
            // InternalTExp.g:661:3: this_Expression700xfx_0= ruleExpression700xfx ( () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression954xfyAccess().getExpression700xfxParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_11);
            this_Expression700xfx_0=ruleExpression700xfx();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression700xfx_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:672:3: ( () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_OP954XFY) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTExp.g:673:4: () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) )
                    {
                    // InternalTExp.g:673:4: ()
                    // InternalTExp.g:674:5: 
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

                    // InternalTExp.g:683:4: ( (lv_op_2_0= RULE_OP954XFY ) )
                    // InternalTExp.g:684:5: (lv_op_2_0= RULE_OP954XFY )
                    {
                    // InternalTExp.g:684:5: (lv_op_2_0= RULE_OP954XFY )
                    // InternalTExp.g:685:6: lv_op_2_0= RULE_OP954XFY
                    {
                    lv_op_2_0=(Token)match(input,RULE_OP954XFY,FOLLOW_8); if (state.failed) return current;
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

                    // InternalTExp.g:701:4: ( (lv_right_3_0= ruleExpression954xfy ) )
                    // InternalTExp.g:702:5: (lv_right_3_0= ruleExpression954xfy )
                    {
                    // InternalTExp.g:702:5: (lv_right_3_0= ruleExpression954xfy )
                    // InternalTExp.g:703:6: lv_right_3_0= ruleExpression954xfy
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
    // InternalTExp.g:725:1: entryRuleExpression700xfx returns [EObject current=null] : iv_ruleExpression700xfx= ruleExpression700xfx EOF ;
    public final EObject entryRuleExpression700xfx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression700xfx = null;


        try {
            // InternalTExp.g:725:57: (iv_ruleExpression700xfx= ruleExpression700xfx EOF )
            // InternalTExp.g:726:2: iv_ruleExpression700xfx= ruleExpression700xfx EOF
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
    // InternalTExp.g:732:1: ruleExpression700xfx returns [EObject current=null] : (this_Expression600xfy_0= ruleExpression600xfy ( () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? ) ;
    public final EObject ruleExpression700xfx() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_Expression600xfy_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:738:2: ( (this_Expression600xfy_0= ruleExpression600xfy ( () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? ) )
            // InternalTExp.g:739:2: (this_Expression600xfy_0= ruleExpression600xfy ( () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? )
            {
            // InternalTExp.g:739:2: (this_Expression600xfy_0= ruleExpression600xfy ( () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? )
            // InternalTExp.g:740:3: this_Expression600xfy_0= ruleExpression600xfy ( () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression700xfxAccess().getExpression600xfyParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_12);
            this_Expression600xfy_0=ruleExpression600xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression600xfy_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:751:3: ( () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_OP700XFX && LA11_0<=RULE_OP700XFXL)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTExp.g:752:4: () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) )
                    {
                    // InternalTExp.g:752:4: ()
                    // InternalTExp.g:753:5: 
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

                    // InternalTExp.g:762:4: ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) )
                    // InternalTExp.g:763:5: ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) )
                    {
                    // InternalTExp.g:763:5: ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) )
                    // InternalTExp.g:764:6: (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL )
                    {
                    // InternalTExp.g:764:6: (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL )
                    int alt10=3;
                    switch ( input.LA(1) ) {
                    case RULE_OP700XFX:
                        {
                        alt10=1;
                        }
                        break;
                    case RULE_OP700XFXR:
                        {
                        alt10=2;
                        }
                        break;
                    case RULE_OP700XFXL:
                        {
                        alt10=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }

                    switch (alt10) {
                        case 1 :
                            // InternalTExp.g:765:7: lv_op_2_1= RULE_OP700XFX
                            {
                            lv_op_2_1=(Token)match(input,RULE_OP700XFX,FOLLOW_8); if (state.failed) return current;
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
                            // InternalTExp.g:780:7: lv_op_2_2= RULE_OP700XFXR
                            {
                            lv_op_2_2=(Token)match(input,RULE_OP700XFXR,FOLLOW_8); if (state.failed) return current;
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
                            // InternalTExp.g:795:7: lv_op_2_3= RULE_OP700XFXL
                            {
                            lv_op_2_3=(Token)match(input,RULE_OP700XFXL,FOLLOW_8); if (state.failed) return current;
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

                    // InternalTExp.g:812:4: ( (lv_right_3_0= ruleExpression600xfy ) )
                    // InternalTExp.g:813:5: (lv_right_3_0= ruleExpression600xfy )
                    {
                    // InternalTExp.g:813:5: (lv_right_3_0= ruleExpression600xfy )
                    // InternalTExp.g:814:6: lv_right_3_0= ruleExpression600xfy
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
    // InternalTExp.g:836:1: entryRuleExpression600xfy returns [EObject current=null] : iv_ruleExpression600xfy= ruleExpression600xfy EOF ;
    public final EObject entryRuleExpression600xfy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression600xfy = null;


        try {
            // InternalTExp.g:836:57: (iv_ruleExpression600xfy= ruleExpression600xfy EOF )
            // InternalTExp.g:837:2: iv_ruleExpression600xfy= ruleExpression600xfy EOF
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
    // InternalTExp.g:843:1: ruleExpression600xfy returns [EObject current=null] : (this_Expression500yfx_0= ruleExpression500yfx ( () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? ) ;
    public final EObject ruleExpression600xfy() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression500yfx_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:849:2: ( (this_Expression500yfx_0= ruleExpression500yfx ( () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? ) )
            // InternalTExp.g:850:2: (this_Expression500yfx_0= ruleExpression500yfx ( () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? )
            {
            // InternalTExp.g:850:2: (this_Expression500yfx_0= ruleExpression500yfx ( () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? )
            // InternalTExp.g:851:3: this_Expression500yfx_0= ruleExpression500yfx ( () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression600xfyAccess().getExpression500yfxParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_13);
            this_Expression500yfx_0=ruleExpression500yfx();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression500yfx_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:862:3: ( () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_OP600XFY) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTExp.g:863:4: () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) )
                    {
                    // InternalTExp.g:863:4: ()
                    // InternalTExp.g:864:5: 
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

                    // InternalTExp.g:873:4: ( (lv_op_2_0= RULE_OP600XFY ) )
                    // InternalTExp.g:874:5: (lv_op_2_0= RULE_OP600XFY )
                    {
                    // InternalTExp.g:874:5: (lv_op_2_0= RULE_OP600XFY )
                    // InternalTExp.g:875:6: lv_op_2_0= RULE_OP600XFY
                    {
                    lv_op_2_0=(Token)match(input,RULE_OP600XFY,FOLLOW_8); if (state.failed) return current;
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

                    // InternalTExp.g:891:4: ( (lv_right_3_0= ruleExpression600xfy ) )
                    // InternalTExp.g:892:5: (lv_right_3_0= ruleExpression600xfy )
                    {
                    // InternalTExp.g:892:5: (lv_right_3_0= ruleExpression600xfy )
                    // InternalTExp.g:893:6: lv_right_3_0= ruleExpression600xfy
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
    // InternalTExp.g:915:1: entryRuleExpression500yfx returns [EObject current=null] : iv_ruleExpression500yfx= ruleExpression500yfx EOF ;
    public final EObject entryRuleExpression500yfx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression500yfx = null;


        try {
            // InternalTExp.g:915:57: (iv_ruleExpression500yfx= ruleExpression500yfx EOF )
            // InternalTExp.g:916:2: iv_ruleExpression500yfx= ruleExpression500yfx EOF
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
    // InternalTExp.g:922:1: ruleExpression500yfx returns [EObject current=null] : (this_Expression400yfx_0= ruleExpression400yfx ( () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) ) )* ) ;
    public final EObject ruleExpression500yfx() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression400yfx_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:928:2: ( (this_Expression400yfx_0= ruleExpression400yfx ( () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) ) )* ) )
            // InternalTExp.g:929:2: (this_Expression400yfx_0= ruleExpression400yfx ( () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) ) )* )
            {
            // InternalTExp.g:929:2: (this_Expression400yfx_0= ruleExpression400yfx ( () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) ) )* )
            // InternalTExp.g:930:3: this_Expression400yfx_0= ruleExpression400yfx ( () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression500yfxAccess().getExpression400yfxParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_14);
            this_Expression400yfx_0=ruleExpression400yfx();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression400yfx_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:941:3: ( () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_OP500YFX) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTExp.g:942:4: () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) )
            	    {
            	    // InternalTExp.g:942:4: ()
            	    // InternalTExp.g:943:5: 
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

            	    // InternalTExp.g:952:4: ( (lv_op_2_0= RULE_OP500YFX ) )
            	    // InternalTExp.g:953:5: (lv_op_2_0= RULE_OP500YFX )
            	    {
            	    // InternalTExp.g:953:5: (lv_op_2_0= RULE_OP500YFX )
            	    // InternalTExp.g:954:6: lv_op_2_0= RULE_OP500YFX
            	    {
            	    lv_op_2_0=(Token)match(input,RULE_OP500YFX,FOLLOW_8); if (state.failed) return current;
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

            	    // InternalTExp.g:970:4: ( (lv_right_3_0= ruleExpression400yfx ) )
            	    // InternalTExp.g:971:5: (lv_right_3_0= ruleExpression400yfx )
            	    {
            	    // InternalTExp.g:971:5: (lv_right_3_0= ruleExpression400yfx )
            	    // InternalTExp.g:972:6: lv_right_3_0= ruleExpression400yfx
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpression500yfxAccess().getRightExpression400yfxParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
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
    // $ANTLR end "ruleExpression500yfx"


    // $ANTLR start "entryRuleExpression400yfx"
    // InternalTExp.g:994:1: entryRuleExpression400yfx returns [EObject current=null] : iv_ruleExpression400yfx= ruleExpression400yfx EOF ;
    public final EObject entryRuleExpression400yfx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression400yfx = null;


        try {
            // InternalTExp.g:994:57: (iv_ruleExpression400yfx= ruleExpression400yfx EOF )
            // InternalTExp.g:995:2: iv_ruleExpression400yfx= ruleExpression400yfx EOF
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
    // InternalTExp.g:1001:1: ruleExpression400yfx returns [EObject current=null] : (this_Expression200xfx_0= ruleExpression200xfx ( () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) ) )* ) ;
    public final EObject ruleExpression400yfx() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression200xfx_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:1007:2: ( (this_Expression200xfx_0= ruleExpression200xfx ( () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) ) )* ) )
            // InternalTExp.g:1008:2: (this_Expression200xfx_0= ruleExpression200xfx ( () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) ) )* )
            {
            // InternalTExp.g:1008:2: (this_Expression200xfx_0= ruleExpression200xfx ( () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) ) )* )
            // InternalTExp.g:1009:3: this_Expression200xfx_0= ruleExpression200xfx ( () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression400yfxAccess().getExpression200xfxParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_15);
            this_Expression200xfx_0=ruleExpression200xfx();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression200xfx_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:1020:3: ( () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_OP400YFX) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTExp.g:1021:4: () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) )
            	    {
            	    // InternalTExp.g:1021:4: ()
            	    // InternalTExp.g:1022:5: 
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

            	    // InternalTExp.g:1031:4: ( (lv_op_2_0= RULE_OP400YFX ) )
            	    // InternalTExp.g:1032:5: (lv_op_2_0= RULE_OP400YFX )
            	    {
            	    // InternalTExp.g:1032:5: (lv_op_2_0= RULE_OP400YFX )
            	    // InternalTExp.g:1033:6: lv_op_2_0= RULE_OP400YFX
            	    {
            	    lv_op_2_0=(Token)match(input,RULE_OP400YFX,FOLLOW_8); if (state.failed) return current;
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

            	    // InternalTExp.g:1049:4: ( (lv_right_3_0= ruleExpression200xfx ) )
            	    // InternalTExp.g:1050:5: (lv_right_3_0= ruleExpression200xfx )
            	    {
            	    // InternalTExp.g:1050:5: (lv_right_3_0= ruleExpression200xfx )
            	    // InternalTExp.g:1051:6: lv_right_3_0= ruleExpression200xfx
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpression400yfxAccess().getRightExpression200xfxParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
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
            	    break loop14;
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
    // InternalTExp.g:1073:1: entryRuleExpression200xfx returns [EObject current=null] : iv_ruleExpression200xfx= ruleExpression200xfx EOF ;
    public final EObject entryRuleExpression200xfx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression200xfx = null;


        try {
            // InternalTExp.g:1073:57: (iv_ruleExpression200xfx= ruleExpression200xfx EOF )
            // InternalTExp.g:1074:2: iv_ruleExpression200xfx= ruleExpression200xfx EOF
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
    // InternalTExp.g:1080:1: ruleExpression200xfx returns [EObject current=null] : (this_Expression200xfy_0= ruleExpression200xfy ( () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? ) ;
    public final EObject ruleExpression200xfx() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression200xfy_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:1086:2: ( (this_Expression200xfy_0= ruleExpression200xfy ( () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? ) )
            // InternalTExp.g:1087:2: (this_Expression200xfy_0= ruleExpression200xfy ( () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? )
            {
            // InternalTExp.g:1087:2: (this_Expression200xfy_0= ruleExpression200xfy ( () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? )
            // InternalTExp.g:1088:3: this_Expression200xfy_0= ruleExpression200xfy ( () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression200xfxAccess().getExpression200xfyParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            this_Expression200xfy_0=ruleExpression200xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression200xfy_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:1099:3: ( () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_OP200XFX) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTExp.g:1100:4: () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) )
                    {
                    // InternalTExp.g:1100:4: ()
                    // InternalTExp.g:1101:5: 
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

                    // InternalTExp.g:1110:4: ( (lv_op_2_0= RULE_OP200XFX ) )
                    // InternalTExp.g:1111:5: (lv_op_2_0= RULE_OP200XFX )
                    {
                    // InternalTExp.g:1111:5: (lv_op_2_0= RULE_OP200XFX )
                    // InternalTExp.g:1112:6: lv_op_2_0= RULE_OP200XFX
                    {
                    lv_op_2_0=(Token)match(input,RULE_OP200XFX,FOLLOW_8); if (state.failed) return current;
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

                    // InternalTExp.g:1128:4: ( (lv_right_3_0= ruleExpression200xfy ) )
                    // InternalTExp.g:1129:5: (lv_right_3_0= ruleExpression200xfy )
                    {
                    // InternalTExp.g:1129:5: (lv_right_3_0= ruleExpression200xfy )
                    // InternalTExp.g:1130:6: lv_right_3_0= ruleExpression200xfy
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
    // InternalTExp.g:1152:1: entryRuleExpression200xfy returns [EObject current=null] : iv_ruleExpression200xfy= ruleExpression200xfy EOF ;
    public final EObject entryRuleExpression200xfy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression200xfy = null;


        try {
            // InternalTExp.g:1152:57: (iv_ruleExpression200xfy= ruleExpression200xfy EOF )
            // InternalTExp.g:1153:2: iv_ruleExpression200xfy= ruleExpression200xfy EOF
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
    // InternalTExp.g:1159:1: ruleExpression200xfy returns [EObject current=null] : (this_Expression0_0= ruleExpression0 ( () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? ) ;
    public final EObject ruleExpression200xfy() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression0_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:1165:2: ( (this_Expression0_0= ruleExpression0 ( () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? ) )
            // InternalTExp.g:1166:2: (this_Expression0_0= ruleExpression0 ( () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? )
            {
            // InternalTExp.g:1166:2: (this_Expression0_0= ruleExpression0 ( () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? )
            // InternalTExp.g:1167:3: this_Expression0_0= ruleExpression0 ( () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression200xfyAccess().getExpression0ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_17);
            this_Expression0_0=ruleExpression0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression0_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:1178:3: ( () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_OP200XFY) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTExp.g:1179:4: () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) )
                    {
                    // InternalTExp.g:1179:4: ()
                    // InternalTExp.g:1180:5: 
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

                    // InternalTExp.g:1189:4: ( (lv_op_2_0= RULE_OP200XFY ) )
                    // InternalTExp.g:1190:5: (lv_op_2_0= RULE_OP200XFY )
                    {
                    // InternalTExp.g:1190:5: (lv_op_2_0= RULE_OP200XFY )
                    // InternalTExp.g:1191:6: lv_op_2_0= RULE_OP200XFY
                    {
                    lv_op_2_0=(Token)match(input,RULE_OP200XFY,FOLLOW_8); if (state.failed) return current;
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

                    // InternalTExp.g:1207:4: ( (lv_right_3_0= ruleExpression200xfy ) )
                    // InternalTExp.g:1208:5: (lv_right_3_0= ruleExpression200xfy )
                    {
                    // InternalTExp.g:1208:5: (lv_right_3_0= ruleExpression200xfy )
                    // InternalTExp.g:1209:6: lv_right_3_0= ruleExpression200xfy
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
    // InternalTExp.g:1231:1: entryRuleExpression0 returns [EObject current=null] : iv_ruleExpression0= ruleExpression0 EOF ;
    public final EObject entryRuleExpression0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression0 = null;


        try {
            // InternalTExp.g:1231:52: (iv_ruleExpression0= ruleExpression0 EOF )
            // InternalTExp.g:1232:2: iv_ruleExpression0= ruleExpression0 EOF
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
    // InternalTExp.g:1238:1: ruleExpression0 returns [EObject current=null] : ( ( () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )? ) | ( () ( (lv_name_6_0= RULE_VARIABLE ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_value_10_0= ruleNUMBER ) ) ) | ( () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']' ) | (otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')' ) ) ;
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
            // InternalTExp.g:1244:2: ( ( ( () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )? ) | ( () ( (lv_name_6_0= RULE_VARIABLE ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_value_10_0= ruleNUMBER ) ) ) | ( () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']' ) | (otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')' ) ) )
            // InternalTExp.g:1245:2: ( ( () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )? ) | ( () ( (lv_name_6_0= RULE_VARIABLE ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_value_10_0= ruleNUMBER ) ) ) | ( () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']' ) | (otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')' ) )
            {
            // InternalTExp.g:1245:2: ( ( () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )? ) | ( () ( (lv_name_6_0= RULE_VARIABLE ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_value_10_0= ruleNUMBER ) ) ) | ( () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']' ) | (otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')' ) )
            int alt20=6;
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
                alt20=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt20=2;
                }
                break;
            case RULE_STRING:
                {
                alt20=3;
                }
                break;
            case RULE_INT:
            case 32:
                {
                alt20=4;
                }
                break;
            case 35:
                {
                alt20=5;
                }
                break;
            case 33:
                {
                alt20=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalTExp.g:1246:3: ( () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )? )
                    {
                    // InternalTExp.g:1246:3: ( () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )? )
                    // InternalTExp.g:1247:4: () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )?
                    {
                    // InternalTExp.g:1247:4: ()
                    // InternalTExp.g:1248:5: 
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

                    // InternalTExp.g:1257:4: ( (lv_atom_1_0= ruleATOMS ) )
                    // InternalTExp.g:1258:5: (lv_atom_1_0= ruleATOMS )
                    {
                    // InternalTExp.g:1258:5: (lv_atom_1_0= ruleATOMS )
                    // InternalTExp.g:1259:6: lv_atom_1_0= ruleATOMS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpression0Access().getAtomATOMSParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
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

                    // InternalTExp.g:1276:4: (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==33) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalTExp.g:1277:5: otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')'
                            {
                            otherlv_2=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getExpression0Access().getLeftParenthesisKeyword_0_2_0());
                              				
                            }
                            // InternalTExp.g:1281:5: ( (lv_terms_3_0= ruleExpressionInfinity ) )
                            // InternalTExp.g:1282:6: (lv_terms_3_0= ruleExpressionInfinity )
                            {
                            // InternalTExp.g:1282:6: (lv_terms_3_0= ruleExpressionInfinity )
                            // InternalTExp.g:1283:7: lv_terms_3_0= ruleExpressionInfinity
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpression0Access().getTermsExpressionInfinityParserRuleCall_0_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_19);
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

                            otherlv_4=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
                    // InternalTExp.g:1307:3: ( () ( (lv_name_6_0= RULE_VARIABLE ) ) )
                    {
                    // InternalTExp.g:1307:3: ( () ( (lv_name_6_0= RULE_VARIABLE ) ) )
                    // InternalTExp.g:1308:4: () ( (lv_name_6_0= RULE_VARIABLE ) )
                    {
                    // InternalTExp.g:1308:4: ()
                    // InternalTExp.g:1309:5: 
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

                    // InternalTExp.g:1318:4: ( (lv_name_6_0= RULE_VARIABLE ) )
                    // InternalTExp.g:1319:5: (lv_name_6_0= RULE_VARIABLE )
                    {
                    // InternalTExp.g:1319:5: (lv_name_6_0= RULE_VARIABLE )
                    // InternalTExp.g:1320:6: lv_name_6_0= RULE_VARIABLE
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
                    // InternalTExp.g:1338:3: ( () ( (lv_value_8_0= RULE_STRING ) ) )
                    {
                    // InternalTExp.g:1338:3: ( () ( (lv_value_8_0= RULE_STRING ) ) )
                    // InternalTExp.g:1339:4: () ( (lv_value_8_0= RULE_STRING ) )
                    {
                    // InternalTExp.g:1339:4: ()
                    // InternalTExp.g:1340:5: 
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

                    // InternalTExp.g:1349:4: ( (lv_value_8_0= RULE_STRING ) )
                    // InternalTExp.g:1350:5: (lv_value_8_0= RULE_STRING )
                    {
                    // InternalTExp.g:1350:5: (lv_value_8_0= RULE_STRING )
                    // InternalTExp.g:1351:6: lv_value_8_0= RULE_STRING
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
                    // InternalTExp.g:1369:3: ( () ( (lv_value_10_0= ruleNUMBER ) ) )
                    {
                    // InternalTExp.g:1369:3: ( () ( (lv_value_10_0= ruleNUMBER ) ) )
                    // InternalTExp.g:1370:4: () ( (lv_value_10_0= ruleNUMBER ) )
                    {
                    // InternalTExp.g:1370:4: ()
                    // InternalTExp.g:1371:5: 
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

                    // InternalTExp.g:1380:4: ( (lv_value_10_0= ruleNUMBER ) )
                    // InternalTExp.g:1381:5: (lv_value_10_0= ruleNUMBER )
                    {
                    // InternalTExp.g:1381:5: (lv_value_10_0= ruleNUMBER )
                    // InternalTExp.g:1382:6: lv_value_10_0= ruleNUMBER
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
                    // InternalTExp.g:1401:3: ( () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']' )
                    {
                    // InternalTExp.g:1401:3: ( () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']' )
                    // InternalTExp.g:1402:4: () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']'
                    {
                    // InternalTExp.g:1402:4: ()
                    // InternalTExp.g:1403:5: 
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

                    otherlv_12=(Token)match(input,35,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getExpression0Access().getLeftSquareBracketKeyword_4_1());
                      			
                    }
                    // InternalTExp.g:1416:4: ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=RULE_ATOM && LA19_0<=RULE_INT)||(LA19_0>=RULE_VARIABLE && LA19_0<=RULE_STRING)||(LA19_0>=30 && LA19_0<=33)||LA19_0==35) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalTExp.g:1417:5: ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )?
                            {
                            // InternalTExp.g:1417:5: ( (lv_head_13_0= ruleExpressionInfinity ) )
                            // InternalTExp.g:1418:6: (lv_head_13_0= ruleExpressionInfinity )
                            {
                            // InternalTExp.g:1418:6: (lv_head_13_0= ruleExpressionInfinity )
                            // InternalTExp.g:1419:7: lv_head_13_0= ruleExpressionInfinity
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpression0Access().getHeadExpressionInfinityParserRuleCall_4_2_0_0());
                              						
                            }
                            pushFollow(FOLLOW_21);
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

                            // InternalTExp.g:1436:5: (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==36) ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // InternalTExp.g:1437:6: otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) )
                                    {
                                    otherlv_14=(Token)match(input,36,FOLLOW_8); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(otherlv_14, grammarAccess.getExpression0Access().getVerticalLineKeyword_4_2_1_0());
                                      					
                                    }
                                    // InternalTExp.g:1441:6: ( (lv_tail_15_0= ruleExpressionInfinity ) )
                                    // InternalTExp.g:1442:7: (lv_tail_15_0= ruleExpressionInfinity )
                                    {
                                    // InternalTExp.g:1442:7: (lv_tail_15_0= ruleExpressionInfinity )
                                    // InternalTExp.g:1443:8: lv_tail_15_0= ruleExpressionInfinity
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getExpression0Access().getTailExpressionInfinityParserRuleCall_4_2_1_1_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_22);
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

                    otherlv_16=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getExpression0Access().getRightSquareBracketKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalTExp.g:1468:3: (otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')' )
                    {
                    // InternalTExp.g:1468:3: (otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')' )
                    // InternalTExp.g:1469:4: otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')'
                    {
                    otherlv_17=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getExpression0Access().getLeftParenthesisKeyword_5_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExpression0Access().getExpressionInfinityParserRuleCall_5_1());
                      			
                    }
                    pushFollow(FOLLOW_19);
                    this_ExpressionInfinity_18=ruleExpressionInfinity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ExpressionInfinity_18;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_19=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // InternalTExp.g:1493:1: entryRuleTraceExpression returns [EObject current=null] : iv_ruleTraceExpression= ruleTraceExpression EOF ;
    public final EObject entryRuleTraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceExpression = null;


        try {
            // InternalTExp.g:1493:56: (iv_ruleTraceExpression= ruleTraceExpression EOF )
            // InternalTExp.g:1494:2: iv_ruleTraceExpression= ruleTraceExpression EOF
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
    // InternalTExp.g:1500:1: ruleTraceExpression returns [EObject current=null] : (this_GenericTraceExpression_0= ruleGenericTraceExpression | this_AgentTraceExpression_1= ruleAgentTraceExpression ) ;
    public final EObject ruleTraceExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GenericTraceExpression_0 = null;

        EObject this_AgentTraceExpression_1 = null;



        	enterRule();

        try {
            // InternalTExp.g:1506:2: ( (this_GenericTraceExpression_0= ruleGenericTraceExpression | this_AgentTraceExpression_1= ruleAgentTraceExpression ) )
            // InternalTExp.g:1507:2: (this_GenericTraceExpression_0= ruleGenericTraceExpression | this_AgentTraceExpression_1= ruleAgentTraceExpression )
            {
            // InternalTExp.g:1507:2: (this_GenericTraceExpression_0= ruleGenericTraceExpression | this_AgentTraceExpression_1= ruleAgentTraceExpression )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            else if ( (LA21_0==44) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalTExp.g:1508:3: this_GenericTraceExpression_0= ruleGenericTraceExpression
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
                    // InternalTExp.g:1520:3: this_AgentTraceExpression_1= ruleAgentTraceExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTraceExpressionAccess().getAgentTraceExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AgentTraceExpression_1=ruleAgentTraceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AgentTraceExpression_1;
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
    // InternalTExp.g:1535:1: entryRuleGenericTraceExpression returns [EObject current=null] : iv_ruleGenericTraceExpression= ruleGenericTraceExpression EOF ;
    public final EObject entryRuleGenericTraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenericTraceExpression = null;


        try {
            // InternalTExp.g:1535:63: (iv_ruleGenericTraceExpression= ruleGenericTraceExpression EOF )
            // InternalTExp.g:1536:2: iv_ruleGenericTraceExpression= ruleGenericTraceExpression EOF
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
    // InternalTExp.g:1542:1: ruleGenericTraceExpression returns [EObject current=null] : ( () otherlv_1= 'trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_typesL_7_0= 'types:' ) ) ( (lv_types_8_0= ruleEventType ) )* ) )+ otherlv_9= '}' ) ;
    public final EObject ruleGenericTraceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_bodyL_5_0=null;
        Token lv_typesL_7_0=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_terms_6_0 = null;

        EObject lv_types_8_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:1548:2: ( ( () otherlv_1= 'trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_typesL_7_0= 'types:' ) ) ( (lv_types_8_0= ruleEventType ) )* ) )+ otherlv_9= '}' ) )
            // InternalTExp.g:1549:2: ( () otherlv_1= 'trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_typesL_7_0= 'types:' ) ) ( (lv_types_8_0= ruleEventType ) )* ) )+ otherlv_9= '}' )
            {
            // InternalTExp.g:1549:2: ( () otherlv_1= 'trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_typesL_7_0= 'types:' ) ) ( (lv_types_8_0= ruleEventType ) )* ) )+ otherlv_9= '}' )
            // InternalTExp.g:1550:3: () otherlv_1= 'trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_typesL_7_0= 'types:' ) ) ( (lv_types_8_0= ruleEventType ) )* ) )+ otherlv_9= '}'
            {
            // InternalTExp.g:1550:3: ()
            // InternalTExp.g:1551:4: 
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

            otherlv_1=(Token)match(input,38,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGenericTraceExpressionAccess().getTrace_expressionKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,39,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getGenericTraceExpressionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,40,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getGenericTraceExpressionAccess().getIdKeyword_3());
              		
            }
            // InternalTExp.g:1572:3: ( (lv_name_4_0= ruleID ) )
            // InternalTExp.g:1573:4: (lv_name_4_0= ruleID )
            {
            // InternalTExp.g:1573:4: (lv_name_4_0= ruleID )
            // InternalTExp.g:1574:5: lv_name_4_0= ruleID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getGenericTraceExpressionAccess().getNameIDParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_26);
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

            // InternalTExp.g:1591:3: ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_typesL_7_0= 'types:' ) ) ( (lv_types_8_0= ruleEventType ) )* ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==41) ) {
                    alt24=1;
                }
                else if ( (LA24_0==42) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTExp.g:1592:4: ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ )
            	    {
            	    // InternalTExp.g:1592:4: ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ )
            	    // InternalTExp.g:1593:5: ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+
            	    {
            	    // InternalTExp.g:1593:5: ( (lv_bodyL_5_0= 'body:' ) )
            	    // InternalTExp.g:1594:6: (lv_bodyL_5_0= 'body:' )
            	    {
            	    // InternalTExp.g:1594:6: (lv_bodyL_5_0= 'body:' )
            	    // InternalTExp.g:1595:7: lv_bodyL_5_0= 'body:'
            	    {
            	    lv_bodyL_5_0=(Token)match(input,41,FOLLOW_25); if (state.failed) return current;
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

            	    // InternalTExp.g:1607:5: ( (lv_terms_6_0= ruleTerm ) )+
            	    int cnt22=0;
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==RULE_ATOM) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // InternalTExp.g:1608:6: (lv_terms_6_0= ruleTerm )
            	    	    {
            	    	    // InternalTExp.g:1608:6: (lv_terms_6_0= ruleTerm )
            	    	    // InternalTExp.g:1609:7: lv_terms_6_0= ruleTerm
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getGenericTraceExpressionAccess().getTermsTermParserRuleCall_5_0_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_27);
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
            	    	    if ( cnt22 >= 1 ) break loop22;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(22, input);
            	                throw eee;
            	        }
            	        cnt22++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTExp.g:1628:4: ( ( (lv_typesL_7_0= 'types:' ) ) ( (lv_types_8_0= ruleEventType ) )* )
            	    {
            	    // InternalTExp.g:1628:4: ( ( (lv_typesL_7_0= 'types:' ) ) ( (lv_types_8_0= ruleEventType ) )* )
            	    // InternalTExp.g:1629:5: ( (lv_typesL_7_0= 'types:' ) ) ( (lv_types_8_0= ruleEventType ) )*
            	    {
            	    // InternalTExp.g:1629:5: ( (lv_typesL_7_0= 'types:' ) )
            	    // InternalTExp.g:1630:6: (lv_typesL_7_0= 'types:' )
            	    {
            	    // InternalTExp.g:1630:6: (lv_typesL_7_0= 'types:' )
            	    // InternalTExp.g:1631:7: lv_typesL_7_0= 'types:'
            	    {
            	    lv_typesL_7_0=(Token)match(input,42,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_typesL_7_0, grammarAccess.getGenericTraceExpressionAccess().getTypesLTypesKeyword_5_1_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getGenericTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "typesL", lv_typesL_7_0, "types:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1643:5: ( (lv_types_8_0= ruleEventType ) )*
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==RULE_ATOM) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // InternalTExp.g:1644:6: (lv_types_8_0= ruleEventType )
            	    	    {
            	    	    // InternalTExp.g:1644:6: (lv_types_8_0= ruleEventType )
            	    	    // InternalTExp.g:1645:7: lv_types_8_0= ruleEventType
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getGenericTraceExpressionAccess().getTypesEventTypeParserRuleCall_5_1_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_27);
            	    	    lv_types_8_0=ruleEventType();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getGenericTraceExpressionRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"types",
            	    	      								lv_types_8_0,
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

            otherlv_9=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getGenericTraceExpressionAccess().getRightCurlyBracketKeyword_6());
              		
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


    // $ANTLR start "entryRuleAgentTraceExpression"
    // InternalTExp.g:1672:1: entryRuleAgentTraceExpression returns [EObject current=null] : iv_ruleAgentTraceExpression= ruleAgentTraceExpression EOF ;
    public final EObject entryRuleAgentTraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgentTraceExpression = null;


        try {
            // InternalTExp.g:1672:61: (iv_ruleAgentTraceExpression= ruleAgentTraceExpression EOF )
            // InternalTExp.g:1673:2: iv_ruleAgentTraceExpression= ruleAgentTraceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAgentTraceExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAgentTraceExpression=ruleAgentTraceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAgentTraceExpression; 
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
    // $ANTLR end "entryRuleAgentTraceExpression"


    // $ANTLR start "ruleAgentTraceExpression"
    // InternalTExp.g:1679:1: ruleAgentTraceExpression returns [EObject current=null] : ( () otherlv_1= 'agent_trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleMsgEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) )+ ) )+ otherlv_28= '}' ) ;
    public final EObject ruleAgentTraceExpression() throws RecognitionException {
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
        Token lv_minimalL_22_0=null;
        Token lv_minimal_23_1=null;
        Token lv_minimal_23_2=null;
        Token lv_thresholdL_24_0=null;
        Token lv_channelsL_26_0=null;
        Token otherlv_28=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_terms_6_0 = null;

        EObject lv_roles_8_0 = null;

        EObject lv_types_11_0 = null;

        AntlrDatatypeRuleToken lv_modules_13_0 = null;

        EObject lv_partition_17_0 = null;

        EObject lv_constraints_19_0 = null;

        AntlrDatatypeRuleToken lv_threshold_25_0 = null;

        EObject lv_channels_27_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:1685:2: ( ( () otherlv_1= 'agent_trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleMsgEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) )+ ) )+ otherlv_28= '}' ) )
            // InternalTExp.g:1686:2: ( () otherlv_1= 'agent_trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleMsgEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) )+ ) )+ otherlv_28= '}' )
            {
            // InternalTExp.g:1686:2: ( () otherlv_1= 'agent_trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleMsgEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) )+ ) )+ otherlv_28= '}' )
            // InternalTExp.g:1687:3: () otherlv_1= 'agent_trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleMsgEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) )+ ) )+ otherlv_28= '}'
            {
            // InternalTExp.g:1687:3: ()
            // InternalTExp.g:1688:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAgentTraceExpressionAccess().getAgentTraceExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAgentTraceExpressionAccess().getAgent_trace_expressionKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,39,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAgentTraceExpressionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,40,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getAgentTraceExpressionAccess().getIdKeyword_3());
              		
            }
            // InternalTExp.g:1709:3: ( (lv_name_4_0= ruleID ) )
            // InternalTExp.g:1710:4: (lv_name_4_0= ruleID )
            {
            // InternalTExp.g:1710:4: (lv_name_4_0= ruleID )
            // InternalTExp.g:1711:5: lv_name_4_0= ruleID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAgentTraceExpressionAccess().getNameIDParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_name_4_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAgentTraceExpressionRule());
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

            // InternalTExp.g:1728:3: ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleMsgEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) )+ ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=12;
                switch ( input.LA(1) ) {
                case 41:
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
                case 46:
                    {
                    alt35=4;
                    }
                    break;
                case 47:
                    {
                    alt35=5;
                    }
                    break;
                case 50:
                    {
                    alt35=6;
                    }
                    break;
                case 51:
                    {
                    alt35=7;
                    }
                    break;
                case 52:
                    {
                    alt35=8;
                    }
                    break;
                case 53:
                    {
                    alt35=9;
                    }
                    break;
                case 54:
                    {
                    alt35=10;
                    }
                    break;
                case 55:
                    {
                    alt35=11;
                    }
                    break;

                }

                switch (alt35) {
            	case 1 :
            	    // InternalTExp.g:1729:4: ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ )
            	    {
            	    // InternalTExp.g:1729:4: ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ )
            	    // InternalTExp.g:1730:5: ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+
            	    {
            	    // InternalTExp.g:1730:5: ( (lv_bodyL_5_0= 'body:' ) )
            	    // InternalTExp.g:1731:6: (lv_bodyL_5_0= 'body:' )
            	    {
            	    // InternalTExp.g:1731:6: (lv_bodyL_5_0= 'body:' )
            	    // InternalTExp.g:1732:7: lv_bodyL_5_0= 'body:'
            	    {
            	    lv_bodyL_5_0=(Token)match(input,41,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_bodyL_5_0, grammarAccess.getAgentTraceExpressionAccess().getBodyLBodyKeyword_5_0_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getAgentTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "bodyL", lv_bodyL_5_0, "body:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1744:5: ( (lv_terms_6_0= ruleTerm ) )+
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
            	    	    // InternalTExp.g:1745:6: (lv_terms_6_0= ruleTerm )
            	    	    {
            	    	    // InternalTExp.g:1745:6: (lv_terms_6_0= ruleTerm )
            	    	    // InternalTExp.g:1746:7: lv_terms_6_0= ruleTerm
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getAgentTraceExpressionAccess().getTermsTermParserRuleCall_5_0_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_29);
            	    	    lv_terms_6_0=ruleTerm();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getAgentTraceExpressionRule());
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
            	    // InternalTExp.g:1765:4: ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* )
            	    {
            	    // InternalTExp.g:1765:4: ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* )
            	    // InternalTExp.g:1766:5: ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )*
            	    {
            	    // InternalTExp.g:1766:5: ( (lv_rolesL_7_0= 'roles:' ) )
            	    // InternalTExp.g:1767:6: (lv_rolesL_7_0= 'roles:' )
            	    {
            	    // InternalTExp.g:1767:6: (lv_rolesL_7_0= 'roles:' )
            	    // InternalTExp.g:1768:7: lv_rolesL_7_0= 'roles:'
            	    {
            	    lv_rolesL_7_0=(Token)match(input,45,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_rolesL_7_0, grammarAccess.getAgentTraceExpressionAccess().getRolesLRolesKeyword_5_1_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getAgentTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "rolesL", lv_rolesL_7_0, "roles:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1780:5: ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )*
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==RULE_ATOM) ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // InternalTExp.g:1781:6: ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )?
            	    	    {
            	    	    // InternalTExp.g:1781:6: ( (lv_roles_8_0= ruleRole ) )
            	    	    // InternalTExp.g:1782:7: (lv_roles_8_0= ruleRole )
            	    	    {
            	    	    // InternalTExp.g:1782:7: (lv_roles_8_0= ruleRole )
            	    	    // InternalTExp.g:1783:8: lv_roles_8_0= ruleRole
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getAgentTraceExpressionAccess().getRolesRoleParserRuleCall_5_1_1_0_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FOLLOW_30);
            	    	    lv_roles_8_0=ruleRole();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      								if (current==null) {
            	    	      									current = createModelElementForParent(grammarAccess.getAgentTraceExpressionRule());
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

            	    	    // InternalTExp.g:1800:6: (this_OP1000XFY_9= RULE_OP1000XFY )?
            	    	    int alt26=2;
            	    	    int LA26_0 = input.LA(1);

            	    	    if ( (LA26_0==RULE_OP1000XFY) ) {
            	    	        alt26=1;
            	    	    }
            	    	    switch (alt26) {
            	    	        case 1 :
            	    	            // InternalTExp.g:1801:7: this_OP1000XFY_9= RULE_OP1000XFY
            	    	            {
            	    	            this_OP1000XFY_9=(Token)match(input,RULE_OP1000XFY,FOLLOW_29); if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              							newLeafNode(this_OP1000XFY_9, grammarAccess.getAgentTraceExpressionAccess().getOP1000XFYTerminalRuleCall_5_1_1_1());
            	    	              						
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
            	    // InternalTExp.g:1809:4: ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleMsgEventType ) )* )
            	    {
            	    // InternalTExp.g:1809:4: ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleMsgEventType ) )* )
            	    // InternalTExp.g:1810:5: ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleMsgEventType ) )*
            	    {
            	    // InternalTExp.g:1810:5: ( (lv_typesL_10_0= 'types:' ) )
            	    // InternalTExp.g:1811:6: (lv_typesL_10_0= 'types:' )
            	    {
            	    // InternalTExp.g:1811:6: (lv_typesL_10_0= 'types:' )
            	    // InternalTExp.g:1812:7: lv_typesL_10_0= 'types:'
            	    {
            	    lv_typesL_10_0=(Token)match(input,42,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_typesL_10_0, grammarAccess.getAgentTraceExpressionAccess().getTypesLTypesKeyword_5_2_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getAgentTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "typesL", lv_typesL_10_0, "types:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1824:5: ( (lv_types_11_0= ruleMsgEventType ) )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==RULE_ATOM) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // InternalTExp.g:1825:6: (lv_types_11_0= ruleMsgEventType )
            	    	    {
            	    	    // InternalTExp.g:1825:6: (lv_types_11_0= ruleMsgEventType )
            	    	    // InternalTExp.g:1826:7: lv_types_11_0= ruleMsgEventType
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getAgentTraceExpressionAccess().getTypesMsgEventTypeParserRuleCall_5_2_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_29);
            	    	    lv_types_11_0=ruleMsgEventType();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getAgentTraceExpressionRule());
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
            	    // InternalTExp.g:1845:4: ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* )
            	    {
            	    // InternalTExp.g:1845:4: ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* )
            	    // InternalTExp.g:1846:5: ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )*
            	    {
            	    // InternalTExp.g:1846:5: ( (lv_modulesL_12_0= 'modules:' ) )
            	    // InternalTExp.g:1847:6: (lv_modulesL_12_0= 'modules:' )
            	    {
            	    // InternalTExp.g:1847:6: (lv_modulesL_12_0= 'modules:' )
            	    // InternalTExp.g:1848:7: lv_modulesL_12_0= 'modules:'
            	    {
            	    lv_modulesL_12_0=(Token)match(input,46,FOLLOW_31); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_modulesL_12_0, grammarAccess.getAgentTraceExpressionAccess().getModulesLModulesKeyword_5_3_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getAgentTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "modulesL", lv_modulesL_12_0, "modules:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1860:5: ( (lv_modules_13_0= ruleModule ) )*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==RULE_ATOM||LA29_0==RULE_VARIABLE) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // InternalTExp.g:1861:6: (lv_modules_13_0= ruleModule )
            	    	    {
            	    	    // InternalTExp.g:1861:6: (lv_modules_13_0= ruleModule )
            	    	    // InternalTExp.g:1862:7: lv_modules_13_0= ruleModule
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getAgentTraceExpressionAccess().getModulesModuleParserRuleCall_5_3_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_31);
            	    	    lv_modules_13_0=ruleModule();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getAgentTraceExpressionRule());
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
            	    // InternalTExp.g:1881:4: ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) )
            	    {
            	    // InternalTExp.g:1881:4: ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) )
            	    // InternalTExp.g:1882:5: ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) )
            	    {
            	    // InternalTExp.g:1882:5: ( (lv_decentralizedL_14_0= 'decentralized:' ) )
            	    // InternalTExp.g:1883:6: (lv_decentralizedL_14_0= 'decentralized:' )
            	    {
            	    // InternalTExp.g:1883:6: (lv_decentralizedL_14_0= 'decentralized:' )
            	    // InternalTExp.g:1884:7: lv_decentralizedL_14_0= 'decentralized:'
            	    {
            	    lv_decentralizedL_14_0=(Token)match(input,47,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_decentralizedL_14_0, grammarAccess.getAgentTraceExpressionAccess().getDecentralizedLDecentralizedKeyword_5_4_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getAgentTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "decentralizedL", lv_decentralizedL_14_0, "decentralized:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1896:5: ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) )
            	    // InternalTExp.g:1897:6: ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) )
            	    {
            	    // InternalTExp.g:1897:6: ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) )
            	    // InternalTExp.g:1898:7: (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' )
            	    {
            	    // InternalTExp.g:1898:7: (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==48) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==49) ) {
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
            	            // InternalTExp.g:1899:8: lv_decentralized_15_1= 'true'
            	            {
            	            lv_decentralized_15_1=(Token)match(input,48,FOLLOW_33); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_decentralized_15_1, grammarAccess.getAgentTraceExpressionAccess().getDecentralizedTrueKeyword_5_4_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getAgentTraceExpressionRule());
            	              								}
            	              								addWithLastConsumed(current, "decentralized", lv_decentralized_15_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTExp.g:1910:8: lv_decentralized_15_2= 'false'
            	            {
            	            lv_decentralized_15_2=(Token)match(input,49,FOLLOW_33); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_decentralized_15_2, grammarAccess.getAgentTraceExpressionAccess().getDecentralizedFalseKeyword_5_4_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getAgentTraceExpressionRule());
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
            	    // InternalTExp.g:1925:4: ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) )
            	    {
            	    // InternalTExp.g:1925:4: ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) )
            	    // InternalTExp.g:1926:5: ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) )
            	    {
            	    // InternalTExp.g:1926:5: ( (lv_partitionL_16_0= 'partition:' ) )
            	    // InternalTExp.g:1927:6: (lv_partitionL_16_0= 'partition:' )
            	    {
            	    // InternalTExp.g:1927:6: (lv_partitionL_16_0= 'partition:' )
            	    // InternalTExp.g:1928:7: lv_partitionL_16_0= 'partition:'
            	    {
            	    lv_partitionL_16_0=(Token)match(input,50,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_partitionL_16_0, grammarAccess.getAgentTraceExpressionAccess().getPartitionLPartitionKeyword_5_5_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getAgentTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "partitionL", lv_partitionL_16_0, "partition:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1940:5: ( (lv_partition_17_0= rulePartition ) )
            	    // InternalTExp.g:1941:6: (lv_partition_17_0= rulePartition )
            	    {
            	    // InternalTExp.g:1941:6: (lv_partition_17_0= rulePartition )
            	    // InternalTExp.g:1942:7: lv_partition_17_0= rulePartition
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAgentTraceExpressionAccess().getPartitionPartitionParserRuleCall_5_5_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_partition_17_0=rulePartition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getAgentTraceExpressionRule());
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
            	    // InternalTExp.g:1961:4: ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* )
            	    {
            	    // InternalTExp.g:1961:4: ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* )
            	    // InternalTExp.g:1962:5: ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )*
            	    {
            	    // InternalTExp.g:1962:5: ( (lv_constraintsL_18_0= 'constraints:' ) )
            	    // InternalTExp.g:1963:6: (lv_constraintsL_18_0= 'constraints:' )
            	    {
            	    // InternalTExp.g:1963:6: (lv_constraintsL_18_0= 'constraints:' )
            	    // InternalTExp.g:1964:7: lv_constraintsL_18_0= 'constraints:'
            	    {
            	    lv_constraintsL_18_0=(Token)match(input,51,FOLLOW_35); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_constraintsL_18_0, grammarAccess.getAgentTraceExpressionAccess().getConstraintsLConstraintsKeyword_5_6_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getAgentTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "constraintsL", lv_constraintsL_18_0, "constraints:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1976:5: ( (lv_constraints_19_0= ruleConstraint ) )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==35||(LA31_0>=66 && LA31_0<=68)) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalTExp.g:1977:6: (lv_constraints_19_0= ruleConstraint )
            	    	    {
            	    	    // InternalTExp.g:1977:6: (lv_constraints_19_0= ruleConstraint )
            	    	    // InternalTExp.g:1978:7: lv_constraints_19_0= ruleConstraint
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getAgentTraceExpressionAccess().getConstraintsConstraintParserRuleCall_5_6_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_35);
            	    	    lv_constraints_19_0=ruleConstraint();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getAgentTraceExpressionRule());
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
            	    // InternalTExp.g:1997:4: ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) )
            	    {
            	    // InternalTExp.g:1997:4: ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) )
            	    // InternalTExp.g:1998:5: ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) )
            	    {
            	    // InternalTExp.g:1998:5: ( (lv_guiL_20_0= 'gui:' ) )
            	    // InternalTExp.g:1999:6: (lv_guiL_20_0= 'gui:' )
            	    {
            	    // InternalTExp.g:1999:6: (lv_guiL_20_0= 'gui:' )
            	    // InternalTExp.g:2000:7: lv_guiL_20_0= 'gui:'
            	    {
            	    lv_guiL_20_0=(Token)match(input,52,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_guiL_20_0, grammarAccess.getAgentTraceExpressionAccess().getGuiLGuiKeyword_5_7_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getAgentTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "guiL", lv_guiL_20_0, "gui:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:2012:5: ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) )
            	    // InternalTExp.g:2013:6: ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) )
            	    {
            	    // InternalTExp.g:2013:6: ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) )
            	    // InternalTExp.g:2014:7: (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' )
            	    {
            	    // InternalTExp.g:2014:7: (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' )
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==48) ) {
            	        alt32=1;
            	    }
            	    else if ( (LA32_0==49) ) {
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
            	            // InternalTExp.g:2015:8: lv_gui_21_1= 'true'
            	            {
            	            lv_gui_21_1=(Token)match(input,48,FOLLOW_33); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_gui_21_1, grammarAccess.getAgentTraceExpressionAccess().getGuiTrueKeyword_5_7_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getAgentTraceExpressionRule());
            	              								}
            	              								addWithLastConsumed(current, "gui", lv_gui_21_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTExp.g:2026:8: lv_gui_21_2= 'false'
            	            {
            	            lv_gui_21_2=(Token)match(input,49,FOLLOW_33); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_gui_21_2, grammarAccess.getAgentTraceExpressionAccess().getGuiFalseKeyword_5_7_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getAgentTraceExpressionRule());
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
            	    // InternalTExp.g:2041:4: ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) )
            	    {
            	    // InternalTExp.g:2041:4: ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) )
            	    // InternalTExp.g:2042:5: ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) )
            	    {
            	    // InternalTExp.g:2042:5: ( (lv_minimalL_22_0= 'minimal:' ) )
            	    // InternalTExp.g:2043:6: (lv_minimalL_22_0= 'minimal:' )
            	    {
            	    // InternalTExp.g:2043:6: (lv_minimalL_22_0= 'minimal:' )
            	    // InternalTExp.g:2044:7: lv_minimalL_22_0= 'minimal:'
            	    {
            	    lv_minimalL_22_0=(Token)match(input,53,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_minimalL_22_0, grammarAccess.getAgentTraceExpressionAccess().getMinimalLMinimalKeyword_5_8_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getAgentTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "minimalL", lv_minimalL_22_0, "minimal:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:2056:5: ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) )
            	    // InternalTExp.g:2057:6: ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) )
            	    {
            	    // InternalTExp.g:2057:6: ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) )
            	    // InternalTExp.g:2058:7: (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' )
            	    {
            	    // InternalTExp.g:2058:7: (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==48) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==49) ) {
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
            	            // InternalTExp.g:2059:8: lv_minimal_23_1= 'true'
            	            {
            	            lv_minimal_23_1=(Token)match(input,48,FOLLOW_33); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_minimal_23_1, grammarAccess.getAgentTraceExpressionAccess().getMinimalTrueKeyword_5_8_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getAgentTraceExpressionRule());
            	              								}
            	              								addWithLastConsumed(current, "minimal", lv_minimal_23_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTExp.g:2070:8: lv_minimal_23_2= 'false'
            	            {
            	            lv_minimal_23_2=(Token)match(input,49,FOLLOW_33); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_minimal_23_2, grammarAccess.getAgentTraceExpressionAccess().getMinimalFalseKeyword_5_8_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getAgentTraceExpressionRule());
            	              								}
            	              								addWithLastConsumed(current, "minimal", lv_minimal_23_2, null);
            	              							
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalTExp.g:2085:4: ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) )
            	    {
            	    // InternalTExp.g:2085:4: ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) )
            	    // InternalTExp.g:2086:5: ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) )
            	    {
            	    // InternalTExp.g:2086:5: ( (lv_thresholdL_24_0= 'threshold:' ) )
            	    // InternalTExp.g:2087:6: (lv_thresholdL_24_0= 'threshold:' )
            	    {
            	    // InternalTExp.g:2087:6: (lv_thresholdL_24_0= 'threshold:' )
            	    // InternalTExp.g:2088:7: lv_thresholdL_24_0= 'threshold:'
            	    {
            	    lv_thresholdL_24_0=(Token)match(input,54,FOLLOW_36); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_thresholdL_24_0, grammarAccess.getAgentTraceExpressionAccess().getThresholdLThresholdKeyword_5_9_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getAgentTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "thresholdL", lv_thresholdL_24_0, "threshold:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:2100:5: ( (lv_threshold_25_0= ruleNUMBER ) )
            	    // InternalTExp.g:2101:6: (lv_threshold_25_0= ruleNUMBER )
            	    {
            	    // InternalTExp.g:2101:6: (lv_threshold_25_0= ruleNUMBER )
            	    // InternalTExp.g:2102:7: lv_threshold_25_0= ruleNUMBER
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAgentTraceExpressionAccess().getThresholdNUMBERParserRuleCall_5_9_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_threshold_25_0=ruleNUMBER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getAgentTraceExpressionRule());
            	      							}
            	      							add(
            	      								current,
            	      								"threshold",
            	      								lv_threshold_25_0,
            	      								"it.unige.dibris.trace_expression_language.TExp.NUMBER");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalTExp.g:2121:4: ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) )+ )
            	    {
            	    // InternalTExp.g:2121:4: ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) )+ )
            	    // InternalTExp.g:2122:5: ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) )+
            	    {
            	    // InternalTExp.g:2122:5: ( (lv_channelsL_26_0= 'channels:' ) )
            	    // InternalTExp.g:2123:6: (lv_channelsL_26_0= 'channels:' )
            	    {
            	    // InternalTExp.g:2123:6: (lv_channelsL_26_0= 'channels:' )
            	    // InternalTExp.g:2124:7: lv_channelsL_26_0= 'channels:'
            	    {
            	    lv_channelsL_26_0=(Token)match(input,55,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_channelsL_26_0, grammarAccess.getAgentTraceExpressionAccess().getChannelsLChannelsKeyword_5_10_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getAgentTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "channelsL", lv_channelsL_26_0, "channels:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:2136:5: ( (lv_channels_27_0= ruleChannel ) )+
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
            	    	    // InternalTExp.g:2137:6: (lv_channels_27_0= ruleChannel )
            	    	    {
            	    	    // InternalTExp.g:2137:6: (lv_channels_27_0= ruleChannel )
            	    	    // InternalTExp.g:2138:7: lv_channels_27_0= ruleChannel
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getAgentTraceExpressionAccess().getChannelsChannelParserRuleCall_5_10_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_29);
            	    	    lv_channels_27_0=ruleChannel();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getAgentTraceExpressionRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"channels",
            	    	      								lv_channels_27_0,
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

            otherlv_28=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_28, grammarAccess.getAgentTraceExpressionAccess().getRightCurlyBracketKeyword_6());
              		
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
    // $ANTLR end "ruleAgentTraceExpression"


    // $ANTLR start "entryRuleEventType"
    // InternalTExp.g:2165:1: entryRuleEventType returns [EObject current=null] : iv_ruleEventType= ruleEventType EOF ;
    public final EObject entryRuleEventType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventType = null;


        try {
            // InternalTExp.g:2165:50: (iv_ruleEventType= ruleEventType EOF )
            // InternalTExp.g:2166:2: iv_ruleEventType= ruleEventType EOF
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
    // InternalTExp.g:2172:1: ruleEventType returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleGroundTerm ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleGroundTerm ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_events_8_0= ruleEvent ) )* otherlv_9= '}' ) ;
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
            // InternalTExp.g:2178:2: ( ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleGroundTerm ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleGroundTerm ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_events_8_0= ruleEvent ) )* otherlv_9= '}' ) )
            // InternalTExp.g:2179:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleGroundTerm ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleGroundTerm ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_events_8_0= ruleEvent ) )* otherlv_9= '}' )
            {
            // InternalTExp.g:2179:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleGroundTerm ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleGroundTerm ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_events_8_0= ruleEvent ) )* otherlv_9= '}' )
            // InternalTExp.g:2180:3: ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleGroundTerm ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleGroundTerm ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_events_8_0= ruleEvent ) )* otherlv_9= '}'
            {
            // InternalTExp.g:2180:3: ( (lv_name_0_0= ruleID ) )
            // InternalTExp.g:2181:4: (lv_name_0_0= ruleID )
            {
            // InternalTExp.g:2181:4: (lv_name_0_0= ruleID )
            // InternalTExp.g:2182:5: lv_name_0_0= ruleID
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

            // InternalTExp.g:2199:3: (otherlv_1= '(' ( (lv_expr_2_0= ruleGroundTerm ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleGroundTerm ) ) )* otherlv_5= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalTExp.g:2200:4: otherlv_1= '(' ( (lv_expr_2_0= ruleGroundTerm ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleGroundTerm ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEventTypeAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:2204:4: ( (lv_expr_2_0= ruleGroundTerm ) )
                    // InternalTExp.g:2205:5: (lv_expr_2_0= ruleGroundTerm )
                    {
                    // InternalTExp.g:2205:5: (lv_expr_2_0= ruleGroundTerm )
                    // InternalTExp.g:2206:6: lv_expr_2_0= ruleGroundTerm
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

                    // InternalTExp.g:2223:4: (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleGroundTerm ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_OP1000XFY) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalTExp.g:2224:5: this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleGroundTerm ) )
                    	    {
                    	    this_OP1000XFY_3=(Token)match(input,RULE_OP1000XFY,FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OP1000XFY_3, grammarAccess.getEventTypeAccess().getOP1000XFYTerminalRuleCall_1_2_0());
                    	      				
                    	    }
                    	    // InternalTExp.g:2228:5: ( (lv_exprs_4_0= ruleGroundTerm ) )
                    	    // InternalTExp.g:2229:6: (lv_exprs_4_0= ruleGroundTerm )
                    	    {
                    	    // InternalTExp.g:2229:6: (lv_exprs_4_0= ruleGroundTerm )
                    	    // InternalTExp.g:2230:7: lv_exprs_4_0= ruleGroundTerm
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

                    otherlv_5=(Token)match(input,34,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getEventTypeAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            this_OP600XFY_6=(Token)match(input,RULE_OP600XFY,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OP600XFY_6, grammarAccess.getEventTypeAccess().getOP600XFYTerminalRuleCall_2());
              		
            }
            otherlv_7=(Token)match(input,39,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getEventTypeAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalTExp.g:2261:3: ( (lv_events_8_0= ruleEvent ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ATOM||LA38_0==56) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalTExp.g:2262:4: (lv_events_8_0= ruleEvent )
            	    {
            	    // InternalTExp.g:2262:4: (lv_events_8_0= ruleEvent )
            	    // InternalTExp.g:2263:5: lv_events_8_0= ruleEvent
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
    // InternalTExp.g:2288:1: entryRuleMsgEventType returns [EObject current=null] : iv_ruleMsgEventType= ruleMsgEventType EOF ;
    public final EObject entryRuleMsgEventType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMsgEventType = null;


        try {
            // InternalTExp.g:2288:53: (iv_ruleMsgEventType= ruleMsgEventType EOF )
            // InternalTExp.g:2289:2: iv_ruleMsgEventType= ruleMsgEventType EOF
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
    // InternalTExp.g:2295:1: ruleMsgEventType returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_msgs_8_0= ruleMsg ) )* otherlv_9= '}' (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )? ) ;
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
            // InternalTExp.g:2301:2: ( ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_msgs_8_0= ruleMsg ) )* otherlv_9= '}' (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )? ) )
            // InternalTExp.g:2302:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_msgs_8_0= ruleMsg ) )* otherlv_9= '}' (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )? )
            {
            // InternalTExp.g:2302:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_msgs_8_0= ruleMsg ) )* otherlv_9= '}' (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )? )
            // InternalTExp.g:2303:3: ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_msgs_8_0= ruleMsg ) )* otherlv_9= '}' (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )?
            {
            // InternalTExp.g:2303:3: ( (lv_name_0_0= ruleID ) )
            // InternalTExp.g:2304:4: (lv_name_0_0= ruleID )
            {
            // InternalTExp.g:2304:4: (lv_name_0_0= ruleID )
            // InternalTExp.g:2305:5: lv_name_0_0= ruleID
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

            // InternalTExp.g:2322:3: (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==33) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalTExp.g:2323:4: otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getMsgEventTypeAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:2327:4: ( (lv_expr_2_0= ruleExpression0 ) )
                    // InternalTExp.g:2328:5: (lv_expr_2_0= ruleExpression0 )
                    {
                    // InternalTExp.g:2328:5: (lv_expr_2_0= ruleExpression0 )
                    // InternalTExp.g:2329:6: lv_expr_2_0= ruleExpression0
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

                    // InternalTExp.g:2346:4: (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_OP1000XFY) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalTExp.g:2347:5: this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) )
                    	    {
                    	    this_OP1000XFY_3=(Token)match(input,RULE_OP1000XFY,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OP1000XFY_3, grammarAccess.getMsgEventTypeAccess().getOP1000XFYTerminalRuleCall_1_2_0());
                    	      				
                    	    }
                    	    // InternalTExp.g:2351:5: ( (lv_exprs_4_0= ruleExpression0 ) )
                    	    // InternalTExp.g:2352:6: (lv_exprs_4_0= ruleExpression0 )
                    	    {
                    	    // InternalTExp.g:2352:6: (lv_exprs_4_0= ruleExpression0 )
                    	    // InternalTExp.g:2353:7: lv_exprs_4_0= ruleExpression0
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

                    otherlv_5=(Token)match(input,34,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getMsgEventTypeAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            this_OP600XFY_6=(Token)match(input,RULE_OP600XFY,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OP600XFY_6, grammarAccess.getMsgEventTypeAccess().getOP600XFYTerminalRuleCall_2());
              		
            }
            otherlv_7=(Token)match(input,39,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMsgEventTypeAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalTExp.g:2384:3: ( (lv_msgs_8_0= ruleMsg ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ATOM||LA41_0==35) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalTExp.g:2385:4: (lv_msgs_8_0= ruleMsg )
            	    {
            	    // InternalTExp.g:2385:4: (lv_msgs_8_0= ruleMsg )
            	    // InternalTExp.g:2386:5: lv_msgs_8_0= ruleMsg
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
            // InternalTExp.g:2407:3: (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==35) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalTExp.g:2408:4: otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']'
                    {
                    otherlv_10=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getMsgEventTypeAccess().getLeftSquareBracketKeyword_6_0());
                      			
                    }
                    // InternalTExp.g:2412:4: ( ( ruleID ) )
                    // InternalTExp.g:2413:5: ( ruleID )
                    {
                    // InternalTExp.g:2413:5: ( ruleID )
                    // InternalTExp.g:2414:6: ruleID
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
                    pushFollow(FOLLOW_22);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_12=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
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
    // InternalTExp.g:2440:1: entryRuleGroundTerm returns [EObject current=null] : iv_ruleGroundTerm= ruleGroundTerm EOF ;
    public final EObject entryRuleGroundTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroundTerm = null;


        try {
            // InternalTExp.g:2440:51: (iv_ruleGroundTerm= ruleGroundTerm EOF )
            // InternalTExp.g:2441:2: iv_ruleGroundTerm= ruleGroundTerm EOF
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
    // InternalTExp.g:2447:1: ruleGroundTerm returns [EObject current=null] : ( ( (lv_variable_0_0= RULE_VARIABLE ) ) | ( ( (lv_symbol_1_0= ruleID ) ) otherlv_2= '(' ( (lv_arg_3_0= ruleGroundTerm ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_args_5_0= ruleGroundTerm ) ) )* otherlv_6= ')' ) ) ;
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
            // InternalTExp.g:2453:2: ( ( ( (lv_variable_0_0= RULE_VARIABLE ) ) | ( ( (lv_symbol_1_0= ruleID ) ) otherlv_2= '(' ( (lv_arg_3_0= ruleGroundTerm ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_args_5_0= ruleGroundTerm ) ) )* otherlv_6= ')' ) ) )
            // InternalTExp.g:2454:2: ( ( (lv_variable_0_0= RULE_VARIABLE ) ) | ( ( (lv_symbol_1_0= ruleID ) ) otherlv_2= '(' ( (lv_arg_3_0= ruleGroundTerm ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_args_5_0= ruleGroundTerm ) ) )* otherlv_6= ')' ) )
            {
            // InternalTExp.g:2454:2: ( ( (lv_variable_0_0= RULE_VARIABLE ) ) | ( ( (lv_symbol_1_0= ruleID ) ) otherlv_2= '(' ( (lv_arg_3_0= ruleGroundTerm ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_args_5_0= ruleGroundTerm ) ) )* otherlv_6= ')' ) )
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
                    // InternalTExp.g:2455:3: ( (lv_variable_0_0= RULE_VARIABLE ) )
                    {
                    // InternalTExp.g:2455:3: ( (lv_variable_0_0= RULE_VARIABLE ) )
                    // InternalTExp.g:2456:4: (lv_variable_0_0= RULE_VARIABLE )
                    {
                    // InternalTExp.g:2456:4: (lv_variable_0_0= RULE_VARIABLE )
                    // InternalTExp.g:2457:5: lv_variable_0_0= RULE_VARIABLE
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
                    // InternalTExp.g:2474:3: ( ( (lv_symbol_1_0= ruleID ) ) otherlv_2= '(' ( (lv_arg_3_0= ruleGroundTerm ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_args_5_0= ruleGroundTerm ) ) )* otherlv_6= ')' )
                    {
                    // InternalTExp.g:2474:3: ( ( (lv_symbol_1_0= ruleID ) ) otherlv_2= '(' ( (lv_arg_3_0= ruleGroundTerm ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_args_5_0= ruleGroundTerm ) ) )* otherlv_6= ')' )
                    // InternalTExp.g:2475:4: ( (lv_symbol_1_0= ruleID ) ) otherlv_2= '(' ( (lv_arg_3_0= ruleGroundTerm ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_args_5_0= ruleGroundTerm ) ) )* otherlv_6= ')'
                    {
                    // InternalTExp.g:2475:4: ( (lv_symbol_1_0= ruleID ) )
                    // InternalTExp.g:2476:5: (lv_symbol_1_0= ruleID )
                    {
                    // InternalTExp.g:2476:5: (lv_symbol_1_0= ruleID )
                    // InternalTExp.g:2477:6: lv_symbol_1_0= ruleID
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

                    otherlv_2=(Token)match(input,33,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getGroundTermAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalTExp.g:2498:4: ( (lv_arg_3_0= ruleGroundTerm ) )
                    // InternalTExp.g:2499:5: (lv_arg_3_0= ruleGroundTerm )
                    {
                    // InternalTExp.g:2499:5: (lv_arg_3_0= ruleGroundTerm )
                    // InternalTExp.g:2500:6: lv_arg_3_0= ruleGroundTerm
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

                    // InternalTExp.g:2517:4: (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_args_5_0= ruleGroundTerm ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==RULE_OP1000XFY) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalTExp.g:2518:5: this_OP1000XFY_4= RULE_OP1000XFY ( (lv_args_5_0= ruleGroundTerm ) )
                    	    {
                    	    this_OP1000XFY_4=(Token)match(input,RULE_OP1000XFY,FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OP1000XFY_4, grammarAccess.getGroundTermAccess().getOP1000XFYTerminalRuleCall_1_3_0());
                    	      				
                    	    }
                    	    // InternalTExp.g:2522:5: ( (lv_args_5_0= ruleGroundTerm ) )
                    	    // InternalTExp.g:2523:6: (lv_args_5_0= ruleGroundTerm )
                    	    {
                    	    // InternalTExp.g:2523:6: (lv_args_5_0= ruleGroundTerm )
                    	    // InternalTExp.g:2524:7: lv_args_5_0= ruleGroundTerm
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

                    otherlv_6=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // InternalTExp.g:2551:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalTExp.g:2551:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalTExp.g:2552:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalTExp.g:2558:1: ruleEvent returns [EObject current=null] : ( ( ( () ( (lv_name_1_0= ruleID ) ) (otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ) | ( () otherlv_8= 'derived' ( ( ruleID ) ) (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')' )? ) ) (otherlv_15= '[' ( (lv_constraints_16_0= ruleExpressionInfinity ) ) otherlv_17= ']' )? ) ;
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
            // InternalTExp.g:2564:2: ( ( ( ( () ( (lv_name_1_0= ruleID ) ) (otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ) | ( () otherlv_8= 'derived' ( ( ruleID ) ) (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')' )? ) ) (otherlv_15= '[' ( (lv_constraints_16_0= ruleExpressionInfinity ) ) otherlv_17= ']' )? ) )
            // InternalTExp.g:2565:2: ( ( ( () ( (lv_name_1_0= ruleID ) ) (otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ) | ( () otherlv_8= 'derived' ( ( ruleID ) ) (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')' )? ) ) (otherlv_15= '[' ( (lv_constraints_16_0= ruleExpressionInfinity ) ) otherlv_17= ']' )? )
            {
            // InternalTExp.g:2565:2: ( ( ( () ( (lv_name_1_0= ruleID ) ) (otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ) | ( () otherlv_8= 'derived' ( ( ruleID ) ) (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')' )? ) ) (otherlv_15= '[' ( (lv_constraints_16_0= ruleExpressionInfinity ) ) otherlv_17= ']' )? )
            // InternalTExp.g:2566:3: ( ( () ( (lv_name_1_0= ruleID ) ) (otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ) | ( () otherlv_8= 'derived' ( ( ruleID ) ) (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')' )? ) ) (otherlv_15= '[' ( (lv_constraints_16_0= ruleExpressionInfinity ) ) otherlv_17= ']' )?
            {
            // InternalTExp.g:2566:3: ( ( () ( (lv_name_1_0= ruleID ) ) (otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ) | ( () otherlv_8= 'derived' ( ( ruleID ) ) (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')' )? ) )
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
                    // InternalTExp.g:2567:4: ( () ( (lv_name_1_0= ruleID ) ) (otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? )
                    {
                    // InternalTExp.g:2567:4: ( () ( (lv_name_1_0= ruleID ) ) (otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? )
                    // InternalTExp.g:2568:5: () ( (lv_name_1_0= ruleID ) ) (otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )?
                    {
                    // InternalTExp.g:2568:5: ()
                    // InternalTExp.g:2569:6: 
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

                    // InternalTExp.g:2578:5: ( (lv_name_1_0= ruleID ) )
                    // InternalTExp.g:2579:6: (lv_name_1_0= ruleID )
                    {
                    // InternalTExp.g:2579:6: (lv_name_1_0= ruleID )
                    // InternalTExp.g:2580:7: lv_name_1_0= ruleID
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

                    // InternalTExp.g:2597:5: (otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==33) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalTExp.g:2598:6: otherlv_2= '(' ( (lv_expr_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')'
                            {
                            otherlv_2=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getEventAccess().getLeftParenthesisKeyword_0_0_2_0());
                              					
                            }
                            // InternalTExp.g:2602:6: ( (lv_expr_3_0= ruleExpression0 ) )
                            // InternalTExp.g:2603:7: (lv_expr_3_0= ruleExpression0 )
                            {
                            // InternalTExp.g:2603:7: (lv_expr_3_0= ruleExpression0 )
                            // InternalTExp.g:2604:8: lv_expr_3_0= ruleExpression0
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

                            // InternalTExp.g:2621:6: (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==RULE_OP1000XFY) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // InternalTExp.g:2622:7: this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) )
                            	    {
                            	    this_OP1000XFY_4=(Token)match(input,RULE_OP1000XFY,FOLLOW_8); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(this_OP1000XFY_4, grammarAccess.getEventAccess().getOP1000XFYTerminalRuleCall_0_0_2_2_0());
                            	      						
                            	    }
                            	    // InternalTExp.g:2626:7: ( (lv_exprs_5_0= ruleExpression0 ) )
                            	    // InternalTExp.g:2627:8: (lv_exprs_5_0= ruleExpression0 )
                            	    {
                            	    // InternalTExp.g:2627:8: (lv_exprs_5_0= ruleExpression0 )
                            	    // InternalTExp.g:2628:9: lv_exprs_5_0= ruleExpression0
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

                            otherlv_6=(Token)match(input,34,FOLLOW_43); if (state.failed) return current;
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
                    // InternalTExp.g:2653:4: ( () otherlv_8= 'derived' ( ( ruleID ) ) (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')' )? )
                    {
                    // InternalTExp.g:2653:4: ( () otherlv_8= 'derived' ( ( ruleID ) ) (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')' )? )
                    // InternalTExp.g:2654:5: () otherlv_8= 'derived' ( ( ruleID ) ) (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')' )?
                    {
                    // InternalTExp.g:2654:5: ()
                    // InternalTExp.g:2655:6: 
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

                    otherlv_8=(Token)match(input,56,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getEventAccess().getDerivedKeyword_0_1_1());
                      				
                    }
                    // InternalTExp.g:2668:5: ( ( ruleID ) )
                    // InternalTExp.g:2669:6: ( ruleID )
                    {
                    // InternalTExp.g:2669:6: ( ruleID )
                    // InternalTExp.g:2670:7: ruleID
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

                    // InternalTExp.g:2687:5: (otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==33) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalTExp.g:2688:6: otherlv_10= '(' ( (lv_expr_11_0= ruleExpression0 ) ) (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )* otherlv_14= ')'
                            {
                            otherlv_10=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_10, grammarAccess.getEventAccess().getLeftParenthesisKeyword_0_1_3_0());
                              					
                            }
                            // InternalTExp.g:2692:6: ( (lv_expr_11_0= ruleExpression0 ) )
                            // InternalTExp.g:2693:7: (lv_expr_11_0= ruleExpression0 )
                            {
                            // InternalTExp.g:2693:7: (lv_expr_11_0= ruleExpression0 )
                            // InternalTExp.g:2694:8: lv_expr_11_0= ruleExpression0
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

                            // InternalTExp.g:2711:6: (this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) ) )*
                            loop47:
                            do {
                                int alt47=2;
                                int LA47_0 = input.LA(1);

                                if ( (LA47_0==RULE_OP1000XFY) ) {
                                    alt47=1;
                                }


                                switch (alt47) {
                            	case 1 :
                            	    // InternalTExp.g:2712:7: this_OP1000XFY_12= RULE_OP1000XFY ( (lv_exprs_13_0= ruleExpression0 ) )
                            	    {
                            	    this_OP1000XFY_12=(Token)match(input,RULE_OP1000XFY,FOLLOW_8); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(this_OP1000XFY_12, grammarAccess.getEventAccess().getOP1000XFYTerminalRuleCall_0_1_3_2_0());
                            	      						
                            	    }
                            	    // InternalTExp.g:2716:7: ( (lv_exprs_13_0= ruleExpression0 ) )
                            	    // InternalTExp.g:2717:8: (lv_exprs_13_0= ruleExpression0 )
                            	    {
                            	    // InternalTExp.g:2717:8: (lv_exprs_13_0= ruleExpression0 )
                            	    // InternalTExp.g:2718:9: lv_exprs_13_0= ruleExpression0
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

                            otherlv_14=(Token)match(input,34,FOLLOW_43); if (state.failed) return current;
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

            // InternalTExp.g:2743:3: (otherlv_15= '[' ( (lv_constraints_16_0= ruleExpressionInfinity ) ) otherlv_17= ']' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==35) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalTExp.g:2744:4: otherlv_15= '[' ( (lv_constraints_16_0= ruleExpressionInfinity ) ) otherlv_17= ']'
                    {
                    otherlv_15=(Token)match(input,35,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getEventAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:2748:4: ( (lv_constraints_16_0= ruleExpressionInfinity ) )
                    // InternalTExp.g:2749:5: (lv_constraints_16_0= ruleExpressionInfinity )
                    {
                    // InternalTExp.g:2749:5: (lv_constraints_16_0= ruleExpressionInfinity )
                    // InternalTExp.g:2750:6: lv_constraints_16_0= ruleExpressionInfinity
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEventAccess().getConstraintsExpressionInfinityParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
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

                    otherlv_17=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
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
    // InternalTExp.g:2776:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalTExp.g:2776:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalTExp.g:2777:2: iv_ruleTerm= ruleTerm EOF
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
    // InternalTExp.g:2783:1: ruleTerm returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleShuffleExpr ) ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2789:2: ( ( ( (lv_name_0_0= ruleID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleShuffleExpr ) ) ) )
            // InternalTExp.g:2790:2: ( ( (lv_name_0_0= ruleID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleShuffleExpr ) ) )
            {
            // InternalTExp.g:2790:2: ( ( (lv_name_0_0= ruleID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleShuffleExpr ) ) )
            // InternalTExp.g:2791:3: ( (lv_name_0_0= ruleID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleShuffleExpr ) )
            {
            // InternalTExp.g:2791:3: ( (lv_name_0_0= ruleID ) )
            // InternalTExp.g:2792:4: (lv_name_0_0= ruleID )
            {
            // InternalTExp.g:2792:4: (lv_name_0_0= ruleID )
            // InternalTExp.g:2793:5: lv_name_0_0= ruleID
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
            // InternalTExp.g:2814:3: ( (lv_expr_2_0= ruleShuffleExpr ) )
            // InternalTExp.g:2815:4: (lv_expr_2_0= ruleShuffleExpr )
            {
            // InternalTExp.g:2815:4: (lv_expr_2_0= ruleShuffleExpr )
            // InternalTExp.g:2816:5: lv_expr_2_0= ruleShuffleExpr
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
    // InternalTExp.g:2837:1: entryRuleShuffleExpr returns [EObject current=null] : iv_ruleShuffleExpr= ruleShuffleExpr EOF ;
    public final EObject entryRuleShuffleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShuffleExpr = null;


        try {
            // InternalTExp.g:2837:52: (iv_ruleShuffleExpr= ruleShuffleExpr EOF )
            // InternalTExp.g:2838:2: iv_ruleShuffleExpr= ruleShuffleExpr EOF
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
    // InternalTExp.g:2844:1: ruleShuffleExpr returns [EObject current=null] : (this_UnionExpr_0= ruleUnionExpr ( () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) ) )* ) ;
    public final EObject ruleShuffleExpr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_UnionExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2850:2: ( (this_UnionExpr_0= ruleUnionExpr ( () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) ) )* ) )
            // InternalTExp.g:2851:2: (this_UnionExpr_0= ruleUnionExpr ( () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) ) )* )
            {
            // InternalTExp.g:2851:2: (this_UnionExpr_0= ruleUnionExpr ( () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) ) )* )
            // InternalTExp.g:2852:3: this_UnionExpr_0= ruleUnionExpr ( () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) ) )*
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
            // InternalTExp.g:2863:3: ( () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==36) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalTExp.g:2864:4: () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) )
            	    {
            	    // InternalTExp.g:2864:4: ()
            	    // InternalTExp.g:2865:5: 
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

            	    // InternalTExp.g:2874:4: ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) )
            	    // InternalTExp.g:2875:5: ( ( '|' ) )=> (lv_operator_2_0= '|' )
            	    {
            	    // InternalTExp.g:2879:5: (lv_operator_2_0= '|' )
            	    // InternalTExp.g:2880:6: lv_operator_2_0= '|'
            	    {
            	    lv_operator_2_0=(Token)match(input,36,FOLLOW_47); if (state.failed) return current;
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

            	    // InternalTExp.g:2892:4: ( (lv_right_3_0= ruleUnionExpr ) )
            	    // InternalTExp.g:2893:5: (lv_right_3_0= ruleUnionExpr )
            	    {
            	    // InternalTExp.g:2893:5: (lv_right_3_0= ruleUnionExpr )
            	    // InternalTExp.g:2894:6: lv_right_3_0= ruleUnionExpr
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
    // InternalTExp.g:2916:1: entryRuleUnionExpr returns [EObject current=null] : iv_ruleUnionExpr= ruleUnionExpr EOF ;
    public final EObject entryRuleUnionExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionExpr = null;


        try {
            // InternalTExp.g:2916:50: (iv_ruleUnionExpr= ruleUnionExpr EOF )
            // InternalTExp.g:2917:2: iv_ruleUnionExpr= ruleUnionExpr EOF
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
    // InternalTExp.g:2923:1: ruleUnionExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleUnionExpr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2929:2: ( (this_AndExpr_0= ruleAndExpr ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* ) )
            // InternalTExp.g:2930:2: (this_AndExpr_0= ruleAndExpr ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* )
            {
            // InternalTExp.g:2930:2: (this_AndExpr_0= ruleAndExpr ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* )
            // InternalTExp.g:2931:3: this_AndExpr_0= ruleAndExpr ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )*
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
            // InternalTExp.g:2942:3: ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==58) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalTExp.g:2943:4: () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) )
            	    {
            	    // InternalTExp.g:2943:4: ()
            	    // InternalTExp.g:2944:5: 
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

            	    // InternalTExp.g:2953:4: ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) )
            	    // InternalTExp.g:2954:5: ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' )
            	    {
            	    // InternalTExp.g:2958:5: (lv_operator_2_0= '\\\\/' )
            	    // InternalTExp.g:2959:6: lv_operator_2_0= '\\\\/'
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

            	    // InternalTExp.g:2971:4: ( (lv_right_3_0= ruleAndExpr ) )
            	    // InternalTExp.g:2972:5: (lv_right_3_0= ruleAndExpr )
            	    {
            	    // InternalTExp.g:2972:5: (lv_right_3_0= ruleAndExpr )
            	    // InternalTExp.g:2973:6: lv_right_3_0= ruleAndExpr
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
    // InternalTExp.g:2995:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // InternalTExp.g:2995:48: (iv_ruleAndExpr= ruleAndExpr EOF )
            // InternalTExp.g:2996:2: iv_ruleAndExpr= ruleAndExpr EOF
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
    // InternalTExp.g:3002:1: ruleAndExpr returns [EObject current=null] : (this_CatExpr_0= ruleCatExpr ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_CatExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:3008:2: ( (this_CatExpr_0= ruleCatExpr ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )* ) )
            // InternalTExp.g:3009:2: (this_CatExpr_0= ruleCatExpr ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )* )
            {
            // InternalTExp.g:3009:2: (this_CatExpr_0= ruleCatExpr ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )* )
            // InternalTExp.g:3010:3: this_CatExpr_0= ruleCatExpr ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )*
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
            // InternalTExp.g:3021:3: ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==59) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalTExp.g:3022:4: () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) )
            	    {
            	    // InternalTExp.g:3022:4: ()
            	    // InternalTExp.g:3023:5: 
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

            	    // InternalTExp.g:3032:4: ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) )
            	    // InternalTExp.g:3033:5: ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' )
            	    {
            	    // InternalTExp.g:3037:5: (lv_operator_2_0= '/\\\\' )
            	    // InternalTExp.g:3038:6: lv_operator_2_0= '/\\\\'
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

            	    // InternalTExp.g:3050:4: ( (lv_right_3_0= ruleCatExpr ) )
            	    // InternalTExp.g:3051:5: (lv_right_3_0= ruleCatExpr )
            	    {
            	    // InternalTExp.g:3051:5: (lv_right_3_0= ruleCatExpr )
            	    // InternalTExp.g:3052:6: lv_right_3_0= ruleCatExpr
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
    // InternalTExp.g:3074:1: entryRuleCatExpr returns [EObject current=null] : iv_ruleCatExpr= ruleCatExpr EOF ;
    public final EObject entryRuleCatExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatExpr = null;


        try {
            // InternalTExp.g:3074:48: (iv_ruleCatExpr= ruleCatExpr EOF )
            // InternalTExp.g:3075:2: iv_ruleCatExpr= ruleCatExpr EOF
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
    // InternalTExp.g:3081:1: ruleCatExpr returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleCatExpr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:3087:2: ( (this_Primary_0= rulePrimary ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalTExp.g:3088:2: (this_Primary_0= rulePrimary ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalTExp.g:3088:2: (this_Primary_0= rulePrimary ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalTExp.g:3089:3: this_Primary_0= rulePrimary ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
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
            // InternalTExp.g:3100:3: ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==60) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalTExp.g:3101:4: () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalTExp.g:3101:4: ()
            	    // InternalTExp.g:3102:5: 
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

            	    // InternalTExp.g:3111:4: ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) )
            	    // InternalTExp.g:3112:5: ( ( '*' ) )=> (lv_operator_2_0= '*' )
            	    {
            	    // InternalTExp.g:3116:5: (lv_operator_2_0= '*' )
            	    // InternalTExp.g:3117:6: lv_operator_2_0= '*'
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

            	    // InternalTExp.g:3129:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalTExp.g:3130:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalTExp.g:3130:5: (lv_right_3_0= rulePrimary )
            	    // InternalTExp.g:3131:6: lv_right_3_0= rulePrimary
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
    // InternalTExp.g:3153:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalTExp.g:3153:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalTExp.g:3154:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalTExp.g:3160:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) ) | ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) ) | ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) ) | ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject lv_seqExpr_1_0 = null;

        EObject lv_filterExpr_3_0 = null;

        EObject lv_varExpr_5_0 = null;

        EObject lv_terminalExpr_7_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:3166:2: ( ( ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) ) | ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) ) | ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) ) | ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) ) ) )
            // InternalTExp.g:3167:2: ( ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) ) | ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) ) | ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) ) | ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) ) )
            {
            // InternalTExp.g:3167:2: ( ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) ) | ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) ) | ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) ) | ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) ) )
            int alt55=4;
            switch ( input.LA(1) ) {
            case RULE_ATOM:
                {
                int LA55_1 = input.LA(2);

                if ( (synpred94_InternalTExp()) ) {
                    alt55=1;
                }
                else if ( (synpred95_InternalTExp()) ) {
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
            case 33:
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
                    // InternalTExp.g:3168:3: ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) )
                    {
                    // InternalTExp.g:3168:3: ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) )
                    // InternalTExp.g:3169:4: () ( (lv_seqExpr_1_0= ruleSeqExpr ) )
                    {
                    // InternalTExp.g:3169:4: ()
                    // InternalTExp.g:3170:5: 
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

                    // InternalTExp.g:3179:4: ( (lv_seqExpr_1_0= ruleSeqExpr ) )
                    // InternalTExp.g:3180:5: (lv_seqExpr_1_0= ruleSeqExpr )
                    {
                    // InternalTExp.g:3180:5: (lv_seqExpr_1_0= ruleSeqExpr )
                    // InternalTExp.g:3181:6: lv_seqExpr_1_0= ruleSeqExpr
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
                    // InternalTExp.g:3200:3: ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) )
                    {
                    // InternalTExp.g:3200:3: ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) )
                    // InternalTExp.g:3201:4: () ( (lv_filterExpr_3_0= ruleFilterExpr ) )
                    {
                    // InternalTExp.g:3201:4: ()
                    // InternalTExp.g:3202:5: 
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

                    // InternalTExp.g:3211:4: ( (lv_filterExpr_3_0= ruleFilterExpr ) )
                    // InternalTExp.g:3212:5: (lv_filterExpr_3_0= ruleFilterExpr )
                    {
                    // InternalTExp.g:3212:5: (lv_filterExpr_3_0= ruleFilterExpr )
                    // InternalTExp.g:3213:6: lv_filterExpr_3_0= ruleFilterExpr
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
                    // InternalTExp.g:3232:3: ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) )
                    {
                    // InternalTExp.g:3232:3: ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) )
                    // InternalTExp.g:3233:4: () ( (lv_varExpr_5_0= ruleVarExpr ) )
                    {
                    // InternalTExp.g:3233:4: ()
                    // InternalTExp.g:3234:5: 
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

                    // InternalTExp.g:3243:4: ( (lv_varExpr_5_0= ruleVarExpr ) )
                    // InternalTExp.g:3244:5: (lv_varExpr_5_0= ruleVarExpr )
                    {
                    // InternalTExp.g:3244:5: (lv_varExpr_5_0= ruleVarExpr )
                    // InternalTExp.g:3245:6: lv_varExpr_5_0= ruleVarExpr
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
                    // InternalTExp.g:3264:3: ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) )
                    {
                    // InternalTExp.g:3264:3: ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) )
                    // InternalTExp.g:3265:4: () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) )
                    {
                    // InternalTExp.g:3265:4: ()
                    // InternalTExp.g:3266:5: 
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

                    // InternalTExp.g:3275:4: ( (lv_terminalExpr_7_0= ruleTerminalExpr ) )
                    // InternalTExp.g:3276:5: (lv_terminalExpr_7_0= ruleTerminalExpr )
                    {
                    // InternalTExp.g:3276:5: (lv_terminalExpr_7_0= ruleTerminalExpr )
                    // InternalTExp.g:3277:6: lv_terminalExpr_7_0= ruleTerminalExpr
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
    // InternalTExp.g:3299:1: entryRuleVarExpr returns [EObject current=null] : iv_ruleVarExpr= ruleVarExpr EOF ;
    public final EObject entryRuleVarExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarExpr = null;


        try {
            // InternalTExp.g:3299:48: (iv_ruleVarExpr= ruleVarExpr EOF )
            // InternalTExp.g:3300:2: iv_ruleVarExpr= ruleVarExpr EOF
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
    // InternalTExp.g:3306:1: ruleVarExpr returns [EObject current=null] : (this_OP700XFXL_0= RULE_OP700XFXL ( (lv_variable_1_0= RULE_VARIABLE ) ) this_OP1000XFY_2= RULE_OP1000XFY ( (lv_bodyVar_3_0= rulePrimary ) ) this_OP700XFXR_4= RULE_OP700XFXR ) ;
    public final EObject ruleVarExpr() throws RecognitionException {
        EObject current = null;

        Token this_OP700XFXL_0=null;
        Token lv_variable_1_0=null;
        Token this_OP1000XFY_2=null;
        Token this_OP700XFXR_4=null;
        EObject lv_bodyVar_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:3312:2: ( (this_OP700XFXL_0= RULE_OP700XFXL ( (lv_variable_1_0= RULE_VARIABLE ) ) this_OP1000XFY_2= RULE_OP1000XFY ( (lv_bodyVar_3_0= rulePrimary ) ) this_OP700XFXR_4= RULE_OP700XFXR ) )
            // InternalTExp.g:3313:2: (this_OP700XFXL_0= RULE_OP700XFXL ( (lv_variable_1_0= RULE_VARIABLE ) ) this_OP1000XFY_2= RULE_OP1000XFY ( (lv_bodyVar_3_0= rulePrimary ) ) this_OP700XFXR_4= RULE_OP700XFXR )
            {
            // InternalTExp.g:3313:2: (this_OP700XFXL_0= RULE_OP700XFXL ( (lv_variable_1_0= RULE_VARIABLE ) ) this_OP1000XFY_2= RULE_OP1000XFY ( (lv_bodyVar_3_0= rulePrimary ) ) this_OP700XFXR_4= RULE_OP700XFXR )
            // InternalTExp.g:3314:3: this_OP700XFXL_0= RULE_OP700XFXL ( (lv_variable_1_0= RULE_VARIABLE ) ) this_OP1000XFY_2= RULE_OP1000XFY ( (lv_bodyVar_3_0= rulePrimary ) ) this_OP700XFXR_4= RULE_OP700XFXR
            {
            this_OP700XFXL_0=(Token)match(input,RULE_OP700XFXL,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OP700XFXL_0, grammarAccess.getVarExprAccess().getOP700XFXLTerminalRuleCall_0());
              		
            }
            // InternalTExp.g:3318:3: ( (lv_variable_1_0= RULE_VARIABLE ) )
            // InternalTExp.g:3319:4: (lv_variable_1_0= RULE_VARIABLE )
            {
            // InternalTExp.g:3319:4: (lv_variable_1_0= RULE_VARIABLE )
            // InternalTExp.g:3320:5: lv_variable_1_0= RULE_VARIABLE
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
            // InternalTExp.g:3340:3: ( (lv_bodyVar_3_0= rulePrimary ) )
            // InternalTExp.g:3341:4: (lv_bodyVar_3_0= rulePrimary )
            {
            // InternalTExp.g:3341:4: (lv_bodyVar_3_0= rulePrimary )
            // InternalTExp.g:3342:5: lv_bodyVar_3_0= rulePrimary
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
    // InternalTExp.g:3367:1: entryRuleFilterExpr returns [EObject current=null] : iv_ruleFilterExpr= ruleFilterExpr EOF ;
    public final EObject entryRuleFilterExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterExpr = null;


        try {
            // InternalTExp.g:3367:51: (iv_ruleFilterExpr= ruleFilterExpr EOF )
            // InternalTExp.g:3368:2: iv_ruleFilterExpr= ruleFilterExpr EOF
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
    // InternalTExp.g:3374:1: ruleFilterExpr returns [EObject current=null] : ( ( ( ( ruleID ) ) | ( ( ruleID ) ) ) (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ( (lv_operator_7_0= RULE_OP400FX1 ) ) ( (lv_bodyFilter_8_0= rulePrimary ) ) ) ;
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
            // InternalTExp.g:3380:2: ( ( ( ( ( ruleID ) ) | ( ( ruleID ) ) ) (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ( (lv_operator_7_0= RULE_OP400FX1 ) ) ( (lv_bodyFilter_8_0= rulePrimary ) ) ) )
            // InternalTExp.g:3381:2: ( ( ( ( ruleID ) ) | ( ( ruleID ) ) ) (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ( (lv_operator_7_0= RULE_OP400FX1 ) ) ( (lv_bodyFilter_8_0= rulePrimary ) ) )
            {
            // InternalTExp.g:3381:2: ( ( ( ( ruleID ) ) | ( ( ruleID ) ) ) (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ( (lv_operator_7_0= RULE_OP400FX1 ) ) ( (lv_bodyFilter_8_0= rulePrimary ) ) )
            // InternalTExp.g:3382:3: ( ( ( ruleID ) ) | ( ( ruleID ) ) ) (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ( (lv_operator_7_0= RULE_OP400FX1 ) ) ( (lv_bodyFilter_8_0= rulePrimary ) )
            {
            // InternalTExp.g:3382:3: ( ( ( ruleID ) ) | ( ( ruleID ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ATOM) ) {
                int LA56_1 = input.LA(2);

                if ( (synpred97_InternalTExp()) ) {
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
                    // InternalTExp.g:3383:4: ( ( ruleID ) )
                    {
                    // InternalTExp.g:3383:4: ( ( ruleID ) )
                    // InternalTExp.g:3384:5: ( ruleID )
                    {
                    // InternalTExp.g:3384:5: ( ruleID )
                    // InternalTExp.g:3385:6: ruleID
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
                    // InternalTExp.g:3403:4: ( ( ruleID ) )
                    {
                    // InternalTExp.g:3403:4: ( ( ruleID ) )
                    // InternalTExp.g:3404:5: ( ruleID )
                    {
                    // InternalTExp.g:3404:5: ( ruleID )
                    // InternalTExp.g:3405:6: ruleID
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

            // InternalTExp.g:3423:3: (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==33) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalTExp.g:3424:4: otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getFilterExprAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:3428:4: ( (lv_first_3_0= ruleExpression0 ) )
                    // InternalTExp.g:3429:5: (lv_first_3_0= ruleExpression0 )
                    {
                    // InternalTExp.g:3429:5: (lv_first_3_0= ruleExpression0 )
                    // InternalTExp.g:3430:6: lv_first_3_0= ruleExpression0
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

                    // InternalTExp.g:3447:4: (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==RULE_OP1000XFY) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalTExp.g:3448:5: this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) )
                    	    {
                    	    this_OP1000XFY_4=(Token)match(input,RULE_OP1000XFY,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OP1000XFY_4, grammarAccess.getFilterExprAccess().getOP1000XFYTerminalRuleCall_1_2_0());
                    	      				
                    	    }
                    	    // InternalTExp.g:3452:5: ( (lv_exprs_5_0= ruleExpression0 ) )
                    	    // InternalTExp.g:3453:6: (lv_exprs_5_0= ruleExpression0 )
                    	    {
                    	    // InternalTExp.g:3453:6: (lv_exprs_5_0= ruleExpression0 )
                    	    // InternalTExp.g:3454:7: lv_exprs_5_0= ruleExpression0
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

                    otherlv_6=(Token)match(input,34,FOLLOW_56); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFilterExprAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTExp.g:3477:3: ( (lv_operator_7_0= RULE_OP400FX1 ) )
            // InternalTExp.g:3478:4: (lv_operator_7_0= RULE_OP400FX1 )
            {
            // InternalTExp.g:3478:4: (lv_operator_7_0= RULE_OP400FX1 )
            // InternalTExp.g:3479:5: lv_operator_7_0= RULE_OP400FX1
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

            // InternalTExp.g:3495:3: ( (lv_bodyFilter_8_0= rulePrimary ) )
            // InternalTExp.g:3496:4: (lv_bodyFilter_8_0= rulePrimary )
            {
            // InternalTExp.g:3496:4: (lv_bodyFilter_8_0= rulePrimary )
            // InternalTExp.g:3497:5: lv_bodyFilter_8_0= rulePrimary
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
    // InternalTExp.g:3518:1: entryRuleSeqExpr returns [EObject current=null] : iv_ruleSeqExpr= ruleSeqExpr EOF ;
    public final EObject entryRuleSeqExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeqExpr = null;


        try {
            // InternalTExp.g:3518:48: (iv_ruleSeqExpr= ruleSeqExpr EOF )
            // InternalTExp.g:3519:2: iv_ruleSeqExpr= ruleSeqExpr EOF
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
    // InternalTExp.g:3525:1: ruleSeqExpr returns [EObject current=null] : ( ( ( ( ruleID ) ) | ( ( ruleID ) ) ) (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ( (lv_operator_7_0= RULE_OP600XFY ) ) ( (lv_bodySeq_8_0= rulePrimary ) ) ) ;
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
            // InternalTExp.g:3531:2: ( ( ( ( ( ruleID ) ) | ( ( ruleID ) ) ) (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ( (lv_operator_7_0= RULE_OP600XFY ) ) ( (lv_bodySeq_8_0= rulePrimary ) ) ) )
            // InternalTExp.g:3532:2: ( ( ( ( ruleID ) ) | ( ( ruleID ) ) ) (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ( (lv_operator_7_0= RULE_OP600XFY ) ) ( (lv_bodySeq_8_0= rulePrimary ) ) )
            {
            // InternalTExp.g:3532:2: ( ( ( ( ruleID ) ) | ( ( ruleID ) ) ) (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ( (lv_operator_7_0= RULE_OP600XFY ) ) ( (lv_bodySeq_8_0= rulePrimary ) ) )
            // InternalTExp.g:3533:3: ( ( ( ruleID ) ) | ( ( ruleID ) ) ) (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )? ( (lv_operator_7_0= RULE_OP600XFY ) ) ( (lv_bodySeq_8_0= rulePrimary ) )
            {
            // InternalTExp.g:3533:3: ( ( ( ruleID ) ) | ( ( ruleID ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ATOM) ) {
                int LA59_1 = input.LA(2);

                if ( (synpred100_InternalTExp()) ) {
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
                    // InternalTExp.g:3534:4: ( ( ruleID ) )
                    {
                    // InternalTExp.g:3534:4: ( ( ruleID ) )
                    // InternalTExp.g:3535:5: ( ruleID )
                    {
                    // InternalTExp.g:3535:5: ( ruleID )
                    // InternalTExp.g:3536:6: ruleID
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
                    // InternalTExp.g:3554:4: ( ( ruleID ) )
                    {
                    // InternalTExp.g:3554:4: ( ( ruleID ) )
                    // InternalTExp.g:3555:5: ( ruleID )
                    {
                    // InternalTExp.g:3555:5: ( ruleID )
                    // InternalTExp.g:3556:6: ruleID
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

            // InternalTExp.g:3574:3: (otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==33) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalTExp.g:3575:4: otherlv_2= '(' ( (lv_first_3_0= ruleExpression0 ) ) (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSeqExprAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:3579:4: ( (lv_first_3_0= ruleExpression0 ) )
                    // InternalTExp.g:3580:5: (lv_first_3_0= ruleExpression0 )
                    {
                    // InternalTExp.g:3580:5: (lv_first_3_0= ruleExpression0 )
                    // InternalTExp.g:3581:6: lv_first_3_0= ruleExpression0
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

                    // InternalTExp.g:3598:4: (this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==RULE_OP1000XFY) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalTExp.g:3599:5: this_OP1000XFY_4= RULE_OP1000XFY ( (lv_exprs_5_0= ruleExpression0 ) )
                    	    {
                    	    this_OP1000XFY_4=(Token)match(input,RULE_OP1000XFY,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OP1000XFY_4, grammarAccess.getSeqExprAccess().getOP1000XFYTerminalRuleCall_1_2_0());
                    	      				
                    	    }
                    	    // InternalTExp.g:3603:5: ( (lv_exprs_5_0= ruleExpression0 ) )
                    	    // InternalTExp.g:3604:6: (lv_exprs_5_0= ruleExpression0 )
                    	    {
                    	    // InternalTExp.g:3604:6: (lv_exprs_5_0= ruleExpression0 )
                    	    // InternalTExp.g:3605:7: lv_exprs_5_0= ruleExpression0
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

                    otherlv_6=(Token)match(input,34,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getSeqExprAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTExp.g:3628:3: ( (lv_operator_7_0= RULE_OP600XFY ) )
            // InternalTExp.g:3629:4: (lv_operator_7_0= RULE_OP600XFY )
            {
            // InternalTExp.g:3629:4: (lv_operator_7_0= RULE_OP600XFY )
            // InternalTExp.g:3630:5: lv_operator_7_0= RULE_OP600XFY
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

            // InternalTExp.g:3646:3: ( (lv_bodySeq_8_0= rulePrimary ) )
            // InternalTExp.g:3647:4: (lv_bodySeq_8_0= rulePrimary )
            {
            // InternalTExp.g:3647:4: (lv_bodySeq_8_0= rulePrimary )
            // InternalTExp.g:3648:5: lv_bodySeq_8_0= rulePrimary
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
    // InternalTExp.g:3669:1: entryRuleTerminalExpr returns [EObject current=null] : iv_ruleTerminalExpr= ruleTerminalExpr EOF ;
    public final EObject entryRuleTerminalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpr = null;


        try {
            // InternalTExp.g:3669:53: (iv_ruleTerminalExpr= ruleTerminalExpr EOF )
            // InternalTExp.g:3670:2: iv_ruleTerminalExpr= ruleTerminalExpr EOF
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
    // InternalTExp.g:3676:1: ruleTerminalExpr returns [EObject current=null] : ( ( (lv_eps_0_0= 'epsilon' ) ) | ( ( ruleID ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')' ) ) ;
    public final EObject ruleTerminalExpr() throws RecognitionException {
        EObject current = null;

        Token lv_eps_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:3682:2: ( ( ( (lv_eps_0_0= 'epsilon' ) ) | ( ( ruleID ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')' ) ) )
            // InternalTExp.g:3683:2: ( ( (lv_eps_0_0= 'epsilon' ) ) | ( ( ruleID ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')' ) )
            {
            // InternalTExp.g:3683:2: ( ( (lv_eps_0_0= 'epsilon' ) ) | ( ( ruleID ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')' ) )
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
            case 33:
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
                    // InternalTExp.g:3684:3: ( (lv_eps_0_0= 'epsilon' ) )
                    {
                    // InternalTExp.g:3684:3: ( (lv_eps_0_0= 'epsilon' ) )
                    // InternalTExp.g:3685:4: (lv_eps_0_0= 'epsilon' )
                    {
                    // InternalTExp.g:3685:4: (lv_eps_0_0= 'epsilon' )
                    // InternalTExp.g:3686:5: lv_eps_0_0= 'epsilon'
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
                    // InternalTExp.g:3699:3: ( ( ruleID ) )
                    {
                    // InternalTExp.g:3699:3: ( ( ruleID ) )
                    // InternalTExp.g:3700:4: ( ruleID )
                    {
                    // InternalTExp.g:3700:4: ( ruleID )
                    // InternalTExp.g:3701:5: ruleID
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
                    // InternalTExp.g:3719:3: (otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')' )
                    {
                    // InternalTExp.g:3719:3: (otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')' )
                    // InternalTExp.g:3720:4: otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_47); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTerminalExprAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalTExp.g:3724:4: ( (lv_expr_3_0= ruleShuffleExpr ) )
                    // InternalTExp.g:3725:5: (lv_expr_3_0= ruleShuffleExpr )
                    {
                    // InternalTExp.g:3725:5: (lv_expr_3_0= ruleShuffleExpr )
                    // InternalTExp.g:3726:6: lv_expr_3_0= ruleShuffleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExprAccess().getExprShuffleExprParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
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

                    otherlv_4=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
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
    // InternalTExp.g:3752:1: entryRuleMsg returns [EObject current=null] : iv_ruleMsg= ruleMsg EOF ;
    public final EObject entryRuleMsg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMsg = null;


        try {
            // InternalTExp.g:3752:44: (iv_ruleMsg= ruleMsg EOF )
            // InternalTExp.g:3753:2: iv_ruleMsg= ruleMsg EOF
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
    // InternalTExp.g:3759:1: ruleMsg returns [EObject current=null] : ( ( ( (lv_performative_0_0= RULE_ATOM ) ) this_OP600XFY_1= RULE_OP600XFY )? ( (otherlv_2= '[' ( ( ruleID ) ) otherlv_4= '=>' otherlv_5= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_8= '[' otherlv_9= '=>' ( ( ruleID ) ) otherlv_11= ']' ) | ( ( ( ruleID ) ) otherlv_13= '=>' ( ( ruleID ) ) ) ) this_OP600XFY_15= RULE_OP600XFY ( (lv_content_16_0= ruleExpression0 ) ) (otherlv_17= '[' ( (lv_conditions_18_0= ruleExpressionInfinity ) ) otherlv_19= ']' )? ) ;
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
            // InternalTExp.g:3765:2: ( ( ( ( (lv_performative_0_0= RULE_ATOM ) ) this_OP600XFY_1= RULE_OP600XFY )? ( (otherlv_2= '[' ( ( ruleID ) ) otherlv_4= '=>' otherlv_5= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_8= '[' otherlv_9= '=>' ( ( ruleID ) ) otherlv_11= ']' ) | ( ( ( ruleID ) ) otherlv_13= '=>' ( ( ruleID ) ) ) ) this_OP600XFY_15= RULE_OP600XFY ( (lv_content_16_0= ruleExpression0 ) ) (otherlv_17= '[' ( (lv_conditions_18_0= ruleExpressionInfinity ) ) otherlv_19= ']' )? ) )
            // InternalTExp.g:3766:2: ( ( ( (lv_performative_0_0= RULE_ATOM ) ) this_OP600XFY_1= RULE_OP600XFY )? ( (otherlv_2= '[' ( ( ruleID ) ) otherlv_4= '=>' otherlv_5= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_8= '[' otherlv_9= '=>' ( ( ruleID ) ) otherlv_11= ']' ) | ( ( ( ruleID ) ) otherlv_13= '=>' ( ( ruleID ) ) ) ) this_OP600XFY_15= RULE_OP600XFY ( (lv_content_16_0= ruleExpression0 ) ) (otherlv_17= '[' ( (lv_conditions_18_0= ruleExpressionInfinity ) ) otherlv_19= ']' )? )
            {
            // InternalTExp.g:3766:2: ( ( ( (lv_performative_0_0= RULE_ATOM ) ) this_OP600XFY_1= RULE_OP600XFY )? ( (otherlv_2= '[' ( ( ruleID ) ) otherlv_4= '=>' otherlv_5= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_8= '[' otherlv_9= '=>' ( ( ruleID ) ) otherlv_11= ']' ) | ( ( ( ruleID ) ) otherlv_13= '=>' ( ( ruleID ) ) ) ) this_OP600XFY_15= RULE_OP600XFY ( (lv_content_16_0= ruleExpression0 ) ) (otherlv_17= '[' ( (lv_conditions_18_0= ruleExpressionInfinity ) ) otherlv_19= ']' )? )
            // InternalTExp.g:3767:3: ( ( (lv_performative_0_0= RULE_ATOM ) ) this_OP600XFY_1= RULE_OP600XFY )? ( (otherlv_2= '[' ( ( ruleID ) ) otherlv_4= '=>' otherlv_5= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_8= '[' otherlv_9= '=>' ( ( ruleID ) ) otherlv_11= ']' ) | ( ( ( ruleID ) ) otherlv_13= '=>' ( ( ruleID ) ) ) ) this_OP600XFY_15= RULE_OP600XFY ( (lv_content_16_0= ruleExpression0 ) ) (otherlv_17= '[' ( (lv_conditions_18_0= ruleExpressionInfinity ) ) otherlv_19= ']' )?
            {
            // InternalTExp.g:3767:3: ( ( (lv_performative_0_0= RULE_ATOM ) ) this_OP600XFY_1= RULE_OP600XFY )?
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
                    // InternalTExp.g:3768:4: ( (lv_performative_0_0= RULE_ATOM ) ) this_OP600XFY_1= RULE_OP600XFY
                    {
                    // InternalTExp.g:3768:4: ( (lv_performative_0_0= RULE_ATOM ) )
                    // InternalTExp.g:3769:5: (lv_performative_0_0= RULE_ATOM )
                    {
                    // InternalTExp.g:3769:5: (lv_performative_0_0= RULE_ATOM )
                    // InternalTExp.g:3770:6: lv_performative_0_0= RULE_ATOM
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

            // InternalTExp.g:3791:3: ( (otherlv_2= '[' ( ( ruleID ) ) otherlv_4= '=>' otherlv_5= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_8= '[' otherlv_9= '=>' ( ( ruleID ) ) otherlv_11= ']' ) | ( ( ( ruleID ) ) otherlv_13= '=>' ( ( ruleID ) ) ) )
            int alt64=3;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==35) ) {
                alt64=1;
            }
            else if ( (LA64_0==RULE_ATOM) ) {
                int LA64_2 = input.LA(2);

                if ( (LA64_2==35) ) {
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
                    // InternalTExp.g:3792:4: (otherlv_2= '[' ( ( ruleID ) ) otherlv_4= '=>' otherlv_5= ']' ( ( ruleID ) ) )
                    {
                    // InternalTExp.g:3792:4: (otherlv_2= '[' ( ( ruleID ) ) otherlv_4= '=>' otherlv_5= ']' ( ( ruleID ) ) )
                    // InternalTExp.g:3793:5: otherlv_2= '[' ( ( ruleID ) ) otherlv_4= '=>' otherlv_5= ']' ( ( ruleID ) )
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getMsgAccess().getLeftSquareBracketKeyword_1_0_0());
                      				
                    }
                    // InternalTExp.g:3797:5: ( ( ruleID ) )
                    // InternalTExp.g:3798:6: ( ruleID )
                    {
                    // InternalTExp.g:3798:6: ( ruleID )
                    // InternalTExp.g:3799:7: ruleID
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

                    otherlv_4=(Token)match(input,62,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getMsgAccess().getEqualsSignGreaterThanSignKeyword_1_0_2());
                      				
                    }
                    otherlv_5=(Token)match(input,37,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getMsgAccess().getRightSquareBracketKeyword_1_0_3());
                      				
                    }
                    // InternalTExp.g:3824:5: ( ( ruleID ) )
                    // InternalTExp.g:3825:6: ( ruleID )
                    {
                    // InternalTExp.g:3825:6: ( ruleID )
                    // InternalTExp.g:3826:7: ruleID
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
                    // InternalTExp.g:3845:4: ( ( ( ruleID ) ) otherlv_8= '[' otherlv_9= '=>' ( ( ruleID ) ) otherlv_11= ']' )
                    {
                    // InternalTExp.g:3845:4: ( ( ( ruleID ) ) otherlv_8= '[' otherlv_9= '=>' ( ( ruleID ) ) otherlv_11= ']' )
                    // InternalTExp.g:3846:5: ( ( ruleID ) ) otherlv_8= '[' otherlv_9= '=>' ( ( ruleID ) ) otherlv_11= ']'
                    {
                    // InternalTExp.g:3846:5: ( ( ruleID ) )
                    // InternalTExp.g:3847:6: ( ruleID )
                    {
                    // InternalTExp.g:3847:6: ( ruleID )
                    // InternalTExp.g:3848:7: ruleID
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

                    otherlv_8=(Token)match(input,35,FOLLOW_58); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_8, grammarAccess.getMsgAccess().getLeftSquareBracketKeyword_1_1_1());
                      				
                    }
                    otherlv_9=(Token)match(input,62,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getMsgAccess().getEqualsSignGreaterThanSignKeyword_1_1_2());
                      				
                    }
                    // InternalTExp.g:3873:5: ( ( ruleID ) )
                    // InternalTExp.g:3874:6: ( ruleID )
                    {
                    // InternalTExp.g:3874:6: ( ruleID )
                    // InternalTExp.g:3875:7: ruleID
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
                    pushFollow(FOLLOW_22);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,37,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getMsgAccess().getRightSquareBracketKeyword_1_1_4());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTExp.g:3898:4: ( ( ( ruleID ) ) otherlv_13= '=>' ( ( ruleID ) ) )
                    {
                    // InternalTExp.g:3898:4: ( ( ( ruleID ) ) otherlv_13= '=>' ( ( ruleID ) ) )
                    // InternalTExp.g:3899:5: ( ( ruleID ) ) otherlv_13= '=>' ( ( ruleID ) )
                    {
                    // InternalTExp.g:3899:5: ( ( ruleID ) )
                    // InternalTExp.g:3900:6: ( ruleID )
                    {
                    // InternalTExp.g:3900:6: ( ruleID )
                    // InternalTExp.g:3901:7: ruleID
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

                    otherlv_13=(Token)match(input,62,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_13, grammarAccess.getMsgAccess().getEqualsSignGreaterThanSignKeyword_1_2_1());
                      				
                    }
                    // InternalTExp.g:3922:5: ( ( ruleID ) )
                    // InternalTExp.g:3923:6: ( ruleID )
                    {
                    // InternalTExp.g:3923:6: ( ruleID )
                    // InternalTExp.g:3924:7: ruleID
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

            this_OP600XFY_15=(Token)match(input,RULE_OP600XFY,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OP600XFY_15, grammarAccess.getMsgAccess().getOP600XFYTerminalRuleCall_2());
              		
            }
            // InternalTExp.g:3947:3: ( (lv_content_16_0= ruleExpression0 ) )
            // InternalTExp.g:3948:4: (lv_content_16_0= ruleExpression0 )
            {
            // InternalTExp.g:3948:4: (lv_content_16_0= ruleExpression0 )
            // InternalTExp.g:3949:5: lv_content_16_0= ruleExpression0
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

            // InternalTExp.g:3966:3: (otherlv_17= '[' ( (lv_conditions_18_0= ruleExpressionInfinity ) ) otherlv_19= ']' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==35) ) {
                int LA65_1 = input.LA(2);

                if ( ((LA65_1>=RULE_OP1200XFX && LA65_1<=RULE_INT)||(LA65_1>=RULE_VARIABLE && LA65_1<=RULE_STRING)||(LA65_1>=30 && LA65_1<=33)||LA65_1==35) ) {
                    alt65=1;
                }
                else if ( (LA65_1==RULE_ATOM) ) {
                    int LA65_4 = input.LA(3);

                    if ( ((LA65_4>=RULE_OP1100XFY && LA65_4<=RULE_OP954XFY)||(LA65_4>=RULE_OP700XFX && LA65_4<=RULE_OP500YFX)||(LA65_4>=RULE_OP400YFX && LA65_4<=RULE_OP200XFY)||LA65_4==33||LA65_4==37) ) {
                        alt65=1;
                    }
                }
            }
            switch (alt65) {
                case 1 :
                    // InternalTExp.g:3967:4: otherlv_17= '[' ( (lv_conditions_18_0= ruleExpressionInfinity ) ) otherlv_19= ']'
                    {
                    otherlv_17=(Token)match(input,35,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getMsgAccess().getLeftSquareBracketKeyword_4_0());
                      			
                    }
                    // InternalTExp.g:3971:4: ( (lv_conditions_18_0= ruleExpressionInfinity ) )
                    // InternalTExp.g:3972:5: (lv_conditions_18_0= ruleExpressionInfinity )
                    {
                    // InternalTExp.g:3972:5: (lv_conditions_18_0= ruleExpressionInfinity )
                    // InternalTExp.g:3973:6: lv_conditions_18_0= ruleExpressionInfinity
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMsgAccess().getConditionsExpressionInfinityParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
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

                    otherlv_19=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
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
    // InternalTExp.g:3999:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalTExp.g:3999:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalTExp.g:4000:2: iv_ruleChannel= ruleChannel EOF
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
    // InternalTExp.g:4006:1: ruleChannel returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_reliability_2_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:4012:2: ( ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' )? ) )
            // InternalTExp.g:4013:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' )? )
            {
            // InternalTExp.g:4013:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' )? )
            // InternalTExp.g:4014:3: ( (lv_name_0_0= ruleID ) ) (otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' )?
            {
            // InternalTExp.g:4014:3: ( (lv_name_0_0= ruleID ) )
            // InternalTExp.g:4015:4: (lv_name_0_0= ruleID )
            {
            // InternalTExp.g:4015:4: (lv_name_0_0= ruleID )
            // InternalTExp.g:4016:5: lv_name_0_0= ruleID
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

            // InternalTExp.g:4033:3: (otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==35) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalTExp.g:4034:4: otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getChannelAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:4038:4: ( (lv_reliability_2_0= ruleNUMBER ) )
                    // InternalTExp.g:4039:5: (lv_reliability_2_0= ruleNUMBER )
                    {
                    // InternalTExp.g:4039:5: (lv_reliability_2_0= ruleNUMBER )
                    // InternalTExp.g:4040:6: lv_reliability_2_0= ruleNUMBER
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getChannelAccess().getReliabilityNUMBERParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
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

                    otherlv_3=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
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
    // InternalTExp.g:4066:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalTExp.g:4066:45: (iv_ruleRole= ruleRole EOF )
            // InternalTExp.g:4067:2: iv_ruleRole= ruleRole EOF
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
    // InternalTExp.g:4073:1: ruleRole returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )? ) ;
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
            // InternalTExp.g:4079:2: ( ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )? ) )
            // InternalTExp.g:4080:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )? )
            {
            // InternalTExp.g:4080:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )? )
            // InternalTExp.g:4081:3: ( (lv_name_0_0= ruleID ) ) (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )?
            {
            // InternalTExp.g:4081:3: ( (lv_name_0_0= ruleID ) )
            // InternalTExp.g:4082:4: (lv_name_0_0= ruleID )
            {
            // InternalTExp.g:4082:4: (lv_name_0_0= ruleID )
            // InternalTExp.g:4083:5: lv_name_0_0= ruleID
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

            // InternalTExp.g:4100:3: (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==63) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalTExp.g:4101:4: otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$'
                    {
                    otherlv_1=(Token)match(input,63,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getDollarSignKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:4105:4: ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) )
                    // InternalTExp.g:4106:5: ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) )
                    {
                    // InternalTExp.g:4106:5: ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) )
                    // InternalTExp.g:4107:6: (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM )
                    {
                    // InternalTExp.g:4107:6: (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM )
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
                            // InternalTExp.g:4108:7: lv_class_2_1= RULE_VARIABLE
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
                            // InternalTExp.g:4123:7: lv_class_2_2= RULE_ATOM
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

                    // InternalTExp.g:4140:4: (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==33) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalTExp.g:4141:5: otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')'
                            {
                            otherlv_3=(Token)match(input,33,FOLLOW_61); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getLeftParenthesisKeyword_1_2_0());
                              				
                            }
                            // InternalTExp.g:4145:5: ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )*
                            loop69:
                            do {
                                int alt69=2;
                                int LA69_0 = input.LA(1);

                                if ( (LA69_0==RULE_STRING) ) {
                                    alt69=1;
                                }


                                switch (alt69) {
                            	case 1 :
                            	    // InternalTExp.g:4146:6: ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )?
                            	    {
                            	    // InternalTExp.g:4146:6: ( (lv_args_4_0= ruleArgument ) )
                            	    // InternalTExp.g:4147:7: (lv_args_4_0= ruleArgument )
                            	    {
                            	    // InternalTExp.g:4147:7: (lv_args_4_0= ruleArgument )
                            	    // InternalTExp.g:4148:8: lv_args_4_0= ruleArgument
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

                            	    // InternalTExp.g:4165:6: (this_OP1000XFY_5= RULE_OP1000XFY )?
                            	    int alt68=2;
                            	    int LA68_0 = input.LA(1);

                            	    if ( (LA68_0==RULE_OP1000XFY) ) {
                            	        alt68=1;
                            	    }
                            	    switch (alt68) {
                            	        case 1 :
                            	            // InternalTExp.g:4166:7: this_OP1000XFY_5= RULE_OP1000XFY
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

                            otherlv_6=(Token)match(input,34,FOLLOW_63); if (state.failed) return current;
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
    // InternalTExp.g:4186:1: entryRuleArgument returns [String current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final String entryRuleArgument() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArgument = null;


        try {
            // InternalTExp.g:4186:48: (iv_ruleArgument= ruleArgument EOF )
            // InternalTExp.g:4187:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalTExp.g:4193:1: ruleArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalTExp.g:4199:2: (this_STRING_0= RULE_STRING )
            // InternalTExp.g:4200:2: this_STRING_0= RULE_STRING
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
    // InternalTExp.g:4210:1: entryRulePartition returns [EObject current=null] : iv_rulePartition= rulePartition EOF ;
    public final EObject entryRulePartition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartition = null;


        try {
            // InternalTExp.g:4210:50: (iv_rulePartition= rulePartition EOF )
            // InternalTExp.g:4211:2: iv_rulePartition= rulePartition EOF
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
    // InternalTExp.g:4217:1: rulePartition returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )* otherlv_4= ']' ) ;
    public final EObject rulePartition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_OP1000XFY_3=null;
        Token otherlv_4=null;
        EObject lv_constraints_2_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:4223:2: ( ( () otherlv_1= '[' ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )* otherlv_4= ']' ) )
            // InternalTExp.g:4224:2: ( () otherlv_1= '[' ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )* otherlv_4= ']' )
            {
            // InternalTExp.g:4224:2: ( () otherlv_1= '[' ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )* otherlv_4= ']' )
            // InternalTExp.g:4225:3: () otherlv_1= '[' ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )* otherlv_4= ']'
            {
            // InternalTExp.g:4225:3: ()
            // InternalTExp.g:4226:4: 
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

            otherlv_1=(Token)match(input,35,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPartitionAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalTExp.g:4239:3: ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==35) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalTExp.g:4240:4: ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )?
            	    {
            	    // InternalTExp.g:4240:4: ( (lv_constraints_2_0= ruleTogether ) )
            	    // InternalTExp.g:4241:5: (lv_constraints_2_0= ruleTogether )
            	    {
            	    // InternalTExp.g:4241:5: (lv_constraints_2_0= ruleTogether )
            	    // InternalTExp.g:4242:6: lv_constraints_2_0= ruleTogether
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

            	    // InternalTExp.g:4259:4: (this_OP1000XFY_3= RULE_OP1000XFY )?
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==RULE_OP1000XFY) ) {
            	        alt72=1;
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // InternalTExp.g:4260:5: this_OP1000XFY_3= RULE_OP1000XFY
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

            otherlv_4=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
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
    // InternalTExp.g:4274:1: entryRuleTogether returns [EObject current=null] : iv_ruleTogether= ruleTogether EOF ;
    public final EObject entryRuleTogether() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTogether = null;


        try {
            // InternalTExp.g:4274:49: (iv_ruleTogether= ruleTogether EOF )
            // InternalTExp.g:4275:2: iv_ruleTogether= ruleTogether EOF
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
    // InternalTExp.g:4281:1: ruleTogether returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+ otherlv_4= ']' ) ;
    public final EObject ruleTogether() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_OP1000XFY_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTExp.g:4287:2: ( ( () otherlv_1= '[' ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+ otherlv_4= ']' ) )
            // InternalTExp.g:4288:2: ( () otherlv_1= '[' ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+ otherlv_4= ']' )
            {
            // InternalTExp.g:4288:2: ( () otherlv_1= '[' ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+ otherlv_4= ']' )
            // InternalTExp.g:4289:3: () otherlv_1= '[' ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+ otherlv_4= ']'
            {
            // InternalTExp.g:4289:3: ()
            // InternalTExp.g:4290:4: 
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

            otherlv_1=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTogetherAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalTExp.g:4303:3: ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+
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
            	    // InternalTExp.g:4304:4: ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )?
            	    {
            	    // InternalTExp.g:4304:4: ( ( ruleID ) )
            	    // InternalTExp.g:4305:5: ( ruleID )
            	    {
            	    // InternalTExp.g:4305:5: ( ruleID )
            	    // InternalTExp.g:4306:6: ruleID
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

            	    // InternalTExp.g:4323:4: (this_OP1000XFY_3= RULE_OP1000XFY )?
            	    int alt74=2;
            	    int LA74_0 = input.LA(1);

            	    if ( (LA74_0==RULE_OP1000XFY) ) {
            	        alt74=1;
            	    }
            	    switch (alt74) {
            	        case 1 :
            	            // InternalTExp.g:4324:5: this_OP1000XFY_3= RULE_OP1000XFY
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

            otherlv_4=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
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
    // InternalTExp.g:4338:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalTExp.g:4338:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalTExp.g:4339:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalTExp.g:4345:1: ruleConstraint returns [EObject current=null] : ( (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' ) | (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' ) | ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) ) | ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) ) | ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_together_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_split_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token this_OP600XFY_16=null;
        Token lv_parMin_17_1=null;
        Token lv_parMin_17_2=null;
        Token lv_minSingletons_18_0=null;
        Token this_OP1000XFY_19=null;
        Token lv_maxSingletons_20_0=null;
        Token lv_parMax_21_1=null;
        Token lv_parMax_21_2=null;
        Token otherlv_23=null;
        Token this_OP600XFY_24=null;
        Token lv_parMin_25_1=null;
        Token lv_parMin_25_2=null;
        Token lv_minSize_26_0=null;
        Token this_OP1000XFY_27=null;
        Token lv_maxSize_28_0=null;
        Token lv_parMax_29_1=null;
        Token lv_parMax_29_2=null;
        Token otherlv_31=null;
        Token this_OP600XFY_32=null;
        Token lv_parMin_33_1=null;
        Token lv_parMin_33_2=null;
        Token lv_minCardinality_34_0=null;
        Token this_OP1000XFY_35=null;
        Token lv_maxCardinality_36_0=null;
        Token lv_parMax_37_1=null;
        Token lv_parMax_37_2=null;


        	enterRule();

        try {
            // InternalTExp.g:4351:2: ( ( (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' ) | (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' ) | ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) ) | ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) ) | ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) ) ) )
            // InternalTExp.g:4352:2: ( (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' ) | (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' ) | ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) ) | ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) ) | ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) ) )
            {
            // InternalTExp.g:4352:2: ( (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' ) | (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' ) | ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) ) | ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) ) | ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) ) )
            int alt86=5;
            alt86 = dfa86.predict(input);
            switch (alt86) {
                case 1 :
                    // InternalTExp.g:4353:3: (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' )
                    {
                    // InternalTExp.g:4353:3: (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' )
                    // InternalTExp.g:4354:4: otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_0_0());
                      			
                    }
                    // InternalTExp.g:4358:4: ( ( ruleID ) )+
                    int cnt76=0;
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==RULE_ATOM) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalTExp.g:4359:5: ( ruleID )
                    	    {
                    	    // InternalTExp.g:4359:5: ( ruleID )
                    	    // InternalTExp.g:4360:6: ruleID
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

                    	      						newCompositeNode(grammarAccess.getConstraintAccess().getLeftRoleCrossReference_0_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_67);
                    	    ruleID();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt76 >= 1 ) break loop76;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(76, input);
                                throw eee;
                        }
                        cnt76++;
                    } while (true);

                    otherlv_2=(Token)match(input,37,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getRightSquareBracketKeyword_0_2());
                      			
                    }
                    // InternalTExp.g:4381:4: ( (lv_together_3_0= '-><-' ) )
                    // InternalTExp.g:4382:5: (lv_together_3_0= '-><-' )
                    {
                    // InternalTExp.g:4382:5: (lv_together_3_0= '-><-' )
                    // InternalTExp.g:4383:6: lv_together_3_0= '-><-'
                    {
                    lv_together_3_0=(Token)match(input,64,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_together_3_0, grammarAccess.getConstraintAccess().getTogetherHyphenMinusGreaterThanSignLessThanSignHyphenMinusKeyword_0_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      						setWithLastConsumed(current, "together", lv_together_3_0, "-><-");
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_0_4());
                      			
                    }
                    // InternalTExp.g:4399:4: ( ( ruleID ) )+
                    int cnt77=0;
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==RULE_ATOM) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // InternalTExp.g:4400:5: ( ruleID )
                    	    {
                    	    // InternalTExp.g:4400:5: ( ruleID )
                    	    // InternalTExp.g:4401:6: ruleID
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

                    	      						newCompositeNode(grammarAccess.getConstraintAccess().getRightRoleCrossReference_0_5_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_67);
                    	    ruleID();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt77 >= 1 ) break loop77;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(77, input);
                                throw eee;
                        }
                        cnt77++;
                    } while (true);

                    otherlv_6=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getConstraintAccess().getRightSquareBracketKeyword_0_6());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTExp.g:4424:3: (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' )
                    {
                    // InternalTExp.g:4424:3: (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' )
                    // InternalTExp.g:4425:4: otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']'
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:4429:4: ( ( ruleID ) )+
                    int cnt78=0;
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==RULE_ATOM) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalTExp.g:4430:5: ( ruleID )
                    	    {
                    	    // InternalTExp.g:4430:5: ( ruleID )
                    	    // InternalTExp.g:4431:6: ruleID
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

                    	      						newCompositeNode(grammarAccess.getConstraintAccess().getLeftRoleCrossReference_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_67);
                    	    ruleID();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt78 >= 1 ) break loop78;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(78, input);
                                throw eee;
                        }
                        cnt78++;
                    } while (true);

                    otherlv_9=(Token)match(input,37,FOLLOW_69); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getConstraintAccess().getRightSquareBracketKeyword_1_2());
                      			
                    }
                    // InternalTExp.g:4452:4: ( (lv_split_10_0= '<-->' ) )
                    // InternalTExp.g:4453:5: (lv_split_10_0= '<-->' )
                    {
                    // InternalTExp.g:4453:5: (lv_split_10_0= '<-->' )
                    // InternalTExp.g:4454:6: lv_split_10_0= '<-->'
                    {
                    lv_split_10_0=(Token)match(input,65,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_split_10_0, grammarAccess.getConstraintAccess().getSplitLessThanSignHyphenMinusHyphenMinusGreaterThanSignKeyword_1_3_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      						setWithLastConsumed(current, "split", lv_split_10_0, "<-->");
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_1_4());
                      			
                    }
                    // InternalTExp.g:4470:4: ( ( ruleID ) )+
                    int cnt79=0;
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==RULE_ATOM) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // InternalTExp.g:4471:5: ( ruleID )
                    	    {
                    	    // InternalTExp.g:4471:5: ( ruleID )
                    	    // InternalTExp.g:4472:6: ruleID
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

                    	      						newCompositeNode(grammarAccess.getConstraintAccess().getRightRoleCrossReference_1_5_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_67);
                    	    ruleID();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt79 >= 1 ) break loop79;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(79, input);
                                throw eee;
                        }
                        cnt79++;
                    } while (true);

                    otherlv_13=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getConstraintAccess().getRightSquareBracketKeyword_1_6());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTExp.g:4495:3: ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) )
                    {
                    // InternalTExp.g:4495:3: ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) )
                    // InternalTExp.g:4496:4: () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) )
                    {
                    // InternalTExp.g:4496:4: ()
                    // InternalTExp.g:4497:5: 
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

                    otherlv_15=(Token)match(input,66,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getConstraintAccess().getNumber_singletonsKeyword_2_1());
                      			
                    }
                    this_OP600XFY_16=(Token)match(input,RULE_OP600XFY,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP600XFY_16, grammarAccess.getConstraintAccess().getOP600XFYTerminalRuleCall_2_2());
                      			
                    }
                    // InternalTExp.g:4514:4: ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) )
                    // InternalTExp.g:4515:5: ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) )
                    {
                    // InternalTExp.g:4515:5: ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) )
                    // InternalTExp.g:4516:6: (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' )
                    {
                    // InternalTExp.g:4516:6: (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' )
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==33) ) {
                        alt80=1;
                    }
                    else if ( (LA80_0==35) ) {
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
                            // InternalTExp.g:4517:7: lv_parMin_17_1= '('
                            {
                            lv_parMin_17_1=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMin_17_1, grammarAccess.getConstraintAccess().getParMinLeftParenthesisKeyword_2_3_0_0());
                              						
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
                            // InternalTExp.g:4528:7: lv_parMin_17_2= '['
                            {
                            lv_parMin_17_2=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMin_17_2, grammarAccess.getConstraintAccess().getParMinLeftSquareBracketKeyword_2_3_0_1());
                              						
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

                    // InternalTExp.g:4541:4: ( (lv_minSingletons_18_0= RULE_INT ) )
                    // InternalTExp.g:4542:5: (lv_minSingletons_18_0= RULE_INT )
                    {
                    // InternalTExp.g:4542:5: (lv_minSingletons_18_0= RULE_INT )
                    // InternalTExp.g:4543:6: lv_minSingletons_18_0= RULE_INT
                    {
                    lv_minSingletons_18_0=(Token)match(input,RULE_INT,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_minSingletons_18_0, grammarAccess.getConstraintAccess().getMinSingletonsINTTerminalRuleCall_2_4_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"minSingletons",
                      							lv_minSingletons_18_0,
                      							"it.unige.dibris.trace_expression_language.TExp.INT");
                      					
                    }

                    }


                    }

                    this_OP1000XFY_19=(Token)match(input,RULE_OP1000XFY,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP1000XFY_19, grammarAccess.getConstraintAccess().getOP1000XFYTerminalRuleCall_2_5());
                      			
                    }
                    // InternalTExp.g:4563:4: ( (lv_maxSingletons_20_0= RULE_INT ) )
                    // InternalTExp.g:4564:5: (lv_maxSingletons_20_0= RULE_INT )
                    {
                    // InternalTExp.g:4564:5: (lv_maxSingletons_20_0= RULE_INT )
                    // InternalTExp.g:4565:6: lv_maxSingletons_20_0= RULE_INT
                    {
                    lv_maxSingletons_20_0=(Token)match(input,RULE_INT,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_maxSingletons_20_0, grammarAccess.getConstraintAccess().getMaxSingletonsINTTerminalRuleCall_2_6_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"maxSingletons",
                      							lv_maxSingletons_20_0,
                      							"it.unige.dibris.trace_expression_language.TExp.INT");
                      					
                    }

                    }


                    }

                    // InternalTExp.g:4581:4: ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) )
                    // InternalTExp.g:4582:5: ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) )
                    {
                    // InternalTExp.g:4582:5: ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) )
                    // InternalTExp.g:4583:6: (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' )
                    {
                    // InternalTExp.g:4583:6: (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' )
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==34) ) {
                        alt81=1;
                    }
                    else if ( (LA81_0==37) ) {
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
                            // InternalTExp.g:4584:7: lv_parMax_21_1= ')'
                            {
                            lv_parMax_21_1=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMax_21_1, grammarAccess.getConstraintAccess().getParMaxRightParenthesisKeyword_2_7_0_0());
                              						
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
                            // InternalTExp.g:4595:7: lv_parMax_21_2= ']'
                            {
                            lv_parMax_21_2=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMax_21_2, grammarAccess.getConstraintAccess().getParMaxRightSquareBracketKeyword_2_7_0_1());
                              						
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
                case 4 :
                    // InternalTExp.g:4610:3: ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) )
                    {
                    // InternalTExp.g:4610:3: ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) )
                    // InternalTExp.g:4611:4: () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) )
                    {
                    // InternalTExp.g:4611:4: ()
                    // InternalTExp.g:4612:5: 
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

                    otherlv_23=(Token)match(input,67,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getConstraintAccess().getSize_constraintsKeyword_3_1());
                      			
                    }
                    this_OP600XFY_24=(Token)match(input,RULE_OP600XFY,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP600XFY_24, grammarAccess.getConstraintAccess().getOP600XFYTerminalRuleCall_3_2());
                      			
                    }
                    // InternalTExp.g:4629:4: ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) )
                    // InternalTExp.g:4630:5: ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) )
                    {
                    // InternalTExp.g:4630:5: ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) )
                    // InternalTExp.g:4631:6: (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' )
                    {
                    // InternalTExp.g:4631:6: (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' )
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==33) ) {
                        alt82=1;
                    }
                    else if ( (LA82_0==35) ) {
                        alt82=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 82, 0, input);

                        throw nvae;
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalTExp.g:4632:7: lv_parMin_25_1= '('
                            {
                            lv_parMin_25_1=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMin_25_1, grammarAccess.getConstraintAccess().getParMinLeftParenthesisKeyword_3_3_0_0());
                              						
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
                            // InternalTExp.g:4643:7: lv_parMin_25_2= '['
                            {
                            lv_parMin_25_2=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMin_25_2, grammarAccess.getConstraintAccess().getParMinLeftSquareBracketKeyword_3_3_0_1());
                              						
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

                    // InternalTExp.g:4656:4: ( (lv_minSize_26_0= RULE_INT ) )
                    // InternalTExp.g:4657:5: (lv_minSize_26_0= RULE_INT )
                    {
                    // InternalTExp.g:4657:5: (lv_minSize_26_0= RULE_INT )
                    // InternalTExp.g:4658:6: lv_minSize_26_0= RULE_INT
                    {
                    lv_minSize_26_0=(Token)match(input,RULE_INT,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_minSize_26_0, grammarAccess.getConstraintAccess().getMinSizeINTTerminalRuleCall_3_4_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"minSize",
                      							lv_minSize_26_0,
                      							"it.unige.dibris.trace_expression_language.TExp.INT");
                      					
                    }

                    }


                    }

                    this_OP1000XFY_27=(Token)match(input,RULE_OP1000XFY,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP1000XFY_27, grammarAccess.getConstraintAccess().getOP1000XFYTerminalRuleCall_3_5());
                      			
                    }
                    // InternalTExp.g:4678:4: ( (lv_maxSize_28_0= RULE_INT ) )
                    // InternalTExp.g:4679:5: (lv_maxSize_28_0= RULE_INT )
                    {
                    // InternalTExp.g:4679:5: (lv_maxSize_28_0= RULE_INT )
                    // InternalTExp.g:4680:6: lv_maxSize_28_0= RULE_INT
                    {
                    lv_maxSize_28_0=(Token)match(input,RULE_INT,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_maxSize_28_0, grammarAccess.getConstraintAccess().getMaxSizeINTTerminalRuleCall_3_6_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"maxSize",
                      							lv_maxSize_28_0,
                      							"it.unige.dibris.trace_expression_language.TExp.INT");
                      					
                    }

                    }


                    }

                    // InternalTExp.g:4696:4: ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) )
                    // InternalTExp.g:4697:5: ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) )
                    {
                    // InternalTExp.g:4697:5: ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) )
                    // InternalTExp.g:4698:6: (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' )
                    {
                    // InternalTExp.g:4698:6: (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' )
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==34) ) {
                        alt83=1;
                    }
                    else if ( (LA83_0==37) ) {
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
                            // InternalTExp.g:4699:7: lv_parMax_29_1= ')'
                            {
                            lv_parMax_29_1=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMax_29_1, grammarAccess.getConstraintAccess().getParMaxRightParenthesisKeyword_3_7_0_0());
                              						
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
                            // InternalTExp.g:4710:7: lv_parMax_29_2= ']'
                            {
                            lv_parMax_29_2=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMax_29_2, grammarAccess.getConstraintAccess().getParMaxRightSquareBracketKeyword_3_7_0_1());
                              						
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
                case 5 :
                    // InternalTExp.g:4725:3: ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) )
                    {
                    // InternalTExp.g:4725:3: ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) )
                    // InternalTExp.g:4726:4: () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) )
                    {
                    // InternalTExp.g:4726:4: ()
                    // InternalTExp.g:4727:5: 
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

                    otherlv_31=(Token)match(input,68,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getConstraintAccess().getNumber_constraintsKeyword_4_1());
                      			
                    }
                    this_OP600XFY_32=(Token)match(input,RULE_OP600XFY,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP600XFY_32, grammarAccess.getConstraintAccess().getOP600XFYTerminalRuleCall_4_2());
                      			
                    }
                    // InternalTExp.g:4744:4: ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) )
                    // InternalTExp.g:4745:5: ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) )
                    {
                    // InternalTExp.g:4745:5: ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) )
                    // InternalTExp.g:4746:6: (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' )
                    {
                    // InternalTExp.g:4746:6: (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' )
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==33) ) {
                        alt84=1;
                    }
                    else if ( (LA84_0==35) ) {
                        alt84=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 0, input);

                        throw nvae;
                    }
                    switch (alt84) {
                        case 1 :
                            // InternalTExp.g:4747:7: lv_parMin_33_1= '('
                            {
                            lv_parMin_33_1=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMin_33_1, grammarAccess.getConstraintAccess().getParMinLeftParenthesisKeyword_4_3_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConstraintRule());
                              							}
                              							setWithLastConsumed(current, "parMin", lv_parMin_33_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalTExp.g:4758:7: lv_parMin_33_2= '['
                            {
                            lv_parMin_33_2=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMin_33_2, grammarAccess.getConstraintAccess().getParMinLeftSquareBracketKeyword_4_3_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConstraintRule());
                              							}
                              							setWithLastConsumed(current, "parMin", lv_parMin_33_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalTExp.g:4771:4: ( (lv_minCardinality_34_0= RULE_INT ) )
                    // InternalTExp.g:4772:5: (lv_minCardinality_34_0= RULE_INT )
                    {
                    // InternalTExp.g:4772:5: (lv_minCardinality_34_0= RULE_INT )
                    // InternalTExp.g:4773:6: lv_minCardinality_34_0= RULE_INT
                    {
                    lv_minCardinality_34_0=(Token)match(input,RULE_INT,FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_minCardinality_34_0, grammarAccess.getConstraintAccess().getMinCardinalityINTTerminalRuleCall_4_4_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"minCardinality",
                      							lv_minCardinality_34_0,
                      							"it.unige.dibris.trace_expression_language.TExp.INT");
                      					
                    }

                    }


                    }

                    this_OP1000XFY_35=(Token)match(input,RULE_OP1000XFY,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP1000XFY_35, grammarAccess.getConstraintAccess().getOP1000XFYTerminalRuleCall_4_5());
                      			
                    }
                    // InternalTExp.g:4793:4: ( (lv_maxCardinality_36_0= RULE_INT ) )
                    // InternalTExp.g:4794:5: (lv_maxCardinality_36_0= RULE_INT )
                    {
                    // InternalTExp.g:4794:5: (lv_maxCardinality_36_0= RULE_INT )
                    // InternalTExp.g:4795:6: lv_maxCardinality_36_0= RULE_INT
                    {
                    lv_maxCardinality_36_0=(Token)match(input,RULE_INT,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_maxCardinality_36_0, grammarAccess.getConstraintAccess().getMaxCardinalityINTTerminalRuleCall_4_6_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstraintRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"maxCardinality",
                      							lv_maxCardinality_36_0,
                      							"it.unige.dibris.trace_expression_language.TExp.INT");
                      					
                    }

                    }


                    }

                    // InternalTExp.g:4811:4: ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) )
                    // InternalTExp.g:4812:5: ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) )
                    {
                    // InternalTExp.g:4812:5: ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) )
                    // InternalTExp.g:4813:6: (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' )
                    {
                    // InternalTExp.g:4813:6: (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' )
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==34) ) {
                        alt85=1;
                    }
                    else if ( (LA85_0==37) ) {
                        alt85=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 85, 0, input);

                        throw nvae;
                    }
                    switch (alt85) {
                        case 1 :
                            // InternalTExp.g:4814:7: lv_parMax_37_1= ')'
                            {
                            lv_parMax_37_1=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMax_37_1, grammarAccess.getConstraintAccess().getParMaxRightParenthesisKeyword_4_7_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConstraintRule());
                              							}
                              							setWithLastConsumed(current, "parMax", lv_parMax_37_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalTExp.g:4825:7: lv_parMax_37_2= ']'
                            {
                            lv_parMax_37_2=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_parMax_37_2, grammarAccess.getConstraintAccess().getParMaxRightSquareBracketKeyword_4_7_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getConstraintRule());
                              							}
                              							setWithLastConsumed(current, "parMax", lv_parMax_37_2, null);
                              						
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
    // InternalTExp.g:4843:1: entryRuleModule returns [String current=null] : iv_ruleModule= ruleModule EOF ;
    public final String entryRuleModule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModule = null;


        try {
            // InternalTExp.g:4843:46: (iv_ruleModule= ruleModule EOF )
            // InternalTExp.g:4844:2: iv_ruleModule= ruleModule EOF
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
    // InternalTExp.g:4850:1: ruleModule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VARIABLE_0= RULE_VARIABLE | this_ATOM_1= RULE_ATOM ) ;
    public final AntlrDatatypeRuleToken ruleModule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VARIABLE_0=null;
        Token this_ATOM_1=null;


        	enterRule();

        try {
            // InternalTExp.g:4856:2: ( (this_VARIABLE_0= RULE_VARIABLE | this_ATOM_1= RULE_ATOM ) )
            // InternalTExp.g:4857:2: (this_VARIABLE_0= RULE_VARIABLE | this_ATOM_1= RULE_ATOM )
            {
            // InternalTExp.g:4857:2: (this_VARIABLE_0= RULE_VARIABLE | this_ATOM_1= RULE_ATOM )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_VARIABLE) ) {
                alt87=1;
            }
            else if ( (LA87_0==RULE_ATOM) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalTExp.g:4858:3: this_VARIABLE_0= RULE_VARIABLE
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
                    // InternalTExp.g:4866:3: this_ATOM_1= RULE_ATOM
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

    // $ANTLR start synpred94_InternalTExp
    public final void synpred94_InternalTExp_fragment() throws RecognitionException {   
        EObject lv_seqExpr_1_0 = null;


        // InternalTExp.g:3168:3: ( ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) ) )
        // InternalTExp.g:3168:3: ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) )
        {
        // InternalTExp.g:3168:3: ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) )
        // InternalTExp.g:3169:4: () ( (lv_seqExpr_1_0= ruleSeqExpr ) )
        {
        // InternalTExp.g:3169:4: ()
        // InternalTExp.g:3170:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalTExp.g:3179:4: ( (lv_seqExpr_1_0= ruleSeqExpr ) )
        // InternalTExp.g:3180:5: (lv_seqExpr_1_0= ruleSeqExpr )
        {
        // InternalTExp.g:3180:5: (lv_seqExpr_1_0= ruleSeqExpr )
        // InternalTExp.g:3181:6: lv_seqExpr_1_0= ruleSeqExpr
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
    // $ANTLR end synpred94_InternalTExp

    // $ANTLR start synpred95_InternalTExp
    public final void synpred95_InternalTExp_fragment() throws RecognitionException {   
        EObject lv_filterExpr_3_0 = null;


        // InternalTExp.g:3200:3: ( ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) ) )
        // InternalTExp.g:3200:3: ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) )
        {
        // InternalTExp.g:3200:3: ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) )
        // InternalTExp.g:3201:4: () ( (lv_filterExpr_3_0= ruleFilterExpr ) )
        {
        // InternalTExp.g:3201:4: ()
        // InternalTExp.g:3202:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalTExp.g:3211:4: ( (lv_filterExpr_3_0= ruleFilterExpr ) )
        // InternalTExp.g:3212:5: (lv_filterExpr_3_0= ruleFilterExpr )
        {
        // InternalTExp.g:3212:5: (lv_filterExpr_3_0= ruleFilterExpr )
        // InternalTExp.g:3213:6: lv_filterExpr_3_0= ruleFilterExpr
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
    // $ANTLR end synpred95_InternalTExp

    // $ANTLR start synpred97_InternalTExp
    public final void synpred97_InternalTExp_fragment() throws RecognitionException {   
        // InternalTExp.g:3383:4: ( ( ( ruleID ) ) )
        // InternalTExp.g:3383:4: ( ( ruleID ) )
        {
        // InternalTExp.g:3383:4: ( ( ruleID ) )
        // InternalTExp.g:3384:5: ( ruleID )
        {
        // InternalTExp.g:3384:5: ( ruleID )
        // InternalTExp.g:3385:6: ruleID
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
    // $ANTLR end synpred97_InternalTExp

    // $ANTLR start synpred100_InternalTExp
    public final void synpred100_InternalTExp_fragment() throws RecognitionException {   
        // InternalTExp.g:3534:4: ( ( ( ruleID ) ) )
        // InternalTExp.g:3534:4: ( ( ruleID ) )
        {
        // InternalTExp.g:3534:4: ( ( ruleID ) )
        // InternalTExp.g:3535:5: ( ruleID )
        {
        // InternalTExp.g:3535:5: ( ruleID )
        // InternalTExp.g:3536:6: ruleID
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
    // $ANTLR end synpred100_InternalTExp

    // Delegated rules

    public final boolean synpred95_InternalTExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred95_InternalTExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_InternalTExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_InternalTExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred94_InternalTExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_InternalTExp_fragment(); // can never throw exception
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


    protected DFA86 dfa86 = new DFA86(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\43\1\4\3\uffff\1\4\1\100\2\uffff";
    static final String dfa_3s = "\1\104\1\4\3\uffff\1\45\1\101\2\uffff";
    static final String dfa_4s = "\2\uffff\1\3\1\4\1\5\2\uffff\1\2\1\1";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\36\uffff\1\2\1\3\1\4",
            "\1\5",
            "",
            "",
            "",
            "\1\5\40\uffff\1\6",
            "\1\10\1\7",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA86 extends DFA {

        public DFA86(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 86;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4352:2: ( (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' ) | (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' ) | ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) ) | ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) ) | ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000104000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000BC6FFFFF0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002BC6FFFFF0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000E0000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00FCE60000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00FCEE0000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00FCEE0000000410L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00FCEE0002000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00FCEE0000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00FCEE0800000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0100080000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080800000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000A00000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000000200010010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x8000000200000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000404000400L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000002800000400L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000002000000410L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000002400000000L});

}