package seleniumModule3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment2 {

		
			
			 public String url="https://demo.guru99.com/test/login.html";
		//	String driverpath="C:\\Users\\excel\\Downloads\\chromedriver_win32\\chromedriver.exe\\";
			public  WebDriver driver;
			
			
			@BeforeTest
			public void launchbrowser() {
				//System.setProperty("webdriver.chrome.driver", driverpath);
				driver =new ChromeDriver();
				driver.get(url);
				
				
				
			}
			@Test(dataProvider="loginData")
			public void loginTest(String username,String password) {
				
				driver.findElement(By.id("email")).sendKeys("username");
				driver.findElement(By.id("passwd")).sendKeys("password");
				driver.findElement(By.id("SubmitLogin")).click();
				
				
			}
			
			@DataProvider(name="loginData")
			
		public Object[][] logindata(){
			return new Object[][] {
				{"username1","password1"}
				//{"username2","password2"}
				
				
			};
				
					
				
			}
				
			@AfterTest
			public void terminatebrowser() {
				driver.close();
			}
			
			
			
			

	}


