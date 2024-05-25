package com.automation.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class ScreenshotListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        TakesScreenshot screenshot = (TakesScreenshot) DriverUtils.driver;
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);

        String destinationPath = "src/test/resources/SS/screenshot.png";
        try {
            FileUtils.copyFile(screenshotFile, new File(destinationPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

}
