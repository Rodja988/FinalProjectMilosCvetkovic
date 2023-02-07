package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckAddedItemPage extends BasePage{
    public CheckAddedItemPage(WebDriver driver) {
        super(driver);
    }

    By itemNameIDBy = By.id("item_4_title_link");
    By itemNameInCartBy = By.className("inventory_item_name");

    public String readingItemName(){
        return readText(itemNameIDBy);
    }
    public String readingItemNameInCart(){
        return readText(itemNameInCartBy);
    }
}
