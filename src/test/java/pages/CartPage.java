package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LoggerUtil;

import java.time.Duration;

public class CartPage extends BasePage {

    @FindBy(linkText = "Cart")
    private WebElement cartLink;

    @FindBy(xpath = "//button[text()='Add to Cart']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//button[text()='Remove']")
    private WebElement removeButton;

    @FindBy(xpath = "//button[text()='Checkout']")
    private WebElement checkoutButton;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToCart() {
        cartLink.click();
        LoggerUtil.info("Navigated to Cart Page");
    }

    public void addProductToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
        LoggerUtil.info("Product added to cart");
    }

    public void removeProductFromCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(removeButton)).click();
        LoggerUtil.info("Product removed from cart");
    }

    public void proceedToCheckout() {
        checkoutButton.click();
        LoggerUtil.info("Proceeded to checkout");
    }
}