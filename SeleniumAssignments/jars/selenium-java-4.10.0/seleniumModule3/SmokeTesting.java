package seleniumModule3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SmokeTesting {
	
	WebDriver driver=null;
	
	@Test
	
	public void Launch_Browser() throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
	WebDriver	driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		
	}
		
		@Test
		
	public void Smoke_Test() throws InterruptedException {
		
		WebElement forms = driver.findElement(By.xpath("(//div[@class=\"category-cards\"]/div[2]"));
		forms.click();
		Thread.sleep(2000);
		
		WebElement practice = driver.findElement(By.xpath("(//li[@id='item-0'])[2]"));
		practice.click();
		Thread.sleep(2000);
		
	}
	

//	@AfterTest
	
	public void Regression_test() throws InterruptedException {
		
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("sandy");
		Thread.sleep(2000);
		
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("chaudhari");
	    Thread.sleep(2000);
	    
	    WebElement email = driver.findElement(By.id("userEmail"));
	    email.sendKeys("sandi3341@gmail.com");
	    Thread.sleep(2000);
	    
	    WebElement gender  = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
	    gender.click();
	    Thread.sleep(2000);
	    
	    WebElement mobileno  = driver.findElement(By.id("userNumber"));
	    mobileno.sendKeys("1234567890");
	    Thread.sleep(2000);
	   
	    WebElement calander  = driver.findElement(By.id("dateOfBirthInput"));
	    calander.click();
	    Thread.sleep(2000);
	    
	    WebElement years = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
	    years.click();
	    Thread.sleep(2000);
	    
	    WebElement yearselect = driver.findElement(By.xpath("//option[@value='1987']"));
	    yearselect.click();
	    Thread.sleep(2000);
	    
	    WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
	    month.click();
	    Thread.sleep(2000);
	    
	    WebElement monthselect = driver.findElement(By.xpath("//option[@value='4']"));
	    monthselect.click();
	    Thread.sleep(2000);
	    
	    WebElement date = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--030 react-datepicker__day--weekend']"));
	    date.click();
	    Thread.sleep(2000);
	    
	    WebElement hobbies = driver.findElement(By.xpath("//label[contains(text(),'Music')]"));
	    hobbies.click();
	    Thread.sleep(2000);
	    
	    WebElement address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
	    address.sendKeys("vyara, gujarat");
	    Thread.sleep(2000);
	    
	    WebElement state = driver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
	    state.click();
	    Thread.sleep(2000);
	    
	    WebElement ncr = driver.findElement(By.xpath("//div[contains(text(),'NCR')]"));
	    ncr.click();
	    Thread.sleep(2000);
	    
	    WebElement city = driver.findElement(By.xpath("//div[contains(text(),'Select City')]"));
	    city.click();
	    Thread.sleep(2000);
	    
	    WebElement delhi = driver.findElement(By.xpath("//div[contains(text(),'Delhi')]"));
	    delhi.click();
	    Thread.sleep(2000);
	  
	  
		
	}

}
