package kr.co.mycom.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {
	// Model
	private int num;
	private String name, email, pwd, subject, content;
	private Date regdate;
	private int hit, parent, sort, tab;  //조회수, 원글, 답글, 답답글
}
