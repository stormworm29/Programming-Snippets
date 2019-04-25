package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginForm {
	
	@Autowired
	private SessionFactory sessionfactory;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(ModelMap map)
	{
		LoginCommand lc=new LoginCommand();
		map.addAttribute("logincommand",lc);
		return "inputform";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login2(LoginCommand command)
	{
		System.out.println("Welcome...:"+command.getUsername());
		Session session=sessionfactory.openSession();
		session.save(command);
		session.beginTransaction().commit();
		return "welcome";
	}
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}
	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}
}
