package com.examples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping(value = "/Home")
public class HomeController {
	@RequestMapping({"/", "/home"}) // / or /home
	public String  showHomePage() {
		return "home"; // logical view name
	}
}
