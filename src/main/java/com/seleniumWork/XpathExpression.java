package com.seleniumWork;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExpression {
    // Absolute Xpath    /header/div[1]/div[3]/li/.....

    // Relative Xpath    //*[@id="value"]/ul/li/

    //Dynamic Xpath      //tagName[@attribute='value']      6types

    // 1 .  Basic Xpath       //*[id='username']
    //5 Text()                //*[text()='userName']
    //6 using index           //*[attribute='value'][index] ...  //input[@type='test'][2]


    public static void main(String[] args) {

        // Google Account WebElement

        //a[@href='https://mail.google.com/mail/&ogbl']        // Gmail

        //a[@href="https://www.google.com/imghp?hl=en&ogbl"]     // images

        //*[text()='Sign in']               //Sign in

        //a[@href=\"https://accou
        //    // 2.  Contains()         //*contains(@id,'name')
        //    //3. using and         //*[@id='FirstName' and @name="lastName']
        //    //4 Start with function   //input[start with(@class,'form']nts.google.com/AccountChooser/signinchooser?
        // service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser\"]"));      // Sign in  button

        //input[@id='identifierId']            //email or phone

        //*[@id="identifierNext"]/div/button/span    // next

        //span[text()='Try again']           //Try again button

        //span[text()='Create account']     // Create Account

        //*[@id="gb"]/div/div[1]/div/div[2]/a

        //*[@id="gb"]/div/div[2]/a

        //*[@id="identifierId"]


        //*[@id="password"]/div[1]/div/div[1]/input     //password

        //*[@id="yDmH0d"]/c-wiz/c-wiz/div/div[3]/div[1]/div[1]/div[3]

        //https://www.ebay.com/
        //*[@id=\"mainContent\"]/div[1]/ul/li[5]/a
        //div[@class='pagecontainer__center PR_right_wrap ']
    }
}


