package com.automation.pages;

import com.automation.utils.DriverUtils;
import com.automation.utils.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(id = "user-name")
    WebElement userName;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement logInBtn;


    public void openWebsite() {

        driver.get(PropertyReader.getProperty("url"));
    }

    public void doLogin() {
        userName.sendKeys(PropertyReader.getProperty("userName"));
        password.sendKeys(PropertyReader.getProperty("password"));
        logInBtn.click();

    }


}
