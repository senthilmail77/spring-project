package com.madrone.springapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.madrone.springapp.forms.LoginForm;

@Controller
public class LandingPageController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String loadFormPage(Model m) {
		m.addAttribute("LoginForm", new LoginForm());
		return "login";
	}
}
