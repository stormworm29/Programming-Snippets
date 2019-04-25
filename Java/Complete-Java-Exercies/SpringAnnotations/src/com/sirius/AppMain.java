package com.sirius;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sirius.config.HibernateConfiguration;
import com.sirius.config.MyConfig;
import com.sirius.model.Employee;
import com.sirius.service.MyService;

public class AppMain {
	 public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HibernateConfiguration.class);
		MyService service = ctx.getBean("MyService",MyService.class);
		service.ServiceMethod();
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.setEid(1);
		e1.setEname("Gladstone");
		e1.setSalary(1000);
		e2.setEid(2);
		e2.setEname("Abraham");
		e2.setSalary(2000);
		service.saveObject(e1);
		service.saveObject(e2);
		
	}
}
