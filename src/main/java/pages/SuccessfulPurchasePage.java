package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessfulPurchasePage extends BasePage{
    public SuccessfulPurchasePage(WebDriver driver) {
        super(driver);
    }
    By checkoutButtonBy = By.id("checkout");
    By firstNameFieldBy = By.id("first-name");
    By lastNameFieldBy = By.id("last-name");
    By zipCodeFieldBy = By.id("postal-code");
    By continueButtonBy = By.id("continue");
    By finishButtonBy = By.id("finish");
    By backHomeButtonBy = By.id("back-to-products");

    public void clickCheckoutButton(){
        clickElement(checkoutButtonBy);
    }
    public void writeFirstNameField(String fname){
        writeText(firstNameFieldBy, fname);
    }
    public void writeLastNameField(String lname){
        writeText(lastNameFieldBy, lname);
    }
    public void writeZipCodeField(String zipcode){
        writeText(zipCodeFieldBy,zipcode);
    }
    public void clickContinueButton(){
        clickElement(continueButtonBy);
    }
    public void clickFinishButton(){
        clickElement(finishButtonBy);
    }
    public String readTextFromBackHomeButton(){
        return readText(backHomeButtonBy);
    }
}
