package Assignment2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown {


		public static void main(String[] args) throws InterruptedException {
		//	System.setProperty("webdriver.edge.driver", "C:\\Users\\excel\\Downloads\\edgedriver_win64");
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/newtours/register.php");
			Thread.sleep(30);
			Select sel=new Select(driver.findElement(By.name("country")));
			Thread.sleep(30);
			sel.selectByVisibleText("KUWAIT");
			
			//driver.close();
		}

	}



