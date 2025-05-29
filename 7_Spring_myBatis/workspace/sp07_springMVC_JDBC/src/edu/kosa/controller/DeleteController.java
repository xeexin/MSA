package edu.kosa.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.kosa.model.DeptDAO;

@Controller
public class DeleteController {

	@Autowired
	private DeptDAO deptDAO;

	@RequestMapping(value = "/deleteForm.bo", method = RequestMethod.GET)
	public String DeleteForm(Model model) {

		return "deleteForm";
	}

	@RequestMapping(value = "/deleteForm.bo", method = RequestMethod.POST)
	public String delete(Model model, HttpServletRequest req) {

		int deptno = Integer.parseInt(req.getParameter("deptno"));

		deptDAO.deleteDept(deptno);

		return "redirect:list.bo";
	}
}
