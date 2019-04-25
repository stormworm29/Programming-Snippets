package threadlocal;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;





public class ConnectionDemo {
	public static void main(String[] args) {
		ExecutorService e = Executors.newFixedThreadPool(3);
		e.execute(new Runnable() {			
			@Override
			public void run() {
				Connection con = Locker.getConn();
				System.out.println(con);
				con = Locker.getConn();
				System.out.println(con);
				try {
					DatabaseMetaData dmd = con.getMetaData();
					System.out.println(dmd.getDatabaseProductName());
					System.out.println(dmd.getDriverName());
//					con.setAutoCommit(false);
					con.setTransactionIsolation(8);
					Statement stmt = con.createStatement();
					boolean b = stmt.execute("update Customer set name = 'hello world12' where cust_id = 2");
					System.out.println(b);
//					ResultSet rs = stmt.executeQuery("show tables");
//					
//					while(rs.next()) {
//						System.out.println(rs.getNString(1));
//					}
					
					
					Locker.closeConn();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
//					try {
//						con.rollback();
//					} catch (SQLException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
				}
			}
		});
		e.shutdown();
	}
}
