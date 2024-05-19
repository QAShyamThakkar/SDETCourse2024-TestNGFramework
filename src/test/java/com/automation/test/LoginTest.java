package com.automation.test;


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

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys(PropertyReader.getProperty("userName"));

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(PropertyReader.getProperty("password"));

        WebElement logIn = driver.findElement(By.id("login-button"));
        logIn.click();

        try {
            WebElement  homePageLogo = driver.findElement(By.xpath("//div[@class=\"app_logo\"]"));
        }catch (Exception e) {
            Assert.assertTrue(false, "HomePage is not displayed");
        }

    }

}
