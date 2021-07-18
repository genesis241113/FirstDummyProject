package com.org.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.org.base.BaseTest;
import com.org.page.LinkClick;
import com.org.utils.SharedLibrary;
import com.org.utils.TestProperties;

public class LinkClickTest extends BaseTest{
	
	@Test
	public void validateLinkClick() throws IOException {
		testCase = extentReport.createTest("validateLinkClick");
		String expected = TestProperties.prop.getProperty("ClickLinkExpected");
		try {
			LinkClick cl = new LinkClick(driver);
			String actual = cl.clickLink();
			if(actual.equalsIgnoreCase(expected)) {
				testCase.pass("validateLinkClick : "+ actual +" equals to " + expected +" : Pass");
				Assert.assertTrue(true, "validateLinkClick : "+ actual +" equals to " + expected +" : Pass");
			}else {
				testCase.fail("validateLinkClick : "+ actual +" equals to " + expected +" : Fail");
				String path = SharedLibrary.takeScreenShot("validateLinkClick");
				testCase.addScreenCaptureFromPath(path);
				Assert.assertFalse(true, "validateLinkClick : "+ actual +" equals to " + expected +" : Fail");
			}
		}catch(Exception e) {
			testCase.fail("validateLinkClick : Fail due to exception "+ e);
			String path = SharedLibrary.takeScreenShot("validateLinkClick-Exception");
			testCase.addScreenCaptureFromPath(path);
			Assert.assertFalse(true, "validateLinkClick : Fail due to exception" + e);
		}finally {
			driver.navigate().back();
		}
			
	}

}
