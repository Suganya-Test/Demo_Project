package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoPageSecondPom {
	
	public static WebDriver driver;

	@FindBy(xpath="(//button[@class='btn btn_primary btn_small btn_inventory'])[1]")
	private WebElement addToCart;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement shoppingCart;
	
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement checkOut;

	public SauceDemoPageSecondPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getShoppingCart() {
		return shoppingCart;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}
	
	
	
}
