package com.qspiders;

import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void firstTest() {
		System.out.println("First Test");
	}
	//Ignoring a test in TestNG
	@Test
	public void secondTest(){
		System.out.println("Second Test");
	}
	@Test
	public void thirdTest(){
		System.out.println("Third Test");
	}
}
