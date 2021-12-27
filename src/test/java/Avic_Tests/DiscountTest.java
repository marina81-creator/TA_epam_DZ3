package Avic_Tests;

import org.testng.annotations.Test;

public class DiscountTest extends BaseTest {
    @Test
    public void checkIsRedirectToAuth(){
        getHomePage().clickOnLinks();
        getDiscountPage().clickOnCategory();
    }
}
