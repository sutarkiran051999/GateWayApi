package com.userWorkHolic_eurekaServer.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/userWorkHolic")
public class Controller {

		@GetMapping
		public String sayBye()
		{
			return "Good Bye";
		}
	
}
