package Quiz;

import java.util.Scanner;

public class Customer {
	// 고객 번호, 이름, 주소, 전화번호 필드
	// 생성자 함수, getter setter method

	int customerNum = 0;
	String name;
	String address;
	String phone;

	// constructor

	Customer(String name, String address, String phone) {
		customerNum++;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}


	
	
	// toString
	@Override
	public String toString() {
		return "Customer [num=" + customerNum + ", name=" + name + ", address=" + address + ", phone=" + phone + "]\n";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
