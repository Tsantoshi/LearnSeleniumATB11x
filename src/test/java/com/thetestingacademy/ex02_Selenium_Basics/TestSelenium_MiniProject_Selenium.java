package com.thetestingacademy.ex02_Selenium_Basics;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_MiniProject_Selenium extends CommonToAll {

    @Test
    public void test_selenium(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com");

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            Assert.assertTrue(true);
        }else {
            Assert.fail("CURA Healthcare Service text is not visible");
        }
        closeBrowser(driver);

    }
}
