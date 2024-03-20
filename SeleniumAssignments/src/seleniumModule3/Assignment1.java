package seleniumModule3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Assignment1 {
	
	 public String url="https://demo.guru99.com/test/login.html";
	String driverpath="C:\\Users\\excel\\Downloads\\chromedriver_win32\\chromedriver.exe\\";
	public  WebDriver driver;
	
	
	@BeforeTest
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver =new ChromeDriver();
		driver.get(url);
		
		
	}
	@Test
	public void enterusernamepassword() {
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("passwd")).click();
		driver.findElement(By.id("SubmitLogin")).click();
		
		
	}
	@AfterTest
	public void terminatebrowser() {
		driver.close();
	}
	
	
	
	
	

}
