package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotelPageSecond {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement select;

	@FindBy(xpath = "//input[@name='continue']")
	private WebElement conti;

	public AdactinHotelPageSecond(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getConti() {
		return conti;
	}

}
