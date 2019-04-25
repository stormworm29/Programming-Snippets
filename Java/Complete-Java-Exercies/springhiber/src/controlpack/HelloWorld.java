package controlpack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import pojopack.Users;

public class HelloWorld implements Controller{
	String greeting;
	SessionFactory sessionfactory;
	HelloService helloservice;
	
public HelloService getHelloservice() {
		return helloservice;
	}

	public void setHelloservice(HelloService helloservice) {
		this.helloservice = helloservice;
	}

public SessionFactory getSessionfactory() {
		return sessionfactory;
	}

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
private DataSource dataSource;

public DataSource getDataSource() {
	return dataSource;
}

public void setDataSource(DataSource dataSource) {
	System.out.println(dataSource);
	this.dataSource = dataSource;
	
	
}

@Override
public ModelAndView handleRequest(HttpServletRequest arg0,
		HttpServletResponse arg1) throws Exception {
//	//your business logic goes here
	System.out.println("handle method called...");
	Session session=sessionfactory.openSession();
	Users user=(Users)session.load(Users.class,new Integer(2));
	String uname=user.getUname();
//	//String webcall="default" ;
//	//webcall=helloservice.sayHello(uname);
//	
//	this.greeting="Modified greeting"+greeting+":"+"uname";//":"+webcall;
//	
	System.out.println("handle request method called...");
//	JdbcTemplate temp=new JdbcTemplate(dataSource);
//	int noofrecords=temp.queryForInt("select count(*) from users");
	return new ModelAndView("welcome","message",uname);
}
}
