package TestNGAnnotation.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Kmlfile 
{
	WebDriver driver;
	
	@Test(priority = 0)
	public void launch()
	{
		ChromeOptions chr = new ChromeOptions();
		chr.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver(chr);
		
		driver.navigate().to("https://www.google.com/");
		driver.get("https://www.google.com/maps/d/u/0/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
	}
	
	@Test(priority=1)
	public void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).click();
		Thread.sleep(2000);
		
		
	
		
		
		
		
		
		
	}
	
	
	
	
	

}
