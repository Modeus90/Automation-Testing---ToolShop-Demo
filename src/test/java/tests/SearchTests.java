package tests;

import hooks.Hooks;
import org.testng.annotations.Test;
import pages.SearchPage;
import utils.LoggerUtil;

public class SearchTests extends Hooks {

    @Test
    public void testSearchForProduct() {
        SearchPage searchPage = new SearchPage(driver);

        searchPage.searchForProduct("Pliers");
        LoggerUtil.info("Search test completed");
    }
}