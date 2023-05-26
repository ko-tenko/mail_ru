package driver;

import org.openqa.selenium.WebDriver;

public final class CustomWebDriver {

    private static WebDriver driver;

    private CustomWebDriver() {}

    public static WebDriver getDriver() {
        if (driver == null) {
            driver =  BrowserFactory.getWebDriver();
        }
        return driver;
    }
}
