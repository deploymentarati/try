package com.example.junittest.junittestcases.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JunitTestController {
	

	    @GetMapping("/hello")
	    public String helloWorld() {
	        return "Hello, World!";
	    }
	}


