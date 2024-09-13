package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.time.Duration;

public class WebDriverUtil {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static WebDriverWait waitVisible;
    protected static WebDriverWait waitClickable;
    public static final Logger logger = LogManager.getLogger(WebDriverUtil.class);


    private WebDriverUtil() {

    }

    static String browser = System.getProperty("browser", "EDGE").toUpperCase();

    public static WebDriver getDriver() {
        if (driver == null) {

            switch (browser) {
                case "FIREFOX":
                    System.setProperty("webdriver.gecko.driver", "D:\\5. Webdriver\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
                    driver = new FirefoxDriver();
                    break;
                case "CHROME":
                    System.setProperty("webdriver.chrome.driver", "D:\\5. Webdriver\\chromedriver-win64\\chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                case "EDGE":
                    System.setProperty("webdriver.edge.driver", "D:\\5. Webdriver\\edgedriver_win64\\msedgedriver.exe");
                    driver = new EdgeDriver();
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported browser: " + browser);
            }
            driver.manage().window().maximize();
            logger.info("WebDriver initialized: {}", browser);

        }
        return driver;
    }

    public static WebDriverWait getWait() {
        if (wait == null && driver != null) {
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }
        return wait;
    }

    public static WebDriverWait getWaitVisible() {
        if (waitVisible == null && driver != null) {
            waitVisible = new WebDriverWait(driver, Duration.ofSeconds(10));
        }
        return waitVisible;
    }

    public static WebDriverWait getWaitClickable() {
        if (waitClickable == null && driver != null) {
            waitClickable = new WebDriverWait(driver, Duration.ofSeconds(20));
        }
        return waitClickable;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
            wait = null;
            logger.info("WebDriver quit");
        }
    }
}
