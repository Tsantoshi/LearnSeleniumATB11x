package com.thetestingacademy.ex03_Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_Locators_Selenium_ID_CLASSNAME_NAME {

    @Description("TC1 - Verify that with invalid login, error message is displayed!")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_vwo_login_invalid_login() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        WebElement input_email_box = driver.findElement(By.id("login-username"));
        input_email_box.sendKeys("admin@admin.com");


        WebElement input_password_box = driver.findElement(By.name("password"));
        input_password_box.sendKeys("123");

        WebElement button_submit = driver.findElement(By.id("js-login-btn"));
        button_submit.click();

        Thread.sleep(3000);

        WebElement error_msg = driver.findElement(By.className("notification-box-content"));
        System.out.println(error_msg.getText());

        Assert.assertEquals(error_msg
                .getText(),"Your email, password, IP address or location did not match");

        driver.quit();

    }
}
