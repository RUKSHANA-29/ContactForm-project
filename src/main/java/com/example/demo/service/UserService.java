package com.example.demo.service;

import com.example.demo.entity.UserEntity;
import com.example.demo.respository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        System.out.println("LOGIN ATTEMPT: " + username);

      
		UserEntity user = userRepository.findByUsername(username);

        System.out.println("USER FOUND: " + user);

        if (user == null) {
            throw new UsernameNotFoundException("User Not Found");
        }

        return new User(
                user.getUsername(),
                user.getPassword(),
                Collections.singletonList(
                        new SimpleGrantedAuthority("ROLE_" + user.getRole()))
        );
}
}