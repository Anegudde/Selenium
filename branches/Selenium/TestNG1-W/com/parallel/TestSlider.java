import org.testng.annotations.Test;

	@Test
	public void TestSlider() {
		   
		   /*
	    * From https://jqueryui.com/slider/
	    * https://stackoverflow.com/questions/11138449/how-to-move-horizontal-slider-or-vertical-slider-of-jquery-using-selenium-webdri
	    */
	   
	   driver.get("http://jqueryui.com/demos/slider/");
	 //Identify WebElement
	 WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/a"));
	
	 //Using Action Class
	 Actions move = new Actions(driver);
	 Action action = move.dragAndDropBy(slider, 30, 0).build();
	 action.perform();
}