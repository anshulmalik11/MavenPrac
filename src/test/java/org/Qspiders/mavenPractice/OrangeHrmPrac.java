package org.Qspiders.mavenPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class OrangeHrmPrac {
	WebDriver driver;

	
	@Test(priority = 1)
	@Parameters({"url","username","password"})

	public void login(String url,String userName,String password)
	{
	
		
		//login
		driver.findElement(By.name("username")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		
		driver.findElement(By.cssSelector("button.oxd-button--medium")).click();
		
		//driver.close();
	}
	
	
	@Test(priority = 2)
	public void clickingAdmin()
	{
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		WebElement image = driver.findElement(By.xpath("//div[@class='oxd-brand-banner']/img"));
		Assert.assertTrue(image.isDisplayed());
	}
	
	@Parameters("url")
	@BeforeMethod
	public void openUrl(String url)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//url open
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	
}
