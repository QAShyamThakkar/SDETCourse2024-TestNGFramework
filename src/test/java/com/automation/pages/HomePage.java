package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends BasePage {
    @FindBy(xpath = "//div[@class=\"app_logo\"]")
    WebElement homePageLogo;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCart;

    @FindBy(id = "item_4_title_link")
    WebElement TitleOnHomePageValue;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement cartBtn;

    public void verifyHomePage() {
        Assert.assertTrue(homePageLogo.isDisplayed(), "HomePage is not displayed");
    }

    public void addToCart() {
        addToCart.click();

    }

    public void cilckOnCartBtn() {

        cartBtn.click();
    }


//    public  void  doLogOut(){
//
//    }


}
