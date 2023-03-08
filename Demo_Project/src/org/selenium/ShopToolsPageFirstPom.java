package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopToolsPageFirstPom {
	
	public static WebDriver driver;

	@FindBy(xpath="//a[text()='Tokyo Talkies']")
	private WebElement product;
	
	@FindBy(xpath="//select[@id='color']")//black	
	private WebElement color;
	
	@FindBy(xpath="//select[@id='size']")//L
	private WebElement size;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement addToCart;
	
	@FindBy(xpath="//i[@class='icon_bag_alt']")//click
	private WebElement bag;
	
	@FindBy(xpath="//a[@class='checkout-button button alt wc-forward wp-element-button']")
	private WebElement proceedToCart;

	public ShopToolsPageFirstPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getproduct() {
		return product;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getBag() {
		return bag;
	}

	public WebElement getProceedToCart() {
		return proceedToCart;
	}
	
	
}
