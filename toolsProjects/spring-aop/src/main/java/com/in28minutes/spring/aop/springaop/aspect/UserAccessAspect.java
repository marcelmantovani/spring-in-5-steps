package com.in28minutes.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// What kind of method calls I would intercept?
	// execution (* PACKAGE.*.*(..))
	@Before("execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))")
	public void before (JoinPoint joinPoint) {
		logger.info("Check for user access");
		logger.info("User access allowed for method - {}", joinPoint);
		
	}
}
