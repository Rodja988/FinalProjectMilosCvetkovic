package tests;

import dataProviders.DataProviders;
import methods.LoginMethods;
import methods.VerifyMethods;
import org.testng.annotations.Test;

public class FailedLoginTest extends BaseTest{

    @Test(dataProvider = "failedLogin", dataProviderClass = DataProviders.class)
    public void failedLogin(String username, String password, String error){
        LoginMethods loginMethods = new LoginMethods(driver);
        loginMethods.loginMethod(username, password);
        VerifyMethods verifyMethods = new VerifyMethods(driver);
        verifyMethods.verifyFailedLogin(error);

    }
}
