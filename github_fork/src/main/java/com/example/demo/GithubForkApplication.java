package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubForkApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubForkApplication.class, args);
		System.out.println("github fork test");
	}

}
