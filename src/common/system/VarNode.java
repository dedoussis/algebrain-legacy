package common.system;

public final class VarNode extends AbstractNode implements Comparable<VarNode> {
	
	private String key;

	public VarNode (String key) {
		this.key = key;
	}
	
	public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

	
	@Override
	public int compareTo(VarNode o) {
		// TODO Auto-generated method stub
		return this.getKey().compareTo(o.getKey());
	}
    
    
}


