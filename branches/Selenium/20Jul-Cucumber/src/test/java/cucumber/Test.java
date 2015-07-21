package test.java.cucumber;

import cucumber.api.java.*;

public class Test {

	public class stepDefinition {
		   @Given("^sample feature file is ready$")
		   public void givenStatment(){
				  System.out.println("Given statement executed successfully");
		   }
		   @When("^I run the feature file$")
		   public void whenStatement(){
				  System.out.println("When statement execueted successfully");
		   }
		   @Then("^run should be successful$")
		   public void thenStatment(){
				  System.out.println("Then statement executed successfully");
		   }
		}
}
