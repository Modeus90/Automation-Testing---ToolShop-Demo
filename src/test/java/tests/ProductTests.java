package tests;

import hooks.Hooks;
import org.testng.annotations.Test;
import pages.ProductPage;
import utils.LoggerUtil;

public class ProductTests extends Hooks {

    @Test
    public void testAdjustPriceRange() {
        ProductPage productPage = new ProductPage(driver);

        productPage.navigateToProducts();
        productPage.adjustPriceRange(50); // Adjust slider to 50%
        LoggerUtil.info("Price range test completed");
    }
}