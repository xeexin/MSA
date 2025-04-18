package ex03.oop;


public class TV {

	// color, channel
	// getter setter
	// 생성자 함수 - 최소 세가지 생성하기
	// 출력

	private String color;
	private int channel;

	// 생성자
	TV() {

	}

	TV(String color) {
		this.color = color;
	}

	TV(int channel) {
		this.channel = channel;
	}

	TV(String color, int channel) {
		this.channel = channel;
		this.color = color;
	}

	// getter setter

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void display() {
		System.out.printf("color : %s\nchannel : %d\n", this.color, this.channel);
	}
	
	public void disp() {
		System.out.println(channel +","+ color);
	}
	
	// toString() 함수 오버라이딩해서 사용 함! 
	public String toString() {
		String str = channel +","+ color;
		return str;
	}
	
}
