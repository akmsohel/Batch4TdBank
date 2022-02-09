package com.testNGWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TdBase {

    public static WebDriver dr;
    public static WebDriverWait wait;

    public void setup(String driverName) {
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

        wait=new WebDriverWait(dr, Duration.ofSeconds(20));

    }
}
