package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    @FindBy(xpath = "//div[@class='top-links__left flex-wrap']//a[@href='/discount']")
    private WebElement searchLinks;

    @FindBy(xpath = "//div[@class='header-bottom__right-icon']//i[@class='icon icon-user-big']")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@class='button-reset search-btn']")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnLinks() {
        searchLinks.click();
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }

    public void searchByKeyword(final String keyword) {
        searchInput.sendKeys(keyword);
        searchButton.submit();
    }
}