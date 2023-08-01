package com.mysite.board2.entity;

import com.mysite.board2.dto.BoardDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

//DB의 테이블을 연할을 하는 테이블
@Entity
@Data
@Table (name = "board_table")	//테이블이라는 어노테이션으로 DB에 테이블을 생성
public class BoardEntity extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 20 , nullable = false)	//크기 20 , not null
	private String boardWriter;
	
	@Column
	private String boardPass;
	
	@Column
	private String boardTitle;
	
	@Column (length = 500)
	private String boardContents;
	
	@Column
	private int boardHits;
	
	
	public static BoardEntity toSaveEntity (BoardDTO boardDTO) {
		BoardEntity boardEntity = new BoardEntity ();
		boardEntity.setBoardWriter(boardDTO.getBoardWriter());
		boardEntity.setBoardPass(boardDTO.getBoardPass());
		boardEntity.setBoardTitle(boardDTO.getBoardTitle());
		boardEntity.setBoardContents(boardDTO.getBoardContents());
		boardEntity.setBoardHits(0);
		
		return boardEntity;
	}
	
	
}
