package pom.frames;

import element.Button;
import element.TextField;
import org.openqa.selenium.By;
import pom.BaseForm;
import utils.FileManagerUtil;

public class UserLoginFrame extends BaseForm {

    private final TextField usernameTextField = new TextField(By.xpath("//input[@name='username']"), "Username");
    private final Button enterPasswordButton = new Button(By.xpath("//*[@data-test-id='next-button']"), "Enter Password");
    private final TextField passwordTextField = new TextField(By.xpath("//input[@name='password']"), "Password");
    private final Button submitButton = new Button(By.xpath("//button[@data-test-id='submit-button']"), "SignIn");

    public UserLoginFrame() {
        super(By.xpath("//*[@data-test-id='saveauth']"), "LoginFrame");
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