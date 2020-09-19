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
		driver.findElement(By.id("session_password")).sendKeys("Fish101Gold@");
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}

}
