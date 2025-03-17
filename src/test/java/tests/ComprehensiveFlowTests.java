package tests;

import hooks.Hooks;
import org.testng.annotations.Test;
import pages.*;
import utils.LoggerUtil;

public class ComprehensiveFlowTests extends Hooks {

    @Test
    public void testComprehensiveFlow() {
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SearchPage searchPage = new SearchPage(driver);
        CategoryPage categoryPage = new CategoryPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        // Step 1: Register a new user
        homePage.clickRegisterLink();
        registerPage.register("John", "Doe", "1990-01-01", "123 Main St", "12345", "New York", "NY", "USA", "1234567890", "john.doe@example.com", "password123");
        LoggerUtil.info("Registration completed");

        // Step 2: Login with valid credentials
        homePage.clickSignInLink();
        loginPage.login("john.doe@example.com", "password123");
        LoggerUtil.info("Login completed");

        // Step 3: Search for a product
        searchPage.searchForProduct("Pliers");
        LoggerUtil.info("Search completed");

        // Step 4: Select a category
        categoryPage.selectCategory("Category 1");
        LoggerUtil.info("Category selection completed");

        // Step 5: Adjust price range
        productPage.navigateToProducts();
        productPage.adjustPriceRange(50); // Adjust slider to 50%
        LoggerUtil.info("Price range adjustment completed");

        // Step 6: Add a product to the cart
        productPage.addToCart();
        LoggerUtil.info("Product added to cart");

        // Step 7: Remove a product from the cart
        cartPage.navigateToCart();
        cartPage.removeProductFromCart();
        LoggerUtil.info("Product removed from cart");

        // Step 8: Add another product to the cart
        productPage.addToCart();
        LoggerUtil.info("Product added to cart");

        // Step 9: Proceed to checkout
        cartPage.navigateToCart();
        cartPage.proceedToCheckout();
        LoggerUtil.info("Proceeded to checkout");

        // Step 10: Complete the checkout process
        checkoutPage.enterShippingDetails("John", "Doe", "12345");
        checkoutPage.clickContinue();
        checkoutPage.completeCheckout();
        LoggerUtil.info("Checkout process completed");
    }
}