



public class ActionsDemo {
public static void main(String[] args) throws
InterruptedException, IOException {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get(&quot;https://jqueryui.com/&quot;);
Thread.sleep(2000);
WebElement

Draggable=driver.findElement(By.xpath(&quot;//a[text()=&#39;Draggable&#39;]&quot;)
);

JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript(&quot;arguments[0].click()&quot;, Draggable);
Thread.sleep(2000);
driver.switchTo().frame(0);
WebElement Dragbox =
driver.findElement(By.id(&quot;draggable&quot;));
Actions act = new Actions(driver);
act.dragAndDropBy(Dragbox, 80, 214).build().perform();
Thread.sleep(2000);
TakesScreenshot screenShot=(TakesScreenshot)driver;
File src=screenShot.getScreenshotAs(OutputType.FILE);
File dest=new File(&quot;C:\\Users\\RAHEEM
PASHA\\OneDrive\\Desktop\\Assignments\\Autoimp.png&quot;);

FileHandler.copy(src, dest);

}
}