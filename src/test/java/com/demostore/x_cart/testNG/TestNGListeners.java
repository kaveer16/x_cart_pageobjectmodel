package com.demostore.x_cart.testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("This Is On Test Start" + iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("This Is On Test Success" + iTestResult.getName());

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("This Is On Test Fail" + iTestResult.getName());

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("This Is On Test Skipped" + iTestResult.getName());

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
