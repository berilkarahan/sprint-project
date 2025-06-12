package com.project.pages;

import com.project.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class FinaSystemPointOfSalePage {

    public FinaSystemPointOfSalePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindAll({
            @FindBy(xpath = "//tbody[@class='ui-sortable']//input")

    })

    public List<WebElement> checkboxes;


    @FindBy(xpath = "(//span[text()[normalize-space()='Point of Sale']])[1]")
    public WebElement pointOfSale;

    // @FindBy(xpath = "//span[text()[normalize-space()='Orders']]")
    @FindBy(xpath = "//a[@data-action-id='663']")
    public WebElement orders;//dashboard

    @FindBy(xpath = "//th[@class='o_list_record_selector']//input")
    public WebElement checkboxOrderRef;


    @FindBy (xpath="//a[@data-section='other']")
    public List<WebElement> actionDropDownOptions ;



    @FindBy(xpath = "//button[text()[normalize-space()='Action']]")

    public WebElement actionDropDownButton;




}
