package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.interactions.Actions;

public class AutomationPractice extends BaseClass {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		browser("Chrome");
		getUrl("http://automationpractice.com/");

		AutomationPractice_LoginPom l = new AutomationPractice_LoginPom(driver);
		AutomationPractice_PageFirst f = new AutomationPractice_PageFirst(driver);
		AutomationPractice_PageSecondPom s = new AutomationPractice_PageSecondPom(driver);
		// login
		l.getSignin().click();
		l.getEmail().sendKeys("mesuganyatamizh@gmail.com");
		l.getPass().sendKeys("Suganya@14");
		l.getLogin().click();
		// first page
		Actions a = new Actions(driver);
		a.moveToElement(f.getWomen()).moveToElement(f.getTshirt()).click().build().perform();
		Thread.sleep(3000);
		f.getproduct().click();
		f.getQuantity().click();
		selection(f.getSize(), "byValue", "2");
		f.getColor().click();
		f.getAddToCart().click();
		Thread.sleep(3000);
		f.getProceed().click();
		// secondPage
		s.getCheckOut().click();
		s.getpToChechOut().click();
		s.getCheckBox().click();
		s.getCarrier().click();
		s.getBank().click();
		s.getConfirmOrder().click();
		s.getScreenshot().click();
		ScreenShot("Automation practice");
	}

}
