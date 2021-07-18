package com.org.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class TestProperties {
	
	public static Properties prop = new Properties();
	public static File file;
	public static FileInputStream fis;
	
	static {
		file = new File("Config\\TestCaseProperties.properties");
		try {
			fis = new FileInputStream(file);
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
