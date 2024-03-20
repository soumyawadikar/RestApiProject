package seleniumModule3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegressionTest {
	
	WebDriver driver;

	@BeforeTest
	public void Beforetest()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
	  }

	
	
	@Test
	public void Forms() throws InterruptedException {
		
		Point p =	 driver.findElement(By.xpath("//h5[text()=\"Forms\"]")).getLocation();

		System.out.println(p);

		Thread.sleep(1000);

		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(328, 664)");

		Thread.sleep(1000);


		driver.findElement(By.xpath("//h5[text()=\"Forms\"]")).click();
		Thread.sleep(1000);
		
	}
  
}


