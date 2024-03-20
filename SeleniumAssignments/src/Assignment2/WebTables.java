package Assignment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\excel\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		//table[@class="dataTable"]/tbody/tr
		List<WebElement> companyname=driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td/a"));
		for(WebElement ele:companyname)
		{
			System.out.println(ele.getText());
			
		}
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("Testemail@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("testpassword");
		driver.findElement(By.name("SubmitLogin")).click();
		
	}

}
