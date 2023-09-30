package com.sihenni.MySpringApi;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
	private String brand;

	
	
//	public Tyre(String brand) {
//		super();
//		setBrand(brand);
//		//this.brand = brand; //u can use this instead of setter
//	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre roule";
	}
	
	
}
