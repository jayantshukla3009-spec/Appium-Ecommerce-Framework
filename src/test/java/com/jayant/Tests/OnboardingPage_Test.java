package com.jayant.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayant.appiumBase.BaseTest;
import com.jayant.pages.OnboardingPage;


public class OnboardingPage_Test extends BaseTest {
  
	protected OnboardingPage board;
	@BeforeClass
	public void setUpDriver() {
		setUp();
	}
	@Test
	public void OnBoardingDetails() {
		board = new OnboardingPage(driver);
		
		board.selectCountry("India");
		
		board.enterYourName("Jayant");
	
		board.genderSelection("Male");
		
		board.goButton();
		// assertion to verify that go button has moved the user to product page
		Assert.assertTrue(board.visibilityOfProductHead());
	}
	
}
