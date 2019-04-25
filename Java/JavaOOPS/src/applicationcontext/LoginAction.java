package applicationcontext;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginAction extends Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
		HttpSession session = request.getSession();
		DBActionImpl dbcon = new DBActionImpl();
		if(dbcon.checkUser(uname, upass)) {
			session.setAttribute("name", uname);
			if(dbcon.checkStatus(uname)) {
				dbcon.closeConn();
				return "login.already";
			}
			else {
				dbcon.changeStatus(uname, 1);
				dbcon.closeConn();
				return "login.success";
			}
		}
		else {
			dbcon.closeConn();
			return "login.register";
		}
	}

}
