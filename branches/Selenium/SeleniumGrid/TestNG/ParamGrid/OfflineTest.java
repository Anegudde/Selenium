package ParamGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OfflineTest {
    private static RemoteWebDriver driver;
    
    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capability = DesiredCapabilities.firefox();
        capability.setBrowserName("firefox");
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
        driver.get("http://techblog.polteq.com/prestashop/");
    }
    
    @Test
    public void measurePerformance() {
        driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("ipod nano");
        driver.findElement(By.cssSelector("input[name='submit_search']")).click();
        String searchHeader = driver.findElement(By.cssSelector("H1")).getText().toLowerCase();
        
        Assert.assertTrue(searchHeader.contains("ipod nano"));
    }
}
