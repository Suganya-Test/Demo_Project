package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotelLogin {

	public static  WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")//sendKeys Suganya1114
	private WebElement name;
	
	@FindBy(xpath="//input[@name='password']")//sendKeys 123456
	private WebElement password;
	
	@FindBy(xpath="//input[@name='login']")//click
	private WebElement login;
	
	public AdactinHotelLogin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}


	
}
