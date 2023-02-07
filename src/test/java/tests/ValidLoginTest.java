package tests;

import methods.LoginMethods;
import methods.VerifyMethods;
import org.testng.annotations.Test;
import utilities.PropertyManager;

public class ValidLoginTest extends BaseTest{

    @Test
    public void validLogin(){
        LoginMethods loginMethods = new LoginMethods(driver);
        loginMethods.loginMethod(PropertyManager.getInstance().getValidUsername(),
                                 PropertyManager.getInstance().getValidPassword());
        VerifyMethods verifyMethods = new VerifyMethods(driver);
        verifyMethods.verifyLogin("PRODUCTS");
    }
}
