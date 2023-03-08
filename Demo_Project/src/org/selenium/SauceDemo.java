package org.selenium;

import java.io.IOException;

public class SauceDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {

		browser("Chrome");
		getUrl("https://www.saucedemo.com/");

		SauceDemoPageFirstPom f = new SauceDemoPageFirstPom(driver);
		SauceDemoPageSecondPom s = new SauceDemoPageSecondPom(driver);
		SauceDemoPageThirdPom t = new SauceDemoPageThirdPom(driver);
		// page 1
		f.getUserName().sendKeys("standard_user");
		f.getPassWord().sendKeys("secret_sauce");
		f.getLogin().click();
		
		// page 2
		s.getAddToCart().click();
		s.getShoppingCart().click();
		Thread.sleep(3000);
		s.getCheckOut().click();

		// page3
		t.getFirstName().sendKeys("Suganya");
		t.getLastName().sendKeys("Amirthaganesh");
		t.getPost().sendKeys("600009");
		t.getConti().click();
		t.getFinish().click();
		ScreenShot("sauceDmo");
		driver.quit();
		
	}

}
