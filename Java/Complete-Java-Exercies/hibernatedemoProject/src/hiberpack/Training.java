package hiberpack;

import java.util.Set;

public class Training {
	private int tid;
	private String subject, tname;
	Set<UserPojo> users;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String trainingname) {
		this.tname = trainingname;
	}
	public Set<UserPojo> getUsers() {
		return users;
	}
	public void setUsers(Set<UserPojo> users) {
		this.users = users;
	}
}
