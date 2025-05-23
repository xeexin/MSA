package kr.edu.kosa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InfoController {
	
	@RequestMapping("/info")
	public String info(Model model) {

		String phone = "010-5223-9091";
		model.addAttribute("phone", phone);
		model.addAttribute("hobby", "µ¶¼­");

		return "info"; // /WEB-INF/views/info.jsp
	}
}
