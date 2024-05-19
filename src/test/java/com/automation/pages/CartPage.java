package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage extends BasePage {

    // Elements
    @FindBy(xpath = "//span[text()='Your Cart']")
    WebElement cartPageHeader;

    @FindBy(id="item_4_title_link")
    WebElement TitleOnCartPage;

    // Driver
    WebDriver driver = DriverUtils.getDriver();

    // Methods
    public void verifyCartPage(){
        Assert.assertTrue(cartPageHeader.isDisplayed(), "CartPage is not displayed");
    }

















//    String TitleOnCartPageValue = TitleOnCartPage.getText();
//
//    Assert.assertEquals(TitleOnCartPageValue, TitleOnHomePageValue, "The items are not same");
//        System.out.println("Title on Home Page: "+TitleOnHomePageValue);
//        System.out.println("Title on Cart Page: "+TitleOnCartPageValue);





}
