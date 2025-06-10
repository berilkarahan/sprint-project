package com.project.step_definitions;

import com.project.pages.FinaSystemInventoryPage;
import com.project.pages.FinaSystemsLoginPage;
import io.cucumber.java.en.*;

public class US06_AddNewProduct_SM_StepDef {

   FinaSystemsLoginPage finaSystemsLoginPage = new FinaSystemsLoginPage();
   FinaSystemInventoryPage finaSystemInventoryPage = new FinaSystemInventoryPage();


   @Given("The user logs in using {string} and {string}")
    public void theUserLogsInUsingAnd(String userName, String password) {

       finaSystemsLoginPage.login(userName, password);

   }

   @Given("The user navigate to the Inventory page")
   public void the_user_navigate_to_the_inventory_page() {

      finaSystemInventoryPage.inventoryButton.click();

   }


    @Then("The user navigate to the product page")
    public void the_user_navigate_to_the_product_page() {

      finaSystemInventoryPage.productsMenu.click();

    }



}
