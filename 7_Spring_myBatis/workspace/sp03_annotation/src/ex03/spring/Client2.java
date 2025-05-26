package ex03.spring;

public class Client2 { // implements DisposableBean, InitializingBean

	private String host;

	public void setHost(String host) { // DI
		this.host = host;
	}

	public void connect() throws Exception {
		System.out.println("Client2.connect() 실행 - 초기화 메서드");
	}

	public void send() {
		System.out.println("Client2.send() 실행 : " + host);
	}

	public void close() throws Exception {
		System.out.println("Client2.close() 실행 - 소멸 메서드");
	}

}
