package com.onesoft.finaldemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinaldemoController {
	
	@GetMapping("open")
	public String getMsg() {
		return "Hi Developer";
	}

}
