package ex05.di.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("ex05/di/qualifier/appCtx.xml");

		MonitorViewer viewer = ac.getBean("monitorViewer", MonitorViewer.class);
		viewer.show();
	}

}
