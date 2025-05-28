package ex05.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("ex05/aop/appCtx.xml");

		ICalc proxyCalc = ac.getBean("proxy", ICalc.class);
		System.out.println(proxyCalc.add(3, 4));
		System.out.println(proxyCalc.mul(7, 9));
//		System.out.println(proxyCalc.sub(20, 9, 2));
		System.out.println(proxyCalc.sub(2, 9, 2)); //예외 발생 코드

	}
}
