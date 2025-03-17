package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.LoggerUtil;

public class CategoryPage extends BasePage {

    @FindBy(linkText = "Category 1")
    private WebElement category1Link;

    @FindBy(linkText = "Category 2")
    private WebElement category2Link;

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public void selectCategory(String categoryName) {
        if (categoryName.equalsIgnoreCase("Category 1")) {
            category1Link.click();
        } else if (categoryName.equalsIgnoreCase("Category 2")) {
            category2Link.click();
        }
        LoggerUtil.info("Selected category: " + categoryName);
    }
}