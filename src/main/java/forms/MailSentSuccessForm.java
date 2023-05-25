package forms;

import element.TextField;
import org.openqa.selenium.By;

public class MailSentSuccessForm extends BaseForm {

    private final TextField successTextField = new TextField(By.xpath("//*[@data-id='contact-to-0']"));

    public MailSentSuccessForm() {
        super(By.xpath("//div[@class='layer-sent-page']"));
    }

    public boolean isMailSent() {
        return successTextField.isDisplayed();
    }
}
