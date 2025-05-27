package ex03.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintHandlerImpl implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Invoke Method start....................");

		// 보조 업무
		Log log = LogFactory.getLog(this.getClass());

		StopWatch sw = new StopWatch();
		sw.start(); // 시간 측정 시작
		log.info("타이머 측정 시작");

		/////////////// [메인 관심사 업무]//////////////////////
		Object ret = invocation.proceed();
		//////////////////////////////////////////////

		sw.stop(); // 시간 측정 끝

		log.info("타이머 측정 종료");

		log.info("[TimeLog] method : " + invocation.getMethod()); // 실행한 메소드 명칭
		log.info("[TimeLog] proces time : " + sw.getTotalTimeMillis()); // 작업에 걸린 시간

		return ret;
	}

}
