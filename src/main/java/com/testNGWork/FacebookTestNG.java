package com.testNGWork;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

//@Listeners(com.testNGWork.listeners.ITestListenersClass.class)

public class FacebookTestNG {

    public static WebDriver dr;
    public static WebDriverWait wait;


    @BeforeTest(groups = {"regration"})

    @Parameters("URL")
    public void browser(String url) throws IOException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        dr = new ChromeDriver();
        dr.get(url);
        dr.manage().window().maximize();

    }


    @Test(dataProvider = "getData", groups = {"regration"})

    public void run(String a, String b, String c, String d, String e) throws IOException {

        wait = new WebDriverWait(dr, Duration.ofSeconds(10));


        dr.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));

        dr.findElement(By.name("firstname")).sendKeys(a);
        dr.findElement(By.name("lastname")).sendKeys(b);

        dr.findElement(By.name("reg_email__")).sendKeys(c);
        dr.findElement(By.name("reg_email_confirmation__")).sendKeys(d);
        dr.findElement(By.id("password_step_input")).sendKeys(e);


    }

    @Test(groups = {"regration"}, priority = 1)
    public void run2() {

        Select selectMonth = new Select(dr.findElement(By.id("month")));
        selectMonth.selectByIndex(1);

        Select selectDay = new Select(dr.findElement(By.id("day")));
        selectDay.selectByIndex(4);

        Select selectYear = new Select(dr.findElement(By.id("year")));
        selectYear.selectByIndex(8);

    }

    @Test(groups = {"regration"}, priority = 2, timeOut = 4000)

    public void run3() {
        dr.findElement(By.xpath("//label[text()='Custom']")).click();

        Select selectOption = new Select(dr.findElement(By.name("preferred_pronoun")));
        selectOption.selectByIndex(2);

        dr.findElement(By.name("custom_gender")).sendKeys("No Gender");

        dr.findElement(By.xpath("//button[@name='websubmit']")).click();


    }

    @Test(groups = {"regration"}, priority = 4)
    public void forgetAccount() throws IOException {

        System.out.println("forget Account button is not visible");


    }

    @Test(groups = {"regration"}, priority = 5)
    public void print() {

        System.out.println("The Title the page is ::" + dr.getTitle());

        System.out.println("The corrent URL is ::" + dr.getCurrentUrl());

    }

    @AfterTest(groups = {"regration"})
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        dr.close();


    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[1][5];
        data[0][0] = "firstname";
        data[0][1] = "lastname";
        data[0][2] = "email@gmail.com";
        data[0][3] = "email@gmail.com";
        data[0][4] = "password";

        return data;
    }
}
