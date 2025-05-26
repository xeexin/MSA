package ex01.annot.java;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MyCats {

	private String name;
	private int age;
	private ArrayList<String> hobbies;
	private double weight;
	private String color;

	// 원하는 생성자 함수도 생성 가능!
	public MyCats(String name, int age, ArrayList<String> hobbies) {
		super();
		this.name = name;
		this.age = age;
		this.hobbies = hobbies;
	}

}
