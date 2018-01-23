package com.springweb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {

	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public ModelAndView greet() {

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("person", "Max");

		modelAndView.setViewName("hello");

		return modelAndView;
	}
}
