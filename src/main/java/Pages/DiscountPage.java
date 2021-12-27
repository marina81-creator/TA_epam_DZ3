package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DiscountPage extends BasePage {

    @FindBy(xpath = "//div[@class='top-links__left flex-wrap']//a[@href='/discount']")
    private WebElement searchlinks;

    @FindBy(xpath = "//ul[@class='category-box__list']//a[@href='https://avic.ua/klaviaturyi/actions--3']")
    private WebElement searchcategory;

    public DiscountPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnLinks() {
        searchlinks.click();

    }

    public void clickOnCategory() {
        searchcategory.click();
    }
}
