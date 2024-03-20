package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Windows {

	public static void main(String[] args) throws Exception {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Varsha\\OneDrive\\Desktop\\jar files\\chromedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://demo.guru99.com/popup.php");

	       driver.manage().window().maximize();
	       Thread.sleep(2000); 
	       
	       driver.findElement(By.xpath("/html/body/p/a")).click();
	       
	       Thread.sleep(2000); 
	        
    driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("varshaaiyappa2102@gmail.com");
	       
	       
	       
	       driver.close();
	}

}