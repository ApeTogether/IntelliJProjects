package com.chris.controller;

import com.chris.entity.Spitter;
import com.chris.repository.SpitterRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @Auther Chris Lee
 * @Date 8/21/2018 12:02
 * @Description
 */
@Controller
@RequestMapping("/spitter/")
public class SpitterController {
	
	@Autowired
	private SpitterRepository spitterRepository;
	
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String showRegistrationForm() {
		return "register";
	}
	
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String registerSpitter(Spitter spitter) {
		spitterRepository.save(spitter);
		return "redirect:/spitter/" + spitter.getUserName();
		
	}
	
	@RequestMapping(value = "{userName}", method = GET)
	public String showSpitterProfile(@PathVariable(value = "userName") String userName, Model model) {
		if (StringUtils.isNotEmpty(userName)) {
			Spitter spitter = spitterRepository.findByUsername(userName);
            model.addAttribute(spitter);
		}
		return "profile";
	}
	
}
