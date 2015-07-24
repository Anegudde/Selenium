package bmicalculator.test;

import org.junit.runner.RunWith;
/*import cucumber.annotation.*;
import cucumber.annotation.en.*;*/

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		/*"pretty", 
		"html:target/cucumber-html-report",
		"json-pretty:target/cucumber-report.json"})*/
		plugin={
				"pretty",
				"html:target/cucumber-html-report",
				"tags:ios-sauce"
			   }
		)
public class RunCukesTest {

}
