package applicationcontext;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ShoppingAction extends Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		Enumeration<String> e = request.getParameterNames();
		while(e.hasMoreElements()) {
			String key = (String)e.nextElement();
			String value = (String) request.getParameter(key);
			session.setAttribute(key, value);
		}
		String next = request.getParameter("next");
		return next;
	}

}
