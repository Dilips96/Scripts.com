package TestNGAnnotation.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Minimise 
{
	WebDriver  driver;
	
	@Test
	public void min()
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(option);
		
		driver.get("https://www.youtube.com/");
		
		driver.manage().window().minimize();
		
		driver.findElement(By.xpath("//input[@id=\"search\"]")).clear();
		
		
		
		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("TestNG tutorial by naveen automation labs");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
	}

}
