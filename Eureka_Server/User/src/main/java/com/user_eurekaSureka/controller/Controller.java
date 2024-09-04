package com.user_eurekaSureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class Controller {

	@GetMapping
	public String sayHello()
	{
		return "Hello World";
	}
	
}
