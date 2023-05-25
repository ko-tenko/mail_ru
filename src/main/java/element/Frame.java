package element;

import driver.CustomWebDriver;
import driver.CustomWaits;
import org.openqa.selenium.By;

public class Frame extends BaseElement {

    private final By locator;

    public Frame(By locator) {
        super(locator);
        this.locator = locator;
    }

    public void switchToFrame() {
        CustomWebDriver.getDriver().switchTo().frame(CustomWaits.elementIsVisible(locator));
    }

    public void exitFrame() {
        CustomWebDriver.getDriver().switchTo().defaultContent();
    }
}
