// Generated from Expr.g4 by ANTLR 4.7
package common.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(ExprParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(ExprParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(ExprParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(ExprParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(ExprParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(ExprParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rule}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(ExprParser.RuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(ExprParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(ExprParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(ExprParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dollar}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDollar(ExprParser.DollarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RuleOpe}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleOpe(ExprParser.RuleOpeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code truefalse}
	 * labeled alternative in {@link ExprParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruefalse(ExprParser.TruefalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asto}
	 * labeled alternative in {@link ExprParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsto(ExprParser.AstoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andor}
	 * labeled alternative in {@link ExprParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndor(ExprParser.AndorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opcond}
	 * labeled alternative in {@link ExprParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcond(ExprParser.OpcondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const}
	 * labeled alternative in {@link ExprParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(ExprParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code depends}
	 * labeled alternative in {@link ExprParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepends(ExprParser.DependsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equality}
	 * labeled alternative in {@link ExprParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(ExprParser.EqualityContext ctx);
}