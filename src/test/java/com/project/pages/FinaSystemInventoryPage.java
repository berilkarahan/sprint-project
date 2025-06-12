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

    @FindBy(xpath = "(//span[text()[normalize-space()='Products']])[6]")
    public WebElement productsButton;

    @FindBy(xpath = "//button[@accessKey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@placeholder='Product Name']")
    public WebElement productNameBox;

    @FindBy(id = "o_field_input_483")
    public WebElement internalReferenceBox;

    @FindBy(id = "o_field_input_485")
    public WebElement salesPriceBox;

    @FindBy(id = "o_field_input_489")
    public WebElement costBox;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    public WebElement saveButton;


}
