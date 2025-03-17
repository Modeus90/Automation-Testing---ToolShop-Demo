package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LoggerUtil;

import java.time.Duration;

public class RegisterPage extends BasePage {

    @FindBy(id = "first_name")
    private WebElement firstNameField;

    @FindBy(id = "last_name")
    private WebElement lastNameField;

    @FindBy(id = "dob")
    private WebElement dobField;

    @FindBy(id = "address")
    private WebElement addressField;

    @FindBy(id = "postcode")
    private WebElement postcodeField;

    @FindBy(id = "city")
    private WebElement cityField;

    @FindBy(id = "state")
    private WebElement stateField;

    @FindBy(id = "country")
    private WebElement countryField;

    @FindBy(id = "phone")
    private WebElement phoneField;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[text()='Register']")
    private WebElement registerButton;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void register(String firstName, String lastName, String dob, String address, String postcode, String city, String state, String country, String phone, String email, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(firstNameField)).sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        dobField.sendKeys(dob);
        addressField.sendKeys(address);
        postcodeField.sendKeys(postcode);
        cityField.sendKeys(city);
        stateField.sendKeys(state);
        countryField.sendKeys(country);
        phoneField.sendKeys(phone);
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        registerButton.click();
        LoggerUtil.info("Registered with email: " + email);
    }
}