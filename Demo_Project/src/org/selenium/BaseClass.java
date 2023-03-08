package org.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class BaseClass {
	public static WebDriver driver;

	public static void browser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\HP\\Documents\\Java\\Demo_Project\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\HP\\Documents\\Java\\Locators\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void getTitile() {
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
	}

	public static void ScreenShot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\HP\\Documents\\Java\\Demo_Project\\screenshot\\"+filename+".png");
		Files.copy(src,des);
	}

	public static void selection(WebElement element, String selectType, String value) {
		Select s = new Select(element);

		if (selectType.equalsIgnoreCase("byIndex")) {

			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
		} else if (selectType.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);

		} else if (selectType.equalsIgnoreCase("byVisibleText")||selectType.equalsIgnoreCase("byText")) {
			s.selectByVisibleText(value);
		} else {
			System.out.println("Invalid");
		}
	}
}
