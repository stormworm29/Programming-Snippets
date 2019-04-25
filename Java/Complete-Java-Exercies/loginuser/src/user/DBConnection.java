package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection con;
	static  {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public DBConnection() {
		// TODO Auto-generated constructor stub
		
	}
	public static Connection getConn() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","Welcome@123");
			return con;
			}
		catch(Exception ee) {
			return null;
		}
	}
	public static void  closeConn(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
