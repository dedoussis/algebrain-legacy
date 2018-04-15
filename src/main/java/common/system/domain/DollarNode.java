package common.system.domain;

public final class DollarNode extends AbstractNode implements Comparable<DollarNode>{
	
	private String key;

	public DollarNode (String key) {
		this.key = key;
	}
	
	public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DollarNode other = (DollarNode) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}

	@Override
	public int compareTo(DollarNode o) {
		return this.getKey().compareTo(o.getKey());
	}
	
	@Override
	public String toString() {
        return "$" + this.getKey();
    }

}


