package automationassignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;


public class Title {


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\excel\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			
			String ExpectedTitle="Facebook – log in or sign up";
			String ActualTitle=driver.getTitle();	
			//System.out.println(ActualTitle);
			if(ActualTitle.equals(ExpectedTitle)){
				System.out.println("title is verified");
			}
			else
			{
				System.out.println("title is not verified");
			}
			
		}

	}

