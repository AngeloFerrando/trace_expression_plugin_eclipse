/*
 * generated by Xtext 2.12.0
 */
package it.unige.dibris.trace_expression_language.generator

import java.util.StringJoiner;

import it.unige.dibris.trace_expression_language.tExp.AndExpr
import it.unige.dibris.trace_expression_language.tExp.AtomExpression
import it.unige.dibris.trace_expression_language.tExp.CatExpr
import it.unige.dibris.trace_expression_language.tExp.EventType
import it.unige.dibris.trace_expression_language.tExp.Expression
import it.unige.dibris.trace_expression_language.tExp.FilterExpr
import it.unige.dibris.trace_expression_language.tExp.Msg
import it.unige.dibris.trace_expression_language.tExp.NumberExpression
import it.unige.dibris.trace_expression_language.tExp.PrologExpression
import it.unige.dibris.trace_expression_language.tExp.SeqExpr
import it.unige.dibris.trace_expression_language.tExp.ShuffleExpr
import it.unige.dibris.trace_expression_language.tExp.StringExpression
import it.unige.dibris.trace_expression_language.tExp.Term
import it.unige.dibris.trace_expression_language.tExp.TerminalExpr
import it.unige.dibris.trace_expression_language.tExp.TraceExpression
import it.unige.dibris.trace_expression_language.tExp.UnionExpr
import it.unige.dibris.trace_expression_language.tExp.VarExpr
import it.unige.dibris.trace_expression_language.tExp.VariableExpression
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import it.unige.dibris.trace_expression_language.tExp.Singletons
import it.unige.dibris.trace_expression_language.tExp.Size
import it.unige.dibris.trace_expression_language.tExp.Cardinality

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class TExpGenerator extends AbstractGenerator {

	private String tExpCurrentName

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
		for (TraceExpression tExp : resource.allContents.toIterable.filter(TraceExpression)) {
            fsa.generateFile(tExp.name + '.pl', tExp.compile);
            fsa.generateFile(tExp.name.substring(0, 1).toUpperCase + tExp.name.substring(1) + '.java', tExp.javaCompile)
        }
	}
	
	def javaCompile(TraceExpression tExp)
	''' 
		«var name = tExp.name.substring(0, 1).toUpperCase + tExp.name.substring(1)»
		import java.io.IOException;
		import java.util.ArrayList;
		import java.util.List;
		
		import it.dibris.unige.TExpSWIPrologConnector.exceptions.DecentralizedPartitionNotFoundException;
		import it.dibris.unige.TExpSWIPrologConnector.JPL.JPLInitializer;
		import it.dibris.unige.TExpSWIPrologConnector.texp.TraceExpression;
		import it.dibris.unige.TExpSWIPrologConnector.decentralized.Partition;
		import it.unige.dibris.TExpRVJade.Channel;
		import it.unige.dibris.TExpRVJade.Monitor;
		import it.unige.dibris.TExpRVJade.SimulatedChannel;
		import it.unige.dibris.TExpRVJade.SnifferMonitorFactory;
		import jade.core.Agent;
		import jade.core.Profile;
		import jade.core.ProfileImpl;
		import jade.wrapper.AgentContainer;
		import jade.wrapper.AgentController;
		import jade.wrapper.StaleProxyException;
		
		public class «name» {
			
			public static void main(String[] args) throws StaleProxyException, DecentralizedPartitionNotFoundException, IOException {
				JPLInitializer.init();
				
				TraceExpression tExp = new TraceExpression("«tExp.name».pl");
				
				/* Initialize JADE environment */
				jade.core.Runtime runtime = jade.core.Runtime.instance();
				Profile profile = new ProfileImpl();
				AgentContainer container = runtime.createMainContainer(profile);	
				
				List<AgentController> agents = new ArrayList<>();
				
				«FOR role : tExp.roles»
				«IF role.class_ !== null»
				«role.class_» «role.name» = new «role.class_»();
				«ELSE»
				Agent «role.name» = new Agent();
				«ENDIF»
				«role.name».setArguments(new String[] {
					«var first = true» 
					«FOR arg : role.args»
					«IF first» «{ first=false; "" }»
					«ELSE»
					, 
					«ENDIF»
					«arg.replace('\'','"')»
					«ENDFOR»
				});
				AgentController «role.name»C = container.acceptNewAgent("«role.name»", «role.name»);
				agents.add(«role.name»C);
				«ENDFOR»
				«IF tExp.decentralized !== null && tExp.decentralized.size > 0 && tExp.decentralized.get(0) == 'true'»
				/* Create and Set the partition */
				«IF tExp.partition !== null && tExp.partition.size > 0»
				List<List<String>> groups = new ArrayList<>();
				List<String> group;
				«FOR constraint : tExp.partition.get(0).constraints»
				group = new ArrayList<>();
				groups.add(group);
				«FOR role : constraint.roles»
				group.add("«role.name»");
				«ENDFOR»
				«ENDFOR»
				Partition<String> partition = new Partition<>(groups);
				«ELSE»
				«FOR constraint : tExp.constraints»
				«FOR role1 : constraint.left»
				«FOR role2 : constraint.right»
				«IF constraint.together !== null»
				List<Condition<String>> constraints = new ArrayList<>();
				constraints.add(ConditionsFactory.createMustBeTogetherCondition("«role1.name»","«role2.name»"));
				«ELSE»
				constraints.add(ConditionsFactory.createMustBeSplitCondition("«role1.name»","«role2.name»"));
				«ENDIF»
				«ENDFOR»
				«ENDFOR»
				«IF constraint instanceof Singletons»
				«IF constraint.parMin == '('»
				«IF constraint.parMax == ')'»
				constraints.add(ConditionsFactory.createNumberSingletonsCondition(«constraint.minSingletons - 1»,«constraint.maxSingletons - 1»));
				«ELSE»
				constraints.add(ConditionsFactory.createNumberSingletonsCondition(«constraint.minSingletons - 1»,«constraint.maxSingletons»));
				«ENDIF»
				«ELSE»
				«IF constraint.parMax == ')'»
				constraints.add(ConditionsFactory.createNumberSingletonsCondition(«constraint.minSingletons»,«constraint.maxSingletons - 1»));
				«ELSE»
				constraints.add(ConditionsFactory.createNumberSingletonsCondition(«constraint.minSingletons»,«constraint.maxSingletons»));				
				«ENDIF»
				«ENDIF»
				«ENDIF»
				«IF constraint instanceof Size»
				«IF constraint.parMin == '('»
				«IF constraint.parMax == ')'»
				constraints.add(ConditionsFactory.createNumberAgentsForConstraintCondition(«constraint.minSize - 1»,«constraint.maxSize - 1»));
				«ELSE»
				constraints.add(ConditionsFactory.createNumberAgentsForConstraintCondition(«constraint.minSize - 1»,«constraint.maxSize»));
				«ENDIF»
				«ELSE»
				«IF constraint.parMax == ')'»
				constraints.add(ConditionsFactory.createNumberAgentsForConstraintCondition(«constraint.minSize»,«constraint.maxSize - 1»));
				«ELSE»
				constraints.add(ConditionsFactory.createNumberAgentsForConstraintCondition(«constraint.minSize»,«constraint.maxSize»));				
				«ENDIF»
				«ENDIF»
				«ENDIF»
				«IF constraint instanceof Cardinality»
				«IF constraint.parMin == '('»
				«IF constraint.parMax == ')'»
				constraints.add(ConditionFactory.createNumberOfConstraintsCondition(«constraint.minCardinality - 1»,«constraint.maxCardinality - 1»));
				«ELSE»
				constraints.add(ConditionFactory.createNumberOfConstraintsCondition(«constraint.minCardinality - 1»,«constraint.maxCardinality»));
				«ENDIF»
				«ELSE»
				«IF constraint.parMax == ')'»
				constraints.add(ConditionFactory.createNumberOfConstraintsCondition(«constraint.minCardinality»,«constraint.maxCardinality - 1»));
				«ELSE»
				constraints.add(ConditionFactory.createNumberOfConstraintsCondition(«constraint.minCardinality»,«constraint.maxCardinality»));			
				«ENDIF»
				«ENDIF»
				«ENDIF»
				«ENDFOR»
				«IF tExp.minimal !== null && tExp.minimal.size > 0 && tExp.minimal.get(0) == 'true'»
				Partition<String> partition = tExp.getFirstMonitoringSafePartition(constraints);
				«ELSE»
				Partition<String> partition = tExp.getRandomMonitoringSafePartition(constraints);
				«ENDIF»
				«ENDIF»
				
				/* Decentralized monitors */
				
				for(Monitor m : SnifferMonitorFactory.createDecentralizedMonitors(tExp, partition, agents)){
					container.acceptNewAgent(m.getMonitorName(), m).start();
				}
				«ELSE»
				/* Centralized monitor */
				
				SnifferMonitorFactory.createAndRunCentralizedMonitor(tExp, container, agents);
				«ENDIF»
				
				«IF tExp.gui == 'true'»
				Monitor.setErrorMessageGUIVisible(true);
				«ELSE»
				Monitor.setErrorMessageGUIVisible(false);
				«ENDIF»
				
				/* Channels creation */
				«FOR channel : tExp.channels»
				«IF channel.reliability !== null»
				Channel.addChannel(new SimulatedChannel("«channel.name»", «channel.reliability»));
				«ELSE»
				Channel.addChannel(new SimulatedChannel("«channel.name»", 1));
				«ENDIF»
				«ENDFOR»
				
				/* Run the agents */
				«FOR role : tExp.roles»
				«role.name»C.start();
				«ENDFOR»
			}
		}
	''' 
	
	def compile(TraceExpression tExp){
		/*for(EventType type : tExp.types){
			return "match(event(" + type.event.name + ", " + type.event.content + "), " + type.name + ")";
		} */
		var str = ':- discontiguous match/3.\n'
		str += ':- discontiguous event/2.\n'
		str += ':- discontiguous reliable/3.\n\n'
		
		tExpCurrentName = tExp.name
		
		for(module : tExp.modules){
			str += ':- ensure_loaded(' + module + ').\n'
		}
		
		str += '\n'
		str += 'roles('
		
		var rolesJoiner = new StringJoiner(", ", "[", "]");
		
		for(role : tExp.roles){
			rolesJoiner.add(role.name)
		}
		
		str += rolesJoiner.toString() + ').\n\n'
		
		for(type : tExp.types){
			str += type.compile
		}
		
		if(tExp.threshold !== null && tExp.threshold.size > 0){
			str += '\n\n' + 'threshold(' + tExp.threshold.get(0) + ').\n\n'
		} else{
			str += '\n\n' + 'threshold(' + '1' + ').\n\n'
		}
		
		str += '\n\n' + 'trace_expression(' + tExp.name + ', Main) :- \n'
		for(term : tExp.terms){
			str += '\t' + term.compile + ',\n'
		}
		str = str.substring(0, str.length-2) + ', numbervars(Main, 0, _).\n'
		
	} 
	
	def compile(Term term){
		return term.name.substring(0, 1).toUpperCase + term.name.substring(1) + ' = ' + term.expr.compile
	}
	
	def String compile(Expression expr){
		if(expr instanceof UnionExpr){
			return '(' + expr.left.compile + ' \\/ ' + expr.right.compile + ')'
		} else if(expr instanceof ShuffleExpr){
			return '(' +  expr.left.compile + ' | ' + expr.right.compile + ')'
		} else if(expr instanceof CatExpr){
			return '(' +  expr.left.compile + ' * ' + expr.right.compile + ')'
		} else if(expr instanceof AndExpr){
			return '(' +  expr.left.compile + ' /\\ ' + expr.right.compile + ')'
		} else if(expr instanceof FilterExpr){
			if(expr.filterExpr.first !== null){
				var str = '(' + expr.filterExpr.typeFilter.name + '(' + expr.filterExpr.first.compile
				for(arg : expr.filterExpr.exprs){
					str += ', ' + arg.compile
				}
				str += ') >> ' + expr.filterExpr.bodyFilter.compile + ')'
				return str
			} else{
				return '(' +  expr.filterExpr.typeFilter.name  + ' >> ' + expr.filterExpr.bodyFilter.compile + ')'
			}
		} else if(expr.typeFilter !== null && expr.bodyFilter !== null){
			if(expr.first !== null){
				var str = '(' + expr.typeFilter.name + '(' + expr.first.compile
				for(arg : expr.exprs){
					str += ', ' + arg.compile
				}
				str += ') >> ' + expr.bodyFilter.compile + ')'
				return str
			} else{
				return '(' +  expr.typeFilter.name  + ' >> ' + expr.bodyFilter.compile + ')'
			}
		} else if(expr instanceof SeqExpr){
			if(expr.seqExpr.first !== null){
				var str = '(' + expr.seqExpr.typeSeq.name + '(' + expr.seqExpr.first.compile
				for(arg : expr.seqExpr.exprs){
					str += ', ' + arg.compile
				}
				str += ') :' + expr.seqExpr.bodySeq.compile + ')'
				return str
			} else{
				return '(' +  expr.seqExpr.typeSeq.name  + ' : ' + expr.seqExpr.bodySeq.compile + ')'
			}
		} else if(expr.typeSeq !== null && expr.bodySeq !== null){
			if(expr.first !== null){
				var str = '(' + expr.typeSeq.name + '(' + expr.first.compile
				for(arg : expr.exprs){
					str += ', ' + arg.compile
				}
				str += ') : ' + expr.bodySeq.compile + ')'
				return str
			} else{
				return '(' +  expr.typeSeq.name  + ' : ' + expr.bodySeq.compile + ')'
			}
		} else if(expr instanceof VarExpr){
			return 'var( ' + expr.varExpr.variable + ', ' + expr.varExpr.bodyVar.compile + ')'
		} else if(expr instanceof TerminalExpr){ 
			if(expr.terminalExpr.term !== null){
				return expr.terminalExpr.term.name.substring(0, 1).toUpperCase + expr.terminalExpr.term.name.substring(1)
			}
			if(expr.terminalExpr.eps !== null){
				return 'epsilon'
			}
			if(expr.terminalExpr.expr !== null){
				return '(' + expr.terminalExpr.expr.compile + ')'
			}
		} else if(expr.term !== null){
			return expr.term.name.substring(0, 1).toUpperCase + expr.term.name.substring(1)
		} 
		else if(expr.eps !== null){
			return 'epsilon'
		}
		return ''
	}
	
	def compile(EventType eventType){
		var str = ''
		for(msg : eventType.msgs){
			if(eventType.channel !== null){
				str += 'match(' + tExpCurrentName + ', ' + msg.compile + ', ' + eventType.channel.name + '), ' + eventType.name
			} else{
				str += 'match(' + tExpCurrentName + ', ' + msg.compile + ', ' + 'default), ' + eventType.name
			}
			if(eventType.expr !== null){
				str += '(' + eventType.expr.compile
				for(e : eventType.exprs){
					str += ', ' + e.compile
				}
				str += ')'
			}
			str += ')'
			if(msg.conditions !== null){
				str += ' :- \n\t' + msg.conditions.compile + '.'
			} else{
				str += '.'
			}
			if(eventType.channel !== null){
				str += '\n' + 'event(' + tExpCurrentName + ', ' + msg.compile + ', ' + eventType.channel.name + ')).\n'
			} else{
				str += '\n' + 'event(' + tExpCurrentName + ', ' + msg.compile + ', default)).\n'
			}
		}
		if(eventType.channel !== null){
			if(eventType.channel.reliability !== null){
				str += 'reliable(' + tExpCurrentName + ', ' + eventType.name + ', ' + eventType.channel.reliability + ').\n'
			} else{
				str += 'reliable(' + tExpCurrentName + ', ' + eventType.name + ', ' + '1' + ').\n'
			}
		} else{
			str += 'reliable(' + tExpCurrentName + ', ' + eventType.name + ', 1).\n'
		}
		return str
	}
	
	def compile(Msg msg){
		var performative = 'inform'
		if(msg.performative !== null){
			performative = msg.performative
		}
		if(msg.async_sender !== null){
			return 'msg(performative(' + performative + '), sender(' + msg.async_sender.name + '), receiver(' + msg.receiver.name + '), content(' + msg.content.compile + '), s'
		} else if(msg.async_receiver !== null){
			return 'msg(performtive(' + performative + '), sender(' + msg.sender.name + '), receiver(' + msg.async_receiver.name + '), content(' + msg.content.compile + '), r'
		} else{
			return 'msg(performative(' + performative + '), sender(' + msg.sender.name + '), receiver(' + msg.receiver.name + '), content(' + msg.content.compile + '), _'
		}
	}
	
	def String compile(PrologExpression expr){
		if(expr instanceof AtomExpression){
			if(expr.terms !== null){
				return expr.atom + '(' + expr.terms.compile + ')'
			} else{
				return expr.atom
			} 
		} else if(expr instanceof NumberExpression){
			return expr.value
		} else if(expr instanceof StringExpression){
			return '\'' + expr.value + '\''
		} else if(expr instanceof VariableExpression){
			return expr.name
		} else{
			if(expr.left !== null){
				if(expr.right !== null){
					return expr.left.compile + ' ' + expr.op + ' ' + expr.right.compile
				} else{
					return expr.left.compile
				}
			} else{
				if(expr.right !== null){
					return expr.right.compile
				} else{
					return ''
				}
			}
		}
	}
		
	
	/*''' 
    <<IF e.eContainer.fullyQualifiedName !== null>>
        package <<e.eContainer.fullyQualifiedName>>;
    <<ENDIF>>
        
    public class <<e.name>> <<IF e.superType !== null
            >>extends <<e.superType.fullyQualifiedName>> <<ENDIF>>{
            	<<FOR f:e.features>>
            	            <<f.compile>>
            	        <<ENDFOR>>
    }
	'''*/
}
