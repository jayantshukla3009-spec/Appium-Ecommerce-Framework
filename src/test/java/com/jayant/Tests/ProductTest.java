package com.jayant.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayant.appiumBase.BaseTest;
import com.jayant.pages.OnboardingPage;
import com.jayant.pages.ProductPage;

public class ProductTest extends BaseTest {
    
    private ProductPage product;
    private OnboardingPage onBoard;
	@BeforeClass
	public void setLogin() {
		setUp();
	   onBoard = new OnboardingPage(driver);
       onBoard.perform_Boarding("India", "Jay", "Male");
	}
	
	@Test
	public void productImageIsDisplayed() {
		product = new ProductPage(driver);
		// confirms visibility of cart  
		Assert.assertTrue(product.cartVisibility());
		// product images are displayed
		Assert.assertTrue(product.product_Img());
	}
}
