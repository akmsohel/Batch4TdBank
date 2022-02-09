package mixt.runner;

import com.alertIFram.AlertWork;
import com.alertIFram.WindowHandleWork;
import com.seleniumWork.Base;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class TestAlertWork extends Base {
    @Test
    public void run() throws InterruptedException{
        setup("chrome");
        dr.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        dr.manage().window().maximize();

        AlertWork alertWork = new AlertWork(dr, wait);

        // alertWork.frameMethod();

        alertWork.alertMethod();

        Thread.sleep(4000);

    }

    }



