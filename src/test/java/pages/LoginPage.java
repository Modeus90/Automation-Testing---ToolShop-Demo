package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LoggerUtil;

import java.time.Duration;

public class LoginPage extends BasePage {

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
        LoggerUtil.info("Logged in with email: " + email);
    }

    public void loginWithInvalidCredentials(String email, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(emailField)).sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
        LoggerUtil.info("Attempted login with invalid credentials: " + email);
    }
}