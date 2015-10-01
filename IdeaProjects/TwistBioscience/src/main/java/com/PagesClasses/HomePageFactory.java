package com.PagesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Dima on 9/30/2015.
 */
public class HomePageFactory
{
    WebDriver driver;

    @FindBy(id = "homeGetStarted")
    WebElement btnGetStarted;

    @FindBy(id="input_1_1")
    WebElement inputFirstName;

    @FindBy(id="input_1_2")
    WebElement inputLastName;

    @FindBy(id="input_1_3")
    WebElement inputEmailAddress;

    @FindBy(id="input_1_4")
    WebElement inputCompanyName;

    @FindBy(id="input_1_5")
    WebElement inputCountryName;

    @FindBy(id="input_1_6")
    WebElement inputStateName;

    @FindBy(id="input_1_7")
    WebElement dropdownGeneLength;

    @FindBy(id="input_1_8")
    WebElement dropdownDnaType;

    @FindBy(id="input_1_9")
    WebElement dropdownGenesQuantity;

    @FindBy(id="input_1_10" )
    WebElement dropdownHowSoon;

    @FindBy(id="input_1_11")
    WebElement dropdownReferrals;

    @FindBy(id="input_1_12")
    WebElement inputTextOtherDna;

    @FindBy(id="gform_submit_button_1")
    WebElement btnSubmitForm;



    public HomePageFactory(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickBtnGetStarted()
    {
        btnGetStarted.click();
    }

    public void setInputFirstName(String firstName)
    {
        inputFirstName.sendKeys(firstName);
    }

    public void setInputLastName(String lastName)
    {
        inputLastName.sendKeys(lastName);
    }

    public void setInputEmailAddress(String emailAddress)
    {
        inputEmailAddress.sendKeys(emailAddress);
    }

    public void setInputCompanyName(String companyName)
    {
        inputCompanyName.sendKeys(companyName);
    }

    public void setInputCountryName(String countryName)
    {
        inputCountryName.sendKeys(countryName);
    }

    public void setInputStateName(String stateName)
    {
        inputStateName.sendKeys(stateName);
    }

    public void setDropdownGeneLength()
    {
        Select dropdown = new Select(driver.findElement(By.id("input_1_7")));
        dropdown.selectByVisibleText("5kb - 10kb");
    }

    public void setDropdownDnaType()
    {
        Select dropdown = new Select(driver.findElement(By.id("input_1_8")));
        dropdown.selectByVisibleText("Cloned DNA");
    }

    public void setDropdownGenesQuantity()
    {
        Select dropdown = new Select(driver.findElement(By.id("input_1_9")));
        dropdown.selectByVisibleText("> 1000");
    }

    public void setDropdownHowSoon()
    {
        Select dropdown = new Select(driver.findElement(By.id("input_1_10")));
        dropdown.selectByVisibleText("Yesterday!");
    }

    public void setDropdownReferrals()
    {
        Select dropdown = new Select(driver.findElement(By.id("input_1_11")));
        dropdown.selectByVisibleText("Web search");
    }

    public void setInputTextOtherDna(String otherDna)
    {
        inputTextOtherDna.sendKeys(otherDna);
    }

    public void clickBtnSubmitForm()
    {
        btnSubmitForm.click();
    }
}
