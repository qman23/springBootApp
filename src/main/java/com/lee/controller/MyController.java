package com.lee.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class MyController {
	
	@RequestMapping("/")
	@ResponseBody
	String hello(){
		return "hello, spring boot!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MyController.class, args);
	}
}
