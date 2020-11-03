package com.austinanimalcenter.shelter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShelterApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ShelterApplication.class, args);
		SpringApplication springApplication = new SpringApplication(ShelterApplication.class);
		springApplication.setWebApplicationType(WebApplicationType.NONE);
		springApplication.run(args);
	}

}
