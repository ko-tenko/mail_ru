package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.FileManagerUtil;
import java.time.Duration;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public final class CustomWaits {

    private static final WebDriver driver = CustomWebDriver.getDriver();
    private static final int TIMEOUT = Integer.parseInt(FileManagerUtil.getValue("config.json", "timeout"));

    public static WebElement isElementVisible(By locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT)).until(visibilityOfElementLocated(locator));
    }
}