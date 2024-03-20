



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignment_2_3 {
	
	//Actions, JavaScript Executors
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\excel\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// URL verification
		driver.get("https://jqueryui.com/");
		Thread.sleep(2000);
		
		//Click on Draggable
		driver.findElement(By.xpath("//div[@id='sidebar']/descendant::li[1]/child::a[1]")).click();
		Thread.sleep(2000);
		
		//Drag the “Drag me around” box another place
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement dragElement = driver.findElement(By.id("draggable"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(dragElement, 100, 50).perform();
		Thread.sleep(2000);
		
		//Take the Screenshot of that dragged
		TakesScreenshot ss = (TakesScreenshot) driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\XLR\\ScreenShot Selenium\\DraggableFullPage.jpeg");
		FileHandler.copy(src, dest);
		Thread.sleep(2000);

		if (dragElement.isDisplayed()) {
			File logSrc = dragElement.getScreenshotAs(OutputType.FILE);
			File logDest = new File("E:\\XLR\\ScreenShot Selenium\\DraggableElement.jpeg");
			FileHandler.copy(logSrc, logDest);
			Thread.sleep(2000);
		}
		driver.close();
	}
	
}
