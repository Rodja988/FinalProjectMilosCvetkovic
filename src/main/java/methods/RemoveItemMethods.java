package methods;

import org.openqa.selenium.WebDriver;
import pages.RemoveItemFromCartPage;

public class RemoveItemMethods extends RemoveItemFromCartPage {
    public RemoveItemMethods(WebDriver driver) {
        super(driver);
    }

    public void removingItemFromShoppingCart(){
        clickOnAddToCartBackpackButton();
        clickOnAddToCartShirtButton();
        clickOnAddToCartJacketButton();
        clickOnShoppingCartButton();
        clickOnRemoveBackpackButton();

    }
}
