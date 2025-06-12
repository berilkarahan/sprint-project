package com.project.step_definitions;

import com.project.pages.FinaSystemInventoryPage;
import com.project.pages.FinaSystemsLoginPage;
import com.project.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US06_AddNewProduct_SM_StepDef {

   FinaSystemsLoginPage finaSystemsLoginPage = new FinaSystemsLoginPage();
   FinaSystemInventoryPage finaSystemInventoryPage = new FinaSystemInventoryPage();
   WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));


   @Given("The user logs in using {string} and {string}")
    public void theUserLogsInUsingAnd(String userName, String password) {

       finaSystemsLoginPage.login(userName, password);

   }

   @And("The user navigate to the Inventory page")
   public void the_user_navigate_to_the_inventory_page() {

       wait.until(ExpectedConditions.elementToBeClickable(finaSystemInventoryPage.inventoryButton));
       finaSystemInventoryPage.inventoryButton.click();

   }


   @And("The user navigate to the product page")
   public void the_user_navigate_to_the_product_page() {

       wait.until(ExpectedConditions.elementToBeClickable(finaSystemInventoryPage.productsButton));
       finaSystemInventoryPage.productsButton.click();

   }

    @And("The user click on the Create button")
    public void theUserClickOnTheCreateButton() {

       wait.until(ExpectedConditions.elementToBeClickable(finaSystemInventoryPage.createButton));
       finaSystemInventoryPage.createButton.click();

    }


    @And("User enter valid product information")
    public void userEnterValidProductInformation() {

       wait.until(ExpectedConditions.elementToBeClickable(finaSystemInventoryPage.productNameBox));
       finaSystemInventoryPage.productNameBox.sendKeys("Electrical Car");
//       finaSystemInventoryPage.internalReferenceBox.sendKeys("Mr. Ali");
//       finaSystemInventoryPage.salesPriceBox.sendKeys("18,500.00");
//       finaSystemInventoryPage.costBox.sendKeys("13,000.00");

    }

    @And("User click on the save button")
    public void userClickOnTheSaveButton() {

       wait.until(ExpectedConditions.elementToBeClickable(finaSystemInventoryPage.saveButton));
              finaSystemInventoryPage.saveButton.click();

    }

//    @Then("User should see the new product in the inventory list")
//    public void userShouldSeeTheNewProductInTheInventoryList() {
//
//
//
//    }


}
