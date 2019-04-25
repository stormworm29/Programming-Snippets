package applicationcontext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutAction extends Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String uname = (String) session.getAttribute("name");
		DBActionImpl dbcon = new DBActionImpl();
		dbcon.changeStatus(uname, 0);
		dbcon.closeConn();
		return "logout.success";
	}

}
