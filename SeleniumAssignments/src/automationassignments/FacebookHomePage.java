package automationassignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;


public class FacebookHomePage {


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\excel\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			WebElement ele=driver.findElement(By.xpath("//a[text()=\"Forgotten password?\"]"));
			System.out.println(ele.getText());
			Assert.assertEquals(ele.getText(), "Forgotten password?");
			
			String ExpectedTitle="Facebook – log in or sign up";
			String ActualTitle=driver.getTitle();	
			System.out.println(driver.getTitle());
			if(ActualTitle.equals(ExpectedTitle)){
				System.out.println("title is verified");
			}
			else
			{
				System.out.println("title is not verified");
			}
			
		}

	}

