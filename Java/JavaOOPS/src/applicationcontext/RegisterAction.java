package applicationcontext;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterAction extends Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
		int uid = Integer.parseInt(request.getParameter("uid"));
		Connection con = DBThreadUtility.getConn();
		try {
			PreparedStatement stmt = con.prepareStatement("insert into users values (?,?,?,?)");
			stmt.setInt(1, uid);
			stmt.setString(2, uname);
			stmt.setString(3, upass);
			stmt.setInt(4, 0);
			stmt.execute();
			DBThreadUtility.closeConn();
			return "register.success";
		}catch(Exception e) {
			e.printStackTrace();
			return "register.failure";
		}
	}

}
