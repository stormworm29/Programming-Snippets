package user;


public interface DBCon {
	public boolean checkUser(String uname);
	public boolean checkStatus(String uname);
	public void changeStatus(String uname);
	public boolean validateUser(String uname, String upass);
	public void addUser(String uname, String upass);
}
