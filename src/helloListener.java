// Generated from hello.g4 by ANTLR 4.10.1

	import ast.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link helloParser}.
 */
public interface helloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link helloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(helloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(helloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#srcexpression}.
	 * @param ctx the parse tree
	 */
	void enterSrcexpression(helloParser.SrcexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#srcexpression}.
	 * @param ctx the parse tree
	 */
	void exitSrcexpression(helloParser.SrcexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(helloParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(helloParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#print_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrint_expression(helloParser.Print_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#print_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrint_expression(helloParser.Print_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(helloParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(helloParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(helloParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(helloParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(helloParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(helloParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(helloParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(helloParser.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#define_expression}.
	 * @param ctx the parse tree
	 */
	void enterDefine_expression(helloParser.Define_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#define_expression}.
	 * @param ctx the parse tree
	 */
	void exitDefine_expression(helloParser.Define_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#list_expression}.
	 * @param ctx the parse tree
	 */
	void enterList_expression(helloParser.List_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#list_expression}.
	 * @param ctx the parse tree
	 */
	void exitList_expression(helloParser.List_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#list_contents}.
	 * @param ctx the parse tree
	 */
	void enterList_contents(helloParser.List_contentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#list_contents}.
	 * @param ctx the parse tree
	 */
	void exitList_contents(helloParser.List_contentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#vector_expression}.
	 * @param ctx the parse tree
	 */
	void enterVector_expression(helloParser.Vector_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#vector_expression}.
	 * @param ctx the parse tree
	 */
	void exitVector_expression(helloParser.Vector_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#vector_contents}.
	 * @param ctx the parse tree
	 */
	void enterVector_contents(helloParser.Vector_contentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#vector_contents}.
	 * @param ctx the parse tree
	 */
	void exitVector_contents(helloParser.Vector_contentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#set_expression}.
	 * @param ctx the parse tree
	 */
	void enterSet_expression(helloParser.Set_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#set_expression}.
	 * @param ctx the parse tree
	 */
	void exitSet_expression(helloParser.Set_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#set_contents}.
	 * @param ctx the parse tree
	 */
	void enterSet_contents(helloParser.Set_contentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#set_contents}.
	 * @param ctx the parse tree
	 */
	void exitSet_contents(helloParser.Set_contentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#dict_expression}.
	 * @param ctx the parse tree
	 */
	void enterDict_expression(helloParser.Dict_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#dict_expression}.
	 * @param ctx the parse tree
	 */
	void exitDict_expression(helloParser.Dict_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#dictcommapair}.
	 * @param ctx the parse tree
	 */
	void enterDictcommapair(helloParser.DictcommapairContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#dictcommapair}.
	 * @param ctx the parse tree
	 */
	void exitDictcommapair(helloParser.DictcommapairContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(helloParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(helloParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(helloParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(helloParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void enterLambda_expression(helloParser.Lambda_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void exitLambda_expression(helloParser.Lambda_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(helloParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(helloParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#filter_expression}.
	 * @param ctx the parse tree
	 */
	void enterFilter_expression(helloParser.Filter_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#filter_expression}.
	 * @param ctx the parse tree
	 */
	void exitFilter_expression(helloParser.Filter_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#tolambda}.
	 * @param ctx the parse tree
	 */
	void enterTolambda(helloParser.TolambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#tolambda}.
	 * @param ctx the parse tree
	 */
	void exitTolambda(helloParser.TolambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#list_exp}.
	 * @param ctx the parse tree
	 */
	void enterList_exp(helloParser.List_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#list_exp}.
	 * @param ctx the parse tree
	 */
	void exitList_exp(helloParser.List_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(helloParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(helloParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(helloParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(helloParser.IfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#macroexp}.
	 * @param ctx the parse tree
	 */
	void enterMacroexp(helloParser.MacroexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#macroexp}.
	 * @param ctx the parse tree
	 */
	void exitMacroexp(helloParser.MacroexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#syntax_rules}.
	 * @param ctx the parse tree
	 */
	void enterSyntax_rules(helloParser.Syntax_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#syntax_rules}.
	 * @param ctx the parse tree
	 */
	void exitSyntax_rules(helloParser.Syntax_rulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#syntax_rule}.
	 * @param ctx the parse tree
	 */
	void enterSyntax_rule(helloParser.Syntax_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#syntax_rule}.
	 * @param ctx the parse tree
	 */
	void exitSyntax_rule(helloParser.Syntax_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#do_expression}.
	 * @param ctx the parse tree
	 */
	void enterDo_expression(helloParser.Do_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#do_expression}.
	 * @param ctx the parse tree
	 */
	void exitDo_expression(helloParser.Do_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#condExpression}.
	 * @param ctx the parse tree
	 */
	void enterCondExpression(helloParser.CondExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#condExpression}.
	 * @param ctx the parse tree
	 */
	void exitCondExpression(helloParser.CondExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#condClauses}.
	 * @param ctx the parse tree
	 */
	void enterCondClauses(helloParser.CondClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#condClauses}.
	 * @param ctx the parse tree
	 */
	void exitCondClauses(helloParser.CondClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#condClause}.
	 * @param ctx the parse tree
	 */
	void enterCondClause(helloParser.CondClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#condClause}.
	 * @param ctx the parse tree
	 */
	void exitCondClause(helloParser.CondClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(helloParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(helloParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void enterCaseClauses(helloParser.CaseClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void exitCaseClauses(helloParser.CaseClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(helloParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(helloParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(helloParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(helloParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(helloParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(helloParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#id_expression}.
	 * @param ctx the parse tree
	 */
	void enterId_expression(helloParser.Id_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#id_expression}.
	 * @param ctx the parse tree
	 */
	void exitId_expression(helloParser.Id_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#datum}.
	 * @param ctx the parse tree
	 */
	void enterDatum(helloParser.DatumContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#datum}.
	 * @param ctx the parse tree
	 */
	void exitDatum(helloParser.DatumContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(helloParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(helloParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(helloParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(helloParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(helloParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(helloParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link helloParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(helloParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link helloParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(helloParser.KeywordContext ctx);
}