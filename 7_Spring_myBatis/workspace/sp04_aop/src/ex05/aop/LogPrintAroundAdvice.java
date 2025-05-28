package ex05.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("[Around Service Invoke()]");

		// 보조 업무
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();

		sw.start();
		log.info("타이머 시작");

		///// [메인 업무]////
		Object ret = invocation.proceed(); // -> 주 관심사 함수 호출
		/////////////////

		sw.stop();
		log.info("타이머 종료");

		log.info("[TimerLog] Method : " + invocation.getMethod()); // 실행한 메서드 명칭
		System.out.println("[TimerLog] args : " + Arrays.toString(invocation.getArguments()));
		log.info("[TimerLog] Process Time : " + sw.getTotalTimeMillis()); // 실행한 메서드 명칭

		return ret;
	}

}
