package com.sha.SpringSecurityBasicAuthentication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

	@RequestMapping("/user")
	public String loginUser() {
		return "User login successful.";
	}
	
	@RequestMapping("/admin")
	public String loginAdmin( ) {
		return "Admin login succesful.";
	}
	
	@RequestMapping("/index")
	public String indexWeb() {
		return "Ýndex Web Page";
	}
	
	@RequestMapping("/advert")
	public String advert() {
		return "Advert Page";
	}
 }
