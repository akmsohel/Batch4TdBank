package com.testNGWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TdDoubleUpCreditCard {
    public static WebDriver dr;
    public static WebDriverWait wait;

    @BeforeTest
    public void openDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        dr = new ChromeDriver();
        dr.get("https://www.td.com");
        dr.manage().window().maximize();
    }

    @Test
    public void info() {
        dr.findElement(By.xpath("/html/body/div[2]/div[2]/header[1]/div[2]/div/div[1]/div/ul/li[1]/a")).click();
        System.out.println("***************************************");
    }

    @AfterTest
    public void closeDriver() throws InterruptedException {
        if (dr != null) {
            dr.close();
        }
    }
}
