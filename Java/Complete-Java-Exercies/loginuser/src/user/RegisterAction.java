package user;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterAction extends Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
		Connection con = DBConnection.getConn();
		if(!dbcon.checkUser(uname)) {
			dbcon.addUser(uname, upass);
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "login.failure";
	}
	
}
