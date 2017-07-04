/**
 * generated by Xtext 2.12.0
 */
package it.unige.dibris.trace_expression_language.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import it.unige.dibris.trace_expression_language.TExpRuntimeModule;
import it.unige.dibris.trace_expression_language.TExpStandaloneSetup;
import it.unige.dibris.trace_expression_language.ide.TExpIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class TExpIdeSetup extends TExpStandaloneSetup {
  @Override
  public Injector createInjector() {
    TExpRuntimeModule _tExpRuntimeModule = new TExpRuntimeModule();
    TExpIdeModule _tExpIdeModule = new TExpIdeModule();
    return Guice.createInjector(Modules2.mixin(_tExpRuntimeModule, _tExpIdeModule));
  }
}
