package seleniumModule3;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SmokeRegression {
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
	   js.executeScript("arguments[0].scrollIntoView();", element21);
	        element21.click();

	WebElement element22= driver.findElement(By.xpath("(//span)[15]"));
	js.executeScript("arguments[0].scrollIntoView();", element22);
	element22.click();
	}


	@Test(priority=1, groups= {"smoke", "regression"})
	public void formReg() throws InterruptedException, AWTException
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

	//WebElement element4= driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
	//js.executeScript("arguments[1].scrollIntoView();", element4);
	//element4.click();

	WebElement element5= driver.findElement(By.xpath("//input [@placeholder='Mobile Number']"));
	js.executeScript("arguments[0].scrollIntoView();", element5);
	element5.click();
	element5.sendKeys("0123456789");

	WebElement element6= driver.findElement(By.id("dateOfBirthInput"));
	js.executeScript("arguments[0].scrollIntoView();", element6);
	element6.click();

	WebElement element7= driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, March 6th, 2024']"));
	element7.click();

	WebElement element8= driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
	js.executeScript("arguments[0].scrollIntoView();", element8);
	element8.click();
	Actions action= new Actions(driver);
	action.sendKeys(element8,"M").perform();
	action.sendKeys(Keys.ENTER).build().perform();


	WebElement element9= driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
	js.executeScript("arguments[0].scrollIntoView();", element9);
	element9.click();


	Thread.sleep(2000);
	WebElement element10= driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	js.executeScript("arguments[0].scrollIntoView();", element10);
	action.click().perform();
	Robot rb= new Robot();
	StringSelection filePath= new StringSelection("C:\\Users\\cyber\\Pictures\\Screenshots\\Screenshot (49).png");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(6000);

	WebElement element11= driver.findElement(By.xpath("//textarea [@placeholder='Current Address' and @ rows ='5']"));
	js.executeScript("arguments[0].scrollIntoView();", element11);
	element11.click();
	element11.sendKeys("Gurgaon");

	WebElement element12= driver.findElement(By.xpath("//div [@ class=' css-2b097c-container' and @ id='state']"));
	js.executeScript("arguments[0].scrollIntoView();", element12);
	element12.click();
	action.sendKeys(element12,"Haryana").perform();
	action.sendKeys(Keys.ENTER).build().perform();

	WebElement element13= driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder']"));
	js.executeScript("arguments[0].scrollIntoView();", element13);
	element13.click();
	action.sendKeys(element13,"Karnal").perform();
	Thread.sleep(5000);
	action.sendKeys(Keys.ENTER).build().perform();

	WebElement element14= driver.findElement(By.xpath("//button [@ id='submit']"));
	js.executeScript("arguments[0].scrollIntoView();", element14);
	element14.click();


	}
}

