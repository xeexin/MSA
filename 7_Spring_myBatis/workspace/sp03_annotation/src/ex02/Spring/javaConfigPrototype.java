package ex02.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class javaConfigPrototype {
	@Bean
	public Client client() {

		Client c = new Client();
		c.setHost("Server 2222");

		return c;
	}

}
