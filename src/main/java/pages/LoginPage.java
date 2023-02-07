package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By usernameFieldBy = By.id("user-name");
    By passwordFieldBy = By.id("password");
    By loginButtonBy = By.id("login-button");
    By headerMessageBy = By.className("title");
    By errorMessageNotificationBy = By.xpath("//div[@class='error-message-container error']");

    public void writeUsernameField(String username){
        writeText(usernameFieldBy, username);
    }
    public void writePasswordField(String password){
        writeText(passwordFieldBy, password);
    }
    public void clickLoginButton(){
        clickElement(loginButtonBy);
    }
    public String readingTextFromHeader(){
        return readText(headerMessageBy);
    }
    public String readingTextFromErrorMessage(){
        return readText(errorMessageNotificationBy);
    }
    public String readingTextFromLoginButton(){
        return readAttribute(loginButtonBy, "value");
    }
}
