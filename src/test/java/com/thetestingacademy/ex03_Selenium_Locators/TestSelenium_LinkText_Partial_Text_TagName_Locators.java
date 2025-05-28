package com.thetestingacademy.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium_LinkText_Partial_Text_TagName_Locators {

    @Description("verify vwo")
    @Test
    public void test_login_vwo(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

//       WebElement start_free_trial_fullPath = driver.findElement(By.linkText("Start a free trial"));
//        start_free_trial.click();

        WebElement start_free_trial_partialPath = driver.findElement(By.partialLinkText("trial"));
        start_free_trial_partialPath.click();
        driver.quit();


    }
}
