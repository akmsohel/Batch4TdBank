package mixt.runner;

import com.seleniumWork.Base;
import com.seleniumWork.CreateFBAccount;
import com.seleniumWork.CreateFBAccountPFactory;

import java.io.IOException;

public class TestCreateFBAccountPFactory extends Base {

        public static void main(String[]args) throws InterruptedException{

            setup("chrome");

            dr.get("https://www.facebook.com");
            dr.manage().window().maximize();

            CreateFBAccountPFactory factory=new CreateFBAccountPFactory(dr,wait);

            factory.createNewFBAccount();

            Thread.sleep(4000);
            //dr.close();

            //bse.setup("edge");

            // bse.setup("ie");

            // bse.setup("gecko");
        }
    }


