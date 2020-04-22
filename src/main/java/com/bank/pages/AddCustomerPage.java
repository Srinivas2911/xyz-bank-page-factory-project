package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {

    //Logging the elements and method into the log4j logs and reports
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    //previously collected locators
//    By firstNameField = By.xpath("//input[@placeholder='First Name']");
//    By lastNameField = By.xpath("//input[@placeholder='Last Name']");
//    By postcodeField = By.xpath("//input[@placeholder='Post Code']");
//    By addCustomerBtn = By.xpath("//button[@class='btn btn-default']");
//    By homePageBtn = By.xpath("//button[@class='btn home']");

    //Using selenium @Findby and initElement methods for locators/elements
// using _ help separate them from variable

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement _firstNameField;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement _lastNameField;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement _postcodeField;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _addCustomerBtn;

    @FindBy(xpath = "//button[@class='btn home']")
    WebElement _homePageBtn;

    public void clickOnHomepageBtn() {
        Reporter.log("Clicking on Home Page Button : " + _homePageBtn.toString() + "<br>");
        clickOnElement(_homePageBtn);
        log.info("Clicking on Home Page Button : " + _homePageBtn.toString());
    }

    public void enterNewUserFirstName(String firstName) {
        Reporter.log("Entering First Name : " + firstName + " on First Name Field " + _firstNameField.toString() + "<br>");
        clickOnElement(_firstNameField);
        sendTextToElement(_firstNameField, firstName);
        log.info("Entering First Name : " + firstName + " on First Name Field " + _firstNameField.toString());

    }

    public void enterNewUserLastName(String lastName) {
        Reporter.log("Entering Last Name : " + lastName + " on Last Name Field " + _lastNameField.toString() + "<br>");
        clickOnElement(_lastNameField);
        sendTextToElement(_lastNameField, lastName);
        log.info("Entering Last Name : " + lastName + " on Last Name Field " + _lastNameField.toString());
    }

    public void enterNewUserPostcode(String postcode) {
        Reporter.log("Entering postcode : " + postcode + " on Postcode Field " + _postcodeField.toString() + "<br>");
        clickOnElement(_postcodeField);
        sendTextToElement(_postcodeField, postcode);
        log.info("Entering postcode : " + postcode + " on Postcode Field " + _postcodeField.toString());
    }

    public void clickOnAddCustomerBtn() {
        Reporter.log("Clicking on Add Customer Button : " + _addCustomerBtn.toString() + "<br>");
        log.info("Clicking on Add Customer Button : " + _addCustomerBtn.toString());
        clickOnElement(_addCustomerBtn);

    }

    public void popUpDisplayMessage() {
        alertPopUp();

    }

}
