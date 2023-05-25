package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import forms.LoginFrame;
import forms.pages.MainPage;


public class MailRuTest extends BaseTest {

    @Test
    public void testMail() throws InterruptedException {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.isOpened());
        mainPage.clickLoginBtn();
        mainPage.switchToLoginFrame();
        LoginFrame loginFrame = new LoginFrame();
        Assert.assertTrue(loginFrame.isOpened());
        loginFrame.enterUsername();
        loginFrame.clickEnterPasswordButton();
        loginFrame.enterPassword();
        loginFrame.clickSubmitButton();
    }
}
