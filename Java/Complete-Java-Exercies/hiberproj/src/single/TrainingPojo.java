package single;

import java.util.Set;

public class TrainingPojo {
	private int tid;
	private String tname;
	private Set<UserPojo> users;
	public final int getTid() {
		return tid;
	}
	public final void setTid(int tid) {
		this.tid = tid;
	}
	public final String getTname() {
		return tname;
	}
	public final void setTname(String tname) {
		this.tname = tname;
	}
	public Set<UserPojo> getUsers() {
		return users;
	}
	public void setUsers(Set<UserPojo> users) {
		this.users = users;
	}
	
}
