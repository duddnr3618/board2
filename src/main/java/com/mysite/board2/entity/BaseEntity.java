package com.mysite.board2.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public class BaseEntity {

	@CreationTimestamp		//게시물 생성 시간
	@Column(updatable = false)
	private LocalDateTime createTime;
	
	@UpdateTimestamp	//게시물 업데이트 시간
	@Column(insertable = false)
	private LocalDateTime updatedTime;
	
	
	
	
}
