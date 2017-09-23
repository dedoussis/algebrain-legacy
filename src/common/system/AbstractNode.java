package common.system;

public abstract class AbstractNode implements Cloneable{
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	
	@Override
	public AbstractNode clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (AbstractNode) super.clone();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
	
		return NodeFunctions.expression(this);
	}
	
}
