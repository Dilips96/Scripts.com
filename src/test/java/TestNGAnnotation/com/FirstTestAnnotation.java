package TestNGAnnotation.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestAnnotation 
{

	@Test
	public void FirstTestAnnotation() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup(); //To set The webdriver Manager
		WebDriver driver= new ChromeDriver(); // Create the instance of a webdriver
		driver.manage().window().maximize();  // to maximize the Window
		driver.get("https://www.google.com/"); // to open the URL
		driver.findElement(By.xpath("//input[@aria-autocomplete=\"both\"]")).sendKeys("TestNG By HYR Tutotial");
		
		
		Actions action = new Actions(driver); // Create an Action class
		action.sendKeys(Keys.ENTER); // enter the keys
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		
		
		
		

	}
	
		
}
