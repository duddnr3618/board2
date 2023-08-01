package com.mysite.board2.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysite.board2.dto.BoardDTO;
import com.mysite.board2.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/save")
    public String saveForm() {
        return "save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO) {
        // DTO의 값과 form의 값이 일치하면 해당하는 setter에 자동으로 값이 매핑됩니다.
        boardService.save(boardDTO);
        return "index";
    }
    
    @GetMapping("/")
    public String findAll(Model model) {
    	
        // DB에서 전체 게시글 데이터를 가져와서 list.html에 보여준다.(BoardDTO객체가 담겨있는 List)
        List<BoardDTO> boardDTOList = boardService.findAll();
        
        //가져온 객체를 model에 담아간다.
        model.addAttribute("boardList", boardDTOList);
        return "list";
    }
}
