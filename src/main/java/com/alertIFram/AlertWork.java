package com.alertIFram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class AlertWork {
    @FindBy(xpath = "//button[@onclick='myFunction()']")
    WebElement tryIt;



    WebDriver dr;
    WebDriverWait wait;

    public AlertWork(WebDriver dr,WebDriverWait wait){
        this.dr=dr;
        this.wait=wait;
        PageFactory.initElements(dr,this);
    }
    public void frameMethod(){
        dr.switchTo().frame("iframeResult");

    }
    public void alertMethod() throws InterruptedException {

        dr.switchTo().frame("iframeResult");

        tryIt.click();

       Thread.sleep(4000);
        dr.switchTo().alert().accept();

    }
    public void dynamicAlartMethod(){

        dr.switchTo().alert().dismiss();

        dr.switchTo().alert().sendKeys("Hi I am alert box");

        String s=dr.switchTo().alert().getText();
        s.compareTo("Ok");
    }


}
