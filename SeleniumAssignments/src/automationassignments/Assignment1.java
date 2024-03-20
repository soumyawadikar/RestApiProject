package automationassignments;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment1 {


		public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\excel\\Downloads\\edgedriver_win64");
			
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/nlogin/login");
			Thread.sleep(30);
		   driver.findElement(By.id("usernameField")).sendKeys("neelamkw24@gmail.com");
		   driver.findElement(By.id("passwordField")).sendKeys("Nick@345");
		   driver.findElement(By.xpath("//span[text()=\"Sign in with Google\"]")).click();
		   Thread.sleep(30);
		  // driver.findElement(By.xpath("//div[text()=\"Use another account\"]")).click();
		   Thread.sleep(30);
		   driver.findElement(By.id("identifierId")).sendKeys("neelamkw24@gmail.com");
		   Thread.sleep(30);
		   driver.findElement(By.name("password")).sendKeys("Nick@345");
		   driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
		   
		   
			
			
			}
		
}
	


