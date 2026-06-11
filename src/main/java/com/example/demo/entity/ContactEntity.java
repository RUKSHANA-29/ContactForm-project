package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="contacts")

public class ContactEntity {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String fullName;
	String email;
	String message;
}
