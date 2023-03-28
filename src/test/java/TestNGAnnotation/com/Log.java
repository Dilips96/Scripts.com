package TestNGAnnotation.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log 
{
WebDriver driver;
	
	@BeforeMethod
	public void setuptest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
	}
	
	@Test(description = "mouseover on Account & Lists testing",priority = 1 )
	public void testcase1()
	{
		WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Account & Lists')]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	
	@Test(description = "verify the sign",priority = 2, dataProvider="passdataPositiveAndNegative")
	public void Testcase2(String uname,String pswd) throws InterruptedException
	{
		driver.findElement(By.xpath("(//span[.='Sign in'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys(uname);
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(pswd);
		Thread.sleep(2000);
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
	
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}
	
	
	@DataProvider()
	public static Object[][] passdataPositiveAndNegative()
	{
		return new Object[][] {{"anilk111umar@gmail.com","Anilkumar327@#"},{"anilk11umar@gmail.com","Anilkumar32@#"},{"anilk111umar@gmail.com","Anlkumar32@#"},{"anilk11umar@gmail.com","Anilkumar327#"}};
	}
	

}










