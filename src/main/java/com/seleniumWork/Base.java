package com.seleniumWork;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


public class Base {

    public static WebDriver dr;
    public static WebDriverWait wait;

    public static void setup(String driverName) {
        String driverKey = "webdriver.".concat(driverName).concat(".driver");
        String driverPath = "src/main/resources/driver/{driverName}.exe";


        if (driverName.equals("chrome")) {
            System.setProperty(driverKey, driverPath.replace("{driverName}", "chromedriver"));
            dr = new ChromeDriver();
        } else if (driverName.equals("ie")) {
            System.setProperty(driverKey, driverPath.replace("{driverName}", "IEDriverServer"));

            dr = new InternetExplorerDriver();
        } else if (driverName.equals("gecko")) {
            System.setProperty(driverKey, driverPath.replace("{driverName}", "geckodriver"));
            dr = new FirefoxDriver();


        } else if (driverName.equals("edge")) {
            System.setProperty(driverKey, driverPath.replace("{driverName}", "msedgedriver"));
            dr = new EdgeDriver();

        }
        // dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        wait = new WebDriverWait(dr, Duration.ofSeconds(10));

    }

    public void getScreenshot(String result) throws IOException {
        File src = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C://test//" + result + "screenshot.png"));
    }

    public void closeBrowser() {

        dr.close();
    }

}

