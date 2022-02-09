package com.junitWork;

import org.eclipse.sisu.Priority;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FacebookJunit {
    public static WebDriver dr;
    public static WebDriverWait wait;

    @BeforeAll
    public static void browser() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        dr = new ChromeDriver();
        dr.get("http://www.facebook.com");
        dr.manage().window().maximize();
    }


    @Test
    @Order(1)
    @DisplayName("I am run method")
    public void run() throws InterruptedException {

        wait = new WebDriverWait(dr, Duration.ofSeconds(20));

        dr.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
    }

    @Order(2)
    @ParameterizedTest
    @CsvSource({"rob, murry,myrry@yahoo.com,5uygoigi"})
    public void run(String firstname, String lastname, String email, String pass) {
        dr.findElement(By.name("firstname")).sendKeys(firstname);
        dr.findElement(By.name("lastname")).sendKeys(lastname);

        dr.findElement(By.name("reg_email__")).sendKeys(email);
        dr.findElement(By.name("reg_email_confirmation__")).sendKeys(email);
        dr.findElement(By.id("password_step_input")).sendKeys(pass);

    }

    @Order(3)
    @Test
    public void run1() {

        Select selectMonth = new Select(dr.findElement(By.id("month")));
        selectMonth.selectByIndex(1);

        Select selectDay = new Select(dr.findElement(By.id("day")));
        selectDay.selectByIndex(4);

        Select selectYear = new Select(dr.findElement(By.id("year")));
        selectYear.selectByIndex(8);
    }

    @Test
    @Order(4)
    public void run2() {
        dr.findElement(By.xpath("//label[text()='Custom']")).click();

        Select selectOption = new Select(dr.findElement(By.name("preferred_pronoun")));
        selectOption.selectByIndex(2);

        dr.findElement(By.name("custom_gender")).sendKeys("No Gender");

        dr.findElement(By.xpath("//button[@name='websubmit']")).click();
    }

    @Disabled
    public void print() {

        System.out.println("The Title the page is :" + dr.getTitle());
        System.out.println("The corrent URL is :" + dr.getCurrentUrl());

    }

    @AfterAll
    public static void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        dr.close();
    }


}
