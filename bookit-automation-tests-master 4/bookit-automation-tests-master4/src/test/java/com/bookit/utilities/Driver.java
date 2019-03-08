package com.bookit.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		// browser type can come from properties file or command line. 
		if (driver == null) {
			
			// if the System.getProperty("browser") is not null
			// the browser is equal to  System.getProperty("browser")
			// if the System.getProperty("browser") is  null
			// then browser is equal to ConfigurationReader.getProperty("browser")
			
			String browser = System.getProperty("browser") != null ? System.getProperty("browser")
					: ConfigurationReader.getProperty("browser");
			
			switch (browser) {
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "ie":
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				break;
			}
		}
		return driver;
	}

	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
