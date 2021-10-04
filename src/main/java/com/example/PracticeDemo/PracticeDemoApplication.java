package com.example.PracticeDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PracticeDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(PracticeDemoApplication.class, args);
		System.out.println("Hello World!");
		
		Alien a = context.getBean(Alien.class);
	    a.show();
		
	}

}
