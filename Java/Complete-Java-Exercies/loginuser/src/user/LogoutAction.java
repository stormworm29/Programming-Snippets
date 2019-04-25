package user;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutAction extends Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String uname = (String)session.getAttribute("name");
		Connection con = DBConnection.getConn();
		if(dbcon.checkStatus(uname))
			dbcon.changeStatus(uname);
		else
			System.out.println("Already Logged out..");
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "login.failure";
	}
	
}
