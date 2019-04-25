package user;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginAction extends Action{
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
		Connection con = DBConnection.getConn();
		HttpSession session = request.getSession();
		session.setAttribute("name", uname);
		String returnString = validate(uname, upass, session);
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnString;
	}
	public String validate(String uname, String upass, HttpSession session) {
		if(dbcon.checkUser(uname)) {
			if(dbcon.checkStatus(uname)) {
				if(dbcon.validateUser(uname, upass)) {
					dbcon.changeStatus(uname);
					return "login.success";
				}
				else {
					return "login.failure";
				}
			}
			else
				return "login.already";
		}
		else {
			return "login.register";
		}
	}
}
