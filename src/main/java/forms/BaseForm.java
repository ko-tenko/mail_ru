package forms;

import driver.CustomWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public abstract class BaseForm {

    private final By element;


    public BaseForm(By element) {
        this.element = element;
    }

    public boolean isOpened() {
        try {
            CustomWebDriver.getDriver().findElement(element);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
