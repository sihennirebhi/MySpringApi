package com.sihenni.MySpringApi;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	public void drive() {
		System.out.println("Terta");
	}
}
