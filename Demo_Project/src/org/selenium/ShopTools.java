package org.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class ShopTools extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {

		browser("chrome");
		getUrl("https://shop.demoqa.com/");

		ShopToolsPageFirstPom f = new ShopToolsPageFirstPom(driver);
		ShopToolsPageSecondPom s = new ShopToolsPageSecondPom(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// first page
		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("window.scrollBy(0,1000)");
		f.getproduct().click();
		selection(f.getColor(), "byvalue", "Black");
		selection(f.getSize(), "byvalue", "L");
		f.getAddToCart().click();
		f.getBag().click();
		Thread.sleep(3000);
		f.getProceedToCart().click();

		// second page

		s.getFirstName().sendKeys("Suganya");
		s.getLastName().sendKeys("Amirthaganesh");
		Thread.sleep(3000);
		selection(s.getCountry(), "byvalue", "IN");
		s.getAddress1().sendKeys("Public Office road");
		s.getAddress2().sendKeys("Thanjavur");
		s.getCity().sendKeys("Thanjavur");
		Thread.sleep(3000);
		selection(s.getState(), "byvalue", "TN");
		s.getPost().sendKeys("600009");
		s.getPhone().sendKeys("9999999963");
		s.getEmail().sendKeys("mesuganyatamizh@gmail.com");
		Thread.sleep(3000);

		js.executeScript("arguments[0].click();", s.getCheckBox());
		js.executeScript("arguments[0].click();", s.getPlaceOrder());
		Thread.sleep(3000);

		js.executeScript("arguments[0].scrollIntoView();", s.getOrderDetails());
		Thread.sleep(3000);
		ScreenShot("shoptools");
        driver.quit();
		

	}

}
