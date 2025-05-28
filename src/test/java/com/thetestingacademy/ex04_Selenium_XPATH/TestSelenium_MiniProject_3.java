package com.thetestingacademy.ex04_Selenium_XPATH;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium_MiniProject_3 {

    @Description("Verify that with valid email, pass, appointment page is loaded")
    @Test
    public void test_katalon_login() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement make_app = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        make_app.click();

       List <WebElement> username_input_box = driver.findElements(By.xpath("//input[@placeholder='Username']"));
       username_input_box.get(1).sendKeys("John Doe");

      List <WebElement> password_input_box = driver.findElements(By.xpath("//input[@placeholder='Password']"));
       password_input_box.get(1).sendKeys("ThisIsNotAPassword");

       WebElement login_button = driver.findElement(By.xpath("//button[@id='btn-login']"));
       login_button.click();

       Thread.sleep(3000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
