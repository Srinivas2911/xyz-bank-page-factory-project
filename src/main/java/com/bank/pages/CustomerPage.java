package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerPage extends Utility {

    //Logging the elements and method into the log4j logs and reports
    private static final Logger log = LogManager.getLogger(CustomerPage.class.getName());

    //previously collected locators
//    By customerLogoutBtn = By.xpath("//button[@class='btn logout']");
//    By homePageBtn = By.xpath("//button[@class='btn home']");

    //Using selenium @Findby and initElement methods for locators/elements
// using _ help separate them from variable

@FindBy (xpath = "//button[@class='btn logout']")
WebElement _customerLogoutBtn;

@FindBy(xpath = "//button[@class='btn home']")
WebElement _homePageBtn;

    public void clickOnHomepageBtn () {
        Reporter.log("Clicking on Home Page Button : " + _homePageBtn.toString() + "<br>");
        clickOnElement(_homePageBtn);
        log.info("Clicking on Home Page Button : " + _homePageBtn.toString());
    }

    public String getCustomerLoutOutText (){
        Reporter.log("Getting Customer Log Out Text: " + _customerLogoutBtn.toString() + "<br>");
        log.info("Getting Customer Log Out Text: " + _customerLogoutBtn.toString());
        return getTextFromElement(_customerLogoutBtn);
    }

    public void verifyCustomerLoutOutTabIsDisplayed (){
        Reporter.log("Verifying Customer Log Out Tab is Displayed : " + _customerLogoutBtn.toString() + "<br>");
        verifyThatElementIsDisplayed(_customerLogoutBtn);
        log.info("Verifying Customer Log Out Tab is Displayed: " + _customerLogoutBtn.toString());
    }

    public void clickOnCustomerLogOutButton(){
        Reporter.log("Clicking on Customer Log Out Button : " + _customerLogoutBtn.toString() + "<br>");
        clickOnElement(_customerLogoutBtn);
        log.info("Clicking on Customer Log Out Button : " + _customerLogoutBtn.toString());
    }

}
