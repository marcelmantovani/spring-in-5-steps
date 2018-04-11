package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	

	@Around("com.in28minutes.spring.aop.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public Object around (ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		Object proceed = joinPoint.proceed(); // must use return and pass on, otherwise return of business class is lost
		long timeTaken = System.currentTimeMillis() - startTime;
		
		logger.info(" Time taken of method - {} : {} ", joinPoint, timeTaken);
		
		return proceed;
		
	}
}
