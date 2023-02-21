package com.ssd.spring.SpringProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

	
	
	@GetMapping("/")
	public String display() {
		
		return "Welcome to world";
	}
	
	public  String print() {
		return "Haiiii";
	}
	
}
