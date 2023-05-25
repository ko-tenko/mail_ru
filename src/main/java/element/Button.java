package element;

import driver.CustomWaits;
import org.openqa.selenium.By;

public class Button extends BaseElement {

    private final By locator;

    public Button(By locator) {
        super(locator);
        this.locator = locator;
    }

    public void submit() {
        CustomWaits.elementIsVisible(locator).submit();
    }
}
