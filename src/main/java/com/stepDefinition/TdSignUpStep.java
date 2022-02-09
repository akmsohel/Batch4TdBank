package com.stepDefinition;

import com.seleniumWork.Base;
import com.seleniumWork.TdBase;
import com.tdPages.TdSignInPage;
import com.tdPages.TdSignUpPage;
import com.utilities.Utility;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TdSignUpStep extends TdBase {



    @Given("I should open a Chrome Browser")
    public void i_should_open_a_chrome_browser() {

        setup("chrome");
    }

    @Given("I should landed on tdBank home page")
    public void i_should_landed_on_td_bank_home_page() {
       url();
      Assert.assertEquals(dr.getTitle(),"TD Personal Banking, Loans, Cards & More | TD Bank");
    }

    @When("I click on Sign Up button")

    public void i_click_on_Sign_Up_button() {
        TdSignUpPage tdSignUpPag = new TdSignUpPage(dr);

        tdSignUpPag.setSignUpButton();
        tdSignUpPag.setPleaseConfirm();
        tdSignUpPag.setAuthorization();
        tdSignUpPag.setContinuee();
        tdSignUpPag.setSignContinue();
        tdSignUpPag.setSignContinue();
        Utility utils = new Utility();

    }

    @When("I fill up all information with valid data")
    public void i_fill_up_all_information_with_valid_data() throws IOException {
        TdSignUpPage tdSignUpPag = new TdSignUpPage(dr);

        tdSignUpPag.setFirstName();
        tdSignUpPag.setLastNametName();
        tdSignUpPag.setEmail();
        tdSignUpPag.setAtmCard();
        tdSignUpPag.setAccountType();
        tdSignUpPag.setSsn();
        tdSignUpPag.setAccountNumber();
        tdSignUpPag.setUserName();
        tdSignUpPag.setValidUserName();
        tdSignUpPag.setNewPassword();
        tdSignUpPag.setNewPasswordConfirm();
        tdSignUpPag.setSubmitButton();
        // tdSignUpPag.setVerifyText();

        getScreenshot("shot");


    }

    @Then("I should be able to create my account")
    public void i_should_be_able_to_create_my_account() {
     closeBrowser();

    }


    @When("I click on login button")
    public void iClickOnSigninButton() {
        TdSignInPage login=new TdSignInPage(dr);
        login.setLogin();

    }
    @And("I click on cancel button")
    public void iClickOnCancelButton() {
    }

    @When("I should log in successfully with valid data")
    public void iShouldLogInSuccessfullyWithValidData(DataTable data) {


        List<List<String>> dataList = data.asLists();

        TdSignInPage sign=new TdSignInPage(dr);

        sign.setUserName(dataList.get(0).get(0));
        sign.setPassword(dataList.get(0).get(1));
        sign.userName.clear();
        sign.password.clear();

        sign.setUserName (dataList.get(1).get(0));
        sign.setPassword(dataList.get(1).get(1));
        sign.setLoginPageButton();

    }

    @And("I clicl on cencell button")
    public void iCliclOnCencellButton() {
        TdSignInPage sign=new TdSignInPage(dr);
        sign.setCancelButton();

    }

    @And("I fill up <username> and <password>")
    public void iFillUpUsernameAndPassword() {
        TdSignInPage sign=new TdSignInPage(dr);
//        sign.setUserName();
//        sign.setPassword();
        sign.setLoginPageButton();
    }

}
