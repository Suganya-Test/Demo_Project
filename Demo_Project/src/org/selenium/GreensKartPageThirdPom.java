package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensKartPageThirdPom {

	public static WebDriver driver;

	@FindBy(xpath = "//select[@style='width: 200px;']")
	private WebElement selectCountry;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBox;

	@FindBy(xpath = "//button[text()='Proceed']")
	private WebElement proceed;

	public GreensKartPageThirdPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getSelectCountry() {
		return selectCountry;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getProceed() {
		return proceed;
	}

}
