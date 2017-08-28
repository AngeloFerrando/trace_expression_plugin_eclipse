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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ATOM", "RULE_OP1200XFX", "RULE_OP1200FX", "RULE_OP1150FX", "RULE_OP1100XFY", "RULE_OP1050XFY", "RULE_OP1000XFY", "RULE_OP954XFY", "RULE_OP900FY", "RULE_OP900FX", "RULE_OP700XFX", "RULE_OP700XFXR", "RULE_OP700XFXL", "RULE_OP600XFY", "RULE_OP500YFX", "RULE_OP500FX", "RULE_OP400YFX", "RULE_OP200XFX", "RULE_OP200XFY", "RULE_INT", "RULE_EXT_INT", "RULE_VARIABLE", "RULE_STRING", "RULE_OP400FX1", "RULE_WHITESPACE", "RULE_SINGLE_LINE_COMMENT", "'.'", "'!'", "'-'", "'('", "')'", "'['", "'|'", "']'", "'trace_expression'", "'{'", "'id:'", "'body:'", "'roles:'", "'types:'", "'modules:'", "'decentralized:'", "'true'", "'false'", "'partition:'", "'constraints:'", "'gui:'", "'minimal:'", "'threshold:'", "'channels:'", "'}'", "'<-'", "'\\\\/'", "'/\\\\'", "'*'", "'epsilon'", "'=>'", "'$'", "'-><-'", "'<-->'", "'number_singletons'", "'size_constraints'", "'number_constraints'"
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

                if ( (LA1_0==38) ) {
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
    // InternalTExp.g:1500:1: ruleTraceExpression returns [EObject current=null] : ( () otherlv_1= 'trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) )+ ) )+ otherlv_28= '}' ) ;
    public final EObject ruleTraceExpression() throws RecognitionException {
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
            // InternalTExp.g:1506:2: ( ( () otherlv_1= 'trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) )+ ) )+ otherlv_28= '}' ) )
            // InternalTExp.g:1507:2: ( () otherlv_1= 'trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) )+ ) )+ otherlv_28= '}' )
            {
            // InternalTExp.g:1507:2: ( () otherlv_1= 'trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) )+ ) )+ otherlv_28= '}' )
            // InternalTExp.g:1508:3: () otherlv_1= 'trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) )+ ) )+ otherlv_28= '}'
            {
            // InternalTExp.g:1508:3: ()
            // InternalTExp.g:1509:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTraceExpressionAccess().getTraceExpressionAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,38,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTraceExpressionAccess().getTrace_expressionKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,39,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTraceExpressionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,40,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTraceExpressionAccess().getIdKeyword_3());
              		
            }
            // InternalTExp.g:1530:3: ( (lv_name_4_0= ruleID ) )
            // InternalTExp.g:1531:4: (lv_name_4_0= ruleID )
            {
            // InternalTExp.g:1531:4: (lv_name_4_0= ruleID )
            // InternalTExp.g:1532:5: lv_name_4_0= ruleID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTraceExpressionAccess().getNameIDParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_name_4_0=ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTraceExpressionRule());
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

            // InternalTExp.g:1549:3: ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) )+ ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=12;
                switch ( input.LA(1) ) {
                case 41:
                    {
                    alt31=1;
                    }
                    break;
                case 42:
                    {
                    alt31=2;
                    }
                    break;
                case 43:
                    {
                    alt31=3;
                    }
                    break;
                case 44:
                    {
                    alt31=4;
                    }
                    break;
                case 45:
                    {
                    alt31=5;
                    }
                    break;
                case 48:
                    {
                    alt31=6;
                    }
                    break;
                case 49:
                    {
                    alt31=7;
                    }
                    break;
                case 50:
                    {
                    alt31=8;
                    }
                    break;
                case 51:
                    {
                    alt31=9;
                    }
                    break;
                case 52:
                    {
                    alt31=10;
                    }
                    break;
                case 53:
                    {
                    alt31=11;
                    }
                    break;

                }

                switch (alt31) {
            	case 1 :
            	    // InternalTExp.g:1550:4: ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ )
            	    {
            	    // InternalTExp.g:1550:4: ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ )
            	    // InternalTExp.g:1551:5: ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+
            	    {
            	    // InternalTExp.g:1551:5: ( (lv_bodyL_5_0= 'body:' ) )
            	    // InternalTExp.g:1552:6: (lv_bodyL_5_0= 'body:' )
            	    {
            	    // InternalTExp.g:1552:6: (lv_bodyL_5_0= 'body:' )
            	    // InternalTExp.g:1553:7: lv_bodyL_5_0= 'body:'
            	    {
            	    lv_bodyL_5_0=(Token)match(input,41,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_bodyL_5_0, grammarAccess.getTraceExpressionAccess().getBodyLBodyKeyword_5_0_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "bodyL", lv_bodyL_5_0, "body:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1565:5: ( (lv_terms_6_0= ruleTerm ) )+
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
            	    	    // InternalTExp.g:1566:6: (lv_terms_6_0= ruleTerm )
            	    	    {
            	    	    // InternalTExp.g:1566:6: (lv_terms_6_0= ruleTerm )
            	    	    // InternalTExp.g:1567:7: lv_terms_6_0= ruleTerm
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getTraceExpressionAccess().getTermsTermParserRuleCall_5_0_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_27);
            	    	    lv_terms_6_0=ruleTerm();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getTraceExpressionRule());
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
            	    // InternalTExp.g:1586:4: ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* )
            	    {
            	    // InternalTExp.g:1586:4: ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* )
            	    // InternalTExp.g:1587:5: ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )*
            	    {
            	    // InternalTExp.g:1587:5: ( (lv_rolesL_7_0= 'roles:' ) )
            	    // InternalTExp.g:1588:6: (lv_rolesL_7_0= 'roles:' )
            	    {
            	    // InternalTExp.g:1588:6: (lv_rolesL_7_0= 'roles:' )
            	    // InternalTExp.g:1589:7: lv_rolesL_7_0= 'roles:'
            	    {
            	    lv_rolesL_7_0=(Token)match(input,42,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_rolesL_7_0, grammarAccess.getTraceExpressionAccess().getRolesLRolesKeyword_5_1_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "rolesL", lv_rolesL_7_0, "roles:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1601:5: ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )*
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==RULE_ATOM) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // InternalTExp.g:1602:6: ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )?
            	    	    {
            	    	    // InternalTExp.g:1602:6: ( (lv_roles_8_0= ruleRole ) )
            	    	    // InternalTExp.g:1603:7: (lv_roles_8_0= ruleRole )
            	    	    {
            	    	    // InternalTExp.g:1603:7: (lv_roles_8_0= ruleRole )
            	    	    // InternalTExp.g:1604:8: lv_roles_8_0= ruleRole
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getTraceExpressionAccess().getRolesRoleParserRuleCall_5_1_1_0_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FOLLOW_28);
            	    	    lv_roles_8_0=ruleRole();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      								if (current==null) {
            	    	      									current = createModelElementForParent(grammarAccess.getTraceExpressionRule());
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

            	    	    // InternalTExp.g:1621:6: (this_OP1000XFY_9= RULE_OP1000XFY )?
            	    	    int alt22=2;
            	    	    int LA22_0 = input.LA(1);

            	    	    if ( (LA22_0==RULE_OP1000XFY) ) {
            	    	        alt22=1;
            	    	    }
            	    	    switch (alt22) {
            	    	        case 1 :
            	    	            // InternalTExp.g:1622:7: this_OP1000XFY_9= RULE_OP1000XFY
            	    	            {
            	    	            this_OP1000XFY_9=(Token)match(input,RULE_OP1000XFY,FOLLOW_27); if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              							newLeafNode(this_OP1000XFY_9, grammarAccess.getTraceExpressionAccess().getOP1000XFYTerminalRuleCall_5_1_1_1());
            	    	              						
            	    	            }

            	    	            }
            	    	            break;

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
            	case 3 :
            	    // InternalTExp.g:1630:4: ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleEventType ) )* )
            	    {
            	    // InternalTExp.g:1630:4: ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleEventType ) )* )
            	    // InternalTExp.g:1631:5: ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleEventType ) )*
            	    {
            	    // InternalTExp.g:1631:5: ( (lv_typesL_10_0= 'types:' ) )
            	    // InternalTExp.g:1632:6: (lv_typesL_10_0= 'types:' )
            	    {
            	    // InternalTExp.g:1632:6: (lv_typesL_10_0= 'types:' )
            	    // InternalTExp.g:1633:7: lv_typesL_10_0= 'types:'
            	    {
            	    lv_typesL_10_0=(Token)match(input,43,FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_typesL_10_0, grammarAccess.getTraceExpressionAccess().getTypesLTypesKeyword_5_2_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "typesL", lv_typesL_10_0, "types:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1645:5: ( (lv_types_11_0= ruleEventType ) )*
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==RULE_ATOM) ) {
            	            alt24=1;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // InternalTExp.g:1646:6: (lv_types_11_0= ruleEventType )
            	    	    {
            	    	    // InternalTExp.g:1646:6: (lv_types_11_0= ruleEventType )
            	    	    // InternalTExp.g:1647:7: lv_types_11_0= ruleEventType
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getTraceExpressionAccess().getTypesEventTypeParserRuleCall_5_2_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_27);
            	    	    lv_types_11_0=ruleEventType();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getTraceExpressionRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"types",
            	    	      								lv_types_11_0,
            	    	      								"it.unige.dibris.trace_expression_language.TExp.EventType");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop24;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalTExp.g:1666:4: ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* )
            	    {
            	    // InternalTExp.g:1666:4: ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* )
            	    // InternalTExp.g:1667:5: ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )*
            	    {
            	    // InternalTExp.g:1667:5: ( (lv_modulesL_12_0= 'modules:' ) )
            	    // InternalTExp.g:1668:6: (lv_modulesL_12_0= 'modules:' )
            	    {
            	    // InternalTExp.g:1668:6: (lv_modulesL_12_0= 'modules:' )
            	    // InternalTExp.g:1669:7: lv_modulesL_12_0= 'modules:'
            	    {
            	    lv_modulesL_12_0=(Token)match(input,44,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_modulesL_12_0, grammarAccess.getTraceExpressionAccess().getModulesLModulesKeyword_5_3_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "modulesL", lv_modulesL_12_0, "modules:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1681:5: ( (lv_modules_13_0= ruleModule ) )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==RULE_ATOM||LA25_0==RULE_VARIABLE) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalTExp.g:1682:6: (lv_modules_13_0= ruleModule )
            	    	    {
            	    	    // InternalTExp.g:1682:6: (lv_modules_13_0= ruleModule )
            	    	    // InternalTExp.g:1683:7: lv_modules_13_0= ruleModule
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getTraceExpressionAccess().getModulesModuleParserRuleCall_5_3_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_29);
            	    	    lv_modules_13_0=ruleModule();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getTraceExpressionRule());
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
            	    	    break loop25;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalTExp.g:1702:4: ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) )
            	    {
            	    // InternalTExp.g:1702:4: ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) )
            	    // InternalTExp.g:1703:5: ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) )
            	    {
            	    // InternalTExp.g:1703:5: ( (lv_decentralizedL_14_0= 'decentralized:' ) )
            	    // InternalTExp.g:1704:6: (lv_decentralizedL_14_0= 'decentralized:' )
            	    {
            	    // InternalTExp.g:1704:6: (lv_decentralizedL_14_0= 'decentralized:' )
            	    // InternalTExp.g:1705:7: lv_decentralizedL_14_0= 'decentralized:'
            	    {
            	    lv_decentralizedL_14_0=(Token)match(input,45,FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_decentralizedL_14_0, grammarAccess.getTraceExpressionAccess().getDecentralizedLDecentralizedKeyword_5_4_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "decentralizedL", lv_decentralizedL_14_0, "decentralized:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1717:5: ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) )
            	    // InternalTExp.g:1718:6: ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) )
            	    {
            	    // InternalTExp.g:1718:6: ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) )
            	    // InternalTExp.g:1719:7: (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' )
            	    {
            	    // InternalTExp.g:1719:7: (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==46) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==47) ) {
            	        alt26=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalTExp.g:1720:8: lv_decentralized_15_1= 'true'
            	            {
            	            lv_decentralized_15_1=(Token)match(input,46,FOLLOW_31); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_decentralized_15_1, grammarAccess.getTraceExpressionAccess().getDecentralizedTrueKeyword_5_4_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getTraceExpressionRule());
            	              								}
            	              								addWithLastConsumed(current, "decentralized", lv_decentralized_15_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTExp.g:1731:8: lv_decentralized_15_2= 'false'
            	            {
            	            lv_decentralized_15_2=(Token)match(input,47,FOLLOW_31); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_decentralized_15_2, grammarAccess.getTraceExpressionAccess().getDecentralizedFalseKeyword_5_4_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getTraceExpressionRule());
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
            	    // InternalTExp.g:1746:4: ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) )
            	    {
            	    // InternalTExp.g:1746:4: ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) )
            	    // InternalTExp.g:1747:5: ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) )
            	    {
            	    // InternalTExp.g:1747:5: ( (lv_partitionL_16_0= 'partition:' ) )
            	    // InternalTExp.g:1748:6: (lv_partitionL_16_0= 'partition:' )
            	    {
            	    // InternalTExp.g:1748:6: (lv_partitionL_16_0= 'partition:' )
            	    // InternalTExp.g:1749:7: lv_partitionL_16_0= 'partition:'
            	    {
            	    lv_partitionL_16_0=(Token)match(input,48,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_partitionL_16_0, grammarAccess.getTraceExpressionAccess().getPartitionLPartitionKeyword_5_5_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "partitionL", lv_partitionL_16_0, "partition:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1761:5: ( (lv_partition_17_0= rulePartition ) )
            	    // InternalTExp.g:1762:6: (lv_partition_17_0= rulePartition )
            	    {
            	    // InternalTExp.g:1762:6: (lv_partition_17_0= rulePartition )
            	    // InternalTExp.g:1763:7: lv_partition_17_0= rulePartition
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getTraceExpressionAccess().getPartitionPartitionParserRuleCall_5_5_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_partition_17_0=rulePartition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getTraceExpressionRule());
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
            	    // InternalTExp.g:1782:4: ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* )
            	    {
            	    // InternalTExp.g:1782:4: ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* )
            	    // InternalTExp.g:1783:5: ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )*
            	    {
            	    // InternalTExp.g:1783:5: ( (lv_constraintsL_18_0= 'constraints:' ) )
            	    // InternalTExp.g:1784:6: (lv_constraintsL_18_0= 'constraints:' )
            	    {
            	    // InternalTExp.g:1784:6: (lv_constraintsL_18_0= 'constraints:' )
            	    // InternalTExp.g:1785:7: lv_constraintsL_18_0= 'constraints:'
            	    {
            	    lv_constraintsL_18_0=(Token)match(input,49,FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_constraintsL_18_0, grammarAccess.getTraceExpressionAccess().getConstraintsLConstraintsKeyword_5_6_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "constraintsL", lv_constraintsL_18_0, "constraints:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1797:5: ( (lv_constraints_19_0= ruleConstraint ) )*
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==35||(LA27_0>=64 && LA27_0<=66)) ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // InternalTExp.g:1798:6: (lv_constraints_19_0= ruleConstraint )
            	    	    {
            	    	    // InternalTExp.g:1798:6: (lv_constraints_19_0= ruleConstraint )
            	    	    // InternalTExp.g:1799:7: lv_constraints_19_0= ruleConstraint
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getTraceExpressionAccess().getConstraintsConstraintParserRuleCall_5_6_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_33);
            	    	    lv_constraints_19_0=ruleConstraint();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getTraceExpressionRule());
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
            	    	    break loop27;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalTExp.g:1818:4: ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) )
            	    {
            	    // InternalTExp.g:1818:4: ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) )
            	    // InternalTExp.g:1819:5: ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) )
            	    {
            	    // InternalTExp.g:1819:5: ( (lv_guiL_20_0= 'gui:' ) )
            	    // InternalTExp.g:1820:6: (lv_guiL_20_0= 'gui:' )
            	    {
            	    // InternalTExp.g:1820:6: (lv_guiL_20_0= 'gui:' )
            	    // InternalTExp.g:1821:7: lv_guiL_20_0= 'gui:'
            	    {
            	    lv_guiL_20_0=(Token)match(input,50,FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_guiL_20_0, grammarAccess.getTraceExpressionAccess().getGuiLGuiKeyword_5_7_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "guiL", lv_guiL_20_0, "gui:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1833:5: ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) )
            	    // InternalTExp.g:1834:6: ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) )
            	    {
            	    // InternalTExp.g:1834:6: ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) )
            	    // InternalTExp.g:1835:7: (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' )
            	    {
            	    // InternalTExp.g:1835:7: (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==46) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==47) ) {
            	        alt28=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalTExp.g:1836:8: lv_gui_21_1= 'true'
            	            {
            	            lv_gui_21_1=(Token)match(input,46,FOLLOW_31); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_gui_21_1, grammarAccess.getTraceExpressionAccess().getGuiTrueKeyword_5_7_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getTraceExpressionRule());
            	              								}
            	              								addWithLastConsumed(current, "gui", lv_gui_21_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTExp.g:1847:8: lv_gui_21_2= 'false'
            	            {
            	            lv_gui_21_2=(Token)match(input,47,FOLLOW_31); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_gui_21_2, grammarAccess.getTraceExpressionAccess().getGuiFalseKeyword_5_7_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getTraceExpressionRule());
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
            	    // InternalTExp.g:1862:4: ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) )
            	    {
            	    // InternalTExp.g:1862:4: ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) )
            	    // InternalTExp.g:1863:5: ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) )
            	    {
            	    // InternalTExp.g:1863:5: ( (lv_minimalL_22_0= 'minimal:' ) )
            	    // InternalTExp.g:1864:6: (lv_minimalL_22_0= 'minimal:' )
            	    {
            	    // InternalTExp.g:1864:6: (lv_minimalL_22_0= 'minimal:' )
            	    // InternalTExp.g:1865:7: lv_minimalL_22_0= 'minimal:'
            	    {
            	    lv_minimalL_22_0=(Token)match(input,51,FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_minimalL_22_0, grammarAccess.getTraceExpressionAccess().getMinimalLMinimalKeyword_5_8_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "minimalL", lv_minimalL_22_0, "minimal:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1877:5: ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) )
            	    // InternalTExp.g:1878:6: ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) )
            	    {
            	    // InternalTExp.g:1878:6: ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) )
            	    // InternalTExp.g:1879:7: (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' )
            	    {
            	    // InternalTExp.g:1879:7: (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==46) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==47) ) {
            	        alt29=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalTExp.g:1880:8: lv_minimal_23_1= 'true'
            	            {
            	            lv_minimal_23_1=(Token)match(input,46,FOLLOW_31); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_minimal_23_1, grammarAccess.getTraceExpressionAccess().getMinimalTrueKeyword_5_8_1_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getTraceExpressionRule());
            	              								}
            	              								addWithLastConsumed(current, "minimal", lv_minimal_23_1, null);
            	              							
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalTExp.g:1891:8: lv_minimal_23_2= 'false'
            	            {
            	            lv_minimal_23_2=(Token)match(input,47,FOLLOW_31); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_minimal_23_2, grammarAccess.getTraceExpressionAccess().getMinimalFalseKeyword_5_8_1_0_1());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getTraceExpressionRule());
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
            	    // InternalTExp.g:1906:4: ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) )
            	    {
            	    // InternalTExp.g:1906:4: ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) )
            	    // InternalTExp.g:1907:5: ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) )
            	    {
            	    // InternalTExp.g:1907:5: ( (lv_thresholdL_24_0= 'threshold:' ) )
            	    // InternalTExp.g:1908:6: (lv_thresholdL_24_0= 'threshold:' )
            	    {
            	    // InternalTExp.g:1908:6: (lv_thresholdL_24_0= 'threshold:' )
            	    // InternalTExp.g:1909:7: lv_thresholdL_24_0= 'threshold:'
            	    {
            	    lv_thresholdL_24_0=(Token)match(input,52,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_thresholdL_24_0, grammarAccess.getTraceExpressionAccess().getThresholdLThresholdKeyword_5_9_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "thresholdL", lv_thresholdL_24_0, "threshold:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1921:5: ( (lv_threshold_25_0= ruleNUMBER ) )
            	    // InternalTExp.g:1922:6: (lv_threshold_25_0= ruleNUMBER )
            	    {
            	    // InternalTExp.g:1922:6: (lv_threshold_25_0= ruleNUMBER )
            	    // InternalTExp.g:1923:7: lv_threshold_25_0= ruleNUMBER
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getTraceExpressionAccess().getThresholdNUMBERParserRuleCall_5_9_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_31);
            	    lv_threshold_25_0=ruleNUMBER();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getTraceExpressionRule());
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
            	    // InternalTExp.g:1942:4: ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) )+ )
            	    {
            	    // InternalTExp.g:1942:4: ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) )+ )
            	    // InternalTExp.g:1943:5: ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) )+
            	    {
            	    // InternalTExp.g:1943:5: ( (lv_channelsL_26_0= 'channels:' ) )
            	    // InternalTExp.g:1944:6: (lv_channelsL_26_0= 'channels:' )
            	    {
            	    // InternalTExp.g:1944:6: (lv_channelsL_26_0= 'channels:' )
            	    // InternalTExp.g:1945:7: lv_channelsL_26_0= 'channels:'
            	    {
            	    lv_channelsL_26_0=(Token)match(input,53,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_channelsL_26_0, grammarAccess.getTraceExpressionAccess().getChannelsLChannelsKeyword_5_10_0_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getTraceExpressionRule());
            	      							}
            	      							addWithLastConsumed(current, "channelsL", lv_channelsL_26_0, "channels:");
            	      						
            	    }

            	    }


            	    }

            	    // InternalTExp.g:1957:5: ( (lv_channels_27_0= ruleChannel ) )+
            	    int cnt30=0;
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==RULE_ATOM) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // InternalTExp.g:1958:6: (lv_channels_27_0= ruleChannel )
            	    	    {
            	    	    // InternalTExp.g:1958:6: (lv_channels_27_0= ruleChannel )
            	    	    // InternalTExp.g:1959:7: lv_channels_27_0= ruleChannel
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getTraceExpressionAccess().getChannelsChannelParserRuleCall_5_10_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_27);
            	    	    lv_channels_27_0=ruleChannel();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getTraceExpressionRule());
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
            	    	    if ( cnt30 >= 1 ) break loop30;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(30, input);
            	                throw eee;
            	        }
            	        cnt30++;
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            otherlv_28=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_28, grammarAccess.getTraceExpressionAccess().getRightCurlyBracketKeyword_6());
              		
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
    // $ANTLR end "ruleTraceExpression"


    // $ANTLR start "entryRuleTerm"
    // InternalTExp.g:1986:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalTExp.g:1986:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalTExp.g:1987:2: iv_ruleTerm= ruleTerm EOF
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
    // InternalTExp.g:1993:1: ruleTerm returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleShuffleExpr ) ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:1999:2: ( ( ( (lv_name_0_0= ruleID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleShuffleExpr ) ) ) )
            // InternalTExp.g:2000:2: ( ( (lv_name_0_0= ruleID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleShuffleExpr ) ) )
            {
            // InternalTExp.g:2000:2: ( ( (lv_name_0_0= ruleID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleShuffleExpr ) ) )
            // InternalTExp.g:2001:3: ( (lv_name_0_0= ruleID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleShuffleExpr ) )
            {
            // InternalTExp.g:2001:3: ( (lv_name_0_0= ruleID ) )
            // InternalTExp.g:2002:4: (lv_name_0_0= ruleID )
            {
            // InternalTExp.g:2002:4: (lv_name_0_0= ruleID )
            // InternalTExp.g:2003:5: lv_name_0_0= ruleID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTermAccess().getNameIDParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_35);
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

            otherlv_1=(Token)match(input,55,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTermAccess().getLessThanSignHyphenMinusKeyword_1());
              		
            }
            // InternalTExp.g:2024:3: ( (lv_expr_2_0= ruleShuffleExpr ) )
            // InternalTExp.g:2025:4: (lv_expr_2_0= ruleShuffleExpr )
            {
            // InternalTExp.g:2025:4: (lv_expr_2_0= ruleShuffleExpr )
            // InternalTExp.g:2026:5: lv_expr_2_0= ruleShuffleExpr
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
    // InternalTExp.g:2047:1: entryRuleShuffleExpr returns [EObject current=null] : iv_ruleShuffleExpr= ruleShuffleExpr EOF ;
    public final EObject entryRuleShuffleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShuffleExpr = null;


        try {
            // InternalTExp.g:2047:52: (iv_ruleShuffleExpr= ruleShuffleExpr EOF )
            // InternalTExp.g:2048:2: iv_ruleShuffleExpr= ruleShuffleExpr EOF
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
    // InternalTExp.g:2054:1: ruleShuffleExpr returns [EObject current=null] : (this_UnionExpr_0= ruleUnionExpr ( () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) ) )* ) ;
    public final EObject ruleShuffleExpr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_UnionExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2060:2: ( (this_UnionExpr_0= ruleUnionExpr ( () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) ) )* ) )
            // InternalTExp.g:2061:2: (this_UnionExpr_0= ruleUnionExpr ( () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) ) )* )
            {
            // InternalTExp.g:2061:2: (this_UnionExpr_0= ruleUnionExpr ( () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) ) )* )
            // InternalTExp.g:2062:3: this_UnionExpr_0= ruleUnionExpr ( () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getShuffleExprAccess().getUnionExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_UnionExpr_0=ruleUnionExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnionExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:2073:3: ( () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==36) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalTExp.g:2074:4: () ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) ) ( (lv_right_3_0= ruleUnionExpr ) )
            	    {
            	    // InternalTExp.g:2074:4: ()
            	    // InternalTExp.g:2075:5: 
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

            	    // InternalTExp.g:2084:4: ( ( ( '|' ) )=> (lv_operator_2_0= '|' ) )
            	    // InternalTExp.g:2085:5: ( ( '|' ) )=> (lv_operator_2_0= '|' )
            	    {
            	    // InternalTExp.g:2089:5: (lv_operator_2_0= '|' )
            	    // InternalTExp.g:2090:6: lv_operator_2_0= '|'
            	    {
            	    lv_operator_2_0=(Token)match(input,36,FOLLOW_36); if (state.failed) return current;
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

            	    // InternalTExp.g:2102:4: ( (lv_right_3_0= ruleUnionExpr ) )
            	    // InternalTExp.g:2103:5: (lv_right_3_0= ruleUnionExpr )
            	    {
            	    // InternalTExp.g:2103:5: (lv_right_3_0= ruleUnionExpr )
            	    // InternalTExp.g:2104:6: lv_right_3_0= ruleUnionExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getShuffleExprAccess().getRightUnionExprParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_37);
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
            	    break loop32;
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
    // InternalTExp.g:2126:1: entryRuleUnionExpr returns [EObject current=null] : iv_ruleUnionExpr= ruleUnionExpr EOF ;
    public final EObject entryRuleUnionExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionExpr = null;


        try {
            // InternalTExp.g:2126:50: (iv_ruleUnionExpr= ruleUnionExpr EOF )
            // InternalTExp.g:2127:2: iv_ruleUnionExpr= ruleUnionExpr EOF
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
    // InternalTExp.g:2133:1: ruleUnionExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleUnionExpr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2139:2: ( (this_AndExpr_0= ruleAndExpr ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* ) )
            // InternalTExp.g:2140:2: (this_AndExpr_0= ruleAndExpr ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* )
            {
            // InternalTExp.g:2140:2: (this_AndExpr_0= ruleAndExpr ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* )
            // InternalTExp.g:2141:3: this_AndExpr_0= ruleAndExpr ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getUnionExprAccess().getAndExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:2152:3: ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==56) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalTExp.g:2153:4: () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= ruleAndExpr ) )
            	    {
            	    // InternalTExp.g:2153:4: ()
            	    // InternalTExp.g:2154:5: 
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

            	    // InternalTExp.g:2163:4: ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) )
            	    // InternalTExp.g:2164:5: ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' )
            	    {
            	    // InternalTExp.g:2168:5: (lv_operator_2_0= '\\\\/' )
            	    // InternalTExp.g:2169:6: lv_operator_2_0= '\\\\/'
            	    {
            	    lv_operator_2_0=(Token)match(input,56,FOLLOW_36); if (state.failed) return current;
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

            	    // InternalTExp.g:2181:4: ( (lv_right_3_0= ruleAndExpr ) )
            	    // InternalTExp.g:2182:5: (lv_right_3_0= ruleAndExpr )
            	    {
            	    // InternalTExp.g:2182:5: (lv_right_3_0= ruleAndExpr )
            	    // InternalTExp.g:2183:6: lv_right_3_0= ruleAndExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUnionExprAccess().getRightAndExprParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
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
            	    break loop33;
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
    // InternalTExp.g:2205:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // InternalTExp.g:2205:48: (iv_ruleAndExpr= ruleAndExpr EOF )
            // InternalTExp.g:2206:2: iv_ruleAndExpr= ruleAndExpr EOF
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
    // InternalTExp.g:2212:1: ruleAndExpr returns [EObject current=null] : (this_CatExpr_0= ruleCatExpr ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_CatExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2218:2: ( (this_CatExpr_0= ruleCatExpr ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )* ) )
            // InternalTExp.g:2219:2: (this_CatExpr_0= ruleCatExpr ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )* )
            {
            // InternalTExp.g:2219:2: (this_CatExpr_0= ruleCatExpr ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )* )
            // InternalTExp.g:2220:3: this_CatExpr_0= ruleCatExpr ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExprAccess().getCatExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_CatExpr_0=ruleCatExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CatExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:2231:3: ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==57) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalTExp.g:2232:4: () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) )
            	    {
            	    // InternalTExp.g:2232:4: ()
            	    // InternalTExp.g:2233:5: 
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

            	    // InternalTExp.g:2242:4: ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) )
            	    // InternalTExp.g:2243:5: ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' )
            	    {
            	    // InternalTExp.g:2247:5: (lv_operator_2_0= '/\\\\' )
            	    // InternalTExp.g:2248:6: lv_operator_2_0= '/\\\\'
            	    {
            	    lv_operator_2_0=(Token)match(input,57,FOLLOW_36); if (state.failed) return current;
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

            	    // InternalTExp.g:2260:4: ( (lv_right_3_0= ruleCatExpr ) )
            	    // InternalTExp.g:2261:5: (lv_right_3_0= ruleCatExpr )
            	    {
            	    // InternalTExp.g:2261:5: (lv_right_3_0= ruleCatExpr )
            	    // InternalTExp.g:2262:6: lv_right_3_0= ruleCatExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExprAccess().getRightCatExprParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
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
            	    break loop34;
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
    // InternalTExp.g:2284:1: entryRuleCatExpr returns [EObject current=null] : iv_ruleCatExpr= ruleCatExpr EOF ;
    public final EObject entryRuleCatExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatExpr = null;


        try {
            // InternalTExp.g:2284:48: (iv_ruleCatExpr= ruleCatExpr EOF )
            // InternalTExp.g:2285:2: iv_ruleCatExpr= ruleCatExpr EOF
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
    // InternalTExp.g:2291:1: ruleCatExpr returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleCatExpr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2297:2: ( (this_Primary_0= rulePrimary ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalTExp.g:2298:2: (this_Primary_0= rulePrimary ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalTExp.g:2298:2: (this_Primary_0= rulePrimary ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalTExp.g:2299:3: this_Primary_0= rulePrimary ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCatExprAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:2310:3: ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==58) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalTExp.g:2311:4: () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalTExp.g:2311:4: ()
            	    // InternalTExp.g:2312:5: 
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

            	    // InternalTExp.g:2321:4: ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) )
            	    // InternalTExp.g:2322:5: ( ( '*' ) )=> (lv_operator_2_0= '*' )
            	    {
            	    // InternalTExp.g:2326:5: (lv_operator_2_0= '*' )
            	    // InternalTExp.g:2327:6: lv_operator_2_0= '*'
            	    {
            	    lv_operator_2_0=(Token)match(input,58,FOLLOW_36); if (state.failed) return current;
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

            	    // InternalTExp.g:2339:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalTExp.g:2340:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalTExp.g:2340:5: (lv_right_3_0= rulePrimary )
            	    // InternalTExp.g:2341:6: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCatExprAccess().getRightPrimaryParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
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
            	    break loop35;
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
    // InternalTExp.g:2363:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalTExp.g:2363:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalTExp.g:2364:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalTExp.g:2370:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) ) | ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) ) | ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) ) | ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject lv_seqExpr_1_0 = null;

        EObject lv_filterExpr_3_0 = null;

        EObject lv_varExpr_5_0 = null;

        EObject lv_terminalExpr_7_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2376:2: ( ( ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) ) | ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) ) | ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) ) | ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) ) ) )
            // InternalTExp.g:2377:2: ( ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) ) | ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) ) | ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) ) | ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) ) )
            {
            // InternalTExp.g:2377:2: ( ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) ) | ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) ) | ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) ) | ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) ) )
            int alt36=4;
            switch ( input.LA(1) ) {
            case RULE_ATOM:
                {
                int LA36_1 = input.LA(2);

                if ( (synpred74_InternalTExp()) ) {
                    alt36=1;
                }
                else if ( (synpred75_InternalTExp()) ) {
                    alt36=2;
                }
                else if ( (true) ) {
                    alt36=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_OP700XFXL:
                {
                alt36=3;
                }
                break;
            case 33:
            case 59:
                {
                alt36=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalTExp.g:2378:3: ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) )
                    {
                    // InternalTExp.g:2378:3: ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) )
                    // InternalTExp.g:2379:4: () ( (lv_seqExpr_1_0= ruleSeqExpr ) )
                    {
                    // InternalTExp.g:2379:4: ()
                    // InternalTExp.g:2380:5: 
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

                    // InternalTExp.g:2389:4: ( (lv_seqExpr_1_0= ruleSeqExpr ) )
                    // InternalTExp.g:2390:5: (lv_seqExpr_1_0= ruleSeqExpr )
                    {
                    // InternalTExp.g:2390:5: (lv_seqExpr_1_0= ruleSeqExpr )
                    // InternalTExp.g:2391:6: lv_seqExpr_1_0= ruleSeqExpr
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
                    // InternalTExp.g:2410:3: ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) )
                    {
                    // InternalTExp.g:2410:3: ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) )
                    // InternalTExp.g:2411:4: () ( (lv_filterExpr_3_0= ruleFilterExpr ) )
                    {
                    // InternalTExp.g:2411:4: ()
                    // InternalTExp.g:2412:5: 
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

                    // InternalTExp.g:2421:4: ( (lv_filterExpr_3_0= ruleFilterExpr ) )
                    // InternalTExp.g:2422:5: (lv_filterExpr_3_0= ruleFilterExpr )
                    {
                    // InternalTExp.g:2422:5: (lv_filterExpr_3_0= ruleFilterExpr )
                    // InternalTExp.g:2423:6: lv_filterExpr_3_0= ruleFilterExpr
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
                    // InternalTExp.g:2442:3: ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) )
                    {
                    // InternalTExp.g:2442:3: ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) )
                    // InternalTExp.g:2443:4: () ( (lv_varExpr_5_0= ruleVarExpr ) )
                    {
                    // InternalTExp.g:2443:4: ()
                    // InternalTExp.g:2444:5: 
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

                    // InternalTExp.g:2453:4: ( (lv_varExpr_5_0= ruleVarExpr ) )
                    // InternalTExp.g:2454:5: (lv_varExpr_5_0= ruleVarExpr )
                    {
                    // InternalTExp.g:2454:5: (lv_varExpr_5_0= ruleVarExpr )
                    // InternalTExp.g:2455:6: lv_varExpr_5_0= ruleVarExpr
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
                    // InternalTExp.g:2474:3: ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) )
                    {
                    // InternalTExp.g:2474:3: ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) )
                    // InternalTExp.g:2475:4: () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) )
                    {
                    // InternalTExp.g:2475:4: ()
                    // InternalTExp.g:2476:5: 
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

                    // InternalTExp.g:2485:4: ( (lv_terminalExpr_7_0= ruleTerminalExpr ) )
                    // InternalTExp.g:2486:5: (lv_terminalExpr_7_0= ruleTerminalExpr )
                    {
                    // InternalTExp.g:2486:5: (lv_terminalExpr_7_0= ruleTerminalExpr )
                    // InternalTExp.g:2487:6: lv_terminalExpr_7_0= ruleTerminalExpr
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
    // InternalTExp.g:2509:1: entryRuleVarExpr returns [EObject current=null] : iv_ruleVarExpr= ruleVarExpr EOF ;
    public final EObject entryRuleVarExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarExpr = null;


        try {
            // InternalTExp.g:2509:48: (iv_ruleVarExpr= ruleVarExpr EOF )
            // InternalTExp.g:2510:2: iv_ruleVarExpr= ruleVarExpr EOF
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
    // InternalTExp.g:2516:1: ruleVarExpr returns [EObject current=null] : (this_OP700XFXL_0= RULE_OP700XFXL ( (lv_variable_1_0= RULE_VARIABLE ) ) this_OP1000XFY_2= RULE_OP1000XFY ( (lv_bodyVar_3_0= rulePrimary ) ) this_OP700XFXR_4= RULE_OP700XFXR ) ;
    public final EObject ruleVarExpr() throws RecognitionException {
        EObject current = null;

        Token this_OP700XFXL_0=null;
        Token lv_variable_1_0=null;
        Token this_OP1000XFY_2=null;
        Token this_OP700XFXR_4=null;
        EObject lv_bodyVar_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2522:2: ( (this_OP700XFXL_0= RULE_OP700XFXL ( (lv_variable_1_0= RULE_VARIABLE ) ) this_OP1000XFY_2= RULE_OP1000XFY ( (lv_bodyVar_3_0= rulePrimary ) ) this_OP700XFXR_4= RULE_OP700XFXR ) )
            // InternalTExp.g:2523:2: (this_OP700XFXL_0= RULE_OP700XFXL ( (lv_variable_1_0= RULE_VARIABLE ) ) this_OP1000XFY_2= RULE_OP1000XFY ( (lv_bodyVar_3_0= rulePrimary ) ) this_OP700XFXR_4= RULE_OP700XFXR )
            {
            // InternalTExp.g:2523:2: (this_OP700XFXL_0= RULE_OP700XFXL ( (lv_variable_1_0= RULE_VARIABLE ) ) this_OP1000XFY_2= RULE_OP1000XFY ( (lv_bodyVar_3_0= rulePrimary ) ) this_OP700XFXR_4= RULE_OP700XFXR )
            // InternalTExp.g:2524:3: this_OP700XFXL_0= RULE_OP700XFXL ( (lv_variable_1_0= RULE_VARIABLE ) ) this_OP1000XFY_2= RULE_OP1000XFY ( (lv_bodyVar_3_0= rulePrimary ) ) this_OP700XFXR_4= RULE_OP700XFXR
            {
            this_OP700XFXL_0=(Token)match(input,RULE_OP700XFXL,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OP700XFXL_0, grammarAccess.getVarExprAccess().getOP700XFXLTerminalRuleCall_0());
              		
            }
            // InternalTExp.g:2528:3: ( (lv_variable_1_0= RULE_VARIABLE ) )
            // InternalTExp.g:2529:4: (lv_variable_1_0= RULE_VARIABLE )
            {
            // InternalTExp.g:2529:4: (lv_variable_1_0= RULE_VARIABLE )
            // InternalTExp.g:2530:5: lv_variable_1_0= RULE_VARIABLE
            {
            lv_variable_1_0=(Token)match(input,RULE_VARIABLE,FOLLOW_42); if (state.failed) return current;
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

            this_OP1000XFY_2=(Token)match(input,RULE_OP1000XFY,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OP1000XFY_2, grammarAccess.getVarExprAccess().getOP1000XFYTerminalRuleCall_2());
              		
            }
            // InternalTExp.g:2550:3: ( (lv_bodyVar_3_0= rulePrimary ) )
            // InternalTExp.g:2551:4: (lv_bodyVar_3_0= rulePrimary )
            {
            // InternalTExp.g:2551:4: (lv_bodyVar_3_0= rulePrimary )
            // InternalTExp.g:2552:5: lv_bodyVar_3_0= rulePrimary
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarExprAccess().getBodyVarPrimaryParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_43);
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
    // InternalTExp.g:2577:1: entryRuleFilterExpr returns [EObject current=null] : iv_ruleFilterExpr= ruleFilterExpr EOF ;
    public final EObject entryRuleFilterExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterExpr = null;


        try {
            // InternalTExp.g:2577:51: (iv_ruleFilterExpr= ruleFilterExpr EOF )
            // InternalTExp.g:2578:2: iv_ruleFilterExpr= ruleFilterExpr EOF
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
    // InternalTExp.g:2584:1: ruleFilterExpr returns [EObject current=null] : ( ( ( ruleID ) ) (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? ( (lv_operator_6_0= RULE_OP400FX1 ) ) ( (lv_bodyFilter_7_0= rulePrimary ) ) ) ;
    public final EObject ruleFilterExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_OP1000XFY_3=null;
        Token otherlv_5=null;
        Token lv_operator_6_0=null;
        EObject lv_first_2_0 = null;

        EObject lv_exprs_4_0 = null;

        EObject lv_bodyFilter_7_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2590:2: ( ( ( ( ruleID ) ) (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? ( (lv_operator_6_0= RULE_OP400FX1 ) ) ( (lv_bodyFilter_7_0= rulePrimary ) ) ) )
            // InternalTExp.g:2591:2: ( ( ( ruleID ) ) (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? ( (lv_operator_6_0= RULE_OP400FX1 ) ) ( (lv_bodyFilter_7_0= rulePrimary ) ) )
            {
            // InternalTExp.g:2591:2: ( ( ( ruleID ) ) (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? ( (lv_operator_6_0= RULE_OP400FX1 ) ) ( (lv_bodyFilter_7_0= rulePrimary ) ) )
            // InternalTExp.g:2592:3: ( ( ruleID ) ) (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? ( (lv_operator_6_0= RULE_OP400FX1 ) ) ( (lv_bodyFilter_7_0= rulePrimary ) )
            {
            // InternalTExp.g:2592:3: ( ( ruleID ) )
            // InternalTExp.g:2593:4: ( ruleID )
            {
            // InternalTExp.g:2593:4: ( ruleID )
            // InternalTExp.g:2594:5: ruleID
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

              					newCompositeNode(grammarAccess.getFilterExprAccess().getTypeFilterEventTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_44);
            ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTExp.g:2611:3: (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==33) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalTExp.g:2612:4: otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getFilterExprAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:2616:4: ( (lv_first_2_0= ruleExpression0 ) )
                    // InternalTExp.g:2617:5: (lv_first_2_0= ruleExpression0 )
                    {
                    // InternalTExp.g:2617:5: (lv_first_2_0= ruleExpression0 )
                    // InternalTExp.g:2618:6: lv_first_2_0= ruleExpression0
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFilterExprAccess().getFirstExpression0ParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
                    lv_first_2_0=ruleExpression0();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFilterExprRule());
                      						}
                      						set(
                      							current,
                      							"first",
                      							lv_first_2_0,
                      							"it.unige.dibris.trace_expression_language.TExp.Expression0");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTExp.g:2635:4: (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==RULE_OP1000XFY) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalTExp.g:2636:5: this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) )
                    	    {
                    	    this_OP1000XFY_3=(Token)match(input,RULE_OP1000XFY,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OP1000XFY_3, grammarAccess.getFilterExprAccess().getOP1000XFYTerminalRuleCall_1_2_0());
                    	      				
                    	    }
                    	    // InternalTExp.g:2640:5: ( (lv_exprs_4_0= ruleExpression0 ) )
                    	    // InternalTExp.g:2641:6: (lv_exprs_4_0= ruleExpression0 )
                    	    {
                    	    // InternalTExp.g:2641:6: (lv_exprs_4_0= ruleExpression0 )
                    	    // InternalTExp.g:2642:7: lv_exprs_4_0= ruleExpression0
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFilterExprAccess().getExprsExpression0ParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_45);
                    	    lv_exprs_4_0=ruleExpression0();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFilterExprRule());
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
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,34,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFilterExprAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTExp.g:2665:3: ( (lv_operator_6_0= RULE_OP400FX1 ) )
            // InternalTExp.g:2666:4: (lv_operator_6_0= RULE_OP400FX1 )
            {
            // InternalTExp.g:2666:4: (lv_operator_6_0= RULE_OP400FX1 )
            // InternalTExp.g:2667:5: lv_operator_6_0= RULE_OP400FX1
            {
            lv_operator_6_0=(Token)match(input,RULE_OP400FX1,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_operator_6_0, grammarAccess.getFilterExprAccess().getOperatorOP400FX1TerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFilterExprRule());
              					}
              					setWithLastConsumed(
              						current,
              						"operator",
              						lv_operator_6_0,
              						"it.unige.dibris.trace_expression_language.TExp.OP400FX1");
              				
            }

            }


            }

            // InternalTExp.g:2683:3: ( (lv_bodyFilter_7_0= rulePrimary ) )
            // InternalTExp.g:2684:4: (lv_bodyFilter_7_0= rulePrimary )
            {
            // InternalTExp.g:2684:4: (lv_bodyFilter_7_0= rulePrimary )
            // InternalTExp.g:2685:5: lv_bodyFilter_7_0= rulePrimary
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFilterExprAccess().getBodyFilterPrimaryParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_bodyFilter_7_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFilterExprRule());
              					}
              					set(
              						current,
              						"bodyFilter",
              						lv_bodyFilter_7_0,
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
    // InternalTExp.g:2706:1: entryRuleSeqExpr returns [EObject current=null] : iv_ruleSeqExpr= ruleSeqExpr EOF ;
    public final EObject entryRuleSeqExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeqExpr = null;


        try {
            // InternalTExp.g:2706:48: (iv_ruleSeqExpr= ruleSeqExpr EOF )
            // InternalTExp.g:2707:2: iv_ruleSeqExpr= ruleSeqExpr EOF
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
    // InternalTExp.g:2713:1: ruleSeqExpr returns [EObject current=null] : ( ( ( ruleID ) ) (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? ( (lv_operator_6_0= RULE_OP600XFY ) ) ( (lv_bodySeq_7_0= rulePrimary ) ) ) ;
    public final EObject ruleSeqExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_OP1000XFY_3=null;
        Token otherlv_5=null;
        Token lv_operator_6_0=null;
        EObject lv_first_2_0 = null;

        EObject lv_exprs_4_0 = null;

        EObject lv_bodySeq_7_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2719:2: ( ( ( ( ruleID ) ) (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? ( (lv_operator_6_0= RULE_OP600XFY ) ) ( (lv_bodySeq_7_0= rulePrimary ) ) ) )
            // InternalTExp.g:2720:2: ( ( ( ruleID ) ) (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? ( (lv_operator_6_0= RULE_OP600XFY ) ) ( (lv_bodySeq_7_0= rulePrimary ) ) )
            {
            // InternalTExp.g:2720:2: ( ( ( ruleID ) ) (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? ( (lv_operator_6_0= RULE_OP600XFY ) ) ( (lv_bodySeq_7_0= rulePrimary ) ) )
            // InternalTExp.g:2721:3: ( ( ruleID ) ) (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? ( (lv_operator_6_0= RULE_OP600XFY ) ) ( (lv_bodySeq_7_0= rulePrimary ) )
            {
            // InternalTExp.g:2721:3: ( ( ruleID ) )
            // InternalTExp.g:2722:4: ( ruleID )
            {
            // InternalTExp.g:2722:4: ( ruleID )
            // InternalTExp.g:2723:5: ruleID
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

              					newCompositeNode(grammarAccess.getSeqExprAccess().getTypeSeqEventTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_47);
            ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTExp.g:2740:3: (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==33) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalTExp.g:2741:4: otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSeqExprAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:2745:4: ( (lv_first_2_0= ruleExpression0 ) )
                    // InternalTExp.g:2746:5: (lv_first_2_0= ruleExpression0 )
                    {
                    // InternalTExp.g:2746:5: (lv_first_2_0= ruleExpression0 )
                    // InternalTExp.g:2747:6: lv_first_2_0= ruleExpression0
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSeqExprAccess().getFirstExpression0ParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
                    lv_first_2_0=ruleExpression0();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSeqExprRule());
                      						}
                      						set(
                      							current,
                      							"first",
                      							lv_first_2_0,
                      							"it.unige.dibris.trace_expression_language.TExp.Expression0");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTExp.g:2764:4: (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_OP1000XFY) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalTExp.g:2765:5: this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) )
                    	    {
                    	    this_OP1000XFY_3=(Token)match(input,RULE_OP1000XFY,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OP1000XFY_3, grammarAccess.getSeqExprAccess().getOP1000XFYTerminalRuleCall_1_2_0());
                    	      				
                    	    }
                    	    // InternalTExp.g:2769:5: ( (lv_exprs_4_0= ruleExpression0 ) )
                    	    // InternalTExp.g:2770:6: (lv_exprs_4_0= ruleExpression0 )
                    	    {
                    	    // InternalTExp.g:2770:6: (lv_exprs_4_0= ruleExpression0 )
                    	    // InternalTExp.g:2771:7: lv_exprs_4_0= ruleExpression0
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSeqExprAccess().getExprsExpression0ParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_45);
                    	    lv_exprs_4_0=ruleExpression0();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getSeqExprRule());
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

                    otherlv_5=(Token)match(input,34,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getSeqExprAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTExp.g:2794:3: ( (lv_operator_6_0= RULE_OP600XFY ) )
            // InternalTExp.g:2795:4: (lv_operator_6_0= RULE_OP600XFY )
            {
            // InternalTExp.g:2795:4: (lv_operator_6_0= RULE_OP600XFY )
            // InternalTExp.g:2796:5: lv_operator_6_0= RULE_OP600XFY
            {
            lv_operator_6_0=(Token)match(input,RULE_OP600XFY,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_operator_6_0, grammarAccess.getSeqExprAccess().getOperatorOP600XFYTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSeqExprRule());
              					}
              					setWithLastConsumed(
              						current,
              						"operator",
              						lv_operator_6_0,
              						"it.unige.dibris.trace_expression_language.TExp.OP600XFY");
              				
            }

            }


            }

            // InternalTExp.g:2812:3: ( (lv_bodySeq_7_0= rulePrimary ) )
            // InternalTExp.g:2813:4: (lv_bodySeq_7_0= rulePrimary )
            {
            // InternalTExp.g:2813:4: (lv_bodySeq_7_0= rulePrimary )
            // InternalTExp.g:2814:5: lv_bodySeq_7_0= rulePrimary
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSeqExprAccess().getBodySeqPrimaryParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_bodySeq_7_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSeqExprRule());
              					}
              					set(
              						current,
              						"bodySeq",
              						lv_bodySeq_7_0,
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
    // InternalTExp.g:2835:1: entryRuleTerminalExpr returns [EObject current=null] : iv_ruleTerminalExpr= ruleTerminalExpr EOF ;
    public final EObject entryRuleTerminalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpr = null;


        try {
            // InternalTExp.g:2835:53: (iv_ruleTerminalExpr= ruleTerminalExpr EOF )
            // InternalTExp.g:2836:2: iv_ruleTerminalExpr= ruleTerminalExpr EOF
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
    // InternalTExp.g:2842:1: ruleTerminalExpr returns [EObject current=null] : ( ( (lv_eps_0_0= 'epsilon' ) ) | ( ( ruleID ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')' ) ) ;
    public final EObject ruleTerminalExpr() throws RecognitionException {
        EObject current = null;

        Token lv_eps_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2848:2: ( ( ( (lv_eps_0_0= 'epsilon' ) ) | ( ( ruleID ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')' ) ) )
            // InternalTExp.g:2849:2: ( ( (lv_eps_0_0= 'epsilon' ) ) | ( ( ruleID ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')' ) )
            {
            // InternalTExp.g:2849:2: ( ( (lv_eps_0_0= 'epsilon' ) ) | ( ( ruleID ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')' ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt41=1;
                }
                break;
            case RULE_ATOM:
                {
                alt41=2;
                }
                break;
            case 33:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalTExp.g:2850:3: ( (lv_eps_0_0= 'epsilon' ) )
                    {
                    // InternalTExp.g:2850:3: ( (lv_eps_0_0= 'epsilon' ) )
                    // InternalTExp.g:2851:4: (lv_eps_0_0= 'epsilon' )
                    {
                    // InternalTExp.g:2851:4: (lv_eps_0_0= 'epsilon' )
                    // InternalTExp.g:2852:5: lv_eps_0_0= 'epsilon'
                    {
                    lv_eps_0_0=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
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
                    // InternalTExp.g:2865:3: ( ( ruleID ) )
                    {
                    // InternalTExp.g:2865:3: ( ( ruleID ) )
                    // InternalTExp.g:2866:4: ( ruleID )
                    {
                    // InternalTExp.g:2866:4: ( ruleID )
                    // InternalTExp.g:2867:5: ruleID
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
                    // InternalTExp.g:2885:3: (otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')' )
                    {
                    // InternalTExp.g:2885:3: (otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')' )
                    // InternalTExp.g:2886:4: otherlv_2= '(' ( (lv_expr_3_0= ruleShuffleExpr ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTerminalExprAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalTExp.g:2890:4: ( (lv_expr_3_0= ruleShuffleExpr ) )
                    // InternalTExp.g:2891:5: (lv_expr_3_0= ruleShuffleExpr )
                    {
                    // InternalTExp.g:2891:5: (lv_expr_3_0= ruleShuffleExpr )
                    // InternalTExp.g:2892:6: lv_expr_3_0= ruleShuffleExpr
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


    // $ANTLR start "entryRuleEventType"
    // InternalTExp.g:2918:1: entryRuleEventType returns [EObject current=null] : iv_ruleEventType= ruleEventType EOF ;
    public final EObject entryRuleEventType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventType = null;


        try {
            // InternalTExp.g:2918:50: (iv_ruleEventType= ruleEventType EOF )
            // InternalTExp.g:2919:2: iv_ruleEventType= ruleEventType EOF
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
    // InternalTExp.g:2925:1: ruleEventType returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_msgs_8_0= ruleMsg ) )* otherlv_9= '}' (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )? ) ;
    public final EObject ruleEventType() throws RecognitionException {
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
            // InternalTExp.g:2931:2: ( ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_msgs_8_0= ruleMsg ) )* otherlv_9= '}' (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )? ) )
            // InternalTExp.g:2932:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_msgs_8_0= ruleMsg ) )* otherlv_9= '}' (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )? )
            {
            // InternalTExp.g:2932:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_msgs_8_0= ruleMsg ) )* otherlv_9= '}' (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )? )
            // InternalTExp.g:2933:3: ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_msgs_8_0= ruleMsg ) )* otherlv_9= '}' (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )?
            {
            // InternalTExp.g:2933:3: ( (lv_name_0_0= ruleID ) )
            // InternalTExp.g:2934:4: (lv_name_0_0= ruleID )
            {
            // InternalTExp.g:2934:4: (lv_name_0_0= ruleID )
            // InternalTExp.g:2935:5: lv_name_0_0= ruleID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEventTypeAccess().getNameIDParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_47);
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

            // InternalTExp.g:2952:3: (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==33) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalTExp.g:2953:4: otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEventTypeAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:2957:4: ( (lv_expr_2_0= ruleExpression0 ) )
                    // InternalTExp.g:2958:5: (lv_expr_2_0= ruleExpression0 )
                    {
                    // InternalTExp.g:2958:5: (lv_expr_2_0= ruleExpression0 )
                    // InternalTExp.g:2959:6: lv_expr_2_0= ruleExpression0
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEventTypeAccess().getExprExpression0ParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_45);
                    lv_expr_2_0=ruleExpression0();

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
                      							"it.unige.dibris.trace_expression_language.TExp.Expression0");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTExp.g:2976:4: (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_OP1000XFY) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalTExp.g:2977:5: this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) )
                    	    {
                    	    this_OP1000XFY_3=(Token)match(input,RULE_OP1000XFY,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OP1000XFY_3, grammarAccess.getEventTypeAccess().getOP1000XFYTerminalRuleCall_1_2_0());
                    	      				
                    	    }
                    	    // InternalTExp.g:2981:5: ( (lv_exprs_4_0= ruleExpression0 ) )
                    	    // InternalTExp.g:2982:6: (lv_exprs_4_0= ruleExpression0 )
                    	    {
                    	    // InternalTExp.g:2982:6: (lv_exprs_4_0= ruleExpression0 )
                    	    // InternalTExp.g:2983:7: lv_exprs_4_0= ruleExpression0
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEventTypeAccess().getExprsExpression0ParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_45);
                    	    lv_exprs_4_0=ruleExpression0();

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
                    	      								"it.unige.dibris.trace_expression_language.TExp.Expression0");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,34,FOLLOW_48); if (state.failed) return current;
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
            otherlv_7=(Token)match(input,39,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getEventTypeAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalTExp.g:3014:3: ( (lv_msgs_8_0= ruleMsg ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ATOM||LA44_0==35) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalTExp.g:3015:4: (lv_msgs_8_0= ruleMsg )
            	    {
            	    // InternalTExp.g:3015:4: (lv_msgs_8_0= ruleMsg )
            	    // InternalTExp.g:3016:5: lv_msgs_8_0= ruleMsg
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEventTypeAccess().getMsgsMsgParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_49);
            	    lv_msgs_8_0=ruleMsg();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEventTypeRule());
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
            	    break loop44;
                }
            } while (true);

            otherlv_9=(Token)match(input,54,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getEventTypeAccess().getRightCurlyBracketKeyword_5());
              		
            }
            // InternalTExp.g:3037:3: (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==35) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalTExp.g:3038:4: otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']'
                    {
                    otherlv_10=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getEventTypeAccess().getLeftSquareBracketKeyword_6_0());
                      			
                    }
                    // InternalTExp.g:3042:4: ( ( ruleID ) )
                    // InternalTExp.g:3043:5: ( ruleID )
                    {
                    // InternalTExp.g:3043:5: ( ruleID )
                    // InternalTExp.g:3044:6: ruleID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEventTypeRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEventTypeAccess().getChannelChannelCrossReference_6_1_0());
                      					
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

                      				newLeafNode(otherlv_12, grammarAccess.getEventTypeAccess().getRightSquareBracketKeyword_6_2());
                      			
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
    // $ANTLR end "ruleEventType"


    // $ANTLR start "entryRuleMsg"
    // InternalTExp.g:3070:1: entryRuleMsg returns [EObject current=null] : iv_ruleMsg= ruleMsg EOF ;
    public final EObject entryRuleMsg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMsg = null;


        try {
            // InternalTExp.g:3070:44: (iv_ruleMsg= ruleMsg EOF )
            // InternalTExp.g:3071:2: iv_ruleMsg= ruleMsg EOF
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
    // InternalTExp.g:3077:1: ruleMsg returns [EObject current=null] : ( ( (otherlv_0= '[' ( ( ruleID ) ) otherlv_2= '=>' otherlv_3= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_6= '[' otherlv_7= '=>' ( ( ruleID ) ) otherlv_9= ']' ) | ( ( ( ruleID ) ) otherlv_11= '=>' ( ( ruleID ) ) ) ) this_OP600XFY_13= RULE_OP600XFY ( ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' ) | ( (lv_content_18_0= ruleExpression0 ) ) ) (otherlv_19= '[' ( (lv_conditions_20_0= ruleExpressionInfinity ) ) otherlv_21= ']' )? ) ;
    public final EObject ruleMsg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token this_OP600XFY_13=null;
        Token lv_performative_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_content_16_0 = null;

        EObject lv_content_18_0 = null;

        EObject lv_conditions_20_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:3083:2: ( ( ( (otherlv_0= '[' ( ( ruleID ) ) otherlv_2= '=>' otherlv_3= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_6= '[' otherlv_7= '=>' ( ( ruleID ) ) otherlv_9= ']' ) | ( ( ( ruleID ) ) otherlv_11= '=>' ( ( ruleID ) ) ) ) this_OP600XFY_13= RULE_OP600XFY ( ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' ) | ( (lv_content_18_0= ruleExpression0 ) ) ) (otherlv_19= '[' ( (lv_conditions_20_0= ruleExpressionInfinity ) ) otherlv_21= ']' )? ) )
            // InternalTExp.g:3084:2: ( ( (otherlv_0= '[' ( ( ruleID ) ) otherlv_2= '=>' otherlv_3= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_6= '[' otherlv_7= '=>' ( ( ruleID ) ) otherlv_9= ']' ) | ( ( ( ruleID ) ) otherlv_11= '=>' ( ( ruleID ) ) ) ) this_OP600XFY_13= RULE_OP600XFY ( ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' ) | ( (lv_content_18_0= ruleExpression0 ) ) ) (otherlv_19= '[' ( (lv_conditions_20_0= ruleExpressionInfinity ) ) otherlv_21= ']' )? )
            {
            // InternalTExp.g:3084:2: ( ( (otherlv_0= '[' ( ( ruleID ) ) otherlv_2= '=>' otherlv_3= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_6= '[' otherlv_7= '=>' ( ( ruleID ) ) otherlv_9= ']' ) | ( ( ( ruleID ) ) otherlv_11= '=>' ( ( ruleID ) ) ) ) this_OP600XFY_13= RULE_OP600XFY ( ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' ) | ( (lv_content_18_0= ruleExpression0 ) ) ) (otherlv_19= '[' ( (lv_conditions_20_0= ruleExpressionInfinity ) ) otherlv_21= ']' )? )
            // InternalTExp.g:3085:3: ( (otherlv_0= '[' ( ( ruleID ) ) otherlv_2= '=>' otherlv_3= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_6= '[' otherlv_7= '=>' ( ( ruleID ) ) otherlv_9= ']' ) | ( ( ( ruleID ) ) otherlv_11= '=>' ( ( ruleID ) ) ) ) this_OP600XFY_13= RULE_OP600XFY ( ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' ) | ( (lv_content_18_0= ruleExpression0 ) ) ) (otherlv_19= '[' ( (lv_conditions_20_0= ruleExpressionInfinity ) ) otherlv_21= ']' )?
            {
            // InternalTExp.g:3085:3: ( (otherlv_0= '[' ( ( ruleID ) ) otherlv_2= '=>' otherlv_3= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_6= '[' otherlv_7= '=>' ( ( ruleID ) ) otherlv_9= ']' ) | ( ( ( ruleID ) ) otherlv_11= '=>' ( ( ruleID ) ) ) )
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==35) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_ATOM) ) {
                int LA46_2 = input.LA(2);

                if ( (LA46_2==35) ) {
                    alt46=2;
                }
                else if ( (LA46_2==60) ) {
                    alt46=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalTExp.g:3086:4: (otherlv_0= '[' ( ( ruleID ) ) otherlv_2= '=>' otherlv_3= ']' ( ( ruleID ) ) )
                    {
                    // InternalTExp.g:3086:4: (otherlv_0= '[' ( ( ruleID ) ) otherlv_2= '=>' otherlv_3= ']' ( ( ruleID ) ) )
                    // InternalTExp.g:3087:5: otherlv_0= '[' ( ( ruleID ) ) otherlv_2= '=>' otherlv_3= ']' ( ( ruleID ) )
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getMsgAccess().getLeftSquareBracketKeyword_0_0_0());
                      				
                    }
                    // InternalTExp.g:3091:5: ( ( ruleID ) )
                    // InternalTExp.g:3092:6: ( ruleID )
                    {
                    // InternalTExp.g:3092:6: ( ruleID )
                    // InternalTExp.g:3093:7: ruleID
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

                      							newCompositeNode(grammarAccess.getMsgAccess().getAsync_senderRoleCrossReference_0_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_51);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,60,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getMsgAccess().getEqualsSignGreaterThanSignKeyword_0_0_2());
                      				
                    }
                    otherlv_3=(Token)match(input,37,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getMsgAccess().getRightSquareBracketKeyword_0_0_3());
                      				
                    }
                    // InternalTExp.g:3118:5: ( ( ruleID ) )
                    // InternalTExp.g:3119:6: ( ruleID )
                    {
                    // InternalTExp.g:3119:6: ( ruleID )
                    // InternalTExp.g:3120:7: ruleID
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

                      							newCompositeNode(grammarAccess.getMsgAccess().getReceiverRoleCrossReference_0_0_4_0());
                      						
                    }
                    pushFollow(FOLLOW_48);
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
                    // InternalTExp.g:3139:4: ( ( ( ruleID ) ) otherlv_6= '[' otherlv_7= '=>' ( ( ruleID ) ) otherlv_9= ']' )
                    {
                    // InternalTExp.g:3139:4: ( ( ( ruleID ) ) otherlv_6= '[' otherlv_7= '=>' ( ( ruleID ) ) otherlv_9= ']' )
                    // InternalTExp.g:3140:5: ( ( ruleID ) ) otherlv_6= '[' otherlv_7= '=>' ( ( ruleID ) ) otherlv_9= ']'
                    {
                    // InternalTExp.g:3140:5: ( ( ruleID ) )
                    // InternalTExp.g:3141:6: ( ruleID )
                    {
                    // InternalTExp.g:3141:6: ( ruleID )
                    // InternalTExp.g:3142:7: ruleID
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

                      							newCompositeNode(grammarAccess.getMsgAccess().getSenderRoleCrossReference_0_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_32);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,35,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getMsgAccess().getLeftSquareBracketKeyword_0_1_1());
                      				
                    }
                    otherlv_7=(Token)match(input,60,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getMsgAccess().getEqualsSignGreaterThanSignKeyword_0_1_2());
                      				
                    }
                    // InternalTExp.g:3167:5: ( ( ruleID ) )
                    // InternalTExp.g:3168:6: ( ruleID )
                    {
                    // InternalTExp.g:3168:6: ( ruleID )
                    // InternalTExp.g:3169:7: ruleID
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

                      							newCompositeNode(grammarAccess.getMsgAccess().getAsync_receiverRoleCrossReference_0_1_3_0());
                      						
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

                    otherlv_9=(Token)match(input,37,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getMsgAccess().getRightSquareBracketKeyword_0_1_4());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTExp.g:3192:4: ( ( ( ruleID ) ) otherlv_11= '=>' ( ( ruleID ) ) )
                    {
                    // InternalTExp.g:3192:4: ( ( ( ruleID ) ) otherlv_11= '=>' ( ( ruleID ) ) )
                    // InternalTExp.g:3193:5: ( ( ruleID ) ) otherlv_11= '=>' ( ( ruleID ) )
                    {
                    // InternalTExp.g:3193:5: ( ( ruleID ) )
                    // InternalTExp.g:3194:6: ( ruleID )
                    {
                    // InternalTExp.g:3194:6: ( ruleID )
                    // InternalTExp.g:3195:7: ruleID
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

                      							newCompositeNode(grammarAccess.getMsgAccess().getSenderRoleCrossReference_0_2_0_0());
                      						
                    }
                    pushFollow(FOLLOW_51);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,60,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getMsgAccess().getEqualsSignGreaterThanSignKeyword_0_2_1());
                      				
                    }
                    // InternalTExp.g:3216:5: ( ( ruleID ) )
                    // InternalTExp.g:3217:6: ( ruleID )
                    {
                    // InternalTExp.g:3217:6: ( ruleID )
                    // InternalTExp.g:3218:7: ruleID
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

                      							newCompositeNode(grammarAccess.getMsgAccess().getReceiverRoleCrossReference_0_2_2_0());
                      						
                    }
                    pushFollow(FOLLOW_48);
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

            this_OP600XFY_13=(Token)match(input,RULE_OP600XFY,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OP600XFY_13, grammarAccess.getMsgAccess().getOP600XFYTerminalRuleCall_1());
              		
            }
            // InternalTExp.g:3241:3: ( ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' ) | ( (lv_content_18_0= ruleExpression0 ) ) )
            int alt47=2;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // InternalTExp.g:3242:4: ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' )
                    {
                    // InternalTExp.g:3242:4: ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' )
                    // InternalTExp.g:3243:5: ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')'
                    {
                    // InternalTExp.g:3243:5: ( (lv_performative_14_0= RULE_ATOM ) )
                    // InternalTExp.g:3244:6: (lv_performative_14_0= RULE_ATOM )
                    {
                    // InternalTExp.g:3244:6: (lv_performative_14_0= RULE_ATOM )
                    // InternalTExp.g:3245:7: lv_performative_14_0= RULE_ATOM
                    {
                    lv_performative_14_0=(Token)match(input,RULE_ATOM,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_performative_14_0, grammarAccess.getMsgAccess().getPerformativeATOMTerminalRuleCall_2_0_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMsgRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"performative",
                      								lv_performative_14_0,
                      								"it.unige.dibris.trace_expression_language.TExp.ATOM");
                      						
                    }

                    }


                    }

                    otherlv_15=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_15, grammarAccess.getMsgAccess().getLeftParenthesisKeyword_2_0_1());
                      				
                    }
                    // InternalTExp.g:3265:5: ( (lv_content_16_0= ruleExpression0 ) )
                    // InternalTExp.g:3266:6: (lv_content_16_0= ruleExpression0 )
                    {
                    // InternalTExp.g:3266:6: (lv_content_16_0= ruleExpression0 )
                    // InternalTExp.g:3267:7: lv_content_16_0= ruleExpression0
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMsgAccess().getContentExpression0ParserRuleCall_2_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_19);
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

                    otherlv_17=(Token)match(input,34,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_17, grammarAccess.getMsgAccess().getRightParenthesisKeyword_2_0_3());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTExp.g:3290:4: ( (lv_content_18_0= ruleExpression0 ) )
                    {
                    // InternalTExp.g:3290:4: ( (lv_content_18_0= ruleExpression0 ) )
                    // InternalTExp.g:3291:5: (lv_content_18_0= ruleExpression0 )
                    {
                    // InternalTExp.g:3291:5: (lv_content_18_0= ruleExpression0 )
                    // InternalTExp.g:3292:6: lv_content_18_0= ruleExpression0
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMsgAccess().getContentExpression0ParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_50);
                    lv_content_18_0=ruleExpression0();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMsgRule());
                      						}
                      						set(
                      							current,
                      							"content",
                      							lv_content_18_0,
                      							"it.unige.dibris.trace_expression_language.TExp.Expression0");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalTExp.g:3310:3: (otherlv_19= '[' ( (lv_conditions_20_0= ruleExpressionInfinity ) ) otherlv_21= ']' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==35) ) {
                int LA48_1 = input.LA(2);

                if ( ((LA48_1>=RULE_OP1200XFX && LA48_1<=RULE_INT)||(LA48_1>=RULE_VARIABLE && LA48_1<=RULE_STRING)||(LA48_1>=30 && LA48_1<=33)||LA48_1==35) ) {
                    alt48=1;
                }
                else if ( (LA48_1==RULE_ATOM) ) {
                    int LA48_4 = input.LA(3);

                    if ( ((LA48_4>=RULE_OP1100XFY && LA48_4<=RULE_OP954XFY)||(LA48_4>=RULE_OP700XFX && LA48_4<=RULE_OP500YFX)||(LA48_4>=RULE_OP400YFX && LA48_4<=RULE_OP200XFY)||LA48_4==33||LA48_4==37) ) {
                        alt48=1;
                    }
                }
            }
            switch (alt48) {
                case 1 :
                    // InternalTExp.g:3311:4: otherlv_19= '[' ( (lv_conditions_20_0= ruleExpressionInfinity ) ) otherlv_21= ']'
                    {
                    otherlv_19=(Token)match(input,35,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getMsgAccess().getLeftSquareBracketKeyword_3_0());
                      			
                    }
                    // InternalTExp.g:3315:4: ( (lv_conditions_20_0= ruleExpressionInfinity ) )
                    // InternalTExp.g:3316:5: (lv_conditions_20_0= ruleExpressionInfinity )
                    {
                    // InternalTExp.g:3316:5: (lv_conditions_20_0= ruleExpressionInfinity )
                    // InternalTExp.g:3317:6: lv_conditions_20_0= ruleExpressionInfinity
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMsgAccess().getConditionsExpressionInfinityParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_conditions_20_0=ruleExpressionInfinity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMsgRule());
                      						}
                      						set(
                      							current,
                      							"conditions",
                      							lv_conditions_20_0,
                      							"it.unige.dibris.trace_expression_language.TExp.ExpressionInfinity");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_21=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getMsgAccess().getRightSquareBracketKeyword_3_2());
                      			
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
    // InternalTExp.g:3343:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalTExp.g:3343:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalTExp.g:3344:2: iv_ruleChannel= ruleChannel EOF
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
    // InternalTExp.g:3350:1: ruleChannel returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' )? ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_reliability_2_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:3356:2: ( ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' )? ) )
            // InternalTExp.g:3357:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' )? )
            {
            // InternalTExp.g:3357:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' )? )
            // InternalTExp.g:3358:3: ( (lv_name_0_0= ruleID ) ) (otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' )?
            {
            // InternalTExp.g:3358:3: ( (lv_name_0_0= ruleID ) )
            // InternalTExp.g:3359:4: (lv_name_0_0= ruleID )
            {
            // InternalTExp.g:3359:4: (lv_name_0_0= ruleID )
            // InternalTExp.g:3360:5: lv_name_0_0= ruleID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChannelAccess().getNameIDParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_50);
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

            // InternalTExp.g:3377:3: (otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==35) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalTExp.g:3378:4: otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getChannelAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:3382:4: ( (lv_reliability_2_0= ruleNUMBER ) )
                    // InternalTExp.g:3383:5: (lv_reliability_2_0= ruleNUMBER )
                    {
                    // InternalTExp.g:3383:5: (lv_reliability_2_0= ruleNUMBER )
                    // InternalTExp.g:3384:6: lv_reliability_2_0= ruleNUMBER
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
    // InternalTExp.g:3410:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalTExp.g:3410:45: (iv_ruleRole= ruleRole EOF )
            // InternalTExp.g:3411:2: iv_ruleRole= ruleRole EOF
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
    // InternalTExp.g:3417:1: ruleRole returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )? ) ;
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
            // InternalTExp.g:3423:2: ( ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )? ) )
            // InternalTExp.g:3424:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )? )
            {
            // InternalTExp.g:3424:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )? )
            // InternalTExp.g:3425:3: ( (lv_name_0_0= ruleID ) ) (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )?
            {
            // InternalTExp.g:3425:3: ( (lv_name_0_0= ruleID ) )
            // InternalTExp.g:3426:4: (lv_name_0_0= ruleID )
            {
            // InternalTExp.g:3426:4: (lv_name_0_0= ruleID )
            // InternalTExp.g:3427:5: lv_name_0_0= ruleID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRoleAccess().getNameIDParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_53);
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

            // InternalTExp.g:3444:3: (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==61) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalTExp.g:3445:4: otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$'
                    {
                    otherlv_1=(Token)match(input,61,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getDollarSignKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:3449:4: ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) )
                    // InternalTExp.g:3450:5: ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) )
                    {
                    // InternalTExp.g:3450:5: ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) )
                    // InternalTExp.g:3451:6: (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM )
                    {
                    // InternalTExp.g:3451:6: (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_VARIABLE) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==RULE_ATOM) ) {
                        alt50=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalTExp.g:3452:7: lv_class_2_1= RULE_VARIABLE
                            {
                            lv_class_2_1=(Token)match(input,RULE_VARIABLE,FOLLOW_55); if (state.failed) return current;
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
                            // InternalTExp.g:3467:7: lv_class_2_2= RULE_ATOM
                            {
                            lv_class_2_2=(Token)match(input,RULE_ATOM,FOLLOW_55); if (state.failed) return current;
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

                    // InternalTExp.g:3484:4: (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==33) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalTExp.g:3485:5: otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')'
                            {
                            otherlv_3=(Token)match(input,33,FOLLOW_56); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getLeftParenthesisKeyword_1_2_0());
                              				
                            }
                            // InternalTExp.g:3489:5: ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==RULE_STRING) ) {
                                    alt52=1;
                                }


                                switch (alt52) {
                            	case 1 :
                            	    // InternalTExp.g:3490:6: ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )?
                            	    {
                            	    // InternalTExp.g:3490:6: ( (lv_args_4_0= ruleArgument ) )
                            	    // InternalTExp.g:3491:7: (lv_args_4_0= ruleArgument )
                            	    {
                            	    // InternalTExp.g:3491:7: (lv_args_4_0= ruleArgument )
                            	    // InternalTExp.g:3492:8: lv_args_4_0= ruleArgument
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getRoleAccess().getArgsArgumentParserRuleCall_1_2_1_0_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_57);
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

                            	    // InternalTExp.g:3509:6: (this_OP1000XFY_5= RULE_OP1000XFY )?
                            	    int alt51=2;
                            	    int LA51_0 = input.LA(1);

                            	    if ( (LA51_0==RULE_OP1000XFY) ) {
                            	        alt51=1;
                            	    }
                            	    switch (alt51) {
                            	        case 1 :
                            	            // InternalTExp.g:3510:7: this_OP1000XFY_5= RULE_OP1000XFY
                            	            {
                            	            this_OP1000XFY_5=(Token)match(input,RULE_OP1000XFY,FOLLOW_56); if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	              							newLeafNode(this_OP1000XFY_5, grammarAccess.getRoleAccess().getOP1000XFYTerminalRuleCall_1_2_1_1());
                            	              						
                            	            }

                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop52;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,34,FOLLOW_58); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getRoleAccess().getRightParenthesisKeyword_1_2_2());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
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
    // InternalTExp.g:3530:1: entryRuleArgument returns [String current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final String entryRuleArgument() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArgument = null;


        try {
            // InternalTExp.g:3530:48: (iv_ruleArgument= ruleArgument EOF )
            // InternalTExp.g:3531:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalTExp.g:3537:1: ruleArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalTExp.g:3543:2: (this_STRING_0= RULE_STRING )
            // InternalTExp.g:3544:2: this_STRING_0= RULE_STRING
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
    // InternalTExp.g:3554:1: entryRulePartition returns [EObject current=null] : iv_rulePartition= rulePartition EOF ;
    public final EObject entryRulePartition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartition = null;


        try {
            // InternalTExp.g:3554:50: (iv_rulePartition= rulePartition EOF )
            // InternalTExp.g:3555:2: iv_rulePartition= rulePartition EOF
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
    // InternalTExp.g:3561:1: rulePartition returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )* otherlv_4= ']' ) ;
    public final EObject rulePartition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_OP1000XFY_3=null;
        Token otherlv_4=null;
        EObject lv_constraints_2_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:3567:2: ( ( () otherlv_1= '[' ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )* otherlv_4= ']' ) )
            // InternalTExp.g:3568:2: ( () otherlv_1= '[' ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )* otherlv_4= ']' )
            {
            // InternalTExp.g:3568:2: ( () otherlv_1= '[' ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )* otherlv_4= ']' )
            // InternalTExp.g:3569:3: () otherlv_1= '[' ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )* otherlv_4= ']'
            {
            // InternalTExp.g:3569:3: ()
            // InternalTExp.g:3570:4: 
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

            otherlv_1=(Token)match(input,35,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPartitionAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalTExp.g:3583:3: ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==35) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalTExp.g:3584:4: ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )?
            	    {
            	    // InternalTExp.g:3584:4: ( (lv_constraints_2_0= ruleTogether ) )
            	    // InternalTExp.g:3585:5: (lv_constraints_2_0= ruleTogether )
            	    {
            	    // InternalTExp.g:3585:5: (lv_constraints_2_0= ruleTogether )
            	    // InternalTExp.g:3586:6: lv_constraints_2_0= ruleTogether
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPartitionAccess().getConstraintsTogetherParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_60);
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

            	    // InternalTExp.g:3603:4: (this_OP1000XFY_3= RULE_OP1000XFY )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==RULE_OP1000XFY) ) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // InternalTExp.g:3604:5: this_OP1000XFY_3= RULE_OP1000XFY
            	            {
            	            this_OP1000XFY_3=(Token)match(input,RULE_OP1000XFY,FOLLOW_59); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_OP1000XFY_3, grammarAccess.getPartitionAccess().getOP1000XFYTerminalRuleCall_2_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // InternalTExp.g:3618:1: entryRuleTogether returns [EObject current=null] : iv_ruleTogether= ruleTogether EOF ;
    public final EObject entryRuleTogether() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTogether = null;


        try {
            // InternalTExp.g:3618:49: (iv_ruleTogether= ruleTogether EOF )
            // InternalTExp.g:3619:2: iv_ruleTogether= ruleTogether EOF
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
    // InternalTExp.g:3625:1: ruleTogether returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+ otherlv_4= ']' ) ;
    public final EObject ruleTogether() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_OP1000XFY_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTExp.g:3631:2: ( ( () otherlv_1= '[' ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+ otherlv_4= ']' ) )
            // InternalTExp.g:3632:2: ( () otherlv_1= '[' ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+ otherlv_4= ']' )
            {
            // InternalTExp.g:3632:2: ( () otherlv_1= '[' ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+ otherlv_4= ']' )
            // InternalTExp.g:3633:3: () otherlv_1= '[' ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+ otherlv_4= ']'
            {
            // InternalTExp.g:3633:3: ()
            // InternalTExp.g:3634:4: 
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
            // InternalTExp.g:3647:3: ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ATOM) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalTExp.g:3648:4: ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )?
            	    {
            	    // InternalTExp.g:3648:4: ( ( ruleID ) )
            	    // InternalTExp.g:3649:5: ( ruleID )
            	    {
            	    // InternalTExp.g:3649:5: ( ruleID )
            	    // InternalTExp.g:3650:6: ruleID
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
            	    pushFollow(FOLLOW_61);
            	    ruleID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalTExp.g:3667:4: (this_OP1000XFY_3= RULE_OP1000XFY )?
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==RULE_OP1000XFY) ) {
            	        alt57=1;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // InternalTExp.g:3668:5: this_OP1000XFY_3= RULE_OP1000XFY
            	            {
            	            this_OP1000XFY_3=(Token)match(input,RULE_OP1000XFY,FOLLOW_62); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_OP1000XFY_3, grammarAccess.getTogetherAccess().getOP1000XFYTerminalRuleCall_2_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
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
    // InternalTExp.g:3682:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalTExp.g:3682:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalTExp.g:3683:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalTExp.g:3689:1: ruleConstraint returns [EObject current=null] : ( (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' ) | (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' ) | ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) ) | ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) ) | ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) ) ) ;
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
            // InternalTExp.g:3695:2: ( ( (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' ) | (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' ) | ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) ) | ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) ) | ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) ) ) )
            // InternalTExp.g:3696:2: ( (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' ) | (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' ) | ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) ) | ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) ) | ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) ) )
            {
            // InternalTExp.g:3696:2: ( (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' ) | (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' ) | ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) ) | ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) ) | ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) ) )
            int alt69=5;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // InternalTExp.g:3697:3: (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' )
                    {
                    // InternalTExp.g:3697:3: (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' )
                    // InternalTExp.g:3698:4: otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_0_0());
                      			
                    }
                    // InternalTExp.g:3702:4: ( ( ruleID ) )+
                    int cnt59=0;
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_ATOM) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalTExp.g:3703:5: ( ruleID )
                    	    {
                    	    // InternalTExp.g:3703:5: ( ruleID )
                    	    // InternalTExp.g:3704:6: ruleID
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
                    	    pushFollow(FOLLOW_62);
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
                    	    if ( cnt59 >= 1 ) break loop59;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(59, input);
                                throw eee;
                        }
                        cnt59++;
                    } while (true);

                    otherlv_2=(Token)match(input,37,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getRightSquareBracketKeyword_0_2());
                      			
                    }
                    // InternalTExp.g:3725:4: ( (lv_together_3_0= '-><-' ) )
                    // InternalTExp.g:3726:5: (lv_together_3_0= '-><-' )
                    {
                    // InternalTExp.g:3726:5: (lv_together_3_0= '-><-' )
                    // InternalTExp.g:3727:6: lv_together_3_0= '-><-'
                    {
                    lv_together_3_0=(Token)match(input,62,FOLLOW_32); if (state.failed) return current;
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
                    // InternalTExp.g:3743:4: ( ( ruleID ) )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==RULE_ATOM) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalTExp.g:3744:5: ( ruleID )
                    	    {
                    	    // InternalTExp.g:3744:5: ( ruleID )
                    	    // InternalTExp.g:3745:6: ruleID
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
                    	    pushFollow(FOLLOW_62);
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
                    	    if ( cnt60 >= 1 ) break loop60;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(60, input);
                                throw eee;
                        }
                        cnt60++;
                    } while (true);

                    otherlv_6=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getConstraintAccess().getRightSquareBracketKeyword_0_6());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTExp.g:3768:3: (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' )
                    {
                    // InternalTExp.g:3768:3: (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' )
                    // InternalTExp.g:3769:4: otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']'
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:3773:4: ( ( ruleID ) )+
                    int cnt61=0;
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==RULE_ATOM) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalTExp.g:3774:5: ( ruleID )
                    	    {
                    	    // InternalTExp.g:3774:5: ( ruleID )
                    	    // InternalTExp.g:3775:6: ruleID
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
                    	    pushFollow(FOLLOW_62);
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
                    	    if ( cnt61 >= 1 ) break loop61;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(61, input);
                                throw eee;
                        }
                        cnt61++;
                    } while (true);

                    otherlv_9=(Token)match(input,37,FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getConstraintAccess().getRightSquareBracketKeyword_1_2());
                      			
                    }
                    // InternalTExp.g:3796:4: ( (lv_split_10_0= '<-->' ) )
                    // InternalTExp.g:3797:5: (lv_split_10_0= '<-->' )
                    {
                    // InternalTExp.g:3797:5: (lv_split_10_0= '<-->' )
                    // InternalTExp.g:3798:6: lv_split_10_0= '<-->'
                    {
                    lv_split_10_0=(Token)match(input,63,FOLLOW_32); if (state.failed) return current;
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
                    // InternalTExp.g:3814:4: ( ( ruleID ) )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==RULE_ATOM) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalTExp.g:3815:5: ( ruleID )
                    	    {
                    	    // InternalTExp.g:3815:5: ( ruleID )
                    	    // InternalTExp.g:3816:6: ruleID
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
                    	    pushFollow(FOLLOW_62);
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
                    	    if ( cnt62 >= 1 ) break loop62;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
                    } while (true);

                    otherlv_13=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getConstraintAccess().getRightSquareBracketKeyword_1_6());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTExp.g:3839:3: ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) )
                    {
                    // InternalTExp.g:3839:3: ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) )
                    // InternalTExp.g:3840:4: () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) )
                    {
                    // InternalTExp.g:3840:4: ()
                    // InternalTExp.g:3841:5: 
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

                    otherlv_15=(Token)match(input,64,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getConstraintAccess().getNumber_singletonsKeyword_2_1());
                      			
                    }
                    this_OP600XFY_16=(Token)match(input,RULE_OP600XFY,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP600XFY_16, grammarAccess.getConstraintAccess().getOP600XFYTerminalRuleCall_2_2());
                      			
                    }
                    // InternalTExp.g:3858:4: ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) )
                    // InternalTExp.g:3859:5: ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) )
                    {
                    // InternalTExp.g:3859:5: ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) )
                    // InternalTExp.g:3860:6: (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' )
                    {
                    // InternalTExp.g:3860:6: (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==33) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==35) ) {
                        alt63=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);

                        throw nvae;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalTExp.g:3861:7: lv_parMin_17_1= '('
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
                            // InternalTExp.g:3872:7: lv_parMin_17_2= '['
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

                    // InternalTExp.g:3885:4: ( (lv_minSingletons_18_0= RULE_INT ) )
                    // InternalTExp.g:3886:5: (lv_minSingletons_18_0= RULE_INT )
                    {
                    // InternalTExp.g:3886:5: (lv_minSingletons_18_0= RULE_INT )
                    // InternalTExp.g:3887:6: lv_minSingletons_18_0= RULE_INT
                    {
                    lv_minSingletons_18_0=(Token)match(input,RULE_INT,FOLLOW_42); if (state.failed) return current;
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
                    // InternalTExp.g:3907:4: ( (lv_maxSingletons_20_0= RULE_INT ) )
                    // InternalTExp.g:3908:5: (lv_maxSingletons_20_0= RULE_INT )
                    {
                    // InternalTExp.g:3908:5: (lv_maxSingletons_20_0= RULE_INT )
                    // InternalTExp.g:3909:6: lv_maxSingletons_20_0= RULE_INT
                    {
                    lv_maxSingletons_20_0=(Token)match(input,RULE_INT,FOLLOW_66); if (state.failed) return current;
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

                    // InternalTExp.g:3925:4: ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) )
                    // InternalTExp.g:3926:5: ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) )
                    {
                    // InternalTExp.g:3926:5: ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) )
                    // InternalTExp.g:3927:6: (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' )
                    {
                    // InternalTExp.g:3927:6: (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' )
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==34) ) {
                        alt64=1;
                    }
                    else if ( (LA64_0==37) ) {
                        alt64=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalTExp.g:3928:7: lv_parMax_21_1= ')'
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
                            // InternalTExp.g:3939:7: lv_parMax_21_2= ']'
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
                    // InternalTExp.g:3954:3: ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) )
                    {
                    // InternalTExp.g:3954:3: ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) )
                    // InternalTExp.g:3955:4: () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) )
                    {
                    // InternalTExp.g:3955:4: ()
                    // InternalTExp.g:3956:5: 
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

                    otherlv_23=(Token)match(input,65,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getConstraintAccess().getSize_constraintsKeyword_3_1());
                      			
                    }
                    this_OP600XFY_24=(Token)match(input,RULE_OP600XFY,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP600XFY_24, grammarAccess.getConstraintAccess().getOP600XFYTerminalRuleCall_3_2());
                      			
                    }
                    // InternalTExp.g:3973:4: ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) )
                    // InternalTExp.g:3974:5: ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) )
                    {
                    // InternalTExp.g:3974:5: ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) )
                    // InternalTExp.g:3975:6: (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' )
                    {
                    // InternalTExp.g:3975:6: (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==33) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==35) ) {
                        alt65=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalTExp.g:3976:7: lv_parMin_25_1= '('
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
                            // InternalTExp.g:3987:7: lv_parMin_25_2= '['
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

                    // InternalTExp.g:4000:4: ( (lv_minSize_26_0= RULE_INT ) )
                    // InternalTExp.g:4001:5: (lv_minSize_26_0= RULE_INT )
                    {
                    // InternalTExp.g:4001:5: (lv_minSize_26_0= RULE_INT )
                    // InternalTExp.g:4002:6: lv_minSize_26_0= RULE_INT
                    {
                    lv_minSize_26_0=(Token)match(input,RULE_INT,FOLLOW_42); if (state.failed) return current;
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
                    // InternalTExp.g:4022:4: ( (lv_maxSize_28_0= RULE_INT ) )
                    // InternalTExp.g:4023:5: (lv_maxSize_28_0= RULE_INT )
                    {
                    // InternalTExp.g:4023:5: (lv_maxSize_28_0= RULE_INT )
                    // InternalTExp.g:4024:6: lv_maxSize_28_0= RULE_INT
                    {
                    lv_maxSize_28_0=(Token)match(input,RULE_INT,FOLLOW_66); if (state.failed) return current;
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

                    // InternalTExp.g:4040:4: ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) )
                    // InternalTExp.g:4041:5: ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) )
                    {
                    // InternalTExp.g:4041:5: ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) )
                    // InternalTExp.g:4042:6: (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' )
                    {
                    // InternalTExp.g:4042:6: (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' )
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==34) ) {
                        alt66=1;
                    }
                    else if ( (LA66_0==37) ) {
                        alt66=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalTExp.g:4043:7: lv_parMax_29_1= ')'
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
                            // InternalTExp.g:4054:7: lv_parMax_29_2= ']'
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
                    // InternalTExp.g:4069:3: ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) )
                    {
                    // InternalTExp.g:4069:3: ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) )
                    // InternalTExp.g:4070:4: () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) )
                    {
                    // InternalTExp.g:4070:4: ()
                    // InternalTExp.g:4071:5: 
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

                    otherlv_31=(Token)match(input,66,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getConstraintAccess().getNumber_constraintsKeyword_4_1());
                      			
                    }
                    this_OP600XFY_32=(Token)match(input,RULE_OP600XFY,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP600XFY_32, grammarAccess.getConstraintAccess().getOP600XFYTerminalRuleCall_4_2());
                      			
                    }
                    // InternalTExp.g:4088:4: ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) )
                    // InternalTExp.g:4089:5: ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) )
                    {
                    // InternalTExp.g:4089:5: ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) )
                    // InternalTExp.g:4090:6: (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' )
                    {
                    // InternalTExp.g:4090:6: (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==33) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==35) ) {
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
                            // InternalTExp.g:4091:7: lv_parMin_33_1= '('
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
                            // InternalTExp.g:4102:7: lv_parMin_33_2= '['
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

                    // InternalTExp.g:4115:4: ( (lv_minCardinality_34_0= RULE_INT ) )
                    // InternalTExp.g:4116:5: (lv_minCardinality_34_0= RULE_INT )
                    {
                    // InternalTExp.g:4116:5: (lv_minCardinality_34_0= RULE_INT )
                    // InternalTExp.g:4117:6: lv_minCardinality_34_0= RULE_INT
                    {
                    lv_minCardinality_34_0=(Token)match(input,RULE_INT,FOLLOW_42); if (state.failed) return current;
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
                    // InternalTExp.g:4137:4: ( (lv_maxCardinality_36_0= RULE_INT ) )
                    // InternalTExp.g:4138:5: (lv_maxCardinality_36_0= RULE_INT )
                    {
                    // InternalTExp.g:4138:5: (lv_maxCardinality_36_0= RULE_INT )
                    // InternalTExp.g:4139:6: lv_maxCardinality_36_0= RULE_INT
                    {
                    lv_maxCardinality_36_0=(Token)match(input,RULE_INT,FOLLOW_66); if (state.failed) return current;
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

                    // InternalTExp.g:4155:4: ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) )
                    // InternalTExp.g:4156:5: ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) )
                    {
                    // InternalTExp.g:4156:5: ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) )
                    // InternalTExp.g:4157:6: (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' )
                    {
                    // InternalTExp.g:4157:6: (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' )
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==34) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==37) ) {
                        alt68=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalTExp.g:4158:7: lv_parMax_37_1= ')'
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
                            // InternalTExp.g:4169:7: lv_parMax_37_2= ']'
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
    // InternalTExp.g:4187:1: entryRuleModule returns [String current=null] : iv_ruleModule= ruleModule EOF ;
    public final String entryRuleModule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModule = null;


        try {
            // InternalTExp.g:4187:46: (iv_ruleModule= ruleModule EOF )
            // InternalTExp.g:4188:2: iv_ruleModule= ruleModule EOF
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
    // InternalTExp.g:4194:1: ruleModule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VARIABLE_0= RULE_VARIABLE | this_ATOM_1= RULE_ATOM ) ;
    public final AntlrDatatypeRuleToken ruleModule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VARIABLE_0=null;
        Token this_ATOM_1=null;


        	enterRule();

        try {
            // InternalTExp.g:4200:2: ( (this_VARIABLE_0= RULE_VARIABLE | this_ATOM_1= RULE_ATOM ) )
            // InternalTExp.g:4201:2: (this_VARIABLE_0= RULE_VARIABLE | this_ATOM_1= RULE_ATOM )
            {
            // InternalTExp.g:4201:2: (this_VARIABLE_0= RULE_VARIABLE | this_ATOM_1= RULE_ATOM )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_VARIABLE) ) {
                alt70=1;
            }
            else if ( (LA70_0==RULE_ATOM) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalTExp.g:4202:3: this_VARIABLE_0= RULE_VARIABLE
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
                    // InternalTExp.g:4210:3: this_ATOM_1= RULE_ATOM
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

    // $ANTLR start synpred74_InternalTExp
    public final void synpred74_InternalTExp_fragment() throws RecognitionException {   
        EObject lv_seqExpr_1_0 = null;


        // InternalTExp.g:2378:3: ( ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) ) )
        // InternalTExp.g:2378:3: ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) )
        {
        // InternalTExp.g:2378:3: ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) )
        // InternalTExp.g:2379:4: () ( (lv_seqExpr_1_0= ruleSeqExpr ) )
        {
        // InternalTExp.g:2379:4: ()
        // InternalTExp.g:2380:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalTExp.g:2389:4: ( (lv_seqExpr_1_0= ruleSeqExpr ) )
        // InternalTExp.g:2390:5: (lv_seqExpr_1_0= ruleSeqExpr )
        {
        // InternalTExp.g:2390:5: (lv_seqExpr_1_0= ruleSeqExpr )
        // InternalTExp.g:2391:6: lv_seqExpr_1_0= ruleSeqExpr
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
    // $ANTLR end synpred74_InternalTExp

    // $ANTLR start synpred75_InternalTExp
    public final void synpred75_InternalTExp_fragment() throws RecognitionException {   
        EObject lv_filterExpr_3_0 = null;


        // InternalTExp.g:2410:3: ( ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) ) )
        // InternalTExp.g:2410:3: ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) )
        {
        // InternalTExp.g:2410:3: ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) )
        // InternalTExp.g:2411:4: () ( (lv_filterExpr_3_0= ruleFilterExpr ) )
        {
        // InternalTExp.g:2411:4: ()
        // InternalTExp.g:2412:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalTExp.g:2421:4: ( (lv_filterExpr_3_0= ruleFilterExpr ) )
        // InternalTExp.g:2422:5: (lv_filterExpr_3_0= ruleFilterExpr )
        {
        // InternalTExp.g:2422:5: (lv_filterExpr_3_0= ruleFilterExpr )
        // InternalTExp.g:2423:6: lv_filterExpr_3_0= ruleFilterExpr
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
    // $ANTLR end synpred75_InternalTExp

    // $ANTLR start synpred89_InternalTExp
    public final void synpred89_InternalTExp_fragment() throws RecognitionException {   
        Token lv_performative_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_content_16_0 = null;


        // InternalTExp.g:3242:4: ( ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' ) )
        // InternalTExp.g:3242:4: ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' )
        {
        // InternalTExp.g:3242:4: ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' )
        // InternalTExp.g:3243:5: ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')'
        {
        // InternalTExp.g:3243:5: ( (lv_performative_14_0= RULE_ATOM ) )
        // InternalTExp.g:3244:6: (lv_performative_14_0= RULE_ATOM )
        {
        // InternalTExp.g:3244:6: (lv_performative_14_0= RULE_ATOM )
        // InternalTExp.g:3245:7: lv_performative_14_0= RULE_ATOM
        {
        lv_performative_14_0=(Token)match(input,RULE_ATOM,FOLLOW_52); if (state.failed) return ;

        }


        }

        otherlv_15=(Token)match(input,33,FOLLOW_8); if (state.failed) return ;
        // InternalTExp.g:3265:5: ( (lv_content_16_0= ruleExpression0 ) )
        // InternalTExp.g:3266:6: (lv_content_16_0= ruleExpression0 )
        {
        // InternalTExp.g:3266:6: (lv_content_16_0= ruleExpression0 )
        // InternalTExp.g:3267:7: lv_content_16_0= ruleExpression0
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getMsgAccess().getContentExpression0ParserRuleCall_2_0_2_0());
          						
        }
        pushFollow(FOLLOW_19);
        lv_content_16_0=ruleExpression0();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_17=(Token)match(input,34,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred89_InternalTExp

    // Delegated rules

    public final boolean synpred75_InternalTExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalTExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_InternalTExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_InternalTExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_InternalTExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_InternalTExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA47 dfa47 = new DFA47(this);
    protected DFA69 dfa69 = new DFA69(this);
    static final String dfa_1s = "\35\uffff";
    static final String dfa_2s = "\1\4\1\0\33\uffff";
    static final String dfa_3s = "\1\43\1\0\33\uffff";
    static final String dfa_4s = "\2\uffff\1\2\31\uffff\1\1";
    static final String dfa_5s = "\1\uffff\1\0\33\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\23\2\1\uffff\2\2\3\uffff\4\2\1\uffff\1\2",
            "\1\uffff",
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
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3241:3: ( ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' ) | ( (lv_content_18_0= ruleExpression0 ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_1 = input.LA(1);

                         
                        int index47_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred89_InternalTExp()) ) {s = 28;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index47_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\11\uffff";
    static final String dfa_8s = "\1\43\1\4\3\uffff\1\4\1\76\2\uffff";
    static final String dfa_9s = "\1\102\1\4\3\uffff\1\45\1\77\2\uffff";
    static final String dfa_10s = "\2\uffff\1\3\1\4\1\5\2\uffff\1\2\1\1";
    static final String dfa_11s = "\11\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\34\uffff\1\2\1\3\1\4",
            "\1\5",
            "",
            "",
            "",
            "\1\5\40\uffff\1\6",
            "\1\10\1\7",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "3696:2: ( (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' ) | (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' ) | ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) ) | ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) ) | ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004000000002L});
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
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x003F3E0000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x007F3E0000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x007F3E0000000410L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x007F3E0002000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x007F3E0000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x007F3E0800000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0800000200010010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0040000800000010L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x2000000200000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000404000400L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000002800000400L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000002000000410L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000002400000000L});

}