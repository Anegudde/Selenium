package com.gaurang.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Gaurang_Shah1 on 25/04/15.
 */
public class HomePage {

    WebDriver driver = new FirefoxDriver();

    @When("^I search \"(.*?)\"$")
    public void i_search(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://en.wikipedia.org");

        WebElement search_box = driver.findElement(By.id("searchInput"));
        search_box.sendKeys(arg1);
        search_box.submit();
    }

    @Then("^I should get \"(.*?)\" on page$")
    public void i_should_get_on_page(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        Assert.assertTrue(driver.findElement(By.xpath("//body")).getText().contains(arg1));
    }
}
