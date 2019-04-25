package controlpack;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/basic")
public class BasicController {
	@RequestMapping("/hello")
	public String basicCommand(){
		System.out.println("A huge work flow starts here....");
		return "hello";
	}
	@RequestMapping("/hai")
	public void basicCommand2(){
		System.out.println("a huge second work flow starts here...");
	}
	@RequestMapping(method=RequestMethod.GET)
	public void basicCommand3(){
		System.out.println("a huge third work flow starts here....");
	}
	@RequestMapping("/loadform")
	public String loadForm(Map model){
		model.put("regcommand", new RegistrationForm());
		return "regform";
	}
	@RequestMapping("/submitform")
	public String submitform(Map model,RegistrationForm form){
		System.out.println(form.getUname()+":"+form.getUpass());
		model.put("unameupass", form.getUname()+":"+form.getUpass());
		return "success";
	}
}
