package com.synex.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value = "/home")
	public String home() {
		//first change by sts....
		return "Homeeeee";
	}
	
}
