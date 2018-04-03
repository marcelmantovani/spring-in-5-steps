package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.in28minutes.spring.basics.componentscan.ComponentScanDAO;



@Component
@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class SpringIn5StepsComponentscanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentscanApplication.class);
	
	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsComponentscanApplication.class)){
			//ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentscanApplication.class, args);
			ComponentScanDAO componentScanDAO = applicationContext.getBean(ComponentScanDAO.class);
	
			LOGGER.info("{}", componentScanDAO);
			LOGGER.info("{}", componentScanDAO.getComponentscanConnection());
		}
		
	}
}
