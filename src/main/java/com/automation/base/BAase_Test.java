package com.automation.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BAase_Test {
	public WebDriver driver;
	@BeforeClass
	public void browsersetup() {
		driver=new ChromeDriver();
		driver.get("https://www.nike.com/in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@BeforeMethod
	public void loginIntiApplication() {
		System.out.println("Login into application");
		
	}

	
	
	@AfterMethod
	public void logoutfromApplication() {
		System.out.println("Logout from Application "); 
		
	}
	
	@AfterClass
	public void quitsession() {
		driver.quit();
	}
}
