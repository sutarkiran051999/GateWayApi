package com.api_gateway.gateWayController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway")
public class ControllerGateway {

	@GetMapping("/night")
	public String sayGoodNight()
	{
		return "Good Night";
	}
	
}
