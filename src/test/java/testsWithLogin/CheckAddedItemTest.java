package testsWithLogin;

import methods.VerifyMethods;
import org.testng.annotations.Test;
import pages.RemoveItemFromCartPage;

public class CheckAddedItemTest extends BaseTestWithLogin{

    @Test
    public void checkAddedItem(){
        RemoveItemFromCartPage removeItem = new RemoveItemFromCartPage(driver);
        removeItem.clickOnAddToCartBackpackButton();
        removeItem.clickOnShoppingCartButton();
        VerifyMethods verifyMethods = new VerifyMethods(driver);
        verifyMethods.verifyItems();
    }
}
