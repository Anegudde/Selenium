package test.java;  
   
 import static org.testng.AssertJUnit.assertThat;
import static org.hamcrest.core.Is.is;
import org.junit.runner.Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
   
 @RunWith((Class<? extends Runner>) CucumberOptions.class)  
 @Feature(value = "CarMaintenance.feature")  
 public class FuelCarTest {  
   private main.java.Car car;  
   
   @Given("^a car with (\\d*) litres of fuel in the tank$")  
   public void createCar(int initialFuelLevel) {  
     car = new main.java.Car(initialFuelLevel);  
   }  
   
   @When("^you fill it with (\\d*) litres of fuel$")  
   public void addFuel(int addedFuel) {  
     car.addFuel(addedFuel);  
   }  
   
   @Then("^the tank contains (\\d*) litres$")  
   public void checkBalance(int expectedFuelLevel) {  
     int actualFuelLevel = main.java.Car.getFuelLevel();  
     assertThat(actualFuelLevel, is(expectedFuelLevel));  
   }  
 }  