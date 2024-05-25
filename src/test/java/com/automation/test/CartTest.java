package com.automation.test;

import com.automation.pages.CartPage;
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

public class CartTest extends BaseTest{

    @Test
    public void verifyCartPage() {

        loginPage.openWebsite();
        loginPage.doLogin();

        homePage.verifyHomePage();
        homePage.addToCart();
        homePage.cilckOnCartBtn();

        cartPage.verifyCartPage();



    }



}
