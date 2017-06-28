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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ATOM", "RULE_OP1200XFX", "RULE_OP1200FX", "RULE_OP1150FX", "RULE_OP1100XFY", "RULE_OP1050XFY", "RULE_OP1000XFY", "RULE_OP954XFY", "RULE_OP900FY", "RULE_OP900FX", "RULE_OP700XFX", "RULE_OP700XFXR", "RULE_OP700XFXL", "RULE_OP600XFY", "RULE_OP500YFX", "RULE_OP500FX", "RULE_OP400YFX", "RULE_OP200XFX", "RULE_OP200XFY", "RULE_INT", "RULE_EXT_INT", "RULE_VARIABLE", "RULE_STRING", "RULE_OP400FX1", "RULE_WHITESPACE", "RULE_SINGLE_LINE_COMMENT", "'.'", "'!'", "'-'", "'('", "')'", "'['", "'|'", "']'", "'trace_expression'", "'{'", "'id:'", "'body:'", "'roles:'", "'types:'", "'modules:'", "'decentralized:'", "'true'", "'false'", "'partition:'", "'constraints:'", "'gui:'", "'minimal:'", "'threshold:'", "'channels:'", "'}'", "'<-'", "'/\\\\'", "'*'", "'\\\\/'", "'epsilon'", "'=>'", "'$'", "'-><-'", "'<-->'", "'number_singletons'", "'size_constraints'", "'number_constraints'"
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
    // InternalTExp.g:388:1: ruleExpressionInfinity returns [EObject current=null] : this_Expression1000xfy_0= ruleExpression1000xfy ;
    public final EObject ruleExpressionInfinity() throws RecognitionException {
        EObject current = null;

        EObject this_Expression1000xfy_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:394:2: (this_Expression1000xfy_0= ruleExpression1000xfy )
            // InternalTExp.g:395:2: this_Expression1000xfy_0= ruleExpression1000xfy
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionInfinityAccess().getExpression1000xfyParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Expression1000xfy_0=ruleExpression1000xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Expression1000xfy_0;
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


    // $ANTLR start "entryRuleExpression1000xfy"
    // InternalTExp.g:409:1: entryRuleExpression1000xfy returns [EObject current=null] : iv_ruleExpression1000xfy= ruleExpression1000xfy EOF ;
    public final EObject entryRuleExpression1000xfy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression1000xfy = null;


        try {
            // InternalTExp.g:409:58: (iv_ruleExpression1000xfy= ruleExpression1000xfy EOF )
            // InternalTExp.g:410:2: iv_ruleExpression1000xfy= ruleExpression1000xfy EOF
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
    // InternalTExp.g:416:1: ruleExpression1000xfy returns [EObject current=null] : (this_Expression954xfy_0= ruleExpression954xfy ( () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) ) )? ) ;
    public final EObject ruleExpression1000xfy() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression954xfy_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:422:2: ( (this_Expression954xfy_0= ruleExpression954xfy ( () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) ) )? ) )
            // InternalTExp.g:423:2: (this_Expression954xfy_0= ruleExpression954xfy ( () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) ) )? )
            {
            // InternalTExp.g:423:2: (this_Expression954xfy_0= ruleExpression954xfy ( () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) ) )? )
            // InternalTExp.g:424:3: this_Expression954xfy_0= ruleExpression954xfy ( () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression1000xfyAccess().getExpression954xfyParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_7);
            this_Expression954xfy_0=ruleExpression954xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression954xfy_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:435:3: ( () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_OP1000XFY) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTExp.g:436:4: () ( (lv_op_2_0= RULE_OP1000XFY ) ) ( (lv_right_3_0= ruleExpression1000xfy ) )
                    {
                    // InternalTExp.g:436:4: ()
                    // InternalTExp.g:437:5: 
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

                    // InternalTExp.g:446:4: ( (lv_op_2_0= RULE_OP1000XFY ) )
                    // InternalTExp.g:447:5: (lv_op_2_0= RULE_OP1000XFY )
                    {
                    // InternalTExp.g:447:5: (lv_op_2_0= RULE_OP1000XFY )
                    // InternalTExp.g:448:6: lv_op_2_0= RULE_OP1000XFY
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

                    // InternalTExp.g:464:4: ( (lv_right_3_0= ruleExpression1000xfy ) )
                    // InternalTExp.g:465:5: (lv_right_3_0= ruleExpression1000xfy )
                    {
                    // InternalTExp.g:465:5: (lv_right_3_0= ruleExpression1000xfy )
                    // InternalTExp.g:466:6: lv_right_3_0= ruleExpression1000xfy
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
    // InternalTExp.g:488:1: entryRuleExpression954xfy returns [EObject current=null] : iv_ruleExpression954xfy= ruleExpression954xfy EOF ;
    public final EObject entryRuleExpression954xfy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression954xfy = null;


        try {
            // InternalTExp.g:488:57: (iv_ruleExpression954xfy= ruleExpression954xfy EOF )
            // InternalTExp.g:489:2: iv_ruleExpression954xfy= ruleExpression954xfy EOF
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
    // InternalTExp.g:495:1: ruleExpression954xfy returns [EObject current=null] : (this_Expression700xfx_0= ruleExpression700xfx ( () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) ) )? ) ;
    public final EObject ruleExpression954xfy() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression700xfx_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:501:2: ( (this_Expression700xfx_0= ruleExpression700xfx ( () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) ) )? ) )
            // InternalTExp.g:502:2: (this_Expression700xfx_0= ruleExpression700xfx ( () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) ) )? )
            {
            // InternalTExp.g:502:2: (this_Expression700xfx_0= ruleExpression700xfx ( () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) ) )? )
            // InternalTExp.g:503:3: this_Expression700xfx_0= ruleExpression700xfx ( () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression954xfyAccess().getExpression700xfxParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_Expression700xfx_0=ruleExpression700xfx();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression700xfx_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:514:3: ( () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_OP954XFY) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTExp.g:515:4: () ( (lv_op_2_0= RULE_OP954XFY ) ) ( (lv_right_3_0= ruleExpression954xfy ) )
                    {
                    // InternalTExp.g:515:4: ()
                    // InternalTExp.g:516:5: 
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

                    // InternalTExp.g:525:4: ( (lv_op_2_0= RULE_OP954XFY ) )
                    // InternalTExp.g:526:5: (lv_op_2_0= RULE_OP954XFY )
                    {
                    // InternalTExp.g:526:5: (lv_op_2_0= RULE_OP954XFY )
                    // InternalTExp.g:527:6: lv_op_2_0= RULE_OP954XFY
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

                    // InternalTExp.g:543:4: ( (lv_right_3_0= ruleExpression954xfy ) )
                    // InternalTExp.g:544:5: (lv_right_3_0= ruleExpression954xfy )
                    {
                    // InternalTExp.g:544:5: (lv_right_3_0= ruleExpression954xfy )
                    // InternalTExp.g:545:6: lv_right_3_0= ruleExpression954xfy
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
    // InternalTExp.g:567:1: entryRuleExpression700xfx returns [EObject current=null] : iv_ruleExpression700xfx= ruleExpression700xfx EOF ;
    public final EObject entryRuleExpression700xfx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression700xfx = null;


        try {
            // InternalTExp.g:567:57: (iv_ruleExpression700xfx= ruleExpression700xfx EOF )
            // InternalTExp.g:568:2: iv_ruleExpression700xfx= ruleExpression700xfx EOF
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
    // InternalTExp.g:574:1: ruleExpression700xfx returns [EObject current=null] : (this_Expression600xfy_0= ruleExpression600xfy ( () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? ) ;
    public final EObject ruleExpression700xfx() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        EObject this_Expression600xfy_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:580:2: ( (this_Expression600xfy_0= ruleExpression600xfy ( () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? ) )
            // InternalTExp.g:581:2: (this_Expression600xfy_0= ruleExpression600xfy ( () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? )
            {
            // InternalTExp.g:581:2: (this_Expression600xfy_0= ruleExpression600xfy ( () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? )
            // InternalTExp.g:582:3: this_Expression600xfy_0= ruleExpression600xfy ( () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression700xfxAccess().getExpression600xfyParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_10);
            this_Expression600xfy_0=ruleExpression600xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression600xfy_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:593:3: ( () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_OP700XFX && LA9_0<=RULE_OP700XFXL)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTExp.g:594:4: () ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) ) ( (lv_right_3_0= ruleExpression600xfy ) )
                    {
                    // InternalTExp.g:594:4: ()
                    // InternalTExp.g:595:5: 
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

                    // InternalTExp.g:604:4: ( ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) ) )
                    // InternalTExp.g:605:5: ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) )
                    {
                    // InternalTExp.g:605:5: ( (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL ) )
                    // InternalTExp.g:606:6: (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL )
                    {
                    // InternalTExp.g:606:6: (lv_op_2_1= RULE_OP700XFX | lv_op_2_2= RULE_OP700XFXR | lv_op_2_3= RULE_OP700XFXL )
                    int alt8=3;
                    switch ( input.LA(1) ) {
                    case RULE_OP700XFX:
                        {
                        alt8=1;
                        }
                        break;
                    case RULE_OP700XFXR:
                        {
                        alt8=2;
                        }
                        break;
                    case RULE_OP700XFXL:
                        {
                        alt8=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }

                    switch (alt8) {
                        case 1 :
                            // InternalTExp.g:607:7: lv_op_2_1= RULE_OP700XFX
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
                            // InternalTExp.g:622:7: lv_op_2_2= RULE_OP700XFXR
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
                            // InternalTExp.g:637:7: lv_op_2_3= RULE_OP700XFXL
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

                    // InternalTExp.g:654:4: ( (lv_right_3_0= ruleExpression600xfy ) )
                    // InternalTExp.g:655:5: (lv_right_3_0= ruleExpression600xfy )
                    {
                    // InternalTExp.g:655:5: (lv_right_3_0= ruleExpression600xfy )
                    // InternalTExp.g:656:6: lv_right_3_0= ruleExpression600xfy
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
    // InternalTExp.g:678:1: entryRuleExpression600xfy returns [EObject current=null] : iv_ruleExpression600xfy= ruleExpression600xfy EOF ;
    public final EObject entryRuleExpression600xfy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression600xfy = null;


        try {
            // InternalTExp.g:678:57: (iv_ruleExpression600xfy= ruleExpression600xfy EOF )
            // InternalTExp.g:679:2: iv_ruleExpression600xfy= ruleExpression600xfy EOF
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
    // InternalTExp.g:685:1: ruleExpression600xfy returns [EObject current=null] : (this_Expression500yfx_0= ruleExpression500yfx ( () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? ) ;
    public final EObject ruleExpression600xfy() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression500yfx_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:691:2: ( (this_Expression500yfx_0= ruleExpression500yfx ( () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? ) )
            // InternalTExp.g:692:2: (this_Expression500yfx_0= ruleExpression500yfx ( () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? )
            {
            // InternalTExp.g:692:2: (this_Expression500yfx_0= ruleExpression500yfx ( () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )? )
            // InternalTExp.g:693:3: this_Expression500yfx_0= ruleExpression500yfx ( () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression600xfyAccess().getExpression500yfxParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_11);
            this_Expression500yfx_0=ruleExpression500yfx();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression500yfx_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:704:3: ( () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_OP600XFY) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTExp.g:705:4: () ( (lv_op_2_0= RULE_OP600XFY ) ) ( (lv_right_3_0= ruleExpression600xfy ) )
                    {
                    // InternalTExp.g:705:4: ()
                    // InternalTExp.g:706:5: 
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

                    // InternalTExp.g:715:4: ( (lv_op_2_0= RULE_OP600XFY ) )
                    // InternalTExp.g:716:5: (lv_op_2_0= RULE_OP600XFY )
                    {
                    // InternalTExp.g:716:5: (lv_op_2_0= RULE_OP600XFY )
                    // InternalTExp.g:717:6: lv_op_2_0= RULE_OP600XFY
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

                    // InternalTExp.g:733:4: ( (lv_right_3_0= ruleExpression600xfy ) )
                    // InternalTExp.g:734:5: (lv_right_3_0= ruleExpression600xfy )
                    {
                    // InternalTExp.g:734:5: (lv_right_3_0= ruleExpression600xfy )
                    // InternalTExp.g:735:6: lv_right_3_0= ruleExpression600xfy
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
    // InternalTExp.g:757:1: entryRuleExpression500yfx returns [EObject current=null] : iv_ruleExpression500yfx= ruleExpression500yfx EOF ;
    public final EObject entryRuleExpression500yfx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression500yfx = null;


        try {
            // InternalTExp.g:757:57: (iv_ruleExpression500yfx= ruleExpression500yfx EOF )
            // InternalTExp.g:758:2: iv_ruleExpression500yfx= ruleExpression500yfx EOF
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
    // InternalTExp.g:764:1: ruleExpression500yfx returns [EObject current=null] : (this_Expression400yfx_0= ruleExpression400yfx ( () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) ) )* ) ;
    public final EObject ruleExpression500yfx() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression400yfx_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:770:2: ( (this_Expression400yfx_0= ruleExpression400yfx ( () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) ) )* ) )
            // InternalTExp.g:771:2: (this_Expression400yfx_0= ruleExpression400yfx ( () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) ) )* )
            {
            // InternalTExp.g:771:2: (this_Expression400yfx_0= ruleExpression400yfx ( () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) ) )* )
            // InternalTExp.g:772:3: this_Expression400yfx_0= ruleExpression400yfx ( () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression500yfxAccess().getExpression400yfxParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_12);
            this_Expression400yfx_0=ruleExpression400yfx();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression400yfx_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:783:3: ( () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_OP500YFX) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTExp.g:784:4: () ( (lv_op_2_0= RULE_OP500YFX ) ) ( (lv_right_3_0= ruleExpression400yfx ) )
            	    {
            	    // InternalTExp.g:784:4: ()
            	    // InternalTExp.g:785:5: 
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

            	    // InternalTExp.g:794:4: ( (lv_op_2_0= RULE_OP500YFX ) )
            	    // InternalTExp.g:795:5: (lv_op_2_0= RULE_OP500YFX )
            	    {
            	    // InternalTExp.g:795:5: (lv_op_2_0= RULE_OP500YFX )
            	    // InternalTExp.g:796:6: lv_op_2_0= RULE_OP500YFX
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

            	    // InternalTExp.g:812:4: ( (lv_right_3_0= ruleExpression400yfx ) )
            	    // InternalTExp.g:813:5: (lv_right_3_0= ruleExpression400yfx )
            	    {
            	    // InternalTExp.g:813:5: (lv_right_3_0= ruleExpression400yfx )
            	    // InternalTExp.g:814:6: lv_right_3_0= ruleExpression400yfx
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpression500yfxAccess().getRightExpression400yfxParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
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
            	    break loop11;
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
    // InternalTExp.g:836:1: entryRuleExpression400yfx returns [EObject current=null] : iv_ruleExpression400yfx= ruleExpression400yfx EOF ;
    public final EObject entryRuleExpression400yfx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression400yfx = null;


        try {
            // InternalTExp.g:836:57: (iv_ruleExpression400yfx= ruleExpression400yfx EOF )
            // InternalTExp.g:837:2: iv_ruleExpression400yfx= ruleExpression400yfx EOF
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
    // InternalTExp.g:843:1: ruleExpression400yfx returns [EObject current=null] : (this_Expression200xfx_0= ruleExpression200xfx ( () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) ) )* ) ;
    public final EObject ruleExpression400yfx() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression200xfx_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:849:2: ( (this_Expression200xfx_0= ruleExpression200xfx ( () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) ) )* ) )
            // InternalTExp.g:850:2: (this_Expression200xfx_0= ruleExpression200xfx ( () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) ) )* )
            {
            // InternalTExp.g:850:2: (this_Expression200xfx_0= ruleExpression200xfx ( () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) ) )* )
            // InternalTExp.g:851:3: this_Expression200xfx_0= ruleExpression200xfx ( () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression400yfxAccess().getExpression200xfxParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_13);
            this_Expression200xfx_0=ruleExpression200xfx();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression200xfx_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:862:3: ( () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_OP400YFX) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTExp.g:863:4: () ( (lv_op_2_0= RULE_OP400YFX ) ) ( (lv_right_3_0= ruleExpression200xfx ) )
            	    {
            	    // InternalTExp.g:863:4: ()
            	    // InternalTExp.g:864:5: 
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

            	    // InternalTExp.g:873:4: ( (lv_op_2_0= RULE_OP400YFX ) )
            	    // InternalTExp.g:874:5: (lv_op_2_0= RULE_OP400YFX )
            	    {
            	    // InternalTExp.g:874:5: (lv_op_2_0= RULE_OP400YFX )
            	    // InternalTExp.g:875:6: lv_op_2_0= RULE_OP400YFX
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

            	    // InternalTExp.g:891:4: ( (lv_right_3_0= ruleExpression200xfx ) )
            	    // InternalTExp.g:892:5: (lv_right_3_0= ruleExpression200xfx )
            	    {
            	    // InternalTExp.g:892:5: (lv_right_3_0= ruleExpression200xfx )
            	    // InternalTExp.g:893:6: lv_right_3_0= ruleExpression200xfx
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExpression400yfxAccess().getRightExpression200xfxParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
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
    // $ANTLR end "ruleExpression400yfx"


    // $ANTLR start "entryRuleExpression200xfx"
    // InternalTExp.g:915:1: entryRuleExpression200xfx returns [EObject current=null] : iv_ruleExpression200xfx= ruleExpression200xfx EOF ;
    public final EObject entryRuleExpression200xfx() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression200xfx = null;


        try {
            // InternalTExp.g:915:57: (iv_ruleExpression200xfx= ruleExpression200xfx EOF )
            // InternalTExp.g:916:2: iv_ruleExpression200xfx= ruleExpression200xfx EOF
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
    // InternalTExp.g:922:1: ruleExpression200xfx returns [EObject current=null] : (this_Expression200xfy_0= ruleExpression200xfy ( () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? ) ;
    public final EObject ruleExpression200xfx() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression200xfy_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:928:2: ( (this_Expression200xfy_0= ruleExpression200xfy ( () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? ) )
            // InternalTExp.g:929:2: (this_Expression200xfy_0= ruleExpression200xfy ( () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? )
            {
            // InternalTExp.g:929:2: (this_Expression200xfy_0= ruleExpression200xfy ( () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? )
            // InternalTExp.g:930:3: this_Expression200xfy_0= ruleExpression200xfy ( () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression200xfxAccess().getExpression200xfyParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_14);
            this_Expression200xfy_0=ruleExpression200xfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression200xfy_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:941:3: ( () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_OP200XFX) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTExp.g:942:4: () ( (lv_op_2_0= RULE_OP200XFX ) ) ( (lv_right_3_0= ruleExpression200xfy ) )
                    {
                    // InternalTExp.g:942:4: ()
                    // InternalTExp.g:943:5: 
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

                    // InternalTExp.g:952:4: ( (lv_op_2_0= RULE_OP200XFX ) )
                    // InternalTExp.g:953:5: (lv_op_2_0= RULE_OP200XFX )
                    {
                    // InternalTExp.g:953:5: (lv_op_2_0= RULE_OP200XFX )
                    // InternalTExp.g:954:6: lv_op_2_0= RULE_OP200XFX
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

                    // InternalTExp.g:970:4: ( (lv_right_3_0= ruleExpression200xfy ) )
                    // InternalTExp.g:971:5: (lv_right_3_0= ruleExpression200xfy )
                    {
                    // InternalTExp.g:971:5: (lv_right_3_0= ruleExpression200xfy )
                    // InternalTExp.g:972:6: lv_right_3_0= ruleExpression200xfy
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
    // InternalTExp.g:994:1: entryRuleExpression200xfy returns [EObject current=null] : iv_ruleExpression200xfy= ruleExpression200xfy EOF ;
    public final EObject entryRuleExpression200xfy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression200xfy = null;


        try {
            // InternalTExp.g:994:57: (iv_ruleExpression200xfy= ruleExpression200xfy EOF )
            // InternalTExp.g:995:2: iv_ruleExpression200xfy= ruleExpression200xfy EOF
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
    // InternalTExp.g:1001:1: ruleExpression200xfy returns [EObject current=null] : (this_Expression0_0= ruleExpression0 ( () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? ) ;
    public final EObject ruleExpression200xfy() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Expression0_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:1007:2: ( (this_Expression0_0= ruleExpression0 ( () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? ) )
            // InternalTExp.g:1008:2: (this_Expression0_0= ruleExpression0 ( () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? )
            {
            // InternalTExp.g:1008:2: (this_Expression0_0= ruleExpression0 ( () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )? )
            // InternalTExp.g:1009:3: this_Expression0_0= ruleExpression0 ( () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpression200xfyAccess().getExpression0ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_15);
            this_Expression0_0=ruleExpression0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Expression0_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:1020:3: ( () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_OP200XFY) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTExp.g:1021:4: () ( (lv_op_2_0= RULE_OP200XFY ) ) ( (lv_right_3_0= ruleExpression200xfy ) )
                    {
                    // InternalTExp.g:1021:4: ()
                    // InternalTExp.g:1022:5: 
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

                    // InternalTExp.g:1031:4: ( (lv_op_2_0= RULE_OP200XFY ) )
                    // InternalTExp.g:1032:5: (lv_op_2_0= RULE_OP200XFY )
                    {
                    // InternalTExp.g:1032:5: (lv_op_2_0= RULE_OP200XFY )
                    // InternalTExp.g:1033:6: lv_op_2_0= RULE_OP200XFY
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

                    // InternalTExp.g:1049:4: ( (lv_right_3_0= ruleExpression200xfy ) )
                    // InternalTExp.g:1050:5: (lv_right_3_0= ruleExpression200xfy )
                    {
                    // InternalTExp.g:1050:5: (lv_right_3_0= ruleExpression200xfy )
                    // InternalTExp.g:1051:6: lv_right_3_0= ruleExpression200xfy
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
    // InternalTExp.g:1073:1: entryRuleExpression0 returns [EObject current=null] : iv_ruleExpression0= ruleExpression0 EOF ;
    public final EObject entryRuleExpression0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression0 = null;


        try {
            // InternalTExp.g:1073:52: (iv_ruleExpression0= ruleExpression0 EOF )
            // InternalTExp.g:1074:2: iv_ruleExpression0= ruleExpression0 EOF
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
    // InternalTExp.g:1080:1: ruleExpression0 returns [EObject current=null] : ( ( () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )? ) | ( () ( (lv_name_6_0= RULE_VARIABLE ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_value_10_0= ruleNUMBER ) ) ) | ( () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']' ) | (otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')' ) ) ;
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
            // InternalTExp.g:1086:2: ( ( ( () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )? ) | ( () ( (lv_name_6_0= RULE_VARIABLE ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_value_10_0= ruleNUMBER ) ) ) | ( () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']' ) | (otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')' ) ) )
            // InternalTExp.g:1087:2: ( ( () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )? ) | ( () ( (lv_name_6_0= RULE_VARIABLE ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_value_10_0= ruleNUMBER ) ) ) | ( () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']' ) | (otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')' ) )
            {
            // InternalTExp.g:1087:2: ( ( () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )? ) | ( () ( (lv_name_6_0= RULE_VARIABLE ) ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () ( (lv_value_10_0= ruleNUMBER ) ) ) | ( () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']' ) | (otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')' ) )
            int alt18=6;
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
                alt18=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt18=2;
                }
                break;
            case RULE_STRING:
                {
                alt18=3;
                }
                break;
            case RULE_INT:
            case 32:
                {
                alt18=4;
                }
                break;
            case 35:
                {
                alt18=5;
                }
                break;
            case 33:
                {
                alt18=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalTExp.g:1088:3: ( () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )? )
                    {
                    // InternalTExp.g:1088:3: ( () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )? )
                    // InternalTExp.g:1089:4: () ( (lv_atom_1_0= ruleATOMS ) ) (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )?
                    {
                    // InternalTExp.g:1089:4: ()
                    // InternalTExp.g:1090:5: 
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

                    // InternalTExp.g:1099:4: ( (lv_atom_1_0= ruleATOMS ) )
                    // InternalTExp.g:1100:5: (lv_atom_1_0= ruleATOMS )
                    {
                    // InternalTExp.g:1100:5: (lv_atom_1_0= ruleATOMS )
                    // InternalTExp.g:1101:6: lv_atom_1_0= ruleATOMS
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpression0Access().getAtomATOMSParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
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

                    // InternalTExp.g:1118:4: (otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==33) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalTExp.g:1119:5: otherlv_2= '(' ( (lv_terms_3_0= ruleExpressionInfinity ) ) otherlv_4= ')'
                            {
                            otherlv_2=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getExpression0Access().getLeftParenthesisKeyword_0_2_0());
                              				
                            }
                            // InternalTExp.g:1123:5: ( (lv_terms_3_0= ruleExpressionInfinity ) )
                            // InternalTExp.g:1124:6: (lv_terms_3_0= ruleExpressionInfinity )
                            {
                            // InternalTExp.g:1124:6: (lv_terms_3_0= ruleExpressionInfinity )
                            // InternalTExp.g:1125:7: lv_terms_3_0= ruleExpressionInfinity
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpression0Access().getTermsExpressionInfinityParserRuleCall_0_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_17);
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
                    // InternalTExp.g:1149:3: ( () ( (lv_name_6_0= RULE_VARIABLE ) ) )
                    {
                    // InternalTExp.g:1149:3: ( () ( (lv_name_6_0= RULE_VARIABLE ) ) )
                    // InternalTExp.g:1150:4: () ( (lv_name_6_0= RULE_VARIABLE ) )
                    {
                    // InternalTExp.g:1150:4: ()
                    // InternalTExp.g:1151:5: 
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

                    // InternalTExp.g:1160:4: ( (lv_name_6_0= RULE_VARIABLE ) )
                    // InternalTExp.g:1161:5: (lv_name_6_0= RULE_VARIABLE )
                    {
                    // InternalTExp.g:1161:5: (lv_name_6_0= RULE_VARIABLE )
                    // InternalTExp.g:1162:6: lv_name_6_0= RULE_VARIABLE
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
                    // InternalTExp.g:1180:3: ( () ( (lv_value_8_0= RULE_STRING ) ) )
                    {
                    // InternalTExp.g:1180:3: ( () ( (lv_value_8_0= RULE_STRING ) ) )
                    // InternalTExp.g:1181:4: () ( (lv_value_8_0= RULE_STRING ) )
                    {
                    // InternalTExp.g:1181:4: ()
                    // InternalTExp.g:1182:5: 
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

                    // InternalTExp.g:1191:4: ( (lv_value_8_0= RULE_STRING ) )
                    // InternalTExp.g:1192:5: (lv_value_8_0= RULE_STRING )
                    {
                    // InternalTExp.g:1192:5: (lv_value_8_0= RULE_STRING )
                    // InternalTExp.g:1193:6: lv_value_8_0= RULE_STRING
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
                    // InternalTExp.g:1211:3: ( () ( (lv_value_10_0= ruleNUMBER ) ) )
                    {
                    // InternalTExp.g:1211:3: ( () ( (lv_value_10_0= ruleNUMBER ) ) )
                    // InternalTExp.g:1212:4: () ( (lv_value_10_0= ruleNUMBER ) )
                    {
                    // InternalTExp.g:1212:4: ()
                    // InternalTExp.g:1213:5: 
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

                    // InternalTExp.g:1222:4: ( (lv_value_10_0= ruleNUMBER ) )
                    // InternalTExp.g:1223:5: (lv_value_10_0= ruleNUMBER )
                    {
                    // InternalTExp.g:1223:5: (lv_value_10_0= ruleNUMBER )
                    // InternalTExp.g:1224:6: lv_value_10_0= ruleNUMBER
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
                    // InternalTExp.g:1243:3: ( () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']' )
                    {
                    // InternalTExp.g:1243:3: ( () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']' )
                    // InternalTExp.g:1244:4: () otherlv_12= '[' ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )? otherlv_16= ']'
                    {
                    // InternalTExp.g:1244:4: ()
                    // InternalTExp.g:1245:5: 
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

                    otherlv_12=(Token)match(input,35,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getExpression0Access().getLeftSquareBracketKeyword_4_1());
                      			
                    }
                    // InternalTExp.g:1258:4: ( ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )? )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=RULE_ATOM && LA17_0<=RULE_INT)||(LA17_0>=RULE_VARIABLE && LA17_0<=RULE_STRING)||(LA17_0>=30 && LA17_0<=33)||LA17_0==35) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalTExp.g:1259:5: ( (lv_head_13_0= ruleExpressionInfinity ) ) (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )?
                            {
                            // InternalTExp.g:1259:5: ( (lv_head_13_0= ruleExpressionInfinity ) )
                            // InternalTExp.g:1260:6: (lv_head_13_0= ruleExpressionInfinity )
                            {
                            // InternalTExp.g:1260:6: (lv_head_13_0= ruleExpressionInfinity )
                            // InternalTExp.g:1261:7: lv_head_13_0= ruleExpressionInfinity
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getExpression0Access().getHeadExpressionInfinityParserRuleCall_4_2_0_0());
                              						
                            }
                            pushFollow(FOLLOW_19);
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

                            // InternalTExp.g:1278:5: (otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) ) )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==36) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // InternalTExp.g:1279:6: otherlv_14= '|' ( (lv_tail_15_0= ruleExpressionInfinity ) )
                                    {
                                    otherlv_14=(Token)match(input,36,FOLLOW_8); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      						newLeafNode(otherlv_14, grammarAccess.getExpression0Access().getVerticalLineKeyword_4_2_1_0());
                                      					
                                    }
                                    // InternalTExp.g:1283:6: ( (lv_tail_15_0= ruleExpressionInfinity ) )
                                    // InternalTExp.g:1284:7: (lv_tail_15_0= ruleExpressionInfinity )
                                    {
                                    // InternalTExp.g:1284:7: (lv_tail_15_0= ruleExpressionInfinity )
                                    // InternalTExp.g:1285:8: lv_tail_15_0= ruleExpressionInfinity
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getExpression0Access().getTailExpressionInfinityParserRuleCall_4_2_1_1_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_20);
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
                    // InternalTExp.g:1310:3: (otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')' )
                    {
                    // InternalTExp.g:1310:3: (otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')' )
                    // InternalTExp.g:1311:4: otherlv_17= '(' this_ExpressionInfinity_18= ruleExpressionInfinity otherlv_19= ')'
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
                    pushFollow(FOLLOW_17);
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
    // InternalTExp.g:1335:1: entryRuleTraceExpression returns [EObject current=null] : iv_ruleTraceExpression= ruleTraceExpression EOF ;
    public final EObject entryRuleTraceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTraceExpression = null;


        try {
            // InternalTExp.g:1335:56: (iv_ruleTraceExpression= ruleTraceExpression EOF )
            // InternalTExp.g:1336:2: iv_ruleTraceExpression= ruleTraceExpression EOF
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
    // InternalTExp.g:1342:1: ruleTraceExpression returns [EObject current=null] : ( () otherlv_1= 'trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) ) ) )+ otherlv_28= '}' ) ;
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
            // InternalTExp.g:1348:2: ( ( () otherlv_1= 'trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) ) ) )+ otherlv_28= '}' ) )
            // InternalTExp.g:1349:2: ( () otherlv_1= 'trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) ) ) )+ otherlv_28= '}' )
            {
            // InternalTExp.g:1349:2: ( () otherlv_1= 'trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) ) ) )+ otherlv_28= '}' )
            // InternalTExp.g:1350:3: () otherlv_1= 'trace_expression' otherlv_2= '{' otherlv_3= 'id:' ( (lv_name_4_0= ruleID ) ) ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) ) ) )+ otherlv_28= '}'
            {
            // InternalTExp.g:1350:3: ()
            // InternalTExp.g:1351:4: 
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

            otherlv_1=(Token)match(input,38,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTraceExpressionAccess().getTrace_expressionKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,39,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTraceExpressionAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,40,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getTraceExpressionAccess().getIdKeyword_3());
              		
            }
            // InternalTExp.g:1372:3: ( (lv_name_4_0= ruleID ) )
            // InternalTExp.g:1373:4: (lv_name_4_0= ruleID )
            {
            // InternalTExp.g:1373:4: (lv_name_4_0= ruleID )
            // InternalTExp.g:1374:5: lv_name_4_0= ruleID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTraceExpressionAccess().getNameIDParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_24);
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

            // InternalTExp.g:1391:3: ( ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ ) | ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* ) | ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleEventType ) )* ) | ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* ) | ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) ) | ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) ) | ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* ) | ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) ) | ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) ) | ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) ) | ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) ) ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=12;
                switch ( input.LA(1) ) {
                case 41:
                    {
                    alt28=1;
                    }
                    break;
                case 42:
                    {
                    alt28=2;
                    }
                    break;
                case 43:
                    {
                    alt28=3;
                    }
                    break;
                case 44:
                    {
                    alt28=4;
                    }
                    break;
                case 45:
                    {
                    alt28=5;
                    }
                    break;
                case 48:
                    {
                    alt28=6;
                    }
                    break;
                case 49:
                    {
                    alt28=7;
                    }
                    break;
                case 50:
                    {
                    alt28=8;
                    }
                    break;
                case 51:
                    {
                    alt28=9;
                    }
                    break;
                case 52:
                    {
                    alt28=10;
                    }
                    break;
                case 53:
                    {
                    alt28=11;
                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // InternalTExp.g:1392:4: ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ )
            	    {
            	    // InternalTExp.g:1392:4: ( ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+ )
            	    // InternalTExp.g:1393:5: ( (lv_bodyL_5_0= 'body:' ) ) ( (lv_terms_6_0= ruleTerm ) )+
            	    {
            	    // InternalTExp.g:1393:5: ( (lv_bodyL_5_0= 'body:' ) )
            	    // InternalTExp.g:1394:6: (lv_bodyL_5_0= 'body:' )
            	    {
            	    // InternalTExp.g:1394:6: (lv_bodyL_5_0= 'body:' )
            	    // InternalTExp.g:1395:7: lv_bodyL_5_0= 'body:'
            	    {
            	    lv_bodyL_5_0=(Token)match(input,41,FOLLOW_23); if (state.failed) return current;
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

            	    // InternalTExp.g:1407:5: ( (lv_terms_6_0= ruleTerm ) )+
            	    int cnt19=0;
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==RULE_ATOM) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalTExp.g:1408:6: (lv_terms_6_0= ruleTerm )
            	    	    {
            	    	    // InternalTExp.g:1408:6: (lv_terms_6_0= ruleTerm )
            	    	    // InternalTExp.g:1409:7: lv_terms_6_0= ruleTerm
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getTraceExpressionAccess().getTermsTermParserRuleCall_5_0_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_25);
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
            	    	    if ( cnt19 >= 1 ) break loop19;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(19, input);
            	                throw eee;
            	        }
            	        cnt19++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTExp.g:1428:4: ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* )
            	    {
            	    // InternalTExp.g:1428:4: ( ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )* )
            	    // InternalTExp.g:1429:5: ( (lv_rolesL_7_0= 'roles:' ) ) ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )*
            	    {
            	    // InternalTExp.g:1429:5: ( (lv_rolesL_7_0= 'roles:' ) )
            	    // InternalTExp.g:1430:6: (lv_rolesL_7_0= 'roles:' )
            	    {
            	    // InternalTExp.g:1430:6: (lv_rolesL_7_0= 'roles:' )
            	    // InternalTExp.g:1431:7: lv_rolesL_7_0= 'roles:'
            	    {
            	    lv_rolesL_7_0=(Token)match(input,42,FOLLOW_25); if (state.failed) return current;
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

            	    // InternalTExp.g:1443:5: ( ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )? )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==RULE_ATOM) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // InternalTExp.g:1444:6: ( (lv_roles_8_0= ruleRole ) ) (this_OP1000XFY_9= RULE_OP1000XFY )?
            	    	    {
            	    	    // InternalTExp.g:1444:6: ( (lv_roles_8_0= ruleRole ) )
            	    	    // InternalTExp.g:1445:7: (lv_roles_8_0= ruleRole )
            	    	    {
            	    	    // InternalTExp.g:1445:7: (lv_roles_8_0= ruleRole )
            	    	    // InternalTExp.g:1446:8: lv_roles_8_0= ruleRole
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getTraceExpressionAccess().getRolesRoleParserRuleCall_5_1_1_0_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FOLLOW_26);
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

            	    	    // InternalTExp.g:1463:6: (this_OP1000XFY_9= RULE_OP1000XFY )?
            	    	    int alt20=2;
            	    	    int LA20_0 = input.LA(1);

            	    	    if ( (LA20_0==RULE_OP1000XFY) ) {
            	    	        alt20=1;
            	    	    }
            	    	    switch (alt20) {
            	    	        case 1 :
            	    	            // InternalTExp.g:1464:7: this_OP1000XFY_9= RULE_OP1000XFY
            	    	            {
            	    	            this_OP1000XFY_9=(Token)match(input,RULE_OP1000XFY,FOLLOW_25); if (state.failed) return current;
            	    	            if ( state.backtracking==0 ) {

            	    	              							newLeafNode(this_OP1000XFY_9, grammarAccess.getTraceExpressionAccess().getOP1000XFYTerminalRuleCall_5_1_1_1());
            	    	              						
            	    	            }

            	    	            }
            	    	            break;

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop21;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTExp.g:1472:4: ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleEventType ) )* )
            	    {
            	    // InternalTExp.g:1472:4: ( ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleEventType ) )* )
            	    // InternalTExp.g:1473:5: ( (lv_typesL_10_0= 'types:' ) ) ( (lv_types_11_0= ruleEventType ) )*
            	    {
            	    // InternalTExp.g:1473:5: ( (lv_typesL_10_0= 'types:' ) )
            	    // InternalTExp.g:1474:6: (lv_typesL_10_0= 'types:' )
            	    {
            	    // InternalTExp.g:1474:6: (lv_typesL_10_0= 'types:' )
            	    // InternalTExp.g:1475:7: lv_typesL_10_0= 'types:'
            	    {
            	    lv_typesL_10_0=(Token)match(input,43,FOLLOW_25); if (state.failed) return current;
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

            	    // InternalTExp.g:1487:5: ( (lv_types_11_0= ruleEventType ) )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==RULE_ATOM) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // InternalTExp.g:1488:6: (lv_types_11_0= ruleEventType )
            	    	    {
            	    	    // InternalTExp.g:1488:6: (lv_types_11_0= ruleEventType )
            	    	    // InternalTExp.g:1489:7: lv_types_11_0= ruleEventType
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getTraceExpressionAccess().getTypesEventTypeParserRuleCall_5_2_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_25);
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
            	    	    break loop22;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalTExp.g:1508:4: ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* )
            	    {
            	    // InternalTExp.g:1508:4: ( ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )* )
            	    // InternalTExp.g:1509:5: ( (lv_modulesL_12_0= 'modules:' ) ) ( (lv_modules_13_0= ruleModule ) )*
            	    {
            	    // InternalTExp.g:1509:5: ( (lv_modulesL_12_0= 'modules:' ) )
            	    // InternalTExp.g:1510:6: (lv_modulesL_12_0= 'modules:' )
            	    {
            	    // InternalTExp.g:1510:6: (lv_modulesL_12_0= 'modules:' )
            	    // InternalTExp.g:1511:7: lv_modulesL_12_0= 'modules:'
            	    {
            	    lv_modulesL_12_0=(Token)match(input,44,FOLLOW_27); if (state.failed) return current;
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

            	    // InternalTExp.g:1523:5: ( (lv_modules_13_0= ruleModule ) )*
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==RULE_ATOM||LA23_0==RULE_VARIABLE) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // InternalTExp.g:1524:6: (lv_modules_13_0= ruleModule )
            	    	    {
            	    	    // InternalTExp.g:1524:6: (lv_modules_13_0= ruleModule )
            	    	    // InternalTExp.g:1525:7: lv_modules_13_0= ruleModule
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getTraceExpressionAccess().getModulesModuleParserRuleCall_5_3_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_27);
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
            	    	    break loop23;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalTExp.g:1544:4: ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) )
            	    {
            	    // InternalTExp.g:1544:4: ( ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) ) )
            	    // InternalTExp.g:1545:5: ( (lv_decentralizedL_14_0= 'decentralized:' ) ) ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) )
            	    {
            	    // InternalTExp.g:1545:5: ( (lv_decentralizedL_14_0= 'decentralized:' ) )
            	    // InternalTExp.g:1546:6: (lv_decentralizedL_14_0= 'decentralized:' )
            	    {
            	    // InternalTExp.g:1546:6: (lv_decentralizedL_14_0= 'decentralized:' )
            	    // InternalTExp.g:1547:7: lv_decentralizedL_14_0= 'decentralized:'
            	    {
            	    lv_decentralizedL_14_0=(Token)match(input,45,FOLLOW_28); if (state.failed) return current;
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

            	    // InternalTExp.g:1559:5: ( ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) ) )
            	    // InternalTExp.g:1560:6: ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) )
            	    {
            	    // InternalTExp.g:1560:6: ( (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' ) )
            	    // InternalTExp.g:1561:7: (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' )
            	    {
            	    // InternalTExp.g:1561:7: (lv_decentralized_15_1= 'true' | lv_decentralized_15_2= 'false' )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==46) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==47) ) {
            	        alt24=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalTExp.g:1562:8: lv_decentralized_15_1= 'true'
            	            {
            	            lv_decentralized_15_1=(Token)match(input,46,FOLLOW_29); if (state.failed) return current;
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
            	            // InternalTExp.g:1573:8: lv_decentralized_15_2= 'false'
            	            {
            	            lv_decentralized_15_2=(Token)match(input,47,FOLLOW_29); if (state.failed) return current;
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
            	    // InternalTExp.g:1588:4: ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) )
            	    {
            	    // InternalTExp.g:1588:4: ( ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) ) )
            	    // InternalTExp.g:1589:5: ( (lv_partitionL_16_0= 'partition:' ) ) ( (lv_partition_17_0= rulePartition ) )
            	    {
            	    // InternalTExp.g:1589:5: ( (lv_partitionL_16_0= 'partition:' ) )
            	    // InternalTExp.g:1590:6: (lv_partitionL_16_0= 'partition:' )
            	    {
            	    // InternalTExp.g:1590:6: (lv_partitionL_16_0= 'partition:' )
            	    // InternalTExp.g:1591:7: lv_partitionL_16_0= 'partition:'
            	    {
            	    lv_partitionL_16_0=(Token)match(input,48,FOLLOW_30); if (state.failed) return current;
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

            	    // InternalTExp.g:1603:5: ( (lv_partition_17_0= rulePartition ) )
            	    // InternalTExp.g:1604:6: (lv_partition_17_0= rulePartition )
            	    {
            	    // InternalTExp.g:1604:6: (lv_partition_17_0= rulePartition )
            	    // InternalTExp.g:1605:7: lv_partition_17_0= rulePartition
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getTraceExpressionAccess().getPartitionPartitionParserRuleCall_5_5_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    // InternalTExp.g:1624:4: ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* )
            	    {
            	    // InternalTExp.g:1624:4: ( ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )* )
            	    // InternalTExp.g:1625:5: ( (lv_constraintsL_18_0= 'constraints:' ) ) ( (lv_constraints_19_0= ruleConstraint ) )*
            	    {
            	    // InternalTExp.g:1625:5: ( (lv_constraintsL_18_0= 'constraints:' ) )
            	    // InternalTExp.g:1626:6: (lv_constraintsL_18_0= 'constraints:' )
            	    {
            	    // InternalTExp.g:1626:6: (lv_constraintsL_18_0= 'constraints:' )
            	    // InternalTExp.g:1627:7: lv_constraintsL_18_0= 'constraints:'
            	    {
            	    lv_constraintsL_18_0=(Token)match(input,49,FOLLOW_31); if (state.failed) return current;
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

            	    // InternalTExp.g:1639:5: ( (lv_constraints_19_0= ruleConstraint ) )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==35||(LA25_0>=64 && LA25_0<=66)) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // InternalTExp.g:1640:6: (lv_constraints_19_0= ruleConstraint )
            	    	    {
            	    	    // InternalTExp.g:1640:6: (lv_constraints_19_0= ruleConstraint )
            	    	    // InternalTExp.g:1641:7: lv_constraints_19_0= ruleConstraint
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getTraceExpressionAccess().getConstraintsConstraintParserRuleCall_5_6_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_31);
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
            	    	    break loop25;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalTExp.g:1660:4: ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) )
            	    {
            	    // InternalTExp.g:1660:4: ( ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) ) )
            	    // InternalTExp.g:1661:5: ( (lv_guiL_20_0= 'gui:' ) ) ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) )
            	    {
            	    // InternalTExp.g:1661:5: ( (lv_guiL_20_0= 'gui:' ) )
            	    // InternalTExp.g:1662:6: (lv_guiL_20_0= 'gui:' )
            	    {
            	    // InternalTExp.g:1662:6: (lv_guiL_20_0= 'gui:' )
            	    // InternalTExp.g:1663:7: lv_guiL_20_0= 'gui:'
            	    {
            	    lv_guiL_20_0=(Token)match(input,50,FOLLOW_28); if (state.failed) return current;
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

            	    // InternalTExp.g:1675:5: ( ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) ) )
            	    // InternalTExp.g:1676:6: ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) )
            	    {
            	    // InternalTExp.g:1676:6: ( (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' ) )
            	    // InternalTExp.g:1677:7: (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' )
            	    {
            	    // InternalTExp.g:1677:7: (lv_gui_21_1= 'true' | lv_gui_21_2= 'false' )
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
            	            // InternalTExp.g:1678:8: lv_gui_21_1= 'true'
            	            {
            	            lv_gui_21_1=(Token)match(input,46,FOLLOW_29); if (state.failed) return current;
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
            	            // InternalTExp.g:1689:8: lv_gui_21_2= 'false'
            	            {
            	            lv_gui_21_2=(Token)match(input,47,FOLLOW_29); if (state.failed) return current;
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
            	    // InternalTExp.g:1704:4: ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) )
            	    {
            	    // InternalTExp.g:1704:4: ( ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) ) )
            	    // InternalTExp.g:1705:5: ( (lv_minimalL_22_0= 'minimal:' ) ) ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) )
            	    {
            	    // InternalTExp.g:1705:5: ( (lv_minimalL_22_0= 'minimal:' ) )
            	    // InternalTExp.g:1706:6: (lv_minimalL_22_0= 'minimal:' )
            	    {
            	    // InternalTExp.g:1706:6: (lv_minimalL_22_0= 'minimal:' )
            	    // InternalTExp.g:1707:7: lv_minimalL_22_0= 'minimal:'
            	    {
            	    lv_minimalL_22_0=(Token)match(input,51,FOLLOW_28); if (state.failed) return current;
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

            	    // InternalTExp.g:1719:5: ( ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) ) )
            	    // InternalTExp.g:1720:6: ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) )
            	    {
            	    // InternalTExp.g:1720:6: ( (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' ) )
            	    // InternalTExp.g:1721:7: (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' )
            	    {
            	    // InternalTExp.g:1721:7: (lv_minimal_23_1= 'true' | lv_minimal_23_2= 'false' )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==46) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==47) ) {
            	        alt27=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalTExp.g:1722:8: lv_minimal_23_1= 'true'
            	            {
            	            lv_minimal_23_1=(Token)match(input,46,FOLLOW_29); if (state.failed) return current;
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
            	            // InternalTExp.g:1733:8: lv_minimal_23_2= 'false'
            	            {
            	            lv_minimal_23_2=(Token)match(input,47,FOLLOW_29); if (state.failed) return current;
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
            	    // InternalTExp.g:1748:4: ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) )
            	    {
            	    // InternalTExp.g:1748:4: ( ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) ) )
            	    // InternalTExp.g:1749:5: ( (lv_thresholdL_24_0= 'threshold:' ) ) ( (lv_threshold_25_0= ruleNUMBER ) )
            	    {
            	    // InternalTExp.g:1749:5: ( (lv_thresholdL_24_0= 'threshold:' ) )
            	    // InternalTExp.g:1750:6: (lv_thresholdL_24_0= 'threshold:' )
            	    {
            	    // InternalTExp.g:1750:6: (lv_thresholdL_24_0= 'threshold:' )
            	    // InternalTExp.g:1751:7: lv_thresholdL_24_0= 'threshold:'
            	    {
            	    lv_thresholdL_24_0=(Token)match(input,52,FOLLOW_32); if (state.failed) return current;
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

            	    // InternalTExp.g:1763:5: ( (lv_threshold_25_0= ruleNUMBER ) )
            	    // InternalTExp.g:1764:6: (lv_threshold_25_0= ruleNUMBER )
            	    {
            	    // InternalTExp.g:1764:6: (lv_threshold_25_0= ruleNUMBER )
            	    // InternalTExp.g:1765:7: lv_threshold_25_0= ruleNUMBER
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getTraceExpressionAccess().getThresholdNUMBERParserRuleCall_5_9_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    // InternalTExp.g:1784:4: ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) ) )
            	    {
            	    // InternalTExp.g:1784:4: ( ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) ) )
            	    // InternalTExp.g:1785:5: ( (lv_channelsL_26_0= 'channels:' ) ) ( (lv_channels_27_0= ruleChannel ) )
            	    {
            	    // InternalTExp.g:1785:5: ( (lv_channelsL_26_0= 'channels:' ) )
            	    // InternalTExp.g:1786:6: (lv_channelsL_26_0= 'channels:' )
            	    {
            	    // InternalTExp.g:1786:6: (lv_channelsL_26_0= 'channels:' )
            	    // InternalTExp.g:1787:7: lv_channelsL_26_0= 'channels:'
            	    {
            	    lv_channelsL_26_0=(Token)match(input,53,FOLLOW_23); if (state.failed) return current;
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

            	    // InternalTExp.g:1799:5: ( (lv_channels_27_0= ruleChannel ) )
            	    // InternalTExp.g:1800:6: (lv_channels_27_0= ruleChannel )
            	    {
            	    // InternalTExp.g:1800:6: (lv_channels_27_0= ruleChannel )
            	    // InternalTExp.g:1801:7: lv_channels_27_0= ruleChannel
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getTraceExpressionAccess().getChannelsChannelParserRuleCall_5_10_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_29);
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


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
    // InternalTExp.g:1828:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalTExp.g:1828:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalTExp.g:1829:2: iv_ruleTerm= ruleTerm EOF
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
    // InternalTExp.g:1835:1: ruleTerm returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleAndExpr ) ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:1841:2: ( ( ( (lv_name_0_0= ruleID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleAndExpr ) ) ) )
            // InternalTExp.g:1842:2: ( ( (lv_name_0_0= ruleID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleAndExpr ) ) )
            {
            // InternalTExp.g:1842:2: ( ( (lv_name_0_0= ruleID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleAndExpr ) ) )
            // InternalTExp.g:1843:3: ( (lv_name_0_0= ruleID ) ) otherlv_1= '<-' ( (lv_expr_2_0= ruleAndExpr ) )
            {
            // InternalTExp.g:1843:3: ( (lv_name_0_0= ruleID ) )
            // InternalTExp.g:1844:4: (lv_name_0_0= ruleID )
            {
            // InternalTExp.g:1844:4: (lv_name_0_0= ruleID )
            // InternalTExp.g:1845:5: lv_name_0_0= ruleID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTermAccess().getNameIDParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_33);
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

            otherlv_1=(Token)match(input,55,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTermAccess().getLessThanSignHyphenMinusKeyword_1());
              		
            }
            // InternalTExp.g:1866:3: ( (lv_expr_2_0= ruleAndExpr ) )
            // InternalTExp.g:1867:4: (lv_expr_2_0= ruleAndExpr )
            {
            // InternalTExp.g:1867:4: (lv_expr_2_0= ruleAndExpr )
            // InternalTExp.g:1868:5: lv_expr_2_0= ruleAndExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTermAccess().getExprAndExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleAndExpr();

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
              						"it.unige.dibris.trace_expression_language.TExp.AndExpr");
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


    // $ANTLR start "entryRuleAndExpr"
    // InternalTExp.g:1889:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // InternalTExp.g:1889:48: (iv_ruleAndExpr= ruleAndExpr EOF )
            // InternalTExp.g:1890:2: iv_ruleAndExpr= ruleAndExpr EOF
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
    // InternalTExp.g:1896:1: ruleAndExpr returns [EObject current=null] : (this_CatExpr_0= ruleCatExpr ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_CatExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:1902:2: ( (this_CatExpr_0= ruleCatExpr ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )* ) )
            // InternalTExp.g:1903:2: (this_CatExpr_0= ruleCatExpr ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )* )
            {
            // InternalTExp.g:1903:2: (this_CatExpr_0= ruleCatExpr ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )* )
            // InternalTExp.g:1904:3: this_CatExpr_0= ruleCatExpr ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExprAccess().getCatExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_35);
            this_CatExpr_0=ruleCatExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_CatExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:1915:3: ( () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==56) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalTExp.g:1916:4: () ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) ) ( (lv_right_3_0= ruleCatExpr ) )
            	    {
            	    // InternalTExp.g:1916:4: ()
            	    // InternalTExp.g:1917:5: 
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

            	    // InternalTExp.g:1926:4: ( ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' ) )
            	    // InternalTExp.g:1927:5: ( ( '/\\\\' ) )=> (lv_operator_2_0= '/\\\\' )
            	    {
            	    // InternalTExp.g:1931:5: (lv_operator_2_0= '/\\\\' )
            	    // InternalTExp.g:1932:6: lv_operator_2_0= '/\\\\'
            	    {
            	    lv_operator_2_0=(Token)match(input,56,FOLLOW_34); if (state.failed) return current;
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

            	    // InternalTExp.g:1944:4: ( (lv_right_3_0= ruleCatExpr ) )
            	    // InternalTExp.g:1945:5: (lv_right_3_0= ruleCatExpr )
            	    {
            	    // InternalTExp.g:1945:5: (lv_right_3_0= ruleCatExpr )
            	    // InternalTExp.g:1946:6: lv_right_3_0= ruleCatExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExprAccess().getRightCatExprParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_35);
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
            	    break loop29;
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
    // InternalTExp.g:1968:1: entryRuleCatExpr returns [EObject current=null] : iv_ruleCatExpr= ruleCatExpr EOF ;
    public final EObject entryRuleCatExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatExpr = null;


        try {
            // InternalTExp.g:1968:48: (iv_ruleCatExpr= ruleCatExpr EOF )
            // InternalTExp.g:1969:2: iv_ruleCatExpr= ruleCatExpr EOF
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
    // InternalTExp.g:1975:1: ruleCatExpr returns [EObject current=null] : (this_ShuffleExpr_0= ruleShuffleExpr ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= ruleShuffleExpr ) ) )* ) ;
    public final EObject ruleCatExpr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_ShuffleExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:1981:2: ( (this_ShuffleExpr_0= ruleShuffleExpr ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= ruleShuffleExpr ) ) )* ) )
            // InternalTExp.g:1982:2: (this_ShuffleExpr_0= ruleShuffleExpr ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= ruleShuffleExpr ) ) )* )
            {
            // InternalTExp.g:1982:2: (this_ShuffleExpr_0= ruleShuffleExpr ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= ruleShuffleExpr ) ) )* )
            // InternalTExp.g:1983:3: this_ShuffleExpr_0= ruleShuffleExpr ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= ruleShuffleExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCatExprAccess().getShuffleExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_ShuffleExpr_0=ruleShuffleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ShuffleExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:1994:3: ( () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= ruleShuffleExpr ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==57) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalTExp.g:1995:4: () ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) ) ( (lv_right_3_0= ruleShuffleExpr ) )
            	    {
            	    // InternalTExp.g:1995:4: ()
            	    // InternalTExp.g:1996:5: 
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

            	    // InternalTExp.g:2005:4: ( ( ( '*' ) )=> (lv_operator_2_0= '*' ) )
            	    // InternalTExp.g:2006:5: ( ( '*' ) )=> (lv_operator_2_0= '*' )
            	    {
            	    // InternalTExp.g:2010:5: (lv_operator_2_0= '*' )
            	    // InternalTExp.g:2011:6: lv_operator_2_0= '*'
            	    {
            	    lv_operator_2_0=(Token)match(input,57,FOLLOW_34); if (state.failed) return current;
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

            	    // InternalTExp.g:2023:4: ( (lv_right_3_0= ruleShuffleExpr ) )
            	    // InternalTExp.g:2024:5: (lv_right_3_0= ruleShuffleExpr )
            	    {
            	    // InternalTExp.g:2024:5: (lv_right_3_0= ruleShuffleExpr )
            	    // InternalTExp.g:2025:6: lv_right_3_0= ruleShuffleExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getCatExprAccess().getRightShuffleExprParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_right_3_0=ruleShuffleExpr();

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
            	      							"it.unige.dibris.trace_expression_language.TExp.ShuffleExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==36) ) {
                    alt31=1;
                }


                switch (alt31) {
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
            	    lv_operator_2_0=(Token)match(input,36,FOLLOW_34); if (state.failed) return current;
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
            	    break loop31;
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
    // InternalTExp.g:2133:1: ruleUnionExpr returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleUnionExpr() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2139:2: ( (this_Primary_0= rulePrimary ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalTExp.g:2140:2: (this_Primary_0= rulePrimary ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalTExp.g:2140:2: (this_Primary_0= rulePrimary ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalTExp.g:2141:3: this_Primary_0= rulePrimary ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getUnionExprAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalTExp.g:2152:3: ( () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==58) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalTExp.g:2153:4: () ( ( ( '\\\\/' ) )=> (lv_operator_2_0= '\\\\/' ) ) ( (lv_right_3_0= rulePrimary ) )
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
            	    lv_operator_2_0=(Token)match(input,58,FOLLOW_34); if (state.failed) return current;
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

            	    // InternalTExp.g:2181:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalTExp.g:2182:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalTExp.g:2182:5: (lv_right_3_0= rulePrimary )
            	    // InternalTExp.g:2183:6: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getUnionExprAccess().getRightPrimaryParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_right_3_0=rulePrimary();

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
            	      							"it.unige.dibris.trace_expression_language.TExp.Primary");
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
    // $ANTLR end "ruleUnionExpr"


    // $ANTLR start "entryRulePrimary"
    // InternalTExp.g:2205:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalTExp.g:2205:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalTExp.g:2206:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalTExp.g:2212:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) ) | ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) ) | ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) ) | ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject lv_seqExpr_1_0 = null;

        EObject lv_filterExpr_3_0 = null;

        EObject lv_varExpr_5_0 = null;

        EObject lv_terminalExpr_7_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2218:2: ( ( ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) ) | ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) ) | ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) ) | ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) ) ) )
            // InternalTExp.g:2219:2: ( ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) ) | ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) ) | ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) ) | ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) ) )
            {
            // InternalTExp.g:2219:2: ( ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) ) | ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) ) | ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) ) | ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case RULE_ATOM:
                {
                int LA33_1 = input.LA(2);

                if ( (synpred71_InternalTExp()) ) {
                    alt33=1;
                }
                else if ( (synpred72_InternalTExp()) ) {
                    alt33=2;
                }
                else if ( (true) ) {
                    alt33=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_OP700XFXL:
                {
                alt33=3;
                }
                break;
            case 33:
            case 59:
                {
                alt33=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalTExp.g:2220:3: ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) )
                    {
                    // InternalTExp.g:2220:3: ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) )
                    // InternalTExp.g:2221:4: () ( (lv_seqExpr_1_0= ruleSeqExpr ) )
                    {
                    // InternalTExp.g:2221:4: ()
                    // InternalTExp.g:2222:5: 
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

                    // InternalTExp.g:2231:4: ( (lv_seqExpr_1_0= ruleSeqExpr ) )
                    // InternalTExp.g:2232:5: (lv_seqExpr_1_0= ruleSeqExpr )
                    {
                    // InternalTExp.g:2232:5: (lv_seqExpr_1_0= ruleSeqExpr )
                    // InternalTExp.g:2233:6: lv_seqExpr_1_0= ruleSeqExpr
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
                    // InternalTExp.g:2252:3: ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) )
                    {
                    // InternalTExp.g:2252:3: ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) )
                    // InternalTExp.g:2253:4: () ( (lv_filterExpr_3_0= ruleFilterExpr ) )
                    {
                    // InternalTExp.g:2253:4: ()
                    // InternalTExp.g:2254:5: 
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

                    // InternalTExp.g:2263:4: ( (lv_filterExpr_3_0= ruleFilterExpr ) )
                    // InternalTExp.g:2264:5: (lv_filterExpr_3_0= ruleFilterExpr )
                    {
                    // InternalTExp.g:2264:5: (lv_filterExpr_3_0= ruleFilterExpr )
                    // InternalTExp.g:2265:6: lv_filterExpr_3_0= ruleFilterExpr
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
                    // InternalTExp.g:2284:3: ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) )
                    {
                    // InternalTExp.g:2284:3: ( () ( (lv_varExpr_5_0= ruleVarExpr ) ) )
                    // InternalTExp.g:2285:4: () ( (lv_varExpr_5_0= ruleVarExpr ) )
                    {
                    // InternalTExp.g:2285:4: ()
                    // InternalTExp.g:2286:5: 
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

                    // InternalTExp.g:2295:4: ( (lv_varExpr_5_0= ruleVarExpr ) )
                    // InternalTExp.g:2296:5: (lv_varExpr_5_0= ruleVarExpr )
                    {
                    // InternalTExp.g:2296:5: (lv_varExpr_5_0= ruleVarExpr )
                    // InternalTExp.g:2297:6: lv_varExpr_5_0= ruleVarExpr
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
                    // InternalTExp.g:2316:3: ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) )
                    {
                    // InternalTExp.g:2316:3: ( () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) ) )
                    // InternalTExp.g:2317:4: () ( (lv_terminalExpr_7_0= ruleTerminalExpr ) )
                    {
                    // InternalTExp.g:2317:4: ()
                    // InternalTExp.g:2318:5: 
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

                    // InternalTExp.g:2327:4: ( (lv_terminalExpr_7_0= ruleTerminalExpr ) )
                    // InternalTExp.g:2328:5: (lv_terminalExpr_7_0= ruleTerminalExpr )
                    {
                    // InternalTExp.g:2328:5: (lv_terminalExpr_7_0= ruleTerminalExpr )
                    // InternalTExp.g:2329:6: lv_terminalExpr_7_0= ruleTerminalExpr
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
    // InternalTExp.g:2351:1: entryRuleVarExpr returns [EObject current=null] : iv_ruleVarExpr= ruleVarExpr EOF ;
    public final EObject entryRuleVarExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarExpr = null;


        try {
            // InternalTExp.g:2351:48: (iv_ruleVarExpr= ruleVarExpr EOF )
            // InternalTExp.g:2352:2: iv_ruleVarExpr= ruleVarExpr EOF
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
    // InternalTExp.g:2358:1: ruleVarExpr returns [EObject current=null] : (this_OP700XFXL_0= RULE_OP700XFXL ( (lv_variable_1_0= RULE_VARIABLE ) ) this_OP1000XFY_2= RULE_OP1000XFY ( (lv_bodyVar_3_0= rulePrimary ) ) this_OP700XFXR_4= RULE_OP700XFXR ) ;
    public final EObject ruleVarExpr() throws RecognitionException {
        EObject current = null;

        Token this_OP700XFXL_0=null;
        Token lv_variable_1_0=null;
        Token this_OP1000XFY_2=null;
        Token this_OP700XFXR_4=null;
        EObject lv_bodyVar_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2364:2: ( (this_OP700XFXL_0= RULE_OP700XFXL ( (lv_variable_1_0= RULE_VARIABLE ) ) this_OP1000XFY_2= RULE_OP1000XFY ( (lv_bodyVar_3_0= rulePrimary ) ) this_OP700XFXR_4= RULE_OP700XFXR ) )
            // InternalTExp.g:2365:2: (this_OP700XFXL_0= RULE_OP700XFXL ( (lv_variable_1_0= RULE_VARIABLE ) ) this_OP1000XFY_2= RULE_OP1000XFY ( (lv_bodyVar_3_0= rulePrimary ) ) this_OP700XFXR_4= RULE_OP700XFXR )
            {
            // InternalTExp.g:2365:2: (this_OP700XFXL_0= RULE_OP700XFXL ( (lv_variable_1_0= RULE_VARIABLE ) ) this_OP1000XFY_2= RULE_OP1000XFY ( (lv_bodyVar_3_0= rulePrimary ) ) this_OP700XFXR_4= RULE_OP700XFXR )
            // InternalTExp.g:2366:3: this_OP700XFXL_0= RULE_OP700XFXL ( (lv_variable_1_0= RULE_VARIABLE ) ) this_OP1000XFY_2= RULE_OP1000XFY ( (lv_bodyVar_3_0= rulePrimary ) ) this_OP700XFXR_4= RULE_OP700XFXR
            {
            this_OP700XFXL_0=(Token)match(input,RULE_OP700XFXL,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OP700XFXL_0, grammarAccess.getVarExprAccess().getOP700XFXLTerminalRuleCall_0());
              		
            }
            // InternalTExp.g:2370:3: ( (lv_variable_1_0= RULE_VARIABLE ) )
            // InternalTExp.g:2371:4: (lv_variable_1_0= RULE_VARIABLE )
            {
            // InternalTExp.g:2371:4: (lv_variable_1_0= RULE_VARIABLE )
            // InternalTExp.g:2372:5: lv_variable_1_0= RULE_VARIABLE
            {
            lv_variable_1_0=(Token)match(input,RULE_VARIABLE,FOLLOW_40); if (state.failed) return current;
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

            this_OP1000XFY_2=(Token)match(input,RULE_OP1000XFY,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OP1000XFY_2, grammarAccess.getVarExprAccess().getOP1000XFYTerminalRuleCall_2());
              		
            }
            // InternalTExp.g:2392:3: ( (lv_bodyVar_3_0= rulePrimary ) )
            // InternalTExp.g:2393:4: (lv_bodyVar_3_0= rulePrimary )
            {
            // InternalTExp.g:2393:4: (lv_bodyVar_3_0= rulePrimary )
            // InternalTExp.g:2394:5: lv_bodyVar_3_0= rulePrimary
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarExprAccess().getBodyVarPrimaryParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_41);
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
    // InternalTExp.g:2419:1: entryRuleFilterExpr returns [EObject current=null] : iv_ruleFilterExpr= ruleFilterExpr EOF ;
    public final EObject entryRuleFilterExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterExpr = null;


        try {
            // InternalTExp.g:2419:51: (iv_ruleFilterExpr= ruleFilterExpr EOF )
            // InternalTExp.g:2420:2: iv_ruleFilterExpr= ruleFilterExpr EOF
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
    // InternalTExp.g:2426:1: ruleFilterExpr returns [EObject current=null] : ( ( ( ruleID ) ) (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? ( (lv_operator_6_0= RULE_OP400FX1 ) ) ( (lv_bodyFilter_7_0= rulePrimary ) ) ) ;
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
            // InternalTExp.g:2432:2: ( ( ( ( ruleID ) ) (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? ( (lv_operator_6_0= RULE_OP400FX1 ) ) ( (lv_bodyFilter_7_0= rulePrimary ) ) ) )
            // InternalTExp.g:2433:2: ( ( ( ruleID ) ) (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? ( (lv_operator_6_0= RULE_OP400FX1 ) ) ( (lv_bodyFilter_7_0= rulePrimary ) ) )
            {
            // InternalTExp.g:2433:2: ( ( ( ruleID ) ) (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? ( (lv_operator_6_0= RULE_OP400FX1 ) ) ( (lv_bodyFilter_7_0= rulePrimary ) ) )
            // InternalTExp.g:2434:3: ( ( ruleID ) ) (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? ( (lv_operator_6_0= RULE_OP400FX1 ) ) ( (lv_bodyFilter_7_0= rulePrimary ) )
            {
            // InternalTExp.g:2434:3: ( ( ruleID ) )
            // InternalTExp.g:2435:4: ( ruleID )
            {
            // InternalTExp.g:2435:4: ( ruleID )
            // InternalTExp.g:2436:5: ruleID
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
            pushFollow(FOLLOW_42);
            ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTExp.g:2453:3: (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTExp.g:2454:4: otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getFilterExprAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:2458:4: ( (lv_first_2_0= ruleExpression0 ) )
                    // InternalTExp.g:2459:5: (lv_first_2_0= ruleExpression0 )
                    {
                    // InternalTExp.g:2459:5: (lv_first_2_0= ruleExpression0 )
                    // InternalTExp.g:2460:6: lv_first_2_0= ruleExpression0
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFilterExprAccess().getFirstExpression0ParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
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

                    // InternalTExp.g:2477:4: (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_OP1000XFY) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalTExp.g:2478:5: this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) )
                    	    {
                    	    this_OP1000XFY_3=(Token)match(input,RULE_OP1000XFY,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OP1000XFY_3, grammarAccess.getFilterExprAccess().getOP1000XFYTerminalRuleCall_1_2_0());
                    	      				
                    	    }
                    	    // InternalTExp.g:2482:5: ( (lv_exprs_4_0= ruleExpression0 ) )
                    	    // InternalTExp.g:2483:6: (lv_exprs_4_0= ruleExpression0 )
                    	    {
                    	    // InternalTExp.g:2483:6: (lv_exprs_4_0= ruleExpression0 )
                    	    // InternalTExp.g:2484:7: lv_exprs_4_0= ruleExpression0
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFilterExprAccess().getExprsExpression0ParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_43);
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
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,34,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getFilterExprAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTExp.g:2507:3: ( (lv_operator_6_0= RULE_OP400FX1 ) )
            // InternalTExp.g:2508:4: (lv_operator_6_0= RULE_OP400FX1 )
            {
            // InternalTExp.g:2508:4: (lv_operator_6_0= RULE_OP400FX1 )
            // InternalTExp.g:2509:5: lv_operator_6_0= RULE_OP400FX1
            {
            lv_operator_6_0=(Token)match(input,RULE_OP400FX1,FOLLOW_34); if (state.failed) return current;
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

            // InternalTExp.g:2525:3: ( (lv_bodyFilter_7_0= rulePrimary ) )
            // InternalTExp.g:2526:4: (lv_bodyFilter_7_0= rulePrimary )
            {
            // InternalTExp.g:2526:4: (lv_bodyFilter_7_0= rulePrimary )
            // InternalTExp.g:2527:5: lv_bodyFilter_7_0= rulePrimary
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
    // InternalTExp.g:2548:1: entryRuleSeqExpr returns [EObject current=null] : iv_ruleSeqExpr= ruleSeqExpr EOF ;
    public final EObject entryRuleSeqExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeqExpr = null;


        try {
            // InternalTExp.g:2548:48: (iv_ruleSeqExpr= ruleSeqExpr EOF )
            // InternalTExp.g:2549:2: iv_ruleSeqExpr= ruleSeqExpr EOF
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
    // InternalTExp.g:2555:1: ruleSeqExpr returns [EObject current=null] : ( ( ( ruleID ) ) (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? ( (lv_operator_6_0= RULE_OP600XFY ) ) ( (lv_bodySeq_7_0= rulePrimary ) ) ) ;
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
            // InternalTExp.g:2561:2: ( ( ( ( ruleID ) ) (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? ( (lv_operator_6_0= RULE_OP600XFY ) ) ( (lv_bodySeq_7_0= rulePrimary ) ) ) )
            // InternalTExp.g:2562:2: ( ( ( ruleID ) ) (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? ( (lv_operator_6_0= RULE_OP600XFY ) ) ( (lv_bodySeq_7_0= rulePrimary ) ) )
            {
            // InternalTExp.g:2562:2: ( ( ( ruleID ) ) (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? ( (lv_operator_6_0= RULE_OP600XFY ) ) ( (lv_bodySeq_7_0= rulePrimary ) ) )
            // InternalTExp.g:2563:3: ( ( ruleID ) ) (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? ( (lv_operator_6_0= RULE_OP600XFY ) ) ( (lv_bodySeq_7_0= rulePrimary ) )
            {
            // InternalTExp.g:2563:3: ( ( ruleID ) )
            // InternalTExp.g:2564:4: ( ruleID )
            {
            // InternalTExp.g:2564:4: ( ruleID )
            // InternalTExp.g:2565:5: ruleID
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
            pushFollow(FOLLOW_45);
            ruleID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalTExp.g:2582:3: (otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalTExp.g:2583:4: otherlv_1= '(' ( (lv_first_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getSeqExprAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:2587:4: ( (lv_first_2_0= ruleExpression0 ) )
                    // InternalTExp.g:2588:5: (lv_first_2_0= ruleExpression0 )
                    {
                    // InternalTExp.g:2588:5: (lv_first_2_0= ruleExpression0 )
                    // InternalTExp.g:2589:6: lv_first_2_0= ruleExpression0
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSeqExprAccess().getFirstExpression0ParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
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

                    // InternalTExp.g:2606:4: (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==RULE_OP1000XFY) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalTExp.g:2607:5: this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) )
                    	    {
                    	    this_OP1000XFY_3=(Token)match(input,RULE_OP1000XFY,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OP1000XFY_3, grammarAccess.getSeqExprAccess().getOP1000XFYTerminalRuleCall_1_2_0());
                    	      				
                    	    }
                    	    // InternalTExp.g:2611:5: ( (lv_exprs_4_0= ruleExpression0 ) )
                    	    // InternalTExp.g:2612:6: (lv_exprs_4_0= ruleExpression0 )
                    	    {
                    	    // InternalTExp.g:2612:6: (lv_exprs_4_0= ruleExpression0 )
                    	    // InternalTExp.g:2613:7: lv_exprs_4_0= ruleExpression0
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getSeqExprAccess().getExprsExpression0ParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_43);
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
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,34,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getSeqExprAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            // InternalTExp.g:2636:3: ( (lv_operator_6_0= RULE_OP600XFY ) )
            // InternalTExp.g:2637:4: (lv_operator_6_0= RULE_OP600XFY )
            {
            // InternalTExp.g:2637:4: (lv_operator_6_0= RULE_OP600XFY )
            // InternalTExp.g:2638:5: lv_operator_6_0= RULE_OP600XFY
            {
            lv_operator_6_0=(Token)match(input,RULE_OP600XFY,FOLLOW_34); if (state.failed) return current;
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

            // InternalTExp.g:2654:3: ( (lv_bodySeq_7_0= rulePrimary ) )
            // InternalTExp.g:2655:4: (lv_bodySeq_7_0= rulePrimary )
            {
            // InternalTExp.g:2655:4: (lv_bodySeq_7_0= rulePrimary )
            // InternalTExp.g:2656:5: lv_bodySeq_7_0= rulePrimary
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
    // InternalTExp.g:2677:1: entryRuleTerminalExpr returns [EObject current=null] : iv_ruleTerminalExpr= ruleTerminalExpr EOF ;
    public final EObject entryRuleTerminalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminalExpr = null;


        try {
            // InternalTExp.g:2677:53: (iv_ruleTerminalExpr= ruleTerminalExpr EOF )
            // InternalTExp.g:2678:2: iv_ruleTerminalExpr= ruleTerminalExpr EOF
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
    // InternalTExp.g:2684:1: ruleTerminalExpr returns [EObject current=null] : ( ( (lv_eps_0_0= 'epsilon' ) ) | ( ( ruleID ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleAndExpr ) ) otherlv_4= ')' ) ) ;
    public final EObject ruleTerminalExpr() throws RecognitionException {
        EObject current = null;

        Token lv_eps_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:2690:2: ( ( ( (lv_eps_0_0= 'epsilon' ) ) | ( ( ruleID ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleAndExpr ) ) otherlv_4= ')' ) ) )
            // InternalTExp.g:2691:2: ( ( (lv_eps_0_0= 'epsilon' ) ) | ( ( ruleID ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleAndExpr ) ) otherlv_4= ')' ) )
            {
            // InternalTExp.g:2691:2: ( ( (lv_eps_0_0= 'epsilon' ) ) | ( ( ruleID ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleAndExpr ) ) otherlv_4= ')' ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt38=1;
                }
                break;
            case RULE_ATOM:
                {
                alt38=2;
                }
                break;
            case 33:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalTExp.g:2692:3: ( (lv_eps_0_0= 'epsilon' ) )
                    {
                    // InternalTExp.g:2692:3: ( (lv_eps_0_0= 'epsilon' ) )
                    // InternalTExp.g:2693:4: (lv_eps_0_0= 'epsilon' )
                    {
                    // InternalTExp.g:2693:4: (lv_eps_0_0= 'epsilon' )
                    // InternalTExp.g:2694:5: lv_eps_0_0= 'epsilon'
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
                    // InternalTExp.g:2707:3: ( ( ruleID ) )
                    {
                    // InternalTExp.g:2707:3: ( ( ruleID ) )
                    // InternalTExp.g:2708:4: ( ruleID )
                    {
                    // InternalTExp.g:2708:4: ( ruleID )
                    // InternalTExp.g:2709:5: ruleID
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
                    // InternalTExp.g:2727:3: (otherlv_2= '(' ( (lv_expr_3_0= ruleAndExpr ) ) otherlv_4= ')' )
                    {
                    // InternalTExp.g:2727:3: (otherlv_2= '(' ( (lv_expr_3_0= ruleAndExpr ) ) otherlv_4= ')' )
                    // InternalTExp.g:2728:4: otherlv_2= '(' ( (lv_expr_3_0= ruleAndExpr ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTerminalExprAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalTExp.g:2732:4: ( (lv_expr_3_0= ruleAndExpr ) )
                    // InternalTExp.g:2733:5: (lv_expr_3_0= ruleAndExpr )
                    {
                    // InternalTExp.g:2733:5: (lv_expr_3_0= ruleAndExpr )
                    // InternalTExp.g:2734:6: lv_expr_3_0= ruleAndExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalExprAccess().getExprAndExprParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_expr_3_0=ruleAndExpr();

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
                      							"it.unige.dibris.trace_expression_language.TExp.AndExpr");
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
    // InternalTExp.g:2760:1: entryRuleEventType returns [EObject current=null] : iv_ruleEventType= ruleEventType EOF ;
    public final EObject entryRuleEventType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventType = null;


        try {
            // InternalTExp.g:2760:50: (iv_ruleEventType= ruleEventType EOF )
            // InternalTExp.g:2761:2: iv_ruleEventType= ruleEventType EOF
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
    // InternalTExp.g:2767:1: ruleEventType returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_msgs_8_0= ruleMsg ) )* otherlv_9= '}' (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )? ) ;
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
            // InternalTExp.g:2773:2: ( ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_msgs_8_0= ruleMsg ) )* otherlv_9= '}' (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )? ) )
            // InternalTExp.g:2774:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_msgs_8_0= ruleMsg ) )* otherlv_9= '}' (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )? )
            {
            // InternalTExp.g:2774:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_msgs_8_0= ruleMsg ) )* otherlv_9= '}' (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )? )
            // InternalTExp.g:2775:3: ( (lv_name_0_0= ruleID ) ) (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )? this_OP600XFY_6= RULE_OP600XFY otherlv_7= '{' ( (lv_msgs_8_0= ruleMsg ) )* otherlv_9= '}' (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )?
            {
            // InternalTExp.g:2775:3: ( (lv_name_0_0= ruleID ) )
            // InternalTExp.g:2776:4: (lv_name_0_0= ruleID )
            {
            // InternalTExp.g:2776:4: (lv_name_0_0= ruleID )
            // InternalTExp.g:2777:5: lv_name_0_0= ruleID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEventTypeAccess().getNameIDParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_45);
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

            // InternalTExp.g:2794:3: (otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==33) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalTExp.g:2795:4: otherlv_1= '(' ( (lv_expr_2_0= ruleExpression0 ) ) (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEventTypeAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:2799:4: ( (lv_expr_2_0= ruleExpression0 ) )
                    // InternalTExp.g:2800:5: (lv_expr_2_0= ruleExpression0 )
                    {
                    // InternalTExp.g:2800:5: (lv_expr_2_0= ruleExpression0 )
                    // InternalTExp.g:2801:6: lv_expr_2_0= ruleExpression0
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEventTypeAccess().getExprExpression0ParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_43);
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

                    // InternalTExp.g:2818:4: (this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_OP1000XFY) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalTExp.g:2819:5: this_OP1000XFY_3= RULE_OP1000XFY ( (lv_exprs_4_0= ruleExpression0 ) )
                    	    {
                    	    this_OP1000XFY_3=(Token)match(input,RULE_OP1000XFY,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_OP1000XFY_3, grammarAccess.getEventTypeAccess().getOP1000XFYTerminalRuleCall_1_2_0());
                    	      				
                    	    }
                    	    // InternalTExp.g:2823:5: ( (lv_exprs_4_0= ruleExpression0 ) )
                    	    // InternalTExp.g:2824:6: (lv_exprs_4_0= ruleExpression0 )
                    	    {
                    	    // InternalTExp.g:2824:6: (lv_exprs_4_0= ruleExpression0 )
                    	    // InternalTExp.g:2825:7: lv_exprs_4_0= ruleExpression0
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEventTypeAccess().getExprsExpression0ParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_43);
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
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,34,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getEventTypeAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            this_OP600XFY_6=(Token)match(input,RULE_OP600XFY,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_OP600XFY_6, grammarAccess.getEventTypeAccess().getOP600XFYTerminalRuleCall_2());
              		
            }
            otherlv_7=(Token)match(input,39,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getEventTypeAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalTExp.g:2856:3: ( (lv_msgs_8_0= ruleMsg ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ATOM||LA41_0==35) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalTExp.g:2857:4: (lv_msgs_8_0= ruleMsg )
            	    {
            	    // InternalTExp.g:2857:4: (lv_msgs_8_0= ruleMsg )
            	    // InternalTExp.g:2858:5: lv_msgs_8_0= ruleMsg
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEventTypeAccess().getMsgsMsgParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_47);
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
            	    break loop41;
                }
            } while (true);

            otherlv_9=(Token)match(input,54,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getEventTypeAccess().getRightCurlyBracketKeyword_5());
              		
            }
            // InternalTExp.g:2879:3: (otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==35) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalTExp.g:2880:4: otherlv_10= '[' ( ( ruleID ) ) otherlv_12= ']'
                    {
                    otherlv_10=(Token)match(input,35,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getEventTypeAccess().getLeftSquareBracketKeyword_6_0());
                      			
                    }
                    // InternalTExp.g:2884:4: ( ( ruleID ) )
                    // InternalTExp.g:2885:5: ( ruleID )
                    {
                    // InternalTExp.g:2885:5: ( ruleID )
                    // InternalTExp.g:2886:6: ruleID
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
                    pushFollow(FOLLOW_20);
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
    // InternalTExp.g:2912:1: entryRuleMsg returns [EObject current=null] : iv_ruleMsg= ruleMsg EOF ;
    public final EObject entryRuleMsg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMsg = null;


        try {
            // InternalTExp.g:2912:44: (iv_ruleMsg= ruleMsg EOF )
            // InternalTExp.g:2913:2: iv_ruleMsg= ruleMsg EOF
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
    // InternalTExp.g:2919:1: ruleMsg returns [EObject current=null] : ( ( (otherlv_0= '[' ( ( ruleID ) ) otherlv_2= '=>' otherlv_3= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_6= '[' otherlv_7= '=>' ( ( ruleID ) ) otherlv_9= ']' ) | ( ( ( ruleID ) ) otherlv_11= '=>' ( ( ruleID ) ) ) ) this_OP600XFY_13= RULE_OP600XFY ( ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' ) | ( (lv_content_18_0= ruleExpression0 ) ) ) (otherlv_19= '[' ( (lv_conditions_20_0= ruleExpressionInfinity ) ) otherlv_21= ']' )? ) ;
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
            // InternalTExp.g:2925:2: ( ( ( (otherlv_0= '[' ( ( ruleID ) ) otherlv_2= '=>' otherlv_3= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_6= '[' otherlv_7= '=>' ( ( ruleID ) ) otherlv_9= ']' ) | ( ( ( ruleID ) ) otherlv_11= '=>' ( ( ruleID ) ) ) ) this_OP600XFY_13= RULE_OP600XFY ( ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' ) | ( (lv_content_18_0= ruleExpression0 ) ) ) (otherlv_19= '[' ( (lv_conditions_20_0= ruleExpressionInfinity ) ) otherlv_21= ']' )? ) )
            // InternalTExp.g:2926:2: ( ( (otherlv_0= '[' ( ( ruleID ) ) otherlv_2= '=>' otherlv_3= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_6= '[' otherlv_7= '=>' ( ( ruleID ) ) otherlv_9= ']' ) | ( ( ( ruleID ) ) otherlv_11= '=>' ( ( ruleID ) ) ) ) this_OP600XFY_13= RULE_OP600XFY ( ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' ) | ( (lv_content_18_0= ruleExpression0 ) ) ) (otherlv_19= '[' ( (lv_conditions_20_0= ruleExpressionInfinity ) ) otherlv_21= ']' )? )
            {
            // InternalTExp.g:2926:2: ( ( (otherlv_0= '[' ( ( ruleID ) ) otherlv_2= '=>' otherlv_3= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_6= '[' otherlv_7= '=>' ( ( ruleID ) ) otherlv_9= ']' ) | ( ( ( ruleID ) ) otherlv_11= '=>' ( ( ruleID ) ) ) ) this_OP600XFY_13= RULE_OP600XFY ( ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' ) | ( (lv_content_18_0= ruleExpression0 ) ) ) (otherlv_19= '[' ( (lv_conditions_20_0= ruleExpressionInfinity ) ) otherlv_21= ']' )? )
            // InternalTExp.g:2927:3: ( (otherlv_0= '[' ( ( ruleID ) ) otherlv_2= '=>' otherlv_3= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_6= '[' otherlv_7= '=>' ( ( ruleID ) ) otherlv_9= ']' ) | ( ( ( ruleID ) ) otherlv_11= '=>' ( ( ruleID ) ) ) ) this_OP600XFY_13= RULE_OP600XFY ( ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' ) | ( (lv_content_18_0= ruleExpression0 ) ) ) (otherlv_19= '[' ( (lv_conditions_20_0= ruleExpressionInfinity ) ) otherlv_21= ']' )?
            {
            // InternalTExp.g:2927:3: ( (otherlv_0= '[' ( ( ruleID ) ) otherlv_2= '=>' otherlv_3= ']' ( ( ruleID ) ) ) | ( ( ( ruleID ) ) otherlv_6= '[' otherlv_7= '=>' ( ( ruleID ) ) otherlv_9= ']' ) | ( ( ( ruleID ) ) otherlv_11= '=>' ( ( ruleID ) ) ) )
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==35) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_ATOM) ) {
                int LA43_2 = input.LA(2);

                if ( (LA43_2==35) ) {
                    alt43=2;
                }
                else if ( (LA43_2==60) ) {
                    alt43=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalTExp.g:2928:4: (otherlv_0= '[' ( ( ruleID ) ) otherlv_2= '=>' otherlv_3= ']' ( ( ruleID ) ) )
                    {
                    // InternalTExp.g:2928:4: (otherlv_0= '[' ( ( ruleID ) ) otherlv_2= '=>' otherlv_3= ']' ( ( ruleID ) ) )
                    // InternalTExp.g:2929:5: otherlv_0= '[' ( ( ruleID ) ) otherlv_2= '=>' otherlv_3= ']' ( ( ruleID ) )
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_0, grammarAccess.getMsgAccess().getLeftSquareBracketKeyword_0_0_0());
                      				
                    }
                    // InternalTExp.g:2933:5: ( ( ruleID ) )
                    // InternalTExp.g:2934:6: ( ruleID )
                    {
                    // InternalTExp.g:2934:6: ( ruleID )
                    // InternalTExp.g:2935:7: ruleID
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
                    pushFollow(FOLLOW_49);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,60,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getMsgAccess().getEqualsSignGreaterThanSignKeyword_0_0_2());
                      				
                    }
                    otherlv_3=(Token)match(input,37,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getMsgAccess().getRightSquareBracketKeyword_0_0_3());
                      				
                    }
                    // InternalTExp.g:2960:5: ( ( ruleID ) )
                    // InternalTExp.g:2961:6: ( ruleID )
                    {
                    // InternalTExp.g:2961:6: ( ruleID )
                    // InternalTExp.g:2962:7: ruleID
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
                    pushFollow(FOLLOW_46);
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
                    // InternalTExp.g:2981:4: ( ( ( ruleID ) ) otherlv_6= '[' otherlv_7= '=>' ( ( ruleID ) ) otherlv_9= ']' )
                    {
                    // InternalTExp.g:2981:4: ( ( ( ruleID ) ) otherlv_6= '[' otherlv_7= '=>' ( ( ruleID ) ) otherlv_9= ']' )
                    // InternalTExp.g:2982:5: ( ( ruleID ) ) otherlv_6= '[' otherlv_7= '=>' ( ( ruleID ) ) otherlv_9= ']'
                    {
                    // InternalTExp.g:2982:5: ( ( ruleID ) )
                    // InternalTExp.g:2983:6: ( ruleID )
                    {
                    // InternalTExp.g:2983:6: ( ruleID )
                    // InternalTExp.g:2984:7: ruleID
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
                    pushFollow(FOLLOW_30);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,35,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getMsgAccess().getLeftSquareBracketKeyword_0_1_1());
                      				
                    }
                    otherlv_7=(Token)match(input,60,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getMsgAccess().getEqualsSignGreaterThanSignKeyword_0_1_2());
                      				
                    }
                    // InternalTExp.g:3009:5: ( ( ruleID ) )
                    // InternalTExp.g:3010:6: ( ruleID )
                    {
                    // InternalTExp.g:3010:6: ( ruleID )
                    // InternalTExp.g:3011:7: ruleID
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
                    pushFollow(FOLLOW_20);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,37,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getMsgAccess().getRightSquareBracketKeyword_0_1_4());
                      				
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTExp.g:3034:4: ( ( ( ruleID ) ) otherlv_11= '=>' ( ( ruleID ) ) )
                    {
                    // InternalTExp.g:3034:4: ( ( ( ruleID ) ) otherlv_11= '=>' ( ( ruleID ) ) )
                    // InternalTExp.g:3035:5: ( ( ruleID ) ) otherlv_11= '=>' ( ( ruleID ) )
                    {
                    // InternalTExp.g:3035:5: ( ( ruleID ) )
                    // InternalTExp.g:3036:6: ( ruleID )
                    {
                    // InternalTExp.g:3036:6: ( ruleID )
                    // InternalTExp.g:3037:7: ruleID
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
                    pushFollow(FOLLOW_49);
                    ruleID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,60,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_11, grammarAccess.getMsgAccess().getEqualsSignGreaterThanSignKeyword_0_2_1());
                      				
                    }
                    // InternalTExp.g:3058:5: ( ( ruleID ) )
                    // InternalTExp.g:3059:6: ( ruleID )
                    {
                    // InternalTExp.g:3059:6: ( ruleID )
                    // InternalTExp.g:3060:7: ruleID
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
                    pushFollow(FOLLOW_46);
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
            // InternalTExp.g:3083:3: ( ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' ) | ( (lv_content_18_0= ruleExpression0 ) ) )
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // InternalTExp.g:3084:4: ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' )
                    {
                    // InternalTExp.g:3084:4: ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' )
                    // InternalTExp.g:3085:5: ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')'
                    {
                    // InternalTExp.g:3085:5: ( (lv_performative_14_0= RULE_ATOM ) )
                    // InternalTExp.g:3086:6: (lv_performative_14_0= RULE_ATOM )
                    {
                    // InternalTExp.g:3086:6: (lv_performative_14_0= RULE_ATOM )
                    // InternalTExp.g:3087:7: lv_performative_14_0= RULE_ATOM
                    {
                    lv_performative_14_0=(Token)match(input,RULE_ATOM,FOLLOW_50); if (state.failed) return current;
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
                    // InternalTExp.g:3107:5: ( (lv_content_16_0= ruleExpression0 ) )
                    // InternalTExp.g:3108:6: (lv_content_16_0= ruleExpression0 )
                    {
                    // InternalTExp.g:3108:6: (lv_content_16_0= ruleExpression0 )
                    // InternalTExp.g:3109:7: lv_content_16_0= ruleExpression0
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMsgAccess().getContentExpression0ParserRuleCall_2_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_17);
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

                    otherlv_17=(Token)match(input,34,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_17, grammarAccess.getMsgAccess().getRightParenthesisKeyword_2_0_3());
                      				
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTExp.g:3132:4: ( (lv_content_18_0= ruleExpression0 ) )
                    {
                    // InternalTExp.g:3132:4: ( (lv_content_18_0= ruleExpression0 ) )
                    // InternalTExp.g:3133:5: (lv_content_18_0= ruleExpression0 )
                    {
                    // InternalTExp.g:3133:5: (lv_content_18_0= ruleExpression0 )
                    // InternalTExp.g:3134:6: lv_content_18_0= ruleExpression0
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMsgAccess().getContentExpression0ParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_48);
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

            // InternalTExp.g:3152:3: (otherlv_19= '[' ( (lv_conditions_20_0= ruleExpressionInfinity ) ) otherlv_21= ']' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==35) ) {
                int LA45_1 = input.LA(2);

                if ( ((LA45_1>=RULE_OP1200XFX && LA45_1<=RULE_INT)||(LA45_1>=RULE_VARIABLE && LA45_1<=RULE_STRING)||(LA45_1>=30 && LA45_1<=33)||LA45_1==35) ) {
                    alt45=1;
                }
                else if ( (LA45_1==RULE_ATOM) ) {
                    int LA45_4 = input.LA(3);

                    if ( ((LA45_4>=RULE_OP1000XFY && LA45_4<=RULE_OP954XFY)||(LA45_4>=RULE_OP700XFX && LA45_4<=RULE_OP500YFX)||(LA45_4>=RULE_OP400YFX && LA45_4<=RULE_OP200XFY)||LA45_4==33||LA45_4==37) ) {
                        alt45=1;
                    }
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalTExp.g:3153:4: otherlv_19= '[' ( (lv_conditions_20_0= ruleExpressionInfinity ) ) otherlv_21= ']'
                    {
                    otherlv_19=(Token)match(input,35,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getMsgAccess().getLeftSquareBracketKeyword_3_0());
                      			
                    }
                    // InternalTExp.g:3157:4: ( (lv_conditions_20_0= ruleExpressionInfinity ) )
                    // InternalTExp.g:3158:5: (lv_conditions_20_0= ruleExpressionInfinity )
                    {
                    // InternalTExp.g:3158:5: (lv_conditions_20_0= ruleExpressionInfinity )
                    // InternalTExp.g:3159:6: lv_conditions_20_0= ruleExpressionInfinity
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMsgAccess().getConditionsExpressionInfinityParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
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
    // InternalTExp.g:3185:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalTExp.g:3185:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalTExp.g:3186:2: iv_ruleChannel= ruleChannel EOF
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
    // InternalTExp.g:3192:1: ruleChannel returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_reliability_2_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:3198:2: ( ( ( (lv_name_0_0= ruleID ) ) otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' ) )
            // InternalTExp.g:3199:2: ( ( (lv_name_0_0= ruleID ) ) otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' )
            {
            // InternalTExp.g:3199:2: ( ( (lv_name_0_0= ruleID ) ) otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']' )
            // InternalTExp.g:3200:3: ( (lv_name_0_0= ruleID ) ) otherlv_1= '[' ( (lv_reliability_2_0= ruleNUMBER ) ) otherlv_3= ']'
            {
            // InternalTExp.g:3200:3: ( (lv_name_0_0= ruleID ) )
            // InternalTExp.g:3201:4: (lv_name_0_0= ruleID )
            {
            // InternalTExp.g:3201:4: (lv_name_0_0= ruleID )
            // InternalTExp.g:3202:5: lv_name_0_0= ruleID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChannelAccess().getNameIDParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_30);
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

            otherlv_1=(Token)match(input,35,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getChannelAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalTExp.g:3223:3: ( (lv_reliability_2_0= ruleNUMBER ) )
            // InternalTExp.g:3224:4: (lv_reliability_2_0= ruleNUMBER )
            {
            // InternalTExp.g:3224:4: (lv_reliability_2_0= ruleNUMBER )
            // InternalTExp.g:3225:5: lv_reliability_2_0= ruleNUMBER
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChannelAccess().getReliabilityNUMBERParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_20);
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

              			newLeafNode(otherlv_3, grammarAccess.getChannelAccess().getRightSquareBracketKeyword_3());
              		
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
    // InternalTExp.g:3250:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalTExp.g:3250:45: (iv_ruleRole= ruleRole EOF )
            // InternalTExp.g:3251:2: iv_ruleRole= ruleRole EOF
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
    // InternalTExp.g:3257:1: ruleRole returns [EObject current=null] : ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )? ) ;
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
            // InternalTExp.g:3263:2: ( ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )? ) )
            // InternalTExp.g:3264:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )? )
            {
            // InternalTExp.g:3264:2: ( ( (lv_name_0_0= ruleID ) ) (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )? )
            // InternalTExp.g:3265:3: ( (lv_name_0_0= ruleID ) ) (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )?
            {
            // InternalTExp.g:3265:3: ( (lv_name_0_0= ruleID ) )
            // InternalTExp.g:3266:4: (lv_name_0_0= ruleID )
            {
            // InternalTExp.g:3266:4: (lv_name_0_0= ruleID )
            // InternalTExp.g:3267:5: lv_name_0_0= ruleID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRoleAccess().getNameIDParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_51);
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

            // InternalTExp.g:3284:3: (otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==61) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalTExp.g:3285:4: otherlv_1= '$' ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) ) (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )? otherlv_7= '$'
                    {
                    otherlv_1=(Token)match(input,61,FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getRoleAccess().getDollarSignKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:3289:4: ( ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) ) )
                    // InternalTExp.g:3290:5: ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) )
                    {
                    // InternalTExp.g:3290:5: ( (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM ) )
                    // InternalTExp.g:3291:6: (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM )
                    {
                    // InternalTExp.g:3291:6: (lv_class_2_1= RULE_VARIABLE | lv_class_2_2= RULE_ATOM )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_VARIABLE) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==RULE_ATOM) ) {
                        alt46=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalTExp.g:3292:7: lv_class_2_1= RULE_VARIABLE
                            {
                            lv_class_2_1=(Token)match(input,RULE_VARIABLE,FOLLOW_53); if (state.failed) return current;
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
                            // InternalTExp.g:3307:7: lv_class_2_2= RULE_ATOM
                            {
                            lv_class_2_2=(Token)match(input,RULE_ATOM,FOLLOW_53); if (state.failed) return current;
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

                    // InternalTExp.g:3324:4: (otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==33) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalTExp.g:3325:5: otherlv_3= '(' ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )* otherlv_6= ')'
                            {
                            otherlv_3=(Token)match(input,33,FOLLOW_54); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getLeftParenthesisKeyword_1_2_0());
                              				
                            }
                            // InternalTExp.g:3329:5: ( ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )? )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==RULE_STRING) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // InternalTExp.g:3330:6: ( (lv_args_4_0= ruleArgument ) ) (this_OP1000XFY_5= RULE_OP1000XFY )?
                            	    {
                            	    // InternalTExp.g:3330:6: ( (lv_args_4_0= ruleArgument ) )
                            	    // InternalTExp.g:3331:7: (lv_args_4_0= ruleArgument )
                            	    {
                            	    // InternalTExp.g:3331:7: (lv_args_4_0= ruleArgument )
                            	    // InternalTExp.g:3332:8: lv_args_4_0= ruleArgument
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getRoleAccess().getArgsArgumentParserRuleCall_1_2_1_0_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_55);
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

                            	    // InternalTExp.g:3349:6: (this_OP1000XFY_5= RULE_OP1000XFY )?
                            	    int alt47=2;
                            	    int LA47_0 = input.LA(1);

                            	    if ( (LA47_0==RULE_OP1000XFY) ) {
                            	        alt47=1;
                            	    }
                            	    switch (alt47) {
                            	        case 1 :
                            	            // InternalTExp.g:3350:7: this_OP1000XFY_5= RULE_OP1000XFY
                            	            {
                            	            this_OP1000XFY_5=(Token)match(input,RULE_OP1000XFY,FOLLOW_54); if (state.failed) return current;
                            	            if ( state.backtracking==0 ) {

                            	              							newLeafNode(this_OP1000XFY_5, grammarAccess.getRoleAccess().getOP1000XFYTerminalRuleCall_1_2_1_1());
                            	              						
                            	            }

                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop48;
                                }
                            } while (true);

                            otherlv_6=(Token)match(input,34,FOLLOW_56); if (state.failed) return current;
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
    // InternalTExp.g:3370:1: entryRuleArgument returns [String current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final String entryRuleArgument() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArgument = null;


        try {
            // InternalTExp.g:3370:48: (iv_ruleArgument= ruleArgument EOF )
            // InternalTExp.g:3371:2: iv_ruleArgument= ruleArgument EOF
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
    // InternalTExp.g:3377:1: ruleArgument returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleArgument() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalTExp.g:3383:2: (this_STRING_0= RULE_STRING )
            // InternalTExp.g:3384:2: this_STRING_0= RULE_STRING
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
    // InternalTExp.g:3394:1: entryRulePartition returns [EObject current=null] : iv_rulePartition= rulePartition EOF ;
    public final EObject entryRulePartition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePartition = null;


        try {
            // InternalTExp.g:3394:50: (iv_rulePartition= rulePartition EOF )
            // InternalTExp.g:3395:2: iv_rulePartition= rulePartition EOF
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
    // InternalTExp.g:3401:1: rulePartition returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )* otherlv_4= ']' ) ;
    public final EObject rulePartition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_OP1000XFY_3=null;
        Token otherlv_4=null;
        EObject lv_constraints_2_0 = null;



        	enterRule();

        try {
            // InternalTExp.g:3407:2: ( ( () otherlv_1= '[' ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )* otherlv_4= ']' ) )
            // InternalTExp.g:3408:2: ( () otherlv_1= '[' ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )* otherlv_4= ']' )
            {
            // InternalTExp.g:3408:2: ( () otherlv_1= '[' ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )* otherlv_4= ']' )
            // InternalTExp.g:3409:3: () otherlv_1= '[' ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )* otherlv_4= ']'
            {
            // InternalTExp.g:3409:3: ()
            // InternalTExp.g:3410:4: 
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

            otherlv_1=(Token)match(input,35,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPartitionAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalTExp.g:3423:3: ( ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==35) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalTExp.g:3424:4: ( (lv_constraints_2_0= ruleTogether ) ) (this_OP1000XFY_3= RULE_OP1000XFY )?
            	    {
            	    // InternalTExp.g:3424:4: ( (lv_constraints_2_0= ruleTogether ) )
            	    // InternalTExp.g:3425:5: (lv_constraints_2_0= ruleTogether )
            	    {
            	    // InternalTExp.g:3425:5: (lv_constraints_2_0= ruleTogether )
            	    // InternalTExp.g:3426:6: lv_constraints_2_0= ruleTogether
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPartitionAccess().getConstraintsTogetherParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_58);
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

            	    // InternalTExp.g:3443:4: (this_OP1000XFY_3= RULE_OP1000XFY )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==RULE_OP1000XFY) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // InternalTExp.g:3444:5: this_OP1000XFY_3= RULE_OP1000XFY
            	            {
            	            this_OP1000XFY_3=(Token)match(input,RULE_OP1000XFY,FOLLOW_57); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_OP1000XFY_3, grammarAccess.getPartitionAccess().getOP1000XFYTerminalRuleCall_2_1());
            	              				
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
    // InternalTExp.g:3458:1: entryRuleTogether returns [EObject current=null] : iv_ruleTogether= ruleTogether EOF ;
    public final EObject entryRuleTogether() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTogether = null;


        try {
            // InternalTExp.g:3458:49: (iv_ruleTogether= ruleTogether EOF )
            // InternalTExp.g:3459:2: iv_ruleTogether= ruleTogether EOF
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
    // InternalTExp.g:3465:1: ruleTogether returns [EObject current=null] : ( () otherlv_1= '[' ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+ otherlv_4= ']' ) ;
    public final EObject ruleTogether() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_OP1000XFY_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalTExp.g:3471:2: ( ( () otherlv_1= '[' ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+ otherlv_4= ']' ) )
            // InternalTExp.g:3472:2: ( () otherlv_1= '[' ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+ otherlv_4= ']' )
            {
            // InternalTExp.g:3472:2: ( () otherlv_1= '[' ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+ otherlv_4= ']' )
            // InternalTExp.g:3473:3: () otherlv_1= '[' ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+ otherlv_4= ']'
            {
            // InternalTExp.g:3473:3: ()
            // InternalTExp.g:3474:4: 
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

            otherlv_1=(Token)match(input,35,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTogetherAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalTExp.g:3487:3: ( ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )? )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_ATOM) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalTExp.g:3488:4: ( ( ruleID ) ) (this_OP1000XFY_3= RULE_OP1000XFY )?
            	    {
            	    // InternalTExp.g:3488:4: ( ( ruleID ) )
            	    // InternalTExp.g:3489:5: ( ruleID )
            	    {
            	    // InternalTExp.g:3489:5: ( ruleID )
            	    // InternalTExp.g:3490:6: ruleID
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
            	    pushFollow(FOLLOW_59);
            	    ruleID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalTExp.g:3507:4: (this_OP1000XFY_3= RULE_OP1000XFY )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==RULE_OP1000XFY) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // InternalTExp.g:3508:5: this_OP1000XFY_3= RULE_OP1000XFY
            	            {
            	            this_OP1000XFY_3=(Token)match(input,RULE_OP1000XFY,FOLLOW_60); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_OP1000XFY_3, grammarAccess.getTogetherAccess().getOP1000XFYTerminalRuleCall_2_1());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
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
    // InternalTExp.g:3522:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalTExp.g:3522:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalTExp.g:3523:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalTExp.g:3529:1: ruleConstraint returns [EObject current=null] : ( (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' ) | (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' ) | ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) ) | ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) ) | ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) ) ) ;
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
            // InternalTExp.g:3535:2: ( ( (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' ) | (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' ) | ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) ) | ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) ) | ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) ) ) )
            // InternalTExp.g:3536:2: ( (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' ) | (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' ) | ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) ) | ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) ) | ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) ) )
            {
            // InternalTExp.g:3536:2: ( (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' ) | (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' ) | ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) ) | ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) ) | ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) ) )
            int alt65=5;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // InternalTExp.g:3537:3: (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' )
                    {
                    // InternalTExp.g:3537:3: (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' )
                    // InternalTExp.g:3538:4: otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']'
                    {
                    otherlv_0=(Token)match(input,35,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_0_0());
                      			
                    }
                    // InternalTExp.g:3542:4: ( ( ruleID ) )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==RULE_ATOM) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalTExp.g:3543:5: ( ruleID )
                    	    {
                    	    // InternalTExp.g:3543:5: ( ruleID )
                    	    // InternalTExp.g:3544:6: ruleID
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
                    	    pushFollow(FOLLOW_60);
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
                    	    if ( cnt55 >= 1 ) break loop55;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(55, input);
                                throw eee;
                        }
                        cnt55++;
                    } while (true);

                    otherlv_2=(Token)match(input,37,FOLLOW_61); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getRightSquareBracketKeyword_0_2());
                      			
                    }
                    // InternalTExp.g:3565:4: ( (lv_together_3_0= '-><-' ) )
                    // InternalTExp.g:3566:5: (lv_together_3_0= '-><-' )
                    {
                    // InternalTExp.g:3566:5: (lv_together_3_0= '-><-' )
                    // InternalTExp.g:3567:6: lv_together_3_0= '-><-'
                    {
                    lv_together_3_0=(Token)match(input,62,FOLLOW_30); if (state.failed) return current;
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

                    otherlv_4=(Token)match(input,35,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_0_4());
                      			
                    }
                    // InternalTExp.g:3583:4: ( ( ruleID ) )+
                    int cnt56=0;
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==RULE_ATOM) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalTExp.g:3584:5: ( ruleID )
                    	    {
                    	    // InternalTExp.g:3584:5: ( ruleID )
                    	    // InternalTExp.g:3585:6: ruleID
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
                    	    pushFollow(FOLLOW_60);
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
                    	    if ( cnt56 >= 1 ) break loop56;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(56, input);
                                throw eee;
                        }
                        cnt56++;
                    } while (true);

                    otherlv_6=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getConstraintAccess().getRightSquareBracketKeyword_0_6());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTExp.g:3608:3: (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' )
                    {
                    // InternalTExp.g:3608:3: (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' )
                    // InternalTExp.g:3609:4: otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']'
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalTExp.g:3613:4: ( ( ruleID ) )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==RULE_ATOM) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalTExp.g:3614:5: ( ruleID )
                    	    {
                    	    // InternalTExp.g:3614:5: ( ruleID )
                    	    // InternalTExp.g:3615:6: ruleID
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
                    	    pushFollow(FOLLOW_60);
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
                    	    if ( cnt57 >= 1 ) break loop57;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
                    } while (true);

                    otherlv_9=(Token)match(input,37,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getConstraintAccess().getRightSquareBracketKeyword_1_2());
                      			
                    }
                    // InternalTExp.g:3636:4: ( (lv_split_10_0= '<-->' ) )
                    // InternalTExp.g:3637:5: (lv_split_10_0= '<-->' )
                    {
                    // InternalTExp.g:3637:5: (lv_split_10_0= '<-->' )
                    // InternalTExp.g:3638:6: lv_split_10_0= '<-->'
                    {
                    lv_split_10_0=(Token)match(input,63,FOLLOW_30); if (state.failed) return current;
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

                    otherlv_11=(Token)match(input,35,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getConstraintAccess().getLeftSquareBracketKeyword_1_4());
                      			
                    }
                    // InternalTExp.g:3654:4: ( ( ruleID ) )+
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
                    	    // InternalTExp.g:3655:5: ( ruleID )
                    	    {
                    	    // InternalTExp.g:3655:5: ( ruleID )
                    	    // InternalTExp.g:3656:6: ruleID
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
                    	    pushFollow(FOLLOW_60);
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
                    	    if ( cnt58 >= 1 ) break loop58;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(58, input);
                                throw eee;
                        }
                        cnt58++;
                    } while (true);

                    otherlv_13=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getConstraintAccess().getRightSquareBracketKeyword_1_6());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTExp.g:3679:3: ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) )
                    {
                    // InternalTExp.g:3679:3: ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) )
                    // InternalTExp.g:3680:4: () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) )
                    {
                    // InternalTExp.g:3680:4: ()
                    // InternalTExp.g:3681:5: 
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

                    otherlv_15=(Token)match(input,64,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getConstraintAccess().getNumber_singletonsKeyword_2_1());
                      			
                    }
                    this_OP600XFY_16=(Token)match(input,RULE_OP600XFY,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP600XFY_16, grammarAccess.getConstraintAccess().getOP600XFYTerminalRuleCall_2_2());
                      			
                    }
                    // InternalTExp.g:3698:4: ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) )
                    // InternalTExp.g:3699:5: ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) )
                    {
                    // InternalTExp.g:3699:5: ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) )
                    // InternalTExp.g:3700:6: (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' )
                    {
                    // InternalTExp.g:3700:6: (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' )
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==33) ) {
                        alt59=1;
                    }
                    else if ( (LA59_0==35) ) {
                        alt59=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 0, input);

                        throw nvae;
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalTExp.g:3701:7: lv_parMin_17_1= '('
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
                            // InternalTExp.g:3712:7: lv_parMin_17_2= '['
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

                    // InternalTExp.g:3725:4: ( (lv_minSingletons_18_0= RULE_INT ) )
                    // InternalTExp.g:3726:5: (lv_minSingletons_18_0= RULE_INT )
                    {
                    // InternalTExp.g:3726:5: (lv_minSingletons_18_0= RULE_INT )
                    // InternalTExp.g:3727:6: lv_minSingletons_18_0= RULE_INT
                    {
                    lv_minSingletons_18_0=(Token)match(input,RULE_INT,FOLLOW_40); if (state.failed) return current;
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
                    // InternalTExp.g:3747:4: ( (lv_maxSingletons_20_0= RULE_INT ) )
                    // InternalTExp.g:3748:5: (lv_maxSingletons_20_0= RULE_INT )
                    {
                    // InternalTExp.g:3748:5: (lv_maxSingletons_20_0= RULE_INT )
                    // InternalTExp.g:3749:6: lv_maxSingletons_20_0= RULE_INT
                    {
                    lv_maxSingletons_20_0=(Token)match(input,RULE_INT,FOLLOW_64); if (state.failed) return current;
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

                    // InternalTExp.g:3765:4: ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) )
                    // InternalTExp.g:3766:5: ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) )
                    {
                    // InternalTExp.g:3766:5: ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) )
                    // InternalTExp.g:3767:6: (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' )
                    {
                    // InternalTExp.g:3767:6: (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' )
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==34) ) {
                        alt60=1;
                    }
                    else if ( (LA60_0==37) ) {
                        alt60=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 60, 0, input);

                        throw nvae;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalTExp.g:3768:7: lv_parMax_21_1= ')'
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
                            // InternalTExp.g:3779:7: lv_parMax_21_2= ']'
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
                    // InternalTExp.g:3794:3: ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) )
                    {
                    // InternalTExp.g:3794:3: ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) )
                    // InternalTExp.g:3795:4: () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) )
                    {
                    // InternalTExp.g:3795:4: ()
                    // InternalTExp.g:3796:5: 
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

                    otherlv_23=(Token)match(input,65,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getConstraintAccess().getSize_constraintsKeyword_3_1());
                      			
                    }
                    this_OP600XFY_24=(Token)match(input,RULE_OP600XFY,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP600XFY_24, grammarAccess.getConstraintAccess().getOP600XFYTerminalRuleCall_3_2());
                      			
                    }
                    // InternalTExp.g:3813:4: ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) )
                    // InternalTExp.g:3814:5: ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) )
                    {
                    // InternalTExp.g:3814:5: ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) )
                    // InternalTExp.g:3815:6: (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' )
                    {
                    // InternalTExp.g:3815:6: (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==33) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==35) ) {
                        alt61=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalTExp.g:3816:7: lv_parMin_25_1= '('
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
                            // InternalTExp.g:3827:7: lv_parMin_25_2= '['
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

                    // InternalTExp.g:3840:4: ( (lv_minSize_26_0= RULE_INT ) )
                    // InternalTExp.g:3841:5: (lv_minSize_26_0= RULE_INT )
                    {
                    // InternalTExp.g:3841:5: (lv_minSize_26_0= RULE_INT )
                    // InternalTExp.g:3842:6: lv_minSize_26_0= RULE_INT
                    {
                    lv_minSize_26_0=(Token)match(input,RULE_INT,FOLLOW_40); if (state.failed) return current;
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
                    // InternalTExp.g:3862:4: ( (lv_maxSize_28_0= RULE_INT ) )
                    // InternalTExp.g:3863:5: (lv_maxSize_28_0= RULE_INT )
                    {
                    // InternalTExp.g:3863:5: (lv_maxSize_28_0= RULE_INT )
                    // InternalTExp.g:3864:6: lv_maxSize_28_0= RULE_INT
                    {
                    lv_maxSize_28_0=(Token)match(input,RULE_INT,FOLLOW_64); if (state.failed) return current;
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

                    // InternalTExp.g:3880:4: ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) )
                    // InternalTExp.g:3881:5: ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) )
                    {
                    // InternalTExp.g:3881:5: ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) )
                    // InternalTExp.g:3882:6: (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' )
                    {
                    // InternalTExp.g:3882:6: (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' )
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==34) ) {
                        alt62=1;
                    }
                    else if ( (LA62_0==37) ) {
                        alt62=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 62, 0, input);

                        throw nvae;
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalTExp.g:3883:7: lv_parMax_29_1= ')'
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
                            // InternalTExp.g:3894:7: lv_parMax_29_2= ']'
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
                    // InternalTExp.g:3909:3: ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) )
                    {
                    // InternalTExp.g:3909:3: ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) )
                    // InternalTExp.g:3910:4: () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) )
                    {
                    // InternalTExp.g:3910:4: ()
                    // InternalTExp.g:3911:5: 
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

                    otherlv_31=(Token)match(input,66,FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getConstraintAccess().getNumber_constraintsKeyword_4_1());
                      			
                    }
                    this_OP600XFY_32=(Token)match(input,RULE_OP600XFY,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_OP600XFY_32, grammarAccess.getConstraintAccess().getOP600XFYTerminalRuleCall_4_2());
                      			
                    }
                    // InternalTExp.g:3928:4: ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) )
                    // InternalTExp.g:3929:5: ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) )
                    {
                    // InternalTExp.g:3929:5: ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) )
                    // InternalTExp.g:3930:6: (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' )
                    {
                    // InternalTExp.g:3930:6: (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' )
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
                            // InternalTExp.g:3931:7: lv_parMin_33_1= '('
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
                            // InternalTExp.g:3942:7: lv_parMin_33_2= '['
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

                    // InternalTExp.g:3955:4: ( (lv_minCardinality_34_0= RULE_INT ) )
                    // InternalTExp.g:3956:5: (lv_minCardinality_34_0= RULE_INT )
                    {
                    // InternalTExp.g:3956:5: (lv_minCardinality_34_0= RULE_INT )
                    // InternalTExp.g:3957:6: lv_minCardinality_34_0= RULE_INT
                    {
                    lv_minCardinality_34_0=(Token)match(input,RULE_INT,FOLLOW_40); if (state.failed) return current;
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
                    // InternalTExp.g:3977:4: ( (lv_maxCardinality_36_0= RULE_INT ) )
                    // InternalTExp.g:3978:5: (lv_maxCardinality_36_0= RULE_INT )
                    {
                    // InternalTExp.g:3978:5: (lv_maxCardinality_36_0= RULE_INT )
                    // InternalTExp.g:3979:6: lv_maxCardinality_36_0= RULE_INT
                    {
                    lv_maxCardinality_36_0=(Token)match(input,RULE_INT,FOLLOW_64); if (state.failed) return current;
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

                    // InternalTExp.g:3995:4: ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) )
                    // InternalTExp.g:3996:5: ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) )
                    {
                    // InternalTExp.g:3996:5: ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) )
                    // InternalTExp.g:3997:6: (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' )
                    {
                    // InternalTExp.g:3997:6: (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' )
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
                            // InternalTExp.g:3998:7: lv_parMax_37_1= ')'
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
                            // InternalTExp.g:4009:7: lv_parMax_37_2= ']'
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
    // InternalTExp.g:4027:1: entryRuleModule returns [String current=null] : iv_ruleModule= ruleModule EOF ;
    public final String entryRuleModule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleModule = null;


        try {
            // InternalTExp.g:4027:46: (iv_ruleModule= ruleModule EOF )
            // InternalTExp.g:4028:2: iv_ruleModule= ruleModule EOF
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
    // InternalTExp.g:4034:1: ruleModule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VARIABLE_0= RULE_VARIABLE | this_ATOM_1= RULE_ATOM ) ;
    public final AntlrDatatypeRuleToken ruleModule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VARIABLE_0=null;
        Token this_ATOM_1=null;


        	enterRule();

        try {
            // InternalTExp.g:4040:2: ( (this_VARIABLE_0= RULE_VARIABLE | this_ATOM_1= RULE_ATOM ) )
            // InternalTExp.g:4041:2: (this_VARIABLE_0= RULE_VARIABLE | this_ATOM_1= RULE_ATOM )
            {
            // InternalTExp.g:4041:2: (this_VARIABLE_0= RULE_VARIABLE | this_ATOM_1= RULE_ATOM )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_VARIABLE) ) {
                alt66=1;
            }
            else if ( (LA66_0==RULE_ATOM) ) {
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
                    // InternalTExp.g:4042:3: this_VARIABLE_0= RULE_VARIABLE
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
                    // InternalTExp.g:4050:3: this_ATOM_1= RULE_ATOM
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

    // $ANTLR start synpred71_InternalTExp
    public final void synpred71_InternalTExp_fragment() throws RecognitionException {   
        EObject lv_seqExpr_1_0 = null;


        // InternalTExp.g:2220:3: ( ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) ) )
        // InternalTExp.g:2220:3: ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) )
        {
        // InternalTExp.g:2220:3: ( () ( (lv_seqExpr_1_0= ruleSeqExpr ) ) )
        // InternalTExp.g:2221:4: () ( (lv_seqExpr_1_0= ruleSeqExpr ) )
        {
        // InternalTExp.g:2221:4: ()
        // InternalTExp.g:2222:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalTExp.g:2231:4: ( (lv_seqExpr_1_0= ruleSeqExpr ) )
        // InternalTExp.g:2232:5: (lv_seqExpr_1_0= ruleSeqExpr )
        {
        // InternalTExp.g:2232:5: (lv_seqExpr_1_0= ruleSeqExpr )
        // InternalTExp.g:2233:6: lv_seqExpr_1_0= ruleSeqExpr
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
    // $ANTLR end synpred71_InternalTExp

    // $ANTLR start synpred72_InternalTExp
    public final void synpred72_InternalTExp_fragment() throws RecognitionException {   
        EObject lv_filterExpr_3_0 = null;


        // InternalTExp.g:2252:3: ( ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) ) )
        // InternalTExp.g:2252:3: ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) )
        {
        // InternalTExp.g:2252:3: ( () ( (lv_filterExpr_3_0= ruleFilterExpr ) ) )
        // InternalTExp.g:2253:4: () ( (lv_filterExpr_3_0= ruleFilterExpr ) )
        {
        // InternalTExp.g:2253:4: ()
        // InternalTExp.g:2254:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalTExp.g:2263:4: ( (lv_filterExpr_3_0= ruleFilterExpr ) )
        // InternalTExp.g:2264:5: (lv_filterExpr_3_0= ruleFilterExpr )
        {
        // InternalTExp.g:2264:5: (lv_filterExpr_3_0= ruleFilterExpr )
        // InternalTExp.g:2265:6: lv_filterExpr_3_0= ruleFilterExpr
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
    // $ANTLR end synpred72_InternalTExp

    // $ANTLR start synpred86_InternalTExp
    public final void synpred86_InternalTExp_fragment() throws RecognitionException {   
        Token lv_performative_14_0=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject lv_content_16_0 = null;


        // InternalTExp.g:3084:4: ( ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' ) )
        // InternalTExp.g:3084:4: ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' )
        {
        // InternalTExp.g:3084:4: ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' )
        // InternalTExp.g:3085:5: ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')'
        {
        // InternalTExp.g:3085:5: ( (lv_performative_14_0= RULE_ATOM ) )
        // InternalTExp.g:3086:6: (lv_performative_14_0= RULE_ATOM )
        {
        // InternalTExp.g:3086:6: (lv_performative_14_0= RULE_ATOM )
        // InternalTExp.g:3087:7: lv_performative_14_0= RULE_ATOM
        {
        lv_performative_14_0=(Token)match(input,RULE_ATOM,FOLLOW_50); if (state.failed) return ;

        }


        }

        otherlv_15=(Token)match(input,33,FOLLOW_8); if (state.failed) return ;
        // InternalTExp.g:3107:5: ( (lv_content_16_0= ruleExpression0 ) )
        // InternalTExp.g:3108:6: (lv_content_16_0= ruleExpression0 )
        {
        // InternalTExp.g:3108:6: (lv_content_16_0= ruleExpression0 )
        // InternalTExp.g:3109:7: lv_content_16_0= ruleExpression0
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getMsgAccess().getContentExpression0ParserRuleCall_2_0_2_0());
          						
        }
        pushFollow(FOLLOW_17);
        lv_content_16_0=ruleExpression0();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_17=(Token)match(input,34,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred86_InternalTExp

    // Delegated rules

    public final boolean synpred72_InternalTExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_InternalTExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_InternalTExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_InternalTExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_InternalTExp() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_InternalTExp_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA44 dfa44 = new DFA44(this);
    protected DFA65 dfa65 = new DFA65(this);
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

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3083:3: ( ( ( (lv_performative_14_0= RULE_ATOM ) ) otherlv_15= '(' ( (lv_content_16_0= ruleExpression0 ) ) otherlv_17= ')' ) | ( (lv_content_18_0= ruleExpression0 ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_1 = input.LA(1);

                         
                        int index44_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalTExp()) ) {s = 28;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
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

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "3536:2: ( (otherlv_0= '[' ( ( ruleID ) )+ otherlv_2= ']' ( (lv_together_3_0= '-><-' ) ) otherlv_4= '[' ( ( ruleID ) )+ otherlv_6= ']' ) | (otherlv_7= '[' ( ( ruleID ) )+ otherlv_9= ']' ( (lv_split_10_0= '<-->' ) ) otherlv_11= '[' ( ( ruleID ) )+ otherlv_13= ']' ) | ( () otherlv_15= 'number_singletons' this_OP600XFY_16= RULE_OP600XFY ( ( (lv_parMin_17_1= '(' | lv_parMin_17_2= '[' ) ) ) ( (lv_minSingletons_18_0= RULE_INT ) ) this_OP1000XFY_19= RULE_OP1000XFY ( (lv_maxSingletons_20_0= RULE_INT ) ) ( ( (lv_parMax_21_1= ')' | lv_parMax_21_2= ']' ) ) ) ) | ( () otherlv_23= 'size_constraints' this_OP600XFY_24= RULE_OP600XFY ( ( (lv_parMin_25_1= '(' | lv_parMin_25_2= '[' ) ) ) ( (lv_minSize_26_0= RULE_INT ) ) this_OP1000XFY_27= RULE_OP1000XFY ( (lv_maxSize_28_0= RULE_INT ) ) ( ( (lv_parMax_29_1= ')' | lv_parMax_29_2= ']' ) ) ) ) | ( () otherlv_31= 'number_constraints' this_OP600XFY_32= RULE_OP600XFY ( ( (lv_parMin_33_1= '(' | lv_parMin_33_2= '[' ) ) ) ( (lv_minCardinality_34_0= RULE_INT ) ) this_OP1000XFY_35= RULE_OP1000XFY ( (lv_maxCardinality_36_0= RULE_INT ) ) ( ( (lv_parMax_37_1= ')' | lv_parMax_37_2= ']' ) ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000BC6FFFFF0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002BC6FFFFF0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x003F3E0000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x007F3E0000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x007F3E0000000410L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x007F3E0002000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x007F3E0000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x007F3E0800000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100800000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0800000200010010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000400000400L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0040000800000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x2000000200000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000404000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000404000400L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000002800000400L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000002000000410L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000002400000000L});

}