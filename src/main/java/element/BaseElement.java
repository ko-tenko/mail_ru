package element;

import driver.CustomWaits;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public abstract class BaseElement {

    private static final Logger LOGGER = LogManager.getLogger();
    private final By locator;
    private final String name;

    public BaseElement(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    public void click() {
        LOGGER.info("Clicking button [{}].", name);
        CustomWaits.isElementVisible(locator).click();
    }

    public boolean isDisplayed() {
        LOGGER.info("Checking if element [{}] is displayed.", name);
        return CustomWaits.isElementVisible(locator).isDisplayed();
    }
}