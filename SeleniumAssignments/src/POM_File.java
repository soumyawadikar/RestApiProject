import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class POM_File {
	
	WebDriver driver;
	
	@BeforeTest
		public void Launch() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Java_Eclipse\\chromedriver-win64\\chromedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@Test(dataProvider="testdata") 
	public void p_case17_Data_Provide(String name, String pass) {
		Login login = new Login(driver);
		login.uName(name);
		login.passwd(pass);
		login.LogIn();
		login.Clear();
	}
	
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed(){
		Login log = new Login(driver);
	Object [][] logindata=new Object[2][2];
	logindata[0][0]="locked_out_user";
	logindata[0][1]="secret_sauce";
	// Enter data to row 1 column 0
	//logindata[1][0]="standard_user";
	// Enter data to row 1 column 0
	//logindata[1][1]="secret_sauce";
	log.LogIn();
	// return arrayobject to testscript
	return logindata;
	
	
	}
	
}
