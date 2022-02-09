package com.alertIFram;

import com.seleniumWork.Base;
import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

public class WindowHandleWork extends Base {

    public void windowMethod() throws InterruptedException {

        dr.get("http://demo.guru99.com/popup.php");
        dr.manage().window().maximize();
        dr.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

        String mainWindow = dr.getWindowHandle();

        Set<String> windows = dr.getWindowHandles();
//        Iterator<String> it = windows.iterator();
//        while (it.hasNext()) {
//
//            String child = it.next();
//            if (!mainWindow.equals(child)) {
//                dr.switchTo().window(child);
//                dr.manage().window().maximize();
//
//                dr.findElement(By.name("emailid"))
//                        .sendKeys("gaurav3n@gmail.com");
//
//                dr.findElement(By.name("btnLogin")).click();
//
//                // Closing the Child Window.
//                dr.close();
//            }
//            Thread.sleep(3000);
//            dr.switchTo().window(mainWindow);
//  }
        for (String s:windows) {
            if(!mainWindow.equals(s)){
                dr.switchTo().window(s);

                dr.findElement(By.name("emailid")).sendKeys("sayss@yahoo.com");
                dr.findElement(By.name("btnLogin")).click();
                dr.close();

            }
        }
    }
}


