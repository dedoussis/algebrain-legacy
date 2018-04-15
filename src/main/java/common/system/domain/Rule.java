package common.system.domain;

import common.system.NodeFunctions;

public final class Rule extends AbstractNode {
	private AbstractNode lhs;
	private AbstractNode rhs;
	private OperatorNode condition;
	
	public Rule(AbstractNode lhs, AbstractNode rhs, OperatorNode condition){
		this.lhs = lhs;
		this.rhs = rhs;
		this.condition = condition;
	}

	/**
	 * @return the lhs
	 */
	public AbstractNode getLhs() {
		return this.lhs;
	}

	/**
	 * @return the rhs
	 */
	public AbstractNode getRhs() {
		return this.rhs;
	}

	/**
	 * @return the condition
	 */
	public OperatorNode getCondition() {
		return this.condition;
	}

	/**
	 * @param lhs the lhs to set
	 */
	public void setLhs(AbstractNode lhs) {
		this.lhs = lhs;
	}

	/**
	 * @param rhs the rhs to set
	 */
	public void setRhs(AbstractNode rhs) {
		this.rhs = rhs;
	}

	/**
	 * @param condition the condition to set
	 */
	public void setCondition(OperatorNode condition) {
		this.condition = condition;
	}
	
	@Override
	public String toString(){
		String conditionString;
		if (this.getCondition()!=null) {
			conditionString = " if ";
			if (this.getCondition().getKey().matches("OR|AND|==")){
				conditionString = conditionString + NodeFunctions.expression(this.getCondition().getChildren().get(0)) + " " + this.getCondition().getKey() + " " + NodeFunctions.expression(this.getCondition().getChildren().get(1)); 
			}
			else conditionString = conditionString + this.getCondition().getKey() +"(" + NodeFunctions.expression(this.getCondition().getChildren().get(0)) + ")";
		}
		else conditionString = "";

		return NodeFunctions.expression(this.getLhs()) + "=" + NodeFunctions.expression(this.getRhs()) + conditionString;
	}

	
}
