package com.examples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping({"/", "/home"}) // /Pay/ or /Pay/home
	public String  showHomePage() {
		return "home"; // logical view name
	}
}
