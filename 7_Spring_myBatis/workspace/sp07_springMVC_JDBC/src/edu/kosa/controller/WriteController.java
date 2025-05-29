package edu.kosa.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.kosa.model.DeptDAO;
import edu.kosa.model.DeptDTO;

@Controller
public class WriteController {

	@Autowired
	private DeptDAO deptDAO;

	@RequestMapping(value = "/writeForm.bo", method = RequestMethod.GET)
	public String writeForm(Model model) {

		return "writeForm";
	}

	@RequestMapping(value = "/write.bo", method = RequestMethod.POST)
	public String write(Model model, HttpServletRequest req) throws UnsupportedEncodingException {

//		req.setCharacterEncoding("UTF-8");
		int no = Integer.parseInt(req.getParameter("deptno"));
		String name = req.getParameter("dname");
		String loc = req.getParameter("loc");

//		System.out.println(no + ", " + name + ", " + loc);

		// DB Save
		DeptDTO dto = new DeptDTO();

		dto.setDeptno(no);
		dto.setDname(name);
		dto.setLoc(loc);

		deptDAO.insertDept(dto);

		return "redirect:list.bo";

	}

}
