package pojopack;

import java.io.Serializable;

public class CompKey implements Serializable{

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pid;
		result = prime * result + sid;
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
		CompKey other = (CompKey) obj;
		if (pid != other.pid)
			return false;
		if (sid != other.sid)
			return false;
		return true;
	}

	private int sid,pid;

	
}
