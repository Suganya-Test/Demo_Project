package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPractice_LoginPom {
	
	public static WebDriver driver;
		
	@FindBy(xpath="//a[@class='login']")
	private WebElement signin;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement pass;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement login;

	public AutomationPractice_LoginPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	
}

