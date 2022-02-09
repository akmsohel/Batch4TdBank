package com.testNGWork;

import org.testng.annotations.*;

public class TestNGBeforeGroupsTest {

    @BeforeGroups("sanity")
    public void beforeGroup() {
        System.out.println("BeforeGroup of Sanity ");
    }

//    @Test(groups = {"sanity"}, priority = 1, invocationCount = 3)
//    public void m1() {
//        System.out.println("I am method 1 ");
//    }
//
//
//    @Test(dependsOnMethods = "m13")
//    public void m6() {
//        System.out.println("I am method 6");
//    }
//
//
//    @Test(dataProvider = "m15", groups = {"sanity"})
//    public void m13(String a, String b, String c, String d, String e) {
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println("I am method 13 & worked with data provider ");
//    }

    @Test(groups = {"sanity"})
    public void m14() {
        System.out.println("I am method 14 : depends on method m13");
    }

    @DataProvider
    public Object[][] m15() {
        Object[][] data = new Object[2][5];
        data[0][0] = "firstname";
        data[0][1] = "lastname";
        data[0][2] = "email@gmail.com";
        data[0][3] = "email.gmail.com";
        data[0][4] = "password";

        data[1][0] = "firstname2";
        data[1][1] = "lastname2";
        data[1][2] = "email@gmail.com2";
        data[1][3] = "email.gmail.com2";
        data[1][4] = "password2";

        System.out.println("I am data provider with return type Object[][] ");
        return data;
    }

    @AfterGroups("sanity")
    public void afterGroup() {
        System.out.println("AfterGroup -sanity");
    }


//    @Test(enabled = false, groups = {"sanity"})
//    public void m18() {
//        System.out.println("I am method 18 ");
//    }
//
//    @Test(enabled = false, groups = {"sanity"})
//    public void m20() {
//        System.out.println("I am method 20 ");
//    }

    @Test(timeOut = 4000, groups = {"sanity"})
    public void m19() {
        System.out.println("I am method 18 ");
    }


}
