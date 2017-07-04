/*
 * generated by Xtext 2.12.0
 */
package it.unige.dibris.trace_expression_language.serializer;

import com.google.inject.Inject;
import it.unige.dibris.trace_expression_language.services.TExpGrammarAccess;
import it.unige.dibris.trace_expression_language.tExp.AndExpr;
import it.unige.dibris.trace_expression_language.tExp.AtomExpression;
import it.unige.dibris.trace_expression_language.tExp.Cardinality;
import it.unige.dibris.trace_expression_language.tExp.CatExpr;
import it.unige.dibris.trace_expression_language.tExp.Channel;
import it.unige.dibris.trace_expression_language.tExp.Constraint;
import it.unige.dibris.trace_expression_language.tExp.Domainmodel;
import it.unige.dibris.trace_expression_language.tExp.EventType;
import it.unige.dibris.trace_expression_language.tExp.Expression;
import it.unige.dibris.trace_expression_language.tExp.FilterExpr;
import it.unige.dibris.trace_expression_language.tExp.ListExpression;
import it.unige.dibris.trace_expression_language.tExp.Msg;
import it.unige.dibris.trace_expression_language.tExp.NumberExpression;
import it.unige.dibris.trace_expression_language.tExp.Partition;
import it.unige.dibris.trace_expression_language.tExp.PrologExpression;
import it.unige.dibris.trace_expression_language.tExp.Role;
import it.unige.dibris.trace_expression_language.tExp.SeqExpr;
import it.unige.dibris.trace_expression_language.tExp.ShuffleExpr;
import it.unige.dibris.trace_expression_language.tExp.Singletons;
import it.unige.dibris.trace_expression_language.tExp.Size;
import it.unige.dibris.trace_expression_language.tExp.StringExpression;
import it.unige.dibris.trace_expression_language.tExp.TExpPackage;
import it.unige.dibris.trace_expression_language.tExp.Term;
import it.unige.dibris.trace_expression_language.tExp.TerminalExpr;
import it.unige.dibris.trace_expression_language.tExp.Together;
import it.unige.dibris.trace_expression_language.tExp.TraceExpression;
import it.unige.dibris.trace_expression_language.tExp.UnionExpr;
import it.unige.dibris.trace_expression_language.tExp.VarExpr;
import it.unige.dibris.trace_expression_language.tExp.VariableExpression;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class TExpSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TExpGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TExpPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TExpPackage.AND_EXPR:
				sequence_AndExpr(context, (AndExpr) semanticObject); 
				return; 
			case TExpPackage.ATOM_EXPRESSION:
				sequence_Expression0(context, (AtomExpression) semanticObject); 
				return; 
			case TExpPackage.CARDINALITY:
				sequence_Constraint(context, (Cardinality) semanticObject); 
				return; 
			case TExpPackage.CAT_EXPR:
				sequence_CatExpr(context, (CatExpr) semanticObject); 
				return; 
			case TExpPackage.CHANNEL:
				sequence_Channel(context, (Channel) semanticObject); 
				return; 
			case TExpPackage.CONSTRAINT:
				sequence_Constraint(context, (Constraint) semanticObject); 
				return; 
			case TExpPackage.DOMAINMODEL:
				sequence_Domainmodel(context, (Domainmodel) semanticObject); 
				return; 
			case TExpPackage.EVENT_TYPE:
				sequence_EventType(context, (EventType) semanticObject); 
				return; 
			case TExpPackage.EXPRESSION:
				if (rule == grammarAccess.getFilterExprRule()) {
					sequence_FilterExpr(context, (Expression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSeqExprRule()) {
					sequence_SeqExpr(context, (Expression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTerminalExprRule()) {
					sequence_TerminalExpr(context, (Expression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getVarExprRule()) {
					sequence_VarExpr(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case TExpPackage.FILTER_EXPR:
				sequence_Primary(context, (FilterExpr) semanticObject); 
				return; 
			case TExpPackage.LIST_EXPRESSION:
				sequence_Expression0(context, (ListExpression) semanticObject); 
				return; 
			case TExpPackage.MSG:
				sequence_Msg(context, (Msg) semanticObject); 
				return; 
			case TExpPackage.NUMBER_EXPRESSION:
				sequence_Expression0(context, (NumberExpression) semanticObject); 
				return; 
			case TExpPackage.PARTITION:
				sequence_Partition(context, (Partition) semanticObject); 
				return; 
			case TExpPackage.PROLOG_EXPRESSION:
				sequence_Expression1000xfy_Expression200xfx_Expression200xfy_Expression400yfx_Expression500yfx_Expression600xfy_Expression700xfx_Expression954xfy(context, (PrologExpression) semanticObject); 
				return; 
			case TExpPackage.ROLE:
				sequence_Role(context, (Role) semanticObject); 
				return; 
			case TExpPackage.SEQ_EXPR:
				sequence_Primary(context, (SeqExpr) semanticObject); 
				return; 
			case TExpPackage.SHUFFLE_EXPR:
				sequence_ShuffleExpr(context, (ShuffleExpr) semanticObject); 
				return; 
			case TExpPackage.SINGLETONS:
				sequence_Constraint(context, (Singletons) semanticObject); 
				return; 
			case TExpPackage.SIZE:
				sequence_Constraint(context, (Size) semanticObject); 
				return; 
			case TExpPackage.STRING_EXPRESSION:
				sequence_Expression0(context, (StringExpression) semanticObject); 
				return; 
			case TExpPackage.TERM:
				sequence_Term(context, (Term) semanticObject); 
				return; 
			case TExpPackage.TERMINAL_EXPR:
				sequence_Primary(context, (TerminalExpr) semanticObject); 
				return; 
			case TExpPackage.TOGETHER:
				sequence_Together(context, (Together) semanticObject); 
				return; 
			case TExpPackage.TRACE_EXPRESSION:
				sequence_TraceExpression(context, (TraceExpression) semanticObject); 
				return; 
			case TExpPackage.UNION_EXPR:
				sequence_UnionExpr(context, (UnionExpr) semanticObject); 
				return; 
			case TExpPackage.VAR_EXPR:
				sequence_Primary(context, (VarExpr) semanticObject); 
				return; 
			case TExpPackage.VARIABLE_EXPRESSION:
				sequence_Expression0(context, (VariableExpression) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AndExpr returns AndExpr
	 *     AndExpr.AndExpr_1_0 returns AndExpr
	 *
	 * Constraint:
	 *     (left=AndExpr_AndExpr_1_0 operator='/\' right=CatExpr)
	 */
	protected void sequence_AndExpr(ISerializationContext context, AndExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.AND_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.AND_EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.EXPRESSION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.AND_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.AND_EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndExprAccess().getAndExprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndExprAccess().getOperatorSolidusReverseSolidusKeyword_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getAndExprAccess().getRightCatExprParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AndExpr returns CatExpr
	 *     AndExpr.AndExpr_1_0 returns CatExpr
	 *     CatExpr returns CatExpr
	 *     CatExpr.CatExpr_1_0 returns CatExpr
	 *
	 * Constraint:
	 *     (left=CatExpr_CatExpr_1_0 operator='*' right=ShuffleExpr)
	 */
	protected void sequence_CatExpr(ISerializationContext context, CatExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.CAT_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.CAT_EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.EXPRESSION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.CAT_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.CAT_EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCatExprAccess().getCatExprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getCatExprAccess().getOperatorAsteriskKeyword_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getCatExprAccess().getRightShuffleExprParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Channel returns Channel
	 *
	 * Constraint:
	 *     (name=ID reliability=NUMBER)
	 */
	protected void sequence_Channel(ISerializationContext context, Channel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.CHANNEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.CHANNEL__NAME));
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.CHANNEL__RELIABILITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.CHANNEL__RELIABILITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getChannelAccess().getNameIDParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getChannelAccess().getReliabilityNUMBERParserRuleCall_2_0(), semanticObject.getReliability());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Constraint returns Cardinality
	 *
	 * Constraint:
	 *     ((parMin='(' | parMin='[') minCardinality=INT maxCardinality=INT (parMax=')' | parMax=']'))
	 */
	protected void sequence_Constraint(ISerializationContext context, Cardinality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Constraint returns Constraint
	 *
	 * Constraint:
	 *     ((left+=[Role|ID]+ together='-><-' right+=[Role|ID]+) | (left+=[Role|ID]+ split='<-->' right+=[Role|ID]+))
	 */
	protected void sequence_Constraint(ISerializationContext context, Constraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Constraint returns Singletons
	 *
	 * Constraint:
	 *     ((parMin='(' | parMin='[') minSingletons=INT maxSingletons=INT (parMax=')' | parMax=']'))
	 */
	protected void sequence_Constraint(ISerializationContext context, Singletons semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Constraint returns Size
	 *
	 * Constraint:
	 *     ((parMin='(' | parMin='[') minSize=INT maxSize=INT (parMax=')' | parMax=']'))
	 */
	protected void sequence_Constraint(ISerializationContext context, Size semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Domainmodel returns Domainmodel
	 *
	 * Constraint:
	 *     elements+=TraceExpression+
	 */
	protected void sequence_Domainmodel(ISerializationContext context, Domainmodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EventType returns EventType
	 *
	 * Constraint:
	 *     (name=ID (expr=Expression0 exprs+=Expression0*)? msgs+=Msg* channel=[Channel|ID]?)
	 */
	protected void sequence_EventType(ISerializationContext context, EventType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionInfinity returns AtomExpression
	 *     Expression1000xfy returns AtomExpression
	 *     Expression1000xfy.PrologExpression_1_0 returns AtomExpression
	 *     Expression954xfy returns AtomExpression
	 *     Expression954xfy.PrologExpression_1_0 returns AtomExpression
	 *     Expression700xfx returns AtomExpression
	 *     Expression700xfx.PrologExpression_1_0 returns AtomExpression
	 *     Expression600xfy returns AtomExpression
	 *     Expression600xfy.PrologExpression_1_0 returns AtomExpression
	 *     Expression500yfx returns AtomExpression
	 *     Expression500yfx.PrologExpression_1_0 returns AtomExpression
	 *     Expression400yfx returns AtomExpression
	 *     Expression400yfx.PrologExpression_1_0 returns AtomExpression
	 *     Expression200xfx returns AtomExpression
	 *     Expression200xfx.PrologExpression_1_0 returns AtomExpression
	 *     Expression200xfy returns AtomExpression
	 *     Expression200xfy.PrologExpression_1_0 returns AtomExpression
	 *     Expression0 returns AtomExpression
	 *
	 * Constraint:
	 *     (atom=ATOMS terms=ExpressionInfinity?)
	 */
	protected void sequence_Expression0(ISerializationContext context, AtomExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionInfinity returns ListExpression
	 *     Expression1000xfy returns ListExpression
	 *     Expression1000xfy.PrologExpression_1_0 returns ListExpression
	 *     Expression954xfy returns ListExpression
	 *     Expression954xfy.PrologExpression_1_0 returns ListExpression
	 *     Expression700xfx returns ListExpression
	 *     Expression700xfx.PrologExpression_1_0 returns ListExpression
	 *     Expression600xfy returns ListExpression
	 *     Expression600xfy.PrologExpression_1_0 returns ListExpression
	 *     Expression500yfx returns ListExpression
	 *     Expression500yfx.PrologExpression_1_0 returns ListExpression
	 *     Expression400yfx returns ListExpression
	 *     Expression400yfx.PrologExpression_1_0 returns ListExpression
	 *     Expression200xfx returns ListExpression
	 *     Expression200xfx.PrologExpression_1_0 returns ListExpression
	 *     Expression200xfy returns ListExpression
	 *     Expression200xfy.PrologExpression_1_0 returns ListExpression
	 *     Expression0 returns ListExpression
	 *
	 * Constraint:
	 *     (head=ExpressionInfinity tail=ExpressionInfinity?)?
	 */
	protected void sequence_Expression0(ISerializationContext context, ListExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionInfinity returns NumberExpression
	 *     Expression1000xfy returns NumberExpression
	 *     Expression1000xfy.PrologExpression_1_0 returns NumberExpression
	 *     Expression954xfy returns NumberExpression
	 *     Expression954xfy.PrologExpression_1_0 returns NumberExpression
	 *     Expression700xfx returns NumberExpression
	 *     Expression700xfx.PrologExpression_1_0 returns NumberExpression
	 *     Expression600xfy returns NumberExpression
	 *     Expression600xfy.PrologExpression_1_0 returns NumberExpression
	 *     Expression500yfx returns NumberExpression
	 *     Expression500yfx.PrologExpression_1_0 returns NumberExpression
	 *     Expression400yfx returns NumberExpression
	 *     Expression400yfx.PrologExpression_1_0 returns NumberExpression
	 *     Expression200xfx returns NumberExpression
	 *     Expression200xfx.PrologExpression_1_0 returns NumberExpression
	 *     Expression200xfy returns NumberExpression
	 *     Expression200xfy.PrologExpression_1_0 returns NumberExpression
	 *     Expression0 returns NumberExpression
	 *
	 * Constraint:
	 *     value=NUMBER
	 */
	protected void sequence_Expression0(ISerializationContext context, NumberExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.NUMBER_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.NUMBER_EXPRESSION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpression0Access().getValueNUMBERParserRuleCall_3_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionInfinity returns StringExpression
	 *     Expression1000xfy returns StringExpression
	 *     Expression1000xfy.PrologExpression_1_0 returns StringExpression
	 *     Expression954xfy returns StringExpression
	 *     Expression954xfy.PrologExpression_1_0 returns StringExpression
	 *     Expression700xfx returns StringExpression
	 *     Expression700xfx.PrologExpression_1_0 returns StringExpression
	 *     Expression600xfy returns StringExpression
	 *     Expression600xfy.PrologExpression_1_0 returns StringExpression
	 *     Expression500yfx returns StringExpression
	 *     Expression500yfx.PrologExpression_1_0 returns StringExpression
	 *     Expression400yfx returns StringExpression
	 *     Expression400yfx.PrologExpression_1_0 returns StringExpression
	 *     Expression200xfx returns StringExpression
	 *     Expression200xfx.PrologExpression_1_0 returns StringExpression
	 *     Expression200xfy returns StringExpression
	 *     Expression200xfy.PrologExpression_1_0 returns StringExpression
	 *     Expression0 returns StringExpression
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Expression0(ISerializationContext context, StringExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.STRING_EXPRESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.STRING_EXPRESSION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpression0Access().getValueSTRINGTerminalRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionInfinity returns VariableExpression
	 *     Expression1000xfy returns VariableExpression
	 *     Expression1000xfy.PrologExpression_1_0 returns VariableExpression
	 *     Expression954xfy returns VariableExpression
	 *     Expression954xfy.PrologExpression_1_0 returns VariableExpression
	 *     Expression700xfx returns VariableExpression
	 *     Expression700xfx.PrologExpression_1_0 returns VariableExpression
	 *     Expression600xfy returns VariableExpression
	 *     Expression600xfy.PrologExpression_1_0 returns VariableExpression
	 *     Expression500yfx returns VariableExpression
	 *     Expression500yfx.PrologExpression_1_0 returns VariableExpression
	 *     Expression400yfx returns VariableExpression
	 *     Expression400yfx.PrologExpression_1_0 returns VariableExpression
	 *     Expression200xfx returns VariableExpression
	 *     Expression200xfx.PrologExpression_1_0 returns VariableExpression
	 *     Expression200xfy returns VariableExpression
	 *     Expression200xfy.PrologExpression_1_0 returns VariableExpression
	 *     Expression0 returns VariableExpression
	 *
	 * Constraint:
	 *     name=VARIABLE
	 */
	protected void sequence_Expression0(ISerializationContext context, VariableExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.VARIABLE_EXPRESSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.VARIABLE_EXPRESSION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpression0Access().getNameVARIABLETerminalRuleCall_1_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionInfinity returns PrologExpression
	 *     Expression1000xfy returns PrologExpression
	 *     Expression1000xfy.PrologExpression_1_0 returns PrologExpression
	 *     Expression954xfy returns PrologExpression
	 *     Expression954xfy.PrologExpression_1_0 returns PrologExpression
	 *     Expression700xfx returns PrologExpression
	 *     Expression700xfx.PrologExpression_1_0 returns PrologExpression
	 *     Expression600xfy returns PrologExpression
	 *     Expression600xfy.PrologExpression_1_0 returns PrologExpression
	 *     Expression500yfx returns PrologExpression
	 *     Expression500yfx.PrologExpression_1_0 returns PrologExpression
	 *     Expression400yfx returns PrologExpression
	 *     Expression400yfx.PrologExpression_1_0 returns PrologExpression
	 *     Expression200xfx returns PrologExpression
	 *     Expression200xfx.PrologExpression_1_0 returns PrologExpression
	 *     Expression200xfy returns PrologExpression
	 *     Expression200xfy.PrologExpression_1_0 returns PrologExpression
	 *     Expression0 returns PrologExpression
	 *
	 * Constraint:
	 *     (
	 *         (left=Expression1000xfy_PrologExpression_1_0 op=OP1000XFY right=Expression1000xfy) | 
	 *         (left=Expression954xfy_PrologExpression_1_0 op=OP954XFY right=Expression954xfy) | 
	 *         (left=Expression700xfx_PrologExpression_1_0 (op=OP700XFX | op=OP700XFXR | op=OP700XFXL) right=Expression600xfy) | 
	 *         (left=Expression600xfy_PrologExpression_1_0 op=OP600XFY right=Expression600xfy) | 
	 *         (left=Expression500yfx_PrologExpression_1_0 op=OP500YFX right=Expression400yfx) | 
	 *         (left=Expression400yfx_PrologExpression_1_0 op=OP400YFX right=Expression200xfx) | 
	 *         (left=Expression200xfx_PrologExpression_1_0 op=OP200XFX right=Expression200xfy) | 
	 *         (left=Expression200xfy_PrologExpression_1_0 op=OP200XFY right=Expression200xfy)
	 *     )
	 */
	protected void sequence_Expression1000xfy_Expression200xfx_Expression200xfy_Expression400yfx_Expression500yfx_Expression600xfy_Expression700xfx_Expression954xfy(ISerializationContext context, PrologExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FilterExpr returns Expression
	 *
	 * Constraint:
	 *     (typeFilter=[EventType|ID] (first=Expression0 exprs+=Expression0*)? operator=OP400FX1 bodyFilter=Primary)
	 */
	protected void sequence_FilterExpr(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Msg returns Msg
	 *
	 * Constraint:
	 *     (
	 *         ((async_sender=[Role|ID] receiver=[Role|ID]) | (sender=[Role|ID] async_receiver=[Role|ID]) | (sender=[Role|ID] receiver=[Role|ID])) 
	 *         ((performative=ATOM content=Expression0) | content=Expression0) 
	 *         conditions=ExpressionInfinity?
	 *     )
	 */
	protected void sequence_Msg(ISerializationContext context, Msg semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Partition returns Partition
	 *
	 * Constraint:
	 *     constraints+=Together*
	 */
	protected void sequence_Partition(ISerializationContext context, Partition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AndExpr returns FilterExpr
	 *     AndExpr.AndExpr_1_0 returns FilterExpr
	 *     CatExpr returns FilterExpr
	 *     CatExpr.CatExpr_1_0 returns FilterExpr
	 *     ShuffleExpr returns FilterExpr
	 *     ShuffleExpr.ShuffleExpr_1_0 returns FilterExpr
	 *     UnionExpr returns FilterExpr
	 *     UnionExpr.UnionExpr_1_0 returns FilterExpr
	 *     Primary returns FilterExpr
	 *
	 * Constraint:
	 *     filterExpr=FilterExpr
	 */
	protected void sequence_Primary(ISerializationContext context, FilterExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.FILTER_EXPR__FILTER_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.FILTER_EXPR__FILTER_EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getFilterExprFilterExprParserRuleCall_1_1_0(), semanticObject.getFilterExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AndExpr returns SeqExpr
	 *     AndExpr.AndExpr_1_0 returns SeqExpr
	 *     CatExpr returns SeqExpr
	 *     CatExpr.CatExpr_1_0 returns SeqExpr
	 *     ShuffleExpr returns SeqExpr
	 *     ShuffleExpr.ShuffleExpr_1_0 returns SeqExpr
	 *     UnionExpr returns SeqExpr
	 *     UnionExpr.UnionExpr_1_0 returns SeqExpr
	 *     Primary returns SeqExpr
	 *
	 * Constraint:
	 *     seqExpr=SeqExpr
	 */
	protected void sequence_Primary(ISerializationContext context, SeqExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.SEQ_EXPR__SEQ_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.SEQ_EXPR__SEQ_EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getSeqExprSeqExprParserRuleCall_0_1_0(), semanticObject.getSeqExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AndExpr returns TerminalExpr
	 *     AndExpr.AndExpr_1_0 returns TerminalExpr
	 *     CatExpr returns TerminalExpr
	 *     CatExpr.CatExpr_1_0 returns TerminalExpr
	 *     ShuffleExpr returns TerminalExpr
	 *     ShuffleExpr.ShuffleExpr_1_0 returns TerminalExpr
	 *     UnionExpr returns TerminalExpr
	 *     UnionExpr.UnionExpr_1_0 returns TerminalExpr
	 *     Primary returns TerminalExpr
	 *
	 * Constraint:
	 *     terminalExpr=TerminalExpr
	 */
	protected void sequence_Primary(ISerializationContext context, TerminalExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.TERMINAL_EXPR__TERMINAL_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.TERMINAL_EXPR__TERMINAL_EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getTerminalExprTerminalExprParserRuleCall_3_1_0(), semanticObject.getTerminalExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AndExpr returns VarExpr
	 *     AndExpr.AndExpr_1_0 returns VarExpr
	 *     CatExpr returns VarExpr
	 *     CatExpr.CatExpr_1_0 returns VarExpr
	 *     ShuffleExpr returns VarExpr
	 *     ShuffleExpr.ShuffleExpr_1_0 returns VarExpr
	 *     UnionExpr returns VarExpr
	 *     UnionExpr.UnionExpr_1_0 returns VarExpr
	 *     Primary returns VarExpr
	 *
	 * Constraint:
	 *     varExpr=VarExpr
	 */
	protected void sequence_Primary(ISerializationContext context, VarExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.VAR_EXPR__VAR_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.VAR_EXPR__VAR_EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getVarExprVarExprParserRuleCall_2_1_0(), semanticObject.getVarExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Role returns Role
	 *
	 * Constraint:
	 *     (name=ID ((class=VARIABLE | class=ATOM) args+=Argument*)?)
	 */
	protected void sequence_Role(ISerializationContext context, Role semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SeqExpr returns Expression
	 *
	 * Constraint:
	 *     (typeSeq=[EventType|ID] (first=Expression0 exprs+=Expression0*)? operator=OP600XFY bodySeq=Primary)
	 */
	protected void sequence_SeqExpr(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AndExpr returns ShuffleExpr
	 *     AndExpr.AndExpr_1_0 returns ShuffleExpr
	 *     CatExpr returns ShuffleExpr
	 *     CatExpr.CatExpr_1_0 returns ShuffleExpr
	 *     ShuffleExpr returns ShuffleExpr
	 *     ShuffleExpr.ShuffleExpr_1_0 returns ShuffleExpr
	 *
	 * Constraint:
	 *     (left=ShuffleExpr_ShuffleExpr_1_0 operator='|' right=UnionExpr)
	 */
	protected void sequence_ShuffleExpr(ISerializationContext context, ShuffleExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.SHUFFLE_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.SHUFFLE_EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.EXPRESSION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.SHUFFLE_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.SHUFFLE_EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getShuffleExprAccess().getShuffleExprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getShuffleExprAccess().getOperatorVerticalLineKeyword_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getShuffleExprAccess().getRightUnionExprParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Term returns Term
	 *
	 * Constraint:
	 *     (name=ID expr=AndExpr)
	 */
	protected void sequence_Term(ISerializationContext context, Term semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.TERM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.TERM__NAME));
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.TERM__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.TERM__EXPR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTermAccess().getNameIDParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTermAccess().getExprAndExprParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TerminalExpr returns Expression
	 *
	 * Constraint:
	 *     (eps='epsilon' | term=[Term|ID] | expr=AndExpr)
	 */
	protected void sequence_TerminalExpr(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Together returns Together
	 *
	 * Constraint:
	 *     roles+=[Role|ID]+
	 */
	protected void sequence_Together(ISerializationContext context, Together semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TraceExpression returns TraceExpression
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             (bodyL+='body:' terms+=Term+) | 
	 *             (rolesL+='roles:' roles+=Role*) | 
	 *             (typesL+='types:' types+=EventType*) | 
	 *             (modulesL+='modules:' modules+=Module*) | 
	 *             (decentralizedL+='decentralized:' (decentralized+='true' | decentralized+='false')) | 
	 *             (partitionL+='partition:' partition+=Partition) | 
	 *             (constraintsL+='constraints:' constraints+=Constraint*) | 
	 *             (guiL+='gui:' (gui+='true' | gui+='false')) | 
	 *             (minimalL+='minimal:' (minimal+='true' | minimal+='false')) | 
	 *             (thresholdL+='threshold:' threshold+=NUMBER) | 
	 *             (channelsL+='channels:' channels+=Channel+)
	 *         )+
	 *     )
	 */
	protected void sequence_TraceExpression(ISerializationContext context, TraceExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AndExpr returns UnionExpr
	 *     AndExpr.AndExpr_1_0 returns UnionExpr
	 *     CatExpr returns UnionExpr
	 *     CatExpr.CatExpr_1_0 returns UnionExpr
	 *     ShuffleExpr returns UnionExpr
	 *     ShuffleExpr.ShuffleExpr_1_0 returns UnionExpr
	 *     UnionExpr returns UnionExpr
	 *     UnionExpr.UnionExpr_1_0 returns UnionExpr
	 *
	 * Constraint:
	 *     (left=UnionExpr_UnionExpr_1_0 operator='\/' right=Primary)
	 */
	protected void sequence_UnionExpr(ISerializationContext context, UnionExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.UNION_EXPR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.UNION_EXPR__LEFT));
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.EXPRESSION__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.EXPRESSION__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.UNION_EXPR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.UNION_EXPR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUnionExprAccess().getUnionExprLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getUnionExprAccess().getOperatorReverseSolidusSolidusKeyword_1_1_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getUnionExprAccess().getRightPrimaryParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VarExpr returns Expression
	 *
	 * Constraint:
	 *     (variable=VARIABLE bodyVar=Primary)
	 */
	protected void sequence_VarExpr(ISerializationContext context, Expression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.EXPRESSION__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.EXPRESSION__VARIABLE));
			if (transientValues.isValueTransient(semanticObject, TExpPackage.Literals.EXPRESSION__BODY_VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TExpPackage.Literals.EXPRESSION__BODY_VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVarExprAccess().getVariableVARIABLETerminalRuleCall_1_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getVarExprAccess().getBodyVarPrimaryParserRuleCall_3_0(), semanticObject.getBodyVar());
		feeder.finish();
	}
	
	
}
