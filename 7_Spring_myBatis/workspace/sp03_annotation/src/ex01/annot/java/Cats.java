package ex01.annot.java;

import lombok.AllArgsConstructor;

@AllArgsConstructor // for DI
public class Cats {
	private MyCats cats; // has-a

	public void setCats(MyCats cats) { // DI
		this.cats = cats;
	}

	public void getMyCatsInfo() {

		System.out.println("************************");
		System.out.println("고양이 이름 : " + cats.getName());
		System.out.println("나이  : " + cats.getAge());
		System.out.println("취미 : " + cats.getHobbies());
		System.out.println("몸무게 : " + cats.getWeight());
		System.out.println("색깔 : " + cats.getColor());
		System.out.println("************************");
	}


}
