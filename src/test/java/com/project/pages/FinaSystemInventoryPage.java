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

    @FindBy(xpath = "//input[@name='default_code']")
    public WebElement internalReferenceBox;

    @FindBy(xpath = "//input[@id='o_field_input_486']")
    public WebElement salesPriceBox;

    @FindBy(xpath = "//input[@id='o_field_input_490']")
    public WebElement costBox;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "(//span[text()='Electrical Car'])[1]")
    public WebElement selectProduct;

    @FindBy(xpath = "//button[normalize-space()='Edit']")
    public WebElement editButton;





}
