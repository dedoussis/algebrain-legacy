package common.system;

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



	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		return result;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(DollarNode o) {
		// TODO Auto-generated method stub
		return this.getKey().compareTo(o.getKey());
	}
	
	

}


