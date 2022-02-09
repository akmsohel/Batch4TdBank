package com.seleniumWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CreateFBAccountPFactory {

    @FindBy(xpath="//a[@data-testid='open-registration-form-button']")
    public WebElement CreateAccountButton;

    @FindBy(name="firstname")
    public WebElement firstName;

    @FindBy(name="lastname")
    public WebElement lastName;

    @FindBy(name="reg_email__")
    public WebElement email;

    @FindBy(name="reg_email_confirmation__")
    public WebElement reEmail;

    @FindBy(id="password_step_input")
    public WebElement password;

    @FindBy(id="month")
    public WebElement month;

    @FindBy(id="day")
    public WebElement day;

    @FindBy(id="year")
    public WebElement year;

    @FindBy(xpath = "//label[text()='Custom']")
    public WebElement custom;

    @FindBy(name="preferred_pronoun")
    public WebElement preferredPronoun;

    @FindBy(name="custom_gender")
    public WebElement customGender;

    @FindBy(xpath="//button[@name='websubmit']")
    public WebElement submitButton;

    WebDriver dr;
    WebDriverWait wait;

    public CreateFBAccountPFactory(WebDriver dr, WebDriverWait wait){
        this.dr=dr;
        this.wait=wait;
        PageFactory.initElements(dr,this);

    }
    public  void createNewFBAccount() {

        CreateAccountButton.click();
        wait.until(ExpectedConditions.visibilityOf(firstName));
        firstName.sendKeys("abu");
        lastName.sendKeys("Musa");
        email.sendKeys("abuMusa@gmail.com");
        reEmail.sendKeys("abuMusa@gmail.com");
        password.sendKeys("Musa123");

        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(1);

        Select selectDay = new Select(day);
        selectDay.selectByIndex(4);

        Select selectYear = new Select(year);
        selectYear.selectByIndex(8);

        custom.click();

        Select selectOption = new Select(preferredPronoun);
        selectOption.selectByIndex(2);

        preferredPronoun.click();
        customGender.sendKeys("No Gender");
    }
        public void submit(){
        submitButton.click();
    }

    public void createAccount() {
    }
}
