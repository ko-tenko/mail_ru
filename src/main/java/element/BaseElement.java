package element;

import driver.CustomWaits;
import org.openqa.selenium.By;

public abstract class BaseElement {

    private final By locator;

    public BaseElement(By locator) {
        this.locator = locator;
    }


    public void click() {
        CustomWaits.elementIsVisible(locator).click();
    }


}
