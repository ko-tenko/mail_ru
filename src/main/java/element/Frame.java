package element;

import driver.CustomWebDriver;
import driver.CustomWaits;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class Frame extends BaseElement {

    private static final Logger LOGGER = LogManager.getLogger();
    private final By locator;
    private final String name;

    public Frame(By locator, String  name) {
        super(locator, name);
        this.locator = locator;
        this.name = name;
    }

    public void switchToFrame() {
        LOGGER.info("Switching to frame [{}].", name);
        CustomWebDriver.getDriver().switchTo().frame(CustomWaits.isElementVisible(locator));
    }

    public void exitFrame() {
        LOGGER.info("Exiting frame [{}]", name);
        CustomWebDriver.getDriver().switchTo().defaultContent();
    }
}