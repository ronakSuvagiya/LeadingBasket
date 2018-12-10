package com.akkidev.springproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {

	@RequestMapping("/")
	public String handler(Model model) {
		model.addAttribute("msg", "LeadingBasket");
		return "index";
	}
}