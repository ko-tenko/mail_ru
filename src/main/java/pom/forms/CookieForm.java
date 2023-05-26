package pom.forms;

import element.Button;
import org.openqa.selenium.By;
import pom.BaseForm;

public class CookieForm extends BaseForm {

    private final Button acceptButton = new Button(By.xpath("//*[@id='cmpbntyestxt']"), "Accept");

    public CookieForm() {
        super(By.xpath("//*[@id='cmpboxcontent']"), "CookieForm");
    }

    public void clickAcceptButton() {
        acceptButton.click();
    }
}