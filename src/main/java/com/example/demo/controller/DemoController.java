package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.servcie.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	DemoService demoService ;
	
	@GetMapping("/api/getname")
	public String getName() {
		return demoService.getName() ;
	}

	@GetMapping("/api/getadd")
	public String getAdd() {
		return demoService.getAdd() ;
	}

}
