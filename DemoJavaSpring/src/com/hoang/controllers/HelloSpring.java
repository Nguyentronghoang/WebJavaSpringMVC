package com.hoang.controllers;

import javax.servlet.annotation.WebServlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hoang.model.UserInfo;

@Controller

public class HelloSpring {
	@RequestMapping(value = "input")
	public String showForm(ModelMap model) {
		model.addAttribute("user", new UserInfo());
		return "HelloInput";
	}

	@RequestMapping(value = "hello")
	public String sayHello(@ModelAttribute("user") UserInfo user) {
		return "HelloSuccess";
	}

}
