package com.jayant.pages;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.jayant.utils.Wait_Utils;


import io.appium.java_client.android.AndroidDriver;

public class ProductPage {
    private AndroidDriver driver;
	private Wait_Utils wait;
    public ProductPage(AndroidDriver driver) {
		this.driver=driver;
		wait = new Wait_Utils(driver);
	}
	// locators 
	private By productImages = By.id("com.androidsample.generalstore:id/productImage");
	private By cartVisibility = By.id("com.androidsample.generalstore:id/appbar_btn_cart");
	
	public boolean product_Img() {
		List<WebElement> imgList = driver.findElements(productImages);
		for(WebElement i : imgList) {
			if(!i.isDisplayed()) {
				return false;
		}
		
	}
		return true;
}
	public boolean cartVisibility() {
		return wait.waitForVisibility(cartVisibility).isDisplayed();
	}
}
