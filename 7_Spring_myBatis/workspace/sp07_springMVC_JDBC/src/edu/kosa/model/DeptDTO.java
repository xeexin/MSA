package edu.kosa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// MODEL : ~VO, ~DTO, ~TO

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeptDTO {
	private int deptno;
	private String dname, loc;

}

/*
 * DEPTNO NOT NULL NUMBER(2) DNAME VARCHAR2(14) LOC VARCHAR2(13)
 * 
 */