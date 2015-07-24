package bmicalculator.steps;
import java.net.URL;
import java.text.MessageFormat;
import java.util.Map;

import cucumber.api.CucumberOptions;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

import org.junit.*;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class CucumberDatatabale_Step_def {

@Given("^I enter \"([^\"]*)\" as Username \"([^\"]*)\"$")
public void i_enter_as_Username(String arg1, String arg2, DataTable table) throws Throwable {
	  
		for (Map<String, String> map : table.asMaps(String.class,String.class))
		{
	        String user = map.get("Vikram");              
	        System.out.println("Order of {1} "+"" +user);
	    }		
	    throw new PendingException();
	}

@Given("^I enter my name as \"([^\"]*)\" for the login$")
public void i_enter_my_name_as_for_the_login(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see all \"([^\"]*)\" names$")
public void i_should_see_all_names(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

}



