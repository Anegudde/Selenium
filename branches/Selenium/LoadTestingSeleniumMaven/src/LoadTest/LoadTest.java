package LoadTest;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class LoadTest {
 
	@Test(invocationCount = 5)
	public void loadTestThisWebsite() {
 
		WebDriver driver = new FirefoxDriver();		
		driver.get("http://www.google.com");
		System.out.println("Page Title is " + driver.getTitle());
		Assert.assertEquals("Google", driver.getTitle());
		driver.quit();
 
	}
}