package testsWithLogin;

import methods.LogOutMethods;
import methods.VerifyMethods;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTestWithLogin{

    @Test
    public void logOutTest(){
        LogOutMethods logOutMethods = new LogOutMethods(driver);
        logOutMethods.logOutMethod();
        VerifyMethods verifyMethods = new VerifyMethods(driver);
        verifyMethods.verifyLogOut("Login");

    }
}
