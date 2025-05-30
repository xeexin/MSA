package com.kosa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kosa.model.GiftDAO;
import com.kosa.model.GiftDTO;

@Controller
public class InsertGiftController {

	@Autowired
	private GiftDAO giftDAO;

	@RequestMapping(value = "/insertForm.bo", method = RequestMethod.GET)
	public String insertForm(Model model) {
		return "insertForm";
	}

	@RequestMapping(value = "/insertGift.bo", method = RequestMethod.POST)
	public String insert(Model model, HttpServletRequest req) {

		int gno = Integer.parseInt(req.getParameter("gno"));
		String gname = req.getParameter("gname");
		int gStart = Integer.parseInt(req.getParameter("g_start"));
		int gEnd = Integer.parseInt(req.getParameter("g_end"));

		GiftDTO dto = new GiftDTO();

		dto.setGno(gno);
		dto.setGname(gname);
		dto.setG_start(gStart);
		dto.setG_end(gEnd);

		giftDAO.insertGift(dto);

		return "redirect:giftAll.bo";
	}

}
