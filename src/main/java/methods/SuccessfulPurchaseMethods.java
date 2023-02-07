package methods;

import org.openqa.selenium.WebDriver;
import pages.RemoveItemFromCartPage;
import pages.SuccessfulPurchasePage;

public class SuccessfulPurchaseMethods extends SuccessfulPurchasePage {

    public SuccessfulPurchaseMethods(WebDriver driver) {
        super(driver);
    }
    RemoveItemFromCartPage removeItem = new RemoveItemFromCartPage(driver);

    public void successfulPurchase(String fname, String lname, String zipcode){
        removeItem.clickOnAddToCartBackpackButton();
        removeItem.clickOnAddToCartShirtButton();
        removeItem.clickOnAddToCartJacketButton();
        removeItem.clickOnShoppingCartButton();
        clickCheckoutButton();
        writeFirstNameField(fname);
        writeLastNameField(lname);
        writeZipCodeField(zipcode);
        clickContinueButton();
        clickFinishButton();
    }
}
