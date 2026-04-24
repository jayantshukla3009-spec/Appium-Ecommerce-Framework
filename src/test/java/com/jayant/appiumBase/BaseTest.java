package com.jayant.appiumBase;

import java.net.MalformedURLException;

import java.net.URL;

import com.jayant.utils.ConfigReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
	protected AndroidDriver driver;
	protected void setUp() {
		UiAutomator2Options options = new UiAutomator2Options();
		String path = System.getProperty("user.dir")+"/"+ConfigReader.get("app");
		options.setApp(path);
		options.setDeviceName(ConfigReader.get("deviceName"));
		options.setUdid(ConfigReader.get("udid"));
		options.setPlatformName(ConfigReader.get("platformName"));
		options.setAutomationName(ConfigReader.get("automationName"));
		// session setup 
		URL url;
		try {
			url = new URL(ConfigReader.get("url"));
			// driver creation 
			 driver = new AndroidDriver(url,options);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		
		//System.out.println("SessionID : "+driver.getSessionId());
	}
	protected void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
}
