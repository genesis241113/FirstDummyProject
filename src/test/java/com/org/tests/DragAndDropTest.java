package com.org.tests;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.org.page.DragAndDrop;
import com.org.utils.SharedLibrary;

public class DragAndDropTest extends DragAndDrop{
	
	
	@Test
	public void validateDragAndDrop() throws IOException {
		testCase = extentReport.createTest("validateDragAndDrop");
		try {
			dragandDropImage();
				testCase.pass("validateDragAndDrop : Pass");
				Assert.assertTrue(true, "validateDragAndDrop : Pass");
			
		}catch(Exception e) {
			testCase.fail("validateDragAndDrop : Fail : "+ e);
			String path = SharedLibrary.takeScreenShot("validateDragAndDrop");
			testCase.addScreenCaptureFromPath(path);
			Assert.assertFalse(true, "validateDragAndDrop : Fail" + e);
		}
			
	}
	
	
}
