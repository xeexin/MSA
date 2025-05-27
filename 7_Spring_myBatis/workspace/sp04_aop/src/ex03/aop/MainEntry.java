package ex03.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		String config = "classpath:ex03/aop/appCtx.xml";

		ApplicationContext ac = new ClassPathXmlApplicationContext(config);

		// Proxy 만들고 객체를 넘긴다. 필요한 객체 생성 작업은 XML에 설정했음.
		Calc proxy = ac.getBean("proxy", Calc.class);

		System.out.println(proxy.add(1, 2));
		System.out.println(proxy.sub(10, 1, 2));
		System.out.println(proxy.mul(15,12));
	}
}
