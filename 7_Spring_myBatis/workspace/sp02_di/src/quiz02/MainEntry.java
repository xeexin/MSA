package quiz02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex04.di.MyBean;

public class MainEntry {
	public static void main(String[] args) {

		ApplicationContext ac = new GenericXmlApplicationContext("/quiz02/appCtx.xml");

		StudentPersonImpl student = ac.getBean("student", StudentPersonImpl.class);
		WorkerPersonImpl worker = ac.getBean("worker", WorkerPersonImpl.class);
		
		student.input();
		student.output();
		
		
		System.out.println("-------------------------");
		
		worker.input();
		worker.output();
	}
}
