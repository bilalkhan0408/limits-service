package com.in28minutes.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitsservice.beans.LimitConfiguration;

@RestController
public class LimitsConfigurationController {


	@Autowired
	private Configuration con;
	
	
@GetMapping("/limits")
public LimitConfiguration retrieveLimitFromConfiguation () {
	
	
	new LimitConfiguration();
	return new LimitConfiguration(con.getMaximum(),con.getMinimum());
	
	
}	
}
