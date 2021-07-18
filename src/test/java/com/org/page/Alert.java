package com.org.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alert{
	
	WebDriver driver;
	
	@FindBy(id="dblClkBtn")
	private WebElement doubleClickAlert;
	
	@FindBy(xpath="//button[text()=\"Generate Alert Box\"]")
	private WebElement generateAlert;
	
	@FindBy(xpath="//button[text()='Generate Confirm Box']")
	private WebElement generateConfirmAlert;
	
	public Alert(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void doubleClick() {
			Actions ac = new Actions(driver);
			ac.doubleClick(doubleClickAlert).build().perform();
			driver.switchTo().alert().accept();	
	}
	
	public void clickAlert() {
		generateAlert.click();
		driver.switchTo().alert().accept();
	}
	
	public void optionAlert() {
		generateConfirmAlert.click();
		driver.switchTo().alert().accept();
		generateConfirmAlert.click();
		driver.switchTo().alert().dismiss();
	}
	
	

}
