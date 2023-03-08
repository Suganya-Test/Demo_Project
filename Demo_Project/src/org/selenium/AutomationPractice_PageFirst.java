package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPractice_PageFirst {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//a[text()='Women']")////a[@title='Women']
	private WebElement women;
	
	@FindBy(xpath="//a[@title='T-shirts']")
	private WebElement tshirt;
	
	@FindBy(xpath="(//a[@title='Faded Short Sleeve T-shirts'])[2]")
	private WebElement product;
	
	@FindBy(xpath="//a[@class='btn btn-default button-plus product_quantity_up']")
	private WebElement quantity;
	
	@FindBy(xpath="//select[@id='group_1']")//value 2
	private WebElement size;
	
	@FindBy(xpath="//a[@title='Blue']")
	private WebElement color;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addToCart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceed;

	public AutomationPractice_PageFirst(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}
    public WebElement getproduct() {
	
	return product;
}
	public WebElement getTshirt() {
		return tshirt;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getProceed() {
		return proceed;
	}
	

}
