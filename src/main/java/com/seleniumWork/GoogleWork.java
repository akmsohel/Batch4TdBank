package com.seleniumWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleWork {
    public static WebDriver dr;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        dr = new ChromeDriver();
        dr.get("https://www.google.com");
        dr.manage().window().maximize();
         dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> element= dr.findElements(By.tagName("Center"));


        dr.findElement(By.name("q")).sendKeys("chease");
        Thread.sleep(3000);

        List<WebElement> elements= dr.findElements(By.xpath("//li[@role='presentation']"));

        for (WebElement el: elements) {
           System.out.println(el.getText());     // get values
            if(el.getText().trim().equals("Sweet")){
                el.click();
                System.out.println("******************"+dr.getTitle());
                break;
            }

        }
        Thread.sleep(5000);
        dr.close();
        

 //      dr.findElement(By.xpath("//li[@role='presentation'][6]")).click();


        // dr.findElement(By.name("q"));

//
//        Thread.sleep(4000);
//        dr.findElement(By.xpath("//a[text()='Sign in']")).click();
//        dr.findElement(By.id("identifierId")).sendKeys("akmsayeedin@gmail.com");
//        dr.findElement(By.xpath("//span[text()='Next']")).click();
//        Thread.sleep(3000);
//        if (dr.findElement(By.xpath("//span[text()='Try again']")).isDisplayed()) {
//
//            dr.findElement(By.xpath("//span[text()='Try again']")).click();
//            dr.findElement(By.id("identifierId")).sendKeys("akmsayeedin@gmail.com");
//            dr.findElement(By.xpath("//span[text()='Next']")).click();
//        }
//
//
//        dr.findElement(By.xpath("//input[@name='oappword']")).sendKeys("Akm738973");
//        dr.findElement(By.xpath("//span[text()='Next']")).click();
//        dr.close();
   }
}
