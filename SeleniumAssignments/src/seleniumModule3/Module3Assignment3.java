package seleniumModule3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Module3Assignment3 
{
	WebDriver driver;
	JavascriptExecutor js;
	@BeforeClass
	public void beforeMethod()
	{
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver-win64/chromedriver.exe");
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		js= (JavascriptExecutor)driver;
		
	}
	
	
	@Test(priority=0, groups= {"smoke"})
	public void formSmoke() throws InterruptedException
	{
		driver.get("https://demoqa.com/");
		WebElement element21= driver.findElement(By.xpath("(//h5)[2]"));
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//Thread.sleep(2000);  
	    js.executeScript("arguments[0].scrollIntoView();", element21);
        element21.click();
			
		WebElement element22= driver.findElement(By.xpath("(//span)[15]"));
		js.executeScript("arguments[0].scrollIntoView();", element22);
		//Thread.sleep(2000);
		element22.click();	
		
	}
	
	
	@Test(priority=1, groups= {"smoke", "regression"})
	public void formReg() throws InterruptedException
	{
	
		WebElement element1= driver.findElement(By.id("firstName"));
		js.executeScript("arguments[0].scrollIntoView();", element1);
		element1.click();
		element1.sendKeys("Isha");
		
		WebElement element2= driver.findElement(By.id("lastName"));
		js.executeScript("arguments[0].scrollIntoView();", element2);
		element2.click();
		element2.sendKeys("Shrivastava");
		
		WebElement element3= driver.findElement(By.xpath("//input [@placeholder='name@example.com']"));
		js.executeScript("arguments[0].scrollIntoView();", element3);
		element3.click();
		element3.sendKeys("Abc@gmail.com");
		
		WebElement element4= driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
		//js.executeScript("arguments[1].scrollIntoView();", element4);
		element4.click();
		
		
		WebElement element5= driver.findElement(By.xpath("//input [@placeholder='Mobile Number']"));
		js.executeScript("arguments[0].scrollIntoView();", element5);
		element5.click();
		element5.sendKeys("0123456789");
		
		WebElement element6= driver.findElement(By.id("dateOfBirthInput"));
		js.executeScript("arguments[0].scrollIntoView();", element6);
		element6.click();
		Thread.sleep(2000);
		WebElement element7= driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, March 6th, 2024']"));
		//js.executeScript("arguments[0].scrollIntoView();", element7);
		element7.click();
		
		
	//	WebElement ele=driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
		//ele.click();
		//ele.sendKeys("Ma");
		//Thread.sleep(3000);
		//ele.sendKeys(Keys.ARROW_DOWN);
		//ele.sendKeys(Keys.ENTER);
		
		
		
		/*Thread.sleep(2000);
		WebElement element8= driver.findElement(By.xpath("//div[@id=\"subjectsWrapper\"]/div[2]"));
		js.executeScript("arguments[0].scrollIntoView();", element8);
		element8.sendKeys("Practice Form");*/
		
		WebElement element9= driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
		js.executeScript("arguments[0].scrollIntoView();", element9);
		element9.click();
		
	/*	WebElement element10= driver.findElement(By.xpath(""));
		js.executeScript("arguments[0].scrollIntoView();", element10);
		element10.click();
		String filePath= "";
		fileInput.sendKeys(filePath);*/
		
		WebElement element11= driver.findElement(By.xpath("//textarea [@placeholder='Current Address' and @ rows ='5']"));
		js.executeScript("arguments[0].scrollIntoView();", element11);
		element11.click();
		element11.sendKeys("Gurgaon");
		
		WebElement element12= driver.findElement(By.xpath("//div [@ class=' css-2b097c-container' and @ id='state']"));
		js.executeScript("arguments[0].scrollIntoView();", element12);
		element12.click();
		System.out.println("Done");
		
		Select sel= new Select(driver.findElement(By.xpath("//div [@ class=' css-2b097c-container' and @ id='state']")));
		
		Thread.sleep(3000);
		sel.selectByVisibleText("Haryana");
		
		
		WebElement element13= driver.findElement(By.xpath("//div[ @ class=' css-2b097c-container' and @ id='city']"));
		js.executeScript("arguments[0].scrollIntoView();", element13);
		element13.click();
		Select sel1= new Select(driver.findElement(By.xpath("//div[ @ class=' css-2b097c-container' and @ id='city']")));
		sel1.selectByVisibleText("Karnal");
		
		WebElement element14= driver.findElement(By.xpath("//button [@ id='submit']"));
		js.executeScript("arguments[0].scrollIntoView();", element14);
		element14.click();
		
		
			
		
	}
	
	
	
	/*@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}*/

}
