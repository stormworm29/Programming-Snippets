package applicationcontext;

import java.sql.Connection;

public class DBThreadUtility {
	private static ThreadLocal<Connection> tlocal = new ThreadLocal<Connection>();
	public synchronized static Connection getConn() {
		Connection con;
		con = tlocal.get();
		if(con == null) {
			con = DBConnection.getConn();
			tlocal.set(con);
			return con;
		}
		else {
			return con;
		}
	}
	public static void closeConn() {
		Connection con = tlocal.get();
		DBConnection.closeConn(con);
		tlocal.remove();
	}
}
