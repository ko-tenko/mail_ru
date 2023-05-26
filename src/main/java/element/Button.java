package element;

import driver.CustomWaits;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class Button extends BaseElement {

    private static final Logger LOGGER = LogManager.getLogger();
    private final By locator;
    private final String name;

    public Button(By locator, String name) {
        super(locator, name);
        this.locator = locator;
        this.name = name;
    }

    public void submit() {
        LOGGER.info("Submitting button [{}].", name);
        CustomWaits.isElementVisible(locator).submit();
    }
}