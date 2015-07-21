package test.java.cucumberTest;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

public class TestRunner {

	@BeforeClass
	public static void TestStart()
	{
		System.out.println("Hi");
	}
	
	
	public void test() {
		System.out.println("Hi");
		
	}
	
	@org.testng.annotations.AfterClass
	public static void TestEnd()
	{
		System.out.println("Bye");	
		
	}	
	
	
	@RunWith(CucumberRunner.class)
	@CucumberOptions
			(
			    plugin={"pretty", "html:target/cucumber-html-report"},
			    tags= "@smokeTest"
			)	
	public class CucumberRunner {
		
		
	}
}
