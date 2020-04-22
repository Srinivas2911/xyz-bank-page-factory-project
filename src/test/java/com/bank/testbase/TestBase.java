package com.bank.testbase;

import com.bank.basepage.BasePage;
import com.bank.browserselector.BrowserSelector;
import com.bank.loadproperty.LoadProperty;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {


    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();
    String baseUrl = loadProperty.getProperty("baseUrl");
    String browser = loadProperty.getProperty("browser");

    @BeforeClass (groups = {"sanity", "smoke", "regression"})
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
//        ChromeOptions options = new ChromeOptions();
//        options.setPageLoadStrategy(PageLoadStrategy.NONE);
//        driver = new ChromeDriver(options);
//        driver.manage().window().setPosition(new Point(-2000, 0));//display 2

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }

    @AfterClass(groups = {"sanity", "smoke", "regression"})
    public void tearDown() {
        driver.quit();
    }

}
