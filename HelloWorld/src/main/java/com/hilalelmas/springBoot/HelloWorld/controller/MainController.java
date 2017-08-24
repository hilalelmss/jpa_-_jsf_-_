package com.hilalelmas.springBoot.HelloWorld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@RequestMapping(path = "/main")
@RestController
public class MainController {

	// @GetMapping(path = "/hello")
	// @ResponseBody
	@RequestMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}

}
