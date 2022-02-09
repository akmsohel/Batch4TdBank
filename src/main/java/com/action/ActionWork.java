package com.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionWork {
    WebDriver driver;
    WebDriver dr;

    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        dr = new ChromeDriver();
        dr.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml5_draganddrop");
        dr.manage().window().maximize();

        WebElement source = dr.findElement(By.xpath("//img[@id='drag1']"));
        WebElement destination = dr.findElement(By.xpath("//div[@id='div1']"));
        Actions a = new Actions(dr);
        a.dragAndDrop(source, destination).build().perform();

    }

    //@Test
    public void DragnDrop() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();

        WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));

        WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));

        Actions act = new Actions(driver);

        act.dragAndDrop(From, To).build().perform();
    }
}


