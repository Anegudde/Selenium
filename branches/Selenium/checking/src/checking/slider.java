package checking;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class slider {

	   private static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /*
		    * From https://jqueryui.com/slider/
		    * https://stackoverflow.com/questions/11138449/how-to-move-horizontal-slider-or-vertical-slider-of-jquery-using-selenium-webdri
		    */
			//		   WebDriver driver = new ChromeDriver();
		    
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikram.uk\\workspace\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			//driver.get("http://jqueryui.com/demos/slider/");
			driver.get("https://jqueryui.com/resources/demos/slider/slider-vertical.html");
			try
			{
				 //Identify WebElement
				 WebElement slider = driver.findElement(By.cssSelector("html body div#slider-vertical.ui-slider.ui-slider-vertical.ui-widget.ui-widget-content.ui-corner-all")); //"//div[@id='slider']/a"));		
				 Actions builder = new Actions(driver);
				 //Action dragAndDrop = builder.clickAndHold(slider).moveToElement(slider).release(slider).build();
				 Action dragAndDrop = builder.clickAndHold(slider).moveByOffset(0,200).release().build();
				 dragAndDrop.perform();
				 takeScreenShot("StringPass");
	//			 //Using Action Class
	//			 Actions move = new Actions(driver);
	//			 Action action = move.dragAndDropBy(slider,90, 45).build();
	//			 action.perform();
			
			 } catch (RuntimeException e){
				 takeScreenShot("StringError");
				 driver.close();
			 } 
			 
	}
	private static void takeScreenShot(String fileName)//RuntimeException e, ) 
		{
	    File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    try {
	        FileUtils.copyFile(screenShot, new File(fileName + ".png"));
	    } catch (IOException ioe) {
	        //throw new RuntimeException(ioe.getMessage(), ioe);
	    }
	    //throw e;
	}
}
