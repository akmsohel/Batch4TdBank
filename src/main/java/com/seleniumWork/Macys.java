package com.seleniumWork;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Macys {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
        WebDriver dr = new ChromeDriver();
        dr.manage().window().maximize();
        //  dr.get("https://www.macys.com/");
        dr.get("https://www.ebay.com/");
        // WebElement targ=dr.findElement(By.xpath("//*[@id=\"flexid_1\"]/a/span"));
        WebElement terget = dr.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"));

        // ((JavascriptExecutor) dr).executeScript("scroll(0,600)");
        //*[@id="flexid_1"]/a/span

        Actions ac = new Actions(dr);

        ac.moveToElement(terget).build().perform();
        dr.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/div[2]/div[1]/nav[2]/ul/li[3]/a")).click();
        dr.findElements(By.xpath("//div[@class='pagecontainer__center PR_right_wrap ']")).size();
        // ac.moveToElement(targ).perform();
        //((JavascriptExecutor) dr).executeScript("scroll(0,100)");
        Thread.sleep(3000);
        // dr.findElement(By.xpath("document.querySelector(\"#mainNavigationFlyouts > div.flyout_1 > div:nth-child(1) > div > a:nth-child(6)\")")).click();
        // dr.findElement(By.xpath("//span[text()='men']")).click();
        // dr.findElement(By.xpath("//*[@type='image/webp']")).getSize();
        dr.close();
    }
}
