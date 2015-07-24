package com.bdd.jbehave.sample;

/*
* http://ivanz.com/2011/05/25/java-bdd-with-jbehave-and-watij-in-eclipse-with-junit/
*/
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.jbehave.core.annotations.Then;

public class Search extends Sample {
 
    @When("I open '$page'")
    public void whenIOpen(String page)
    {
        System.out.println("Open");
    	//WebBrowser.open(page).pauseUntilReady();
    }
 
    @When("I click on the '$buttonText' button")
    public void whenIClickOnTheButton(String buttonText)
    {
    	System.out.println("Text");
    	/*
    	Tag button = WebBrowser.find.button().with.name("search");
        assertNotNull(button);
        button.click().pauseUntilReady();*/
    }
 
    @Then("I should see an error")
    public void thenIShouldSeeAnError(){
    	System.out.println("Check");
        /*
        Tag errorDialogTitleDiv = WebBrowser.find.span().with.className("dijitDialogTitle");
        assertNotNull(errorDialogTitleDiv);
        assertEquals("Error", errorDialogTitleDiv.get.innerHTML());
        */
    }
}