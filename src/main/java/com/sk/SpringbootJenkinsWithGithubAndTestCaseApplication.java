package com.sk;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringbootJenkinsWithGithubAndTestCaseApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinsWithGithubAndTestCaseApplication.class);

	@PostConstruct
	public void someMehtod() {
		logger.info("Application started....");
	}
	
	
	public static void main(String[] args) {
		logger.info("Application Excecuted....");

		SpringApplication.run(SpringbootJenkinsWithGithubAndTestCaseApplication.class, args);
	}

}
