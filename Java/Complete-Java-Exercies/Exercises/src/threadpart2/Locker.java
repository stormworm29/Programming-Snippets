package threadpart2;

import java.sql.Connection;

public class Locker {
	private final static ThreadLocal<Connection> tlocal1 = new ThreadLocal<Connection>();
	synchronized public static Connection getConn() {
		Connection con= tlocal1.get();
		if (con == null) {
			con = MyConnection.getConnection();
			tlocal1.set(con);
			return con;
		}
		else {
			return con;
		}
	}
	synchronized public static void closeCon() {
		Connection con = tlocal1.get();
		if(con != null) {
			try {
				con.close();
				tlocal1.remove();
			}catch(Exception e) {
				
			}
		}
	}
}
