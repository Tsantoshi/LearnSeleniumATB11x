package com.thetestingacademy.ex05_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

@Test
public class TestSelenium_Fix_Miniproject {
    @Description("Verify vwo login negative TC")
    @Test
   public void testVwoLoginNegative(){

       EdgeOptions edgeOptions = new EdgeOptions();
       edgeOptions .addArguments("--incognito");
       edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());

        WebElement email_input = driver.findElement(By.xpath("//input[@id='login-username']"));
        email_input.sendKeys("admin@admin.com");

        WebElement passwod_input = driver.findElement(By.xpath("//input[@id='login-password']"));
        passwod_input.sendKeys("password@321");

        WebElement login_button = driver.findElement(By.xpath("//button[@data-qa='sibequkica']"));
        login_button.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));

        WebElement error_message = driver.findElement(By.id("js-notification-box-msg"));
        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");

        driver.quit();


   }


}
