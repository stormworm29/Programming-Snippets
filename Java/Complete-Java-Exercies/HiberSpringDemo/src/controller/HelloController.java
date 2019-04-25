package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("helloworld")
public class HelloController {
	@RequestMapping("/hello1")
	public String sayHello(ModelMap map)
	{
		map.addObject("message","welcome to spring...verizon.....");
		//return new ModelAndView("welcome","message","welcome to Spring..!!!!!");
		return "welcome";
	}
	@RequestMapping("/hello2/{name}")
	public String sayHello2(@PathVariable String name,ModelMap map)
	{
		map.addObject("message","welcome to spring...verizon....."+name);
		return "welcome";
	}
}
