package com.pack.two;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestA {
	
	@BeforeClass
	public void setUp() {
		System.out.println("*** In class - Test A ***");
	}

	@Test
	public void testOne() {
		System.out.println("hello");
	}
	
	@Test
	public void testTwo() {
		System.out.println("hello");
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("*** End of class***");
	}
}