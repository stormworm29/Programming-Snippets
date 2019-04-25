package com.sirius.service;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.sirius.component.MyComponent;
import com.sirius.model.Employee;

@Service(value="MyService")
@Transactional
@Repository
public class MyService {
	@Autowired
	private MyComponent comp;
	
	@Autowired
	private SessionFactory factory;

	public MyComponent getComp() {
		return comp;
	}

	public void setComp(MyComponent comp) {
		this.comp = comp;
	}
	public MyService() {
		System.out.println("My Service called ..");
	}
	public void ServiceMethod() {
		comp.sayHello();
	}
	public void saveObject(Employee e) {
		factory.getCurrentSession().persist(e);
	}

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
}
