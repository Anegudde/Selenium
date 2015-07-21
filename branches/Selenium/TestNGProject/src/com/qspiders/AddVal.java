package com.qspiders;

import org.junit.Ignore;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qspiders.Operator;


public class AddVal {
	
	@Test
	public void firstTest() {
		System.out.println("First Test");
	}
	//Ignoring a test in TestNG
	@Test
	public void secondTest(){
		System.out.println("Second Test");
	}
	@Ignore
	public void thirdTest(){
		System.out.println("Third Test");
	}
	
	

}