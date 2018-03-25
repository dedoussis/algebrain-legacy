package common.system.domain;

public final class NumNode extends AbstractNode {
	
	private int key;
	
	public NumNode (int key) {
		this.key = key;
	}
	
	public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }


    
}
