package tests;

import driver.CustomWebDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    WebDriver browser = CustomWebDriver.getDriver();

    @BeforeMethod
    public void setUp() {
        browser.get("https://mail.ru/");
    }

    @AfterMethod
    public void tearDown() {
        browser.quit();
    }
}
