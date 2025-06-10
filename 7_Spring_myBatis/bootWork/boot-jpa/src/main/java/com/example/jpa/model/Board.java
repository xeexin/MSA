package com.example.jpa.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
// 시퀀스의 시작값은 1
// 시퀀스의 allocationSize는 default :50이어서 1로 변경
@SequenceGenerator(name = "BOARD_SEQ_GENERATOR", sequenceName = "BOARD_SEQ", initialValue = 1, allocationSize = 1)
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOARD_SEQ_GENERATOR")
	@Column(length = 10)
	protected Integer id;

	@Column(length = 20, nullable = false)
	protected String name;

	@Column(length = 20, nullable = false)
	protected String passwd;

	@Column(length = 50, nullable = false)
	protected String title;

	@Column(length = 4000, nullable = false)
	protected String content;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP) // 날짜+시간
	protected Date regdate;

	@Column(length = 10, nullable = false)
	protected Integer readcount;

	@Column(length = 10, nullable = false)
	protected Integer reply = 0;

	@Column(length = 10, nullable = false)
	protected Integer replystep;

	@Column(length = 10, nullable = false)
	protected Integer replylevel;

}
