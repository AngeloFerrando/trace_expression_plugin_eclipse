/*
 * generated by Xtext 2.12.0
 */
package it.unige.dibris.trace_expression_language.parser.antlr;

import com.google.inject.Inject;
import it.unige.dibris.trace_expression_language.parser.antlr.internal.InternalTExpParser;
import it.unige.dibris.trace_expression_language.services.TExpGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class TExpParser extends AbstractAntlrParser {

	@Inject
	private TExpGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WHITESPACE", "RULE_SINGLE_LINE_COMMENT");
	}
	

	@Override
	protected InternalTExpParser createParser(XtextTokenStream stream) {
		return new InternalTExpParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Domainmodel";
	}

	public TExpGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TExpGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}