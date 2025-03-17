package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LoggerUtil;

import java.time.Duration;

public class SearchPage extends BasePage {

    @FindBy(id = "search")
    private WebElement searchBox;

    @FindBy(xpath = "//button[text()='Search']")
    private WebElement searchButton;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void searchForProduct(String productName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(searchBox)).sendKeys(productName);
        searchButton.click();
        LoggerUtil.info("Searched for product: " + productName);
    }
}