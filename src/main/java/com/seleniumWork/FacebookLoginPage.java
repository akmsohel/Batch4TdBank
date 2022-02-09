package com.seleniumWork;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class FacebookLoginPage {

    public WebElement loginPage(WebDriver dr)throws IOException {


        dr.findElement(By.id("email")).clear();
        dr.findElement(By.id("email")).sendKeys("sayeedins@yahoo.com");

        dr.findElement(By.id("pass")).clear();
        dr.findElement(By.id("pass")).sendKeys("Say738973");

        dr.findElement(By.name("login")).click();


        File scrFile = loginPage(dr).getScreenshotAs(OutputType.FILE);
        File scrFile1 = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./image.png"));

        return loginPage(dr);
}

}