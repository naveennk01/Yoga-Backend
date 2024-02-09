package com.learn.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @OpenAPIDefinition(
// 		info =@Info(
// 				title = "Zenyoga",
// 				version = "0.1.2",
// 				description = "Yoga and meditayion",
// 				contact = @Contact(
// 						name = "Naveen",
// 						email = "nk.naveenkumaar@gmail.com";
// 						)
// 				)
// 		)
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

}
