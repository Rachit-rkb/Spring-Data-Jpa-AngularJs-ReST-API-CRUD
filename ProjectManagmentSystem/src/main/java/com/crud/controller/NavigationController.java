package com.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class NavigationController {

	@RequestMapping(value={"/","index"})
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
}
