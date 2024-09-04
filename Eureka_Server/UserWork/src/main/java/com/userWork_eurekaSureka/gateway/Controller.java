package com.userWork_eurekaSureka.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/userWork")
public class Controller {

	@GetMapping
	public String sayNamaste() {
		return "Namaste";
	}
	
	
}
