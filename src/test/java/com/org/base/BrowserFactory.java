package com.org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	WebDriver driver = null;
	
	public WebDriver openBrowser(String browser) throws InterruptedException {
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome Browser Started");
			Thread.sleep(1000);
		}else if(browser.equals("FireFox")) {
			System.setProperty("webdriver.firefox.driver", "Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("FireFox Browser Started");
		}else {
			System.out.println("Not valid prameter pass in testng.Xml file for browser");
			
		}
		
		return driver;
	}

}
