package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath myMath = new MyMath();
	
	@Before
	public void before() {
		System.out.println("Executed before each test");
	}
	@After
	public void afer() {
		System.out.println("Executed after each test");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Executed once per test class - before all");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Executed once per test class - after everything");
	}
	
	@Test
	void sum_with3numbers() {
		assertEquals(6, myMath.sum(new int [] {1, 2, 3}));
	}
	
	@Test
	void sum_with1number() {
		
		assertEquals(3, myMath.sum(new int [] {3}));
	}

}
