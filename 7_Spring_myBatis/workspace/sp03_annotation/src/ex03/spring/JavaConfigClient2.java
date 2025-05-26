package ex03.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfigClient2 {
	
	@Bean(initMethod = "connect", destroyMethod = "close")
	@Scope("prototype")
	public Client2 client2() {
		Client2 c2 = new Client2();
		c2.setHost("server!!!");

		return c2;
	}

}
