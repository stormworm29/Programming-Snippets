package pojopack;

import java.io.Serializable;


public class Test {
	CompKey ckey;
	public CompKey getCkey() {
		return ckey;
	}
	public void setCkey(CompKey ckey) {
		this.ckey = ckey;
	}
	String tname;
	int version;
	Records records;
	
	public Records getRecords() {
		return records;
	}
	public void setRecords(Records records) {
		this.records = records;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
}
