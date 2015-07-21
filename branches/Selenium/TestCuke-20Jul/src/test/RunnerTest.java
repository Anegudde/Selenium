package test;


import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
Cucumber.Options(
        features= {
        		"html:target/cucumber-html-report", 
        		"json:target/cucumber-json-report.json"}
        )


public class RunnerTest {

}