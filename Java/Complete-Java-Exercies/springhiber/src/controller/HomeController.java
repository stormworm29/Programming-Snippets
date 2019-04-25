package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HomeController implements Controller{
	private String msg;
	
@Override
public ModelAndView handleRequest(HttpServletRequest arg0,
		HttpServletResponse arg1) throws Exception {
	
	return new ModelAndView("welcome","message",msg);
}

public void setMsg(String msg) {
	this.msg = msg;
}

public String getMsg() {
	return msg;
}

}
