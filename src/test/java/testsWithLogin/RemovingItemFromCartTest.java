package testsWithLogin;

import methods.RemoveItemMethods;
import methods.VerifyMethods;
import org.testng.annotations.Test;

public class RemovingItemFromCartTest extends BaseTestWithLogin{

    @Test
    public void removeItem(){
        RemoveItemMethods removeItemMethods = new RemoveItemMethods(driver);
        removeItemMethods.removingItemFromShoppingCart();
        VerifyMethods verifyMethods = new VerifyMethods(driver);
        verifyMethods.verifyItemRemoval("2");
    }
}
