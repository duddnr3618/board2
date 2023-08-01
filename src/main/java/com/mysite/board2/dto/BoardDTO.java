package com.mysite.board2.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

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
}
