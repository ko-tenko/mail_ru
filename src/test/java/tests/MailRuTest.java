package tests;

import pom.forms.ComposeLetterForm;
import pom.forms.CookieForm;
import pom.forms.MailSentSuccessForm;
import pom.forms.SideBarForm;
import pom.pages.MailInboxPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.frames.UserLoginFrame;
import pom.pages.MainPage;


public class MailRuTest extends BaseTest {

    @Test
    public void testMailSending() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.isOpened(), "Main Page wasn't open.");
        CookieForm cookieForm = new CookieForm();
        cookieForm.clickAcceptButton();
        mainPage.clickLoginButton();
        mainPage.switchToLoginFrame();
        UserLoginFrame userLoginFrame = new UserLoginFrame();
        userLoginFrame.enterUsername();
        userLoginFrame.clickEnterPasswordButton();
        userLoginFrame.enterPassword();
        userLoginFrame.clickSubmitButton();
        mainPage.exitLoginFrame();
        MailInboxPage mailInboxPage = new MailInboxPage();
        Assert.assertTrue(mailInboxPage.isOpened(), "MaiLInboxPage wasn't open.");
        Assert.assertTrue(mailInboxPage.isUserLoggedIn(), "User wasn't logged in.");
        SideBarForm sideBarForm = mailInboxPage.getSideBarForm();
        ComposeLetterForm composeLetterForm = sideBarForm.getComposeLetterForm();
        Assert.assertTrue(composeLetterForm.isOpened(), "ComposeLetterForm wasn't open.");
        composeLetterForm.enterRecipientTextField();
        composeLetterForm.enterSubjectTextField();
        composeLetterForm.enterBodyTextField();
        composeLetterForm.clickSendButton();
        MailSentSuccessForm successForm = new MailSentSuccessForm();
        Assert.assertTrue(successForm.isMailSent(), "The letter wasn't sent.");
    }
}
