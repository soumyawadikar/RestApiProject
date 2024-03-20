package Selenium_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name ='cusid']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		 driver.switchTo().alert().accept();


		Thread.sleep(5000);
		 driver.switchTo().alert().accept();
		//System.out.println(a2.getText());
		//a2.accept();
		driver.navigate().to("https://www.guru99.com/alert-popup-handling-selenium.html");
		Thread.sleep(5000);
		//driver.close();

	}

}
