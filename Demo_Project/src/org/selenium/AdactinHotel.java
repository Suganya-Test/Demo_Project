package org.selenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdactinHotel extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {

		browser("Chrome");
		getUrl("https://adactinhotelapp.com/");

		AdactinHotelLogin l = new AdactinHotelLogin(driver);
		AdactinHotelPageFirst f = new AdactinHotelPageFirst(driver);
		AdactinHotelPageSecond s = new AdactinHotelPageSecond(driver);
		AdactinHotelPageThrid t = new AdactinHotelPageThrid(driver);
		// login page
		l.getName().sendKeys("Suganya1114");
		l.getPassword().sendKeys("123456");
		l.getLogin().click();

		// first page

		selection(f.getLocation(), "byvalue", "London");
		selection(f.getHotel(), "byvalue", "Hotel Sunshine");
		selection(f.getRoomType(), "byvalue", "Super Deluxe");
		f.getCheckInDate().sendKeys("01/11/2022");
		f.getCheckOutDate().sendKeys("06/11/2022");
		selection(f.getAdult(), "byvalue", "2");
		selection(f.getChildren(), "byvalue", "1");
		f.getsearch().click();

		// second page

		s.getSelect().click();
		s.getConti().click();
		Thread.sleep(3000);
		// third page
		t.getFirstName1().sendKeys("Suganya");
		t.getLastName().sendKeys("Amirthaganesh");
		t.getAddress().sendKeys("Chennai");
		t.getCreditNo().sendKeys("1234567890123456");
		selection(t.getCardType(), "byvalue", "MAST");
		selection(t.getExpMonth(), "byvalue", "12");
		selection(t.getExpYear(), "byvalue", "2022");
		t.getCvv().sendKeys("111");
		t.getBook().click();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOf(t.getorderNo()));
		ScreenShot("AdactinHotel");
		Thread.sleep(3000);
		driver.close();

	}

}
