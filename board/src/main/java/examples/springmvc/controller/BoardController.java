package examples.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import examples.springmvc.dto.Board;
import examples.springmvc.dto.SearchCondition;
import examples.springmvc.service.BoardService;

@Controller
@RequestMapping(path = "/boards")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping
	public String getBoards(SearchCondition searchCondition, Model model) {
		model.addAttribute("list", boardService.getBoards(searchCondition));
		return "boards/list";
	}
	@GetMapping(value="/joinForm")
	public String joinForm(Model model) {
		return "boards/joinForm";
	}
	@PostMapping(value="/actionJoin")
	public String actionJoin(Board board) {
		boardService.addBoard(board);
		return "redirect:/boards";
	}
	
}
