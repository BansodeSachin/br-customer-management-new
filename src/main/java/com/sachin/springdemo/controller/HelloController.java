package com.sachin.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@GetMapping("/hello") 
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}
	@RequestMapping("Check")
	public String CheckPage()
	{
		return "new update checking. good...Its Working";
	}
}
