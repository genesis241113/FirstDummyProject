package com.org.tests;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.org.base.BaseTest;
import com.org.page.Options;
import com.org.utils.SharedLibrary;
import com.org.utils.TestProperties;

public class OptionsTest extends BaseTest{
	
	@Test(priority=0)
	public void validateRadioButton() throws IOException {
		testCase = extentReport.createTest("validateRadioButton");
		try {
			Options op = new Options(driver);
			ArrayList<String> actual = op.radioOption();
			if(actual.get(0).equals("male") && actual.get(1).equals("female")) {
				testCase.pass("validateRadioButton : Pass");
				Assert.assertTrue(true, "validateRadioButton : Actual equals to expected : Pass");
			}else {
				testCase.fail("validateRadioButton : Fail");
				String path = SharedLibrary.takeScreenShot("validateRadioButton");
				testCase.addScreenCaptureFromPath(path);
				Assert.assertFalse(true, "validateRadioButton : Actual not equals to expected : Fail");
			}
		}catch(Exception e) {
			testCase.fail("validateRadioButton : Fail due to exception "+ e);
			String path = SharedLibrary.takeScreenShot("validateRadioButton");
			testCase.addScreenCaptureFromPath(path);
			Assert.assertFalse(true, "validateRadioButton : Fail due to exception" + e);
		}
			
	}
	
	@Test(priority=1)
	public void validateCheckBox() throws IOException {
		testCase = extentReport.createTest("validateCheckBox");
		try {
			Options op = new Options(driver);
			ArrayList<String> actual = op.checkBoxOption();
			if(actual.get(0).equals("Automation") && actual.get(1).equals("Performance")) {
				testCase.pass("validateCheckBox : Pass");
				Assert.assertTrue(true, "validateCheckBox : Actual equals to expected : Pass");
			}else {
				testCase.fail("validateCheckBox : Fail");
				String path = SharedLibrary.takeScreenShot("validateCheckBox");
				testCase.addScreenCaptureFromPath(path);
				Assert.assertFalse(true, "validateCheckBox : Actual not equals to expected : Fail");
			}
		}catch(Exception e) {
			testCase.fail("validateCheckBox : Fail due to exception "+ e);
			String path = SharedLibrary.takeScreenShot("validateCheckBox");
			testCase.addScreenCaptureFromPath(path);
			Assert.assertFalse(true, "validateCheckBox : Fail due to exception" + e);
		}
			
	}
	
	@Test(priority=2)
	public void validateDropDown() throws IOException {
		testCase = extentReport.createTest("validateDropDown");
		String[] expected = TestProperties.prop.getProperty("DropDownExpected").split(",");
		try {
			Options op = new Options(driver);
			ArrayList<String> actual = op.dropDownOption();
			for(int i=0; i<expected.length; i++) {
				if(expected[i].equals(actual.get(i))) {
					testCase.pass("validateDropDown : "+ actual.get(i) + " equals to " + expected[i] +": Pass");
					Assert.assertTrue(true, "validateDropDown : "+ actual.get(i) + " equals to " + expected[i] +": Pass");
				}else {
					testCase.fail("validateDropDown : "+ actual.get(i) + " not equals to " + expected[i] +" : Fail");
					String path = SharedLibrary.takeScreenShot("validateDropDown");
					testCase.addScreenCaptureFromPath(path);
					Assert.assertFalse(true, "validateDropDown : "+ actual.get(i) + " not equals to " + expected[i] +" : Fail");
				}
			}
			
		}catch(Exception e) {
			testCase.fail("validateDropDown : Fail due to exception "+ e);
			String path = SharedLibrary.takeScreenShot("validateDropDown");
			testCase.addScreenCaptureFromPath(path);
			Assert.assertFalse(true, "validateDropDown : Fail due to exception" + e);
		}
			
	}
	
	
	

}
