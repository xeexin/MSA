package ex06.di.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		String config = "classpath:ex06/di/resource/resourceCtx.xml";

		ApplicationContext ac = new GenericXmlApplicationContext(config);
//		ApplicationContext ac = new AnnotationConfigApplicationContext(config);
		
		MonitorViewer viewer = ac.getBean("viewer", MonitorViewer.class);
		

	}

}
