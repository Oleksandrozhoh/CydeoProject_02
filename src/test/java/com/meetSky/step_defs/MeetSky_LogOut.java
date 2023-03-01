package com.meetSky.step_defs;

import com.meetSky.pages.LoginPage;
import com.meetSky.utilities.BrowserUtils;
import com.meetSky.utilities.ConfigurationReader;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MeetSky_LogOut {

    LoginPage loginPage = new LoginPage();

    @Given("user is at the login page")
    public void user_is_at_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("meetSkyURL"));
    }
    @When("user enters valid username")
    public void user_enters_valid_username() {
       loginPage.usernameInputBox.sendKeys(ConfigurationReader.getProperty("meetSkyUsername"));
    }
    @When("user enters valid password")
    public void user_enters_valid_password() {
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("meetSkyPassword"));
    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        loginPage.loginButton.click();
    }
    @Then("user launched to the dashboard")
    public void user_launched_to_the_dashboard() {
        BrowserUtils.verifyTitleContains("Dashboard - QA - Meetsky");
    }


}
