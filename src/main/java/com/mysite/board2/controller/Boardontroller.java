package com.mysite.board2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysite.board2.dto.BoardDTO;
import com.mysite.board2.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class Boardontroller {
	private final BoardService boardService;

	@GetMapping("/board/save")
	public String saveForm () {
		
		return "save";
	}
	
	@PostMapping("board/save")
	public String save (@ModelAttribute BoardDTO boardDTO) {	
		//DTO의 값과 save의 값이 같으면 해당하는 setter에 호출하면서 담아준다 -> 하나의 dto객체로 받아준다
		
		boardService.save(boardDTO);
		
		return "index";
	}
	
}
