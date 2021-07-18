package com.org.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBox {
	
WebDriver driver;
	
	
	@FindBy(id="fname")
	WebElement textBox;
	
	
	public TextBox(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String textBox() {
		textBox.sendKeys("Mridul Baranwal");
		String actual = textBox.getAttribute("value");
		return actual;
	}

}

