package Avic_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchWordTest extends BaseTest {
    private static final String SEARCH_KEYWORD = "Apple MacBook";
    private static final String EXPECTED_QUERY = "query=Apple+MacBook";

    @Test
    public void checkThatUrlContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_QUERY));
    }
}