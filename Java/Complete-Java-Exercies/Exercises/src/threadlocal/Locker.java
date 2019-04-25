package threadlocal;

import java.sql.Connection;
import java.sql.SQLException;

public class Locker {
	private final static ThreadLocal<Connection> tlocal = new ThreadLocal<Connection>();
	synchronized public static Connection getConn() {
		Connection con = tlocal.get();
		if(con == null) {
			con = MyConnection.getConnection();
			tlocal.set(con);
			return con;
		}
		else {
			return con;
		}
	}
	synchronized public static void closeConn() {
		Connection con = tlocal.get();
		if(con != null) {
			try {
				con.close();
				tlocal.remove();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
