package com.zuul.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	
	@Autowired
	private Environment env;
	
	@RequestMapping("/route2")
	public String getDetails() {
		
		return "This is details from route2 From ZUULAPI2 on Port "+ env.getProperty("server.port");
	}
	
	@RequestMapping("/route3")
	public String getDetailsfrom() {
		
		return "This is details from route3 From ZUULAPI2 on Port "+ env.getProperty("server.port");
	}

}