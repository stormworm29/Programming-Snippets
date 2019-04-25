package controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import net.sf.cglib.beans.BeanCopier.Generator;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="lc")
public class LoginCommand {
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	private int userid;
	
	private String username;
	private String password;
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getUserid() {
		return userid;
	}
}
