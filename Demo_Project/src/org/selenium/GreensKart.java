package org.selenium;

import java.io.IOException;

public class GreensKart extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		browser("Chrome");
		getUrl("https://rahulshettyacademy.com/seleniumPractise/#/");

		GreensKartPageFirstPom f = new GreensKartPageFirstPom(driver);
		GreensKartPageSecondPom s = new GreensKartPageSecondPom(driver);
		GreensKartPageThirdPom t = new GreensKartPageThirdPom(driver);

		// page first
		f.getSearch().sendKeys("tomato");
		Thread.sleep(3000);
		f.getIncrement().click();
		f.getIncrement().click();
		f.getAddToCart().click();
		Thread.sleep(2000);
		f.getSearch().clear();
		f.getSearch().sendKeys("potato");
		f.getAddToCart().click();
		Thread.sleep(2000);
		f.getItemsInCart().click();
		f.getProToCheck().click();
		Thread.sleep(3000);
		// page second

		s.getPromo().sendKeys("1234");
		s.getApply().click();
		Thread.sleep(3000);
		s.getPlaceorder().click();

		// Third page
		selection(t.getSelectCountry(), "byValue", "India");//from base class
		Thread.sleep(3000);
		t.getCheckBox().click();
		t.getProceed().click();
		Thread.sleep(3000);
		ScreenShot("GreensKart");
		driver.close();

	}
}
