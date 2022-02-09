package com.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Utility {

    WebDriver dr;

        public void getScreenshot(String result) throws IOException {
            File src = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File("C://test//" + result + "screenshot.png"));


    }


}
