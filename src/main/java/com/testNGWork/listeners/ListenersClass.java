package com.testNGWork.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener {


    @Override
    public void onFinish(ITestContext argo) {
        System.out.println("************************");
        System.out.println("Data is :" + argo.getStartDate());
        System.out.println("The name of the testcase Finish is :" + argo.getName());

    }

    @Override
    public void onStart(ITestContext argo) {
        System.out.println("************************");
        System.out.println("Data is :" + argo.getStartDate());
        System.out.println("The name of the testcase Start is :" + argo.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult argo) {
        System.out.println("************************");
        System.out.println("Data is :" + argo.getTestName());
        System.out.println("The name of the testcase TestFailedButWithinSuccessPercentage is :" + argo.getName());
    }

    @Override
    public void onTestFailure(ITestResult argo) {
        System.out.println("************************");
        System.out.println("Data is :" + argo.getTestName());
        System.out.println("The name of the testcase failed is :" + argo.getName());

    }

    @Override
    public void onTestSkipped(ITestResult argo) {
        System.out.println("************************");
        System.out.println("Data is :" + argo.getTestName());

        System.out.println("The name of the testcase TestSkipped is :" + argo.getName());
    }

    @Override
    public void onTestStart(ITestResult argo) {
        System.out.println("************************");
        System.out.println("Data is :" + argo.getTestName());

        System.out.println("The name of the testcase TestStart is :" + argo.getName());
    }

    @Override
    public void onTestSuccess(ITestResult argo) {
        System.out.println("************************");
        System.out.println("Data is :" + argo.getTestName());

        System.out.println("The name of the test TestSuccess is :" + argo.getName());
    }
}
