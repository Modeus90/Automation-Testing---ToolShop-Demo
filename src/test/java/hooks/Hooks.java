package hooks;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.BrowserFactory;
import utils.ConfigReader;
import utils.LoggerUtil;

public class Hooks {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        String browser = ConfigReader.getProperty("browser");
        driver = BrowserFactory.getDriver(browser);
        driver.get(ConfigReader.getProperty("url"));
        LoggerUtil.info("Browser launched and navigated to the website");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            LoggerUtil.info("Browser closed");
        }
    }
}