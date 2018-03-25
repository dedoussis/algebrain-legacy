package common.system.domain;

import java.util.ArrayList;

public final class OperatorNode extends AbstractNode implements Cloneable {
	
	private String key;
	private ArrayList<AbstractNode> children;

	public OperatorNode (String key) {
		this.key = key;
		children = new ArrayList<AbstractNode>();
	}
	
	public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

	public ArrayList<AbstractNode> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<AbstractNode> children) {
		this.children = children;
	}

	

	/* (non-Javadoc)
	 * @see uk.ac.ncl.b6070858.compiler.compiler.AbstractNode#clone()
	 */
	@Override
	public OperatorNode clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		String newKey= "" + this.getKey();
		OperatorNode clone = new OperatorNode(newKey);
		
		ArrayList<AbstractNode> newChildren = new ArrayList<AbstractNode>();
		
		for (int i=0; i<this.getChildren().size();i++){
			newChildren.add(this.getChildren().get(i).clone());
		}
		
		clone.setChildren(newChildren);
		
		return clone;
	}
	
	
}
