package forms;

import element.Button;
import org.openqa.selenium.By;

public class SideBarForm extends BaseForm {

    private final Button composeLetterButton = new Button(By
            .xpath("//*[contains(@class, 'compose-button') and contains(@class, 'txt')]"));

    public SideBarForm() {
        super(By.xpath("//*[@id='sideBarContent']"));
    }

    public void clickComposeLetterButton() {
        composeLetterButton.click();
    }
}