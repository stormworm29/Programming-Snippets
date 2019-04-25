package single;

import java.util.Set;

public class UserPojo {
	private int userid;
	private String uname,upass;
	private int flag;
	private Set<Address> addresses;
	private Set<TrainingPojo> trainings;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public Set<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	public Set<TrainingPojo> getTrainings() {
		return trainings;
	}
	public void setTrainings(Set<TrainingPojo> trainings) {
		this.trainings = trainings;
	}
}
