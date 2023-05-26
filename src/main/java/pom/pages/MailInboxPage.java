package pom.pages;

import element.Button;
import pom.BaseForm;
import pom.forms.SideBarForm;
import org.openqa.selenium.By;
import utils.FileManagerUtil;

public class MailInboxPage extends BaseForm {

    private final Button userButton = new Button(By
            .xpath(String.format("//*[@data-testid='whiteline-account' and contains(@aria-label, '%s')]", FileManagerUtil
                    .getValue("credentials.json", "username"))), "User Menu");

    public MailInboxPage() {
        super(By.xpath("//*[@data-testid='whiteline-account']"), "Inbox Page");
    }

    public boolean isUserLoggedIn() {
        return userButton.isDisplayed();
    }

    public SideBarForm getSideBarForm() {
        return new SideBarForm();
    }
}