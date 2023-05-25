package forms.pages;

import element.Button;
import element.Frame;
import forms.BaseForm;
import org.openqa.selenium.By;

public class MainPage extends BaseForm {

    private final Button loginButton = new Button(By.xpath("//*[@data-testid= 'enter-mail-primary']"));
    private final Frame loginFrame = new Frame(By.xpath("//iframe[contains(@src, 'login')]"));

    public MainPage() {
        super(By.xpath("//a[@data-testid= 'mailbox-create-link']"));
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void switchToLoginFrame() {
        loginFrame.switchToFrame();
    }

    public void exitLoginFrame() {
        loginFrame.exitFrame();
    }

}
