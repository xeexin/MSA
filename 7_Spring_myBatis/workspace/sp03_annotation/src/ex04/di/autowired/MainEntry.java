package ex04.di.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("ex04/di/autowired/autowiredCtx.xml");

		
		MonitorViewer viewer = ac.getBean("monitorViewer", MonitorViewer.class);
		
		viewer.print();
		
	}

}
