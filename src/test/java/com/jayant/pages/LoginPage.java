package com.jayant.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;


public class LoginPage {
	private AndroidDriver driver;
	// Locators
	private By countryDropClick = By.id("com.androidsample.generalstore:id/spinnerCountry");
	private By enterName = By.id("com.androidsample.generalstore:id/nameField");
	private By genderMale = By.id("com.androidsample.generalstore:id/radioMale");
	private By genderFemale = By.id("com.androidsample.generalstore:id/radioFemale");
	private By goButtonClick = By.id("com.androidsample.generalstore:id/btnLetsShop");
	
public LoginPage(AndroidDriver driver) {
	this.driver = driver;
}
 

    // Select Country
    public void selectCountry(String country) {
       
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(countryDropClick)).click();

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

  
}