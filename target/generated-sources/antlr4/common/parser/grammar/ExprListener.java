// Generated from Expr.g4 by ANTLR 4.4
package common.parser.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code opcond}
	 * labeled alternative in {@link ExprParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterOpcond(@NotNull ExprParser.OpcondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opcond}
	 * labeled alternative in {@link ExprParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitOpcond(@NotNull ExprParser.OpcondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull ExprParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull ExprParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(@NotNull ExprParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(@NotNull ExprParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const}
	 * labeled alternative in {@link ExprParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterConst(@NotNull ExprParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const}
	 * labeled alternative in {@link ExprParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitConst(@NotNull ExprParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(@NotNull ExprParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(@NotNull ExprParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull ExprParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull ExprParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code depends}
	 * labeled alternative in {@link ExprParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterDepends(@NotNull ExprParser.DependsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code depends}
	 * labeled alternative in {@link ExprParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitDepends(@NotNull ExprParser.DependsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rule}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRule(@NotNull ExprParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rule}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRule(@NotNull ExprParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(@NotNull ExprParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(@NotNull ExprParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull ExprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull ExprParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dollar}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDollar(@NotNull ExprParser.DollarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dollar}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDollar(@NotNull ExprParser.DollarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RuleOpe}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRuleOpe(@NotNull ExprParser.RuleOpeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RuleOpe}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRuleOpe(@NotNull ExprParser.RuleOpeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code truefalse}
	 * labeled alternative in {@link ExprParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterTruefalse(@NotNull ExprParser.TruefalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truefalse}
	 * labeled alternative in {@link ExprParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitTruefalse(@NotNull ExprParser.TruefalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andor}
	 * labeled alternative in {@link ExprParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterAndor(@NotNull ExprParser.AndorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andor}
	 * labeled alternative in {@link ExprParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitAndor(@NotNull ExprParser.AndorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPow(@NotNull ExprParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPow(@NotNull ExprParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull ExprParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull ExprParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equality}
	 * labeled alternative in {@link ExprParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterEquality(@NotNull ExprParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equality}
	 * labeled alternative in {@link ExprParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitEquality(@NotNull ExprParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(@NotNull ExprParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(@NotNull ExprParser.PrintExprContext ctx);
}