package com.sha.SpringSecurityBasicAuthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.sha.SpringSecurityBasicAuthentication")
public class SpringSecurityBasicAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityBasicAuthenticationApplication.class, args);
	}

}
