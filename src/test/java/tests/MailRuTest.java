package tests;

import element.Button;
import org.testng.annotations.Test;


public class MailRuTest extends BaseTest {

    @Test
    public void testMail() throws InterruptedException {
        Button button = new Button("//button[@data-testId='enter-mail-primary']");
        button.click();
        Thread.sleep(5000);

    }
}
