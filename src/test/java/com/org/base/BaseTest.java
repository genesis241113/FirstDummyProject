package com.org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.org.utils.TestProperties;

public class BaseTest {
	
	public static WebDriver driver;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extentReport;
	public static ExtentTest testCase;
	
	@BeforeSuite
	public void reportSetup() {
		htmlReporter = new ExtentHtmlReporter("Reports//SeleniumDummyPageReport.html");
		extentReport = new ExtentReports();
		extentReport.attachReporter(htmlReporter);
	}
	
	@AfterSuite
	public void reportTearDown() {
		extentReport.flush();
	}
	
	@Parameters({"Browser"})
	@BeforeTest
	public void openBrowser(@Optional("Chrome") String browser) throws InterruptedException {
		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(TestProperties.prop.getProperty("appUrl"));
			System.out.println("Chrome Browser Started");
			Thread.sleep(1000);
		}else if(browser.equals("FireFox")) {
			System.setProperty("webdriver.firefox.driver", "Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(TestProperties.prop.getProperty("appUrl"));
			System.out.println("FireFox Browser Started");
		}else {
			System.out.println("Not valid prameter pass in testng.Xml file for browser");
			
		}
	}

	@AfterTest
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
