package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubForkBranchApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubForkBranchApplication.class, args);
		System.out.println("새로운 브랜치로 fork");
	}

}
