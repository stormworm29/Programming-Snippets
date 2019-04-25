package applicationcontext;

public interface DBAction {
	public boolean checkUser (String uname, String upass);
	public boolean checkStatus(String uname);
	public void changeStatus(String uname, int flag);
	public void registerUser(int uid, String uname, String upass);
	public void closeConn();
	public int getValue(String item);
}
