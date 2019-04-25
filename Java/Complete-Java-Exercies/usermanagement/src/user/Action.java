package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Action {

}
class Login extends Action {
	public static ResultSet passSelect(Connection con, String uname, String upass) {
		// TODO Auto-generated constructor stub
		try {
			PreparedStatement stmt = con.prepareStatement("select upass from users where uname = ?");
			stmt.setString(1,uname); 
			ResultSet rs = stmt.executeQuery();
			if(rs.next())
			{
				return rs;
			}
			else {
				System.out.println("no value returned ..");
				return null;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} 
	}
}