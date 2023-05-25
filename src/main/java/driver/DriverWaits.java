package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class DriverWaits {

    private static final WebDriver driver = CustomWebDriver.getDriver();

    public static WebElement elementIsVisible(String xpath) {
        return new WebDriverWait(driver, Duration.ofSeconds(5)).until(visibilityOfElementLocated(By.xpath(xpath)));
    }
}
