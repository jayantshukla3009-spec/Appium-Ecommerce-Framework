package com.jayant.pages;


import org.openqa.selenium.By;


import com.jayant.utils.Wait_Utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;


public class OnboardingPage {
	private AndroidDriver driver;
	private Wait_Utils wait;
	// Locators
	private By countryDropClick = By.id("com.androidsample.generalstore:id/spinnerCountry");
	private By enterName = By.id("com.androidsample.generalstore:id/nameField");
	private By genderMale = By.id("com.androidsample.generalstore:id/radioMale");
	private By genderFemale = By.id("com.androidsample.generalstore:id/radioFemale");
	private By goButtonClick = By.id("com.androidsample.generalstore:id/btnLetsShop");
	private By productHead = By.id("com.androidsample.generalstore:id/toolbar_title");

	// constructor
	public OnboardingPage(AndroidDriver driver) {
	this.driver = driver;
	wait  = new Wait_Utils(driver);
}
 

    // Select Country
    public void selectCountry(String country) {
       
       

        wait.waitForVisibility(countryDropClick).click();

        driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"" + country + "\"));"
        )).click();

    }
    
    // Enter name
    public void enterYourName(String name) {
    	driver.findElement(enterName).sendKeys(name);
    }
    
    // Select Gender
    public void genderSelection(String gender) {
    	if(gender.equalsIgnoreCase("Male")) {
    		driver.findElement(genderMale).click();
    	}
    	else if(gender.equalsIgnoreCase("Female")) {
    		driver.findElement(genderFemale).click();
    	}
    }
    
    // Lets Go button
    public void goButton() {
    	driver.findElement(goButtonClick).click();
    }
    
    // product page 
    public boolean visibilityOfProductHead() {
    	
    	return wait.waitForVisibility(productHead).isDisplayed();
    }
    
    public void perform_Boarding(String country , String name , String gender) {
    	selectCountry(country);
    	enterYourName(name);
    	genderSelection(gender);
    	goButton();
    }
    

  
}