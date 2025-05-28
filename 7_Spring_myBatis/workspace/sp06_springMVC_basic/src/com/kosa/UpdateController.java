package com.kosa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UpdateController {

	@RequestMapping("/update")
	public String update(Model model) {

		String name = "강감찬";
		model.addAttribute("name", name);
		model.addAttribute("update", "UPDATE 입니다.");

		return "update";

	}

}
