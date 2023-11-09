package com.uap.it1311l.transactionsapi.transactionsapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public String testApi() {
		return "test passed";
	}
	
	@PostMapping("/test")
	public String teestApi2() {
		return "wow";
	}
}

