package ex04.di.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {

	//1. 필드에 적용
	//@Autowired
	private Recorder recorder; // has-a

	public Recorder getRecorder() {
		return recorder;
	}

	// 2. Setter Method를 통한 자동 주입
//	@Autowired
//	public void setRecorder(Recorder recorder) { // DI
//		this.recorder = recorder;
//	}

	//3. 일반 메서드를 통한 자동 주입
//	@Autowired
	public void userMethod(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("사용자(일반) 메서드 이용한 자동 주입.");
	}

	//4. 생성자 함수를 통한 자동 주입
	@Autowired
	public MonitorViewer(Recorder recorder) {
		this.recorder = recorder;
		System.out.println("나는 생성자 함수 이용한 자동 주입.");

	}
	
//	public MonitorViewer() {
//	}

	public void print() {
		System.out.println("User Method 주입 : " + this.recorder);
		System.out.println("Setter Method");
		recorder.show();
	}
}
