package com.jayant.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class Wait_Utils {
    private AndroidDriver driver;
	private WebDriverWait wait;
	public Wait_Utils(AndroidDriver driver ) {
		this.driver=driver;
		this.wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	public  WebElement waitForClickability(By locator) {
		return	wait.until(ExpectedConditions.elementToBeClickable(locator));
	 
	}
	
	public WebElement waitForVisibility(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
