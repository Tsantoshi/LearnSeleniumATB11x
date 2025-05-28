package com.thetestingacademy.ex11_File_Upload;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Lab37_FileUpload extends CommonToAll {

    @Test
    public void test_fileupload_p5(){

        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));

        //String working_dir = System.getProperty("user.dir");

        String path_file = System.getProperty("user.dir") + "/src/test/java/com/thetestingacademy/data.txt";
        uploadFileInput.sendKeys(path_file);
        driver.findElement(By.name("submit")).click();

    }
}
