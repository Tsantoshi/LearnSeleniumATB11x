package com.thetestingacademy.ex05_Selenium_Waits;

import com.thetestingacademy.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium_MiniProject4 extends CommonToAll {

    @Description("Verify  makemytrip opens with modal")
    @Test
    public void testCloseModal(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--start-maximize");

        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());

        waitForVisibility(driver,3,"//span[@data-cy='closeModal']");

        WebElement closeModel = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        closeModel.click();

        driver.quit();
    }
}
