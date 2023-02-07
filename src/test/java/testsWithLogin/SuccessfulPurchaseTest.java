package testsWithLogin;

import dataProviders.DataCreation;
import methods.SuccessfulPurchaseMethods;
import methods.VerifyMethods;
import org.testng.annotations.Test;

public class SuccessfulPurchaseTest extends BaseTestWithLogin{

    @Test
    public void successfulPurchase(){
        SuccessfulPurchaseMethods successfulPurchaseMethods = new SuccessfulPurchaseMethods(driver);
        successfulPurchaseMethods.successfulPurchase(DataCreation.generateFirstName(),
                                                     DataCreation.generateLastName(),
                                                     DataCreation.generatePostalCode());
        VerifyMethods verifyMethods = new VerifyMethods(driver);
        verifyMethods.verifyPurchase("BACK HOME");

    }
}
