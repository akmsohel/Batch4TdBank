package mixt.runner;

import com.seleniumWork.Base;
import com.seleniumWork.CreateFBAccount;
import com.seleniumWork.CreateFBAccountPFactory;

import java.io.IOException;

public class TestCreateFBAccount extends Base  {


    public static void main(String[]args) throws IOException, InterruptedException{
        Base bse=new Base();


      // FacebookLoginPage loginPage=new FacebookLoginPage();
         CreateFBAccount accountPage=new CreateFBAccount();
       CreateFBAccountPFactory createFBAccountPFactory=new CreateFBAccountPFactory(dr,wait);


      bse.setup("chrome");


       //bse.setup("edge");


       // bse.setup("ie");
       // System.out.println("I am IEDriverServer");

       // bse.setup("gecko");


        //loginPage.loginPage(bse.dr);


        accountPage.accountCreation(bse.dr);     //Regular

        dr.get("https://www.facebook.com");
       // createFBAccountPF.createNewFBAccount(dr);

      //  bse.dr.close();

    }
}
