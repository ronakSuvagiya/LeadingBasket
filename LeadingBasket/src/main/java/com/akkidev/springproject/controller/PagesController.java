package com.akkidev.springproject.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PagesController {

	private static final Logger logger = LoggerFactory.getLogger(PagesController.class);

	@RequestMapping("/")
	public String pagesHandler(ModelAndView model) throws Exception {

		return "index";
	}
}