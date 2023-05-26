package element;

import driver.CustomWaits;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class TextField extends BaseElement {

    private static final Logger LOGGER = LogManager.getLogger();
    private final By locator;
    private final String name;

    public TextField(By locator, String name) {
        super(locator, name);
        this.locator = locator;
        this.name = name;
    }

    public void sendKeys(String key) {
        LOGGER.info("Sending keys to the field [{}].", name);
        CustomWaits.isElementVisible(locator).sendKeys(key);
    }
}