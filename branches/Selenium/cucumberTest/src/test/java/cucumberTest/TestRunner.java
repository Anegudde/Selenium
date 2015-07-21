package cucumberTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

public class TestRunner {

	@BeforeClass
	public static void TestStart()
	{
		System.out.println("Hi");
	}
	
	
	@Test
	public void test() {

		
	}
	
//	@AfterClass
//	public static void TestEnd()
//	{
//		System.out.println("Bye");	
//		
//	}	
//	
	
	@RunWith(Cucumber.class)
	@CucumberOptions
			(
			    plugin={"pretty", "html:target/cucumber-html-report"},
			    tags= "@smokeTest"
			)	
	public class CucumberRunner {
		
		
	}
}
