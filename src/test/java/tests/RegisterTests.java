package tests;

import hooks.Hooks;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import utils.LoggerUtil;

public class RegisterTests extends Hooks {

    @Test
    public void testRegisterNewUser() {
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);

        homePage.clickRegisterLink();
        registerPage.register("John", "Doe", "1990-01-01", "123 Main St", "12345", "New York", "NY", "USA", "1234567890", "john.doe@example.com", "password123");
        LoggerUtil.info("Registration test completed");
    }
}