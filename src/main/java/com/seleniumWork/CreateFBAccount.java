package com.seleniumWork;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CreateFBAccount {

    public WebDriverWait wait;
@Test
    public WebElement accountCreation(WebDriver dr) throws InterruptedException {


        dr.get("http://www.facebook.com");
        dr.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(dr, 10);

        dr.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));

        dr.findElement(By.name("firstname")).sendKeys("Rob");
        dr.findElement(By.name("lastname")).sendKeys("Murry");

        dr.findElement(By.name("reg_email__")).sendKeys("RobMurry@gmail.com");
        dr.findElement(By.name("reg_email_confirmation__")).sendKeys("RobMurry@gmail.com");
        dr.findElement(By.id("password_step_input")).sendKeys("RobMurry123");

        Select selectMonth=new Select(dr.findElement(By.id("month")));
        selectMonth.selectByIndex(1);

        Select selectDay=new Select(dr.findElement(By.id("day")));
        selectDay.selectByIndex(4);

        Select selectYear=new Select(dr.findElement(By.id("year")));
        selectYear.selectByIndex(8);

        dr.findElement(By.xpath("//label[text()='Custom']")).click();

        Select selectOption=new Select(dr.findElement(By.name("preferred_pronoun")));
        selectOption.selectByIndex(2);

        dr.findElement(By.name("custom_gender")).sendKeys("No Gender");

        dr.findElement(By.xpath("//button[@name='websubmit']")).click();


        System.out.println("The Title the page is :"+dr.getTitle());
        System.out.println("The corrent URL is :"+dr.getCurrentUrl());
        Thread.sleep(9000);
        dr.close();
        return accountCreation(dr);
    }
}
