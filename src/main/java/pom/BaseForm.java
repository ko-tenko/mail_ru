package pom;

import driver.CustomWaits;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public abstract class BaseForm {

    private static final Logger LOGGER = LogManager.getLogger();
    private final By locator;
    private final String name;


    public BaseForm(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    public boolean isOpened() {
        try {
            LOGGER.info("Opening [{}].", name);
            CustomWaits.isElementVisible(locator).isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            LOGGER.error("{} wasn't open, element was not found.", name);
            return false;
        }
    }
}
