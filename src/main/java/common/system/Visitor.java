package common.system;

import java.util.ArrayList;

import common.parser.ExprBaseVisitor;
import common.parser.ExprParser;
import common.parser.ExprParser.AndorContext;
import common.parser.ExprParser.ConstContext;
import common.parser.ExprParser.DependsContext;
import common.parser.ExprParser.EqualityContext;
import common.parser.ExprParser.OpcondContext;
import common.parser.ExprParser.TruefalseContext;
import common.parser.ExprParser.VarNumUnaryContext;
import common.parser.ExprParser.DolUnaryContext;
import common.system.domain.AbstractNode;
import common.system.domain.DollarNode;
import common.system.domain.NumNode;
import common.system.domain.OperatorNode;
import common.system.domain.Rule;
import common.system.domain.VarNode;

public class Visitor extends ExprBaseVisitor<AbstractNode> {

	@Override
	public AbstractNode visitPrintExpr(ExprParser.PrintExprContext ctx) {

	AbstractNode rootNode = visit(ctx.expr()); // evaluate the expr child
	
	return rootNode; // return dummy value
	}
	
	
	@Override
	public Rule visitRule(ExprParser.RuleContext ctx) {

		AbstractNode left = visit(ctx.expr(0)); // get value of left subexpression
		AbstractNode right = visit(ctx.expr(1)); // get value of right subexpression
		OperatorNode condition;
		if (ctx.bexp()!=null) condition = (OperatorNode) visit(ctx.bexp());
		else condition=null;
		
		Rule rule = new Rule(left, right, condition);

		return rule;
	}
	/** INT 
	 * @return */
	@Override
	public NumNode visitInt(ExprParser.IntContext ctx) {
	NumNode num = new NumNode(Integer.valueOf(ctx.INT().getText()));
	return num;
	}
	/** ID */
	@Override
	public VarNode visitId(ExprParser.IdContext ctx) {
	String id = ctx.ID().getText();
	VarNode var = new VarNode(id);
	return var;
	}
	/** expr op=('*'|'/') expr */
	
	@Override
	public OperatorNode visitPow(ExprParser.PowContext ctx) {
		AbstractNode left = visit(ctx.expr(0)); // get value of left subexpression
		AbstractNode right = visit(ctx.expr(1)); // get value of right subexpression
		
		OperatorNode ope = new OperatorNode(ctx.op.getText());
		
		ope.getChildren().add(left);
		ope.getChildren().add(right);
		return ope;
	}
	
	@Override
	public OperatorNode visitMulDiv(ExprParser.MulDivContext ctx) {
	AbstractNode left = visit(ctx.expr(0)); // get value of left subexpression
	AbstractNode right = visit(ctx.expr(1)); // get value of right subexpression
	
	OperatorNode ope = new OperatorNode(ctx.op.getText());
	
	ope.getChildren().add(left);
	ope.getChildren().add(right);
	return ope;
	}
	/** expr op=('+'|'-') expr */
	@Override
	public OperatorNode visitAddSub(ExprParser.AddSubContext ctx) {

		AbstractNode left = visit(ctx.expr(0)); // get value of left subexpression
		AbstractNode right = visit(ctx.expr(1)); // get value of right subexpression
		
		OperatorNode ope = new OperatorNode(ctx.op.getText());
		
		ope.getChildren().add(left);
		ope.getChildren().add(right);
		return ope;
	}
	
	
	public OperatorNode visitOperator(ExprParser.OperatorContext ctx) {

		ArrayList<AbstractNode> children = new ArrayList<AbstractNode>();
		OperatorNode ope = new OperatorNode(ctx.op.getText());
		
		int size = ctx.expr().size();
		
		for (int i=0;i<size;i++){
			children.add(visit(ctx.expr(i)));
		}
		
		ope.setChildren(children);
		return ope;
	}
	
	
	/** '(' expr ')' */
	@Override
	public AbstractNode visitParens(ExprParser.ParensContext ctx) {
	return visit(ctx.expr()); // return child expr's value
	}
	
	
	@Override
	public DollarNode visitDollar(ExprParser.DollarContext ctx) {
		String id=ctx.ID().getText();
		
		DollarNode dol = new DollarNode(id);
		return dol;
	}


	/* (non-Javadoc)
	 * @see common.parser.ExprBaseVisitor#visitAndor(common.parser.ExprParser.AndorContext)
	 */
	@Override
	public AbstractNode visitAndor(AndorContext ctx) {
		// TODO Auto-generated method stub
		String op =ctx.op.getText();
		
		OperatorNode ope = new OperatorNode(op);
		ope.getChildren().add(visit(ctx.bexp(0)));
		ope.getChildren().add(visit(ctx.bexp(1)));
		
		return ope;
	}

	/* (non-Javadoc)
	 * @see common.parser.ExprBaseVisitor#visitEquality(common.parser.ExprParser.EqualityContext)
	 */
	@Override
	public AbstractNode visitEquality(EqualityContext ctx) {
		OperatorNode ope = new OperatorNode("==");
		ope.getChildren().add(visit(ctx.expr(0)));
		ope.getChildren().add(visit(ctx.expr(1)));
		return ope;
	}
	
	@Override
	public AbstractNode visitVarNumUnary(VarNumUnaryContext ctx){
		OperatorNode unaryOpe = new OperatorNode("-");
		if (ctx.ID() != null) unaryOpe.getChildren().add(new VarNode(ctx.ID().getText()));
		else if (ctx.INT() != null){
			unaryOpe.getChildren().add(new NumNode(Integer.valueOf(ctx.INT().getText())));
		}
		else {

		}
		return unaryOpe;
	}

	@Override
	public AbstractNode visitDolUnary(DolUnaryContext ctx){
		OperatorNode unaryOpe = new OperatorNode("-");
		unaryOpe.getChildren().add(new DollarNode(ctx.ID().getText()));
		return unaryOpe;
	}
	/* (non-Javadoc)
	 * @see common.parser.ExprBaseVisitor#visitTruefalse(common.parser.ExprParser.TruefalseContext)
	 */
	@Override
	public AbstractNode visitTruefalse(TruefalseContext ctx) {
		
		OperatorNode ope = new OperatorNode("is");
		String op =ctx.getText();
		if (op.matches("TRUE")) ope.getChildren().add(new NumNode(1));
		else if (op.matches("FALSE")) ope.getChildren().add(new NumNode(0));
		
		return ope;

	}

	/* (non-Javadoc)
	 * @see common.parser.ExprBaseVisitor#visitOpcond(common.parser.ExprParser.OpcondContext)
	 */
	@Override
	public AbstractNode visitOpcond(OpcondContext ctx) {
		OperatorNode ope = new OperatorNode(ctx.ID().getText());
		ope.getChildren().add(visit(ctx.bexp()));
		return ope;
	}

	/* (non-Javadoc)
	 * @see common.parser.ExprBaseVisitor#visitConst(common.parser.ExprParser.ConstContext)
	 */
	@Override
	public OperatorNode visitConst(ConstContext ctx) {
		OperatorNode ope = new OperatorNode("is_const");
		ope.getChildren().add(visit(ctx.expr()));
		return ope;
	}

	/* (non-Javadoc)
	 * @see common.parser.ExprBaseVisitor#visitDepends(common.parser.ExprParser.DependsContext)
	 */
	@Override
	public OperatorNode visitDepends(DependsContext ctx) {
		OperatorNode ope = new OperatorNode("depends");
		ope.getChildren().add(visit(ctx.expr(0)));
		ope.getChildren().add(visit(ctx.expr(1)));
		return ope;
	}
}
