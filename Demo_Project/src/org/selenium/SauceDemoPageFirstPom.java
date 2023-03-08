package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoPageFirstPom {
	
public static WebDriver driver;

	@FindBy(xpath="//input[@id='user-name']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passWord;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement login;

	public SauceDemoPageFirstPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogin() {
		return login;
	}
	
}
