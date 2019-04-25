package applicationcontext;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


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
		
//		Properties prop = new Properties();
//		try {
//        prop.load(new FileInputStream("database.properties"));
//        String db = prop.getProperty("database");
//        String userName = prop.getProperty("dbuser");
//        String password = prop.getProperty("dbpassword");
//        System.out.println(db + " : " + userName + " : " + password);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
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
	public static void main(String[] args) {
		DBConnection db = new DBConnection();
		System.out.println("hello");
		Connection con = db.getConn();
	}
}
