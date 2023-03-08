package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensKartPageSecondPom {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//input[@class='promoCode']")//sendKeys
	private WebElement promo;
	
	@FindBy(xpath="//button[text()='Apply']")//click
	private WebElement apply;
	
	@FindBy(xpath="//button[text()='Place Order']")//click
	private WebElement placeorder;

	public GreensKartPageSecondPom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getPromo() {
		return promo;
	}

	public WebElement getApply() {
		return apply;
	}

	public WebElement getPlaceorder() {
		return placeorder;
	}
	
	

}
