package com.sirius;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sirius.config.MyConfig;
import com.sirius.service.MyService;

public class AppMain {
	 public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
		MyService service = ctx.getBean("MyService",MyService.class);
		service.ServiceMethod();
	}
}
