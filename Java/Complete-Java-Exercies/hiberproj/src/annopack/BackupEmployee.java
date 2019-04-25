package annopack;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BackupEmployee {
	@Id
	private int eid;
	private String ename;
	private float salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
