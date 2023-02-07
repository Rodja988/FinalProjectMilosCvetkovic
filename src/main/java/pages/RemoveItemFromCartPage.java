package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveItemFromCartPage extends BasePage{
    public RemoveItemFromCartPage(WebDriver driver) {
        super(driver);
    }

    By addToCartSLBackpackButtonBy = By.id("add-to-cart-sauce-labs-backpack");
    By addToCartSLTShirtButtonBy = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By addToCartSLJacketButtonBy = By.id("add-to-cart-sauce-labs-fleece-jacket");
    By shoppingCartButtonBy = By.id("shopping_cart_container");
    By removeSLBackpackButtonBy = By.id("remove-sauce-labs-backpack");

    public void clickOnAddToCartBackpackButton(){
        clickElement(addToCartSLBackpackButtonBy);
    }
    public void clickOnAddToCartShirtButton(){
        clickElement(addToCartSLTShirtButtonBy);
    }
    public void clickOnAddToCartJacketButton(){
        clickElement(addToCartSLJacketButtonBy);
    }
    public void clickOnShoppingCartButton(){
        clickElement(shoppingCartButtonBy);
    }
    public void clickOnRemoveBackpackButton(){
        clickElement(removeSLBackpackButtonBy);
    }
    public String readingNumberFromShoppingCart(){
        return readText(shoppingCartButtonBy);
    }
}
