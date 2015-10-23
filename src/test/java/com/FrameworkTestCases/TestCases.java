package com.FrameworkTestCases;

import com.PagesClasses.BasePage;
import com.PagesClasses.HomePageFactory;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Dima on 9/30/2015.
 */
public class TestCases extends BasePage
{
    HomePageFactory homePage;

    @Test
    public void submitApp() throws IOException
    {
        setup();
        homePage = new HomePageFactory(driver);
        homePage.clickBtnGetStarted();
        homePage.setInputFirstName("Dmitri");
        homePage.setInputLastName("Dinevich");
        homePage.setInputEmailAddress("dinevich@gmail.com");
        homePage.setInputCompanyName("My Company");
        homePage.setInputCountryName("USA");
        homePage.setInputStateName("California");
        homePage.setDropdownGeneLength();
        homePage.setDropdownDnaType();
        homePage.setDropdownGenesQuantity();
        homePage.setDropdownHowSoon();
        homePage.setDropdownReferrals();
        homePage.setInputTextOtherDna("Automated test to introduce...");
        homePage.clickBtnSubmitForm();
        Assert.assertTrue(driver.findElement(By.id("gform_confirmation_message_1")).isDisplayed());
        driver.quit();
    }
}
