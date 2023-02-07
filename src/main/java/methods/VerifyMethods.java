package methods;

import org.openqa.selenium.WebDriver;
import pages.*;

public class VerifyMethods extends BasePage {
    public VerifyMethods(WebDriver driver) {
        super(driver);
    }
    LoginPage loginPage = new LoginPage(driver);
    RemoveItemFromCartPage removeItemFromCartPage = new RemoveItemFromCartPage(driver);
    SuccessfulPurchasePage successfulPurchasePage = new SuccessfulPurchasePage(driver);
    CheckAddedItemPage checkAddedItemPage = new CheckAddedItemPage(driver);

    public void verifyLogin(String expectedText){
        assertStringEquals(loginPage.readingTextFromHeader(), expectedText);
    }
    public void verifyFailedLogin(String expectedText){
        assertStringEquals(loginPage.readingTextFromErrorMessage(), expectedText);
    }
    public void verifyLogOut(String expectedText){
        assertStringEquals(loginPage.readingTextFromLoginButton(), expectedText);
    }
    public void verifyItemRemoval(String expectedText){
        assertStringEquals(removeItemFromCartPage.readingNumberFromShoppingCart(), expectedText);
    }
    public void verifyPurchase(String expectedText){
        assertStringEquals(successfulPurchasePage.readTextFromBackHomeButton(), expectedText);
    }
    public void verifyItems(){
        assertStringEquals(checkAddedItemPage.readingItemName(), checkAddedItemPage.readingItemNameInCart());
    }

}
