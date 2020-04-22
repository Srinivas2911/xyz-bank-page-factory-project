package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerDetailsPage extends Utility {

    //Logging the elements and method into the log4j logs and reports
    private static final Logger log = LogManager.getLogger(CustomerDetailsPage.class.getName());

    //previously collected locators
//    By searchCustomerField = By.xpath("//input[@placeholder='Search Customer']");
//    By deleteCustomerBtn = By.xpath("//button[contains(text(),'Delete')]");

    //Using selenium @Findby and initElement methods for locators/elements
// using _ help separate them from variable

    @FindBy(xpath = "//input[@placeholder='Search Customer']")
    WebElement _searchCustomerField;

    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    WebElement _deleteCustomerBtn;

    public void searchCustomerByName(String firstName) {
        Reporter.log("Finding Customer by First Name : " + firstName + " On Search Customer Field " + _searchCustomerField.toString() + "<br>");
        clickOnElement(_searchCustomerField);
        sendTextToElement(_searchCustomerField, firstName);
        log.info("Finding Customer by First Name : " + firstName + " On Search Customer Field " + _searchCustomerField.toString());
    }
    public void clickOnDeleteCustomerButton() {
        Reporter.log(" Clicking on Delete Customer Button : " + _deleteCustomerBtn.toString() + "<br>");
        clickOnElement(_deleteCustomerBtn);
        log.info(" Clicking on Delete Customer Button : " + _deleteCustomerBtn.toString());
    }

}
