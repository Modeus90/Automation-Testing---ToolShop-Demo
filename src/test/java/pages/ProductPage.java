package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.interactions.Actions;
import utils.LoggerUtil;

public class ProductPage extends BasePage {

    @FindBy(linkText = "Products")
    private WebElement productsLink;

    @FindBy(xpath = "//input[@type='range']")
    private WebElement priceRangeSlider;

    @FindBy(xpath = "//button[text()='Add to Cart']")
    private WebElement addToCartButton;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToProducts() {
        productsLink.click();
        LoggerUtil.info("Navigated to Products Page");
    }

    public void adjustPriceRange(int value) {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(priceRangeSlider, value, 0).build().perform();
        LoggerUtil.info("Adjusted price range to: " + value);
    }

    public void addToCart() {
        addToCartButton.click();
        LoggerUtil.info("Product added to cart");
    }
}