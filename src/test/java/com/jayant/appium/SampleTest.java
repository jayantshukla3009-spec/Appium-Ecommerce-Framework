package com.jayant.appium;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @BeforeClass
    public void setup() {
        setUp();
    }

    @Test
    public void launchApp() {
        System.out.println("App launched successfully");
    }

    @AfterClass
    public void tearDownTest() {
        tearDown();
    }
}