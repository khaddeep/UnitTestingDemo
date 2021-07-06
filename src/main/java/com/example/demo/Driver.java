package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Driver {

	public static void main(String[] args) {
		SpringApplication.run(Driver.class, args);
	}
	
	public int sum(int x, int y) {
		return x+y;
	}

	
	public int subtract(int x, int y) {
		return x-y;
	}
}
