package com.automation.test;

import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = DriverUtils.getDriver();
        driver.get(PropertyReader.getProperty("url"));
    }

    @AfterMethod
    public void cleanUp(){
       DriverUtils.quitDriver();

    }



}
