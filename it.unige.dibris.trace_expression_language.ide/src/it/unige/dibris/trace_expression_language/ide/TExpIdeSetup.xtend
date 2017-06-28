/*
 * generated by Xtext 2.12.0
 */
package it.unige.dibris.trace_expression_language.ide

import com.google.inject.Guice
import it.unige.dibris.trace_expression_language.TExpRuntimeModule
import it.unige.dibris.trace_expression_language.TExpStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class TExpIdeSetup extends TExpStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new TExpRuntimeModule, new TExpIdeModule))
	}
	
}
