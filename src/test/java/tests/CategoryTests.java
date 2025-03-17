package tests;

import hooks.Hooks;
import org.testng.annotations.Test;
import pages.CategoryPage;
import utils.LoggerUtil;

public class CategoryTests extends Hooks {

    @Test
    public void testSelectCategory() {
        CategoryPage categoryPage = new CategoryPage(driver);

        categoryPage.selectCategory("Category 1");
        LoggerUtil.info("Category test completed");
    }
}