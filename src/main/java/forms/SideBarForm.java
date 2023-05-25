package forms;

import element.Button;
import org.openqa.selenium.By;

public class SideBarForm extends BaseForm {

    private final Button composeLetterButton = new Button(By
            .xpath("//*[contains(@class, 'compose-button') and contains(@class, 'txt')]"));

    public SideBarForm() {
        super(By.xpath("//*[@id='sideBarContent']"));
    }

    private void clickComposeLetterButton() {
        composeLetterButton.click();
    }

    public ComposeLetterForm getComposeLetterForm() {
        clickComposeLetterButton();
        return new ComposeLetterForm();
    }
}