package com.ssd.spring.SpringProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting/noon")
public class FirstGit {
	
	@GetMapping("/")
	public String Greetings() {
		return "Good Evening";
	}

}
