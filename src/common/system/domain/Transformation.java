package common.system.domain;


import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.v4.runtime.ANTLRInputStream;

import common.system.NodeFunctions;


public class Transformation  {


	private ArrayList<Rule> rules;      
	
	public Transformation(ArrayList<Rule> rules) {
		this.rules=rules;
	}
	
	
	/**
	 * @return the rules
	 */
	public ArrayList<Rule> getRules() {
		return this.rules;
	}


	/**
	 * @param rules the rules to set
	 */
	public void setRules(ArrayList<Rule> rules) {
		this.rules = rules;
	}


	public AbstractNode transform(AbstractNode node) throws CloneNotSupportedException{
		
		boolean done=false;
		AbstractNode output=NodeFunctions.eval(node);
		
		for (Rule rule : this.getRules()){
			
			
			HashMap<DollarNode, AbstractNode> MatchingMap= NodeFunctions.match(rule.getLhs(), output.clone());
			if (MatchingMap!=null && done==false){
				
				if (rule.getCondition()!=null){
				AbstractNode condition = NodeFunctions.rewrite(rule.getCondition(), MatchingMap);
				if(NodeFunctions.evalCondition((OperatorNode) condition)) {
					output = NodeFunctions.rewrite(rule.getRhs().clone(), MatchingMap);
					done=true;
				}
				}
				else {
				output = NodeFunctions.rewrite(rule.getRhs().clone(), MatchingMap);
				done=true;
			
				}
			}
		   
			
		}
		if (NodeFunctions.isOperator(output)){
	
			int childCount = ((OperatorNode) output).getChildren().size();
			for (int i=0; i<childCount; i++){
				((OperatorNode) output).getChildren().set(i, transform(((OperatorNode) output).getChildren().get(i)));
			}
			
			output=NodeFunctions.eval(((OperatorNode) output));
		}
		return output;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String name = "";
		for (Rule rule : this.getRules()){
			if (NodeFunctions.isOperator(rule.getLhs())){
				name = ((OperatorNode) rule.getLhs()).getKey();
				if (name.matches("[A-Za-z]+")) return name;
			}

		} 
		return name;

	}

	
	
	
	
	

}
