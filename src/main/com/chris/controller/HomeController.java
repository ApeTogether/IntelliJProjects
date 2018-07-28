package com.chris.controller;

import com.chris.repository.SpitterRepository;
import com.chris.repository.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.bind.annotation.XmlType;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @Auther Chris Lee
 * @Date 7/26/2018 14:36
 * @Description
 */
@Controller
@RequestMapping("/home/")
public class HomeController {
	


	/*
	 * @RequestMapping(value = "sayHello", method = GET) public String home() { return "sayHello"; }
	 */
	
	@RequestMapping(value = "sayHello/", method = GET)
	public String home() {
		return "sayHello";
	}
	


}
