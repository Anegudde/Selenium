package bmicalculator.steps;
import java.net.URL;
import java.text.MessageFormat;

import cucumber.api.CucumberOptions;
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


public class CheckLogin_Step_Defs {

    @Before
    public void setUpLocal()  throws Throwable
    {
        
    }

    @Before
    public void setUpGrid()  throws Throwable
    {
     
        System.out.println("Starting WebDriver");
    }
	
    
	
	@Given("^I have the following order$")
	public void i_have_the_following_order() throws Throwable {
	    // 
		System.out.println("Calling the Order");
	}
	
	@When("^I enter \"([^\"]*)\" as vegetable$")
	public void i_enter_as_vegetable(String arg1) throws Throwable {
	    // 
		System.out.println(arg1);
	}
	
	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String arg1) throws Throwable {
	    //
		System.out.println(arg1);
	}

    @After
    public void tearDown()
    {
       System.out.println("Quit");
    }
}



