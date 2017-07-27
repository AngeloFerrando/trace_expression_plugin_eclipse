package it.unige.dibris.trace_expression_language.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTExpLexer extends Lexer {
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

    public InternalTExpLexer() {;} 
    public InternalTExpLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTExpLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTExp.g"; }

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:11:7: ( '.' )
            // InternalTExp.g:11:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:12:7: ( '!' )
            // InternalTExp.g:12:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:13:7: ( '-' )
            // InternalTExp.g:13:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:14:7: ( '(' )
            // InternalTExp.g:14:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:15:7: ( ')' )
            // InternalTExp.g:15:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:16:7: ( '[' )
            // InternalTExp.g:16:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:17:7: ( '|' )
            // InternalTExp.g:17:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:18:7: ( ']' )
            // InternalTExp.g:18:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:19:7: ( 'trace_expression' )
            // InternalTExp.g:19:9: 'trace_expression'
            {
            match("trace_expression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:20:7: ( '{' )
            // InternalTExp.g:20:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:21:7: ( 'id:' )
            // InternalTExp.g:21:9: 'id:'
            {
            match("id:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:22:7: ( 'body:' )
            // InternalTExp.g:22:9: 'body:'
            {
            match("body:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:23:7: ( 'roles:' )
            // InternalTExp.g:23:9: 'roles:'
            {
            match("roles:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:24:7: ( 'types:' )
            // InternalTExp.g:24:9: 'types:'
            {
            match("types:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:25:7: ( 'modules:' )
            // InternalTExp.g:25:9: 'modules:'
            {
            match("modules:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:26:7: ( 'decentralized:' )
            // InternalTExp.g:26:9: 'decentralized:'
            {
            match("decentralized:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:27:7: ( 'true' )
            // InternalTExp.g:27:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:28:7: ( 'false' )
            // InternalTExp.g:28:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:29:7: ( 'partition:' )
            // InternalTExp.g:29:9: 'partition:'
            {
            match("partition:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:30:7: ( 'constraints:' )
            // InternalTExp.g:30:9: 'constraints:'
            {
            match("constraints:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:31:7: ( 'gui:' )
            // InternalTExp.g:31:9: 'gui:'
            {
            match("gui:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:32:7: ( 'minimal:' )
            // InternalTExp.g:32:9: 'minimal:'
            {
            match("minimal:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:33:7: ( 'threshold:' )
            // InternalTExp.g:33:9: 'threshold:'
            {
            match("threshold:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:34:7: ( 'channels:' )
            // InternalTExp.g:34:9: 'channels:'
            {
            match("channels:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:35:7: ( '}' )
            // InternalTExp.g:35:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:36:7: ( '<-' )
            // InternalTExp.g:36:9: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:37:7: ( '\\\\/' )
            // InternalTExp.g:37:9: '\\\\/'
            {
            match("\\/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:38:7: ( '/\\\\' )
            // InternalTExp.g:38:9: '/\\\\'
            {
            match("/\\"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:39:7: ( '*' )
            // InternalTExp.g:39:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:40:7: ( 'epsilon' )
            // InternalTExp.g:40:9: 'epsilon'
            {
            match("epsilon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:41:7: ( '=>' )
            // InternalTExp.g:41:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:42:7: ( '$' )
            // InternalTExp.g:42:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:43:7: ( '-><-' )
            // InternalTExp.g:43:9: '-><-'
            {
            match("-><-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:44:7: ( '<-->' )
            // InternalTExp.g:44:9: '<-->'
            {
            match("<-->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:45:7: ( 'number_singletons' )
            // InternalTExp.g:45:9: 'number_singletons'
            {
            match("number_singletons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:46:7: ( 'size_constraints' )
            // InternalTExp.g:46:9: 'size_constraints'
            {
            match("size_constraints"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:47:7: ( 'number_constraints' )
            // InternalTExp.g:47:9: 'number_constraints'
            {
            match("number_constraints"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "RULE_OP1150FX"
    public final void mRULE_OP1150FX() throws RecognitionException {
        try {
            int _type = RULE_OP1150FX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4062:15: ( ( 'dynamic' | 'discontiguous' | 'initialization' | 'module_transparent' | 'multifile' | 'thread_local' | 'volatile' ) )
            // InternalTExp.g:4062:17: ( 'dynamic' | 'discontiguous' | 'initialization' | 'module_transparent' | 'multifile' | 'thread_local' | 'volatile' )
            {
            // InternalTExp.g:4062:17: ( 'dynamic' | 'discontiguous' | 'initialization' | 'module_transparent' | 'multifile' | 'thread_local' | 'volatile' )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalTExp.g:4062:18: 'dynamic'
                    {
                    match("dynamic"); 


                    }
                    break;
                case 2 :
                    // InternalTExp.g:4062:28: 'discontiguous'
                    {
                    match("discontiguous"); 


                    }
                    break;
                case 3 :
                    // InternalTExp.g:4062:44: 'initialization'
                    {
                    match("initialization"); 


                    }
                    break;
                case 4 :
                    // InternalTExp.g:4062:61: 'module_transparent'
                    {
                    match("module_transparent"); 


                    }
                    break;
                case 5 :
                    // InternalTExp.g:4062:82: 'multifile'
                    {
                    match("multifile"); 


                    }
                    break;
                case 6 :
                    // InternalTExp.g:4062:94: 'thread_local'
                    {
                    match("thread_local"); 


                    }
                    break;
                case 7 :
                    // InternalTExp.g:4062:109: 'volatile'
                    {
                    match("volatile"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP1150FX"

    // $ANTLR start "RULE_WHITESPACE"
    public final void mRULE_WHITESPACE() throws RecognitionException {
        try {
            int _type = RULE_WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4064:17: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTExp.g:4064:19: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTExp.g:4064:19: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTExp.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHITESPACE"

    // $ANTLR start "RULE_SINGLE_LINE_COMMENT"
    public final void mRULE_SINGLE_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SINGLE_LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4066:26: ( '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTExp.g:4066:28: '%' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('%'); 
            // InternalTExp.g:4066:32: (~ ( ( '\\n' | '\\r' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTExp.g:4066:32: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalTExp.g:4066:48: ( ( '\\r' )? '\\n' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTExp.g:4066:49: ( '\\r' )? '\\n'
                    {
                    // InternalTExp.g:4066:49: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalTExp.g:4066:49: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SINGLE_LINE_COMMENT"

    // $ANTLR start "RULE_OP1200XFX"
    public final void mRULE_OP1200XFX() throws RecognitionException {
        try {
            int _type = RULE_OP1200XFX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4068:16: ( ( '-->' | ':-' ) )
            // InternalTExp.g:4068:18: ( '-->' | ':-' )
            {
            // InternalTExp.g:4068:18: ( '-->' | ':-' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            else if ( (LA6_0==':') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTExp.g:4068:19: '-->'
                    {
                    match("-->"); 


                    }
                    break;
                case 2 :
                    // InternalTExp.g:4068:25: ':-'
                    {
                    match(":-"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP1200XFX"

    // $ANTLR start "RULE_OP1200FX"
    public final void mRULE_OP1200FX() throws RecognitionException {
        try {
            int _type = RULE_OP1200FX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4070:15: ( ( ':-' | '?-' ) )
            // InternalTExp.g:4070:17: ( ':-' | '?-' )
            {
            // InternalTExp.g:4070:17: ( ':-' | '?-' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==':') ) {
                alt7=1;
            }
            else if ( (LA7_0=='?') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTExp.g:4070:18: ':-'
                    {
                    match(":-"); 


                    }
                    break;
                case 2 :
                    // InternalTExp.g:4070:23: '?-'
                    {
                    match("?-"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP1200FX"

    // $ANTLR start "RULE_OP1100XFY"
    public final void mRULE_OP1100XFY() throws RecognitionException {
        try {
            int _type = RULE_OP1100XFY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4072:16: ( ( ';' | '|' ) )
            // InternalTExp.g:4072:18: ( ';' | '|' )
            {
            if ( input.LA(1)==';'||input.LA(1)=='|' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP1100XFY"

    // $ANTLR start "RULE_OP1050XFY"
    public final void mRULE_OP1050XFY() throws RecognitionException {
        try {
            int _type = RULE_OP1050XFY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4074:16: ( ( '->' | '*->' ) )
            // InternalTExp.g:4074:18: ( '->' | '*->' )
            {
            // InternalTExp.g:4074:18: ( '->' | '*->' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='-') ) {
                alt8=1;
            }
            else if ( (LA8_0=='*') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTExp.g:4074:19: '->'
                    {
                    match("->"); 


                    }
                    break;
                case 2 :
                    // InternalTExp.g:4074:24: '*->'
                    {
                    match("*->"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP1050XFY"

    // $ANTLR start "RULE_OP1000XFY"
    public final void mRULE_OP1000XFY() throws RecognitionException {
        try {
            int _type = RULE_OP1000XFY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4076:16: ( ',' )
            // InternalTExp.g:4076:18: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP1000XFY"

    // $ANTLR start "RULE_OP954XFY"
    public final void mRULE_OP954XFY() throws RecognitionException {
        try {
            int _type = RULE_OP954XFY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4078:15: ( '\\\\' )
            // InternalTExp.g:4078:17: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP954XFY"

    // $ANTLR start "RULE_OP900FY"
    public final void mRULE_OP900FY() throws RecognitionException {
        try {
            int _type = RULE_OP900FY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4080:14: ( '\\\\+' )
            // InternalTExp.g:4080:16: '\\\\+'
            {
            match("\\+"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP900FY"

    // $ANTLR start "RULE_OP900FX"
    public final void mRULE_OP900FX() throws RecognitionException {
        try {
            int _type = RULE_OP900FX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4082:14: ( '~' )
            // InternalTExp.g:4082:16: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP900FX"

    // $ANTLR start "RULE_OP700XFXL"
    public final void mRULE_OP700XFXL() throws RecognitionException {
        try {
            int _type = RULE_OP700XFXL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4084:16: ( '<' )
            // InternalTExp.g:4084:18: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP700XFXL"

    // $ANTLR start "RULE_OP700XFXR"
    public final void mRULE_OP700XFXR() throws RecognitionException {
        try {
            int _type = RULE_OP700XFXR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4086:16: ( '>' )
            // InternalTExp.g:4086:18: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP700XFXR"

    // $ANTLR start "RULE_OP700XFX"
    public final void mRULE_OP700XFX() throws RecognitionException {
        try {
            int _type = RULE_OP700XFX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4088:15: ( ( '=' | '=..' | '=@=' | '=:=' | '=<' | '==' | '=\\\\=' | '>=' | '@<' | '@=<' | '@>' | '@>=' | '\\\\=' | '\\\\==' | 'is' ) )
            // InternalTExp.g:4088:17: ( '=' | '=..' | '=@=' | '=:=' | '=<' | '==' | '=\\\\=' | '>=' | '@<' | '@=<' | '@>' | '@>=' | '\\\\=' | '\\\\==' | 'is' )
            {
            // InternalTExp.g:4088:17: ( '=' | '=..' | '=@=' | '=:=' | '=<' | '==' | '=\\\\=' | '>=' | '@<' | '@=<' | '@>' | '@>=' | '\\\\=' | '\\\\==' | 'is' )
            int alt9=15;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalTExp.g:4088:18: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // InternalTExp.g:4088:22: '=..'
                    {
                    match("=.."); 


                    }
                    break;
                case 3 :
                    // InternalTExp.g:4088:28: '=@='
                    {
                    match("=@="); 


                    }
                    break;
                case 4 :
                    // InternalTExp.g:4088:34: '=:='
                    {
                    match("=:="); 


                    }
                    break;
                case 5 :
                    // InternalTExp.g:4088:40: '=<'
                    {
                    match("=<"); 


                    }
                    break;
                case 6 :
                    // InternalTExp.g:4088:45: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 7 :
                    // InternalTExp.g:4088:50: '=\\\\='
                    {
                    match("=\\="); 


                    }
                    break;
                case 8 :
                    // InternalTExp.g:4088:57: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 9 :
                    // InternalTExp.g:4088:62: '@<'
                    {
                    match("@<"); 


                    }
                    break;
                case 10 :
                    // InternalTExp.g:4088:67: '@=<'
                    {
                    match("@=<"); 


                    }
                    break;
                case 11 :
                    // InternalTExp.g:4088:73: '@>'
                    {
                    match("@>"); 


                    }
                    break;
                case 12 :
                    // InternalTExp.g:4088:78: '@>='
                    {
                    match("@>="); 


                    }
                    break;
                case 13 :
                    // InternalTExp.g:4088:84: '\\\\='
                    {
                    match("\\="); 


                    }
                    break;
                case 14 :
                    // InternalTExp.g:4088:90: '\\\\=='
                    {
                    match("\\=="); 


                    }
                    break;
                case 15 :
                    // InternalTExp.g:4088:97: 'is'
                    {
                    match("is"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP700XFX"

    // $ANTLR start "RULE_OP600XFY"
    public final void mRULE_OP600XFY() throws RecognitionException {
        try {
            int _type = RULE_OP600XFY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4090:15: ( ':' )
            // InternalTExp.g:4090:17: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP600XFY"

    // $ANTLR start "RULE_OP500YFX"
    public final void mRULE_OP500YFX() throws RecognitionException {
        try {
            int _type = RULE_OP500YFX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4092:15: ( ( '+' | '-' | '/\\\\' | '\\\\/' | 'xor' ) )
            // InternalTExp.g:4092:17: ( '+' | '-' | '/\\\\' | '\\\\/' | 'xor' )
            {
            // InternalTExp.g:4092:17: ( '+' | '-' | '/\\\\' | '\\\\/' | 'xor' )
            int alt10=5;
            switch ( input.LA(1) ) {
            case '+':
                {
                alt10=1;
                }
                break;
            case '-':
                {
                alt10=2;
                }
                break;
            case '/':
                {
                alt10=3;
                }
                break;
            case '\\':
                {
                alt10=4;
                }
                break;
            case 'x':
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalTExp.g:4092:18: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 2 :
                    // InternalTExp.g:4092:22: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 3 :
                    // InternalTExp.g:4092:26: '/\\\\'
                    {
                    match("/\\"); 


                    }
                    break;
                case 4 :
                    // InternalTExp.g:4092:32: '\\\\/'
                    {
                    match("\\/"); 


                    }
                    break;
                case 5 :
                    // InternalTExp.g:4092:38: 'xor'
                    {
                    match("xor"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP500YFX"

    // $ANTLR start "RULE_OP500FX"
    public final void mRULE_OP500FX() throws RecognitionException {
        try {
            int _type = RULE_OP500FX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4094:14: ( ( '+' | '-' | '?' | '\\\\' ) )
            // InternalTExp.g:4094:16: ( '+' | '-' | '?' | '\\\\' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-'||input.LA(1)=='?'||input.LA(1)=='\\' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP500FX"

    // $ANTLR start "RULE_OP400FX1"
    public final void mRULE_OP400FX1() throws RecognitionException {
        try {
            int _type = RULE_OP400FX1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4096:15: ( '>>' )
            // InternalTExp.g:4096:17: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP400FX1"

    // $ANTLR start "RULE_OP400YFX"
    public final void mRULE_OP400YFX() throws RecognitionException {
        try {
            int _type = RULE_OP400YFX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4098:15: ( ( '*' | '/' | '//' | 'rdiv' | '<<' | 'mod' | 'rem' ) )
            // InternalTExp.g:4098:17: ( '*' | '/' | '//' | 'rdiv' | '<<' | 'mod' | 'rem' )
            {
            // InternalTExp.g:4098:17: ( '*' | '/' | '//' | 'rdiv' | '<<' | 'mod' | 'rem' )
            int alt11=7;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalTExp.g:4098:18: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 2 :
                    // InternalTExp.g:4098:22: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 3 :
                    // InternalTExp.g:4098:26: '//'
                    {
                    match("//"); 


                    }
                    break;
                case 4 :
                    // InternalTExp.g:4098:31: 'rdiv'
                    {
                    match("rdiv"); 


                    }
                    break;
                case 5 :
                    // InternalTExp.g:4098:38: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 6 :
                    // InternalTExp.g:4098:43: 'mod'
                    {
                    match("mod"); 


                    }
                    break;
                case 7 :
                    // InternalTExp.g:4098:49: 'rem'
                    {
                    match("rem"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP400YFX"

    // $ANTLR start "RULE_OP200XFX"
    public final void mRULE_OP200XFX() throws RecognitionException {
        try {
            int _type = RULE_OP200XFX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4100:15: ( '**' )
            // InternalTExp.g:4100:17: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP200XFX"

    // $ANTLR start "RULE_OP200XFY"
    public final void mRULE_OP200XFY() throws RecognitionException {
        try {
            int _type = RULE_OP200XFY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4102:15: ( '^' )
            // InternalTExp.g:4102:17: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP200XFY"

    // $ANTLR start "RULE_ATOM"
    public final void mRULE_ATOM() throws RecognitionException {
        try {
            int _type = RULE_ATOM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4104:11: ( 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )* )
            // InternalTExp.g:4104:13: 'a' .. 'z' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            {
            matchRange('a','z'); 
            // InternalTExp.g:4104:22: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTExp.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ATOM"

    // $ANTLR start "RULE_VARIABLE"
    public final void mRULE_VARIABLE() throws RecognitionException {
        try {
            int _type = RULE_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4106:15: ( ( 'A' .. 'Z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )* )
            // InternalTExp.g:4106:17: ( 'A' .. 'Z' | '_' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTExp.g:4106:32: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTExp.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VARIABLE"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4108:13: ( '\\'' ( options {greedy=false; } : . )* '\\'' )
            // InternalTExp.g:4108:15: '\\'' ( options {greedy=false; } : . )* '\\''
            {
            match('\''); 
            // InternalTExp.g:4108:20: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='\'') ) {
                    alt14=2;
                }
                else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTExp.g:4108:48: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4110:10: ( ( '0' .. '9' )+ )
            // InternalTExp.g:4110:12: ( '0' .. '9' )+
            {
            // InternalTExp.g:4110:12: ( '0' .. '9' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTExp.g:4110:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_EXT_INT"
    public final void mRULE_EXT_INT() throws RecognitionException {
        try {
            int _type = RULE_EXT_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTExp.g:4112:14: ( RULE_INT ( 'e' | 'E' ) ( '-' | '+' )? RULE_INT )
            // InternalTExp.g:4112:16: RULE_INT ( 'e' | 'E' ) ( '-' | '+' )? RULE_INT
            {
            mRULE_INT(); 
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTExp.g:4112:35: ( '-' | '+' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTExp.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXT_INT"

    public void mTokens() throws RecognitionException {
        // InternalTExp.g:1:8: ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | RULE_OP1150FX | RULE_WHITESPACE | RULE_SINGLE_LINE_COMMENT | RULE_OP1200XFX | RULE_OP1200FX | RULE_OP1100XFY | RULE_OP1050XFY | RULE_OP1000XFY | RULE_OP954XFY | RULE_OP900FY | RULE_OP900FX | RULE_OP700XFXL | RULE_OP700XFXR | RULE_OP700XFX | RULE_OP600XFY | RULE_OP500YFX | RULE_OP500FX | RULE_OP400FX1 | RULE_OP400YFX | RULE_OP200XFX | RULE_OP200XFY | RULE_ATOM | RULE_VARIABLE | RULE_STRING | RULE_INT | RULE_EXT_INT )
        int alt17=63;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // InternalTExp.g:1:10: T__30
                {
                mT__30(); 

                }
                break;
            case 2 :
                // InternalTExp.g:1:16: T__31
                {
                mT__31(); 

                }
                break;
            case 3 :
                // InternalTExp.g:1:22: T__32
                {
                mT__32(); 

                }
                break;
            case 4 :
                // InternalTExp.g:1:28: T__33
                {
                mT__33(); 

                }
                break;
            case 5 :
                // InternalTExp.g:1:34: T__34
                {
                mT__34(); 

                }
                break;
            case 6 :
                // InternalTExp.g:1:40: T__35
                {
                mT__35(); 

                }
                break;
            case 7 :
                // InternalTExp.g:1:46: T__36
                {
                mT__36(); 

                }
                break;
            case 8 :
                // InternalTExp.g:1:52: T__37
                {
                mT__37(); 

                }
                break;
            case 9 :
                // InternalTExp.g:1:58: T__38
                {
                mT__38(); 

                }
                break;
            case 10 :
                // InternalTExp.g:1:64: T__39
                {
                mT__39(); 

                }
                break;
            case 11 :
                // InternalTExp.g:1:70: T__40
                {
                mT__40(); 

                }
                break;
            case 12 :
                // InternalTExp.g:1:76: T__41
                {
                mT__41(); 

                }
                break;
            case 13 :
                // InternalTExp.g:1:82: T__42
                {
                mT__42(); 

                }
                break;
            case 14 :
                // InternalTExp.g:1:88: T__43
                {
                mT__43(); 

                }
                break;
            case 15 :
                // InternalTExp.g:1:94: T__44
                {
                mT__44(); 

                }
                break;
            case 16 :
                // InternalTExp.g:1:100: T__45
                {
                mT__45(); 

                }
                break;
            case 17 :
                // InternalTExp.g:1:106: T__46
                {
                mT__46(); 

                }
                break;
            case 18 :
                // InternalTExp.g:1:112: T__47
                {
                mT__47(); 

                }
                break;
            case 19 :
                // InternalTExp.g:1:118: T__48
                {
                mT__48(); 

                }
                break;
            case 20 :
                // InternalTExp.g:1:124: T__49
                {
                mT__49(); 

                }
                break;
            case 21 :
                // InternalTExp.g:1:130: T__50
                {
                mT__50(); 

                }
                break;
            case 22 :
                // InternalTExp.g:1:136: T__51
                {
                mT__51(); 

                }
                break;
            case 23 :
                // InternalTExp.g:1:142: T__52
                {
                mT__52(); 

                }
                break;
            case 24 :
                // InternalTExp.g:1:148: T__53
                {
                mT__53(); 

                }
                break;
            case 25 :
                // InternalTExp.g:1:154: T__54
                {
                mT__54(); 

                }
                break;
            case 26 :
                // InternalTExp.g:1:160: T__55
                {
                mT__55(); 

                }
                break;
            case 27 :
                // InternalTExp.g:1:166: T__56
                {
                mT__56(); 

                }
                break;
            case 28 :
                // InternalTExp.g:1:172: T__57
                {
                mT__57(); 

                }
                break;
            case 29 :
                // InternalTExp.g:1:178: T__58
                {
                mT__58(); 

                }
                break;
            case 30 :
                // InternalTExp.g:1:184: T__59
                {
                mT__59(); 

                }
                break;
            case 31 :
                // InternalTExp.g:1:190: T__60
                {
                mT__60(); 

                }
                break;
            case 32 :
                // InternalTExp.g:1:196: T__61
                {
                mT__61(); 

                }
                break;
            case 33 :
                // InternalTExp.g:1:202: T__62
                {
                mT__62(); 

                }
                break;
            case 34 :
                // InternalTExp.g:1:208: T__63
                {
                mT__63(); 

                }
                break;
            case 35 :
                // InternalTExp.g:1:214: T__64
                {
                mT__64(); 

                }
                break;
            case 36 :
                // InternalTExp.g:1:220: T__65
                {
                mT__65(); 

                }
                break;
            case 37 :
                // InternalTExp.g:1:226: T__66
                {
                mT__66(); 

                }
                break;
            case 38 :
                // InternalTExp.g:1:232: RULE_OP1150FX
                {
                mRULE_OP1150FX(); 

                }
                break;
            case 39 :
                // InternalTExp.g:1:246: RULE_WHITESPACE
                {
                mRULE_WHITESPACE(); 

                }
                break;
            case 40 :
                // InternalTExp.g:1:262: RULE_SINGLE_LINE_COMMENT
                {
                mRULE_SINGLE_LINE_COMMENT(); 

                }
                break;
            case 41 :
                // InternalTExp.g:1:287: RULE_OP1200XFX
                {
                mRULE_OP1200XFX(); 

                }
                break;
            case 42 :
                // InternalTExp.g:1:302: RULE_OP1200FX
                {
                mRULE_OP1200FX(); 

                }
                break;
            case 43 :
                // InternalTExp.g:1:316: RULE_OP1100XFY
                {
                mRULE_OP1100XFY(); 

                }
                break;
            case 44 :
                // InternalTExp.g:1:331: RULE_OP1050XFY
                {
                mRULE_OP1050XFY(); 

                }
                break;
            case 45 :
                // InternalTExp.g:1:346: RULE_OP1000XFY
                {
                mRULE_OP1000XFY(); 

                }
                break;
            case 46 :
                // InternalTExp.g:1:361: RULE_OP954XFY
                {
                mRULE_OP954XFY(); 

                }
                break;
            case 47 :
                // InternalTExp.g:1:375: RULE_OP900FY
                {
                mRULE_OP900FY(); 

                }
                break;
            case 48 :
                // InternalTExp.g:1:388: RULE_OP900FX
                {
                mRULE_OP900FX(); 

                }
                break;
            case 49 :
                // InternalTExp.g:1:401: RULE_OP700XFXL
                {
                mRULE_OP700XFXL(); 

                }
                break;
            case 50 :
                // InternalTExp.g:1:416: RULE_OP700XFXR
                {
                mRULE_OP700XFXR(); 

                }
                break;
            case 51 :
                // InternalTExp.g:1:431: RULE_OP700XFX
                {
                mRULE_OP700XFX(); 

                }
                break;
            case 52 :
                // InternalTExp.g:1:445: RULE_OP600XFY
                {
                mRULE_OP600XFY(); 

                }
                break;
            case 53 :
                // InternalTExp.g:1:459: RULE_OP500YFX
                {
                mRULE_OP500YFX(); 

                }
                break;
            case 54 :
                // InternalTExp.g:1:473: RULE_OP500FX
                {
                mRULE_OP500FX(); 

                }
                break;
            case 55 :
                // InternalTExp.g:1:486: RULE_OP400FX1
                {
                mRULE_OP400FX1(); 

                }
                break;
            case 56 :
                // InternalTExp.g:1:500: RULE_OP400YFX
                {
                mRULE_OP400YFX(); 

                }
                break;
            case 57 :
                // InternalTExp.g:1:514: RULE_OP200XFX
                {
                mRULE_OP200XFX(); 

                }
                break;
            case 58 :
                // InternalTExp.g:1:528: RULE_OP200XFY
                {
                mRULE_OP200XFY(); 

                }
                break;
            case 59 :
                // InternalTExp.g:1:542: RULE_ATOM
                {
                mRULE_ATOM(); 

                }
                break;
            case 60 :
                // InternalTExp.g:1:552: RULE_VARIABLE
                {
                mRULE_VARIABLE(); 

                }
                break;
            case 61 :
                // InternalTExp.g:1:566: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 62 :
                // InternalTExp.g:1:578: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 63 :
                // InternalTExp.g:1:587: RULE_EXT_INT
                {
                mRULE_EXT_INT(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA1_eotS =
        "\12\uffff";
    static final String DFA1_eofS =
        "\12\uffff";
    static final String DFA1_minS =
        "\1\144\1\151\1\uffff\1\157\6\uffff";
    static final String DFA1_maxS =
        "\1\166\1\171\1\uffff\1\165\6\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\3\1\uffff\1\6\1\7\1\1\1\2\1\4\1\5";
    static final String DFA1_specialS =
        "\12\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\4\uffff\1\2\3\uffff\1\3\6\uffff\1\4\1\uffff\1\5",
            "\1\7\17\uffff\1\6",
            "",
            "\1\10\5\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "4062:17: ( 'dynamic' | 'discontiguous' | 'initialization' | 'module_transparent' | 'multifile' | 'thread_local' | 'volatile' )";
        }
    }
    static final String DFA9_eotS =
        "\1\uffff\1\14\15\uffff\1\22\1\24\4\uffff";
    static final String DFA9_eofS =
        "\25\uffff";
    static final String DFA9_minS =
        "\1\75\1\56\1\uffff\1\74\1\75\12\uffff\2\75\4\uffff";
    static final String DFA9_maxS =
        "\1\151\1\134\1\uffff\1\76\1\75\12\uffff\2\75\4\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\10\2\uffff\1\17\1\2\1\3\1\4\1\5\1\6\1\7\1\1\1\11\1\12\2\uffff\1\14\1\13\1\16\1\15";
    static final String DFA9_specialS =
        "\25\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\1\2\1\uffff\1\3\33\uffff\1\4\14\uffff\1\5",
            "\1\6\13\uffff\1\10\1\uffff\1\11\1\12\2\uffff\1\7\33\uffff\1\13",
            "",
            "\1\15\1\16\1\17",
            "\1\20",
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
            "\1\21",
            "\1\23",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "4088:17: ( '=' | '=..' | '=@=' | '=:=' | '=<' | '==' | '=\\\\=' | '>=' | '@<' | '@=<' | '@>' | '@>=' | '\\\\=' | '\\\\==' | 'is' )";
        }
    }
    static final String DFA11_eotS =
        "\2\uffff\1\7\7\uffff";
    static final String DFA11_eofS =
        "\12\uffff";
    static final String DFA11_minS =
        "\1\52\1\uffff\1\57\1\144\6\uffff";
    static final String DFA11_maxS =
        "\1\162\1\uffff\1\57\1\145\6\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\2\uffff\1\5\1\6\1\3\1\2\1\4\1\7";
    static final String DFA11_specialS =
        "\12\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\4\uffff\1\2\14\uffff\1\4\60\uffff\1\5\4\uffff\1\3",
            "",
            "\1\6",
            "\1\10\1\11",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "4098:17: ( '*' | '/' | '//' | 'rdiv' | '<<' | 'mod' | 'rem' )";
        }
    }
    static final String DFA17_eotS =
        "\3\uffff\1\61\5\uffff\1\53\1\uffff\11\53\1\uffff\1\112\1\115\1\111\1\121\1\53\1\47\1\uffff\3\53\2\uffff\1\130\1\132\3\uffff\1\134\2\uffff\1\53\4\uffff\1\137\1\117\3\uffff\5\53\1\47\17\53\1\170\11\uffff\1\53\1\uffff\3\53\7\uffff\1\53\3\uffff\4\53\1\uffff\4\53\2\111\12\53\4\uffff\4\53\1\135\1\53\1\u0098\5\53\1\111\12\53\1\uffff\5\53\1\uffff\4\53\1\uffff\7\53\1\u00b9\10\53\1\uffff\3\53\1\uffff\6\53\1\uffff\20\53\1\u00dc\4\53\1\u00e1\7\53\1\uffff\1\53\1\uffff\2\53\1\uffff\4\53\1\uffff\3\53\1\u00dc\5\53\1\u00dc\4\53\1\uffff\4\53\1\uffff\5\53\1\uffff\17\53\1\u00dc\4\53\1\uffff\7\53\1\u00dc\4\53\1\u00dc\1\53\1\uffff\10\53\1\u012d\3\53\1\u0131\1\uffff\1\53\1\u0133\1\53\1\uffff\1\u00dc\1\uffff\1\u0135\1\uffff";
    static final String DFA17_eofS =
        "\u0136\uffff";
    static final String DFA17_minS =
        "\1\11\2\uffff\1\55\5\uffff\1\150\1\uffff\1\144\1\157\1\144\1\151\1\145\2\141\1\150\1\165\1\uffff\1\55\1\53\1\134\1\52\1\160\1\76\1\uffff\1\165\1\151\1\157\2\uffff\2\55\3\uffff\1\75\2\uffff\1\157\4\uffff\1\60\1\74\3\uffff\1\141\1\160\1\162\1\72\1\151\1\60\1\144\1\154\1\151\1\155\1\144\1\156\1\154\1\143\1\156\1\163\1\154\1\162\1\156\1\141\1\151\1\55\11\uffff\1\163\1\uffff\1\155\1\172\1\154\7\uffff\1\162\3\uffff\1\143\3\145\1\uffff\1\164\1\171\1\145\1\166\2\60\1\151\1\164\1\145\1\141\1\143\1\163\1\164\1\163\1\156\1\72\4\uffff\1\151\1\142\1\145\1\141\1\60\1\145\1\60\1\163\1\141\1\151\1\72\1\163\1\60\1\154\1\155\1\151\1\156\1\155\1\157\1\145\1\151\1\164\1\156\1\uffff\1\154\1\145\1\137\1\164\1\137\1\uffff\1\72\1\150\1\144\1\141\1\uffff\1\72\1\145\1\141\1\146\1\164\1\151\1\156\1\60\1\164\1\162\1\145\1\157\1\162\1\143\1\151\1\145\1\uffff\1\157\1\137\1\154\1\uffff\1\137\1\154\1\151\1\162\1\143\1\164\1\uffff\1\151\1\141\1\154\1\156\1\137\1\157\1\154\1\170\2\154\1\151\1\72\1\164\1\72\1\154\1\141\1\60\1\151\1\157\1\151\1\163\1\60\1\143\1\156\1\145\1\160\1\144\1\157\1\172\1\uffff\1\162\1\uffff\1\145\1\154\1\uffff\1\147\2\156\1\72\1\uffff\1\151\1\157\1\163\1\60\1\162\1\72\1\143\2\141\1\60\1\151\1\165\1\72\1\164\1\uffff\2\156\1\164\1\145\1\uffff\1\141\1\164\1\156\1\172\1\157\1\uffff\1\163\1\147\1\163\1\162\1\163\1\154\1\151\1\163\1\145\1\165\1\72\1\154\1\164\1\141\1\163\1\60\1\157\1\160\1\144\1\163\1\uffff\1\145\1\162\2\151\1\156\1\141\1\72\1\60\1\164\1\141\1\156\1\157\1\60\1\162\1\uffff\1\157\1\151\1\164\1\156\1\145\2\156\1\163\1\60\1\156\1\163\1\164\1\60\1\uffff\1\164\1\60\1\163\1\uffff\1\60\1\uffff\1\60\1\uffff";
    static final String DFA17_maxS =
        "\1\176\2\uffff\1\76\5\uffff\1\171\1\uffff\1\163\2\157\1\165\1\171\2\141\1\157\1\165\1\uffff\1\74\1\75\1\134\1\55\1\160\1\76\1\uffff\1\165\1\151\1\157\2\uffff\2\55\3\uffff\1\76\2\uffff\1\157\4\uffff\1\145\1\74\3\uffff\1\165\1\160\1\162\1\72\1\151\1\172\1\144\1\154\1\151\1\155\1\144\1\156\1\154\1\143\1\156\1\163\1\154\1\162\1\156\1\141\1\151\1\55\11\uffff\1\163\1\uffff\1\155\1\172\1\154\7\uffff\1\162\3\uffff\1\143\3\145\1\uffff\1\164\1\171\1\145\1\166\2\172\1\151\1\164\1\145\1\141\1\143\1\163\1\164\1\163\1\156\1\72\4\uffff\1\151\1\142\1\145\1\141\1\172\1\145\1\172\2\163\1\151\1\72\1\163\1\172\1\154\1\155\1\151\1\156\1\155\1\157\1\145\1\151\1\164\1\156\1\uffff\1\154\1\145\1\137\1\164\1\137\1\uffff\1\72\1\150\1\144\1\141\1\uffff\1\72\1\145\1\141\1\146\1\164\1\151\1\156\1\172\1\164\1\162\1\145\1\157\1\162\1\143\1\151\1\145\1\uffff\1\157\1\137\1\154\1\uffff\1\163\1\154\1\151\1\162\1\143\1\164\1\uffff\1\151\1\141\1\154\1\156\1\137\1\157\1\154\1\170\2\154\1\151\1\72\1\164\1\72\1\154\1\141\1\172\1\151\1\157\1\151\1\163\1\172\1\163\1\156\1\145\1\160\1\144\1\157\1\172\1\uffff\1\162\1\uffff\1\145\1\154\1\uffff\1\147\2\156\1\72\1\uffff\1\151\1\157\1\163\1\172\1\162\1\72\1\143\2\141\1\172\1\151\1\165\1\72\1\164\1\uffff\2\156\1\164\1\145\1\uffff\1\141\1\164\1\156\1\172\1\157\1\uffff\1\163\1\147\1\163\1\162\1\163\1\154\1\151\1\163\1\145\1\165\1\72\1\154\1\164\1\141\1\163\1\172\1\157\1\160\1\144\1\163\1\uffff\1\145\1\162\2\151\1\156\1\141\1\72\1\172\1\164\1\141\1\156\1\157\1\172\1\162\1\uffff\1\157\1\151\1\164\1\156\1\145\2\156\1\163\1\172\1\156\1\163\1\164\1\172\1\uffff\1\164\1\172\1\163\1\uffff\1\172\1\uffff\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\11\uffff\1\31\6\uffff\1\40\3\uffff\1\47\1\50\2\uffff\1\53\1\55\1\60\1\uffff\1\63\1\65\1\uffff\1\72\1\73\1\74\1\75\2\uffff\1\51\1\3\1\7\26\uffff\1\70\1\61\1\33\1\57\1\56\1\34\1\54\1\71\1\35\1\uffff\1\37\3\uffff\1\51\1\64\1\52\1\66\1\67\1\62\1\65\1\uffff\1\76\1\77\1\41\4\uffff\1\13\20\uffff\1\42\1\32\1\33\1\34\27\uffff\1\25\5\uffff\1\21\4\uffff\1\14\20\uffff\1\16\3\uffff\1\15\6\uffff\1\22\35\uffff\1\17\1\uffff\1\26\2\uffff\1\46\4\uffff\1\36\16\uffff\1\30\4\uffff\1\27\5\uffff\1\23\24\uffff\1\24\16\uffff\1\20\15\uffff\1\11\3\uffff\1\44\1\uffff\1\43\1\uffff\1\45";
    static final String DFA17_specialS =
        "\u0136\uffff}>";
    static final String[] DFA17_transitionS = {
            "\2\37\2\uffff\1\37\22\uffff\1\37\1\2\2\uffff\1\33\1\40\1\uffff\1\55\1\4\1\5\1\30\1\50\1\44\1\3\1\1\1\27\12\56\1\41\1\43\1\25\1\32\1\46\1\42\1\47\32\54\1\6\1\26\1\10\1\52\1\54\1\uffff\1\53\1\14\1\22\1\17\1\31\1\20\1\23\1\53\1\13\3\53\1\16\1\34\1\53\1\21\1\53\1\15\1\35\1\11\1\53\1\36\1\53\1\51\2\53\1\12\1\7\1\24\1\45",
            "",
            "",
            "\1\60\20\uffff\1\57",
            "",
            "",
            "",
            "",
            "",
            "\1\65\11\uffff\1\63\6\uffff\1\64",
            "",
            "\1\66\11\uffff\1\67\4\uffff\1\70",
            "\1\71",
            "\1\73\1\74\11\uffff\1\72",
            "\1\76\5\uffff\1\75\5\uffff\1\77",
            "\1\100\3\uffff\1\102\17\uffff\1\101",
            "\1\103",
            "\1\104",
            "\1\106\6\uffff\1\105",
            "\1\107",
            "",
            "\1\110\16\uffff\1\111",
            "\1\114\3\uffff\1\113\15\uffff\1\47",
            "\1\116",
            "\1\120\2\uffff\1\117",
            "\1\122",
            "\1\123",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "\1\127",
            "\1\131",
            "",
            "",
            "",
            "\1\47\1\133",
            "",
            "",
            "\1\136",
            "",
            "",
            "",
            "",
            "\12\56\13\uffff\1\140\37\uffff\1\140",
            "\1\141",
            "",
            "",
            "",
            "\1\142\23\uffff\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\173",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\177",
            "",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\u0088\5\53",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "",
            "",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0097",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0099",
            "\1\u009b\21\uffff\1\u009a",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\1\u00c6\23\uffff\1\u00c5",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00e3\17\uffff\1\u00e2",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\1\u00ea",
            "",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0124",
            "",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\1\u0132",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\1\u0134",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | RULE_OP1150FX | RULE_WHITESPACE | RULE_SINGLE_LINE_COMMENT | RULE_OP1200XFX | RULE_OP1200FX | RULE_OP1100XFY | RULE_OP1050XFY | RULE_OP1000XFY | RULE_OP954XFY | RULE_OP900FY | RULE_OP900FX | RULE_OP700XFXL | RULE_OP700XFXR | RULE_OP700XFX | RULE_OP600XFY | RULE_OP500YFX | RULE_OP500FX | RULE_OP400FX1 | RULE_OP400YFX | RULE_OP200XFX | RULE_OP200XFY | RULE_ATOM | RULE_VARIABLE | RULE_STRING | RULE_INT | RULE_EXT_INT );";
        }
    }
 

}