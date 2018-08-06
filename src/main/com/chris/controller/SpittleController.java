package com.chris.controller;

import com.chris.service.SpittleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/Spittle/")
public class SpittleController {
	@Autowired
	SpittleService spittleService;;
	
	@RequestMapping(value = "findSpittles", method = GET)
	public String findSpittles(@RequestParam(value = "max") Long max, @RequestParam(value = "count", defaultValue = "20") int count,
		Model model) {
		model.addAttribute(spittleService.findSpittle(max, count));
		return "spittles";
	}
	
	@RequestMapping(value = "{spittleId}", method = GET)
	public String showOneSpittle(@PathVariable(value = "spittleId") Long spittleId, Model model) {
		model.addAttribute(spittleService.findOne(spittleId));
		return "spittle";
	}
}
