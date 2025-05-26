package ex03.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(JavaConfigClient2.class);

		Client2 c = acac.getBean("client2", Client2.class);
		Client2 c2 = acac.getBean("client2", Client2.class);

		c.send();

		System.out.println(c.hashCode());
		System.out.println(c2.hashCode());

		acac.close();
	}
}
