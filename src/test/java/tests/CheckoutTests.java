package tests;

import hooks.Hooks;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductPage;
import utils.LoggerUtil;

public class CheckoutTests extends Hooks {

    @Test
    public void testCheckoutProcess() {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        homePage.clickSignInLink();
        productPage.navigateToProducts();
        productPage.addToCart();
        cartPage.navigateToCart();
        cartPage.proceedToCheckout();
        checkoutPage.enterShippingDetails("John", "Doe", "12345");
        checkoutPage.clickContinue();
        checkoutPage.completeCheckout();
        LoggerUtil.info("Checkout process test completed");
    }
}