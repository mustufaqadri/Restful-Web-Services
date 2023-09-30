package com.learn.rest.webservices.restfulwebservices;

import com.learn.rest.webservices.restfulwebservices.User.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		for (int i = 0;i < 1000; i++) {
			users.add(new User(1, "te", null));
		}
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}

}
