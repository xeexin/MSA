package com.kosa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kosa.model.GiftDAO;

@Controller
public class GiftAllController {

	@Autowired
	private GiftDAO giftDAO;

	@RequestMapping("/giftAll.bo")
	public String selectAll(Model model) {
		List list = giftDAO.GiftAll();

		model.addAttribute("list", list);
		return "allGift"; // allGift.jsp
	}

}
