package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    //Logging the elements and method into the log4j logs and reports
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //previously collected locators
//    By homeButton = By.xpath("//button[@class='btn home']");
//    //Customer login btn
//    By customerLoginTab = By.xpath("//button[contains(text(),'Customer Login')]");
//    // Bank Manager login Btn
//    By bankManagerLoginTab = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    //Using selenium @Findby and initElement methods for locators/elements
// using _ help separate them from variable

    @FindBy(xpath = "//button[@class='btn home']")
    WebElement _homeButton;

    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement _customerLoginTab;

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement _bankManagerLoginTab;

    public void clickOnBankManagerLoginTab (){
        Reporter.log("Clicking on Manager Login Tab: " + _bankManagerLoginTab.toString() + "<br>");
        clickOnElement(_bankManagerLoginTab);
        log.info("Clicking on Manager Login Tab: " + _bankManagerLoginTab.toString());
    }

    public void clickOnCustomerLoginTab (){
        Reporter.log("Clicking on Customer Login Tab: " + _customerLoginTab.toString() + "<br>");
        clickOnElement(_customerLoginTab);
        log.info("Clicking on Customer Login Tab: " + _customerLoginTab.toString());
    }

}
