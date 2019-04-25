package com.sap.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	public HelloController() {
		System.out.println("Hello Controller got initialized");
	}
	@RequestMapping(value= { "/" , "/welcome**" } ,method=RequestMethod.GET)
	public ModelAndView welcomePage() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is Welcome Page");
		model.setViewName("hello");
		return model;
	}
	@RequestMapping(value= { "/admin**" } ,method=RequestMethod.GET)
	public ModelAndView adminPage() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is Welcome Page - Admin Page");
		model.setViewName("admin");
		return model;
	}
	@RequestMapping(value= { "/loadform" }, method = RequestMethod.GET)
	public ModelAndView loadForm() {
		ModelAndView mandv = new ModelAndView();
		Student formobj = new Student();
		mandv.addObject("student",formobj);
		mandv.setViewName("myform");
		return mandv;
	}
	@RequestMapping(value= { "/submitform" }, method = RequestMethod.POST)
	public ModelAndView submitForm(Student student) {
		System.out.println(student.getName()+ " : " + student.getAge());
		ModelAndView mandv = new ModelAndView();
		mandv.addObject("student",student);
		mandv.setViewName("nextpage");
		return mandv;
	}
	
}
