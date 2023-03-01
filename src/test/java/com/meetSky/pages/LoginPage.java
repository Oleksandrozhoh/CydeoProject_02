package com.meetSky.pages;

import com.meetSky.utilities.ConfigurationReader;
import com.meetSky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement usernameInputBox;

    @FindBy (id = "password")
    public WebElement passwordInputBox;

    @FindBy (id = "submit-form")
    public WebElement loginButton;

    public void login(){
        usernameInputBox.sendKeys(ConfigurationReader.getProperty("meetSkyUsername"));
        passwordInputBox.sendKeys(ConfigurationReader.getProperty("meetSkyPassword"));
        loginButton.click();
    }
}
