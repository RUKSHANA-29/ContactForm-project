package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	
	@PostMapping("/contact")
	public String contactDetails(@RequestParam String name , @RequestParam String email , @RequestParam String message) {
		System.out.println("Name: "+name);
		System.out.println("Email: "+email);
		System.out.println("Message: "+message);
		return "Form Submitted Successfully";
	}

}
