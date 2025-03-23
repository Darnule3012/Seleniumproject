package com.automation.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.automation.pages.HomePageFinal;
import com.automation.pages.LoginPageFinal;

public class FinalTest {
	public WebDriver driver;
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");
	}
	
	@BeforeMethod
	public void login() throws InterruptedException  {
		LoginPageFinal loginpage= new LoginPageFinal(driver);
		loginpage.login("standard_user", "secret_sauce");
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void logoutfromApplication() {
		HomePageFinal homepage = new HomePageFinal(driver);
		homepage.clickmenuButton();
		homepage.clickLogOutLink();
	}
	
	@AfterClass
	public void EndSession() {
		//driver.quit();
	}
	
}
