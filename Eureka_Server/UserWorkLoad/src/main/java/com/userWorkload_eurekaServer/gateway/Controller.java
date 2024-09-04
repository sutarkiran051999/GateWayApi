package com.userWorkload_eurekaServer.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/userWorkload")
public class Controller {

	@GetMapping
	public String sayGoodMorning()
	{
		return "Good Morning";
	}
	
	
}
