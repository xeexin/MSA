package kr.co.mycom.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.mycom.model.BoardDTO;
import kr.co.mycom.service.BoardService;

@Controller
public class BoardController {

	@Resource
	private BoardService boardService;

	@RequestMapping("/writeform.htm")
	public String writeForm() {
		return "writeform"; // WEB-INF/views/writeform.jsp
	}

	@RequestMapping("/write.htm")
	public String write(BoardDTO dto) {
		boardService.insertBoard(dto);

		return "redirect:/list.htm";
	}

	@RequestMapping("/list.htm")
	public String list(HttpServletRequest req) {
		int pg = 1;
		String strPg = req.getParameter("pg");

		if (strPg != null) {
			pg = Integer.parseInt(strPg);
		}

		int rowSize = 3;

		int start = pg * rowSize - rowSize + 1;
		int end = pg * rowSize;

		int total = boardService.getBoardCount(); // ÃÑ °Ô½Ã¹° ¼ö

		int allPage = (int) Math.ceil((double) total / rowSize);

		int block = 10;
		int fromPage = (int) ((pg - 1) / Math.pow(block, 2)) + 1;
		int toPage = (int) ((pg - 1) / Math.pow(block, 2)) + block;

		if (toPage > allPage) {
			toPage = allPage;
		}

		HashMap map = new HashMap();
		map.put("start", start);
		map.put("end", end);

		List<BoardDTO> list = boardService.getBoardList(map);
		req.setAttribute("list", list);
		req.setAttribute("pg", pg);
		req.setAttribute("fromPage", fromPage);
		req.setAttribute("toPage", toPage);
		req.setAttribute("allPage", allPage);
		req.setAttribute("block", block);

		return "list"; // WEB-INF/views/list.jsp;

	}

	@RequestMapping("/deleteForm.htm")
	public String deleteForm(int num, int pg, Model model) {
		model.addAttribute("pg", pg);
		model.addAttribute("num", num);
		return "deleteform";
	}

	@RequestMapping("/delete.htm")
	public String delete(BoardDTO dto, int pg) {
		int result = boardService.deleteBoard(dto);
		String res = "redirect:/list.htm?pg=" + pg;
		if (result == 0)
			res = "fail";
		return res;
	}

	@RequestMapping("/updateForm.htm")
	public String updateForm(int num, int pg, Model model) {
		BoardDTO dto = boardService.getBoardByNum(num);
		model.addAttribute("dto", dto);
		model.addAttribute("pg", pg);

		return "updateform";
	}

	@RequestMapping("/update.htm")
	public String updateBoard(BoardDTO dto, int pg) {
		int result = boardService.updateBoard(dto);
		String res = "redirect:/list.htm?pg=" + pg;
		if (result == 0)
			res = "fail";
		return res;
	}

	@RequestMapping("/replyForm.htm")
	public String replyForm(int num, int pg, Model model) {
		BoardDTO dto = boardService.getBoardByNum(num);
		model.addAttribute("dto", dto);
		model.addAttribute("pg", pg); ////
		return "replyform";
	}

	@RequestMapping("/reply.htm")
	public String reply(BoardDTO dto, int pg) {
		dto.setSort(dto.getSort() + 1);
		dto.setTab(dto.getTab() + 1);

		boardService.insertReply(dto);
		return "redirect:/list.htm?pg=" + pg;
	}

	@RequestMapping("/read.htm")
	public String read(int num, int pg, Model model) {
		boardService.updateHit(num);
		BoardDTO dto = boardService.getBoardByNum(num);
		model.addAttribute("dto", dto);
		model.addAttribute("pg", pg);
		model.addAttribute("num", num);
		return "read";
	}

}
