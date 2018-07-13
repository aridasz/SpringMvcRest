package com.application.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class Hello {  


	@RequestMapping(value = "/")
	public String index() {
		return "<h1>Welcome !!! </h1>";
	}
	
	
	@RequestMapping(value = "/api/json/{paramval}")
	public @ResponseBody String api1(@PathVariable String paramval) {
		return "{\"success\":\"" + paramval + "\"}";
	}
		
}