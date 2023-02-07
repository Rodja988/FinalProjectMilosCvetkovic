package testsWithLogin;

import methods.LoginMethods;
import org.testng.annotations.BeforeMethod;
import tests.BaseTest;
import utilities.PropertyManager;

public class BaseTestWithLogin extends BaseTest {

    @BeforeMethod
    public void setup(){
        super.setup("browser");

        LoginMethods loginMethods = new LoginMethods(driver);
        loginMethods.loginMethod(PropertyManager.getInstance().getValidUsername(),
                                 PropertyManager.getInstance().getValidPassword());
    }
}
