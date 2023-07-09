package javaot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
	@RequestMapping("/home")
	public String showHomePage() {
		// default point to webapp
		return "homepage";
	}
}