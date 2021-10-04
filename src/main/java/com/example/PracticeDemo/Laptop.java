package com.example.PracticeDemo;

import org.springframework.stereotype.Component;

@Component//("lap1") we can use any value here as a replacement of the smaller case object name created by default and use it in the @Qualifier
public class Laptop {

	private int lid;
	private String brand;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}
	
	public void compile()
	{
		System.out.println("Compling");
	}

}
