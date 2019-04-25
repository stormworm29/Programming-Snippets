package user;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Action {
	public abstract String execute(HttpServletRequest request, HttpServletResponse response);
	public DBConImpl dbcon;
	Connection con = DBConnection.getConn();
	public Action() {
		dbcon = new DBConImpl(con);
	}
}
