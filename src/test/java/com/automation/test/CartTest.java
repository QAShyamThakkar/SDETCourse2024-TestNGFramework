package com.automation.test;

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
//          1. =========================VerifyLogin========================================

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys(PropertyReader.getProperty("userName"));

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(PropertyReader.getProperty("password"));

        WebElement logIn = driver.findElement(By.id("login-button"));
        logIn.click();

        try {
            WebElement homePageLogo = driver.findElement(By.xpath("//div[@class=\"app_logo\"]"));
        } catch (Exception e) {
            Assert.assertTrue(false, "HomePage is not displayed");
        }

//          2. =========================Add to cart========================================

        WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCart.click();

        WebElement TitleOnHomePage = driver.findElement(By.id("item_4_title_link"));
        String TitleOnHomePageValue = TitleOnHomePage.getText();

        WebElement cartBtn = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cartBtn.click();

        try {
            WebElement cartPageHeader = driver.findElement(By.xpath("//span[text()='Your Cart']"));
        } catch (Exception e) {
            Assert.assertTrue(false, "CartPage is not displayed");
        }

        WebElement TitleOnCartPage = driver.findElement(By.id("item_4_title_link"));
        String TitleOnCartPageValue = TitleOnCartPage.getText();

//        String TitleOnCartPageValue = TitleOnCartPage.getText() + "123";

//         3. =========================Verifying Item========================================

        Assert.assertEquals(TitleOnCartPageValue, TitleOnHomePageValue, "The items are not same");
        System.out.println("Title on Home Page: "+TitleOnHomePageValue);
        System.out.println("Title on Cart Page: "+TitleOnCartPageValue);
    }



}
