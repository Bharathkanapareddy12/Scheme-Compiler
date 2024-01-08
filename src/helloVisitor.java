// Generated from hello.g4 by ANTLR 4.10.1

	import ast.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link helloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface helloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link helloParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(helloParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#srcexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSrcexpression(helloParser.SrcexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(helloParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#print_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_expression(helloParser.Print_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(helloParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(helloParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(helloParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expression(helloParser.Assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#define_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_expression(helloParser.Define_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#list_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_expression(helloParser.List_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#list_contents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_contents(helloParser.List_contentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#vector_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_expression(helloParser.Vector_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#vector_contents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector_contents(helloParser.Vector_contentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#set_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_expression(helloParser.Set_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#set_contents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_contents(helloParser.Set_contentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#dict_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict_expression(helloParser.Dict_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#dictcommapair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictcommapair(helloParser.DictcommapairContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(helloParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(helloParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#lambda_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_expression(helloParser.Lambda_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_list(helloParser.Id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#filter_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_expression(helloParser.Filter_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#tolambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTolambda(helloParser.TolambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#list_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_exp(helloParser.List_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(helloParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(helloParser.IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#do_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_expression(helloParser.Do_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#condExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpression(helloParser.CondExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#condClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondClauses(helloParser.CondClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#condClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondClause(helloParser.CondClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(helloParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#caseClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClauses(helloParser.CaseClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#caseClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseClause(helloParser.CaseClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(helloParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(helloParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#id_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_expression(helloParser.Id_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#datum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatum(helloParser.DatumContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(helloParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(helloParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(helloParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link helloParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(helloParser.KeywordContext ctx);
}