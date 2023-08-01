package com.mysite.board2.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.mysite.board2.entity.BoardEntity;

import lombok.Data;

//DTO (data transfer object) : data를 주고 받을때 하나의 객체에 담아서 보내준다
@Data
public class BoardDTO {

	private Long id;
	private String boardWriter;	//작성자
	private String boardPass;	//비밀번호
	private String boardTitle;	//제목
	private String boardContents;	//내용
	private int boardHits;	//조회수
	private LocalDateTime boardCreateTime;	//작성시간
	private LocalDateTime boardUpdatedTime;	//업데이트 시간
	
	//Entity 를 DTO에 옮겨 담는다.
	public static BoardDTO toBoardDTO(BoardEntity boardEntity) {
		BoardDTO boardDTO = new BoardDTO();
		
		boardDTO.setId(boardEntity.getId());
		boardDTO.setBoardWriter(boardEntity.getBoardWriter());
		boardDTO.setBoardPass(boardEntity.getBoardPass());
		boardDTO.setBoardTitle(boardEntity.getBoardTitle());
		boardDTO.setBoardContents(boardEntity.getBoardContents());
		boardDTO.setBoardHits(boardEntity.getBoardHits());
		boardDTO.setBoardCreateTime(boardEntity.getCreateTime());
		boardDTO.setBoardUpdatedTime(boardEntity.getUpdatedTime());
		
		return boardDTO;
		
	}
	
	
}
