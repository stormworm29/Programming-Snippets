package pojopack;

import java.io.Serializable;

public class Records implements Serializable{
	String name;
	public Records(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return "the record is...:"+name;
	}
	
}