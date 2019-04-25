package threadpart2;

import java.sql.Connection;

public class ConnectionDemo {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Connection con = Locker.getConn();
				System.out.println(con);
				con = Locker.getConn();
				System.out.println(con);
			}
		}).start();
		
	}
}
