package com.org.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.org.base.BaseTest;
import com.org.page.TextBox;
import com.org.utils.SharedLibrary;
import com.org.utils.TestProperties;

public class TextBoxTest extends BaseTest{
	
	@Test
	public void validateTextBox() throws IOException {
		testCase = extentReport.createTest("validateTextBox");
		String expected = TestProperties.prop.getProperty("TextBoxExpected");
		try {
			TextBox tb = new TextBox(driver);
			String actual = tb.textBox();
			if(actual.equalsIgnoreCase(expected)) {
				testCase.pass("validateTextBox : "+ actual +" equals to " + expected +" : Pass");
				Assert.assertTrue(true, "validateTextBox : "+ actual +" equals to " + expected +" : Pass");
			}else {
				testCase.fail("validateTextBox : "+ actual +" equals to " + expected +" : Fail");
				String path = SharedLibrary.takeScreenShot("validateTextBox");
				testCase.addScreenCaptureFromPath(path);
				Assert.assertFalse(true, "validateTextBox : "+ actual +" equals to " + expected +" : Fail");
			}
		}catch(Exception e) {
			testCase.fail("validateTextBox : Fail due to exception "+ e);
			String path = SharedLibrary.takeScreenShot("validateTextBox-Exception");
			testCase.addScreenCaptureFromPath(path);
			Assert.assertFalse(true, "validateTextBox : Fail due to exception" + e);
		}
			
	}

}
