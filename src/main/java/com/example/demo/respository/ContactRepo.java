package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ContactEntity;

@Repository
public interface ContactRepo extends JpaRepository<ContactEntity,Integer>{

}
