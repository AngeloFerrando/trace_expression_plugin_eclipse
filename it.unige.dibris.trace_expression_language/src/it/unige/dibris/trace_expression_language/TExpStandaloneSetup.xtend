/*
 * generated by Xtext 2.12.0
 */
package it.unige.dibris.trace_expression_language


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class TExpStandaloneSetup extends TExpStandaloneSetupGenerated {

	def static void doSetup() {
		new TExpStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
