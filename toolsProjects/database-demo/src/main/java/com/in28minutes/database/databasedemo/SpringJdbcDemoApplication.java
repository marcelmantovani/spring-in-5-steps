package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.bean.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDAO;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDAO dao;
	
	public static void main(String[] args)  {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All person in DB - {}", dao.findAll());
		
		logger.info("User ID 10001 - {}", dao.findById(10001));
		
		logger.info("Deleting user ID 10002 - {} Rows deleted", dao.deleteById(10002));
		
		logger.info("Person left after delete DB - {}", dao.findAll());
		
		logger.info("Inserting new person - {} Rows inserted", dao.insert(new Person(10004, "Jeff", "Chicago", new Date())));
		
		logger.info("Updating 10003 - {} Rows updated", dao.update(new Person(10003, "Hans", "Chicago", new Date())));
	}
}
