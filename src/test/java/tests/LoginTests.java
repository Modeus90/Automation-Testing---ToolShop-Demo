package tests;

import hooks.Hooks;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.DataProviderUtil;
import utils.LoggerUtil;

public class LoginTests extends Hooks {

    @Test(dataProvider = "loginData", dataProviderClass = DataProviderUtil.class)
    public void testLoginWithValidCredentials(String email, String password) {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickSignInLink();
        loginPage.login(email, password);
        LoggerUtil.info("Login test completed with email: " + email);
    }

    @Test(dataProvider = "invalidLoginData", dataProviderClass = DataProviderUtil.class)
    public void testLoginWithInvalidCredentials(String email, String password) {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.clickSignInLink();
        loginPage.loginWithInvalidCredentials(email, password);
        LoggerUtil.info("Invalid login test completed with email: " + email);
    }
}