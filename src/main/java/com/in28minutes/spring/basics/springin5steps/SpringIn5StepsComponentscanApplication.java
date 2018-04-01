package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.spring.basics.componentscan.ComponentScanDAO;



@SpringBootApplication
@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class SpringIn5StepsComponentscanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentscanApplication.class);
	
	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentscanApplication.class, args);
		ComponentScanDAO componentScanDAO = applicationContext.getBean(ComponentScanDAO.class);

		LOGGER.info("{}", componentScanDAO);
		LOGGER.info("{}", componentScanDAO.getComponentscanConnection());
		
		
	}
}
