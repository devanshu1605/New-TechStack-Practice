package com.springcloud.discoveryclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class DiscoveryClientController {

	@Value("${service.instance.name}")
	String instance;
	
	@GetMapping("/getMessage")
	public String getMessage() {
		return instance;
	}
	
}
