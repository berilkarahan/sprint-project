package com.project.step_definitions;

import com.project.pages.FinaSystemPointOfSalePage;
import com.project.pages.FinaSystemsLoginPage;

import com.project.utilities.BrowserUtils;
import com.project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US09_ViewProductOrders_BK {

    FinaSystemsLoginPage finaSystemsLoginPage;
    FinaSystemPointOfSalePage finaSystemPointOfSalePage = new FinaSystemPointOfSalePage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));


    @Given("user login {string} and {string}")
    public void user_login_and(String username, String password) {

        finaSystemsLoginPage = new FinaSystemsLoginPage();
        finaSystemsLoginPage.login(username, password);

    }

    @When("user click Point of Sale option")
    public void user_can_view_the_order_list_on_the_point_of_sale_page() {


        wait.until(ExpectedConditions.elementToBeClickable(finaSystemPointOfSalePage.pointOfSale));

        finaSystemPointOfSalePage.pointOfSale.click();


    }

    @When("on the Dashboard user clicks orders")
    public void user_checks_the_order_reference() {

        wait.until(ExpectedConditions.elementToBeClickable(finaSystemPointOfSalePage.orders));

        finaSystemPointOfSalePage.orders.click();


    }

    @Then("all the orders should be checked")
    public void all_the_orders_should_be_checked() {
        wait.until(ExpectedConditions.elementToBeClickable(finaSystemPointOfSalePage.checkboxOrderRef));

        System.out.println("Checkbox displayed: " + finaSystemPointOfSalePage.checkboxOrderRef.isDisplayed());
        System.out.println("Checkbox enabled: " + finaSystemPointOfSalePage.checkboxOrderRef.isEnabled());

        finaSystemPointOfSalePage.checkboxOrderRef.click();


        System.out.println("finaSystemPointOfSalePage.checkboxes.size() = " + finaSystemPointOfSalePage.checkboxes.size());

        for (WebElement each : finaSystemPointOfSalePage.checkboxes) {

            Assert.assertTrue(each.isSelected());
        }

    }


    @Then("action dropdown and it's three options should be displayed {string} {string} {string}")
    public void actionDropdownAndItSOptionsShouldBeDisplayed(String importOption, String export, String delete) {

        wait.until(ExpectedConditions.elementToBeClickable(finaSystemPointOfSalePage.actionDropDownButton));

        finaSystemPointOfSalePage.actionDropDownButton.click();

        List<String> actualOptions = new ArrayList<>();
        for (WebElement each : finaSystemPointOfSalePage.actionDropDownOptions) {

            actualOptions.add(each.getText());

        }


        List<String> expectedOptions = new ArrayList<>(Arrays.asList(importOption,export,delete));

        Assert.assertEquals(expectedOptions,actualOptions);


    }
}
