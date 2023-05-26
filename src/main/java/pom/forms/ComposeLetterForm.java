package pom.forms;

import element.Button;
import element.TextField;
import org.openqa.selenium.By;
import pom.BaseForm;
import utils.FileManagerUtil;
import utils.TextUtil;

public class ComposeLetterForm extends BaseForm {

    private final TextField recipientTextField = new TextField(By.xpath("//*[@data-type='to']//input"), "Recipient");
    private final TextField subjectTextField = new TextField(By.xpath("//input[@name='Subject']"), "Subject");
    private final TextField bodyTextField = new TextField(By.xpath("//*[@role='textbox']"), "Body");
    private final Button sendButton = new Button(By.xpath("//*[@data-test-id='send']"), "Send Mail");

    public ComposeLetterForm() {
        super(By.xpath("//*[@data-test-id='save']"), "ComposeLetterForm");
    }

    public void enterRecipientTextField() {
        recipientTextField.sendKeys(FileManagerUtil.getValue("credentials.json", "username"));
    }

    public void enterSubjectTextField() {
        subjectTextField.sendKeys(TextUtil.generateText(1));
    }

    public void enterBodyTextField() {
        bodyTextField.sendKeys(TextUtil.generateText(10));
    }

    public void clickSendButton() {
        sendButton.click();
    }
}