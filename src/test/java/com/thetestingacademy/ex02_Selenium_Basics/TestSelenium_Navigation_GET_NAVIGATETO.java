package com.thetestingacademy.ex02_Selenium_Basics;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium_Navigation_GET_NAVIGATETO extends CommonToAll {

    @Test
    public void test_selenium01(){

        WebDriver driver = new EdgeDriver();
        openBrowser(driver,"https://google.com");

        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        //closeBrowser(driver);

    }
}
