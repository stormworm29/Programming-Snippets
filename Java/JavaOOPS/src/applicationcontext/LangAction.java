package applicationcontext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LangAction extends Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String language = request.getParameter("language");
		session.setAttribute("lang", language);
		return "lang.action";
	}

}
