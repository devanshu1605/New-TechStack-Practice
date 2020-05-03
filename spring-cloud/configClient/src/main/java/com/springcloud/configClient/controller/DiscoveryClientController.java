package com.springcloud.configClient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;


@RestController
@RequestMapping("/rest")
public class DiscoveryClientController {

	
	@Autowired
	EurekaClient client;
	
	@Autowired
	RestTemplate template;
	
	@GetMapping("/")
	public String getMessage() {
		InstanceInfo instance = client.getNextServerFromEureka("service", false);
		String homepageUrl= instance.getHomePageUrl();
		ResponseEntity<String> response =
				template.exchange(homepageUrl, HttpMethod.GET, null, String.class);
		return response.getBody();
	}
	
}
