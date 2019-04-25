package com.sirius.component;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
	public MyComponent() {
		System.out.println("My Component Called ...");
	}
	
	public void sayHello() {
		System.out.println("A Spring Annotation Project");
	}
}
