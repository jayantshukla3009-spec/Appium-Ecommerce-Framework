package com.jayant.Tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jayant.appiumBase.BaseTest;
import com.jayant.pages.LoginPage;

public class LoginTest extends BaseTest {
  
	LoginPage login;
	@BeforeClass
	public void setUpDriver() {
		setUp();
	}
	@Test
	public void loginDetails() {
		login = new LoginPage(driver);
		
		login.selectCountry("India");
		
		login.enterYourName("Jayant");
	
		login.genderSelection("Male");
		
		login.goButton();
	}
	
}
