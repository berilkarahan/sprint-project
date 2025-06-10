package com.project.step_definitions;

import com.project.pages.FinaSystemsLoginPage;
import com.project.utilities.BrowserUtils;
import com.project.utilities.ConfigurationReader;
import com.project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US01_LoginFunction_ZG_StepDef {

    FinaSystemsLoginPage loginPage;

//    @Given("The user is on the login page")
//    public void the_user_is_on_the_login_page() {
//
//        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
//
//    }

    @When("user logs in with username as {string} and password as {string}")
    public void user_logs_in_with_username_as_and_password_as(String username, String password) {

        loginPage = new FinaSystemsLoginPage();
        loginPage.login(username,password);

    }

   /*
    @When("clicks the login button")
    public void clicks_the_login_button() {

        loginPage.submit.click();

    }

    */



    @Then("user should see the dashboard page")
    public void user_should_see_the_dashboard_page() {

        BrowserUtils.verifyTitleContains("#Inbox - Odoo");

    }


}
