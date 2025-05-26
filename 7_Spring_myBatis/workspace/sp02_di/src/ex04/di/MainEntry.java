package ex04.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		/*
		 * 자바 기반 코드
		 * 
		 * MyBean mybean = new MyBean(); MyBean mybean2 = new MyBean("heejin"); MyBean
		 * mybean3 = new MyBean();
		 * 
		 * System.out.println(mybean + ", " + mybean2 + ", " + mybean3);
		 * System.out.println(mybean.hashCode() + ", " + mybean2.hashCode() + ", " +
		 * mybean3.hashCode());
		 * 
		 * // singleton Singleton single = Singleton.getInstance(); Singleton single2 =
		 * Singleton.getInstance(); Singleton single3 = Singleton.getInstance();
		 * 
		 * System.out.println("\n----------[Singleton]------------");
		 * System.out.println(single + ", " + single2 + ", " + single3);
		 * System.out.println(single.hashCode() + ", " + single2.hashCode() + ", " +
		 * single3.hashCode());
		 */

		ApplicationContext context = new GenericXmlApplicationContext("/ex04/di/applicationContext.xml");

		MyBean mybean = (MyBean) context.getBean("myBean");
		MyBean mybean2 = context.getBean("myBean2", MyBean.class);
		MyBean mybean3 = context.getBean("obj", MyBean.class);
		System.out.println(mybean);
		System.out.println(mybean2);
		System.out.println(mybean3);

//		ex04.di.MyBean@fbd1f6
//		ex04.di.MyBean@1ce24091
//		ex04.di.MyBean@fbd1f6

		// Singleton
		System.out.println("\n-------------[Singleton]--------------");
		Singleton s = context.getBean("single", Singleton.class);
		Singleton s2 = context.getBean("single", Singleton.class);
		System.out.println(s + ", " + s2);
		// ex04.di.Singleton@5dda768f
		// ex04.di.Singleton@5dda768f
		
		
		/**
		 	getBean()
		 	- 컨테이너 안에 있는 객체를 리턴 (new 아님)
		 	- return type은 Default가 Object이다. -> 타입에 맞는 형변환 필요
		 	- 스프링 컨테이너 안에 객체들은 default singleton 패턴을 따라감
		 	- 예외적으로 getBean()이 new 라고 할 수 있다. 그러나 거의 쓰지 않음.
		 */

	}
}
