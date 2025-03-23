package com.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FinalBasePage {
	 WebDriver driver;
	 
	 public FinalBasePage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	 }
}
