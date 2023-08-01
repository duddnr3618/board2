package com.mysite.board2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysite.board2.entity.BoardEntity;

public interface BoardRepository extends JpaRepository<BoardEntity, Long>{
	

}
