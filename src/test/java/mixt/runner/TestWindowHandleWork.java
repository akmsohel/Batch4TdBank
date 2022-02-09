package mixt.runner;

import com.alertIFram.AlertWork;
import com.alertIFram.WindowHandleWork;
import com.seleniumWork.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWindowHandleWork extends Base {
    public static void main(String[]args) throws InterruptedException {
       setup("chrome");

     //  dr.get("https://www.dominos.com");
     // dr.manage().window().maximize();
//        dr.get("https://www.dominos.com/");
//
//        dr.findElement(By.xpath("//div[@id='id-2']/button")).click();



        WindowHandleWork handleWork=new WindowHandleWork();
//      //AlertWork alertWork=new AlertWork(dr,wait);
//       // alertWork.frameMethod();
       handleWork.windowMethod();
        Thread.sleep(4000);

    }

}

