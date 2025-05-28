package com.thetestingacademy.ex01_Selenium_Basics;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Test
    public void test_Selenium01(){

        EdgeDriver driver = new EdgeDriver();
        // new EdgeDriver(); -> POST Request(Browser Driver) (localhost:XXXXX),
        // Create New Session Endpoint - 16 digit Unique ID is also created.

        // Navigate the URL -> HTTP GET the URL
        driver.get("https://app.vwo.com");

        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        driver.quit();

    }
}
