package com.gaurang;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**

 */
public class RunAllTests {
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		
	}
		
	@RunWith(Cucumber.class)
	@CucumberOptions
		(				
				strict= true,
				glue= "com.gaurang",
				monochrome = true,
				plugin={"pretty", "html:target/cucumber-html-report"},
				//features="src/test/resources/com/gaurang"
				features="src/test/java/com/gaurang/features"
		)

	public class CucumberRunner {
		
	}
}