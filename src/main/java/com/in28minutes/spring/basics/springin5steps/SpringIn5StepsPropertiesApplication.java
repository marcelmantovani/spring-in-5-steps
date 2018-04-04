package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.in28minutes.spring.basics.springin5steps.properties.SomeExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	
	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)){
			//ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
			
			SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
			
			LOGGER.info("{}",someExternalService.returnServiceURL());
			

		}
	}
}
