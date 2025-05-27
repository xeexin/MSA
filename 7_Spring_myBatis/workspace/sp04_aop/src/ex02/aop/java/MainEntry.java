package ex02.aop.java;

import java.lang.reflect.Proxy;

public class MainEntry {
	public static void main(String[] args) {
		Calc c = new CalcImpl();
		Calc proxy = (Calc) Proxy.newProxyInstance(c.getClass().getClassLoader(), // loader : 클래스 찾기
				c.getClass().getInterfaces(), // Interface : 행위(함수) 인터페이스 찾기
				new LogPrintHandlerImpl(c)); // h(andler) : 보조 업무 구현

		/*
		 * 
		 * // 클래스 통해서 실행 (*Invoke Handler 적용 X) System.out.println(c.add(3, 6));
		 * System.out.println(c.add(12, 18));
		 * System.out.println("-------------------------"); System.out.println(c.mul(5,
		 * 2));
		 * 
		 */

		// Proxy 기반 호출해야함
		System.out.println(proxy.add(3, 6));
		System.out.println(proxy.mul(2, 5));
		System.out.println(proxy.sub(20, 1, 2));

	}
}
