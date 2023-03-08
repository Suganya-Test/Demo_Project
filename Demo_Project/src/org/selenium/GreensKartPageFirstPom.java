package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class GreensKartPageFirstPom {
	
	public static WebDriver driver;

	@FindBy(xpath="//input[@type='search']")//sendKeys("tomato2"),("Potato1")
	private WebElement search;
	
	@FindBy(xpath="//a[@class='increment']")//click thrice
	private WebElement increment;
	
	@FindBy(xpath="//button[text()='ADD TO CART']")//click
	private WebElement addToCart;
	
	@FindBy(xpath="//img[@alt='Cart']")//click
	private WebElement itemsInCart;
	
	@FindBy(xpath="//button[text()='PROCEED TO CHECKOUT']")//click
	private WebElement ProToCheck;
	
	public GreensKartPageFirstPom(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getIncrement() {
		return increment;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getItemsInCart() {
		return itemsInCart;
	}

	public WebElement getProToCheck() {
		return ProToCheck;
	}

	
	
	
}
