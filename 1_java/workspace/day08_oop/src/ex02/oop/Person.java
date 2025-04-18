package ex02.oop;

class Person {
	private String name;
	private int age;
	private String number;

	// 자동화 alt + shift + s

	public void setAll(String newName, int newAge, String newNumber) {
		name = newName;
		age = newAge;
		number = newNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	// display()
	public void display() {
		System.out.printf("이름 : %s, 나이 : %d, 전화번호 : %s\n", name, age, number);
	}

}