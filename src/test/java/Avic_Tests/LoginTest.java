package Avic_Tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void checkIsRedirectToAuth() {
        getHomePage().clickOnLoginButton();
    }
}
