package com.itc475.HelloApache.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String hello_B() {
		return "hello-form";
		
	}

}
