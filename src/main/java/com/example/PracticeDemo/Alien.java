package com.example.PracticeDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //This creates singleton spring bean.Creates a object as soon as a Spring container.Hence the Object is created only once.
@Scope(value = "prototype")// It creates a protoype. This does not create a Object automatically while a spring container is created.It creates a Object when you use getBean().
public class Alien {
	
	private int aid;
	private String aname;
	private String tech;
	@Autowired
	@Qualifier("laptop") //By default when the object is created in the spring container the name assigned to is the class name in all small case.we can mention that as well
	private Laptop laptop;
	
	public Alien()
	{
		super();
		System.out.println("Object Created");
	}
	
	public int getAid() {
		return aid;
	}
	
	
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}


	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public void show()
	{
		System.out.println("Hi from Show");
		laptop.compile();
	}
}
