package com.bank.testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {

        System.out.println("this on test Start"+iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("This on test success "+iTestResult.getName());

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("this on test failure"+iTestResult.getName());

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("this on test skipped"+iTestResult.getName());
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
