package common.system.domain;

public final class VarNode extends AbstractNode implements Comparable<VarNode> {
	
	private String key;

	public VarNode (String key) {
		this.key = key;
	}
	
	public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return this.key;
	}
		
	@Override
	public int compareTo(VarNode o) {
		return this.getKey().compareTo(o.getKey());
	}
	
	@Override
	public String toString() {
        return this.getKey();
	}
    
}


