package ex05.di.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ex06.di.resource.Recorder;

public class MonitorViewer {
	private Recorder recorder; // has-a
	
//	@Inject
//	@Autowired(required = false) // default : required=true
//	public MonitorViewer(@Qualifier("key") Recorder recorder) {
//		this.recorder = recorder;
//		System.out.println("@Autowired 자동 주입");
//	}

	@Autowired
//	@Qualifier("recorder3") //id 사용하려면 xml에 qualifier 없어야 함!
//	@Qualifier("rr1")
//	@Qualifier("cord")  
	public void setRecorder(@Qualifier("key                                                                      ") Recorder recorder) {
		this.recorder = recorder;
		System.out.println("setRecorder method call!!");
	}

	public void show() {
		recorder.show();
		System.out.println("MonitorViewr class show method call~");
	}

}
