/*package seleniumModule3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyntrApplication {
	
	public static void main(String args[]) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\excel\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"category-cards\"]/div[2]")).click();
		
	}

}
*/

package seleniumModule3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class A3_Groups {

 WebDriver driver;
@BeforeTest
public void initialization() {


driver = new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://demoqa.com/");

}




@Test (groups = {"Smoke"})
public void Test2() throws InterruptedException
{
System.out.println("test2");
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class=\"category-cards\"]/div[2]")).click();

}
@Test (groups = {"Smoke"})
public void Test3()
{
System.out.println("test3");
driver.findElement(By.xpath("//div[contains(@class,'element-list collapse show')]//li[@id='item-0']")).click();
}

@Test (groups = {"Regression"})
public void Test4()
{
System.out.println("test4");

driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Supriti");
driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Pandey");
driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("abc@abc.com");
driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
driver.findElement(By.xpath("//input[@id=\"userNumber\"]")).sendKeys("1234567890");
//driver.findElement(By.xpath("////button[@id=\"submit\"]")).click();


}
 @AfterTest
 public void close() {
 driver.close();
}
//
}