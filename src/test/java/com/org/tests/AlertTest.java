package com.org.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.org.utils.SharedLibrary;
import com.org.base.BaseTest;
import com.org.page.Alert;

public class AlertTest extends BaseTest {
	
	@Test(priority=0)
	public void validateDoubleClickAlert() throws IOException {
		testCase = extentReport.createTest("ValidateDoubleClickAlert");
		try {
			Alert alert = new Alert(driver);
			alert.doubleClick();
			testCase.pass("ValidateDoubleClickAlert : Passed");
			Assert.assertTrue(true, "ValidateDoubleClickAlert : Passed");
		}
		catch (Exception e) {
			testCase.fail("ValidateDoubleClickAlert : Failed : " + e);
			String path = SharedLibrary.takeScreenShot("ValidateDoubleClickAlert");
			testCase.addScreenCaptureFromPath(path);
			Assert.assertFalse(true, "ValidateDoubleClickAlert : Failed");
		}
	}
	
	@Test(priority=1)
	public void validateClickAlert() throws IOException {
		testCase = extentReport.createTest("validateClickAlert");
		try {
			Alert alert = new Alert(driver);
			alert.clickAlert();
			testCase.pass("validateClickAlert : Passed");
			Assert.assertTrue(true, "validateClickAlert : Passed");
		}catch (Exception e) {
			testCase.fail("ValidateDoubleClickAlert : Failed : " + e);
			String path = SharedLibrary.takeScreenShot("validateClickAlert");
			testCase.addScreenCaptureFromPath(path);
			Assert.assertFalse(true, "validateClickAlert : Failed");
		}
	}
	
	@Test(priority=2)
	public void validateOptionAlert() throws IOException {
		testCase = extentReport.createTest("validateOptionAlert");
		try {
			Alert alert = new Alert(driver);
			alert.optionAlert();
			testCase.pass("validateOptionAlert : Passed");
			Assert.assertTrue(true, "validateOptionAlert : Passed");
		}catch (Exception e) {
			testCase.fail("ValidateDoubleClickAlert : Failed : " + e);
			String path = SharedLibrary.takeScreenShot("validateOptionAlert");
			testCase.addScreenCaptureFromPath(path);
			Assert.assertFalse(true, "validateOptionAlert : Failed");
		}
	}

}
