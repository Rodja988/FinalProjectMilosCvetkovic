package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLoggedInPage extends BasePage{
    public UserLoggedInPage(WebDriver driver) {
        super(driver);
    }

    By openMenuButtonBy = By.id("react-burger-menu-btn");
    By logOutButtonBy = By.id("logout_sidebar_link");

    public void clickOnMenuButton(){
        clickElement(openMenuButtonBy);
    }
    public void clickOnLogOutButton(){
        clickElement(logOutButtonBy);
    }


}
