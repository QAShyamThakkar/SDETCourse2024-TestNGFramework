package com.automation.test;

import com.automation.pages.CartPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    CartPage cartPage;

    @BeforeMethod
    public void setUp(){
        DriverUtils.initDriver();
        driver = DriverUtils.getDriver();

        loginPage = new LoginPage();
        homePage = new HomePage();
        cartPage = new CartPage();

    }

    @AfterMethod
    public void cleanUp(){
       DriverUtils.quitDriver();

    }



}
