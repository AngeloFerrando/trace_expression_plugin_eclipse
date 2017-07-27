/*
 * generated by Xtext 2.12.0
 */
package it.unige.dibris.trace_expression_language.ide.contentassist.antlr;

import com.google.inject.Inject;
import it.unige.dibris.trace_expression_language.ide.contentassist.antlr.internal.InternalTExpParser;
import it.unige.dibris.trace_expression_language.services.TExpGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class TExpParser extends AbstractContentAssistParser {

	@Inject
	private TExpGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTExpParser createParser() {
		InternalTExpParser result = new InternalTExpParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getATOMSAccess().getAlternatives(), "rule__ATOMS__Alternatives");
					put(grammarAccess.getNUMBERAccess().getAlternatives_2_1(), "rule__NUMBER__Alternatives_2_1");
					put(grammarAccess.getExpression700xfxAccess().getOpAlternatives_1_1_0(), "rule__Expression700xfx__OpAlternatives_1_1_0");
					put(grammarAccess.getExpression0Access().getAlternatives(), "rule__Expression0__Alternatives");
					put(grammarAccess.getTraceExpressionAccess().getAlternatives_5(), "rule__TraceExpression__Alternatives_5");
					put(grammarAccess.getTraceExpressionAccess().getDecentralizedAlternatives_5_4_1_0(), "rule__TraceExpression__DecentralizedAlternatives_5_4_1_0");
					put(grammarAccess.getTraceExpressionAccess().getGuiAlternatives_5_7_1_0(), "rule__TraceExpression__GuiAlternatives_5_7_1_0");
					put(grammarAccess.getTraceExpressionAccess().getMinimalAlternatives_5_8_1_0(), "rule__TraceExpression__MinimalAlternatives_5_8_1_0");
					put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
					put(grammarAccess.getTerminalExprAccess().getAlternatives(), "rule__TerminalExpr__Alternatives");
					put(grammarAccess.getMsgAccess().getAlternatives_0(), "rule__Msg__Alternatives_0");
					put(grammarAccess.getMsgAccess().getAlternatives_2(), "rule__Msg__Alternatives_2");
					put(grammarAccess.getRoleAccess().getClassAlternatives_1_1_0(), "rule__Role__ClassAlternatives_1_1_0");
					put(grammarAccess.getConstraintAccess().getAlternatives(), "rule__Constraint__Alternatives");
					put(grammarAccess.getConstraintAccess().getParMinAlternatives_2_3_0(), "rule__Constraint__ParMinAlternatives_2_3_0");
					put(grammarAccess.getConstraintAccess().getParMaxAlternatives_2_7_0(), "rule__Constraint__ParMaxAlternatives_2_7_0");
					put(grammarAccess.getConstraintAccess().getParMinAlternatives_3_3_0(), "rule__Constraint__ParMinAlternatives_3_3_0");
					put(grammarAccess.getConstraintAccess().getParMaxAlternatives_3_7_0(), "rule__Constraint__ParMaxAlternatives_3_7_0");
					put(grammarAccess.getConstraintAccess().getParMinAlternatives_4_3_0(), "rule__Constraint__ParMinAlternatives_4_3_0");
					put(grammarAccess.getConstraintAccess().getParMaxAlternatives_4_7_0(), "rule__Constraint__ParMaxAlternatives_4_7_0");
					put(grammarAccess.getModuleAccess().getAlternatives(), "rule__Module__Alternatives");
					put(grammarAccess.getNUMBERAccess().getGroup(), "rule__NUMBER__Group__0");
					put(grammarAccess.getNUMBERAccess().getGroup_2(), "rule__NUMBER__Group_2__0");
					put(grammarAccess.getExpression1000xfyAccess().getGroup(), "rule__Expression1000xfy__Group__0");
					put(grammarAccess.getExpression1000xfyAccess().getGroup_1(), "rule__Expression1000xfy__Group_1__0");
					put(grammarAccess.getExpression954xfyAccess().getGroup(), "rule__Expression954xfy__Group__0");
					put(grammarAccess.getExpression954xfyAccess().getGroup_1(), "rule__Expression954xfy__Group_1__0");
					put(grammarAccess.getExpression700xfxAccess().getGroup(), "rule__Expression700xfx__Group__0");
					put(grammarAccess.getExpression700xfxAccess().getGroup_1(), "rule__Expression700xfx__Group_1__0");
					put(grammarAccess.getExpression600xfyAccess().getGroup(), "rule__Expression600xfy__Group__0");
					put(grammarAccess.getExpression600xfyAccess().getGroup_1(), "rule__Expression600xfy__Group_1__0");
					put(grammarAccess.getExpression500yfxAccess().getGroup(), "rule__Expression500yfx__Group__0");
					put(grammarAccess.getExpression500yfxAccess().getGroup_1(), "rule__Expression500yfx__Group_1__0");
					put(grammarAccess.getExpression400yfxAccess().getGroup(), "rule__Expression400yfx__Group__0");
					put(grammarAccess.getExpression400yfxAccess().getGroup_1(), "rule__Expression400yfx__Group_1__0");
					put(grammarAccess.getExpression200xfxAccess().getGroup(), "rule__Expression200xfx__Group__0");
					put(grammarAccess.getExpression200xfxAccess().getGroup_1(), "rule__Expression200xfx__Group_1__0");
					put(grammarAccess.getExpression200xfyAccess().getGroup(), "rule__Expression200xfy__Group__0");
					put(grammarAccess.getExpression200xfyAccess().getGroup_1(), "rule__Expression200xfy__Group_1__0");
					put(grammarAccess.getExpression0Access().getGroup_0(), "rule__Expression0__Group_0__0");
					put(grammarAccess.getExpression0Access().getGroup_0_2(), "rule__Expression0__Group_0_2__0");
					put(grammarAccess.getExpression0Access().getGroup_1(), "rule__Expression0__Group_1__0");
					put(grammarAccess.getExpression0Access().getGroup_2(), "rule__Expression0__Group_2__0");
					put(grammarAccess.getExpression0Access().getGroup_3(), "rule__Expression0__Group_3__0");
					put(grammarAccess.getExpression0Access().getGroup_4(), "rule__Expression0__Group_4__0");
					put(grammarAccess.getExpression0Access().getGroup_4_2(), "rule__Expression0__Group_4_2__0");
					put(grammarAccess.getExpression0Access().getGroup_4_2_1(), "rule__Expression0__Group_4_2_1__0");
					put(grammarAccess.getExpression0Access().getGroup_5(), "rule__Expression0__Group_5__0");
					put(grammarAccess.getTraceExpressionAccess().getGroup(), "rule__TraceExpression__Group__0");
					put(grammarAccess.getTraceExpressionAccess().getGroup_5_0(), "rule__TraceExpression__Group_5_0__0");
					put(grammarAccess.getTraceExpressionAccess().getGroup_5_1(), "rule__TraceExpression__Group_5_1__0");
					put(grammarAccess.getTraceExpressionAccess().getGroup_5_1_1(), "rule__TraceExpression__Group_5_1_1__0");
					put(grammarAccess.getTraceExpressionAccess().getGroup_5_2(), "rule__TraceExpression__Group_5_2__0");
					put(grammarAccess.getTraceExpressionAccess().getGroup_5_3(), "rule__TraceExpression__Group_5_3__0");
					put(grammarAccess.getTraceExpressionAccess().getGroup_5_4(), "rule__TraceExpression__Group_5_4__0");
					put(grammarAccess.getTraceExpressionAccess().getGroup_5_5(), "rule__TraceExpression__Group_5_5__0");
					put(grammarAccess.getTraceExpressionAccess().getGroup_5_6(), "rule__TraceExpression__Group_5_6__0");
					put(grammarAccess.getTraceExpressionAccess().getGroup_5_7(), "rule__TraceExpression__Group_5_7__0");
					put(grammarAccess.getTraceExpressionAccess().getGroup_5_8(), "rule__TraceExpression__Group_5_8__0");
					put(grammarAccess.getTraceExpressionAccess().getGroup_5_9(), "rule__TraceExpression__Group_5_9__0");
					put(grammarAccess.getTraceExpressionAccess().getGroup_5_10(), "rule__TraceExpression__Group_5_10__0");
					put(grammarAccess.getTermAccess().getGroup(), "rule__Term__Group__0");
					put(grammarAccess.getShuffleExprAccess().getGroup(), "rule__ShuffleExpr__Group__0");
					put(grammarAccess.getShuffleExprAccess().getGroup_1(), "rule__ShuffleExpr__Group_1__0");
					put(grammarAccess.getUnionExprAccess().getGroup(), "rule__UnionExpr__Group__0");
					put(grammarAccess.getUnionExprAccess().getGroup_1(), "rule__UnionExpr__Group_1__0");
					put(grammarAccess.getAndExprAccess().getGroup(), "rule__AndExpr__Group__0");
					put(grammarAccess.getAndExprAccess().getGroup_1(), "rule__AndExpr__Group_1__0");
					put(grammarAccess.getCatExprAccess().getGroup(), "rule__CatExpr__Group__0");
					put(grammarAccess.getCatExprAccess().getGroup_1(), "rule__CatExpr__Group_1__0");
					put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
					put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
					put(grammarAccess.getPrimaryAccess().getGroup_2(), "rule__Primary__Group_2__0");
					put(grammarAccess.getPrimaryAccess().getGroup_3(), "rule__Primary__Group_3__0");
					put(grammarAccess.getVarExprAccess().getGroup(), "rule__VarExpr__Group__0");
					put(grammarAccess.getFilterExprAccess().getGroup(), "rule__FilterExpr__Group__0");
					put(grammarAccess.getFilterExprAccess().getGroup_1(), "rule__FilterExpr__Group_1__0");
					put(grammarAccess.getFilterExprAccess().getGroup_1_2(), "rule__FilterExpr__Group_1_2__0");
					put(grammarAccess.getSeqExprAccess().getGroup(), "rule__SeqExpr__Group__0");
					put(grammarAccess.getSeqExprAccess().getGroup_1(), "rule__SeqExpr__Group_1__0");
					put(grammarAccess.getSeqExprAccess().getGroup_1_2(), "rule__SeqExpr__Group_1_2__0");
					put(grammarAccess.getTerminalExprAccess().getGroup_2(), "rule__TerminalExpr__Group_2__0");
					put(grammarAccess.getEventTypeAccess().getGroup(), "rule__EventType__Group__0");
					put(grammarAccess.getEventTypeAccess().getGroup_1(), "rule__EventType__Group_1__0");
					put(grammarAccess.getEventTypeAccess().getGroup_1_2(), "rule__EventType__Group_1_2__0");
					put(grammarAccess.getEventTypeAccess().getGroup_6(), "rule__EventType__Group_6__0");
					put(grammarAccess.getMsgAccess().getGroup(), "rule__Msg__Group__0");
					put(grammarAccess.getMsgAccess().getGroup_0_0(), "rule__Msg__Group_0_0__0");
					put(grammarAccess.getMsgAccess().getGroup_0_1(), "rule__Msg__Group_0_1__0");
					put(grammarAccess.getMsgAccess().getGroup_0_2(), "rule__Msg__Group_0_2__0");
					put(grammarAccess.getMsgAccess().getGroup_2_0(), "rule__Msg__Group_2_0__0");
					put(grammarAccess.getMsgAccess().getGroup_3(), "rule__Msg__Group_3__0");
					put(grammarAccess.getChannelAccess().getGroup(), "rule__Channel__Group__0");
					put(grammarAccess.getChannelAccess().getGroup_1(), "rule__Channel__Group_1__0");
					put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
					put(grammarAccess.getRoleAccess().getGroup_1(), "rule__Role__Group_1__0");
					put(grammarAccess.getRoleAccess().getGroup_1_2(), "rule__Role__Group_1_2__0");
					put(grammarAccess.getRoleAccess().getGroup_1_2_1(), "rule__Role__Group_1_2_1__0");
					put(grammarAccess.getPartitionAccess().getGroup(), "rule__Partition__Group__0");
					put(grammarAccess.getPartitionAccess().getGroup_2(), "rule__Partition__Group_2__0");
					put(grammarAccess.getTogetherAccess().getGroup(), "rule__Together__Group__0");
					put(grammarAccess.getTogetherAccess().getGroup_2(), "rule__Together__Group_2__0");
					put(grammarAccess.getConstraintAccess().getGroup_0(), "rule__Constraint__Group_0__0");
					put(grammarAccess.getConstraintAccess().getGroup_1(), "rule__Constraint__Group_1__0");
					put(grammarAccess.getConstraintAccess().getGroup_2(), "rule__Constraint__Group_2__0");
					put(grammarAccess.getConstraintAccess().getGroup_3(), "rule__Constraint__Group_3__0");
					put(grammarAccess.getConstraintAccess().getGroup_4(), "rule__Constraint__Group_4__0");
					put(grammarAccess.getDomainmodelAccess().getElementsAssignment(), "rule__Domainmodel__ElementsAssignment");
					put(grammarAccess.getExpression1000xfyAccess().getOpAssignment_1_1(), "rule__Expression1000xfy__OpAssignment_1_1");
					put(grammarAccess.getExpression1000xfyAccess().getRightAssignment_1_2(), "rule__Expression1000xfy__RightAssignment_1_2");
					put(grammarAccess.getExpression954xfyAccess().getOpAssignment_1_1(), "rule__Expression954xfy__OpAssignment_1_1");
					put(grammarAccess.getExpression954xfyAccess().getRightAssignment_1_2(), "rule__Expression954xfy__RightAssignment_1_2");
					put(grammarAccess.getExpression700xfxAccess().getOpAssignment_1_1(), "rule__Expression700xfx__OpAssignment_1_1");
					put(grammarAccess.getExpression700xfxAccess().getRightAssignment_1_2(), "rule__Expression700xfx__RightAssignment_1_2");
					put(grammarAccess.getExpression600xfyAccess().getOpAssignment_1_1(), "rule__Expression600xfy__OpAssignment_1_1");
					put(grammarAccess.getExpression600xfyAccess().getRightAssignment_1_2(), "rule__Expression600xfy__RightAssignment_1_2");
					put(grammarAccess.getExpression500yfxAccess().getOpAssignment_1_1(), "rule__Expression500yfx__OpAssignment_1_1");
					put(grammarAccess.getExpression500yfxAccess().getRightAssignment_1_2(), "rule__Expression500yfx__RightAssignment_1_2");
					put(grammarAccess.getExpression400yfxAccess().getOpAssignment_1_1(), "rule__Expression400yfx__OpAssignment_1_1");
					put(grammarAccess.getExpression400yfxAccess().getRightAssignment_1_2(), "rule__Expression400yfx__RightAssignment_1_2");
					put(grammarAccess.getExpression200xfxAccess().getOpAssignment_1_1(), "rule__Expression200xfx__OpAssignment_1_1");
					put(grammarAccess.getExpression200xfxAccess().getRightAssignment_1_2(), "rule__Expression200xfx__RightAssignment_1_2");
					put(grammarAccess.getExpression200xfyAccess().getOpAssignment_1_1(), "rule__Expression200xfy__OpAssignment_1_1");
					put(grammarAccess.getExpression200xfyAccess().getRightAssignment_1_2(), "rule__Expression200xfy__RightAssignment_1_2");
					put(grammarAccess.getExpression0Access().getAtomAssignment_0_1(), "rule__Expression0__AtomAssignment_0_1");
					put(grammarAccess.getExpression0Access().getTermsAssignment_0_2_1(), "rule__Expression0__TermsAssignment_0_2_1");
					put(grammarAccess.getExpression0Access().getNameAssignment_1_1(), "rule__Expression0__NameAssignment_1_1");
					put(grammarAccess.getExpression0Access().getValueAssignment_2_1(), "rule__Expression0__ValueAssignment_2_1");
					put(grammarAccess.getExpression0Access().getValueAssignment_3_1(), "rule__Expression0__ValueAssignment_3_1");
					put(grammarAccess.getExpression0Access().getHeadAssignment_4_2_0(), "rule__Expression0__HeadAssignment_4_2_0");
					put(grammarAccess.getExpression0Access().getTailAssignment_4_2_1_1(), "rule__Expression0__TailAssignment_4_2_1_1");
					put(grammarAccess.getTraceExpressionAccess().getNameAssignment_4(), "rule__TraceExpression__NameAssignment_4");
					put(grammarAccess.getTraceExpressionAccess().getBodyLAssignment_5_0_0(), "rule__TraceExpression__BodyLAssignment_5_0_0");
					put(grammarAccess.getTraceExpressionAccess().getTermsAssignment_5_0_1(), "rule__TraceExpression__TermsAssignment_5_0_1");
					put(grammarAccess.getTraceExpressionAccess().getRolesLAssignment_5_1_0(), "rule__TraceExpression__RolesLAssignment_5_1_0");
					put(grammarAccess.getTraceExpressionAccess().getRolesAssignment_5_1_1_0(), "rule__TraceExpression__RolesAssignment_5_1_1_0");
					put(grammarAccess.getTraceExpressionAccess().getTypesLAssignment_5_2_0(), "rule__TraceExpression__TypesLAssignment_5_2_0");
					put(grammarAccess.getTraceExpressionAccess().getTypesAssignment_5_2_1(), "rule__TraceExpression__TypesAssignment_5_2_1");
					put(grammarAccess.getTraceExpressionAccess().getModulesLAssignment_5_3_0(), "rule__TraceExpression__ModulesLAssignment_5_3_0");
					put(grammarAccess.getTraceExpressionAccess().getModulesAssignment_5_3_1(), "rule__TraceExpression__ModulesAssignment_5_3_1");
					put(grammarAccess.getTraceExpressionAccess().getDecentralizedLAssignment_5_4_0(), "rule__TraceExpression__DecentralizedLAssignment_5_4_0");
					put(grammarAccess.getTraceExpressionAccess().getDecentralizedAssignment_5_4_1(), "rule__TraceExpression__DecentralizedAssignment_5_4_1");
					put(grammarAccess.getTraceExpressionAccess().getPartitionLAssignment_5_5_0(), "rule__TraceExpression__PartitionLAssignment_5_5_0");
					put(grammarAccess.getTraceExpressionAccess().getPartitionAssignment_5_5_1(), "rule__TraceExpression__PartitionAssignment_5_5_1");
					put(grammarAccess.getTraceExpressionAccess().getConstraintsLAssignment_5_6_0(), "rule__TraceExpression__ConstraintsLAssignment_5_6_0");
					put(grammarAccess.getTraceExpressionAccess().getConstraintsAssignment_5_6_1(), "rule__TraceExpression__ConstraintsAssignment_5_6_1");
					put(grammarAccess.getTraceExpressionAccess().getGuiLAssignment_5_7_0(), "rule__TraceExpression__GuiLAssignment_5_7_0");
					put(grammarAccess.getTraceExpressionAccess().getGuiAssignment_5_7_1(), "rule__TraceExpression__GuiAssignment_5_7_1");
					put(grammarAccess.getTraceExpressionAccess().getMinimalLAssignment_5_8_0(), "rule__TraceExpression__MinimalLAssignment_5_8_0");
					put(grammarAccess.getTraceExpressionAccess().getMinimalAssignment_5_8_1(), "rule__TraceExpression__MinimalAssignment_5_8_1");
					put(grammarAccess.getTraceExpressionAccess().getThresholdLAssignment_5_9_0(), "rule__TraceExpression__ThresholdLAssignment_5_9_0");
					put(grammarAccess.getTraceExpressionAccess().getThresholdAssignment_5_9_1(), "rule__TraceExpression__ThresholdAssignment_5_9_1");
					put(grammarAccess.getTraceExpressionAccess().getChannelsLAssignment_5_10_0(), "rule__TraceExpression__ChannelsLAssignment_5_10_0");
					put(grammarAccess.getTraceExpressionAccess().getChannelsAssignment_5_10_1(), "rule__TraceExpression__ChannelsAssignment_5_10_1");
					put(grammarAccess.getTermAccess().getNameAssignment_0(), "rule__Term__NameAssignment_0");
					put(grammarAccess.getTermAccess().getExprAssignment_2(), "rule__Term__ExprAssignment_2");
					put(grammarAccess.getShuffleExprAccess().getOperatorAssignment_1_1(), "rule__ShuffleExpr__OperatorAssignment_1_1");
					put(grammarAccess.getShuffleExprAccess().getRightAssignment_1_2(), "rule__ShuffleExpr__RightAssignment_1_2");
					put(grammarAccess.getUnionExprAccess().getOperatorAssignment_1_1(), "rule__UnionExpr__OperatorAssignment_1_1");
					put(grammarAccess.getUnionExprAccess().getRightAssignment_1_2(), "rule__UnionExpr__RightAssignment_1_2");
					put(grammarAccess.getAndExprAccess().getOperatorAssignment_1_1(), "rule__AndExpr__OperatorAssignment_1_1");
					put(grammarAccess.getAndExprAccess().getRightAssignment_1_2(), "rule__AndExpr__RightAssignment_1_2");
					put(grammarAccess.getCatExprAccess().getOperatorAssignment_1_1(), "rule__CatExpr__OperatorAssignment_1_1");
					put(grammarAccess.getCatExprAccess().getRightAssignment_1_2(), "rule__CatExpr__RightAssignment_1_2");
					put(grammarAccess.getPrimaryAccess().getSeqExprAssignment_0_1(), "rule__Primary__SeqExprAssignment_0_1");
					put(grammarAccess.getPrimaryAccess().getFilterExprAssignment_1_1(), "rule__Primary__FilterExprAssignment_1_1");
					put(grammarAccess.getPrimaryAccess().getVarExprAssignment_2_1(), "rule__Primary__VarExprAssignment_2_1");
					put(grammarAccess.getPrimaryAccess().getTerminalExprAssignment_3_1(), "rule__Primary__TerminalExprAssignment_3_1");
					put(grammarAccess.getVarExprAccess().getVariableAssignment_1(), "rule__VarExpr__VariableAssignment_1");
					put(grammarAccess.getVarExprAccess().getBodyVarAssignment_3(), "rule__VarExpr__BodyVarAssignment_3");
					put(grammarAccess.getFilterExprAccess().getTypeFilterAssignment_0(), "rule__FilterExpr__TypeFilterAssignment_0");
					put(grammarAccess.getFilterExprAccess().getFirstAssignment_1_1(), "rule__FilterExpr__FirstAssignment_1_1");
					put(grammarAccess.getFilterExprAccess().getExprsAssignment_1_2_1(), "rule__FilterExpr__ExprsAssignment_1_2_1");
					put(grammarAccess.getFilterExprAccess().getOperatorAssignment_2(), "rule__FilterExpr__OperatorAssignment_2");
					put(grammarAccess.getFilterExprAccess().getBodyFilterAssignment_3(), "rule__FilterExpr__BodyFilterAssignment_3");
					put(grammarAccess.getSeqExprAccess().getTypeSeqAssignment_0(), "rule__SeqExpr__TypeSeqAssignment_0");
					put(grammarAccess.getSeqExprAccess().getFirstAssignment_1_1(), "rule__SeqExpr__FirstAssignment_1_1");
					put(grammarAccess.getSeqExprAccess().getExprsAssignment_1_2_1(), "rule__SeqExpr__ExprsAssignment_1_2_1");
					put(grammarAccess.getSeqExprAccess().getOperatorAssignment_2(), "rule__SeqExpr__OperatorAssignment_2");
					put(grammarAccess.getSeqExprAccess().getBodySeqAssignment_3(), "rule__SeqExpr__BodySeqAssignment_3");
					put(grammarAccess.getTerminalExprAccess().getEpsAssignment_0(), "rule__TerminalExpr__EpsAssignment_0");
					put(grammarAccess.getTerminalExprAccess().getTermAssignment_1(), "rule__TerminalExpr__TermAssignment_1");
					put(grammarAccess.getTerminalExprAccess().getExprAssignment_2_1(), "rule__TerminalExpr__ExprAssignment_2_1");
					put(grammarAccess.getEventTypeAccess().getNameAssignment_0(), "rule__EventType__NameAssignment_0");
					put(grammarAccess.getEventTypeAccess().getExprAssignment_1_1(), "rule__EventType__ExprAssignment_1_1");
					put(grammarAccess.getEventTypeAccess().getExprsAssignment_1_2_1(), "rule__EventType__ExprsAssignment_1_2_1");
					put(grammarAccess.getEventTypeAccess().getMsgsAssignment_4(), "rule__EventType__MsgsAssignment_4");
					put(grammarAccess.getEventTypeAccess().getChannelAssignment_6_1(), "rule__EventType__ChannelAssignment_6_1");
					put(grammarAccess.getMsgAccess().getAsync_senderAssignment_0_0_1(), "rule__Msg__Async_senderAssignment_0_0_1");
					put(grammarAccess.getMsgAccess().getReceiverAssignment_0_0_4(), "rule__Msg__ReceiverAssignment_0_0_4");
					put(grammarAccess.getMsgAccess().getSenderAssignment_0_1_0(), "rule__Msg__SenderAssignment_0_1_0");
					put(grammarAccess.getMsgAccess().getAsync_receiverAssignment_0_1_3(), "rule__Msg__Async_receiverAssignment_0_1_3");
					put(grammarAccess.getMsgAccess().getSenderAssignment_0_2_0(), "rule__Msg__SenderAssignment_0_2_0");
					put(grammarAccess.getMsgAccess().getReceiverAssignment_0_2_2(), "rule__Msg__ReceiverAssignment_0_2_2");
					put(grammarAccess.getMsgAccess().getPerformativeAssignment_2_0_0(), "rule__Msg__PerformativeAssignment_2_0_0");
					put(grammarAccess.getMsgAccess().getContentAssignment_2_0_2(), "rule__Msg__ContentAssignment_2_0_2");
					put(grammarAccess.getMsgAccess().getContentAssignment_2_1(), "rule__Msg__ContentAssignment_2_1");
					put(grammarAccess.getMsgAccess().getConditionsAssignment_3_1(), "rule__Msg__ConditionsAssignment_3_1");
					put(grammarAccess.getChannelAccess().getNameAssignment_0(), "rule__Channel__NameAssignment_0");
					put(grammarAccess.getChannelAccess().getReliabilityAssignment_1_1(), "rule__Channel__ReliabilityAssignment_1_1");
					put(grammarAccess.getRoleAccess().getNameAssignment_0(), "rule__Role__NameAssignment_0");
					put(grammarAccess.getRoleAccess().getClassAssignment_1_1(), "rule__Role__ClassAssignment_1_1");
					put(grammarAccess.getRoleAccess().getArgsAssignment_1_2_1_0(), "rule__Role__ArgsAssignment_1_2_1_0");
					put(grammarAccess.getPartitionAccess().getConstraintsAssignment_2_0(), "rule__Partition__ConstraintsAssignment_2_0");
					put(grammarAccess.getTogetherAccess().getRolesAssignment_2_0(), "rule__Together__RolesAssignment_2_0");
					put(grammarAccess.getConstraintAccess().getLeftAssignment_0_1(), "rule__Constraint__LeftAssignment_0_1");
					put(grammarAccess.getConstraintAccess().getTogetherAssignment_0_3(), "rule__Constraint__TogetherAssignment_0_3");
					put(grammarAccess.getConstraintAccess().getRightAssignment_0_5(), "rule__Constraint__RightAssignment_0_5");
					put(grammarAccess.getConstraintAccess().getLeftAssignment_1_1(), "rule__Constraint__LeftAssignment_1_1");
					put(grammarAccess.getConstraintAccess().getSplitAssignment_1_3(), "rule__Constraint__SplitAssignment_1_3");
					put(grammarAccess.getConstraintAccess().getRightAssignment_1_5(), "rule__Constraint__RightAssignment_1_5");
					put(grammarAccess.getConstraintAccess().getParMinAssignment_2_3(), "rule__Constraint__ParMinAssignment_2_3");
					put(grammarAccess.getConstraintAccess().getMinSingletonsAssignment_2_4(), "rule__Constraint__MinSingletonsAssignment_2_4");
					put(grammarAccess.getConstraintAccess().getMaxSingletonsAssignment_2_6(), "rule__Constraint__MaxSingletonsAssignment_2_6");
					put(grammarAccess.getConstraintAccess().getParMaxAssignment_2_7(), "rule__Constraint__ParMaxAssignment_2_7");
					put(grammarAccess.getConstraintAccess().getParMinAssignment_3_3(), "rule__Constraint__ParMinAssignment_3_3");
					put(grammarAccess.getConstraintAccess().getMinSizeAssignment_3_4(), "rule__Constraint__MinSizeAssignment_3_4");
					put(grammarAccess.getConstraintAccess().getMaxSizeAssignment_3_6(), "rule__Constraint__MaxSizeAssignment_3_6");
					put(grammarAccess.getConstraintAccess().getParMaxAssignment_3_7(), "rule__Constraint__ParMaxAssignment_3_7");
					put(grammarAccess.getConstraintAccess().getParMinAssignment_4_3(), "rule__Constraint__ParMinAssignment_4_3");
					put(grammarAccess.getConstraintAccess().getMinCardinalityAssignment_4_4(), "rule__Constraint__MinCardinalityAssignment_4_4");
					put(grammarAccess.getConstraintAccess().getMaxCardinalityAssignment_4_6(), "rule__Constraint__MaxCardinalityAssignment_4_6");
					put(grammarAccess.getConstraintAccess().getParMaxAssignment_4_7(), "rule__Constraint__ParMaxAssignment_4_7");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WHITESPACE", "RULE_SINGLE_LINE_COMMENT" };
	}

	public TExpGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TExpGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
