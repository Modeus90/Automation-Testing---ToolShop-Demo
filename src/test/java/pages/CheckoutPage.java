package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LoggerUtil;

import java.time.Duration;

public class CheckoutPage extends BasePage {

    @FindBy(id = "first-name")
    private WebElement firstNameField;

    @FindBy(id = "last-name")
    private WebElement lastNameField;

    @FindBy(id = "postal-code")
    private WebElement postalCodeField;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(id = "finish")
    private WebElement finishButton;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void enterShippingDetails(String firstName, String lastName, String postalCode) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(firstNameField)).sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        postalCodeField.sendKeys(postalCode);
        LoggerUtil.info("Entered shipping details");
    }

    public void clickContinue() {
        continueButton.click();
        LoggerUtil.info("Clicked on Continue Button");
    }

    public void completeCheckout() {
        finishButton.click();
        LoggerUtil.info("Checkout completed");
    }
}