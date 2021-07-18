package com.org.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Options {
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@name='gender']")
	List<WebElement> radios;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	List<WebElement> checkBox;
	
	@FindBy(id = "testingDropdown")
	WebElement dropDown;
	
	public Options(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<String> radioOption() {
		ArrayList<String> text = new ArrayList<String>();
		for(WebElement curItem : radios) {
			if(!curItem.isSelected()) {
				curItem.click();
				text.add(curItem.getAttribute("id"));
			}
		}
		
		return text;
	}
	
		
		public ArrayList<String> checkBoxOption() {
			ArrayList<String> text = new ArrayList<String>();
			for(WebElement curItem : checkBox) {
				if(!curItem.isSelected()) {
					curItem.click();
					text.add(curItem.getAttribute("value"));
			}
		}
			return text;	
	}
		
		public ArrayList<String> dropDownOption() {
			ArrayList<String> text = new ArrayList<String>();
			Select dd = new Select(dropDown);
			int size = dd.getOptions().size();
			System.out.println(size);
			for(int i=0; i<size; i++) {
				dd.selectByIndex(i);
				text.add(dd.getFirstSelectedOption().getText());			
				}
			return text;
		}


}
