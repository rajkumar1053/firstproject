package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/test")
public class MyFirstController {

	@GetMapping(path = "/getAll")
	public String getStudent() {
		return "Welcome to My First Hello World Service";
	}
}
