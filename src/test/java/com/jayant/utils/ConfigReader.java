package com.jayant.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
static Properties prop;

	
static{
		String filePath = System.getProperty("user.dir")+"/src/test/resources/config_file/config.properties"; 
		try {
			FileInputStream fis = new FileInputStream(filePath);
			 prop = new Properties();
			 prop.load(fis);
			 fis.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public static String get(String key) {
		return prop.getProperty(key);
	}
	
	
}
