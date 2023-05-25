package forms;

import element.Button;
import element.TextField;
import org.openqa.selenium.By;
import utils.FileManagerUtil;

public class LoginFrame extends BaseForm {

    private final TextField usernameTextField = new TextField(By.xpath("//input[@name='username']"));
    private final Button enterPasswordButton = new Button(By.xpath("//*[@data-test-id='next-button']"));
    private final TextField passwordTextField = new TextField(By.xpath("//input[@name='password']"));
    private final Button submitButton = new Button(By.xpath("//button[@data-test-id='submit-button']"));


    public LoginFrame() {
        super(By.xpath("//*[@data-test-id='saveauth']"));
    }

    public void enterUsername() {
        usernameTextField.sendKeys(FileManagerUtil.getValue("credentials.json", "username"));
    }

    public void clickEnterPasswordButton() {
        enterPasswordButton.click();
    }

    public void enterPassword() {
        passwordTextField.sendKeys(FileManagerUtil.getValue("credentials.json", "password"));
    }

    public void clickSubmitButton() {
        submitButton.submit();
    }
}