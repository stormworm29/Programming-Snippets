package hiberpack;

import java.util.Set;

public class UserPojo {
	private int uid,status;
	private String uname,upass;
	private Set<Address> address;
	private Set<Training> trainings;
	public UserPojo() {
		System.out.println("POJO object created ...");
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public Set<Address> getAddress() {
		return address;
	}
	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	public Set<Training> getTrainings() {
		return trainings;
	}
	public void setTrainings(Set<Training> trainings) {
		this.trainings = trainings;
	}
}
