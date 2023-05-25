package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utils.FileManagerUtil;

public class BrowserFactory {

    private BrowserFactory() {}

    public static WebDriver getWebDriver() {
        String browserName = FileManagerUtil.getValue("config.json", "browser");
        if (browserName.equalsIgnoreCase("chrome")) {
            return getChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            return getFirefoxDriver();
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + browserName);
        }
    }

    private static WebDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-extensions");
        return new ChromeDriver(options);
    }

    private static WebDriver getFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-extensions");
        return new FirefoxDriver(options);
    }
}
