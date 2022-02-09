package com.testNGWork.listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class InvocationListener implements IInvokedMethodListener {


        public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {

            System.out.println("Before Invocation Method Started For: " + method.getTestMethod().getMethodName() + "of Class:" + testResult.getTestClass());
        }

        public void afterInvocation(IInvokedMethod method, ITestResult testResult) {

            System.out.println("After Invocation Method Started For: " + method.getTestMethod().getMethodName() + "of Class:" + testResult.getTestClass());

        }
    }

