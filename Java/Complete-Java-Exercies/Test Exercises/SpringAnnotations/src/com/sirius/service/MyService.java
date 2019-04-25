package com.sirius.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sirius.component.MyComponent;

@Service(value="MyService")
public class MyService {
	@Autowired
	private MyComponent comp;

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
}
