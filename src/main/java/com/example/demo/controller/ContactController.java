package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ContactEntity;
import com.example.demo.service.ContactService;

@RestController
public class ContactController {
	@Autowired
	ContactService serv;
	
	@PostMapping("/contact")
	public String contactDetails(@RequestParam String fullName , @RequestParam String email , @RequestParam String message) {
		ContactEntity contact = new ContactEntity();
		contact.setFullName(fullName);
		contact.setEmail(email);
		contact.setMessage(message);
		serv.saveContact(contact);
		return "Data Saved Successfully";
	}
	
	@GetMapping("/contacts")
	@ResponseBody
	public List<ContactEntity> getAllContacts(){
		return serv.getAllData();
	}

}
