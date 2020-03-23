package com.ers.reactor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.blockhound.BlockHound;

@SpringBootApplication
public class ReactorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactorDemoApplication.class, args);
	}
	
	 // static { BlockHound.install(); }
	 

}
