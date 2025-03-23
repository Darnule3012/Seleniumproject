package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindAStorePage {
	WebDriver driver;
	public FindAStorePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSearchStoreTextFeild() {
		return searchStoreTextFeild;
	}

	
	@FindBy(id="ta-Location_input")
	private WebElement searchStoreTextFeild; 
	
	
		
	}

