package ex02.Spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Client implements DisposableBean, InitializingBean {

	private String defaultHost;
	private String host;

	public Client() {
		System.out.println("Client Default Constructor");

	}

	// Constructor ID
	public Client(String defaultHost) {
		System.out.println("Client Constructor : " + this.defaultHost);

	}

	// Setter DI
	public void setHost(String host) {
		this.host = host;
	}

	public void send() {

//		<property name="host" value="서버">
		System.out.println("Client.send() to : " + host);
	}

	// 초기화 메서드 (이벤트를 내부적으로 가지고 자동 호출 : 호출 시점)
	// InitializingBean 구현부
	// afterPropertiesSet : property
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Client.afterPropertiesSet() 실행");
	}

	// 소멸 메서드(이벤트를 내부적으로 가지고 자동 호출 : 호출 ㅅ점)
	// DisposableBean 대한 구현부
	@Override
	public void destroy() throws Exception {
		System.out.println("Client.destroy() 실행");

	}

}
