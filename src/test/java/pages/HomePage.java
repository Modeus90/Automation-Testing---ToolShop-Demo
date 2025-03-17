package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.LoggerUtil;

public class HomePage extends BasePage {

    @FindBy(linkText = "Sign In")
    private WebElement signInLink;

    @FindBy(linkText = "Register")
    private WebElement registerLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSignInLink() {
        signInLink.click();
        LoggerUtil.info("Clicked on Sign In Link");
    }

    public void clickRegisterLink() {
        registerLink.click();
        LoggerUtil.info("Clicked on Register Link");
    }
}