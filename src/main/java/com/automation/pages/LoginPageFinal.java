package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFinal {
	WebDriver driver;
	public LoginPageFinal(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id="user-name")
	private WebElement userTextFeild;
	@FindBy(id="password")
	private WebElement passwordTextField;
	@FindBy(id="login-button")
	private WebElement loginButton;
	public void enterUsername(String username) {
		userTextFeild.sendKeys(username);
		
	}
	public void enterpassword(String password) {
		passwordTextField.sendKeys(password);
	}
	public void clickLoginButton() {
		loginButton.click();
	}
	public void login(String username,String password) throws InterruptedException {
		enterUsername(username);
		
		enterpassword(password);
		Thread.sleep(2000);
		clickLoginButton();
	}
}
