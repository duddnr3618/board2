package com.mysite.board2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mysite.board2.dto.BoardDTO;
import com.mysite.board2.entity.BoardEntity;
import com.mysite.board2.repository.BoardRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

//DTO -> Entity
//Entity -> DTO 

@Service
@RequiredArgsConstructor
public class BoardService {
	
	private final BoardRepository boardRepository;
	 
	public void save(BoardDTO boardDTO) {
		//DTO 객체를 Entity객체로 옮겨 담는다
		BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
		boardRepository.save(boardEntity);
	}
	
	
	    public List<BoardDTO> findAll() {
	        List<BoardEntity> boardEntityList = boardRepository.findAll();
	      //Entity로 넘어온 객체를 DTO객체로 다시 옮겨 담아서 컨드롤러로 리턴
	        List<BoardDTO> boardDTOList = new ArrayList<>();
	    	//Entity객체를 DTO객체로 옮겨 담는다
	        for (BoardEntity boardEntity: boardEntityList) {
	            boardDTOList.add(BoardDTO.toBoardDTO(boardEntity));
	        }
	        return boardDTOList;
	}
}
