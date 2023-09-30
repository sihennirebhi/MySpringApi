package com.sihenni.MySpringApi;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	 
	public void drive() {
		System.out.println("Erra");
	}
	
	
}
