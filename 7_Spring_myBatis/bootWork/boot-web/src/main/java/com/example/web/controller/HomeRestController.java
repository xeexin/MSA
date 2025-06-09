package com.example.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
	
	// http://localhost:8081/?plain
	@RequestMapping(value = {"/"}, params = "plain")
	public String homePlain() {

		return "Welcome Spring Boot!!";
	}
	
	@RequestMapping(value = {"/"}, params = "json")
	public String homeJson() {
		return "{\"msg\" : \"김치볶음밥\"}";
	}
	
//	{
//		"msg" : "message"
//	}

}
