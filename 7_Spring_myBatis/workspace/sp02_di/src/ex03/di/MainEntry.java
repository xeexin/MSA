package ex03.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ex03/di/appCtx.xml");
//		ApplicationContext context = new ClassPathXmlApplicationContext("appCtx.xml");

//		IRecordViewImpl view =(IRecordViewImpl) context.getBean("view");
		IRecordViewImpl view = context.getBean("view", IRecordViewImpl.class);
		
//		view.input();
		view.print();
		
		
	

		/**
		 * JAVA IRecordImpl record = new IRecordImpl(); 
		 * IRecordViewImpl view = new
		 * IRecordViewImpl();
		 * 
		 * view.setRecord(record); view.input(); view.print();
		 */

	}

}
