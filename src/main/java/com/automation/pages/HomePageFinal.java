package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.FinalBasePage;

public class HomePageFinal extends FinalBasePage {
	
	
	public HomePageFinal(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(className="bm-burger-button")
	private WebElement menuButton ;
	
	@FindBy(id="shopping_cart_container")
	private WebElement cartButton;
	
	@FindBy(className="product_sort_container")
	private WebElement sortDropDown;
	
	@FindBy(xpath="(//button[text()='ADD TO CART'])[1]")
	private WebElement BagPackAddToCart;
	
	@FindBy(linkText="Logout")
	private WebElement logoutlink;
	
	public void clickLogOutLink() {
		logoutlink.click();
	}
	
	public void clickMenuButton() {
		menuButton.click();
	}	
	public void clickcartButton() {
		cartButton.click();	
	}
	public void clickBagPackAddToCart () {
		BagPackAddToCart.click();
	}
	public void clickmenuButton() {
		menuButton.click();
	}
}
