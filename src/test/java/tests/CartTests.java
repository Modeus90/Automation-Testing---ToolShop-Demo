package tests;

import hooks.Hooks;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import utils.LoggerUtil;

public class CartTests extends Hooks {

    @Test
    public void testAddProductToCart() {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);

        homePage.clickSignInLink();
        productPage.navigateToProducts();
        productPage.addToCart();
        cartPage.navigateToCart();
        LoggerUtil.info("Product added to cart test completed");
    }

    @Test
    public void testRemoveProductFromCart() {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);

        homePage.clickSignInLink();
        productPage.navigateToProducts();
        productPage.addToCart();
        cartPage.navigateToCart();
        cartPage.removeProductFromCart();
        LoggerUtil.info("Product removed from cart test completed");
    }
}