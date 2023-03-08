package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPractice_PageSecondPom {
	public static WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement checkOut;
	
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement pToChechOut;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkBox;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement carrier;
	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement bank;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirmOrder;
	
	@FindBy(xpath="//strong[text()='Your order on My Store is complete.']")
	private WebElement screenshot;

	public AutomationPractice_PageSecondPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getpToChechOut() {
		return pToChechOut;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getCarrier() {
		return carrier;
	}

	public WebElement getBank() {
		return bank;
	}

	public WebElement getConfirmOrder() {
		return confirmOrder;
	}

	public WebElement getScreenshot() {
		return screenshot;
	}

}
