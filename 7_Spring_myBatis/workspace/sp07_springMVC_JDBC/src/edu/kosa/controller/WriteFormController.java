package edu.kosa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WriteFormController {

	@RequestMapping("/writeForm.bo")
	public String writeForm(Model model) {
		
		return "writeForm";
	}
}
