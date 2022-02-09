package com.stepDefinition;

import com.seleniumWork.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class FacebookAccountCreationSteps extends Base {

    //public CreateFBAccountPFactory pFactory = new CreateFBAccountPFactory(dr, wait);

    @Given("I am in facebook home page")
    public void i_am_in_facebook_home_page() throws InterruptedException {

        setup("chrome");
        dr.manage().window().maximize();
        dr.get("https://www.facebook.com");

    }

    @When("I click on create account button")
    public void i_click_on_create_account_button() {
        dr.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

    }

    @Then("I able to see the sign up form")
    public void i_able_to_see_the_signup_form() {

        Assert.assertEquals(dr.getTitle(), "Facebook - Log In or Sign Up");

    }

    @When("I fill up all the information with valid data")
    public void i_fill_up_all_the_information_with_valid_data() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));

        dr.findElement(By.name("firstname")).sendKeys("Rob");
        dr.findElement(By.name("lastname")).sendKeys("Murry");

        dr.findElement(By.name("reg_email__")).sendKeys("RobMurry@gmail.com");
        dr.findElement(By.name("reg_email_confirmation__")).sendKeys("RobMurry@gmail.com");
        dr.findElement(By.id("password_step_input")).sendKeys("RobMurry123");

        Select selectMonth = new Select(dr.findElement(By.id("month")));
        selectMonth.selectByIndex(1);
        Select selectDay = new Select(dr.findElement(By.id("day")));
        selectDay.selectByIndex(4);
        Select selectYear = new Select(dr.findElement(By.id("year")));
        selectYear.selectByIndex(8);
        dr.findElement(By.xpath("//label[text()='Custom']")).click();

        Select selectOption = new Select(dr.findElement(By.name("preferred_pronoun")));
        selectOption.selectByIndex(2);
        dr.findElement(By.name("custom_gender")).sendKeys("No Gender");

    }

    @Then("I click on submit button")
    public void i_click_on_submit_button() throws IOException {
        dr.findElement(By.xpath("//button[@name='websubmit']")).click();
        System.out.println(dr.getTitle());
        // getScreenshot("I am submit button");

    }

    @And("I am able to create facebook account successfully")
    public void i_am_able_to_create_facebook_account_successfully() {
        System.out.println(dr.getTitle());
    }

    @And("I am able to see the facebook login page")
    public void i_am_able_to_see_the_facebook_login_page() {
        System.out.println(dr.getTitle());
        dr.close();
    }

    @When("^I enter valid email(.*) and password(.*)")
    public void iEnterValidEmailEmailAndPasswordPassword(String email, String password) {

        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));

        dr.findElement(By.id("email")).sendKeys(email);
        dr.findElement(By.id("pass")).sendKeys(password);
        dr.findElement(By.xpath("//div[@class='_9lsa']")).click();
        System.out.println("Login successfully with valid data");
    }

    @And("I click on Sign in button")
    public void iClickOnSignInButton() {
        dr.findElement(By.name("login")).click();
    }

    @Then("I am able to log in successfully")
    public void iAmAbleToLogInSuccessfully() throws InterruptedException {
        Thread.sleep(4000);
        dr.close();
    }

    @When("^I enter invalid email (.*) and password (.*)$")
    public void iEnterInvalidEmailEmailAndPasswordPassword(String mail, String pass) throws InterruptedException {
        dr.findElement(By.id("email")).sendKeys(mail);
        dr.findElement(By.id("pass")).sendKeys(pass);
        System.out.println("Login successfully with valid data");
        dr.close();
    }

    @When("^I enter email and password to login$")
    public void iEnterEmailAndPasswordWithToLogIn(DataTable tableData) throws IOException {

        List<List<String>> dataList = tableData.asLists();
//        dataList.get(0).get(0);
//        dataList.get(0).get(1);
//        dataList.get(1).get(0);
//        dataList.get(1).get(1);
        dr.findElement(By.id("email")).sendKeys(dataList.get(0).get(0));
        dr.findElement(By.id("pass")).sendKeys(dataList.get(0).get(1));

        getScreenshot("listList");

        dr.findElement(By.id("email")).clear();
        dr.findElement(By.id("pass")).clear();
        dr.findElement(By.id("email")).sendKeys(dataList.get(1).get(0));
        dr.findElement(By.id("pass")).sendKeys(dataList.get(1).get(1));

    }

    @When("I enter email and password for login")
    public void iEnterEmailAndPasswordForLogin(DataTable data) throws IOException {

        List<Map<String, String>> accountData = data.asMaps();

        accountData.get(0).get("email");
        accountData.get(0).get("password");
        dr.findElement(By.id("email")).sendKeys(accountData.get(0).get("email"));
        dr.findElement(By.id("pass")).sendKeys(accountData.get(0).get("password"));
        getScreenshot("listSet");
        dr.findElement(By.id("email")).clear();
        dr.findElement(By.id("pass")).clear();
        dr.findElement(By.id("email")).sendKeys(accountData.get(1).get("email"));
        dr.findElement(By.id("pass")).sendKeys(accountData.get(1).get("password"));
    }
}



