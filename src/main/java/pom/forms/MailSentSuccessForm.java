package pom.forms;

import element.TextField;
import org.openqa.selenium.By;
import pom.BaseForm;

public class MailSentSuccessForm extends BaseForm {

    private final TextField successTextField = new TextField(By.xpath("//*[@data-id='contact-to-0']"), "Success");

    public MailSentSuccessForm() {
        super(By.xpath("//div[@class='layer-sent-page']"), "SuccessForm");
    }

    public boolean isMailSent() {
        return successTextField.isDisplayed();
    }
}