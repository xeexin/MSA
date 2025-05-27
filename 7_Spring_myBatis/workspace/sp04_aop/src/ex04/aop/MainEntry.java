package ex04.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ex04/aop/ctx.xml");

		IMessageBean msg = ac.getBean("messageBeanImpl", IMessageBean.class);
		msg.sayHello();
		System.out.println("--------------------");
		msg.engHello();

		System.out.println("\n\n");

		IBookBean book = ac.getBean("bookBeanImpl", IBookBean.class);
		book.testHello("MSA2");
		book.korHello();

	}

}
