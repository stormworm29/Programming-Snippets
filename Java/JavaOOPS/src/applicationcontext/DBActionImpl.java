package applicationcontext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBActionImpl implements DBAction{
	Connection con;
	public boolean checkUser(String uname, String upass) {
		con = DBThreadUtility.getConn();
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("select * from users where uname = ? and upass = ?");
			stmt.setString(1, uname);
			stmt.setString(2, upass);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				return true;
			}
			else {
				return false;
			}
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean checkStatus(String uname) {
		con = DBThreadUtility.getConn();
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("select * from users where uname = ?");
			stmt.setString(1, uname);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				int status = rs.getInt(4);
				if(status == 1) {
					return true;
				}
			}
			return false;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public void changeStatus(String uname, int flag) {
		con = DBThreadUtility.getConn();
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("update users set status = ? where uname = ?");
			stmt.setInt(1, flag);
			stmt.setString(2, uname);
			stmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void registerUser(int uid, String uname, String upass) {
		con = DBThreadUtility.getConn();
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("insert into users values( ?,?,?,?)");
			stmt.setInt(1, uid);
			stmt.setString(2, uname);
			stmt.setString(3, upass);
			stmt.setInt(4, 0);
			stmt.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public void closeConn() {
		DBThreadUtility.closeConn();;
		
	}

	public int getValue(String item) {
		con = DBThreadUtility.getConn();
		PreparedStatement stmt;
		int prize=0;
		try {
			stmt = con.prepareStatement("select * from items where item_name = ?");
			stmt.setString(1, item);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				prize = rs.getInt(2);
			}
			return prize;
			
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	

}
