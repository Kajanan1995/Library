package com.SpringBoot.Firstwebapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/contact")
	public String contact() {
		return "contactForm";
	}

	@RequestMapping("/ulogin")
	public String login() {
		return "userLogin";
	}

}
