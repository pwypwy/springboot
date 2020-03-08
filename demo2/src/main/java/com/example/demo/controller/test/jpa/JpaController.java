package com.example.demo.controller.test.jpa;

import java.security.Principal;

import com.example.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/jpa")
    public String test(Principal principal){

        long l = userRepository.count();
        
        return "测试成功:  "+l+" ==== "+principal.getName();
    }

 
}
