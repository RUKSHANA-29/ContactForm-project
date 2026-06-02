package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ContactEntity;
import com.example.demo.respository.ContactRepo;


@Service
public class ContactService {
       
	@Autowired
	ContactRepo repo;
	
	public ContactEntity saveContact(ContactEntity cont) {
		return repo.save(cont);
	}
	
	public List<ContactEntity> getAllData(){
		return repo.findAll();
	}
}
