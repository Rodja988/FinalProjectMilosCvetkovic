package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.UserLoggedInPage;

public class LogOutMethods extends UserLoggedInPage {
    public LogOutMethods(WebDriver driver) {
        super(driver);
    }

    public void logOutMethod(){
        clickOnMenuButton();
        clickOnLogOutButton();
    }


}
