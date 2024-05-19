package com.automation.test;


import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest{

    @Test
    public void verifyLoginSuccessful() {

        loginPage.openWebsite();
        loginPage.doLogin();
        homePage.verifyHomePage();

    }

}
