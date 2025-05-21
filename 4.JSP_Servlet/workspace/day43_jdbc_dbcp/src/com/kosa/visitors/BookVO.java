package com.kosa.visitors;

// Model
public class BookVO {
	private int num;
	private String name;
	private String email;
	private String home;
	private String contents;

	// Default Constructor  - <jsp:useBean>
	public BookVO() {

	}

	// Getter Setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

}

/*
 * num number, name varchar2(50) not null, email varchar2(50), home
 * varchar2(50), contents varchar2(2000) not null
 */
