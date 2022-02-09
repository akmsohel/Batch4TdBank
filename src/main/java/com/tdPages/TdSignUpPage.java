package com.tdPages;

import com.seleniumWork.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TdSignUpPage extends Base {

    @FindBy(xpath = "//span[text()='Sign-Up']")

    public WebElement signUpButton;

    @FindBy(xpath = "//label[@aria-hidden='true']")
    public WebElement pleaseConfirm;

    @FindBy(xpath = "//button[@form='authorizationConfirmationForm']")
    public WebElement authorization;

    @FindBy(xpath = "//a[@ng-click='goToESign()']")
    public WebElement continuee;

    @FindBy(xpath = "//button[@ng-click='acceptBtnOnClick()']")
    public WebElement signContinue;

    @FindBy(name = "firstName")
    public WebElement firstName;

    @FindBy(name = "lastName")
    public WebElement lastName;

    @FindBy(name = "email")
    public WebElement email;

    @FindBy(name = "accountType")
    public WebElement accountType;

    @FindBy(name = "userAtmCheckcard")
    public WebElement atmCard;

    @FindBy(name = "ssn")
    public WebElement ssn;

    @FindBy(name = "accountNumber")
    public WebElement accountNumber;

    @FindBy(name = "userName")
    public WebElement userName;

    @FindBy(name = "validateUserName")
    public WebElement validUserName;

    @FindBy(name = "newPassword")
    public WebElement newPassword;

    @FindBy(name = "newPasswordConfirm")
    public WebElement newPasswordConfirm;

    @FindBy(xpath = "//button[@ng-click='enrollmentSignupPersonContinue()']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[text()=" +
            "'The information you gave doesn't match our records." +
            " Please review and make any updates before proceeding.']")
    public WebElement verifyText;


    WebDriver dr;

    public TdSignUpPage(WebDriver dr) {
        this.dr = dr;
        PageFactory.initElements(dr, this);

    }

    public void setSignUpButton() {

        signUpButton.click();
    }

    public void setPleaseConfirm() {
        pleaseConfirm.click();
    }

    public void setAuthorization() {
        authorization.click();
    }

    public void setContinuee() {
        continuee.click();
    }

    public void setSignContinue() {
        signContinue.click();
    }

    public void setFirstName() {
        firstName.sendKeys("Akm");
    }

    public void setLastNametName() {
        lastName.sendKeys("mok");
    }

    public void setEmail() {
        email.sendKeys("mokAkm@gmail.com");
    }

    public void setAtmCard() {
        atmCard.sendKeys("12345678901234");
    }

    public void setAccountType() {
        Select s = new Select(accountType);
        s.selectByVisibleText("Checking");
    }

    public void setSsn() {

        ssn.sendKeys("876546785");
    }

    public void setAccountNumber() {
        accountNumber.sendKeys("75679756354");
    }

    public void setUserName() {
        userName.sendKeys("amkMok");
    }

    public void setValidUserName() {
        validUserName.sendKeys("akmMok");
    }

    public void setNewPassword() {
        newPassword.sendKeys("akmMok12345");
    }

    public void setNewPasswordConfirm() {
        newPasswordConfirm.sendKeys("akmMok12345");
    }

    public void setSubmitButton() {
        submitButton.click();
    }

    public void setVerifyText() {
        System.out.println(verifyText.isDisplayed());
    }


    public static void main(String[] args) throws InterruptedException {
        setup("chrome");
        Base.dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Base.dr.get("https://tdbank.com");
        Base.dr.manage().window().maximize();
        // Thread.sleep(4000);

//        Base.dr.findElement(By.xpath("//button[text()='Login']")).click();
//
//        Base.dr.findElement(By.xpath("//button[@ng-click='cancelEnrollment()']")).click();
//
//        Base.dr.findElement(By.name("psudoUsername")).sendKeys("iuyufuguoy");
//        Base.dr.findElement(By.name("password")).sendKeys("547675fuguoy0");
//        Base.dr.findElement(By.xpath("//button[@form='loginForm']")).click();
//        Base.dr.findElement(By.xpath("//span[text()='Sign-Up']")).click();
//        Base.dr.findElement(By.xpath("//input[@value='Personal']")).click();
//        // Thread.sleep(3000);
//        Base.dr.findElement(By.xpath("//label[@aria-hidden='true']")).click();
//        Base.dr.findElement(By.xpath("//button[@form='authorizationConfirmationForm']")).click();
//        Base.dr.findElement(By.xpath("//a[@ng-click='goToESign()']")).click();
//        Base.dr.findElement(By.xpath("//button[@ng-click='acceptBtnOnClick()']")).click();
//        Base.dr.findElement(By.xpath("//button[@ng-click='acceptBtnOnClick()']")).click();
//        Base.dr.findElement(By.name("firstName")).sendKeys("Akm");
//        Base.dr.findElement(By.name("lastName")).sendKeys(" Mno");
//
//        Base.dr.findElement(By.name("email")).sendKeys(" MnoAkm@yahoo.com");
//        Select s = new Select(Base.dr.findElement(By.name("accountType")));
//        s.selectByVisibleText("Checking");
//
//        Base.dr.findElement(By.name("userAtmCheckcard")).sendKeys("12345678901");
//        Base.dr.findElement(By.name("ssn")).sendKeys("345678909");
//        Base.dr.findElement(By.name("accountNumber")).sendKeys("000000000");
//        Base.dr.findElement(By.name("userName")).sendKeys("AkmMno");
//        Base.dr.findElement(By.name("validateUserName")).sendKeys("AkmMno");
//        Base.dr.findElement(By.name("newPassword")).sendKeys("AkmMno12345");
//        Base.dr.findElement(By.name("newPasswordConfirm")).sendKeys("AkmMno12345");
//        Base.dr.findElement(By.xpath("//button[@ng-click='enrollmentSignupPersonContinue()']")).click();
//        Base.dr.findElement(By.xpath("//div[text()='The " +
//                "information you gave doesn't match our records. Please review and make any updates before proceeding.']")).isDisplayed();


    }

}
