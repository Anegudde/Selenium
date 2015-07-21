package test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

    @Given("^This is my first dummy step$")
    public void This_is_my_first_dummy_step() throws Throwable {
        System.out.println("Excuted the first given step.");
    }

    @When("^This is my second dummy step$")
    public void This_is_my_second_dummy_step() throws Throwable {
        System.out.println("Exceuted 2nd step.");
    }

    @Then("^This is my third dummy step$")
    public void This_is_my_third_dummy_step() throws Throwable {
        System.out.println("Excuted the third step.");
    }

}