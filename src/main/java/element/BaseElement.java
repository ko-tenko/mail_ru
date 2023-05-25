package element;

import driver.DriverWaits;

public abstract class BaseElement {

    private final String xpath;

    public BaseElement(String xpath) {
        this.xpath = xpath;
    }


    public void click() {
        DriverWaits.elementIsVisible(xpath).click();
    }
}
