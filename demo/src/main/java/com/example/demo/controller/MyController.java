package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/test")
public class MyController {

	@GetMapping(path = "/getMyHelloWorld")
	public String getStudent() {
		return "Welcome to Hello World Service"; //service.getStudent();
	}
}
