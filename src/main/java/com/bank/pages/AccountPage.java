package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends Utility {

    //Logging the elements and method into the log4j logs and reports
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

//Using selenium @Findby and initElement methods for locators/elements
// using _ help separate them from variable

    //previously collected locators
//    By depositTab = By.xpath("//button[contains(text(),'Deposit')]");
//    By amountDeposit = By.xpath("//input[@placeholder='amount']");
//    By depositBtn = By.xpath("//button[@class='btn btn-default']");
//    By depositSuccessText = By.xpath("//span[@class='error ng-binding']");
//    By withdrawlTab = By.xpath("//button[contains(text(),'Withdrawl')]");
//    By amountWithdrawl = By.xpath("//input[@placeholder='amount']");
//    By withdrawlBtn = By.xpath("//button[@class='btn btn-default']");
//    By transactionSuccessText = By.xpath("//span[@class='error ng-binding']");
//    By homePageBtn = By.xpath("//button[@class='btn home']");

    @FindBy(xpath = "//button[@class='btn home']")
    WebElement _homePageBtn;

    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    WebElement _depositTab;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement _amountDeposit;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _depositBtn;

    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement _depositSuccessText;

    @FindBy(xpath = "//button[contains(text(),'Withdrawl')]")
    WebElement _withdrawlTab;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement _amountWithdrawl;

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement _withdrawlBtn;

    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement _transactionSuccessText;


    public void clickOnHomepageBtn() {
        Reporter.log("Clicking on Home Page Tab: " + _homePageBtn.toString() + "<br>");
        clickOnElement(_homePageBtn);
        log.info("Clicking on Home Page Tab: " + _homePageBtn.toString());
    }

    public void clickOnDepositTab() {
        Reporter.log("Clicking on Deposit Tab: " + _depositTab.toString() + "<br>");
        clickOnElement(_depositTab);
        log.info("Clicking on Deposit Tab: " + _depositTab.toString());
    }

    public void enterDepositAmount(String depositAmount) {
        Reporter.log("Entering deposit amount : " + depositAmount + " On Deposit Amount Field  " + _amountDeposit.toString() + "<br>");
        clickOnElement(_amountDeposit);
        sendTextToElement(_amountDeposit, depositAmount);
        log.info("Entering deposit amount : " + depositAmount + " On Deposit Amount Field " + _amountDeposit.toString());
    }

    public void clickOnDepositButton() {
        Reporter.log("Clicking on Deposit Button: " + _depositBtn.toString() + "<br>");
        clickOnElement(_depositBtn);
        log.info("Clicking on Deposit Button: " + _depositBtn.toString());
    }

    public String getDepositSuccessfulText() {
        Reporter.log("Getting Deposit Success Text: " + _depositSuccessText.toString() + "<br>");
        log.info("Getting Deposit Success Text: " + _depositSuccessText.toString());
        return getTextFromElement(_depositSuccessText);
    }

    public void verifyThatDepositSuccessfulTextisDisplayed() {
        Reporter.log("Verifying Deposit Success Text: " + _depositSuccessText.toString() + "<br>");
        verifyThatTextIsDisplayed(_depositSuccessText, "Deposit Successful");
        log.info("Verifying Deposit Success Text: " + _depositSuccessText.toString());

    }

    public void clickOnWithdrawlTab() {
        Reporter.log("Clicking on Withdrawl Tab: " + _withdrawlTab.toString() + "<br>");
        clickOnElement(_withdrawlTab);
        log.info("Clicking on Withdrawl Tab: " + _withdrawlTab.toString());
    }

    public void enterWithdrawlAmount(String withdrawlAmount) {
        Reporter.log("Entering withdrawl amount : " + withdrawlAmount + " On Withdrawal Amount Field " + _amountWithdrawl.toString() + "<br>");
        clickOnElement(_amountWithdrawl);
        sendTextToElement(_amountWithdrawl, withdrawlAmount);
        log.info("Entering withdrawl amount : " + withdrawlAmount + " On Withdrawal Amount Field " + _amountWithdrawl.toString());
    }

    public void clickOnWithdrawlButton() {
        Reporter.log("Clicking on Withdrawl Button: " + _withdrawlBtn.toString() + "<br>");
        clickOnElement(_withdrawlBtn);
        log.info("Clicking on Withdrawl Button: " + _withdrawlBtn.toString());
    }

    public void verifyThatTransactionSuccessfulTextisDisplayed() {
        Reporter.log("Verifying Transaction Success Text: " + _transactionSuccessText.toString() + "<br>");
        verifyThatTextIsDisplayed(_transactionSuccessText, "Transaction successful");
        log.info("Verifying Transaction Success Text: " + _transactionSuccessText.toString());
    }
    public String getTransactionSuccessfulText() {
        Reporter.log("Getting Transaction Success Text: " + _transactionSuccessText.toString() + "<br>");
        log.info("Getting Transaction Success Text: " + _transactionSuccessText.toString());
        return getTextFromElement(_transactionSuccessText);
    }

}

