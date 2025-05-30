package com.kosa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kosa.model.GiftDAO;

@Controller
public class DeleteGiftController {

	@Autowired
	private GiftDAO giftDAO;

	@RequestMapping(value = "deleteForm.bo", method = RequestMethod.GET)
	public String deleteForm(Model model) {
		return "deleteForm";
	}

	@RequestMapping(value = "deleteGift.bo", method = RequestMethod.POST)
	public String deleteGift(Model model, HttpServletRequest req) {
		
		int gno = Integer.parseInt(req.getParameter("gno"));
		
		giftDAO.deleteGift(gno);

		return "redirect:giftAll.bo";
	}
}
