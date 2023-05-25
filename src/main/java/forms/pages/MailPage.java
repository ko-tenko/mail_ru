package forms.pages;

import forms.BaseForm;
import org.openqa.selenium.By;

public class MailPage extends BaseForm {

    public MailPage() {
        super(By.xpath("//a[@data-testid= 'mailbox-create-link']"));
    }
}
