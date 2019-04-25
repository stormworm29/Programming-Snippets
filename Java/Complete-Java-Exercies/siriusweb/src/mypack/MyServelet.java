package mypack;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.util.Enumeration;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServelet
 */
public class MyServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServelet() {
        System.out.println("Constructor called ...");
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
//    	System.out.println("init called .. ");
//    	String s = config.getInitParameter("hello");
//    	String s2 = config.getInitParameter("hello2");
//    	Enumeration<String> e =config.getInitParameterNames();
//    	while(e.hasMoreElements()) {
//    		String key = e.nextElement();
//    		String value = config.getInitParameter(key);
//    		System.out.println(key + " : " + value);
//    	}
//    	String nameofservlet = config.getServletName();
//    	System.out.println("name of servlet ..:"+nameofservlet);
//    	ServletContext ctx = config.getServletContext();
//    	String path = ctx.getRealPath("/WEB-INF/config.properties");
//    	try {
//    		Properties prop = new Properties();
//    		prop.load(new FileInputStream(path));
//    		System.out.println(prop.getProperty("url"));
//    		System.out.println(prop.getProperty("driver"));
//    	}catch(Exception ee) {}
    	
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		ServletOutputStream out = response.getOutputStream();
//		// TODO Auto-generated method stub
//		out.println("do get method ..");
//		String s = request.getParameter("uname");
//		out.println("uname: "+s);
//		Enumeration<String> e=request.getParameterNames();
//		while(e.hasMoreElements()) {
//			String key = e.nextElement();
//			String value = request.getParameter(key);
//			System.out.println(key+" : "+value);
//		}
//		String s = request.getParameter("uname");
//		if(s.equals("ramu")) {
//			response.sendRedirect("welcome.html");
//		}
//		else {
//			RequestDispatcher rd = request.getRequestDispatcher("welcome.html");
//			rd.forward(request, response);
//		}
		ServletOutputStream out = response.getOutputStream();
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		Object c = session.getAttribute("count");
		if(c == null) {
			out.println("<h1>You are visiting for the first time.. </h1>");
			session.setAttribute("count", 1);
		}
		else {
			int count = Integer.parseInt(c.toString());
			out.println("<h1>You are visiting..."+ count + " times");
			session.setAttribute("count", ++count);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("post method is called ....");
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destry called ....");
	}

}
