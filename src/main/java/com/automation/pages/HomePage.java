package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	

	public WebElement getMenlink() {
		return menlink;
	}
	
	public WebElement getSearchAStoreink() {
		return searchAStorelink;
	}
	
	@FindBy(xpath="//p[text()='Find a Store']")
	private WebElement searchAStorelink;
	
	
	@FindBy(linkText="Men")
	private WebElement menlink;
}
