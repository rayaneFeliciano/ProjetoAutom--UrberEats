package br.com.acc.uberEats.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverContext {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "src\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			DriverContext.setDriver(driver);
		}
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		DriverContext.driver = driver;

	}

}
