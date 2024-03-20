

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\excel\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		JavascriptExecutor js=  (JavascriptExecutor)driver;
		Thread.sleep(50);
		js.executeScript("window.scrollTo(0,2000)");
		Thread.sleep(50);
		driver.switchTo().frame("a077aa5e");
		
		driver.findElement(By.xpath("html/body/a/img")).click();
		
		
	}

}
