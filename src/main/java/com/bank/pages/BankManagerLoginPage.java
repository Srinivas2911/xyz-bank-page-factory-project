package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {

    //Logging the elements and method into the log4j logs and reports
    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

    //previously collected locators
//    By addCustomerTab = By.xpath("//button[contains(text(),'Add Customer')]");
//    By openAccountTab = By.xpath("//button[contains(text(),'Open Account')]");
//    By customersTab = By.xpath("//button[contains(text(),'Customers')]");
//    By homePageBtn = By.xpath("//button[@class='btn home']");

    //Using selenium @Findby and initElement methods for locators/elements
// using _ help separate them from variable

@FindBy(xpath = "//button[contains(text(),'Add Customer')]")
WebElement _addCustomerTab;

@FindBy(xpath = "//button[contains(text(),'Open Account')]")
WebElement _openAccountTab;

@FindBy(xpath = "//button[contains(text(),'Customers')]")
WebElement _customersTab;

@FindBy(xpath = "//button[@class='btn home']")
////button[@class='btn home']
//    @FindBy(xpath = "//button[@class='btn btn-default']")
//    @FindBy(className = "btn btn-default")
WebElement _homePageBtn;

    public void clickOnAddCustomerTab() {
        Reporter.log("Clicking on Add Customer Tab: " + _addCustomerTab.toString() + "<br>");
        clickOnElement(_addCustomerTab);
        log.info("Clicking on Add Customer Tab: " + _addCustomerTab.toString());
    }
    public void clickOnOpenAccountTab() {
        Reporter.log("Clicking on Open Account Tab: " + _openAccountTab.toString() + "<br>");
        clickOnElement(_openAccountTab);
        log.info("Clicking on Open Account Tab: " + _openAccountTab.toString());
    }
    public void clickOnCustomersTab() {
        Reporter.log("Clicking on Customers Tab: " + _customersTab.toString() + "<br>");
        clickOnElement(_customersTab);
        log.info("Clicking on Customers Tab: " + _customersTab.toString());
    }
    public void clickOnHomepageBtn (){
        Reporter.log("Clicking on Home Page Button : " + _homePageBtn.toString() + "<br>");
        clickOnElement(_homePageBtn);
        log.info("Clicking on Home Page Button : " + _homePageBtn.toString());
    }
}
