package tests;

import driver.CustomWebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.FileManagerUtil;

public class BaseTest {

    private static final Logger LOGGER = LogManager.getLogger();
    WebDriver browser = CustomWebDriver.getDriver();

    @BeforeMethod
    public void setUp() {
        String URL = FileManagerUtil.getValue("config.json", "url");
        LOGGER.info("Getting url [{}]", URL);
        browser.get(URL);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        LOGGER.info("Quitting browser.");
        browser.quit();
    }
}
