package ex06.di.resource;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;

public class MonitorViewer {

	private Recorder recorder;

	@Resource @Qualifier("y")  //@Qualifier 같이 사용 가능
//	@Resource(name = "r3" ) // id에 있는 값으로 찾는다.
//	@Resource(name = "x" ) // name에 있는 값으로 찾는다.
	public void setRecorder(Recorder recorder) {
		this.recorder = recorder;
		
		recorder.show();
		System.out.println(recorder);
		System.out.println("@Resource 주입");
	}

}
