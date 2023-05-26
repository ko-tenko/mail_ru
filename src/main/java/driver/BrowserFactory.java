package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utils.FileManagerUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class BrowserFactory {

    private static final Logger LOGGER = LogManager.getLogger();

    static List<String> PARAMETERS = new ArrayList<>(Arrays.asList(
            "--incognito",
            "--start-maximized",
            "--disable-infobars",
            "--disable-extensions"
    ));

    private BrowserFactory() {}

    public static WebDriver getWebDriver() {
        String browserName = FileManagerUtil.getValue("config.json", "browser");
        if (browserName.equalsIgnoreCase("chrome")) {
            return getChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            return getFirefoxDriver();
        } else {
            LOGGER.error("Unsupported browser: " + browserName);
            throw new IllegalArgumentException();
        }
    }

    private static WebDriver getChromeDriver() {
        LOGGER.info("Getting Chrome WebDriver instance.");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        for (String parameter : PARAMETERS) {
            options.addArguments(parameter);
        }
        return new ChromeDriver(options);
    }

    private static WebDriver getFirefoxDriver() {
        LOGGER.info("Getting Gecko WebDriver instance.");
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        for (String parameter : PARAMETERS) {
            options.addArguments(parameter);
        }
        return new FirefoxDriver(options);
    }
}