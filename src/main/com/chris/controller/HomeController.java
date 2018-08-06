package com.chris.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @Auther Chris Lee
 * @Date 7/26/2018 14:36
 * @Description
 */
@Controller
@RequestMapping("/home/")
public class HomeController {
	

    @Value("${version}")
    private String version;

	/*
	 * @RequestMapping(value = "sayHello", method = GET) public String home() { return "sayHello"; }
	 */
	
	@RequestMapping(value = "sayHello/", method = GET)
	public String home(Model model) {
        model.addAttribute(version);
		return "sayHello";
	}
	


}
