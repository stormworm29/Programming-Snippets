package applicationcontext;

import java.io.FileInputStream;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestProcessor {
	public void process(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String handlerprop = request.getParameter("handler");
		ServletContext ctx = request.getServletContext();
		String path = ctx.getRealPath("/WEB-INF/config.properties");
		Properties prop = new Properties();
		prop.load(new FileInputStream(path));
		String handler = prop.getProperty(handlerprop);
    	Action a = (Action) Class.forName(handler).getDeclaredConstructor().newInstance();
    	handler = a.execute(request, response);
    	RequestDispatcher dis=request.getRequestDispatcher(prop.getProperty(handler));          
        dis.forward(request, response);
	}
}
