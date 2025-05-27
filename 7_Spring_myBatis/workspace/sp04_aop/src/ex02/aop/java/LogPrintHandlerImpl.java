package ex02.aop.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintHandlerImpl implements InvocationHandler {
	private Object target;

	public LogPrintHandlerImpl(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) // 보조 프로그램 구현
			throws Throwable {
		System.out.println("Invoke Method Start.......................");

		// 보조 업무 구현
		Log log = LogFactory.getLog(this.getClass());

		StopWatch sw = new StopWatch();
		sw.start(); // 시간 측정 시작
		log.info("타이머 측정 시작");

		/////////////// [MAIN 관심 실행]/////////////////
		int ret = (int) method.invoke(target, args);
		//////////////////////////////////////////////

		sw.stop(); // 시간 측정 끝

		log.info("타이머 측정 종료");

		log.info("[TimeLog] method : " + method.getName());
		log.info("[TimeLog] proces time : " + sw.getTotalTimeMillis()); // 작업에 걸린 시간

		return ret;

	}

}
