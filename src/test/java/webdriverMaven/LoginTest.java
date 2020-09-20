package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver","/Users/jonathanemethilue/Downloads/geckodriver");
		driver = new FirefoxDriver();
		
	}
	
	@Test
	public void doLogin() {
		
		driver.get("https://www.linkedin.com/");
		driver.findElement(By.id("session_key" )).sendKeys("jonathan.emethilue@jayemith.com");
		driver.findElement(By.id("session98_password")).sendKeys("Fish101Gold@");
		driver.findElement(By.xpath("/html/body/main/section[1]/div[2]/form/button")).click();
		
		/*
		 * 
		 * add new comments
		 * 
		 */
		
	
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}

}
