package com.org.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkClick {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//a[text()='This is a link']")
	WebElement clickLink;
	
	
	public LinkClick(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String clickLink() {
		clickLink.click();
		String actual = driver.getTitle();
		return actual;
	}

}
