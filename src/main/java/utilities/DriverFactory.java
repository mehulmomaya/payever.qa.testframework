package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    protected static WebDriver driver;
    protected static Actions actions;
    protected static WebDriverWait wait;

    public DriverFactory() {
        initialize();
    }

    public void initialize() {
        if (driver == null)
            createNewDriverInstance();
    }

    private void createNewDriverInstance() {
//        String browser = new PropertyReader().readProperty("browser");
//        String browser = System.getProperty("env");
        String browser = "chrome";

        System.out.println("browser type passed is: " + browser);

        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/Drivers/geckodriver");
//            System.setProperty("webdriver.gecko.driver", "//usr/local/bin/geckodriver");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/Drivers/chromedriver");
//            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-infobars");
            // options.addArguments("--kiosk");
            driver = new ChromeDriver(options);
        } else {
            System.out.println("Invalid browser type");
        }

        actions = new Actions(driver);
        wait = new WebDriverWait(driver,30);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

    }

    public WebDriver getDriver() {
        return driver;
    }

    public void destroyDriver() {
        driver.quit();
        driver = null;
    }
}