

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon
{
	

public static void main(String[] args) throws InterruptedException {
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.get("demo.guru99.com");
Thread.sleep(2000);

driver.findElement(By.name("country")).sendKeys("KUWAIT");
}

}