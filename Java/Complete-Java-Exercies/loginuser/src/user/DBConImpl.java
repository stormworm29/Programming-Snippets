package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBConImpl implements DBCon{
	Connection con;
	public DBConImpl(Connection con) {
		// TODO Auto-generated constructor stub
		this.con = con;
	}
	@Override
	public boolean checkUser(String uname) {
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("select * from users where uname = ?");
			stmt.setString(1,uname); 
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				return true;
			}
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean checkStatus(String uname) {
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("select * from users where uname = ?");
			stmt.setString(1,uname); 
			ResultSet rs = stmt.executeQuery();
			int status = -1;
			while(rs.next()) {
				status = rs.getInt("status");
			}
			
			if(status==0) {
				return true;
			}
			else {
			return false;
		} 
		
		}
		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public void changeStatus(String uname) {
		PreparedStatement stmt;
		try {
			if(checkStatus(uname)) {
				stmt = con.prepareStatement("UPDATE users SET status = 1 WHERE uname = ?");
				stmt.setString(1,uname);
			    stmt.executeUpdate();
			}
			else {
				stmt = con.prepareStatement("UPDATE users SET status = 0 WHERE uname = ?");
				stmt.setString(1,uname);
			    stmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean validateUser(String uname, String upass) {
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("select * from users where uname = ? and upass = ?");
			stmt.setString(1,uname); 
			stmt.setString(2,upass); 
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				return true;
			}
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public void addUser(String uname, String upass) {
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("Insert into users values( ?, ?, 0)");
			stmt.setString(1,uname); 
			stmt.setString(2,upass);
			stmt.execute();
	}catch(Exception e) {}
	}
}
