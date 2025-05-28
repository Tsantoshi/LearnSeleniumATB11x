package com.thetestingacademy.ex05_Selenium_Waits;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSelenium_Waits {
    @Test
    public void test_verify_print_imac_price(){

        EdgeDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");
    }
}
