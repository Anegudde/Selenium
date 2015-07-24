package com.bdd.jbehave.specs;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.*;

import org.jbehave.core.junit.*;

public class StackbehaviourSteps {
    @Given("I have an empty stack")
    public void givenIHaveAnEmptyStack() {
    	//stack = new CustomStack(); }
    }

    @When("I push an item $item")
    public void whenIPushAnItem(@Named("item") String item) {
    	//stack.push(item); }
    }

    @Then("I should count $expected")
    public void thenIShouldCount(@Named("expected") int expected) {
       /* int actual = stack.count();
        if (actual != expected) 
            throw new RuntimeException("expected:"+expected+";actual:"+actual);
       */
    }
}