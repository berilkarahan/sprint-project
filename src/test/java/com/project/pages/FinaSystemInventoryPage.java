package com.project.pages;

import com.project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinaSystemInventoryPage {

    public FinaSystemInventoryPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[span[normalize-space()='Inventory']]")
    public WebElement inventoryButton;


    @FindBy(partialLinkText = "Product")
    public WebElement productsMenu;


}
