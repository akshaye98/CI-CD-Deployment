package com.spring.deployment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
@RequestMapping("/home")
public String getname() {
	return "home page works";
}
}
