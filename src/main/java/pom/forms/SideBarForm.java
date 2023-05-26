package pom.forms;

import element.Button;
import org.openqa.selenium.By;
import pom.BaseForm;

public class SideBarForm extends BaseForm {

    private final Button composeLetterButton = new Button(By
            .xpath("//*[contains(@class, 'compose-button') and contains(@class, 'txt')]"), "Compose letter");

    public SideBarForm() {
        super(By.xpath("//*[@id='sideBarContent']"), "SideBarForm");
    }

    private void clickComposeLetterButton() {
        composeLetterButton.click();
    }

    public ComposeLetterForm getComposeLetterForm() {
        clickComposeLetterButton();
        return new ComposeLetterForm();
    }
}