package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/")
public class IndexController {

	@GetMapping("/hello")
	public String index(Model model) {
		model.addAttribute("msg","hello thymeleaf :)");
		
		return "hello";
	}

}
