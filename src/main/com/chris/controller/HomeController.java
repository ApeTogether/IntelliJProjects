package com.chris.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @Auther Chris Lee
 * @Date 7/26/2018 14:36
 * @Description
 */
@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping(value = "sayHello" , method = GET)
	public String home() {
		return "sayHello";
	}
	
}
