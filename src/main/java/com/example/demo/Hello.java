package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@RequestMapping(value="/hello")
	public String sayHello(@RequestParam(required = false) String name) {
		
		return "你好:"+name;
		
	}
}
