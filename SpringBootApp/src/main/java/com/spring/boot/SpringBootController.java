package com.spring.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
	@RequestMapping("/hello")
	String helloWorld(){
		return "Hello-World";
	}
	
	

}
