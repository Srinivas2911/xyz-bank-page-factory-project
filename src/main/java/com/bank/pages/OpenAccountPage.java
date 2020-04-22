package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {

    //Logging the elements and method into the log4j logs and reports
    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    //previously collected locators
/*
*    By selectCustName = By.xpath("//select[@name='userSelect']");
*    By selectCurrency = By.xpath("//select[@name='currency']");
*    By processBtn = By.xpath("//button[contains(text(),'Process')]");0
*    By homePageBtn = By.xpath("//button[@class='btn home']");
*/

    //Using selenium @Findby and initElement methods for locators/elements
// using _ help separate them from variable

@FindBy(xpath = "//select[@name='userSelect']")
WebElement _selectCustName;

@FindBy(xpath = "//select[@name='currency']")
WebElement _selectCurrency;

@FindBy(xpath = "//button[contains(text(),'Process')]")
WebElement _processBtn;

@FindBy(xpath = "//button[@class='btn home']")
WebElement _homePageBtn;

    public void clickOnHomepageBtn () {
        Reporter.log("Clicking on Home Page Button : " + _homePageBtn.toString() + "<br>");
        clickOnElement(_homePageBtn);
        log.info("Clicking on Home Page Button : " + _homePageBtn.toString());
    }

    public void selectCustomerNameFromDropDown (String customer){
        Reporter.log("Selecting Customer Name from Drop Down : " + customer + " On Select Customer Field " + _selectCustName.toString() + "<br>");
        selectByVisibleTextFromDropDown(_selectCustName, customer);
        log.info("Selecting Customer Name from Drop Down : " + customer + " On Select Customer Field " + _selectCustName.toString());
    }
    public void selectCurrencyFromDropDown(String currency){
        Reporter.log("Selecting Currency from Drop Down : " + currency + " On Select Currency Field " + _selectCurrency.toString() + "<br>");
        selectByVisibleTextFromDropDown(_selectCurrency, currency);
        log.info("Selecting Currency from Drop Down : " + currency + " On Select Currency Field " + _selectCurrency.toString());
    }
    public void clickOnProcessButton(){
        Reporter.log("Clicking on Process Button : " + _processBtn.toString() + "<br>");
        log.info("Clicking on Process Button : "+ _processBtn.toString());
        clickOnElement(_processBtn);
    }
    public void popUpDisplayMessage (){
        Reporter.log("Displaying PopUp Message. <br>");
        alertPopUp();
        log.info("Displaying PopUp Message.");

    }

}
