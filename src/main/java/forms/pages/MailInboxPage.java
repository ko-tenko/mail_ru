package forms.pages;

import element.Button;
import forms.BaseForm;
import forms.SideBarForm;
import org.openqa.selenium.By;
import utils.FileManagerUtil;

public class MailInboxPage extends BaseForm {

    private final Button userButton = new Button(By
            .xpath(String.format("//*[@data-testid='whiteline-account' and contains(@aria-label, '%s')]", FileManagerUtil
                    .getValue("credentials.json", "username"))));

    public MailInboxPage() {
        super(By.xpath("//a[@data-testid= 'mailbox-create-link']"));
    }

    public boolean isUserLoggedIn() {
        return userButton.isDisplayed();
    }

    public SideBarForm getSideBarForm() {
        return new SideBarForm();
    }
}
