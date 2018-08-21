package com.chris.controller;

import com.chris.entity.Spitter;
import com.chris.repository.SpitterRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

import java.util.Locale;

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
	
	/**
	 * for testing the Spring JSTL
	 * 
	 * @return direct to the registration form
	 */
	@RequestMapping(value = "register_jstl", method = RequestMethod.GET)
	public String showRegistrationFormJstl(Model model) {
		model.addAttribute(new Spitter());
		return "register_jstl";
	}
	
	@RequestMapping(value = "register_jstl", method = RequestMethod.POST)
	public String registerSpitter(@Valid Spitter spitter, Errors errors) {
        System.out.println(Locale.getDefault());
		if (errors.hasErrors()) {
			return "register_jstl";
		}
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
