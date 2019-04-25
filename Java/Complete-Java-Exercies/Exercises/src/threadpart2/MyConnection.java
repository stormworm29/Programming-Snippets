package threadpart2;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","Welcome@123");
			return con;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void main(String[] args) {
		MyConnection con = new MyConnection();
		Connection conn = con.getConnection();
		System.out.println(conn);
	}
}
