package com.org.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.org.base.BaseTest;

public class DragAndDrop extends BaseTest{
	
	protected WebElement image;
	protected WebElement target;
	protected WebElement afterDrop;
	
	public WebElement getafterDrop() {
		afterDrop = driver.findElement(By.xpath("//div[@id='targetDiv']/child::img"));
		return afterDrop;
	}

	public WebElement getImage() {
		image = driver.findElement(By.id("sourceImage"));
		return image;
	}


	public WebElement getTarget() {
		target =  driver.findElement(By.id("targetDiv"));
		return target;
	}

	
	
	public void dragandDropImage() {
		Actions ac = new Actions(driver);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",getTarget());
		ac.dragAndDrop(getImage(), getTarget()).perform();
	}

}
