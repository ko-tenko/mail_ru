package element;

import driver.CustomWaits;
import org.openqa.selenium.By;

public class TextField extends BaseElement {

    private final By locator;

    public TextField(By locator) {
        super(locator);
        this.locator = locator;
    }

    public void sendKeys(String key) {
        CustomWaits.elementIsVisible(locator).sendKeys(key);
    }
}
