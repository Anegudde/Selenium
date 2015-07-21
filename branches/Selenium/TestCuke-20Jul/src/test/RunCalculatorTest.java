package test;

import cucumber.api.CucumberOptions;

@RunWith(CucumberOptions.class)
@CucumberOptions(
//        format = { "pretty", "html:target/cucumber" },
//        glue = "com.czeczotka.bdd.steps",
        features ={ "classpath:resource/calculator.feature",
        		"html:target/cucumber-html-report", 
        		"json:target/cucumber-json-report.json",
        		 },
        plugin={"pretty", "html:target/cucumber-html-report"},
	    tags= "@smokeTest"
)
public class RunCalculatorTest {
	
	
}
