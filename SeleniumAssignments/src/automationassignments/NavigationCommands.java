package automationassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\excel\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
	//	driver.findElement(By.linkText("More information...")).click();
		
		
		//driver.navigate().back();
	}

}
