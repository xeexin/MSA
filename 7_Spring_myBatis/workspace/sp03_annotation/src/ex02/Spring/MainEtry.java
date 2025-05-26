package ex02.Spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainEtry {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(javaConfigPrototype.class);

		Client client = acac.getBean("client", Client.class);
		client.setHost("¼­¹ö¾ß");
		client.send();

		Client client2 = acac.getBean("client", Client.class);
		client2.setHost("DefaultHost");
		client2.send(); 

		System.out.println(client.hashCode());
		System.out.println(client2.hashCode());
	}
}
