package com.thetestingacademy.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium_Mini_Project_2_Add_Extension {

    @Test
    public void test_selenium01(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--window-size=1920,1080");
        edgeOptions.addExtensions(new File("src/test/java/com/thetestingacademy/ex01_Selenium_Basics/Adblock .crx"));

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc");

        driver.manage().deleteAllCookies();
        driver.quit();


    }
}
