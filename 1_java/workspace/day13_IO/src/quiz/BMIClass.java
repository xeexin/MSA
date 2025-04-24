package quiz;

/**
 * 문제] 비만도 측정 프로그램 작성 - collection, file, io 이용하기 추가 / 삭제 / 출력 / 수정 / 저장 처리할것
 * 
 * 이름/성별/키/몸무게/BMI지수 받을 변수
 * 
 * 몸무게, 키를 입력 받아서 BMI 계산하기 BMI = 몸무게 / ( (키 / 100.0) * (키 / 100.0) );
 * 
 * 남 : (신장cm - 100) X 0.9 여 : (신장cm - 100) X 0.85 - 판정> 18.5 미만 저체중 18.5 ~ 22.9
 * 정상 23.0 ~ 24.9 과체중 25.0 이상 비만
 * 
 * 결과] 이도연님 저체중이시네요. 살 좀 찝시다. OOO님 과체중이십니다. 그만 먹자! XXX님 정상이시네요. 유지하세요!!
 * 
 * 문제] 비만도 측정 프로그램 작성 - collection, file, io 이용하기 추가 / 삭제 / 출력 / 수정 / 저장 처리할것
 */


public class BMIClass {

	String name;
	Boolean gender;
	double height;
	double weight;
	String ret;

	public BMIClass(String name, Boolean gender, double height, double weight, String ret) {
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.ret = ret;

	}

	//getter setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getRet() {
		return ret;
	}

	public void setRet(String ret) {
		this.ret = ret;
	}

	@Override
	public String toString() {
		return "BMIClass [name=" + name + ", gender=" + gender + ", height=" + height + ", weight=" + weight + ", ret="
				+ ret + "]";
	}
	
	
	
	
	

}
