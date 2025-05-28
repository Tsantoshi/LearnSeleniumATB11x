package com.thetestingacademy.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium_Mini_Project2_TagName {

    @Description("Free trail error verify")
    @Test
    public void vwo_free_trail_error_verify(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

       WebElement start_trail = driver.findElement(By.linkText("Start a free trial"));
       start_trail.click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));


        WebElement busniess_email = driver.findElement(By.id("page-v1-step1-email"));
        busniess_email.sendKeys("abc");

        WebElement checkbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox.click();

        WebElement button= driver.findElement(By.tagName("button"));
        button.click();

       // C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason

        WebElement error_msg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_msg.getText(), "The email address you entered is incorrect.");

        driver.quit();




    }
}
