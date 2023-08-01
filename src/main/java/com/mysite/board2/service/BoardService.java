package com.mysite.board2.service;

import org.springframework.stereotype.Service;

import com.mysite.board2.dto.BoardDTO;
import com.mysite.board2.entity.BoardEntity;
import com.mysite.board2.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

//DTO -> Entity
//Entity -> DTO 

@Service
@RequiredArgsConstructor
public class BoardService {
	
	private final BoardRepository boardRepository;
	
	public void save(BoardDTO boardDTO) {
		BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
		boardRepository.save(boardEntity);
	}
	

}
