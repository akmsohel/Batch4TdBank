package com.tdPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TdSignInPage {
    WebDriver dr;


    @FindBy(xpath = "//button[text()='Login']")
    public WebElement login;

    @FindBy(xpath = "//button[@ng-click='cancelEnrollment()']")
    public WebElement cancelButton;

    @FindBy(name = "userName")
    public WebElement userName;

    @FindBy(name = "psudoUsername")
    public WebElement password;


    @FindBy(xpath = "//button[@form='loginForm']")
    public WebElement loginPageButton;


    public TdSignInPage(WebDriver dr) {
        this.dr = dr;
        PageFactory.initElements(dr, this);

    }
    public void setLogin(){
        login.click();
    }

    public void setCancelButton(){
        cancelButton.click();
    }

    public void setUserName(String user){

        userName.sendKeys(user);
    }
    public void setPassword(String pass){
        password.sendKeys(pass);
    }

    public void setLoginPageButton(){
        loginPageButton.click();
    }

}