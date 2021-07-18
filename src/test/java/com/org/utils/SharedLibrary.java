package com.org.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

import static com.org.base.BaseTest.driver;

import java.io.File;
import java.io.IOException;

public class SharedLibrary {
	
	public static String takeScreenShot(String name) throws IOException {
		TakesScreenshot tss = (TakesScreenshot)driver;
		File trgFile = tss.getScreenshotAs(OutputType.FILE);
		File srcFile = new File("ScreenShots//"+name+".png");
		Files.copy(trgFile, srcFile);
		String path = srcFile.getAbsolutePath();
		return path;
		
	}

}
